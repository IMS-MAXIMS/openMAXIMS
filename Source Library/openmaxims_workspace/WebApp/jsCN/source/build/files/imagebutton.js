/*
	v. 2.0.1
*/
function CN_imagebutton()
{
	this._disabled = false;
	this._srcE = "";
	this._srcD = "";
	this.validator = true;
	this.initiateUpload = false;
}
var proto = CN_imagebutton.plainThemeProto = {};
var vproto = CN_imagebutton.vistaThemeProto = Util.cloneObject(CN_button.vistaThemeProto);

CN_imagebutton.setTheme = function(themeName)
{
	if(CNFormManager.vista) this.prototype = this.vistaThemeProto;
	else this.prototype = this.plainThemeProto;
}

proto.createElement = function(node, parentElement)
{
	var l = document.createElement("button");
	parentElement.appendChild(l);
	l.className = "cn_button";
	
	var img = document.createElement("img");
	l.appendChild(img);
	
	this._srcE = String(node.getAttribute("srcE"));
	this._srcD = String(node.getAttribute("srcD"));
	
	img.src = this._srcE;

	this.clicked = false;
	
	this.element = l;
	l.jsObject = this;

	img.className = "cn_imagebutton";

	Event.add(l, "click", this, _CN_button_onclick);
	Event.add(l, "mouseenter", this, _CN_button_onmouseenter);
	Event.add(l, "mouseleave", this, _CN_button_onmouseleave);
	Event.add(l, "keypress", this, CNUtil.cancelBubble);

	if(node.getAttribute("validator") == "false") this.validator = false;
	
	return l;
}

proto.doClick = CN_button.plainThemeProto.doClick;

proto.loadData = function(node)
{
	var attr = node.getAttribute("tooltip");
	if(attr != null) 
	{
		if(!this.element.tipText) Tooltip.attach(this.element, String(attr));
		else this.element.tipText = String(attr);
		this._handleDisabledState();
	}

	attr = node.getAttribute("srcE");
	if(attr)
	{
		this._srcE = String(attr);
		if(!this._disabled) this.element.firstChild.src = this._srcE;
	}	

	attr = node.getAttribute("srcD");
	if(attr)
	{
		this._srcD = String(attr);
		if(this._disabled) this.element.firstChild.src = this._srcD;
	}
	
	this.initiateUpload = node.getAttribute("uploads") == "true";
}

proto.validateLoading = vproto.validateLoading = function()
{
	if(CNFormManager.vista) 
	{
		var textSpan = this._getTextElement();
		textSpan.style.paddingTop = Math.max(this.element.offsetHeight - textSpan.offsetHeight, 0) / 2 + 2;
	}	

	if(this.formManager.defaultButton == this
		&& this.formManager.changeFocus
		&& Util.getStyle(this.element, "visibility") != "hidden")
	{
		try
		{
			this.element.focus();
		}
		catch(ex)
		{
		}
	}
}

proto.storeData = vproto.storeData = function(xmldoc)
{
	// NOTE: button stores itself only if it's clicked.
	if(!this.clicked) return;
	this.clicked = false;

	var node = xmldoc.createElement("imagebutton");
	return node;
}

// Properties. ======================
proto.set_disabled = function(val)
{
	if(val == this._disabled) return;
	this._disabled = val;
	if(val) this.element.children[0].src = this._srcD;
	else this.element.children[0].src = this._srcE;
	this.element.disabled = val;
	
	this._handleDisabledState();
}
proto._handleDisabledState = CN_button.plainThemeProto._handleDisabledState;


vproto._button_createElement = vproto.createElement;
vproto.createElement = function(node, parentElement)
{
	var l = this._button_createElement(node, parentElement);
	this._srcE = String(node.getAttribute("srcE"));
	this._srcD = String(node.getAttribute("srcD"));
	this._setImageCore(this._srcE);
	return l;
}

vproto._button_set_disabled = vproto.set_disabled;
vproto.set_disabled = function(val)
{
	this._button_set_disabled(val);
	if(this._srcD) this._setImageCore(val ? this._srcD : this._srcE);
}