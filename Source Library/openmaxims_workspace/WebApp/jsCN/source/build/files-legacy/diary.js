/*
	v. 1.0.6
	TODO: add "clean-table" flag optimization (don't rebuild clean table)
*/
function CN_diary()
{
	this._postbackButton = null;
	this._selectionDirty = this._isDirty = false;
	this._selectedEventID = -1;
	this._autoPostBack = true;
}

var proto = CN_diary.prototype;

proto.createElement = function(node, parentElement)
{
	var l = document.createElement("div");
	l.className = "cn_diary";
	parentElement.appendChild(l);
	l.jsObject = this;
	this.element = l;
	
	this._3mEventHeight = 17;
	
	this._days = ["Su", "M", "Tu", "W", "Th", "F", "Sa"];
	
	this._hover = VistaSupport.createHover('item-gradient-5.gif', 30);
	this._hover.strokecolor = ThemeNonCSSStyles.hoverRect_strokeColor2;
	this._select = VistaSupport.createHover('item-gradient-5.gif', 30);
	
	return l;
}

proto.loadData = function(node)
{
	var attr = node.getAttribute("autoPostBack");
	if(attr) this._autoPostBack = attr == "true";
	
	this._selectionDirty = this._isDirty = false;
	this._hover.style.visibility = "hidden";
	this._process3mData(node);
}

proto.storeData = function(xmldoc)
{
	if(!this._isDirty && !this._selectionDirty) return;

	var tag = xmldoc.createElement("diary");
	if(this._isDirty && this._postbackButton) tag.setAttribute("button", this._postbackButton);
	if(this._selectionDirty && this._selectedEventID) tag.setAttribute("selectedEventID", this._selectedEventID);

	this._selectionDirty = this._isDirty = false;
	return tag;
}

proto._process3mData = function(node)
{
	var justCreated = false;
	if(!this._table) 
	{
		this._create3mView();
		justCreated = true;
	}

	var attr = node.getAttribute("title");
	if(attr) this._textSpan.innerText = String(attr);

	var oldSelectedEventID = this._selectedEventID;
	var selectedEventIDAttr = node.getAttribute("selectedEventID");
	if(selectedEventIDAttr) this._selectedEventID = String(selectedEventIDAttr);

	var events = node.selectSingleNode("events");
	if(events)
	{
		if(!justCreated) this._clear3mView();
		this._load3mView(node, events);
	}
	else if(selectedEventIDAttr && oldSelectedEventID != this._selectedEventID)
	{
		if(this._selectedEventID == -1) 
		{
			this._select.style.visibility = "hidden";
			this._selectedEventDiv = null;
		}
		else this._selectCurrentEventID3mView()
	}
}

proto._selectCurrentEventID3mView = function()
{
	var divs = this._table.getElementsByTagName("div");
	var count = divs.length;
	for(var i = 0; i < count; i++)
	{
		var div = divs[i];
		if(div._id == this._selectedEventID && div.className.indexOf("eventDiv") != -1)
		{
			this._syncHover(div, this._select);
			this._selectedEventDiv = div;
			var xy = Util.findAbsolutePos(div, this._scrollArea);
			this._scrollArea.scrollTop = xy.y - 2;
			return;
		}
	}
}


proto._clear3mView = function()
{
	if(!this._table) return;
	this._selectedEventID = null;
	this._selectedEventDiv = null;

	if(this._hover.parentNode) this._hover.removeNode(true);
	if(this._select.parentNode) this._select.removeNode(true);	
	
	var rows = this._table.rows;
	var count = rows.length;
	for(var i = count - 1; i >= 0; i--)
	{
		rows[i].removeNode(true);
	}
	this._td2.innerText = "";
	this._td3.innerText = "";
	this._td4.innerText = "";
}

proto._create3mView = function()
{
	var header = document.createElement("div");
	header.className = "header";
	this.element.appendChild(header);
	
	var butBG = document.createElement("span");
	butBG.className = "butBG";
	header.appendChild(butBG);
	this._header = header;

	var b1, b2;
	if(CNFormManager.subTheme == "black") {
		b1 = VistaSupport.createImageSetButton("diary-nav-set.gif", 25, 25);
	} else {
		b1 = VistaSupport.createImageButton("lround-button-2.gif", 25, 25);
	}
	b1.className = "b1";	
	butBG.appendChild(b1);
	Tooltip.attach(b1, "Back One Month");
	Util.handleEvent(b1, "onclick", "b1_");
	Util.handleEvent(b1, "ondblclick", "b1_");

	if(CNFormManager.subTheme == "black") {
		b2 = VistaSupport.createImageSetButton("diary-nav-set.gif", 25, 25, 25);
	} else {
		b2 = VistaSupport.createImageButton("round-button-2.gif", 25, 25);
	}
	b2.className = "b2";	
	butBG.appendChild(b2);
	Tooltip.attach(b1, "Forward One Month");
	Util.handleEvent(b2, "onclick", "b2_");
	Util.handleEvent(b2, "ondblclick", "b2_");
	
	var textSpan = document.createElement("span");
	textSpan.className = "textSpan";
	header.appendChild(textSpan);
	textSpan.innerText = "";
	this._textSpan = textSpan;
	
	var dataHeader = document.createElement("table");
	dataHeader.className = "dataHeader3mView";
	header.appendChild(dataHeader);	
	
	var tr = dataHeader.insertRow();
	var td1 = tr.insertCell();
	td1.noWrap = "nowrap";
	td1.style.width = "50px";
	td1.innerText = "Day";
	td1.style.textAlign = "center";
	
	var td2 = tr.insertCell();
	td2.width = "32%";
	this._td2 = td2;
	
	var td3 = tr.insertCell();
	td3.width = "32%";
	this._td3 = td3;

	var td4 = tr.insertCell();
	td4.width = "32%";
	this._td4 = td4;

	var td5 = tr.insertCell();
	td5.width = CNFormManager.scrollBarSize;
	td5.innerText = " ";

	var scrollArea = document.createElement("div");
	scrollArea.className = "scrollArea3mView";
	this.element.appendChild(scrollArea);
	this._scrollArea = scrollArea;
	
	var table = document.createElement("table");
	table.className = "table3mView";
	scrollArea.appendChild(table);
	this._table = table;
	
	dataHeader.border = 0;
	table.border = 1;
	dataHeader.cellSpacing = table.cellSpacing = 0;
	dataHeader.frame = table.frame = "void";
	
	this._scrollArea.appendChild(this._hover);
	this._scrollArea.appendChild(this._select);	
}

proto._load3mView = function(node, eventsNode)
{
	var attr = node.getAttribute("from");
	if(!attr) return;
	
	var from = String(attr);
	var y = parseInt(from.substring(0, 4), 10);
	var m = parseInt(from.substring(4, 6), 10) - 1;
	var fromDate = new Date(y, m, 1);
	var workDate = new Date(y, m, 1);
	var workDate2 = new Date(y, m, 1);
	var workDate3 = new Date(y, m, 1);

	workDate2.setMonth(workDate.getMonth() + 1);
	workDate3.setMonth(workDate.getMonth() + 2);

	this._td2.innerText = CNPopupCalendar.months[fromDate.getMonth()] + " " + fromDate.getYear();
	this._td3.innerText = CNPopupCalendar.months[workDate2.getMonth()] + " " + workDate2.getYear();
	this._td4.innerText = CNPopupCalendar.months[workDate3.getMonth()] + " " + workDate3.getYear();
	
	var eventsInRow = 2;	
	var attr = node.getAttribute("eventsInRow");
	if(attr) eventsInRow = Math.max(1, parseInt(attr, 10));
	
	var rowHeight = this._3mEventHeight * eventsInRow; // Last event div has no bottom border.

	var rows = eventsNode.selectNodes("r");
	
	for(var i = 1; i <= 31; i++)
	{
		var r = null;
		var cs = null;
		if(rows.length >= i) 
		{
			r = rows[i - 1];
			cs = r.selectNodes("c");
		}

		var tr = this._table.insertRow();
		tr.style.height = rowHeight + "px";
		
		var td1 = tr.insertCell();
		td1.innerText = i;
		td1.style.width = "50px";
		td1.style.textAlign = "center";
		td1.noWrap = "nowrap";
		td1.className = "td1";
		
		var td2 = tr.insertCell();
		this._createCellContents(td2, cs, 0, workDate, i);

		var td3 = tr.insertCell();
		this._createCellContents(td3, cs, 1, workDate2, i);

		var td4 = tr.insertCell();
		this._createCellContents(td4, cs, 2, workDate3, i);
		
		if(i == 31)
		{
			// Remove bottom inner border.
			td1.style.borderBottom = td2.style.borderBottom 
				= td3.style.borderBottom = td4.style.borderBottom = "none";
		}
	}
}

proto._createCellContents = function(td, cs, ix, date, dayIx)
{
	td.width = "32%";
	var c = null;
	if(cs && cs.length > ix) c = cs[ix]

	var daySpan = document.createElement("span");
	daySpan.className = "daySpan";
	td.appendChild(daySpan);
	
	var div = document.createElement("div");
	div.className = "cellDiv";
	td.appendChild(div);

	var m = date.getMonth();
	date.setDate(dayIx);
	if(date.getMonth() == m)
	{
		daySpan.innerText = this._days[date.getDay()];
	
		if(c)
		{
			var events = c.selectNodes("e");
			var count = events.length;
			for(var i = 0; i < count; i++)
			{
				var ev = events[i];
				
				var div2 = document.createElement("div");
				div.appendChild(div2);
				div2.innerText = ev.text;
	
				if(i + 1 != count) div2.className = "eventDiv eventDivWithBorder";
				else div2.className = "eventDiv";
				
				var attr = ev.getAttribute("backColor");
				if(attr) div2.style.backgroundColor = String(attr);
				attr = ev.getAttribute("textColor");
				if(attr) div2.style.color = String(attr);
				attr = ev.getAttribute("img");
				if(attr) 
				{
					var img = document.createElement("img");
					div2.insertBefore(img, div2.firstChild);
					img.src = String(attr);
				}
				
				attr = ev.getAttribute("tooltip");
				if(attr) Tooltip.attach(div2, String(attr));
				
				attr = ev.getAttribute("id");
				if(attr) 
				{
					var id = div2._id = String(attr);
					if(this._selectedEventID == id)
					{
						this._selectedEventDiv = div2;
						this._select.style.visibility = "inherit";
						this._syncHover(div2, this._select)
					}
				}
				
				Util.handleEvent(div2, "onmouseenter", "div2_");
				Util.handleEvent(div2, "onmouseleave", "div2_");
				Util.handleEvent(div2, "onmousedown", "div2_");
			}
		}
	}
	else
	{
		td.className = "noDayTD";
	}
	
	if(c)
	{
		var day = date.getDay();
		var attr = c.getAttribute("dayOff");
		if(attr == "true"
		|| attr == null && (day == 0 || day == 6)) td.className = "dayOffTD";

		var attr = c.getAttribute("backColor");
		if(attr) td.style.backgroundColor = String(attr);
	}
}

proto.layout = function()
{
	var obj = this;
	setTimeout(function(){ obj._layout3mView(); }, 0);
}

proto._layout3mView = function()
{
	if(!this._scrollArea) return;
	this._scrollArea.style.height = Math.max(1, parseInt(this.element.style.height, 10)
										 - this._header.offsetHeight - 2);
	if(this._selectedEventDiv) this._syncHover(this._selectedEventDiv, this._select);
}

proto.b1_onclick = proto.b1_ondblclick = function()
{
	this._postbackButton = "back";
	this._isDirty = true;
	this.formManager.postData(this.element);
}

proto.b2_onclick = proto.b2_ondblclick = function()
{
	this._postbackButton = "forward";
	this._isDirty = true;	
	this.formManager.postData(this.element);
}

proto._syncHover = function(l, hover)
{
	hover.style.left = -2;
	hover.style.top = 0;
	l.style.position = "relative";
	hover.style.visibility = "inherit";
	
	l.appendChild(hover);

	hover.style.width = l.offsetWidth - 2;
	hover.style.height = l.offsetHeight - 1;
}


proto.div2_onmouseenter = function()
{
	var l = event.srcElement;
	this._syncHover(l, this._hover);
	this._hover.style.visibility = "inherit";
}
proto.div2_onmouseleave = function()
{
	var l = event.srcElement;
	this._hover.style.visibility = "hidden";
	if(this._selectedEventDiv != l) l.style.position = "static";
}
proto.div2_onmousedown = function()
{
	var l = Util.findTag(event.srcElement, "DIV");
	this._syncHover(l, this._select);
	this._select.style.visibility = "inherit";
	
	this._selectedEventDiv = l;
	this._selectedEventID = l._id;
	this._selectionDirty = true;
	if(this._autoPostBack) this.formManager.postData(this.element);
}
