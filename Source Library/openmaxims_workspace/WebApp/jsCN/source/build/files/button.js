/*
	v. 2.0.3
	+ handleEvent based event handlers.
	+ vista focus support.
*/
function CN_button()
{
	this.formManager = null;
	this._disabled = false;
	this.validator = true;
	this.initiateUpload = false; // Used by formManager.
}
var proto = CN_button.plainThemeProto = {};
var vproto = CN_button.vistaThemeProto = {};

CN_button.setTheme = function(themeName)
{
	this._deinitVista();
	if(CNFormManager.vista) 
	{
		this.prototype = this.vistaThemeProto;
		this._initVista();
	}
	else 
	{
		this.prototype = this.plainThemeProto;
	}
}

proto.createElement = function(node, parentElement)
{
	var l = document.createElement("button");
	parentElement.appendChild(l);

	this.clicked = false;
	
	this.element = l;
	l.jsObject = this;

	l.className = "cn_button";

	var span = document.createElement("span");
	l.appendChild(span);
	
	Event.add(l, "mouseenter", this, _CN_button_onmouseenter);
	Event.add(l, "mouseleave", this, _CN_button_onmouseleave);
	Event.add(l, "mousedown", this, this._onmousedown);
	Event.add(l, "click", this, _CN_button_onclick);
	Event.add(l, "keypress", this, CNUtil.cancelBubble);
	
	if(node.getAttribute("validator") == "false") this.validator = false;
	
	return l;
}

proto._onmousedown = function()
{
    if(Event.current().button != 0) return;
	
	var jso = CNUtil.dispatchObject();
	if(jso && jso.formManager) jso.formManager.waitForButtonClick();	
}

function _CN_button_onmouseenter()
{
	var l = Util.findByClassName(Util.eventTarget(), "cn_button");
	if(!l) return;
	
	var color = Util.getStyle(l, "xl--hover-border-color");
	if(color) l.style.borderColor = color;

	//if(CNFormManager.currentThemeName == "blue") 
	l.style.textDecoration = "underline";
} 

function _CN_button_onmouseleave()
{
	var l = Util.findByClassName(Util.eventTarget(), "cn_button");
	if(!l) return;

	l.style.borderColor = "";
	//if(CNFormManager.currentThemeName == "blue") 
	l.style.textDecoration = "";
} 

function _CN_button_onclick()
{
	if(CNFormManager.vista) _CN_button_onmouseleave();
	var jso = Util.dispatchObject();
	if(jso) jso.doClick();
} 

proto.doClick = vproto.doClick = function()
{
	if(this.clicked
	|| this._disabled || this.element.disabled
	|| Util.getStyle(this.element, "display") == "none" 
	|| Util.getStyle(this.element, "visibility") == "hidden") return false;

	if(this.formManager) this.formManager.waitForButtonClick();

	try
	{
		this.element.focus();
	}
	catch(e){}
	this.clicked = true;
	if(this.formManager)
	{
		this.formManager.buttonClicked();	
		if(!this.formManager.postData(this.element))
		{
			// Reset button state on validation error.
			this.clicked = false;
			//CNUtil.cancelEvent();
		}
	}
	return true;
}

proto.loadData = vproto.loadData = function(node)
{
   	var attr = node.getAttribute("tooltip");
	if(attr != null) 
	{
		if(!this.element.tipText) Tooltip.attach(this.element, String(attr));
		else this.element.tipText = String(attr);
		
		this._handleDisabledState();
	}

	var backgroundColor = node.getAttribute("backgroundColor");
	if(backgroundColor)
	{	
		this.element.style.backgroundColor = backgroundColor;	
		this.element.style.borderColor = "#316AC5";		
	}
	else
	{
		this.element.style.backgroundColor = "";	
		this.element.style.borderColor = "";	
	}
	
	var textColor = node.getAttribute("textColor");
	if(textColor)
	{
		var textSpan = this._getTextElement();
		textSpan.style.color = textColor;				
	}
	else
	{
		var textSpan = this._getTextElement();
		textSpan.style.color = "#000000";
	}	
	
	this._setImage(node);
	var textAttr = node.getAttribute("value");
	if(textAttr) 
	{
		var textSpan = this._getTextElement();
		var lastNode = textSpan.lastChild;
		if(lastNode && lastNode.nodeType == 3) lastNode.data = String(textAttr);
		else textSpan.appendChild(document.createTextNode(String(textAttr)));
		
		
		
		if(CNFormManager.vista) 
		{
			textSpan.style.paddingTop = Math.max(this.element.offsetHeight - textSpan.offsetHeight, 0) / 2 + 2;
		}	
	}
	
	this.initiateUpload = node.getAttribute("uploads") == "true";
}

proto._setImage = vproto._setImage = function(node)
{
	var attr = node.getAttribute("img");
	if(attr === null) return;
	this._setImageCore(String(attr), node.getAttribute("imgWidth"), node.getAttribute("imgHeight"));
}

proto._setImageCore = vproto._setImageCore = function(src, width, height, align)
{
	var textEl = this._getTextElement();
	var imgEl = textEl.firstChild;
	if(src == "")
	{
		if(imgEl && imgEl.tagName == "IMG") textEl.removeChild(imgEl);
	}
	else
	{
		if(imgEl && imgEl.tagName == "IMG") 
		{
			imgEl.src = src;
		}
		else
		{
			imgEl = document.createElement("img");
			imgEl.align = "absmiddle";
			textEl.insertBefore(imgEl, textEl.firstChild);
			textEl.style.lineHeight = "100%";
			//imgEl.style.marginRight = 4;
			imgEl.src = src;
		}
		
		if(width) imgEl.style.width = width + "px";
		if(height) imgEl.style.height = height + "px";
	}
}




proto._getTextElement = function()
{
	return this.element.firstChild;
}

proto.validateLoading = vproto.validateLoading = function()
{
	if(this.formManager.defaultButton == this 
		&& this.formManager.changeFocus
		&& Util.getStyle(this.element, "visibility") != "hidden")
	{
		try
		{
			this.element.focus();
		}
		catch(ex)
		{
		}
	}
}

proto.storeData = vproto.storeData = function(xmldoc)
{
	// NOTE: button stores itself only if it's clicked.
	if(!this.clicked) return;
	this.clicked = false;

	var node = xmldoc.createElement("button");
	return node;
}

proto.set_disabled = function(value)
{
	this._disabled = this.element.disabled = value;
	this._handleDisabledState();
}

proto._handleDisabledState = function()
{
	if(this.element.tipText || this.element.tipText == "")
	{
		if(this._disabled)
		{
			// Make transparent layer.
			if(!this._tooltipLayer)
			{
				this._tooltipLayer = document.createElement("div");
				this._tooltipLayer.style.cssText = "background: white; opacity: 0; position: absolute; top: 0; left: 0; width: 100%; height: 100px";
				this.element.appendChild(this._tooltipLayer);
				Tooltip.attach(this._tooltipLayer, this.element.tipText);
			}
			else
			{
				this._tooltipLayer.style.display = "block";
				this._tooltipLayer.tipText = this.element.tipText;
			}
		}
		else if(this._tooltipLayer) this._tooltipLayer.style.display = "none";
	}
}

CN_button._deinitVista = function()
{
	CN_button._buttonTemplate = null;
}

CN_button._initVista = function()
{
	CN_button._buttonTemplate = $("__vistaButtonTemplate");
}


vproto.createElement = function(node, parentElement)
{
	var l = CN_button._buttonTemplate.cloneNode(true);
	parentElement.appendChild(l);

	this.clicked = false;
	
	this.element = l;
	l.jsObject = this;

	if(node.getAttribute("validator") == "false") this.validator = false;

	Event.add(l, "mouseenter", this, this.button_onmouseenter);
	Event.add(l, "mouseleave", this, this.button_onmouseleave);
	Event.add(l, "mousedown", this, this.button_onmousedown);
	Event.add(l, "mouseup", this, this.button_onmouseup);
	Event.add(l, "click", this, this.button_onclick);
	Event.add(l, "keypress", this, this.button_onkeypress);
	return l;
}

vproto._getTextElement = function()
{
	return this.element.lastChild;
}

vproto.button_onmouseenter = function()
{
	if(this._disabled) return;
	var frame = this.element.firstChild;

	if(ThemeNonCSSStyles.animateButtons) {

	}
	this.element.className = "cn_button cn_button_hover";
	frame.children[2].firstChild.src = 
		frame.children[3].firstChild.src = CNFormManager.themeImagesPath + "hover-button-bg.gif";
	if(ThemeNonCSSStyles.animateButtons) {
	}
}

vproto.button_onmouseleave = function()
{
	if(this._disabled) return;
	var frame = this.element.firstChild;

	this.element.className = "cn_button";
	frame.children[2].firstChild.src = 
	frame.children[3].firstChild.src = CNFormManager.themeImagesPath + "button-bg.gif";

}

vproto.button_onmousedown = function()
{
	if(this._disabled || Event.current().button != 0) return;
	if(this.formManager) this.formManager.waitForButtonClick();

	var frame = this.element.firstChild;
	if(ThemeNonCSSStyles.animateButtons) {

	}
	this.element.className = "cn_button cn_button_down";
	frame.children[2].firstChild.src = 
		frame.children[3].firstChild.src = CNFormManager.themeImagesPath + "down-button-bg.gif";
	if(ThemeNonCSSStyles.animateButtons) {
	}
}

vproto.button_onmouseup = function()
{
	if(this._disabled || Event.current().button != 0) return;
	this.button_onmouseenter();
}

vproto.button_onclick = function()
{
	if(this._disabled) return;
	_CN_button_onclick();
}
vproto.button_onkeypress = function()
{
	if(this._disabled || (Event.keyValue(Event.current())) != 13) return;
	_CN_button_onclick();
}

vproto._handleDisabledState = Util.nop;


vproto.set_disabled = function(val)
{
	this._disabled = val;
	var frame = this.element.firstChild;

	if(val)
	{
		this.element.className = "cn_button cn_button_disabled";
		frame.children[2].firstChild.src = 
			frame.children[3].firstChild.src = CNFormManager.themeImagesPath + "disabled-button-bg.gif";
	}
	else
	{
		this.element.className = "cn_button";
		frame.children[2].firstChild.src = 
			frame.children[3].firstChild.src = CNFormManager.themeImagesPath + "button-bg.gif";
	}
}
vproto.focus = function()
{
	var bgImg = this.element.firstChild.children[3].firstChild;
	bgImg.focus();
	
}
vproto.set_tabIndex = function(ti)
{
	var bgImg = this.element.firstChild.children[3].firstChild;
	bgImg.tabIndex = ti;
	
	if(ti > 0)
	{
		if(!this._focusAttached)
		{
			this._focusAttached = true;
			Event.add(bgImg, "focus", this, this._bgIMG_onfocus);
			Event.add(bgImg, "blur", this, this._bgIMG_onblur);
		}
	}
	else
	{
		if(this._focusAttached)
		{
			this._focusAttached = false;
			Event.del(bgImg, "focus", this, this._bgIMG_onfocus);
			Event.del(bgImg, "blur", this, this._bgIMG_onblur);
		}
	}
}
vproto._bgIMG_onfocus = function()
{
	var b = Util.findByClassName(Util.eventTarget(), "cn_button");
	b.firstChild.children[1].firstChild.style.background = "#47D6FA";
}
vproto._bgIMG_onblur = function()
{
	var b = Util.findByClassName(Util.eventTarget(), "cn_button");
	b.firstChild.children[1].firstChild.style.background = "";
}

/*function AnimVistaButtonFadeout(l)
{
	this.l = l;
	this._from = [0xA7D9F5, 0xBEE6FD, 0xD9F0FC, 0xEAF6FD]
	this._to = [0xCFCFCF, 0xDDDDDD, 0xEBEBEB, 0xF2F2F2]
}
AnimVistaButtonFadeout.prototype = new AnimVistaFadeoutBase();
AnimVistaButtonFadeout.prototype.apply = function(ar)
{
	this.l.colors.value = "0% #" + ar[0].toString(16) + ",50% #" + ar[1].toString(16) + ",50% #" + ar[2].toString(16) + ", 100% #" + ar[3].toString(16);
}*/
