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
		l = document.createElement("<textarea>");
		l.attachEvent("onkeypress", Util.cancelBubble);
		multiLine = true;
	}
	else l = document.createElement("<input type=text>");
	
	var attr = node.getAttribute("maxLength");
	if(attr) 
	{
		if(multiLine)
		{
			this._maxLength = parseInt(attr, 10);
			l.attachEvent("onpaste", this._element_onpaste);
		}
		else
		{
			l.maxLength = parseInt(attr, 10);
		}
	}

	l.attachEvent("onkeypress", this._element_onkeypress);
	l.attachEvent("onselect", this._element_onselect);

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
	l.attachEvent("onchange", this._input_onchange);
	
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

	this.element.attachEvent("onbeforedeactivate", this._box_onbeforedeactivate);
	this.element.attachEvent("onactivate", this._box_onactivate);	
}

proto.isValid = function() {
	var value = this.element.value;
	if(this._disabled || !this._maskRE || value.replace(/\s+/, "") == "" && this._canBeEmpty) return true;

	var valid = this._maskRE.test(value);

	if(!valid) this.element.runtimeStyle.borderColor = "red";

	return valid;
}

proto._input_onchange = function()
{
	event.srcElement.jsObject._isDirty = true;
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
	if(attr !== null) this.element.runtimeStyle.color = String(attr);
}

proto.storeData = function(xmldoc)
{
	if(!this._isDirty || !this.isValid()) return null;
	
	var tr = document.selection.createRange();
	var hasSelection = this.element == tr.parentElement();

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
	node.text = value;
	if(hasSelection && tr.text.length > 0) node.setAttribute("selectedText", tr.text);
	
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
	else this.element.runtimeStyle.backgroundColor = val ? this.element.currentStyle["xl--disabled-background"] : ""
}

proto._element_onkeypress = function()
{
	CNUtil.dispatchObject().element_onkeypress();
}
proto.element_onkeypress = function()
{
	if(this._disabled) return;
	this._isDirty = true;
	if(this._maxLength > 0 && this.element.value.length >= this._maxLength)
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
	var text = window.clipboardData.getData("Text");
	if(this.element.value.length + text.length >= this._maxLength)
	{
		CNUtil.cancelEvent();
		var textLength = this._maxLength - this.element.value.length;
		if(textLength > 0) 
		{
			var range = document.selection.createRange();
			range.text = text.substr(0, textLength);
		}
	}
}

proto._element_onselect = function()
{
	var jso = CNUtil.dispatchObject();
	if(jso._disabled) return;
	jso._isDirty = true;
}

proto._box_onbeforedeactivate = function()
{
	var jsObject = event.srcElement.jsObject;
	jsObject.isValid();
}

proto._box_onactivate = function()
{
	event.srcElement.runtimeStyle.borderColor = "";
}
