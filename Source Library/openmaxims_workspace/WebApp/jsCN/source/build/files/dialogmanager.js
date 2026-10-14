/*
	v. 2.0.4
*/
function CNDialogManager(){}

CNDialogManager._dialog_closeButton_onmouseenter = function()
{
	var l = Util.eventTarget(Event.current());
	l.style.border = "1px solid white";
	l.style.padding = "0px";
}

CNDialogManager._dialog_closeButton_onmouseleave = function()
{
	var l = Util.eventTarget(Event.current());
	l.style.border = "0px";
	l.style.padding = "1px";
}

CNDialogManager._findDialogDiv = function(l)
{
	while(l && !l._isDialogDiv) l = l.parentNode || l.parentElement;
	return l;
}

// Blue only.
CNDialogManager._popupDiv_onmousedown = function()
{
	var l = CNDialogManager._findDialogDiv(Util.eventTarget(Event.current()));
	if(Util.getStyle(l, "zIndex") != top.__ontopZ) l.style.zIndex = top.__ontopZ++;
	Util.cancelEvent();
}

CNDialogManager._captionDiv_onmousedown = function()
{
	var l = CNDialogManager._findDialogDiv(Util.eventTarget(Event.current()));	
	if(Util.getStyle(l, "zIndex") != top.__ontopZ) l.style.zIndex = top.__ontopZ++;
	if(CNFormManager.vista && 
		!Util.eventTarget(Event.current()).className.match(/dialogContOuter|dialogCaption/)) return;
	
	if(l._maximized) return;
	
	CNDialogManager._dragged = l;
	CNDialogManager._dragStarted = false;
	CNDialogManager._dragTarget = document;
	Event.add(CNDialogManager._dragTarget, "mousemove", CNDialogManager, CNDialogManager._captionDiv_doDrag);
	Event.add(CNDialogManager._dragTarget, "mouseup", CNDialogManager, CNDialogManager._captionDiv_finishDrag);
}
CNDialogManager._captionDiv_doDrag = function()
{
	var l = CNDialogManager._dragged;
	if(!l) return;
	
	if(!CNDialogManager._dragStarted)
	{
		CNDialogManager._startLeft = l.offsetLeft;
		CNDialogManager._startTop = l.offsetTop;
		var startEvent = Event.current() || {};
		CNDialogManager._x = startEvent.screenX;
		CNDialogManager._y = startEvent.screenY;
		CNDialogManager._dragStarted = true;
	}

	var currentEvent = Event.current() || {};
	l.style.left = (CNDialogManager._startLeft + currentEvent.screenX - CNDialogManager._x) + "px";
	l.style.top = (CNDialogManager._startTop + currentEvent.screenY - CNDialogManager._y) + "px";
	
	if(l.shadow) l.shadow.syncPosition();
}

CNDialogManager._captionDiv_finishDrag = function()
{
	var l = CNDialogManager._dragged;
	if(!l) return;
	var target = CNDialogManager._dragTarget;
	Event.del(target, "mousemove", CNDialogManager, CNDialogManager._captionDiv_doDrag);
	Event.del(target, "mouseup", CNDialogManager, CNDialogManager._captionDiv_finishDrag);
	CNDialogManager._dragStarted = false;
	CNDialogManager._dragged = null;
	CNDialogManager._dragTarget = null;
}

CNDialogManager._popup_cancel = function()
{
	CNDialogManager.hidePopup(null, false);
}
CNDialogManager._popup_commit = function()
{
	CNDialogManager.hidePopup(null, true);
}

CNDialogManager._maximize_onclick = function()
{
	var dialog = CNDialogManager._findDialogDiv(Util.eventTarget(Event.current()));
	if(dialog) CNDialogManager.toggleDialogMaximize(dialog);
}

CNDialogManager.toggleDialogMaximize = function(dialog)
{
	dialog._maximized ? CNDialogManager.restoreDialog(dialog) : CNDialogManager.maximizeDialog(dialog);
}

CNDialogManager._setTopButtonImage = function(button, image)
{
	var element = button.firstChild;
	var source = CNFormManager.themeImagesPath + image;
	element.src = source;
}

CNDialogManager.maximizeDialog = function(dialog)
{
	if(dialog._maximized) return;
	dialog._maximized = true;
	dialog._storedBounds = {x: dialog.offsetLeft, y: dialog.offsetTop, w: dialog.offsetWidth, h: dialog.offsetHeight };
	dialog.className = "popupDialog popupDialogMaximized";
	dialog.style.width = "100%";
	dialog.style.height = "100%";
	dialog.style.top = 0;
	dialog.style.left = 0;
	
	var max = CNDialogManager.getMaxButton(dialog);
	max._img = "restore.png";
	CNDialogManager._setTopButtonImage(max, "restore.png");
	
	if(dialog._maxDelegate) dialog._maxDelegate[0][dialog._maxDelegate[1]](dialog, true);
}

CNDialogManager.restoreDialog = function(dialog)
{
	if(!dialog._maximized) return;
	dialog._maximized = false;
	dialog.className = "popupDialog";
	var b = dialog._storedBounds;
	dialog.style.left = b.x + "px";
	dialog.style.top = b.y + "px";
	dialog.style.width = b.w + "px";
	dialog.style.height = b.h + "px";
	
	var max = CNDialogManager.getMaxButton(dialog);
	max._img = "maximize.png";
	CNDialogManager._setTopButtonImage(max, "maximize.png");
	
	if(dialog._maxDelegate) dialog._maxDelegate[0][dialog._maxDelegate[1]](dialog, false);
}


CNDialogManager.hidePopup = function(dialog, commit, doNotCallback)
{
	if(dialog == null && Event.current()) dialog = CNDialogManager._findDialogDiv(Util.eventTarget(Event.current()));
	if(!dialog) return;
	
	var closeIt = true;
	if(!doNotCallback)
	{
		var fd = dialog._finishDelegate;
		if(fd) 
		{
			closeIt = fd[0][fd[1]](dialog, !commit) !== false;
		}
	}
	
	if(closeIt)
	{
		if(dialog.shadow) dialog.shadow.hide();
		dialog.style.visibility = "hidden";
		dialog._finishDelegate = null;
	}
	if(CNDialogManager._activePopup == dialog) 
	{
		CNDialogManager._activePopup = null;
		Event.del(document, "mousedown", CNDialogManager, CNDialogManager._document_onmousedown);
		Event.del(document, "keypress", CNDialogManager, CNDialogManager._document_onkeypress);
	}
}

// NOTE: revisit - too complicated buttons clean up.
CNDialogManager.destroyDialog = function(dialog)
{
	dialog._finishDelegate = null;
	dialog._maxDelegate = null;
	if(CNFormManager.vista)
	{
		this._destroyButtonsIn(dialog);
		this._destroyButtonsIn(this.getBottom(dialog));
	}

	if(dialog.shadow) dialog.shadow.destroy();
	Util.removeElement(dialog);	
}

CNDialogManager._destroyButtonsIn = function(cont)
{
	var children = cont.children;
	var count = children.length;
	var toDelete = [];
	for(var i = 0; i < count; i++)
	{
		var child = children[i];
		if(child.className.indexOf("cn_button") != -1)
		{ 
			toDelete.push(child.jsObject);
		}
	}
	
	for(var i = 0; i < toDelete.length; i++)
	{
		CNFormManager.destroyJSObject(toDelete[i]);
	}
}

// Content elements start from ix = 2.
CNDialogManager.createDialog = function(title)
{
	var popupDiv = Util.createElement("div", "cnPopupDialogDiv");
	popupDiv._isDialogDiv = true;
	popupDiv.style.display = "none";
	
	document.body.appendChild(popupDiv);
			
	var captionDiv = Util.createElement("div", "cnPopupDialogCaption"); // 0
	popupDiv.appendChild(captionDiv);
	captionDiv.textContent = title;

	var closeButton = Util.createElement("div", "cnDialogCloseButton", null); // 1
	popupDiv.appendChild(closeButton);
	var span = Util.createElement("span", null, null);
	closeButton.appendChild(span);
	span.textContent = 'r';
	
	var dialogContOuter = Util.createElement("div", "dialogContOuter"); // 2
	popupDiv.appendChild(dialogContOuter);

	var contentsDiv = Util.createElement("div", "dialogContents");
	dialogContOuter.appendChild(contentsDiv);
	
	var bottomDiv = Util.createElement("div", "dialogBottom")
	contentsDiv.appendChild(bottomDiv);

	Event.add(closeButton, "mouseenter", CNDialogManager, CNDialogManager._dialog_closeButton_onmouseenter);
	Event.add(closeButton, "mouseleave", CNDialogManager, CNDialogManager._dialog_closeButton_onmouseleave);
	Event.add(closeButton, "click", CNDialogManager, CNDialogManager._popup_cancel);

	new Shadow(popupDiv, false, false);

	Event.add(popupDiv, "mousedown", CNDialogManager, CNDialogManager._popupDiv_onmousedown);
	Event.add(captionDiv, "mousedown", CNDialogManager, CNDialogManager._captionDiv_onmousedown);
	
	return popupDiv;
}

// Note, resizable is used by fm dialog-forms only. Blue dialog is created by fm.
CNDialogManager.createVistaDialog = function(title, resizable)
{
	var dialog = $('__vistaDialogBG').cloneNode(true);
	dialog.removeAttribute("id");
	dialog._isDialogDiv = true;
	dialog._isResizable = resizable;
	
	document.body.appendChild(dialog);
	var tr = dialog.firstChild.rows[0];
	Event.add(dialog.children[4], "mousedown", CNDialogManager, CNDialogManager._captionDiv_onmousedown);	
	Event.add(dialog.children[3], "mousedown", CNDialogManager, CNDialogManager._captionDiv_onmousedown);	
	
	var close = dialog.firstChild.nextSibling;
	close._img = resizable ? "close-2.png" : "close.png";
	Event.add(close, "mouseenter", CNDialogManager, CNDialogManager._topButton_onmouseenter);
	Event.add(close, "mouseleave", CNDialogManager, CNDialogManager._topButton_onmouseleave);
	Event.add(close, "mousedown", CNDialogManager, CNDialogManager._topButton_onmousedown);
	Event.add(close, "mouseup", CNDialogManager, CNDialogManager._topButton_onmouseup);
	Event.add(close, "click", CNDialogManager, CNDialogManager._topButton_onclick);
	if(title != null) CNDialogManager.setCaption(dialog, title);
	
	if(resizable)
	{
		var max = CNDialogManager.getMaxButton(dialog);
		max.style.visibility = "visible";
		close.firstChild.className = "withMaximize";
		max._img = "maximize.png";
		Event.add(max, "mouseenter", CNDialogManager, CNDialogManager._topButton_onmouseenter);
		Event.add(max, "mouseleave", CNDialogManager, CNDialogManager._topButton_onmouseleave);
		Event.add(max, "mousedown", CNDialogManager, CNDialogManager._topButton_onmousedown);
		Event.add(max, "mouseup", CNDialogManager, CNDialogManager._topButton_onmouseup);
		Event.add(max, "click", CNDialogManager, CNDialogManager._maximize_onclick);
	}

	return dialog;
}

CNDialogManager.getContents = function(dialog)
{
	if(CNFormManager.vista) return dialog.children[4].lastChild.firstChild;
	return dialog.children[2].firstChild;
}
CNDialogManager.getBottom = function(dialog)
{
	return this.getContents(dialog).firstChild;
}

CNDialogManager.setCaption = function(dialog, caption)
{
	if(CNFormManager.vista) 
	{
		var captionDiv = dialog.children[3].lastChild;
		captionDiv.textContent = caption;
		captionDiv.style.position = "relative"; // Workaround.
		dialog.children[3].firstChild.style.width = captionDiv.offsetWidth + 12 + "px";
		captionDiv.style.position = "absolute";
	}
	else
	{
		dialog.firstChild.textContent = caption;
	}
}
CNDialogManager.getCloseButton = function(dialog)
{
	return dialog.children[1];
}
CNDialogManager.getMaxButton = function(dialog)
{
	return dialog.children[2];
}

CNDialogManager._idCount = 0;
CNDialogManager.createDialogButton = function(dialog, caption, commit)
{
	var b;
	if(CNFormManager.vista)
	{
		var button = new CN_button();
		button.elementID = "autoid_" + CNDialogManager._idCount++;
		b = button.createElement(Util.wrapIntoNode({}), dialog);
		b.id = "";
		button.loadData(Util.wrapIntoNode({value: caption}));
		CNFormManager.themeJSObjects.push(button);
	}
	else
	{
		b = Util.createElement("button", "cnDialogButton");
		b.textContent = caption;
		Event.add(b, "mouseenter", CNDialogManager, _CN_button_onmouseenter);
		Event.add(b, "mouseleave", CNDialogManager, _CN_button_onmouseleave);
		dialog.appendChild(b);
	}
	if(commit === true) Event.add(b, "click", CNDialogManager, CNDialogManager._popup_commit);
	else if(commit === false) Event.add(b, "click", CNDialogManager, CNDialogManager._popup_cancel);
	return b;
}

CNDialogManager.createBottomButton = function(dialog, caption, commit)
{
	var bottom = this.getBottom(dialog);
	var b = this.createDialogButton(bottom, caption, commit);
	b.style.marginLeft = "4px";
	b.style.position = "relative";
	b.style.display = "inline";
	return b;
}

CNDialogManager.showDialog = function(dialogElement, onFinishDelegate, centered, animate, onMaximizeDelegate)
{
	dialogElement.style.zIndex = top.__ontopZ++;
	dialogElement.style.visibility = "hidden";
	dialogElement.style.display = "block";
	if(centered)
	{
		dialogElement.style.left = (document.body.clientWidth - parseInt(dialogElement.offsetWidth)) / 2;
		dialogElement.style.top = (document.body.clientHeight - parseInt(dialogElement.offsetHeight)) / 2;
	}

	if(onFinishDelegate) dialogElement._finishDelegate = onFinishDelegate;
	if(onMaximizeDelegate) dialogElement._maxDelegate = onMaximizeDelegate;
	dialogElement.style.visibility = "visible";
	if(dialogElement.shadow) dialogElement.shadow.show();
}

CNDialogManager.showPopupDialog = function(dialogElement, onFinishDelegate)
{
	if(CNDialogManager._activePopup) 
	{
		CNDialogManager.hideDialog(CNDialogManager._activePopup);
	}
	else
	{
		Event.add(document, "mousedown", CNDialogManager, CNDialogManager._document_onmousedown);
		Event.add(document, "keypress", CNDialogManager, CNDialogManager._document_onkeypress);
	}
	CNDialogManager._activePopup = dialogElement;

	CNDialogManager.showDialog(dialogElement, onFinishDelegate);
}

CNDialogManager.hideDialog = function(dialogElement)
{
	CNDialogManager.hidePopup(dialogElement, false);
}

CNDialogManager._document_onmousedown = function()
{
	Event.del(document, "mousedown", CNDialogManager, CNDialogManager._document_onmousedown);
	if(!CNDialogManager._activePopup.contains(Util.eventTarget(Event.current()))) 
	{
		CNDialogManager.hidePopup(CNDialogManager._activePopup, false);
	}
}

CNDialogManager._document_onkeypress = function(ev)
{
	Event.del(document, "keypress", CNDialogManager, CNDialogManager._document_onkeypress);
	if(Event.keyValue(Event.normalize(ev)) == 27)
	{
		CNDialogManager.hidePopup(CNDialogManager._activePopup, false);
	}
}

CNDialogManager._topButton_onmouseenter = function()
{
	var l = Util.eventTarget(Event.current());
	if(l._disabled) return;
	l.style.zIndex = 2;
	CNDialogManager._setTopButtonImage(l, "hover-" + l._img);
}
CNDialogManager._topButton_onmouseleave = function()
{
	var l = Util.eventTarget(Event.current());
	if(l._disabled) return;
	CNDialogManager._setTopButtonImage(l, l._img);
	l.style.zIndex = 1;
}
CNDialogManager._topButton_onmousedown = function()
{
	var l = Util.findByClassName(Util.eventTarget(Event.current()), "dialogTopButton");
	if(l._disabled) return;
	CNDialogManager._setTopButtonImage(l, "down-" + l._img);
}
CNDialogManager._topButton_onmouseup = function()
{
	var l = Util.findByClassName(Util.eventTarget(Event.current()), "dialogTopButton");
	if(l._disabled) return;
	CNDialogManager._setTopButtonImage(l, "hover-" + l._img);
}
CNDialogManager._topButton_onclick = function()
{
	var l = Util.findByClassName(Util.eventTarget(Event.current()), "dialogTopButton");
	if(l._disabled) return;
	CNDialogManager.hidePopup(null, false);
}
