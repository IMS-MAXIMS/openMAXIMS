/*
	v. 2.02
	+ vista.
*/
function CN_answerbox()
{
	this.formManager = null;
	this.isReady = false;

	this.optionTags = null;

	this.activeOption = null;

	this.popup = null;

	this.popupOpened = false;

	this._disabled = false;
	this._isDirty = false;
	this._autoPostBack = false;
	this._canBeEmpty = false;
	this._imgHeight = 10;
	
	this.supportsRequired = true;
}
CN_answerbox.currentCombobox = null;
CN_answerbox.pendingCombobox = null;

var proto = CN_answerbox.prototype;
// Inherit.
proto._processTypedWord = CN_combobox.plainThemeProto._processTypedWord;
proto._typedSelectTimout = 0;
proto._lastTypeStamp = 0;


// Events. =================
proto.onchange = function(ev)
{
	if(this._autoPostBack) this.formManager.postData(this.element);
}
proto.oncheckreadonly = function(){ return false; }


proto.createElement = function(node, parentElement)
{
	var l = this.createElementOnly(node, parentElement);

	this.element = l;
	
	var attr = node.getAttribute("autoPostBack");
	if(attr) this._autoPostBack = attr == "true";

	var attr = node.getAttribute("imgHeight");
	if(attr) this._imgHeight = parseInt(attr, 10);

	this.initData(node);
	
	return l;
}

proto.createElementOnly = function(node, parentElement)
{
	var l = document.createElement("span");
	parentElement.appendChild(l);

	var attr = node.getAttribute("canBeEmpty");
	this._canBeEmpty = attr == "true";

	l.className = "cn_answerbox";
	//l.unselectable = "on";
	l._isComboBox = true;
	l._selectedIndex = this._canBeEmpty ? -1 : 0;
	
	l.jsObject = this;
	
	l.attachEvent("onclick", this._element_onmousedown);
	l.attachEvent("oncontextmenu", this._element_oncontextmenu);
	l.attachEvent("ondblclick", this._element_onmousedown);

	this.buildElement(l);

	var attr = node.getAttribute("text");
	if(attr) l.children[1].innerText = String(attr);
	
	l.attachEvent("onkeydown", this._element_onkeydown);

	this.isReady = true;	
	
	return l;
}

proto.loadData = function(node)
{
	this.initData(node);
	var ix = parseInt(node.getAttribute("selection"));

	if(!isNaN(ix)) 
	{
		if(this.element) this.set_selectedIndex(ix);
		this._isDirty = false;
	}
}

proto.storeData = function(xmldoc)
{
	if(!this._isDirty) return null;
		
	this._isDirty = false;

	var node = xmldoc.createElement("answerbox");
	node.setAttribute("selection", this.element._selectedIndex);
	return node;
}

proto.buildElement = function(l)
{
	var checkElement = document.createElement("<span class=checkSpan>")
	//checkElement.unselectable = "on";
	l.appendChild(checkElement);
	
	var img = document.createElement("img");
	img.width = img.height = this._imgHeight;
	checkElement.appendChild(img);

	var textElement = document.createElement("<span class=textSpan>")
	//textElement.unselectable = "on";
	l.appendChild(textElement);
}

proto.initData = function(data)
{
	if(data == null) return;
	
	var options = null;
	if(data instanceof Array) options = CN_combobox.makeOptions(data);
	else options = data.selectNodes("option");
	if(!options || options.length == 0) return;

	// Reset popup.
	this.popup = null;
	
	this.optionTags = options;

	this.initOptions();

	if(this.element) this._set_selectedIndex();
}		

proto.initOptions = function()
{
	var count = this.optionTags.length;
	for(var i = 0; i < count; i++)
	{
		this.optionTags[i].setAttribute("index", i);
	}
}

proto.setNextState = function()
{
	this.element._selectedIndex++;
	if(this.element._selectedIndex >= this.optionTags.length) 
	{
		if(this._canBeEmpty) this.element._selectedIndex = -1;
		else this.element._selectedIndex = 0;
	}
	this._set_selectedIndex();
	this._isDirty = true;
}

proto.fireChangedEvent = function()
{
	var ev = {};
	ev.selectedIndex = this.element._selectedIndex;
	if(this.onchange) this.onchange(ev);
}


proto.createPopup = function()
{
	if(this.popup) return;

	this.popup = document.createElement("div");
	this.popup.className = "cn_comboboxPopup";
	this.popup._isPopup = true;
	document.body.appendChild(this.popup);

	if(this._canBeEmpty)
	{
		var option = this.createOption(" ", null, -1);
		this.popup.appendChild(option);
	}

	var count = this.optionTags.length;
	for(var ix = 0; ix < count; ix++)
	{
		var optionTag = this.optionTags[ix];

		var text = String(optionTag.getAttribute("text"));
		text = text == "" ? " " : text; // !!
		
		var option = this.createOption(text, String(optionTag.getAttribute("img")), ix);
		this.popup.appendChild(option);

		var attr = optionTag.getAttribute("textColor");
		if(attr) option.style.color = String(attr);
	}
	
	this.popup.style.overflow = "auto";
	
	if(CNFormManager.vista) new Shadow(this.popup, false, true);
	
	this.popup.attachEvent("onmousedown", CNUtil.cancelEvent);
	this.popup.attachEvent("onclick", this._popup_onclick);
	this.popup.attachEvent("onmouseover", this._popup_onmouseover);
	this.popup.attachEvent("onmouseout", this._popup_onmouseout);
	this.popup.attachEvent("onkeydown", this._popup_onkeydown);
}

proto.createOption = function(text, imgUrl, index)
{
	var option = document.createElement("<div class=xlcombooption style=\"padding: 1px; position: relative; display: inline-block; white-space: nowrap; \">");

	option.innerText = text;
	option.index = index;

	if(imgUrl)
	{
		var img = document.createElement("<img align=absmiddle style=\"margin-right: 4px; \">");
		img.src = imgUrl;
		option.insertAdjacentElement("afterbegin", img);
	}

	return option;
}

proto._showPopup = function()
{
	CN_answerbox.currentCombobox = CN_answerbox.pendingCombobox;
	CN_answerbox.pendingCombobox = null;
	CN_answerbox.currentCombobox.showPopup();
}

proto.showPopup = function()
{
	this.createPopup();

	this.popupOpened = true;
	this.popup.scrollTop = this.popup.scrollLeft = 0;

	var ix = this.element._selectedIndex;
	if(this._canBeEmpty) ix++;

	this.popup.style.zIndex = top.__ontopZ++;
	
	var xy = CNUtil.findAbsolutePos(this.element, null, false, true);
	// ?? For some reason this padding is not catched by findAbsolutePos..
	if(this.element.parentNode.className == "cellSpan") xy.x += 2; 
	//xy.x += 1;
	
	xy.y += this.element.offsetHeight;
	
	var popupWidth = Math.max(this.element.offsetWidth, 80);
	this.popup.style.width = popupWidth + "px";
	this.popup.style.overflowY = "auto";
	this.popup.style.visibility = "hidden";
	this.popup.style.display = "block";
	
	var maxHeight = parseInt(this.element.currentStyle["xl--popup-max-height"]);
	if(this.popup.offsetHeight >= maxHeight) this.popup.style.height = maxHeight + "px";
	else this.popup.style.height = "auto";
	
	CNUtil.posPopup(this.popup, xy.x, xy.y);

	if(this.popup.scrollHeight <= this.popup.offsetHeight) this.popup.style.overflowY = "hidden";

	if(CNFormManager.vista)
	{
		this.popup.style.visibility = "visible";
		if(this.popup.shadow) this.popup.shadow.show();
		
		if(ThemeNonCSSStyles.animateDropdowns) {
			var h = this.popup.offsetHeight;
			this.popup.style.height = "1px";
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
	
	this.popup.setActive();
}

proto.hidePopup = function()
{
	this.popupOpened = false;

	this.unhoverOption();

	if(this.popup) 
	{
		this.popup.style.display = "none";
		if(this.popup.shadow) 
		{
			this.popup.shadow.hide();
		}
	}

	document.detachEvent("onmousedown", this._document_onmousedown);
	document.detachEvent("onmousewheel", this._document_onmousedown);
}

proto.hoverOption = CN_combobox.plainThemeProto.hoverOption;
proto.unhoverOption = CN_combobox.plainThemeProto.unhoverOption;

proto.selectOption = function(l)
{
	if(this.element._selectedIndex != l.index)
	{
		this.set_selectedIndex(l.index);
		this.fireChangedEvent();		
	}
}

// Event handlers. =================================
proto._document_onmousedown = function()
{
	CN_answerbox.currentCombobox.document_onmousedown();
}
proto.document_onmousedown = function()
{
	this.closing = true;
	event.cancelBubble = true;
	this.hidePopup();
	CN_answerbox.currentCombobox = null;
}

proto._popup_onclick = function()
{
	CN_answerbox.currentCombobox.popup_onclick();
}
proto.popup_onclick = function()
{
	var l = event.srcElement;
	if(!l || !this.popup.contains(l) || l.className != "xlcombooption") return;
	this.hidePopup();
	this.selectOption(l);
}

proto._popup_onmouseover = function()
{
	CN_answerbox.currentCombobox.popup_onmouseover();
}
proto.popup_onmouseover = function()
{
	var l = event.srcElement;
	if(!l || !this.popup.contains(l) || l.className != "xlcombooption") return;
	this.hoverOption(l);
}

proto._popup_onmouseout = function()
{
	if(CN_answerbox.currentCombobox) CN_answerbox.currentCombobox.popup_onmouseout();
}
proto.popup_onmouseout = function()
{
	var l = event.srcElement;
	var option = CNUtil.findByClassName(l, "xlcombooption");
	if(!l || !this.popup.contains(l) || l.className != "xlcombooption"
	|| option.contains(l)) return;
	this.unhoverOption();
}

proto._popup_onkeydown = function()
{
	CN_answerbox.currentCombobox.popup_onkeydown();
}
proto.popup_onkeydown = function()
{
	var code = event.keyCode;
	switch(code)
	{
		case 27:
			 this.hidePopup(); 
			 CNUtil.cancelEvent();
			 break;
		case 38: // Up
			if(this.activeOption && this.activeOption.previousSibling) this.hoverOption(this.activeOption.previousSibling);
			CNUtil.cancelEvent();
			break;
		case 40:
			if(this.activeOption && this. activeOption.nextSibling) this.hoverOption(this.activeOption.nextSibling);
			CNUtil.cancelEvent();
			break;
		case 13: 
			if(this.activeOption) 
			{
				this.selectOption(this.activeOption);
				this.hidePopup();
			}
			CNUtil.cancelEvent();
			break;
		default:
			this._processTypedWord(code, false);
			CNUtil.cancelEvent();
	}
	event.returnValue = false;
}

proto._element_oncontextmenu = function()
{
	CNUtil.findJSObject(event.srcElement).element_oncontextmenu();
}

proto.element_oncontextmenu = function()
{
	CNUtil.cancelEvent();
	
	if(this._disabled || this.oncheckreadonly()) return;

	var l = event.srcElement;
	while(l && !l._isComboBox) l = l.parentElement;
	this.element = l;

	if(this.popupOpened) 
	{
		this.hidePopup();
		event.cancelBubble = true;		
		return;
	}

	this.element.focus();
	CN_answerbox.pendingCombobox = this;
	setTimeout(this._showPopup, 0);
}

proto._element_onkeydown = function()
{
	CNUtil.dispatchObject().element_onkeydown();
}
proto.element_onkeydown = function()
{
	if(this._disabled || this.oncheckreadonly()) return;
	this.createPopup(); // Ensure popup created.
	var code = event.keyCode;
	this._processTypedWord(code, true);
}

proto._element_onkeypress = function()
{
	if(event.keyCode == 27) 
	{
		var jsObject = CNUtil.findJSObject(event.srcElement);
		jsObject.hidePopup();
	}
}

proto._element_onmousedown = function()
{
	CNUtil.findJSObject(event.srcElement).element_onmousedown();
}

proto.element_onmousedown = function()
{
	if(this._disabled || this.oncheckreadonly()) return;
	
	var l = event.srcElement;
	while(l && !l._isComboBox) l = l.parentElement;
	this.element = l;

	this.setNextState();
	this.fireChangedEvent();
}


// Properties. ===============================
proto.set_disabled = function(val)
{
	this._disabled = val;
	this.element.runtimeStyle.filter = this._disabled ? this.element.currentStyle["xl--disabled-filter"] : "";
	if(this._tabIndex) 
	{
		if(this._disabled) this.element.tabIndex = -1;
		else this.element.tabIndex = this._tabIndex;
	}
}

proto.set_selectedIndex = function(val)
{
	val = val * 1;
	if(this.element._selectedIndex == val) return;
	this.element._selectedIndex = val;
	this._isDirty = true;
	if(this.isReady) this._set_selectedIndex();
}
proto._set_selectedIndex = function()
{
	if(!this.optionTags) return;
	var option = this.optionTags[this.element._selectedIndex];
	var checkElement = this.element.children[0];
	if(!option)
	{
		checkElement.firstChild.style.visibility = "hidden";
		Tooltip.detach(this.element);
	}
	else
	{
		checkElement.firstChild.src = String(option.getAttribute("img"));
		checkElement.firstChild.style.visibility = "inherit";

		var text = "";
		var attr = option.getAttribute("text");
		if(attr) text = String(attr);
		Tooltip.set(this.element, String(attr));
	}
}

proto.set_tabIndex = function(ti)
{
	this._tabIndex = ti;
	this.element.tabIndex = ti;
}

// Grid support.
// AnswerBox. =====================================
var AnswerBoxCell = CN_grid.CellTypes["AnswerBox"] = function(colTag, grid)
{
	this._combobox = null;
	this._grid = grid;
	this._imgHeight = 10;
}

AnswerBoxCell.cn_tagName = "answerbox";
var wp = AnswerBoxCell.prototype;
wp.isFocusable = true;
wp.isValid = function(cell){ return true; }
wp._cell_beforedeactivate = function()
{
	if(event.toElement == document.body) CNUtil.cancelEvent();
	else event.srcElement.tabIndex = -1;
}
wp.prerender = function(cell, colTag)
{
	var node = colTag.node.cloneNode(true);
	var combobox = this._combobox = new CN_answerbox();
	this._grid._jsObjects.push(combobox);
	
	var attr = node.getAttribute("imgHeight");
	if(attr) combobox._imgHeight = this._imgHeight = parseInt(attr, 10);

	var l = combobox.createElementOnly(node, cell);
	combobox.initData(node);
	combobox.onchange = this._answerbox_onchange;
	combobox.oncheckreadonly = this._answerbox_oncheckreadonly;
	
	cell.attachEvent("onkeydown", this._cell_onkeydown)
	cell.attachEvent("onbeforedeactivate", this._cell_beforedeactivate);	
}
wp._cell_onkeydown = function()
{
	if(event.srcElement.className != 'cellSpan') return;
	var cell = CN_grid.findCell(event.srcElement);
	var typeObject = cell.colTag.typeObject;
	CN_answerbox.currentCombobox = typeObject._combobox;
	typeObject._combobox.element = cell.firstChild;
	cell.children[0].fireEvent("onkeydown", event);
}
wp._answerbox_onchange = function(ev)
{
	// Executed in combobox context.
	var cell = this.element.parentElement;
	var row = cell.parentElement;
	
	// Probably resets current focused box, allow changed box commit.
	cell.focus(); 

	var jsObject = CNUtil.findJSObject(cell);
	jsObject.setChangedValue(row, cell, ev.selectedIndex);
	jsObject.fireChangedEvent(row, cell, ev.selectedIndex);
	if(cell.colTag.autoPostBack) jsObject.postBack(row, cell, ev.selectedIndex);
}

wp._answerbox_oncheckreadonly = function()
{
	// Executed in combobox context.
	var cell = CN_grid.findCell(event.srcElement);
	var jsObject = CNUtil.findJSObject(cell);
	return jsObject.getCascadedReadOnly(cell);
}

wp.render = function(cell, node)
{
	var row = cell.parentElement;
	var colTag = cell.colTag;

	var top = (18 - this._imgHeight) / 2;
	if(top < 0) top = 0;
	cell.style.paddingTop = top;
	
	var comboElement = cell.children[0];
	
	var ix = parseInt(node.text, 10);
	
	// Temporary set element.
	this._combobox.element = comboElement;
	this._combobox.element._selectedIndex = ix;
	this._combobox._set_selectedIndex(true);
	this._combobox.element = null;
}


// MutableAnswerBox. ==================================
var MutableAnswerBoxCell = CN_grid.CellTypes["MutableAnswerBox"] = function(colTag, grid)
{
	this._combobox = null;
	this._grid = grid;
	this._imgHeight = 10;
}

MutableAnswerBoxCell.cn_tagName = "mutableanswerbox";

var wp = MutableAnswerBoxCell.prototype;
wp.isValid = function(cell){ return true; }
wp.isFocusable = true;
wp._cell_beforedeactivate = AnswerBoxCell.prototype._cell_beforedeactivate;
wp._cell_onkeydown = function()
{
	if(event.srcElement.className != 'cellSpan') return;
	var cell = CN_grid.findCell(event.srcElement);
	cell.children[0].fireEvent("onkeydown", event);
}

wp.prerender = function(cell, colTag)
{
	cell.attachEvent("onkeydown", this._cell_onkeydown);
	cell.attachEvent("onbeforedeactivate", this._cell_beforedeactivate);	
}

wp._answerbox_onchange = AnswerBoxCell.prototype._answerbox_onchange;

wp._answerbox_oncheckreadonly = AnswerBoxCell.prototype._answerbox_oncheckreadonly;

wp.render = function(cell, node)
{
	var row = cell.parentElement;
	var colTag = cell.colTag;

	var top = (18 - this._imgHeight) / 2;
	if(top < 0) top = 0;
	cell.style.paddingTop = top;
	
	node = node.cloneNode(true);
	
	var comboElement = cell.children[0];

	var combobox = new CN_answerbox();
	this._grid._jsObjects.push(combobox);
	
	var l = combobox.createElement(node, cell);
	
	combobox.onchange = this._answerbox_onchange;
	combobox.oncheckreadonly = this._answerbox_oncheckreadonly;
	
	var attr = node.getAttribute("selectedIndex");
	if(attr)
	{
		var index = parseInt(attr, 10);
		combobox.set_selectedIndex(index);
	}
}
