/*
	v. 2.0.1
*/
function CN_timebox()
{
	this.formManager = null;
	// Flag grid to directly assign events.
	this.directlyAssignEvents = true;
	this.validationString = "Invalid Time";

	this._isDirty = false;
	this._textBox = null;
	this._canBeEmpty = false;

	this.hours = null;
	this.minutes = null;
	this.isBuilt = false;
	
	this.activeInput = null;
	this.focusIn = false;
	
	this.canceling = false;
	this.defaultValue = null;
	
	this._disabled = false;
	this._value = "";
	this._readOnly = false;
	this._autoPostBack = false;
	this._lastValidValue = null;

	this.supportsRequired = true;
	this.dontCancelBlur = false; // Set by grid/datetimebox to allow grid validation instead of internal time hooks.
}

var proto = CN_timebox.prototype;

// Available public events.
proto.onchange = function()
{
	if(this._autoPostBack) 
	{
		this.formManager.postData(this.element);
	}	
}

proto.onbeforedeactivate = function(){}
proto.onkeypress = function(){}

proto.createElement = function(node, parentElement)
{
	var l = document.createElement("span");
	// NOTE: can be called from grid w/o parentElement and node.
	if(parentElement) parentElement.appendChild(l);

	this.element = l;
	l.jsObject = this;
	
	l.className = "cn_timebox";

	l.attachEvent("onmousedown", this._element_onmousedown);
	l.attachEvent("onkeydown", this._element_onkeydown);
	l.attachEvent("onkeyup", this._element_onkeyup);
	l.attachEvent("onbeforedeactivate", this._element_onbeforedeactivate);

	this.hours = document.createElement("<input type=text maxlength=2 style=\"text-align: right; padding-right: 1px; \">");

	this.hours.attachEvent("onfocus", this._input_onfocus);
	this.hours.attachEvent("onbeforedeactivate", this._input_onblur);
	this.hours.attachEvent("onactivate", this._input_onactivate);	
	this.hours.attachEvent("onmousedown", this._input_onmousedown);
	this.hours.attachEvent("onchange", this._textbox_onchange);
	
	this.element.appendChild(this.hours);

	var divider = document.createElement("<span class=divider>");
	divider.innerText = ":";
	this.element.appendChild(divider);

	this.minutes = document.createElement("<input type=text maxlength=2>");

	this.minutes.attachEvent("onfocus", this._input_onfocus);
	this.minutes.attachEvent("onbeforedeactivate", this._input_onblur);	
	this.minutes.attachEvent("onactivate", this._input_onactivate);	
	this.minutes.attachEvent("onmousedown", this._input_onmousedown);
	this.minutes.attachEvent("onchange", this._textbox_onchange);
	
	this.element.appendChild(this.minutes);
	this.isBuilt = true;

	if(node)
	{
		var attr = node.getAttribute("canBeEmpty");
		if(attr == "true") this._canBeEmpty = true;

		attr = node.getAttribute("validationString");
		if(attr) this.validationString = String(attr);

		attr = node.getAttribute("autoPostBack");
		if(attr) this._autoPostBack = attr == "true";
	}

	if(CNFormManager.vista) VistaSupport.attachToJSCNBox(this);

	if(this._value) this._set_value();
	this._set_readOnly();
	this._set_disabled();
	
	return l;
} 

proto.loadData = function(node)
{
	var attr = node.getAttribute("tooltip");
	if(attr) 
	{
		if(!this.element.tipText) Tooltip.attach(this.element, String(attr));
		else this.element.tipText = String(attr);
	}

	var attr = node.getAttribute("value");
	if(attr != null) 
	{
		this._lastValidValue = String(attr);
		this.set_value(this._lastValidValue);
	}
	this._isDirty = false;
}

proto.storeData = function(xmldoc)
{
	if(!this._isDirty) return null;
	this._isDirty = false;
	
	var node = xmldoc.createElement("timebox");
	node.setAttribute("value", this.get_value());
	return node;
}

proto.resetValue = function()
{
	this._isDirty = false;
	this.set_value(this._lastValidValue);
}

proto.isValid = function(doNotHilite)
{
	if(this._disabled) return true;
	var valid = this.validateValue(this.get_value(), this._canBeEmpty);
	if(!valid && !doNotHilite)
	{
		this.element.runtimeStyle.borderColor = "red";
	}
	return valid;
}


proto.set_disabled = function(val)
{
	this._disabled = val;

	if(val) this._set_tabIndex(-1);
	else if(this._tabIndex) this._set_tabIndex(this._tabIndex);

	if(this.isBuilt) this._set_disabled();
}

proto._set_disabled = function()
{ 
	var val = this._disabled || this._readOnly;
	this.hours.readOnly = this.minutes.readOnly = val;
	if(CNFormManager.vista)
	{
		this.element.className = val ? "cn_timebox cn_timebox_disabled" : "cn_timebox";
	}
	else
	{
		this.element.runtimeStyle.borderColor = val ? this.element.currentStyle["xl--disabled-border-color"] : "";
		this.element.runtimeStyle.backgroundColor =
		this.hours.runtimeStyle.backgroundColor = 
			this.minutes.runtimeStyle.backgroundColor = val ? this.element.currentStyle["xl--disabled-background"] : "";
	}
}

proto.set_value = function(value)
{
	this._value = String(value);
	if(this._value.replace(/\s+/, "") == "") this._value = "";
	if(this.isBuilt) this._set_value();
}
proto._set_value = function()
{
	var ar = this._value.split(":");
	if(ar.length == 2)
	{
		this.hours.value = ar[0];
		this.minutes.value = ar[1];
	}
	else
	{
		this.hours.value = this.minutes.value = "";
	}
	this.defaultValue = this.get_value();
}
proto.get_value = function()
{
	if(!this.isBuilt) return this._value;
	this._value = this.hours.value + ":" + this.minutes.value;
	if(this._value.replace(/\s+/, "") == ":") this._value = "";
	return this._value;
}

proto.set_readOnly = function(value)
{
	this._readOnly = eval(value);
	if(!this.isBuilt) return;
	this._set_readOnly();
}
proto._set_readOnly = function()
{
	this.hours.readOnly = this.minutes.readOnly = this._readOnly || this._disabled;
	this.hours.runtimeStyle.backgroundColor = 
		this.minutes.runtimeStyle.backgroundColor = this._disabled || this._readOnly ? this.element.currentStyle["xl--disabled-background"] : "";
}
proto.get_readOnly = function()
{
	return this._readOnly;
}

proto.set_canBeEmpty = function(val)
{
	this._canBeEmpty = eval(val);
}

proto._input_onactivate = function()
{
	var element = CNUtil.findElement(event.srcElement);
	if(element.jsObject._disabled) return;
	element.runtimeStyle.borderColor = "";
}

proto._input_onfocus = function()
{
	var jsObject = CNUtil.findJSObject(event.srcElement);
	if(jsObject._disabled || jsObject._readOnly) return;

	event.cancelBubble = true;
	
	if(jsObject.focusIn)
	{
		jsObject.focusIn = false;
		return;
	}

	jsObject.activeInput = event.srcElement;
	if(!jsObject._readOnly) 
	{
//		CNFormManager._trace("timebox _input_onfocus select()");
		jsObject.activeInput.select();
	}	
}

proto._input_onblur = function()
{
	var jsObject = CNUtil.findJSObject(event.srcElement);
	jsObject.input_onblur();
}

proto.input_onblur = function()
{
	if(this._disabled) return;
	
	if(this.focusIn)
	{
		this.focusIn = false;
		event.cancelBubble = true;
		return;
	}
	if(this.canceling)
	{
		this.set_value(this.defaultValue);
		this.canceling = false;
		this.activeInput = null;
		return;
	}
	if(this.element_onblur())
	{
		if(this.get_value() != this.defaultValue)
		{
			this._isDirty = true;
			this._fireChangeEvent();
			
			this.defaultValue = this.get_value();
		}
		this.activeInput = null;
	}
}

proto._fireChangeEvent = function()
{
	var ev = {srcElement: this.element};
	if(this.onchange) this.onchange(ev);
}

proto.element_onblur = function()
{
	return this.isValid();
}


proto._input_onmousedown = function()
{
	var jsObject = CNUtil.findJSObject(event.srcElement);
	if(jsObject._disabled) return;
	
	if(jsObject.activeInput != null && jsObject.activeInput != event.srcElement) 
	{	
		jsObject.focusIn = true;
	}
}

proto.select = function()
{
	if(!this._readOnly) 
	{	
		this.hours.select();
	}
}

proto.focus = function()
{
//	CNFormManager._trace("timebox focus()");
	if(this._readOnly) this.element.focus();
	this.focusIn = false;
}

proto.blur = function()
{
}

proto._element_onmousedown = function()
{
	event.cancelBubble = true;
}

proto._element_onkeydown = function()
{
	var jsObject = CNUtil.findJSObject(event.srcElement);
	jsObject.element_onkeydown();
}

proto.element_onkeydown = function()
{
	if(this._disabled) return;
	
	var code = event.keyCode;

	if(code == 9) // Tab.
	{
		if(!event.shiftKey && this.activeInput == this.hours) 
		{
			this.focusIn = true;
			this.minutes.focus();
			CNUtil.cancelEvent();
		}
		else if(!event.shiftKey && !this.isValid())
		{
			if(!this.dontCancelBlur) CNUtil.cancelEvent();
			return;
		}
		// else proceed with default tab behavior.
		else
		{
			if(this._grid) this._grid.processTab();
			return;
		}
	}
	else if(code == 8) // Backspace
	{
		if(this.activeInput == this.minutes && event.srcElement.value.length == 0)
		{
			this.focusIn = true;
//			CNFormManager._trace("timebox hours.focus()");
			this.hours.focus();
		}
	}
	else if(code == 27) // Esc
	{
		if(this.activeInput) 
		{
			this.canceling = true;
			this.activeInput.blur();
		}
	}
	else if(code == 13)
	{
		// Pass to formmanager.
		if(this.onkeypress) this.onkeypress(); // Pass to grid.
	}
	else if((code < 48 || code > 57) && (code < 96 || code > 105))
	{
		CNUtil.cancelEvent();

		if(!this._readOnly && String.fromCharCode(event.keyCode).toLowerCase() == "n")
		{
			var now = new Date();
			this.hours.value = this._zeroPad(now.getHours());
			this.minutes.value = this._zeroPad(now.getMinutes());
			this._isDirty = true;
		}
	}
	else
	{
		this.focusIn = false;
	}
	// 48 - 57 / 96 - 105
}

proto._element_onkeyup = function()
{
	var jsObject = CNUtil.findJSObject(event.srcElement);
	jsObject.element_onkeyup();
}

proto.element_onkeyup = function()
{
	if(this._disabled || !this.activeInput) return;
	
	var code = event.keyCode;
	if(code != 9 && code != 8 && this.activeInput == this.hours && this.activeInput.value.length >= 2)
	{
		this.focusIn = true;
//		CNFormManager._trace("timebox minutes.focus()");
		this.minutes.focus();
	}
	if(code == 8) // Backspace.
	{
		if(this.activeInput == this.minutes && event.srcElement.value.length == 0)
		{
			this.focusIn = true;
//			CNFormManager._trace("timebox hours.focus()");
			this.hours.focus();
		}
	}
	else if(code == 13) // Enter.
	{
		this._fireChangeEvent();
	}
}

proto._textbox_onchange = function()
{
	var jsObject = CNUtil.findJSObject(event.srcElement);
	if(jsObject._disabled) return;
	jsObject._isDirty = true;
}

proto._element_onbeforedeactivate = function()
{
	var jsObject = CNUtil.findJSObject(event.srcElement);
	if(jsObject._disabled) return;
	jsObject.onbeforedeactivate();
}

proto.validateValue = function(value, canBeEmpty)
{
	if(value.replace(/\s+/g, "") == ":" && canBeEmpty) return true;
	var ar = value.split(":");
	return ar.length == 2 && ar[0].length > 0 && ar[0] * 1 >= 0 && ar[0] * 1 <= 23
			&& ar[1].length > 1 && ar[1] * 1 >= 0 && ar[1] * 1 <= 59
			|| (value.replace(/\s+/, "") == "" && canBeEmpty);
}

proto.set_tabIndex = function(ti)
{
	this._tabIndex = ti;
	this._set_tabIndex(ti);
}

proto._set_tabIndex = function(ti)
{
	this.hours.tabIndex = ti;
	this.minutes.tabIndex = ti;
}

proto._zeroPad = CN_datebox.prototype._zeroPad;
