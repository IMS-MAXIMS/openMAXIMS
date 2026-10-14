/*
	v. 2.0.2
*/
function CN_textbox()
{
	this._isDirty = false;
	this._disabled = false;
	this._maxLength = -1;
	this._tabIndex = -1;
	this._tooltip = null;
	this._casing = null;

	this.supportsRequired = true;
	this._canBeEmpty = true;
}
var proto = CN_textbox.prototype;

proto.createElement = function(node, parentElement)
{
	var l;
	var multiLine = false;
	
	if(node.getAttribute("multiLine") == "true") 
	{
		l = document.createElement("textarea");
		Event.add(l, "keypress", this, Util.cancelBubble);
		multiLine = true;
	}
	else l = (function() { var el = document.createElement("input"); el.type = 'text'; return el; })();
	
	var attr = node.getAttribute("maxLength");
	if(attr) 
	{
		if(multiLine)
		{
			this._maxLength = parseInt(attr, 10);
			Event.add(l, "paste", this, this._element_onpaste);
		}
		else
		{
			l.maxLength = parseInt(attr, 10);
		}
	}

	Event.add(l, "keypress", this, this._element_onkeypress);
	Event.add(l, "select", this, this._element_onselect);

	if(node.getAttribute("hasBorder") == "false") { 
		l.style.borderWidth = 0;
		l.style.background = "transparent";
	}
	else if(CNFormManager.vista)
	{
		VistaSupport.attachToTextBox(l);
	}
	
	if(node.getAttribute("password") == "true") l.type = "password";
	
	var attr = node.getAttribute("casing");
	
	if(attr)
	{
		this._casing = String(attr);
		if(attr == "upper") l.style.textTransform = "uppercase";
		else if(attr == "lower") l.style.textTransform = "lowercase";
	}

	parentElement.appendChild(l);
	
	attr = node.getAttribute("validationString");
	if(attr) this.validationString = String(attr);

	attr = node.getAttribute("align");
	if(attr) l.style.textAlign = String(attr);

	this.element = l;
	l.jsObject = this;

	l.className = "cn_textbox";
	Event.add(l, "change", this, this._input_onchange);
	
	attr = node.getAttribute("canBeEmpty");
	if(attr) this._canBeEmpty = attr == "true";

	attr = node.getAttribute("mask");
	if(attr) this._setMask(String(attr));
	
	return l;
} 

/*
 * # => \w
 * 9 => \d
 * . => \.
 */
proto._setMask = function(mask) {
	this._maskRE = new RegExp('^' + mask.replace(/#/g, '[a-z]').replace(/9/g, '\\d').replace(/\./g, '\\.') + '$', "i");	

	Event.add(this.element, "focusout", this, this._box_onfocusout);
	Event.add(this.element, "focusin", this, this._box_onactivate);	
}

proto.isValid = function() {
	var value = this.element.value;
	if(this._disabled || !this._maskRE || value.replace(/\s+/, "") == "" && this._canBeEmpty) return true;

	var valid = this._maskRE.test(value);

	if(!valid) this.element.style.borderColor = "red";

	return valid;
}

proto._input_onchange = function()
{
	Util.eventTarget().jsObject._isDirty = true;
}

proto.loadData = function(node)
{
	var attr = node.getAttribute("tooltip");
	if(attr) 
	{
		this._tooltip = String(attr);
		
		//loadData() is called after set_disabled()
		//If control is not disabled (Edit mode) do not attach tooltip
		if(this._disabled)
		{
			if(!this.element.tipText) {
				Tooltip.attach(this.element, String(attr));
			}
			else {
				this.element.tipText = String(attr);
			}
		}
	}
	//Framework send attr first time only and when attr change
	//If attr not being sent but thete is an tooltip, if control is disabled(View mode) then set tooltip back
	else
	{
		if (this._disabled)
		{
			if(this._tooltip)
			{
				Tooltip.attach(this.element, this._tooltip);
			}
		}
	}
	
	var attr = node.getAttribute("value");
	if(attr != null) this.element.value = String(attr);
	this._isDirty = false;
	
	attr = node.getAttribute("textColor");
	if(attr !== null) this.element.style.color = String(attr);
}

proto.storeData = function(xmldoc)
{
	if(!this._isDirty || !this.isValid()) return null;
	
	var hasSelection = document.activeElement == this.element;
	var selectedText = hasSelection ? this.element.value.slice(this.element.selectionStart, this.element.selectionEnd) : "";

	if(!this.element.id) 
	{
		this.element.style.background = "red";
		alert("No id for textbox.");
		return;
	}

	this._isDirty = false;

	var node = xmldoc.createElement("textbox");
	var value = this.element.value;
	if(this._casing)
	{
		if(this._casing == "lower") value = value.toLowerCase();
		else if(this._casing == "upper") value = value.toUpperCase();
	}
	node.textContent = value;
	if(selectedText.length > 0) node.setAttribute("selectedText", selectedText);
	
	return node;
}

proto.set_tabIndex = function(ti)
{
	this._tabIndex = ti;
	this.element.tabIndex = ti;
}

proto.set_disabled = function(val)
{
	if(val)	this.element.tabIndex = -1;
	else if(this._tabIndex) this.element.tabIndex = this._tabIndex;
	//Remove tooltip if control not disabled(Edit mode)
	if(!val) Tooltip.detach(this.element);		
	this._disabled = val;
	CNFormManager._trace("set_disabled : " + val);
	this.element.readOnly = val;
	if(CNFormManager.vista) this.element.className = val ? "cn_textbox cn_textbox_disabled" : "cn_textbox";
	else this.element.style.backgroundColor = val ? Util.getStyle(this.element, "xl--disabled-background") : ""
}

proto._element_onkeypress = function()
{
	CNUtil.dispatchObject().element_onkeypress();
}
proto.element_onkeypress = function()
{
	if(this._disabled) return;
	this._isDirty = true;
	if(this._maxLength > 0 && this.element.value.length - (this.element.selectionEnd - this.element.selectionStart) >= this._maxLength)
	{
		CNUtil.cancelEvent();
	}
}

proto._element_onpaste = function()
{
	CNUtil.dispatchObject().element_onpaste();
}
proto.element_onpaste = function()
{
	var ev = Event.current();
	var text = ev.clipboardData && ev.clipboardData.getData("text");
	if(text == null) return;
	this._isDirty = true;
	var box = this.element;
	var start = box.selectionStart;
	var end = box.selectionEnd;
	var available = this._maxLength - (box.value.length - (end - start));
	if(text.length > available)
	{
		CNUtil.cancelEvent(ev);
		box.setRangeText(text.substr(0, Math.max(0, available)), start, end, "end");
		this._isDirty = true;
	}
}

proto._element_onselect = function()
{
	var jso = CNUtil.dispatchObject();
	if(jso._disabled) return;
	jso._isDirty = true;
}

proto._box_onfocusout = function()
{
	var jsObject = Util.eventTarget().jsObject;
	jsObject.isValid();
}

proto._box_onactivate = function()
{
	Util.eventTarget().style.borderColor = "";
}
