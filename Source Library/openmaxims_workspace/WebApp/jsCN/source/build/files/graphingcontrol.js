/*
	v. 0.45
	+ ...
	+ anchor support.
	+ open in new window.
	v. 0.28
	+ <yaxis> highlight support.
	+ dynamic title/subtitle.
	+ x scaled and dynamic axis, dynamic legend and x labels.
	+ scrolling/maxVisiblePoints.
	+ pointID.
	+ 2 lines for x axis texts.
*/
function CN_graphingcontrol()
{
	this._rendered = false;
	this._postType = null;
	this._numberOfXLines = 1;

	// NOTE: temporary.
	this._sizeX = 3;
	
	this._contextMenu = null;
	this._cachedFormNode = null;
	this._cachedDataNode = null;
	this.isCloned = false;
	
	this._wrapDoc = document;
}
var proto = CN_graphingcontrol.prototype;

proto.createElement = function(node, parentElement)
{
	var l = this._wrapDoc.createElement("div");
	parentElement.appendChild(l);

	this.element = l;
	l.jsObject = this;
	
	l.className = "cn_graphingcontrol";
	
	this._buildElement(node);
	
	if(!this.isCloned) 
	{
		this._cachedFormNode = node;
		this.element.attachEvent("oncontextmenu", this._element_oncontextmenu);	
	}
	l.attachEvent("onresize", this._element_onresize);
	
	return l;
}

proto.unload = function()
{
	this._yaxisNodes = null;
	this._cachedFormNode = null;
	this._cachedDataNode = null;
	this._contextMenu.destroy();
	this._wrapDoc = null;
}

proto.storeData = function(xmldoc)
{
	if(this._postType == null) return;
	var node = null;
	
	node = xmldoc.createElement("graphingcontrol" + this._postType);

	if(this._postType == "dblclick")
	{
		node.setAttribute("x", this._relativeX);
		node.setAttribute("y", this._relativeY);
	}
	else if(this._postType == "pointclick")
	{
		if(this._id)
		{
			node.setAttribute("pointID", this._id);
		}
		else
		{
			node.setAttribute("x", this._imageX);
			node.setAttribute("y", this._imageY);
		}
	}

	this._postType = null;
	
	return node;
}

proto.loadData = function(node)
{
	if(!this.isCloned) this._cachedDataNode = node;

	this._loadLegend(node);

	this._loadXAxis(node);

	this._loadXAxisLabels(node);
	this._loadXAxisTicksLabels(node);

	var title = node.getAttribute("title");
	if(title !== null) 
	{
		var titleStr = String(title);
		if(titleStr.length > 0) 
		{
			this._headerDiv1.innerText = titleStr;
		}
	}
	
	var title2 = node.getAttribute("subTitle");
	if(title2 !== null) 
	{
		var title2Str = String(title2);
		if(title2Str.length > 0)
		{
			this._headerDiv2.innerText = title2Str;
		}
	}
	
	this._loadYAxises(node);

	this._loadGraphes(node);
	
	this._doLayout();
}

proto._buildElement = function(node)
{
	var t = this._wrapDoc.createElement("<table width=100% height=100% border=0 cellpadding=0 cellspacing=0>");
	this.element.appendChild(t);
	var tb = this._wrapDoc.createElement("tbody");
	t.appendChild(tb);
	
	var tr = tb.insertRow();
	this._createHeader(node, tr);
	
	tr = tb.insertRow();
	tr.height = "100%";

	var yaxisNodes = node.selectNodes("yaxis");
	this._yaxisNodes = yaxisNodes;
	
	this._createLeftAxis(yaxisNodes, tr);

	var contentTD = tr.insertCell();
	contentTD.width = "100%";
	contentTD.vAlign = "top";
	contentTD.align = "left";
	contentTD.style.paddingTop = 2;
	contentTD.style.position = "relative";
	contentTD.style.borderLeft = "1px solid black";
	contentTD.style.borderRight = "1px solid black";
	
	this._contentDiv = this._wrapDoc.createElement("<div class=graphingContentDiv style='height: 100%; overflow: hidden; position: relative; '>");
	contentTD.appendChild(this._contentDiv);
	this._contentTD = contentTD;

	this._createRightAxis(yaxisNodes, tr);
	
	tr = tb.insertRow();

	this._createBottomArea(node, tr);
	
	this._createContextMenu();
}

proto._createContextMenu = function()
{
	this._contextMenu = new PopupMenu(document.body);
	this._contextMenu.element.style.width = "180px";
	this._contextMenu.parentJSObject = this;

	this.cm_printItem = this._contextMenu.createItem("Print Preview");
	this.cm_printItem.onmenuclick = this._cm_printItem_onmenuclick;
}

proto._element_oncontextmenu = function()
{
	CNUtil.dispatchObject().element_oncontextmenu();
}
proto.element_oncontextmenu = function()
{
	this._contextMenu.show(event.clientX + document.body.scrollLeft, event.clientY + document.body.scrollTop);
	CNUtil.cancelEvent();
}

proto._cm_printItem_onmenuclick = function()
{
	CNUtil.findJSObject(event.srcElement).parentJSObject.cm_printItem_onmenuclick();
}
proto.cm_printItem_onmenuclick = function()
{
	var win = window.open();
	var doc = win.document;
	
	this._cachedFormNode.setAttribute("x", 0);
	this._cachedFormNode.setAttribute("y", 0);
	this._cachedFormNode.setAttribute("width", 850);
	this._cachedFormNode.setAttribute("height", 550);
	
	doc.write('<xml:namespace ns="urn:schemas-microsoft-com:vml" prefix="v"/>');
	doc.write('<body></body>')
	doc.close();
	
	var body = doc.body;
	body._outerControl = this;
	
	body._initClone = this._body_initClone;
	body._initClone();
}

proto._body_initClone = function()
{
	var control = new this._outerControl.constructor;
	control.isCloned = true;
	var doc = control._wrapDoc = this.document;
	
	var link = doc.createElement("<link rel=stylesheet>");
	doc.body.insertBefore(link, doc.body.firstChild);	
	link.href = cn_globalStyleLink.href;

	var containerDiv = doc.createElement("<div class='cn_graphingcontrol_printDiv'>");
	containerDiv.style.position = "relative";
	containerDiv.style.width = 850;
	containerDiv.style.height = 550;
	
	doc.body.appendChild(containerDiv);
		
	var div = doc.createElement("div");
	div.style.background = "white";
	div.style.fontSize = "14px";
	div.style.fontWeight = "bold";
	div.style.padding = "4px";
	containerDiv.appendChild(div);
	
	var attr = this._outerControl._cachedDataNode.getAttribute("printHeaderInfo");
	if(attr) div.innerText = String(attr);
	
	var div2 = div.cloneNode(true);

	var l = control.createElement(this._outerControl._cachedFormNode, containerDiv);
	CNUtil.setBounds(l, this._outerControl._cachedFormNode);
	control.onControlCreated();
	control.loadData(this._outerControl._cachedDataNode);
	control.element.style.top = 0;
	control.element.style.left = 0;
		
	doc.body.appendChild(div2);
	div2.style.width = containerDiv.offsetWidth;
	
	this._outerControl._buildPrintInfo(doc);

	this._outerControl._setPrintPreviewRefreshTO(doc);
}

proto._buildPrintInfo = function(doc)
{
	var body = doc.body;

	var pi = this._cachedDataNode.selectSingleNode("printInfo");
	if(!pi) return;
	
	var groupNodes = pi.selectNodes("group");
	for(var i = 0; i < groupNodes.length; i++)
	{
		var groupNode = groupNodes[i];
		var title = String(groupNode.getAttribute("title"));
		
		var table = doc.createElement("<table class=cn_graphingcontrol_printInfoTable>");
		table.style.width = 850;
		body.appendChild(table);
		
		var tr = table.insertRow();
		var td = tr.insertCell();
		td.innerText = title;
		td.className = "headerTD";
		
		var infoNodes = groupNode.selectNodes("info");
		for(var j = 0; j < infoNodes.length; j++)
		{
			var infoNode = infoNodes[j];
			var value = String(infoNode.getAttribute("value"));
			
			var tr = table.insertRow();
			var td = tr.insertCell();
			td.className = "rowTD";
			td.innerText = value;
		}
	}
}


proto._setPrintPreviewRefreshTO = function(doc)
{
	setTimeout(function(){ doc.body.children[0].style.width = "100%"; }, 500);
}

proto._createHeader = function(node, tr)
{
	var leftHeaderTD = tr.insertCell();
	leftHeaderTD.className = "leftHeaderTD";

	var headerTD = tr.insertCell();
	headerTD.colSpan = 3;
	headerTD.bgColor = "white";
	headerTD.align = "center";
	headerTD.className = "headerTD";
	
	var rightHeaderTD = tr.insertCell();
	rightHeaderTD.className = "rightHeaderTD";

	var div = this._wrapDoc.createElement("<div class=topDiv>");
	headerTD.appendChild(div);
	this._headerTD = headerTD;
	
	this._headerDiv1 = this._wrapDoc.createElement("<div class='headerDiv1'>");
	div.appendChild(this._headerDiv1);
	this._headerDiv1.innerText = "";
	
	this._headerDiv2 = this._wrapDoc.createElement("<div class='headerDiv2'>");
	div.appendChild(this._headerDiv2);
	this._headerDiv2.innerText = "";
	
	this._legendTable = this._wrapDoc.createElement("<table border=0 cellpadding=3 cellspacing=0 frame=void rules=cols class='legendTable'>");
	headerTD.appendChild(this._legendTable);
}

proto._createLeftAxis = function(yaxisNodes, tr)
{
	var leftAxisLabelTD = tr.insertCell();
	leftAxisLabelTD.noWrap = true;
	leftAxisLabelTD.width = 24;
	leftAxisLabelTD.style.paddingLeft = 4;
	leftAxisLabelTD.className = "leftAxisLabelTD";
	
	var leftAxisTD = tr.insertCell();
	leftAxisTD.noWrap = true;
	leftAxisTD.width = 50;
	leftAxisTD.className = "leftAxisTD";
	leftAxisTD.style.paddingTop = 2;
	leftAxisTD.vAlign = "top";
	
	leftAxisTD.align = "left";
	leftAxisTD.style.position = "relative";
	this._leftAxisTD = leftAxisTD;	
	
	if(yaxisNodes.length == 0) return;

	var yaxisNode = yaxisNodes[0];

	var leftCaptionDiv = this._wrapDoc.createElement("<div class='leftAxisDiv'>");
	leftAxisLabelTD.appendChild(leftCaptionDiv);
	leftCaptionDiv.innerText = String(yaxisNode.getAttribute("caption"));
	var attr = yaxisNode.getAttribute("width");
	if(attr) leftAxisTD.width = parseInt(attr);
}

proto._createRightAxis = function(yaxisNodes, tr)
{
	var rightAxisTD = tr.insertCell();
	rightAxisTD.noWrap = true;
	rightAxisTD.align = "left";
	rightAxisTD.vAlign = "top";
	rightAxisTD.style.position = "relative";
	rightAxisTD.style.paddingTop = 2;

	this._rightAxisTD = rightAxisTD;

	var rightAxisLabelTD = tr.insertCell();
	rightAxisLabelTD.noWrap = true;
	rightAxisLabelTD.align = "center";
	rightAxisLabelTD.style.paddingRight = 4;
	rightAxisLabelTD.className = "rightAxisLabelTD";
	
	if(yaxisNodes.length > 1)
	{
		rightAxisTD.width = 40;
		rightAxisLabelTD.width = 24;

		var yaxisNode = yaxisNodes[1];
	
		var rightCaptionDiv = this._wrapDoc.createElement("<div class='rightAxisDiv'>");
		rightAxisLabelTD.appendChild(rightCaptionDiv);
		rightCaptionDiv.innerText = String(yaxisNode.getAttribute("caption"));
	}
}

proto._createBottomArea = function(node, tr)
{
	var leftBottomLabelsTD = tr.insertCell();
	leftBottomLabelsTD.colSpan = 2;
	leftBottomLabelsTD.align = "right";
	leftBottomLabelsTD.style.paddingTop = 2;
	leftBottomLabelsTD.className = "leftBottomLabelsTD";
	leftBottomLabelsTD.vAlign = "top";
		
	this._xLabelsTable = this._wrapDoc.createElement("<table class=xLabelsTable cellpadding=0 cellspacing=0>");
	leftBottomLabelsTD.appendChild(this._xLabelsTable);
	
	var bottomAxisTD = tr.insertCell();
	bottomAxisTD.align = "left";
	bottomAxisTD.style.paddingTop = 0;
	bottomAxisTD.className = "bottomAxisTD";
	bottomAxisTD.vAlign = "top";
	this._bottomAxisTD = bottomAxisTD;
	
	this._xAxisDiv = this._wrapDoc.createElement("<div style='overflow: hidden; overflow-x: auto; '>");
	bottomAxisTD.appendChild(this._xAxisDiv);

	var innerDiv = this._wrapDoc.createElement("div");
	innerDiv.style.height = "100%";
	this._xAxisDiv.appendChild(innerDiv);

	// Add space for scrollbar.
	
	this._xAxisDiv.attachEvent("onscroll", this._xAxisDiv_onscroll);
	
	var rightBottomTD = tr.insertCell();
	rightBottomTD.colSpan = 2;
	rightBottomTD.className = "rightBottomTD";
	rightBottomTD.innerText = " ";
}

proto._doLayout = function(force)
{
	if(!this.element.offsetHeight) return;

	// Scroll bar?
	var height = this._numberOfXLines * 30;
	if(this._visibleXRange < this._sizeX) 
	{
		height += 16;
		this._xAxisDiv.style.overflowX = "auto";
	}
	else
	{
		this._xAxisDiv.style.overflowX = "hidden";
	}
	
	if(this.isCloned) this._bottomAxisTD.style.height = height + 20;
	else this._bottomAxisTD.style.height = height;
	this._xAxisDiv.style.height = height;
	
	// Content height?	
	this._axisTDHeight = this.element.offsetHeight - this._headerTD.offsetHeight - this._bottomAxisTD.offsetHeight;
	
	if(this._oldAxisTDHeight != this._axisTDHeight || force)
	{
		this._oldAxisTDHeight = this._axisTDHeight;
		this._leftAxisTD.style.height = this._axisTDHeight;
		this._rightAxisTD.style.height = this._axisTDHeight;
		this._contentTD.height = this._axisTDHeight;
	
		this._group.style.height = this._contentTD.clientHeight - 3;

		this._leftYAxisGroup.style.width = this._leftAxisTD.clientWidth + "px"; // #1193
		this._leftYAxisGroup.style.height = this._leftAxisTD.clientHeight - 3 + "px";
		if(this._rightYAxisGroup) this._rightYAxisGroup.style.height = this._leftAxisTD.clientHeight;
		
		this._yTickHeight = (this._group.clientHeight) / this._sizeY;
		this._yTickHeightRight = (this._group.clientHeight) / this._sizeYRight;

		this._relayoutYAxis(this._leftAxisTD, true);

		this._relayoutYAxis(this._rightAxisTD, false);
		
		this._relayoutPoints();
	}
}

proto._relayoutYAxis = function(axisTD, left)
{
	var divs = axisTD.children.tags("DIV");
	var yTickHeight = left ? this._yTickHeight : this._yTickHeightRight;

	for(var i = 0; i < divs.length; i++)
	{
		var div = divs[i];
		if(!div._isLabel) continue;
		
		div.style.top = div._realY * yTickHeight - div.offsetHeight / 3;
	}
}

proto._relayoutPoints = function()
{
	var imgs = this._contentDiv.children.tags("IMG");
	for(var i = 0; i < imgs.length; i++)
	{
		var img = imgs[i];
		if(!img._isGraph) continue;
		img.style.top = this._yTickHeight * img._realY - 8;
		img.style.left = this._xTickWidth * img._x - 6;
	}
}


// Build step. ==================================================

proto.onControlCreated = function()
{
	// NOTE: now we have layout and can assign absolute position to the stuff.
	this._contentWidth = this._contentDiv.clientWidth;

	this._buildGroup();

	this._renderYAxisesAndGrid();

	this._group.coordsize = this._sizeX + "," + this._sizeY;
	// Force group to have valid layout.
	var line = this._wrapDoc.createElement("v:line");
	line.strokeColor = "white";
	line.from = "0,0";
	line.style.zIndex = -1;
	line.to = (this._sizeX - 1) + "," + (this._sizeY - 1);
	this._group.appendChild(line);

	this._xAxisDiv.style.width = this._contentWidth;
	this._contentDiv.style.width = this._contentWidth;
	// Temporary.
	this._group.style.width = this._contentWidth;
	
	this._doLayout();
}

proto._buildGroup = function()
{
	var group  = this._wrapDoc.createElement("v:group");
	group.style.antialias = "false";

	group.unselectable = "on";
	group.style.background = "white";

	this._contentDiv.appendChild(group);
	this._group = group;
	
	if(!this.isCloned) group.attachEvent("ondblclick", this._group_ondblclick);
}

proto._renderYAxisesAndGrid = function()
{
	this._axisTDHeight = this._leftAxisTD.clientHeight;
	this._group.style.height = this._axisTDHeight;

	if(this._yaxisNodes.length > 0)
	{
		this._buildAxisAndGrid(this._yaxisNodes[0], this._leftAxisTD, true, true);
	}
	if(this._yaxisNodes.length > 1) 
	{
		this._buildAxisAndGrid(this._yaxisNodes[1], this._rightAxisTD, false, false);
	}
	//this._yaxisNodes = null;
}

proto._buildAxisAndGrid = function(node, axisTD, buildGrid, left)
{
	var from = parseFloat(node.getAttribute("from"));
	var to = parseFloat(node.getAttribute("to"));
	var incremental = parseFloat(node.getAttribute("incremental"));
	
	var attr = node.getAttribute("pointsInIncremental");
	var pointsInIncremental;
	if(attr) pointsInIncremental = parseInt(attr);
	else pointsInIncremental = 5;
	
	var absSize = Math.abs(to - from);

	var inc = incremental / pointsInIncremental;
	var numberOfYPoints = absSize / inc;
	
	var multiplier;
	
	var size = numberOfYPoints * 10;

	// scales xml y to group Y.
	var multiplier = size / absSize; // 1 / inc * 10

	var div = this._wrapDoc.createElement("<div style='overflow: hidden; height: 100%; '>");
	axisTD.appendChild(div);	
	
	var group = this._wrapDoc.createElement("v:group");
	div.appendChild(group);
	
	group.style.antialias = "false";
	group.style.height = this._axisTDHeight;
	group.style.width = axisTD.clientWidth;
	group.coordsize = "200," + size;

	if(left) this._leftYAxisGroup = group;
	else this._rightYAxisGroup = group;

	var inc = (to > from ? incremental : -incremental) / 5;
	var realFrom = to > from ? from : to;
	var sizePoint = (axisTD.clientHeight - 4) / size;
	var spanWidth = axisTD.clientWidth - 20;

	var axisData = {};
	//axisData.yTickHeight = sizePoint; 
	axisData.size = axisData.sizeY = size;
	axisData.realFrom = realFrom;
	axisData.multiplier = multiplier;
	axisData.to = to;
	axisData.pointsInIncremental = pointsInIncremental;
	axisData.incremental = incremental;
	axisData.inc = inc;

	var yTickHight = sizePoint;
	if(left) 
	{
		this._multiplier = multiplier;
		this._realFrom = realFrom;
		this._yTickHeight = sizePoint;
		this._sizeY = size;
		this._leftAxisData = axisData;
	}
	else this._rightAxisData = axisData;


	var y = realFrom;
	var i = 0;
	//var labelValue = realFrom;

	while(y <= to)
	{
		//if(i++ > 20) break;
		var realY = Math.round((size - (y - realFrom) * multiplier));
		var length = 2;
		if(i % pointsInIncremental == 0)
		{
			length = 4;

			if(buildGrid)
			{
				// Render grid line.
				var line = this._wrapDoc.createElement("v:line");
				this._group.appendChild(line);
				line.from = 0 + "," + realY;
				line.to = this._sizeX + "," + realY;
				line.style._realY = realY;
				line.style._isHorizontalTickLine = true;
				line.strokeweight = 1;
				line.style.zIndex = 1;
			}
			//labelValue += incremental;
			// Lower prescision.
			//labelValue = Math.round(labelValue * 10000) / 10000;
		}
	
		var line = this._wrapDoc.createElement("v:line");
		group.appendChild(line);
		
		if(left)
		{
			line.from = (190 - length * 10) + "," + realY;
			line.to = 190 + "," + realY;
		}
		else
		{
			line.from = 0 + "," + realY;
			line.to = (length * 10) + "," + realY;
		}
		
		y += inc;
		i++;
	}
}

proto._loadYAxises = function(node)
{
	var yaxisNodes = node.selectNodes("yaxis");
	if(yaxisNodes.length > 0)
	{
		this._loadYAxis(yaxisNodes[0], this._leftAxisTD, true);
	}
	if(yaxisNodes.length > 1) 
	{
		this._loadYAxis(yaxisNodes[1], this._rightAxisTD, false);
	}
}

proto._loadYAxis = function(node, axisTD, left)
{
	var realFrom, multiplier, size, to;
	var axisData = left ? this._leftAxisData : this._rightAxisData;
	var spanWidth = axisTD.clientWidth - 20;
	var yTickHeight = left ? this._yTickHeight : this._yTickHeightRight;

	var attr = node.getAttribute("showNumericValues");
	if(attr)
	{
		if(attr == "true")
		{
			if(!axisData.showNumericValues)
			{
				axisData.showNumericValues = true;
				var y = axisData.realFrom;
				var i = 0;
				var labelValue = axisData.realFrom;
			
				while(y <= axisData.to)
				{
					//if(i++ > 20) break;
					var realY = Math.round((axisData.size - (y - axisData.realFrom) * axisData.multiplier));
					var length = 2;
					if(i % axisData.pointsInIncremental == 0)
					{
						length = 4;
			
						var span = this._buildYLabel(left, axisTD, realY, labelValue, yTickHeight, spanWidth);
						span._isNumeric = true;
						labelValue += axisData.incremental;
						// Lower prescision.
						labelValue = Math.round(labelValue * 10000) / 10000;
					}
					y += axisData.inc;
					i++;
				}
			}
		}
		else if(axisData.showNumericValues)
		{
			var labels = axisTD.getElementsByTagName("div");
			for(var i = labels.length - 1; i >= 0; i--)
			{
				var l = labels[i];
				if(l._isLabel && l._isNumeric) l.removeNode(true);
			}
		}
	}
	
	if(left)
	{
		var hiNodes = node.selectNodes("highlight");
		if(hiNodes.length || node.selectSingleNode("nohighlights"))
		{
			var lines = this._group.getElementsByTagName("line");
			for(var i = lines.length - 1; i >= 0; i--)
			{
				var line = lines[i];
				if(line.style._isHighlight) line.removeNode(true);
			}
		}
		for(var i = 0; i < hiNodes.length; i++)
		{
			var hiNode = hiNodes[i];
			var y = parseFloat(hiNode.getAttribute("y"));
			var realY = Math.round((axisData.size - (y - axisData.realFrom) * axisData.multiplier));

			var line = this._wrapDoc.createElement("v:line");
			this._group.appendChild(line);
			line.from = 0 + "," + realY;
			line.to = this._sizeX + "," + realY;
			line.style._realY = realY;
			line.style._isHorizontalTickLine = true;
			line.style._isHighlight = true;

			var attr = hiNode.getAttribute("color");
			if(attr) line.strokecolor = String(attr);

			attr = hiNode.getAttribute("weight");
			if(attr) line.strokeweight = parseFloat(String(attr), 10);
			else line.strokeweight = 2.4;
			line.style.zIndex = 1;
		}
		
		var bandNodes = node.selectNodes("band");
		if(bandNodes.length || node.selectSingleNode("nobands"))
		{
			var bands = this._group.getElementsByTagName("rect");
			for(var i = bands.length - 1; i >= 0; i--)
			{
				var l = bands[i];
				if(l.style._isBand) l.removeNode(true);
			}
		}
		for(var i = 0; i < bandNodes.length; i++)
		{
			var bandNode = bandNodes[i];
			var fromY = parseFloat(bandNode.getAttribute("fromY"));
			var toY = parseFloat(bandNode.getAttribute("toY"))

			var fromRealY = Math.round((axisData.size - (fromY - axisData.realFrom) * axisData.multiplier));
			var toRealY = Math.round((axisData.size - (toY - axisData.realFrom) * axisData.multiplier));

			var rect = this._wrapDoc.createElement("v:rect");
			this._group.appendChild(rect);
			rect.style.position = "absolute";
			rect.style.top = Math.min(fromRealY, toRealY);
			rect.style.left = 0;
			rect.style.width = "100%";
			rect.style.height = Math.abs(fromRealY - toRealY);
			rect.style._isBand = true;

			rect.strokecolor = rect.fillcolor = String(bandNode.getAttribute("color"));
			rect.style.zIndex = 0;
		}
		
		var labelNodes = node.selectNodes("label");
		if(labelNodes.length || node.selectSingleNode("nolabels"))
		{
			var labels = axisTD.getElementsByTagName("div");
			for(var i = labels.length - 1; i >= 0; i--)
			{
				var l = labels[i];
				if(l._isLabel && l._isText) l.removeNode(true);
			}
		}
		for(var i = 0; i < labelNodes.length; i++)
		{
			var labelNode = labelNodes[i];
			var y = parseFloat(labelNode.getAttribute("y"));
			var realY = Math.round((axisData.size - (y - axisData.realFrom) * axisData.multiplier));

			var span = this._buildYLabel(left, axisTD, realY, String(labelNode.getAttribute("text")), 
								yTickHeight, spanWidth);
			span._isText = true;
		}
	}
}

proto._buildYLabel = function(left, axisTD, realY, labelValue, sizePoint, spanWidth)
{
	var span = this._wrapDoc.createElement("<div class=labelDiv>");
	axisTD.appendChild(span);
	span._isLabel = true;
	span.style.width = spanWidth;
	span.innerText = labelValue;
	span.style.position = "absolute";
	span.style.fontWeight = "bold";
	if(left) 
	{
		span.style.left = -5;
		span.style.textAlign = "right";
	}
	else 
	{
		span.style.left = 16;
	}
	span.style.top = sizePoint * realY - span.offsetHeight / 3;
	span._realY = realY;
	return span;
}


// Load step. =====================================================

proto._loadXAxis = function(node)
{
	var xaxisNode = node.selectSingleNode("xaxis");
	if(!xaxisNode) return;

	var xaxisLabelsNodes = node.selectNodes("xaxisLabels");
	if(xaxisLabelsNodes.length > 0) 
	{
		this._numberOfXLines = xaxisLabelsNodes.length;	
	
		var count = this._xLabelsTable.rows.length;
		for(var i = 0; i < count; i++) this._xLabelsTable.rows(0).removeNode(true);

		if(xaxisLabelsNodes[0].getAttribute("caption") != null)
		{
			for(var i = 0; i < this._numberOfXLines; i++)
			{
				var td = this._xLabelsTable.insertRow().insertCell();
				td.height = 28;
				td.innerText = "\n\n";
				if(i == 0) td.style.fontWeight = "bold";
				else if(i == this._numberOfXLines - 1) td.style.borderBottom = "none";
			}
		}
	}

	this._fromX = parseInt(xaxisNode.getAttribute("from"), 10);
	this._toX = parseInt(xaxisNode.getAttribute("to"), 10);

	var visibleXRangeAttr = xaxisNode.getAttribute("visibleRange");

	if(this._fromX != this._oldFromX
	|| this._toX != this._oldToX
	|| (visibleXRangeAttr && this._visibleXTicks != this._oldVisibleXTicks))
	{
		this._oldFromX = this._fromX;
		this._oldToX = this._toX;
		this._oldVisibleXRange = this._visibleXRange;
		this._sizeX = this._toX - this._fromX;
		
		if(visibleXRangeAttr) this._visibleXRange = parseInt(visibleXRangeAttr, 10);
		else this._visibleXRange = this._sizeX;

		this._doXLayout();
	}
}

proto._doXLayout = function()
{
	// NOTE: float.
	// +1 = number of periods are number of ticks + 1.
	this._xTickWidth = this._contentWidth / this._visibleXRange;
	this._fullContentWidth = Math.ceil(this._sizeX * this._xTickWidth);

	this._group.style.width = this._fullContentWidth;
	this._group.coordsize = this._sizeX + "," + this._sizeY;
	
	this._relayoutHorizontalTickLines();
	this._relayoutXLabels();
}

proto._relayoutHorizontalTickLines = function()
{
	var lines = this._group.children.tags("line");
	var count = lines.length;
	for(var i = 0; i < count; i++)
	{
		var line = lines[i];
		if(!line.style._isHorizontalTickLine) continue;
		line.to = this._sizeX + "," + line.style._realY;
	}
}

proto._relayoutXLabels = function()
{
	var innerDiv = this._xAxisDiv.children[0];

	var spans = innerDiv.children.tags("span");
	var count = spans.length;
	for(var i = 0; i < count; i++)
	{
		var span = spans[i];
		if(!span._isLabel) continue;
		
		span.style.left = Math.round(this._xTickWidth * span._x) - span.offsetWidth / 2;
	}
	
	innerDiv.style.width = this._fullContentWidth;		
}

proto._loadLegend = function(node)
{
	var legendNode = node.selectSingleNode("legend");
	if(legendNode) 
	{
		var legendItemNodes = legendNode.selectNodes("item");
	
		var count = this._legendTable.rows.length;
		for(var i = 0; i < count; i++) this._legendTable.rows(0).removeNode(true);
		
		var legendRow = this._legendTable.insertRow();
		legendRow.vAlign = "top";
		
		var itemWidth = Math.round(100 / legendItemNodes.length);

		for(var i = 0; i < legendItemNodes.length; i++)
		{
			var itemNode = legendItemNodes[i];

			var td = legendRow.insertCell();
			td.align = "center";
						
			var span = this._wrapDoc.createElement("<div class=legendItem>");
			td.appendChild(span);
			td.width = itemWidth + "%";
			
			var img = this._wrapDoc.createElement("img");
			span.appendChild(img);
			img.src = String(itemNode.getAttribute("img"));
			
			var textSpan = this._wrapDoc.createElement("span");
			span.appendChild(this._wrapDoc.createElement("br"))
			span.appendChild(textSpan);
			textSpan.innerText = String(itemNode.getAttribute("caption"));

		   	var attr = itemNode.getAttribute("tooltip");
			if(attr) 
			{
				if(!span.tipText) Tooltip.attach(span, String(attr));
				else span.tipText = String(attr);
			}
		}
	}		
	else this._headerTD.height = 40;
}

proto._loadXAxisLabels = function(node)
{
	this._xaxisLabelsNodes = node.selectNodes("xaxisLabels");
	
	if(this._xLabelsTable.rows.length > 0)
	{
		// Clean captions.
		for(var i = 0; i < this._xLabelsTable.rows.length; i++)
		{
			this._xLabelsTable.rows(i).cells(0).innerText = " ";
		}

		if(this._xaxisLabelsNodes.length > 0)
		{
			// Fill captions.
			for(var i = 0; i < this._xaxisLabelsNodes.length; i++)
			{
				var xaxisNode = this._xaxisLabelsNodes[i];
				var td = this._xLabelsTable.rows(i).cells(0);
				td.innerText = String(xaxisNode.getAttribute("caption"));
			}
		}
	}
}

proto._loadXAxisTicksLabels = function()
{
	if(this._xaxisLabelsNodes.length == 0) return;
	
	var innerDiv = this._xAxisDiv.children[0];
	innerDiv.style.width = this._fullContentWidth;	
	
	// Remove anything.
	var spans = innerDiv.children.tags("SPAN");
	var count = spans.length;
	for(var i = count - 1; i >= 0; i--)
	{
		var span = spans[i];
		if(!span._isLabel) continue;
		span.removeNode(true);
	}
	
	var lines = this._group.children.tags("line");
	var count = lines.length;
	for(var i = count - 1; i >= 0; i--)
	{
		var line = lines[i];
		if(!line.style._isXTick) continue;
		line.removeNode(true);
	}
	
	var height = Math.round(this._sizeY / this._contentTD.clientHeight * 10);
	var tickY2 = this._sizeY - height;

	for(var i = 0; i < this._xaxisLabelsNodes.length; i++)
	{
		var xaxisNode = this._xaxisLabelsNodes[i];
		var axisPointNodes = xaxisNode.selectNodes("label");
		var j;
		for(j = 0; j < axisPointNodes.length; j++)
		{
			var axisPointNode = axisPointNodes[j];

			var x = parseInt(axisPointNode.getAttribute("x"), 10) - this._fromX;
			
			// Create x tick.
			var line = this._wrapDoc.createElement("v:line");
			line.style._isXTick = true;
			line.from = x + "," + this._sizeY;
			line.to = x + "," + tickY2;
			this._group.appendChild(line);
			
			// Create label.
			var span = this._wrapDoc.createElement("span");
			innerDiv.appendChild(span);
			
			span.style.position = "absolute";
			span.innerText = String(axisPointNode.getAttribute("value"));
			span._isLabel = true;
			
			// NOTE: 29 = cell height, 16 = 1/2 cell height + top padding.
			span.style.top = i * 29 + 16 - span.offsetHeight / 2;
			span.style.left = Math.round(this._xTickWidth * x) - span.offsetWidth / 2;
			span._x = x;
		}
	}
}

proto._loadGraphes = function(node)
{
	var graphNodes = node.selectNodes("graph");
	if(graphNodes.length > 0)
	{
		// Got new date, remove old.
		this._cleanGraph();
	}
	
	for(var i = 0; i < graphNodes.length; i++)
	{
		var graphNode = graphNodes[i];
		this._renderGraph(graphNode);
	}
}

proto._cleanGraph = function()
{
	var children = this._group.children;
	var count = children.length;
	for(var i = count - 1; i >= 0; i--)
	{
		var child = children[i];
		if(child.tagName == "shape") child.removeNode(true);
	}

	var children = this._contentDiv.children;
	var count = children.length;
	for(var i = count - 1; i >= 0; i--)
	{
		var child = children[i];
		if(child.tagName == "IMG" && child._isGraph) child.removeNode(true);
	}
}

proto._renderGraph = function(node)
{
	var pointNodes = node.selectNodes("point");
	if(pointNodes.length == 0) return;
	
	var img = null;
	var attr = node.getAttribute("img")
	if(attr) img = String(attr);
	
	var pointNodesCount = pointNodes.length;

	var shape = this._wrapDoc.createElement("v:shape");
	shape.style.antialias = "true";
	shape.style.zIndex = 1;
	
	var attr = node.getAttribute("type");
	if(attr)
	{
		var stroke = this._wrapDoc.createElement("v:stroke");
		shape.appendChild(stroke);
		stroke.dashstyle = String(attr);
	}
	
	var path = "";

	for(var i = 0; i < pointNodesCount; i++)
	{
		var pointNode = pointNodes[i];

		var y = parseFloat(pointNode.getAttribute("y"), 10);
		var x = parseInt(pointNode.getAttribute("x"), 10) - this._fromX;
		var realY = Math.round(this._sizeY - (y - this._realFrom) * this._multiplier);
		var pointImg = img;
		var attr = pointNode.getAttribute("img");
		if(attr) pointImg = String(attr);
		
		var id = null;
		attr = pointNode.getAttribute("id");
		if(attr) id = String(attr);
		
		if(pointImg)
		{
			var image = this._wrapDoc.createElement("img");
			this._contentDiv.appendChild(image);
			image.style.position = "absolute";
			image._isGraph = true;

			image.style.top = this._yTickHeight * realY - 8;
			image.style.left = this._xTickWidth * x - 6;
			image.src = pointImg;
			
			image._realY = realY;
			image._y = y;
			image._x = x;
			image._id = id;
			
			if(!this.isCloned) 
			{
				var attr = pointNode.getAttribute("tooltip");
				if(attr) Tooltip.attach(image, String(attr));
			
				if(!this.isCloned) image.style.cursor = "hand";
				image.attachEvent("onclick", this._image_onclick);
			}
		}
		
		if(path.length > 0) path += " l";
		else path += "m";
		
		path += " " + x + "," + realY;

		/*var temp = this._wrapDoc.createElement("v:line");
		temp.from = "0,0";
		temp.to = x + "," + realY
		this._group.appendChild(temp);*/
	}
	
	path += " e";
	shape.path = path;
	shape.coordsize = this._group.coordsize;
	shape.style.position = "absolute";
	shape.style.top = "0px";
	shape.style.left = "0px";
	shape.style.width = "100%";//this._sizeX;
	shape.style.height = "100%"//this._sizeY;
	this._group.appendChild(shape);
	
	
	var fill = this._wrapDoc.createElement("v:fill");
	fill.on = false;
	shape.appendChild(fill);
	
	var attr = node.getAttribute("color");
	if(attr) shape.strokecolor = String(attr);

	var attr = node.getAttribute("weight");
	if(attr) shape.strokeweight = String(attr);
}


// Event handlers. =================================
proto._group_ondblclick = function()
{
	CNUtil.dispatchObject().group_ondblclick();
}
proto.group_ondblclick = function()
{
	if(this.element.disabled) return;
	var x = event.x + this._contentDiv.scrollLeft;
	var y = event.y;
	
	this._relativeX = Math.round(x / this._xTickWidth) + this._fromX; // TODO: scroll offset!

	var yStep = this._group.offsetHeight / this._sizeY;
	this._relativeY = Math.ceil((this._sizeY - y / this._yTickHeight) / this._multiplier + this._realFrom);
	
	this._postType = "dblclick";

	this.formManager.postData(this.element);
}

proto._image_onclick = function()
{
	CNUtil.dispatchObject().image_onclick();
}
proto.image_onclick = function()
{
	if(this.element.disabled) return;
	var image = event.srcElement;
	this._imageX = image._x;
	this._imageY = image._y;
	this._id = image._id;
	this._postType = "pointclick";
	
	this.formManager.postData(this.element);	
}

proto._xAxisDiv_onscroll = function(event)
{
	// NOTE: CNUtil.findJSObject is required here.
	CNUtil.findJSObject(event.srcElement).xAxisDiv_onscroll();
}
proto.xAxisDiv_onscroll = function()
{
	this._contentDiv.scrollLeft = this._xAxisDiv.scrollLeft;
}

proto._element_onresize = function()
{
	var jsObject = CNUtil.dispatchObject();
	if(jsObject.element.className != 'cn_graphingcontrol') return;
	jsObject.element_onresize();
}
proto.element_onresize = function()
{
	if(this._resizeTO) clearTimeout(this._resizeTO);
	var obj = this;
	this._resizeTO = setTimeout(function(){ obj.do_resize(); }, 0);
}
proto.do_resize = function()
{
	var leftAxisW = this._yaxisNodes.length > 0 ? 24 + 50 : 0;
	var rightAxisW = this._yaxisNodes.length == 2 ? 24 + 50 : 0;

	this._contentWidth = this.element.clientWidth - leftAxisW - rightAxisW - 1;
	
	this._contentDiv.style.width = this._contentTD.width = this._contentWidth;
	
	this._xAxisDiv.style.width = this._contentWidth;
	this._contentDiv.style.width = this._contentWidth;

	// Temporary.
	this._group.style.width = this._contentWidth;
	if(this._visibleXRange && this.element.offsetHeight) 
	{
		this._doXLayout();
		this._doLayout(true);
	}
}
