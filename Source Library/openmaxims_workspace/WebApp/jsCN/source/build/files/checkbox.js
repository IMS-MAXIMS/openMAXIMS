/*
	v. 0.38
	+ ...
	- nonInteractive.
	+ focus/space key support.
	+ theme support.
	v. 0.21
	+ autoPostBack.
*/
var CN_checkbox = function()
{
	this.formManager = null;
	this.isReady = false;

	this._disabled = false;
	this._checked = null;
	this._isDirty = false;
	this._autoPostBack = false;
}
var proto = CN_checkbox.prototype;

// Events. =================
proto.onchange = function()
{
	if(this._autoPostBack) this.formManager.postData(this.element);
}


// Main stuff. ==================
proto.createElement = function(node, parentElement)
{
	var l = document.createElement("span");
	parentElement.appendChild(l);

	this.element = l;
	l.jsObject = this;

	l.className = "cn_checkbox";

	Event.add(l, "mouseenter", this, this._element_onmouseenter);
	Event.add(l, "mouseleave", this, this._element_onmouseleave);
	Event.add(l, "mousedown", this, this._element_onmousedown);
	Event.add(l, "dblclick", this, this._element_onmousedown);
	Event.add(l, "keydown", this, this._element_onkeydown);

	this.buildElement(node);  
	this.isReady = true;
	
	this._set_checked();
	
	return l;
}

proto.layout = function()
{
	Util.setDarkHeaderControlClass(this.element, this.formManager);
}

proto.loadData = function(node)
{
	var attr = node.getAttribute("checked");
	if(attr) this.set_checked(attr == "true");

	attr = node.getAttribute("tooltip");
	if(attr) 
	{
		if(!this.element.tipText) Tooltip.attach(this.element, String(attr));
		else this.element.tipText = String(attr);
	}

	this._isDirty = false;
}

proto.storeData = function(xmldoc)
{
	if(!this._isDirty) return null;
	this._isDirty = false;
	
	var node = xmldoc.createElement("checkbox");
	node.setAttribute("checked", String(this._checked));
	return node;
}

proto.buildElement = function(node)
{
	var checkElement = document.createElement("img");
	checkElement.width = 13;
	checkElement.height = 13;
	checkElement.align = 'absmiddle';
	this.element.appendChild(checkElement);
	checkElement.style.userSelect = "none";

	var textAttr = node.getAttribute("text");
	if(textAttr)
	{
		var textElement = document.createElement("span");
		textElement.className = 'textSpan';
		textElement.style.userSelect = "none";
		textElement.innerHTML = String(textAttr);
		this.element.appendChild(textElement);
	}
	
	if(node.getAttribute("bold") != "false") this.element.style.fontWeight = "bold";	
	
	var attr = node.getAttribute("autoPostBack");
	if(attr) this._autoPostBack = attr == "true";
}

// Event handlers. ======================
proto._element_onkeydown = function()
{
	CNUtil.dispatchObject().element_onkeydown();
}
proto.element_onkeydown = function()
{
	if(this._disabled) return;
	if((Event.keyValue(Event.current())) == 32)
	{
		this.set_checked(!this.get_checked(), false);
		this.fireChangedEvent();
		this._isDirty = true;
		Util.cancelEvent(Event.current());
	}
}

proto._element_onmouseenter = function()
{
	var jsObject = CNUtil.dispatchObject();
	if(jsObject._disabled) return;
	var l = jsObject.element;
	if(Event.current().relatedTarget && Event.current().relatedTarget.isConnected === false) return; // Filter deleted vista trans images.
	jsObject._set_checked(true, true);
}
proto._element_onmouseleave = function()
{
	var jsObject = CNUtil.dispatchObject();
	if(jsObject._disabled) return;
	var l = jsObject.element;
	jsObject._set_checked(false, true);
}
proto._element_onmousedown = function()
{
	var jsObject = CNUtil.findJSObject(Util.eventTarget());
	if(jsObject._disabled) return;
	
	jsObject.element.focus();

	jsObject.set_checked(!jsObject.get_checked(), true, true);
	jsObject.fireChangedEvent();
	jsObject._isDirty = true;
}
proto.fireChangedEvent = function()
{
	var ev = {};
	ev.checked = this._checked;
	this.onchange();
}


// Properties. =========================
proto.set_disabled = function(val)
{
	this._disabled = Util.parseBoolean(val);
	if(this.isReady) this._set_disabled();
}
proto._set_disabled = function()
{ 
	this._set_checked();
	if(this._disabled) this._set_tabIndex(-1);
	else if(this._tabIndex) this._set_tabIndex(this._tabIndex);
}

proto.set_tabIndex = function(ti)
{
	this._tabIndex = ti;
	this._set_tabIndex(ti);
}

proto._set_tabIndex = function(ti)
{
	this.element.tabIndex = ti;
}

proto.set_checked = function(val, hover, userAction)
{
	val = Util.parseBoolean(val);
	if(this._checked == val) return;
	this._checked = val;
	if(this.isReady) this._set_checked(hover, userAction, true);
}
proto._set_checked = function(hover, userAction, checkedChanged)
{
	var img;
	if(this._disabled)
		img = this._checked ? "checkedDisabledCheckbox.gif" : "uncheckedDisabledCheckbox.gif";
	else if(hover)
		img = this._checked ? "checkedHoverCheckbox.gif" : "uncheckedHoverCheckbox.gif";
	else
		img = this._checked ? "checkedCheckbox.gif" : "uncheckedCheckbox.gif";

	//CNFormManager._trace("debug", "setChecked hover: " + hover + " checked: " + this._checked);
	if((userAction || hover) && CNFormManager.vista) 
	{
		VistaSupport.imageTrans(this.element.children[0], CNFormManager.themeImagesPath + img, checkedChanged);
	}
	else this.element.children[0].src = CNFormManager.themeImagesPath + img;
}
proto.get_checked = function()
{
	return this._checked;
}
