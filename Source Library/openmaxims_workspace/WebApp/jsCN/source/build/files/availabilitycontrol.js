/*
	v. 0.36
	+ load/resize performance optimizations.
	- nonInteractive
	+ anchor support.
*/
function CN_availabilitycontrol()
{
	this._clicked = false;
	this._loadedOnce = false;
	this._periodsData = [];
}
var proto = CN_availabilitycontrol.prototype;

proto.createElement = function(node, parentElement)
{
	var l = this.element = document.createElement("<div class=cn_availabilitycontrol>");
	parentElement.appendChild(l);

	l.jsObject = this;

	this._buildElement();
	
	l.attachEvent("onresize", this._element_onresize);

	return l;
} 

proto._buildElement = function()
{
	var patternDiv = document.createElement("<div class=patternDiv>");
	this.element.appendChild(patternDiv);

	var table = document.createElement("<table cellspacing=0 frame=void border=1>");
	this.element.appendChild(table);
	
	table.borderColor = this.element.currentStyle["xl--grid-color"];
}

proto._buildGrid = function()
{
//	Util.benchmark(function() {

	var table = this.element.children[1];
	for(var i = 8; i < 20; i += .5)
	{
		var k = Math.floor(i);
		var k2 = k + 1;

		var s1 = (k < 10) ? "0" + k : k;
		var s2 = (k2 < 10) ? "0" + k2 : k2;

		var text;
		if(k == i) text = s1 + ".00-" + s1 + ".30";
		else text = s1 + ".30-" + s2 + ".00";
		
		var tr = table.insertRow();
		var td1 = tr.insertCell();
		td1.className = "firstColumnTD"
		
		var button = document.createElement("<button class=availbutton>");
		td1.appendChild(button);
		
		button.attachEvent("onclick", this._button_onclick);
		
		button.innerText = text;
	}
	
//	}, "CN_availabilitycontrol._buildGrid", this);
}

proto.storeData = function(xmldoc)
{
	if(!this._clicked) return;
	this._clicked = false;

	var node = xmldoc.createElement("availabilitycontrolclick");
	node.setAttribute("value", this._trIndex);
	return node;
}

proto._element_onresize = function()
{
	var jso = CNUtil.dispatchObject();
	if(jso)
	{
		//if(jso._element_onresizeTO) clearTimeout(jso._element_onresizeTO);
		//jso._element_onresizeTO = setTimeout(function(){ jso.element_onresize(); }, 300);
		jso.element_onresize();
	}
}
proto.element_onresize = function()
{
	if(!this._loadedOnce) return;
	this._resizeDataSet();
}


proto.loadData = function(node)
{
//	Util.benchmark(function() {	

	this._loadedOnce = true;
	this._cleanData();
	this._buildGrid();

	var patternDiv = this.element.children[0];

	var table = this.element.children[1];
	
	var dateNodes = node.selectNodes("date");
	var dateCount = dateNodes.length;

	if(dateCount == 0) 
	{
		this._processEmptyData();
		return;
	}
	else
	{
		var dateTooltips = new Array(dateCount);
		for(var i = 0; i < dateCount; i++)
		{
			var attr = dateNodes[i].getAttribute("tooltip");
			if(attr) dateTooltips[i] = String(attr);
			else dateTooltips[i] = null;
		}
		
		this._renderGrid(dateCount, dateTooltips);
	}
	
//	Util.benchmark(function() {	

	var left = 0;
	var htmlAr = [];
	var row0cells = table.rows[0].cells;
	for(var i = 0; i < dateCount; i++)
	{
		var dateNode = dateNodes[i];
		var pNodes = dateNode.selectNodes("p");
		var pCount = pNodes.length;

		var width = row0cells[1 + i].offsetWidth;
	
		var tooltip = null;

		for(var j = 0; j < pCount; j++)
		{
			var pNode = pNodes[j];
			htmlAr[htmlAr.length] = this._buildPeriod(pNode, table, patternDiv, left, width, i);
		}
		left += width;		
	}

	patternDiv.innerHTML = htmlAr.join("");
	//CNFormManager._trace("pCount: " + dateCount);

	this._setPatternSizes();
	
//	}, "CN_availabilitycontrol.loadData 2/2", this);
//	}, "CN_availabilitycontrol.loadData", this);
}

proto._resizeDataSet = function() {
	//Util.benchmark(function() {	
	
	this._setPatternSizes();
	
	var patternDiv = this.element.children[0];
	var childNodes = patternDiv.childNodes;
	var count = childNodes.length;

	if(!Util.assert(function(){ return count == this._periodsData.length; }, this)) return;

	var table = this.element.children[1];

	var left = 0;
	var dateIx = 0;
	var row0cells = table.rows[0].cells;
	for(var i = 0; i < count; i++) {
		var div = childNodes[i];
		var data = this._periodsData[i];

		var yBounds = this._calculatePeriodYBounds(table, data[0], data[1]);
		
		var width = row0cells[1 + dateIx].offsetWidth;

		if(data[2] != dateIx) left += width;

		dateIx = data[2];
		
		div.style.top = yBounds[0] + "px";
		div.style.height = yBounds[1] + "px";
		div.style.left = left + "px"
		div.style.width = width + "px";
	}

	//}, "CN_availabilitycontrol._resizeDataSet", this);
}

proto._processEmptyData = function()
{
	var patternDiv = this.element.children[0];
	var grayDiv = document.createElement("<div class='periodDiv_unavail'>");
	patternDiv.appendChild(grayDiv);
	grayDiv.style.width = "100%";
	grayDiv.style.height = "100%";
	this._renderGrid(1, []);
	this._setPatternSizes();
}

proto.validateLoading = function()
{
	if(this._loadedOnce) return;
	this._cleanData();
	this._buildGrid();
	this._processEmptyData();
}

proto._setPatternSizes = function()
{
	var patternDiv = this.element.children[0];
	var table = this.element.children[1];
	patternDiv.style.left = table.rows[0].cells[0].offsetWidth;
	patternDiv.style.top = 0;
	patternDiv.style.width = "100%";
	patternDiv.style.height = "100%";
}

proto._cleanData = function()
{
	this._periodsData = [];
		var patternDiv = this.element.children[0];
	var table = this.element.children[1];
	
	var children = patternDiv.children;
	var count = children.length;
	for(var i = count - 1; i >= 0; i--)
	{
		children[i].removeNode(true);
	}
	
	var rows = table.rows;
	var count = rows.length;
	for(var i = count - 1; i >= 0; i--)
	{
		table.deleteRow(0);
	}
}

proto._renderGrid = function(colNum, dateTooltips)
{
	var table = this.element.children[1];
	// Grid.
	for(var rowIx = 0; rowIx < table.rows.length; rowIx++)
	{
		var row = table.rows[rowIx];
		for(var tdIx = 0; tdIx < colNum; tdIx++)
		{
			var td = row.insertCell();
			td.className = "innerGridTD"
			td.innerText = " ";
			var tooltip = dateTooltips[tdIx];
			if(tooltip) Tooltip.attach(td, tooltip);
		}
	}
}

proto._buildPeriod = function(pNode, table, patternDiv, left, width, dateIx)
{
	var type = String(pNode.getAttribute("type"));
	var time = String(pNode.getAttribute("time"));
	
	var times = time.split("-");

	var fromPeriod = this._getPeriod(times[0]);
	var toPeriod = this._getPeriod(times[1]);

	var data = this._periodsData[this._periodsData.length] = [fromPeriod, toPeriod, dateIx]

	var yBounds = this._calculatePeriodYBounds(table, fromPeriod, toPeriod);

/*	var div = document.createElement("div");
	div.className = "periodDiv_" + type;
	div.style.position = "absolute";
	div.style.top = fromY + "px";
	div.style.height = toY - fromY + "px";
	div.style.left = left + "px";
	div.style.width = width + "px";
	patternDiv.appendChild(div);*/
	
	var html = "<div class='periodDiv_" + type + "' style='position: absolute; top: " 
		+ yBounds[0] + "px; left: " + left + "px; width: " + width + "px; height: " + yBounds[1] + "px; '></div>";
	return html;
}

proto._calculatePeriodYBounds = function(table, fromPeriod, toPeriod) {
	var fromRow = table.rows[fromPeriod[0]].cells[0]; // +1 == header row.
	var toRow = table.rows[toPeriod[0]].cells[0];

	var fromY = Math.round(fromRow.offsetTop + fromRow.offsetHeight * fromPeriod[1]);
	var toY = Math.round(toRow.offsetTop + toRow.offsetHeight * toPeriod[1]);
	
	return [fromY, toY - fromY] // y, h
}

proto._getPeriod = function(time)
{
	var parts = time.split(":");
	var h = parseInt(parts[0], 10) - 8;
	var m = parseInt(parts[1], 10);
	var complete = (h + m  / 60) * 2;
	var rounded = Math.floor(complete);
	var fraction = complete - rounded;
	if(rounded == 24 && fraction == 0)
	{
		rounded--;
		fraction = 1;
	}

	return [rounded, fraction]
}


// Event handlers. ===============================
proto._button_onclick = function()
{
	CNUtil.dispatchObject().button_onclick();
}
proto.button_onclick = function()
{
	if(this.element.disabled) return;
	var tr = CNUtil.findTag(event.srcElement, "TR");
	this._trIndex = tr.rowIndex;
	this._clicked = true;
	this.formManager.postData(this.element);
}