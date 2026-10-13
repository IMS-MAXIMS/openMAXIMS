var proto = {},
	NavigationCollapseMixin = proto;
proto._unloadCollapseMixin = function() {
	if(this._collapseButton) {
		this._collapseButton.parentNode.removeChild(this._collapseButton);
		this._collapseButton = null;
	}
}
proto._storeCollasedState = function(fragment) {
	if(this._navigationCollapedChanged) {
		var node = fragment.ownerDocument.createElement("navigation");
		node.setAttribute("collapsed", this._navigationCollapsed ? "true" : "false");
		fragment.appendChild(node);
		this._navigationCollapedChanged = false;
	}
}
proto._buildCollapseElements = function() {
	if(CNFormManager.currentThemeName != "blue") return;

	this._collapseBorder = document.createElement("div");
	this._collapseBorder.className = "cn_navigation_collapseBorder";
	this.element.parentNode.appendChild(this._collapseBorder); // Attach to screen item.

	this._collapseButton = VistaSupport.createImageSetButton("nav-collapse-set-2.gif", 4, 22, 0);
	this._collapseButton.className = "collapseButton";
	this._collapseBorder.appendChild(this._collapseButton);
	Tooltip.attach(this._collapseButton, "Click to collapse the navigation");
	Event.add(this._collapseButton, "mouseenter", this, this._collapseButton_mouseenter);
	Event.add(this._collapseButton, "mouseleave", this, this._collapseButton_mouseleave);
	Event.add(this._collapseButton, "click", this, this._collapseButton_click);

	this._pinButton = VistaSupport.createImageSetButton("pin-set.gif", 16, 16, 0);
	this._pinButton.className = "cn_navigation_pinButton";
	this.element.appendChild(this._pinButton);
	Tooltip.attach(this._pinButton, this.pinCollapseText);
	Event.add(this._pinButton, "click", this, this._pinButton_click);

	this._updateCollapseElements();
}
proto._updateCollapseElements = function() {
	if(this._canExpandCollapse) {
		this._pinButton.style.display
			= this._collapseBorder.style.display = "";
		if(this._collapsedTab) {
			this._collapsedTab.style.cursor = "";
			this._collapsedTab.style.filter = "";
		}
	} else {
		this._pinButton.style.display
			= this._collapseBorder.style.display = "none";
		if(this._collapsedTab) {
			this._collapsedTab.style.cursor = "default";
			this._collapsedTab.style.filter = "alpha(opacity=50)";
		}
	}
}

proto.pinCollapseText = "Click to collapse the navigation";
proto._collapseButton_mouseenter = function() {
	VistaSupport.setImageSetState(this._collapseButton, "hover");
	Util.addClass(this._collapseBorder, "hover");
}
proto._collapseButton_mouseleave = function() {
	VistaSupport.setImageSetState(this._collapseButton, "normal");
	Util.removeClass(this._collapseBorder, "hover");
}
proto._collapseButton_click = function() {
	if(this._navigationCollapsed) {
		this.expand();
	} else {
		this.collapse();
	}
}

proto.collapse = function(skipAnimation) {
	if(CNFormManager.currentThemeName != "blue") return;
	if(this._animating || !this._quickExpand && this._navigationCollapsed) return;

	this._clear_quickExpandLeaveTO();

	var self = this;
	var animate = ThemeNonCSSStyles.animateNavigation && !skipAnimation;
	this._collapseNavigation(animate, function() {
		self._postCollapse();
	});
}

proto.expand = function(skipAnimation) {
	if(CNFormManager.currentThemeName != "blue") return;
	if(this._animating || !this._navigationCollapsed) return;

	this._preExpand();
	var animate = ThemeNonCSSStyles.animateNavigation && !skipAnimation;
	this._expandNavigation(animate);
}
proto._preExpand = function() {
	this._collapsedTab.style.display = "none";
	this._pinButton.tipText = this.pinCollapseText;
	Tooltip.hide();

	if(this._quickExpand) {
		this._pinButton.style.backgroundImage = "url(" + CNFormManager.themeImagesPath + "pin-set.gif" + ")";
		if(this._pinButton._tipText) {
			this._pinButton.tipText = this._pinButton._tipText;
			this._pinButton._tipText = null;
		}
	}
}


proto._postCollapse = function() {
	this._collapseBorder.style.visibility = "hidden";

	Tooltip.hide();

	if(!this._collapsedTab) this._createCollapsedTab();
	else this._collapsedTab.style.display = "";

	this._leftLine.style.display = "block";
}
proto._createCollapsedTab = function() {
	var div = this._collapsedTab = document.createElement("div");
	div.className = "cn_navigation_collapsedTab";
	div.innerHTML = "<div class='div1'></div><div class='div2'></div><div class='div3'>Navigation</div>";
	var formSI = $("__si_form");
	formSI.appendChild(div);

	Event.add(div, "mouseenter", this, this._collapsedTab_mouseenter);
	Event.add(div, "mouseleave", this, this._collapsedTab_mouseleave);
	Event.add(div, "click", this, this._collapsedTab_click);

	var line = this._leftLine = $('__si_leftFormBGLine');
	formSI.appendChild(line);
}


proto._collapsedTab_mouseenter = function() {
	if(!this._canExpandCollapse) return;

	Util.addClass(this._collapsedTab, "hover");

	if(this._animating) return;

	var self = this;
	this._quickExpandTO = setTimeout(function() {
		self.quickExpand();
	}, 500);
}
proto._collapsedTab_mouseleave = function() {
	if(!this._canExpandCollapse) return;

	Util.removeClass(this._collapsedTab, "hover");

	if(this._animating) return;

	if(this._quickExpandTO) {
		clearTimeout(this._quickExpandTO);
		this._quickExpandTO = null;
	}
}
proto._collapsedTab_click = function() {
	if(this._animating || !this._canExpandCollapse) return;

	this.quickExpand();
}
proto._pinButton_click = function() {
	if(this._animating) return;

	if(this._quickExpand) {
		this.expand(false);
	} else if(this._navigationCollapsed) {
		this.expand();
	} else {
		this.collapse();
	}
	Util.cancelEvent();
}


proto.collapsedNavigationTabWidth = 20;

proto._collapseNavigation = function(animate, completeCallback) {
	var navScreenItem = $("__si_navigation");
	if(!navScreenItem) return; // Can't process unknown screen items.
	var navBGScreenItem = $("__si_navigationBG");

	if(!this._quickExpand) this._lastNavigationParams = {bgWidth: navBGScreenItem.offsetWidth, bgX: navBGScreenItem.offsetLeft, x: navScreenItem.offsetLeft};
	else {
		this._endQuickExpand();
	}

	var self = this;
	var onend = function() {
		navScreenItem.style.display = "none";
		navBGScreenItem.style.display = "none";

		if(!self._quickExpand) {
			self._reserveFormSpace();
			self._navigationCollapedChanged = true;
		}

		self._navigationCollapsed = true;
		self._quickExpand = false;
		self._animating = false;

		if(completeCallback) completeCallback();
	}

	if(animate) {
		this._animating = true;
		var anim1 = new AnimMove(navBGScreenItem, -navBGScreenItem.offsetWidth, navBGScreenItem.offsetTop);
		anim1.onend = onend;
		Animator.start(anim1,
				new AnimMove(navScreenItem, -navBGScreenItem.offsetWidth, navScreenItem.offsetTop));
	} else {
		navBGScreenItem.style.left = -navBGScreenItem.offsetWidth + "px";
		navScreenItem.style.left =  -navBGScreenItem.offsetWidth + "px";

		onend();
	}

}

proto._reserveFormSpace = function() {
	var formSI = $("__si_form");
	formSI.style.left = formSI.offsetLeft - this._lastNavigationParams.bgWidth + this.collapsedNavigationTabWidth + "px";
	formSI.jsObject._anchorW += this._lastNavigationParams.bgWidth - this.collapsedNavigationTabWidth;

	var darkHeaderLeftMargin = 6;
	var darkHeader = $('__si_darkHeader');
	darkHeader.style.left = darkHeader.offsetLeft - this._lastNavigationParams.bgWidth + darkHeaderLeftMargin + "px";
	darkHeader.jsObject._anchorW += this._lastNavigationParams.bgWidth - darkHeaderLeftMargin;

	CNFormManager.getBaseFormManager()._screenLayoutManager.doLayout();
}
proto._releaseFormSpace = function() {
	var formSI = $("__si_form");
	formSI.style.left = formSI.offsetLeft + this._lastNavigationParams.bgWidth - this.collapsedNavigationTabWidth + "px";
	formSI.jsObject._anchorW -= this._lastNavigationParams.bgWidth - this.collapsedNavigationTabWidth;

	var darkHeaderLeftMargin = 6;
	var darkHeader = $('__si_darkHeader');
	darkHeader.style.left = darkHeader.offsetLeft + this._lastNavigationParams.bgWidth - darkHeaderLeftMargin + "px";
	darkHeader.jsObject._anchorW -= this._lastNavigationParams.bgWidth - darkHeaderLeftMargin;

	CNFormManager.getBaseFormManager()._screenLayoutManager.doLayout();
}

proto._expandNavigation = function(animate, completeCallback) {
	if(!this._navigationCollapsed) return;
	var self = this;
	var navScreenItem = $("__si_navigation");
	if(!navScreenItem) return; // Can't process unknown screen items.
	navScreenItem.style.display = "block";

	var navBGScreenItem = $("__si_navigationBG");
	navBGScreenItem.style.display = "block";

	this._releaseFormSpace();
	navBGScreenItem.style.zIndex = "";
	navScreenItem.style.zIndex = "";

	this._leftLine.style.display = "none";

	if(this._quickExpand) this._endQuickExpand();

	var onend = function() {
		self._navigationCollapsed = false;
		self._navigationCollapedChanged = true;
		self._quickExpand = false;
		self._animating = false;
		if(completeCallback) completeCallback();
	}
	if(animate) {
		this._animating = true;
		this._animateExpand(navScreenItem, navBGScreenItem, onend);
	} else {
		navScreenItem.style.left = this._lastNavigationParams.x + "px";
		navBGScreenItem.style.left = this._lastNavigationParams.bgX + "px";
		onend();
	}

}
proto._animateExpand = function(navScreenItem, navBGScreenItem, onendCallback) {
	var anim1 = new AnimMove(navBGScreenItem, this._lastNavigationParams.bgX, navBGScreenItem.offsetTop);
   	anim1.onend = onendCallback;
	Animator.start(anim1,
			new AnimMove(navScreenItem, this._lastNavigationParams.x, navScreenItem.offsetTop));
}
proto.quickExpand = function() {
	if(this._quickExpandTO) {
		clearTimeout(this._quickExpandTO);
		this._quickExpandTO = null;
	}
	if(this._animating) return;

	if(!this._navigationCollapsed) return;
	var navScreenItem = $("__si_navigation");
	if(!navScreenItem) return;
	navScreenItem.style.display = "block";
	var navBGScreenItem = $("__si_navigationBG");
	navBGScreenItem.style.display = "block";
	navBGScreenItem.style.zIndex = 1000;
	navScreenItem.style.zIndex = 1001;

	this._collapseBorder.style.visibility = "hidden";

	this._pinButton.style.backgroundImage = "url(" + CNFormManager.themeImagesPath + "pin-2-set.gif" + ")";
	this._pinButton.tipText = "Click to restore the navigation";

	this._animateExpand(navScreenItem, navBGScreenItem);

	Event.add(document.body, "mouseup", this, this._quickExpand_document_mouseup);
	Event.add(navScreenItem, "mouseleave", this, this._quickExpand_navScreenItem_mouseleave);
	Event.add(navScreenItem, "mouseenter", this, this._quickExpand_navScreenItem_mouseenter);

	this._quickExpand = true;
}
proto._quickExpand_document_mouseup = function() {
	if(this._animating) return;

	var navScreenItem = $("__si_navigation");
	var navBGScreenItem = $("__si_navigationBG");
	if(!navScreenItem.contains(event.srcElement) && !navBGScreenItem.contains(event.srcElement)) {
		this.collapse();
	}
}
proto._quickExpand_navScreenItem_mouseleave = function() {
	if(this._animating) return;
	this._quickExpandStartLeaveTO();
}
proto._quickExpandStartLeaveTO = function() {
	var self = this;
	this._quickExpandLeaveTO = setTimeout(function() {
		self.collapse();
	}, 1000);
}
proto._quickExpand_navScreenItem_mouseenter = function() {
	if(this._animating) return;

	this._clear_quickExpandLeaveTO();
}
proto._clear_quickExpandLeaveTO = function() {
	if(this._quickExpandLeaveTO) {
		clearTimeout(this._quickExpandLeaveTO);
		this._quickExpandLeaveTO = null;
	}
}

proto._endQuickExpand = function() {
	if(this._quickExpand) {
		this._collapseBorder.style.visibility = "";
		Event.del(document.body, "mouseup", this, this._quickExpand_document_mouseup);
		var navScreenItem = $("__si_navigation");
		Event.del(navScreenItem, "mouseleave", this, this._quickExpand_navScreenItem_mouseleave);
		Event.del(navScreenItem, "mouseenter", this, this._quickExpand_navScreenItem_mouseenter);
	}
}
proto = null;