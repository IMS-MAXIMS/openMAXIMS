/*
	v. 2.0
	+ vista
*/
function AlertIcons(element, isCloned)
{
	this.element = element;
	element.jsObject = this;
	
	if(!isCloned) {
		this._cloned = [];
	}
	
	this._isCloned = isCloned;
	
	this._container = element.children[1];
	this._span = this._container.children[0];
	this._leftButton = element.children[0];
	this._rightButton = element.children[2];
	
	this._leftButton.src = CNFormManager.themeImagesPath  + "alert-ar-left-1.gif";
	this._rightButton.src = CNFormManager.themeImagesPath  + "alert-ar-right-1.gif";

	this._leftButton._isLeftButton = true;
	this._leftButton.attachEvent("onmousedown", this._button_onmousedown)
	this._leftButton.attachEvent("ondblclick", this._button_onmousedown)
	this._leftButton.attachEvent("onmouseup", this._button_onmouseup)
	this._leftButton.attachEvent("onmouseleave", this._button_onmouseup)
	this._leftButton.attachEvent("ondragstart", CNUtil.cancelEvent);
	this._leftButton.attachEvent("onmouseover", this._button_onmouseover);

	this._rightButton.attachEvent("onmousedown", this._button_onmousedown)
	this._rightButton.attachEvent("ondblclick", this._button_onmousedown)
	this._rightButton.attachEvent("onmouseup", this._button_onmouseup)
	this._rightButton.attachEvent("onmouseleave", this._button_onmouseup)
	this._rightButton.attachEvent("ondragstart", CNUtil.cancelEvent);
	this._rightButton.attachEvent("onmouseover", this._button_onmouseover);
	
	this._icons = [];
	
	this._timer = null;
	this._idClicked = -1;
	this._scrollStep = 2;
}
var proto = AlertIcons.prototype;

proto.unload = function()
{
	this.clean(true);
}

proto.clean = function(doNotUpdate)
{
	for(var i in this._icons)
	{
		this._icons[i].removeNode(true);
	}
	this._icons = [];
	
	if(!doNotUpdate) this._updatePlaceholder();
}

proto.loadData = function(node)
{
	this._lastIcon = null;
	this._idClicked = -1;

	var removeall = node.selectSingleNode("removeall");
	if(removeall) {
		this._removeAll();
	}
	
	var removealerts = node.selectNodes("removealert");
	for(var i = 0; i < removealerts.length; i++)
	{
		var id = removealerts[i].getAttribute("id");
		if(!id) continue;
		this._removeAlert(String(id));
	}

	var newalerts = node.selectNodes("newalert");
	for(var i = 0; i < newalerts.length; i++)
	{
		this._addAlert(newalerts[i]);
	}

	var self = this;
	setTimeout(function(){ self._updatePlaceholder(); });
	
	this._sort();

	if(newalerts.length > 0 && !this._isCloned)
	{
		var attr = node.getAttribute("sound");
		if(attr)
		{
			var bgSound = document.getElementsByTagName("bgsound")[0];
			if(!bgSound) bgSound = document.createElement("bgsound");
			bgSound.src = String(attr);
			document.body.insertBefore(bgSound, document.body.firstChild);
		}
	}

	if(!this._isCloned) 
	{
		for(var i = 0; i < this._cloned.length; i++) {
			this._cloned[i].loadData(node);
		}
	}
}

proto._removeAll = function()
{
	var list = [];
	for(var id in this._icons)
	{
		list.push(id);
	}
	for(var i = 0; i < list.length; i++)
	{
		this._removeAlert(list[i]);	
	}
	this._icons = [];
}

proto.storeData = function(xmldoc)
{
	if(this._idClicked == -1) return;
	var node = xmldoc.createElement("alert");
	node.setAttribute("id", this._idClicked);
	if(this._isCloned) node.setAttribute("fromDialog", "true");
	this._idClicked = -1;
	return node;
}

proto._sort = function()
{
	var list = [];
	for(var id in this._icons)
	{
		list.push(this._icons[id]);
	}
	
	list.sort(function(a, b)
	{ 
		if(a._sortIX < b._sortIX) return -1; 
		if(a._sortIX == b._sortIX) return 0;
		return 1;
	});
	
	for(var i = 0; i < list.length; i++)
	{
		this._span.appendChild(list[i]);
	}
}

proto._addAlert = function(node)
{
	var id = node.getAttribute("id");
	var icon = node.getAttribute("icon");
	if(!id || !icon) return;
	id = String(id);
	icon = String(icon);
	
	var sortIX = 0;
	var attr = node.getAttribute("sortIndex");
	if(attr) sortIX = parseInt(attr, 10);
	
	var img = this._icons[id];
	if(!img)
	{
		img = document.createElement("<img width=16 height=16>");
		img.style.marginRight = "2px";
		this._icons[id] = img;		
		img._id = id;
		img.attachEvent("onclick", this._img_onclick);
	}
	img.src = icon;
	img._sortIX = sortIX;
	// Always move icon to the begin.
	if(!this._lastIcon) this._span.insertAdjacentElement("afterbegin", img);
	else this._lastIcon.insertAdjacentElement("afterend", img);
	this._lastIcon = img;
	
	var tooltip = node.getAttribute("tooltip");
	if(tooltip) Tooltip.attach(img, String(tooltip));
	
	if(node.getAttribute("alwaysEnabled") == "true")
	{
		img._alwaysEnabled = true;
		img.style.cursor = "pointer";
	}
}

proto._removeAlert = function(id)
{
	var icon = this._icons[String(id)];
	if(icon)
	{
		icon.removeNode(true);
		delete this._icons[id];
	}
}

proto._updatePlaceholder = function()
{
	if(this._container.clientWidth == 0) return;

	if(this._span.offsetWidth > this._container.clientWidth)
	{
		this._rightButton.style.visibility =  this._span.offsetLeft + this._span.offsetWidth > this._container.clientWidth 
												? "visible" : "hidden";
		this._leftButton.style.visibility = this._span.offsetLeft < 0 ? 'visible' : 'hidden';
		this._container.style.left = -8;
	}
	else
	{
		this._leftButton.style.visibility =
			this._rightButton.style.visibility = "hidden";
		this._container.style.left = -20;
	}
}

proto._button_onmouseover = function()
{
	var l = event.srcElement;
	if(l._isLeftButton) l.src = CNFormManager.themeImagesPath  + "alert-ar-left-2.gif";
	else l.src = CNFormManager.themeImagesPath  + "alert-ar-right-2.gif";
}

proto._button_onmousedown = function()
{
	var jso = CNUtil.dispatchObject();
	if(jso && jso.button_onmousedown) jso.button_onmousedown();
	Util.cancelEvent();
}
proto.button_onmousedown = function()
{
	if(event.srcElement._isLeftButton) this.scrollRight();
	else this.scrollLeft();
}

proto._button_onmouseup = function()
{
	var jso = CNUtil.dispatchObject();
	if(jso && jso.button_onmouseup) jso.button_onmouseup();
}
proto.button_onmouseup = function()
{
	if(event.type == "mouseleave")
	{
		var l = event.srcElement;
		if(l._isLeftButton) l.src = CNFormManager.themeImagesPath  + "alert-ar-left-1.gif";
		else l.src = CNFormManager.themeImagesPath  + "alert-ar-right-1.gif";
	}

	if(!this._timer) return;
	clearTimeout(this._timer);
	this._timer = null;
}

proto.scrollLeft = function()
{
	this._span.style.pixelLeft -= this._scrollStep;
	if(this._span.offsetLeft + this._span.offsetWidth <= this._container.clientWidth)
	{
		this._span.style.pixelLeft = this._container.clientWidth - this._span.offsetWidth;
	}
	else
	{
		var obj = this;
		this._timer = setTimeout(function(){ obj.scrollLeft(); }, 20);
	}
	this._updatePlaceholder();
}

proto.scrollRight = function()
{
	this._span.style.pixelLeft += this._scrollStep;
	if(this._span.offsetLeft >= 0) 
	{
		this._span.style.pixelLeft = 0;
	}
	else
	{
		var obj = this;
		this._timer = setTimeout(function(){ obj.scrollRight(); }, 20);
	}
	this._updatePlaceholder();
}

proto._img_onclick = function()
{
	CNUtil.dispatchObject().img_onclick();
}
proto.img_onclick = function()
{
	if(this._disabled && !event.srcElement._alwaysEnabled) return;

	this._idClicked = event.srcElement._id;
	this.formManager.postData(this.element);
}

proto.set_disabled = function(val)
{
	this._disabled = val;
	this._span.className = this._disabled ? "alertsSpan alertsSpan_disabled" : "alertsSpan";
}

proto.cloneImagesFrom = function(otherAlerts) 
{
	var cloned = otherAlerts._span.cloneNode(true);
	this._container.replaceChild(cloned, this._span);
	this._span = cloned;

	var imgs = this._span.getElementsByTagName("img");
	for(var i = 0; i < imgs.length; i++) {
		this._icons[imgs[i]._id] = imgs[i];		
	}

	this._updatePlaceholder();
}

proto.cloneToDialogHeader = function(header, node) 
{	
	var cloned = this.element.cloneNode(true);	
	Util.addClass(cloned, "dialogAlertsDiv");
	header.appendChild(cloned);		

	var clonedObj = new AlertIcons(cloned, true);
	clonedObj.cloneImagesFrom(this, node);

	this._cloned.push(clonedObj);
	return clonedObj;
}