/*
	v. 2.0.4
*/
function CNDialogManager(){}

CNDialogManager._dialog_closeButton_onmouseenter = function()
{
	var l = event.srcElement;
	l.runtimeStyle.border = "1px solid white";
	l.runtimeStyle.padding = "0px";
}

CNDialogManager._dialog_closeButton_onmouseleave = function()
{
	var l = event.srcElement;
	l.runtimeStyle.border = "0px";
	l.runtimeStyle.padding = "1px";
}

CNDialogManager._findDialogDiv = function(l)
{
	while(l && !l._isDialogDiv) l = l.parentElement;
	return l;
}

// Blue only.
CNDialogManager._popupDiv_onmousedown = function()
{
	var l = CNDialogManager._findDialogDiv(event.srcElement);
	if(l.currentStyle.zIndex != top.__ontopZ) l.style.zIndex = top.__ontopZ++;
	Util.cancelEvent();
}

CNDialogManager._captionDiv_onmousedown = function()
{
	var l = CNDialogManager._findDialogDiv(event.srcElement);	
	if(l.currentStyle.zIndex != top.__ontopZ) l.style.zIndex = top.__ontopZ++;
	if(CNFormManager.vista && 
		!event.srcElement.className.match(/dialogContOuter|dialogCaption/)) return;
	
	if(l._maximized) return;
	
	l.attachEvent("onmousemove", CNDialogManager._captionDiv_doDrag);
	l.attachEvent("onmouseup", CNDialogManager._captionDiv_finishDrag);
	l.attachEvent("onlosecapture", CNDialogManager._captionDiv_finishDrag);
	l.setCapture();
	CNDialogManager._dragged = l;
}
CNDialogManager._captionDiv_doDrag = function()
{
	var l = CNDialogManager._dragged;
	
	if(!CNDialogManager._dragStarted)
	{
		CNDialogManager._startLeft = l.offsetLeft;
		CNDialogManager._startTop = l.offsetTop;
		CNDialogManager._x = event.screenX;
		CNDialogManager._y = event.screenY;
		CNDialogManager._dragStarted = true;
	}

	l.style.pixelLeft = CNDialogManager._startLeft + event.screenX - CNDialogManager._x;
	l.style.pixelTop = CNDialogManager._startTop + event.screenY - CNDialogManager._y;
	
	if(l.shadow) l.shadow.syncPosition();
}

CNDialogManager._captionDiv_finishDrag = function()
{
	var l = CNDialogManager._dragged;
	l.detachEvent("onmousemove", CNDialogManager._captionDiv_doDrag);
	l.detachEvent("onmouseup", CNDialogManager._captionDiv_finishDrag);
	l.detachEvent("onlosecapture", CNDialogManager._captionDiv_finishDrag);
	l.releaseCapture();
	CNDialogManager._dragStarted = false;
	CNDialogManager._dragged = null;
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
	var dialog = CNDialogManager._findDialogDiv(event.srcElement);
	if(dialog) CNDialogManager.toggleDialogMaximize(dialog);
}

CNDialogManager.toggleDialogMaximize = function(dialog)
{
	dialog._maximized ? CNDialogManager.restoreDialog(dialog) : CNDialogManager.maximizeDialog(dialog);
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
	max.firstChild.filters[0].src = CNFormManager.themeImagesPath + "restore.png";
	
	if(dialog._maxDelegate) dialog._maxDelegate[0][dialog._maxDelegate[1]](dialog, true);
}

CNDialogManager.restoreDialog = function(dialog)
{
	if(!dialog._maximized) return;
	dialog._maximized = false;
	dialog.className = "popupDialog";
	var b = dialog._storedBounds;
	dialog.style.left = b.x;
	dialog.style.top = b.y;
	dialog.style.width = b.w;
	dialog.style.height = b.h;
	
	var max = CNDialogManager.getMaxButton(dialog);
	max._img = "maximize.png";
	max.firstChild.filters[0].src = CNFormManager.themeImagesPath + "maximize.png";
	
	if(dialog._maxDelegate) dialog._maxDelegate[0][dialog._maxDelegate[1]](dialog, false);
}


CNDialogManager.hidePopup = function(dialog, commit, doNotCallback)
{
	if(dialog == null && event) dialog = CNDialogManager._findDialogDiv(event.srcElement);
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
		if(CNFormManager.vista && Util.IE7)
		{
			var f = dialog.filters['progid:DXImageTransform.Microsoft.Fade'];
			if(f) f.Apply();
			dialog.style.visibility = "hidden";
			if(f) f.Play(.25);
		}
		else 
		{
			if(dialog.shadow) dialog.shadow.hide();
			dialog.style.visibility = "hidden";
		}
	
		dialog._finishDelegate = null;
	}
	if(CNDialogManager._activePopup == dialog) 
	{
		CNDialogManager._activePopup = null;
		document.detachEvent("onmousedown", CNDialogManager._document_onmousedown);
		document.detachEvent("onkeypress", CNDialogManager._document_onkeypress);
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
	dialog.removeNode(true);	
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
	var popupDiv = document.createElement("<div class=cnPopupDialogDiv>");
	popupDiv._isDialogDiv = true;
	popupDiv.style.display = "none";
	
	document.body.appendChild(popupDiv);
			
	var captionDiv = document.createElement("<div class=cnPopupDialogCaption>"); // 0
	popupDiv.appendChild(captionDiv);
	captionDiv.innerText = title;

	var closeButton = document.createElement("<div class=cnDialogCloseButton unselectable=on>"); // 1
	popupDiv.appendChild(closeButton);
	var span = document.createElement('<span unselectable=on>');
	closeButton.appendChild(span);
	span.innerText = 'r';
	
	var dialogContOuter = document.createElement("<div class=dialogContOuter>"); // 2
	popupDiv.appendChild(dialogContOuter);

	var contentsDiv = document.createElement("<div class=dialogContents>");
	dialogContOuter.appendChild(contentsDiv);
	
	var bottomDiv = document.createElement("<div class=dialogBottom>")
	contentsDiv.appendChild(bottomDiv);

	closeButton.attachEvent("onmouseenter", CNDialogManager._dialog_closeButton_onmouseenter);
	closeButton.attachEvent("onmouseleave", CNDialogManager._dialog_closeButton_onmouseleave);
	closeButton.attachEvent("onclick", CNDialogManager._popup_cancel);

	new Shadow(popupDiv, false, false);

	popupDiv.attachEvent("onmousedown", CNDialogManager._popupDiv_onmousedown);
	captionDiv.attachEvent("onmousedown", CNDialogManager._captionDiv_onmousedown);
	
	return popupDiv;
}

// Note, resizable is used by fm dialog-forms only. Blue dialog is created by fm.
CNDialogManager.createVistaDialog = function(title, resizable)
{
	var dialog = $('__vistaDialogBG').cloneNode(true);
	dialog.removeAttribute("id");
	dialog._isDialogDiv = true;
	dialog._isResizable = resizable;
	//document.body.insertAdjacentElement("afterbegin", dialog);
	document.body.appendChild(dialog);
	var tr = dialog.firstChild.rows[0];
	dialog.children[4].attachEvent("onmousedown", CNDialogManager._captionDiv_onmousedown);	
	dialog.children[3].attachEvent("onmousedown", CNDialogManager._captionDiv_onmousedown);	
	
	var close = dialog.firstChild.nextSibling;
	close._img = resizable ? "close-2.png" : "close.png";
	close.attachEvent("onmouseenter", CNDialogManager._topButton_onmouseenter);
	close.attachEvent("onmouseleave", CNDialogManager._topButton_onmouseleave);
	close.attachEvent("onmousedown", CNDialogManager._topButton_onmousedown);
	close.attachEvent("onmouseup", CNDialogManager._topButton_onmouseup);
	close.attachEvent("onclick", CNDialogManager._topButton_onclick);
	close.attachEvent("onselectstart", Util.cancelEvent);

	if(title != null) CNDialogManager.setCaption(dialog, title);
	
	if(resizable)
	{
		var max = CNDialogManager.getMaxButton(dialog);
		max.style.visibility = "visible";
		close.firstChild.className = "withMaximize";
		max._img = "maximize.png";
		max.attachEvent("onmouseenter", CNDialogManager._topButton_onmouseenter);
		max.attachEvent("onmouseleave", CNDialogManager._topButton_onmouseleave);
		max.attachEvent("onmousedown", CNDialogManager._topButton_onmousedown);
		max.attachEvent("onmouseup", CNDialogManager._topButton_onmouseup);
		max.attachEvent("onclick", CNDialogManager._maximize_onclick);
		max.attachEvent("onselectstart", Util.cancelEvent);
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
		captionDiv.innerText = caption;
		captionDiv.style.position = "relative"; // Workaround.
		dialog.children[3].firstChild.style.width = captionDiv.offsetWidth + 12 + "px";
		captionDiv.style.position = "absolute";
	}
	else
	{
		dialog.firstChild.innerText = caption;
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
		b = document.createElement("<button class=cnDialogButton>");
		b.innerText = caption;
		b.attachEvent("onmouseenter", _CN_button_onmouseenter);
		b.attachEvent("onmouseleave", _CN_button_onmouseleave);
		dialog.appendChild(b);
	}
	if(commit === true) b.attachEvent("onclick", CNDialogManager._popup_commit);
	else if(commit === false) b.attachEvent("onclick", CNDialogManager._popup_cancel);
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
	if(CNFormManager.vista)
	{
		if(animate && ThemeNonCSSStyles.animateDialogs)
		{
			dialogElement.style.filter = "progid:DXImageTransform.Microsoft.Fade()";
			dialogElement.filters[0].Apply();
			dialogElement.style.visibility = "visible";
			dialogElement.filters[0].Play(.3);
		}
		else dialogElement.style.visibility = "visible";
	}
	else 
	{
		dialogElement.style.visibility = "visible";
		if(dialogElement.shadow) dialogElement.shadow.show();
	}
}

CNDialogManager.showPopupDialog = function(dialogElement, onFinishDelegate)
{
	if(CNDialogManager._activePopup) 
	{
		CNDialogManager.hideDialog(CNDialogManager._activePopup);
	}
	else
	{
		document.attachEvent("onmousedown", CNDialogManager._document_onmousedown);
		document.attachEvent("onkeypress", CNDialogManager._document_onkeypress);
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
	document.detachEvent("onmousedown", CNDialogManager._document_onmousedown);
	if(!CNDialogManager._activePopup.contains(event.srcElement)) 
	{
		CNDialogManager.hidePopup(CNDialogManager._activePopup, false);
	}
}

CNDialogManager._document_onkeypress = function()
{
	document.detachEvent("onkeypress", CNDialogManager._document_onkeypress);
	if(event.keyCode == 27)
	{
		CNDialogManager.hidePopup(CNDialogManager._activePopup, false);
	}
}

CNDialogManager._topButton_onmouseenter = function()
{
	var l = event.srcElement;
	if(l._disabled) return;
	if(ThemeNonCSSStyles.animateButtons) {
		if(!l.filters.length) l.style.filter = "progid:DXImageTransform.Microsoft.Fade";
		l.filters[0].Apply();
	}
	l.style.zIndex = 2;
	l.firstChild.filters[0].src = CNFormManager.themeImagesPath + "hover-" + l._img;
	if(ThemeNonCSSStyles.animateButtons) {
		l.filters[0].Play(.05);
	}
}
CNDialogManager._topButton_onmouseleave = function()
{
	var l = event.srcElement;
	if(l._disabled) return;
	if(ThemeNonCSSStyles.animateButtons) {
		l.filters[0].Apply();
	}
	l.firstChild.filters[0].src = CNFormManager.themeImagesPath + l._img;
	if(ThemeNonCSSStyles.animateButtons) {
		l.filters[0].Play(.2);	
	}
	l.style.zIndex = 1;
}
CNDialogManager._topButton_onmousedown = function()
{
	var l = Util.findByClassName(event.srcElement, "dialogTopButton");
	if(l._disabled) return;
	l.firstChild.filters[0].src = CNFormManager.themeImagesPath + "down-" + l._img;
}
CNDialogManager._topButton_onmouseup = function()
{
	var l = Util.findByClassName(event.srcElement, "dialogTopButton");
	if(l._disabled) return;
	l.firstChild.filters[0].src = CNFormManager.themeImagesPath + "hover-" + l._img;
}
CNDialogManager._topButton_onclick = function()
{
	var l = Util.findByClassName(event.srcElement, "dialogTopButton");
	if(l._disabled) return;
	CNDialogManager.hidePopup(null, false);
}