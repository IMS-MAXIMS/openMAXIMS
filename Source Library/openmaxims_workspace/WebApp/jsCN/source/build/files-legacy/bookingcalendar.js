/*
	REVISIT: rendering
	v. 2.0
*/
function CN_bookingcalendar()
{
	this.formManager = null;
	this._disabled = false;

	this._today = null;
	// NOTE: 1..12.
	this._selectedMonth = null;
	this._selectedYear = null;
	this._selectedDate = null;
	
	this._rebooking = true;

	this.table = null;

	this.header = null;
	
	var isReady = false;

	this.monthes = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];
	this.days = ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"];
	
	this.usWeekToEu = [6, 0, 1, 2, 3, 4, 5];

	this.disabledDaysAr = [];
	this.noSessionDaysAr = [];
	this.conflictDaysAr = [];
	this.noSlotsDaysAr = [];
	this.percentAr = [];
	this.bookedDaysAr = [];
	this.rebookedDaysAr = [];
	
	this.template = null;

	// One exemplar needed.
	this.nowDate = new Date();
	
	this._postbackValue = null;
	this._checksDisabled = false; // #1044
}
var proto = CN_bookingcalendar.prototype;

// Events. ======================
proto.onpostback = function(ev)
{
	this._postbackValue = ev.value;
	this.formManager.postData(this.element);
}


// Main. ==========================
proto.createElement = function(node, parentElement)
{
	var l = document.createElement("div");
	parentElement.appendChild(l);
	
	l.className = "cn_bookingcalendar";
	
	this.element = l;
	l.jsObject = this;

	this.buildElement(node);

	return l;	
}

proto.storeData = function(xmldoc)
{
	if(this._postbackValue === null) return null;
	var node = xmldoc.createElement("bookingcalendar");
	node.setAttribute("value", this._postbackValue);
	this._postbackValue = null;
	return node;
}

proto.unload = function()
{
	this.table = null;
	this.header = null;
	this.template = null;
	this._combobox.element.jsObject = null;
	this._combobox.element = null;
	this._combobox = null;
}

proto.loadData = function(node)
{
	this.isReady = false;

	attr = node.getAttribute("selectedMonth");
	if(attr) this._selectedMonth = attr * 1 - 1;
	
	attr = node.getAttribute("selectedYear");
	if(attr) this._selectedYear = attr * 1;

	if(isNaN(this._selectedMonth) || isNaN(this._selectedYear))
	{
		var date = new Date(this.nowDate.getFullYear(), this.nowDate.getMonth(), this.nowDate.getDate());
		this._selectedYear = date.getFullYear();
		this._selectedMonth = date.getMonth();
	}

	attr = node.getAttribute("selectedDate");
	if(attr) this._selectedDate = this.parseDate(String(attr));
	else if(attr === "") this._selectedDate = null;

	attr = node.getAttribute("percent");
	if(attr) this.percentAr = String(attr).split(",");
	else if(attr === "") this.percentAr = [];

	attr = node.getAttribute("bookedDays");
	if(attr) this.bookedDaysAr = this.parseToHash(attr);
	else if(attr === "") this.bookedDaysAr = [];

	attr = node.getAttribute("rebookedDays");
	if(attr) this.rebookedDaysAr = this.parseToHash(attr);
	else if(attr === "") this.rebookedDaysAr = [];

	attr = node.getAttribute("disabledDays");
	if(attr) this.disabledDaysAr = this.parseToHash(attr);
	else if(attr === "") this.disabledDaysAr = [];

	attr = node.getAttribute("noSessionDays");
	if(attr) this.noSessionDaysAr = this.parseToHash(attr);
	else if(attr === "") this.noSessionDaysAr = [];
	
	attr = node.getAttribute("conflictDays");
	if(attr) this.conflictDaysAr = this.parseToHash(attr);
	else if(attr === "") this.conflictDaysAr = [];

	attr = node.getAttribute("noSlotsDays");
	if(attr) this.noSlotsDaysAr = this.parseToHash(attr);
	else if(attr === "") this.noSlotsDaysAr = [];

	var all = this.element.all;	
	all.yearSelect.value = this._selectedYear;

	var combobox = all.monthTD.children[0].jsObject;
	combobox.set_selectedIndex(this._selectedMonth);
	
	this._checksDisabled = node.getAttribute("checksDisabled") == "true";
	if(this._checksDisabled) {
		Util.addClass(this.table, "checksDisabled");
	} else {
		Util.removeClass(this.table, "checksDisabled");
	}
	
	this._loadDays(node.selectNodes("day"));

	this.fillDays(this._selectedMonth, this._selectedYear);

	this.isReady = true;
}

proto._loadDays = function(dayNodes) {
	var count = dayNodes.length;
	this._days = {};
	for(var i = 0; i < count; i++) {
		var node = dayNodes[i];
		this._days[parseInt(node.getAttribute("n"), 10)] = {color: node.getAttribute("color")};
	}
}

proto.buildElement = function(node)
{
	var attr = node.getAttribute("today");
	if(attr) this._today = this.parseDate(String(attr));
	
	if(this._today == null) this._today = new Date(this.nowDate.getFullYear(), this.nowDate.getMonth(), this.nowDate.getDate());
	
	attr = node.getAttribute("rebooking");
	if(attr) this._rebooking = attr == "true";
	
	this.template = this.createTemplate();

	var html = "<table unselectable=on width=100% height=100% border=0 cellpadding=0 cellspacing=0>\
					<tr id=topControls><td width=1%><button id=prevMonthButton class=arrows10>3</button></td>\
					<td width=32%>&nbsp;</td>\
					<td align=right width=100 nowrap id=monthTD></td>\
					<td width=5%>&nbsp;</td>\
					<td width=100 align=right><input type=text readonly=true maxlength=4 id=yearSelect></td>\
					<td><table border=0 cellpadding=0 cellspacing=0>\
					<tr><td unselectable=on><button unselectable=on id=yearUpButton class=arrows7>5</button></td></tr>\
					<tr><td><button unselectable=on id=yearDownButton class=arrows7>6</button></td></tr></table></td>\
					<td width=35%>&nbsp;</td>\
					</td><td width=1% align=right><button id=nextMonthButton class=arrows10>4</button></td></tr>\
					<tr><td colspan=8 height=100% id=contentTD></td></tr>\
					</table>";
	
	this.element.insertAdjacentHTML("beforeEnd", html);
	var all = this.element.all;

	var combobox = this._combobox = new CN_combobox();
	var options = [];
	for(var i = 0; i < 12; i++)
	{
		var option = {text: this.monthes[i]};
		options[options.length] = option;
	}

	var combo = combobox.createElement(options, all.monthTD)
	combo.id = "monthSelect";

	combobox.onchange = this._monthSelect_onchange;
	
	all.prevMonthButton.onclick = 
	all.prevMonthButton.ondblclick = this._prevMonthButton_onclick;

	all.nextMonthButton.onclick = 
	all.nextMonthButton.ondblclick = this._nextMonthButton_onclick;

	all.yearUpButton.onclick = 
	all.yearUpButton.ondblclick = this._yearUpButton_onclick;
	
	all.yearDownButton.onclick = 
	all.yearDownButton.ondblclick = this._yearDownButton_onclick;
	
	if(CNFormManager.vista) VistaSupport.attachToTextBox(all.yearSelect);	

	this.table = document.createElement("<table width=100% height=100% unselectable=on id=daysTable border=1 frame=void cellpadding=0 cellspacing=0>");
	this.header = this.table.insertRow();
	this.header.id = "header";

	for(var td = 0; td < 7; td++)
	{
		var cell = this.header.insertCell();
		cell.unselectable = true;
		var span = document.createElement("<span unselectable=on>");
		cell.appendChild(span);
		span.innerText = this.days[td];
	}
	
	for(var tr = 0; tr < 6; tr++)
	{
		var row = this.table.insertRow();
		row.unselectable = true;
		for(var td = 0; td < 7; td++)
		{
			var cell = row.insertCell();
			cell.unselectable = true;
			cell.innerText = " ";
		}
	}
	all.contentTD.appendChild(this.table);
	
	this._disabler = document.createElement('<div style="position: absolute; background: white; z-index: 1000; filter: alpha(opacity=50); width: 100%; height: 100%; top: 0px; left: 0px; visibility: hidden; ">');
	this.element.appendChild(this._disabler);	

	this._set_disabled();

	this.isReady = true;
}

proto.createTemplate = function()
{
	var contDiv = document.createElement("<div>");
	
	var dayButton = document.createElement("<button class=dayButton>");
	contDiv.appendChild(dayButton); // 0
	
	dayButton.attachEvent("onclick", this._dayButton_onclick);
	dayButton.attachEvent("ondblclick", this._dayButton_onclick);
	
	var bookedCheckbox = document.createElement("<span class=bookedCheckbox unselectable=on>");
	contDiv.appendChild(bookedCheckbox); // 1
	bookedCheckbox.innerHTML = "&#111";
	bookedCheckbox.attachEvent("onclick", this._bookedCheckbox_onclick);
	bookedCheckbox.attachEvent("ondblclick", this._bookedCheckbox_onclick);
	bookedCheckbox.attachEvent("onmouseenter", this._bookedCheckbox_onmouseenter);
	bookedCheckbox.attachEvent("onmouseleave", this._bookedCheckbox_onmouseleave);

	var gauge = document.createElement("<div class=gauge>");
	contDiv.appendChild(gauge); // 2
	
	var gaugeBar = document.createElement("<div class=gaugeBar>")
	gauge.appendChild(gaugeBar);
	
	if(this._rebooking)
	{
		var rebookedCheckbox = document.createElement("<span class=rebookedCheckbox unselectable=on>");
		contDiv.appendChild(rebookedCheckbox);	 // 3
		rebookedCheckbox.innerHTML = "&#111";
	}

	return contDiv;
}

proto.fillDays = function(month, year)
{
	var date = new Date(year, month, 1);

	// NOTE: set date before month or the month can be shifted.
	var dayCount = 1;

	var lastDayCell;
	for(var tr = 0; tr < 6; tr++)
	{
		var row = this.table.rows(tr + 1);
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
				cell.style.backgroundColor = "";
			}
			else 
			{
				this.renderDayCell(cell, date);

				lastDayCell = cell;
				dayCount++;
			}
		}
	}
}

proto.renderDayCell = function(cell, date)
{
	cell.innerText = " ";

	var div = this.template.cloneNode(true);

	var dateDay = date.getDate();
	div.children[0].innerText = dateDay;

	var todayValue = this._today.valueOf();
	var dateValue = date.valueOf();
	
	if(dateValue < todayValue) cell.className = "beforeTodayDay";
	else if(todayValue == dateValue) cell.className = "todayDay";
	else cell.className = "normalDay";
	
	if(this._selectedDate && dateValue.valueOf() == this._selectedDate.valueOf()) cell.className = "selectedDay";
	
	var percent = this.percentAr[dateDay - 1] * 1;
	var bar = div.children[2].children[0];
	if(percent < 1) bar.style.visibility = "hidden";
	else if(percent >= 100) bar.style.height = "150%";
	else bar.style.height = percent + "%";
	
	if(this.bookedDaysAr[dateDay])
	{ 
		div.children[1].innerHTML = "&#254";
		div.children[1].checked = true;
	}
	if(!this._rebooking) div.children[1].style.left = "27%";

	if(this._rebooking && this.rebookedDaysAr[dateDay])
	{
		 div.children[3].innerHTML = "&#254";
		 div.children[3].checked = true;
	}

	if(this.disabledDaysAr[date.getDay()] || this.noSessionDaysAr[dateDay])
	{
		var dayDisabled = document.createElement("<div class=dayDisabled>");
		div.children[0].replaceNode(dayDisabled);
		dayDisabled.innerText = dateDay;
		
		// Remove booking button.
		div.children[1].removeNode(true);
	}
	if(this.conflictDaysAr[dateDay]) div.children[0].className = "conflictDay";
	if(this.noSlotsDaysAr[dateDay]) div.children[0].className = "noSlotsDay";
	
	var dayObj = this._days[dateDay];
	if(dayObj && dayObj.color) {
		cell.style.backgroundColor = dayObj.color;
	} else {
		cell.style.backgroundColor = "";
	}
	
	cell.appendChild(div);
}

proto.findCell = function(l)
{
	return l.parentElement;
}

proto.parseDate = function(dateStr)
{
	var dateAr = String(dateStr).split("/");
	var date = null;
	if(dateAr.length == 3) date = new Date(dateAr[2], dateAr[1] * 1 - 1, dateAr[0]);
	return date;
}

proto.parseToHash = function(str)
{
	var ar = String(str).split(",");
	var result = [];
	for(var i = 0; i < ar.length; i++)
	{
		result[ar[i] * 1] = true;
	}
	return result;
}

proto.normalizePath = function(p)
{
	if(p.length > 0 && !p.match(/\\|\/$/)) p = p + "/";	
	return p;
}

proto.commitChange = function(value)
{
	var ev = {};
	ev.value = value;
	if(this.onpostback) this.onpostback(ev);
}


// Event handlers. ==============================
proto._bookedCheckbox_onclick = function()
{
	var l = event.srcElement;

	var jsObject = CNUtil.findJSObject(l);
	
	if(jsObject._disabled || jsObject._checksDisabled) return;
	l.checked = !l.checked;
	l.innerHTML = l.checked ? "&#254" : "&#111";

	jsObject.commitChange((l.checked ? 1000 : 2000) + parseInt(l.parentElement.children[0].innerText));
}

proto._bookedCheckbox_onmouseenter = function()
{
	var jso = Util.dispatchObject();
	if(jso._checksDisabled) return;

	var l = event.srcElement;
	l.runtimeStyle.color = l.currentStyle["xl--hover-color"];
}

proto._bookedCheckbox_onmouseleave = function()
{
	var jso = Util.dispatchObject();
	if(jso._checksDisabled) return;

	var l = event.srcElement;
	l.runtimeStyle.color = "";
}

proto._dayButton_onclick = function()
{
	var l = event.srcElement;
	var jsObject = CNUtil.findJSObject(l);
	
	if(jsObject._disabled) return;
	jsObject.commitChange(l.innerText);
}

proto._prevMonthButton_onclick = function()
{
	var jsObject = CNUtil.findJSObject(event.srcElement);
	
	if(jsObject._disabled) return;
	jsObject.commitChange(-1);
}

proto._nextMonthButton_onclick = function()
{
	var jsObject = CNUtil.findJSObject(event.srcElement);
	
	if(jsObject._disabled) return;
	jsObject.commitChange(-2);
}

proto._yearUpButton_onclick = function()
{
	var jsObject = CNUtil.findJSObject(event.srcElement);
	
	if(jsObject._disabled) return;
	jsObject.commitChange(-3);
}
	
proto._yearDownButton_onclick = function()
{
	var jsObject = CNUtil.findJSObject(event.srcElement);
	
	if(jsObject._disabled) return;
	jsObject.commitChange(-4);
}

proto._monthSelect_onchange = function()
{
	// Executed in combobox context.
	var jsObject = CNUtil.findJSObject(this.element.parentElement);

	if(jsObject._disabled || !jsObject.isReady) return;
	jsObject.commitChange(-(parseInt(this.get_selectedIndex()) + 10));
}


// Properties. ===============================
proto.set_disabled = function(value)
{
	value = eval(value);
	if(this._disabled == value) return;
	this._disabled = value;

	if(!this.isReady) return;
	this._set_disabled();
}

proto._set_disabled = function()
{
	this._disabler.style.visibility = this._disabled ? "inherit" : "hidden";
}
