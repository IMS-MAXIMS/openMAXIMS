/*
	v. 0.32
	+ anchor support
	+ theme support.
	v. 0.22
	+ before/after icons.
*/
function CN_timeline()
{
	this._minTDWidth = 50;
	this._zoomStep = .20;
	this._disabled = false;
	this._wasClicked = false;
}
var proto = CN_timeline.prototype;

CN_timeline.monthes = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"];


// ICNControl implementation. ===============================
proto.createElement = function(node, parentElement)
{
	var l = Util.createElementFromHTML("<div class=cn_timeline>");
	parentElement.appendChild(l);

	this.element = l;
	l.jsObject = this;
	
	this._buildElement(node);
	
	Event.add(window, "resize", this, this._element_onresize);
	if(typeof ResizeObserver != "undefined") {
		this._resizeObserver = new ResizeObserver(this.element_onresize.bind(this));
		this._resizeObserver.observe(l);
	}

	return l;
}

proto.loadData = function(node)
{
	var lines = Util.xmlSelectNodes(node, "line");
	var count = lines.length;
	for(var i = 0; i < count; i++)
	{
		var line = lines[i];
		var dates = Util.xmlSelectNodes(line, "date");
		var dateCount = dates.length;
		for(var j = 0; j < dateCount; j++)
		{
			var dateNode = dates[j];
			var dateStr = String(dateNode.getAttribute("value"));
			var date = this._getDate(dateStr);
			var month = date.getMonth();
			var year = date.getFullYear();
			
			var offset = (year - this._fromDate.getFullYear()) * 12 + (month - this._fromDate.getMonth());
			var tr = this._lineTable.rows[i];
			var td = tr.cells[offset];
			if(!td)
			{
				alert("ASSERT: can't find line with date: " + date);
				return;
			}

			var icon = Util.createElementFromHTML("<img class=timelineIcon>");
			td.appendChild(icon);

			var src;
			if(date.getTime() > this._nowDate.getTime()) src = String(tr._iconAfter);
			else src = String(tr._iconBefore);
			
			icon.src = src;
			
			icon.style.left = ((100 / this._getDaysInMonth(date) * (date.getDate() - 1)) - 1) + "%";

			var attr = dateNode.getAttribute("tooltip");
			if(attr) Tooltip.attach(icon, String(attr));
			
			Event.add(icon, "click", this, this._icon_onclick);
			icon._date = dateStr;
		}
	}
}

proto.storeData = function(xmldoc)
{
	if(!this._wasClicked) return;
	this._wasClicked = false;
	var node = xmldoc.createElement("timeline");
	node.setAttribute("date", this._clickedDate);
	node.setAttribute("lineID", this._clickedLineID);
	return node;
}

proto.unload = function()
{
	this._legendDiv = null;
	this._tableDiv = null;
	if(this._resizeObserver) this._resizeObserver.disconnect();
	Event.del(window, "resize", this, this._element_onresize);
}

proto.validateLoading = function()
{
	this._tableDiv.style.height = this._legendDiv.style.height = this.element.clientHeight + "px";	
	this._tableDiv.style.width = (this.element.clientWidth - this._legendDiv.offsetWidth 
									- this._toolbarDiv.offsetWidth) + "px";
	this._toolbarDiv.style.left = (this.element.clientWidth - this._toolbarDiv.offsetWidth) + "px";
	this._toolbarDiv.style.height = this.element.clientHeight + "px";
	
	if(!this._nowDiv)
	{
		this._nowDiv = Util.createElementFromHTML("<div class=nowMarkDiv>");
		this._tableDiv.appendChild(this._nowDiv);
		
		//this._nowLabel = Util.createElementFromHTML("<div class=nowLabelDiv>");
		//this._tableDiv.appendChild(this._nowLabel);
		//this._nowLabel.textContent = "Now";
	}		
	this._updateNowDiv();
}

proto._updateNowDiv = function()
{
	if(!this._nowTD)
	{
		alert("ASSERT: can't find now cell for now mark.")
		return;
	}
	this._nowDiv.style.height = (this._lineCount * 20 + 6) + "px";
	var x = this._nowTD.offsetLeft + this._getDayX(this._nowTD, this._nowDate);
	this._nowDiv.style.left = x + "px";
	
	//this._nowLabel.style.top = (this._lineTable.rows.length - 2) * 20 + 9;
	//this._nowLabel.style.left = x;
}

proto._getDayX = function(td, date)
{
	var days = this._getDaysInMonth(date);
	return td.offsetWidth / days * (date.getDate() - 1);
}


// Control implementation. ================================
proto._buildElement = function(node)
{
	this._fromDate = this._getPartialDate(String(node.getAttribute("from")));
	this._toDate = this._getPartialDate(String(node.getAttribute("to")));	
	this._nowDate = this._getDate(String(node.getAttribute("now")));
	
	var lines = Util.xmlSelectNodes(node, "line");
	this._lineCount = lines.length;

	this._buildToolbar();
	this._buildLegend(node, lines);
	this._buildLines(node, lines);
	
	this._lineTable.width = this._getMinTableWidth();

	this.disabler = Util.createElementFromHTML('<div style="position: absolute; background: white; z-index: 1000; opacity: .5; width: 100%; height: 100%; visibility: hidden; top: 0px; left: 0px; ">');
	this.element.appendChild(this.disabler);
} 

proto._getPartialDate = function(str)
{
	var ar = str.split(/\.|\//);
	return new Date(parseInt(ar[1], 10), parseInt(ar[0], 10) - 1, 1);
}

proto._getDate = function(str)
{
	var ar = str.split(/\.|\//);
	return new Date(parseInt(ar[2], 10), parseInt(ar[1], 10) - 1, parseInt(ar[0]));
}

proto._buildLegend = function(node, lines)
{
	this._legendDiv = Util.createElementFromHTML("<div class=timelineLegendDiv>");
	this.element.appendChild(this._legendDiv);
	
	for(var i = 0; i < this._lineCount; i++)
	{
		var line = lines[i];
		var div = Util.createElementFromHTML("<div class=timelineCaptionDiv>");
		this._legendDiv.appendChild(div);
		div.style.left = "5px";
		div.style.top = (3 + i * 20) + "px";
		
		var img = Util.createElementFromHTML("<img align=absmiddle width=16 height=16>");
		div.appendChild(img);
		img.src = String(line.getAttribute("before"));
		img.style.marginRight = "4px";
		
		div.appendChild(document.createTextNode(line.getAttribute("caption")));
	}
}

proto._buildLines = function(node, lines)
{
	this._tableDiv = Util.createElementFromHTML("<div class=timelineTableDiv>");
	this.element.appendChild(this._tableDiv);

	this._lineTable = Util.createElementFromHTML("<table class=timelineTable frame=void rules=rows cellpadding=3 cellspacing=0 border=0 bordercolor=B3B6CE>");
	this._tableDiv.appendChild(this._lineTable);
	
	this._lineTable.width = 4000;
	
	var tbody = document.createElement("tbody");
	this._lineTable.appendChild(tbody);
	
	for(var i = 0; i < this._lineCount; i++)
	{
		var line = lines[i];
		
		var tr = Util.createElementFromHTML("<tr>");
		tbody.appendChild(tr);
		
		tr._isLineTR = true;
		tr._iconBefore = String(line.getAttribute("before"));
		tr._iconAfter = String(line.getAttribute("after"));
		tr._lineID = String(line.getAttribute("id"));
		
		var dt = new Date(this._fromDate);
		while(dt.getTime() <= this._toDate.getTime())
		{
			var td = Util.createElementFromHTML("<td nowrap>");
			tr.appendChild(td);
			
			td.textContent = " ";
			dt.setMonth(dt.getMonth() + 1);
		}
	}

	this._buildLowerLine(tbody);
}

proto._buildLowerLine = function(tbody)
{
	var tr = Util.createElementFromHTML("<tr class=lowerMonthes1 valign=top>");
	tbody.appendChild(tr);
	
	var dt = new Date(this._fromDate);
	while(dt.getTime() <= this._toDate.getTime())
	{
		var td = Util.createElementFromHTML("<td nowrap>");
		tr.appendChild(td);
		
		var div = Util.createElementFromHTML("<div class=lowerMonthesMark>");
		td.appendChild(div);

		td.style.background = dt.getMonth() % 2 ? "#eeeeee" : "white";
		td.align = "center"
		dt.setMonth(dt.getMonth() + 1);
	}

	var tr = Util.createElementFromHTML("<tr class=lowerMonthes2>");
	tbody.appendChild(tr);
	
	var dt = new Date(this._fromDate);
	while(dt.getTime() <= this._toDate.getTime())
	{
		var td = Util.createElementFromHTML("<td nowrap>");
		tr.appendChild(td);
		
		td.textContent = CN_timeline.monthes[dt.getMonth()];
		td.align = "center"

		if(dt.getMonth() == this._nowDate.getMonth() && dt.getFullYear() == this._nowDate.getFullYear())
		{
			this._nowTD = td;
			td._monthDate = new Date(dt);
		}

		dt.setMonth(dt.getMonth() + 1);
	}
}

proto._getDaysInMonth = function(date)
{
	var dt = new Date(date);
	
	dt.setDate(29);
	if(dt.getMonth() != date.getMonth()) return 28;
	
	dt.setDate(30);
	if(dt.getMonth() != date.getMonth()) return 29;

	dt.setDate(31);
	if(dt.getMonth() != date.getMonth()) return 30;
	
	return 31;
}

proto._buildToolbar = function()
{
	this._toolbarDiv = CNUtil.createToolbar(this.element);
	
	CNUtil.addButton(this._toolbarDiv, "zoomIn", null, "Zoom In", CNFormManager.neutralIconsPath + "zoom-plus.gif");
	CNUtil.addButton(this._toolbarDiv, "zoomOut", null, "Zoom Out", CNFormManager.neutralIconsPath + "zoom-minus.gif");
}

proto._getMinTableWidth = function()
{
	return this._lineTable.rows[0].cells.length * this._minTDWidth;
}

proto.zoomIn = function()
{
	var maxWidth = this._lineTable.rows[0].cells.length * (this._tableDiv.offsetWidth) * 1.05;
	var zoomWidth = Math.round(this._lineTable.offsetWidth * (1 + this._zoomStep));
	if(zoomWidth > maxWidth) zoomWidth = maxWidth;
	this._lineTable.width = zoomWidth;
	this._updateNowDiv();
}

proto.zoomOut = function()
{
	var minWidth = this._getMinTableWidth();
	var zoomWidth = Math.round(this._lineTable.offsetWidth * (1 - this._zoomStep));
	if(zoomWidth < minWidth) zoomWidth = minWidth;
	this._lineTable.width = zoomWidth;
	this._updateNowDiv();
}

// Event handlers. ================================
proto._icon_onclick = function()
{
	CNUtil.dispatchObject().icon_onclick();
}

proto.icon_onclick = function()
{
	var tr = CNUtil.findTag(Util.eventTarget(), "TR");
	this._clickedDate = Util.eventTarget()._date;
	this._clickedLineID = tr._lineID;
	this._wasClicked = true;
	this.formManager.postData(this.element);
}

proto.set_disabled = function(value)
{
	this._disabled = value;

	this._set_disabled();
}
proto._set_disabled = function()
{
	this.disabler.style.visibility = this._disabled ? "inherit" : "hidden";
}

proto._element_onresize = function()
{
	this.element_onresize();
}
proto.element_onresize = function()
{
	if(this.element.clientWidth == 0) return;
	this._tableDiv.style.height = this._legendDiv.style.height = this.element.clientHeight + "px";	
	this._tableDiv.style.width = (this.element.clientWidth - this._legendDiv.offsetWidth 
									- this._toolbarDiv.offsetWidth) + "px";
	this._toolbarDiv.style.left = (this.element.clientWidth - this._toolbarDiv.offsetWidth) + "px";
	this._toolbarDiv.style.height = this.element.clientHeight + "px";
	
	if(!this._nowDiv)
	{
		this._nowDiv = Util.createElementFromHTML("<div class=nowMarkDiv>");
		this._tableDiv.appendChild(this._nowDiv);
		
		//this._nowLabel = Util.createElementFromHTML("<div class=nowLabelDiv>");
		//this._tableDiv.appendChild(this._nowLabel);
		//this._nowLabel.textContent = "Now";
	}		
	this._updateNowDiv();
}
