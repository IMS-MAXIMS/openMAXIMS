/*
	v 2.0
*/
function CN_markercontrol()
{
	this.formManager = null;
	this.isMarkercontrol = true;
	
	this.img = null;

	this.isReady = false;
	this.toolbarDiv = null;
	this.contextMenu = null;
	this.cm_finishItem = null;
	
	this.areaCreationMode = false;
	this.areaOpacity = 0;

	this.currentContextElement = null;
	this.toolTip = null;

	this.toolbarWidth = 24;
	this.trashMargin = 30;

	this.placedImgOffX = 8; // Cross img center.
	this.placedImgOffY = 8;
	this.cursorOff = 3;

	this.lastImgID = 0;

	this.areaNames = [];
	this.shapes = [];

	this.imageElement = null;
	this._shapePath = null;
	this.hasShape = false;
	this._readOnly = false;
	this.draggedImg = null;
	this.currentButton = null;
	this.offX = 0;
	this.offY = 0;
	this.canceled = false;

	this.changedDocument = null;
	this.changedFragment = null;

	this.dragging = false;
	this.hideToolTipTimeout = null;
	this.pendingImg = null;

	this.firstClick = true;
	this.currentShape = null;
	this.currentRect = null;

	this.margin = 1E-9;

	this._disabled = false;
}
var proto = CN_markercontrol.prototype;

// ICNControl. ====================================
proto.createElement = function(node, parentElement)
{
	var l = document.createElement("div");
	parentElement.appendChild(l);

	this.element = l;
	l.jsObject = this;
	
	l.className = "cn_markercontrol";
	this.element_oncontentready(node);

	return l;
}

proto.loadData = function(node)
{
	var attr = node.getAttribute("readOnly");
	if(attr == "true") this._readOnly = true;

	this._set_disabled();
}

proto.storeData = function(xmldoc)
{
	var data = null;

	var nodes = this.changedFragment.selectNodes("*");
	if(nodes.length > 0)
	{
		if(this.areaCreationMode)
		{
			data = this.changedFragment.cloneNode(true);
			nodes = data.selectNodes("*");
			// Remove id from shape nodes.
			for(var i = 0; i < nodes.length; i++)
			{
				nodes[i].removeAttribute("id");
			}
		}
		else
		{
			data = this.changedFragment;
			// Make it clean.
			this.changedFragment = this.changedDocument.createDocumentFragment();
		}
	}
	
	return data;
}

proto.unload = function()
{
	this.contextMenu.destroy();	
}


// Main. ================================================
proto.element_oncontentready = function(node)
{
	this.element.attachEvent("ondragstart", CNUtil.cancelEvent);
	this.element.attachEvent("onselectstart", CNUtil.cancelEvent);
	this.element.attachEvent("oncontextmenu", CNUtil.cancelEvent);

	this.element.unselectable = "on";
	this.element.style.overflow = "hidden";
	if(this.element.currentStyle.position == "static") this.element.style.position = "relative";
	this.element.style.cursor = "default";
	
	// NOTE: we clone data node and then operate with it as with local data storage.
	this._node = node.cloneNode(true);
	
	var attr = node.getAttribute("areaOpacity");
	if(attr) this.areaOpacity = parseInt(attr);

	var attr = node.getAttribute("areaCreationMode");
	if(attr) this.areaCreationMode = attr == "true";

	var attr = node.getAttribute("img");
	if(attr)
	{
		this.img = String(attr);
		
		var imgEl = document.createElement("img");
		imgEl.attachEvent("onreadystatechange", this._img_onload);
		this.element.appendChild(imgEl);
		imgEl.src = this.img;
		imgEl.galleryImg = "false";
		
		//imgEl.attachEvent("onmouseenter", imgEl_onmouseenter);
		this.element.attachEvent("onmouseover", this._imgEl_onmouseenter);

		this.imageElement = imgEl;
	}

	this.changedDocument = new ActiveXObject("Microsoft.XMLDOM");
	this.changedFragment = this.changedDocument.createDocumentFragment();

	this._bitmapNodes = this._node.selectNodes("bitmaps/bitmap");
	this._bitmapSrcs = [];
	var count = this._bitmapNodes.length;
	for(var i = 0; i < count; i++)
	{
		var node = this._bitmapNodes[i];
		this._bitmapSrcs[String(node.getAttribute("id"))] = String(node.getAttribute("src"));
	}

	this.createToolTip();

	if(!this.areaCreationMode) this.createContextMenu();
	else this.cm_createContextMenu();

	this.element.attachEvent("onresize", this._element_onresize);

	this.disabler = document.createElement('<div style="position: absolute; background: white; z-index: 1000; filter: alpha(opacity=50); width: 100%; height: 100%; visibility: hidden; top: 0px; left: 0px; ">');
	this.element.appendChild(this.disabler);
}

proto._element_onresize = function()
{
	CNUtil.dispatchObject().element_onresize();
}
proto.element_onresize = function()
{
	if(this.toolbarDiv) 
	{
		this.toolbarDiv.style.left = this.element.clientWidth - this.toolbarWidth;
		this.toolbarDiv.style.height = this.element.clientHeight;
	}
}


proto.createContextMenu = function()
{
	this.contextMenu = new PopupMenu(document.body);
	this.contextMenu.element.style.width = "180px";
	this.contextMenu.parentJSObject = this;

	var item;
	item = this.contextMenu.createItem("Info");
	item.onmenuclick = this._item_info_onxlclick;

	this.contextMenu.createHR();
	
	this.deleteItem = item = this.contextMenu.createItem("Delete", CNFormManager.neutralIconsPath + "delete.gif");
	item.onmenuclick = this._item_delete_onxlclick;
}

proto.cm_createContextMenu = function()
{
	this.contextMenu = new PopupMenu(document.body);
	this.contextMenu.element.style.width = "180px";
	this.contextMenu.parentJSObject = this;

	var item = this.cm_finishItem = this.contextMenu.createItem("Finish Shape");
	item.onmenuclick = this._cm_finishShape_onxlclick;

	item = this.contextMenu.createItem("Delete", CNFormManager.neutralIconsPath + "delete.gif");
	item.onmenuclick = this._cm_delete_onxlclick;
}

proto.createToolTip = function()
{
	this.toolTip = document.createElement("<div class=toolTip>");
	this.element.appendChild(this.toolTip);
}

proto._img_onload = function()
{
	if(event.srcElement && event.srcElement.readyState != "complete") return;

	var jsObject = CNUtil.findJSObject(event.srcElement);
	setTimeout(function(){ jsObject.postInit(); }, 0);
}

proto.postInit = function()
{
	var node = this._node;
	this._node = null;

	var areas = node.selectNodes("areas/area");
	if(areas.length > 0) this.hasShape = true;
	for(var i = 0; i < areas.length; i++)
	{
		var area = areas[i];
		
		var shape = this.createShape();

		shape.areaIndex = i;
		shape.path = String(area.getAttribute("path"));
		shape.style.filter = "alpha(opacity=" + this.areaOpacity * 1 + ")";
		shape.attachEvent("onmouseover", this._shape_onmouseover);
		
		shape.shapeName = this.areaNames[i] = String(area.getAttribute("name"));
		this.shapes[i] = shape;
	}

	if(!this.areaCreationMode)
	{			   
		this.createToolbar(node);

		this._set_readOnly();

		var images = node.selectSingleNode("marks");
		if(images) this.createImages(images);
	}
	else
	{
		this.element.attachEvent("onmousedown", this._cm_element_onmousedown);
	}

	this.isReady = true;
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
	var fill = document.createElement("v:fill");
	fill.on = "true";
	fill.color = "red";
	shape.appendChild(fill);
	this.element.appendChild(shape);
	return shape;
}


proto.createToolbar = function(node)
{
	if(this.element.offsetWidth < this.imageElement.offsetWidth + this.toolbarWidth)
	{
		var inc = this.imageElement.offsetWidth + this.toolbarWidth - this.element.offsetWidth;
		this.element.style.width = this.element.offsetWidth + inc;
	}

	var div = this.toolbarDiv = document.createElement("<div class=markerToolbar>");
	div.unselectable = "on";
	div.style.position = "absolute";
	div.style.width = this.toolbarWidth;
	div.style.height = this.element.clientHeight;
	div.style.left = this.element.clientWidth - this.toolbarWidth;
	div.style.top = 0;
	div.align = "center";
	div.style.cursor = "default";
	this.element.appendChild(div);
	
	var bitmaps = this._bitmapNodes;
	var bitmapCount = bitmaps.length;
	for(var i = 0; i < bitmapCount; i++)
	{
		var bitmap = bitmaps[i];
		var src = String(bitmap.getAttribute("src"));
		div.appendChild(this.createButton(src, String(bitmap.getAttribute("id"))));
	}
	
	var trash = document.createElement("img");
	trash.src = CNFormManager.neutralIconsPath + "trash-1.gif";
	trash.style.position = "absolute";
	trash.style.left = 3;
	trash.style.bottom = 5;
	div.appendChild(trash);
}

proto.createImages = function(imagesNode)
{
	var images = imagesNode.selectNodes("mark");
	var imageCount = images.length;
	var id;
	for(var i = 0; i < imageCount; i++)
	{
		var node = images[i];
		id = node.getAttribute("id");
		if(id)
		{
			if(!isNaN(id * 1))
			{
				// Id is a number.
				id = id * 1;
				if(id >= this.lastImgID) this.lastImgID = id + 1;
			}
			else
			{
				// Id is a string, it doesn't interferes us.
			}
		}
		else
		{
			id = this.lastImgID++;
		}

		var bitmapId = String(node.getAttribute("bitmap"));
		var img = this.createImage(this._getBitmapSrc(bitmapId), bitmapId, id);

		img.style.left = node.getAttribute("x") * 1;
		img.style.top = node.getAttribute("y") * 1;
		//if(node.getAttribute("area")) img.areaIndex = node.getAttribute("area") * 1;
	}
}

proto._getBitmapSrc = function(id)
{
	if(id == "null") alert("ASSERT: mark bitmap id is undefined.")
	return this._bitmapSrcs[String(id)];
}

proto.createImage = function(src, bitmapId, markId)
{
	var img = document.createElement("img");
	img.src = CNFormManager.neutralImagesPath + src;
	img._bitmapId = bitmapId;
	img._markId = markId;
	img.style.position = "absolute";
	img.attachEvent("onmousedown", this._img_onmousedown);
	img.attachEvent("ondragstart", this._buttton_ondragstart);
	img.attachEvent("ondblclick", this._img_ondblclick);
	img.attachEvent("oncontextmenu", this._img_oncontextmenu);	
	img.className = "image";
	this.element.appendChild(img);
	return img;	
}

proto.createButton = function(img, bitmapId)
{
	var b = document.createElement("<img class=markerButton>");
	b.unselectable = "on";
	b.src = CNFormManager.neutralImagesPath + img;
	b._bitmapId = bitmapId;
	b.attachEvent("onmouseenter", this._button_onmouseenter);
	b.attachEvent("onmouseleave", this._button_onmouseleave);
	b.attachEvent("onmousedown", this._button_onmousedown);
	b.attachEvent("ondragstart", this._buttton_ondragstart);
	b.isButton = true;
	return b;
}
proto.deliteButton = function(b)
{
	b.className = "markerButton";
}

proto.showInfo = function(img)
{
	var node = this.changedDocument.createElement("mcinfo");
	node.setAttribute("mark", img._markId);
	this.changedFragment.appendChild(node);
	this.formManager.postData(this.element);
}

proto.beginDrag = function(l, isNewValue)
{
	this.canceled = false;

	this.draggedImg = l;
	this.draggedImg.isNew = isNewValue;
	this.dragging = true;
	
	this.calcElementOffset();
	
	this.draggedImg.originalLeft = this.draggedImg.offsetLeft;
	this.draggedImg.originalTop = this.draggedImg.offsetTop;

	this.placeDraggedAccEvent();

	this.element.attachEvent("onmousemove", this._element_onmousemove);
	this.element.attachEvent("onmouseup", this._element_onmouseup);
}

proto.calcElementOffset = function()
{
	this.offX = -top.document.body.scrollLeft;
	this.offY = -top.document.body.scrollTop;
	var l = this.element;
	while(l != null)
	{
		this.offX += l.offsetLeft;
		this.offY += l.offsetTop;
		l = l.offsetParent;
	}
}

proto.placeDraggedAccEvent = function()
{
	this.draggedImg.style.left = event.clientX - this.offX - this.placedImgOffX - this.cursorOff;
	this.draggedImg.style.top = event.clientY - this.offY - this.placedImgOffY - this.cursorOff;
}

proto.setHideToolTip = function()
{
	var obj = this;
	this.hideToolTipTimeout = setTimeout(function(){ obj.hideToolTip(); }, 700);
}

proto.showToolTip = function(l)
{
	if(this.hideToolTipTimeout != null) 
	{
		clearTimeout(this.hideToolTipTimeout);
		this.hideToolTipTimeout = null;
	}
	this.toolTip.innerText = l.shapeName;
	this.toolTip.style.left = l.currentStyle.left;
	var top = l.offsetTop - this.toolTip.offsetHeight;
	if(top < 0) top = 0
	this.toolTip.style.top = top;
	if(this.toolTip.filters[0]) this.toolTip.filters[0].Apply();
	this.toolTip.style.visibility = "inherit";
	if(this.toolTip.filters[0]) this.toolTip.filters[0].Play();
}

proto.hideToolTip = function()
{
	if(this.toolTip.currentStyle.visibility == "hidden") return;
	if(this.toolTip.filters[0]) this.toolTip.filters[0].Apply();
	this.toolTip.style.visibility = "hidden";
	if(this.toolTip.filters[0]) this.toolTip.filters[0].Play();
}

proto.removeImage = function(img)
{
	var node = this.changedFragment.selectSingleNode("*[@mark='" + img._markId + "']");
	if(node) node.parentNode.removeChild(node);

	var removed = this.changedDocument.createElement("mcdelete");
	removed.setAttribute("mark", img._markId);
	this.changedFragment.appendChild(removed);

	img.detachEvent("onmousedown", this._img_onmousedown);
	img.detachEvent("ondragstart", this._buttton_ondragstart);
	img.detachEvent("ondblclick", this._img_ondblclick);
	img.detachEvent("oncontextmenu", this._img_oncontextmenu);	
	img.style.display = "none";
	//img.removeNode();
}

proto.placePendingImg = function()
{
	this.hideToolTip();
	this.pendingImg.style.display = "inline";
	
	var node = null;
	var id;
	if(!this.pendingImg.isNew)
	{
	 	id = this.pendingImg._markId;
		node = this.changedFragment.selectSingleNode("mcmark[@id='" + id + "']");
	}
	else
	{
		id = this.lastImgID++;
	}

	if(!node)
	{
		node = this.changedDocument.createElement("mcmark");
		node.setAttribute("bitmap", this.pendingImg._bitmapId);
		node.setAttribute("mark", id);
		this.changedFragment.appendChild(node);
	}

	//if(this.pendingImg.areaIndex != null) image.setAttribute("area", this.pendingImg.areaIndex);
	node.setAttribute("x", this.pendingImg.offsetLeft);
	node.setAttribute("y", this.pendingImg.offsetTop);
}


// Event handlers. ========================================
proto._img_ondblclick = function()
{
	var img = event.srcElement;
	var jsObject = CNUtil.findJSObject(img);
	jsObject.showInfo(img);
}

proto._buttton_ondragstart = function()
{
	event.returnValue = false;
}

proto._button_onmouseenter = function()
{
	var jsObject = CNUtil.findJSObject(event.srcElement);
	if(!jsObject || !jsObject.isMarkercontrol) return;

	var b = event.srcElement;
	jsObject.button_onmouseenter(b);
}
proto.button_onmouseenter = function(b)
{
	if(this._readOnly || this.dragging || !b || !b.isButton) return;

	b.className = "markerButtonHover";

	CNUtil.cancelEvent();
}

proto._button_onmouseleave = function()
{
	var b = event.srcElement;
	var jsObject = CNUtil.findJSObject(b)
	if(!jsObject || !jsObject.isMarkercontrol) return;
	jsObject.button_onmouseleave(b);
}
proto.button_onmouseleave = function(b)
{
	if(this._readOnly || this.dragging || !b || !b.isButton) return;
	this.deliteButton(b);
}

proto._button_onmousedown = function()
{
	var b = event.srcElement;
	CNUtil.findJSObject(b).button_onmousedown(b);
}
proto.button_onmousedown = function(b)
{
	if(this._readOnly || this.dragging || !b || !b.isButton || event.button != 1) return;
	this.currentButton = b;

	b.className = "markerButtonDown";

	var img = this.createImage(this._getBitmapSrc(b._bitmapId), b._bitmapId);
		
	this.beginDrag(img, true);
}		  

proto._img_onmousedown = function()
{
	var b = event.srcElement;
	CNUtil.findJSObject(b).img_onmousedown();
}
proto.img_onmousedown = function()
{
	if(this._readOnly || this.dragging) return;
	if(event.button == 1) 
	{
		this.beginDrag(event.srcElement, false);
	}
}

proto._img_oncontextmenu = function()
{
	CNUtil.findJSObject(event.srcElement).img_oncontextmenu();
}
proto.img_oncontextmenu = function()
{
	this.currentContextElement = event.srcElement;
	// Show context menu.
	this.calcElementOffset();

	this.deleteItem.disabled = this._readOnly;

	this.contextMenu.show(event.clientX + document.body.scrollLeft, event.clientY + document.body.scrollTop);
	CNUtil.cancelEvent();
}

proto._item_info_onxlclick = function()
{
	CNUtil.findJSObject(event.srcElement).parentJSObject.item_info_onxlclick();
}
proto.item_info_onxlclick = function()
{
	this.showInfo(this.currentContextElement);
}

proto._item_delete_onxlclick = function()
{
	CNUtil.findJSObject(event.srcElement).parentJSObject.item_delete_onxlclick();
}
proto.item_delete_onxlclick = function()
{
	this.removeImage(this.currentContextElement);
}

proto._element_onmousemove = function()
{
	var jsObject = CNUtil.findJSObject(event.srcElement);
	if(!jsObject || !jsObject.isMarkercontrol) return;
	jsObject.element_onmousemove();
}
proto.element_onmousemove = function()
{
	this.draggedImg.style.visibility = "hidden";
	var l = document.elementFromPoint(event.clientX, event.clientY);
	if(l.tagName == "IMG" && l.areaIndex !== undefined)
	{
		l = this.shapes[l.areaIndex];
	}
	if(!l) return;
	
	if(l.tagName == "shape")
	{
		this.showToolTip(l);
	}
	else if(this.hideToolTipTimeout == null)
	{
		this.setHideToolTip();
	}
	this.placeDraggedAccEvent();
	this.draggedImg.style.visibility = "inherit";
}

proto._element_onmouseup = function()
{
	var jsObject = CNUtil.findJSObject(event.srcElement);
	if(!jsObject) return;
	jsObject.element_onmouseup();
}
proto.element_onmouseup = function()
{
	if(this.draggedImg == null) return;
	
	this.element.detachEvent("onmousemove", this._element_onmousemove);
	this.element.detachEvent("onmouseup", this._element_onmouseup);

	if(this.currentButton != null) this.deliteButton(this.currentButton);

	// 8 = safe right marker void margin.
	if(!this.canceled
	&& this.draggedImg.offsetTop >= this.toolbarDiv.offsetHeight - this.trashMargin
	&& this.draggedImg.offsetTop <= this.toolbarDiv.offsetHeight
	&& this.draggedImg.offsetLeft >= this.toolbarDiv.offsetLeft
	&& this.draggedImg.offsetLeft <= this.toolbarDiv.offsetLeft + this.trashMargin
	)
	{
		this.removeImage(this.draggedImg);
	}
	else if(this.canceled)
	{
		if(this.draggedImg.isNew) 
		{
			this.removeImage(this.draggedImg);
		}		  
		else
		{
			this.draggedImg.style.left = this.draggedImg.originalLeft;
			this.draggedImg.style.top = this.draggedImg.originalTop;
		}
	}
	else
	{
		this.pendingImg = this.draggedImg;
		this.pendingImg.style.display = "none";
	}

	this.currentButton = null;
	this.draggedImg = null;
	this.dragging = false;
}

proto._imgEl_onmouseenter = function()
{
	var jsObject = CNUtil.findJSObject(event.srcElement);
	if(!jsObject || !jsObject.isMarkercontrol) return;
	jsObject.imgEl_onmouseenter();
}
proto.imgEl_onmouseenter = function()
{
	if(this.pendingImg == null) return;

	if(this.hasShape)
	{
		var xys = this.findNearestShapePoint(event.clientX - this.offX, event.clientY - this.offY);

		this.pendingImg.style.left = xys.x - this.placedImgOffX;
		this.pendingImg.style.top = xys.y - this.placedImgOffY;
		//this.pendingImg.areaIndex = xys.shape.areaIndex;
		this.placePendingImg();
	}
	else
	{
		this.placePendingImg();
	}
	this.pendingImg = null;
}

proto._shape_onmouseover = function()
{
	CNUtil.findJSObject(event.srcElement).shape_onmouseover();
}
proto.shape_onmouseover = function()
{
	var shape = event.srcElement;
	if(this.pendingImg == null) return;
	//this.pendingImg.areaIndex = shape.areaIndex;
	this.placePendingImg();
	this.pendingImg = null;
	event.cancelBubble = true;
}


// Area creation mode. =========================

proto._cm_element_onmousedown = function()
{
	CNUtil.findJSObject(event.srcElement).cm_element_onmousedown();
}
proto.cm_element_onmousedown = function()
{
	if(event.button != 1) return;
	this.calcElementOffset();
	var coordPos;
	if(this.firstClick)
	{
		this.calcElementOffset();
		this.currentShape = this.createShape();

		var coord = (event.clientX - this.offX - this.cursorOff) + "," + (event.clientY - this.offY - this.cursorOff);
		
		this.currentShape.path = "m " + coord + " e";
		this.currentShape.coordNum = 0;
		this.currentShape.style.filter = "alpha(opacity=50)";
		this.currentShape.attachEvent("oncontextmenu", this._cm_borderShape_oncontextmenu);

		this.shapes[this.shapes.length] = this.currentShape;
		this.firstClick = false;		

		var node = this.changedDocument.createElement("mcarea");
		this.changedFragment.appendChild(node);
	
		node.setAttribute("path", String(this.currentShape.path));
		node.setAttribute("id", String(this.currentShape.uniqueID));
		this.currentNode = node;
	}
	else
	{
		var path = String(this.currentShape.path);
		var subPath = path.substr(0, path.length - 1);

		var coord = (event.clientX - this.offX - this.cursorOff) + "," + (event.clientY - this.offY - this.cursorOff);
		path = subPath + "l " + coord + " e";

		this.currentShape.coordNum++;
		
		this.currentShape.path = path;

		this.currentNode.setAttribute("path", String(path));
	}

	var rect = document.createElement("v:rect");
	rect.style.position = "absolute";
	rect.style.width = 4;
	rect.style.height = 4;
	//rect.strokeWeight = 2;
	rect.style.left = event.clientX - this.offX - this.cursorOff - 2;
	rect.style.top = event.clientY - this.offY - this.cursorOff - 2;
	rect.attachEvent("onmouseenter", this._cm_rect_onmouseenter);
	rect.attachEvent("onmouseleave", this._cm_rect_onmouseleave);	
	rect.attachEvent("onmousedown", this._cm_rect_onmousedown);

	rect._coordNum = this.currentShape.coordNum;
	rect.style._shape = this.currentShape;
	
	this.element.appendChild(rect);
}

proto._cm_borderShape_oncontextmenu = function()
{
	CNUtil.findJSObject(event.srcElement).cm_borderShape_oncontextmenu();
}
proto.cm_borderShape_oncontextmenu = function()
{
	this.currentContextElement = event.srcElement;
	// Show context menu.
	this.calcElementOffset();

	this.cm_finishItem.disabled = this.currentContextElement.style._finished == true;

	this.calcElementOffset();
	
	this.contextMenu.show(event.clientX + document.body.scrollLeft, event.clientY + document.body.scrollTop);
	CNUtil.cancelEvent();
}

proto._cm_delete_onxlclick = function()
{
	CNUtil.findJSObject(event.srcElement).parentJSObject.cm_delete_onxlclick();
}
proto.cm_delete_onxlclick = function()
{
	this.firstClick = true;

	for(var i = 0; i < this.shapes.length; i++)
	{
		if(this.shapes[i] == this.currentContextElement)
		{
			this.shapes.splice(i, 1);
			break;
		}
	}
	
	var rects = this.element.children.tags("rect");
	var ix = 0;
	while(ix < rects.length)
	{
		if(rects[ix].style._shape == this.currentContextElement) rects[ix].removeNode();
		else ix++;
	}
	
	var id = String(this.currentContextElement.uniqueID);
	this.currentContextElement.removeNode();
	
	var node = this.changedFragment.selectSingleNode("mcarea[@id='" + id + "']");
	this.changedFragment.removeChild(node);
}

proto._cm_finishShape_onxlclick = function()
{
	CNUtil.findJSObject(event.srcElement).parentJSObject.cm_finishShape_onxlclick();
}
proto.cm_finishShape_onxlclick = function()
{
	this.firstClick = true;
	this.currentContextElement.style._finished = true;	
	this.currentContextElement.filters[0].opacity = 75;
	this.currentNode = null;
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
	var l = event.srcElement;
	this.currentRect = l;
	var path = String(l.style._shape.path);
	l._xys = this.extractXYs(path);
	
	this.element.attachEvent("onmousemove", this._cm_rect_element_onmousemove);
	this.element.attachEvent("onmouseup", this._cm_rect_element_onmouseup);

	CNUtil.cancelEvent();
}

proto._cm_rect_element_onmousemove = function()
{
	CNUtil.findJSObject(event.srcElement).cm_rect_element_onmousemove();
}
proto.cm_rect_element_onmousemove = function()
{
	var l = this.currentRect;

	var x = event.clientX - this.offX - this.cursorOff;
	var y = event.clientY - this.offY - this.cursorOff;
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
	path += " e";
	l.style._shape.path = path;
}

proto._cm_rect_element_onmouseup = function()
{
	CNUtil.findJSObject(event.srcElement).cm_rect_element_onmouseup();
}
proto.cm_rect_element_onmouseup = function()
{
	var shape = this.currentRect.style._shape;
	var id = String(shape.uniqueID);
	var node = this.changedFragment.selectSingleNode("mcarea[@id='" + id + "']");
	node.setAttribute("path", String(shape.path));

	this.element.detachEvent("onmousemove", this._cm_rect_element_onmousemove);
	this.element.detachEvent("onmouseup", this._cm_rect_element_onmouseup);
	this.currentRect = null;
}



// Math ==================================

proto.findNearestShapePoint = function(x, y)
{
	var vectorAndShape = this.findNearestShapeVector(x, y);
	var vector = vectorAndShape[0];
	var shape = vectorAndShape[1];
	//var minDistance = vectorAndShape[2];
	var nearestVertex = vectorAndShape[3]
	
	var p = this.findNormalCrossing(x, y, vector);
	
	if(!this.layOnVector(p.x, p.y, vector))
	{
		return {x: nearestVertex[0], y: nearestVertex[1], shape: shape};
	}

	return {x: p.x, y: p.y, shape: shape};
}

proto.findNearestShapeVector = function(x, y)
{
	var x1, y1, x2, y2;
	
	var minShapeDistance = Number.MAX_VALUE;
	var nearestVector = null;
	var nearestShape = null;
	var nearestVertex = null;
	for(var i = 0; i < this.shapes.length; i++)
	{
		var shape = this.shapes[i];
		var path = String(shape.path);

		var XYs = this.extractXYs(path);

		var x1 = XYs[0][0];
		var y1 = XYs[0][1]
		var minDistance = Number.MAX_VALUE;
		var vector = null;
		for(var j = 1; j < XYs.length + 1; j++)
		{
			if(j == XYs.length) j = 0; // Last vector: (last point -> 0).
			var x2 = XYs[j][0];
			var y2 = XYs[j][1];
			var distance = this.findDistanceToVector(x, y, x1, y1, x2, y2);
			
			if(distance < minDistance) 
			{
				minXYIndex = j;
				minDistance = distance;
				vector = this.getVector(x1, y1, XYs[j][0], XYs[j][1]);
			}
			x1 = x2;
			y1 = y2;
			if(j == 0) break;
		}
		
		if(nearestVector == null || minDistance <= minShapeDistance)
		{
			minShapeDistance = minDistance;
			nearestVector = vector;
			nearestShape = shape;

			if(this.findDistanceToPoint(x, y, nearestVector.x1, nearestVector.y1)
				< this.findDistanceToPoint(x, y, nearestVector.x2, nearestVector.y2))
			{
				nearestVertex = [nearestVector.x1, nearestVector.y1];
			}
			else
			{
				nearestVertex = [nearestVector.x2, nearestVector.y2];
			}
		}
	}

	if(nearestVector == null) alert("Can't find nearest vector.")

	return [nearestVector, nearestShape, minShapeDistance, nearestVertex];
}

proto.extractXYs = function(path)
{
	var mPos = path.indexOf("m");
	var lPos = path.indexOf("l");
	var ePos = path.lastIndexOf("e");
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

proto.findDistanceToPoint = function(x, y, px, py)
{
	return Math.sqrt(Math.pow(x - px, 2) + Math.pow(y - py, 2));
}

proto.findDistanceToVector = function(x, y, x1, y1, x2, y2)
{
	var t;
	var w;
	
  	if(((x - x1) * (x2 - x1) + (y - y1) * (y2 - y1)) 
		* ((x - x2) * (x2 - x1) + (y - y2) * (y2 - y1)) > -this.margin)
	{
	    t = Math.pow(x - x1, 2) + Math.pow(y - y1, 2);
	    w = Math.pow(x - x2, 2) + Math.pow(y - y2, 2);
	    if(w < t) t = w;
	}
	else
	{
    	t = Math.pow((x - x1) * (y2 - y1) - (y - y1) * (x2 - x1), 2) /
             (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

	return Math.sqrt(t);	
}

proto.getVector = function(x1, y1, x2, y2)
{
	return {x1: x1, y1: y1, x2: x2, y2: y2};
}

proto.findNormalCrossing = function(x, y, vector)
{
	var a, b, c, d, e, f, g;

	a = vector.x2 - vector.x1; 
	b = vector.y2 - vector.y1; 
	c = a * x + b * y;
	d = b;         
	e = -a;        
	f = d * vector.x1 + e * vector.y1;
	g = a * e - b * d;

	var px = (c * e - b * f) / g;
	var py = (a * f - c * d) / g;

	return {x: px, y: py};
}
	
proto.layOnVector = function(x, y, vector)
{
	var t;

  	t = Math.pow((x - vector.x1) * (vector.y2 - vector.y1) - (y - vector.y1) * (vector.x2 - vector.x1), 2) 
				/ (Math.pow(vector.x2 - vector.x1, 2) + Math.pow(vector.y2 - vector.y1, 2));

  	if(t > Math.pow(this.margin, 2)) return false;

  	if(((x - vector.x1) * (vector.x2 - vector.x1) + (y - vector.y1) * (vector.y2 - vector.y1)) *
    	((x - vector.x2) * (vector.x2 - vector.x1) + (y - vector.y2) * (vector.y2 - vector.y1)) < this.margin) return true;

	return false;
}

proto.vectorStr = function(vector)
{
	return vector.x1 + ":" + vector.y1 + " " + vector.x2 + ":" + vector.y2;
}


// Properties. ========================================
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
	}
	else
	{
		if(this.toolbarDiv._filter) this.toolbarDiv.style.filter = this.toolbarDiv._filter;
	}
}

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
	this.disabler.style.visibility = this._disabled ? "inherit" : "hidden";
}
