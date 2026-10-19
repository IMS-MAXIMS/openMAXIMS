
/*
	#1036-4 - _isDirty moved to element, _isDirty is sent with onchange event, TAB doesn't set _isDirty
	v. 2.0.19
	+ FWUI-1027, also vista css changes.
	+ shared attachable shadow for all vista combos
	+ combo template rewritten: pre-rendered images now used for borders.
	+ numerous grid related state fixes.
*/
function CN_combobox()
{
	this.formManager = null;
	this.activeOption = null;
	// One global popup for single mode, current active popup for mutable mode.
	this.popup = null;

	this.optionTags = null;
	this.valueToIndexMap = [];

	this.popupOpened = false;

	this.disabler = null;
	
	this._disabled = false;
	// NOTE: _isDirty, _selectedIndex and _value are stored in element.
	//this._value = null;
	this._canBeEmpty = false;
	this._autoPostBack = false;
	this.doNotFocus = false;
	this._searchable = false;
	this._livesearch = false;
	this._minNumberOfChars = 0;
	this._doSearch = false;
	this._inGrid = false;
	this._tooltip = null;
	this.supportsRequired = true;
	this._typedSelectTimout = 1 * 1000; // One second.
	this._lastTypeStamp = 0;
	this._maxPopupItems = -1;
	
	this._popupInited = false;
}
if(!top.__ontopZ) top.__ontopZ = 10000;
var proto = CN_combobox.plainThemeProto = {};

CN_combobox.setTheme = function(themeName)
{
	this._deinitVista();
	if(CNFormManager.vista) 
	{
		this.prototype = this.vistaThemeProto;
		this._initVista();
	}
	else 
	{
		this.prototype = this.plainThemeProto;
	}
}

CN_combobox.makeOptions = function(array)
{
	for(var i = 0; i < array.length; i++)
	{
		Util.wrapIntoNode(array[i]);
	}
	return array;
}

CN_combobox.currentCombobox = null;
CN_combobox.pendingCombobox = null;

CN_combobox._initVista = function()
{
	this._template = $("__vistaComboboxTemplate");
	this._sharedShadow = new Shadow(null, false, true); 
}

CN_combobox._deinitVista = function()
{
	this._template = null;
	if(this._sharedShadow)
	{
		this._sharedShadow.destroy();
		this._sharedShadow = null;
	}
}


// Public events.
proto.onchange = function(){}
proto.oncheckreadonly = function(){ return false; }
proto._ingrid_getContextMenuData = function()
{
	// this == combobox
	if(event && event.srcElement)
	{
		var comboEl = CNUtil.findElement(event.srcElement);
		var gridEl = CNUtil.findElement(comboEl.parentNode);
		//var gridJSO = gridEl.jsObject;
		
		return {menuID: gridEl._menuID, targetID: gridEl.id};
	}
	CNUtil.assert("Invalid context for _ingrid_getContextMenuData()");
	return null;
}

proto.createElement = function(node, parentElement)
{
	var l = this.createElementOnly(node, null, true);
	parentElement.appendChild(l);
	
	this._precreatePopup();

	this.initData(node);

	if(!this._inGrid) this.set_disabled();

	return l;
} 

proto._preinit = function(node, inGrid)
{
	if(inGrid !== null) 
	{
		this._inGrid = inGrid;
		if(inGrid) this.getContextMenuData = this._ingrid_getContextMenuData;
	}

	var isNotArray = !(node instanceof Array) && !(node instanceof Object);
	if(isNotArray)
	{
		var attr = node.getAttribute("searchable");
		if(attr == "true") 
		{
			this._searchable = true;
			attr = node.getAttribute("minNumberOfChars");
			if(attr) this._minNumberOfChars = parseInt(attr, 10);
			attr = node.getAttribute("livesearch");
			if(attr) this._livesearch = true;
		}
	
		attr = node.getAttribute("maxPopupItems");
		if(attr) 
		{
			this._maxPopupItems = parseInt(attr, 10);
		}
	}
}

proto._setCommonOptions = function(node)
{
	var attr;
	if(this._searchable)
	{
		 this._canBeEmpty = true;
	}
	else
	{
		attr = node.getAttribute("canBeEmpty");
		this._canBeEmpty = attr == "true";
	}

	if(this._canBeEmpty) 
	{
		if(this.element) {
			this.element._selectedIndex = -1;
			this.element._isDirty = false;
		}
	}
	else
	{
		if(this.element) this.element._selectedIndex = 0;
	}
			
	attr = node.getAttribute("autoPostBack");
	this._autoPostBack = attr == "true";
}	


proto.createElementOnly = function(node, inGrid, assignElement)
{
	this._preinit(node, inGrid);

	var l = document.createElement("<table cellpadding=0 cellspacing=0 border=0>");
	var tr = l.insertRow();
	tr.vAlign = "middle";
	var td0 = tr.insertCell();
	td0.style.paddingLeft = 1;
	td0.style.display = "none";
	td0.style.width = 16;

	var td1 = tr.insertCell();
	td1.className = "xlcomboTD1";

	if(assignElement) this.element = l;
	
	if(this._searchable)
	{
		this._td15 = tr.insertCell();
		this._td15.className = "xlcomboTD15";
		this._td15.width = 10;
	}

	var td2 = tr.insertCell();
	td2.className = "xlcomboTD2";
	this._td2 = td2;
	
	l.className = "cn_combobox";
	l._isComboBox = true;
	
	l.jsObject = this;
	
	if(this.doNotFocus) 
	{
		l.unselectable = true;
		td1.unselectable = true;
	}

	var isNotArray = !(node instanceof Array) && !(node instanceof Object);
	if(isNotArray) this._setCommonOptions(node);

	if(this._searchable)
	{
		var inputElement = document.createElement("<input type='text' value='' class=xlcomboinput>");
		l.cells[1].appendChild(inputElement);
		
		this._setTextInputEvents(inputElement);
		
		var img = document.createElement("img");
		this._td15.appendChild(img);
		
		if (this._livesearch)
			img.src = CNFormManager.neutralImagesPath + "livesearch.png";
		else
			img.src = CNFormManager.neutralImagesPath + "question-1.gif";
		
		this._td15.style.cursor = "hand";
		
		img.attachEvent("onclick", this._img_onclick);
		
		if (this._livesearch)
			this._standBy();
	}
	else
	{
		var textSpan = document.createElement("<div style='overflow: hidden; '>");
		textSpan.unselectable = "on";
		l.cells[1].appendChild(textSpan);
	}

	var td2 = this._td2;
	td2.innerText = "6";
	td2.unselectable = "on";

	l.attachEvent("onmouseenter", this._element_onmouseenter);
	l.attachEvent("onmouseleave", this._element_onmouseleave);
	//if(this._searchable) // <- forced because of 918 and 927 conflict
	l.attachEvent("onresize", this._element_onresize);
	l.attachEvent("onkeydown", this._element_onkeydown);

	var el = l;
	if(this._searchable) el = td2; // Button.

	el.attachEvent("onmousedown", this._element_onmousedown);
	el.attachEvent("ondblclick", this._element_onmousedown);

	return l;
}
proto._setTextInputEvents = function(inputElement)
{
	inputElement.attachEvent("onbeforeactivate", this._inputElement_onbeforeactivate);
	inputElement.attachEvent("ondeactivate", this._inputElement_ondeactivate);
	inputElement.attachEvent("onkeypress", this._inputElement_onkeypress);
	inputElement.attachEvent("onchange", this._inputElement_onchange);
	inputElement.attachEvent("onkeydown", this._inputElement_onkeydown);
	inputElement.attachEvent("onkeyup", this._inputElement_onkeyup);
}

proto._lightPostData = function() 
{
	var textBox = this._getTextInput();	
	var val = Util.trim(textBox.value);
	if(val != "" && this._minNumberOfChars != "" && val.length >= this._minNumberOfChars) 
	{	
		var img = this._td15.getElementsByTagName("img")[0];
		this._td15.removeChild(img);

		img = document.createElement("img");
		this._td15.appendChild(img);
		img.src = CNFormManager.neutralImagesPath + "searching.gif";
	
		this.formManager.lightPostData("<combobox value='" + Util.escapeAttr(val) + "' search='" + this._livesearch + "' id='" + this.elementID + "'/>");
	}
	else
	{
		// Reset popup.
		if(this.popup)
		{
			this.popup.innerHTML = "";
			this._popupInited = false;
		}
		
		var img = this._td15.getElementsByTagName("img")[0];
		this._td15.removeChild(img);

		img = document.createElement("img");
		this._td15.appendChild(img);
		img.src = CNFormManager.neutralImagesPath + "livesearch.png";	
	}
}

proto._focused = function() 
{
	var textBox = this._getTextInput();	
	textBox.value = "";	
}

proto._inputElement_onblur = function()
{
	CNUtil.dispatchObject().inputElement_onblur();
}

proto.inputElement_onblur = function() 
{
	var textBox = this._getTextInput();	
	if(textBox.value == "") 
	{
		this._standBy();
	}
}

proto._standBy = function() 
{
	var textBox = this._getTextInput();	
	this.hidePopup();
	if(this._keyTimeout) clearTimeout(this._keyTimeout);	
}

proto._element_onresize = function()
{
	CNUtil.dispatchObject().element_onresize();
}
proto.element_onresize = function()
{
	if(!this.element) return;
	if (this.element.cells.length == 0) return;	
	
	var cell0 = this.element.cells[1];	
	var textBox = cell0.children[0];
	var w = cell0.clientWidth - 4;
	if(w > 0) textBox.style.width = w;
}

proto.loadData = function(node)
{
	this.initData(node);

	var valueSet = false;
	if(this._searchable)
	{
		var attr = node.getAttribute("value")
		if(attr != null)
		{
			this.set_textValue(String(attr));
			valueSet = true;
		}
		else this.element._value = "";
	}
	
	if(!valueSet)
	{
		var ix = parseInt(node.getAttribute("selection"));
		if(!isNaN(ix)) 
		{
			this.set_selectedIndex(ix);
			if(this.element) this.element._isDirty = false;
		}
	}
	
	if(node.getAttribute("opened") == "true") 
	{
		CN_combobox.pendingCombobox = this;
		setTimeout(this._showPopup, 0);
	}
	
	var attr = node.getAttribute("tooltip");
	if(attr != null)
	{
		this._tooltip = String(attr);
		if(this.element.tipText) this.element.tipText = this._tooltip;
		else Tooltip.attach(this.element, this._tooltip);
	}	
	
	if (this._livesearch)
	{
		var img = this._td15.getElementsByTagName("img")[0];
		this._td15.removeChild(img);

		img = document.createElement("img");
		this._td15.appendChild(img);
		img.src = CNFormManager.neutralImagesPath + "livesearch.png";		
	}	
}

proto.get_textValue = function()
{
	if(!this._searchable) Util.assert("get_textValue() called for non-searchable");
	return this._getTextInput().value;
}

proto.set_textValue = function(value)
{
	if(!this._searchable) Util.assert("set_textValue() called for non-searchable");
	this.element._value = this._getTextInput().value = value;
	this.element._selectedIndex = -2;
}

proto.storeData = function(xmldoc)
{
	if(this.element && !this.element._isDirty) return null;
	
	var node = xmldoc.createElement("combobox");
	
	if(this._searchable && this._getTextInput().value == "") node.setAttribute("selection", "-1");
	else if(this.element._selectedIndex == -2) node.setAttribute("value", this.get_textValue());
	else node.setAttribute("selection", this.element._selectedIndex);
	
	if(this._doSearch) node.setAttribute("search", "true");

	if(this.element) this.element._isDirty = false;
	this._doSearch = false;

	return node;
}

proto.get_disabled = function()
{
	return this._disabled;
}
proto.set_disabled = function(value)
{
	this._disabled = value;
	var l = this.element;

	var cell1 = l.cells[1];
	if(this._disabled)
	{
		this.set_tabIndex(-1, true);
		l.runtimeStyle.borderColor = "#dddddd";
		cell1.runtimeStyle.borderColor = "#dddddd";
		var bg = this.element.currentStyle["xl--disabled-background"]
		if(this._searchable) 
		{
			var box = cell1.children[0];
			if(!box._color) box.runtimeStyle.color = "#888888";
			box.readOnly = this._disabled;
			box.runtimeStyle.background = bg;
			this._td15.style.display = "none";
			this._hideValidationTooltip();
		}
		if(this._td15) this._td15.runtimeStyle.background = bg;
		cell1.runtimeStyle.backgroundColor = bg;
		this._td2.runtimeStyle.backgroundColor = bg;
	}
	else
	{
		if(this._tabIndex) this.set_tabIndex(this._tabIndex);
		l.runtimeStyle.borderColor = "";
		l.cells[1].runtimeStyle.borderColor = "";
		if(this._td15) this._td15.runtimeStyle.background = "";
		if(this._searchable) 
		{
			var box = cell1.children[0];
			if(!box._color) box.runtimeStyle.color = "";
			box.readOnly = this._disabled;
			box.runtimeStyle.background = "";
			this._td15.style.display = "block";
		}
		cell1.runtimeStyle.backgroundColor = "";
		this._td2.runtimeStyle.backgroundColor = "";
		l.runtimeStyle.backgroundColor = "";
	}
}

proto.set_selectedIndex = function(val, doNotFireEvent)
{
	val = val * 1;
	if(this.element._selectedIndex == val) return;
	this.element._selectedIndex = val;
	if(this.element) this.element._isDirty = true;
	this._set_selectedIndex(doNotFireEvent);
}
proto.get_selectedIndex = function()
{
	return this.element._selectedIndex;
}

proto._getTextElement = function()
{
	return this.element.cells[1].children[0];
}
proto._getTextInput = function()
{
	return this.element.cells[1].children[0];
}

proto._set_selectedIndex = function(doNotFireEvent, force)
{
	if(this.element._selectedIndex === undefined && !force) return;
	
	var textElement = this._getTextElement();	

	if(!this.optionTags || this.optionTags.length == 0) 
	{
		if(this._searchable) textElement.value = "";
		else textElement.innerText = "";
		return;
	}

	var textDiv = textElement;
	var html = this.getHTMLByIndex(this.element._selectedIndex);
	if(html) 
	{
		if(this._searchable) textElement.children[0].value = html;
		else 
		{
			if(html == "") html = "&nbsp";
			textElement.innerHTML = html;
		}
	}
	else
	{
		var text = this.getTextByIndex(this.element._selectedIndex);

		textDiv.style.width = 1;
		textDiv.style.overflow = "hidden";
		textDiv.innerText = text;
		
		//if(this._searchable)  <- forced because of 918 and 927 conflict
		//{
			var w = textElement.parentElement.clientWidth;
			if(w > 5) textDiv.style.width = w - 4;
			else textDiv.style.width = "100%"; // 993
		//}
		//else textDiv.style.width = "auto";
	}
	
	this.element._value = this.getValueByIndex(this.element._selectedIndex);
	
	var valueElement = textDiv;

	var tag = this.optionTags[this.element._selectedIndex];
	if(tag) 
	{
		var attr = tag.getAttribute("textColor");

		if(attr) valueElement._color = valueElement.runtimeStyle.color = String(attr);
		else 
		{
			valueElement.runtimeStyle.color = "";
			valueElement._color = null;
		}

		attr = tag.getAttribute("img");
		if(attr) 
		{
			var td0 = this.element.cells[0];
			var img = td0.firstChild;
			if(!img)
			{
				img = document.createElement("img");
				td0.appendChild(img);
			}
			
			img.src = String(attr);
			td0.style.display = "block";
		}
		else 
		{			
			this.element.cells[0].style.display = "none";
		}
	}
	else
	{
		valueElement.runtimeStyle.color = "";
		this.element.cells[0].style.display = "none";
	}
	
	if(!doNotFireEvent) this.fireChangedEvent();
}

proto.set_value = function(val)
{
	if(this.element._value == val) return;
	this.element._value = val;
	this._set_value();
}
proto.getValue = function()
{
	return this.element._value;
}
proto._set_value = function()
{
	var ix = this.valueToIndexMap[this.element._value];
	if(ix == undefined) ix = -1;
	this.element._selectedIndex = ix;
	this._set_selectedIndex();
}

proto.initData = function(data)
{
	if(data == null) return;
	
	var options = null;
	var clearOptions = false;
	if(data instanceof Array || data instanceof Object) options = CN_combobox.makeOptions(data);
	else 
	{
		var attr = data.getAttribute("imgW");
		if(attr) this._item_imgW = parseInt(attr, 10);
	
		var attr = data.getAttribute("imgH");
		if(attr) this._item_imgH = parseInt(attr, 10);

		options = data.selectNodes("option");
		if(options.length == 0)
		{
			var nooptions = data.selectSingleNode("nooptions");
			if(nooptions != null) 
			{
				clearOptions = true;
				options = [];
				var text;
				if(!this._searchable) text = " ";
				else text = "";
				this.element._value = null;
				this.valueToIndexMap = [];
				if(this._searchable) this._getTextInput().value = text;
				if(!CNFormManager.vista) this.element.cells[0].style.display = "none"; // ?					
				this.element._selectedIndex = -1;
			}
		}
	}

	if(!options || (options.length == 0 && !clearOptions)) return;

	this._optionCount = options.length;

	// Reset popup.
	if(this.popup)
	{
		this.popup.innerHTML = "";
		this._popupInited = false;
	}
	
	this.optionTags = options;

	this.initOptions();

	// Grid version doesn't contain element.
	if(this.element)
	{
		if(this.element._value != null) this._set_value(); 
		else this._set_selectedIndex(true, true);
	}
}		

proto.initOptions = function()
{
	var count = this.optionTags.length;
	for(var i = 0; i < count; i++)
	{
		var value = this.optionTags[i].getAttribute("value");
		if(!value) value = i; // Auto-index.*/
		this.valueToIndexMap[String(value)] = i;
	}
}


proto._precreatePopup = function()
{
	if(this._popupPrecreated) return;
	this._popupPrecreated = true;
	this.popup = document.createElement("div");
	this.popup.className = "cn_comboboxPopup";
	this.popup._isPopup = true;
	document.body.appendChild(this.popup);
}

proto.createPopup = function()
{
	if(this._popupInited) return;
	this._popupInited = true;
	
	this._precreatePopup();

	if(this._canBeEmpty)
	{
		var option = this.createOption(" ", "", -1);
		this.popup.appendChild(option);
	}

	if(this.optionTags)
	{
		var count = this.optionTags.length;
		for(var ix = 0; ix < count; ix++)
		{
			var optionTag = this.optionTags[ix];
			var value = optionTag.getAttribute("value");
			if(!value) value = ix; // Auto-index.*/
	
			var text = String(optionTag.getAttribute("text"));
			text = text == "" ? " " : text; // !!
			
			var imgUrl = null;
			var attr = optionTag.getAttribute("img");
			if(attr) imgUrl = String(attr);
			
			var option = this.createOption(text, value, ix, imgUrl, optionTag);

			attr = optionTag.getAttribute("textColor");
			if(attr) option.style.color = String(attr);
			
			this.popup.appendChild(option);

			// Used by WYSIWYG.
			var style = optionTag.style;
			if(style) option.style.cssText += "; " + style;

			var html = optionTag.getAttribute("html");
			if(html) option.innerHTML = html;
		}
	}
		
	this.popup.style.overflow = "auto";
	
	//if(CNFormManager.vista) new Shadow(this.popup, false, true);
	
	this.popup.attachEvent("onclick", this._popup_onclick);
	this.popup.attachEvent("onmouseover", this._popup_onmouseover);
	this.popup.attachEvent("onmouseout", this._popup_onmouseout);
	this.popup.attachEvent("onmousedown", this._popup_onmousedown);
	this.popup.attachEvent("oncontextmenu", this._popup_oncontextmenu);
	this.popup.attachEvent("onmousewheel", CNUtil.cancelBubble);
}

proto.createOption = function(text, value, index, imgUrl, optionTag)
{
	var option = document.createElement("<div class=xlcombooption style=\"padding: 1px; position: relative; display: inline-block; white-space: nowrap; \">");
	option.unselectable = true;

	option.innerText = text;

	if(imgUrl)
	{
		var img = document.createElement("<img align=absmiddle style=\"margin-right: 4px; \">");
		
		var wAttr = optionTag.getAttribute("imgW");
		if(wAttr) img.width = parseInt(wAttr, 10);
		else if(this._item_imgW) img.width = this._item_imgW;
		
		var hAttr = optionTag.getAttribute("imgH");
		if(hAttr) img.height = parseInt(wAttr, 10);
		else if(this._item_imgH) img.height = this._item_imgH;
		
		option.insertAdjacentElement('afterbegin', img);
		img.unselectable = true;
		img.src = imgUrl;
	}

	option.value = value;
	option.index = index;
	
	return option;
}

proto.getTextByIndex = function(ix)
{
	if(isNaN(ix) || ix < 0 || ix >= this.optionTags.length) return "";
	return String(this.optionTags[ix].getAttribute("text"));
}

proto.getHTMLByIndex = function(ix)
{
	if(isNaN(ix) || ix < 0 || ix >= this.optionTags.length) return "";
	var attr = this.optionTags[ix].getAttribute("html");
	return attr ? String(attr) : null;
}

proto.getValueByIndex = function(ix)
{
	if(isNaN(ix) || ix < 0 || ix >= this.optionTags.length) return null;
	var value = this.optionTags[ix].getAttribute("value");
	if(value === null) return String(ix);
	return String(value);
}

proto.findTag = function(l, tag)
{
	while(l != null && l.tagName != tag) l = l.parentElement;
	return l;
}

// Event handlers.
proto._element_onmouseenter = function()
{
	var jsObject = event.srcElement.jsObject;
	if(jsObject && jsObject.element_onmouseenter) jsObject.element_onmouseenter();
}

proto.element_onmouseenter = function()
{
	if(this._disabled || this.oncheckreadonly() || this.popupOpened && this.element && this.element.contains(event.srcElement)) return;
	this.hoverBox(event.srcElement);
}

proto._element_onmouseleave = function()
{
	var jsObject = event.srcElement.jsObject;
	if(jsObject && jsObject.element_onmouseleave) jsObject.element_onmouseleave();
}

proto.element_onmouseleave = function()
{
	if(this._disabled || this.oncheckreadonly() || this.popupOpened && this.element && this.element.contains(event.srcElement)) return;
	var l = event.srcElement;
	if(this._searchable && this.element && document.activeElement == this._getTextInput()
	&& this.element.contains(l)) return;
	this.unhoverBox(l);
}

proto._element_onmousedown = function()
{
	if(event.button != 1) return;
	CNUtil.findJSObject(event.srcElement).element_onmousedown();
}

proto.element_onmousedown = function()
{
	if(this._disabled || this.oncheckreadonly() 
	|| (event.type == "onmousedown" && event.button != 1)) return;
	if(this._searchable && this._canBeEmpty && !this._optionCount) return;
	if(this._searchable && event.srcElement.tagName == "INPUT") return;

	if(this.doNotFocus) 
	{
		event.srcElement.unselectable = true; // Hack, but works.
		Util.cancelEvent();
	}	

	var l = event.srcElement;
	while(l && !l._isComboBox) l = l.parentElement;
	
	if(this.popupOpened) 
	{
		event.cancelBubble = true;
		if(this.element == l) 
		{
			this.hidePopup(true);
			this.hoverBox(this.element);
			return; // Click on the same button.
		}
		else if(this._inGrid)
		{
			this.hidePopup(); // grid combo.
		}
	}
	else if(this._inGrid && this.element && this.element != l) // grid combo => force unhover.
	{
		this.unhoverBox(this.element, true); 
	}

	this.element = l;

	if(!this.doNotFocus) this.element.focus();
	this._pressBox();

	var obj = this;
	setTimeout(function(){ obj.showPopup(l); } , 0);
}
proto._pressBox = function()
{
	this.hoverBox(this.element);
}

proto._popup_onmousedown = function()
{
	event.cancelBubble = true;
}

proto._popup_onclick = function()
{
	if(CN_combobox.currentCombobox) CN_combobox.currentCombobox.popup_onclick();
}

proto.popup_onclick = function()
{
	var l = CNUtil.findByClassName(event.srcElement, "xlcombooption");
	if(!l || !this.popup.contains(l) || l.className != "xlcombooption") return;
	this.hidePopup();
	this.selectOption(l);
}

proto._popup_onmouseover = function()
{
	if(CN_combobox.currentCombobox) CN_combobox.currentCombobox.popup_onmouseover();
}

proto.popup_onmouseover = function()
{
	var l = CNUtil.findByClassName(event.srcElement, "xlcombooption");
	if(!l || !this.popup.contains(l) || l.className != "xlcombooption") return;
	this.hoverOption(l);
}

proto._popup_onmouseout = function()
{
	if(CN_combobox.currentCombobox) CN_combobox.currentCombobox.popup_onmouseout();
}

proto.popup_onmouseout = function()
{
	var l = CNUtil.findByClassName(event.srcElement, "xlcombooption");
	if(!l || !this.popup.contains(l) || l.className != "xlcombooption") return;
	this.unhoverOption();
}

proto._element_onkeydown = function()
{
	//CNFormManager._trace("combo _element_onkeydown")
	if(CNFormManager.getActiveFormManager().nonInteractive) return;
	CNUtil.dispatchObject().element_onkeydown();
}
proto.element_onkeydown = function()
{
	//CNFormManager._trace("combo element_onkeydown")
	var code = event.keyCode;
	if(this.popupOpened)
	{
		this.popup_onkeydown();
	}
	else if(!this._searchable)
	{
		this.createPopup(); // Ensure popup created.
		if(code == 40)
		{
			CN_combobox.currentCombobox = this;
			this.showPopup();
			CNUtil.cancelEvent();
		}
		else if(code != 9)
		{
			this._processTypedWord(code, true);
		}
	} else if(this._inGrid && event.keyCode == 9) {
		CN_grid.proxyTabKeyDown();
	}
}

proto.popup_onkeydown = function()
{
	if(!this.popup) return;
	var code = event.keyCode;
	switch(code)
	{
		case 27: this.hidePopup(); break;
		case 38: // Up
			if(this.activeOption)
			{
				if(this.activeOption.previousSibling) this.hoverOption(this.activeOption.previousSibling);
			}
			else if(this.popup.children.length > 0) 
			{
				this.hoverOption(this.popup.children[this.popup.children.length - 1]);
			}
			break;
		case 40:
			if(this.activeOption)
			{
				if(this.activeOption.nextSibling) this.hoverOption(this.activeOption.nextSibling);
			}
			else if(this.popup.children.length > 0) 
			{
				this.hoverOption(this.popup.children[0]);
			}
			break;
		case 13: 
			if(this.activeOption) 
			{
				this.selectOption(this.activeOption);
				this.hidePopup();
			}
			break;
		default:
			this._processTypedWord(code, false);
	}
	event.returnValue = false;
}


proto._processTypedWord = function(code, select)
{
	if(this._disabled) return;
	
	var now = new Date().getTime();
	if(!this._currentTypedWord 
	|| this._lastTypeStamp + this._typedSelectTimout <= now)
	{
		this._currentTypedWord = "";
	}
	this._lastTypeStamp = now;

	var ch = String.fromCharCode(code).toLowerCase();
	this._currentTypedWord += ch;
	
	var children = this.popup.children;
	if(!children) children = this.popup.document.body.children; // Fall back for answerbox.
	var selectNext = 0;
	if(this._currentTypedWord.length == 1)
	{
		// Check for other available options starting with the same char.
		var ix = this.element._selectedIndex;
		if(this._canBeEmpty) ix++;
		if(ix != -1)
		{
			var currentOption;
			
			if(select) currentOption = children[ix];
			else currentOption = this.activeOption;
			
			if(!currentOption) return;

			var text = currentOption.innerText;
			if(text.length > 0)
			{
				text = text.toLowerCase().charAt(0);
				if(text == this._currentTypedWord) 
				{
					selectNext = currentOption.index + 1;
					if(this._canBeEmpty) selectNext++;
				}
			}
		}
	}
	
	var count = children.length;
	for(var i = selectNext; i < count; i++)
	{
		var child = children[i];
		if(child.innerText.toLowerCase().indexOf(this._currentTypedWord) == 0)
		{
			if(select) this.selectOption(child);
			else this.hoverOption(child);
			break;
		}
	}
}


proto._document_onmousedown = function()
{
	if(CN_combobox.currentCombobox) CN_combobox.currentCombobox.document_onmousedown();
}

proto.document_onmousedown = function()
{
	this.closing = true;
	this.hidePopup();
	event.cancelBubble = true;
	CN_combobox.currentCombobox = null;
}

proto._getTD3 = function(l)
{
	return l.cells[this._searchable ? 3 : 2];
}

proto.hoverBox = function(l)
{
	// NOTE: do not set this.element here.
	// this.element = l; 
	var buttonElement = this._getTD3(l);
	l.runtimeStyle.borderColor = buttonElement.runtimeStyle.borderColor 
		= l.currentStyle["xl--hover-border-color"];
	var filter = buttonElement.currentStyle["xl--hover-filter"];
	if(filter)
	{
		 if(buttonElement.filters[0]) buttonElement.filters[0].enabled = true;
		 else buttonElement.style.filter = filter;
	}
	else buttonElement.runtimeStyle.backgroundColor = buttonElement.currentStyle["xl--hover-background-color"];
}
proto.unhoverBox = function(l)
{
	if(!l) l = this.element;
	if(!l) return;
	var buttonElement = this._getTD3(l);
	l.runtimeStyle.borderColor = buttonElement.runtimeStyle.borderColor = "";
	buttonElement.runtimeStyle.backgroundColor = "";
	if(buttonElement.filters[0]) buttonElement.filters[0].enabled = false;
}

proto._showPopup = function()
{
	if(!CN_combobox.pendingCombobox) return;
	CN_combobox.currentCombobox = CN_combobox.pendingCombobox;
	CN_combobox.pendingCombobox = null;
	CN_combobox.currentCombobox.showPopup();
}

proto.showPopup = function(element)
{
	if((!this.optionTags || this.optionTags.length == 0) && !this._canBeEmpty) return;
	if(element) this.element = element;

	if(CN_combobox.currentCombobox) {
		CN_combobox.currentCombobox.hidePopup(); // Force hide, as combobox can be unselectable.
	}

	CN_combobox.currentCombobox = this;
	this.createPopup();

	this.popupOpened = true;
	this.popup.scrollTop = this.popup.scrollLeft = 0;

	var ix = this.element._selectedIndex;
	if(this._canBeEmpty) ix++;

	this.popup.style.zIndex = top.__ontopZ++;
	
	var xy = CNUtil.findAbsolutePos(this.element, null, false, true);
	xy.y += CNFormManager.vista ? 21 : this.element.offsetHeight;
	
	var popupWidth = Math.max(this.element.offsetWidth, 50);
	this.popup.style.width = popupWidth + "px";
	this.popup.style.overflowY = "auto";
	this.popup.style.visibility = "hidden";
	this.popup.style.display = "block";
	
	var maxHeight;
	if(this._maxPopupItems > 0)
	{
		this.popup.style.height = "auto";
		if(this.optionTags)
		{
			var avgItemHeight = this.popup.scrollHeight / (this.optionTags.length + (this._canBeEmpty ? 1 : 0));
			maxHeight = this._maxPopupItems * avgItemHeight + 3; // Border/padding.
		}
		else
		{
			maxHeight = 20;
		}
	}
	else maxHeight = parseInt(this.element.currentStyle["xl--popup-max-height"]);

	if(this.popup.offsetHeight >= maxHeight) this.popup.style.height = maxHeight + "px";
	else this.popup.style.height = "auto";
	
	CNUtil.posPopup(this.popup, xy.x, xy.y);
	
//	if(this.popup.scrollHeight <= this.popup.offsetHeight) this.popup.style.overflowY = "hidden"; // COMMENTED: due to the #1027

	if(CNFormManager.vista)
	{
		var h = this.popup.offsetHeight;
		if(ThemeNonCSSStyles.animateDropdowns) {
			this.popup.style.height = "1px";
		}
		this.popup.style.visibility = "visible";
		
		CN_combobox._sharedShadow.attach(this.popup);
		CN_combobox._sharedShadow.show();
		
		if(ThemeNonCSSStyles.animateDropdowns) {
			Animator.start(new AnimResize(this.popup, this.popup.offsetWidth, h, 0));
		}
	}
	else this.popup.style.visibility = "visible";
	if(ix !== undefined)
	{
		this.unhoverOption();
		this.activeOption = this.popup.children[ix];
		this.hoverOption(this.activeOption);
	}
	
	document.attachEvent("onmousedown", this._document_onmousedown);
	document.attachEvent("onmousewheel", this._document_onmousedown);
	
	if(this._searchable) this._getTextInput().focus();
	else if(!this.doNotFocus) this.element.setActive();
}
proto.focus = function() { // #1036-3
	if(this._searchable) this._getTextInput().focus();
	else if(!this.doNotFocus) this.element.setActive();
}
proto.hidePopup = function(doNotUnhover)
{
	this.popupOpened = false;

	this.unhoverOption();
	
	if(this.popup) 
	{
		this.popup.style.display = "none";
		if(this.popup.shadow) 
		{
			this.popup.shadow.detach();
		}
	}

	document.detachEvent("onmousedown", this._document_onmousedown);
	document.detachEvent("onmousewheel", this._document_onmousedown);
	
	if(!doNotUnhover && !(!this._inGrid && this._searchable && this.element && document.activeElement == this._getTextInput())) 
	{
		this.unhoverBox(this.element);	
	}
	if(CN_combobox.currentCombobox == this) CN_combobox.currentCombobox = null;
}
proto.hoverOption = function(l)
{
	if(!this.element) {
		Util.assert("!this.element");
		return;
	}
	
	this.unhoverOption();
	if(!l) return;
	
	var margin = (this.popup.offsetHeight - this.popup.clientHeight) / 2;
	if(l.offsetTop < this.popup.scrollTop) this.popup.scrollTop = l.offsetTop + margin;
	else if(l.offsetTop + l.offsetHeight - this.popup.scrollTop >= this.popup.clientHeight)
		this.popup.scrollTop = l.offsetTop + l.offsetHeight - this.popup.clientHeight + margin;
	
	l.runtimeStyle.background = this.element.currentStyle["xl--option-hover-background"];
	l.runtimeStyle.color = this.element.currentStyle["xl--option-hover-color"];
	var filter = this.element.currentStyle["xl--option-hover-filter"];
	if(filter) l.runtimeStyle.filter = filter;
	this.activeOption = l;
}
proto.unhoverOption = function()
{
	if(!this.activeOption) return;
	this.activeOption.runtimeStyle.background = "";
	this.activeOption.runtimeStyle.color = "";
	if(this.activeOption.runtimeStyle.filter) this.activeOption.runtimeStyle.filter = "none";
	this.activeOption = null;
}
proto.selectOption = function(l)
{
	if(this.element._selectedIndex == l.index) return;
	this._hideValidationTooltip();
	this.set_selectedIndex(l.index);
	
	if(!this._inGrid && this._autoPostBack) 
	{
		this.formManager.postData(this.element);
	}
}
proto._hideValidationTooltip = function()
{
	if(!this._tooltip || this._tooltip.length == 0) Tooltip.detach(this.element);
	else this.element.tipText = this._tooltip;
}

proto.fireChangedEvent = function(propertyChange)
{
	var index = this.element._selectedIndex;
	if(this.element._value == "") index = -2;
	var ev = {value: this.element._value, selectedIndex: index, sender: this, isDirty: this.element._isDirty};
	if(this.onchange) this.onchange(ev);
}

proto._popup_oncontextmenu = function()
{
	CNUtil.cancelEvent();
}

proto._inputElement_onkeypress = function()
{
	CNUtil.dispatchObject().inputElement_onkeypress();
}
proto.inputElement_onkeypress = function()
{
	if(event.keyCode == 13)
	{
		if(this._searchable) 
		{
			this.unhoverOption();
			CNUtil.cancelEvent();
			this._doSubmit(true); 
		}
	}
}

proto.textToIndex = function(text)
{
	if(!this.optionTags) return -1;
	for(var i  = 0; i < this.optionTags.length; i++)
	{
		if(text == this.optionTags[i].getAttribute("text")) return i;
	}
	return -1;
}

proto._inputElement_onkeyup = function()
{
	CNUtil.dispatchObject().inputElement_onkeyup();
}
proto.inputElement_onkeyup = function()
{
	// Only for searchable.
	var textBox = this._getTextInput();
	
	var ix = this.textToIndex(textBox.value);
	if(ix == -1)
	{
		textBox.runtimeStyle.color = "";
		textBox._color = null;
	}
	else
	{
		var tag = this.optionTags[ix];
		var attr = tag.getAttribute("textColor");
		if(attr) textBox._color = textBox.runtimeStyle.color = String(attr);
	}
}

proto._inputElement_onkeydown = function()
{
	CNUtil.dispatchObject().inputElement_onkeydown();
}
proto.inputElement_onkeydown = function()
{
	var code = event.keyCode;
	if(code == 40 && !this.popupOpened)
	{
		this.createPopup(); // Ensure popup created.
		CN_combobox.currentCombobox = this;
		this.showPopup();
		CNUtil.cancelEvent();
	}
	else if(code != 9) // Ignore TAB. #1036-4
	{
		this.element._isDirty = true;
		this.element._selectedIndex = -2;
		
		if (this._livesearch)
		{	
			if(this._keyTimeout) clearTimeout(this._keyTimeout);
			if(code == 13) 
			{
						
			}
			else if(code == 27)
			{
				this.hidePopup();
			}
			else if((code >= 48 && code <= 90) || code == 8) 
			{
				var obj = this;								
				this.hidePopup();

				this._keyTimeout = setTimeout(function(){ obj._lightPostData(); }, 500);
			}
		}	
	}
}

proto._inputElement_ondeactivate = function()
{
	CNUtil.dispatchObject().inputElement_ondeactivate();
}
proto.inputElement_ondeactivate = function()
{
	var to = event.toElement;
	if(to && this.element.contains(to)) return;
	var box = this._getTextInput();
	if(this._autoPostBack && this.element._isDirty && box.value.length > 0) 
	{
		this._doSubmit(false); 
	}
}
proto._inputElement_onbeforeactivate = function()
{
	CNUtil.dispatchObject().inputElement_onbeforeactivate();
}
proto.inputElement_onbeforeactivate = function()
{
	if(this._disabled) 
	{
		CNUtil.cancelEvent();
		return;
	}
	
	if(this._inGrid)
	{
		var l = event.srcElement;
		while(l && !l._isComboBox) l = l.parentElement;
		this.element = l;
	}
	
	this._getTextInput().readOnly = this.oncheckreadonly();
}

proto._img_onclick = function()
{
	CNUtil.dispatchObject().img_onclick();
}
proto.img_onclick = function()
{
	if(!this._searchable || this._disabled) return;
	this._doSubmit(true);	
}


proto._inputElement_onchange = function()
{
	CNUtil.dispatchObject().inputElement_onchange();
}
proto.inputElement_onchange = function()
{
	this._doSubmit(false, true);
}

// Searchable only method.
proto._doSubmit = function(force, doNotPost)
{
	if(this.oncheckreadonly()) return false;
	
	// Find element for grid combo.
	var l = event.srcElement;
	while(l && !l._isComboBox) l = l.parentElement;

	this.element = l; 

	var text = this.getTextByIndex(this.element._selectedIndex);
	var box = this._getTextInput();
	var value = box.value;

	if(!force && text == value) return false;
	
	if(this.element._selectedIndex == -2 || this.element._selectedIndex == -1 || text != value)
	{
		this.element._value = value;
		this.element._selectedIndex = -2;
	}
	
	if(this.element._value && this.element._value.length >= this._minNumberOfChars)
	{
		if(force) this.element._isDirty = true;
		this._doSearch = force;

		this._hideValidationTooltip();

		if(!doNotPost)
		{
			this.fireChangedEvent();
			if(this.formManager) this.formManager.postData(this.element);
		}
		return true;
	}
	else
	{
		Tooltip.attach(this.element, "Please enter at least " + this._minNumberOfChars + " character" + 
			(this._minNumberOfChars == 1 ? "" : "s") + " to search upon");
		Tooltip.forceOnElement(this.element);
		return false;
	}
}

proto.set_tabIndex = function(ti, temporary)
{
	if(!temporary) this._tabIndex = ti;
	if(this._searchable) this._getTextInput().tabIndex = ti;
	else this.element.tabIndex = ti;
}


var vproto = CN_combobox.vistaThemeProto = CNUtil.cloneObject(proto);
vproto.createElementOnly = function(node, inGrid, assignElement)
{
	this._preinit(node, inGrid);

	var l = CN_combobox._template.cloneNode(true);
	l.id = "";
	
	var clickable;

	if(this._searchable)
	{
		var img = VistaSupport.createImageButton("searchable-icon.gif", 20, 20);
		img.className = "searchButtonIMG";
		l.insertBefore(img, l.lastChild);
		
		var input = document.createElement("<input type='text'>");
		input.className = "comboTextInput";
		l.lastChild.appendChild(input);
		input.attachEvent("onfocus", this._input_onfocus);
		input.attachEvent("onbeforedeactivate", this._input_ondeactivate);
		//input.attachEvent("onmousedown", Util.cancelBubble);
		//input.attachEvent("ondblclick", Util.cancelBubble);
		this._setTextInputEvents(input);
		
		img.attachEvent("onclick", this._img_onclick);

		clickable = l.lastChild; // Note: right button is hidden by text div, and we can't move button on top.
	}
	else
	{
		var div = document.createElement("div");
		div.className = "comboTextDiv"
		l.lastChild.appendChild(div)
		l.lastChild.className = "comboTextDiv comboTextContDiv";
		clickable = l;
	}
	
	if(assignElement) this.element = l;
	l._isComboBox = true;
	l.jsObject = this;
	
	var isNotArray = !(node instanceof Array) && !(node instanceof Object);
	if(isNotArray) this._setCommonOptions(node);

	l.attachEvent("onmouseenter", this._element_onmouseenter);
	l.attachEvent("onmouseleave", this._element_onmouseleave);
	l.attachEvent("onkeydown", this._element_onkeydown);
	
	clickable.attachEvent("onmousedown", this._element_onmousedown);
	clickable.attachEvent("ondblclick", this._element_onmousedown);

	return l;
}

vproto.hoverBox = function(l, imgSrc)
{
	var inner = l.children[0];
	if(ThemeNonCSSStyles.animateButtons) {
		if(inner.filters.length == 0) inner.style.filter = "progid:DXImageTransform.Microsoft.Fade()";
		inner.filters[0].Apply();
	}
	l.className = "cn_combobox cn_combobox_hover";
	if(imgSrc) inner.firstChild.runtimeStyle.backgroundImage = "url(" + CNFormManager.themeImagesPath + imgSrc + ")";
	else inner.firstChild.runtimeStyle.backgroundImage = "";
	if(ThemeNonCSSStyles.animateButtons) {
		inner.filters[0].Play(imgSrc ? .2 : .4);
	}
}

vproto.unhoverBox = function(l)
{
	if(l.className == "cn_combobox") return;
	var inner = l.children[0];
	if(inner.filters.length) 
	{
		inner.filters[0].Apply();
	}
	inner.firstChild.runtimeStyle.backgroundImage = "";	
	l.className = "cn_combobox";
	if(inner.filters.length) inner.filters[0].Play(.4);
}

vproto._input_onfocus = function()
{
	var js = CNUtil.dispatchObject();
	if(!js || js._disabled || js.popupOpened || js.oncheckreadonly()) return;
	js.hoverBox(js.element);
}

vproto._input_ondeactivate = function()
{
	var js = CNUtil.dispatchObject();
	if(!js || js._disabled || js.popupOpened || js.oncheckreadonly()
		|| js.element.contains(event.toElement)) return;
	js.unhoverBox(js.element, true);
}

vproto._pressBox = function()
{
	this.hoverBox(this.element, "press-drop-down.gif");
}

vproto._getTextElement = function()
{
	return this.element.lastChild;
}
vproto._getTextInput = function()
{
	return this.element.lastChild.lastChild;
}

vproto._set_selectedIndex = function(doNotFireEvent, force)
{
	if(this.element._selectedIndex === undefined && !force) return;
	
	var textElement = this.element.lastChild;

	if(!this.optionTags || this.optionTags.length == 0) 
	{
		if(this._searchable) textElement.firstChild.value = "";
		else textElement.innerText = "";
		return;
	}
	
	var ix = this.element._selectedIndex;
	var img = textElement.firstChild;
	
	var html = this.getHTMLByIndex(ix);
	if(html) 
	{
		if(this._searchable) textElement.children[0].value = html;
		else 
		{
			if(html == "") html = "&nbsp";
			textElement.innerHTML = html;
		}
	}
	else
	{
		var text = this.getTextByIndex(ix);
		if(!text) text = "";
		if(this._searchable) 
		{
			if(img && img._isComboImg) textElement.firstChild.nextSibling.value = text;
			else textElement.firstChild.value = text;
		}
		else textElement.innerText = text;
	}
	
	this.element._value = this.getValueByIndex(ix);
	
	var valueElement = this._searchable ? textElement.children[0] : textElement;
	//var valueElement = textElement;

	var tag = this.optionTags[ix];
	if(tag) 
	{
		var attr = tag.getAttribute("textColor");

		if(attr) valueElement._color = valueElement.runtimeStyle.color = String(attr);
		else 
		{
			valueElement.runtimeStyle.color = "";
			valueElement._color = null;
		}

		attr = tag.getAttribute("img");
		if(attr) 
		{
			if(!img || img.tagName != "IMG")
			{
				img = document.createElement("img");
				img.className = "inlineComboIMG";
				img._isComboImg = true;
				textElement.insertBefore(img, textElement.firstChild);
			}
			
			img.src = String(attr);
		}
		else 
		{			
			if(img && img._isComboImg) img.removeNode(true);
		}
	}
	else
	{
		valueElement.runtimeStyle.color = "";
		if(img && img._isComboImg) img.removeNode(true);
	}
	
	if(!doNotFireEvent) this.fireChangedEvent();
}
vproto.set_disabled = function(value)
{
	this._disabled = value;
	if(value)
	{
		this.set_tabIndex(-1, true);
		this.element.className = "cn_combobox cn_combobox_disabled";
		if(this._searchable) this._getTextInput().readOnly = true;
		else this.element.firstChild.runtimeStyle.backgroundColor = "#F4F4F4";
	}
	else
	{
		if(this._tabIndex) this.set_tabIndex(this._tabIndex);
		this.element.className = "cn_combobox";
		if(this._searchable) this._getTextInput().readOnly = false;
		else this.element.firstChild.runtimeStyle.backgroundColor = "";
	}
}

