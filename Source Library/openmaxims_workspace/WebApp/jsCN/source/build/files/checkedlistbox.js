/*
	v. 2.0.2
	+ vista
*/
function CN_checkedlistbox()
{
	this._disabled = false;
	this._selectedItemDiv = null;
	this._autoPostBack = false;
	this._maxCheckedItems = -1;
	this._itemsChecked = 0;
	
	this.supportsRequired = true;
}
var proto = CN_checkedlistbox.prototype;
proto.createElement = function(node, parentElement)
{
	var l = document.createElement("div");
	parentElement.appendChild(l);
	this.element = l;
	l.jsObject = this;
	l.className = "cn_checkedlistbox";
	l.style.userSelect = "none";
	
	this._autoPostBack = node.getAttribute("autoPostBack") == "true";
	this.element.style.whiteSpace = node.getAttribute("wrap") == "true" ? "normal" : "nowrap";
	
	return l;
}
 
// Events.
proto.onitemchecked = null;
proto.onitemselected = null;
proto.oncheckreadonly = function(){ return false; }

proto.loadData = function(node)
{
	var itemsNode = Util.xmlSelectSingleNode(node, "items");
	if(itemsNode != null)
	{
		this._deleteItems();
		this._itemsChecked = 0;
		
		var items = Util.xmlSelectNodes(itemsNode, "item");
		for(var i = 0; i < items.length; i++)
		{
			this._createItem(items[i], i);
		}
	}	
	var attr = node.getAttribute("selectedIndex");
	if(attr)
	{
		var ix = parseInt(attr, 10);
		if(!isNaN(ix))
		{
			if(ix > -1 && ix < this.element.children.length) this._selectItemDiv(this.element.children[ix], false);
			else if(ix == -1) this._unselectItemDiv();
		}
	}
	
	attr = node.getAttribute("maxCheckedItems");
	if(attr) this._maxCheckedItems = parseInt(attr, 10);
}

proto.storeData = function(xmldoc)
{
	var node = xmldoc.createElement("checkedlistbox");

	var ix = -1;
	if(this._selectedItemDiv != null) ix = this._selectedItemDiv._index;
	node.setAttribute("selectedIndex", ix);
	
	var itemsNode = node;

	for(var i = 0; i < this.element.children.length; i++)
	{
		var itemDiv = this.element.children[i];
		if(itemDiv._checked != itemDiv._originalChecked)
		{
			var itemNode = xmldoc.createElement("item");
			itemsNode.appendChild(itemNode);
			itemNode.setAttribute("checked", itemDiv._checked ? "true" : "false");
			itemNode.setAttribute("index", itemDiv._index);
			itemDiv._originalChecked = itemDiv._checked;
		}
	}

	return node;
}


proto._deleteItems = function()
{
	this._selectedItemDiv = null;
	this.element.innerHTML = "";
}

proto._createItem = function(node, ix)
{
	var itemDiv = document.createElement("div");
	itemDiv.className = 'itemDiv';
	this.element.appendChild(itemDiv);
	itemDiv.style.userSelect = "none";
	
	itemDiv._index = ix;
	
	if(node.getAttribute("enabled") == "false") itemDiv.disabled = true;
	
	var attr = node.getAttribute("tooltip");
	if(attr) Tooltip.attach(itemDiv, String(attr));

	var checkBoxSpan = document.createElement("span");
	checkBoxSpan.className = 'checkBoxSpan'; // 1 
	itemDiv.appendChild(checkBoxSpan);
	Event.add(checkBoxSpan, "click", this, this._checkBoxSpan_onclick);
	Event.add(checkBoxSpan, "dblclick", this, this._checkBoxSpan_onclick);	
	Event.add(checkBoxSpan, "mouseenter", this, this._icon_textSpan_onmouseenter);
	Event.add(checkBoxSpan, "mouseleave", this, this._icon_textSpan_onmouseleave);	
	checkBoxSpan.style.userSelect = "none";
	
	var checkElement = document.createElement("img");
	checkElement.width = 13;
	checkElement.height = 13;
	checkBoxSpan.appendChild(checkElement);
	checkElement.style.userSelect = "none";

	var attr = node.getAttribute("markerColor");
	if(attr) checkBoxSpan.style.backgroundColor = String(attr);

	var imgAttr = node.getAttribute("img");
	if(imgAttr != null)
	{
		var icon = document.createElement("img");
	icon.align = 'absmiddle';
	icon.className = 'iconImg'; // 2 
		itemDiv.appendChild(icon);
		icon.src = String(imgAttr);
		
		Event.add(icon, "mousedown", this, this._icon_textSpan_onclick);
		Event.add(icon, "dblclick", this, this._icon_textSpan_ondblclick);
		Event.add(icon, "mouseenter", this, this._icon_textSpan_onmouseenter);
		Event.add(icon, "mouseleave", this, this._icon_textSpan_onmouseleave);
		icon.style.userSelect = "none";
	}
		
	var text = document.createElement("span");
	text.className = 'textSpan'; // 3
	itemDiv.appendChild(text);

	Event.add(text, "mousedown", this, this._icon_textSpan_onclick);
	Event.add(text, "dblclick", this, this._icon_textSpan_ondblclick);
	Event.add(text, "mouseenter", this, this._icon_textSpan_onmouseenter);
	Event.add(text, "mouseleave", this, this._icon_textSpan_onmouseleave);
	text.style.userSelect = "none";
	
	var textAttr = node.getAttribute("text");
	if(textAttr != null) text.textContent = String(textAttr);
	
	var attr = node.getAttribute("textColor");
	if(attr) text.style.color = String(attr);
	
	var checked = node.getAttribute("checked") == "true";
	itemDiv._originalChecked = checked;
	
	this._setChecked(itemDiv, checked, false);
}

proto.setMaxVisibleLines = function(mvl)
{
	if(mvl == 0) return;
	
	var clientHeight = 17 * mvl;
	//if(this.element.children.length == 0) clientHeight = 17 * mvl;
	//else clientHeight = this.element.children[0].offsetHeight * mvl;
	
	if(this.element.offsetHeight > clientHeight) 
	{
		this.element.style.height = clientHeight + 2;
	}
}

proto.set_disabled = function(value)
{
	value = Util.parseBoolean(value);
	if(this._disabled == value) return;
	this._disabled = value;

	this.element.style.backgroundColor = 
		this._disabled ? Util.getStyle(this.element, "xl--disabled-background") : "";
	this.element.style.opacity = this._disabled ? "0.5" : "";
}

proto._setChecked = function(itemDiv, checked, userClick)
{
	var autoUncheck = false;
	if(userClick && checked)
	{
		if(this._maxCheckedItems == 0) return;
		else if(this._maxCheckedItems == 1) this._uncheckAllItems();
		else if(this._maxCheckedItems > 1 && this._itemsChecked >= this._maxCheckedItems) return;
	}

	if(itemDiv._checked !== undefined && itemDiv._checked != checked
	|| itemDiv._checked === undefined && checked) 
	{
		this._itemsChecked = Math.max(0, this._itemsChecked + (checked ? 1 : -1));
		if(!userClick && !checked) autoUncheck = true;
	}
	
	itemDiv._checked = checked;
	//itemDiv.firstChild.innerHTML = checked ? "&#254;" : "&#111;";
	this._set_checked(itemDiv, false, userClick);
	if(userClick)
	{
		if(this._autoPostBack) this.formManager.postData(this.element);
	}
	if(userClick || autoUncheck)
	{
		if(this.onitemchecked != null)
		{
			var ev = {target: this, itemDiv: itemDiv, checked: checked, index: itemDiv._index, 
						originalChecked: itemDiv._originalChecked, autoUncheck: autoUncheck};
			this.onitemchecked(ev);
		}
	}
}

proto._set_checked = function(itemDiv, hover, userAction)
{
	var img;
	if(itemDiv.disabled)
		img = itemDiv._checked ? "checkedDisabledCheckbox.gif" : "uncheckedDisabledCheckbox.gif";
	else if(hover)
		img = itemDiv._checked ? "checkedHoverCheckbox.gif" : "uncheckedHoverCheckbox.gif";
	else
		img = itemDiv._checked ? "checkedCheckbox.gif" : "uncheckedCheckbox.gif";


	if((userAction || hover) && CNFormManager.vista) 
		VistaSupport.imageTrans(itemDiv.children[0].children[0], CNFormManager.themeImagesPath + img);		
	else 
		itemDiv.children[0].children[0].src = CNFormManager.themeImagesPath + img; 
}


proto._uncheckAllItems = function()
{
	for(var i = 0; i < this.element.children.length; i++)
	{
		this._setChecked(this.element.children[i], false, false);
	}
}

proto._selectItemDiv = function(l, userClick)
{
	if(this._selectedItemDiv == l) return;

	this._unselectItemDiv();

	l.className = "itemDivSelected";
	this._selectedItemDiv = l;
	
	if(userClick) 
	{
		if(this.onitemselected != null)
		{
			var ev = {target: this, index: l._index};
			this.onitemselected(ev);
		}
	}
	else
	{
		this._scrollToSelectedTO();
	}
}
proto._scrollToSelectedTO = function()
{
	var obj = this;
	setTimeout(function(){ obj._scrollToSelected(); }, 50);
}
proto._scrollToSelected = function()
{
	if(!this._selectedItemDiv) return;
	var xy = CNUtil.findAbsolutePos(this._selectedItemDiv, this.element, true);
	this.element.scrollLeft = xy.x;
	this.element.scrollTop = xy.y;
}

proto._unselectItemDiv = function()
{
	if(this._selectedItemDiv == null) return;
	var l = this._selectedItemDiv;
	l.className = "itemDiv";

	this._selectedItemDiv = null;
}

proto._hoverItemDiv = function(l)
{
	if(this._selectedItemDiv != l) l.className = "itemDivOver";
	this._set_checked(l, true, true);
}

proto._unhoverItemDiv = function(l)
{
	if(this._selectedItemDiv != l) l.className = "itemDiv";
	else l.className = "itemDivSelected";
	this._set_checked(l, false, true);
}


// Event handlers. ==================================
proto._checkBoxSpan_onclick = function()
{
	CNUtil.dispatchObject().checkBoxSpan_onclick();
}
proto.checkBoxSpan_onclick = function()
{
	if(this._disabled || this.oncheckreadonly()) return;
	
	var l = Util.eventTarget();
	var itemDiv = CNUtil.findTag(l, "DIV");

	if(itemDiv.disabled) return;

	this._setChecked(itemDiv, !itemDiv._checked, true);
}

/*proto._checkBoxSpan_onmouseenter = function()
{
	var l = Util.eventTarget();
	var jsObject = CNUtil.findJSObject(l);

	if(jsObject._disabled || jsObject.oncheckreadonly()) return; 
	l.style.color = Util.getStyle(l, "xl--hover-color");
}*/

/*proto._checkBoxSpan_onmouseleave = function()
{
	var l = Util.eventTarget();
	var jsObject = CNUtil.findJSObject(l);

	if(jsObject._disabled || jsObject.oncheckreadonly()) return;
	l.style.color = "";
}
*/

proto._icon_textSpan_onclick = function()
{
	CNUtil.dispatchObject().icon_textSpan_onclick();
}
proto.icon_textSpan_onclick = function()
{
	var l = Util.eventTarget();
	if(this._disabled || this.oncheckreadonly()) return;
	var itemDiv = CNUtil.findTag(l, "DIV");
	if(itemDiv.disabled) return;
	
	this._setChecked(itemDiv, !itemDiv._checked, true);
	this._selectItemDiv(itemDiv, true);
}

proto._icon_textSpan_ondblclick = function()
{
   	CNUtil.dispatchObject().icon_textSpan_onclick();
//	CNUtil.dispatchObject().icon_textSpan_ondblclick();
}
/*
proto.icon_textSpan_ondblclick = function()
{
	var l = Util.eventTarget();
	if(this._disabled || this.oncheckreadonly()) return;
	var itemDiv = CNUtil.findTag(l, "DIV");
	if(itemDiv.disabled) return;
	
	this._setChecked(itemDiv, !itemDiv._checked, true);
	this._setChecked(itemDiv, !itemDiv._checked, true);
}
*/
proto._icon_textSpan_onmouseenter = function()
{
	CNUtil.dispatchObject().icon_textSpan_onmouseenter();
}
proto.icon_textSpan_onmouseenter = function()
{
	var l = Util.eventTarget();	
	if(this._disabled || this.oncheckreadonly()) return;
	var itemDiv = CNUtil.findTag(l, "DIV");
	if(itemDiv.disabled) return;

	this._hoverItemDiv(itemDiv);
}

proto._icon_textSpan_onmouseleave = function()
{
	CNUtil.dispatchObject().icon_textSpan_onmouseleave();
}
proto.icon_textSpan_onmouseleave = function()
{
	if(this._disabled || this.oncheckreadonly()) return;
	var l = Util.eventTarget();
	var itemDiv = CNUtil.findTag(l, "DIV");
	if(itemDiv.disabled) return;

	this._unhoverItemDiv(itemDiv);
}


// Grid support.
var CheckedListBoxCell = CN_grid.CellTypes["CheckedListBox"] = function(colTag, grid)
{
	this._grid = grid;
}

CheckedListBoxCell.cn_tagName = "checkedlistbox";

var wp = CheckedListBoxCell.prototype;

wp.isFocusable = true;

wp.isValid = function(){ return true; }

wp._oncheckreadonly = function()
{
	// Executed in combobox context.
	var cell = CN_grid.findCell(Util.eventTarget());
	var jsObject = CNUtil.findJSObject(cell);
	var ro = jsObject.getCascadedReadOnly(cell);
	return ro;
}

wp._onitemselected = function(ev)
{
	// Executed in checkedlistbox context.
	var cell = CN_grid.findCell(this.element);
	var row = cell.parentElement;
	var grid = CNUtil.findJSObject(cell);
	var node = grid._getChangedNode(row, cell);
	node.setAttribute("selectedIndex", ev.index);
	grid.fireChangedEvent(row, cell, null);
}

wp._onitemchecked = function(ev)
{
	// Executed in checkedlistbox context.
	var cell = CN_grid.findCell(this.element);
	var row = cell.parentElement;
	var grid = CNUtil.findJSObject(cell);
	
	var node = grid._getChangedNode(row, cell);
	var itemsNode = node;

	var itemNode = Util.xmlSelectSingleNode(itemsNode, 'item[@index="' + ev.index + '"]');

	if(!cell.colTag.autoPostBack && itemNode)
	{
		// Node already exists - just remove it.
		if(itemNode) itemsNode.removeChild(itemNode);
		// Check if our node is empty - contains only row, cell, id
		if(node.getAttribute("selectedIndex") == null && Util.xmlSelectNodes(node, "item").length == 0) node.parentNode.removeChild(node);
	}
	else
	{
		// Update for for non autopostback to be sure we always send value.
		if(!cell.colTag.autoPostBack) ev.itemDiv._originalChecked = ev.checked;

		if(!itemNode)
		{
			itemNode = itemsNode.ownerDocument.createElement("item");
			itemsNode.appendChild(itemNode);
			itemNode.setAttribute("index", ev.index);
		}
		itemNode.setAttribute("checked", ev.checked ? "true" : "false");

		grid.fireChangedEvent(row, cell, null);
		if(!ev.autoUncheck && cell.colTag.autoPostBack) grid.postBack(row, cell, null);
	}
}

wp.setHoverBorderStyle = function(l, cell)
{
	l.style.width = cell.clientWidth - 18;
	l.style.left = 0;
	l.style.top = 3;
	l.style.height = cell.clientHeight - 4;
}

wp.prerender = function(cell, colTag)
{
	cell.style.paddingTop = 0;
	// Need table to override nowrap.
	var table = document.createElement("table");
	table.className = "checkedlistbox_table";
	cell.appendChild(table);
	table.insertRow().insertCell();
}

wp.render = function(cell, node)
{
	var box = new CN_checkedlistbox();
	this._grid._jsObjects.push(box);

	var colTag = cell.colTag;
	
	node.setAttribute("autoPostBack", "false");

	var l = box.createElement(node, cell);//.firstChild.cells[0]);
	
	box.onitemchecked = this._onitemchecked;
	box.onitemselected = this._onitemselected;
	box.oncheckreadonly = this._oncheckreadonly;
	box.loadData(node);
	
	var attr = node.getAttribute("maxVisibleLines");
	if(attr != null)
	{
		var mvl = parseInt(attr, 10);
		if(!isNaN(mvl)) box.setMaxVisibleLines(mvl);
	}
	//l.style.width = cell.clientWidth; => doesn't work well with delayedControlsCreation=true
	l.style.width = "100%";
}
