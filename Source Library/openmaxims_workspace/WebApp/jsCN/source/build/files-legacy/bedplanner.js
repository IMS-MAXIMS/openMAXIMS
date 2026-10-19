/*
	#1060 - readOnly changes.
	# idPrefix, bed group ids => bedX
	v. 2.0.0
	+ vista
*/
function CN_bedplanner()
{
	this.areaOpacity = 0;
	this.isReady = false;
	this.toolbarWidth = 20;
	this.snapCellSize = 10;
	this.canvasWidth = 2500;
	this.canvasHeight = 2500;
	this.zoomFactor = 1;
	this.drawingArea = null;
	this.group = null;
	this.scrollDiv = null;
	this.contextMenu = null;
	this.currentContextElement = null;
	this.offX = 0;
	this.offY = 0;
	this.lastImgID = 0;
	this._readOnly = false;
	this._scrollPosition = null;
	this.currentTool = null;
	this.lowerToolbar = null;
	this.groupButtons = [];
	this.pointerToolButton = null;
	this.lineToolButton = null;
	this.zoomValues = ["25%", "50%", "75%", "100%", "125%", "150%", "175%", "200%", "250%", "300%"];
	this.zoomCombo = null;
	this.draggedImg = null;
	this.currentButton = null;
	this.selectedElement = null;
	this.canceled = false;
	this.dragging = false;
	this.draggedCursorXOff = 0;
	this.draggedCursorYOff = 0;	
	this.dragStartX = 0;
	this.dragStartY = 0;
	
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
	this.boxCenterY = 0;
	this.currentBox = null;
	this.cm_group = null;
	this.cm_contextMenu = null;
	this.cm_currentContextElement = null;
	this.firstClick = true;
	this.currentShape = null;
	this.currentRect = null;
	this.shapes = [];
	this.cursorOff = 3;
	this.cm_activated = false;
	this.toolTip = null;
	this.toolTipCurrentShape = null
	this.hideToolTipTimeout = null;

	this.changedDocument = null;
	this.changedFragment = null;
	this._oninfoID = null;
	
	this._updatedBeds = [];
	this._deletedBeds = [];
	
	this._autoPostBack = false;
	this._bedTypes = {};
	this._imgToTypeMap = {};

	this._canAddBed = true;
}
var proto = CN_bedplanner.prototype;
var parentProto = CN_floorplanner.prototype;

proto.set_disabled = parentProto.set_disabled;

proto._tagPrefix = "bedplanner";

proto.createElement = function(node, parentElement)
{
	var l = document.createElement("div");
	parentElement.appendChild(l);

	this.element = l;
	l.jsObject = this;
	
	this._cloneTool("PointerTool");
	
	l.className = "cn_bedplanner";

	l.attachEvent("ondragstart", CNUtil.cancelEvent);
	l.attachEvent("onselectstart", CNUtil.cancelEvent);
	l.attachEvent("oncontextmenu", CNUtil.cancelEvent);
	l.attachEvent("onresize", this._element_onresize);	

	this.changedDocument = new ActiveXObject("Microsoft.XMLDOM");
	this.changedFragment = this.changedDocument.createDocumentFragment();

	this.element_oncontentready(node)
	this.createToolTip();
	
	this._autoPostBack = node.getAttribute("autoPostBack") == "true";

	return l;
}

proto.parent_loadData = parentProto.loadData;


proto.loadData = function(node) {
	this._processPlan(node);
	this.parent_loadData(node);

	var canAddBed = node.getAttribute("canAddBed") != "false";
	if(this._canAddBed != canAddBed) this.set_canAddBed(canAddBed);
}



proto.unload = function()
{
	if(this._zoomCombo) CNFormManager.destroyJSObject(this._zoomCombo);
	if(this.contextMenu) this.contextMenu.removeMenuTree();
	this._iconsPosSubMenu = this._textPosSubMenu = null;
	if(this.cm_contextMenu) this.cm_contextMenu.destroy();
	
	this._destroyTool(this.PointerTool);

	this._destroyTool(this); // ;)
}

proto.storeData = function(xmldoc)
{
	var boxedElementMemo = null;
	if(this.boxedElement) {
		boxedElementMemo = this.boxedElement;
		this.detachBoxes();
	}

	var data = this.changedFragment;
	for(var id in this._updatedBeds)
	{
		var shape = this.group.children[id];
		if(shape != null && shape.length) {
			Util.assert("Id conflict for shape: " + id);
		}

		// Already deleted?
		if(!shape || !shape.style) continue;
		id = id.substr("bed".length);		

		var node = this.changedFragment.selectSingleNode("*[@bedID='" + id + "']");
		if(!node)
		{
			node = this.changedDocument.createElement("bedplannernewbed");
			node.setAttribute("bedID", id);
			if(shape.style.type) node.setAttribute("type", shape.style.type);
			if(shape._textRect) node.setAttribute("textPos", shape._textRect._pos);
			if(shape._imgRect) node.setAttribute("imgPos", shape._imgRect._pos);
			
			this.changedFragment.appendChild(node);
		}

		var cdata = this.changedDocument.createCDATASection(this._filterVML(shape.outerHTML));
		node.appendChild(cdata);
	}
	for(var id in this._deletedBeds)
	{
		var node = this.changedFragment.selectSingleNode("*[@bedID='" + id + "']");
		if(node) node.parentNode.removeChild(node);
		id = id.substr("bed".length);
		node = this.changedDocument.createElement("bedplannerremovebed");
		node.setAttribute("bedID", id);
		this.changedFragment.appendChild(node);
	}

	if(this._oninfoID)
	{
		var infoNode = this.changedDocument.createElement(this._tagPrefix + "info");
		infoNode.setAttribute("bedID", this._oninfoID);
		this._oninfoID = null;
		data.appendChild(infoNode);
	}
	if(this._oneditID) {
		var node = this.changedDocument.createElement(this._tagPrefix + "edit");
		node.setAttribute("bedID", this._oneditID);
		this._oneditID = null;
		data.appendChild(node);
	}

	this._updatedBeds = [];
	this._deletedBeds = [];

	if(boxedElementMemo != null) this.attachBoxes(boxedElementMemo);

	return data;
}


proto._cloneTool = parentProto._cloneTool;
proto._destroyTool = parentProto._destroyTool;


// Events. ====================
proto.oninfo = function(ev)
{
	var id = ev.elementID.substr("bed".length);
	this._oninfoID = id;
	this.formManager.postData(this.element);
}

proto._filterVML = parentProto._filterVML

proto.onchange = function(ev)
{
	var node = null;
	switch(ev.type)
	{
		case "move":
		case "resize":
		case "flipHorizontal":
		case "flipVertical":
		case "resetSize":
		case "resetRotation":
		case "newBed":
		case "metaPos":
			this._updatedBeds[String(ev.shape.id)] = true;
			break;

		case "delete":
			this._deletedBeds[String(ev.shape.id)] = true;
			break;
	}
	
	if(this._autoPostBack && (ev.type == "newBed" || ev.type == "delete")) {
		this.formManager.postData(this.element);
	}
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
	if(this._readOnly) { // #1060
		this._toLowToolbar();

		this.cm_group.filters[0].opacity = 0;
		this.drawingArea.style.backgroundImage = "none";
		this.drawingArea.style.backgroundColor = "white";
		Util.addClass(this.element, "readOnly");
	} else {
		this._toHighToolbar();

		this.cm_group.filters[0].opacity = 10;
		this.drawingArea.style.backgroundImage = "";
		this.drawingArea.style.backgroundColor = "";

		Util.removeClass(this.element, "readOnly");
	}
	this.layoutElements();
}

proto.set_canAddBed = function(val) {
	this._canAddBed = val;
	
	if(!this._canAddBed) {
		this._toLowToolbar();
	} else {
		this._toHighToolbar();
	}
	this.layoutElements();
}

proto._toLowToolbar = function() {
	this._zoomCombo.element.style.top = "4px";
	this._bedToolbar.style.display = "none";
	this.lowerToolbar.style.height = "29px";
}
proto._toHighToolbar = function() {
	this._zoomCombo.element.style.top = "22px";
	this._bedToolbar.style.display = "block";
	this.lowerToolbar.style.height = "";
}

proto.get_scrollPosition = parentProto.get_scrollPosition;
proto.set_scrollPosition = parentProto.set_scrollPosition;
proto._set_scrollPosition = parentProto._set_scrollPosition;

proto.get_Vml = parentProto.get_Vml;
proto.element_oncontentready = parentProto.element_oncontentready;
proto._postInit_TO = parentProto._postInit_TO;
proto._postInit = parentProto.postInit;

proto.postInit = function(node)
{
	this._postInit(node);
	this.element.attachEvent("onkeydown", this._img_element_onkeydown);
}

proto.updateCanvasSize = parentProto.updateCanvasSize;

proto.loadVML = function(node)
{
	var bedNodes = node.selectNodes("bed");
	for(var i = 0; i < bedNodes.length; i++)
	{
		var bedNode = bedNodes[i];
		
		var id = "bed" + bedNode.getAttribute("id");
		var shape = this.group.children[id];
		if(shape) 
		{
			// Remove old shape.
			shape.removeNode(true);
		}
		
		var vml = String(bedNode.selectSingleNode("vml").text);
		this.group.insertAdjacentHTML("beforeend", vml);
		
		if(vml.length > 0) {
			var lastAdded = this.group.lastChild;
			var attr = bedNode.getAttribute("tooltip");
			if(attr) Tooltip.attach(lastAdded, String(attr))
			
			if(id) lastAdded.setAttribute("id", id);
			
			lastAdded.style._canDelete = bedNode.getAttribute("canDelete") != "false";

			var img = lastAdded.children[0];
			var attr = bedNode.getAttribute("type");
			if(attr) {
				if(img && img.tagName == "image") {
					var newImg = this._bedTypes[String(attr)];
					if(newImg) img.src = newImg;
					lastAdded.style.type = String(attr);
				}
			} else {
				var type = this._imgToTypeMap[img.src];
				if(type) lastAdded.style.type = type;
			}

			var textRect = null;
			var attr = bedNode.getAttribute("text");
			var text = attr ? String(attr) : null;
			textRect = this._renderBedText(text, lastAdded);

			attr = bedNode.getAttribute("textPos");
			if(attr) textRect._pos = String(attr);
			else textRect._pos = "r";
			
			var images = bedNode.selectNodes("image");
			//if(images.length > 0) {
				var imgRect = this._renderBedImages(images, lastAdded);
				attr = bedNode.getAttribute("imgPos");
				if(attr) imgRect._pos = String(attr);
				else imgRect._pos = "l";
				this._setImgRectOrientation(imgRect);
			//}
			
			var attr = bedNode.getAttribute("number");
			if(attr) this._renderBedNumber(String(attr), bedNode, lastAdded);

			this._layoutBedMeta(lastAdded);
		}
	}

	var children = this.group.children;
	var childrenCount = children.length;
	for(var i = 0; i < childrenCount; i++)
	{
		var item = children[i];
		item.style.visibility = "visible";

		if(item.tagName == "group")
		{
			var img = item.children.tags("image")[0];
			if(img && img.src.indexOf("/bed-") != -1)
			{
				this.setNodeId(item, "bed");

				this.attachImageEvents(item);
				var val;
				val = item.style.snapX;
				if(val) item.style.snapX = parseInt(val);
				val = item.style.snapY;
				if(val) item.style.snapY = parseInt(val);
	
				val = item.style.hSnapZoom;
				if(val) item.style.hSnapZoom = parseInt(val);
				val = item.style.vSnapZoom;
				if(val) item.style.vSnapZoom = parseInt(val);
			}
		}
	}
	
	var attr = node.getAttribute("scrollPosition");
	if(attr) this.set_scrollPosition(String(attr));
}
proto._renderBedNumber = function(text, node, bed) {
	var rect = document.createElement("v:rect");
	rect.style.position = "absolute";
	rect.style.left = 0;
	rect.style.top = 35;

	rect.filled = "off";
	rect.stroked = "off";
	
	rect.style.fontWeight = "bold";
	rect.style.width = "100%";
	rect.style.height = "16px";
	bed.appendChild(rect);

	var textRect = document.createElement("v:textrect");
	var div = document.createElement("div");
	textRect.appendChild(div);
	div.style.textAlign = "center";
	div.innerText = text;

	var attr = node.getAttribute("numberColor");
	if(attr) div.style.color = String(attr);

	rect.appendChild(textRect);
}

proto._renderBedText = function(text, bed) {
	var rect = document.createElement("v:rect");	
	rect.className = "bedTextRect";
	rect.style.position = "absolute";
	rect.style.zIndex = bed.style.zIndex + 1;
	rect.stroked = "off";
	rect.filled = "off";
	rect.style.width = "80px";
	
	var span = document.createElement("span");
	span.style.background = "white";
	rect.appendChild(span);

	if(text) {
		span.innerHTML = text;
	} else {
		span.className = "noText";
		span.innerHTML = "[text area]";
	}

	this.group.appendChild(rect);
	
	rect.style.height = span.offsetHeight;
	rect.style.width = span.offsetWidth;

	bed._textRect = rect;
	return rect;
}

proto._renderBedImages = function(images, bed) {
	var rect = document.createElement("v:rect");	
	rect.style.position = "absolute";
	rect.style.zIndex = bed.style.zIndex + 1;
	rect.className = "imgRect"
	rect.stroked = "off"
	rect.filled = "off";
	this.group.appendChild(rect);
	var imgSpan = document.createElement("span");

	if(images.length == 0) {
		imgSpan.className = "noImg";
		imgSpan.innerText = "[icons area]";
	} else {
		for(var i = 0; i < images.length; i++) {
			var imageNode = images[i];
			var img = document.createElement("img");
			img.src = imageNode.getAttribute("img");
			imgSpan.appendChild(img);

			var attr = imageNode.getAttribute("tooltip");
			if(attr) Tooltip.attach(img, String(attr));
		}
	}

	rect.appendChild(imgSpan);
	rect.style.width = imgSpan.offsetWidth;
	rect.style.height = imgSpan.offsetHeight;

	bed._imgRect = rect;
	return rect;
}

proto._attachTextImgRects = function(bed) {
	this._renderBedImages([], bed);
	this._renderBedText("", bed);
	bed._imgRect._pos = "l";
	bed._textRect._pos = "r";
	this._layoutBedMeta(bed);	
}

proto._layoutBedMeta = function(bed) {
	var bedX = parseInt(bed.style.left),
		bedY = parseInt(bed.style.top);

	var textRect = bed._textRect;
	if(textRect) {
		this._layoutBedMetaItem(bed, textRect, bedY, bedX);
	}
	var imgRect = bed._imgRect;
	if(imgRect) {
		this._layoutBedMetaItem(bed, imgRect, bedY, bedX);
	}
}
proto._layoutBedMetaItem = function(bed, item, bedY, bedX) {
	var distance = 3;
	var xOffset = 0,
		yOffset = 0;
	var rot = Math.abs(bed.rotation);
	if(rot == 360) rot = 0;
	if(rot != 0 && rot != 180) {
		xOffset = -15;
	}

	switch(item._pos) {
		case 'l':
			item.style.top = bedY + yOffset + "px";
			item.style.left = bedX - item.offsetWidth + xOffset - distance + "px";
			break;
		case 'r':
			item.style.top = bedY + yOffset + "px";
			item.style.left = bedX + bed.offsetWidth + distance + xOffset + "px";
			break;
		case 't':
			item.style.top = bedY - item.offsetHeight + yOffset + "px";
			item.style.left = bedX - distance + "px";
			break;
		case 'b':
			item.style.top = bedY + bed.offsetHeight + distance + yOffset + "px";
			item.style.left = bedX - distance + "px";
			break;
	}
}
proto._setImgRectOrientation = function(imgRect) {
	if(imgRect._pos == "t" || imgRect._pos == "b") Util.addClass(imgRect, "horizontal");
	else Util.removeClass(imgRect, "horizontal");
	var imgSpan = imgRect.firstChild;
	imgRect.style.width = imgSpan.offsetWidth;
	imgRect.style.height = imgSpan.offsetHeight;
}

proto.updateBoxesPosition = function() {
	this.parent_updateBoxesPosition();
	var l = this.boxedElement;
	this._updateDraggingBed(l);
}

proto._updateDraggingBed = function(l) {
	if(l && l.tagName == "group") {
		this._layoutBedMeta(l);
	}
}


proto._processPlan = function(node)
{
	var vmlxml = null;
	var plan = node.selectSingleNode("plan");
	if(plan) vmlxml = plan.text;
	else
	{
		var noplan = node.selectSingleNode("noplan");
		if(noplan) vmlxml = "";
	}

	this.zoom(100);
	
	this.cm_loadAreas(node);

	if(vmlxml !== null)
	{
		if(vmlxml == "") this.group.innerHTML = "";
		else 
		{
			var div = document.createElement("div");
			div.innerHTML = vmlxml;
			if(div.firstChild) this.group.innerHTML = div.firstChild.innerHTML;
			else this.group.innerHTML = "";
		}
	}
}

proto.setNodeId = parentProto.setNodeId;

proto.createContextMenu = function()
{
	var menu = this.contextMenu = new PopupMenu(document.body);
	this.contextMenu.element.style.width = "180px";
	this.contextMenu.parentJSObject = this;

	var item;
	
	item = menu.createItem("Info");
	item.onmenuclick = this._item_info_onxlclick;

	item = menu.createItem("Edit");
	item.onmenuclick = this._item_edit_onxlclick;

	menu.createHR();

	item = menu.createItem("Reset Size");
	item.onmenuclick = this._item_resetsize_onxlclick;
	item = menu.createItem("Reset Rotation");
	item.onmenuclick = this._item_resetrotation_onxlclick;
	item = menu.createItem("Flip Vertical");
	item.onmenuclick = this._item_flipvertical_onxlclick;
	item = menu.createItem("Flip Horizontal");
	item.onmenuclick = this._item_fliphorizontal_onxlclick;

	menu.createHR();
	var textPosData = menu.createSubmenuEx("Text Position", CNFormManager.neutralIconsPath + "text_padding_left.png");
	var common = {callback: [this, this._textPos_menu_callback], radio: "textPos", twoState: true};
	var submenu = this._textPosSubMenu = textPosData.submenu;
	this._contextMenu_textPosItem = textPosData.item;  

	submenu.element.style.width = "132px";
	submenu.createBigIconItem(Util.merge({text: "Top", img: CNFormManager.neutralIconsPath + "shape-ar-top.png"}, common));
	submenu.createBigIconItem(Util.merge({text: "Bottom", img: CNFormManager.neutralIconsPath + "shape-ar-bottom.png"}, common));
	submenu.createBigIconItem(Util.merge({text: "Left", img: CNFormManager.neutralIconsPath + "shape-ar-left.png"}, common));
	submenu.createBigIconItem(Util.merge({text: "Right", img: CNFormManager.neutralIconsPath + "shape-ar-right.png"}, common));

	var iconsPosData = menu.createSubmenuEx("Icons Position", CNFormManager.neutralIconsPath + "shape_move_front.png");
	var common = {callback: [this, this._iconPos_menu_callback], radio: "iconsPos", twoState: true},
		submenu = this._iconsPosSubMenu = iconsPosData.submenu;
	submenu.element.style.width = "132px";
	submenu.createBigIconItem(Util.merge({text: "Top", img: CNFormManager.neutralIconsPath + "shape-ar-top.png"}, common));
	submenu.createBigIconItem(Util.merge({text: "Bottom", img: CNFormManager.neutralIconsPath + "shape-ar-bottom.png"}, common));
	submenu.createBigIconItem(Util.merge({text: "Left", img: CNFormManager.neutralIconsPath + "shape-ar-left.png"}, common));
	submenu.createBigIconItem(Util.merge({text: "Right", img: CNFormManager.neutralIconsPath + "shape-ar-right.png"}, common));

//	iconsPosData.submenu.createBigHR();
//	iconsPosData.submenu.createItem("Reset");

	var preDeleteHR = menu.createHR();

	item = menu.createItem("Delete", CNFormManager.neutralImagesPath + "delete.gif");
	item.onmenuclick = this._item_delete_onxlclick;
	this._contextMenu_deleteItems = [preDeleteHR, item];
}
proto._iconPos_menu_callback = function(ev) {
	var bed = this.currentContextElement;
	this._setImgRectOrientation(bed._imgRect); // Change orientation before layout calculations.
	this._setMetaItemPos(bed, bed._imgRect, ev.data.text);
}
proto._textPos_menu_callback = function(ev) {
	var bed = this.currentContextElement;
	this._setMetaItemPos(bed, bed._textRect, ev.data.text);
}
proto._setMetaItemPos = function(bed, rect, pos) {
	var posMap = {"Top": "t", "Bottom": "b", "Left": "l", "Right": "r"};
	rect._pos = posMap[pos];
	this._layoutBedMeta(bed);
	this.fire_onchange("metaPos", bed);
}

proto.fire_onchange = parentProto.fire_onchange;


proto._item_edit_onxlclick = function()
{
	var jso = CNUtil.dispatchObject().parentJSObject;
	jso._oneditID = String(jso.currentContextElement.getAttribute("id")).substr("bed".length);
	jso.formManager.postData(jso.element);
}


// Tools ==============================================
proto.cmdChangeTool = parentProto.cmdChangeTool;

proto._PointerTool = parentProto._PointerTool;

proto._shape_oncontextmenu = function()
{
	CNUtil.dispatchObject().shape_oncontextmenu();
}
proto.shape_oncontextmenu = function()
{
	if(this._readOnly) return;

	this.currentContextElement = event.srcElement;
	if(this.currentContextElement.tagName != "line") {
		var bed = this.currentContextElement = CNUtil.findTag(this.currentContextElement, "group");
		var sideMap = {l: "Left", t: "Top", r: "Right", b: "Bottom"};

		var textRect = bed._textRect;
		if(textRect) {
			var item = this._textPosSubMenu.findItem(sideMap[this._findMetaPos(bed, textRect)]);
			this._textPosSubMenu.pushItem(item);
			this._contextMenu_textPosItem.style.display = "";
		} else {
			this._contextMenu_textPosItem.style.display = "none";
		}
		var imgRect = bed._imgRect;
		if(imgRect) {
			var item = this._iconsPosSubMenu.findItem(sideMap[this._findMetaPos(bed, imgRect)]);
			this._iconsPosSubMenu.pushItem(item);
			this._contextMenu_textPosItem.nextSibling.style.display = "";
		}  else {
			this._contextMenu_textPosItem.nextSibling.style.display = "none";
		}
		this._contextMenu_textPosItem.nextSibling.nextSibling.style.display = imgRect || textRect ? "" : "none";
	}

	var deleteDisplay = this.currentContextElement.style._canDelete ? "" : "none";
	this._contextMenu_deleteItems[0].style.display = deleteDisplay;
	this._contextMenu_deleteItems[1].style.display = deleteDisplay;

	this.contextMenu.show(event.clientX + document.body.scrollLeft, event.clientY + document.body.scrollTop);
	CNUtil.cancelEvent();
}
proto._findMetaPos = function(bed, child) {
	var bedX = parseInt(bed.style.left, 10),
		bedY = parseInt(bed.style.top, 10),
		childX = parseInt(child.style.left, 10),
		childY = parseInt(child.style.top, 10),
		childMY = childY + child.offsetHeight / 2,
		childMX = childX + child.offsetWidth / 2;

	if(childMX < bedX) return "l";
	else if(childMX > bedX + bed.offsetWidth) return "r";
	else if(childY < bedY) return "t";
	else return "b";
}

proto._item_info_onxlclick = parentProto._item_info_onxlclick;
proto.item_info_onxlclick = parentProto.item_info_onxlclick;

proto.showInfo = parentProto.showInfo;

proto._item_delete_onxlclick = parentProto._item_delete_onxlclick;
proto.item_delete_onxlclick = function() {
	if(this.currentContextElement._imgRect) {
		this.currentContextElement._imgRect.removeNode(true);
	}
	if(this.currentContextElement._textRect) {
		this.currentContextElement._textRect.removeNode(true);
	}
	parentProto.item_delete_onxlclick.apply(this, arguments);
}

proto._item_resetsize_onxlclick = parentProto._item_resetsize_onxlclick;
proto.item_resetsize_onxlclick = parentProto.item_resetsize_onxlclick;


proto._item_resetrotation_onxlclick = parentProto._item_resetrotation_onxlclick;
proto.item_resetrotation_onxlclick = parentProto.item_resetrotation_onxlclick;

proto._item_flipvertical_onxlclick = parentProto._item_flipvertical_onxlclick;
proto.item_flipvertical_onxlclick = parentProto.item_flipvertical_onxlclick;

proto._item_fliphorizontal_onxlclick = parentProto._item_fliphorizontal_onxlclick;
proto.item_fliphorizontal_onxlclick = parentProto.item_fliphorizontal_onxlclick;


// Toolbar =============================================
proto.layoutElements = function()
{
	if(this.element.clientHeight < 16) return;
	this.scrollDiv.style.width = this.element.clientWidth;
	var h = this.scrollDiv.style.height = this.element.clientHeight - this.lowerToolbar.offsetHeight;
	
	this.lowerToolbar.style.width = this.element.clientWidth;
	this.lowerToolbar.style.top = this.scrollDiv.offsetHeight + 1;
}

proto.createToolbar = function(node)
{
	var div = this.lowerToolbar = document.createElement("div");
	div.className = "canvasToolbar";
	div.unselectable = "on";
	div.style.padding = "2px";
	div.style.paddingBottom = "4px";
	div.style.height = this.toolbarWidth * 2;
	div.style.position = "absolute";
	div.style.left = 0;
	div.style.cursor = "default";
	this.element.appendChild(div);
	
	var toolbarWidth = this.toolbarWidth;
	
	var bedToolbar = this._bedToolbar = document.createElement("span");
	this._bedToolbar.style.height = "100%";
	div.appendChild(bedToolbar);
	
	this._bedTypes = {};
	this._imgToTypeMap = {};

	var bedNodes = node.selectNodes("bed");
	for(var i = 0; i < bedNodes.length; i++)
	{
		var bedNode = bedNodes[i];
		
		var img = String(bedNode.getAttribute("img"));
		var type = String(bedNode.getAttribute("type"))
		
		this._bedTypes[type] = img;
		this._imgToTypeMap[img] = type;
	
		bedToolbar.appendChild(this.createDraggableButton(img, "", toolbarWidth * 1.2, toolbarWidth * 2.8, 1, 20, 37.99, type, "bed"));
	}
	
	var separator = document.createElement("<span class=toolBarVerticalSeparator>");
	bedToolbar.appendChild(separator);

	this._createZoomCombo(div);
}

proto._element_onresize = parentProto._element_onresize;

proto._createZoomCombo = parentProto._createZoomCombo;

proto._zoomCombo_onxlchanged = parentProto._zoomCombo_onxlchanged;
proto.zoomCombo_onxlchanged = parentProto.zoomCombo_onxlchanged;

proto.parent_zoom = parentProto.zoom;
proto.zoom = function(val) {
	this.parent_zoom(val);

	var rects = this.group.getElementsByTagName("rect");
	for(var i = 0; i < rects.length; i++) {
		var rect = rects[i];
		var inner = rect.firstChild;
		if (inner)
		{
			inner.style.zoom = this.zoomFactor;
		}
	}
}

// Draggable stuff. ========================================
{
	proto.createDraggableButton = parentProto.createDraggableButton;
	proto._draggableButtton_ondragstart = parentProto._draggableButtton_ondragstart;
	
	proto._draggableButton_onmouseenter = parentProto._draggableButton_onmouseenter;
	proto.draggableButton_onmouseenter = parentProto.draggableButton_onmouseenter;

	proto._draggableButton_onmouseleave = parentProto._draggableButton_onmouseleave;
	proto.draggableButton_onmouseleave = parentProto.draggableButton_onmouseleave;
	
	proto.deliteButton = parentProto.deliteButton;

	proto._draggableButton_onmousedown = parentProto._draggableButton_onmousedown;
	proto.draggableButton_onmousedown = parentProto.draggableButton_onmousedown;
	
	proto.parent_createImage = parentProto.createImage;

	proto.createImage = function() {
		var shape = this.parent_createImage.apply(this, arguments);

		this._renderBedText(null, shape);
		return shape;

	}


	
	proto.beginDrag = function(l, isNewValue)
	{
		if(this.currentTool && this.currentTool.handle_toolunselected) this.currentTool.handle_toolunselected();
	
		this.canceled = false;
	
		this.draggedImg = l;

		this.calcElementOffset();
		
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
		
		this.dragging = true;
		
		this.element.attachEvent("onmousemove", this._dr_element_onmousemove);
		this.element.attachEvent("onmouseup", this._dr_element_onmouseup);
	}
	
	proto._dr_element_onmousemove = function()
	{
		CNUtil.dispatchObject().dr_element_onmousemove();
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
		
		//this.draggedImg.style.visibility = "hidden";
		
		var l = document.elementFromPoint(event.clientX, event.clientY);
		if(l.tagName == "shape")
		{
			this.showToolTip(l);
		}
		else if(this.hideToolTipTimeout == null)
		{
			this._setHideToolTip_TO();
		}

		var x = event.clientX + this.scrollDiv.scrollLeft - this.offX;
		var y = event.clientY + this.scrollDiv.scrollTop - this.offY;

		x = Math.round(x / this.dragSnap) * this.dragSnap;
		y = Math.round(y / this.dragSnap) * this.dragSnap;

		this.draggedImg.style.left = x / this.zoomFactor - this.draggedCursorXOff;
		this.draggedImg.style.top = y / this.zoomFactor - this.draggedCursorYOff;
		
		//this.draggedImg.style.visibility = "visible";
		this._updateDraggingBed(this.draggedImg);
	}
	
	proto._setHideToolTip_TO = function()
	{
		var obj = this;
		this.hideToolTipTimeout = setTimeout(function(){ obj.hideToolTip(); }, 700);
	}	


	proto._dr_element_onmouseup = parentProto._dr_element_onmouseup;
	proto.dr_element_onmouseup = function()
	{
		if(this.draggedImg == null) return;
		
		this.element.detachEvent("onmousemove", this._dr_element_onmousemove);
		this.element.detachEvent("onmouseup", this._dr_element_onmouseup);
	
		if(this.draggedImg.style.isNew)
		{
			if(this.currentButton != null) this.deliteButton(this.currentButton);
		
			this.attachImageEvents(this.draggedImg);
	
			this.draggedImg.style.cursor = "move";
		
			this.currentButton = null;
			this.draggedImg.style.isNew = undefined;
		
			this._attachTextImgRects(this.draggedImg);

			this.fire_onchange("newBed", this.draggedImg);
		}
		else
		{
			this.fire_onchange("move", this.draggedImg);
		}

		this.validateBedPosition(this.draggedImg);

		this.attachBoxes(this.draggedImg);
		
		// TODO: refactor.
		this.cmdChangeTool(this.PointerTool);

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
		l.attachEvent("onclick", this._img_onclick); // beddplanner-bed-click request (8-07-2008)
	}

	proto.validateBedPosition = function(draggedImg)
	{
/*		var x = parseInt(draggedImg.style.left);
		var y = parseInt(draggedImg.style.top);
		
		var w = parseInt(draggedImg.style.width);
		var h = parseInt(draggedImg.style.height);
	
		var xy1 = [x, y];
		var xy2 = [x + w, y];
		var xy3 = [x, y + h];
		var xy4 = [x + w, y + h];
		
		var xy11 = this.clientRotateToElement(xy1, draggedImg);
		var xy22 = this.clientRotateToElement(xy2, draggedImg);
		var xy33 = this.clientRotateToElement(xy3, draggedImg);
		var xy44 = this.clientRotateToElement(xy4, draggedImg);
		
		var a1, a2, a3, a4;
		if((a1 = this.cm_areaContains(xy11[0], xy11[1])) != null 
		&& (a2 = this.cm_areaContains(xy22[0], xy22[1])) != null
		&& a1 == a2
		&& (a3 = this.cm_areaContains(xy33[0], xy33[1])) != null
		&& a3 == a1
		&& (a4 = this.cm_areaContains(xy44[0], xy44[1])) != null
		&& a4 == a1)
		{
			draggedImg.children[0].style.filter = "";
		}
		else
		{
			draggedImg.children[0].style.filter = "progid:DXImageTransform.Microsoft.Emboss()"; - // beddplanner-bed-click request (8-07-2008)
		}*/
	}

	//proto._img_ondblclick = parentProto._img_ondblclick;
	proto._img_onclick = function() {
		var jso = Util.dispatchObject();
		if(jso._readOnly) jso.img_ondblclick();
	}
	
	proto.img_ondblclick = parentProto.img_ondblclick;

	proto._img_element_onkeydown = function()
	{
		var jsObject = CNUtil.dispatchObject();
		if(jsObject && jsObject.img_element_onkeydown) jsObject.img_element_onkeydown();
	}
	proto.img_element_onkeydown = function()
	{
		if(this._readOnly) return;
		
		if(this.selectedElement)
		{
			var step = Math.ceil(1 / this.zoomFactor);
			if(event.shiftKey) step = 16 / this.zoomFactor;

			switch(event.keyCode)
			{
				case 38: // up
					this.selectedElement.style.top = parseInt(this.selectedElement.style.top) - step;
					this.validateBedPosition(this.selectedElement);
					CNUtil.cancelEvent();
					this.fire_onchange("move", this.selectedElement);
					break;
				case 40: // bottom
					this.selectedElement.style.top = parseInt(this.selectedElement.style.top) + step;
					this.validateBedPosition(this.selectedElement);
					CNUtil.cancelEvent();
					this.fire_onchange("move", this.selectedElement);
					break;
				case 37: // left
					this.selectedElement.style.left = parseInt(this.selectedElement.style.left) - step;
					this.validateBedPosition(this.selectedElement);
					CNUtil.cancelEvent();
					this.fire_onchange("move", this.selectedElement);
					break;
				case 39: // right
					this.selectedElement.style.left = parseInt(this.selectedElement.style.left) + step;
					this.validateBedPosition(this.selectedElement);
					CNUtil.cancelEvent();
					this.fire_onchange("move", this.selectedElement);
					break;				
			}
		}
	}

	proto._img_onmouseenter = function()
	{
		CNUtil.dispatchObject().img_onmouseenter();
	}
	proto.img_onmouseenter = function()
	{
		if(this._readOnly) return;
		var l = CNUtil.findTag(event.srcElement, "group");
		this.attachBoxes(l);
	}

	proto._img_onmouseleave = function()
	{
		CNUtil.dispatchObject().img_onmouseleave();
	}
	proto.img_onmouseleave = function()
	{
		if(this._readOnly) return;
		
		var l = CNUtil.findTag(event.srcElement, "group");
		this.tryToDetachBoxes();
	}

	proto._img_onmousedown = function()
	{
		CNUtil.dispatchObject().img_onmousedown();
	}
	proto.img_onmousedown = function()
	{
		if(this._readOnly || event.button != 1) return;
		var l = CNUtil.findTag(event.srcElement, "group");
		try {
			this.element.focus();
		} catch(e) {}
		this.selectElement(l);
		this.beginDrag(l);
		CNUtil.cancelEvent();
	}
	
	proto._drawingArea_onmousedown = function()
	{
		CNUtil.dispatchObject().drawingArea_onmousedown();
	}
	proto.drawingArea_onmousedown = function()
	{
		if(this._readOnly) return;
		this.deselectElement();
	}

	proto.selectElement = function(l)
	{
		this.deselectElement();
		this.selectedElement = l;	
		l.style.filter = "alpha(opacity=70)";
	}
	
	proto.deselectElement = function()
	{
		if(!this.selectedElement) return;
		this.selectedElement.style.filter = "";
		this.selectedElement = null;
	}
}


// Resize-rotate tool.
{
	
	proto.createBoxes = parentProto.createBoxes;
	
	proto.attachBoxes = parentProto.attachBoxes;
	
	proto.detachBoxes = parentProto.detachBoxes;
	
	proto.parent_updateBoxesPosition = parentProto.updateBoxesPosition;

	proto._box_oncontextmenu = parentProto._box_oncontextmenu;
	proto.box_oncontextmenu = parentProto.box_oncontextmenu;

	proto._resizeBox_onmouseleave = parentProto._resizeBox_onmouseleave;
	proto.resizeBox_onmouseleave = parentProto.resizeBox_onmouseleave;

	proto.tryToDetachBoxes = parentProto.tryToDetachBoxes;
	
	proto._resizeBox_onmousedown = parentProto._resizeBox_onmousedown;
	proto.resizeBox_onmousedown = parentProto.resizeBox_onmousedown;
	
	proto._box_line_drawingArea_onmousemove = parentProto._box_line_drawingArea_onmousemove;
	proto.box_line_drawingArea_onmousemove = parentProto.box_line_drawingArea_onmousemove
	
	proto._box_drawingArea_onmousemove = parentProto._box_drawingArea_onmousemove;
	proto.box_drawingArea_onmousemove = parentProto.box_drawingArea_onmousemove;

	proto.getCurrentAngle = parentProto.getCurrentAngle;
	
	proto.getCurrentCenter = parentProto.getCurrentCenter;

	proto._box_drawingArea_onmouseup = parentProto._box_drawingArea_onmouseup;
	proto.box_drawingArea_onmouseup = parentProto.box_drawingArea_onmouseup;
}

// Util ===============================

proto.calcElementOffset = function()
{
	var xy = CNUtil.calcElementOffset(this.element);
	this.offX = xy.x;
	this.offY = xy.y;
}

proto.rotateToElement = function(xy, l)
{
	var x = xy[0];
	var y = xy[1];
	
	var centerX = parseInt(l.style.left) + parseInt(l.style.width) / 2;
	var centerY = parseInt(l.style.top) + parseInt(l.style.height) / 2;

	var rotation = parseInt(l.style.rotation);
	if(isNaN(rotation)) rotation = 0;
	if(rotation == 0) return [x, y];
		
	var pia = rotation * (Math.PI / 180);
	
	var cx = x - centerX;
	var cy = y - centerY;

	var cosa = Math.cos(pia);
	var sina = Math.sin(pia);

	var x1 = cx * cosa - cy * sina + centerX;
	var y1 = cx * sina + cy * cosa + centerY;

	return [x1, y1];
}

proto.clientRotateToElement = function(xy, l)
{
	var xy2 = this.rotateToElement(xy, l);
	
	xy2[0] = Math.round(xy2[0] * this.zoomFactor - this.scrollDiv.scrollLeft + this.offX);
	xy2[1] = Math.round(xy2[1] * this.zoomFactor - this.scrollDiv.scrollTop + this.offY);
	
	return xy2;
}


// Area creation. =========================
{
	proto.cm_initGroup = parentProto.cm_initGroup;
	proto.cm_initAreaCreationMode = parentProto.cm_initAreaCreationMode;
	proto.cm_updateCanvasSize = parentProto.cm_updateCanvasSize;

	proto.cm_areaContains = function(x, y)
	{
		// Place cm_group on top.
		var oldZIndex = this.cm_group.style.zIndex;
		this.cm_group.style.zIndex = 50000;
		
		// Try to find some element.
		var el = document.elementFromPoint(x, y);

		// Put cm_group back.
		this.cm_group.style.zIndex = oldZIndex;
		
		if(this.cm_group.contains(el) || this.cm_group == el) return el;

		return null;
	}

	proto.cm_loadAreas = parentProto.cm_loadAreas;
	proto.cm_cleanData = parentProto.cm_cleanData;
	proto.cm_cleanRects = parentProto.cm_cleanRects;
	
	proto.cm_createContextMenu = function()
	{
		var menu = new PopupMenu(document.body);
		menu.element.style.width = "180px";
		menu.parentJSObject = this;
	
		var item = menu.createItem("Info");
		item.onmenuclick = this._cm_item_info_onxlclick;
		
		this.cm_contextMenu = menu;
	}

	proto.cm_createShape = function(path, doNotAssignId)
	{
		var shape = document.createElement("v:shape");
		shape.style.position = "absolute";
		shape.style.left = 0;
		shape.style.top = 0;
		shape.style.zIndex = 20000;
		shape.style.width = this.drawingArea.offsetWidth;
		shape.style.height = this.drawingArea.offsetHeight;
		shape.coordsize = this.drawingArea.offsetWidth + ", " + this.drawingArea.offsetHeight;
		var fill = document.createElement("v:fill");
		fill.on = "true";
		fill.color = "red";
		shape.appendChild(fill);
		this.cm_group.appendChild(shape);
		
		if(!doNotAssignId) this.setNodeId(shape);

		shape.path = path;
		shape.style.filter = "alpha(opacity=" + this.areaOpacity + ")";
		shape.attachEvent("oncontextmenu", this._cm_borderShape_oncontextmenu);
		shape.attachEvent("ondblclick", this._cm_shape_ondblclick);
		
		return shape;
	}

	proto._cm_shape_ondblclick = function()
	{
		CNUtil.dispatchObject().cm_shape_ondblclick();
	}
	proto.cm_shape_ondblclick = function()
	{
		this.showInfo(event.srcElement);
	}

	proto._cm_borderShape_oncontextmenu = parentProto._cm_borderShape_oncontextmenu;
	proto.cm_borderShape_oncontextmenu = function()
	{
		if(this._readOnly) return;
		this.cm_currentContextElement = event.srcElement;
	
		this.cm_contextMenu.show(event.clientX + document.body.scrollLeft, event.clientY + document.body.scrollTop);
		CNUtil.cancelEvent();
	}
	
	proto._cm_item_info_onxlclick = parentProto._cm_item_info_onxlclick;
	proto.cm_item_info_onxlclick = parentProto.cm_item_info_onxlclick;

	proto.cm_createMarkerareas = function(areas)
	{
		var count = areas.length;
		for(var i = 0; i < count; i++)
		{
			var node = areas[i];
			
			var path = String(node.getAttribute("path"));
			var area = this.cm_createShape(path, true)
			area.id = String(node.getAttribute("id"));
			this.setNodeId(area);
			
			area.shapeName = String(node.getAttribute("name"));
			
			this.shapes[this.shapes.length] = area;
			
			var coords = path.split(/\s|,/);
			for(var j = 0; j < coords.length; j += 2)
			{
				var x = parseInt(coords[j].replace("m", "").replace("l", ""));
				var y = parseInt(coords[j + 1]);
				if(isNaN(x) || isNaN(y)) break;
			}
		}
	}
}


// Tool tip. ===============================
{
	proto.createToolTip = function()
	{
		this.toolTip = document.createElement("<div class=toolTip>");
		this.element.appendChild(this.toolTip);
	}

	proto.showToolTip = function(l)
	{
		if(this.toolTipCurrentShape == l) return;
		
		if(this.hideToolTipTimeout != null) 
		{
			clearTimeout(this.hideToolTipTimeout);
			this.hideToolTipTimeout = null;
		}
		this.toolTip.innerText = l.shapeName;

		this.toolTip.style.left = l.offsetLeft + this.cm_group.offsetLeft - this.scrollDiv.scrollLeft;

		var top = l.offsetTop  + this.cm_group.offsetTop - this.toolTip.offsetHeight - this.scrollDiv.scrollTop;

		if(top < 0) top = 0
		this.toolTip.style.top = top;
		if(this.toolTip.filters[0]) this.toolTip.filters[0].Apply();
		this.toolTip.style.visibility = "visible";
		if(this.toolTip.filters[0]) this.toolTip.filters[0].Play();
		
		this.toolTipCurrentShape = l;
	}
	
	proto.hideToolTip = function()
	{
		if(this.toolTip.currentStyle.visibility == "hidden") return;
		if(this.toolTip.filters[0]) this.toolTip.filters[0].Apply();
		this.toolTip.style.visibility = "hidden";
		if(this.toolTip.filters[0]) this.toolTip.filters[0].Play();
		this.toolTipCurrentShape = null;
	}
}
