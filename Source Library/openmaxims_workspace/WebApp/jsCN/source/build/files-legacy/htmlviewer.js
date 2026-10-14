/*
	v. 0.4
	+ hookForm
	v. 0.34
	+ ...
	+ theme support.
	ver. 0.11
*/
function CN_htmlviewer()
{
	this.formManager = null;
	this._clicked = false;
	this._param = "";
	this._disabled = false;
	this._isReady = false;
	this._sendSizeInfo = false;
}
var proto = CN_htmlviewer.prototype;

proto.createElement = function(node, parentElement)
{
	var l = document.createElement("div");
	parentElement.appendChild(l);
	l.style.position = "absolute";
	
	this.element = l;
	l.jsObject = this;

	l.className = "cn_htmlviewer";
	var content = document.createElement("div");
	l.appendChild(content);
	
	this._disabler = document.createElement('<div style="position: absolute; background: white; z-index: 1000; filter: alpha(opacity=50); width: 100%; height: 100%; visibility: hidden; top: 0px; left: 0px; ">');
	l.appendChild(this._disabler);
	
	this._isReady = true;
	
	this._sendSizeInfo = node.getAttribute("sendSizeInfo") == "true";
	
	if(node.getAttribute("border") == "false") this.element.style.border = "none";
	
	l.attachEvent("onclick", CN_htmlviewer._handle_onclick);

	return l;
} 

proto.loadData = function(node)
{
    var valueNode = node.selectSingleNode("value");
	if(valueNode) 
	{
		var embeddedObject = node.getAttribute("embeddedObject") == "true";
		if (embeddedObject)
		{
			var iframe = document.createElement('iframe');
				iframe.style.height = "100%";
				iframe.style.width = "100%";
				iframe.style.border =  "0";
				iframe.style.position = "absolute";
				iframe.style.top = "0px";
				iframe.style.left = "0px";
				
			this.element.appendChild(iframe);			
			
			iframe.contentWindow.document.open();
			iframe.contentWindow.document.write(valueNode.text);
			iframe.contentWindow.document.close();
		}
		else
		{
			try
			{
				this.element.children[0].innerHTML = "<span>" + valueNode.text + "</span>";
			}
			catch(e)
			{
				alert("ASSERT: can't set HTML: " + valueNode.text)
			}
		}
	}

	this._hookForm = node.getAttribute("hookForm") == "true";
	if(this._hookForm) {
		this._processHookForm();
	}
}

proto._processHookForm = function() {
	var content = this.element.children[0].children[0];
	var forms = content.getElementsByTagName("form");
	for(var i = 0; i < forms.length; i++) {
		var form = forms[i];
		Event.add(form, "submit", this, this._form_onsubmit)
	}
}
proto._form_onsubmit = function() {
	this._formSubmitted = event.srcElement;
	Util.cancelEvent();
	this.formManager.postData(this.element);
}

proto.storeData = function(xmldoc)
{
	if(!this._clicked && !this._sendSizeInfo && !this._formSubmitted) return null;
	
	var fragment = xmldoc.createDocumentFragment();

	if(this._clicked)
	{
		var node = xmldoc.createElement("htmlviewerclicked");
		node.setAttribute("link", String(this._param));
		this._clicked = false;
		this._param = "";
		fragment.appendChild(node);
	}
	if(this._sendSizeInfo)
	{
		node = xmldoc.createElement("htmlviewersize");
		node.setAttribute("width", this.element.offsetWidth);
		node.setAttribute("height", this.element.offsetHeight);
		fragment.appendChild(node);
	}
	if(this._formSubmitted) {
			node = xmldoc.createElement("htmlviewerform");
		this._saveForm(this._formSubmitted, xmldoc, node);
		fragment.appendChild(node);
		this._formSubmitted = null;
	}
	return fragment;
}
proto._saveForm = function(form, xmldoc, parentNode) {
	for(var i = 0; i < form.elements.length; i++) {
		var el = form.elements[i];
		if(el.name != "") {
			if(el.tagName == "SELECT") {
				for(var j = 0; j < el.options.length; j++) {
					var op = el.options[j];
					if(op.selected) {
						var node = xmldoc.createElement("p");
						node.setAttribute("name", el.name);
						node.setAttribute("value", op.value || op.text);
						parentNode.appendChild(node);
					}
				}
			} else if(el.type != "checkbox" && el.type != "radio" || el.checked) {
				var node = xmldoc.createElement("p");
				node.setAttribute("name", el.name);
				node.setAttribute("value", el.value);
				parentNode.appendChild(node);
			}

		}
	}
}

CN_htmlviewer._handle_onclick = function()
{
	var a = CNUtil.findTag(event.srcElement, "A");
	if(!a || !a.href) return;
	CNUtil.cancelEvent();

	window.open(a.href);
}

function HTMLViewerClick(param)
{
	var jsObject = CNUtil.findJSObject(event.srcElement);
	if(jsObject._disabled) return;
	
	jsObject._clicked = true;
	jsObject._param = param;
	event.returnValue = false;
	jsObject.formManager.postData(jsObject.element);
}


// Properties. ===================================
proto.set_disabled = function(value)
{
	value = eval(value);
	if(this._disabled == value) return;
	this._disabled = value;

	if(!this._isReady) return;
	this._set_disabled();
}

proto._set_disabled = function()
{
	this._disabler.style.visibility = this._disabled ? "inherit" : "hidden";
}


// Grid support. ====================================================
var HTMLCell = CN_grid.CellTypes["Html"] = function(colTag)
{
}
HTMLCell.cn_tagName = "html";

var wp = HTMLCell.prototype;
wp.isValid = function(cell){ return true; }
wp.prerender = function(cell, colTag)
{
	cell.style.paddingTop = 1;
	cell.insertAdjacentHTML("beforeEnd", "<table border=0 class=HTMLTable cellspacing=0 "
		+ "cellpadding=0 border=0><tr valign=middle><td><div></div></td></tr></table>");
	var div = cell.children[0].cells[0].children[0];
	div._isCellDiv = true;
	cell.attachEvent("onclick", CN_htmlviewer._handle_onclick);
}
wp.render = function(cell, node)
{
	var table = cell.children[0];
	table.rows[0].cells[0].children[0].innerHTML = String(node.text);
	var color = cell.parentElement.currentStyle.backgroundColor;
	if(color != "transparent") table.style.borderColor = color;
}
