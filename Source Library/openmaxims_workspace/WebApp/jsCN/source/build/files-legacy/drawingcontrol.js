/*
	v. 1.20
	+ ...
	+ dirty flag.
	+ improved print preview.
	+ new FreeDraw hover area selection algo.
	+ readOnly for shape.
	+ color/src swap on load.
	+ postbacks for everything.
	+ postback for shape delete.
	+ shape tooltip.
	+ tool/button caption.	
	v. 0.79
	+ allowMultiAreaDrawing.
	+ readOnly.
	+ toolIx => brushID.
	v. 0.72
	+ new area groups support.
	v. 0.68
	+ new data format.
	v. 0.5
	+ theme support.
	v. 0.42
	+ memory leak fixed in createButton.
*/
function CN_drawingcontrol()
{
	this.isReady = false;

	this.toolbarWidth = 124;
	this.pointerXOff = -4;
	this.pointerYOff = 8;

	this.imgEl = null;
	this.drawingArea = null;
	this.group = null;

	this.hasMarkerarea = false

	this.shapes = [];

	this.shapeGroups = [];
	this._shapeGroupNames = [];
	this.lastShapeGroupId = 0;

	this.currentColor = "red";
	this.currentWeight = "2px";
	this.currentLine = null;
	this.offX = null; 
	this.offY = null;

	this._readOnly = false;
	this._disabled = false;
	
	this.img = null;
	this.autoResize = true;
	this.areaOpacity = 0;

	this.groupButtons = [];
	this.currentTool = null;
	
	this._joinShapes = null;
	this._drawingMode = null;

	this.changedDocument = null;
	this.changedFragment = null;
	
	this._selectedItem = null;
	
	this._currentArea = null;
	this._allowMultiAreaDrawing = false;
	
	this._brushes = [];
	
	this._uniqueGroupIDs = [];
	
	this._contextMenu = null;
	this.toolbarDiv = null;
	
	this._isDirty = false;
	this._lastW = this._lastH = 0;
}
CN_drawingcontrol.BRUSH_IMAGE = 1;
CN_drawingcontrol.BRUSH_FREEDRAW = 2;


var proto = CN_drawingcontrol.prototype;

// Events. ====================================
proto.oninfo = function(ev)
{
	this._isDirty = true;
	var node = this.changedDocument.createElement("drawingcontrolnote");
	node.setAttribute("shape", ev.groupID);
	this.changedFragment.appendChild(node);
	this.formManager.postData(this.element);
}


// ICNControl. ====================================
proto.createElement = function(node, parentElement)
{
	var l = document.createElement("div");
	parentElement.appendChild(l);

	this.element = l;
	l.jsObject = this;
	
	l.className = "cn_drawingcontrol";

	this._createStatusBar();

	this.element_oncontentready(node);
	
	l.attachEvent("onresize", this._element_onresize);

	var attr = node.getAttribute("areaOpacity");
	if(attr) this.areaOpacity = parseInt(attr, 10);
	
	attr = node.getAttribute("allowMultiAreaDrawing");
	if(attr == "true") this._allowMultiAreaDrawing = true;

	this._createContextMenu();
	this.element.attachEvent("oncontextmenu", this._element_oncontextmenu);	
	
	return l;
}

proto.storeData = function(xmldoc)
{
	if(!this._isDirty) return null;
	this._isDirty = false;

	this._ensureChangedDocumentCreated();
	this._ensureToolsCreated();
	
	var data = this.changedFragment;
	this.changedFragment = this.changedDocument.createDocumentFragment();

	this.BrushTool.handle_toolunselected();
	this._unsetSelectedItem();	
	
	var count = 0;
	for(var i in this.shapeGroups)
	{
		var group = this.shapeGroups[i];
		if(!group) continue;
		
		var groupVML = "";
		var brushID = null;
		var isImg = null;

		for(var j = 0; j < group.length; j++)
		{
			var shape = group[j];
			if(shape.style._brushID !== undefined) brushID = shape.style._brushID;
			if(isImg === null) isImg = shape.tagName == "image";
			var shapeVML = this._filterVML(shape.outerHTML);
			groupVML += shapeVML;
		}

		var vmlNode = this.changedDocument.createElement("drawingcontrolvml");		
		vmlNode.setAttribute("shape", i);

		if(brushID !== null) vmlNode.setAttribute("brushID", String(brushID));
		else alert("ASSERT: no brushID for shape " + i)

		vmlNode.setAttribute("targetID", this._findGroupID(group));
		
		var cdata = this.changedDocument.createCDATASection(groupVML);
		vmlNode.appendChild(cdata);
		
		data.insertBefore(vmlNode, data.firstChild);		
	}

	return data;
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

proto._createContextMenu = function()
{
	this._contextMenu = new PopupMenu(document.body);
	this._contextMenu.element.style.width = "180px";
	this._contextMenu.parentJSObject = this;

	this.cm_printItem = this._contextMenu.createItem("Print Preview");
	this.cm_printItem.onmenuclick = this._cm_printItem_onmenuclick;
}

proto._cm_printItem_onmenuclick = function()
{
	CNUtil.findJSObject(event.srcElement).parentJSObject.cm_printItem_onmenuclick();
}
proto.cm_printItem_onmenuclick = function()
{
	var win = window.open();
	var doc = win.document;
	
	doc.write('<xml:namespace ns="urn:schemas-microsoft-com:vml" prefix="v"/>');
	doc.write('<body></body>')
	doc.close();
	
	var body = doc.body;
	body._outerControl = this;
	
	body._initClone = this._body_initClone;
	body._initClone();
}

// Executed in the new window body context.
proto._body_initClone = function()
{
	var control = new this._outerControl.constructor;
	control.isCloned = true;
	var doc = control._wrapDoc = this.document;
	
	var link = doc.createElement("<link rel=stylesheet>");
	doc.body.insertBefore(link, doc.body.firstChild);	
	link.href = cn_globalStyleLink.href;

	doc.body.style.background = "white";
	
	//var containerDiv = doc.createElement("<div class='cn_drawingcontrol_printDiv'>");
	//doc.body.appendChild(containerDiv);
	containerDiv = doc.body;
	
	var page1Div = doc.createElement("<div class='cn_drawingcontrol_printPageDiv'>");
	containerDiv.appendChild(page1Div);
	page1Div.style.pageBreakAfter = "always";
	
	var page2Div = doc.createElement("<div class='cn_drawingcontrol_printPageDiv'>");
	containerDiv.appendChild(page2Div);

	var top = 0;
	var canvasIX = 0;
	var printTitleAttr = this._outerControl._node.getAttribute("printTitle");
	if(printTitleAttr)
	{
		var titleDiv = doc.createElement("<div class='cn_drawingcontrol_titleDiv'>");
		page1Div.appendChild(titleDiv);	
		titleDiv.innerText = String(printTitleAttr);

		var titleDivP2 = titleDiv.cloneNode(true)
		titleDivP2.style.width = "100%";
		page2Div.appendChild(titleDivP2);	

		titleDivP2.style.top = 0;
		titleDivP2.style.left = 0;

		top += 28;
		canvasIX++;
	}

	var printSubTitleAttr = this._outerControl._node.getAttribute("printSubTitle");
	if(printSubTitleAttr)
	{
		var titleDiv2 = doc.createElement("<div class='cn_drawingcontrol_subTitleDiv'>");
		page1Div.appendChild(titleDiv2);	
		titleDiv2.innerText = String(printSubTitleAttr);

		var titleDiv2P2 = titleDiv2.cloneNode(true);
		titleDiv2P2.style.width = "100%";
		page2Div.appendChild(titleDiv2P2);	
		top += 28; 
		canvasIX++;
	}
	
	page2Div.style.paddingTop = top - 14;


	page1Div.insertAdjacentHTML("beforeend", doc.body._outerControl.drawingArea.outerHTML);
	page1Div.children[0].style.margin = "8px";
	page1Div.insertAdjacentHTML("beforeend", doc.body._outerControl.toolbarDiv.outerHTML);
	var toolbar;
	for(var i = 0; i < page1Div.children.length; i++)
	{
		if(page1Div.children[i].className == "canvasToolbar")
		{
			toolbar = page1Div.children[i];
			break;
		}
	}
	
	toolbar.style.left = "auto";	
	toolbar.style.right = "0px";	
	toolbar.style.width = "200px";	
	toolbar.style.height = "100%";
	toolbar.style.borderLeft = "1px solid #ddd";
	toolbar.style.padding = "8px";

	page1Div.children[canvasIX].style.top = top;
	this._outerControl._putPPNumbers(page1Div.children[canvasIX], page2Div);
	this._outerControl._setPrintPreviewRefreshTO(doc);
}

proto._putPPNumbers = function(clonedElement, toolbar)
{
	var doc = clonedElement.ownerDocument;
	var group = clonedElement.all.tags("group")[0];
	var imgs = group.children.tags("image");

	var groupData = [];
	var indexedData = [];
	for(var i = 0; i < imgs.length; i++) 
	{
		var l = imgs[i];
		if(l.tipText && l.groupID)
		{
			var div = this._getPPNumberDiv(l, groupData, indexedData);
			div.style.left = parseInt(l.currentStyle.left, 10) + Math.round((l.offsetWidth - div.offsetWidth) / 2);
			div.style.top = parseInt(l.currentStyle.top, 10)  + Math.round((l.offsetHeight - div.offsetHeight) / 2);
		}
	}
	
	var shapes = group.children.tags("shape");
	for(var i = 0; i < shapes.length; i++) 
	{
		var l = shapes[i];
		if(l.tipText && l.groupID)
		{
			var xy = this.extractXYs(String(l.path));
			var div = this._getPPNumberDiv(l, groupData, indexedData);
			div.style.padding = "1px";
			div.style.background = "black";
			div.style.left = xy[0][0] - div.offsetWidth;
			div.style.top = xy[0][1] - div.offsetHeight;
		}
	}
	
	toolbar.appendChild(doc.createElement("<div style='border-top: 1px solid #ddd; '>"));

	for(var i = 0; i < indexedData.length; i++)
	{
		var data = indexedData[i];
		var div = doc.createElement("<span style='width: 298px; margin: 1px; text-align: left; vertical-align: top; border: 1px solid #ddd; '>");
		toolbar.appendChild(div);

		var headerDiv = doc.createElement("<div style='padding: 5px; height: 30px; background: black; color: white; font-weight: bold; border-bottom: 1px solid #ddd; '>");
		div.appendChild(headerDiv);
		
		var brush = this._brushes[data.brushID];
		if(brush)
		{
			var iconSpan = doc.createElement("<span style='margin-right: 5px; '>");
			headerDiv.appendChild(iconSpan);
			if(brush.type == CN_drawingcontrol.BRUSH_IMAGE)
			{
				var img = doc.createElement("<img align='absmiddle'>");
				iconSpan.appendChild(img);
				img.src = brush.src;
			}
			else if(brush.type == CN_drawingcontrol.BRUSH_FREEDRAW)
			{
				iconSpan.style.overflow = "hidden";
				iconSpan.style.height = "5px";
				iconSpan.style.width = "16px";
				iconSpan.style.background = brush.color;
				iconSpan.style.verticalAlign = "middle";
			}
		}
		
		headerDiv.insertAdjacentText("beforeend", data.ix);
		var contentDiv = doc.createElement("<div style='padding: 5px; font-size: 12px; '>");
		div.appendChild(contentDiv);
		contentDiv.innerHTML = data.tipText;
	}
}

proto._getPPNumberDiv = function(l, groupData, indexedData)
{
	var doc = l.ownerDocument; 
	var group = l.parentElement;
	var data = groupData[l.groupID];
	if(!data) 
	{
		data = groupData[l.groupID] = {ix: 0, tipText: l.tipText};
		indexedData.push(data);
		data.ix = indexedData.length;
		data.brushID = l.style.brushID;
	}
	
	var div = doc.createElement("<div style='position: absolute; font-weight: bold; font-size: 9px; color: white; filter: dropShadow(color=black,offx=1,offy=1); '>");
	group.parentElement.appendChild(div);
	div.innerText = data.ix;
	div.style.zIndex = 10000;
	return div;
}


proto._setPrintPreviewRefreshTO = function(doc)
{
	setTimeout(function(){ doc.body.children[0].style.width = doc.body.children[0].offsetWidth; }, 1000);
}

proto._findGroupName = function(group)
{
	var node = this._findGroupNode(group);
	if(node) 
	{	
		var attr = node.getAttribute("name");
		return attr ? String(attr) : "";
	}
	return "";
}

proto._findGroupID = function(group)
{
	var node = this._findGroupNode(group);
	if(node) return String(node.getAttribute("id"));
	return "";
}

proto._findGroupNode = function(group)
{
	var commonParentNode = null;

	for(var j = 0; j < group.length; j++)
	{
		var shape = group[j];
		if(!shape.style._markerArea) 
		{
			// No area.
			continue;
		}

		var areas;
		if(shape.style._areas)
		{
			areas = shape.style._areas;
			areas.push(shape.style._markerArea);
		}
		else
		{
			areas = [shape.style._markerArea];
		}
		
		for(var k = 0; k < areas.length; k++)
		{
			var area = areas[k];
			var areaNode = area.style._node;		
			if(!commonParentNode) 
			{
				commonParentNode = areaNode;
			}
			else
			{
				while(commonParentNode && commonParentNode.parentNode != null 
				&& commonParentNode.parentNode.tagName != "drawingcontrol"
				&& commonParentNode != areaNode 
				&& !this._doesNodeContain(commonParentNode, areaNode))
				{
					commonParentNode = commonParentNode.parentNode;
				}
				if(!commonParentNode) 
				{
					alert("ASSERT: !commonParentNode j=" + j + " k=" + k);
					return null;
				}
			}
		}
	}
	return commonParentNode;
}

proto._doesNodeContain = function(node, subNode)
{
	while(subNode) 
	{
		subNode = subNode.parentNode;
		if(subNode == node) return true;
	}
	return false;
}

proto._filterVML = function(str)
{
	return str.replace(/(^\<\?xml\:namespace[^>]*\>)|((_isNew|_isNMD|_readOnly|true)\s*\:\s*(true|false)?\s*(\;)?\s*)|(\<v\:fill\>\<\/v\:fill\>)|(\<v\:stroke\>\<\/v\:stroke\>|(\s*DISPLAY\:\sblock\;\s*))|(\_?(markerArea|startArea)\:\s\[object\](\;)?\s*)|(_?strokeWeight\:\snull(\;)?\s*)|(_brushID\:\s[\-\w\d]+(\;)?\s*)|(_areas: [\w+,\[\]]+;)|((groupID|tipText)="[^"]+")\s?/g, "");
	// "
}

proto.unload = function()
{
	this._contextMenu.destroy();

	var shapes = this.group.children;
	var shapeCount = shapes.length;
	for(var i = 0; i < shapeCount; i++)
	{
		var shape = shapes[i];
		shape.style._markerArea = null;
		shape.style._startArea = null;
	}

	if(this.PointerTool) this.PointerTool.jsObject = null;
	this.PointerTool = null;	
	if(this.FreeDrawTool) this.FreeDrawTool.jsObject = null;
	this.FreeDrawTool = null;	
	if(this.BrushTool) this.BrushTool.jsObject = null;
	this.BrushTool = null;	

	this.imgEl = null;
	this.drawingArea = null;
	this.group = null;
	this.shapes = null;
	this.shapeGroups = null;
	this._shapeGroupNames = null;
	this.currentLine = null;
	this.img = null;
	this.groupButtons = null;
	this.currentTool = null;
	this._node = null;
	this._joinShapes = null;
	this._selectedItem = null;
}


proto.loadData = function(node)
{
	this.isReady = false;
	this._isDirty = false;
	
	this._node = node.cloneNode(true);

	var attr = this._node.getAttribute("img");
	if(attr)
	{
		this.imgEl.attachEvent("onreadystatechange", this._img_onload);
		this.img = String(attr);
		this.imgEl.src = this.img;
		this.imgEl.galleryImg = "false";
		this.imgEl.unselectable = "on";
		this.imgEl.style.zIndex = 1;
	}
	
	this._ensureToolsCreated();


	this._selectedItem = null;
	this._updateContextButtons();
	this._ensureChangedDocumentCreated();
}

proto._resetNMDButtons = function()
{
	if(!this.toolbarDiv) return;
	var all = this.toolbarDiv.children;
	var count = all.length;
	for(var i = 0; i < count; i++)
	{
		var item = all[i];
		if(item._disabled)
		{
			this.setButtonState(item, "normal");
			item._disabled = false;
		}
	}
}

proto._ensureToolsCreated = function()
{
	if(this.FreeDrawTool == null)
	{
		this.FreeDrawTool = this.cloneObject(this._FreeDrawTool);
		this.FreeDrawTool.jsObject = this;
	}
	if(this.BrushTool == null)
	{
		this.BrushTool = this.cloneObject(this._BrushTool);
		this.BrushTool.jsObject = this;
	}
}

proto._ensureChangedDocumentCreated = function()
{
	if(this.changedDocument == null)
	{
		this.changedDocument = new ActiveXObject("Microsoft.XMLDOM");
		this.changedFragment = this.changedDocument.createDocumentFragment();
	}
}

proto.element_oncontentready = function(node)
{
	this.element.unselectable = "on";
	this.element.style.cursor = "default";
	this.element.attachEvent("ondragstart", CNUtil.cancelEvent);
	this.element.attachEvent("onselectstart", CNUtil.cancelEvent);

	this.scrollDiv = document.createElement("div");
	this.element.appendChild(this.scrollDiv);
	this.scrollDiv.style.overflow = "auto";

	this.drawingArea = document.createElement("div");
	this.scrollDiv.appendChild(this.drawingArea);
	this.drawingArea.style.position = "relative";
	this.drawingArea.style.overflow = "hidden";

	this.imgEl = document.createElement("img");
	this.drawingArea.appendChild(this.imgEl);

	this.group = document.createElement("v:group");
	this.group.style.position = "absolute";
	this.group.style.left = 0;
	this.group.style.top = 0;
	this.drawingArea.appendChild(this.group);

	this.PointerTool = this.cloneObject(this._PointerTool);
	this.PointerTool.jsObject = this;

	this._createContextButtons();
	
	this.disabler = document.createElement('<div style="position: absolute; background: white; z-index: 1000; width: 1px; height: 1px; visibility: hidden; top: 0px; left: 0px; filter: progid:DXImageTransform.Microsoft.Alpha(opacity=50); ">');
	this.element.appendChild(this.disabler);

	this.drawingArea.attachEvent("onmousedown", this._drawingArea_onmousedown);
}

proto._setSizes = function()
{
	var w, h;
	if(this.autoResize)
	{
		w = this.imgEl.offsetWidth;
		h = this.imgEl.offsetHeight;
	}
	else
	{
		w = this.element.offsetWidth;
		h = this.element.offsetHeight;
	}
	this.drawingArea.style.width = w;
	this.drawingArea.style.height = h;
	this.group.style.width = w;
	this.group.style.height = h;
	this._lastW = w;
	this._lastH = h;
	
	this.group.coordsize = w + ", " + h;
}

proto.postInit = function()
{
	this.imgEl.detachEvent("onreadystatechange", this._img_onload);

	this._setSizes();

	this.group.style.zIndex = 20;

	this.createToolbar();
	
	this._toViewMode();

	this.loadMarkerarea();
	this.setLoadVMLTO();

	var attr = this._node.getAttribute("readOnly");
	if(attr) this._readOnly = attr == "true";

	this._set_readOnly();

	this.isReady = true;

	this._set_disabled();
}

proto.setLoadVMLTO = function()
{
	var jsObject = this;
	setTimeout(function(){ jsObject.loadVML(); }, 0);	
}

proto.loadMarkerarea = function()
{
	this._uniqueGroupIDs = [];
	var node = this._node;
	var groupNode = node.selectSingleNode("group");
	if(groupNode)
	{
		if(this.shapes.length > 0)
		{
			for(var i = 0; i < this.shapes.length; i++)
			{
				this.shapes[i].removeNode(true);
			}
		}
		this.shapes = [];

		this.hasMarkerarea = true;
		this._loadGroup(groupNode);
	}
}

proto._loadGroup = function(groupNode)
{
	var children = groupNode.selectNodes("*");
	for(var i = 0; i < children.length; i++)
	{
		var child = children[i];
		
		this._checkUniqueGroupArea(child);
		
		if(child.tagName == "group")
		{
			this._loadGroup(child);
		}
		else if(child.tagName == "area")
		{
			var shape = this.createShape();
			var path = String(child.getAttribute("path"));
			shape.className = "markerArea";
			shape.path = path;
			shape.style._isMarkerArea = true;
			shape.style.filter = "alpha(opacity=" + this.areaOpacity + ")";
			var attr = child.getAttribute("name");
			shape._shapeName = attr ? String(attr) : "";
			shape.style._node = child;

			shape.attachEvent("onmouseenter", this._shape_onmouseenter);
			shape.attachEvent("onmouseleave", this._shape_onmouseleave);
			shape.style._xys = this.extractXYs(path, true);

			this.shapes.push(shape);
		}
	}
}

proto._checkUniqueGroupArea = function(node)
{
	var id = node.getAttribute("id");
	if(id)
	{
		var sid = String(id);
		if(this._uniqueGroupIDs[sid]) alert("ASSERT: got non-unique ID: " + sid + " for the " + node.tagName + "!");
		else this._uniqueGroupIDs[sid] = true;
	}
}

proto.createShape = function()
{
	var shape = document.createElement("v:shape");
	shape.style.position = "absolute";
	shape.style.left = 0;
	shape.style.top = 0;
	shape.style.width = this.element.offsetWidth;
	shape.style.height = this.element.offsetHeight;
	shape.coordsize = this.element.offsetWidth + ", " + this.element.offsetHeight;
	shape.stroke = "false";
	var fill = document.createElement("v:fill");
	fill.on = "true";
	fill.color = "#9DBBE1";
	shape.appendChild(fill);
	var stroke = document.createElement("v:stroke");
	stroke.on = "false";
	shape.appendChild(stroke);

	this.drawingArea.appendChild(shape);
	return shape;
}

proto._resetVML = function()
{
	this.shapeGroups = [];
	this._shapeGroupNames = [];
	this.lastShapeGroupId = 0;
}

proto._cleanVML = function()
{
	var children = this.group.children;
	var count = children.length;
	for(var i = 0; i < count; i++)
	{
		var child = children[i];
		if(child.tipText) Tooltip.detach(child);
	}
	this.group.innerHTML = "";
}

proto.loadVML = function()
{
	var noShapesNode = this._node.selectSingleNode("noshapes");
	if(noShapesNode)
	{
		this._resetVML();
		this._cleanVML();
		return;
	}

	var vmlNodes = this._node.selectNodes("shape");
	if(vmlNodes && vmlNodes.length > 0)
	{
		this._resetVML();
		this._cleanVML();

		var lastElementIx = 0;
		var count = vmlNodes.length;
		var error = false;
		for(var i = 0; i < count; i++)
		{
			var vmlNode = vmlNodes[i];
			
			var id = parseInt(vmlNode.getAttribute("id"), 10);
			if(id >= this.lastShapeGroupId) this.lastShapeGroupId = id + 1;

			var vml = String(vmlNode.text);
			if(vml.length == 4 && vml == "null") 
			{
				alert("Drawingcontrol: Error in <shape id=" + id + "> tag - null in CData")
				error = true;
				continue;
			}

			var attr = vmlNode.getAttribute("brushID");
			// Skip shape.
			if(!attr) continue;
			
			var brushID = String(attr);

			var brush = this._brushes[brushID];
			// Skip again.
			if(!brush) continue;
			
			var isNMD = false;
			if(!brush.multiDraw)
			{
				isNMD = true;
				// Disable NMD brush button
				var nmdButton = this._findButton("cmdChangeBrush", {brushID: brushID});
				if(nmdButton)
				{
					this.setButtonState(nmdButton, "disabled");
					nmdButton._disabled = true;
				}
			}
			
			var readOnly = vmlNode.getAttribute("readOnly") == "true";

			var newSrc = null;
			var newColor = null;
			
			if(brush.type == CN_drawingcontrol.BRUSH_IMAGE) newSrc = brush.src;
			else if(brush.type == CN_drawingcontrol.BRUSH_FREEDRAW) newColor = brush.color;
			
			var tooltipAttr = vmlNode.getAttribute("tooltip");
			
			this.group.insertAdjacentHTML("beforeEnd", vml);
			
			var children = this.group.children;
			var childCount = children.length;
						
			var groupID = String(id);
			var group = [];
			
			for(var j = lastElementIx; j < childCount; j++)
			{
				var child = children[j];
				
				if(tooltipAttr) Tooltip.attach(child, String(tooltipAttr));
				
				child.style._readOnly = readOnly;
				
				if(isNMD) child.style._isNMD = true;
				
				group.push(child);
				child.groupID = groupID;
				if(brushID !== null) child.style._brushID = brushID;
				this._attachItemEvents(child);
				
				var xys;
				if(child.tagName == "image")
				{
					xys = [{x: parseInt(child.style.left, 10) + parseInt(child.style.width, 10) / 2,
							y: parseInt(child.style.top, 10) + parseInt(child.style.height, 10) / 2}];
					child.src = newSrc;
				}
				else if(child.tagName == "shape")
				{
					var lineXYs = this.extractXYs(String(child.path));
					xys = [{x: lineXYs[0][0], y: lineXYs[0][1]}];
					if(lineXYs.length > 1) 
					{
						var lastIX = lineXYs.length - 1;
						xys.push({x: lineXYs[lastIX][0], y: lineXYs[lastIX][1]});
					}
					
					child.strokecolor = newColor;
				}
				
				outerLoop:
				for(var k = 0; k < this.shapes.length; k++)
				{
					var shape = this.shapes[k];
					
					for(var xysIX = 0; xysIX < xys.length; xysIX++)
					{
						var pip = this.pointInPolygon(xys[xysIX], shape.style._xys);
						if(pip != CONST_OUTSIDE)
						{
							child.style._markerArea = shape;
							break outerLoop;
						}
					}
				}
			}
			this.shapeGroups[groupID] = group;
			var name = this._findGroupName(group);
			this._shapeGroupNames[groupID] = name;
			lastElementIx = childCount;
		}
		
		if(error) this.set_disabled(true);
	}
}

proto._attachItemEvents = function(l)
{
	l.attachEvent("onmouseenter", this._freeDrawShape_onmouseenter);
	l.attachEvent("onmouseout", this._freeDrawShape_onmouseout);
	l.attachEvent("onmousedown", this._freeDrawShape_onmousedown);
}


proto._createContextButtons = function()
{
	var div = document.createElement("<div class=contextButtonsDiv>");
	this.element.appendChild(div);
	this._createContextButton(div, "cmdEditItem", "Edit", CNFormManager.neutralIconsPath + "edit-blue.gif");
	this._createContextButton(div, "cmdNoteItem", "Note", CNFormManager.neutralIconsPath + "note-3.gif");
	this._createContextButton(div, "cmdRemoveItem", "Remove", CNFormManager.neutralIconsPath + "delete-blue.gif");
	this._viewModeButtonsDiv = div;
	
	var div = document.createElement("<div class=contextButtonsDiv>");
	this.element.appendChild(div);
	this._createContextButton(div, "cmdFinishItem", "Finish", CNFormManager.neutralIconsPath + "ok-blue.gif");
	this._createContextButton(div, "cmdNoteItem", "Note", CNFormManager.neutralIconsPath + "note-3.gif");
	this._createContextButton(div, "cmdCancelItem", "Remove", CNFormManager.neutralIconsPath + "delete-blue.gif");
	this._drawingModeButtonsDiv = div;
}

proto.cmdEditItem = function()
{
	var item = this._selectedItem;
	if(item instanceof Array) item = item[0];

	this._currentArea = item.style._markerArea;
	var skipJoin = false;
		
	if(item.tagName == "shape") 	
	{
		var param = {value: item.strokeColor, brushID: item.style._brushID};
		var b = this._findButton("cmdChangeFreeDraw", param);
		if(b) 
		{
			this._pushButton(b);
			this.cmdChangeFreeDraw(b.param);
		}
		else
		{
			this.cmdChangeFreeDraw(param);
		}
	}
	else
	{
		var param = {value: item.src, brushID: item.style._brushID};
		var b = this._findButton("cmdChangeBrush", param);
		if(b)
		{
			this._pushButton(b);
			this.cmdChangeBrush(b.param, item.style.width, item.style.height);
			
			if(!b._multiDraw)
			{
				// Remove item.
				this.deleteItem(item);
				skipJoin = true;
			}
		}
		else
		{
			this.cmdChangeBrush(param, item.style.width, item.style.height);
		}
	}
		
	if(!skipJoin && item.groupID != undefined)
	{
		var shapeGroup = this.shapeGroups[String(item.groupID)];
		for(var i = 0; i < shapeGroup.length; i++)
		{
			this._joinShapes.push(shapeGroup[i]);
		}
	}
}

proto.cmdNoteItem = function()
{
	var l = null;
	if(this._drawingMode)
	{
		if(this._joinShapes && this._joinShapes.length > 0) l = this._joinShapes[0];
		this._toViewMode();
	}
	else
	{
		l = this._selectedItem
		if(l instanceof Array) l = l[0];
	}
	if(l) this.showInfo(l);
}

proto.cmdRemoveItem = function()
{
	var item = this._selectedItem;
	if(item instanceof Array) item = item[0];
	
	var groupID = String(item.groupID);

	this._resetNMDForGroup(groupID);

	var isNew = false;//this._isNewGroup(groupID);
	
	this._unsetSelectedItem();
	this.deleteItem(item);

	if(!isNew) this._postDelete(groupID);
}

proto._isNewGroup = function(groupID)
{
	var group = this.shapeGroups[groupID];
	var isNew = true;
	for(var i = 0; i < group.length; i++)
	{
		if(!group[i].style._isNew)
		{
			isNew = false;
			break;
		}
	}
	return isNew;
}


proto._resetNMDForGroup = function(groupID)
{
	var group = this.shapeGroups[groupID];
	for(var i = 0; i < group.length; i++)
	{
		var shape = group[i];
		if(shape.style._isNMD)
		{
			var b = this._findButton("cmdChangeBrush", {brushID: shape.style._brushID});
			if(b) 
			{
				b._disabled = false;
				this.setButtonState(b, "normal");
			}
		}
	}
}

proto._postDelete = function(groupID)
{
	this._isDirty = true;
	var removeNode = this.changedDocument.createElement("drawingcontrolremove");
	removeNode.setAttribute("shape", groupID);
	this.changedFragment.appendChild(removeNode);
	this.formManager.postData(this.element);
}

proto._postFinish = function(groupID)
{
	this._isDirty = true;
	var node = this.changedDocument.createElement("drawingcontroledit");
	node.setAttribute("shape", groupID);
	this.changedFragment.appendChild(node);
	this.formManager.postData(this.element);
	
	this._resetNMDButtons();
}

proto.cmdFinishItem = function()
{
	var groupID = null;
	if(this._joinShapes.length > 0) 
	{
		groupID = this._joinShapes[0].groupID;
	}

	this._toViewMode();

	if(groupID) this._postFinish(groupID);
}

proto.cmdCancelItem = function()
{
	var groupID = null;
	var isNew = false;
	if(this._joinShapes.length > 0) 
	{
		groupID = this._joinShapes[0].groupID;
		
		this._resetNMDForGroup(groupID);
		
		isNew = this._isNewGroup(groupID);		
		this.deleteItem(this._joinShapes[0]);
	}
	this._joinShapes = [];
	this._toViewMode();

	if(groupID && !isNew) this._postDelete(groupID);
}

proto._createContextButton = function(parentElement, cmd, label, img)
{
	var b = document.createElement("<button>");
	parentElement.appendChild(b);
	b.innerText = label;
	b.attachEvent("onmouseenter", _CN_button_onmouseenter);
	b.attachEvent("onmouseleave", _CN_button_onmouseleave);
	b.attachEvent("onclick", this._contextButton_onclick);
	b._isButton = true;
	b._cmd = cmd;
	
	if(img)
	{
		var icon = document.createElement("<img width=16 height=16 align=absmiddle>");
		b.insertBefore(icon, b.firstChild);
		icon.src = img;
	}

	return b;
}

proto._updateContextButtons = function()
{
	this._updateContextButtonsDiv(this._drawingModeButtonsDiv, this._drawingMode);
	this._updateContextButtonsDiv(this._viewModeButtonsDiv, !this._drawingMode && this._selectedItem);
}

proto._updateContextButtonsDiv = function(div, isVisible)
{
	var visibility = isVisible ? "inherit" : "hidden";
	if(div.currentStyle.visibility != visibility)
	{
		div.filters[0].Apply();
		div.style.visibility = visibility;
		div.filters[0].Play();
	}
}

proto._contextButton_onclick = function()
{
	CNUtil.dispatchObject().contextButton_onclick();
}
proto.contextButton_onclick = function()
{
	var b = event.srcElement;
	while(b && !b._isButton) b = b.parentElement;
	if(b && b._cmd) this[b._cmd]();
}

// Tools. ==============================================
proto.cmdChangeTool = function(tool)
{
	if(this.currentTool == tool) return;
	
	if(this.currentTool && this.currentTool.handle_toolunselected)
	{
		this.calcElementOffset();
		this.currentTool.handle_toolunselected();
	}

	this.currentTool = tool;
	if(this.currentTool.handle_toolselected) 
	{
		this.calcElementOffset();
		this.currentTool.handle_toolselected();
	}
}

proto.cmdChangeBrush = function(param, w, h)
{
	var src = param.value;
	this._currentBrushID = param.brushID;
	var nonMultiDraw = false;
	if(!w && !h)	
	{
		var buttonDiv = CNUtil.findTag(event.srcElement, "DIV");
		w = buttonDiv.children[0].width;
		h = buttonDiv.children[0].height;
		if(!buttonDiv._multiDraw) 
		{
			this._lastNMDButton = buttonDiv;
			nonMultiDraw = true;
		}
	}
	this.cmdChangeTool(this.BrushTool);
	this.BrushTool.setBrushSrc(src, w, h, nonMultiDraw);
}

proto.cmdChangeFreeDraw = function(param)
{
	var color = param.value;
	this._currentBrushID = param.brushID;
	this.cmdChangeTool(this.FreeDrawTool);
	this.cmdChangeColor(color);
}

proto.cmdChangeWeight = function(weight)
{
	this.currentWeight = weight;
}

proto.cmdChangeColor = function(color)
{
	this.currentColor = color;
	if(this.currentTool && this.currentTool.handle_changecolor) this.currentTool.handle_changecolor();
}

proto.cloneObject = function(matrix)
{
	var obj = {};
	for(var i in matrix) obj[i] = matrix[i];
	return obj;
}

proto._modalFocus = function()
{
	this.formManager.modalFocusElement(this.element);
}

proto._modalBlur = function()
{
	this.formManager.modalBlurElement(this.element);
}

proto._toViewMode = function()
{
	if(this._drawingMode === false) return;

	this._currentArea = null;

	var b = this.groupButtons["brushes"];
	if(b && !b._disabled) this.setButtonState(b, "normal");
	var b = this.groupButtons["colors"];
	if(b) this.setButtonState(b, "normal");

	this.cmdChangeTool(this.PointerTool);
	
	this._updateContextButtons();	
}

proto._toDrawingMode = function()
{
	this._unsetSelectedItem();

	this._drawingMode = true;
	this._joinShapes = [];
	this._modalFocus();		

	this._updateContextButtons();
}

proto._PointerTool =
{
	handle_toolselected: function()
	{
		if(this.jsObject._drawingMode) 
		{
			this.jsObject._modalBlur();
		}
		this.jsObject._drawingMode = false;
		this.jsObject._joinShapes = null;
	},
	handle_toolunselected: function()
	{
		this.jsObject._toDrawingMode();
	},
	handle_mousedown: function(){},
	handle_mousemove: function(){},
	handle_mouseup: function(){}
}

proto._FreeDrawTool = 
{
	_element: null,
	_path: null,
	_first: true,
	_isMulty: false,
	
	handle_toolselected: function()
	{
		this.jsObject._hideGroup("lineWeight", false);
		this.jsObject._disableGroup("brushes", true);
		this.jsObject._disableGroup("colors", true);
	},
	handle_toolunselected: function()
	{
		this.jsObject._hideGroup("lineWeight", true);
		this.jsObject._disableGroup("brushes", false);
		this.jsObject._disableGroup("colors", false);
	},
	handle_mousedown: function()
	{
		var srcEl = event.srcElement;

		if(event.button != 1 
		|| !(srcEl && (srcEl.style && srcEl.style._isMarkerArea == true
			|| srcEl.style._markerArea))) return false;
			
		if(!this.jsObject._allowMultiAreaDrawing)
		{
			if(this.jsObject._currentArea && 
			this.jsObject._currentArea != srcEl && this.jsObject._currentArea != srcEl.style._markerArea) return;
		}
			
		if(srcEl.style._markerArea) this.jsObject._currentArea = srcEl.style._markerArea;
		else this.jsObject._currentArea = srcEl;

		
		this._path = "";
		this._first = true;

		var l = this._element = document.createElement("v:shape");
		l.style._isNew = true;
		l.style.position = "absolute";
		l.style.left = 0;
		l.style.top = 0;
		l.style.width = this.jsObject.drawingArea.offsetWidth;
		l.style.height = this.jsObject.drawingArea.offsetHeight;
		l.coordsize = this.jsObject.drawingArea.offsetWidth + ", " + this.jsObject.drawingArea.offsetHeight;
		
		l.style._brushID = this.jsObject._currentBrushID;

		var f = document.createElement("v:fill");
		f.on = false;
		l.appendChild(f);

		var stroke = document.createElement("v:stroke");
		stroke.weight = this.jsObject.currentWeight;
		stroke.endcap = "round";
		stroke.color = this.jsObject.currentColor;
		l.appendChild(stroke);

		l.style._markerArea = l.style._startArea 
			= srcEl.style._isMarkerArea ? srcEl : srcEl.style._markerArea;
		
		this.jsObject.group.appendChild(l);
		
		this._isMulti = false;
	},
	handle_mousemove: function()
	{
		var srcEl = event.srcElement;
		
		if(event.button != 1 || !this._element) return;
		if(!srcEl || !srcEl.style) return;
		
		if(srcEl.style._isMarkerArea == true) // Over area shape.
		{
			if(!this.jsObject._allowMultiAreaDrawing 
			&& this._element.style._startArea != srcEl) return;
		}
		else if(srcEl.style._markerArea) // Over other drawing.
		{
			if(!this.jsObject._allowMultiAreaDrawing 
			&& srcEl.style._markerArea != this._element.style._startArea) return;
		}
		else
		{
			this._endShape();
			return;
		}

		if(this.jsObject._allowMultiAreaDrawing && srcEl && !srcEl.style._isMarkerArea
		&& srcEl.style._markerArea)
		{
			srcEl = srcEl.style._markerArea;
		}
		
		if(this.jsObject._allowMultiAreaDrawing && 
		this._element.style._startArea != srcEl && srcEl.style._isMarkerArea)
		{
			this._isMulti = true;
			if(!this._element.style._areas) this._element.style._areas = [];
			var exists = false;
			for(var i = 0; i < this._element.style._areas.length; i++)
			{
				if(this._element.style._areas[i] == srcEl) exists = true;
			}
			if(!exists) 
			{
				this._element.style._areas.push(srcEl);
			}
		}

		var x = event.x;
		var y = event.y - 2;
		if(this._first)
		{
			this._path = "m " + x + "," + y + " l ";
			this._first = false;
		}
		else
		{
			this._path = this._path + x + "," + y + " ";
		}
		this._element.path = this._path;
	},
	handle_mouseup: function()
	{
		if(event.button != 1 && event.button != 0 || !this._element) return;
		this._endShape();
	},
	_endShape: function()
	{
		var l = this._element;
		var lxys;
		try
		{
			lxys = this.jsObject.extractXYs(String(l.path));
		}
		catch(e){ return; }
		
		l.style._markerArea = l.style._startArea;
		this.jsObject._joinShape(l);

		this.jsObject._attachItemEvents(l);

		this._element = null;
	}
}

proto._joinShape = function(l)
{
	var joinShapes = this._joinShapes;
	joinShapes.push(l);

	// Find groupID.
	var groupID = null;
	for(var i = 0; i < joinShapes.length; i++)
	{
		if(joinShapes[i].groupID !== undefined)
		{
			groupID = String(joinShapes[i].groupID);
			break;
		}
	}
	if(groupID == null)
	{
		// Make new groupID.
		groupID = String(this.lastShapeGroupId++);
	}
	// Set groupID.
	for(var i = 0; i < joinShapes.length; i++)
	{
		joinShapes[i].groupID = groupID;
	}
	
	this.shapeGroups[groupID] = joinShapes;
	this._shapeGroupNames[groupID] = this._findGroupName(joinShapes);
}

proto.handle_nonMultiDraw = function()
{
	if(!this._lastNMDButton) return;
	this.setButtonState(this._lastNMDButton, "disabled");
	this._lastNMDButton._disabled = true;
	this._lastNMDButton = null;
}

proto._BrushTool = 
{
	NMD_NONE: 0,
	NMD_TRUE: 1,
	NMD_PROCESSED: 2,

	ownMouseHandling: true,
	_current: null,
	_visible: false,
	_storedCursor: null,
	_nonMultiDraw: false,
	
	setBrushSrc: function(src, w, h, nonMultiDraw)
	{
		if(!this._current) 
		{
			alert("ASSERT: !this._current");
			return;
		}
		this._current.src = src;
		this._current.style.width = w;
		this._current.style.height = h;
		this._nonMultiDraw = nonMultiDraw ? this.NMD_TRUE : this.NMD_NONE;
	},
	handle_toolselected: function()
	{
		this.jsObject._disableGroup("brushes", true);
		this.jsObject._disableGroup("colors", true);
		if(this._current == null) this.createBrush();
	},
	handle_toolunselected: function()
	{
		this.jsObject.drawingArea.style.cursor = this._storedCursor;
		
		this.jsObject._disableGroup("brushes", false);
		this.jsObject._disableGroup("colors", false);
		//this.jsObject._disableGroup("lineWeight", false);
		this.jsObject.drawingArea.detachEvent("onmousedown", this.jsObject._BrushTool_onmousedown_helper);
		this.jsObject.drawingArea.detachEvent("onmouseenter", this.jsObject._BrushTool_onmouseenter_helper);
		this.jsObject.drawingArea.detachEvent("onmouseleave", this.jsObject._BrushTool_onmouseleave_helper);
		this.jsObject.drawingArea.detachEvent("onmousemove", this.jsObject._BrushTool_onmousemove_helper);

		this.destroyBrush();
	},
	createBrush: function()
	{
		var l = this._current = document.createElement("v:image");
		l.style.left = event.x;
		l.style.top = event.y - 2;
		l.style.width = 1;
		l.style.height = 1;
		l.style._isCursor = true;
		l.coordsize = this.jsObject.element.offsetWidth + "," + this.jsObject.element.offsetHeight;
		this.jsObject.group.appendChild(l);
			this.jsObject.drawingArea.attachEvent("onmouseenter", this.jsObject._BrushTool_onmouseenter_helper);
		this.jsObject.drawingArea.attachEvent("onmouseleave", this.jsObject._BrushTool_onmouseleave_helper);
		this.jsObject.drawingArea.attachEvent("onmousemove", this.jsObject._BrushTool_onmousemove_helper);
		this.jsObject.drawingArea.attachEvent("onmousedown", this.jsObject._BrushTool_onmousedown_helper);
	},
	destroyBrush: function()
	{
		var l = this._current;
		if(!l) return;
		l.removeNode();
		this._current = null;
		this._visible = false;
	},
	handle_mouseenter: function()
	{
		var l = this._current;
		if(l == null) this.createBrush();
		this._storedCursor = this.jsObject.drawingArea.currentStyle.cursor;
		this.jsObject.drawingArea.style.cursor = "url(\"" + CNFormManager.neutralImagesPath + "empty.cur\")";
	},
	handle_mouseleave: function()
	{
		var l = this._current;
		l.style.visibility = "hidden";
		this.jsObject.drawingArea.style.cursor = this._storedCursor;
	},
	handle_mousedown: function()
	{
		if(this._nonMultiDraw == this.NMD_PROCESSED) return;

		var l = this._current;

		l.style.display = "none";

		var srcEl = document.elementFromPoint(event.clientX + parseInt(l.style.width) / 2, event.clientY  + parseInt(l.style.height) / 2);
		l.style.display = "";
					
		if(event.button != 1 
		|| !(srcEl 
			&& (srcEl.style && srcEl.style._isMarkerArea == true
			   || srcEl.style._markerArea))) return false;
			   
		if(!this.jsObject._allowMultiAreaDrawing && this.jsObject._currentArea && 
		this.jsObject._currentArea != srcEl && this.jsObject._currentArea != srcEl.style._markerArea) return;

		if(srcEl.style._markerArea) this.jsObject._currentArea = srcEl.style._markerArea;
		else this.jsObject._currentArea = srcEl;

		if(l == null) this.createBrush();				
		var cl = document.createElement("v:image");

		cl.style._isNew = true;
		cl.src = l.src;
		cl.coordsize = this.jsObject.element.offsetWidth + "," + this.jsObject.element.offsetHeight;
		cl.style.width = l.style.width;
		cl.style.height = l.style.height;
		cl.style.left = event.x;
		cl.style.top = event.y - 2;

		cl.style._markerArea = srcEl.style._isMarkerArea ? srcEl : srcEl.style._markerArea;

		cl.style._brushID = this.jsObject._currentBrushID;

		this.jsObject._attachItemEvents(cl);

		this.jsObject.group.appendChild(cl);
		
		this.jsObject._joinShape(cl);		
		
		if(this._nonMultiDraw == this.NMD_TRUE) 
		{
			cl.style._isNMD = true;
			this._nonMultiDraw = this.NMD_PROCESSED;
			this.jsObject.handle_nonMultiDraw();
			this.handle_toolunselected();
			CNUtil.cancelEvent();			
		}
	},
	handle_mousemove: function()
	{
		var l = this._current;
		if(!this._visible)
		{
			this.jsObject.group.appendChild(l);
			this._visible = true;
		}
		l.style.visibility = "inherit";

		l.style.display = "none";
		var srcEl = document.elementFromPoint(event.clientX + parseInt(l.style.width) / 2, event.clientY  + parseInt(l.style.height) / 2);
		l.style.display = "";
		
		if(srcEl && srcEl.style)
		{
			if(srcEl.style._isMarkerArea) this.jsObject._showAreaName(srcEl._shapeName);
		}
		else
			this.jsObject._hideAreaName();

		l.style.left = event.x;// - this.jsObject.offX;
		l.style.top = event.y - 2;
	},
	handle_mouseup: function()
	{
	}
}

proto._BrushTool_onmouseenter_helper = function()
{ 
	CNUtil.findJSObject(event.srcElement).BrushTool.handle_mouseenter(); 
}
proto._BrushTool_onmouseleave_helper = function()
{
	CNUtil.findJSObject(event.srcElement).BrushTool.handle_mouseleave();
}
proto._BrushTool_onmousemove_helper = function()
{
	CNUtil.findJSObject(event.srcElement).BrushTool.handle_mousemove();
}
proto._BrushTool_onmousedown_helper = function()
{
	CNUtil.findJSObject(event.srcElement).BrushTool.handle_mousedown();
}
proto._BrushTool_onmouseup_helper = function()
{
	CNUtil.findJSObject(event.srcElement).BrushTool.handle_mouseup();
}


proto._freeDrawShape_onmouseenter = function()
{
	CNUtil.findJSObject(event.srcElement).freeDrawShape_onmouseenter();
}
proto.freeDrawShape_onmouseenter = function()
{
	var l = event.srcElement;
	if(l.groupID !== undefined)
	{
		var groupID = String(l.groupID);
		var name = this._shapeGroupNames[groupID];
		this._showAreaName(name);
	
		if(this._drawingMode) return;

		var shapeGroup = this.shapeGroups[groupID];
		if(!shapeGroup) return;
		
		if(this._selectedItem == shapeGroup) return;
		
		for(var i = 0; i < shapeGroup.length; i++)
		{
			this.hoverShape(shapeGroup[i], 60);
		}
	}
	else if(this._selectedItem != l) this.hoverShape(l, 60);
}

proto._freeDrawShape_onmouseout = function()
{
	CNUtil.findJSObject(event.srcElement).freeDrawShape_onmouseout();
}
proto.freeDrawShape_onmouseout = function()
{
	var l = event.srcElement;
	if(l.groupID !== undefined)
	{
		var shapeGroup = this.shapeGroups[String(l.groupID)];
		if(!shapeGroup) return;

		if(this._selectedItem == shapeGroup) return;

		for(var i = 0; i < shapeGroup.length; i++)
		{
			this.unhoverShape(shapeGroup[i])
		}
	}
	else if(this._selectedItem != l) this.unhoverShape(l);
}

proto._freeDrawShape_onmousedown = function()
{
	CNUtil.findJSObject(event.srcElement).freeDrawShape_onmousedown();
}
proto.freeDrawShape_onmousedown = function()
{
	if(this._readOnly || this._drawingMode) return;
	CNUtil.cancelEvent();	
		
	var l = event.srcElement;
	if(l.style._readOnly) return;	
	
	if(l.groupID !== undefined)
	{
		var shapeGroup = this.shapeGroups[String(l.groupID)];
		if(!shapeGroup) return;
		this._set_selectedItem(shapeGroup);
	}
	else 
	{
		this.unhoverShape(l);
		this._set_selectedItem(l);
	}
}

proto._set_selectedItem = function(item)
{
	if(this._selectedItem && item != this._selectedItem) this._unsetSelectedItem(true);

	this._selectedItem = item;
	if(!item) return;
	if(item instanceof Array)
	{
		for(var i = 0; i < item.length; i++)
		{
			this.hoverShape(item[i], 50);
		}
	}
	else
	{
		this.hoverShape(item, 50);
	}
	this._updateContextButtons();
}

proto._unsetSelectedItem = function(transition)
{
	var item = this._selectedItem;
	if(!item) return;
	if(item instanceof Array)
	{
		for(var i = 0; i < item.length; i++)
		{
			this.unhoverShape(item[i]);
		}
	}
	else
	{
		this.unhoverShape(item);
	}
	this._selectedItem = null;
	if(!transition) this._updateContextButtons();	
}

proto.hoverShape = function(l, opacity)
{
	if(l.tagName != "image") 
	{
		if(!l.style._strokeWeight)
		{
			l.style._strokeWeight = l.strokeWeight;
			l.strokeWeight = parseFloat(l.strokeWeight) + 1;
		}
	}
	l.runtimeStyle.filter = "alpha(opacity=" + opacity + ")";
}

proto.unhoverShape = function(l)
{
	if(l.tagName != "image" && l.style._strokeWeight) 
	{
		l.strokeWeight = parseFloat(l.strokeWeight) - 1;
		l.style._strokeWeight = null;
	}
	l.runtimeStyle.filter = "";
}

proto.showInfo = function(item)
{
	var ev = {};
	ev.groupID = String(item.groupID);
	this.oninfo(ev);
}

proto.deleteItem = function(item)
{
	if(item.groupID != undefined)
	{
		var groupID = String(item.groupID);
		var shapeGroup = this.shapeGroups[groupID];
		for(var i = 0; i < shapeGroup.length; i++)
		{
			shapeGroup[i].removeNode();
		}
		this.shapeGroups[groupID] = null;
		this._shapeGroupNames[groupID] = null;
	}
	else item.removeNode();
}

proto._createStatusBar = function()
{
	this._statusBarDiv = document.createElement("<div class=statusBar>");
	this.element.appendChild(this._statusBarDiv);
}

// Toolbar. =============================================
proto.createToolbar = function()
{
	if(this.element.offsetWidth < this.imgEl.offsetWidth + this.toolbarWidth)
	{
		var inc = this.imgEl.offsetWidth + this.toolbarWidth - this.element.offsetWidth;
		this.element.style.width = this.element.offsetWidth + inc;
	}

	var div = this.toolbarDiv;
	if(!div)
	{
		div = this.toolbarDiv = document.createElement("div");
		div.className = "canvasToolbar";
		div.unselectable = "on";
		div.style.padding = "2px";
		div.style.position = "absolute";
		div.style.width = this.toolbarWidth;
		div.style.height = this.element.clientHeight;
		div.style.left = this.element.clientWidth - this.toolbarWidth;
		div.style.top = 0;
		div.align = "center";
		div.style.cursor = "default";
		this.element.appendChild(div);
	}
	
	this._createBrushButtons(div);

	this._createColorButtons(div);
	
	this._hideGroup("lineWeight", true);
}

proto._disableGroup = function(group, disabled)
{
	if(!this.toolbarDiv) return;
	var all = this.toolbarDiv.children;
	var count = all.length;
	for(var i = 0; i < count; i++)
	{
		var item = all[i];
		if(item._disabled || !item.isButton || item.group != group) continue;
		
		if(disabled)
		{
			if(item.state == "normal") this.setButtonState(item, "disabled");
		}
		else
		{
			if(item.state == "disabled") this.setButtonState(item, "normal");
		}
	}
}

proto._hideGroup = function(group, hide)
{
	var all = this.toolbarDiv.children;
	var count = all.length;
	for(var i = 0; i < count; i++)
	{
		var item = all[i];
		if(!item.isButton || item.group != group) continue;
		item.style.display = hide ? "none" : "block";
	}
}

proto._deleteGroup = function(group)
{
	var all = this.toolbarDiv.children;
	var count = all.length;
	for(var i = count - 1; i >= 0; i--)
	{
		var item = all[i];
		if(!item.isButton || item.group != group) continue;
		item.removeNode(true);
	}
}

proto._deleteBrushType = function(type)
{
	for(var i in this._brushes)
	{
		if(this._brushes[i].type == type) delete this._brushes[i];
	}
}

proto._createBrushButtons = function(div)
{
	var brushNodes = this._node.selectNodes("brush");
	var count = brushNodes.length;

	if(count == 0) return;

	this._deleteBrushType(CN_drawingcontrol.BRUSH_IMAGE);
	this._deleteGroup("brushes");

	if(count == 1 && brushNodes[0].getAttribute("src") == null) return;
	
	for(var i = 0; i < count; i++)
	{
		var node = brushNodes[i];
		var src = String(node.getAttribute("src"));
		
		var id = String(node.getAttribute("id"));
		
		var multiDraw = node.getAttribute("multiDraw") != "false";
		this._brushes[id] = {type: CN_drawingcontrol.BRUSH_IMAGE, src: src, multiDraw: multiDraw};
		
		var caption = "";
		var attr = node.getAttribute("caption");
		if(attr) caption = String(attr);
		var b = this.createButton(div, src, caption, 
									true, "brushes", "cmdChangeBrush", 
									{value: src, brushID: id});
		attr = node.getAttribute("tooltip");
		if(attr) Tooltip.attach(b, String(attr));
		b._multiDraw = multiDraw;
	}
}

proto._createColorButtons = function(div)
{
	var colorNodes = this._node.selectNodes("color");
	var count = colorNodes.length;

	if(count == 0) return;

	this._deleteBrushType(CN_drawingcontrol.BRUSH_FREEDRAW);
	this._deleteGroup("colors");
	this._deleteGroup("lineWeight");

	if(count == 1 && colorNodes[0].getAttribute("value") == null) return;

	for(var i = 0; i < count; i++)
	{
		var node = colorNodes[i];
		var value = String(node.getAttribute("value"));
		var span = document.createElement("span");
		span.style.height = "20px";
		span.style.verticalAlign = "middle";
		
		var id = String(node.getAttribute("id"));
		
		this._brushes[id] = {type: CN_drawingcontrol.BRUSH_FREEDRAW, color: value};

		var innerSpan = document.createElement("span");
		span.appendChild(innerSpan);
		innerSpan.style.background = value;
		innerSpan.style.overflow = "hidden";
		innerSpan.style.width = 12;
		innerSpan.style.height = 4;
		innerSpan.style.position = "relative";
		innerSpan.style.top = -2;
		innerSpan.style.left = 1;

		var caption = "";
		var attr = node.getAttribute("caption");
		if(attr) caption = String(attr);
		
		var b = this.createButton(div, span, caption, true, "colors", "cmdChangeFreeDraw", 
					{value: value, brushID: id});
		b._statePrefix = "spanButton_";
		b.className = "spanButton_normal";

		attr = node.getAttribute("tooltip");
		if(attr) Tooltip.attach(b, String(attr));

		//if(i == count - 1) b.style.marginBottom = 6;
	}

	//div.appendChild(document.createElement("<div style=\"height: 6px; width: 1px; overflow: hidden; \"></div>"));

	this.createButton(div, CNFormManager.neutralIconsPath + "line-1.gif", "", true, "lineWeight", "cmdChangeWeight", 1);
	var b2 = this.createButton(div, CNFormManager.neutralIconsPath + "line-2.gif", "", true, "lineWeight", "cmdChangeWeight", 2);
	this.setButtonState(b2, "pushed");
	this.groupButtons[b2.group] = b2;
	
	this.createButton(div, CNFormManager.neutralIconsPath + "line-3.gif", "", true, "lineWeight", "cmdChangeWeight", 3);
	this.createButton(div, CNFormManager.neutralIconsPath + "line-4.gif", "", true, "lineWeight", "cmdChangeWeight", 4);
	this.createButton(div, CNFormManager.neutralIconsPath + "line-5.gif", "", true, "lineWeight", "cmdChangeWeight", 5);
}

proto.createButton = function(parentElement, img, caption, isPushable, group, cmd, param)
{
	var b;
	var isImage = false;
	if(typeof(img) == "string") 
	{
		b = document.createElement("img");
		isImage = true;
	}
	else 
	{
		b = img;
	}

	var div = document.createElement("div");
	parentElement.appendChild(div);
	div.appendChild(b);
	
	if(caption != "")
	{
		div.style.width = "100%";
		div.style.textAlign = "left";
	}
		
	var textSpan  = document.createElement("span");
	div.appendChild(textSpan);
	textSpan.innerText = caption;
	textSpan.style.marginLeft = "5px";

	if(isImage) 
	{
		b.src = img;
		b.img = img;
		b.align = "absmiddle";
	}

	b = div;
	
	b.isButton = true;
	b.className = "button_normal";
	b.unselectable = "on";
	b.isPushable = isPushable;
	b.group = group;
	b.cmd = cmd;
	b.param = param;
	b.state = "normal";
	b._statePrefix = "button_";
	b.attachEvent("onmouseenter", this._button_onmouseenter);
	b.attachEvent("onmouseleave", this._button_onmouseleave);
	b.attachEvent("onmousedown", this._button_onmousedown);
	b.attachEvent("onmouseup", this._button_onmouseup);	
	b.attachEvent("ondragstart", CNUtil.cancelEvent);
	b.isButton = true;
	return b;
}

proto.setButtonState = function(b, state)
{
	b.className = b._statePrefix + state;
	b.state = state;
}

proto._findButton = function(cmd, param)
{
	var children = this.toolbarDiv.children;
	var count = children.length;
	for(var i = 0; i < count; i++)
	{
		var child = children[i];
		if(child.cmd == cmd && child.param && child.param.brushID == param.brushID) return child;
	}
	return null;
}

proto._pushButton = function(b)
{
	if(!b.isPushable) alert("ASSERT: !b.isPushable");

	var groupButton = this.groupButtons[b.group];
	if(groupButton) this.setButtonState(groupButton, b.state == "pushedHover" ? "pushed" : "normal")
	this.groupButtons[b.group] = b;

	if(b.state == "pushedHover") this.setButtonState(b, "normalDown");
	else this.setButtonState(b, "pushedDown");
}

proto._button_onmouseenter = function()
{
	CNUtil.findJSObject(event.srcElement).button_onmouseenter();
}
proto.button_onmouseenter = function()
{
	if(this._readOnly) return;
	var b = event.srcElement;
	
	if(b.state == "disabled") return;
	
	if(b.state == "normal") this.setButtonState(b, "normalHover")
	else if(b.state == "pushed") this.setButtonState(b, "pushedHover");
}

proto._button_onmouseleave = function()
{
	CNUtil.findJSObject(event.srcElement).button_onmouseleave();
}
proto.button_onmouseleave = function()
{
	if(this._readOnly) return;
	var b = event.srcElement;
	if(b.state == "disabled") return;
	if(b.state == "normalHover" || b.state == "normalDown") this.setButtonState(b, "normal");
	else if(b.state == "pushedHover" || b.state == "pushedDown") this.setButtonState(b, "pushed");
}

proto._button_onmousedown = function()
{
	CNUtil.findJSObject(event.srcElement).button_onmousedown();
}
proto.button_onmousedown = function()
{
	if(this._readOnly) return;
	var b = event.srcElement;	
	while(!b.isButton) b = b.parentElement;
	if(b.state == "disabled") return;
	if(!b.isPushable) 
	{
		this.setButtonState(b, "normalDown");
		if(b.cmd) this[b.cmd](b.param);
	}
	else 
	{
		if(b.group)
		{
			var groupButton = this.groupButtons[b.group];
			if(groupButton && !groupButton._disabled) this.setButtonState(groupButton, b.state == "pushedHover" ? "pushed" : "normal")
			this.groupButtons[b.group] = b;
		}

		if(b.state == "pushedHover") this.setButtonState(b, "normalDown");
		else 
		{
			this.setButtonState(b, "pushedDown");
			if(b.cmd) this[b.cmd](b.param);
		}
	}

}		  

proto._button_onmouseup = function()
{
	var b = event.srcElement;
	while(b && !b.isButton) b = b.parentElement;
	if(!b || !b.isButton) return;
	CNUtil.findJSObject(event.srcElement).button_onmouseup(b);
}
proto.button_onmouseup = function(b)
{
	if(this._readOnly) return;
	if(b.state == "disabled") return;
	if(b.state == "pushedDown") this.setButtonState(b, "pushedHover");
	else this.setButtonState(b, "normalHover");
}		  


proto._drawingArea_onmousedown = function()
{
	var js = CNUtil.findJSObject(event.srcElement);
	if(js && js.drawingArea_onmousedown) js.drawingArea_onmousedown();
}
proto.drawingArea_onmousedown = function()
{
	if(this._readOnly) return;
	
	if(!this._drawingMode)
	{
		this._unsetSelectedItem();
		return;
	}

	var l = this.drawingArea;
	this.offX = -this.pointerXOff;
	this.offY = -this.pointerYOff;
	while(l != null)
	{
		this.offX += l.offsetLeft;
		this.offY += l.offsetTop;
		l = l.offsetParent;
	}

	if(!this.currentTool.ownMouseHandling)
	{
		if(this.currentTool.handle_mousedown() !== false)
		{
			this.drawingArea.attachEvent("onmousemove", this._drawingArea_onmousemove);
			this.drawingArea.attachEvent("onmouseup", this._drawingArea_onmouseup);	
			this.drawingArea.attachEvent("onmouseleave", this._drawingArea_onmouseup);
		}
	}
}

proto._drawingArea_onmousemove = function()
{
	CNUtil.findJSObject(event.srcElement).currentTool.handle_mousemove();
}

proto._drawingArea_onmouseup = function()
{
	CNUtil.findJSObject(event.srcElement).drawingArea_onmouseup();
}
proto.drawingArea_onmouseup = function()
{
	this.drawingArea.detachEvent("onmousemove", this._drawingArea_onmousemove);
	this.drawingArea.detachEvent("onmouseup", this._drawingArea_onmouseup);	
	this.drawingArea.detachEvent("onmouseleave", this._drawingArea_onmouseup);
	this.currentTool.handle_mouseup();	
}


// Math. ===============================
proto.calcElementOffset = function()
{
	this.offX = 0;
	this.offY = 0;
	var l = this.element;
	while(l != null)
	{
		this.offX += l.offsetLeft;
		this.offY += l.offsetTop;
		l = l.offsetParent;
	}
}

proto.checkPathesForCrossing = function(lxys, sxys)
{
	var lx1 = lxys[0][0];
	var ly1 = lxys[0][1]

	for(var j = 1; j < lxys.length; j++)
	{
		var lx2 = lxys[j][0];
		var ly2 = lxys[j][1];

		var sx1 = sxys[0][0];
		var sy1 = sxys[0][1]

		for(var k = 1; k < sxys.length; k++)
		{
			var sx2 = sxys[k][0];
			var sy2 = sxys[k][1];

			if(this.areSegmentsCrossing(lx1, ly1, lx2, ly2, sx1, sy1, sx2, sy2)
			&& !(lx1 == lx2 && lx2 == sx1 && sx1 == sx2)
			&& !(ly1 == ly2 && ly2 == sy1 && sy1 == sy2))
			{
				return true;
			}
			sx1 = sx2;
			sy1 = sy2;
		}
		lx1 = lx2;
		ly1 = ly2;
	}
	return false;
}

proto.extractXYs = function(path, useX)
{
	var mPos = path.indexOf("m");
	var lPos = path.indexOf("l");
	var ePos = path.indexOf(useX ? "x" : "e");
	var firstXY = path.substring(mPos + 1, lPos).split(/,|\s/);
	var XYs = path.substring(lPos + 1, ePos).split(/,|\s/);
	var extractedXYs = [];
	extractedXYs[extractedXYs.length] = [parseInt(firstXY[0]), parseInt(firstXY[1])];
	
	for(var i = 0; i < XYs.length; i+= 2)
	{
		extractedXYs[extractedXYs.length] = [parseInt(XYs[i]), parseInt(XYs[i + 1])];
	}
	return extractedXYs;
}

proto.elementIntersects = function(l1, l2)
{
	if(l1.offsetLeft < l2.offsetLeft + l2.offsetWidth && l2.offsetLeft < l1.offsetLeft + l1.offsetWidth)
	{
		if(l1.offsetTop < l2.offsetTop + l2.offsetHeight) return l2.offsetTop < l1.offsetTop + l1.offsetHeight;
	}
	return false;
}

proto.intersects = function(ilx1, ily1, ilx2, ily2, isx1, isy1, isx2, isy2)
{
	var lx1 = Math.min(ilx1, ilx2);
	var ly1 = Math.min(ily1, ily2);
	var lx2 = Math.max(ilx1, ilx2);
	var ly2 = Math.max(ily1, ily2);
	
	var sx1 = Math.min(isx1, isx2);
	var sy1 = Math.min(isy1, isy2);
	var sx2 = Math.max(isx1, isx2);
	var sy2 = Math.max(isy1, isy2);

	if(lx1 < sx1 + (sx2 - sx1) && sx1 < lx1 + (lx2 - lx1))
	{
		if(ly1 < sy1 + (sy2 - sy1)) return sy1 < ly1 + (ly2 - ly1);
	}
	return false;
}

proto.areSegmentsCrossing = function(x1, y1, x2, y2, x3, y3, x4, y4)
{
	return (((x3 - x1) * (y2 - y1) - (y3 - y1) * (x2 - x1)) * ((x4 - x1) * (y2 - y1) - (y4 - y1) * (x2 - x1)) <= 0) 
			&& (((x1 - x3) * (y4 - y3) - (y1 - y3) * (x4 - x3)) * ((x2 - x3) * (y4 - y3) - (y2 - y3) * (x4 - x3)) <= 0);
} 

var CONST_INSIDE = 1;
var CONST_OUTSIDE = 2;
var CONST_BOUNDARY = 3;
var CONST_TOUCHING = 4;
var CONST_CROSSING = 5;
var CONST_INESSENTIAL = 6;
var CONST_LEFT = 10;
var CONST_RIGHT = 11;
var CONST_BEYOND = 12;
var CONST_BEHIND = 13;
var CONST_BETWEEN = 14;
var CONST_ORIGIN = 15;
var CONST_DESTINATION = 16;

proto.pointInPolygon = function(a, XYs)
{
	var parity = 0;

	var e1 = {x: XYs[0][0], y: XYs[0][1]};
	for(var j = 1; j < XYs.length + 1; j++)
	{
		if(j == XYs.length) j = 0; // Last vector: (last point -> 0).
		var e2 = {x: XYs[j][0], y: XYs[j][1]};
			
		//alert(XYs.length + " " + j + " " + e2.x + " " + e2.y);

		switch(this.edgeType(a, e1, e2))
		{
			case CONST_TOUCHING:
				return CONST_BOUNDARY;
			case CONST_CROSSING:
				parity = 1 - parity;
		}

		e1 = e2;
		if(j == 0) break;
	}
	return (parity ? CONST_INSIDE : CONST_OUTSIDE);
}

proto.edgeType = function(a, v, w)
{
	switch(this.classify(a, v, w))
	{
		case CONST_LEFT:
			return ((v.y < a.y) && (a.y <= w.y)) ? CONST_CROSSING : CONST_INESSENTIAL; 
		case CONST_RIGHT:
			return ((w.y < a.y) && (a.y <= v.y)) ? CONST_CROSSING : CONST_INESSENTIAL; 
		case CONST_BETWEEN:
		case CONST_ORIGIN:
		case CONST_DESTINATION:
			return CONST_TOUCHING;
		default:
			return CONST_INESSENTIAL;
	}
}


proto.classify = function(p2, p0, p1)
{
	var a = this.point_sub(p1, p0);
	var b = this.point_sub(p2, p0);
	var sa = a.x * b.y - b.x * a.y;
	if(sa > 0.0) return CONST_LEFT;
	if(sa < 0.0) return CONST_RIGHT;
	if((a.x * b.x < 0.0) || (a.y * b.y < 0.0)) return CONST_BEHIND;
	if(this.point_length(a) < this.point_length(b)) return CONST_BEYOND;
	if(p0.x == p2.x && p0.y == p2.y) return CONST_ORIGIN;
	if(p1.x == p2.x && p1.y == p2.y) return CONST_DESTINATION;
	return CONST_BETWEEN;
}

proto.point_length = function(p)
{
	return Math.sqrt(p.x * p.x + p.y * p.y);
}

proto.point_sub = function(a, p)
{
	return {x: a.x - p.x, y: a.y - p.y};
}
 


// Event handlers. ==============================================
proto._img_onload = function()
{
	if(event.srcElement && event.srcElement.readyState != "complete") return;

	var jsObject = CNUtil.findJSObject(event.srcElement);
	setTimeout(function(){ jsObject.postInit(); }, 0);
}

proto._element_onresize = function()
{
	CNUtil.dispatchObject().element_onresize();
}
proto.element_onresize = function()
{
	this.scrollDiv.style.width = Math.max(10, this.element.clientWidth - this.toolbarWidth);
	this.scrollDiv.style.height = Math.max(10, this.element.offsetHeight - this._statusBarDiv.offsetHeight - 24);
	this._statusBarDiv.style.top = this.element.clientHeight - this._statusBarDiv.offsetHeight;
	if(this.toolbarDiv)
	{
		this.toolbarDiv.style.height = this.element.clientHeight;
		this.toolbarDiv.style.left = this.element.clientWidth - this.toolbarWidth;
	}
	if(!this._lastW || !this._lastH) this._setSizes();
}

proto._shape_onmouseenter = function()
{
	CNUtil.dispatchObject().shape_onmouseenter();
}
proto.shape_onmouseenter = function()
{
	this._showAreaName(event.srcElement._shapeName);
}

proto._shape_onmouseleave = function()
{
	CNUtil.dispatchObject().shape_onmouseleave();
}
proto.shape_onmouseleave = function()
{
	var toElement = event.toElement;
	if(toElement && toElement.style
		&& (toElement.tagName == "shape" && !toElement.style._isMarkerArea
		|| toElement.tagName == "image")) return;
	this._hideAreaName();
}

proto._showAreaName = function(shapeName)
{
	if(String(this._statusBarDiv.innerText) == shapeName) return;
	if(!shapeName) shapeName = "";
	this._statusBarDiv.filters[0].Apply();
	this._statusBarDiv.innerText = shapeName;
	this._statusBarDiv.filters[0].Play();
}

proto._hideAreaName = function()
{
	this._showAreaName("");
}


// Properties. ===================================================
proto.get_readOnly = function()
{
	return this._readOnly;
}
proto.set_readOnly = function(value)
{
	this._readOnly = eval(value);
	if(this.isReady) this._set_readOnly();
}
proto._set_readOnly = function()
{
	//this._hideGroup("lineWeight", this._readOnly);
}

proto.set_disabled = function(value)
{
	this._disabled = value;

	if(!this.isReady) return;
	this._set_disabled();
}
proto._set_disabled = function()
{
	if(this._disabled)
	{
		this.disabler.style.width = "100%";
		this.disabler.style.height = "100%";
	}
	this.disabler.style.visibility = this._disabled ? "inherit" : "hidden";
}

proto.get_Vml = function()
{
	this.BrushTool.handle_toolunselected();
	this._unsetSelectedItem();
	var vml = String(this.group.innerHTML);
	// Filter VML.
	vml = this._filterVML(vml);
	return vml;
}

