/*
	v. 2.1
	+ simpleMode
*/
function CN_wysiwygeditor()
{
	this._currentTool = null;

	this._maxLength = 0;//default no text limit
	
	this._pointerXOff = -6;
	this._pointerYOff = -4;
	
	// Used for vml tools.
	this._currentForeColor = "#000000";
	this._currentWeight = 1;
	
	this._selectedShape = null;
	
	this._xlcc = new CEditorController();
	this._groupButtons = [];
	
	this._jsObjects = [];
	this._disabled = false;
	this._toolbar = null;
	this._event = null;
	this._storedRange = null;
	this._isDirty = false;	

	this._fontName = null;
	this._fontSize = "1";
	
	this.supportsRequired = true;
	
	this._scFixes = [];
}

CN_wysiwygeditor._simpleMode = false;
CN_wysiwygeditor._autoCorrectCache = [];
CN_wysiwygeditor._autoCorrectMaxLength = 0;
CN_wysiwygeditor._autocompleteUIShown = false;

CN_wysiwygeditor._showAutocompleteUI = function(editor, correctEntry, correctRange, cursorRange)
{
	CN_wysiwygeditor._correctRange = correctRange;
	CN_wysiwygeditor._acuiEditor = editor;
	
	CN_wysiwygeditor._fillAutocomplteUIItems(correctEntry);

	var div = CN_wysiwygeditor._autocompleteUI;
	div.style.left = cursorRange.offsetLeft + document.body.scrollLeft;
	div.style.top = cursorRange.offsetTop + cursorRange.boundingHeight
												 + document.body.scrollTop;
	div.style.visibility = "inherit";
	div.shadow.show();

	document.body.attachEvent("onmousedown", CN_wysiwygeditor._hideAutocompleteUI);
	editor._contentDiv.attachEvent("onkeydown", CN_wysiwygeditor._editor_onkeydown);
	
	// Select first item.
	CN_wysiwygeditor._hiliteAcuiItem(div.firstChild.firstChild);
	CN_wysiwygeditor._autocompleteUIShown = true;
}

CN_wysiwygeditor._fillAutocomplteUIItems = function(correctEntry)
{
	// Remove previous container.
	var fc = CN_wysiwygeditor._autocompleteUI.firstChild;
	if(fc) fc.removeNode(true);
	
	CN_wysiwygeditor._autocompleteUI.appendChild(correctEntry.container);
}

CN_wysiwygeditor._editor_onkeydown = function()
{
	switch(event.keyCode)
	{
	// 40 = down
		case 40:
			var item = CN_wysiwygeditor._currentAcuiItem.nextSibling;
			if(!item) item = CN_wysiwygeditor._autocompleteUI.firstChild.firstChild;
			CN_wysiwygeditor._hiliteAcuiItem(item);
			CNUtil.cancelEvent();
			break;
	// 38 = up
		case 38:
			var item = CN_wysiwygeditor._currentAcuiItem.previousSibling;
			if(!item) item = CN_wysiwygeditor._autocompleteUI.firstChild.lastChild;
			CN_wysiwygeditor._hiliteAcuiItem(item);
			CNUtil.cancelEvent();
			break;
	// 13 = enter
	// 9  = tab
		case 13:
		case 9:
			CN_wysiwygeditor._replaceAndHide();
			CNUtil.cancelEvent();
			break;
		// Shift, ctrl, alt.
		case 16:
		case 17:
		case 18:
			break;
		default:
			CN_wysiwygeditor._hideAutocompleteUI();
	}
}

CN_wysiwygeditor._replaceAndHide = function()
{
	CN_wysiwygeditor._correctRange.text = CN_wysiwygeditor._currentAcuiItem.innerText;
	CN_wysiwygeditor._hideAutocompleteUI();
}

CN_wysiwygeditor._hideAutocompleteUI = function()
{
	if(!CN_wysiwygeditor._autocompleteUIShown) return;	
	document.body.detachEvent("onmousedown", CN_wysiwygeditor._hideAutocompleteUI);
	CN_wysiwygeditor._acuiEditor._contentDiv.detachEvent("onkeydown", CN_wysiwygeditor._editor_onkeydown);

	if(!CN_wysiwygeditor._autocompleteUI) return;	
	CN_wysiwygeditor._autocompleteUI.shadow.hide();
	CN_wysiwygeditor._autocompleteUI.style.visibility = "hidden";

	CN_wysiwygeditor._acuiEditor = null;
	CN_wysiwygeditor._correctRange = null;
	CN_wysiwygeditor._autocompleteUIShown = false;
}

CN_wysiwygeditor._createAutocompleteUI = function()
{
	CN_wysiwygeditor._destroyAutocompleteUI();

	var div = document.createElement("<div class='cn_wysiwygeditor_autocompleteDiv'>");
	CN_wysiwygeditor._autocompleteUI = div;

	div.attachEvent("onmousedown", CNUtil.cancelEvent);
	
	document.body.appendChild(div);
	
	new Shadow(div, false, true);
}

CN_wysiwygeditor._destroyAutocompleteUI = function()
{
	if(CN_wysiwygeditor._autocompleteUI) 
	{
		CN_wysiwygeditor._autocompleteUI.removeNode(true);
		CN_wysiwygeditor._autocompleteUI = null;
	}
}

CN_wysiwygeditor._addAutoCompleteValue = function(entry, value)
{
	if(!entry.container)
	{
		entry.container = document.createElement("<div class='cn_autocompleteDiv_containerDiv'>");
	}

	var itemDiv = document.createElement("<div class='cn_autocompleteDiv_itemDiv'>");
	entry.container.appendChild(itemDiv);
	itemDiv.innerText = value;
	
	itemDiv.attachEvent("onmousedown", CN_wysiwygeditor._acui_item_onmousedown);
}

CN_wysiwygeditor._acui_item_onmousedown = function()
{
	var item = CNUtil.findByClassName(event.srcElement, "cn_autocompleteDiv_itemDiv");
	CN_wysiwygeditor._hiliteAcuiItem(item);
	CN_wysiwygeditor._replaceAndHide();
	CNUtil.cancelEvent();
}

CN_wysiwygeditor._hiliteAcuiItem = function(item)
{
	var container = item.parentElement.parentElement;
	CN_wysiwygeditor._unliteCurrentAcuiItem();

	item.runtimeStyle.filter = item.currentStyle['xl--hilite-filter'];
	item.runtimeStyle.borderWidth = 1;
	item.runtimeStyle.padding = 1;
	CN_wysiwygeditor._currentAcuiItem = item;

	if(item.offsetTop + item.offsetHeight > container.scrollTop + container.clientHeight)
	{
		container.scrollTop = item.offsetTop + item.offsetHeight - container.clientHeight
			+ parseInt(item.currentStyle.margin, 10);
	}
	else if(item.offsetTop < container.scrollTop)
	{
		container.scrollTop = item.offsetTop - parseInt(item.currentStyle.margin, 10);
	}

}

CN_wysiwygeditor._unliteCurrentAcuiItem = function()
{
	var item = CN_wysiwygeditor._currentAcuiItem;
	if(!item) return;
	item.runtimeStyle.filter = "";
	item.runtimeStyle.borderWidth = 0;
	item.runtimeStyle.padding = 2;
	
	CN_wysiwygeditor._currentAcuiItem = null;
}



var proto = CN_wysiwygeditor.prototype;

proto.unload = function()
{
	this._cleanUpSpellCheck();

	// TODO: garbageCollector.
	for(var i = 0; i < this._jsObjects.length; i++)
	{
		var jsObject = this._jsObjects[i];
		if(jsObject.unload) jsObject.unload();
		if(jsObject.element)
		{
			jsObject.element.jsObject = null;
			jsObject.element = null;
		}
		this._jsObjects[i] = null;
	}
	this._jsObjects = null;

	if(this._autocompleteUI)
	{
		this._autocompleteUI.jsObject = null;
		this._autocompleteUI = null;
	}

	this._storedRange = null;
	this._groupButtons = null;
	this._xlcc = null;
}

proto.createElement = function(node, parentElement)
{
	var l = document.createElement("<table class=cn_wysiwygeditor cellpadding=0 cellspacing=0 border=0>");
	parentElement.appendChild(l);
	
	this.element = l;
	l.jsObject = this;
	l.style.visibility = "hidden";

	CN_wysiwygeditor._simpleMode = node.getAttribute("simpleMode") == "true";

	var attr = node.getAttribute("maxLength");
	if(attr) this._maxLength = parseInt(attr, 10);
	
	this._xlcc.addController(this);
	this._xlcc.setActiveController(this);

	this._buildElement(node);
	
	this._fontName = node.getAttribute("fontName");
	if (!this._fontName)
		this._fontName = "Verdana";
	
	if (this._xlcc.selects.FontName)
	{
		this._xlcc.selects.FontName[0].set_value(this._fontName, false);	
		if (node.getAttribute("fontSize"))
		{
			switch (parseInt(node.getAttribute("fontSize").replace("px", "")))
			{
				case 12:
					this._xlcc.selects.FontSize[0].set_value("1", false);
					this._fontSize = "1";
					break;
				case 14:
					this._xlcc.selects.FontSize[0].set_value("2", false);
					this._fontSize = "2";
					break;
				case 16: 	
					this._xlcc.selects.FontSize[0].set_value("3", false);
					this._fontSize = "3";
					break;
				case 20:
					this._xlcc.selects.FontSize[0].set_value("4", false);
					this._fontSize = "4";
					break;
				case 24:
					this._xlcc.selects.FontSize[0].set_value("5", false);
					this._fontSize = "5";
					break;
				case 32:
					this._xlcc.selects.FontSize[0].set_value("6", false);
					this._fontSize = "6";
					break;
				case 42:
					this._xlcc.selects.FontSize[0].set_value("7", false);
					this._fontSize = "7";
					break;
				default:
				{
					this._xlcc.selects.FontSize[0].set_value("1", false);
					this._fontSize = "1";
				}
			}
		}
	}

	
	this._updateStatus();
	l.style.visibility = "inherit";

	return l;
}

proto._filter = function(html)
{
	return html.replace(/<p/ig, '<div').replace(/<\/p>/ig, '</div>').replace(/\r/g,"").replace(/\t/g,"&nbsp;&nbsp;&nbsp;&nbsp;");
}

String.prototype.replace = (function(r){
 return function(find, replace, replaceOnce) {
     if(typeof find == 'string' && !replaceOnce) {
       find = r.apply(find, [/[\[\]^$*+.?(){}\\\-]/g,function(c) { return '\\'+c; }]);
       find = new RegExp(find, 'g');
     } else if(typeof find == 'object' && !replaceOnce && !find.global) {
       find = new RegExp(find.source, 'g');
     }
     return r.apply(this, [find,replace]);
 }
})(String.prototype.replace);

proto.loadData = function(node)
{
	var documentNode = node.selectSingleNode("document");
	if(documentNode)
	{
		this._cleanUpSpellCheck();

		var html = this._filter(documentNode.text);
		
		if(CN_wysiwygeditor._simpleMode) this._contentDiv.innerText = html;
		else this._contentDiv.innerHTML = html;
	}
	
	var autoCorrectNode = node.selectSingleNode("autocorrect");
	if(autoCorrectNode) this._loadAutoCorrect(autoCorrectNode);
	
	var autoCompleteNode = node.selectSingleNode("autoguess");
	if(autoCompleteNode) this._loadAutoComplete(autoCompleteNode);

	var glossaryVisibleAttr = node.getAttribute("glossaryVisible");
	if(glossaryVisibleAttr)
	{
		this._glossaryButton.style.display = glossaryVisibleAttr == "true" ? "inline" : "none";
	}
	
	var pasteNode = node.selectSingleNode("paste");
	if(pasteNode) this._paste(pasteNode.text);
	
	var spellCheckNode = node.selectSingleNode("spellcheck");
	if(spellCheckNode) this._spellCheck(spellCheckNode);
		
	this._updateStatus();
}

// Spell checking
proto._cleanUpSpellCheck = function()
{
	if(CN_wysiwygeditor._currentSCParent == this) CN_wysiwygeditor._currentSCParent = null;
	this._currentSCRange = null;
	
	for(var i = 0; i < this._scFixes.length; i++)
	{
		var entry = this._scFixes[i];
		if(entry.menu) 
		{
			entry.menu.destroy();
			PopupMenu._removeMenu(entry.menu);
		}
	}
	
	this._scFixes = [];
}

proto._spellCheck = function(spellCheckNode)
{
	this._scFixes = [];

	var wordNodes = spellCheckNode.selectNodes("word");
	var wordNodesCount = wordNodes.length;
	for(var i = 0; i < wordNodesCount; i++)
	{
		var wordNode = wordNodes[i];
		
		var value = String(wordNode.getAttribute("value"));
		var fixes = wordNode.selectNodes("s");
		this._scFixes[i] = {word: value, fixes: fixes};
		
		this._applySCMarkForWords(value, i);
	}
}

proto._applySCMarkForWords = function(word, ix)
{
	var range = document.body.createTextRange();
	range.moveToElementText(this._contentDiv);
	range.collapse(true);
	while(range.findText(word, 100000000, 2))
	{
		var span = range.parentElement();
		if(!span || Util.findJSObject(span) != this) break;
		
		if(span && span.className == "spellError")
		{
			span._ix = ix;
			range.move("word", 1);
		}
		else 
		{
			var html = range.htmlText;
			//alert("=" + range.text + "=");
			//range.pasteHTML("");
			range.pasteHTML("<span _ix='" + ix + "'class='spellError'>" + html + "</span>");
		}
	}
	//alert(this._contentDiv.innerHTML)	
}

proto.contentDiv_onmousedown = function()
{
	if(event.button != 2) return;
	var l = event.srcElement;
	var errorSpan = null;
	while(l)
	{
		if(l.className == "spellError") 
		{
			errorSpan = l;
			break;
		}
		else if(l == this._contentDiv) break;
		l = l.parentElement;
	}
	
	if(!errorSpan) return;
	Util.cancelBubble();
	
	var ix = parseInt(errorSpan._ix, 10);
	
	var fixesEntry = this._scFixes[ix];
	if(!fixesEntry) 
	{
		Util.assert("No fixesEntry found for _ix: " + ix);
		return;
	}
	
	if(!fixesEntry.menu)
	{
		var menu = new PopupMenu(document.body, "beforeend");
		this._fillMenu(fixesEntry.fixes, menu);
		fixesEntry.menu = menu;
	}
	
	var range = document.body.createTextRange();
	range.moveToElementText(errorSpan);
	range.select();
	this._currentSCRange = range;

	var xy = Util.findAbsolutePos(errorSpan, null, false, true);
	fixesEntry.menu.show(xy.x, xy.y + errorSpan.offsetHeight);
	CN_wysiwygeditor._currentSCParent = this;
}

proto._fillMenu = function(nodes, menu)
{
	var nodesCount = nodes.length;
	for(var i = 0; i < nodesCount; i++)
	{
		var itemNode = nodes[i];
		
		var text = String(itemNode.text);

		var l = menu.createItem(text);
		l.style.fontWeight = "bold";
		l.onmenuclick = this._scMenuItem_onmenuclick;
	}
	if(nodesCount) menu.createHR();
	var l = menu.createItem("Add to Dictionary");
	l._command = "addToDictionary";
	l.onmenuclick = this._scMenuItem_onmenuclick;
	
}

proto._scMenuItem_onmenuclick = function(ev)
{
	if(!CN_wysiwygeditor._currentSCParent) return;
	CN_wysiwygeditor._currentSCParent.scMenuItem_onmenuclick(ev);
	CN_wysiwygeditor._currentSCParent = null;
}
proto.scMenuItem_onmenuclick = function(ev)
{
	if(!this._currentSCRange) return;
	
	var goodText = String(ev.srcElement.innerText);

	var l = this._currentSCRange.parentElement();
	var span = Util.findByClassName(l, "spellError");
	
	var range = document.body.createTextRange();
	range.moveToElementText(span);

	var inner = span.innerHTML;
	var badText = span.innerText;
		
	span.removeNode(true);
	
	range.pasteHTML(inner);

	range.collapse(false);

	if(ev.srcElement._command == "addToDictionary")
	{
		this._addToDictionary(this._currentSCRange.text);
		return;
	}

	var offset = goodText.length - badText.length;
	if(offset > 0)
	{
		var endBookmark = range.getBookmark();
		var tempRange = document.body.createTextRange();
		range.pasteHTML(goodText.substr(badText.length));
		range.move("character", -offset);
	}
	else
	{
		range.moveStart("character", offset);
		range.text = "";
	}
	
	if(offset > 0) offset = 0;
	

	for(var i = badText.length + offset; i >= 1; i--)
	{
		range.moveStart("character", -1);
		range.text = goodText.substr(i - 1, 1);
		range.move("character", -1);		
	}
	this._currentSCRange = null;
}	

proto._addToDictionary = function(text)
{
	this._storeCurrentRange();

	this._eventData = text;
	this._event = "wysiwygaddtodictionary";
	this.formManager.postData(this.element);
}

proto.cmdSpellCheck = function()
{
	this._storeCurrentRange();

	this._event = "wysiwygspellcheck";
	this.formManager.postData(this.element);
}

proto._removeSpellErrorSpan = function(span, currentRange)
{
	var bm = null;
	if(currentRange) bm = currentRange.getBookmark();
	var range = document.body.createTextRange();
	range.moveToElementText(span);
	var inner = span.innerHTML;
	span.removeNode(true);
	range.pasteHTML(inner);
	if(bm)
	{
		range.moveToBookmark(bm);
		range.select();
	}
}

proto._loadAutoCorrect = function(node)
{
	this._loadItems(node, "from", "to", true);
}

proto._loadAutoComplete = function(node)
{
	CN_wysiwygeditor._createAutocompleteUI();
	this._loadItems(node, "from", "to", false);
}

proto._loadItems = function(node, keyName, valueName, autoCorrect)
{
	var ar = CN_wysiwygeditor._autoCorrectCache;
	var items = node.selectNodes("item");
	for(var i = 0; i < items.length; i++)
	{
		var item = items[i]
		var key = item.getAttribute(keyName);
		var value = String(item.getAttribute(valueName));
		if(key)
		{
			key = String(key);
			var entry = ar[key];
			if(!entry || entry.autoCorrect != autoCorrect) 
			{
				entry = {}; // New or reset.
				entry.autoCorrect = autoCorrect;
				entry.values = [];
				ar[key] = entry;
			}
			
			entry.values.push(value); // Add value. AutoCorrect uses only first value.
			
			if(!autoCorrect) CN_wysiwygeditor._addAutoCompleteValue(entry, value);

			CN_wysiwygeditor._autoCorrectMaxLength = Math.max(value.length, CN_wysiwygeditor._autoCorrectMaxLength);
		}
	}
	return ar;
}

proto.storeData = function(xmldoc)
{
    // Remove focus from control when going to non-interactive.
    this._contentDiv.contentEditable = false;
	
	var node;

	var fragment = xmldoc.createDocumentFragment();
	var storedDirty = null;

	if(this._event)
	{
		node = xmldoc.createElement(this._event);
		fragment.appendChild(node);

		if(this._event == "wysiwygspellcheck")
		{
			storedDirty = this._isDirty;
			this._isDirty = false; // Skip complete document sending for spellcheck.
			
			var cdata = xmldoc.createCDATASection(this._contentDiv.innerText);
			node.appendChild(cdata);
		}
		else if(this._event == "wysiwygaddtodictionary")
		{
			storedDirty = this._isDirty;
			this._isDirty = false;
			var cdata = xmldoc.createCDATASection(this._eventData);
			node.appendChild(cdata);
		}
		
		this._eventData = null;
		this._event = null;
	}

	if(this._isDirty)
	{
		node = xmldoc.createElement("wysiwygdocument");
		var cdata = xmldoc.createCDATASection(CN_wysiwygeditor._simpleMode ? this._contentDiv.innerText : this._filter(this._contentDiv.innerHTML));
		node.appendChild(cdata);
		fragment.appendChild(node);
		this._isDirty = false;
	}
	
	if(storedDirty !== null) this._isDirty = storedDirty;

	return fragment;
}

proto._buildElement = function(node)
{
	var tbody = document.createElement("tbody");
	this.element.appendChild(tbody);
	
	tbody.appendChild(document.createElement("tr"));
	tbody.rows(0).appendChild(document.createElement("<td height=1>"));

	tbody.appendChild(document.createElement("tr"));
	tbody.rows(1).appendChild(document.createElement("<td height=100%>"));

	this.TextTool = CNUtil.cloneObject(this._TextTool);
	this.TextTool.jsObject = this;

	//this.LineTool = CNUtil.cloneObject(this._LineTool);
	//this.LineTool.jsObject = this;
	
	if(!CN_wysiwygeditor._simpleMode) {
	    this._buildToolbar();
    }
	
	this._currentTool = this.TextTool;

	this._scrollDiv = document.createElement("<div class=cnScrollDiv>");
	tbody.rows(1).cells(0).appendChild(this._scrollDiv);
	// This is required to help IE not to change scrollDiv by ranges.
	this._scrollDiv.appendChild(document.createTextNode(" "));
	
	this._contentDiv = document.createElement("<div class=cnContentDiv>");
	this._scrollDiv.appendChild(this._contentDiv);
	
	this.element.attachEvent("onmousedown", this._element_onmousedown);
	this._contentDiv.attachEvent("onkeyup", this._contentDiv_onkeyup);
	this._contentDiv.attachEvent("onfocus", this._contentDiv_onfocus);
	this._contentDiv.attachEvent("onkeypress", this._contentDiv_onkeyup);
	this._contentDiv.attachEvent("onkeydown", this.__updateStatus);
	this._contentDiv.attachEvent("onselect", this.__updateStatus);
	this._contentDiv.attachEvent("onmouseup", this.__updateStatus);
	if(CN_wysiwygeditor._simpleMode) 
	{
        this._contentDiv.attachEvent("onkeydown", this._simpleMode_onkeydown);
        this._contentDiv.attachEvent("onpaste", this._simpleMode__onpaste);
    }
	else
	{
		this._contentDiv.attachEvent("onkeydown", this.__updateStatus);
		this._contentDiv.attachEvent("onpaste", this._onpaste);	
	}		
	this._contentDiv.attachEvent("onbeforedeactivate", this._onbeforedeactivate);
	Util.handleEvent(this._contentDiv, "onmousedown", "contentDiv_");

	//this._vmlDiv = document.createElement("<div class=cnVmlDiv>");
	//this._scrollDiv.appendChild(this._vmlDiv);
	//this._vmlDiv.attachEvent("onkeyup", this._vmlDiv_onkeyup);
		
	this._scrollDiv.attachEvent("onmousedown", this._scrollDiv_onmousedown);

	//this._contentDiv.contentEditable = true;
	//this._contentDiv.blur();
}

proto._simpleMode_onkeydown = function() {
	if(event.keyCode ==  13) {
		return;
	}

	// Disallow any WYSIWYG commands.
	if(!event.ctrlKey) return;

	switch(event.keyCode)
	{
		case 86: // V paste
		case 67: // C copy
		case 88: // X cut
		case 37: // left
		case 38: // up
		case 39: // right
		case 40: // down
		case 36: // home
		case 35: // end
		case 45: // insert
		case 46: // del
		case 90: // Ctrl+z
		case 89: // Ctrl+y
			return;
	}

	CNUtil.cancelEvent();
}
proto._simpleMode__onpaste = function() 
{
	var text = window.clipboardData.getData("Text");
	
	var jsObject = CNUtil.dispatchObject();
	if(jsObject && jsObject._updateStatus ) 
	{
		if(jsObject._contentDiv.innerText.length + text.length >= jsObject._maxLength)
		{
			CNUtil.cancelEvent();
			var textLength = jsObject._maxLength - jsObject._contentDiv.innerText.length;
			if(textLength > 0) 
			{
				var range = document.selection.createRange();
				range.text = text.substr(0, textLength);
			}
		}
	}	

	jsObject._isDirty = true;		
}


proto.set_tabIndex = function(ti)
{
	this._contentDiv.tabIndex = ti;
}

proto._element_onmousedown = function()
{
	var js = CNUtil.dispatchByClass(CN_wysiwygeditor);
	if(js)
	{
		if(!js._disabled && (js._contentDiv.contentEditable == "inherit"
		|| js._contentDiv.contentEditable == "false")) js._contentDiv.contentEditable = true;
	}
}

proto._contentDiv_onfocus = function()
{
	var js = CNUtil.dispatchByClass(CN_wysiwygeditor);
	if(js)
	{
		if(!js._disabled && (js._contentDiv.contentEditable == "inherit"
		|| js._contentDiv.contentEditable == "false")) js._contentDiv.contentEditable = true;
	}
}

proto.cmdGlossary = function()
{
	this._storeCurrentRange();

	this._event = "richtextglossaryclick";
	this.formManager.postData(this.element);
}

proto._buildToolbar = function()
{
	this._toolbar = CNUtil.createToolbar(this.element.rows(0).cells(0));

	this._addEditorButton(this._toolbar, "cut", null, "Cut", CNFormManager.neutralIconsPath + "cut.gif");
	this._addEditorButton(this._toolbar, "copy", null, "Copy", CNFormManager.neutralIconsPath + "copy.gif");
	this._addEditorButton(this._toolbar, "Paste", null, "Paste", CNFormManager.neutralIconsPath + "paste.gif");
	this._addEditorButton(this._toolbar, "delete", null, "Delete", CNFormManager.neutralIconsPath + "delete.gif");
	CNUtil.addSeparator(this._toolbar);	
	
	this._addEditorButton(this._toolbar, "bold", null, "Bold", CNFormManager.neutralIconsPath + "bold.gif", true);
	this._addEditorButton(this._toolbar, "italic", null, "Italic", CNFormManager.neutralIconsPath + "italic.gif", true);
	this._addEditorButton(this._toolbar, "underline", null, "Underline", CNFormManager.neutralIconsPath + "under.gif", true);
	
	this._addEditorButton(this._toolbar, "Strikethrough", null, "Strikethrough", CNFormManager.neutralIconsPath + "strike-2.gif", true);
	this._addEditorButton(this._toolbar, "Superscript", null, "Superscript", CNFormManager.neutralIconsPath + "superscript.gif", true);
	this._addEditorButton(this._toolbar, "Subscript", null, "Subscript", CNFormManager.neutralIconsPath + "subscript.gif", true);

	CNUtil.addSeparator(this._toolbar);
		
	this._addEditorButton(this._toolbar, "InsertOrderedList", null, "Ordered List", CNFormManager.neutralIconsPath + "numlist.gif", true);
	this._addEditorButton(this._toolbar, "InsertUnorderedList", null, "Unordered List", CNFormManager.neutralIconsPath + "bullist.gif", true);
	this._addEditorButton(this._toolbar, "InsertHorizontalRule", null, "Insert Horizontal Rule", CNFormManager.neutralIconsPath + "hr.gif", true);

	CNUtil.addSeparator(this._toolbar);
	
	this._addEditorButton(this._toolbar, "Tab", null, "Tab", CNFormManager.neutralIconsPath + "tab.gif", true);
	this._addEditorButton(this._toolbar, "Indent", null, "Indent", CNFormManager.neutralIconsPath + "indent.gif", true);
	this._addEditorButton(this._toolbar, "Outdent", null, "Outdent", CNFormManager.neutralIconsPath + "outdent.gif", true);

	CNUtil.addSeparator(this._toolbar);

	this._addEditorButton(this._toolbar, "JustifyLeft", null, "Align To Left", CNFormManager.neutralIconsPath + "left.gif", true);
	this._addEditorButton(this._toolbar, "JustifyRight", null, "Align To Right", CNFormManager.neutralIconsPath + "right.gif", true);
	this._addEditorButton(this._toolbar, "JustifyCenter", null, "Center", CNFormManager.neutralIconsPath + "center.gif", true);
	this._addEditorButton(this._toolbar, "JustifyFull", null, "Justify", CNFormManager.neutralIconsPath + "justify.gif", true);

	CNUtil.addSeparator(this._toolbar);

	CNUtil.addButton(this._toolbar, "cmdSpellCheck", null, "Check Spell", CNFormManager.neutralIconsPath + "spellcheck.gif");

	this._glossaryButton = CNUtil.addButton(this._toolbar, "cmdGlossary", null, "Glossary", CNFormManager.neutralIconsPath + "dict.gif");
	this._glossaryButton.style.display = "none";
	
	var l = CNUtil.addSeparator(this._toolbar);
	var offX = l.offsetLeft + l.offsetWidth + 4;	

	var combobox = new CN_combobox();
	this._jsObjects.push(combobox);
	combobox.doNotFocus = true;
	var l = combobox.createElement(
	[
		{text: "Tahoma", value: "Tahoma", style: 'font-family: tahoma; font-size: 12px; '},
		{text: "Arial", value: "Arial", style: 'font-family: Arial;  font-size: 12px; '},
		{text: "Courier New", value: "Courier New", style: 'font-family: Courier New;  font-size: 12px; '},
		{text: "Times New Roman", value: "Times New Roman", style: 'font-family: Times New Roman;  font-size: 12px; '},
		{text: "Verdana", value: "Verdana", style: 'font-family: Verdana;  font-size: 12px; '},
		{text: "Book Antiqua", value: "Book Antiqua", style: 'font-family: Book Antiqua;  font-size: 12px; '},
		{text: "Garamond", value: "Garamond", style: 'font-family: Garamond;  font-size: 12px; '},
		{text: "Lucida Sans Unicode", value: "Lucida Sans Unicode", style: 'font-family: Lucida Sans Unicode;  font-size: 12px; '},
		{text: "Lucida Grande", value: "Lucida Grande", style: 'font-family: Lucida Grande;  font-size: 12px; '},
		{text: "Comic Sans MS", value: "Comic Sans MS", style: 'font-family: Comic Sans MS;  font-size: 12px; '}
	], this._toolbar);
	l.style.left = offX + "px"; // Vista.
	combobox.onchange = this._toolbar_combobox_onchange;
	combobox.cmd = "FontName";
	this._xlcc.addSelect("FontName", combobox);

	var combobox = new CN_combobox();
	this._jsObjects.push(combobox);
	combobox.doNotFocus = true;
	var l = combobox.createElement(
	[
		{text: "1pt", value: "1", style: 'font-size: 12px; '},
		{text: "2pt", value: "2", style: 'font-size: 14px; '},
		{text: "3pt", value: "3", style: 'font-size: 16px; '},
		{text: "4pt", value: "4", style: 'font-size: 20px; '},
		{text: "5pt", value: "5", style: 'font-size: 24px; '},
		{text: "6pt", value: "6", style: 'font-size: 32px; '},
		{text: "7pt", value: "7", style: 'font-size: 42px; '}
	], this._toolbar);
	l.style.marginLeft = "2px";
	l.style.left = offX + 102 + "px"; // Vista.
	combobox.onchange = this._toolbar_combobox_onchange;
	combobox.cmd = "FontSize";
	this._xlcc.addSelect("FontSize", combobox);

	var combobox = new CN_combobox();
	combobox.doNotFocus = true;
	this._jsObjects.push(combobox);	
	var l = combobox.createElement(
	[
		{html: '<span unselectable=on style="height: 13px; width: 13px; background: black; "></span>&nbsp;Black', text: 'Black', value: "#000000"},
		{html: '<span unselectable=on style="height: 13px; width: 13px; background: red; "></span>&nbsp;Red', text: 'Red', value: "#ff0000"},
		{html: '<span unselectable=on style="height: 13px; width: 13px; background: #880000; "></span>&nbsp;Dark Red', text: 'Dark Red', value: "#880000"},
		{html: '<span unselectable=on style="height: 13px; width: 13px; background: green; "></span>&nbsp;Green', text: 'Green', value: "#00ff00"},
		{html: '<span unselectable=on style="height: 13px; width: 13px; background: #005500; "></span>&nbsp;Dark Green', text: 'Dark Green', value: "#008800"},
		{html: '<span unselectable=on style="height: 13px; width: 13px; background: blue; "></span>&nbsp;Blue', text: 'Blue', value: "#0000ff"},
		{html: '<span unselectable=on style="height: 13px; width: 13px; background: #000088; "></span>&nbsp;Dark Blue', text: 'Dark Blue', value: "#000088"},
		{html: '<span unselectable=on style="height: 13px; width: 13px; background: yellow; "></span>&nbsp;Yellow', text: 'Yellow', value: "#ffff00"},
		{html: '<span unselectable=on style="height: 13px; width: 13px; background: #777777; "></span>&nbsp;Grey', text: 'Grey', value: "#777777"},
		{html: '<span unselectable=on style="height: 13px; width: 13px; background: #dddddd; "></span>&nbsp;Light Grey', text: 'Light Grey', value: "#dddddd"}
	], this._toolbar);
	l.style.marginLeft = "2px";
	l.style.left = offX + 206 + "px"; // Vista.
	combobox.onchange = this._toolbar_combobox_onchange;
	combobox.cmd = "ForeColor";
	this._xlcc.addSelect("ForeColor", combobox);
}

proto._getSelectionRange = function()
{
	var selectionRange = document.selection.createRange();
	var el = selectionRange.parentElement();
	if(el != this._contentDiv && !this._contentDiv.contains(el)) return null;
	return selectionRange;
}

proto._addEditorButton = function(parentElement, cmd, param, caption, imgSrc, isPushable)
{
	var b = CNUtil.addButton(parentElement, "cmdEditorCommand", cmd, caption, imgSrc, isPushable);
	b._param2 = param;

	b.set_disabled = this._button_set_disabled;
	b.set_pushed = this._button_set_pushed;
	this._xlcc.addButton(cmd, b);
	
	return b;
}

proto._pushButton = function(b)
{
	if(!b.isPushable) alert("ASSERT: !b.isPushable");

	var groupButton = this._groupButtons[b._group];
	if(groupButton) CNUtil.setButtonState(groupButton, "normal")
	this._groupButtons[b._group] = b;

	if(b.state == "pushed") CNUtil.setButtonState(b, "normal");
	else CNUtil.setButtonState(b, "pushed");
}

proto._button_set_disabled = function(val)
{
	CNUtil.setButtonState(this, val ? "disabled" : "normal");
}

proto._button_set_pushed = function(val)
{
	CNUtil.setButtonState(this, val ? "pushed" : "normal");
}

proto.cmdEditorCommand = function(param, b)
{
	if(this._disabled) return false;

	var cmd = param;
	if(!cmd) 
	{
		alert("ASSERT: !cmd");
		return;
	}

	if(this._currentTool == this.LineTool)
	{
		if(cmd == "delete")
		{
			if(this._selectedShape) this._deleteShape(this._selectedShape);
			return;
		}
	}

	var selectionRange = this._getSelectionRange();
	if(!selectionRange) return;
	
	var param2 = b._param2;
	if(!param2) param2 = null;
	
	if (cmd == "Tab")
	{
		CNFormManager._trace("TAB button press");
		range = document.selection.createRange();
		range.pasteHTML("<span style='margin-left: 3em; display:inline-block'>&nbsp;</span>");   
	}
	else
		document.execCommand(cmd, true, param2);

	this._updateStatus();
	this._isDirty = true;
}

proto._doGetCaretPosition = function(oField) 
{

     // Initialize
     var iCaretPos = 0;

     // IE Support
     if (document.selection) { 

       // Set focus on the element
       oField.focus ();
  
       // To get cursor position, get empty selection range
       var oSel = document.selection.createRange ();
  
       // Move selection start to 0 position
       oSel.moveStart ('character', -oField.innerText.length);
  
       // The caret position is selection length
       iCaretPos = oSel.text.length;
     }

     // Firefox support
     else if (oField.selectionStart || oField.selectionStart == '0')
       iCaretPos = oField.selectionStart;

     // Return results
     return (iCaretPos);
   }

proto._onpaste = function()
{	
	var jsObject = CNUtil.dispatchObject();
	if(jsObject && jsObject._updateStatus ) 
	{
		if(jsObject._maxLength > 0)
		{
			var pasteText = window.clipboardData.getData("Text");
			var pasteTextLength = pasteText.length;
			
			var currentText	= jsObject._contentDiv.innerText;	
			var currentTextLength = jsObject._contentDiv.innerText.replace(/(?:\n|\r\n|\n\n|\r)/ig,"").length;
			
			if (currentTextLength + pasteTextLength >= jsObject._maxLength)	
			{
				CNUtil.cancelEvent();
				var textLength = jsObject._maxLength - currentTextLength;
				if(textLength > 0) 
				{
					var range = document.selection.createRange();
					if(range) 
					{		
						range.pasteHTML(pasteText.substr(0, textLength));	
					}
				}
			}	
		
			jsObject._isDirty = true;
		}		
	}
}




proto._updateStatus = function()
{
	if(this._currentTool != this.TextTool) return;

	// Do it only for insertion point moving.
	if(event)
	{
		if(event.type == "keyup" || event.type == "keydown")
		{
			var key = event.keyCode;
			if(event.repeat || !event.ctrlKey && (key < 37 || key > 40)) return;
			event.cancelBubble = true;
		}
	}
	if(!this._selectionRange) this._selectionRange = document.selection.createRange();
	this._updating = true;
	this._xlcc.controllerUpdate(this);
	this._updating = false;
}

// NOTE: Called by xlcc.
proto.queryCommandId = function(cmdid, twostate)
{
	if(this._disabled) return {state: false, value: ''};
	var value;
	var state;
	try
	{
		state = this._selectionRange.queryCommandEnabled(cmdid);
		if(twostate) value = document.queryCommandValue(cmdid);
			
		if(cmdid == "ForeColor") 
		{
			// in -> GGBBRR
			var inval = value
			value = value * 1;
			var rr = Number(value & 0x0000FF).toString(16);
			if(rr.length == 1) rr = "0" + rr;
	
			var gg = Number((value >> 8) & 0x0000FF).toString(16);
			if(gg.length == 1) gg = "0" + gg;
	
			var bb = Number((value >> 16) & 0x0000FF ).toString(16);
			if(bb.length == 1) bb = "0" + bb;
	
			value = "#" + rr + gg + bb;
			state = true;
		}
		if(cmdid == "FontName") 
		{
			value = this._fontName;
			state = true;
		}
		if(cmdid == "FontSize") 
		{
			value = this._fontSize;
			state = true;
		}
	}
	catch(e)
	{
		state = false;
		value = '';
	}
	return {state: state, value: value};
}


proto._toolbar_combobox_onchange = function(ev)
{
	CNUtil.findJSObject(ev.sender.element.parentElement).toolbar_combobox_onchange(ev);
}

proto.toolbar_combobox_onchange = function(ev)
{
	if(this._updating || this._disabled) return;
	
	var cmd = ev.sender.cmd;
	if(!cmd) return;
	
	var param = ev.sender.getValue();

	if(cmd == "ForeColor")
		this._currentForeColor = param;
	if(cmd == "FontName")
		this._fontName = param;
	if(cmd == "FontSize")
		this._fontSize = param;

	var selectionRange = this._getSelectionRange();
	if(!selectionRange) return;

	document.execCommand(cmd, true, param);
}


proto.cmdChangeTool = function(tool)
{
	if(this._disabled) return false;

	if(this._currentTool && this._currentTool.handle_toolunselected)
	{
		this.calcElementOffset();
		this._currentTool.handle_toolunselected();
	}

	this._currentTool = tool;
	if(this._currentTool.handle_toolselected) 
	{
		this.calcElementOffset();
		this._currentTool.handle_toolselected();
	}
}

proto.calcElementOffset = function()
{
	this.offX = 0;
	this.offY = 0;
	var l = this.element;
	while(l != null)
	{
		this.offX += l.offsetLeft;
		this.offY += l.offsetTop;
		l = l.offsetParent;
	}
}

proto._TextTool =
{
	handle_toolselected: function()
	{
		//this.jsObject._contentDiv.contentEditable = true;
	},

	handle_toolunselected: function()
	{
		//this.jsObject._contentDiv.contentEditable = false;
	}
}

proto._LineTool = 
{
	_currentLine: null,
	handle_toolselected: function()
	{
		this.jsObject._scrollDiv.runtimeStyle.cursor = "crosshair";
	},
	handle_toolunselected: function()
	{
		this.jsObject._scrollDiv.runtimeStyle.cursor = "";
	},

	handle_mousedown: function()
	{
		this._currentLine = document.createElement("v:line");
		this._currentLine.style.position = "absolute";
		this._currentLine.left = 0;
		this._currentLine.top = 0;
		
		var stroke = document.createElement("v:stroke");
		stroke.weight = this.jsObject._currentWeight;
		stroke.endcap = "round";
		stroke.color = this.jsObject._currentForeColor;
		this._currentLine.appendChild(stroke);

		var x = event.clientX - this.jsObject.offX + 3 + this.jsObject._scrollDiv.scrollLeft;
		var y = event.clientY - this.jsObject.offY + 1 + this.jsObject._scrollDiv.scrollTop;
		
		this._currentLine.from = x + "," + y;
		this._currentLine.to = x + "," + y;
		this.jsObject._vmlDiv.appendChild(this._currentLine);
	},
	handle_mousemove: function()
	{
		var x = event.clientX - this.jsObject.offX + 3 + this.jsObject._scrollDiv.scrollLeft;
		var y = event.clientY - this.jsObject.offY + 1 + this.jsObject._scrollDiv.scrollTop;
		this._currentLine.to = x + "," + y;
		CNUtil.cancelEvent();
	},
	handle_mouseup: function()
	{
		this.jsObject._attachVMLShapeEvents(this._currentLine);
		this._currentLine.style.cursor = "default";
	}
}

proto._attachVMLShapeEvents = function(l)
{
	l.attachEvent("onmouseenter", this._vmlShape_onmouseenter);
	l.attachEvent("onmouseleave", this._vmlShape_onmouseleave);
	l.attachEvent("onmousedown", this._vmlShape_onmousedown);
}

proto._hoverShape = function(l, opacity)
{
	if(l.tagName != "image") 
	{
		if(!l.style._strokeWeight)
		{
			l.style._strokeWeight = l.strokeWeight;
			l.strokeWeight = parseFloat(l.strokeWeight) + 1;
		}
	}
	l.runtimeStyle.filter = "alpha(opacity=" + opacity + ")";
}

proto._unhoverShape = function(l)
{
	if(l.tagName != "image" && l.style._strokeWeight) 
	{
		l.strokeWeight = parseFloat(l.strokeWeight) - 1;
		l.style._strokeWeight = null;
	}
	l.runtimeStyle.filter = "";
}

proto._selectShape = function(l)
{
	this._unselectShape();
	this._selectedShape = l;
	this._hoverShape(this._selectedShape, 70);
}

proto._unselectShape = function()
{
	if(!this._selectedShape) return;
	this._unhoverShape(this._selectedShape);
	this._selectedShape = null;
}

proto._deleteShape = function(l)
{
	if(l == this._selectedShape) this._unselectShape();
	l.removeNode(true);
}


// Event handlers. =======================
proto._scrollDiv_onmousedown = function()
{
	CNUtil.findJSObject(event.srcElement).scrollDiv_onmousedown();
}
proto.scrollDiv_onmousedown = function()
{
	if(this._scrollDiv.componentFromPoint(event.clientX, event.clientY) != "") return;
	
	var l = this._scrollDiv;
	this.offX = -this._pointerXOff;
	this.offY = -this._pointerYOff;
	while(l != null)
	{
		this.offX += l.offsetLeft;
		this.offY += l.offsetTop;
		l = l.offsetParent;
	}

	if(!this._currentTool.ownMouseHandling)
	{
		if(this._currentTool.handle_mousedown && this._currentTool.handle_mousedown() !== false)
		{
			this._scrollDiv.attachEvent("onmousemove", this._contentDiv_onmousemove);
			this._scrollDiv.attachEvent("onmouseup", this._contentDiv_onmouseup);	
			this._scrollDiv.attachEvent("onmouseleave", this._contentDiv_onmouseup);
		}
	}
}

proto._contentDiv_onmousemove = function()
{
	CNUtil.findJSObject(event.srcElement)._currentTool.handle_mousemove();
}

proto._contentDiv_onmouseup = function()
{
	CNUtil.findJSObject(event.srcElement).contentDiv_onmouseup();
}
proto.contentDiv_onmouseup = function()
{
	this._scrollDiv.detachEvent("onmousemove", this._contentDiv_onmousemove);
	this._scrollDiv.detachEvent("onmouseup", this._contentDiv_onmouseup);	
	this._scrollDiv.detachEvent("onmouseleave", this._contentDiv_onmouseup);
	this._currentTool.handle_mouseup();	
}


proto._vmlShape_onmouseenter = function()
{
	CNUtil.dispatchObject().vmlShape_onmouseenter();
}
proto.vmlShape_onmouseenter = function()
{
	this._hoverShape(event.srcElement, 50);
} 

proto._vmlShape_onmouseleave = function()
{
	CNUtil.dispatchObject().vmlShape_onmouseleave();
}
proto.vmlShape_onmouseleave = function()
{
	if(event.srcElement == this._selectedShape) return;
	this._unhoverShape(event.srcElement);
}

proto._vmlShape_onmousedown = function()
{
	CNUtil.dispatchObject().vmlShape_onmousedown();
}
proto.vmlShape_onmousedown = function()
{
	this._selectShape(event.srcElement);
}

proto._vmlDiv_onkeyup = function()
{
	CNUtil.dispatchObject().vmlDiv_onkeyup();
}
proto.vmlDiv_onkeyup = function()
{
	if(event.keyCode == 46)
	{
		if(this._selectedShape) this._deleteShape(this._selectedShape);
	}
}

proto.__updateStatus = function()
{
	var jsObject = CNUtil.dispatchObject();
	if(jsObject && jsObject._updateStatus) 
	{
		jsObject._updateStatus();
		jsObject._isDirty = true;
	}
}

proto._contentDiv_onkeyup = function()
{
	CNUtil.dispatchObject().contentDiv_onkeyup();
}
proto.contentDiv_onkeyup = function()
{
	if(this._disabled) return;
	
	document.execCommand("FontName", 0, this._fontName);
	document.execCommand("FontSize", 0, this._fontSize);
		
	if (this._maxLength > 0 && this._contentDiv.innerText.replace(/(?:\n|\r\n|\n\n|\r)/ig,"").length >= this._maxLength)
	{
		var selectionRange = document.selection.createRange();
		if (selectionRange.text.length == 0 && event.keyCode != 13)		
		{
			CNUtil.cancelEvent();
			return;
		}
	}	
	
	var range = this._getSelectionRange();
	
	if(range)
	{
		if(event.keyCode > 40)
		{
			// Check if we're inside spellError.
			var pe = range.parentElement();
			status = pe.className
			if(pe && pe.className == "spellError")
			{
				this._removeSpellErrorSpan(pe, range);
			}
		}
	}
	
	if(CN_wysiwygeditor._autocompleteUIShown) return;
	
	
	
	if(event.keyCode == 13)	CNUtil.cancelBubble();

	if(event.keyCode != 9 && event.keyCode != 16 && event.keyCode != 36 && (event.keyCode == 32 || event.keyCode == 13
	|| event.keyCode < 0x41))
	{
		var oldLineRange = range.duplicate();
		oldLineRange.moveStart("word", -4);
		var text = oldLineRange.text;
	
		var to = Math.min(CN_wysiwygeditor._autoCorrectMaxLength, text.length);
		for(var i = 0; i < to; i++)
		{
			var substr = text.substring(text.length - i - 1, text.length);
			substr = substr.toLowerCase();
			var correctEntry = CN_wysiwygeditor._autoCorrectCache[substr];
			if(correctEntry)
			{
				var doChange = true;
				// Should check for non-alfa char before range.
				// Skip this for non-alfa replacements (like (c)).
				if(/^\w+$/.test(substr) && i < text.length - 1) 
				{
					// We can check through text.
					var pre = text.charAt(text.length - i - 2);
					if(/\w/.test(pre)) doChange = false;
				}
				// Else - ok, as it's out of sentence range.
				
				if(doChange)
				{
					var correctRange = range.duplicate();
					correctRange.moveStart("character", -(i + 1));
					
					if(correctEntry.autoCorrect || correctEntry.values.length == 1) 
					{
						correctRange.text = correctEntry.values[0];
					}
					else
					{
						// Autocomplete, # of values > 1.
						CN_wysiwygeditor._showAutocompleteUI(this, correctEntry, correctRange, range);
					}
					break;
				}
			}
		}
		
		// Auto-capitalize.
		var prevWordRange = range.duplicate();
		prevWordRange.moveStart("word", -2);
		prevWordRange.moveEnd("word", -1);
		
		var text = prevWordRange.text;
		if(text.length == 0 || /[\.!?]/.test(text.charAt(0)))
		{
			var wordRange = range.duplicate();
			wordRange.moveStart("word", -1);
			var word = wordRange.text;
			if(word.length > 0) wordRange.text = word.charAt(0).toUpperCase() + word.substr(1);
		}
	}	

	if(event.type == "keyup") this._updateStatus();
}


proto.set_disabled = function(disabled)
{
	this._disabled = disabled;
	this._contentDiv.runtimeStyle.filter = disabled ? "alpha(opacity=50)" : "";
	if(!CN_wysiwygeditor._simpleMode) {
	    this._toolbar._disabled = disabled;
    }
}

proto._onbeforedeactivate = function()
{
	var jso = CNUtil.findJSObject(event.srcElement);
	jso._storeCurrentRange();		
	jso._contentDiv.contentEditable = false;
}

proto._storeCurrentRange = function()
{
	var range = document.selection.createRange();
	
	var parent = range.parentElement();
	if(parent && (parent == this._contentDiv || this._contentDiv.contains(parent)))
	{
		this._storedRange = range;
	}
}

proto._paste = function(html)
{
	var range = null;
	if(this._storedRange)
	{
		range = this._storedRange;
	}
	else
	{
		range = document.selection.createRange();
	}
	if(range) 
	{		
		var parent = range.parentElement();
		if(!parent || parent != this._contentDiv && !this._contentDiv.contains(parent))
		{
			range.moveToElementText(this._contentDiv);
			range.collapse(false);
		}

		range.pasteHTML(html);	
		this._isDirty = true;
	}
}


// XL Command Controller
//	v. 0.3
//	+ theme support.
// 22-03-2004: changed prop. access to set_* calls.
function CEditorController()
{
	// Array [cmdids][]
	this.buttons = []
	this.selects = []

	// Array[]
	this.controllers = []
	
	this.activeController = null
}

wp = CEditorController.prototype
wp.fire = function(ev)
{
	if(!this.activeController) return
	this.activeController.executeCommand(ev.cmdid, ev.param)
}

wp.addSelect = function(cmdid, el)
{
	if(!this.selects[cmdid]) this.selects[cmdid] = []
	this.selects[cmdid][this.selects[cmdid].length] = el
}

wp.addButton = function(cmdid, el)
{
	if(!this.buttons[cmdid]) this.buttons[cmdid] = []
	this.buttons[cmdid][this.buttons[cmdid].length] = el
}

wp.addController = function(el)
{
	this.controllers[this.controllers.length] = el
}

wp.setActiveController = function(contr)
{
	this.activeController = contr
}

wp.controllerUpdate = function(contr)
{
	for(var cmdid in this.buttons)
	{
		var ar = this.buttons[cmdid]
		
		// 1. Check command status
		var state = contr.queryCommandId(cmdid, ar[0].isPushable == true)

		if(state)
		{
			var disable = state.state == false
			// 2. Set command status
			for(var i = 0; i < ar.length; i++)
			{
				ar[i].set_disabled(disable);
				if(ar[i].isPushable)
				{
					ar[i].set_pushed(state.value);
				}
			}
		}
	}
	for(var cmdid in this.selects)
	{
		var ar = this.selects[cmdid]
		// 1. Check command status
		var state = contr.queryCommandId(cmdid, true)

		if(state)
		{
			var disable = state.state == false
			// 2. Set command status
			for(var i = 0; i < ar.length; i++)
			{
				ar[i].set_disabled(disable);
				if(state.value) ar[i].set_value(state.value);
			}
		}
	}
}

wp = null;
