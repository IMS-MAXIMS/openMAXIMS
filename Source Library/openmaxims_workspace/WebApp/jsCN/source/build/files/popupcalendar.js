/*
	REVISIT: rendering
	v. 2.0.0
	+ vista
*/
function CNPopupCalendar(preBuild)
{
	this.preBuild = preBuild;
	this.monthes = CNPopupCalendar.months;
	this.days = ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"];
	this.table = null;
	this.header = null;
	this.selectedDayTD = null;
	this.selectedDay = 1;
	this._date = null;
	this.waitForComponentsCount = 2;
	
	this.popup = null;
	this.popupBody = null;
	this.popupWindow = null;
	
	this._title = "Please select the date";
	
	this.usWeekToEu = CNPopupCalendar.usWeekToEu;
}
var proto = CNPopupCalendar.prototype;
CNPopupCalendar.months = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];
CNPopupCalendar.usWeekToEu = [6, 0, 1, 2, 3, 4, 5];

CNPopupCalendar._visibleCalendars = [];
	

// Events. =======================================
proto.onxlresult = function(ev){}
proto.onxlchange = function(ev){}

CNPopupCalendar.createDefaultCalendar = function()
{
	if(CNPopupCalendar.defaultInstance)
	{
		alert("ASSERT: CNPopupCalendar.defaultInstance");
		return;
	}
	var l = CNPopupCalendar.defaultInstance = new CNPopupCalendar();
	l.createElement();
}
CNPopupCalendar.destroyDefaultCalendar = function()
{
	var instance = CNPopupCalendar.defaultInstance;
	if(instance._combobox) CNFormManager.destroyJSObject(instance._combobox);
	if(instance.element.shadow) instance.element.shadow.destroy();
	CNFormManager.destroyJSObject(instance);
	CNPopupCalendar.defaultInstance = null;
}

// NOTE: autocreation.
// Default calendar is created explicitly by the form lifecycle.

// Main. =========================================
proto._elements = function(root)
{
	var result = {};
	var nodes = root.querySelectorAll("[id]");
	for(var i = 0; i < nodes.length; i++) result[nodes[i].id] = nodes[i];
	return result;
}

proto.createElement = function()
{
	var l;
	if(CNFormManager.vista)
	{
		l = CNDialogManager.createVistaDialog(this._title);
	}
	else
	{
		l = CNDialogManager.createDialog(this._title);
	}
	
	if(l.shadow)
	{
		l.shadow.destroy();
		l.style.boxShadow = "2px 3px 3px rgba(0, 0, 0, .3)";
	}
	l.className = l.className + " cn_popupcalendar";
	this.element = l;
	l.jsObject = this;
	
	l.style.userSelect = "none";

	this.buildElement();
	return l;
}


// If coordinates are omitted, anchor to the current event target.
proto.show = function(param, scrollElement, x, y)
{
	var body = document.body;
	if(!scrollElement) scrollElement = body;
	
	if(!param) param = new Date();

	if(typeof param == "object") // Date
	{
		this.set_date(param);
	}
	else if(typeof param == "string")
	{
		var ar = param.split(/[.\/]/);
		if(ar.length == 3) 
		{
			var year = ar[2] * 1;
			if(year > 50 && year < 100) 
			{
				year += 1900;
			}
			if(year < 50) year += 2000;
			this.set_date(new Date(year, ar[1] - 1, ar[0]));
		}
	}

	var doOffset = true;
	if(x == null || y == null)
	{
		doOffset = false;
		x = 0; 
		y = 0;
	 	var anchor = Util.eventTarget(Event.current()) || document.activeElement;
		if(anchor)
		{
			var xy = CNUtil.findAbsolutePos(anchor, this.element.parentElement);
			x = xy.x;
			y = xy.y + anchor.offsetHeight;
		}
	}

	this.element.style.left = x + "px";
	this.element.style.top = y + "px";
	
	this.element.style.zIndex = top.__ontopZ++;

	CNDialogManager.showPopupDialog(this.element);

	// TODO: Move to CNDialogManager?

	var b = y + this.element.offsetHeight
	var r = x + this.element.offsetWidth

	if(doOffset)
	{
		x += scrollElement.scrollLeft;
		y += scrollElement.scrollTop;
	}

	if(r > body.clientWidth) 
	{
		x = x - r + body.clientWidth - 4; // 4 = shadowWidth
	}
	if(b > body.clientHeight) 
	{
		y = y - b + body.clientHeight - 4; // 4 = shadowWidth
	}
	if(x < 0) x = 0;
	if(y < 0) y = 0;

	this.element.style.left = x + "px";
	this.element.style.top = y + "px";
	if(this.element.shadow) this.element.shadow.syncPosition();
}

proto.hide = function(cancel, force)
{
	CNDialogManager.hideDialog(this.element);
	if(!cancel) 
	{
		var ev = {};
		ev.date = this.get_date();
		if(this.onxlresult) this.onxlresult(ev);
	}
}

proto.updateToDate = function()
{
	var all = this._elements(this.element);
	// TODO
	var month = this._date.getMonth();
	this._combobox.set_selectedIndex(month, true); // true == doNotFireEvent.
	var year = all.yearSelect.value = this._date.getFullYear();
	this.selectedDay = this._date.getDate();
	this.fillDays(month, year);
}

proto.buildElement = function()
{
	var contents = CNDialogManager.getContents(this.element);
	var html = "<table id=topControls width=100% border=0 cellpadding=0 cellspacing=0>\
					<tr><td width=1%><button id=prevMonthButton class=arrows10>3</button>\
					<td width=34%>&nbsp;</td>\
					<td align=right width=100 nowrap id=monthTD>&nbsp;</td>\
					<td width=1 nowrap></td>\
					<td width=1% align=right id=yearTD></td>\
					<td><table border=0 cellpadding=0 cellspacing=0>\
					<tr><td><button id=yearUpButton class=arrows7>5</button></td></tr>\
					<tr><td><button id=yearDownButton class=arrows7>6</button></td></tr></table>\
					<td width=35%>&nbsp;</td>\
					</td><td width=1% align=right><button id=nextMonthButton class=arrows10>4</button></td>\
					</tr></table>";
	
	var template = document.createElement("template");
	template.innerHTML = html;
	contents.appendChild(template.content);

	if(this._date == null) this._date = new Date();

	var all = this._elements(contents);

	var combobox = this._combobox = new CN_combobox();
	var options = [];
	for(var i = 0; i < 12; i++)
	{
		var option = {text: this.monthes[i]};
		options[options.length] = option;
	}

	all.monthTD.style.position = "relative";
	var combo = combobox.createElement(options, all.monthTD);

	combobox.onchange = this._monthSelect_onchange;

	var year = this._date.getFullYear();
	var yearSelect = document.createElement("input");
	yearSelect.type = "text";
	yearSelect.maxLength = 4;
	yearSelect.id = "yearSelect";
	yearSelect.value = year;
	all.yearTD.appendChild(yearSelect);
	all.yearSelect = yearSelect;
		
	Event.add(all.prevMonthButton, "click", this, this._prevMonthButton_onclick);
	Event.add(all.prevMonthButton, "dblclick", this, this._prevMonthButton_onclick);
	
	Event.add(all.nextMonthButton, "click", this, this._nextMonthButton_onclick);
	Event.add(all.nextMonthButton, "dblclick", this, this._nextMonthButton_onclick);

	Event.add(all.yearUpButton, "click", this, this._yearUpButton_onclick);
	Event.add(all.yearUpButton, "dblclick", this, this._yearUpButton_onclick);
	
	Event.add(all.yearDownButton, "click", this, this._yearDownButton_onclick);
	Event.add(all.yearDownButton, "dblclick", this, this._yearDownButton_onclick);

	Event.add(all.yearSelect, "focus", this, this._yearSelect_onfocus);
	Event.add(all.yearSelect, "keypress", this, this._yearSelect_onkeypress);
	Event.add(all.yearSelect, "keyup", this, this._yearSelect_onkeyup);

	var table = (function(){ var el = document.createElement("table"); el.style.userSelect = "none"; el.id = 'daysTable'; el.border = '1'; el.frame = 'void'; el.rules = 'cols'; el.cellPadding = '0'; el.cellSpacing = '0'; return el; })();
	var header = this.header = table.insertRow();
	header.id = "header";
	for(var td = 0; td < 7; td++)
	{
		var cell = header.insertCell();
		cell.style.userSelect = "none";
		var span = (function(){ var el = document.createElement("span"); el.style.userSelect = "none"; return el; })();
		cell.appendChild(span);
		span.textContent = this.days[td];
	}
	
	for(var tr = 0; tr < 6; tr++)
	{
		var row = table.insertRow();
		row.style.userSelect = "none";
		for(var td = 0; td < 7; td++)
		{
			var cell = row.insertCell();
			cell.style.userSelect = "none";
			cell.textContent = " ";
		}
	}
	contents.appendChild(table);

	Event.add(table, "mouseover", this, this._table_onmouseover);
	Event.add(table, "mouseout", this, this._table_onmouseout);
	Event.add(table, "click", this, this._table_onclick);
	//this.updateToDate();

}

proto.fillDays = function(month, year)
{
	var date = new Date();
	date.setFullYear(year);

	// NOTE: set date before month or the month can be shifted.
	var dayCount = 1;
	date.setDate(dayCount);
	date.setMonth(month);

	var table = this.element.querySelector("#daysTable");
	var lastDayCell;
	for(var tr = 0; tr < 6; tr++)
	{
		var row = table.rows[tr + 1];
		date.setDate(dayCount);
		var firstOnWeek = this.usWeekToEu[date.getDay()];
		for(var td = 0; td < 7; td++)
		{
			var cell = row.cells[td];
			date.setDate(dayCount);
			if(td < firstOnWeek || date.getMonth() != month || dayCount > 31)  
			{
				cell.textContent = " ";
				cell.className = "empty";
			}
			else 
			{
				cell.textContent = dayCount;
				lastDayCell = cell;
				if(dayCount == this.selectedDay) 
				{
					this.selectDayTD(cell);
				}	
				else cell.className = "";

				dayCount++;
			}
		}
	}
	if(dayCount - 1 < this.selectedDay && lastDayCell) 
	{
		this.selectDayTD(lastDayCell);
	}	
}

proto.selectDayTD = function(l)
{
	if(this.selectedDayTD != null) this.selectedDayTD.className = this.selectedDayTD.__className = "";
	l.className = l.__className = "pushed";
	this.selectedDayTD = l;
	var day = l.textContent * 1;
	if(this.selectedDay != day)
	{
		this.selectedDay = day;
		this.fire_onxlchange();
	}
}

proto.fillChange = function()
{
	this._isDirty = true;
	var all = this._elements(this.element);
	this.fillDays(this._combobox.get_selectedIndex(), all.yearSelect.value);
	this.fire_onxlchange();
}

proto.fire_onxlchange = function()
{
	var ev = {target: this};
	if(this.onxlchange) this.onxlchange(ev);
}


// Event handlers. =======================
proto._yearUpButton_onclick = function(ev)
{
	var jsObject = this;
	var all = jsObject._elements(jsObject.element);
	all.yearSelect.value = all.yearSelect.value * 1 + 1;
	jsObject.fillChange();
}

proto._yearDownButton_onclick = function(ev)
{
	var jsObject = this;
	var all = jsObject._elements(jsObject.element);
	all.yearSelect.value = all.yearSelect.value * 1 - 1;
	jsObject.fillChange();
}

proto._nextMonthButton_onclick = function(ev)
{
	var jsObject = this;
	if(jsObject._combobox.get_selectedIndex() == 11)
	{
		jsObject._combobox.set_selectedIndex(0, true);
		jsObject.element.querySelector("#yearSelect").value++;
	}
	else
	{
		jsObject._combobox.set_selectedIndex(jsObject._combobox.get_selectedIndex() + 1, true);
	}
	jsObject.fillChange();
}

proto._prevMonthButton_onclick = function(ev)
{
	var jsObject = this;
	if(jsObject._combobox.get_selectedIndex() == 0)
	{
		jsObject._combobox.set_selectedIndex(11, true);
		jsObject.element.querySelector("#yearSelect").value--;
	}
	else
	{
		jsObject._combobox.set_selectedIndex(jsObject._combobox.get_selectedIndex() - 1, true);
	}
	jsObject.fillChange();
}

proto._table_onmouseover = function(ev)
{
	var l = Util.eventTarget(ev);
	if(l.tagName != "TD" || l.parentElement == this.header || l.className == "empty") return;
	l.__className = l.className;
	l.className = "hover";
}

proto._table_onmouseout = function(ev)
{
	var l = Util.eventTarget(ev);
	if(l.tagName != "TD" || l.parentElement == this.header || l.className == "empty") return;
	l.className = l.__className;
}

proto._table_onclick = function(ev)
{
	var l = Util.eventTarget(ev);
	if(l.tagName != "TD" || l.parentElement == this.header || l.className == "empty") return;
	var jsObject = this;
	jsObject.selectDayTD(l);
	jsObject.hide();
}

proto._monthSelect_onchange = function()
{
	// Executed in combobox context.
	var jsObject = CNUtil.findJSObject(this.element.parentElement);

	if(jsObject._disabled) return;

	var all = jsObject._elements(jsObject.element);
	jsObject._isDirty = true;
	jsObject.fillDays(this.get_selectedIndex(), all.yearSelect.value);
	jsObject.fire_onxlchange();
}

proto._yearSelect_onkeyup = function(ev)
{
	var jsObject = this;
	jsObject.fillChange();
	return true;
}

proto._yearSelect_onkeypress = function(ev)
{
	var l = Util.eventTarget(ev);
	var code = Event.keyValue(ev);
	if(code == 0) return;
	var charx = String.fromCharCode(code);
	if(charx < "0" || charx > "9") return Util.cancelEvent(ev);
	return true;
}

proto._yearSelect_onfocus = function(ev)
{
	Util.eventTarget(ev).select();
}


// Util. ===================================
proto.zeroPad = function(str)
{
	if(String(str).length == 1)	return "0" + str;
	return str;
}


// Properties. ==============================
proto.set_title = function(value)
{
	this._title = value;
	this.captionDiv.textContent = this._title;
}

proto.set_date = function(value)
{
	if(value != null && (this._isDirty || this._date == null || value.getTime() != this._date.getTime()))
	{
		this._date = value;
		this._isDirty = false;
		this.updateToDate();
	}
}

proto.get_date = function()
{
	var all = this._elements(this.element);
	this._date = new Date(all.yearSelect.value, this._combobox.get_selectedIndex(), this.selectedDay);
	return this._date;
}

// In EU format, i.e. dd.mm.yyyy
proto.get_dateString = function()
{
	return this.zeroPad(this._date.getDate()) + "/" + this.zeroPad(this._date.getMonth() + 1) + "/" + this._date.getFullYear();
}
