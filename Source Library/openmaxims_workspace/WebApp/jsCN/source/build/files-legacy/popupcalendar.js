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
//window.attachEvent("onload", CNPopupCalendar.createDefaultCalendar);
//window.attachEvent("onunload", CNPopupCalendar.destroyDefaultCalendar);

// Main. =========================================
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
	
	l.className = l.className + " cn_popupcalendar";
	this.element = l;
	l.jsObject = this;
	
	l.unselectable = true;

	this.buildElement();
	return l;
}


// TODO: define x, y/ event.srcElement coord space.
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
	 	if(event && event.srcElement)
		{
			var xy = CNUtil.findAbsolutePos(event.srcElement, element.parentElement);
			x = xy.x;
			y = xy.y + event.srcElement.offsetHeight;
		}
	}

	this.element.style.left = x;
	this.element.style.top = y;
	
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

	this.element.style.left = x;
	this.element.style.top = y;
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
	var all = this.element.all;
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
	var html = "<table id=topControls unselectable=on width=100% border=0 cellpadding=0 cellspacing=0>\
					<tr><td width=1%><button id=prevMonthButton class=arrows10>3</button>\
					<td width=34%>&nbsp;</td>\
					<td align=right width=100 nowrap id=monthTD>&nbsp;</td>\
					<td width=1 nowrap></td>\
					<td width=1% align=right id=yearTD></td>\
					<td><table border=0 cellpadding=0 cellspacing=0>\
					<tr><td unselectable=on><button unselectable=on id=yearUpButton class=arrows7>5</button></td></tr>\
					<tr><td><button unselectable=on id=yearDownButton class=arrows7>6</button></td></tr></table>\
					<td width=35%>&nbsp;</td>\
					</td><td width=1% align=right><button id=nextMonthButton class=arrows10>4</button></td>\
					</tr></table>";
	
	contents.insertAdjacentHTML("beforeEnd", html);

	if(this._date == null) this._date = new Date();

	var all = contents.all;

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

	var year = this._date.getYear();
	html = "<input type=text maxlength=4 id=yearSelect value=" + year + ">";
	all.yearTD.innerHTML = html;
	VistaSupport.attachToTextBox(all.yearTD.firstChild);
	
	all.prevMonthButton.onclick = 
	all.prevMonthButton.ondblclick = this._prevMonthButton_onclick;
	
	all.nextMonthButton.onclick = 
	all.nextMonthButton.ondblclick = this._nextMonthButton_onclick;

	all.yearUpButton.onclick = 
	all.yearUpButton.ondblclick = this._yearUpButton_onclick;
	
	all.yearDownButton.onclick = 
	all.yearDownButton.ondblclick = this._yearDownButton_onclick;

	all.yearSelect.onfocus = this._yearSelect_onfocus;
	all.yearSelect.onkeypress = this._yearSelect_onkeypress;
	all.yearSelect.onkeyup = this._yearSelect_onkeyup;

	var table = document.createElement("<table unselectable=on id=daysTable border=1 frame=void rules=cols cellpadding=0 cellspacing=0></table>");
	var header = table.insertRow();
	header.id = "header";
	for(var td = 0; td < 7; td++)
	{
		var cell = header.insertCell();
		cell.unselectable = true;
		var span = document.createElement("<span unselectable=on>");
		cell.appendChild(span);
		span.innerText = this.days[td];
	}
	
	for(var tr = 0; tr < 6; tr++)
	{
		var row = table.insertRow();
		row.unselectable = true;
		for(var td = 0; td < 7; td++)
		{
			var cell = row.insertCell();
			cell.unselectable = true;
			cell.innerText = " ";
		}
	}
	contents.appendChild(table);

	table.onmouseover = this._table_onmouseover;
	table.onmouseout = this._table_onmouseout;
	table.onclick = this._table_onclick;
	//this.updateToDate();

}

proto.fillDays = function(month, year)
{
	var date = new Date();
	date.setYear(year);

	// NOTE: set date before month or the month can be shifted.
	var dayCount = 1;
	date.setDate(dayCount);
	date.setMonth(month);

	var table = this.element.all["daysTable"];
	var lastDayCell;
	for(var tr = 0; tr < 6; tr++)
	{
		var row = table.rows(tr + 1);
		date.setDate(dayCount);
		var firstOnWeek = this.usWeekToEu[date.getDay()];
		for(var td = 0; td < 7; td++)
		{
			var cell = row.cells(td);
			date.setDate(dayCount);
			if(td < firstOnWeek || date.getMonth() != month || dayCount > 31)  
			{
				cell.innerText = " ";
				cell.className = "empty";
			}
			else 
			{
				cell.innerText = dayCount;
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
	var day = l.innerText * 1;
	if(this.selectedDay != day)
	{
		this.selectedDay = day;
		this.fire_onxlchange();
	}
}

proto.fillChange = function()
{
	this._isDirty = true;
	var all = this.element.all;
	this.fillDays(this._combobox.get_selectedIndex(), all.yearSelect.value);
	this.fire_onxlchange();
}

proto.fire_onxlchange = function()
{
	var ev = {srcElement: this};
	if(this.onxlchange) this.onxlchange(ev);
}


// Event handlers. =======================
proto._yearUpButton_onclick = function()
{
	var jsObject = CNUtil.dispatchObject();
	var all = jsObject.element.all;
	all.yearSelect.value = all.yearSelect.value * 1 + 1;
	jsObject.fillChange();
}

proto._yearDownButton_onclick = function()
{
	var jsObject = CNUtil.dispatchObject();
	var all = jsObject.element.all;
	all.yearSelect.value = all.yearSelect.value * 1 - 1;
	jsObject.fillChange();
}

proto._nextMonthButton_onclick = function()
{
	var jsObject = CNUtil.dispatchObject();
	if(jsObject._combobox.get_selectedIndex() == 11)
	{
		jsObject._combobox.set_selectedIndex(0, true);
		jsObject.element.all.yearSelect.value++;
	}
	else
	{
		jsObject._combobox.set_selectedIndex(jsObject._combobox.get_selectedIndex() + 1, true);
	}
	jsObject.fillChange();
}

proto._prevMonthButton_onclick = function()
{
	var jsObject = CNUtil.dispatchObject();
	if(jsObject._combobox.get_selectedIndex() == 0)
	{
		jsObject._combobox.set_selectedIndex(11, true);
		jsObject.element.all.yearSelect.value--;
	}
	else
	{
		jsObject._combobox.set_selectedIndex(jsObject._combobox.get_selectedIndex() - 1, true);
	}
	jsObject.fillChange();
}

proto._table_onmouseover = function()
{
	var l = event.srcElement;
	if(l.tagName != "TD" || l.parentElement == header || l.className == "empty") return;
	l.__className = l.className;
	l.className = "hover";
}

proto._table_onmouseout = function()
{
	var l = event.srcElement;
	if(l.tagName != "TD" || l.parentElement == header || l.className == "empty") return;
	l.className = l.__className;
}

proto._table_onclick = function()
{
	var l = event.srcElement;
	if(l.tagName != "TD" || l.parentElement == header || l.className == "empty") return;
	var jsObject = CNUtil.dispatchObject();
	jsObject.selectDayTD(l);
	jsObject.hide();
}

proto._monthSelect_onchange = function()
{
	// Executed in combobox context.
	var jsObject = CNUtil.findJSObject(this.element.parentElement);

	if(jsObject._disabled) return;

	var all = jsObject.element.all;
	jsObject._isDirty = true;
	jsObject.fillDays(this.get_selectedIndex(), all.yearSelect.value);
	jsObject.fire_onxlchange();
}

proto._yearSelect_onkeyup = function()
{
	var jsObject = CNUtil.findJSObject(event.srcElement);
	jsObject.fillChange();
	return true;
}

proto._yearSelect_onkeypress = function()
{
	var l = event.srcElement;
	var code = event.keyCode;
	if(code == 0) return;
	var charx = String.fromCharCode(code);
	if(charx < "0" || charx > "9") return false;
	return true;
}

proto._yearSelect_onfocus = function()
{
	event.srcElement.select();
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
	this.captionDiv.innerText = this._title;
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
	var all = this.element.all;
	this._date = new Date(all.yearSelect.value, this._combobox.get_selectedIndex(), this.selectedDay);
	return this._date;
}

// In EU format, i.e. dd.mm.yyyy
proto.get_dateString = function()
{
	return this.zeroPad(this._date.getDate()) + "/" + this.zeroPad(this._date.getMonth() + 1) + "/" + this._date.getFullYear();
}
