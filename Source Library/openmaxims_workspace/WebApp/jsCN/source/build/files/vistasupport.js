function VistaSupport(){};
(function() {


	function _imageSetButton_onmouseenter() {
		var span = event.srcElement;
		if(span.disabled || span._disabled) return;
		VistaSupport.setImageSetState(span, "hover");
	}
	function _imageSetButton_onmouseleave() {
		var span = event.srcElement;
		if(span.disabled || span._disabled) return;
		VistaSupport.setImageSetState(span, "normal");
	}
	function _imageSetButton_onmousedown() {
		var span = event.srcElement;
		if(span.disabled || span._disabled || span._noClick) return;
		VistaSupport.setImageSetState(span, "pressed");
	}
	function _imageSetButton_onmouseup() {
		_imageSetButton_onmouseenter();
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

		span.attachEvent("onmouseenter", _imageSetButton_onmouseenter);
		span.attachEvent("onmouseleave", _imageSetButton_onmouseleave);
		span.attachEvent("onmousedown", _imageSetButton_onmousedown);
		span.attachEvent("onmouseup", _imageSetButton_onmouseup);
	
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
/*	if(l._anim) Animator.stop(l._anim);
	var anim = l._anim = new AnimVistaImgTrans(l, toSrc);
	Animator.start(anim);*/
	
	if(ThemeNonCSSStyles.useImageTrans) {
		var fs = l.filters;
		var f;
		if(fs && fs.length > 0)
		{
			f = fs[fs.length - 1];
			f.Stop();
		}
		else
		{
			l.runtimeStyle.filter = "progid:DXImageTransform.Microsoft.Fade()";
			f = l.filters[0];
		}
	
		f.Apply();
		l.src = toSrc;
		f.Play(fast ? .2 : .4);
	} else {
		l.src = toSrc;
	}
}

VistaSupport.createImageButton = function(src, width, height)
{
	var img = document.createElement("img");
	if(width) img.width = width;
	if(height) img.height = height;
	img._src = src;
	img.src = CNFormManager.themeImagesPath + src;
	img.attachEvent("onmouseenter", VistaSupport._imageButton_onmouseenter);
	img.attachEvent("onmouseleave", VistaSupport._imageButton_onmouseleave);
	img.attachEvent("onmousedown", VistaSupport._imageButton_onmousedown);
	img.attachEvent("onmouseup", VistaSupport._imageButton_onmouseup);
	return img;
}
VistaSupport._imageButton_onmouseenter = function()
{
	var img = event.srcElement;
	if(img.disabled || img._disabled) return;
	img._hover = true;
	if(img._src) VistaSupport.imageTrans(img, CNFormManager.themeImagesPath + "hover-" + img._src);
}
VistaSupport._imageButton_onmouseleave = function()
{
	var img = event.srcElement;
	if(img.disabled || img._disabled) return;
	img._hover = false;
	if(img._src) VistaSupport.imageTrans(img, CNFormManager.themeImagesPath + img._src);
}
VistaSupport._imageButton_onmousedown = function()
{
	var img = event.srcElement;
	if(img.disabled || img._disabled) return;
	img._down = true;
	if(img._src) VistaSupport.imageTrans(img, CNFormManager.themeImagesPath + "down-" + img._src, true);
}
VistaSupport._imageButton_onmouseup = function()
{
	var img = event.srcElement;
	if(img.disabled || img._disabled) return;
	img._down = false;
	VistaSupport._imageButton_onmouseenter();
}

VistaSupport.attachToTextBox = function(l)
{
	l.attachEvent("onmouseenter", this._textbox_onmouseenter);
	l.attachEvent("onmouseleave", this._textbox_onmouseleave);
	l.attachEvent("onfocus", this._textbox_onmouseenter);
	l.attachEvent("onblur", this._textbox_onmouseleave);	
}
VistaSupport._textbox_onmouseenter = function()
{
	var l = event.srcElement;
	if(l.disabled || l.readOnly) return;
	if(l._anim) Animator.stop(l._anim);
	l.runtimeStyle.borderColor = ThemeNonCSSStyles.box_borderHoverColors[0];
	l.runtimeStyle.borderTopColor = ThemeNonCSSStyles.box_borderHoverColors[1];
}
VistaSupport._textbox_onmouseleave = function()
{
	var l = event.srcElement;
	if(l.disabled || l.readOnly || document.activeElement == l) return;
	if(ThemeNonCSSStyles.animateBoxes) {
		l._anim = new AnimVistaBoxFadeout(l);
		Animator.start(l._anim);
	} else {
		var ar = ThemeNonCSSStyles.box_borderNormalColors;
		l.runtimeStyle.borderColor = ar[0];
		l.runtimeStyle.borderTopColor = ar[1];
	}
}

VistaSupport.attachToJSCNBox = function(jso)
{
	var l = jso.element;
	l.attachEvent("onmouseenter", this._jscnbox_onmouseenter);
	l.attachEvent("onmouseleave", this._jscnbox_onmouseleave);
	l.attachEvent("onactivate", this._jscnbox_onmouseenter);
	l.attachEvent("ondeactivate", this._jscnbox_onmouseleave);	
}
VistaSupport._jscnbox_onmouseenter = function()
{
	var l = event.srcElement;
	if(l.disabled || l.readOnly) return;
	var jso = Util.dispatchObject();
	if(jso._disabled || jso._readOnly) return;
	if(jso._anim) Animator.stop(jso._anim);

	jso.element.runtimeStyle.borderColor = ThemeNonCSSStyles.box_borderHoverColors[0];
	jso.element.runtimeStyle.borderTopColor = ThemeNonCSSStyles.box_borderHoverColors[1];
}
VistaSupport._jscnbox_onmouseleave = function()
{
	var l = event.srcElement;
	if(l.disabled || l.readOnly || document.activeElement == l) return;
	var jso = Util.dispatchObject();
	if(jso._disabled || jso._readOnly || document.activeElement == jso.element
	|| event.toElement && jso.element.contains(event.toElement)
	|| jso.element.contains(document.activeElement)) return;
	jso._anim = new AnimVistaBoxFadeout(jso.element);
	Animator.start(jso._anim);
}


VistaSupport.createHover = function(backgroundSrc, opacity)
{
	var h = document.createElement("<v:roundrect class='hoverRect'>");
	if(CNFormManager.vista)
	{
		h.arcsize = .15;
		var fill = document.createElement("<v:fill>");
		if(backgroundSrc) 
		{
			fill.type = 'frame';
			fill.src = CNFormManager.themeImagesPath + backgroundSrc; // item-gradient-5.gif
		}
		if(opacity) fill.opacity = opacity + "%";
		h.appendChild(fill);
	}
	else
	{
		h.arcsize = 0;
		h.strokeweight = 1.2;
	}
	h.strokecolor = ThemeNonCSSStyles.hoverRect_strokeColor;
	return h;
}