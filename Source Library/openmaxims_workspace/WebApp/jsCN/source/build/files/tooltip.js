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
		if(CNFormManager.vista)
		{
			var h = document.createElement("<v:roundrect class='tooltipPopup'>");
			h.arcsize = .1;
			h.strokecolor = "#777777";
			var fill = document.createElement("v:fill");
			//fill.type = 'frame';
			//fill.src = 'themes/vista/g/tooltip-bg.gif';
			fill.type = "gradient";
			fill.colors = "0% #E5E6F0, 100% white";
			h.appendChild(fill);
			var tb = document.createElement("span");
			h.appendChild(tb);
			this.popup = h;
			this._shadow = new Shadow(h, false, false); // As shadow property is used by vml.
		}
		else this.popup = document.createElement("<div class='tooltipPopup'>")
		document.body.appendChild(this.popup);
	},
	destroy: function()
	{
		this.element = null;
		if(this.popup) 
		{
			if(this._shadow) this._shadow.destroy();
			this.popup.removeNode(true);
		}
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
		if(l.tagName == "AREA")
		{
			l.attachEvent("onmouseover", this._element_onmouseenter);
			l.attachEvent("onmouseout", this._element_onmouseleave);
		}
		else
		{
			l.attachEvent("onmouseenter", this._element_onmouseenter);
			l.attachEvent("onmouseleave", this._element_onmouseleave);
		}
		if(tipText) l.tipText = tipText;
	},

	detach: function(l)
	{
		this.hide();
		if(l.tagName == "AREA")
		{
			l.detachEvent("onmouseover", this._element_onmouseenter);
			l.detachEvent("onmouseout", this._element_onmouseleave);
		}
		else
		{
			l.detachEvent("onmouseenter", this._element_onmouseenter);
			l.detachEvent("onmouseleave", this._element_onmouseleave);
		}
		l.tipText = null;
	},

	_element_onmouseenter: function()
	{
		var l = event.srcElement;
		Tooltip.forceOnElement(l, true);
	},

	forceOnElement: function(l, useEvent)
	{
		if(!this.popup || !l.tipText) return;
		var timeout = parseInt(l.currentStyle["xl--tooltip-delay"]);
		if(useEvent && !timeout) timeout = 500; // Default.

		Tooltip.element = l;
		if(useEvent)
		{
			Tooltip.x = event.screenX - window.screenLeft + Tooltip.popupXOffset + document.body.scrollLeft;
			Tooltip.y = event.screenY - window.screenTop + Tooltip.popupYOffset + document.body.scrollTop;
		}
		else
		{
			var xy = CNUtil.findAbsolutePos(l);
			Tooltip.x = xy.x;
			Tooltip.y = xy.y + l.offsetHeight;
		}
		
		l.attachEvent("onmousemove", Tooltip._element_onmousemove);		

		if(timeout > 0) Tooltip.showTimeout = setTimeout("Tooltip.show()", timeout);
		else Tooltip.show();
	},

	_element_onmouseleave: function()
	{
		Tooltip.hide();
	},
	
	_element_onmousemove: function()
	{
		Tooltip.x = event.screenX - window.screenLeft + Tooltip.popupXOffset + document.body.scrollLeft;
		Tooltip.y = event.screenY - window.screenTop + Tooltip.popupYOffset + document.body.scrollTop;
		if(Tooltip.popupMoving)
		{
			var xy = Tooltip.correctXY(Tooltip.popup, Tooltip.x, Tooltip.y);
			Tooltip.popup.style.left = xy.x;
			Tooltip.popup.style.top = xy.y;
			if(Tooltip._shadow) Tooltip._shadow.syncPosition();
		}
	},

	show: function()
	{
		if(!this.popup || !this.element) return;
		if(this.element.offsetWidth == 0 && this.element.offsetHeight == 0) { // FWUI-1025
			this.element = null;
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
			// Reinset vml elements.
			var h = popup.offsetHeight;
			popup.removeNode(true);
			var fill = popup.firstChild;
			fill.removeNode(true);
			popup.insertAdjacentElement("afterbegin", fill);
			popup.arcsize = (20 / h) * 0.1;
			document.body.appendChild(this.popup);
			this.popup.style.filter = "progid:dximagetransform.microsoft.fade";
		}
		
		var xy = this.correctXY(popup, this.x, this.y);
		popup.style.left = xy.x;
		popup.style.top = xy.y;
		
		popup.style.zIndex = top.__ontopZ++;
	
		if(this.element.currentStyle["xl--tooltip-position"] != "still") this.popupMoving = true;

		if(popup.filters[0]) 
		{
		    var duration = this.element.currentStyle["xl--blend-duration"];
		    if(!duration) duration = 300;
			popup.filters[0].duration = duration / 1000;
			popup.filters[0].Apply();
		}	
		popup.style.visibility = "visible";
		if(this._shadow) this._shadow.show();
		if(popup.filters[0] && duration > 0) popup.filters[0].Play();
	},

	correctXY: function(popup, x, y)
	{
		var doc = document;
		
		var b = y + popup.offsetHeight + 4 - doc.body.scrollTop; // 4 == shadow
		var r = x + popup.offsetWidth + 4 - doc.body.scrollLeft; 
	
		if(r > doc.body.clientWidth) x = x - r + doc.body.clientWidth;
		if(b > doc.body.clientHeight) y = y - b + doc.body.clientHeight;
	
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
		if(this._shadow) this._shadow.hide();
		if(this.popupMoving) this.popupMoving = false;
		if(this.elenent) {
			this.element.detachEvent("onmousemove", this._element_onmousemove);
			this.element = null;
		}
	}
}
