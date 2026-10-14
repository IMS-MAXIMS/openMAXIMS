/*
	# 1081 - autoPostBack
	v. 2.0
	CURRENTLY only sync mode implemented
	one global uploadPostFrame
	every FM has _uploadFormIframe
	every uploadbox creates file input element in _uploadFormIframe
	_uploadFormIframe submitted when form posted, form data sent after _uploadFormIframe loads server response
	_uploadFormIframe destroyed when form controls are destroyed.
	
	LATER async mode can be added
	add per-FM uploadPostFrame
	add global progress bars showing uploading + warning if browser closed
*/
function CN_uploadbox()
{
	this._isDirty = false;
	this._isDirty_filePosted = false;
	this._disabled = false;
	
	this._button = null;
	this._input = null;
	this._autoPostBack = false;
	this._uploadOnSelection = false;

	this._checkBox = null;
	this._showOverwrite = false;	
	this._overwriteOnUpload = false;
	this._enabledOverwriteOnUpload = true;
	
}
CN_uploadbox._overwriteOnUpload = false;
CN_uploadbox._uploadPostFrame = null;
CN_uploadbox._uploadFormFrame = null;
CN_uploadbox._counter = 0;
CN_uploadbox._activeUploadBox = null;
CN_uploadbox._activeCallback = null;
CN_uploadbox.ensurePostIframeCreated = function()
{
	if(CN_uploadbox._uploadPostFrame == null)
	{
		// Theme independent permanent iframe.
		var iframe = CN_uploadbox._uploadPostFrame = (function(){ var el = document.createElement("iframe"); el.name = 'uploadPostFrame'; return el; })();
		iframe.className = "cn_uploadbox_hiddenIframe";
		document.body.appendChild(iframe);
	}
	return CN_uploadbox._uploadPostFrame;
}

// NOTE: Called by formmanager.
CN_uploadbox.handleUpload = function(fm, xmldata, callback)
{
	if(!fm._uploadFormIframe) 
	{
		fm[callback]();
		return;
	}
	
	CN_uploadbox._activeCallback = callback;
	
	var shouldUpload = false;
	var form = fm._uploadFormIframe.contentWindow.document.body.firstChild;
	var els = form.elements;
	for(var i = 0; i < els.length; i++)
	{
		if(els[i].value.length > 0) 
		{
			shouldUpload = true;
			break;
		}
	}
	
	if(!shouldUpload) 
	{
		fm[callback]();
		return;
	}

	var iframe = CN_uploadbox._uploadPostFrame;
	if(fm._uploadDebug)
	{
		iframe.style.width = "600px";
		iframe.style.height = "80px";
		iframe.style.display = "block";
	}
	else
	{
		iframe.style.display = "none";
	}
	
	form.action = fm._uploadURL;

	Event.nativeAdd(CN_uploadbox._uploadPostFrame, "load", CN_uploadbox._postIframe_onload);

	form.submit();
}
CN_uploadbox._postIframe_onload = function()
{
	Event.nativeDel(CN_uploadbox._uploadPostFrame, "load", CN_uploadbox._postIframe_onload);

	var fm = CNFormManager.getActiveFormManager();
	var form = fm._uploadFormIframe.contentWindow.document.body.firstChild;
	form.reset();

	var callback = CN_uploadbox._activeCallback;
	CN_uploadbox._activeCallback = null;
	fm[callback]();
}

// Called by formmanager on form clean up.
CN_uploadbox.deleteForm = function(fm)
{
	if(!fm._uploadFormIframe) return;
	fm._uploadFormIframe.remove();
	fm._uploadFormIframe = null;
}

var proto = CN_uploadbox.prototype;
proto.unload = function()
{
	CN_uploadbox._activeUploadBox = null;
	this._input = null; // Don't delete input as file post can be in process.
	CNFormManager.destroyJSObject(this._button);
	this._button = null;
}

proto._initializeForm = function()
{
	var iframe = this.formManager._uploadFormIframe;
	if(iframe == null)
	{
		CN_uploadbox.ensurePostIframeCreated();

		this.formManager._uploadBoxes = [];
		var iframe = this.formManager._uploadFormIframe = document.createElement('iframe');
		iframe.className = "cn_uploadbox_hiddenIframe";
		document.body.appendChild(iframe);

	}
	var win = iframe.contentWindow;
	var doc = win.document;	
	
	this.formManager._uploadBoxes.push(this);
	if(doc.body) 
	{
		CN_uploadbox._uploadFormIframe_onload();
	}
	else 
	{
		if(!win._eventAttached) 
		{
			win._eventAttached = true;
			Event.nativeAdd(win, "load", CN_uploadbox._uploadFormIframe_onload);
		}
	}
}
CN_uploadbox._uploadFormIframe_onload = function()
{
	var fm = CNFormManager.getActiveFormManager();
	var win = fm._uploadFormIframe.contentWindow;
	var doc = win.document;
	
	var form = doc.body.firstChild;
	if(!form)
	{
		form = (function(){ var el = doc.createElement("form"); el.method = 'post'; el.target = 'uploadPostFrame'; el.enctype = 'multipart/form-data'; return el; })();
		doc.body.appendChild(form);
	}

	for(var i = 0; i < fm._uploadBoxes.length; i++)
	{
		fm._uploadBoxes[i]._formCreatedCallback(form);
	}
	fm._uploadBoxes = [];

	Event.nativeDel(win, "load", CN_uploadbox._uploadFormIframe_onload);
}


proto.createElement = function(node, parentElement)
{
	var l = (function(){ var el = document.createElement("div"); el.className = 'cn_uploadbox'; return el; })();
	parentElement.appendChild(l);
	
	this.element = l;
	l.jsObject = this;
	
	this._autoPostBack = node.getAttribute("autoPostBack") == "true";
	this.initiateUpload = node.getAttribute("uploadOnSelection") == "true";
	if(this.initiateUpload) this._autoPostBack = true; // Force autopostback.
	this._showOverwrite = node.getAttribute("showOverwrite") == "true";
	CN_uploadbox._overwriteOnUpload = false; 
	
	this._buildContent();

	return l;
} 

proto._buildContent = function()
{
	var jso = this;
	this._initializeForm();

	this._box = document.createElement("input");
	this._box.type = "text";
	Event.add(this._box, "focus", this, this._box_onfocus);
	Event.add(this._box, "keydown", this, this._box_onkeydown);
	this.element.appendChild(this._box);

	if(CNFormManager.vista) VistaSupport.attachToTextBox(this._box);

	this._button = new CN_button();
	this._button.elementID = "button" + CN_uploadbox._counter++;
	var b = this._button.createElement(Util.wrapIntoNode({}), this.element);
	this._button.loadData(Util.wrapIntoNode({value: "Browse..."}));
	b.onclick = this._b_onclick;
	
	if(this._showOverwrite)
	{	
		var br = document.createElement("br");
		this.element.appendChild(br);

		this._checkBox = new CN_checkbox();
		this._checkBox.elementID = "chk" + CN_uploadbox._counter++;
		var c = this._checkBox.createElement(Util.wrapIntoNode({text: "Overwrite imported file"}), this.element);
		c.onclick = this._checkBox_onclick;		
		this.element.appendChild(c);
	}
}
proto._formCreatedCallback = function(form)
{
	this._input = (function(){ var el = form.ownerDocument.createElement("input"); el.type = 'file'; return el; })();
	Event.add(this._input, "change", this, this._input_onchange);
	this._input._cn_uploadbox_id = this.elementID;
	form.appendChild(this._input);
	
	this._input1 = form.ownerDocument.createElement("input");
	this._input1.type = "hidden";
	this._input1.name = "uniqueID";
	this._input1.value = CNFormManager.getBaseFormManager()._uniqueID;
	form.appendChild(this._input1);
	
	this._input2 = form.ownerDocument.createElement("input");
	this._input2.type = "hidden";
	this._input2.name = "overwrite";
	this._input2.value = CN_uploadbox._overwriteOnUpload;
	form.appendChild(this._input2);
}
proto.layout = function()
{
	if(Util.getStyle(this._button.element, "width") == "auto") return;
	var realW = this.element.offsetWidth == 0 ? parseInt(Util.getStyle(this.element, "width"), 10) : this.element.offsetWidth;
	var bW = parseInt(Util.getStyle(this._button.element, "width"), 10)
	var w = realW - bW - 6;
	this._box.style.width = Math.max(10, w) + "px";
}

proto.loadData = function(node)
{
	var attr = node.getAttribute("tooltip");
	if(attr) 
	{
		if(!this.element.tipText) Tooltip.attach(this.element, String(attr));
		else this.element.tipText = String(attr);
	}

	this._isDirty = false;
	this._isDirty_filePosted = false;
	
	attr = node.getAttribute("textColor");
	if(attr !== null) 
	{
		this._box.style.color = String(attr);
	}
	
	attr = node.getAttribute("overwriteOnUpload");
	if(attr) 
	{
		this._overwriteOnUpload = attr == "true";
		CN_uploadbox._overwriteOnUpload = this._overwriteOnUpload;		
		this._checkBox.set_checked(attr == "true");
	}
	else
	{
		if (this._showOverwrite)
			this._checkBox.set_checked(false);
	}
	
	attr = node.getAttribute("enabledOverwriteOnUpload");
	if(attr) 
	{
		this._enabledOverwriteOnUpload = attr == "true";
		this._checkBox.set_disabled(!this._enabledOverwriteOnUpload);
	}
	else
	{
		if (this._showOverwrite)	
			this._checkBox.set_disabled(false);
	}
}

proto.validateLoading = function()
{
	if(this._img) 
	{
		this._img.style.display = "none";
		this._box.style.visibility = "inherit";
	}
}

proto.storeData = function(xmldoc)
{
	if(!this._isDirty || !this._input.value) return;

	var node = xmldoc.createElement("uploadbox");
	node.setAttribute("localPath", this._input.value);
	node.setAttribute("uniqueID",  CNFormManager.getBaseFormManager()._uniqueID);	
	node.setAttribute("overwrite", CN_uploadbox._overwriteOnUpload);	

	if(!this.formManager.initiateUpload)
	{
		if(!this._autoPostBack || !this._isDirty_filePosted) return; // Do not send anything if not autopostback or filePosted flag already sent.
		
		// Postback just with filepath, but no file is sent.
		// Control is still dirty.
		node.setAttribute("filePosted", "false");
		this._isDirty_filePosted = false;
		return node;
	}
	
	this._isDirty = false;	
	this._input.name = this.elementID;	
	
	if(!this._img)
	{
		this._img = document.createElement("img");
		this._img.className = "progressIMG";
		this._img.style.width = this._box.offsetWidth + "px";
		this._img.style.height = "16px";
		this._img.src = "g/und-progress-bar-1.gif";
		this.element.appendChild(this._img);
	}
	else this._img.style.display = "block";
		
	this._box.style.visibility = "hidden";
	this._box.value = "";	
	
	return node;
}

proto.set_disabled = function(val)
{
	this._disabled = this._box.disabled = val;
	this._button.set_disabled(val);

	if(CNFormManager.vista)	this.element.className = val ? "cn_uploadbox cn_uploadbox_disabled" : "cn_uploadbox";
	else this._box.style.backgroundColor = val ? Util.getStyle(this.element, "xl--disabled-background") : ""
}

proto._b_onclick = function(ev)
{
	var jso = Util.findByClassName(Util.eventTarget(ev), "cn_uploadbox").jsObject;
	if(jso._disabled) return;
	CN_uploadbox._activeUploadBox = jso;
	jso._input.click();
}

proto._checkBox_onclick = function(ev)
{
	var jso = Util.findByClassName(Util.eventTarget(ev), "cn_uploadbox").jsObject;
	if(jso._disabled) return;
	CN_uploadbox._activeUploadBox = jso;
	CN_uploadbox._overwriteOnUpload = jso._checkBox.get_checked();
}

proto._input_onchange = function(ev)
{
	var jso = this;
	CN_uploadbox._activeUploadBox = null;
	jso._isDirty = true;
	jso._isDirty_filePosted = true;
	jso._box.value = jso._input.value;
	jso._input1.value = CNFormManager.getBaseFormManager()._uniqueID;
	jso._input2.value = CN_uploadbox._overwriteOnUpload;
	
	if(jso._autoPostBack) jso.formManager.postData(jso.element);
}

proto._box_onfocus = function(ev)
{
	Util.eventTarget(ev).select();
}

proto._box_onkeydown = function(ev)
{
	var jso = Util.dispatchObject();
	if(Event.keyValue(ev) == 8 || Event.keyValue(ev) == 46)
	{
		jso._box.value = "";
		var newInput = jso._input.cloneNode(true);
		jso._input.parentNode.replaceChild(newInput, jso._input);
		jso._input = newInput;
		Event.add(newInput, "change", jso, jso._input_onchange);
	}
	Util.cancelEvent(ev);
}
