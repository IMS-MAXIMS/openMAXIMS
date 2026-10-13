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
PopupMenu.hideMenus = function()
{
	//CNFormManager._trace("PopupMenu.hideMenus");
	for(var i = PopupMenu.activeMenus.length - 1; i >= 0; i--)
	{
		PopupMenu.activeMenus[i].hide(true);
	}
}
PopupMenu.resetKeydown = function()
{
	if(event.keyCode == 27) PopupMenu.hideMenus();
}
PopupMenu.unload = function()
{
	for(var i = 0; i < PopupMenu._menus.length; i++)
	{
		PopupMenu._menus[i].destroy();
	}
	PopupMenu._menus = null;
}
PopupMenu._document_onmousedown = function() {
	//CNFormManager._trace("PopupMenu._document_onmousedown");
	PopupMenu.hideMenus();
}

PopupMenu._handlerSet = false;
PopupMenu.setDocumentHandler = function()
{
	if(PopupMenu._handlerSet) return; // Avoid double event handler, FWUI-1288
	//CNFormManager._trace("PopupMenu.setDocumentHandler");
	PopupMenu._handlerSet = true;
	document.body.attachEvent("onmousedown", this._document_onmousedown);
	document.body.attachEvent("onkeydown", PopupMenu.resetKeydown);
}
PopupMenu._detachBodyHandlers = function()
{
	if(!PopupMenu._handlerSet) return;
	//CNFormManager._trace("PopupMenu._detachBodyHandlers");
	PopupMenu._handlerSet = false;
	document.body.detachEvent("onmousedown", this._document_onmousedown);
	document.body.detachEvent("onkeydown", PopupMenu.resetKeydown);
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
	parentElement.insertAdjacentElement(position, l);
	
	this.element = l;
	l.jsObject = this;
	
	l.unselectable = "on";
	l.className = "popupMenu_container";

	if(l.currentStyle["xl--left-line"] != "false")
	{
		this.leftline = document.createElement("<div class=\"leftline\"></div>");
		this.leftline.unselectable = "on";
		l.appendChild(this.leftline);
	}
	
	new Shadow(l, false, true);

	l.attachEvent("onmouseleave", this._element_onmouseleave);

	if(CNFormManager.vista)
	{
		this.element.appendChild(this._hover = VistaSupport.createHover('item-gradient-5.gif', 30));
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
		this.element.removeNode(true);
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
	var arImg = document.createElement("<img width='7' height='7' class='submenuIMG'>");
	l.unselectable = "on";
	l.appendChild(arImg);
	arImg.src = CNFormManager.neutralImagesPath + 'ar-right-1.gif'
	arImg.style.position = "absolute";
	arImg.style.right = 7;
	arImg.style.top = (l.offsetHeight - 7) / 2;
	var submenu = new PopupMenu(this.element.parentElement);
	l._submenu = submenu.element.uniqueID;

	return {submenu: submenu, item: l};
}

proto.createItem = function(text, img)
{
	var l = document.createElement("div");
	l.unselectable = "on";
	this.element.appendChild(l);
	
	l._data = {
		index: this.index++,
		img: img
	}

	l.className = "item";
	var imgelcont = document.createElement("span");
	l.appendChild(imgelcont);
	
	imgelcont.className = "leftItem"
	imgelcont.unselectable = "on";

	if(img)
	{
		var imgel = document.createElement("img");
		imgel.unselectable = "on";
		imgel.replacePNG = "no";
		imgelcont.appendChild(imgel);
	
		imgel.className = 'menuItemImg';
		imgel.src = img;
	} 

/*	if(twostate)
	{
		imgelcont.className = isPushed ? "leftItemChecked" : "leftItemUnchecked";
	}*/

	var textel = document.createElement("<span class=text></span>");
	textel.unselectable = "on";
	l.appendChild(textel);
	
	textel.innerHTML = text;
		
	//this.setCheckSign(l);

	l.attachEvent("onmouseenter", this._item_mouseover);
	l.attachEvent("onmouseleave", this._item_mouseout);
	l.attachEvent("onmousedown", this._item_mousedown);

	return l;
}
{
	// NOTE: functionality is just enough for bedplanner's bigIcon menus.
	proto.createBigIconItem = function(data) {
		if(!this._lastBigIconCont) {
			this._lastBigIconCont = document.createElement("<div class='bigIconCont'></div>");
			this.element.appendChild(this._lastBigIconCont);
		}

		var l = document.createElement("div");
		l.unselectable = "on";
		this._lastBigIconCont.appendChild(l);
		Tooltip.attach(l, data.text);

		l._data = data;
		data.index = this.index++;

		l.className = "bigIconItem";
		l.unselectable = "on";

		var imgel = document.createElement("img");
		imgel.unselectable = "on";
		imgel.src = data.img;
		imgel.replacePNG = "no";
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
		Util.addClass(ev.srcElement, "hover");
	}
	proto._bigItem_mouseleave = function(ev) {
		Util.removeClass(ev.srcElement, "hover");
	}
	proto._bigItem_mousedown = function(ev) {
		var l = Util.findByClassName(ev.srcElement, "bigIconItem");
		if(!l || l.disabled) return;

		Util.removeClass(l, "hover");

		if(l._data.radio) this.pushItem(l);
		else if(l._data.twoState) this.togglePushItem(l);

		PopupMenu.hideMenus();

		if(l._data.callback) {
			var ev = {}
			ev.data= l._data;
			ev.srcElement = l;
			l._data.callback[1].call(l._data.callback[0], ev);
		}
		CNUtil.cancelEvent();
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
		var l = document.createElement("<div class=bigHR>");
		l.unselectable = "on";
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
	var l = document.createElement("<div class=hr>");
	if(CNFormManager.vista)
	{
		l.appendChild(document.createElement("div"));
	}
	l.unselectable = "on";
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
		var checksign = l.parentElement.currentStyle.getAttribute("xl--check-sign");
		// l.children[0] -> imgelcont.
		l.children[0].innerText = l.isPushed ? (checksign ? checksign : '') : '';
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
		if(!this.element.filters.length) this.element.style.filter = "progid:DXImageTransform.Microsoft.Fade()";
		this.element.filters[0].Apply();
	}
	// NOTE: moved style change here as it needed for new shadow.htc version.
	this.element.style.visibility = "inherit";
	if(this.element.shadow) this.element.shadow.show();

	this._correctItemsWidth();
	this.leftline.style.height = this.element.clientHeight - 2;
	
	if(CNFormManager.vista)
	{
		this.element.filters[0].Play(.3);
	}

	//CNFormManager._trace("menu should be shown vis: " + this.element.currentStyle.visibility);

	/*var obj = this;
	setTimeout(function() {
		if(obj.element) CNFormManager._trace("menu should be shown, zIndex: " + obj.element.currentStyle.zIndex + ", vis: " + obj.element.currentStyle.visibility);
	}, 500);*/

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
				if(l.offsetWidth != width) l.style.width = width;
		}
	}
	else
	{
		for(var i = 0; i < count; i++)
		{
			var l = this.element.children[i];
			if(l.className != "item") continue;		
			if(l.offsetWidth != width) l.style.width = width;
		}
	}
}

proto.hide = function(force)
{
	// Autohide self issue workaround. Now if menu is going to show self on mousedown, it 
	// must add its uniqueID to return value.
	if(!this.element || event && event.returnValue == this.element.uniqueID) return;

	//CNFormManager._trace("hide id=" + this.element.id + ", force: " + force);

	if(this.element.style.display != "none" && force === true 
	|| (event && !(event.srcElement && this.element.contains(event.srcElement))))
	{
		if(this.element.filters.length) 
		{
			this.element.filters[0].Apply();
		}

		if(this.element.shadow) this.element.shadow.hide();
		this.element.style.visibility = "hidden";
		
		if(this.element.filters.length) this.element.filters[0].Play(.1);
		

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
proto._item_mousedown = function()
{
	CNUtil.findJSObject(event.srcElement).item_mousedown();
}
proto.item_mousedown = function()
{
	var l = CNUtil.findByClassName(event.srcElement, CNFormManager.vista ? "item" : "item_hover");

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

		PopupMenu.hideMenus();
	
		var ev = {}
		//ev.xlcmdid = l.cmdid;
		ev.xlindex = l._data.index;
		ev.srcElement = l;
		if(l.onmenuclick) l.onmenuclick(ev);
		if(l._data.callback) {
			l._data.callback[1].apply(l._data.callback[0], ev);
		}
	
		//if(cmdid && xlcc) xlcc.fire({srcElement: element, cmdid: cmdid, param: param, index: index})
	}	
	CNUtil.cancelEvent();
}

proto._setShowSubmenuTO = function(submenu, x, y)
{
	var obj = this;
	if(this._currentTO) clearTimeout(this._currentTO);
	this._currentTO = setTimeout(function(){ obj._showSubmenu(submenu, x, y); }, 400);
}

proto._showSubmenu = function(submenuID, x, y)
{
	var submenu = this.element.parentElement.children[submenuID];
	if(PopupMenu.activeMenus.length > 0 
	&& PopupMenu.activeMenus[PopupMenu.activeMenus.length - 1] == submenu.jsObject) return;
	
	this._hideSubmenus();
	if(submenu) submenu.jsObject.show(x, y, true);
	this._currentTO = null;
}

proto._item_mouseover = function()
{
	CNUtil.findJSObject(event.srcElement).item_mouseover();
}
proto.item_mouseover = function()
{
	var l = event.srcElement;	
	if(l.disabled || this._activeItem == l) return;
	if(this._activeItem) this._unhoverItem(this._activeItem);
	this._activeItem = l;	

	if(CNFormManager.vista)
	{
		this._hover.style.top = l.offsetTop;
		this._hover.style.width = l.offsetWidth - 1;
		this._hover.style.height = l.offsetHeight - 1;
		this._hover.style.visibility = "inherit";
	}
	else l.className = "item_hover";
	if(l._submenu) 		
	{
		var x = this.element.offsetLeft + this.element.offsetWidth;
		var y = this.element.offsetTop + l.offsetTop - 1;
		this._setShowSubmenuTO(l._submenu, x, y);
	}
	CNUtil.cancelEvent();
}

proto._item_mouseout = function()
{
	var jso = CNUtil.findJSObject(event.srcElement);
	if(jso) jso.item_mouseout();
}
proto.item_mouseout = function(l)
{
	var l = event.srcElement;
	if(l.disabled) return;

	if(l._submenu && (!this.element.contains(event.toElement)
	|| event.toElement == this.element)) return;
	
	this._unhoverItem(l);
	this._activeItem = null;
	
	CNUtil.cancelEvent();
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


proto._element_onmouseleave = function()
{
	CNUtil.findJSObject(event.srcElement).element_onmouseleave();
}
proto.element_onmouseleave = function()
{
	var activeMenu = null;
	if(PopupMenu.activeMenus.length > 0) activeMenu = PopupMenu.activeMenus[PopupMenu.activeMenus.length - 1];
	
	if(activeMenu && activeMenu.element && activeMenu.element.contains(event.toElement)) 
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
			this._walkAndRemoveMenuTree(this.element.parentElement.children[child._submenu]);
		}
	}
	PopupMenu._removeMenu(l.jsObject);
	l.jsObject.destroy();	
	l.removeNode(true);
}