/*
	NOTE: twostate/pushed not supported for standard items.
	v. 2.0.2
*/
function PopupMenu(parentElement, position)
{
	this.index = 0;

	if(!position) position = "afterbegin";
	this.createElement(parentElement, position);
	
	this._activeItem = null;
	this._currentTO = null;
	PopupMenu._menus.push(this);
}
if(!top.__ontopZ) top.__ontopZ = 10000;

PopupMenu._menus = [];
PopupMenu.activeMenus = [];
PopupMenu.hideMenus = function(ev)
{
	//CNFormManager._trace("PopupMenu.hideMenus");
	for(var i = PopupMenu.activeMenus.length - 1; i >= 0; i--)
	{
		PopupMenu.activeMenus[i].hide(true, ev);
	}
}
PopupMenu.resetKeydown = function(ev)
{
	if(Event.keyValue(ev) == 27) PopupMenu.hideMenus(ev);
}
PopupMenu.unload = function()
{
	for(var i = 0; i < PopupMenu._menus.length; i++)
	{
		PopupMenu._menus[i].destroy();
	}
	PopupMenu._menus = null;
}
PopupMenu._document_onmousedown = function(ev) {
	//CNFormManager._trace("PopupMenu._document_onmousedown");
	PopupMenu.hideMenus(ev);
}

PopupMenu._handlerSet = false;
PopupMenu.setDocumentHandler = function()
{
	if(PopupMenu._handlerSet) return; // Avoid double event handler, FWUI-1288
	//CNFormManager._trace("PopupMenu.setDocumentHandler");
	PopupMenu._handlerSet = true;
	Event.nativeAdd(document.body, "mousedown", this._document_onmousedown);
	Event.nativeAdd(document.body, "keydown", PopupMenu.resetKeydown);
}
PopupMenu._detachBodyHandlers = function()
{
	if(!PopupMenu._handlerSet) return;
	//CNFormManager._trace("PopupMenu._detachBodyHandlers");
	PopupMenu._handlerSet = false;
	Event.nativeDel(document.body, "mousedown", this._document_onmousedown);
	Event.nativeDel(document.body, "keydown", PopupMenu.resetKeydown);
}
PopupMenu._removeMenu = function(menu)
{
	menu.hide();
	for(var i = 0; i < PopupMenu._menus.length; i++)
	{
		if(PopupMenu._menus[i] == menu) 
		{
			PopupMenu._menus.splice(i, 1);
			break;
		}
	}
}

var proto = PopupMenu.prototype;

// Events. ==================================
proto.onxlmenuhide = function(){}
proto.onmenuclick = function(){}


// Main stuff. ================================
proto.createElement = function(parentElement, position)
{
	var l = document.createElement("div");
	if(position == "afterbegin") parentElement.insertBefore(l, parentElement.firstChild);
	else if(position == "beforeend") parentElement.appendChild(l);
	else if(position == "beforebegin") parentElement.parentNode.insertBefore(l, parentElement);
	else if(position == "afterend") parentElement.parentNode.insertBefore(l, parentElement.nextSibling);
	else throw new Error("Unsupported popup menu position: " + position);
	
	this.element = l;
	l.jsObject = this;
	
	l.style.userSelect = "none";
	l.className = "popupMenu_container";

	if(Util.getStyle(l, "xl--left-line") != "false")
	{
		this.leftline = (function(){ var el = document.createElement("div"); el.className = 'leftline'; return el; })();
		this.leftline.style.userSelect = "none";
		l.appendChild(this.leftline);
	}
	
	l.style.boxShadow = "2px 3px 3px rgba(0, 0, 0, .3)";

	Event.add(l, "mouseleave", this, this._element_onmouseleave);

	if(CNFormManager.vista)
	{
		var hover = this._hover = document.createElement("div");
		hover.className = "hoverRect";
		hover.style.position = "absolute";
		hover.style.pointerEvents = "none";
		hover.style.backgroundImage = "url(" + CNFormManager.themeImagesPath + "item-gradient-5.gif)";
		hover.style.opacity = "0.3";
		hover.style.borderRadius = "5px";
		hover.style.visibility = "hidden";
		this.element.appendChild(hover);
	}
}

proto.destroy = function()
{
	this.hide();
	this.leftline = null;
	if(this.element)
	{
		if(this.element.shadow) 
		{
			this.element.shadow.destroy();
			this.element.shadow = null;
		}
		this.element.jsObject = null;
		this.element.remove();
		this.element = null;
	}
}

proto.createSubmenu = function(text, img)
{
	return this.createSubmenuEx(text, img).submenu;
}

proto.createSubmenuEx = function(text, img)
{
	var l = this.createItem(text, img, false, false);
	var arImg = (function(){ var el = document.createElement("img"); el.width = '7'; el.height = '7'; el.className = 'submenuIMG'; return el; })();
	l.style.userSelect = "none";
	l.appendChild(arImg);
	arImg.src = CNFormManager.neutralImagesPath + 'ar-right-1.gif'
	arImg.style.position = "absolute";
	arImg.style.right = "7px";
	arImg.style.top = (l.offsetHeight - 7) / 2 + "px";
	var submenu = new PopupMenu(this.element.parentElement);
	l._submenu = submenu.element;

	return {submenu: submenu, item: l};
}

proto.createItem = function(text, img)
{
	var l = document.createElement("div");
	l.style.userSelect = "none";
	this.element.appendChild(l);
	
	l._data = {
		index: this.index++,
		img: img
	}

	l.className = "item";
	var imgelcont = document.createElement("span");
	l.appendChild(imgelcont);
	
	imgelcont.className = "leftItem"
	imgelcont.style.userSelect = "none";

	if(img)
	{
		var imgel = document.createElement("img");
		imgel.style.userSelect = "none";
		imgelcont.appendChild(imgel);
	
		imgel.className = 'menuItemImg';
		imgel.src = img;
	} 

/*	if(twostate)
	{
		imgelcont.className = isPushed ? "leftItemChecked" : "leftItemUnchecked";
	}*/

	var textel = (function(){ var el = document.createElement("span"); el.className = 'text'; return el; })();
	textel.style.userSelect = "none";
	l.appendChild(textel);
	
	textel.innerHTML = text;
		
	//this.setCheckSign(l);

	Event.add(l, "mouseenter", this, this._item_mouseover);
	Event.add(l, "mouseleave", this, this._item_mouseout);
	Event.add(l, "mousedown", this, this._item_mousedown);

	return l;
}
{
	// NOTE: functionality is just enough for bedplanner's bigIcon menus.
	proto.createBigIconItem = function(data) {
		if(!this._lastBigIconCont) {
			this._lastBigIconCont = (function(){ var el = document.createElement("div"); el.className = 'bigIconCont'; return el; })();
			this.element.appendChild(this._lastBigIconCont);
		}

		var l = document.createElement("div");
		l.style.userSelect = "none";
		this._lastBigIconCont.appendChild(l);
		Tooltip.attach(l, data.text);

		l._data = data;
		data.index = this.index++;

		l.className = "bigIconItem";
		l.style.userSelect = "none";

		var imgel = document.createElement("img");
		imgel.style.userSelect = "none";
		imgel.src = data.img;
		l.appendChild(imgel);

		Event.add(l, "mouseenter", this, this._bigItem_mouseenter);
		Event.add(l, "mouseleave", this, this._bigItem_mouseleave);
		Event.add(l, "mousedown", this, this._bigItem_mousedown);

		if(data.pushed) {
			this.pushItem(l);
		}

		return l;
	}
	proto._bigItem_mouseenter = function(ev) {
		Util.addClass(ev.currentTarget || Util.findByClassName(Util.eventTarget(ev), "bigIconItem"), "hover");
	}
	proto._bigItem_mouseleave = function(ev) {
		Util.removeClass(ev.currentTarget || Util.findByClassName(Util.eventTarget(ev), "bigIconItem"), "hover");
	}
	proto._bigItem_mousedown = function(ev) {
		var l = ev.currentTarget || Util.findByClassName(Util.eventTarget(ev), "bigIconItem");
		if(!l || l.disabled) return;

		Util.removeClass(l, "hover");

		if(l._data.radio) this.pushItem(l);
		else if(l._data.twoState) this.togglePushItem(l);

		PopupMenu.hideMenus(ev);

		if(l._data.callback) {
			var menuEvent = {data: l._data, target: l};
			l._data.callback[1].call(l._data.callback[0], menuEvent);
		}
		CNUtil.cancelEvent(ev);
	}
	proto.pushItem = function(item) {
		Util.addClass(item, "pushed");
		item._data.pushed = true;
		if(item._data.radio) {
			var divs = this.element.getElementsByTagName("div");
			for(var i = 0; i < divs.length; i++) {
				var div = divs[i];
				if(div != item && div._data && div._data.radio == item._data.radio) {
					this.unpushItem(div);
				}
			}
		}
	}
	proto.unpushItem = function(item) {
		Util.removeClass(item, "pushed");
		item._data.pushed = false;
	}
	proto.togglePushItem = function(item) {
		if(item._data.twoState) {
			item._data.pushed
				? this.unpushItem(item)
				: this.pushItem(item);
		}
	}
	proto.createBigHR = function() {
		var l = (function(){ var el = document.createElement("div"); el.className = 'bigHR'; return el; })();
		l.style.userSelect = "none";
		this.element.appendChild(l);
		this._lastBigIconCont = null;
		return l;
	}
	proto.findItem = function(text) {
		var divs = this.element.getElementsByTagName("div");
		for(var i = 0; i < divs.length; i++) {
			var div = divs[i];
			if(div._data && div._data.text == text) {
				return div;
			}
		}
		return null;
	}
}

proto.createHR = function()
{
	var l = (function(){ var el = document.createElement("div"); el.className = 'hr'; return el; })();
	if(CNFormManager.vista)
	{
		l.appendChild(document.createElement("div"));
	}
	l.style.userSelect = "none";
	l.style.width = this.element.clientWidth - 30 + "px";
	this.element.appendChild(l);
	return l;
}
	
proto.putPushed = function(l, val)
{
/*	if(typeof val == "string") val = val == "true";
	if(val == l.isPushed) return;
	l.isPushed = val;
	
	l.children[0].className = l.isPushed ? "leftItemChecked" : "leftItemUnchecked";
	this.setCheckSign(l);*/
}

proto.setCheckSign = function(l)
{
/*	if(l.twostate && !l.img)
	{
		var checksign = Util.getStyle(l.parentElement, "xl--check-sign");
		// l.children[0] -> imgelcont.
		l.children[0].textContent = l.isPushed ? (checksign ? checksign : '') : '';
	}*/
}

proto.show = function(x, y, subMenu)
{
	//CNFormManager._trace("popupmenu.show id=" + this.element.id + ", x: " + x + ", y: " + y + ", subMenu: " + subMenu);

	if(!subMenu) PopupMenu.hideMenus();

	this.element.style.visibility = "hidden";
	//this.element.style.display = "block";
	this.element.style.zIndex = ++top.__ontopZ;
	
	if(x != null && y != null)
	{
		CNUtil.posPopup(this.element, x, y);
	}	
	if(CNFormManager.vista)
	{
		this.element.style.opacity = "0";
	}
	// NOTE: moved style change here as it needed for new shadow.htc version.
	this.element.style.visibility = "inherit";
	if(this.element.shadow) this.element.shadow.show();

	this._correctItemsWidth();
	if(this.leftline) this.leftline.style.height = this.element.clientHeight - 2 + "px";
	
	if(CNFormManager.vista)
	{
		this.element.style.transition = "opacity .3s";
		this.element.style.opacity = "1";
	}


	PopupMenu.activeMenus.push(this);
	// If first menu, set handlers.
	if(PopupMenu.activeMenus.length == 1) this.setDocumentHandlerTO();
}

proto.setDocumentHandlerTO = function()
{
	setTimeout(function(){ PopupMenu.setDocumentHandler(); }, 0);
}

proto._correctItemsWidth = function()
{
	var count = this.element.children.length;
	var width = 0;
	for(var i = 0; i < count; i++)
	{
		var l = this.element.children[i];
		if(l.className != "item") continue;
		width = Math.max(l.offsetWidth, width);
	}
	
	if(CNFormManager.vista)
	{
		for(var i = 0; i < count; i++)
		{
			var l = this.element.children[i];
			if(l.className == "item" || l.className == "hr")
				if(l.offsetWidth != width) l.style.width = width + "px";
		}
	}
	else
	{
		for(var i = 0; i < count; i++)
		{
			var l = this.element.children[i];
			if(l.className != "item") continue;		
			if(l.offsetWidth != width) l.style.width = width + "px";
		}
	}
}

proto.hide = function(force, ev)
{
	// Autohide self issue workaround. Now if menu is going to show self on mousedown, it 
	// callers can mark the event to keep it open.
	if(!this.element) return;
	ev = ev || Event.current();
	if(ev && ev.clientFrameworkKeepOpenFor == this.element) return;

	//CNFormManager._trace("hide id=" + this.element.id + ", force: " + force);

	if(this.element.style.display != "none" && force === true 
	|| (ev && !(Util.eventTarget(ev) && this.element.contains(Util.eventTarget(ev)))))
	{
		if(CNFormManager.vista) this.element.style.opacity = "1";

		if(this.element.shadow) this.element.shadow.hide();
		this.element.style.visibility = "hidden";
		
		if(CNFormManager.vista) this.element.style.opacity = "0";
		

		var ev = {};
		this.onxlmenuhide(ev);
	}

	// ISSUE: context-menu.log - when menu is hidden by destroying/loading the menu with the same id, menu wasn't
	// removed from activeMenus, causing _detachBodyHandlers to be never called.
	// Remove this menu from active menus even if menu is hidden.
	for(var i = 0; i < PopupMenu.activeMenus.length; i++)
	{
		if(PopupMenu.activeMenus[i] == this)
		{
			PopupMenu.activeMenus.splice(i, 1);
			break;
		}
	}
	if(PopupMenu.activeMenus.length == 0) {
		setTimeout(function(){ if(PopupMenu.activeMenus.length == 0) PopupMenu._detachBodyHandlers(); }, 0);
	}
}


// Event handlers. ========================================
proto._item_mousedown = function(ev)
{
	this.item_mousedown(ev);
}
proto.item_mousedown = function(ev)
{
	var l = ev.currentTarget || CNUtil.findByClassName(Util.eventTarget(ev), CNFormManager.vista ? "item" : "item_hover");

	if(!l || l.disabled) return;

	//if(l.twostate) l.isPushed = !l.isPushed

	if(l._submenu)
	{
		var x = this.element.offsetLeft + this.element.offsetWidth;
		var y = this.element.offsetTop + l.offsetTop - 1;
		this._showSubmenu(l._submenu, x, y);
	}
	else
	{
		l.className = "item";

		PopupMenu.hideMenus(ev);
	
		var menuEvent = {xlindex: l._data.index, target: l};
		if(l.onmenuclick) l.onmenuclick(menuEvent);
		if(l._data.callback) {
			l._data.callback[1].call(l._data.callback[0], menuEvent);
		}
	
		//if(cmdid && xlcc) xlcc.fire({target: element, cmdid: cmdid, param: param, index: index})
	}	
	CNUtil.cancelEvent(ev);
}

proto._setShowSubmenuTO = function(submenu, x, y)
{
	var obj = this;
	if(this._currentTO) clearTimeout(this._currentTO);
	this._currentTO = setTimeout(function(){ obj._showSubmenu(submenu, x, y); }, 400);
}

proto._showSubmenu = function(submenuID, x, y)
{
	var submenu = submenuID;
	if(!submenu) return;
	if(PopupMenu.activeMenus.length > 0 
	&& PopupMenu.activeMenus[PopupMenu.activeMenus.length - 1] == submenu.jsObject) return;
	
	this._hideSubmenus();
	if(submenu.jsObject) submenu.jsObject.show(x, y, true);
	this._currentTO = null;
}

proto._item_mouseover = function(ev)
{
	this.item_mouseover(ev);
}
proto.item_mouseover = function(ev)
{
	var l = ev.currentTarget || CNUtil.findByClassName(Util.eventTarget(ev), "item");	
	if(!l || l.disabled || this._activeItem == l) return;
	if(this._activeItem) this._unhoverItem(this._activeItem);
	this._activeItem = l;	

	if(CNFormManager.vista)
	{
		this._hover.style.top = l.offsetTop + "px";
		this._hover.style.width = l.offsetWidth - 1 + "px";
		this._hover.style.height = l.offsetHeight - 1 + "px";
		this._hover.style.visibility = "inherit";
	}
	else l.className = "item_hover";
	if(l._submenu) 		
	{
		var x = this.element.offsetLeft + this.element.offsetWidth;
		var y = this.element.offsetTop + l.offsetTop - 1;
		this._setShowSubmenuTO(l._submenu, x, y);
	}
	CNUtil.cancelEvent(ev);
}

proto._item_mouseout = function(ev)
{
	this.item_mouseout(ev);
}
proto.item_mouseout = function(ev)
{
	var l = ev.currentTarget || CNUtil.findByClassName(Util.eventTarget(ev), "item");
	if(!l || l.disabled) return;

	if(l._submenu && (!this.element.contains(ev.relatedTarget)
	|| ev.relatedTarget == this.element)) return;
	
	this._unhoverItem(l);
	this._activeItem = null;
	
	CNUtil.cancelEvent(ev);
}
proto._unhoverItem = function(l)
{
	if(CNFormManager.vista) this._hover.style.visibility = "hidden";
	else l.className = "item";
	if(l._submenu) this._setHideSubmenusTO();
}

proto._setHideSubmenusTO = function()
{
	var obj = this;
	if(this._currentTO) clearTimeout(this._currentTO);
	this._currentTO = setTimeout(function(){ obj._hideSubmenus(); }, 400);
}

proto._hideSubmenus = function()
{
	this._currentTO = null;
	// Hide all menus down to current menu.
	for(var i = PopupMenu.activeMenus.length - 1; i >= 0; i--)
	{
		var menu = PopupMenu.activeMenus[i];
		if(menu == this) break;
		menu.hide(true);
	}
}


proto._element_onmouseleave = function(ev)
{
	this.element_onmouseleave(ev);
}
proto.element_onmouseleave = function(ev)
{
	var activeMenu = null;
	if(PopupMenu.activeMenus.length > 0) activeMenu = PopupMenu.activeMenus[PopupMenu.activeMenus.length - 1];
	
	if(activeMenu && activeMenu.element && activeMenu.element.contains(ev.relatedTarget)) 
	{
		if(this._currentTO) 
		{
			clearTimeout(this._currentTO);
			this._currentTO = null;
		}
		return;
	}
	if(this._activeItem) 
	{
		this._unhoverItem(this._activeItem);	
		this._activeItem = null;
	}
}

proto.removeMenuTree = function()
{
	this._walkAndRemoveMenuTree(this.element);
}
proto._walkAndRemoveMenuTree = function(l)
{
	var children = l.children;
	for(var i = 0; i < children.length; i++)
	{
		var child = children[i];
		if(child._submenu)
		{
			this._walkAndRemoveMenuTree(child._submenu);
		}
	}
	PopupMenu._removeMenu(l.jsObject);
	l.jsObject.destroy();
}
