/*
	# idPrefix, bed group ids => bedX
	# 1046 - areasEnabled
	v. 2.0.9
	+ area list.
*/
function CN_floorplanner()
{
	this._isFloorPlanner = true;
	this.vml = null;
	this._scrollPosition = null;
	
	this.isReady = false;
	
	this.toolbarWidth = 20;
	this.pointerXOff = -3;
	this.pointerYOff = -5;
	
	this.snapCellSize = 10;
	this.canvasWidth = 2500;
	this.canvasHeight = 2500;
	
	this.zoomFactor = 1;
	this._zoomCombo = null;
	
	this.drawingArea = null;
	this.group = null;
	this.scrollDiv = null;
	
	this.hasMarkerarea = false
	
	this.contextMenu = null;
	this.list_contextMenu = null;
	
	this.currentContextElement = null;
	
	this.offX = 0; 
	this.offY = 0;
	
	this.lastImgID = 0;
	
	this._readOnly = false;


	this.currentTool = null;
	
	this.currentColor = "black";
	this.currentWeight = 5;
	this.currentLineStyle = "single";
	this.currentEndcap = "round";
	this.currentDashstyle = "solid";

	this.lowerToolbar = null;
	this.groupButtons = [];

	this.pointerToolButton = null;
	this.lineToolButton = null;
	
	this.sizeDiv = null;

	this.draggedImg = null;
	this.currentButton = null;

	this.canceled = false;
	this.dragging = false;
	this.draggedCursorXOff = 0;
	this.draggedCursorYOff = 0;
	this.dragStartX = 0;
	this.dragStartY = 0;

	this.draggedLineFromX1 = null;
	this.draggedLineFromY1 = null;
	this.draggedLineFromX2 = null;
	this.draggedLineFromY2 = null;
	
	this.draggingBed = null;

	this.dragSnap = this.snapCellSize / 4;

	this.hideToolTipTimeout = null;
	this.pendingImg = null;

	this._oldTool = null;

	this.resizeBoxSize = 8;
	this.resizeBox = null;
	this.rotateBox = null;
	this.resizeBox2 = null;
	this.boxedElement = null;
	this.oldTool = null;
	this.boxResizing = false;
	this.boxStartX = 0;
	this.boxStartY = 0;
	this.boxStartA = 0;
	this.boxCenterX = 0;
	this.oxCenterY = 0;
	this.currentBox = null;

	this.cm_group = null;
	this.cm_contextMenu = null;
	this.cm_finishItem = null;
	this.cm_currentContextElement = null;
	this.firstClick = true;
	this.currentShape = null;
	this.currentRect = null;
	this.shapes = [];
	this.removedAreas = [];
	this.cursorOff = 3;
	this.cm_activated = false;
	
	this.changedDocument = null;
	this.changedFragment = null;
	
	this._oninfoID = null;
	this._leftColumn = null;
	
	this._areasEnabled = true; // #1046
}

var proto = CN_floorplanner.prototype;
proto._tagPrefix = "floorplanner";

proto.onchange = null;

proto.createElement = function(node, parentElement)
{
	var l = document.createElement("div");
	parentElement.appendChild(l);

	this.element = l;
	l.jsObject = this;
	
	l.className = "cn_floorplanner";

	var attr = node.getAttribute('areasEnabled');
	if(attr !== null) this._areasEnabled = attr == "true";

	this._cloneTool("AreaPointerTool");
	this._cloneTool("LineTool");
	this._cloneTool("PointerTool");

	this.changedDocument = new ActiveXObject("Microsoft.XMLDOM");
	this.changedFragment = this.changedDocument.createDocumentFragment();
	
	this.element_oncontentready(node);
	this.list_createContextMenu();	
	
	l.attachEvent("ondragstart", CNUtil.cancelEvent);
	l.attachEvent("onselectstart", CNUtil.cancelEvent);
	l.attachEvent("oncontextmenu", CNUtil.cancelEvent);
	l.attachEvent("onresize", this._element_onresize);
	

	return l;
}

proto._cloneTool = function(toolName)
{
	this[toolName] = CNUtil.cloneObject(this["_" + toolName]);
	this[toolName].jsObject = this;
}

proto.unload = function()
{
	this.cm_cleanRects();

	if(this._zoomCombo) CNFormManager.destroyJSObject(this._zoomCombo);
	if(this.contextMenu) this.contextMenu.destroy();
	if(this.cm_contextMenu) this.cm_contextMenu.destroy();
	if(this.list_contextMenu) this.list_contextMenu.destroy();
	
	this._destroyTool(this.AreaPointerTool);
	this._destroyTool(this.LineTool);
	this._destroyTool(this.PointerTool);		

	if(this._list) this._list.destroy();

	this._destroyTool(this);
}

proto._destroyTool = function(tool)
{
	for(var i in tool) tool[i] = null;
}

proto.oninfo = function(ev)
{
	this._oninfoID = ev.elementID
	this.formManager.postData(this.element);
}
proto.loadData = function(node)
{
	var attr = node.getAttribute("readOnly");
	if(attr == "true") this.set_readOnly(true);
	else if(attr == "false") this.set_readOnly(false);

	this.changedFragment = this.changedDocument.createDocumentFragment();
	this._oninfoID = null;

	var obj = this;
	setTimeout(function(){ obj.loadVML(node); });
}

proto.storeData = function(xmldoc)
{
	var data = this.changedFragment.cloneNode(true);

	var planNode = this.changedDocument.createElement(this._tagPrefix + "plan");
	data.appendChild(planNode);

	var vml = this.get_Vml();
	var cdata = this.changedDocument.createCDATASection(vml);
	planNode.appendChild(cdata);
	
	if(this._oninfoID)
	{
		var infoNode = this.changedDocument.createElement(this._tagPrefix + "info");
		infoNode.setAttribute("areaID", this._oninfoID);
		this._oninfoID = null;
		data.appendChild(infoNode);
	}

	return data;
}

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
	this.toolbarDiv.disabled = this._readOnly;
	if(this._readOnly)
	{
		this.toolbarDiv._filter = this.toolbarDiv.currentStyle.filter;
		this.toolbarDiv.style.filter = this.toolbarDiv.currentStyle.filter + " alpha(opacity=50)";
		
		this.lowerToolbar._filter = this.lowerToolbar.currentStyle.filter;
		this.lowerToolbar.style.filter = this.lowerToolbar.currentStyle.filter + " alpha(opacity=50)";
	}
	else
	{
		if(this.toolbarDiv._filter) this.toolbarDiv.style.filter = this.toolbarDiv._filter;
		if(this.lowerToolbar._filter) this.lowerToolbar.style.filter = this.lowerToolbar._filter;		
	}
}

proto.get_scrollPosition = function()
{
	return this.scrollDiv.scrollLeft + "," + this.scrollDiv.scrollTop;
}


proto.set_scrollPosition = function(val)
{
	this._scrollPosition = val
	if(this.isReady) this._set_scrollPosition(val);
}
proto._set_scrollPosition = function()
{
	var xy = this._scrollPosition.split(",");
	this.scrollDiv.scrollLeft = parseInt(xy[0], 10);
	this.scrollDiv.scrollTop = parseInt(xy[1], 10);
}

proto._filterVML = function(vml)
{
	vml = vml.replace(/(^\<\?xml\:namespace[^>]*\>)|(\<v\:fill\>\<\/v\:fill\>)|(\<v\:stroke\>\<\/v\:stroke\>|(\s*DISPLAY\:\sblock\;\s*))|(\_?(markerArea|startArea)\:\s\[object\](\;)?\s*)|(_?strokeWeight\:\snull(\;)?\s*)|((isNew|cursor|weight|snapX|snapY|type|originalWidth|originalHeight|hSnapZoom|vSnapZoom|_canDelete): [\d\w\.]+;?\s*)|((unselectable)="[^"]*")/ig, "");
	vml = vml.replace(/(style=""\s*)|tipText="[^"]*"|id=[\w\d-]+\s/ig, "");
	// Add quotes around ids.
	///vml = vml.replace(/id=([\d\w]+)/ig, "id=\"$1\"");
	return vml;
}


proto.get_Vml = function()
{
	//var oldZoom = this.zoomFactor;
	this.zoom(100);
	this._zoomCombo.set_selectedIndex(3);

	if(this.currentTool && this.currentTool.handle_toolunselected) this.currentTool.handle_toolunselected();

	var vml = String(this.group.outerHTML);

	vml = this._filterVML(vml);
	// Filter VML.
	//vml = vml.replace(/(^\<\?xml\:namespace[^>]*\>)|(\<v\:fill\>\<\/v\:fill\>)|(\<v\:stroke\>\<\/v\:stroke\>|(\s*DISPLAY\:\sblock\;\s*))|(\_?(markerArea|startArea)\:\s\[object\](\;)?\s*)|(_?strokeWeight\:\snull(\;)?\s*)|((isNew|cursor|weight): [\d\w\.]+;?\s*)|((unselectable)="[^"]*")/ig, "");
	//vml = vml.replace(/(style=""\s*)/ig, "");
	// Add quotes around ids.
	//vml = vml.replace(/id=([\d\w]+)/ig, "id=\"$1\"");
	
	var groupTag = "<v:group";
	var groupTagEndPos = vml.indexOf(groupTag) + groupTag.length;
	vml = vml.substring(0, groupTagEndPos) + "  xmlns:v=\"urn:schemas-microsoft-com:vml\"" + vml.substr(groupTagEndPos);

	/*
	var tempXml = document.createElement("xml");
	this.element.appendChild(tempXml);
	
	var tempDoc = tempXml.XMLDocument;
	tempDoc.async = false;
	tempDoc.loadXML(vml);
	
	if(tempDoc.parseError.errorCode != 0)
	{
  		alert("Can't parse vml: at line " + tempDoc.parseError.line + ": " + tempDoc.parseError.reason);
		return vml;
	}
	
	var lines = tempDoc.documentElement.selectNodes("v:line");
	for(var i = 0; i < lines.length; i++)
	{
		var line = lines[i];
		if(line.getAttribute("from") == line.getAttribute("to"))
		{
			line.parentNode.removeChild(line);
		}
	}

	vml = tempDoc.xml;
	
	tempXml.removeNode();
	*/

	if(this.currentTool && this.currentTool.handle_toolselected) this.currentTool.handle_toolselected();
	
	//this.zoom(oldZoom * 100);
	
	return vml;
}

proto.element_oncontentready = function(node)
{
	this.element.unselectable = "on";
	this.element.style.cursor = "default";
	
	this.scrollDiv = document.createElement("div");
	this.scrollDiv.style.position = "relative";
	this.scrollDiv.style.overflow = "auto";
	this.element.appendChild(this.scrollDiv);

	this.drawingArea = document.createElement("div");
	this.drawingArea.className = "drawingArea";
	this.drawingArea.style.position = "relative";
	this.scrollDiv.appendChild(this.drawingArea);
	
	this.group = document.createElement("v:group");
	this.group.style.position = "absolute";
	this.group.style.left = 0;
	this.group.style.top = 0;
	this.group.style.zIndex = 20;
	
	this.drawingArea.appendChild(this.group);

	this.cm_initGroup();
	
	this.disabler = document.createElement('<div style="position: absolute; background: white; z-index: 1000; filter: alpha(opacity=50); width: 100%; height: 100%; visibility: hidden; top: 0px; left: 0px; ">');
	this.element.appendChild(this.disabler);

	this.calcElementOffset();

	this.createContextMenu();

	this.postInit(node);
}

proto.postInit = function(node)
{
	var w, h;
	w = this.element.offsetWidth;
	h = this.element.offsetHeight;

	this.scrollDiv.style.width = w;
	this.scrollDiv.style.height = h;
	
	// Do it right after correct w and h have been writen into scrollDiv.
	this.updateCanvasSize();
	this.group.coordsize = this.canvasWidth + ", " + this.canvasHeight;
	
	// NOTE: align coordstart to grid.
	if(this._scrollPosition)
	{
		this._set_scrollPosition();
	}
	else
	{
		this.scrollDiv.scrollLeft = Math.round(((this.canvasWidth - w) / 2) / this.snapCellSize) * this.snapCellSize;
		this.scrollDiv.scrollTop = Math.round(((this.canvasHeight - h) / 2) / this.snapCellSize) * this.snapCellSize;
	}

	this.createToolbar(node);

	this.createBoxes();

	this._set_readOnly();

	this.drawingArea.attachEvent("onmousedown", this._drawingArea_onmousedown);

	this.cm_initAreaCreationMode();	
	
	this.isReady = true;
}

/*proto._loadVML_TO = function()
{
	var obj = this;
	setTimeout(function(){ obj.loadVML(); }, 0);	
}*/


proto.list_createContextMenu = function()
{
	this.list_contextMenu = new PopupMenu(document.body);
	this.list_contextMenu.element.style.width = "180px";
	this.list_contextMenu.parentJSObject = this;

	var item = this._list_renameItem = this.list_contextMenu.createItem("Rename");
	item.onmenuclick = this._rename_onxlclick;

	this.list_contextMenu.createHR();
	item = this.list_contextMenu.createItem("Delete", CNFormManager.neutralIconsPath + "delete.gif");
	item.onmenuclick = this._listItemDelete_onxlclick;
}

proto._listItemDelete_onxlclick = function()
{
	CNUtil.findJSObject(event.srcElement).parentJSObject.listItemDelete_onxlclick();
}
proto.listItemDelete_onxlclick = function()
{
	var shapeId = this.currentContextElement._shapeId;
	var shape = this.cm_group.children[shapeId];
	this._cm_deleteShape(shape);
}



proto.updateCanvasSize = function()
{
	this.drawingArea.style.width = this.canvasWidth * this.zoomFactor;
	this.drawingArea.style.height = this.canvasHeight * this.zoomFactor;
	this.group.style.width = this.canvasWidth * this.zoomFactor;
	this.group.style.height = this.canvasHeight * this.zoomFactor;

	this.cm_updateCanvasSize();
}

proto.loadVML = function(node)
{
	var vmlxml = null;
	var plan = node.selectSingleNode("plan");
	if(plan) vmlxml = plan.text;
	else
	{
		var noplan = node.selectSingleNode("noplan");
		if(noplan) vmlxml = "";
	}

	//var oldZoom = this.zoomFactor;
	this.zoom(100);
	this._zoomCombo.set_selectedIndex(3);

	if(this._areasEnabled) this.cm_loadAreas(node);
	
	if(vmlxml == "") this.group.innerHTML = "";
	else if(vmlxml !== null)
	{
		var div = document.createElement("div");
		div.innerHTML = vmlxml;
		this.group.innerHTML = div.firstChild.innerHTML;
	
		var children = this.group.children;
		var childrenCount = children.length;
		for(var i = 0; i < childrenCount; i++)
		{
			var item = children[i];
			item.style.visibility = "visible";
	
			if(item.tagName == "group")
			{
				this.attachImageEvents(item);
				var val;
				val = item.style.snapX;
				if(val) item.style.snapX = parseInt(val, 10);
				val = item.style.snapY;
				if(val) item.style.snapY = parseInt(val, 10);
	
				val = item.style.hSnapZoom;
				if(val) item.style.hSnapZoom = parseInt(val, 10);
				val = item.style.vSnapZoom;
				if(val) item.style.vSnapZoom = parseInt(val, 10);
			}
			else if(item.tagName == "line")
			{
				item.style.weight = parseInt(item.strokeWeight);
				this.LineTool.attachLineEvents(item);
			}
			else
			{
				alert("Unknown element: " + item.tagName);
				return;
			}
		}
	}
		
	var attr = node.getAttribute("scrollPosition");
	if(attr) this.set_scrollPosition(String(attr));
	
	//this.zoom(oldZoom * 100);	
}

proto.createContextMenu = function()
{
	this.contextMenu = new PopupMenu(document.body);
	this.contextMenu.element.style.width = "180px";
	this.contextMenu.parentJSObject = this;

	var item;
	
	item = this.contextMenu.createItem("Reset size");
	item.onmenuclick = this._item_resetsize_onxlclick;

	item = this.contextMenu.createItem("Reset rotation");
	item.onmenuclick = this._item_resetrotation_onxlclick;

	item = this.contextMenu.createItem("Flip vertical");
	item.onmenuclick = this._item_flipvertical_onxlclick;

	item = this.contextMenu.createItem("Flip horizontal");
	item.onmenuclick = this._item_fliphorizontal_onxlclick;

	this.contextMenu.createHR();

	item = this.contextMenu.createItem("Delete", CNFormManager.neutralImagesPath + "delete.gif");
	item.onmenuclick = this._item_delete_onxlclick;
}

proto.fire_onchange = function(type, shape)
{
	if(this.onchange) 
	{
		var ev = {type: type, shape: shape};
		this.onchange(ev);
	}
}


// Tools ==============================================
proto.cmdChangeTool = function(tool)
{
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

proto.cmdChangeWeight = function(weight)
{
	this.currentWeight = weight;
}

proto.cmdChangeLineStyle = function(value)
{
	this.currentLineStyle = value;
}

proto.cmdChangeEndcap = function(value)
{
	this.currentEndcap = value;
}

proto.cmdChangeDashstyle = function(value)
{
	this.currentDashstyle = value;
}

proto.cmdChangeColor = function(color)
{
	this.currentColor = color;
	if(this.currentTool && this.currentTool.handle_changecolor) this.currentTool.handle_changecolor();
}

proto._PointerTool =
{
	handle_mousedown: function(){},
	handle_mousemove: function(){},
	handle_mouseup: function(){}
}


// Line tool ======================================================================
proto._LineTool = 
{
	_name: "LineTool",
	_currentLine: null,
	_cursor: null, 
	_cursorVisible: false,
	_cursorXOff: 2,
	_cursorYOff: 2,
	_active: false,

	createCursor: function(cursorImg)
	{
		if(this._cursor != null) this.destroyCursor();
		var l = this._cursor = document.createElement("img");
		this.jsObject.drawingArea.appendChild(l);

		l.src = CNFormManager.neutralImagesPath + cursorImg;
		l.style.position = "absolute";
		l.style.zIndex = 1000;		
		l.style.visibility = "hidden";
		l.attachEvent("oncontextmenu", this.jsObject._LineTool_cursor_oncontextmenu);
		
		this.jsObject.drawingArea.attachEvent("onmouseenter", this.jsObject._LineTool_drawingArea_onmouseenter_cursor);		
		this.jsObject.scrollDiv.attachEvent("onscroll", this.jsObject._LineTool_drawingArea_onmousemove_cursor);
	},

	destroyCursor: function()
	{
		var l = this._cursor;
		if(!l) return;
		l.removeNode();
		this._cursor = null;
	},
	
	showCursor: function()
	{
		if(this._cursorVisible) return;
		var l = this._cursor;

		this.jsObject.calcElementOffset();

		l.style.visibility = "visible";
		this._cursorVisible = true;

		this.jsObject.element.attachEvent("onmouseleave", this.jsObject._LineTool_drawingArea_onmouseleave_cursor);
		this.jsObject.element.attachEvent("onmousemove", this.jsObject._LineTool_drawingArea_onmousemove_cursor);
	},
	
	hideCursor: function()
	{
		if(!this._cursorVisible) return;
		var l = this._cursor;
		l.style.visibility = "hidden";
		this._cursorVisible = false;

		this.jsObject.element.detachEvent("onmouseleave", this.jsObject._LineTool_drawingArea_onmouseleave_cursor);
		this.jsObject.element.detachEvent("onmousemove", this.jsObject._LineTool_drawingArea_onmousemove_cursor);
	},
	
	drawingArea_onmouseenter_cursor: function()
	{
		if(this.jsObject._readOnly || this.jsObject.group.disabled || !this._active) return;
		this.showCursor();
	},
	
	drawingArea_onmouseleave_cursor: function()
	{
		if(this.jsObject._readOnly || this.jsObject.group.disabled || !this._active) return;
		this.hideCursor();
	},

	// Zoomed.
	drawingArea_onmousemove_cursor: function()
	{
		if(this.jsObject._readOnly || this.jsObject.group.disabled) return;
		var l = this._cursor;
		var x = event.clientX - this.jsObject.offX - this._cursorYOff + this.jsObject.scrollDiv.scrollLeft;
		var y = event.clientY - this.jsObject.offY - this._cursorYOff + this.jsObject.scrollDiv.scrollTop;
		
		// Snap to grid.
		x = Math.round(x / this.jsObject.snapCellSize) * this.jsObject.snapCellSize;
		y = Math.round(y / this.jsObject.snapCellSize) * this.jsObject.snapCellSize;		

		this._x = x;
		this._y = y;

		l.style.left = (x - l.offsetWidth / 2);
		l.style.top = (y - l.offsetHeight / 2);
	},
	

	handle_toolselected: function()
	{
		this._active = true;
		if(this._cursor == null) this.createCursor("snap-cursor-1.gif");
		this._cursor.style.visibility = "visible";
	},

	handle_toolunselected: function()
	{
		if(this._cursor != null) 
		{
			this._cursor.style.visibility = "hidden";
			this._active = false;
		}
	},

	handle_mousedown: function()
	{
		if(this.jsObject._readOnly) return;
		this.finishLine();
		
		var l = this._currentLine = document.createElement("v:line");
		
		var stroke = document.createElement("v:stroke");
		l.style.weight = this.jsObject.currentWeight;

		stroke.weight = this.jsObject.currentWeight * this.jsObject.zoomFactor;

		stroke.endcap = this.jsObject.currentEndcap;
		stroke.linestyle = this.jsObject.currentLineStyle;
		stroke.color = this.jsObject.currentColor;
		stroke.dashstyle = this.jsObject.currentDashstyle;
		
		this._currentLine.appendChild(stroke);

		var x = this._x / this.jsObject.zoomFactor;
		var y = this._y / this.jsObject.zoomFactor;

		this._currentLine.from = x + "," + y;
		this._currentLine.to = x + "," + y;
		l.coordsize = this.jsObject.group.coordsize;
		this.jsObject.group.appendChild(this._currentLine);
		
		this.jsObject.drawingArea.setCapture();
	},
	handle_mousemove: function()
	{
		if(this.jsObject._readOnly) return;
		if(!this._currentLine) return;
		try
		{
			this._currentLine.to = this._x / this.jsObject.zoomFactor + "," + this._y / this.jsObject.zoomFactor;
		}
		catch(e)
		{
			alert(this._x + " " + this.jsObject.zoomFactor);
		}
	},
	handle_mouseup: function()
	{
		if(this.jsObject._readOnly) return;
		var c = this.jsObject.drawingArea.componentFromPoint(event.clientX, event.clientY)
		if(c.indexOf("scroll") != -1 || c == "outside") return;
		
		this.finishLine();
	},

	finishLine: function()
	{
		var l = this._currentLine;
		if(!l) return;
		this.attachLineEvents(l);
		
		this.jsObject.drawingArea.releaseCapture();
		
		this.jsObject.fire_onchange("finishLine");

		this._currentLine = null;
	},

	cursor_oncontextmenu: function()
	{
		if(this.jsObject._readOnly) return;
		this._cursor.style.visibility = "hidden";

		var l = document.elementFromPoint(event.clientX, event.clientY);

		this._cursor.style.visibility = "visible";		

		if(l) l.fireEvent("oncontextmenu");
	},
	
	attachLineEvents: function(l)
	{
		if(!l) return;
		l.attachEvent("oncontextmenu", this.jsObject._shape_oncontextmenu);
		l.attachEvent("onmouseenter", this.jsObject._line_onmouseenter);
		l.attachEvent("onmouseleave", this.jsObject._line_onmouseleave);
		l.attachEvent("onmousedown", this.jsObject._line_onmousedown);
	}
}

proto._LineTool_drawingArea_onmouseenter_cursor = function()
{ 
	var jso = CNUtil.dispatchObject();
	if(jso && jso._isFloorPlanner) jso.LineTool.drawingArea_onmouseenter_cursor(); 
}
proto._LineTool_drawingArea_onmouseleave_cursor = function()
{ 
	var jso = CNUtil.dispatchObject();
	if(jso && jso.LineTool) jso.LineTool.drawingArea_onmouseleave_cursor(); 
}
proto._LineTool_drawingArea_onmousemove_cursor = function()
{ 
	var jso = CNUtil.dispatchObject();
	if(jso && jso._isFloorPlanner) jso.LineTool.drawingArea_onmousemove_cursor(); 
}
proto._LineTool_drawingArea_onmousedown_cursor = function(){ CNUtil.dispatchObject().LineTool.drawingArea_onmousedown_cursor(); }
proto._LineTool_cursor_oncontextmenu = function(){ CNUtil.dispatchObject().LineTool.cursor_oncontextmenu(); }
		
proto._line_onmouseenter = function()
{
	CNUtil.dispatchObject().line_onmouseenter();
}
proto.line_onmouseenter = function()
{
	if(this.group.disabled || this.currentTool != this.PointerTool) return;

	var l = CNUtil.findTag(event.srcElement, "line");
	this.attachBoxes(l);
}

proto._line_onmouseleave = function()
{
	CNUtil.dispatchObject().line_onmouseleave();
}
proto.line_onmouseleave = function()
{
	if(this.group.disabled || this.currentTool != this.PointerTool) return;
		
	this.tryToDetachBoxes();
}

proto._line_onmousedown = function()
{
	CNUtil.dispatchObject().line_onmousedown();
}
proto.line_onmousedown = function()
{
	if(this.group.disabled || this.currentTool != this.PointerTool) return;
		
	var l = CNUtil.findTag(event.srcElement, "line");
	this.beginDrag(l);
}


proto._shape_oncontextmenu = function()
{
	CNUtil.dispatchObject().shape_oncontextmenu();
}
proto.shape_oncontextmenu = function()
{
	if(this._readOnly) return;
	this.currentContextElement = event.srcElement;
	if(this.currentContextElement.tagName != "line")
	{
		this.currentContextElement = CNUtil.findTag(this.currentContextElement, "group");
	}

	this.contextMenu.show(event.clientX + document.body.scrollLeft, event.clientY + document.body.scrollTop);
	CNUtil.cancelEvent();
}

proto._item_info_onxlclick = function()
{
	CNUtil.dispatchObject().parentJSObject.item_info_onxlclick();
}
proto.item_info_onxlclick = function()
{
	this.showInfo(this.currentContextElement);
}

proto.showInfo = function(l)
{
	var ev = {};
	ev.elementID = String(l.getAttribute("id"));
	ev.element = l;
	if(this.oninfo) this.oninfo(ev);
}

proto._item_delete_onxlclick = function()
{
	CNUtil.dispatchObject().parentJSObject.item_delete_onxlclick();
}
proto.item_delete_onxlclick = function()
{
	this.currentContextElement.removeNode(true);
	this.fire_onchange("delete", this.currentContextElement);
	this.currentContextElement = null;
	CNUtil.cancelEvent();
}

proto._item_resetsize_onxlclick = function()
{
	CNUtil.dispatchObject().parentJSObject.item_resetsize_onxlclick();
}
proto.item_resetsize_onxlclick = function()
{
	var l = this.currentContextElement;
	if(l.tagName == "group" && l.style.originalWidth)
	{
		var img = l.children.tags("image")[0];
		img.style.width = l.style.originalWidth;
		img.style.height = l.style.originalHeight;

		l.style.width = l.style.originalWidth;
		l.style.height = l.style.originalHeight;
		l.style.hSnapZoom = 1;
		l.style.vSnapZoom = 1;
		l.coordsize = l.style.originalWidth + "," + l.style.originalHeight;
		
		this.fire_onchange("resetSize", l);
	}
}

proto._item_resetrotation_onxlclick = function()
{
	CNUtil.dispatchObject().parentJSObject.item_resetrotation_onxlclick();
}
proto.item_resetrotation_onxlclick = function()
{
	var l = this.currentContextElement;
	if(l.tagName == "group")
	{
		l.style.rotation = 0;
		this.fire_onchange("resetRotation", l);
	}
}

proto._item_flipvertical_onxlclick = function()
{
	CNUtil.dispatchObject().parentJSObject.item_flipvertical_onxlclick();
}
proto.item_flipvertical_onxlclick = function()
{
	var l = this.currentContextElement;
	if(l.tagName == "group")
	{
		if(!l.style.flip || l.style.flip == "") l.style.flip = "y";
		else if(l.style.flip.indexOf("y") == -1) l.style.flip += " y";
		else l.style.flip = l.style.flip.replace("y", "");
		l.style.flip = CNUtil.chop(l.style.flip);
		this.fire_onchange("flipVertical", l);
	}
}

proto._item_fliphorizontal_onxlclick = function()
{
	CNUtil.dispatchObject().parentJSObject.item_fliphorizontal_onxlclick();
}
proto.item_fliphorizontal_onxlclick = function()
{
	var l = this.currentContextElement;
	if(l.tagName == "group")
	{
		if(!l.style.flip || l.style.flip == "") l.style.flip = "x";
		else if(l.style.flip.indexOf("x") == -1) l.style.flip += " x";
		else l.style.flip = l.style.flip.replace("x", "");
		l.style.flip = CNUtil.chop(l.style.flip);
		this.fire_onchange("flipHorizontal", l);
	}
}



// Toolbar. ===========================================

proto.layoutElements = function()
{
	if(this.element.offsetHeight < 16) return;

	var offsetLeft = this._leftColumn.offsetWidth;
	var clientWidth = this.element.clientWidth - offsetLeft;

	this.scrollDiv.style.left = offsetLeft;
	this.lowerToolbar.style.left = 0;
		
	this.scrollDiv.style.width = clientWidth - this.toolbarDiv.offsetWidth;
	this.toolbarDiv.style.left = this.element.clientWidth - this.toolbarDiv.offsetWidth;
	
	this.lowerToolbar.style.width = this.element.clientWidth;
	this.lowerToolbar.style.top = this.element.clientHeight - this.lowerToolbar.offsetHeight;

	var h = this.scrollDiv.style.height = this.element.clientHeight - this.lowerToolbar.offsetHeight
	this.toolbarDiv.style.height = h;	
	
	this._leftColumn.style.height = h;
}

proto.createPad = function(x, y)
{
	var pad = document.createElement("div");
	pad.style.position = "absolute";
	pad.style.left = x;
	pad.style.top = y;
	pad.style.textAlign = "center";
	pad.style.width = this.toolbarWidth + 2;
	this.toolbarDiv.appendChild(pad);
	return pad;
}

proto._list_onitemselected = function(ev)
{
	var jso = CNUtil.findJSObject(this.element.parentElement);
	var shape = jso.cm_group.children[ev.item._shapeId];
	jso._selectShapes([shape]);
}

proto._list_onitemrenamed = function(ev)
{
	var jso = CNUtil.findJSObject(this.element.parentElement);
	var shape = jso.cm_group.children[ev.item._shapeId];
	shape.style._name = ev.name;

	var id = shape.id;
	var node = jso.changedFragment.selectSingleNode("floorplannernewarea[@areaID='" + id + "']");
	if(!node)
	{
		node = jso.changedDocument.createElement("floorplannernewarea");
		jso.changedFragment.appendChild(node);
		node.setAttribute("areaID", id);
		node.setAttribute("path", shape.path);
	}
	node.setAttribute("name", ev.name);
}

proto.createToolbar = function()
{
	this._leftColumn = document.createElement("<div style='position: absolute; top: 0px; left: 0px; '>");
	this.element.appendChild(this._leftColumn);

	if(this._areasEnabled) { // #1046
		this._leftColumn.style.width = 140;	
		this._leftColumn.style.height = 100;
		this._list = new CNList(this._leftColumn);
		this._list.setHeader("Areas");
		this._list.element.attachEvent("oncontextmenu", this._list_oncontextmenu);
		this._list.onitemselected = this._list_onitemselected;
		this._list.onitemrenamed = this._list_onitemrenamed;
	} else {
		this._leftColumn.style.display = "none";
	}
	
	var div = this.toolbarDiv = document.createElement("div");
	div.className = "canvasToolbar";
	div.unselectable = "on";
	div.style.padding = "2px";
	div.style.position = "absolute";
	div.style.width = this.toolbarWidth * 2 + 3;
	div.style.height = this.element.clientHeight;
	div.style.left = this.element.clientWidth - this.toolbarWidth;
	div.style.top = 0;
	div.align = "center";
	
	div.style.cursor = "default";
	this.element.appendChild(div);
	
	var pad = this.createPad(0, 0);
	pad.id = "toolsPad";

	this.pointerToolButton = this.createButton(pad, "pointer-1.gif", "Pointer tool", true, "tool", "cmdChangeTool", this.PointerTool);
	if(this._areasEnabled) this.cmPointerToolButton = this.createButton(pad, "cm-pointer-1.gif", "Area pointer tool", true, "tool", "cmdChangeTool", this.AreaPointerTool);
	this.lineToolButton = this.createButton(pad, "linetool-1.gif", "Line tool", true, "tool", "cmdChangeTool", this.LineTool, true);
	
	this.cmdChangeTool(this.LineTool);
	
	pad = this.createPad(0, pad.offsetTop + pad.offsetHeight + 8);
	this.createButton(pad, "line-1.gif", "1px line weight", true, "lineWeight", "cmdChangeWeight", 1);
	this.createButton(pad, "line-2.gif", "2px line weight", true, "lineWeight", "cmdChangeWeight", 2);
	this.createButton(pad, "line-3.gif", "3px line weight", true, "lineWeight", "cmdChangeWeight", 3);
	this.createButton(pad, "line-4.gif", "4px line weight", true, "lineWeight", "cmdChangeWeight", 4);
	this.createButton(pad, "line-5.gif", "5px line weight", true, "lineWeight", "cmdChangeWeight", 5, true);
	this.createButton(pad, "line-8.gif", "8px line weight", true, "lineWeight", "cmdChangeWeight", 8);
	this.createButton(pad, "line-9.gif", "9px line weight", true, "lineWeight", "cmdChangeWeight", 9);

	pad = this.createPad(0, pad.offsetTop + pad.offsetHeight + 8);
	this.createButton(pad, "black-1.gif", "", true, "color", "cmdChangeColor", "black", true);
	this.createButton(pad, "green-1.gif", "", true, "color", "cmdChangeColor", "green");
	this.createButton(pad, "blue-1.gif", "", true, "color", "cmdChangeColor", "blue");
	this.createButton(pad, "red-1.gif", "", true, "color", "cmdChangeColor", "red");
	this.createButton(pad, "eeeeee-1.gif", "", true, "color", "cmdChangeColor", "#eeeeee");
	this.createButton(pad, "aaaaaa-1.gif", "", true, "color", "cmdChangeColor", "#aaaaaa");
	this.createButton(pad, "888888-1.gif", "", true, "color", "cmdChangeColor", "#888888");
	this.createButton(pad, "555555-1.gif", "", true, "color", "cmdChangeColor", "#555555");

	pad = this.createPad(this.toolbarWidth, 0);	
	this.createButton(pad, "line-style-single-1.gif", "Single line style", true, "lineStyle", "cmdChangeLineStyle", "single", true);
	this.createButton(pad, "line-style-thinthick-1.gif", "Thin-thick line style", true, "lineStyle", "cmdChangeLineStyle", "thinthick");
	this.createButton(pad, "line-style-thinthin-1.gif ", "Thin-thin line style", true, "lineStyle", "cmdChangeLineStyle", "thinthin");
	this.createButton(pad, "line-style-thickbetweenthin-1.gif ", "Thick-between-thin line style", true, "lineStyle", "cmdChangeLineStyle", "thickbetweenthin");

	pad = this.createPad(this.toolbarWidth, pad.offsetTop + pad.offsetHeight + 8);
	this.createButton(pad, "line-endcap-flat-1.gif", "Flat endcap", true, "endCap", "cmdChangeEndcap", "flat");
	this.createButton(pad, "line-endcap-round-1.gif", "Round endcap", true, "endCap", "cmdChangeEndcap", "round", true);

	pad = this.createPad(this.toolbarWidth, pad.offsetTop + pad.offsetHeight + 8);
	this.createButton(pad, "dashstyle-solid-1.gif", "Solid dash style", true, "endCap", "cmdChangeDashstyle", "solid");
	this.createButton(pad, "dashstyle-dot-1.gif", "Dot dash style", true, "endCap", "cmdChangeDashstyle", "dot");
	this.createButton(pad, "dashstyle-dash-1.gif", "Dash dash style", true, "endCap", "cmdChangeDashstyle", "dash");
	this.createButton(pad, "dashstyle-dashdot-1.gif", "Dashdot dash style", true, "endCap", "cmdChangeDashstyle", "dashdot");
	this.createButton(pad, "dashstyle-longdash-1.gif", "Longdash dash style", true, "endCap", "cmdChangeDashstyle", "longdash");
	this.createButton(pad, "dashstyle-longdashdot-1.gif", "Longdashdot dash style", true, "endCap", "cmdChangeDashstyle", "longdashdot");
	this.createButton(pad, "dashstyle-longdashdotdot-1.gif", "Longdashdotdot dash style", true, "endCap", "cmdChangeDashstyle", "longdashdotdot");
	

	var div = this.lowerToolbar = document.createElement("div");
	div.className = "canvasToolbar";
	div.style.borderLeft = 0;
	div.unselectable = "on";
	div.style.padding = "4px";
	div.style.position = "absolute";
	div.style.height = this.toolbarWidth * 2;
	div.style.left = 0;
	div.style.cursor = "default";
	this.element.appendChild(div);
	
	var p = CNFormManager.neutralImagesPath;
	div.appendChild(this.createDraggableButton(p + "door-1.emz", "Door", this.toolbarWidth * 2.15, this.toolbarWidth  * 2.15, 1, 20, 38.3));
	div.appendChild(this.createDraggableButton(p + "double-1.emz", "Double door", this.toolbarWidth * 2.7, this.toolbarWidth * 1.8, 1, this.toolbarWidth * 2.7 / 2, 32.3));
	div.appendChild(this.createDraggableButton(p + "window-1.emz", "Window", this.toolbarWidth * 2, this.toolbarWidth * 0.4 , 1, this.toolbarWidth, 4));	
	div.appendChild(this.createDraggableButton(p + "window-2.emz", "Glider window", this.toolbarWidth * 2.4, this.toolbarWidth * 0.4 , 1, this.toolbarWidth, 4));
	div.appendChild(this.createDraggableButton(p + "opening-1.emz", "Opening", this.toolbarWidth * 2.8, this.toolbarWidth * 0.35 , 1, this.toolbarWidth * 1.4, 3.4));

	var separator = document.createElement("<span class=toolBarVerticalSeparator>");
	div.appendChild(separator);

	this._createZoomCombo(div);
	
	//this.layoutElements();
}

proto._createZoomCombo = function(div)
{
	var zoomCombo = this._zoomCombo = new CN_combobox();
	var zoomValues = ["25%", "50%", "75%", "100%", "125%", "150%", "175%", "200%", "250%", "300%"];
	var options = [];
	for(var i = 0; i < zoomValues.length; i++)
	{
		var option = {text: zoomValues[i], value: zoomValues[i]};
		options[options.length] = option;
	}
	var combo = zoomCombo.createElement(options, div)
	combo.title = "Zoom";
	combo.style.position = "absolute";
	combo.style.right = "4px";
	combo.style.top = "17px";
	zoomCombo.set_selectedIndex(3);
	zoomCombo.onchange = this._zoomCombo_onxlchanged;
}  


proto._zoomCombo_onxlchanged = function(ev)
{
	// Executed in combobox context.
	CNUtil.findJSObject(this.element.parentElement).zoomCombo_onxlchanged(ev);
}
proto.zoomCombo_onxlchanged = function(ev)
{
	if(!this.isReady) return;
	this.zoom(ev.value);
}

proto.zoom = function(value)
{
	var newZoomFactor = parseInt(value) / 100;
	if(this.zoomFactor == newZoomFactor) return;

	var oldTool = this.currentTool;
	this.cmdChangeTool(this.PointerTool);

	this.zoomFactor = newZoomFactor;

	var scrollRatioX = this.drawingArea.clientWidth / (this.scrollDiv.scrollLeft + this.scrollDiv.offsetWidth / 2);
	var scrollRatioY = this.drawingArea.clientHeight / (this.scrollDiv.scrollTop + this.scrollDiv.offsetHeight / 2);
	
	this.updateCanvasSize();	

	var lines = this.group.children.tags("line");
	var lineCount = lines.length;
	for(var i = 0; i < lineCount; i++)
	{
		var line = lines[i];
		var weight = line.style.weight;
		if(weight == null) 
		{
			weight = parseInt(line.strokeWeight);
			line.style.weight = weight;
		}
		line.strokeweight = weight * this.zoomFactor;
	}
	
	this.scrollDiv.scrollLeft = this.drawingArea.clientWidth / scrollRatioX - this.scrollDiv.offsetWidth / 2;
	this.scrollDiv.scrollTop = this.drawingArea.clientHeight / scrollRatioY - this.scrollDiv.offsetHeight / 2;

	if(value == 100) this._zoomCombo.set_selectedIndex(3);

	if(oldTool) this.cmdChangeTool(oldTool);
}

proto.createButton = function(pad, img, title, isPushable, group, cmd, param, isDefault)
{
	var b = document.createElement("img");
	pad.appendChild(b);
	b.alt = title;
	b.isButton = true;
	b.className = "button_normal";
	b.unselectable = "on";
	b.src = CNFormManager.neutralImagesPath + img;
	b.isPushable = isPushable;
	b.img = img;
	b.cmd = cmd;
	b.param = param;
	b.state = "normal";
	b.attachEvent("onmouseenter", this._button_onmouseenter);
	b.attachEvent("onmouseleave", this._button_onmouseleave);
	b.attachEvent("onmousedown", this._button_onmousedown);
	b.attachEvent("onmouseup", this._button_onmouseup);	
	b.attachEvent("ondragstart", CNUtil.cancelEvent);
	b.isButton = true;
	b.group = group;
	
	if(isDefault)
	{
		CNUtil.setButtonState(b, "pushed");
		this.groupButtons[b.group] = b;
	}

	return b;
}

proto.setButtonState = function(b, state)
{
	b.className = "button_" + state;
	b.state = state;
}

proto._button_onmouseenter = function()
{
	CNUtil.dispatchObject().button_onmouseenter();
}
proto.button_onmouseenter = function()
{
	if(this._readOnly) return;
	var b = event.srcElement;

	if(b.state == "normal") this.setButtonState(b, "normalHover")
	else if(b.state == "pushed") this.setButtonState(b, "pushedHover");

}

proto._button_onmouseleave = function()
{
	CNUtil.dispatchObject().button_onmouseleave();
}
proto.button_onmouseleave = function()
{
	if(this._readOnly) return;
	var b = event.srcElement;
	if(b.state == "normalHover" || b.state == "normalDown") this.setButtonState(b, "normal");
	else if(b.state == "pushedHover" || b.state == "pushedDown") this.setButtonState(b, "pushed");
}

proto._button_onmousedown = function()
{
	CNUtil.dispatchObject().button_onmousedown();
}
proto.button_onmousedown = function()
{
	if(event.button != 1) return;

	var b = event.srcElement;
	if(this._readOnly) return;

	if(!b.isPushable) 
	{
		this.setButtonState(b, "normalDown");
		if(b.cmd && this[b.cmd]) this[b.cmd](b.param);
	}
	else 
	{
		if(b.group)
		{
			var groupButton = this.groupButtons[b.group];
			if(groupButton) this.setButtonState(groupButton, b.state == "pushedHover" ? "pushed" : "normal")
			this.groupButtons[b.group] = b;
		}

		if(b.state == "pushedHover") this.setButtonState(b, "normalDown");
		else 
		{
			this.setButtonState(b, "pushedDown");
			if(b.cmd && this[b.cmd]) this[b.cmd](b.param);
		}
	}

}		  

proto._button_onmouseup = function()
{
	CNUtil.dispatchObject().button_onmouseup();
}
proto.button_onmouseup = function()
{
	var b = event.srcElement;
	if(!b.isButton) return;
	if(this._readOnly) return;

	if(b.state == "pushedDown") this.setButtonState(b, "pushedHover");
	else this.setButtonState(b, "normalHover");
}		  


proto.setNodeId = function(node, prefix, negative)
{
	if(!prefix) prefix = "";
	var id = node.getAttribute("id");
	if(id)
	{
		id = String(id);
		if(prefix.length > 0 && id.length > prefix.length)
		{
			id = id.substr(prefix.length);
		}

		if(!isNaN(id * 1))
		{
			// Id is a number.
			id = id * 1;
			if(Math.abs(id) >= this.lastImgID) this.lastImgID = Math.abs(id) + 1;
		}
		else
		{
			// Id is a string, it doesn't interferes us.
		}
	}
	else
	{
		// Add id.
		var numID = this.lastImgID++;
		if(negative) numID = -numID
		node.setAttribute("id", prefix + numID, 0);
	}
}


// Draggable stuff. ========================================
{
	proto.createDraggableButton = function(img, title, width, height, resize, snapX, snapY, type, idPrefix)
	{
		if(!idPrefix) idPrefix = "img";
		
		var b = document.createElement("v:image");
		b.style.verticalAlign = "middle";
		b.title = title;
		b.className = "markerButton";
		b.unselectable = "on";
		b.src = img;
	
		if(width) b.style.width = width;
		if(height) 	b.style.height = height;
	
		b.style.snapX = snapX;
		b.style.snapY = snapY;
		b.style.resize = resize;
		
		if(type !== undefined) b.style.type = type;
		b.style.idPrefix = idPrefix;
		
		b.attachEvent("onmouseenter", this._draggableButton_onmouseenter);
		b.attachEvent("onmouseleave", this._draggableButton_onmouseleave);
		b.attachEvent("onmousedown", this._draggableButton_onmousedown);
		b.attachEvent("ondragstart", this._draggableButtton_ondragstart);
		b.isButton = true;
		return b;
	}
	
	proto._draggableButtton_ondragstart = function()
	{
		event.returnValue = false;
	}
	
	proto._draggableButton_onmouseenter = function()
	{
		CNUtil.dispatchObject().draggableButton_onmouseenter();
	}
	proto.draggableButton_onmouseenter = function()
	{
		var b = event.srcElement;
		if(this._readOnly || this.dragging || !b || !b.isButton) return;
	
		b.className = "markerButtonHover";
	
		CNUtil.cancelEvent();
	}
	
	proto._draggableButton_onmouseleave = function()
	{
		CNUtil.dispatchObject().draggableButton_onmouseleave();
	}
	proto.draggableButton_onmouseleave = function()
	{
		var b = event.srcElement;
		if(this._readOnly || this.dragging || !b || !b.isButton) return;
		this.deliteButton(b);
	}
	
	proto.deliteButton = function(b)
	{
		b.className = "markerButton";
	}
	
	proto._draggableButton_onmousedown = function()
	{
		CNUtil.dispatchObject().draggableButton_onmousedown();
	}
	proto.draggableButton_onmousedown = function()
	{
		var b = event.srcElement;
		if(this._readOnly || this.dragging || !b || !b.isButton || event.button != 1) return;
		this.currentButton = b;
	
		b.className = "markerButtonDown";
	
		var img = this.createImage(b.src, b.style.width, b.style.height, b.style.resize, b.style.snapX, b.style.snapY, b.style.type, b.style.idPrefix);
			
		CNUtil.cancelEvent();

		this.beginDrag(img, true);
		
		return;		
	}		  
	
	proto.createImage = function(src, width, height, resize, snapX, snapY, type, idPrefix)
	{
		var w = parseInt(width) * resize;
		var h = parseInt(height) * resize;

		var imgGroup = document.createElement("v:group");
		imgGroup.style.position = "absolute";
		imgGroup.style.left = 0;
		imgGroup.style.top = 0;
		imgGroup.style.width = w;
		imgGroup.style.height = h;
		imgGroup.coordsize = w + "," + h;

		imgGroup.style.originalWidth = w;
		imgGroup.style.originalHeight = h;

		var img = document.createElement("v:image");
		img.src = src;
		img.style.position = "absolute";

		imgGroup.style.snapX = snapX * resize;
		imgGroup.style.snapY = snapY * resize;
		imgGroup.style.hSnapZoom = 1;
		imgGroup.style.vSnapZoom = 1;
		
		img.style.width = w;
		img.style.height = h;
		
		imgGroup.style.zIndex = 10000;
	
		img.unselectable = "on";
		imgGroup.unselectable = "on";
		
		if(type !== undefined) imgGroup.style.type = type;

		imgGroup.appendChild(img);
		this.group.appendChild(imgGroup);
		
		this.setNodeId(imgGroup, idPrefix, true);
		
		return imgGroup;
	}
	
	proto.beginDrag = function(l, isNewValue)
	{
		if(this.currentTool && this.currentTool.handle_toolunselected) this.currentTool.handle_toolunselected();
	
		this.canceled = false;
		this.draggingBed = false;
	
		this.draggedImg = l;

		this.calcElementOffset();
		
		if(this.draggedImg.tagName == "line")
		{
			var x = event.clientX - this.offX + this.scrollDiv.scrollLeft - this.LineTool._cursorYOff;
			var y = event.clientY - this.offY + this.scrollDiv.scrollTop - this.LineTool._cursorYOff;
			
			// Snap to grid.
			x = Math.round(x / this.snapCellSize) * this.snapCellSize;
			y = Math.round(y / this.snapCellSize) * this.snapCellSize;		
	
			this.dragStartX = x;
			this.dragStartY = y;

			var from = String(this.draggedImg.from).split(",");
			var to = String(this.draggedImg.to).split(",");			
			this.draggedLineFromX1 = parseInt(from[0]);
			this.draggedLineFromY1 = parseInt(from[1]);
			this.draggedLineFromX2 = parseInt(to[0]);
			this.draggedLineFromY2 = parseInt(to[1]);
		}
		else if(this.draggedImg.tagName == "group" && this.draggedImg.children[0].src.indexOf("bed") != -1)
		{
			this.draggingBed = true;
			var x = this.dragStartX = (event.clientX + this.scrollDiv.scrollLeft - this.offX) / this.zoomFactor;
			var y = this.dragStartY = (event.clientY + this.scrollDiv.scrollTop - this.offY) / this.zoomFactor;

			if(isNewValue)
			{
				this.draggedImg.style.isNew = isNewValue;
				this.draggedCursorXOff = parseInt(this.draggedImg.style.width) / 2;
				this.draggedCursorYOff = parseInt(this.draggedImg.style.height) / 2;
			}
			else
			{
				this.draggedCursorXOff = x - parseInt(l.style.left);
				this.draggedCursorYOff = y - parseInt(l.style.top);
			}
		}
		else
		{
			var x = this.dragStartX = (event.clientX + this.scrollDiv.scrollLeft - this.offX) / this.zoomFactor;
			var y = this.dragStartY = (event.clientY + this.scrollDiv.scrollTop - this.offY) / this.zoomFactor;
	
			if(isNewValue)
			{
				this.draggedCursorXOff = 0;
				this.draggedCursorYOff = 0;
			}
			else
			{
				this.draggedCursorXOff = x - parseInt(l.style.left);
				this.draggedCursorYOff = y - parseInt(l.style.top);
			}
		}
		
		if(isNewValue)
		{
			this.draggedImg.style.isNew = isNewValue;
		}

		this.dragging = true;
		
		this.element.attachEvent("onmousemove", this._dr_element_onmousemove);
		this.element.attachEvent("onmouseup", this._dr_element_onmouseup);
	}
	

	proto._dr_element_onmousemove = function()
	{
		var jsObject = CNUtil.dispatchObject();
		if(jsObject && jsObject.dr_element_onmousemove) jsObject.dr_element_onmousemove();
	}
	proto.dr_element_onmousemove = function()
	{
		this.placeDraggedAccEvent();

		CNUtil.cancelEvent();
	}
	
	// Zoomed.
	proto.placeDraggedAccEvent = function()
	{
		if(this.draggedImg == null) return;

		if(this.draggedImg.tagName == "line")
		{
			var x = event.clientX - this.offX - this.LineTool._cursorYOff + this.scrollDiv.scrollLeft;
			var y = event.clientY - this.offY - this.LineTool._cursorYOff + this.scrollDiv.scrollTop;
			
			// Snap to grid.
			x = Math.round(x / this.snapCellSize) * this.snapCellSize;
			y = Math.round(y / this.snapCellSize) * this.snapCellSize;

			var offsetX = (x - this.dragStartX) / this.zoomFactor;
			var offsetY = (y - this.dragStartY) / this.zoomFactor;

			this.draggedImg.from = (this.draggedLineFromX1 + offsetX) + "," + (this.draggedLineFromY1 + offsetY);
			this.draggedImg.to = (this.draggedLineFromX2 + offsetX) + "," + (this.draggedLineFromY2 + offsetY);
			this.updateBoxesPosition();
		}
		if(this.draggingBed)
		{
			var x = event.clientX + this.scrollDiv.scrollLeft - this.offX;
			var y = event.clientY + this.scrollDiv.scrollTop - this.offY;
	
			x = Math.round(x / this.dragSnap) * this.dragSnap;
			y = Math.round(y / this.dragSnap) * this.dragSnap;
	
			this.draggedImg.style.left = x / this.zoomFactor - this.draggedCursorXOff;
			this.draggedImg.style.top = y / this.zoomFactor - this.draggedCursorYOff;
		}
		else
		{
			var x = (event.clientX + this.scrollDiv.scrollLeft - this.offX) / this.zoomFactor;
			var y = (event.clientY + this.scrollDiv.scrollTop - this.offY) / this.zoomFactor;
				
			x = Math.round(x / (this.snapCellSize / 2)) * (this.snapCellSize / 2);
			y = Math.round(y / (this.snapCellSize / 2)) * (this.snapCellSize / 2);
			try
			{
				this.draggedImg.style.left = x - this.draggedImg.style.snapX * this.draggedImg.style.hSnapZoom;
				this.draggedImg.style.top = y - this.draggedImg.style.snapY * this.draggedImg.style.vSnapZoom;
			}
			catch(e){}
		}
	}
	proto._updateDraggingBed = function() {}
	
	proto._dr_element_onmouseup = function()
	{
		var jso = CNUtil.dispatchObject();
		if(jso && jso.dr_element_onmouseup) jso.dr_element_onmouseup();
	}
	proto.dr_element_onmouseup = function()
	{
		if(this.group.disabled || this.draggedImg == null) return;
		
		this.element.detachEvent("onmousemove", this._dr_element_onmousemove);
		this.element.detachEvent("onmouseup", this._dr_element_onmouseup);
	
		if(this.draggedImg.style.isNew)
		{
			if(this.currentButton != null) this.deliteButton(this.currentButton);
		
			this.attachImageEvents(this.draggedImg);
	
			this.draggedImg.style.cursor = "move";
		
			this.currentButton = null;
			this.draggedImg.style.isNew = undefined;
		}

		if(this.draggedImg.children[0].src.indexOf("bed") != -1)
		{
			// Check for valid area below using swapping hack - this is not visible to user.
			var x = event.clientX;
			var y = event.clientY;

			if(!this.cm_areaContains(x, y))
			{
				this.draggedImg.children[0].style.filter = "progid:DXImageTransform.Microsoft.Emboss()";
			}
			else
			{
				this.draggedImg.children[0].style.filter = "";
			}
		}
				
		this.attachBoxes(this.draggedImg);

		this.fire_onchange("new", this.draggedImg);

		this.draggedImg = null;
		this.dragging = false;
		
		CNUtil.cancelEvent();
	}

	proto.attachImageEvents = function(l)
	{
		l.attachEvent("onmouseenter", this._img_onmouseenter);
		l.attachEvent("onmouseleave", this._img_onmouseleave);
		l.attachEvent("onmousedown", this._img_onmousedown);
		l.attachEvent("oncontextmenu", this._shape_oncontextmenu);
	}

	proto._img_onmouseenter = function()
	{
		CNUtil.dispatchObject().img_onmouseenter();
	}
	proto.img_onmouseenter = function()
	{
		if(this.group.disabled) return;
		var l = CNUtil.findTag(event.srcElement, "group");
		this.attachBoxes(l);
	}

	proto._img_onmouseleave = function()
	{
		CNUtil.dispatchObject().img_onmouseleave();
	}
	proto.img_onmouseleave = function()
	{
		if(this.group.disabled) return;
		var l = CNUtil.findTag(event.srcElement, "group");
		this.tryToDetachBoxes();
	}

	proto._img_onmousedown = function()
	{
		CNUtil.dispatchObject().img_onmousedown();
	}
	proto.img_onmousedown = function()
	{
		if(this._readOnly || this.group.disabled || event.button != 1) return;
		
		var l = CNUtil.findTag(event.srcElement, "group");
		this.beginDrag(l);

		CNUtil.cancelEvent();
	}
	
	proto._img_ondblclick = function()
	{
		CNUtil.dispatchObject().img_ondblclick();
	}
	proto.img_ondblclick = function()
	{
		var l = CNUtil.findTag(event.srcElement, "group");
		if(l.children[0].src.indexOf("bed") != -1)
		{
			this.showInfo(l);
		}
	}
}


// Resize-rotate tool. =====================
{
	proto.createBoxes = function()
	{
		var resizeBox = this.resizeBox = document.createElement("v:rect");
		resizeBox.style.position = "absolute";
		resizeBox.style.width = this.resizeBoxSize;
		resizeBox.style.height = this.resizeBoxSize;
		resizeBox.fillcolor = "#00ff00";

		
		var rotateBox = this.rotateBox = document.createElement("v:oval");
		rotateBox.style.position = "absolute";
		rotateBox.style.width = this.resizeBoxSize;
		rotateBox.style.height = this.resizeBoxSize;
		rotateBox.fillcolor = "#00ff00";
		
		resizeBox.style.zIndex = 10100;
		rotateBox.style.zIndex = 10100;
		
		var resizeBox2 = this.resizeBox2 = resizeBox.cloneNode(true);

		resizeBox.attachEvent("onmouseleave", this._resizeBox_onmouseleave);
		resizeBox.attachEvent("onmousedown", this._resizeBox_onmousedown);
		resizeBox.attachEvent("oncontextmenu", this._box_oncontextmenu);
		
		resizeBox2.attachEvent("onmouseleave", this._resizeBox_onmouseleave);
		resizeBox2.attachEvent("onmousedown", this._resizeBox_onmousedown);
		resizeBox2.attachEvent("oncontextmenu", this._box_oncontextmenu);		

		rotateBox.attachEvent("onmouseleave", this._resizeBox_onmousedown);
		rotateBox.attachEvent("onmousedown", this._resizeBox_onmousedown);
		rotateBox.attachEvent("oncontextmenu", this._box_oncontextmenu);		
	}
	
	proto.attachBoxes = function(l)
	{
		if(this.boxedElement == l || this.boxResizing || this._readOnly) return;
		this.boxedElement = l;
		
		this.resizeBox.removeNode();
		this.resizeBox2.removeNode();
		this.rotateBox.removeNode();
		
		this.rotateBox.style.zoom = 1 / this.zoomFactor;
		this.resizeBox.style.zoom = 1 / this.zoomFactor;
		this.resizeBox2.style.zoom = 1 / this.zoomFactor;

		this.rotateBox.strokeWeight = 0;
		this.resizeBox.strokeWeight = 0;
		this.resizeBox2.strokeWeight = 0;
		
		if(l.tagName == "group")
		{
			this.resizeBox.style.cursor = "SE-resize";
			this.rotateBox.style.cursor = "url(" + CNFormManager.neutralImagesPath + "rotate-1.cur)";
			
			this.boxedElement.appendChild(this.resizeBox);
			this.boxedElement.appendChild(this.rotateBox);

			this.oldTool = this.currentTool;
			this.cmdChangeTool(this.PointerTool);
		}
		else if(l.tagName == "line")
		{
			if(this.currentTool != this.PointerTool) return;
			
			this.group.appendChild(this.resizeBox);
			this.group.appendChild(this.resizeBox2);

			this.resizeBox.style.cursor = this.resizeBox2.style.cursor = "default";
		}

		this.updateBoxesPosition();
	}
	
	proto.detachBoxes = function()
	{
		if(this._readOnly) return;
		this.resizeBox.removeNode();
		this.rotateBox.removeNode();
		this.resizeBox2.removeNode();

		if(this.boxedElement && this.boxedElement.tagName == "group")
		{
			if(this.oldTool != null) this.cmdChangeTool(this.oldTool);
		}

		this.boxedElement = null;
	}
	
	proto.updateBoxesPosition = function()
	{
		var l = this.boxedElement;
		if(!l) return;

		if(l.tagName == "group")
		{
			var w = parseInt(l.style.width);
			var h = parseInt(l.style.height);
			this.resizeBox.style.left = w - this.resizeBoxSize - w / 10;
			this.resizeBox.style.top = h - this.resizeBoxSize - h / 10;
			this.rotateBox.style.left = w / 10;
			this.rotateBox.style.top = h / 10;
		}
		else if(l.tagName == "line")
		{
			var from = String(l.from).split(",");
			var to = String(l.to).split(",");
			this.resizeBox.style.left = parseInt(to[0]) - this.resizeBoxSize / 2;
			this.resizeBox.style.top = parseInt(to[1]) - this.resizeBoxSize / 2;
			this.resizeBox2.style.left = parseInt(from[0]) - this.resizeBoxSize / 2;
			this.resizeBox2.style.top = parseInt(from[1]) - this.resizeBoxSize / 2;
		}
	}

	proto._box_oncontextmenu = function()
	{
		CNUtil.dispatchObject().box_oncontextmenu();
	}
	proto.box_oncontextmenu = function()
	{
		if(this.boxedElement) this.boxedElement.fireEvent("oncontextmenu");
	}

	proto._resizeBox_onmouseleave = function()
	{
		CNUtil.dispatchObject().resizeBox_onmouseleave();
	}
	proto.resizeBox_onmouseleave = function()
	{
		if(this.group.disabled) return;
		this.tryToDetachBoxes();
	}

	proto.tryToDetachBoxes = function()
	{
		if(event.toElement == this.resizeBox || event.toElement == this.resizeBox2
		|| event.toElement == this.rotateBox || this.boxResizing 
		|| event.toElement == this.boxedElement) return false;

		this.detachBoxes();
		return true;
	}
	
	proto._resizeBox_onmousedown = function()
	{
		CNUtil.dispatchObject().resizeBox_onmousedown();
	}
	proto.resizeBox_onmousedown = function()
	{
		if(this.group.disabled || event.button != 1) return;
		
		this.boxResizing = true;
		this.currentBox = event.srcElement;
		this.boxStartX = event.clientX;
		this.boxStartY = event.clientY;

		if(this.boxedElement.tagName == "group")
		{
			this.getCurrentCenter();
			this.boxStartA = this.getCurrentAngle(this.boxCenterX, this.boxCenterY);
			this.drawingArea.attachEvent("onmousemove", this._box_drawingArea_onmousemove);
		}
		else if(this.boxedElement.tagName == "line")
		{
			this.drawingArea.attachEvent("onmousemove", this._box_line_drawingArea_onmousemove);
		}

		this.drawingArea.attachEvent("onmouseup", this._box_drawingArea_onmouseup);		
		
		this.calcElementOffset();
		CNUtil.cancelEvent();
	}
	
	// TODO: refactor - place into LineTool.
	proto._box_line_drawingArea_onmousemove = function()
	{
		CNUtil.dispatchObject().box_line_drawingArea_onmousemove();
	}
	proto.box_line_drawingArea_onmousemove = function()
	{
		if(this.group.disabled) return;
		
		var x = event.clientX - this.offX - this.LineTool._cursorYOff + this.scrollDiv.scrollLeft;
		var y = event.clientY - this.offY - this.LineTool._cursorYOff + this.scrollDiv.scrollTop;
		
		// Snap to grid.
		x = Math.round(x / this.snapCellSize) * this.snapCellSize;
		y = Math.round(y / this.snapCellSize) * this.snapCellSize;		

		x = x / this.zoomFactor;
		y = y / this.zoomFactor;

		if(this.currentBox == this.resizeBox)
		{
			this.boxedElement.to = x + "," + y;
		}
		else if(this.currentBox == this.resizeBox2)
		{
			this.boxedElement.from = x + "," + y;
		}
		this.updateBoxesPosition();
	}

	proto._box_drawingArea_onmousemove = function()
	{
		CNUtil.dispatchObject().box_drawingArea_onmousemove();
	}
	proto.box_drawingArea_onmousemove = function()
	{
		if(this.group.disabled) return;
		
		if(this.currentBox == this.resizeBox)
		{
			var x = event.clientX;
			var y = event.clientY;
	
			var offX = Math.round((x - this.boxStartX) / (this.snapCellSize * 2)) * this.snapCellSize * 2;
			var offY = Math.round((y - this.boxStartY) / (this.snapCellSize * 2)) * this.snapCellSize * 2;
	
			if(offX != 0 || offY != 0)
			{
				this.boxStartX = x;
				this.boxStartY = y;
		
				var w = parseInt(this.boxedElement.style.width);
				var h = parseInt(this.boxedElement.style.height);
				
				var rotation = parseInt(this.boxedElement.style.rotation);
				if(rotation < 0) rotation = 360 + rotation;
				if(rotation >= 90 && rotation < 180)
				{
					var s = offX;
					offX = offY;
					offY = -s;
				}
				else if(rotation >= 180 && rotation < 270)
				{
					var s = offX;
					offX = -offX;
					offY = -offY;
				}
				else if(rotation >= 270)
				{
					var s = offX;
					offX = -offY;
					offY = s;
				}

				w += offX / this.zoomFactor;
				h += offY / this.zoomFactor;
	
				if(w > 0 && h > 0)
				{
					var img = this.boxedElement.children.tags("image")[0];
	
					this.boxedElement.coordsize = w + "," + h;
					
					this.boxedElement.style.width = w;
					this.boxedElement.style.height = h;

					img.style.width = w;
					img.style.height = h;
					
					if(this.boxedElement.style.hSnapZoom) this.boxedElement.style.hSnapZoom = this.boxedElement.offsetWidth / this.boxedElement.style.originalWidth;
					if(this.boxedElement.style.vSnapZoom) this.boxedElement.style.vSnapZoom = this.boxedElement.offsetHeight / this.boxedElement.style.originalHeight;
				}
			}
		}
		else if(this.currentBox == this.rotateBox)
		{
			// TODO: using trig. calculate angle then round angle to
			// some 15 deegrees based value.
			this.getCurrentCenter();
			var a = this.getCurrentAngle(this.boxCenterX, this.boxCenterY);
			var delta = this.boxStartA - a;

			var rotation = 0;
			if(this.boxedElement.style.rotation) rotation = parseInt(this.boxedElement.style.rotation);

			delta = Math.round(delta / 15) * 15;
			if(delta != 0)
			{
				rotation -= delta;
				this.boxedElement.style.rotation = rotation;
				this.rotateBox.style.rotation = rotation;
				this.boxStartA = a;
			}
		}
		this.updateBoxesPosition();
		CNUtil.cancelEvent();
	}

	proto.getCurrentAngle = function(centerX, centerY)
	{
		var x = event.clientX - this.offX - (centerX  * this.zoomFactor - this.scrollDiv.scrollLeft);
		var y = event.clientY - this.offY - (centerY  * this.zoomFactor - this.scrollDiv.scrollTop);
		
		var pis = Math.atan2(x, y);
		
		return -(180 / Math.PI) * pis;
	}
	
	proto.getCurrentCenter = function()
	{
		this.boxCenterX = parseInt(this.boxedElement.style.width) / 2 + parseInt(this.boxedElement.style.left);
		this.boxCenterY = parseInt(this.boxedElement.style.height) / 2 + parseInt(this.boxedElement.style.top);
	}

	proto._box_drawingArea_onmouseup = function()
	{
		CNUtil.dispatchObject().box_drawingArea_onmouseup();
	}
	proto.box_drawingArea_onmouseup = function()
	{
		if(this.group.disabled) return;
		this.drawingArea.detachEvent("onmouseup", this._box_drawingArea_onmouseup);
		this.drawingArea.detachEvent("onmousemove", this._box_drawingArea_onmousemove);
		this.drawingArea.detachEvent("onmousemove", this._box_line_drawingArea_onmousemove);		

		this.boxResizing = false;
		
		this.fire_onchange("resize", this.boxedElement);

		var probe = document.elementFromPoint(event.clientX, event.clientY);
		if(probe != this.resizeBox && probe != this.rotateBox && probe != this.boxedElement)
		{
			this.detachBoxes();
		}

		CNUtil.cancelEvent();
	}

}


// Drawing area common mouse handlers. ====================
{

	proto._drawingArea_onmousedown = function()
	{
		var jso = CNUtil.dispatchObject()
		if(jso && jso._isFloorPlanner) jso.drawingArea_onmousedown();
	}
	proto.drawingArea_onmousedown = function()
	{
		if(this.group.disabled) return;
		
		this.calcElementOffset();
		
		if(!this.currentTool.ownMouseHandling)
		{
			if(this.currentTool.handle_mousedown() !== false)
			{
				this.drawingArea.attachEvent("onmousemove", this._drawingArea_onmousemove);
				this.drawingArea.attachEvent("onmouseup", this._drawingArea_onmouseup);	
			}
		}
	}
	
	proto._drawingArea_onmousemove = function()
	{
		var jso = CNUtil.dispatchObject();
		if(jso && jso._isFloorPlanner) jso.drawingArea_onmousemove();
	}
	proto.drawingArea_onmousemove = function()
	{
		if(this.group.disabled) return;
		
		this.currentTool.handle_mousemove();
	}
	
	proto._drawingArea_onmouseup = function()
	{
		var jso = CNUtil.dispatchObject()
		if(jso && jso._isFloorPlanner) jso.drawingArea_onmouseup();
	}
	proto.drawingArea_onmouseup = function()
	{
		if(this.group.disabled) return;
		
		this.drawingArea.detachEvent("onmousemove", this._drawingArea_onmousemove);
		this.drawingArea.detachEvent("onmouseup", this._drawingArea_onmouseup);	
		this.drawingArea.detachEvent("onmouseleave", this._drawingArea_onmouseup);
		this.currentTool.handle_mouseup();	
	}
}


// Util. ===============================

proto.calcElementOffset = function()
{
	this.offX = -top.document.body.scrollLeft;
	this.offY = -top.document.body.scrollTop;
	var l = this.drawingArea;
	while(l != null)
	{
		this.offX += l.offsetLeft;
		this.offY += l.offsetTop;
		l = l.offsetParent;
	}
}

// Area creation. =========================
{
	proto._AreaPointerTool = 
	{
		handle_toolselected: function()
		{
			this.jsObject.activateACMode();
		},
		
		handle_toolunselected: function()
		{
			this.jsObject.deactivateACMode();
		},
				
		handle_mousedown: function(){},
		handle_mousemove: function(){},
		handle_mouseup: function(){}
	}

	proto.cm_initGroup = function()
	{
		var cm_group = this.cm_group = document.createElement("v:group");
		cm_group.style.position = "absolute";
		cm_group.style.left = 0;
		cm_group.style.top = 0;
		cm_group.style.zIndex = 18;
		cm_group.style.filter = "alpha(opacity=10)";

		cm_group.coordsize = this.canvasWidth + ", " + this.canvasHeight;
		
		this.drawingArea.appendChild(cm_group);
	}
	
	proto.cm_initAreaCreationMode = function()
	{
		this.cm_createContextMenu();
	}
	
	proto.cm_updateCanvasSize = function()
	{
		this.cm_group.style.width = this.canvasWidth * this.zoomFactor;
		this.cm_group.style.height = this.canvasHeight * this.zoomFactor;
	}

	proto.cm_areaContains = function(x, y)
	{
		// Place cm_group on top.
		var oldZIndex = this.cm_group.style.zIndex;
		this.cm_group.style.zIndex = 50000;
		
		// Try to find some element.
		var el = document.elementFromPoint(x, y);

		// Put cm_group back.
		this.cm_group.style.zIndex = oldZIndex;
		
		return this.cm_group.contains(el);
	}

	proto.cm_loadAreas = function(node)
	{
		var areas = node.selectNodes("area");
		if(areas.length == 0) 
		{
			var noareas = node.selectSingleNode("noareas");
			if(noareas) this.cm_cleanData();
			return;
		}

		this.cm_cleanData();
		this.cm_createMarkerareas(areas);
	}
	
	proto.activateACMode = function()
	{
		this.group.style.filter = "alpha(opacity=25)";
		this.group.disabled = true;
		
		this.cm_group.style.filter = "";
		this.cm_group.style.zIndex = 30;
		
		this.drawingArea.attachEvent("onmousedown", this._cm_element_onmousedown);
		this.cm_activated = true;
	}
	
	proto.deactivateACMode = function()
	{
		if(this.currentShape) this.finishShape(this.currentShape);
		
		this.cm_group.style.filter = "alpha(opacity=10)";

		this.group.style.filter = "";	
		this.group.disabled = false;		
		
		this.cm_group.style.zIndex = 18;
		this.cm_group.disabled = true;
		
		this.drawingArea.detachEvent("onmousedown", this._cm_element_onmousedown);
		this.cm_activated = false;
	}

	proto.cm_createContextMenu = function()
	{
		var contextMenu = new PopupMenu(document.body);
		contextMenu.element.style.width = "180px";
		contextMenu.parentJSObject = this;
	
		var item;
		item = contextMenu.createItem("Info");
		item.onmenuclick = this._cm_item_info_onxlclick;
	
		item = this.cm_finishItem = contextMenu.createItem("Finish Shape");
		item.onmenuclick = this._cm_finishShape_onxlclick;

		contextMenu.createHR();

		item = contextMenu.createItem("Delete", CNFormManager.neutralImagesPath + "delete.gif");
		item.onmenuclick = this._cm_delete_onxlclick;

		this.cm_contextMenu = contextMenu;
	}

	proto.cm_createShape = function(finished, path, doNotAssignId, name, doNotSelect)
	{
		var shape = document.createElement("v:shape");
		shape.style.position = "absolute";
		shape.style.left = 0;
		shape.style.top = 0;
		shape.style.zIndex = 20000;
		shape.style.width = this.drawingArea.offsetWidth;
		shape.style.height = this.drawingArea.offsetHeight;
		shape.coordsize = this.drawingArea.offsetWidth + ", " + this.drawingArea.offsetHeight;
		shape.fillColor = "#9DBBE1";
		shape.strokeWeight = 1;
		this.cm_group.appendChild(shape);
		
		if(!doNotAssignId) this.setNodeId(shape);

		shape.path = path;
		shape.style.filter = "alpha(opacity=" + (finished ? "75" : "50") + ")";
		shape.attachEvent("oncontextmenu", this._cm_borderShape_oncontextmenu);
		shape.attachEvent("ondblclick", this._cm_shape_ondblclick);

		shape.style._finished = finished;
		shape.style._name = name;

		this._addShapeToList(shape, name, doNotSelect);

		return shape;
	}

	proto._cm_element_onmousedown = function()
	{
		CNUtil.dispatchObject().cm_element_onmousedown();
	}
	proto.cm_element_onmousedown = function()
	{
		if(!this.cm_activated || event.button != 1) return;
		this.calcElementOffset();

		var coordPos;

		var x = (event.clientX - this.offX + this.scrollDiv.scrollLeft) / this.zoomFactor - this.cursorOff;
		var y = (event.clientY - this.offY + this.scrollDiv.scrollTop) / this.zoomFactor - this.cursorOff;

		if(this.firstClick)
		{
			this.calcElementOffset();

			var coord = x + "," + y;

			this.currentShape = this.cm_createShape(false, "m " + coord + " xe");
			this.currentShape.coordNum = 0;
			this.shapes[this.shapes.length] = this.currentShape;
			this.firstClick = false;		

			var node = this.changedDocument.createElement("floorplannernewarea");
			this.changedFragment.appendChild(node);
			node.setAttribute("path", String(this.currentShape.path));
			node.setAttribute("areaID", String(this.currentShape.id));
			node.setAttribute("name", String(this.currentShape.style._name));
			this.cm_currentNode = node;
			
			this._selectShapes([this.currentShape]);
		}
		else
		{
			var path = String(this.currentShape.path);
			var subPath = path.substr(0, path.length - 2);
	
			var coord = x + "," + y;
			path = subPath + "l " + coord + " xe";
	
			this.currentShape.coordNum++;
			
			this.currentShape.path = path;
			this.cm_currentNode.setAttribute("path", String(path));
		}

		this.cm_createResizeRect(this.currentShape, x, y, this.currentShape.coordNum);
		this.fire_onchange();
		CNUtil.cancelEvent();
	}

	proto.cm_createResizeRect = function(currentShape, x, y, coordNum)
	{
		var rect = document.createElement("v:rect");
		rect.style.position = "absolute";
		rect.style.width = 6;
		rect.style.height = 6;
		rect.style.left = x - 3;
		rect.style.top = y - 3;
		rect.style.zIndex = currentShape.style.zIndex;
		
		rect.attachEvent("onmouseenter", this._cm_rect_onmouseenter);
		rect.attachEvent("onmouseleave", this._cm_rect_onmouseleave);	
		rect.attachEvent("onmousedown", this._cm_rect_onmousedown);
		rect.attachEvent("oncontextmenu", this._cm_borderShape_oncontextmenu);
	
		rect._coordNum = coordNum;
		rect.style._shape = currentShape;
		
		this.cm_group.appendChild(rect);
	}

	proto._cm_shape_ondblclick = function()
	{
		CNUtil.dispatchObject().cm_shape_ondblclick();
	}
	proto.cm_shape_ondblclick = function()
	{
		this.showInfo(event.srcElement);
	}

	proto._cm_borderShape_oncontextmenu = function()
	{
		CNUtil.dispatchObject().cm_borderShape_oncontextmenu();
	}
	proto.cm_borderShape_oncontextmenu = function()
	{
		if(this._readOnly) return;
		this.cm_currentContextElement = event.srcElement;
		
		// We clicked rect - redirect to shape.
		if(this.cm_currentContextElement.tagName == "rect")
		{
			this.cm_currentContextElement = this.cm_currentContextElement.style._shape;
		}

		this.cm_finishItem.disabled = this.cm_currentContextElement.style._finished == true;
	
		this.cm_contextMenu.show(event.clientX + document.body.scrollLeft, event.clientY + document.body.scrollTop);
		CNUtil.cancelEvent();
	}
	
	proto._cm_delete_onxlclick = function()
	{
		CNUtil.dispatchObject().parentJSObject.cm_delete_onxlclick();
	}
	proto.cm_delete_onxlclick = function()
	{
		CNUtil.cancelEvent();
		this._cm_deleteShape(this.cm_currentContextElement);
	}
	
	proto._cm_deleteShape = function(shape)
	{
		this.firstClick = true;
	
		for(var i = 0; i < this.shapes.length; i++)
		{
			if(this.shapes[i] == shape)
			{
				this.shapes.splice(i, 1);
				break;
			}
		}
		
		var rects = this.cm_group.children.tags("rect");
		var ix = 0;
		while(ix < rects.length)
		{
			if(rects[ix].style._shape == shape) rects[ix].removeNode();
			else ix++;
		}
		
		this.removedAreas[this.removedAreas.length] = String(shape.getAttribute("id"));

		var id = shape.id;
		var node = this.changedFragment.selectSingleNode("floorplannernewarea[@areaID='" + id + "']");
		if(node)
		{
			node.parentNode.removeChild(node);
		}
		else
		{
			var removeNode = this.changedDocument.createElement("floorplannerremovearea");
			removeNode.setAttribute("areaID", id);
			this.changedFragment.appendChild(removeNode);
		}

		var itemId = shape.style._itemId
		this._list.deleteItem(this._list.getItem(itemId));

		shape.removeNode();
		this.fire_onchange();
	}

	proto._cm_finishShape_onxlclick = function()
	{
		CNUtil.dispatchObject().parentJSObject.cm_finishShape_onxlclick();
	}
	proto.cm_finishShape_onxlclick = function()
	{
		if(this.cm_currentContextElement) this.finishShape(this.cm_currentContextElement);
	}
	
	proto.finishShape = function(shape)
	{
		if(!shape.parentElement) return;
		
		this.firstClick = true;
		shape.style._finished = true;	
		this.cm_currentNode = null;
		shape.filters[0].opacity = 75;
	}
	
	proto._cm_rect_onmouseenter = function()
	{
		CNUtil.dispatchObject().cm_rect_onmouseenter();
	}
	proto.cm_rect_onmouseenter = function()
	{
		if(!this.cm_activated) return;
		var l = event.srcElement;
		l.strokeWeight = 2;
	}
	
	proto._cm_rect_onmouseleave = function()
	{
		CNUtil.dispatchObject().cm_rect_onmouseleave();
	}
	proto.cm_rect_onmouseleave = function()
	{
		if(!this.cm_activated) return;
		var l = event.srcElement;
		l.strokeWeight = 1;
	}
	
	proto._cm_rect_onmousedown = function()
	{
		CNUtil.dispatchObject().cm_rect_onmousedown();
	}
	proto.cm_rect_onmousedown = function()
	{
		if(!this.cm_activated) return;
		var l = event.srcElement;
		this.currentRect = l;
		var path = String(l.style._shape.path);
		l._xys = this.extractXYs(path);
		
		this.drawingArea.attachEvent("onmousemove", this._cm_rect_element_onmousemove);
		this.drawingArea.attachEvent("onmouseup", this._cm_rect_element_onmouseup);
	
		CNUtil.cancelEvent();
	}
	
	proto._cm_rect_element_onmousemove = function()
	{
		CNUtil.dispatchObject().cm_rect_element_onmousemove();
	}
	proto.cm_rect_element_onmousemove = function()
	{
		var l = this.currentRect;
	
		var x = (event.clientX - this.offX + this.scrollDiv.scrollLeft) / this.zoomFactor - this.cursorOff;
		var y = (event.clientY - this.offY + this.scrollDiv.scrollTop) / this.zoomFactor - this.cursorOff;

		l.style.left = x - 2;
		l.style.top = y - 2;
	
		var xys = l._xys;
		
		xys[l._coordNum][0] = x;
		xys[l._coordNum][1] = y;
	
		var path = "m " + xys[0][0] + "," + xys[0][1];
		if(xys.length > 1)
		{
			path += " l";
			for(var i = 1; i < xys.length; i++)
			{
				path += xys[i][0] + "," + xys[i][1] + " ";
			}
		}
		path += " xe";
		
		l.style._shape.path = path;
		
		var shape = l.style._shape;
		var id = shape.id;
		var node = this.changedFragment.selectSingleNode("floorplannernewarea[@areaID='" + id + "']");
		if(!node)
		{
			var node = this.changedDocument.createElement("floorplannernewarea");
			this.changedFragment.appendChild(node);
			node.setAttribute("areaID", String(id));
		}
		node.setAttribute("path", String(path));
	}
	
	proto._cm_rect_element_onmouseup = function()
	{
		CNUtil.dispatchObject().cm_rect_element_onmouseup();
	}
	proto.cm_rect_element_onmouseup = function()
	{
		this.drawingArea.detachEvent("onmousemove", this._cm_rect_element_onmousemove);
		this.drawingArea.detachEvent("onmouseup", this._cm_rect_element_onmouseup);
		this.currentRect = null;
		this.fire_onchange();
		CNUtil.cancelEvent();
	}
	
	proto.extractXYs = function(path)
	{
		var mPos = path.indexOf("m");
		var lPos = path.indexOf("l");
		var ePos = path.lastIndexOf("x");
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
	
	proto._cm_item_info_onxlclick = function()
	{
		CNUtil.dispatchObject().parentJSObject.cm_item_info_onxlclick();
	}
	proto.cm_item_info_onxlclick = function()
	{
		this.showInfo(this.cm_currentContextElement);
	}

	proto.cm_cleanData = function()
	{
		this.cm_cleanRects();
		this.cm_group.innerHTML = "";
		this.shapes = [];
		if(this._list) this._list.cleanData();
	}

	proto.cm_createMarkerareas = function(areas)
	{
		var count = areas.length;
		for(var i = 0; i < count; i++)
		{
			var node = areas[i];
			var path = String(node.getAttribute("path"));
			if(path.length > 2 && path.charAt(path.length - 2) != "x")
			{
				path = path.substr(0, path.length - 1) + "xe";
			}
			var area = this.cm_createShape(true, path, true, String(node.getAttribute("name")), true);
			
			area.id = String(node.getAttribute("id"));
			this.setNodeId(area);
			
			this.shapes[this.shapes.length] = area;
			
			var coords = path.split(/\s|,/);
			for(var j = 0; j < coords.length; j += 2)
			{
				var x = parseInt(coords[j].replace("m", "").replace("l", ""));
				var y = parseInt(coords[j + 1]);
				if(isNaN(x) || isNaN(y)) break;
				
				this.cm_createResizeRect(area, x, y, j / 2);
			}
		}
	}
	
	proto.cm_cleanRects = function()
	{
		for(var i = 0; i < this.cm_group.children.length; i++)
		{
			var child = this.cm_group.children[i];
			if(child.tagName == "rect") child.style._shape = null;
		}
	}
}

proto.set_disabled = function(value)
{
	this._disabled = value;
	this.disabler.style.visibility = this._disabled ? "inherit" : "hidden";
}


proto._element_onresize = function()
{
	CNUtil.dispatchObject().layoutElements();
}

proto._addShapeToList = function(shape, name, doNotSelect)
{
	if(!name) name = "Area";
	var item = this._list.addItem(name);
	var id = shape.uniqueID;
	item._shapeId = id;
	shape.style._itemId = item.uniqueID;
	if(!doNotSelect) this._list.selectItem(item);
}

proto._list_oncontextmenu = function()
{
	var listObject = CNUtil.findJSObject(event.srcElement);
	var jsObject = CNUtil.findJSObject(listObject.element.parentElement);
	jsObject.list_oncontextmenu();
}
proto.list_oncontextmenu = function()
{
	var l = CNUtil.findByClassName(event.srcElement, "listItemDiv");
	if(!l) return;

	this.currentContextElement = l;
	
	this.list_contextMenu.show(event.clientX + document.body.scrollLeft, event.clientY + document.body.scrollTop);
	CNUtil.cancelEvent();
}

proto._rename_onxlclick = function()
{
	CNUtil.findJSObject(event.srcElement).parentJSObject.rename_onxlclick();
}
proto.rename_onxlclick = function()
{
	this._list.beginEditLabel(this.currentContextElement);
}

proto._selectShapes = function(shapes)
{
	this._unselectShapes();
	this._selectedShapes = shapes;
	for(var i = 0; i < this._selectedShapes.length; i++)
	{
		this._selectedShapes[i].strokeWeight = 2.5;
		this._selectedShapes[i].fillColor = "#316AC5";
	}
}

proto._unselectShapes = function()
{
	if(!this._selectedShapes) return;
	for(var i = 0; i < this._selectedShapes.length; i++)
	{
		this._selectedShapes[i].strokeWeight = 1;
		this._selectedShapes[i].fillColor = "#9DBBE1";
	}
	this._selectedShapes = [];
}


// List. ============================================================
function CNList(parentElement)
{
	this._selectedItem = null;

	var l = document.createElement("<table class=cn_list cellpadding='0' cellspacing='0' border='0'>");
	parentElement.appendChild(l);
	this.element = l;
	l.jsObject = this;
	
	var tr = l.insertRow();
	var headerTD = tr.insertCell();
	headerTD.className = "headerTD";
	
	var tr = l.insertRow();
	var contentTD = tr.insertCell();
	contentTD.height = "100%";
	contentTD.vAlign = "top";
	
	this._contentDiv = document.createElement("<div class=contentDiv>");
	contentTD.appendChild(this._contentDiv);
}

var proto = CNList.prototype;
proto.onitemselected = function(ev){}
proto.onitemrenamed = function(ev){}

proto.destroy = function()
{
	CNFormManager.destroyJSObject(this);
}

proto.cleanData = function()
{
	this._contentDiv.innerHTML = "";
}

proto.setHeader = function(name)
{
	this.element.cells(0).innerText = name;
}

proto.addItem = function(name)
{
	var div = document.createElement("<div class=listItemDiv>");
	this._contentDiv.appendChild(div);
	var span = document.createElement("<span class=textSpan>");
	div.appendChild(span);
	span.innerText = name;
	
	div.attachEvent("onmousedown", this._item_onmousedown);
	
	return div;
}

proto.deleteItem = function(item)
{
	item.removeNode(true);
}

proto.getItem = function(id)
{
	return this._contentDiv.children[id];
}

proto.selectItem = function(l, userClick)
{
	this.unselectItem();
	
	l.runtimeStyle.background = l.currentStyle["xl--selected-background"];
	l.runtimeStyle.color = l.currentStyle["xl--selected-color"];
	l.runtimeStyle.filter = l.currentStyle["xl--selected-filter"];
	
	this._selectedItem = l;
	
	if(this.onitemselected) 
	{
		var ev = {item: l, userClick: userClick};
		this.onitemselected(ev);
	}
}

proto.unselectItem = function()
{
	var l = this._selectedItem;
	if(!l) return;
	l.runtimeStyle.background = "";
	l.runtimeStyle.color = "";
	l.runtimeStyle.filter = "";
	this._selectedItem = null;
}

proto.beginEditLabel = function(item)
{
	var span = item.children[0];
	span.className = "textEditSpan";
	span.contentEditable = true;
	span.attachEvent("onselect", this._span_onselect);
	span.attachEvent("onselectstart", this._span_onselect);
	span.attachEvent("onblur", this._span_onblur);
	span.attachEvent("onkeydown", this._span_onkeydown);
	span.attachEvent("onkeyup", this._span_onkeyup);
	span.attachEvent("onkeypress", this._span_onkeypress);
	
	span.focus();
	var range = document.selection.createRange();
	range.moveToElementText(span);
	range.select();
	
	this._currentEditLabel = item;
}

proto.endEditLabel = function()
{
	var l = this._currentEditLabel;
	if(!l) return;
	this._currentEditLabel = null;
	var span = l.children[0];
	
	span.detachEvent("onselect", this._span_onselect);
	span.detachEvent("onselectstart", this._span_onselect);
	span.detachEvent("onblur", this._span_onblur);
	span.detachEvent("onkeydown", this._span_onkeydown);
	span.detachEvent("onkeyup", this._span_onkeyup);
	span.detachEvent("onkeypress", this._span_onkeypress);

	span.contentEditable = false;
	span.className = "textSpan";
	
	if(document.activeElement == span) 
	{
		var range = document.selection.createRange();
		range.collapse();
		range.select();
	}
	
	if(this.onitemrenamed)
	{
		var ev = {item: l, name: span.innerText};
		this.onitemrenamed(ev);
	}
}

proto._span_onselect = function()
{
	event.returnValue = true;
	event.cancelBubble = true;
}

proto._span_onblur = function()
{
	var jso = CNUtil.dispatchObject().endEditLabel();
}

proto._item_onmousedown = function()
{
	var jso = CNUtil.dispatchObject();
	var div = CNUtil.findTag(event.srcElement, "DIV");
	jso.selectItem(div, true);
}

proto._span_onkeypress = function()
{
	if(event.keyCode ==  13)
	{
		var jsObject = CNUtil.dispatchObject();
		jsObject.endEditLabel();
		CNUtil.cancelEvent();
	}
}

proto._span_onkeyup = function()
{
	var jsObject = CNUtil.dispatchObject();
	if(jsObject._pasted)
	{
		var span = jsObject._currentEditLabel.children[0];
		span.innerText = span.innerText;
	}
	jsObject._pasted = false;	
}

proto._span_onkeydown = function()
{
	var jsObject = CNUtil.dispatchObject();
	jsObject._pasted = false;
	// Disallow any WYSIWYG commands.
	if(!event.ctrlKey) return;
	switch(event.keyCode)
	{
		case 86: // V paste
			jsObject._pasted = true;
		case 67: // C copy
		case 88: // X cut
		case 37: // left
		case 38: // up
		case 39: // right
		case 40: // down
		case 36: // home
		case 35: // end
		case 45: // insert
		case 46: // del
			return;
	}
	CNUtil.cancelEvent();
}
