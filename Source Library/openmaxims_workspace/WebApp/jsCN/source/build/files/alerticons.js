/*
 * Alert notification strip.
 *
 * The historical client creates the alert chrome here; it is not supplied by
 * the theme HTML.  Keep that boundary explicit so the standards client works
 * with both the historical placeholder and newer theme shells.
 */
function AlertIcons(element, isCloned)
{
	this.element = Util.createElement("div", "cn_alert_icons");
	element.appendChild(this.element);
	this.element.innerHTML = "<span class=alertsContainer><span class=alertsSpan></span></span>";
	this.element.jsObject = this;

	this._container = this.element.firstChild || this.element.children[0];
	this._span = this._container.firstChild || this._container.children[0];

	this._leftButton = VistaSupport.createImageSetButton(null, 18, 18, 0);
	this._leftButton.style.display = "";
	this._leftButton.className = "leftAlertsButton";
	this.element.insertBefore(this._leftButton, this.element.firstChild);

	this._rightButton = VistaSupport.createImageSetButton(null, 18, 18, 18);
	this._rightButton.style.display = "";
	this._rightButton.className = "rightAlertsButton";
	this.element.appendChild(this._rightButton);

	this._leftButton._isLeftButton = true;
	this._rightButton._isRightButton = true;
	Event.add(this._leftButton, "mousedown", this, this._button_onmousedown);
	Event.add(this._leftButton, "mouseup", this, this._button_onmouseup);
	Event.add(this._leftButton, "mouseleave", this, this._button_onmouseup);
	Event.add(this._rightButton, "mousedown", this, this._button_onmousedown);
	Event.add(this._rightButton, "mouseup", this, this._button_onmouseup);
	Event.add(this._rightButton, "mouseleave", this, this._button_onmouseup);

	if(!isCloned) this._cloned = [];
	this._isCloned = isCloned;
	this._icons = [];
	this._timer = null;
	this._idClicked = -1;
	this._scrollStep = 3;
}
var proto = AlertIcons.prototype;

proto.unload = function()
{
	this.clean(true);
	Event.purge(this);
}

proto.clean = function(doNotUpdate)
{
	for(var i in this._icons)
	{
		Util.removeElement(this._icons[i]);
	}
	this._icons = [];

	if(!doNotUpdate) this._updatePlaceholder();
}

proto.loadData = function(node)
{
	this._lastIcon = null;
	this._idClicked = -1;

	var removeall = Util.xmlSelectSingleNode(node, "removeall");
	if(removeall) this._removeAll();

	var removealerts = Util.xmlSelectNodes(node, "removealert");
	for(var i = 0; i < removealerts.length; i++)
	{
		var id = removealerts[i].getAttribute("id");
		if(!id) continue;
		this._removeAlert(String(id));
	}
	if(removeall || removealerts.length > 0) this._setSpanLeft(0);

	var newalerts = Util.xmlSelectNodes(node, "newalert");
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
			var alertSound = document.getElementById("__si_alert_sound");
			if(!alertSound)
			{
				alertSound = document.createElement("audio");
				alertSound.id = "__si_alert_sound";
				alertSound.preload = "auto";
				alertSound.setAttribute("aria-hidden", "true");
				alertSound.style.display = "none";
				document.body.insertBefore(alertSound, document.body.firstChild);
			}
			alertSound.src = String(attr);
			alertSound.currentTime = 0;
			var playResult = alertSound.play();
			if(playResult && playResult["catch"]) playResult["catch"](function() {});
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
	for(var id in this._icons) list.push(id);
	for(var i = 0; i < list.length; i++) this._removeAlert(list[i]);
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
	for(var id in this._icons) list.push(this._icons[id]);

	list.sort(function(a, b)
	{
		if(a._sortIX < b._sortIX) return -1;
		if(a._sortIX == b._sortIX) return 0;
		return 1;
	});

	for(var i = 0; i < list.length; i++) this._span.appendChild(list[i]);
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
		img = Util.createElement("img", null, {width: 16, height: 16});
		img.style.marginRight = "2px";
		this._icons[id] = img;
		img._id = id;
		Event.add(img, "click", this, this._img_onclick);
	}
	img.src = icon;
	img._sortIX = sortIX;

	// Always move the icon to the beginning of the alert strip.
	if(!this._lastIcon) this._span.insertBefore(img, this._span.firstChild);
	else this._lastIcon.parentNode.insertBefore(img, this._lastIcon.nextSibling);
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
		Util.removeElement(icon);
		delete this._icons[id];
	}
}

proto._getSpanLeft = function()
{
	var value = parseInt(Util.getStyle(this._span, "left"), 10);
	if(isNaN(value)) value = this._span.offsetLeft || 0;
	return value;
}

proto._setSpanLeft = function(value)
{
	this._span.style.left = String(value) + "px";
}

proto._updatePlaceholder = function()
{
	if(this._container.clientWidth == 0) return;

	var spanLeft = this._getSpanLeft();
	if(this._span.offsetWidth > this._container.clientWidth)
	{
		Util.toggleClass(this.element, "cn_alert_icons_w_right",
			spanLeft + this._span.offsetWidth > this._container.clientWidth);
		Util.toggleClass(this.element, "cn_alert_icons_w_left", spanLeft < 0);
		this._rightButton.style.visibility =
			spanLeft + this._span.offsetWidth > this._container.clientWidth ? "visible" : "hidden";
		this._leftButton.style.visibility = spanLeft < 0 ? "visible" : "hidden";
	}
	else
	{
		Util.removeClass(this.element, "cn_alert_icons_w_right");
		Util.removeClass(this.element, "cn_alert_icons_w_left");
		this._leftButton.style.visibility = this._rightButton.style.visibility = "hidden";
	}
}

proto._button_onmousedown = function(nativeEvent)
{
	var jso = CNUtil.dispatchObject(nativeEvent);
	if(jso && jso.button_onmousedown) jso.button_onmousedown(nativeEvent);
	Util.cancelEvent(nativeEvent);
}
proto.button_onmousedown = function(nativeEvent)
{
	var target = Util.eventTarget(nativeEvent);
	if(target && target._isLeftButton) this.scrollRight();
	else this.scrollLeft();
}

proto._button_onmouseup = function(nativeEvent)
{
	var jso = CNUtil.dispatchObject(nativeEvent);
	if(jso && jso.button_onmouseup) jso.button_onmouseup(nativeEvent);
}
proto.button_onmouseup = function(nativeEvent)
{
	this._updatePlaceholder();
	if(!this._timer) return;
	clearTimeout(this._timer);
	this._timer = null;
}

proto.scrollLeft = function()
{
	var left = this._getSpanLeft() - this._scrollStep;
	if(left + this._span.offsetWidth <= this._container.clientWidth)
	{
		left = this._container.clientWidth - this._span.offsetWidth;
		this._setSpanLeft(left);
		this._updatePlaceholder();
	}
	else
	{
		this._setSpanLeft(left);
		var obj = this;
		this._timer = setTimeout(function(){ obj.scrollLeft(); }, 20);
	}
}

proto.scrollRight = function()
{
	var left = this._getSpanLeft() + this._scrollStep;
	if(left >= 0)
	{
		this._setSpanLeft(0);
		this._updatePlaceholder();
	}
	else
	{
		this._setSpanLeft(left);
		var obj = this;
		this._timer = setTimeout(function(){ obj.scrollRight(); }, 20);
	}
}

proto._img_onclick = function(nativeEvent)
{
	var jso = CNUtil.dispatchObject(nativeEvent);
	if(jso && jso.img_onclick) jso.img_onclick(nativeEvent);
}
proto.img_onclick = function(nativeEvent)
{
	var target = Util.eventTarget(nativeEvent);
	if(!target) return;
	if(this._disabled && !target._alwaysEnabled) return;

	this._idClicked = target._id;
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
	for(var i = 0; i < imgs.length; i++) this._icons[imgs[i]._id] = imgs[i];
	this._updatePlaceholder();
}

proto.cloneToDialogHeader = function(header)
{
	var cloned = new AlertIcons(header, true);
	cloned.cloneImagesFrom(this);
	this._cloned.push(cloned);
	return cloned;
}
