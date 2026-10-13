/*
	v. 2.0
*/
function CN_drawingconfigcontrol()
{
	this.formManager = null;
	
	this.shape_contextMenu = null;
	this.tree_contextMenu = null;
	this.cm_finishItem = null;
	
	this.areaOpacity = 0;

	this.currentContextElement = null;

	this.cursorOff = 3;

	this.areaNames = [];

	this.offX = 0;
	this.offY = 0;

	this.firstClick = true;
	this.currentShape = null;
	this.currentRect = null;

	this._disabled = false;
	this._readOnly = false;
	
	this._currentTreeGroupNode = null;

	this._shapeTopZ = 100;
	this._lastID = 0;
	
	this._isDirty = false;
}
var proto = CN_drawingconfigcontrol.prototype;

// ICNControl. ====================================
proto.createElement = function(node, parentElement)
{
	var l = document.createElement("<div class=cn_drawingconfigcontrol>")
	parentElement.appendChild(l);

	this._table = document.createElement("<table width=100% height=100% cellpadding=0 cellspacing=0 border=0>");
	l.appendChild(this._table);

	var tr = this._table.insertRow();
	tr.vAlign = "top";
	var td1 = tr.insertCell();
	td1.width = 200;

	this._tree = new CN_tree();
	this._tree.allowNodeDrag = true;
	this._tree._selectExpands = false;
	
	this._treeXml = new ActiveXObject("Microsoft.XMLDOM");
	var treeRoot = this._treeXml.createElement("root");
	this._treeXml.appendChild(treeRoot);
	
	var treeEl = this._tree.createElement(treeRoot, td1);
	
	this._tree.onselectedindexchange = this._tree_onselectedindexchange;
	this._tree.onnodereorderallowed = this._tree_onnodereorderallowed;
	this._tree.onnodereordered = this._tree_onnodereordered;
	this._tree._parentJSO = this;

	this._tree.element.attachEvent("oncontextmenu", this._tree_oncontextmenu);
	
	var td2 = tr.insertCell();
	td2.width = "100%";
	
	this._contentDiv = document.createElement("div");
	td2.appendChild(this._contentDiv);
	this._contentDiv.className = "content";

	this._contentDiv.attachEvent("onmousedown", this._cm_element_onmousedown);
	
	this.element = l;
	l.jsObject = this;
	
	this._buildElement(node);
	
	return l;
}

proto._buildElement = function(node)
{
	this.element.attachEvent("ondragstart", CNUtil.cancelEvent);
	this.element.attachEvent("onselectstart", CNUtil.cancelEvent);
	this.element.attachEvent("oncontextmenu", CNUtil.cancelEvent);

	this.element.unselectable = "on";
	this.element.style.overflow = "hidden";
	if(this.element.currentStyle.position == "static") this.element.style.position = "relative";
	this.element.style.cursor = "default";
	
	var attr = node.getAttribute("areaOpacity");
	if(attr) this.areaOpacity = parseInt(attr);

	this.cm_createContextMenu();
	this.tree_createContextMenu();

	this.disabler = document.createElement('<div style="position: absolute; background: white; z-index: 1000; filter: alpha(opacity=50); width: 100%; height: 100%; visibility: hidden; top: 0px; left: 0px; ">');
	this.element.appendChild(this.disabler);
}

proto.loadData = function(node)
{
	this._isDirty = false;
	this._cleanData();

	var attr = node.getAttribute("readOnly");
	if(attr) this._readOnly = attr == "true";
	
	this._tree.allowNodeDrag = !this._readOnly;

	var attr = node.getAttribute("img");
	if(attr)
	{
		var imgEl = document.createElement("img");
		this._contentDiv.appendChild(imgEl);
		imgEl.src = String(attr);
		imgEl.galleryImg = "false";
	}
	
	var treeRootNode = this._treeXml.createElement("node");
	treeRootNode.setAttribute("isGroup", "true");
	
	var groupNode = node.selectSingleNode("group");
	if(groupNode)
	{
		this._checkMaxID(groupNode);
		var allAreas = groupNode.selectNodes(".//*");
		var count = allAreas.length;
		for(var i = 0; i < count; i++)
		{
			// Preread ids.
			this._checkMaxID(allAreas[i]);
		}

		var idAttr = groupNode.getAttribute("id");
		var idToSet;
		if(idAttr) idToSet = String(idAttr);
		else idToSet = String(this._lastID++);

		treeRootNode.setAttribute("text", String(groupNode.getAttribute("name")));
		treeRootNode.setAttribute("collapsedImage", CNFormManager.neutralIconsPath + "shape-group.gif");
		treeRootNode.setAttribute("_id", idToSet);
	}
	else
	{
		treeRootNode.setAttribute("text", "Root");
		treeRootNode.setAttribute("_id", 0);
		this._lastID++;
	}

	treeRoot.appendChild(treeRootNode);
	this._tree.loadData(treeRoot);
	this._currentTreeGroupNode = this._tree.element.children["content"].children[0];

	if(groupNode)
	{
		var treeParentNodeDiv = this._currentTreeGroupNode;
		this._loadGroup(groupNode, treeParentNodeDiv);
	}
}

proto._checkMaxID = function(node)
{
	var idAttr = node.getAttribute("id");
	if(idAttr)
	{
		var numericID = parseInt(idAttr, 10);
		if(!isNaN(numericID) && numericID >= this._lastID) this._lastID = numericID + 1;
	}
}

proto._loadGroup = function(groupNode, treeParentNodeDiv)
{
	var children = groupNode.selectNodes("*");
	for(var i = 0; i < children.length; i++)
	{
		var child = children[i];

		var idAttr = child.getAttribute("id");
		var idToSet;
		if(idAttr) idToSet = String(idAttr);
		else idToSet = String(this._lastID++);

		if(child.tagName == "group")
		{
			var nodeDiv = this._tree.addNode(treeParentNodeDiv, String(child.getAttribute("name")), 
				CNFormManager.neutralIconsPath + "shape-group.gif");
			nodeDiv.node.setAttribute("isGroup", "true");
			nodeDiv.node.setAttribute("_id", idToSet);
			this._loadGroup(child, nodeDiv);
		}
		else if(child.tagName == "area")
		{
			var shape = this._createAreaShape(true);
			var path = String(child.getAttribute("path"));
			shape.path = path;
			
			shape.style._id = idToSet;
			this._addShapeToTree(shape, treeParentNodeDiv, String(child.getAttribute("name")), true);

			var xys = this.extractXYs(path);
			for(var j = 0; j < xys.length; j++)
			{
				this._createEditRect(xys[j][0], xys[j][1], j, shape);
			}
		}
	}
}

proto._cleanData = function()
{
	var count = this._contentDiv.children.length;
	for(var i = count - 1; i >= 0; i--)
	{
		this._contentDiv.children[i].removeNode(true);
	}
	var oldTreeRoot = this._treeXml.documentElement;
	treeRoot = this._treeXml.createElement("root");
	//treeRoot.setAttribute("selection", "-1");
	this._treeXml.replaceChild(treeRoot, oldTreeRoot);
}

proto.storeData = function(xmldoc)
{
	if(!this._isDirty) return null;
	this._isDirty = false;

	var data = xmldoc.createElement("drawingconfigcontrol");
	if(this._treeXml.documentElement.firstChild == null) return null;
	var groupNode = this._getGroupNodes(xmldoc, this._treeXml, this._treeXml.documentElement.firstChild);
	data.appendChild(groupNode);
	return data;
}

proto._getGroupNodes = function(xmldoc, treeXml, treeNode)
{
	var groupNode = xmldoc.createElement("group");
	groupNode.setAttribute("name", String(treeNode.getAttribute("text")));
	groupNode.setAttribute("id", String(treeNode.getAttribute("_id")));

	var childNodes = treeNode.selectNodes("*");
	for(var i = 0; i < childNodes.length; i++)
	{
		var childNode = childNodes[i];
		var shapeId = childNode.getAttribute("shapeId");
		if(shapeId)
		{
			var shapeNode = xmldoc.createElement("area");
			var shape = this._contentDiv.children[shapeId];
			
			shapeNode.setAttribute("id", String(shape.style._id));
			shapeNode.setAttribute("name", String(childNode.getAttribute("text")));
			groupNode.appendChild(shapeNode);
			
			shapeNode.setAttribute("path", String(shape.path));
		}
		else
		{
			var subGroup = this._getGroupNodes(xmldoc, treeXml, childNode);
			groupNode.appendChild(subGroup);
		}
	}
	return groupNode;
}


proto.unload = function()
{
	this.shape_contextMenu.destroy();	
	this.tree_contextMenu.destroy();
	
	this._tree._parentJSO = null;
	CNFormManager.destroyJSObject(this._tree);
	this._tree = null;
	this._treeXml = null;
}

proto.cm_createContextMenu = function()
{
	if(this._readOnly) return;

	this.shape_contextMenu = new PopupMenu(document.body);
	this.shape_contextMenu.element.style.width = "180px";
	this.shape_contextMenu.parentJSObject = this;

	this.cm_finishItem = this.shape_contextMenu.createItem("Finish Shape");
	this.cm_finishItem.onmenuclick = this._cm_finishShape_onxlclick;

	this.shape_contextMenu.createHR();
	
	var item = this.shape_contextMenu.createItem("Delete", CNFormManager.neutralIconsPath + "delete.gif");
	item.onmenuclick = this._cm_delete_onxlclick;
}

proto.tree_createContextMenu = function()
{
	if(this._readOnly) return;

	this.tree_contextMenu = new PopupMenu(document.body);
	this.tree_contextMenu.element.style.width = "180px";
	this.tree_contextMenu.parentJSObject = this;

	this._tree_addGroupItem = this.tree_contextMenu.createItem("Add group");
	this._tree_addGroupItem.onmenuclick = this._addGroup_onxlclick;

	var item = this.tree_contextMenu.createItem("Rename");
	item.onmenuclick = this._rename_onxlclick;

	this.tree_contextMenu.createHR();
	this._tree_deleteItem = item = this.tree_contextMenu.createItem("Delete", CNFormManager.neutralIconsPath + "delete.gif");
	item.onmenuclick = this._treeItemDelete_onxlclick;
}

proto._tree_oncontextmenu = function()
{
	var treeObject = CNUtil.findJSObject(event.srcElement);
	var jsObject = CNUtil.findJSObject(treeObject.element.parentElement);
	jsObject.tree_oncontextmenu();
}
proto.tree_oncontextmenu = function()
{
	if(this._readOnly) return;

	var l = CNUtil.findTag(event.srcElement, "DIV");
	if(!l.isNodeDiv) return;

	this.currentContextElement = l;
	
	this._tree_deleteItem.disabled = l.node.parentNode.tagName == "root";

	// NOTE: addGroup is not possible for shape nodes.
	this._tree_addGroupItem.disabled = l.node.getAttribute("isGroup") != "true";
	
	this.tree_contextMenu.show(event.clientX + document.body.scrollLeft, event.clientY + document.body.scrollTop);
	CNUtil.cancelEvent();
}

proto._rename_onxlclick = function()
{
	CNUtil.findJSObject(event.srcElement).parentJSObject.rename_onxlclick();
}
proto.rename_onxlclick = function()
{
	if(this._readOnly) return;
	
	this._isDirty = true;
	this._tree.beginEditLabel(this.currentContextElement);
}

proto._addGroup_onxlclick = function()
{
	CNUtil.findJSObject(event.srcElement).parentJSObject.addGroup_onxlclick();
}
proto.addGroup_onxlclick = function()
{
	if(this._readOnly) return;

	this._isDirty = true;
	var nodeDiv = this._tree.addNode(this.currentContextElement, "New group", 
		CNFormManager.neutralIconsPath + "shape-group.gif");
	nodeDiv.node.setAttribute("isGroup", "true");
	nodeDiv.node.setAttribute("_id", String(this._lastID++));
	
	this._tree.selectNodeDiv(nodeDiv, true);
	this._tree.beginEditLabel(nodeDiv);
}


proto._createAreaShape = function(finished)
{
	var shape = document.createElement("v:shape");
	shape.style.position = "absolute";
	shape.style.left = 0;
	shape.style.top = 0;
	shape.style.width = this._contentDiv.offsetWidth;
	shape.style.height = this._contentDiv.offsetHeight;
	shape.coordsize = this._contentDiv.offsetWidth + ", " + this._contentDiv.offsetHeight;
	shape.fillColor = "#9DBBE1";
	shape.style.filter = "alpha(opacity=" + (finished ? "75" : "50") + ")";
	shape.strokeWeight = 1;
	this._contentDiv.appendChild(shape);

	shape.attachEvent("oncontextmenu", this._cm_borderShape_oncontextmenu);

	shape.style._finished = finished;
	
	return shape;
}

// Area creation mode. =========================
proto._cm_element_onmousedown = function()
{
	CNUtil.findJSObject(event.srcElement).cm_element_onmousedown();
}
proto.cm_element_onmousedown = function()
{
	if(this._readOnly) return;

	var c = this._contentDiv.componentFromPoint(event.clientX, event.clientY)
	if(c.indexOf("scroll") != -1 || c == "outside") return;

	this._isDirty = true;
	if(event.button != 1) return;
	var coordPos;
	var x = event.x + this._contentDiv.scrollLeft;
	var y = event.y + this._contentDiv.scrollTop;
	var coord = x + "," + y;
	if(this.firstClick)
	{
		this.currentShape = this._createAreaShape();
		this.currentShape.style._id = this._lastID++;
		this._addShapeToTree(this.currentShape, this._currentTreeGroupNode);
	
		this.currentShape.path = "m " + coord + " xe";
		this.currentShape.coordNum = 0;

		this.firstClick = false;		
		
		this._selectShapes([this.currentShape]);
	}
	else
	{
		var path = String(this.currentShape.path);
		var subPath = path.substr(0, path.length - 2);

		path = subPath + "l " + coord + " xe";

		this.currentShape.coordNum++;
		
		this.currentShape.path = path;
	}

	this._createEditRect(x, y, this.currentShape.coordNum, this.currentShape);
}

proto._createEditRect = function(x, y, coordNum, shape)
{
	var rect = document.createElement("v:rect");
	rect.style.position = "absolute";
	rect.style.width = 4;
	rect.style.height = 4;
	rect.style.left = x - 2;
	rect.style.top = y - 2;
	rect.attachEvent("onmouseenter", this._cm_rect_onmouseenter);
	rect.attachEvent("onmouseleave", this._cm_rect_onmouseleave);	
	rect.attachEvent("onmousedown", this._cm_rect_onmousedown);
	rect.attachEvent("oncontextmenu", this._cm_borderShape_oncontextmenu);

	rect._coordNum = coordNum;
	rect.style._shape = shape;
	this._contentDiv.appendChild(rect);
}

proto._cm_borderShape_oncontextmenu = function()
{
	CNUtil.findJSObject(event.srcElement).cm_borderShape_oncontextmenu();
}
proto.cm_borderShape_oncontextmenu = function()
{
	if(this._readOnly) return;

	var l = event.srcElement;
	if(l.tagName == "rect") l = l.style._shape
	this.currentContextElement = l;
	// Show context menu.
	this.cm_finishItem.disabled = this.currentContextElement.style._finished == true
		|| 	String(this.currentContextElement.path).length < 25;
	this.shape_contextMenu.show(event.clientX + document.body.scrollLeft, event.clientY + document.body.scrollTop);
	CNUtil.cancelEvent();
}

proto._cm_delete_onxlclick = function()
{
	CNUtil.findJSObject(event.srcElement).parentJSObject.cm_delete_onxlclick();
}
proto.cm_delete_onxlclick = function()
{
	if(this._readOnly) return;

	this._isDirty = true;
	this._deleteShape(this.currentContextElement);
}

proto._cm_finishShape_onxlclick = function()
{
	CNUtil.findJSObject(event.srcElement).parentJSObject.cm_finishShape_onxlclick();
}
proto.cm_finishShape_onxlclick = function()
{
	if(this._readOnly) return;
	
	this._isDirty = true;
	this.firstClick = true;
	this.currentContextElement.style._finished = true;	
	this.currentContextElement.filters[0].opacity = 75;

	var id = this.currentContextElement.uniqueID;
	
	var nodeDiv = this._tree.element.all[id];
	this._tree.beginEditLabel(nodeDiv);
}

proto._cm_rect_onmouseenter = function()
{
	var l = event.srcElement;
	l.strokeWeight = 2;
}

proto._cm_rect_onmouseleave = function()
{
	var l = event.srcElement;
	l.strokeWeight = 1;
}

proto._cm_rect_onmousedown = function()
{
	CNUtil.findJSObject(event.srcElement).cm_rect_onmousedown();
}
proto.cm_rect_onmousedown = function()
{
	if(this._readOnly) return;
	
	this._isDirty = true;
	var l = event.srcElement;
	this.currentRect = l;
	var path = String(l.style._shape.path);
	l._xys = this.extractXYs(path);
	
	this._contentDiv.attachEvent("onmousemove", this._cm_rect_element_onmousemove);
	this._contentDiv.attachEvent("onmouseup", this._cm_rect_element_onmouseup);

	CNUtil.cancelEvent();
}

proto._cm_rect_element_onmousemove = function()
{
	CNUtil.findJSObject(event.srcElement).cm_rect_element_onmousemove();
}
proto.cm_rect_element_onmousemove = function()
{
	if(this._readOnly) return;

	var l = this.currentRect;

	var x = event.x + this._contentDiv.scrollLeft;
	var y = event.y + this._contentDiv.scrollTop;
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
}

proto._cm_rect_element_onmouseup = function()
{
	CNUtil.findJSObject(event.srcElement).cm_rect_element_onmouseup();
}
proto.cm_rect_element_onmouseup = function()
{
	if(this._readOnly) return;

	this._contentDiv.detachEvent("onmousemove", this._cm_rect_element_onmousemove);
	this._contentDiv.detachEvent("onmouseup", this._cm_rect_element_onmouseup);
	this.currentRect = null;
}


// Tree operations. =================================
proto._tree_onselectedindexchange = function(ev)
{
	CNUtil.findJSObject(this.element.parentElement).tree_onselectedindexchange(ev);
}
proto.tree_onselectedindexchange = function(ev)
{
	var groupNodeDiv = ev.nodeDiv;
	while(groupNodeDiv && groupNodeDiv.node.getAttribute("isGroup") != "true")
	{
		groupNodeDiv = groupNodeDiv.parentElement.previousSibling;
	}
	this._currentTreeGroupNode = groupNodeDiv;
	
	var shapeId = ev.nodeDiv.node.getAttribute("shapeId");
	if(shapeId)
	{
		// Shape node selected.
		var shape = this._contentDiv.children[String(shapeId)];
		this._selectShapes([shape]);
		
		this._bringToFront(shape);
	}
	else if(ev.nodeDiv.node.getAttribute("isGroup") == "true")
	{
		var subShapes = ev.nodeDiv.node.selectNodes(".//node[@shapeId]");
		var shapes = [];
		for(var i = 0; i < subShapes.length; i++)
		{
			var shapeId = subShapes[i].getAttribute("shapeId")
			shapes.push(this._contentDiv.children[String(shapeId)]);
		}
		this._selectShapes(shapes);
	}
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

proto._bringToFront = function(shape)
{
	shape.style.zIndex = this._shapeTopZ;
	var rects = this._contentDiv.children.tags("rect");
	for(var i = 0; i < rects.length; i++)
	{
		if(rects[i].style._shape == shape) rects[i].style.zIndex = this._shapeTopZ;
	}
	this._shapeTopZ++;
}


proto._tree_onnodereorderallowed = function(ev)
{
	// Disallow groups into shapes and shapes into shapes.
	if(ev.dragTargetPos == 2 
		&& (ev.dragTarget.node.getAttribute("shapeId") !== null
		&& (ev.draggedNodeDiv.node.getAttribute("isGroup") == "true"
			|| ev.draggedNodeDiv.node.getAttribute("shapeId") != null))
	
	|| ev.dragTargetPos != 2 && ev.dragTarget.node.parentNode.tagName == "root") 
	{
		return false;
	}
	return true;
}

proto._tree_onnodereordered = function(ev)
{
	// Executed in tree context (this == tree).
	this._parentJSO._isDirty = true;
}

proto._addShapeToTree = function(shape, parentNodeDiv, name, doNotSelect)
{
	if(!name) name = "Shape";
	var nodeDiv = this._tree.addNode(parentNodeDiv, name, CNFormManager.neutralIconsPath + "shape.gif");
	var id = shape.uniqueID;
	nodeDiv.node.setAttribute("shapeId", id);
	nodeDiv.id = id;
	if(!doNotSelect) this._tree.selectNodeDiv(nodeDiv);
}

proto._treeItemDelete_onxlclick = function()
{
	CNUtil.findJSObject(event.srcElement).parentJSObject.treeItemDelete_onxlclick();
}
proto.treeItemDelete_onxlclick = function()
{
	if(this._readOnly) return;

	if(this.currentContextElement.node.getAttribute("isGroup") == "true")
	{
		this.formManager._showYesNoDialog("Confirm", 
				"<b>Do you want to delete shape group and all its shapes?</b>", 
				[this, "_shapeGroupDeleteContinue"]);
	}
	else
	{
		var shapeId = this.currentContextElement.node.getAttribute("shapeId");
		var shape = this._contentDiv.children[shapeId];
		this._deleteShape(shape);
	}
}

proto._shapeGroupDeleteContinue = function(dialog, cancel)
{
	if(cancel) return;

	var subShapes = this.currentContextElement.node.selectNodes(".//node[@shapeId]");
	for(var i = 0; i < subShapes.length; i++)
	{
		var shapeId = subShapes[i].getAttribute("shapeId")
		this._deleteShape(this._contentDiv.children[String(shapeId)]);
	}

	this._tree.deleteNode(this.currentContextElement);
}

proto._deleteShape = function(shape)
{
	this._isDirty = true;
	this.firstClick = true;

	var rects = this._contentDiv.children.tags("rect");
	var ix = 0;
	while(ix < rects.length)
	{
		if(rects[ix].style._shape == shape) rects[ix].removeNode();
		else ix++;
	}
	
	var id = String(shape.uniqueID);
	shape.removeNode();
	
	// Also remove shape tree node.
	var nodeDiv = this._tree.element.all[id];
	this._tree.deleteNode(nodeDiv);
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

proto.set_disabled = function(value)
{
	value = eval(value);
	if(this._disabled == value) return;
	this._disabled = value;
	this.disabler.style.visibility = this._disabled ? "inherit" : "hidden";
}
