/*
	v. 1.1.1
*/
function CN_imsjourney()
{
	this._splitDragging = false;
	this._dragMargin = 150;
	this._w1 = -1;
	this._hasScrollBar = false;
	this._autoPostBack = false;
	this._selectedID = null; // Permanent, until modified.
	this._selectedTR = null; // Temp., per session.
	this._isDirty = false;
	this._clocksWidth = 56;
	this._clocksLines = [];
	this._clocksTooltip = null;
	this._clocksCount = 0;
}
var proto = CN_imsjourney.prototype;

proto.createElement = function(node, parentElement)
{
	var l = document.createElement("div");
	l.className = "cn_imsjourney";
	parentElement.appendChild(l);
	l.jsObject = this;
	this.element = l;
	
	this._headerDiv = document.createElement("div");
	this._headerDiv.className = "headerDiv";
	l.appendChild(this._headerDiv);

	var header1 = document.createElement("div");
	header1.className = "header1";
	this._headerDiv.appendChild(header1);
	
	var header2 = document.createElement("div");
	header2.className = "header2";
	this._headerDiv.appendChild(header2);
	
	var img = document.createElement("img");
	img.src = CNFormManager.neutralImagesPath + "journey-clocks-1.gif";
	img.className = "headerIconIMG";
	this._headerDiv.appendChild(img);
	
	this._scrollDiv = document.createElement("div");
	this._scrollDiv.className = "scrollDiv";
	l.appendChild(this._scrollDiv);
	
	this._table = document.createElement("table");
	this._table.className = "contentTable";
	this._table.cellPadding = 0;
	this._table.cellSpacing = 0;
	this._scrollDiv.appendChild(this._table);
	var tr = this._table.insertRow();
	tr.insertCell();
	tr.insertCell();
	tr.insertCell();

	Util.handleEvent(this._table, "onresize", "table_");

	this._dragDiv = document.createElement("div");
	this._dragDiv.className = "dragDiv";
	l.appendChild(this._dragDiv);
	
	this._dragDiv2 = document.createElement("div");
	this._dragDiv2.className = "dragDiv";
	l.appendChild(this._dragDiv2);

	Util.handleEvent(this._dragDiv, "onmousedown", "dragDiv_");
	Util.handleEvent(this._dragDiv2, "onmousedown", "dragDiv_");
	
	this._hover = VistaSupport.createHover('item-gradient-5.gif', 30);
	this._hover.strokecolor = "#D8F0FA";
	this._select = VistaSupport.createHover('item-gradient-5.gif', 30);
	this._scrollDiv.appendChild(this._hover);
	this._scrollDiv.appendChild(this._select);
	this._hover.style.zIndex = this._select.style.zIndex = -1;
	
	this._autoPostBack = node.getAttribute("autoPostBack") == "true";
		
	return l;
}

proto.unload = function()
{
	this._clocksLines = null;
}

proto.loadData = function(node)
{
	this._hover.style.visibility = "hidden";

	this._isDirty = false;

	var cols = node.selectNodes("cols/col");
	if(cols.length > 0) this._processCol(0, cols[0]);
	if(cols.length > 2) this._processCol(1, cols[2]);
	
	var attr = node.getAttribute("selectedID");
	if(attr != null) this._selectedID = String(attr);

	var scrollToRowAttr = node.getAttribute("scrollToRow");

	var trToSelect = null;
	this._pending_trToScrollTo = null;

	var rowsNode = node.selectSingleNode("rows");
	if(rowsNode)
	{
		this._clear();
		this._select.style.visibility = "hidden";
		this._rowsJustAdded = true;
		var rows = rowsNode.selectNodes("r");
		var count = rows.length;
		for(var i = 0; i < count; i++)
		{
			var tr = this._table.insertRow();
			var rNode = rows[i];
			var cNodes = rNode.selectNodes("c");
			
			var week = rNode.getAttribute("week");
			var attr = rNode.getAttribute("id");
			var marker = rNode.getAttribute("marker");
			if(marker)
			{
				attr = rNode.getAttribute("type");
				if(attr != "separator") continue;
				
				var td = tr.insertCell();
				td.colSpan = "3";
				td.className = "separatorTD";
				var div = document.createElement("div");
				div.className = "separatorDiv";
				td.appendChild(div);
				div.innerText = cNodes[0].getAttribute("text");
			}
			else
			{
				var id = String(attr);
				tr._id = id;

				if(id == this._selectedID) trToSelect = tr;
				if(id == scrollToRowAttr) this._pending_trToScrollTo = tr;

				var clocksTD;
				if(cNodes.length > 0)
				{
					var cNode = cNodes[0];
					var td = tr.insertCell();
					td.style.paddingLeft = 15;
					this._buildCell(cNode, td, id, week);
				}
				if(cNodes.length > 1) clocksTD = tr.insertCell();
				if(cNodes.length > 2)
				{
					var cNode = cNodes[2];
					var td = tr.insertCell();
					td.style.paddingLeft = 15;
					this._buildCell(cNode, td, id, week);
				}
				if(cNodes.length > 1) // Build clocks line at the end, as loaded base columns are required.
				{
					var cNode = cNodes[1];
					this._buildClockLine(cNode, clocksTD, id, week);
				}				
				
				/*for(var j = 0; j < 3 && j < cNodes.length; j++)
				{
					var cNode = cNodes[j];
					var td = tr.insertCell();

					if(j == 1) this._buildClockLine(cNode, td, id, week);
					if(j != 1) this._buildCell(cNode, td, id, week); // Skip processing for clocks td.

					if(j == 0) td.style.paddingLeft = 15;
				}*/
				
				if(rNode.getAttribute("selectable") != "false")
				{
					Util.handleEvent(tr, "onmouseenter", "tr_");
					Util.handleEvent(tr, "onmouseleave", "tr_");
					Util.handleEvent(tr, "onmousedown", "tr_");
				}
			}
		}
	}

	if(trToSelect)
	{
		this._select.style.visibility = "inherit";
		this._syncHover(trToSelect, this._select)
		this._selectedTR = trToSelect;
	}
	else
	{
		this._selectedID = null;
		this._selectedTR = null;
	}
	
	this._set_colWidths(this._w1);
}
proto.tr_onmouseenter = function()
{
	var tr = event.srcElement;
	this._syncHover(tr, this._hover);
	this._hover.style.visibility = "inherit";
}
proto.tr_onmouseleave = function()
{
	var tr = event.srcElement;
	this._hover.style.visibility = "hidden";
}
proto.tr_onmousedown = function()
{
	var tr = Util.findTag(event.srcElement, "TR");
	this._syncHover(tr, this._select);
	this._select.style.visibility = "inherit";
	
	this._selectedTR = tr;
	this._selectedID = tr._id;
	this._isDirty = true;
	if(this._autoPostBack) this.formManager.postData(this.element);
}

proto._syncHover = function(tr, hover)
{
	var xy = Util.findAbsolutePos(tr, this._scrollDiv);
	hover.style.left = xy.x + 1;
	hover.style.top = xy.y;
	hover.style.width = tr.offsetWidth - 3;
	hover.style.height = tr.offsetHeight - 1;
}

proto._processCol = function(ix, colNode)
{
	var header = this._headerDiv.childNodes[ix];
	var attr = colNode.getAttribute("title");
	if(attr != null) header.innerHTML = String(attr);
}
proto._clear = function()
{
	this._selectedTR = null;
	var count = this._table.rows.length;
	for(var i = count - 1; i >= 1; i--)
	{
		var row = this._table.rows(i);
		row.removeNode(true);
	}
	this._clocksCount = 0;
}

proto._buildClockLine = function(node, td, rowID, week)
{
	td.style.padding = 0;
	var buildLine = false;
	var buildStopper = false;
	var heightOffset = 0;
	var alt = this._clocksCount % 2 == 0;

	if(node.getAttribute("start") == "true")
	{
		td.style.position = "relative";
		var div = document.createElement("div");
		div.className = alt ? "clockLineDiv" : "clockLineDiv clockLineAltDiv";
		td.appendChild(div);

		this._lastClockLine = {div: div};
		this._clocksLines.push(this._lastClockLine);
		
		var div = document.createElement("div");
		div.className =  alt ? "clockStopperDiv" : "clockStopperDiv clockStopperAltDiv";
		td.appendChild(div);
		div.style.top = 0;

		var attr = node.getAttribute("tooltip");
		if(attr) this._clocksTooltip = String(attr);
	}

	if(this._clocksTooltip) Tooltip.attach(td, this._clocksTooltip);	
	
	if(node.getAttribute("stop") == "true")
	{
		this._clocksTooltip = null;
		
		if(this._lastClockLine)
		{
			this._lastClockLine.lastTD = td;
			//this._lastClockLine.style.height = td.offsetTop + td.offsetHeight - this._lastClockLine.parentNode.offsetTop;
			this._lastClockLine = null;
		}


		if(node.getAttribute("stopLine") == "true")
		{
			td.style.position = "relative";
			var div = document.createElement("div");
			div.className = alt ? "clockStopperDiv" : "clockStopperDiv clockStopperAltDiv";
			td.appendChild(div);
			div.style.top = td.offsetHeight - div.offsetHeight;
		}
		this._clocksCount++;
	}

	var attr = node.getAttribute("week");
	if(attr)
	{
		var idSpan = document.createElement("span");
		idSpan.className = "clocksWeekSpan";
		td.appendChild(idSpan);
	
		idSpan.innerText = "[" + attr + "]";
	}

/*	if(node.getAttribute("start") == "true")
	{
		buildLine = true;
		this._clocksStarted = true;
		
		var div = document.createElement("div");
		div.className =  this._clocksCount % 2 == 0 ? "clockStopperDiv" : "clockStopperDiv clockStopperAltDiv";
		td.appendChild(div);
		heightOffset = div.offsetHeight;
		
		var attr = node.getAttribute("tooltip");
		if(attr) this._clocksTooltip = String(attr);
	}
	
	if(this._clocksTooltip) Tooltip.attach(td, this._clocksTooltip);	

	if(node.getAttribute("stop") == "true")
	{
		buildLine = true;
		this._clocksStarted = false;
		this._clocksTooltip = null;
	}
	else if(this._clocksStarted)
	{
		buildLine = true;
		if(this._clocksTooltip) Tooltip.attach(td, this._clocksTooltip);
	}

	if(node.getAttribute("stopLine") == "true")
	{
		buildStopper = true;
	}

	if(buildLine == true)
	{
		var div = document.createElement("div");
		div.className = this._clocksCount % 2 == 0 ? "clockLineDiv" : "clockLineDiv clockLineAltDiv";
		td.appendChild(div);
		
		if(buildStopper)
		{
			var sdiv = document.createElement("div");
			sdiv.className = "clockStopperDiv";
			sdiv.className = this._clocksCount % 2 == 0 ? "clockStopperDiv" : "clockStopperDiv clockStopperAltDiv";
			td.appendChild(sdiv);
			heightOffset += sdiv.offsetHeight;
		}

		div.style.height = div.offsetHeight - heightOffset;
		
		if(!this._clocksStarted) this._clocksCount++;
	}

	attr = node.getAttribute("week");
	if(attr)
	{
		var idSpan = document.createElement("span");
		idSpan.className = "clocksWeekSpan";
		td.appendChild(idSpan);
	
		idSpan.innerText = "[" + attr + "]";
	}*/
}

proto._buildCell = function(node, td, rowID, week)
{
	var rowDiv = document.createElement("div");
	rowDiv.className = "rowDiv";
	td.appendChild(rowDiv);	

	var attr;
	attr = node.getAttribute("img");
	if(attr)
	{
		var img = document.createElement("img");
		img.className = "img";
		rowDiv.appendChild(img);
		img.src = String(attr);
	}
	else
	{
		// Build spacer.
		var span = document.createElement("span");
		span.className = "imgSpacerSpan";
		rowDiv.appendChild(span);
	}
	
	if(node.getAttribute("noWeek") != "true")
	{
		var idSpan = document.createElement("span");
		idSpan.className = "idSpan";
		rowDiv.appendChild(idSpan);
		
		var weekText;
		var attr = node.getAttribute("weekText");
		if(attr) weekText = String(attr);
		else if(week) weekText = week;

		if(weekText) idSpan.innerText = "[" + weekText + "]";
	}
	
	var textSpan = document.createElement("span");
	textSpan.className = "textSpan";
	rowDiv.appendChild(textSpan);
	attr = node.getAttribute("text");
	if(attr != null) 
	{
		textSpan.innerHTML = String(attr);
	}
	
	attr = node.getAttribute("tooltip");
	if(attr) Tooltip.attach(td, String(attr));
	
	attr = node.getAttribute("textColor");
	if(attr) rowDiv.style.color = String(attr);
	
	attr = node.getAttribute("backColor");
	if(attr) rowDiv.style.backgroundColor = String(attr);
}

proto.storeData = function(xmldoc)
{
	if(this._isDirty && this._selectedID && this._select.style.visibility == "inherit")
	{
		this._isDirty = false;
		var node = xmldoc.createElement("imsjourney");
		node.setAttribute("selection", this._selectedID);
		return node;
	}

	return null;
}

proto.layout = function()
{
	this._scrollDiv.style.height = this.element.clientHeight - this._headerDiv.offsetHeight;

	if(this._w1 == -1)
	{
		// First run.
		var w = Math.floor(this.element.clientWidth / 2) - this._clocksWidth;
		this._headerDiv.childNodes[0].style.width = w + this._clocksWidth + 5; // 5 == left padding of 2nd header.
		this._headerDiv.childNodes[1].style.width = w;
		this._headerDiv.childNodes[2].style.left = w + 21; // clocks img.
		this._dragDiv.style.left = w - 1;
		this._dragDiv2.style.left = w + this._clocksWidth;

		this._w1 = w;
	}

	this._set_colWidths(this._w1);

	if(this._pending_trToScrollTo) {
		this._pending_trToScrollTo.scrollIntoView();
		this._pending_trToScrollTo = null;
	}
}
proto.table_onresize = function()
{
	var actuallyHasSB = this._scrollDiv.offsetWidth - this._table.offsetWidth == CNFormManager.scrollBarSize;
	if(actuallyHasSB != this._hasScrollBar)
	{
		this._hasScrollBar = actuallyHasSB;
		this._set_colWidths(this._w1);
	}
}


proto.dragDiv_onmousedown = function()
{
	if(this._splitDragging) return;
	
	this._dragHandler1 = Util.handleEvent(this.element, "onlosecapture", "element_");
	this._dragHandler2 = Util.handleEvent(this.element, "onmouseup", "element_");
	this._dragHandler3 = Util.handleEvent(this.element, "onmousemove", "element_");

	this._draggingDiv = event.srcElement == this._dragDiv ? this._dragDiv : this._dragDiv2;
	
	this._startX = this._draggingDiv.offsetLeft - event.screenX;
	this.element.setCapture();
	this._splitDragging = true;
}
proto.element_onmousemove = function()
{
	var x = this._startX + event.screenX;
	if(x <= 4 || x >= this.element.clientWidth - 4) 
	{
		this.element.releaseCapture();
		return;
	}
	if(x < this._dragMargin) x = this._dragMargin;
	else if(x > this.element.clientWidth - this._dragMargin) x = this.element.clientWidth - this._dragMargin;

	this._draggingDiv.style.pixelLeft = x;
}
proto.element_onmouseup = function()
{
	this.element.releaseCapture();
}
proto.element_onlosecapture = function()
{
	this.element.detachEvent("onlosecapture", this._dragHandler1);
	this.element.detachEvent("onmouseup", this._dragHandler2);
	this.element.detachEvent("onmousemove", this._dragHandler3);
	this._dragHandler1 = this._dragHandler2 = this._dragHandler3 = null;
	this._splitDragging = false;
	
	var w1, w2;
	if(this._draggingDiv == this._dragDiv)
	{
		w1 = this._dragDiv.offsetLeft + 1;
		w2 = this.element.clientWidth - w1 - this._clocksWidth;
		this._dragDiv2.style.left = w1 + this._clocksWidth;
	}
	else
	{
		w1 = this._dragDiv2.offsetLeft + 1 - this._clocksWidth;
		w2 = this.element.clientWidth - w1;
		this._dragDiv.style.left = w1;
	}
	this._headerDiv.childNodes[0].style.width = w1 + this._clocksWidth + 4 + "px";
	this._headerDiv.childNodes[1].style.width = w2 + "px";
	this._headerDiv.childNodes[2].style.left = w1 + 21; // clocks img.	
	this._w1 = w1;
	this._set_colWidths(w1);

	this._draggingDiv = null;
}
proto._set_colWidths = function(w)
{
	var rows = this._table.rows;
	if(rows.length > 0 && w > 0)
	{
		var r = rows[0];
		var w2 = this._scrollDiv.clientWidth - w - 2 - this._clocksWidth;
		
		r.cells[0].width = Math.max(w, 1);
		r.cells[1].width = this._clocksWidth;
		r.cells[2].width = Math.max(w2, 1);
		
		if(this._select.style.visibility == "inherit" && this._selectedTR)
		{
			this._syncHover(this._selectedTR, this._select);
		}
	}
	
	for(var i = 0; i < this._clocksLines.length; i++)
	{
		var cl = this._clocksLines[i];
		cl.div.style.height = cl.lastTD.offsetTop + cl.lastTD.offsetHeight - cl.div.parentNode.offsetTop;
	}	
}


proto = null;

