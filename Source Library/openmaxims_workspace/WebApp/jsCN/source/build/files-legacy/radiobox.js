/*
	v. 0.37
	+ ...
	+ space key checks items.
	+ tabIndex support for items.
	v. 0.32
	+ theme support.
	v 0.22
	+ autoPostBack.
	+ item enabled attribute support.
*/
var CN_radiobox = function()
{
	this.isReady = false;

	this.items = null;
	this.selectedItem = null;

	this._disabled = false;
	this._selectedIndex = -1;
	
	this._isDirty = false;
	this._autoPostBack = false;
}
var proto = CN_radiobox.prototype;

// Events. ================
proto.onchange = function(ev)
{
	if(this._autoPostBack) this.formManager.postData(this.element);
}

proto.createElement = function(node, parentElement)
{
	var l = document.createElement("span");
	parentElement.appendChild(l);
	
	this.element = l;
	l.jsObject = this;

	l.unselectable = "on";
	l.attachEvent("onselectstart", CNUtil.cancelEvent);
	l.className = "cn_radiobox";
	l.style.display = "inline-block"; // # 1148

	this.buildElements(node);
	this.isReady = true;
	
	if(node.getAttribute("autoPostBack") == "true") this._autoPostBack = true;
	
	this._set_disabled();
	
	return l;
}

proto.onControlCreated = function()
{
	this.element.style.position = "static";
}

proto.loadData = function(node)
{
	var attr = node.getAttribute("selection");
	if(attr) this.set_selectedIndex(parseInt(attr));

	var itemNodes = node.selectNodes("item");
	var count = itemNodes.length;
	for(var i = 0; i < count; i++)
	{
		var itemNode = itemNodes[i];
		var item = this.items[i];
		if(!item)
		{
			alert("ASSERT: no item found for radiobox data <item>.")
			break;
		}
		var attr = itemNode.getAttribute("enabled");
		if(attr) this.set_disabledItem(item, attr != "true");
		
		attr = itemNode.getAttribute("visible");
		if(attr) item.style.visibility = attr == "true" ? "inherit" : "hidden";
		
		attr = itemNode.getAttribute("text");
		if(attr) item.children[1].innerHTML = String(attr);
	}
}

proto.storeData = function(xmldoc)
{
	if(!this._isDirty) return null;
	this._isDirty = false;

	var node = xmldoc.createElement("radiobox");
	node.setAttribute("selection", this._selectedIndex);
	return node;
}


proto.buildElements = function(node)
{
	this.items = [];
	var itemNodes = node.selectNodes("item");
	var count = itemNodes.length;
	for(var i = 0; i < count; i++)
	{
		this.buildElement(itemNodes[i], i);
	}
}

proto.buildElement = function(item, ix)
{
	var itemElement = document.createElement("span");
	this.element.appendChild(itemElement);
	
	itemElement.className = "radioItem"
	itemElement.style.position = "absolute";	
	
	this.items[this.items.length] = itemElement;
	
	itemElement.index = ix;
	itemElement.unselectable = "on";
	itemElement.jsObject = {};
	
	//var checkElement = document.createElement("<span class=checkSpan>")
	var checkElement = document.createElement("<img width=16 height=16 align=middle>");
	itemElement.appendChild(checkElement);
	checkElement.unselectable = "on";
	
	var checked = ix == this._selectedIndex;
	if(checked) this.setSelectedItem(itemElement)
	else this.setItemChecked(itemElement, false);
	
	var attr = item.getAttribute("text");
	if(attr)
	{
		var textElement = document.createElement("<span class=textSpan>")
		itemElement.appendChild(textElement);
		textElement.unselectable = "on";
		textElement.innerHTML = String(attr);
	}
	
	if(item.getAttribute("bold") == "true") itemElement.style.fontWeight = "bold";

	var anchor = item.getAttribute("anchor");
    var parentLM = this.element.parentNode._layoutManager;
    var layoutManager =  parentLM ? parentLM : this.formManager._layoutManager;
	if(anchor && layoutManager) 
	{
		layoutManager.processNewControl(itemElement, parseInt(anchor, 2), item, this.element);
	}
	else {
//		setTimeout(function() { // IE doesn't position checkbox items in deep container in dialog for some reason when container has no layout yet.
			CNUtil.setLocation(itemElement, item);  // # 1148
//		}, 0);
	}

	
	var attr = item.getAttribute("tabIndex");
	if(attr) 
	{
		itemElement.tabIndex = itemElement._tabIndex = parseInt(attr, 10);
	}
	
	itemElement.attachEvent("onmouseenter", this._item_onmouseenter);
	itemElement.attachEvent("onmouseleave", this._item_onmouseleave);
	itemElement.attachEvent("onmousedown", this._item_onmousedown);	
	itemElement.attachEvent("ondblclick", this._item_onmousedown);		
	itemElement.attachEvent("onkeydown", this._item_onkeydown);
}

CN_radiobox.findItem = function(l)
{
	while(l && l.className != "radioItem") l = l.parentElement;
	return l;
}

proto.setSelectedItem = function(item, userAction)
{
	this.unsetSelectedItem(userAction);
	this.setItemChecked(item, true, userAction);
	this._selectedIndex = item.index;
	this.selectedItem = item;
}

proto.unsetSelectedItem = function(userAction)
{ 
	if(this.selectedItem != null) 
	{
		this.setItemChecked(this.selectedItem, false, false, userAction);
		this._selectedIndex = -1;
		this.selectedItem = null;
	}
}

// 161 - empty, 163 - bold empty, 164 - checked, 165 - double checked.
proto.setItemChecked = function(item, checked, hover, userAction)
{
	var checkedChanged = item.checked != checked;
	item.checked = checked;

	var img;
	if(this._disabled || item._disabled) img = checked ? "radioboxDisabledChecked.gif" : "radioboxDisabledUnchecked.gif";
	else if(hover) img = checked ? "radioboxHoverChecked.gif" : "radioboxHoverUnchecked.gif";
	else img = checked ? "radioboxChecked.gif" : "radioboxUnchecked.gif";

	if((hover || userAction) && CNFormManager.vista) 
	{
		VistaSupport.imageTrans(item.children[0], CNFormManager.themeImagesPath + img, checkedChanged);
	}
	else item.children[0].src = CNFormManager.themeImagesPath + img;
}

proto.fireChangedEvent = function(item)
{
	var ev = {};
	ev.item = item;
	ev.checked = item.checked;
	ev.selectedIndex = item.index;
	
	//Focus
	if(CNFormManager.vista)	item.jsObject.focus();
	else item.focus();	
	
	if(this.onchange) this.onchange(ev);
}


// Properties. ================================
proto.set_disabled = function(val)
{
	this._disabled = val;
	
	if(this.isReady) this._set_disabled();
}
proto._set_disabled = function()
{ 
	var color = this._disabled ? this.element.currentStyle["xl--disabled-color"] : "";
	var count = this.items.length;
	for(var i = 0; i < count; i++)
	{
		var item = this.items[i];

		if(this._disabled) item.tabIndex = -1;
		else if(item._tabIndex) item.tabIndex = item._tabIndex;

		if(!item._disabled) 
		{
			item.runtimeStyle.color = color;
			this.setItemChecked(item, item.checked);
		}
	}
}

proto.set_disabledItem = function(item, disabled)
{
	var color = disabled ? this.element.currentStyle["xl--disabled-color"] : "";
	item.runtimeStyle.color = color;
	item._disabled = disabled;
	this.setItemChecked(item, item.checked);	
}

proto.set_selectedIndex = function(val)
{
	if(this._selectedIndex == val) return;
	this._selectedIndex = val;
	if(this.isReady) this._set_selectedIndex();
}
proto._set_selectedIndex = function()
{
	var item = null;
	if(this._selectedIndex > -1 && this._selectedIndex < this.items.length) item = this.items[this._selectedIndex];
	this.unsetSelectedItem();
	if(item) this.setSelectedItem(item);
}

// Event handlers. ===============================
proto._item_onmouseenter = function()
{
	var item = CN_radiobox.findItem(event.srcElement);
	var box = item.parentElement;
	var jsObject = box.jsObject;
	if(!event.fromElement || jsObject._disabled || item._disabled) return;
	jsObject.setItemChecked(item, item.checked, true, true);
}
proto._item_onmouseleave = function()
{
	var item = CN_radiobox.findItem(event.srcElement);
	var box = item.parentElement;
	var jsObject = box.jsObject;
	if(jsObject._disabled || item._disabled) return;
	//item.firstChild.runtimeStyle.color = "";
	jsObject.setItemChecked(item, item.checked, false, true);	
}
proto._item_onmousedown = function()
{
	var item = CN_radiobox.findItem(event.srcElement);
	var box = item.parentElement;
	var jsObject = box.jsObject;
	if(jsObject._disabled || item._disabled) return;

	if(item != jsObject.selectedItem)
	{
		jsObject.setSelectedItem(item, true);
		jsObject.fireChangedEvent(item);
		jsObject._isDirty = true;
	}
}
proto._item_onkeydown = function()
{
	if(event.keyCode == 32)
	{
		var item = CN_radiobox.findItem(event.srcElement);
		var box = item.parentElement;
		var jsObject = box.jsObject;
		jsObject._item_onmousedown();
	}
}
