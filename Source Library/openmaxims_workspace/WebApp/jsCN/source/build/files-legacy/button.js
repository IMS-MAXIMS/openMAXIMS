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
	
	l.attachEvent("onmouseenter", _CN_button_onmouseenter);
	l.attachEvent("onmouseleave", _CN_button_onmouseleave);
	l.attachEvent("onmousedown", this._onmousedown);
	l.attachEvent("onclick", _CN_button_onclick);
	l.attachEvent("onkeypress", CNUtil.cancelBubble);
	
	if(node.getAttribute("validator") == "false") this.validator = false;
	
	return l;
}

proto._onmousedown = function()
{
    if(event.button != 1) return;
	
	var jso = CNUtil.dispatchObject();
	if(jso && jso.formManager) jso.formManager.waitForButtonClick();	
}

function _CN_button_onmouseenter()
{
	var l = event.srcElement;
	if(!l || !l.currentStyle) return;
	
	var color = l.currentStyle["xl--hover-border-color"];
	if(color) l.runtimeStyle.borderColor = l.currentStyle["xl--hover-border-color"];

	//if(CNFormManager.currentThemeName == "blue") 
	l.runtimeStyle.textDecoration = "underline";
} 

function _CN_button_onmouseleave()
{
	var l = event.srcElement;

	l.runtimeStyle.borderColor = "";
	//if(CNFormManager.currentThemeName == "blue") 
	l.runtimeStyle.textDecoration = "";
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
	|| this.element.currentStyle.display == "none" 
	|| this.element.currentStyle.visibility == "hidden") return false;

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
		this.element.filters[0].Enabled = false;
		this.element.style.backgroundColor = backgroundColor;	
		this.element.style.borderColor = "#316AC5";		
	}
	else
	{
		this.element.style.backgroundColor = "";
		this.element.filters[0].Enabled = true;	
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
			//if(!height) imgEl.attachEvent("onload", this._img_onload);
			imgEl.src = src;
		}
		else
		{
			imgEl = document.createElement("<img align=absmiddle>");
			textEl.insertAdjacentElement("afterbegin", imgEl);
			textEl.style.lineHeight = "100%";
			//imgEl.style.marginRight = 4;
			//if(!height) imgEl.attachEvent("onload", this._img_onload);
			imgEl.src = src;
		}
		
		if(width) imgEl.style.width = width + "px";
		if(height) imgEl.style.height = height + "px";
	}
}

/*proto._img_onload = vproto._img_onload = function()
{
	var img = event.srcElement;
	var jso = Util.dispatchObject();
	img.detachEvent("onload",  jso._img_onload);
	
	alert(jso.element.offsetHeight)
	img.style.top = (jso.element.offsetHeight - img.offsetHeight) / 2;
}*/


proto._getTextElement = function()
{
	return this.element.firstChild;
}

proto.validateLoading = vproto.validateLoading = function()
{
	if(this.formManager.defaultButton == this 
		&& this.formManager.changeFocus
		&& this.element.currentStyle.visibility != "hidden")
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
				this._tooltipLayer = document.createElement("<div style='background: white; filter: alpha(opacity=0); position: absolute; top: 0px; left: 0px; width: 100%; height: 100px; '>");
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

	Util.handleEvent(l, "onmouseenter", "button_");
	Util.handleEvent(l, "onmouseleave", "button_");
	Util.handleEvent(l, "onmousedown", "button_");
	Util.handleEvent(l, "onmouseup", "button_");
	Util.handleEvent(l, "onclick", "button_");
	Util.handleEvent(l, "onkeypress", "button_");
	
	l.attachEvent("onselectstart", Util.cancelEvent);

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
		if(frame.filters.length == 0) frame.style.filter = "progid:DXImageTransform.Microsoft.Fade()";
		frame.filters[0].Apply();
	}
	this.element.className = "cn_button cn_button_hover";
	frame.children[2].firstChild.src = 
		frame.children[3].firstChild.src = CNFormManager.themeImagesPath + "hover-button-bg.gif";
	if(ThemeNonCSSStyles.animateButtons) {
		frame.filters[0].Play(.2);
	}
}

vproto.button_onmouseleave = function()
{
	if(this._disabled) return;
	var frame = this.element.firstChild;
	if(frame.filters.length > 0) frame.filters[0].Apply();
	this.element.className = "cn_button";
	frame.children[2].firstChild.src = 
	frame.children[3].firstChild.src = CNFormManager.themeImagesPath + "button-bg.gif";
	if(frame.filters.length > 0) frame.filters[0].Play(.4);

}

vproto.button_onmousedown = function()
{
	if(this._disabled || event.button != 1) return;
	if(this.formManager) this.formManager.waitForButtonClick();

	var frame = this.element.firstChild;
	if(ThemeNonCSSStyles.animateButtons) {
		if(frame.filters.length == 0) frame.style.filter = "progid:DXImageTransform.Microsoft.Fade()";
		frame.filters[0].Apply();
	}
	this.element.className = "cn_button cn_button_down";
	frame.children[2].firstChild.src = 
		frame.children[3].firstChild.src = CNFormManager.themeImagesPath + "down-button-bg.gif";
	if(ThemeNonCSSStyles.animateButtons) {
		frame.filters[0].Play(.1);
	}
}

vproto.button_onmouseup = function()
{
	if(this._disabled || event.button != 1) return;
	this.button_onmouseenter();
}

vproto.button_onclick = function()
{
	if(this._disabled) return;
	_CN_button_onclick();
}
vproto.button_onkeypress = function()
{
	if(this._disabled || event.keyCode != 13) return;
	_CN_button_onclick();
}

vproto._handleDisabledState = Util.nop;


vproto.set_disabled = function(val)
{
	this._disabled = val;
	var frame = this.element.firstChild;
	if(frame.filters.length > 0) frame.filters[0].Stop();
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
			bgImg.attachEvent("onfocus", this._bgIMG_onfocus);
			bgImg.attachEvent("onblur", this._bgIMG_onblur);
		}
	}
	else
	{
		if(this._focusAttached)
		{
			this._focusAttached = false;
			bgImg.detachEvent("onfocus", this._bgIMG_onfocus);
			bgImg.detachEvent("onblur", this._bgIMG_onblur);
		}
	}
}
vproto._bgIMG_onfocus = function()
{
	var b = Util.findByClassName(event.srcElement, "cn_button");
	b.firstChild.children[1].firstChild.style.background = "#47D6FA";
}
vproto._bgIMG_onblur = function()
{
	var b = Util.findByClassName(event.srcElement, "cn_button");
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
