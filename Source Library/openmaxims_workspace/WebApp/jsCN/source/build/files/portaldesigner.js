/*
	v. 0.1
*/

function CN_portaldesigner() {
	this._lastZIndex = 1;
}

var proto = CN_portaldesigner.prototype;

proto.createElement = function(node, parentElement) {
	var l = this.element = document.createElement("div");
	l.className = "cn_portaldesigner";
	if(parentElement) parentElement.appendChild(l);
	
	l.jsObject = this;
	
	this._toolboxID = String(node.getAttribute("toolbox"));
	
	this._draggableWrapper = document.createElement("div");
	this._draggableWrapper.className = "cn_portaldesigner_draggableWrapper";
	document.body.appendChild(this._draggableWrapper);
	var div = document.createElement("div");
	div.className = "cn_portaldesigner_draggableWrapperInner"
	this._draggableWrapper.appendChild(div);
	
	var menu = this._component_contextMenu = new PopupMenu(document.body, "beforeend");
	menu.element.style.width = "180px";
	menu.parentJSObject = this;

	var item = menu.createItem("Delete");
	item.onmenuclick = this._delete_onxlclick;
	
	return l;
}
proto.unload = function() {
	this._component_contextMenu.destroy();

	this._currentDragged = null;
	document.body.removeChild(this._draggableWrapper);
	this._draggableWrapper = null;

	this._toolbox = null;
//	Event.purge(this); - done by fm.
}

proto.loadData = function(node) {
}

proto.validateLoading = function() {
	if(this._toolboxID && !this._toolboxInited) {
		this._initToolbox();
	}
}

proto.storeData = function(xmldoc) {
	return null;
}

proto._initToolbox = function(id) {
	this._toolboxInited = true;
	this._toolbox = document.getElementById(this._toolboxID);
	
	var cont = this._toolbox.containerElement;
	for(var i = 0; i < cont.children.length; i++) {
		var l = cont.children[i];
		
		if(!l.jsObject) continue;
		
		l.style.cursor = "move";
		l._dragRoot = true;
		
		var obj = this;
		Event.add(l, "mousedown", this, this.draggable_onmousedown);
	}
}

proto.draggable_onmousedown = function(event) {
	var l = Event.current().target;
	while(l && !l._dragRoot) l = l.parentNode;

	//this._currentDragged = l;
	this._currentDragged = this._draggableWrapper;

	var xy = Util.findAbsolutePos(l);

	//l.style.left = xy.x + "px";
	//l.style.top = xy.y + "px";
	this._draggableWrapper.style.left = xy.x + "px";
	this._draggableWrapper.style.top = xy.y + "px";
	this._draggableWrapper.style.width = l.offsetWidth + "px";
	this._draggableWrapper.style.height = l.offsetHeight + "px";

	var l = l.cloneNode(true);
	l.style.cursor = "";
	this._draggableWrapper.appendChild(l);
	l.style.top = 0;
	l.style.left = 0;
	
	this._draggableWrapper.style.display = "block";

	Event.add(document.body, "mouseup", this, this.draggable_onmouseup);
	Event.add(document.body, "mousemove", this, this.draggable_onmousemove);

	this._initComponentDragging(xy);
}

proto._initComponentDragging = function(xy) {
	this._dx = Event.current().screenX - xy.x;
	this._dy = Event.current().screenY - xy.y;

	var xy = Util.getXY(this.element);
	this._cachedLBounds = {xy: xy, r: this.element.offsetWidth + xy.x, b: this.element.offsetHeight + xy.y};
	this._dropOK = true;
}

proto.draggable_onmousemove = function(event) {
	Event.cancel(event);

	var x = Event.current().screenX - this._dx;
	var y = Event.current().screenY - this._dy;
	var dr = x + this._currentDragged.offsetWidth;
	var db = y + this._currentDragged.offsetHeight;

	//status = x + "," + y + " : " + this._cachedLBounds.xy.x + "," + this._cachedLBounds.xy.y
	//status = x + "," + y + " : " + this._cachedLBounds.r + "," + this._cachedLBounds.b
	
	if(x > this._cachedLBounds.xy.x && y > this._cachedLBounds.xy.y && dr < this._cachedLBounds.r && db < this._cachedLBounds.b) {
		x = Math.round(x / 4) * 4;
		y = Math.round(y / 4) * 4;

		if(!this._dropOK) {
			this._dropOK = true;
			this._currentDragged.firstChild.className = "cn_portaldesigner_draggableWrapperInner ";
			this._currentDragged.firstChild.style.cursor = "move";
		}
	} else {
		if(this._dropOK) {
			this._dropOK = false;
			this._currentDragged.firstChild.className = "cn_portaldesigner_draggableWrapperInner cn_portaldesigner_denied";
			this._currentDragged.firstChild.style.cursor = "no-drop";
		}
	}

	this._currentDragged.style.left = x + "px";
	this._currentDragged.style.top = y + "px";

}

proto.draggable_onmouseup = function(event) {
	Event.del(document.body, "mouseup", this, this.draggable_onmouseup);
	Event.del(document.body, "mousemove", this, this.draggable_onmousemove);
	this._currentDragged = null;
	
	if(this._draggableWrapper.childNodes.length > 1) {
		var l = this._draggableWrapper.childNodes[1];
		
		if(this._dropOK) {
			this._putL(this._draggableWrapper.cloneNode(true));
		}

		this._draggableWrapper.removeChild(l);
		this._draggableWrapper.style.display = "none";
	}
}

proto._putL = function(clonedDraggableWrapper) {
	var l = clonedDraggableWrapper;
	
	this._appendComponent(l);
		
	l.lastChild.style.width = "100%";
	l.lastChild.style.height = "100%";
	l.style.zIndex = this._lastZIndex++;
	
	Event.add(l, "mousemove", this, this.component_mousemove);
	Event.add(l, "mousedown", this, this.component_mousedown);
	Event.add(l, "contextmenu", this, this.component_contextmenu);
}

/**
Appends component to the main area + relocates according to current absolute coords.
*/
proto._appendComponent = function(l) {
	var xy = Util.getXY(this.element);

	var x = parseInt(l.style.left, 10) - xy.x;
	var y = parseInt(l.style.top, 10) - xy.y;

	this.element.appendChild(l);
	l.style.top = y + "px";
	l.style.left = x + "px";
}

proto._borderCursors = {lt: "nw-resize", lb: "sw-resize", l: "w-resize", rt: "sw-resize", rb: "nw-resize", 
	r: "w-resize", t: "n-resize", b: "n-resize"};
	
proto.component_mousemove = function(ev) {
	var w = Util.findByClassName(ev.target, "cn_portaldesigner_draggableWrapper");
	if(w == null) return;
	
	var overlay = w.firstChild;
	var border = this._getResizedBorder(w);

	if(border) {
		overlay.style.cursor = this._borderCursors[border];
	} else {
		overlay.style.cursor = "move";
	}
}

/**
Returns border name as 1-2 char code, where:
	t - top
	l - left
	b - bottom
	r - right
	l and r go first for 2 char codes, i.e. "lb", "rt"
*/
proto._getResizedBorder = function(l){
	var xy = Util.getXY(l);	
	var r = xy.x + l.offsetWidth;
	var b = xy.y + l.offsetHeight;

	var ex = Event.current().clientX;
	var ey = Event.current().clientY;

	var borderSize = 8;

	if(ex < xy.x + borderSize) { // Left border
		if(ey < xy.y + borderSize) return "lt";
		else if(ey > b - borderSize) return "lb"; 
		else return "l";
	} else if(ex > r - borderSize) { // Right border
		if(ey < xy.y + borderSize) return "rt";
		else if(ey > b - borderSize) return "rb";
		else return "r";
	} else if(ey < xy.y + borderSize) {
		return "t";
	} else if(ey > b - borderSize){
		return "b";
	}
	return null;
}

proto.component_mousedown = function() {
	if(Event.current().button != 1) return;

	var w = Util.findByClassName(Event.current().target, "cn_portaldesigner_draggableWrapper");
	if(w == null) return;
	
	w.style.zIndex = this._lastZIndex++;

	var border = this._getResizedBorder(w);
	
	if(border == null) {
		this._currentDragged = w;
//		var xy = Util.getXY(w);
//		document.body.appendChild(w);
//		w.style.left = xy.x + "px";
//		w.style.top = xy.y + "px";
//		this._initComponentDragging(xy);

		this._dx = Event.current().screenX - w.offsetLeft;
		this._dy = Event.current().screenY - w.offsetTop;

//		Event.add(document.body, "mouseup", this, this.component_resize_onmouseup);
//		Event.add(document.body, "mousemove", this, this.component_resize_onmousemove);
		this._action = "move";
	} else if(border) {
		this._currentDragged = w;
		this._dw = Event.current().screenX - w.offsetWidth;
		this._dh = Event.current().screenY - w.offsetHeight;
		this._rdw = -w.offsetWidth + document.body.offsetWidth - Event.current().clientX;
		this._rdh = -w.offsetHeight + document.body.offsetHeight - Event.current().clientY;
		
		this._action = border;
		// Disable border cursor changes.	
		Event.del(w, "mousemove", this, this.component_mousemove);
	}
	Event.add(document.body, "mouseup", this, this.component_resize_onmouseup);
	Event.add(document.body, "mousemove", this, this.component_resize_onmousemove);
}

proto.component_draggable_onmouseup = function() {
	Event.del(document.body, "mouseup", this, this.component_draggable_onmouseup);
	Event.del(document.body, "mousemove", this, this.draggable_onmousemove);

	if(this._dropOK) {
		this._appendComponent(this._currentDragged);
	} else {
		this._currentDragged.parentNode.removeChild(this._currentDragged);
	}

	this._currentDragged = null;
}

proto._snapToGrid = function(v) {
	return Math.round(v / 4) * 4;
}

proto.component_resize_onmousemove = function(event) {
	Event.cancel(event);
	
	if(this._action == "move") {
		this._currentDragged.style.left = this._snapToGrid(Event.current().screenX - this._dx) + "px";
		this._currentDragged.style.top = this._snapToGrid(Event.current().screenY - this._dy) + "px";
		return;
	}

	var minW = 50, minH = 18;
		
	if(this._action.indexOf("r") != -1) {
		var w = this._snapToGrid(Math.max(Event.current().screenX - this._dw, minW));
		this._currentDragged.style.width = w + "px";
	} else if(this._action.indexOf("l") != -1) {
		var w = this._snapToGrid(Math.max(document.body.offsetWidth - this._rdw - Event.current().clientX, minW));
		var dw = this._currentDragged.offsetWidth - w;
		this._currentDragged.style.width = w + "px";
		this._currentDragged.style.left = this._currentDragged.offsetLeft + dw + "px";
	}

	if(this._action.indexOf("b") != -1) {
		var h = this._snapToGrid(Math.max(Event.current().screenY - this._dh, minH));
		this._currentDragged.style.height = h + "px";
	} else if(this._action.indexOf("t") != -1) {
		var h = this._snapToGrid(Math.max(document.body.offsetHeight - this._rdh - Event.current().clientY, minH));
		var dh = this._currentDragged.offsetHeight - h;
		this._currentDragged.style.height = h + "px";
		this._currentDragged.style.top = this._currentDragged.offsetTop + dh + "px";
	}
}

proto.component_resize_onmouseup = function() {
	Event.del(document.body, "mouseup", this, this.component_resize_onmouseup);
	Event.del(document.body, "mousemove", this, this.component_resize_onmousemove);

	Event.add(this._currentDragged, "mousemove", this, this.component_mousemove);
	
	this._currentDragged = null;
}

proto.component_contextmenu = function(ev) {
	var w = Util.findByClassName(ev.target, "cn_portaldesigner_draggableWrapper");
	if(w == null) return;

	this._currentContextElement = w;
	
	this._component_contextMenu.show(ev.clientX + document.body.scrollLeft, ev.clientY + document.body.scrollTop);
	Event.cancel(ev);
}

proto._delete_onxlclick = function() {
	CNUtil.findJSObject(Event.current().target).parentJSObject.delete_onxlclick();
}
proto.delete_onxlclick = function() {
	if(!this._currentContextElement) return;

	this._currentContextElement.parentNode.removeChild(this._currentContextElement);

	this._currentContextElement = null;
}

proto = null;