/*
	v. 1.0
*/
function CN_iconnavigation() {
	this.formManager = null;

	this.disabler = null;
	this._disabled = false;

	this._structure = {}; // Keeps only 1st level (permanently visible) items.
	this._modify = {};

	this._popups = [];
	this._activeItems = [];

	this._selectedID = null;
}

var proto = CN_iconnavigation.prototype;

proto.createElement = function(node, parentElement) {
	var l = document.createElement("div");
	parentElement.appendChild(l);

	this.element = l;
	l.jsObject = this;

	l.className = "cn_iconnavigation";
	Event.add(l, "resize", this, this._l_onresize)

	this._init(node);	

	return l;
}
proto._l_onresize = function() {
	if(this._container.offsetHeight < 20 || this.element.offsetHeight < 20) return;
	this._container.style.height = this.element.offsetHeight - 10 + "px";
	if(this._pinButton && this._container.scrollHeight > this._container.offsetHeight) {
		Util.removeClass(this._pinButton, "iconnavigation_noscroll");
	} else {
		Util.addClass(this._pinButton, "iconnavigation_noscroll");
	}
}


proto.unload = function() {
	this._unloadCollapseMixin();
	this._structure = null;
	this._deleted = true;
	this.panels = null;
}

proto.loadData = function(node) {
	this._loadModify(node, this.element);

	if(CNFormManager.currentThemeName == "blue") {
		if(!this._canExpandCollapse) this._canExpandCollapse = node.getAttribute("canExpandCollapse") == "true";
		else this._canExpandCollapse = node.getAttribute("canExpandCollapse") != "false";

		var attr = node.getAttribute("collapsed");
		if(attr) {
			if(attr == "true") this.collapse(true);
			else this.expand(true);
		}

		this._updateCollapseElements();
	}
}

proto._loadModify = function(node, parentElement) {
	var childNodes = node.selectNodes("node");
	var childCount = childNodes.length;
	for(var i = 0; i < childCount; i++) {
		var subNode = childNodes[i];

		var attr = subNode.getAttribute("id");
		if(!attr) {
			Util.assert("navigation/modify/node without id");
			continue;
		}
		var id = String(attr);

		var item = this._structure[id];
		var attrs = Util.xmlAttributesToJson(subNode);
		if(item) {
			this._applyModify(item, attrs);
		} else {
			var modify = this._modify[id];
			if(modify) modify = Util.mixin(modify, attrs);
			else this._modify[id] = attrs; 
		}
	}
}
proto._applyModify = function(item, modify) {
	item.style.display = modify['visible'] != 'false' ? '' : 'none';
	var disabled = item.disabled = modify['enabled'] == 'false';
	if(modify['clickable']) item._clickable = modify['clickable'] == "true";
	Util.toggleClass(item, "cn_iconnavigation_item_disabled", disabled);
}

proto.storeData = function(xmldoc) {
	var fragment = xmldoc.createDocumentFragment();

	this._storeCollasedState(fragment);

	if(this._formSelected) {
		var node = xmldoc.createElement("navigation");
		node.setAttribute("form", this._selectedID);
		fragment.appendChild(node);
		this._formSelected = false;
	}

	return fragment;
}

// public API.
proto.isValid = function() {
	return true;
}

// public API.
proto.selectFormNode = function(id) {
	this._selectItemById(id);
}
proto._selectItemById = function(id) {
	if(this._selectedID == id) return;
	var selected = this._structure[this._selectedID];
	if(selected) {
		Util.removeClass(selected, "cn_iconnavigation_item_selected")
	}

	this._selectedID = id;

	var item = this._structure[id];
	if(!item) return;
	Util.addClass(item, "cn_iconnavigation_item_selected");
}

// Properties. ========================================================
proto.set_disabled = function(value) {
	value = eval(value);
	if(this._disabled == value) return;
	this._disabled = value;

	this._set_disabled();
}
proto._set_disabled = function() {
	this.element.className = this._disabled ? "cn_iconnavigation cn_navigation_disabled" : "cn_iconnavigation";
}

// Element functions. ===================================================
proto._init = function(node) {
	this.element.unselectable = true;

	this._canExpandCollapse = node.getAttribute("canExpandCollapse") != "false";

	this.buildElements(node);
}

proto.buildElements = function(node) {
	this.disabler = document.createElement("<div style=\"position: absolute; background: white; z-index: 1000; filter: alpha(opacity=50); width: 100%; height: 100%; visibility: hidden; \">");

	this._container = document.createElement("<div class='container'>")
	this.element.appendChild(this._container);

	var nodes = node.selectNodes("node");

	var count = nodes.length;
	for(var i = 0; i < count; i++) this._buildTopItem(nodes[i], i)

	this._buildCollapseElements();

	this._set_disabled();
}


proto._buildTopItem = function(node) {
	var div = this._buildItem(Util.xmlNodeToJson(node), 0);
	this._container.appendChild(div);
}
proto._buildItem = function(node, level) {
	var id = node.attributes['id'],
		modify;

	if(id !== undefined) {
		modify = this._modify[id];
		if(modify && level > 0 && modify['visible'] == 'false') {
			return null; // Completely skip rendering of the item for levels > 0.
		}
	}

	var div = document.createElement("<div class=cn_iconnavigation_item unselectable=on>");
	div._level = level;
	var imgDiv = document.createElement("<div class=icon_div>");

	var img = document.createElement("<img replacePNG=no>");
	imgDiv.appendChild(img);
	div.appendChild(imgDiv);

	var textDiv = document.createElement("<div class=text_div>");
	div.appendChild(textDiv)

	var attr = node.attributes["img"];
	if(attr) {
		img.src = attr;
		Util.replacePNGImage(img);
	}
	else img.style.display = "none";

	textDiv.innerText = String(node.attributes["caption"]);

	Event.add(div, "mouseenter", this, this._item_mouseenter);
	Event.add(div, "mouseleave", this, this._item_mouseleave);
	Event.add(div, "click", this, this._item_click);

    var subNodes = node.children;
	if(subNodes.length > 0) {
		var plusMinus = document.createElement("<img class='cn_iconnavigation_plusMinus'>");
		plusMinus.src =	CNFormManager.themeImagesPath + "nav-plus.gif";
		div.appendChild(plusMinus);

		div._subNodesJson = subNodes;
		if(node.attributes["clickable"] == "true") div._clickable = true;
	}

	if(id !== undefined) {
		 if(level == 0) this._structure[id] = div; // Only first level is in structure.
		 div._id = id;
	}

	if(this._selectedID === id) {
		Util.addClass(div, "cn_iconnavigation_item_selected");
	}
	if(modify) {
		this._applyModify(div, modify);
	}

	return div;
}

proto._item_mouseenter = function() {
	if(this._animating) return; // True only when collapsing is animated.
	Util.addClass(event.srcElement, "cn_iconnavigation_item_hover");
	if(this._showTO) clearTimeout(this._showTO);
	if(this._popupsTO) clearTimeout(this._popupsTO);
	var self = this,
		div = event.srcElement;
	if(Util.arrayIndexOf(this._activeItems, div) == -1) {
		this._hidePopups(div._level);
	} else if(this._popups[div._level] && this._popups[div._level].currentStyle.display != "none") {
		return;
	}
	if(div._subNodesJson) {
		this._showTO = setTimeout(function(){ self._showPopup(div); }, Animator.animating() ? 250 : 0); // no _animating is set while quick expanding.
	}
}
proto._item_mouseleave = function() {
	var div = event.srcElement,
		popup = Util.findByClassName(event.toElement, 'cn_iconnavigation_popup');

	if(popup != null && popup._level >= div._level) return;
	this._unhoverItem(div);
	this._hidePopups(div._level);
}
proto._item_click = function() {
	var item = Util.findByClassName(event.srcElement, "cn_iconnavigation_item");
	if(item == null || this._disabled || item.disabled || this.formManager._loading || this.formManager.isNavigationDisabled()) return;

	if(item._subNodesJson && !item._clickable) return;

	this._hidePopups(0);

	var selectedForm;
	var id = item._id;
	if(!id || id == this._selectedID && id == this.formManager._currentFormID) return;
	this._selectItemById(id);
	this._formSelected = true;

	if(this._quickExpand) {
		this.collapse();
		var self = this;
		// Gives small pause to be able to finish animation smoothly.
		setTimeout(function() { this.formManager.postData(self.element); }, 50);
	} else {
		this.formManager.postData(this.element);
	}
}

proto._unhoverItem = function(div) {
	Util.removeClass(div, "cn_iconnavigation_item_hover");
	var item = this._activeItems[div._level];
	if(item == div) this._activeItems[div._level] = null;
}
proto._hidePopups = function(toLevel) {
	for(var i = this._popups.length - 1; i >= toLevel; i--) {
		this._popups[i].style.display = "none";
		var item = this._activeItems[i];
		if(item) this._unhoverItem(item);
	}
	if(!this._popupVisible()) {
		Event.del(document.body, "keydown", this, this._body_keydown);
	}
}

proto._popupVisible = function() {
	// Return true if first level is visible.
	return this._popups[0] && this._popups[0].currentStyle.display != "none";
}
proto._visibleLevel = function() {
	for(var i = this._popups.length - 1; i >= 0; i--) {
		if(this._popups[i].currentStyle.display != "none") return i;
	}
	return -1;
}

proto._showPopup = function(div) {
	var nodes = div._subNodesJson;
	if(!nodes) return;

	var level = div._level,
		popup = this._popups[level];

	if(!this._popupVisible()) {
		Event.add(document.body, "keydown", this, this._body_keydown);
	}

	// create bg if none
	if(!popup) popup = this._createPopup(level);
	this._popupDiv = this._createPopupItems(popup, div._subNodesJson, level);
	this._layoutPopupTo(popup, div);

	this._activeItems[div._level] = div;
}
proto._body_keydown = function() {
	if(event.keyCode == 27) {
		this._hidePopups(this._visibleLevel());
	}
}
proto._createPopup = function(level) {
	Util.assert(function(){ return !this._popups[level]; }, this);
	var popup = this._popups[level] = document.createElement("<div class='cn_iconnavigation_popup'>");
	popup._level = level;
	this._createPopupBG(popup);
	document.body.appendChild(popup);

	Event.add(popup, "mouseenter", this, this._popup_mouseenter);
	Event.add(popup, "mouseleave", this, this._popup_mouseleave);
	return popup;
}
proto._popup_mouseenter = function() {
	var popup = event.srcElement;
	if(this._popupsTO) clearTimeout(this._popupsTO);
	if(this._quickExpandLeaveTO) clearTimeout(this._quickExpandLeaveTO);
}
proto._popup_mouseleave = function() {
	var popup = event.srcElement,
		toPopup = Util.findByClassName(event.toElement, 'cn_iconnavigation_popup');
	if(toPopup) return;

	var self = this;
	this._popupsTO = setTimeout(function() {
		self._hidePopups(popup._level);

		if(self._quickExpand && !self._popupVisible()) self._quickExpandStartLeaveTO();
	}, 250);
}


proto._createPopupBG = function(popup) {
	var tip = CNFormManager.themeImagesPath;

	// TODO: theme dependent via src/layout.html?
	popup.innerHTML =
	'<table class="popupBG" cellspacing="0" cellpadding="0" style="border: 0; width: 100%; height: 100%; filter: alpha(opacity=100); ">' +
		'<tr><td nowrap style="width: 15px; height: 14px; filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale, src=\'' + tip + 'nav-popup-bg_02.png\'); "></td>' +
			'<td nowrap style="width: 100%; filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale, src=\'' + tip + 'nav-popup-bg_03.png\'); "></td>' +
			'<td nowrap style="width: 16px; height: 14px; filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale, src=\'' + tip + 'nav-popup-bg_05.png\'); "></td></tr>' +
			'<tr><td style="height: 100%; filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale, src=\'' + tip + 'nav-popup-bg_07.png\'); "></td>' +
				'<td class="popupContentArea"></td>' +
				'<td style="filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale, src=\'' + tip + 'nav-popup-bg_09.png\'); "></td></tr>' +
		'<tr><td style="width: 15px; height: 18px; filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale, src=\'' + tip + 'nav-popup-bg_19.png\'); "></td>' +
			'<td style="filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale, src=\'' + tip + 'nav-popup-bg_20.png\')"></td>' +
			'<td style="widht: 16px; height: 18px; filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale, src=\'' + tip + 'nav-popup-bg_22.png\')"></td></tr>' +
	'</table>' +
	'<img style="width: 12px; height: 19px; position: absolute; top: 0; left: -9px; " src=\'' + tip + 'nav-popup-bg_12.png\'/>' +
	'<img style="width: 14px; height: 21px; position: absolute; top: 0; left: -9px; " src=\'' + tip + 'nav-popup-bg_15.png\'/>';
//	'<span style="width: 12px; height: 19px; position: absolute; top: 0; left: -9px; filter: alpha(opacity=50) progid:DXImageTransform.Microsoft.AlphaImageLoader(src=\'' + tip + 'nav-popup-bg_12.png\'); "></span>' +
//	'<span style="width: 14px; height: 21px; position: absolute; top: 0; left: -9px; filter: alpha(opacity=100) progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale, src=\'' + tip + 'nav-popup-bg_15.png\'); "></span>';
}
proto._createPopupItems = function(popup, subNodesJson, level) {
	if(popup.lastChild.className == "cn_iconnavigation_popup_items") {
		popup.removeChild(popup.lastChild);
	}
	var div = document.createElement("<div class='cn_iconnavigation_popup_items'>");
	popup.appendChild(div);

	var inner = document.createElement("<div class='cn_iconnavigation_popup_inner'>");
	div.appendChild(inner);

	inner.style.width = this._iconWidth * this._iconsInRow + "px"; // Some max value.

	level++;

	for(var i = 0; i < subNodesJson.length; i++) {
		var node = subNodesJson[i];
		var item = this._buildItem(node, level);
		if(item !== null) inner.appendChild(item);
	}
}
proto._iconWidth = 125,
proto._iconsInRow = 5;

proto._calcIconsInRow = function(popup) {
	var cont = popup.lastChild,
	inner = cont.firstChild,
	icons = inner.childNodes;
	if(icons.length == 0) return 0;
	var y = icons[0].offsetTop;

	for(var i = 0; i < icons.length; i++) {
		if(icons[i].offsetTop != y) return i;
	}
	return icons.length;
}


// NOTE: pixel values are for blue theme.
// TODO: somehow move pixel values to theme.
proto._layoutPopupTo = function(popup, div) {
	var xy = Util.findAbsolutePos(div),
		arrowL = popup.children[1],
		arrowR = popup.children[2],
		offsetY = 0,
		offsetX = 14,
		x,
		y,
		cont = popup.lastChild,
		inner = cont.firstChild,
		cs = cont.currentStyle,
		paddingW = parseInt(cs.paddingLeft) + parseInt(cs.paddingRight),
		paddingH = parseInt(cs.paddingTop) + parseInt(cs.paddingBottom);

	if(div.offsetHeight > 30) {
		offsetY = 24;
	} else if (div.offsetHeight < 24 && inner.childNodes.length > 6) {
		offsetY = -17;
	} else {
		offsetY = -8;
	}

	y = xy.y + offsetY,

	popup.style.zIndex = top.__ontopZ++;
	popup.style.visibility = "hidden";
	popup.style.display = "block";

	if(inner.childNodes.length < this._iconsInRow) {
		popup.style.width = inner.offsetWidth + paddingW + "px"; 
		inner.style.display = "inline";
		inner.style.width = "auto";
		inner.style.width = inner.offsetWidth + 5 + "px";
	}

	var w = inner.scrollWidth + paddingW;
	var h = inner.scrollHeight + paddingH;
	var paddingRight = 5;
	var right;
	// Put it on left or on right?
	if(document.body.clientWidth - (xy.x + div.offsetWidth) > document.body.clientWidth / 2) {
		// Right.
		x = xy.x + div.offsetWidth - offsetX;
		// Can we fit.
		if(x + w + CNFormManager.scrollBarSize > document.body.clientWidth) {
			w = document.body.clientWidth - x - CNFormManager.scrollBarSize - paddingRight;
			applyScrolling = true;
		}
		right = true;
	} else {
		// Left.
		x = xy.x - w + offsetX * 2;
		if(x < 4) {
			w = xy.x + offsetX;
			x = 4;
			applyScrolling = true;
		}
		right = false;
	}

	var applyScrolling = false,
		topDown = true;
	if(y + h >= document.body.clientHeight) { // Can't fit down.
		// Put it on bottom or on top?
		if(document.body.clientHeight - (xy.y + offsetY) > document.body.clientHeight / 2) {
			// Bottom (top-down).
			applyScrolling = true;
			h = document.body.clientHeight - y;
		} else {
			// Top (bottom-top).
		    y = xy.y + div.offsetHeight - h - offsetY;
		    if(y < 4) {
		        y = 4;
		        h = xy.y + div.offsetHeight - offsetY;
		        applyScrolling = true;
		    }
		    topDown = false;
		}
	}

	if(applyScrolling) {
		inner.style.overflow = "hidden";

		//if(inner.scrollHeight > inner.clientHeight || inner.scrollWidth > inner.clientWidth)

		w += CNFormManager.scrollBarSize + paddingRight;
		inner.style.overflow = "auto";
		inner.style.height = h - CNFormManager.scrollBarSize + "px";
		popup.style.width = w + "px";
		inner.style.width = w - paddingW - paddingRight + "px";
	}

/*	var realWidth = this._iconWidth * this._calcIconsInRow(popup); // Need to recalc scrollbar size additions again...
	if(inner.clientWidth > realWidth) {
		w = realWidth + paddingW;
	}*/

	popup.style.left = x + "px";
	popup.style.top = y + "px";
	popup.style.width = w + "px";
	popup.style.height = h + "px";

	var selectedArrow;
 	if(right) {
		arrowL.style.display = "block";
		arrowR.style.display = "none";
		selectedArrow = arrowL;
	} else {
		arrowR.style.display = "block";
		arrowL.style.display = "none";
		arrowR.style.left = w - 8 + "px";
		selectedArrow = arrowR
	}

	var arrowY;
	if(topDown) {
		arrowY = 20;
	} else {
		arrowY = h - selectedArrow.offsetHeight - 20;
	}
	if(arrowY + selectedArrow.offsetHeight + 15 >= h) arrowY = 10;
	selectedArrow.style.top = arrowY + "px";

	var zoom = .75;
	if(inner.childNodes.length < 30) {
		Animator.start(new AnimZoom(popup, zoom * 100, 100, !right, !right));
	}
	popup.style.visibility = "visible";
}

Util.mixin(proto, NavigationCollapseMixin);


proto = null;


