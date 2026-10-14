/*
	v. 2.0
	+ vista.
	+ DIV rendering.
*/
var Tooltip =
{
	x: 0,
	y: 0,
	popup: null,
	element: null,
	_shadow: null,

	// 18 == typical mouse pointer height.
	popupYOffset: 18,
	popupXOffset: 4,

	buildElement: function()
	{
		this.popup = Util.createElement("div", "tooltipPopup");
		if(CNFormManager.vista) {
			this.popup.appendChild(document.createElement("span"));
			this.popup.style.boxShadow = "2px 2px 4px rgba(0,0,0,.3)";
		}
		document.body.appendChild(this.popup);
	},
	destroy: function()
	{
		this.hide();
		Util.removeElement(this.popup);
		this.popup = null;
	},

	set: function(l, tipText)
	{
		if(tipText && !l.tipText) Tooltip.attach(l, tipText);
		else l.tipText = tipText;
		
		if(this.element == l && this.popup && this.popup.style.visibility != "hidden")
		{
			if(tipText) this.show(); // Refresh.
			else this.hide();
		}
	},

	attach: function(l, tipText)
	{
		var enter = l.tagName == "AREA" ? "mouseover" : "mouseenter";
		var leave = l.tagName == "AREA" ? "mouseout" : "mouseleave";
		Event.add(l, enter, this, this._element_onmouseenter);
		Event.add(l, leave, this, this._element_onmouseleave);
		if(tipText) l.tipText = tipText;
	},
	detach: function(l)
	{
		this.hide();
		var enter = l.tagName == "AREA" ? "mouseover" : "mouseenter";
		var leave = l.tagName == "AREA" ? "mouseout" : "mouseleave";
		Event.del(l, enter, this, this._element_onmouseenter);
		Event.del(l, leave, this, this._element_onmouseleave);
		l.tipText = null;
	},

	_element_onmouseenter: function()
	{
		var l = Util.eventTarget();
		Tooltip.forceOnElement(l, true);
	},

	forceOnElement: function(l, useEvent)
	{
		if(!this.popup || !l.tipText) return;
		if(this.element) this.hide();
		var timeout = parseInt(Util.getStyle(l, "xl--tooltip-delay"), 10);
		if(useEvent && !timeout) timeout = 500; // Default.

		Tooltip.element = l;
		if(useEvent)
		{
			Tooltip.x = Event.current().clientX + window.pageXOffset + Tooltip.popupXOffset;
			Tooltip.y = Event.current().clientY + window.pageYOffset + Tooltip.popupYOffset;
		}
		else
		{
			var xy = CNUtil.findAbsolutePos(l);
			Tooltip.x = xy.x;
			Tooltip.y = xy.y + l.offsetHeight;
		}
		
		Event.add(l, "mousemove", this, this._element_onmousemove);		

		if(timeout > 0) Tooltip.showTimeout = setTimeout(function(){ Tooltip.show(); }, timeout);
		else Tooltip.show();
	},

	_element_onmouseleave: function()
	{
		Tooltip.hide();
	},
	
	_element_onmousemove: function()
	{
		Tooltip.x = Event.current().clientX + window.pageXOffset + Tooltip.popupXOffset;
		Tooltip.y = Event.current().clientY + window.pageYOffset + Tooltip.popupYOffset;
		if(Tooltip.popupMoving)
		{
			var xy = Tooltip.correctXY(Tooltip.popup, Tooltip.x, Tooltip.y);
			Tooltip.popup.style.left = xy.x + "px";
			Tooltip.popup.style.top = xy.y + "px";
			
		}
	},

	show: function()
	{
		if(!this.popup || !this.element) return;
		if(this.element.offsetWidth == 0 && this.element.offsetHeight == 0) { // FWUI-1025
			this.hide();
			return;
		}
		
		var popup = this.popup;

		if(!popup || !popup.style) return;
		
		popup.style.visibility = "hidden";
		popup.style.display = "block";

		if(CNFormManager.vista) popup.style.width = "500px";

		if(CNFormManager.vista) popup.lastChild.innerHTML = this.element.tipText;
		else popup.innerHTML = this.element.tipText;
		
		if(CNFormManager.vista) 
		{
			popup.style.width = popup.lastChild.offsetWidth + 10 + "px";
			popup.style.height = popup.lastChild.offsetHeight + 5 + "px";
		}

		var xy = this.correctXY(popup, this.x, this.y);
		popup.style.left = xy.x + "px";
		popup.style.top = xy.y + "px";
		
		popup.style.zIndex = top.__ontopZ++;
	
		this.popupMoving = Util.getStyle(this.element, "xl--tooltip-position") != "still";
		var duration = parseInt(Util.getStyle(this.element, "xl--blend-duration"), 10);
		if(!duration) duration = 300;
		popup.style.transition = "opacity " + duration + "ms";
		popup.style.opacity = "0";
		popup.style.visibility = "visible";
		var shownPopup = popup;
		setTimeout(function(){ shownPopup.style.opacity = "1"; }, 0);

	},

	correctXY: function(popup, x, y)
	{
		var b = y + popup.offsetHeight + 4 - window.pageYOffset; // 4 == shadow
		var r = x + popup.offsetWidth + 4 - window.pageXOffset; 
	
		if(r > window.innerWidth) x = x - r + window.innerWidth;
		if(b > window.innerHeight) y = y - b + window.innerHeight;
	
		if(x < 0) x = 0;
		if(y < 0) y = 0;
		return {x: x, y: y};
	},
	
	hide: function()
	{
		if(this.showTimeout) 
		{
			clearTimeout(this.showTimeout);
			this.showTimeout = null;
		}
		if(!this.popup) {
			return;
		}
		
		this.popup.style.visibility = "hidden";
		
		if(this.popupMoving) this.popupMoving = false;
		if(this.element) {
			Event.del(this.element, "mousemove", this, this._element_onmousemove);
			this.element = null;
		}
	}
}
