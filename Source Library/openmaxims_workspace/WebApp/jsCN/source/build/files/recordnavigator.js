/*
	v. 2.0.2
	- #1026 fix.
*/
function CN_recordnavigator()
{
	this._isDirty = false;
	this._popup = null;
	this._activeOption = null;
	
	this._selectedIndex = 0;
	this._options = [];
}
CN_recordnavigator.current = null;

var proto = CN_recordnavigator.prototype;


proto.createElement = function(node, parentElement)
{
	var l = Util.createElementFromHTML("<table cellpadding=0 cellspacing=0 border=0>");
	parentElement.appendChild(l);

	this.element = l;
	l.jsObject = this;

	l.className = "cn_recordnavigator";

	this._buildElement();

	return l;
}


proto.loadData = function(node)
{
   	var attr = node.getAttribute("tooltip");
	if(attr) 
	{
		if(!this._centerTD.tipText) Tooltip.attach(this._centerTD, String(attr));
		else this._centerTD.tipText = String(attr);
	}

	var options = Util.xmlSelectNodes(node, "option");
	var count = options.length;

	var selectedID = null;
	var attr = node.getAttribute("selectedID");
	if(attr) 
	{	
		selectedID = String(attr);
		this._selectedIndex = 0;
	}
	
	if(count == 0 && Util.xmlSelectSingleNode(node, "nooptions") != null) 
	{
		this._clean();
		this._updateAfterSelect(false);
		return;
	}
	if(count > 0)
	{
		this._clean();	
		
		for(var i = 0; i < count; i++)
		{
			var optionNode = options[i];
			
			var id = String(optionNode.getAttribute("id"));
			var text = String(optionNode.getAttribute("text"));
			var textColor = null;
			var attr = optionNode.getAttribute("textColor");
			if(attr) textColor = String(attr);			
			
			this._options.push({id: id, text: text, textColor: textColor});
			if(id == selectedID) this._selectedIndex = i;
		}
	}	
	this._updateAfterSelect(false);
}


proto._updateAfterSelect = function(userClick)
{
	if(!this._options) return;

	if(this._options.length == 0) 
	{
		this._arrowDiv.style.visibility = "hidden";
		//this._div1.textContent = " ";
		this._div2.textContent = " ";
		this._div2.style.color = "";
		this._button1.disabled = this._button2.disabled = this._button3.disabled = this._button4.disabled = true;
		if(CNFormManager.vista)
		{
			this._setSpanButtonDisabled(this._button1, true);
			this._setSpanButtonDisabled(this._button2, true);
			this._setSpanButtonDisabled(this._button3, true);
			this._setSpanButtonDisabled(this._button4, true);
		}
		return;
	}
	this._arrowDiv.style.visibility = "visible";
	this._button1.disabled = this._button2.disabled = this._button3.disabled = this._button4.disabled = false;
	if(this._selectedIndex == 0) this._button1.disabled = this._button2.disabled = true;
	if(this._selectedIndex == this._options.length - 1) this._button3.disabled = this._button4.disabled = true;

	var option = this._options[this._selectedIndex];
	this._div2.textContent = option.text == "" ? " " : option.text;
	if(option.textColor) this._div2.style.color = option.textColor;
	else this._div2.style.color = "";
	
	//this._div1.textContent = "Record " + (this._selectedIndex + 1) + " of " + this._options.length;
	
	if(CNFormManager.vista)
	{
		this._setSpanButtonDisabled(this._button1, this._button1.disabled);
		this._setSpanButtonDisabled(this._button2, this._button2.disabled);
		this._setSpanButtonDisabled(this._button3, this._button3.disabled);
		this._setSpanButtonDisabled(this._button4, this._button4.disabled);
	}

	if(userClick) this._selectionChanged();
}

proto._clean = function()
{
	this._options = [];
	
	// Remove popup.
	
	if(this._popup) Util.removeElement(this._popup);
	this._popup = null;
}

proto.storeData = function(xmldoc)
{
	CN_recordnavigator.hideButtonHover();

	if(!this._isDirty || this._options.length == 0) return;
	this._isDirty = false;

	var node = xmldoc.createElement("recordnavigator");
	node.setAttribute("selectedID", this._options[this._selectedIndex].id)
	
	return node;
}


proto._buildElement = function()
{
	var tbody = document.createElement("tbody");
	this.element.appendChild(tbody);

	var tr = document.createElement("TR");
	tbody.appendChild(tr);
		
	var td = document.createElement("TD");
	tr.appendChild(td);

	var button1, button2, button3, button4;
	if(CNFormManager.vista)
	{
		td.style.width = "41px";
		button1 = Util.createElementFromHTML("<span class='button19'>");
		button1.style.marginRight = "1px";
		this._attachSpanButtonEvents(button1);
		button2 = Util.createElementFromHTML("<span class='button19'>");
		this._attachSpanButtonEvents(button2);
		button3 = Util.createElementFromHTML("<span class='button19'>");
		button3.style.marginLeft = "1px";
		button3.style.marginRight = "1px";
		this._attachSpanButtonEvents(button3);
		button4 = Util.createElementFromHTML("<span class='button19'>");
		this._attachSpanButtonEvents(button4);
	}
	else
	{
		td.style.width = "38px";
		button1 = document.createElement("button");
		Event.add(button1, "mouseenter", this, this._button_onmouseenter);
		Event.add(button1, "mouseleave", this, this._button_onmouseleave);
		
		button2 = document.createElement("button");
		button2.style.paddingLeft = "1px";
		Event.add(button2, "mouseenter", this, this._button_onmouseenter);
		Event.add(button2, "mouseleave", this, this._button_onmouseleave);

		button3 = document.createElement("button");
		Event.add(button3, "mouseenter", this, this._button_onmouseenter);
		Event.add(button3, "mouseleave", this, this._button_onmouseleave);

		button4 = document.createElement("button");
		Event.add(button4, "mouseenter", this, this._button_onmouseenter);
		Event.add(button4, "mouseleave", this, this._button_onmouseleave);
	}

	Event.add(button1, "click", this, this._button1_onclick);
	Event.add(button1, "dblclick", this, this._button1_onclick);
	button1.textContent = "9";
	td.appendChild(button1);
	this._button1 = button1;
	Tooltip.attach(button1, "First");
	
	Event.add(button2, "click", this, this._button2_onclick);
	Event.add(button2, "dblclick", this, this._button2_onclick);
	td.appendChild(button2);
	button2.textContent = "3";
	this._button2 = button2;
	Tooltip.attach(button2, "Previous");
	
	td = document.createElement("TD");
	tr.appendChild(td);
	td.style.width = "100%";
	td.className = "centerTD";
	td.tabIndex = -1;
	Event.add(td, "mouseenter", this, this._td_onmouseenter);
	Event.add(td, "mouseleave", this, this._td_onmouseleave);
	Event.add(td, "click", this, this._td_onclick);
	Event.add(td, "keydown", this, this._centerTD_onkeydown);	

	this._centerTD = td;

	var div2 = document.createElement("div");
	td.appendChild(div2);
	div2.className = "div2";
	this._div2 = div2;
		
	this._arrowDiv = Util.createElementFromHTML("<div class=arrowDiv>");
	td.appendChild(this._arrowDiv);
	this._arrowDiv.textContent = "6";

	td = document.createElement("TD");
	tr.appendChild(td);
	td.style.width = CNFormManager.vista ? "41px" : "38px";
	
	td.appendChild(button3);
	button3.textContent = "4";
	Event.add(button3, "click", this, this._button3_onclick);
	Event.add(button3, "dblclick", this, this._button3_onclick);
	this._button3 = button3;
	Tooltip.attach(button3, "Next");
	
	var button4;
	td.appendChild(button4);
	button4.textContent = ":";
	Event.add(button4, "click", this, this._button4_onclick);
	Event.add(button4, "dblclick", this, this._button4_onclick);
	this._button4 = button4;
	Tooltip.attach(button4, "Last");
}			  

proto._attachSpanButtonEvents = function(b)
{
	Event.add(b, "mouseenter", this, this._spanButton_onmouseenter);
	Event.add(b, "mouseleave", this, CN_recordnavigator.hideButtonHover);
	Event.add(b, "mousedown", this, this._spanButton_onmousedown);
	Event.add(b, "dblclick", this, this._spanButton_onmousedown);	
	Event.add(b, "mouseup", this, this._spanButton_onmouseenter);
}
CN_recordnavigator._activeButton = null;
proto._spanButton_onmouseenter = function()
{
	var span = CNUtil.eventTarget();
	if(span.disabled || span._disabled) return;
	CN_recordnavigator._activeButton = span;
	CN_recordnavigator._spanTrans(span, CNFormManager.themeImagesPath + "hover-button19x19.gif", true);
}
CN_recordnavigator.hideButtonHover = function()
{
	var span = CN_recordnavigator._activeButton;
	if(!span || span.disabled || span._disabled) return;
	CN_recordnavigator._spanTrans(span, CNFormManager.themeImagesPath + "button19x19.gif", false);
	CN_recordnavigator._activeButton = null;
}
proto._spanButton_onmousedown = function()
{
	var span = CNUtil.eventTarget();
	if(span.disabled || span._disabled) return;
	CN_recordnavigator._spanTrans(span, CNFormManager.themeImagesPath + "down-button19x19.gif", true);
}
CN_recordnavigator._spanTrans = function(l, toSrc, fast)
{
	l.style.backgroundImage = "url(" + toSrc + ")";
}
proto._setSpanButtonDisabled = function(b, disabled)
{
	var src = disabled ? "disabled-button19x19.gif" : "button19x19.gif";
	b.style.backgroundImage = "url(" + CNFormManager.themeImagesPath + src + ")";
}


proto._button_onmouseenter = function()
{
	var jso = CNUtil.dispatchObject();
	if(jso.element.disabled) return;

	var l = CNUtil.eventTarget();
	var color = Util.getStyle(l, "xl--hover-border-color");
	if(color) l.style.borderColor = Util.getStyle(l, "xl--hover-border-color");
} 

proto._button_onmouseleave = function()
{
	var jso = CNUtil.dispatchObject();
	if(jso.element.disabled) return;

	var l = CNUtil.eventTarget();
	l.style.borderColor = "";
} 


proto._td_onmouseenter = function()
{
	var jso = CNUtil.dispatchObject();
	if(jso.element.disabled) return;

	var l = CNUtil.eventTarget();
	l.style.background = Util.getStyle(l, "xl--option-hover-background");
}

proto._td_onmouseleave = function()
{
	var jso = CNUtil.dispatchObject();
	if(jso.element.disabled) return;

	var l = CNUtil.eventTarget();
	l.style.background = "";
}

proto._td_onclick = function()
{
	CNUtil.dispatchObject().td_onclick();
} 
proto.td_onclick = function()
{
	if(this.element.disabled) return;

	this._showPopup();
}

proto._showPopup = function()
{
	this._ensurePopupCreated();

	var xy = CNUtil.findAbsolutePos(this._centerTD);

	this._popup.style.left = xy.x + "px";
	var y = xy.y + this._centerTD.offsetHeight;
	this._popup.style.top = y + "px";
	
	this._popup.style.width = this._centerTD.offsetWidth + "px";
	
	this._popup.style.zIndex = top.__ontopZ++;
	//this._popup.style.visibility = "visible";

	if(this._popup.scrollHeight > 15 * 16) 
	{
		this._popup.style.overflowY = "auto";
		this._popup.style.height = (15 * 16 + 4) + "px";
	}
	else 
	{
		this._popup.style.height = (15 + 4) + "px";
		this._popup.style.overflowY = "visible";
	}

	var b = y + this._popup.offsetHeight;	

	if(b > document.body.clientHeight)
		this._popup.style.top = (y - b + document.body.clientHeight - 4) + "px";

	if(CNFormManager.vista)
	{
		var h = this._popup.offsetHeight;
		this._popup.style.height = "1px";
		this._popup.style.visibility = "visible";
		this._popup.shadow.show();
		
		Animator.start(new AnimResize(this._popup, this._popup.offsetWidth, h, 0));
	}
	else this._popup.style.visibility = "visible";

	if(this._selectedIndex > -1 && this._selectedIndex < this._popup.children.length)
	{
		this._hoverOption(this._popup.children[this._selectedIndex]);
	}
	
	CN_recordnavigator.current = this;
	this._popup.focus();

	Event.add(document, "mousedown", document, CN_recordnavigator._hidePopup);
	Event.add(document, "keydown", document, CN_recordnavigator._on_esc_keydown);
}

proto._ensurePopupCreated = function()
{
	if(this._popup) return;
	
	this._popup = Util.createElementFromHTML("<div class='cn_recordnavigator_popup'>");
	this._popup.tabIndex = -1;
	document.body.insertBefore(this._popup, document.body.firstChild);
	Event.add(this._popup, "mousedown", this, CNUtil.cancelEvent);
	Event.add(this._popup, "keydown", this, this._popup_onkeydown);
	
	if(CNFormManager.vista) new Shadow(this._popup, false, false);	
	
	this._createOptions();
}

proto._createOptions = function()
{
	for(var i = 0; i < this._options.length; i++)
	{
		var option = Util.createElementFromHTML("<div class='optionDiv'>")
		this._popup.appendChild(option);
		option._ix = i;
		option.textContent = this._options[i].text;
		var color = this._options[i].textColor;
		if(color) option.style.color = color;
		Event.add(option, "mouseenter", this, this._option_onmouseenter);
		Event.add(option, "mouseleave", this, this._option_onmouseleave);
		Event.add(option, "click", this, this._option_onclick);
		option.style.userSelect = "none";
	}
}

CN_recordnavigator._hidePopup = function()
{
	if(!CN_recordnavigator.current) return;
	var popup = CN_recordnavigator.current._popup;

	if(CNFormManager.vista) popup.shadow.hide();
	popup.style.visibility = "hidden";

	CN_recordnavigator.current = null;

	Event.del(document, "mousedown", document, CN_recordnavigator._hidePopup);
	Event.del(document, "keydown", document, CN_recordnavigator._on_esc_keydown);
}

CN_recordnavigator._on_esc_keydown = function()
{
	if(Event.keyValue(Event.current()) == 27) CN_recordnavigator._hidePopup();
}


proto._document_onmousedown = function()
{
	CN_recordnavigator._hidePopup();
}


proto._option_onmouseenter = function()
{
	if(!CN_recordnavigator.current._hoverOption) alert("ASSERT: !CN_recordnavigator.current._hoverOption");
	CN_recordnavigator.current._hoverOption(CNUtil.eventTarget());
}

proto._option_onmouseleave = function()
{
	if(CN_recordnavigator.current) CN_recordnavigator.current._unhoverOption();
}


proto._option_onclick = function()
{
	CN_recordnavigator.current.option_onclick();
}

proto.option_onclick = function()
{
	CN_recordnavigator._hidePopup();
	this._selectOption(this._activeOption);	
}

proto._selectOption = function(l)
{
	this._selectedIndex = l._ix;
	this._updateAfterSelect();
	this._centerTD.focus();

	this._selectionChanged();
}

proto._selectionChanged = function()
{
	this._isDirty = true;
	// Always autopostback
	this.formManager.postData(this.element);
}

proto._hoverOption = function(l)
{
	if(this._activeOption == l) return;

	this._unhoverOption();
	
	this._activeOption = l;

	var margin = (this._popup.offsetHeight - this._popup.clientHeight) / 2;
	if(l.offsetTop < this._popup.scrollTop) this._popup.scrollTop = l.offsetTop + margin;
	else if(l.offsetTop + l.offsetHeight - this._popup.scrollTop >= this._popup.clientHeight)
		this._popup.scrollTop = l.offsetTop + l.offsetHeight - this._popup.clientHeight + margin;

	l.style.background = Util.getStyle(l, "xl--option-hover-background");
	l.style.color = Util.getStyle(l, "xl--option-hover-color");
	
}

proto._unhoverOption = function()
{
	if(!this._activeOption) return;

	this._activeOption.style.background = "";
	this._activeOption.style.color = "";
	
	this._activeOption = null;

}

proto._button1_onclick = function()
{
	CNUtil.dispatchObject().button1_onclick();
} 
proto.button1_onclick = function()
{
	if(this.element.disabled) return;
	this._selectedIndex = 0;
	this._updateAfterSelect(true);
}

proto._button2_onclick = function()
{
	CNUtil.dispatchObject().button2_onclick();
} 
proto.button2_onclick = function()
{
	if(this.element.disabled) return;
	this._selectedIndex = Math.max(0, this._selectedIndex - 1);
	this._updateAfterSelect(true);
}

proto._button3_onclick = function()
{
	CNUtil.dispatchObject().button3_onclick();
} 
proto.button3_onclick = function()
{
	if(this.element.disabled) return;
	this._selectedIndex = Math.max(0, Math.min(this._options.length - 1, this._selectedIndex + 1));
	this._updateAfterSelect(true);
}

proto._button4_onclick = function()
{
	CNUtil.dispatchObject().button4_onclick();
} 
proto.button4_onclick = function()
{
	if(this.element.disabled) return;
	this._selectedIndex = Math.max(0, this._options.length - 1);
	this._updateAfterSelect(true);
}

proto._popup_onkeydown = function()
{
	CN_recordnavigator.current.popup_onkeydown();
}
proto.popup_onkeydown = function()
{
	switch(Event.keyValue(Event.current()))
	{
		case 27: 
			CN_recordnavigator._hidePopup(); 
			break;
		case 38: // Up
			if(this._activeOption)
			{
				if(this._activeOption.previousSibling) this._hoverOption(this._activeOption.previousSibling);
			}
			else if(this._popupBody.children.length > 0) 
			{
				this._hoverOption(this._popupBody.children[this._popupBody.children.length - 1]);
			}
			break;
		case 40:
			if(this._activeOption)
			{
				if(this._activeOption.nextSibling) this._hoverOption(this._activeOption.nextSibling);
			}
			else if(this._popupBody.children.length > 0) 
			{
				this._hoverOption(this._popupBody.children[0]);
			}
			break;
		case 13: 
			if(this._activeOption) 
			{
				this._selectOption(this._activeOption);
				CN_recordnavigator._hidePopup(); 
			}
			break;
	}
	if(Event.current().preventDefault) Event.current().preventDefault();
	Event.cancel(Event.current());
}

proto._centerTD_onkeydown = function()
{
	if(Event.keyValue(Event.current()) == 32 || Event.keyValue(Event.current()) == 13)
	{
		var jso = CNUtil.dispatchObject();
		if(jso.element.disabled) return;
		jso._showPopup();
	}
}


proto.set_tabIndex = function(ti)
{
	this._button1.tabIndex = this._button2.tabIndex = this._button3.tabIndex = this._button4.tabIndex = ti;
	this._centerTD.tabIndex = ti;
}
