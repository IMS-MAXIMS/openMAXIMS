function VistaSupport(){};
// Standards-only visual/event helpers. IE activation and VML are not
// part of the 2026 Client Framework runtime.
VistaSupport._listen = function(element, name, handler) {
	if(!element || typeof element.addEventListener != "function") throw new Error("VistaSupport requires addEventListener");
	element.addEventListener(name, handler, false);
};
VistaSupport._target = function(ev) {
	return ev && ev.target;
};
VistaSupport._style = function(element) {
	return element.style;
};
(function() {


	function _imageSetButton_onmouseenter(ev) {
		var span = VistaSupport._target(ev);
		if(span.disabled || span._disabled) return;
		VistaSupport.setImageSetState(span, "hover");
	}
	function _imageSetButton_onmouseleave(ev) {
		var span = VistaSupport._target(ev);
		if(span.disabled || span._disabled) return;
		VistaSupport.setImageSetState(span, "normal");
	}
	function _imageSetButton_onmousedown(ev) {
		var span = VistaSupport._target(ev);
		if(span.disabled || span._disabled || span._noClick) return;
		VistaSupport.setImageSetState(span, "pressed");
	}
	function _imageSetButton_onmouseup(ev) {
		_imageSetButton_onmouseenter(ev);
	}

	VistaSupport.setImageSetState = function(but, state) {
			var ar = but.style.backgroundPosition.split(" ");
		switch(state) {
			case "hover":
				but.style.backgroundPosition = -but.offsetWidth + "px " + ar[1];
				break;
			case "normal":
				but.style.backgroundPosition = "0px " + ar[1];
				break;
			case "pressed":
				but.style.backgroundPosition = -but.offsetWidth * 2 + "px " + ar[1];
				break;
		}

	}

	VistaSupport.createImageSetButton = function(src, width, height, topOffset) {
		topOffset = topOffset || 0;
		var span = document.createElement("span");
		span.style.width = width + "px";
		span.style.height = height + "px";	
		if(src) {
			src = CNFormManager.themeImagesPath + src;
			span.style.backgroundImage = "url('" + src + "')";
		}
		span.style.backgroundRepeat = "no-repeat";
		span.style.backgroundPosition = "0px " + -topOffset +"px";
		span.style.display = "inline-block";

		VistaSupport._listen(span, "mouseenter", _imageSetButton_onmouseenter);
		VistaSupport._listen(span, "mouseleave", _imageSetButton_onmouseleave);
		VistaSupport._listen(span, "mousedown", _imageSetButton_onmousedown);
		VistaSupport._listen(span, "mouseup", _imageSetButton_onmouseup);
	
		return span;
	}
	
	VistaSupport.updateImageSetButton = function(span, src, topOffset) {
		if(src) {
			src = CNFormManager.themeImagesPath + src;
			span.style.backgroundImage = "url('" + src + "')";
		}
		if(topOffset !== null) {
			var ar = span.style.backgroundPosition.split(" ");
			span.style.backgroundPosition = ar[0] + " " + -topOffset + "px";
		}
	}

})();

VistaSupport.imageTrans = function(l, toSrc, fast)
{
	// CSS transitions may animate this assignment; no browser-specific filter
	// API is required.
	l.src = toSrc;
}

VistaSupport.createImageButton = function(src, width, height)
{
	var img = document.createElement("img");
	if(width) img.width = width;
	if(height) img.height = height;
	img._src = src;
	img.src = CNFormManager.themeImagesPath + src;
	VistaSupport._listen(img, "mouseenter", VistaSupport._imageButton_onmouseenter);
	VistaSupport._listen(img, "mouseleave", VistaSupport._imageButton_onmouseleave);
	VistaSupport._listen(img, "mousedown", VistaSupport._imageButton_onmousedown);
	VistaSupport._listen(img, "mouseup", VistaSupport._imageButton_onmouseup);
	return img;
}
VistaSupport._imageButton_onmouseenter = function(ev)
{
	var img = VistaSupport._target(ev);
	if(img.disabled || img._disabled) return;
	img._hover = true;
	if(img._src) VistaSupport.imageTrans(img, CNFormManager.themeImagesPath + "hover-" + img._src);
}
VistaSupport._imageButton_onmouseleave = function(ev)
{
	var img = VistaSupport._target(ev);
	if(img.disabled || img._disabled) return;
	img._hover = false;
	if(img._src) VistaSupport.imageTrans(img, CNFormManager.themeImagesPath + img._src);
}
VistaSupport._imageButton_onmousedown = function(ev)
{
	var img = VistaSupport._target(ev);
	if(img.disabled || img._disabled) return;
	img._down = true;
	if(img._src) VistaSupport.imageTrans(img, CNFormManager.themeImagesPath + "down-" + img._src, true);
}
VistaSupport._imageButton_onmouseup = function(ev)
{
	var img = VistaSupport._target(ev);
	if(img.disabled || img._disabled) return;
	img._down = false;
	VistaSupport._imageButton_onmouseenter(ev);
}

VistaSupport.attachToTextBox = function(l)
{
	VistaSupport._listen(l, "mouseenter", this._textbox_onmouseenter);
	VistaSupport._listen(l, "mouseleave", this._textbox_onmouseleave);
	VistaSupport._listen(l, "focus", this._textbox_onmouseenter);
	VistaSupport._listen(l, "blur", this._textbox_onmouseleave);	
}
VistaSupport._textbox_onmouseenter = function(ev)
{
	var l = VistaSupport._target(ev);
	if(l.disabled || l.readOnly) return;
	if(l._anim) Animator.stop(l._anim);
	VistaSupport._style(l).borderColor = ThemeNonCSSStyles.box_borderHoverColors[0];
	VistaSupport._style(l).borderTopColor = ThemeNonCSSStyles.box_borderHoverColors[1];
}
VistaSupport._textbox_onmouseleave = function(ev)
{
	var l = VistaSupport._target(ev);
	if(l.disabled || l.readOnly || document.activeElement == l) return;
	if(ThemeNonCSSStyles.animateBoxes) {
		l._anim = new AnimVistaBoxFadeout(l);
		Animator.start(l._anim);
	} else {
		var ar = ThemeNonCSSStyles.box_borderNormalColors;
		VistaSupport._style(l).borderColor = ar[0];
		VistaSupport._style(l).borderTopColor = ar[1];
	}
}

VistaSupport.attachToJSCNBox = function(jso)
{
	var l = jso.element;
	VistaSupport._listen(l, "mouseenter", this._jscnbox_onmouseenter);
	VistaSupport._listen(l, "mouseleave", this._jscnbox_onmouseleave);
	// activate/deactivate are IE-only; focusin/focusout retain descendant focus behavior.
	VistaSupport._listen(l, "focusin", this._jscnbox_onmouseenter);
	VistaSupport._listen(l, "focusout", this._jscnbox_onmouseleave);	
}
VistaSupport._jscnbox_onmouseenter = function(ev)
{
	var l = VistaSupport._target(ev);
	if(l.disabled || l.readOnly) return;
	var jso = Util.dispatchObject(ev);
	if(jso._disabled || jso._readOnly) return;
	if(jso._anim) Animator.stop(jso._anim);

	VistaSupport._style(jso.element).borderColor = ThemeNonCSSStyles.box_borderHoverColors[0];
	VistaSupport._style(jso.element).borderTopColor = ThemeNonCSSStyles.box_borderHoverColors[1];
}
VistaSupport._jscnbox_onmouseleave = function(ev)
{
	var l = VistaSupport._target(ev);
	if(l.disabled || l.readOnly || document.activeElement == l) return;
	var jso = Util.dispatchObject(ev);
	if(jso._disabled || jso._readOnly || document.activeElement == jso.element
	|| ev && (ev.relatedTarget || ev.relatedTarget) && jso.element.contains(ev.relatedTarget || ev.relatedTarget)
	|| jso.element.contains(document.activeElement)) return;
	if(ThemeNonCSSStyles.animateBoxes) {
		jso._anim = new AnimVistaBoxFadeout(jso.element);
		Animator.start(jso._anim);
	} else {
		var ar = ThemeNonCSSStyles.box_borderNormalColors;
		jso.element.style.borderColor = ar[0];
		jso.element.style.borderTopColor = ar[1];
	}
}


VistaSupport.createHover = function(backgroundSrc, opacity)
{
	var overlay = document.createElement("div");
	overlay.className = "hoverRect";
	overlay.style.border = (CNFormManager.vista ? "1px" : "1.2px") + " solid " + ThemeNonCSSStyles.hoverRect_strokeColor;
	overlay.style.borderRadius = CNFormManager.vista ? "15%" : "0";
	overlay.style.boxSizing = "border-box";
	if(CNFormManager.vista && backgroundSrc) {
		overlay.style.backgroundImage = "url('" + CNFormManager.themeImagesPath + backgroundSrc + "')";
		if(opacity != null) overlay.style.opacity = opacity / 100;
	}
	return overlay;
}
