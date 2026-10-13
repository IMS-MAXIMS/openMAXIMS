/*
	v. 2.2
	+ subForms/layoutManagers for subForm containers.
*/

function LayoutManager(container, initialWidth, initialHeight)
{
	this.setInitialBounds(initialWidth, initialHeight);

	this._resizedControls = [];
	this._container = container;
	container._layoutManager = this;
	
	this._contentDeltaWidth = -1;
	this._contentDeltaHeight = -1;
	this._to = null;

	this.formTopOffset = 0;
	
	this._TAHidden = null;

	this._collapsedHeight = 27;	
	this._resizesHandled = false;
	this._collapsedContainers = [];
}
LayoutManager.TOP = 0x1;    // 1
LayoutManager.LEFT = 0x2;   // 10
LayoutManager.RIGHT = 0x4;  // 100
LayoutManager.BOTTOM = 0x8; // 1000
LayoutManager.LEFTRIGHT = LayoutManager.LEFT | LayoutManager.RIGHT; //  110
LayoutManager.TOPBOTTOM = LayoutManager.TOP | LayoutManager.BOTTOM;	// 1001
LayoutManager.TOPLEFT = LayoutManager.TOP | LayoutManager.LEFT;

var proto = LayoutManager.prototype;

// Event.
proto.onPreResize = null;
proto.onResized = null;

proto.setHandleResizes = function(handle)
{
	if(handle) 
	{
		if(!this._resizesHandled) 
		{
			this._container.attachEvent("onresize", this._formContent_onresize);
		}
	}
	else 
	{
		if(this._resizesHandled) this._container.detachEvent("onresize", this._formContent_onresize);
	}
	this._resizesHandled = handle;
}

proto.setInitialBounds = function(initialWidth, initialHeight)
{
	this._initialWidth = initialWidth;
	this._initialHeight = initialHeight;
	
	this._originalInitialWidth = this._initialWidth;
	this._originalInitialHeight = this._initialHeight;
}

proto.resetInitialBounds = function()
{
	this._initialWidth = this._originalInitialWidth;
	this._initialHeight = this._originalInitialHeight;
}

proto.reload = function()
{
	this._resizedControls = [];
	this._collapsedContainers = [];
}

proto.unload = function()
{
	this.setHandleResizes(false);
	this.reload();
	this._container._layoutManager = null;
	this._container = null;
}

proto.processRawElement = function(l, x, y, w, h, anchor)
{
	var node = {x: x, y: y, width: w, height: h, getAttribute: CNFormManager._wrap_getAttribute};
	if(!l.jsObject) l.jsObject = {}

	if(anchor != -1) this.processNewControl(l, anchor, node, l.parentElement);
	else this.processNewControl(l, 0, node, l.parentElement);
}

proto.processNewControl = function(l, anchor, node, parentElement, isDelayedTopLevel)
{
	this._processLayout(l, anchor, node, false, parentElement, false);
	
	this._relayoutAgainstCollaspable(l);
}

proto._relayoutAgainstCollaspable = function(l)
{
	for(var id in this._collapsedContainers)
	{
		var cont = this._collapsedContainers[id];
		var jso = l.jsObject;
		// Commented because of FWUI-775 - this made bottom anchored controls to jump up on cont._delta distance.
		// Reactivated for 809, but moved to anchor* from offsets in expand container.
		if(cont._collapseDirection == "down") 
		{
			// Makes sense, as only bottom anchored contols can be placed below collapsable container.
			if(jso._anchorTop > cont.jsObject._anchorTop) 
			{
				jso._anchorTop -= cont._delta;
			}
		}
		else // up*/
		if(cont._collapseDirection == "up")
		{
			// Need to check non-anchored controls also.
			//if(l.offsetTop > cont.offsetTop)
			if(jso._anchorTop > cont.jsObject._anchorTop) 
			{
				if(jso._anchorTop !== undefined) jso._anchorTop -= cont._delta;
				else l.style.top = l.offsetTop - cont._delta;
			}
		}
	}
}

proto._processLayout = function(l, anchor, node, isTabbedContainer, parentElement, isContainer)
{
	if(this._contentDeltaWidth == -1) this._collectContentDeltaSize();

	var contentDeltaWidth;
	var contentDeltaHeight;
	var collection;
	var initialWidth;
	var initialHeight;
	var containerHeaderHeight = 0;

	if(parentElement._isContainerPanel)
	{
		while(parentElement && !parentElement.isContainer) parentElement = parentElement.parentElement;
		containerHeaderHeight = 30;
	}

	if(parentElement.isContainer && !parentElement.jsObject.isSubForm) 
	{
		collection = parentElement.jsObject._resizedControls;
		if(!collection) 
		{
			collection = parentElement.jsObject._resizedControls = [];
		}
		var xy = this._collectContainerDeltaSize(parentElement);
		contentDeltaWidth = xy.x;
		contentDeltaHeight = xy.y;
		initialWidth = parentElement.jsObject._anchorW;
		initialHeight = parentElement.jsObject._anchorH - containerHeaderHeight;
	}
	else 
	{
		collection = this._resizedControls;
		contentDeltaWidth = this._contentDeltaWidth;
		contentDeltaHeight = this._contentDeltaHeight;
		initialWidth = this._initialWidth;
		initialHeight = this._initialHeight;
	}
	
	var jso = l.jsObject;

	var x = parseInt(node.getAttribute("x"));
	var y = parseInt(node.getAttribute("y"));
	var w = parseInt(node.getAttribute("width"));
	var h = parseInt(node.getAttribute("height"));
	
	if(isTabbedContainer)
	{
		y += 22;
		h -= 22;
	}
	
	jso._anchorW = w;
	jso._anchorH = h;
	jso._anchor = anchor;

	var pushed = false;

	// Always push everything - this is required to move controls below top collapsable container.
	collection.push(l);
	pushed = true;

	// Pre-set them. Needed for required marks.
	if(!isNaN(x)) jso._anchorLeft = x;
	if(!isNaN(y)) jso._anchorTop = y;

	// Optimization for usual anchor.
	if(anchor == 0 || anchor == LayoutManager.TOPLEFT)
	{
		if(!isNaN(x)) l.style.left = x;
		if(!isNaN(y)) l.style.top = y;
		if(!isNaN(w)) l.style.width = w;
		if(!isNaN(h)) l.style.height = h;
		if(jso.layout) jso.layout();
		return;
	}
	
	var leftRight = (anchor & LayoutManager.LEFTRIGHT) == LayoutManager.LEFTRIGHT;
	var topBottom = (anchor & LayoutManager.TOPBOTTOM) == LayoutManager.TOPBOTTOM;
	
	if(leftRight || topBottom)
	{
		if(leftRight)
		{
			if(!isNaN(x)) l.style.left = x;
		}
		else
		{
			if(!isNaN(w)) l.style.width = w;
		}
		
		if(topBottom)
		{
			if(!isNaN(y)) l.style.top = y;
		}
		else
		{
			if(!isNaN(h)) l.style.height = h;
		}

		jso._anchorSide = anchor & (LayoutManager.LEFTRIGHT | LayoutManager.TOPBOTTOM);
		if(!pushed)
		{
			collection.push(l);
			pushed = true;
		}
		//this._setRecalculatedSize(l, contentDeltaWidth, contentDeltaHeight);
	}
	
	if(!leftRight)
	{
		if((anchor & LayoutManager.RIGHT) == LayoutManager.RIGHT && !isNaN(x) && !isNaN(w))
		{
			jso._anchorSide = jso._anchorSide | LayoutManager.RIGHT;
			jso._anchorLeft = x;
			l.style.left = x; // Set initial x (for non-resized layout).
			if(!pushed)
			{
				pushed = true;
				collection.push(l);
			}
		}
		else if(!isNaN(x))
		{
			l.style.left = x;
		}
		if(!isNaN(w)) l.style.width = w;
	}
	if(!topBottom)
	{
		if((anchor & LayoutManager.BOTTOM) == LayoutManager.BOTTOM && !isNaN(y) && !isNaN(h))
		{
			jso._anchorSide = jso._anchorSide | LayoutManager.BOTTOM;
			jso._anchorTop = y;
			l.style.top = y;  // Set initial y (for non-resized layout).
			if(!pushed)
			{
				pushed = true;
				collection.push(l);
			}
		}
		else if(!isNaN(y))
		{
			l.style.top = y;
		}
		if(!isNaN(h)) l.style.height = h;
	}
	if(l.parentElement.isContainer && !l.parentElement.jsObject._anchorSide)
	{
		this._setRecalculatedSize(l, contentDeltaWidth, contentDeltaHeight);
	}
}
// Removes layoutmanager controls tracking array.
proto.cleanupContainer = function(container) {
	container.jsObject._resizedControls = [];
}

proto._collectContentDeltaSize = function()
{
	var w, h;
	w = this._container.offsetWidth;
	h = this._container.offsetHeight;
	
	this._contentDeltaWidth = w - this._initialWidth;
	this._contentDeltaHeight = h - this._initialHeight - this.formTopOffset;

	if(this._contentDeltaWidth < -100) this._contentDeltaWidth = -100;
	if(this._contentDeltaHeight < 0) this._contentDeltaHeight = 0;
}

proto._collectContainerDeltaSize = function(container)
{
	var x = container.offsetWidth - container.jsObject._anchorW;
	var y = container.offsetHeight - container.jsObject._anchorH;
	
	if(x < -100) x = -100;
	if(y < 0) y = 0;
	
	return {x: x, y: y};
}

proto._setRecalculatedSize = function(l, contentDeltaWidth, contentDeltaHeight)
{
	var jso = l.jsObject;
	
	if(jso._anchor == 0 || jso._anchor == LayoutManager.TOPLEFT) return;
	
	if((jso._anchorSide & LayoutManager.LEFTRIGHT) == LayoutManager.LEFTRIGHT) 
	{
		var w = contentDeltaWidth + jso._anchorW;
		if(w > 0) l.style.width = w + "px";
	}
	else if((jso._anchorSide & LayoutManager.RIGHT) == LayoutManager.RIGHT) 
	{
		l.style.left = jso._anchorLeft + contentDeltaWidth;
	}

	if((jso._anchorSide & LayoutManager.TOPBOTTOM) == LayoutManager.TOPBOTTOM) 
	{
		var h = contentDeltaHeight + jso._anchorH;
		if(h > 0) l.style.height = h + "px";
	}
	else if((jso._anchorSide & LayoutManager.BOTTOM) == LayoutManager.BOTTOM) 
	{
		l.style.pixelTop = jso._anchorTop + contentDeltaHeight;
	}

	if(jso.layout) jso.layout();
	if(jso._layoutManager) {
		jso._layoutManager.doLayout();
	}
}

proto._formContent_onresize = function()
{
	var src = event.srcElement;
	if(!src) src = window;
	var lm = src._layoutManager;
	if(!lm) return;

	if(lm._to) clearTimeout(lm._to);
	lm._to = setTimeout(function(){ lm.doLayout(); }, 100);
}
proto.doLayout = function()
{
	if(!this.constructor) return;

	if(this.onPreResize) this.onPreResize();

	this._handle_onresize();
	
	if(this.onResized) this.onResized();
}
proto._handle_onresize = function()
{
	this._collectContentDeltaSize();
	this._resizeControls(this._resizedControls, this._contentDeltaWidth, this._contentDeltaHeight);
	
	if(this._TAHidden != null)
	{
		this._changeTAVisibility(this._TAHidden, true);
		this._TAHidden = null;
	}
}
proto._resizeControls = function(collection, contentDeltaWidth, contentDeltaHeight)
{
	for(var i = 0; i < collection.length; i++)
	{
		var l = collection[i];
		this._setRecalculatedSize(l, contentDeltaWidth, contentDeltaHeight);
		if(l.isContainer && l.jsObject._resizedControls && !l.jsObject.isSubForm)
		{
			var xy = this._collectContainerDeltaSize(l);
			this._resizeControls(l.jsObject._resizedControls, xy.x, xy.y);
		}
	}
}
proto.forceLayout = function(l)
{
	this._setRecalculatedSize(l, this._contentDeltaWidth, this._contentDeltaHeight);	
}
proto.forceContainerLayout = function(l)
{
	if(!l.isContainer) return;
	var xy = this._collectContainerDeltaSize(l);

	if(!l.jsObject._resizedControls) return;

	this._resizeControls(l.jsObject._resizedControls, xy.x, xy.y);
}


proto.processNewTabsTable = function(tabsTable, anchor, node, parentElement, isDelayedTopLevel)
{
	this._processLayout(tabsTable, anchor, node, false, parentElement, false);
	
	//if(isDelayedTopLevel)
	this._relayoutAgainstCollaspable(l);
}

proto.processNewTabbedContainer = function(contentElement, anchor, node, parentElement, isDelayedTopLevel)
{
	this._processLayout(contentElement, anchor, node, true, parentElement, false);

	//if(isDelayedTopLevel)
	this._relayoutAgainstCollaspable(l);
}

proto.processNewContainer = function(l, anchor, node, parentElement, isDelayedTopLevel)
{
	this._processLayout(l, anchor, node, false, parentElement, true);

	//if(isDelayedTopLevel)
	this._relayoutAgainstCollaspable(l);
}


proto.toggleContainer = function(l)
{
	if(!l._collapsed) this._collapseContainer(l, true);
	else this._expandContainer(l);
}

proto._collapseContainer = function(l, animate, skipParentCheck)
{
	if(l._collapsed) return;

	if(!skipParentCheck && l.parentNode._layoutManager) return l.parentNode._layoutManager._collapseContainer(l, animate, true);

	l._expandedHeight = l.offsetHeight;
	l.jsObject._expandedAnchorH = l.jsObject._anchorH;

	this._initialHeight -= l.jsObject._anchorH - this._collapsedHeight;

	l.jsObject._anchorH = this._collapsedHeight;
	
	l._collapsed = true;
	
	l.containerElement.style.overflow = "hidden";
	
	animate = false;
	
	if(l._collapseDirection == "down") 
	{
		if(!animate) this._collapseDown(l);
		else this._animateCollapseDown(l);
	}
	else if(l._collapseDirection == "up") 
	{
		if(!animate) this._collapseUp(l);
		else this._animateCollapseUp(l);
	}
}

proto._collapseDown = function(l)
{
	this._collapsedContainers[l.id] = l;

	this._changeTAVisibility(l, false);
	l.containerElement.style.visibility = "hidden";	
	l.style.height = this._collapsedHeight;

	var delta = l.jsObject._expandedAnchorH - l.jsObject._anchorH;
	l._delta = delta;
	var anchTop = l.jsObject._anchorTop;
	var resizedControls = this._resizedControls;
	for(var i = 0; i < resizedControls.length; i++)	{
		var control = resizedControls[i];
		if(control == l) continue;
		var jso = control.jsObject;
		if(jso._anchorTop !== undefined && jso._anchorTop > anchTop) {
			jso._anchorTop -= delta;
		}
	}
	this._updateContainer(l);
	this.doLayout();
}

proto._changeTAVisibility = function(l, visible)
{
	var tas = l.all.tags("TEXTAREA");
	for(var i = 0; i < tas.length; i++)
	{
		var ta = tas[i];
		
		if(visible)
		{
			if(ta._lm_currentVisibility) 
			{
				ta.style.visibility = ta._lm_currentVisibility;
			}
			else ta.style.visibility = "inherit";
			ta._lm_tempHidden = false;
		}
		else
		{
			if(!ta._lm_tempHidden) ta._lm_currentVisibility = ta.currentStyle.visibility;
			ta._lm_tempHidden = true;
			ta.style.visibility = "hidden";
		}
	}
}


proto._expandContainer = function(l, skipParentCheck)
{
	if(!l._collapsed) return;

	 if(!skipParentCheck && l.parentNode._layoutManager) return l.parentNode._layoutManager._expandContainer(l, true); 
	
	l.containerElement.style.visibility = "visible";

	l.jsObject._anchorH = l.jsObject._expandedAnchorH;
	this._initialHeight += l.jsObject._anchorH - l.offsetHeight;
	l.style.height = l._expandedHeight;
	
	var resizedControls = this._resizedControls;

	if(l._collapseDirection == "down")  // Means, container is on the bottom.
	{
		for(var i = 0; i < resizedControls.length; i++)
		{
			var control = resizedControls[i];
			if(control == l) continue;
			if(control.jsObject._anchorTop > l.jsObject._anchorTop)
			{
				control.jsObject._anchorTop += l._expandedHeight - this._collapsedHeight;
			}
		}
	}
	else if(l._collapseDirection == "up")  // Means, container is on the top.
	{
		for(var i = 0; i < resizedControls.length; i++)
		{
			var control = resizedControls[i];
			if(control == l) continue;
			if(control.offsetTop > l.offsetTop)
			{
				var delta = l.jsObject._expandedAnchorH - this._collapsedHeight;
				if(control.jsObject._anchorTop !== undefined) control.jsObject._anchorTop += delta;
				else control.style.top = control.offsetTop + delta;
			}
		}
	}
		
	delete this._collapsedContainers[l.id];
	
	l._collapsed = false;
	this._updateContainer(l);			
	
	l.containerElement.style.overflow = "hidden";
	
	this._changeTAVisibility(l, false);
	this._TAHidden = l;

	this.doLayout();
	
	l.containerElement.style.overflow = "visible";
}

proto._animateCollapseDown = function(l)
{
	var anim = new AnimResize(l, l.offsetWidth, this._collapsedHeight, false, true);
	var obj = this;
	anim.onend = function(){ obj._collapseDown(l); }
	Animator.start(anim);
}

proto._animateCollapseUp = function(l)
{
	var anim = new AnimResize(l, l.offsetWidth, this._collapsedHeight, false, false);
	var obj = this;
	anim.onend = function(){ obj._collapseUp(l); }
	Animator.start(anim);
}

proto._collapseUp = function(l)
{
	this._collapsedContainers[l.id] = l;

	this._changeTAVisibility(l, false);	

	l.containerElement.style.visibility = "hidden";
	
	l.style.height = this._collapsedHeight;
	var delta = l._delta = l.jsObject._expandedAnchorH - this._collapsedHeight;
				
	var resizedControls = l.parentElement.isContainer ? l.parentElement.jsObject._resizedControls : this._resizedControls; // FWUI-1351 - added support for collapsable cont. inside sub-form
	for(var i = 0; i < resizedControls.length; i++)
	{
		var control = resizedControls[i];
		if(control == l) continue;
		if(control.offsetTop > l.offsetTop)
		{
			if(control.jsObject._anchorTop !== undefined) control.jsObject._anchorTop -= delta;
			else control.style.top = control.offsetTop - delta;
		}
	}

	l.style.overflow = "hidden";

	this._updateContainer(l);
	
	this.doLayout();
}

proto._updateContainer = function(l)
{
	var collapsed = l._collapsed;
	// NOTE: doesn't support scrollable = false.
	l.containerElement.style.overflow = collapsed ? "hidden" : "auto";

	var button = CNFormManager.vista ? l.lastChild : l.children[0].rows(0).cells(1).all.tags("div")[0];
	Tooltip.set(button, collapsed ? "Expand" : "Collapse");
	var upper = l._collapseDirection != "down";

	var up;
	if(l._collapsed) up = !upper;
	else up = upper;

	if(CNFormManager.vista)
	{
		if(CNFormManager.subTheme == "black") {
			VistaSupport.updateImageSetButton(button, null, up ? 0 : 20);
		} else {
			var src;
			if(l._collapsed) src = upper ? "collapse-down.gif" : "collapse-up.gif";
			else src = upper ? "collapse-up.gif" : "collapse-down.gif";
			button.src = CNFormManager.themeImagesPath + (button._hover ? "hover-" : '') + src;
			button._src = src;
		}
	}
	else 
	{
		if(l._collapsed) button.innerText = upper ? "6" : "5";
		else button.innerText = upper ? "5" : "6";
	}
}