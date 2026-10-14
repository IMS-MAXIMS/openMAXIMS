/*
	v. 0.1 - initial release.
*/
function CN_search() {
}
var proto = CN_search.prototype;

proto.createElement = function(node, parentElement) {
	var l = document.createElement("div");
	l.className = "cn_search";
	parentElement.appendChild(l);
	l.jsObject = this;
	this.element = l;

	var box = this._box = document.createElement("input");
	box.type = "text";
	box.tabIndex = -1;
	l.appendChild(box);

	Event.add(box, "focus", this, this._box_focus);
	Event.add(box, "blur", this, this._box_blur);
	Event.add(box, "keydown", this, this._box_keydown);
	Event.add(box, "mousedown", this, this._box_mousedown);

	this._standBy();

	return l;
}

proto.loadData = function(node) {
	if(this._box == document.activeElement) {
		var list = node.selectSingleNode("list");
		var items = node.selectNodes("list/i");
		this._loadListItems(items);
	}
}

proto.storeData = function(xmldoc) {
	return null;
}

proto.set_disabled = function(disabled) {
	this._disabled = disabled;
	this._box.readOnly = disabled;
	if(disabled) {
		this._standBy();
		Util.addClass(this.element, "disabled");
	}
	else {
		Util.removeClass(this.element, "disabled");
	}
}

proto._standBy = function() {
	this._hidePopup();
	if(this._keyTimeout) clearTimeout(this._keyTimeout);
	this._box.value = "Type to search";
	this._box.className = "";
}
proto._focused = function() {
	this._box.value = "";
	this._box.className = "focused";
}

proto._box_mousedown = function(ev) {
	if(this._disabled) {
		Util.cancelEvent(ev);
	}
}

proto._box_focus = function(ev) {
	if(this._disabled) {
		Util.cancelEvent(ev);
		return;
	}
	if(this._box.className == "") {
		this._focused();
	} else if(this._box.value != "") {
		this._lightPostData();
	}
	//} else if(this.popup && this.popup.children.length > 0) {
	//	this._showPopup();
	//}
}

proto._box_blur = function(ev) {
	if(this._box.value == "") {
		this._standBy();
	}
}

proto._box_keydown = function(ev) {
	if(this._keyTimeout) clearTimeout(this._keyTimeout);
	if(ev.keyCode == 13) {
		this._submit();
	} else if(ev.keyCode != 40 && ev.keyCode != 38) {
		var obj = this;
		if(this._box.value != this._lastValue) {
			this._lastValue = this._box.value;
			this._hidePopup();
			this._keyTimeout = setTimeout(function(){ obj._lightPostData; }, 500);
		}
	}
}
proto._lightPostData = function(ev) {
	var val = Util.trim(this._box.value);
	if(val != "") {
		this.formManager.lightPostData("<search id='" + this.elementID + "' liveText='" + Util.escapeAttr(val) + "'/>");
	}

}

proto._submit = function() {
	var val = Util.trim(this._box.value);
	if(val != "" || this._activeOption) {
		var attr = "";
		if(this._activeOption && this._activeOption._id) attr = " iID='" + Util.escapeAttr(this._activeOption._id) + "'"

		this.formManager.postData("<search id='" + Util.escapeAttr(this.elementID) + "' text='" + Util.escapeAttr(val) + "'" + attr + "/>");
	}
	this._hidePopup();	
}

proto._loadListItems = function(items) {
	if(this.popup) {
		this.popup.innerHTML = "";
		this._hidePopup();
	}
	if(items.length == 0) {
		// Hide popup.

	} else {
		// Update popup.

		if(!this.popup) this._createPopup();

		var xy = Util.findAbsolutePos(this._box);
		var maxHeight = Math.max(200, document.body.clientHeight - xy.y) - 8; // 4 paddings+shadow;
		var maxItems = Math.floor(maxHeight / 48);

		var length = items.length;
		for(var i = 0; i < length && i < maxItems; i++) {
			var itemNode = items[i];
			this._createOption(itemNode.getAttribute("id"), itemNode.getAttribute("title"), itemNode.text, itemNode.getAttribute("img"));
		}

		// Show/resize popup.
		this._showPopup();
	}
}

proto._showPopup = function() {
	this.popup.style.visibility = "hidden";
	this.popup.style.display = "block";

	var xy = Util.findAbsolutePos(this._box);

	this.popup.style.width = "";

	var w = Math.max(this._box.offsetWidth, this.popup.offsetWidth);
	CNUtil.posPopup(this.popup, xy.x + this._box.offsetWidth - w, xy.y + this._box.offsetHeight);
	this.popup.style.width = w + "px";
	
	this.popup.style.zIndex = top.__ontopZ++;

	this.popup.style.visibility = "visible";
	if(this.popup.shadow) this.popup.shadow.show();

	this._selectedOptionIx = -1;
	
	Event.add(this._box, "keydown", this, this._popupVisible_box_keydown);
	Event.add(document.body, "mousedown", this, this._popupVisible_document_mousedown);
}
proto._popupVisible_box_keydown = function(ev) {
	if(ev.keyCode == 38) { // Up
		if(this._selectedOptionIx == -1) this._selectedOptionIx = this.popup.childNodes.length - 1;
		else if(--this._selectedOptionIx < 0) {
			this._selectedOptionIx = -1;
			this._unhoverOption();
			//this._box.value = this._lastValue;
			return;
		}
		this._hoverOptionByKey();
	} else if(ev.keyCode == 40) { // Down
		if(this._selectedOptionIx == -1) this._selectedOptionIx = 0;
		else if(++this._selectedOptionIx >= this.popup.childNodes.length) {
			this._selectedOptionIx = -1;
			this._unhoverOption();
			//this._box.value = this._lastValue;
			return;
		}
		this._hoverOptionByKey();
	} else if(ev.keyCode == 27) { // Esc
		this._hidePopup();
		Util.cancelEvent(ev);
	}
}
proto._hoverOptionByKey = function() {
	var option = this.popup.childNodes[this._selectedOptionIx];
	this._hoverOption(option);
	//this._box.value = option.children[1].innerText;
}

proto._popupVisible_document_mousedown = function(ev) {
	if(!this.popup.contains(ev.srcElement)) this._hidePopup();
}
proto._hidePopup = function() {
	if(!this.popup) return;
	if(this.popup.shadow) this.popup.shadow.hide();
	this.popup.style.display = "none";
	this._unhoverOption();
	Event.del(this._box, "keydown", this, this._popupVisible_box_keydown);
	Event.del(document.body, "mousedown", this, this._popupVisible_document_mousedown);
}

proto._createPopup = function() {
	var popup = this.popup = document.createElement("div");
	popup.unselectable = true;
	popup.className = "cn_comboboxPopup cn_search_popup";
	document.body.appendChild(this.popup);

	new Shadow(this.popup, false, true);	

	Event.add(popup, "mouseover", this, this._popup_mouseover);
	Event.add(popup, "mouseout", this, this._popup_mouseout);
	Event.add(popup, "mousedown", this, this._popup_click);
}

proto._createOption = function(id, title, text, imgUrl) {
	var option = document.createElement("<div class='xlcombooption'>");
	option.unselectable = true;
	if(id) option._id = String(id);

	var imgDiv = document.createElement("div");
	imgDiv.unselectable = true;
	imgDiv.className = "imgDiv";
	option.appendChild(imgDiv);

	var titleDiv = document.createElement("div");
	titleDiv.className = "titleDiv";
	titleDiv.unselectable = true;
	option.appendChild(titleDiv);

	var descriptionDiv = document.createElement("div");
	descriptionDiv.className = "descriptionDiv";
	descriptionDiv.unselectable = true;
	option.appendChild(descriptionDiv);

	if(!title) {
		titleDiv.innerHTML = String(text);
	} else {
		titleDiv.innerHTML = String(title);
		descriptionDiv.innerHTML = String(text);
	}

	if(imgUrl) {
		var img = document.createElement("<img class='img'>");
		img.src = String(imgUrl);
		img.unselectable = true;
		imgDiv.appendChild(img);
	} //else {
	//	imgDiv.style.display = "none";
	//}

	this.popup.appendChild(option);
	return option;
}
proto._hoverOption = function(option) {
	this._unhoverOption();
	this._activeOption = option;
	Util.addClass(this._activeOption, "hover");
}

proto._unhoverOption = function() {
	if(!this._activeOption) return;
	Util.removeClass(this._activeOption, "hover");
	this._activeOption = null;
}

proto._popup_mouseover = function(ev) {
	if(ev.srcElement.className == "xlcombooption") {
		this._hoverOption(ev.srcElement);
	}
}
proto._popup_mouseout = function(ev) {
	if(ev.srcElement.className == "xlcombooption" && !ev.srcElement.contains(ev.toElement)) {
		this._unhoverOption();
	}
}
proto._popup_click = function(ev) {
	var option = Util.findByClassName(ev.srcElement, "xlcombooption");
	if(!option) return;
	this._activeOption = option;

	Util.cancelEvent(ev);
	this._submit();
}

proto = null;
