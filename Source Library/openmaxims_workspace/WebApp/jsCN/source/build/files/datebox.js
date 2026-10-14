/*
	v. 2.0.2
	+ calendar closed on set_disabled(true)
	+ calendar onxlresult + datebox ref is nulled on xlresult.
*/
function CN_datebox()
{
	this._dateValidationString = "Invalid Date";
	
	this._dayValidationString = "Invalid Day";
	this._monthValidationString = "Invalid Month";
	this._yearValidationString = "Invalid Year";
	
	this._timeValidationString = "Invalid Time";
	this.validationString = this._dateValidationString;
	this.supportsRequired = true;
	
	this._isDirty = false;
	this._textBox = null;	
	
	this._dateBox = null;
	this._timeCell = null;
	this._dayBox = null;
	this._monthBox = null;
	this._yearBox = null;
	
	this._canBeEmpty = false;
	this.isBuilt = false;
	this._autoPostBack = false;	
	this._doTime = false;
	this._focusInside = false; // Focus moves from date to time box.
	this._lastValidValue = "";
	this._lastValidTime = "";
	this.supportsRequired = true;
	this._minValue = null;
	this._maxValue = null;
	
	this.directlyAssignEvents = true;
}
var proto = CN_datebox.prototype;

// Events. ================================
proto.onchange = function(ev)
{
	if(this._autoPostBack && this.isValid())
	{
		//CNUtil.cancelEvent(); - 04.11.05 commented as no way to tab out from control on change/postback.
		this.formManager.postData(this.element);
	}
	
	
	if(Event.keyValue(Event.current()) != 9) return;
	var jso = CNUtil.dispatchObject();
	CNUtil.cancelEvent();
//	CNFormManager._trace("jso._timeBox.select();");
	jso._timeBox.select();
}

proto.createElement = function(node, parentElement)
{
	var l = Util.createElementFromHTML("<table cellpadding=0 cellspacing=0>");
	if(parentElement) parentElement.appendChild(l);
	
	this.element = l;
	l.jsObject = this;
	
	l.className = "cn_datebox";

	this._doTime = node.getAttribute("time") == "true";

	var tr = l.insertRow();
	
	this._dateBox = tr.insertCell();
	this._dateBox.className = "dateBox";
	
	//this._dateBox = this._dateBox;
	
	if(this._doTime) this._timeCell = tr.insertCell();
	var td2 = tr.insertCell();	
	
	this._textBox = Util.createElementFromHTML("<input type=text>");	
	this._textBox.style.verticalAlign = "middle";
	this._textBox.maxLength = this._doTime ? 16 : 10;	
	//this._dateBox.appendChild(this._textBox);
	
	//Day	
	this._dayBox = Util.createElementFromHTML("<input type=text maxlength=2 style='width: 15px; padding-left: 1px; '>");
	this._dateBox.appendChild(this._dayBox);
	this._dateBox.appendChild(document.createTextNode("/"));
	
	//Month
	this._monthBox = Util.createElementFromHTML("<input type=text maxlength=2 style='width: 14px; '>");
	this._dateBox.appendChild(this._monthBox);
	this._dateBox.appendChild(document.createTextNode("/"));
	
	//Year
	this._yearBox = Util.createElementFromHTML("<input type=text maxlength=4 style='width: 28px; '>");
	this._dateBox.appendChild(this._yearBox);
		
	//this._dayBox._maxValue = 31;
	//this._monthBox._maxValue = 12;	
	
	
		
	var attr = node.getAttribute("autoPostBack");
	if(attr) this._autoPostBack = attr == "true";

	if(this._doTime)
	{		
		//Show border right on date TD
		//this._dateBox.style.borderRight = "1px";	
		//this._dateBox.style.borderRightStyle = "solid"
		
		Event.add(this._textBox, "keydown", this, this._textBox_onkeypress);
		
		//this._timeCell.style.width = "38px";
		
		var timeNode = node.cloneNode(true);
		timeNode.setAttribute("autoPostBack", this._autoPostBack ? "true" : "false");
		
		this._doTime = true;
		this._timeBox = new CN_timebox();
		this._timeBox._dateBox = this;
		this._timeBox._isValid = this._timeBox.isValid;
		this._timeBox.isValid = this._timeBox_isValid;
		
		this._timeBox.__input_onactivate = this._timeBox._input_onactivate;
		this._timeBox._input_onactivate = this._timeBox_input_onactivate;

		this._timeBox.createElement(timeNode, this._timeCell);
		this._timeBox.element.style.width = "100%";
		this._timeBox.element.style.height = this._textBox.offsetHeight + "px";
		
		//this._textBox.style.borderRight = "0px";				
		
		this._timeBox.element.style.borderColor = "#ffffff"
		this._timeBox.element.style.paddingTop = "1px";
		
		this._timeBox.onchange = this._timeBox_onchange;
		
//		Event.add(this.element, "blur", this, this._element_ondeactivate);
	}

	Event.add(this.element, "blur", this, this._element_ondeactivate);
	Event.add(this.element, "focusout", this, this._element_onfocusout);
	
	var button;
	
	if(CNFormManager.vista)
	{
		button = VistaSupport.createImageButton("datebox-button.gif", 21, 21);
		button.style.verticalAlign = "middle";
		VistaSupport.attachToTextBox(this._textBox);
	}
	else
	{
		button = Util.createElementFromHTML("<button>");
		var img = Util.createElementFromHTML("<img>");
		img.src = CNFormManager.themeImagesPath + "calendar-2.gif";
		button.appendChild(img);
	}
	button.tabIndex = -1;	

	td2.className = "buttonTD";
	td2.appendChild(button);
	//button.tabIndex = -1;
	this._button = button;
	
	Event.add(button, "mouseenter", this, _CN_button_onmouseenter);
	Event.add(button, "mouseleave", this, _CN_button_onmouseleave);
	Event.add(button, "click", this, this._button_onclick);

	Event.add(this._textBox, "change", this, this._textbox_onchange);
	Event.add(this._textBox, "focusout", this, this._textbox_onfocusout);
	Event.add(this._textBox, "focus", this, this._textbox_onactivate);
	
	
	Event.add(this._dayBox, "keydown", this, this._box_onkeyup);
	Event.add(this._monthBox, "keydown", this, this._box_onkeyup);
	Event.add(this._yearBox, "keydown", this, this._box_onkeyup);	
	
	Event.add(this._dayBox, "keyup", this, this._box_onkeyup);
	Event.add(this._monthBox, "keyup", this, this._box_onkeyup);
	Event.add(this._yearBox, "keyup", this, this._box_onkeyup);
	
	Event.add(this._dayBox, "change", this, this._textbox_onchange);
	Event.add(this._dayBox, "focusout", this, this._textbox_onfocusout);
	Event.add(this._dayBox, "focus", this, this._textbox_onactivate);
	Event.add(this._dayBox, "focus", this, this._box_onfocus);
	
	Event.add(this._monthBox, "change", this, this._textbox_onchange);
	Event.add(this._monthBox, "focusout", this, this._textbox_onfocusout);
	Event.add(this._monthBox, "focus", this, this._textbox_onactivate);
	Event.add(this._monthBox, "focus", this, this._box_onfocus);
	
	Event.add(this._yearBox, "change", this, this._textbox_onchange);
	Event.add(this._yearBox, "focusout", this, this._textbox_onfocusout);
	Event.add(this._yearBox, "focus", this, this._textbox_onactivate);
	Event.add(this._yearBox, "focus", this, this._box_onfocus);
	
	var attr = node.getAttribute("canBeEmpty");
	if(attr == "true") this._canBeEmpty = true;
	
	attr = node.getAttribute("validationString");
	if(attr) this._dateValidationString = this._timeValidationString = this.validationString = String(attr);

	Event.add(l, "keypress", this, this._element_onkeypress);

	this.isBuilt = true;
	
	return l;
} 

proto._element_onkeypress = function()
{
	var jso = Util.dispatchObject();
	if(jso._disabled) return;
	var code = Event.keyValue(Event.current());
	var charx = String.fromCharCode(code).toLowerCase();
	if(charx == "t")
	{
		var now = new Date();
			
		jso._dayBox.value = jso._zeroPad(now.getDate());
		jso._monthBox.value = jso._zeroPad(now.getMonth() + 1);
		jso._yearBox.value = now.getYear();
			
		jso._isDirty = true;
		Util.cancelEvent();

		if(!this._doTime) 
			jso._fireChangedEvent();
		else
			jso._timeBox.select();		
	}
	if(charx == "d")
	{
		jso._dayBox.value = "";
		jso._monthBox.value = "";
		jso._yearBox.value = "";
			
		jso._isDirty = true;
		Util.cancelEvent();

		if(!this._doTime) 
			jso._fireChangedEvent();
		else
			jso._timeBox.select();		
	}
	else
	{
		if((charx < "0" || charx > "9") && code != 13)
		{
			CNUtil.cancelEvent();
			return;
		}	
	}
}

// Private methods. =================================
proto._tryNextField = function(box)
{
	if(box.value.length == box.maxLength && box.selectionStart == box.selectionEnd && box.selectionEnd == box.value.length)
	{
		this._moveToNextField(box);
	} 
}

proto._moveToNextField = function(box)
{
	var boxes = this.element.getElementsByTagName("input");
	if(box == boxes[0]) boxes[1].focus();
	else if(box == boxes[1]) boxes[2].focus();
}

proto._moveToPreviousField = function(box)
{
	var boxes = this.element.getElementsByTagName("input");
	if(box == boxes[2]) boxes[1].focus();
	else if(box == boxes[1]) boxes[0].focus();
}

proto._checkLeftRight = function(box, code)
{
	
	if(code == 37) // Left
	{
		if(box.selectionStart == 0 && box.selectionEnd == 0) 
		{
			this._moveToPreviousField(box);		
			return true;
		}
	}
	else if(code == 39) // Right
	{
		if(box.selectionStart == box.value.length && box.selectionEnd == box.value.length) 
		{
			this._moveToNextField(box);
			return true;
		}
	}
	return false;
}

proto._box_onfocus = function()
{
	var box = CNUtil.eventTarget();
	box.select();
}

proto._box_onkeyup = function()
{
	CNUtil.dispatchObject().box_onkeyup();
}
proto.box_onkeyup = function()
{
	if(this._disabled) return;
	var box = CNUtil.eventTarget();
	
	var code = Event.keyValue(Event.current());

	if(Event.current().type == "keydown")
	{
		if(this._checkLeftRight(box, code)) return;
		var value = parseInt(box.value, 10);
		if(!isNaN(value))
		{
			if(code == 38 && (!box._maxValue || value < box._maxValue)) // Up.
			{
				box.value = value + 1;
				this._isDirty = true;
			}
			else if(code == 40 && value > 1) // Down.
			{
				box.value = value - 1;
				this._isDirty = true;				
			}
		}
		
		if(code == 9 && this._inGrid) {
			//	else if(box == boxes[1]) boxes[2].focus();		
			var boxes = this.element.getElementsByTagName("input");
			if(box == boxes[2]) {
				CN_grid.proxyTabKeyDown();
				return;
			}
		}
	}

	var charx = String.fromCharCode(code);
	if(code == 46) return;
	if((charx < "0" || charx > "9") && (code < 96 || code > 105) || code == 13) 
	{
		var newVal = box.value.replace(/\D/g, '');
		if(newVal != box.value)
		{
			box.value = newVal;
			this._isDirty = true;
		}
		return;
	} 

	if(Event.current().type == "keydown") this._tryNextField(box);
}


// Works in +time mode only.
proto._textBox_onkeypress = function()
{
	if(Event.keyValue(Event.current()) != 9) return;
	var jso = CNUtil.dispatchObject();
	CNUtil.cancelEvent();
//	CNFormManager._trace("jso._timeBox.select();");
	jso._timeBox.select();
}

proto._element_ondeactivate = function()
{
	var jso = CNUtil.dispatchObject();
	if(jso instanceof CN_timebox) jso = jso._dateBox;
	var calendar = CNPopupCalendar.defaultInstance;
	if(calendar.element.contains(Event.current().relatedTarget)) { // FWUI-994 
		Util.cancelEvent(Event.current());
		return;
	}
	if(jso.element.contains(Event.current().relatedTarget)) {
		return;
	}
	if(jso._isDirty) jso._fireChangedEvent();
//	if(jso.onfocusout) jso.onfocusout();
}

proto._element_onfocusout = function() {
	var jso = CNUtil.dispatchObject();
	if(jso instanceof CN_timebox) jso = jso._dateBox;
	var calendar = CNPopupCalendar.defaultInstance;
	if(calendar.element.contains(Event.current().relatedTarget)) { // FWUI-994 
		Util.cancelEvent(Event.current());
		return;
	}
	if(jso.element.contains(Event.current().relatedTarget)) {
		return;
	}
	if(jso.onfocusout) jso.onfocusout();
}

proto._timeBox_onchange = function()
{
	var jso = CNUtil.dispatchObject();
	jso._dateBox._isDirty = true;
	jso._dateBox._fireChangedEvent();
}

proto._timeBox_input_onactivate = function()
{
	var jso = CNUtil.dispatchObject();
	jso.__input_onactivate();	
	jso._dateBox._timeCell.className = "timeCell";	
}

proto._timeBox_isValid = function()
{
	// this == timeBox
	var jso = CNUtil.dispatchObject();
	if(!this._isValid(true))
	{
		jso._dateBox._timeCell.className = "timeCellError";	
		//this._dateBox._textBox.style.borderColor = "red";
		//this.element.style.borderColor = "red";
		return false;
	}
	
	jso._dateBox._timeCell.className = "timeCell";	
	return true;
}

proto._fireChangedEvent = function()
{
	var ev = {target: this.element};
	if(this.onchange) this.onchange(ev);
}


proto.resetValue = function(node)
{
	this._isDirty = false;
	if(this._doTime) this._timeBox.set_value(this._lastValidTime);
	this._populateDate(this._lastValidValue);
}

proto.loadData = function(node)
{
	var attr = node.getAttribute("value");
	if(attr != null) 
	{
		var value = this._lastValidValue = String(attr);
		if(this._doTime)
		{
			var dateTime = this.getReadableDateTime(value);			
			
			this._lastValidValue = dateTime[0];
			this._populateDate(dateTime[0]);
			
			this._lastValidTime = dateTime[1];
			this._timeBox.set_value(this._lastValidTime);
		}
		else 
		{
			this._populateDate(value);
		}
		
	}
	attr = node.getAttribute("minvalue");
	if(attr) this._minValue = this._parseDate(String(attr));
	attr = node.getAttribute("maxvalue");
	if(attr) this._maxValue = this._parseDate(String(attr));

	var attr = node.getAttribute("tooltip");
	if(attr) 
	{
		if(!this.element.tipText) Tooltip.attach(this.element, String(attr));
		else this.element.tipText = String(attr);
	}
	else
		Tooltip.detach(this.element);
	

	this._isDirty = false;
}

proto.getReadableDateTime = function(value)
{
	var time = "";
	var date = "";
	if(value.length > 0)
	{
		var ar = value.match(/(\d{4})(\d{2})(\d{2})(\d{2})(\d{2})/);
		if(ar != null)
		{
			date = ar[3] + "/" + ar[2] + "/" + ar[1];
			time = ar[4] + ":" + ar[5];
		}
		else {
			alert("ASSERT: can't parse date/time value: " + value); 
			return null;
		}
	}
	return [date, time];
}

proto._populateDate = function(value)
{
	if(value.length > 0)
	{
		var ar = value.match(/^(\d{1,2})[\/\.\-](\d{1,2})[\/\.\-](\d{4})$/);
		if(ar != null)
		{
			this._dayBox.value = ar[1];
			this._monthBox.value = ar[2];
			this._yearBox.value = ar[3];
		}
	}
	else
	{
		this._dayBox.value = "";
		this._monthBox.value = "";
		this._yearBox.value = "";
	}
}

proto._parseDate = function(str)
{
	var ar = str.match(/^(\d{4})(\d{2})(\d{2})(?:(\d{2})(\d{2}))?/);
	if(!ar) return null;
	if(ar[5] != '') 
	{
		return new Date(parseInt(ar[1], 10), parseInt(ar[2], 10) - 1, parseInt(ar[3], 10), parseInt(ar[4], 10), parseInt(ar[5], 10));
	}
	else if(ar[3] != '') 
	{
		return new Date(parseInt(ar[1], 10), parseInt(ar[2], 10) - 1, parseInt(ar[3], 10));
	}
	return null;
}

proto.storeData = function(xmldoc)
{
	if(!this._isDirty || !this.isValid()) return null;
	
	if(!this.element.id) 
	{
		this.element.style.background = "red";
		alert("No id for textbox.");
		return;
	}
	
	this._isDirty = false;

	var node = xmldoc.createElement("datebox");

	var value = this.get_value();

	if(this._doTime)
	{
		node.setAttribute("time", "true");
	}
	
	node.setAttribute("value", value);
	return node;
}

proto._button_onclick = function()
{
	CNUtil.findJSObject(CNUtil.eventTarget()).button_onclick();
}
proto.button_onclick = function()
{
	var calendar = CNPopupCalendar.defaultInstance;

	calendar.__activeCN_datebox = this;
	calendar.onxlresult = this._calendar_onxlresult;

	var xy = CNUtil.findAbsolutePos(CNUtil.eventTarget());
	
	var x = xy.x;
	var y = xy.y + CNUtil.eventTarget().offsetHeight;
	if(this.isValid(true) && 
		this._dayBox.value.replace(/\s+/, "") != "" && 
			this._monthBox.value.replace(/\s+/, "") != "" && 
				this._yearBox.value.replace(/\s+/, "") != "") 
	{
		var value = "";
		if(!isNaN(parseInt(this._dayBox.value, 10))) value += this._dayBox.value;
		value += "/";
		if(!isNaN(parseInt(this._monthBox.value, 10))) value += this._monthBox.value;
		value += "/";
		if(!isNaN(parseInt(this._yearBox.value, 10))) value += this._yearBox.value;
		
		calendar.show(value, null, x, y);		
	}
	else calendar.show(null, null, x, y);
	
	CNUtil.cancelBubble();
}

proto._calendar_onxlresult = function()
{
	this.__activeCN_datebox.calendar_onxlresult(this);
}
proto.calendar_onxlresult = function(calendar)
{
	this._textBox.value = calendar.get_dateString();	
	var date = calendar.get_dateString().match(/^(\d{1,2})[\/\.\-](\d{1,2})[\/\.\-](\d{4})$/);
	if(date)
	{		
		this._dayBox.value = date[1];
		this._monthBox.value = date[2];
		this._yearBox.value = date[3];
		
		this._dayBox.style.borderColor = "";
		this._monthBox.style.borderColor = "";
		this._yearBox.style.borderColor = "";
	}

	if(this._doTime) 
		this._timeBox.element.style.borderColor = "";
	
	this._isDirty = true;
	this._valid = true;
	this.select();	

	if(!this._doTime || this._timeBox.get_value().length > 0) 
		this._fireChangedEvent();

	calendar.onxlresult = calendar.__activeCN_datebox = null;
}

proto._textbox_onchange = function()
{
	var jsObject = CNUtil.findJSObject(CNUtil.eventTarget())
	if(jsObject instanceof CN_timebox) jsObject = jsObject._dateBox;
	jsObject._isDirty = true;
	if(jsObject._focusInside) 
	{
		jsObject._focusInside = false;
	}
//	else
//	{
//		jsObject._fireChangedEvent();
//	}
}

proto._textbox_onfocusout = function()
{
	CNUtil.findJSObject(CNUtil.eventTarget()).textbox_onfocusout();	
}
proto.textbox_onfocusout = function()
{
	if(this._doTime)
	{
		this._focusInside = Event.current().relatedTarget != null && this.element.contains(Event.current().relatedTarget);
	}
	
	if(this._disabled) return;
	this._valid = this.isValid();
}

proto._textbox_onactivate = function()
{
	var jsObject = CNUtil.dispatchObject();
	if(jsObject._disabled)
	{
		CNUtil.cancelEvent();
		return;
	}

	// Reset the date box style to default
	jsObject._dateBox.className = "dateBox";
	if(jsObject._doTime)
	{	
		if(!jsObject._timeBox._isValid(true)) {
			jsObject._timeCell.className = "timeCellError";
		} 
		else {
			jsObject._timeCell.className = "timeCell";
		}		
	}
}

/*proto.validateValue = function(value) {

}*/

proto.isValid = function(doNotHighlite)
{
	if(this._disabled) 
		return true;

	//Reset to default CSS
	this._resetToDefault();
	
	var date = null;	
	
	var valid = false;
	var timeBoxIsValid = false;
	
	this.validationString = "";
	this._storedValue = "";
	
	var day = parseInt(this._dayBox.value, 10);
	var month = parseInt(this._monthBox.value, 10);
	var year = parseInt(this._yearBox.value, 10);
	
	var isDateEmpty = isNaN(day) && isNaN(month) && isNaN(year);
	if(!this._doTime) {
		timeBoxIsValid = true;
	}
	
	if(isDateEmpty && this._canBeEmpty && 
		(!this._doTime || this._timeBox.get_value() == "")) 
	{
		valid = true;
		timeBoxIsValid = true;
	}
	else
	{
		day = (String(day)).match(/^(\d{1,2})$/);		
		month = (String(month)).match(/^(\d{1,2})$/);		
		year = (String(year)).match(/^(\d{4})$/);		
		
		if ((day != null && (parseInt(day[0], 10)) >= 1 && parseInt(day[0], 10) <= 31) &&
				(month != null && (parseInt(month[0], 10)) >= 1 && parseInt(month[0], 10) <= 12) &&			
					(year!= null &&  (parseInt(year[0], 10)) > 1800)) 
		{
			valid = true
		}
		
		if(day != null && month != null && year != null && valid)
		{	
			day.splice(0, 1);
			month.splice(0, 1);
			year.splice(0, 1);
			
			date = new Date(year, month -1, day);				
			valid = date.getDate() == day[0] && date.getMonth() + 1 == month[0] && date.getFullYear() == year[0];			
			this._storedValue = year[0] + this._zeroPad(month[0]) + this._zeroPad(day[0]);
		}
		
		if(!valid) {
			this.validationString = this._dateValidationString;			
		}
		
		if(this._doTime)
		{
			timeBoxIsValid = this._timeBox._isValid(true);						
			if(timeBoxIsValid && valid) 
			{
				var timeValue = this._timeBox.get_value();
				if (timeValue != "")
				{	
					timeBoxIsValid	= true;			
					var ar = timeValue.split(':');
					if(valid && parseInt(ar[0]) != ""  && parseInt(ar[1]) != "") 
					{
						date = new Date(date.getFullYear(), date.getMonth(), date.getDate(), parseInt(ar[0]), parseInt(ar[1]));
					}
				}
				else
				{
					timeBoxIsValid = false;
				}
			}
			
			if(!timeBoxIsValid)
			{
				this.validationString += this._timeValidationString;
			}
		}
	}
	
	if(date)
	{
		if(valid && timeBoxIsValid && this._minValue) 
		{
			if (this._minValue.getTime() > date.getTime())
			{
				valid = false;				
			}
		}
		if(valid && timeBoxIsValid && this._maxValue) 
		{
			if(this._maxValue.getTime() < date.getTime())
			{
				valid = false
			}
		}	

		if(!valid)	
			this.validationString = this._dateValidationString;
	}

	if(!doNotHighlite && (!valid || !timeBoxIsValid)) 
	{	
		if (!valid)
		{
			this._dateBox.className = "dateBoxError";			
		}	
				
		if(this._doTime)
		{
			if (!timeBoxIsValid) 
			{
				this._timeCell.className = "timeCellError";						
			}
		}
	}	

	return valid && timeBoxIsValid;
}

proto._resetToDefault = function()
{
	this._dateBox.className = "dateBox";	
	if(this._doTime)	
		this._timeCell.className = "timeCell";					
}

proto._zeroPad = function(val)
{
	var str = String(val);
	if(str.length < 2) str = "0" + val;
	return str;
}

proto.set_tabIndex = function(ti)
{
	this._tabIndex = ti;
	this._set_tabIndex(ti);
}
proto._set_tabIndex = function(ti)
{
	this._dayBox.tabIndex = ti;
	this._monthBox.tabIndex = ti;
	this._yearBox.tabIndex = ti;
	this._button.tabIndex = ti;
	if(this._doTime) this._timeBox.set_tabIndex(ti);
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
	this._dayBox.readOnly = this._disabled;
	this._monthBox.readOnly = this._disabled;
	this._yearBox.readOnly = this._disabled;
	
	this._button.disabled = this._disabled;

	//if(this._doTime) this._timeBox.set_disabled(this._disabled);
	if(CNFormManager.vista)
	{
		this.element.className = this._disabled ? "cn_datebox cn_datebox_disabled" : "cn_datebox";
		this._button.src = CNFormManager.themeImagesPath + (this._disabled ? "disabled-datebox-button.gif" : "datebox-button.gif");
	}
	else
	{		
		this._dayBox.style.borderColor = this._disabled ? Util.getStyle(this.element, "xl--disabled-border-color") : "";
		this._dayBox.style.backgroundColor = this._disabled ? Util.getStyle(this.element, "xl--disabled-background") : ""		
		this._monthBox.style.borderColor = this._disabled ? Util.getStyle(this.element, "xl--disabled-border-color") : "";
		this._monthBox.style.backgroundColor = this._disabled ? Util.getStyle(this.element, "xl--disabled-background") : ""		
		this._yearBox.style.borderColor = this._disabled ? Util.getStyle(this.element, "xl--disabled-border-color") : "";
		this._yearBox.style.backgroundColor = this._disabled ? Util.getStyle(this.element, "xl--disabled-background") : ""				
		this._dateBox.style.borderColor = this._disabled ? Util.getStyle(this.element, "xl--disabled-border-color") : "";
		this._dateBox.style.backgroundColor = this._disabled ? Util.getStyle(this.element, "xl--disabled-background") : ""		
		if(this._doTime)
		{
			this._timeCell.style.borderColor = this._disabled ? Util.getStyle(this.element, "xl--disabled-border-color") : "";
			this._timeCell.style.backgroundColor = this._disabled ? Util.getStyle(this.element, "xl--disabled-background") : ""		
			this._timeBox.set_disabled(this._disabled);
			this._timeBox.element.style.border = "0px";			
		}
	}
	if(this._disabled) {
		var calendar = CNPopupCalendar.defaultInstance;
		if(calendar.__activeCN_datebox == this) {
			calendar.onxlresult = null;
			calendar.__activeCN_datebox = null;
			calendar.hide();
		}
	}
}
proto.unload = function() {
	var calendar = CNPopupCalendar.defaultInstance;
	if(calendar && calendar.__activeCN_datebox == this) {
		calendar.onxlresult = null;
		calendar.__activeCN_datebox = null;
		calendar.hide();
	}
}

// Used by grid api.
proto.set_readOnly = function(val)
{
}

proto.get_readOnly = function(val)
{
	return false;
}
proto.set_value = function(val)
{
	this.loadData(Util.wrapIntoNode({value: val}))
}
proto.get_value = function()
{
	var value = "";
	if(!isNaN(parseInt(this._dayBox.value, 10))) value += this._dayBox.value;
	value += "/";
	if(!isNaN(parseInt(this._monthBox.value, 10))) value += this._monthBox.value;
	value += "/";
	if(!isNaN(parseInt(this._yearBox.value, 10))) value += this._yearBox.value;
	
	if(value == "//") return "";
	
	this._storedValue = this._yearBox.value + this._zeroPad(this._monthBox.value) + this._zeroPad(this._dayBox.value);
	
	if(this._doTime)
	{
		if(this._storedValue)
		{
			var timeValue = this._timeBox.get_value();
			if(timeValue && timeValue != "")
			{
				var ar = timeValue.split(':');
				value = this._storedValue + this._zeroPad(ar[0]) + this._zeroPad(ar[1]);
			}
			else 
				value = this._storedValue
		}
		else
			value = "";
	}

	return value;
}

proto.blur = function(val)
{
}

proto.select = function()
{
	this._textBox.select();
}

proto.focus = function()
{
	this._dayBox.focus();
	//var textBox = this._textBox;
}
proto.onfocusout = function(){}
proto.onkeypress = function(){}

