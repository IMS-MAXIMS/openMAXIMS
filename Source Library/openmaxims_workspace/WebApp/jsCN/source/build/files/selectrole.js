/*
	v. 2.0.1
	+ vista
*/
function CN_selectrole()
{
	this._lockMode = false;
	this._jsObjects = [];
}
var proto = CN_selectrole.prototype;

proto._createActionImage = function(black)
{
	var img;
	if(black)
	{
		img = document.createElement("span");
		img.style.display = "inline-block";
		img.style.width = "22px";
		img.style.height = "22px";
		img.style.backgroundImage = "url(" + CNFormManager.themeImagesPath + "square-button-set.gif)";
		img.style.backgroundRepeat = "no-repeat";
		img.style.backgroundPosition = "0px 0px";
		Event.nativeAdd(img, "mouseenter", function() { if(!img.disabled) img.style.backgroundPosition = "-22px 0px"; });
		Event.nativeAdd(img, "mouseleave", function() { img.style.backgroundPosition = "0px 0px"; });
		Event.nativeAdd(img, "mousedown", function() { if(!img.disabled) img.style.backgroundPosition = "-44px 0px"; });
		Event.nativeAdd(img, "mouseup", function() { if(!img.disabled) img.style.backgroundPosition = "-22px 0px"; });
	}
	else
	{
		img = document.createElement("img");
		img.src = CNFormManager.themeImagesPath + "round-button.gif";
		Event.nativeAdd(img, "mouseenter", function() { if(!img.disabled) img.src = CNFormManager.themeImagesPath + "hover-round-button.gif"; });
		Event.nativeAdd(img, "mouseleave", function() { img.src = CNFormManager.themeImagesPath + "round-button.gif"; });
		Event.nativeAdd(img, "mousedown", function() { if(!img.disabled) img.src = CNFormManager.themeImagesPath + "down-round-button.gif"; });
		Event.nativeAdd(img, "mouseup", function() { if(!img.disabled) img.src = CNFormManager.themeImagesPath + "hover-round-button.gif"; });
	}
	return img;
}

proto.createElement = function(node, parentElement)
{
	var l = (function(){ var el = document.createElement("div"); el.className = 'cn_selectrole'; return el; })();
	parentElement.appendChild(l);
	
	this.element = l;
	l.jsObject = this;
	
	this._buildContent(node);
	this._show();	
	
	return l;
} 

proto._buildContent = function(node)
{
	$("__loginChrome").style.display = "block";
	
	var outerDiv = (function(){ var el = document.createElement("div"); el.className = 'outerDiv'; return el; })(); // Anchor div.
	this.element.appendChild(outerDiv);
	
	var frameCont = (function(){ var el = document.createElement("div"); el.className = 'frameCont'; return el; })();
	outerDiv.appendChild(frameCont);
	
	frameCont.innerHTML = $("__plainBG").innerHTML;
	var frame = frameCont.firstElementChild;
	frame.style.visibility = "hidden";
	
	this._contentDiv = (function(){ var el = document.createElement("div"); el.className = 'contentDiv'; return el; })();
	frameCont.appendChild(this._contentDiv);

	this._showCombo(node);
	
	var img;
	if(CNFormManager.subTheme == "black") {
		img = this._createActionImage(true);

		var siteLogo = $("__siteLogo");
		siteLogo.style.width = "34px";
		siteLogo.style.height = "37px";	
		siteLogo.style.backgroundSize = "100% 100%";
		siteLogo.style.objectFit = "fill";
	} else {
		img = this._createActionImage(false);
	}

	img.tabIndex = 4; // After locations combo.
	img.className = "imgButton";
	this._contentDiv.appendChild(img);
	Event.add(img, "click", this, this._img_onclick);
	
	var logoDiv = (function(){ var el = document.createElement("div"); el.className = 'selectRoleLogo'; return el; })();
	this._contentDiv.appendChild(logoDiv);
	
	
	
	Event.add(this.element, "keypress", this, this._element_onkeypress);	
	
	var messageNode = Util.xmlSelectSingleNode(node, "message");
	if(messageNode) alert(Util.xmlText(messageNode));
}

proto._show = function()
{
	var frameCont = this.element.firstElementChild.firstElementChild;

	var frame = frameCont.firstElementChild;
	frame.style.opacity = "0";
	frame.style.visibility = "inherit";
	frame.style.transition = "opacity .5s";
	frame.style.opacity = "1";	
	AnimVistaFadeResize(frameCont, 50, 15);	
	this._combo.element.focus();
}

proto._img_onclick = function()
{
	this._send();
}

proto._send = function()
{
	if(this._combo.get_selectedIndex() == 0)
	{
		alert("Please select role");
		return;
	}
	this.formManager.postData(this.element);
}

proto.loadData = function(node)
{
}

proto.storeData = function(xmldoc)
{
	var fragment = xmldoc.createDocumentFragment();
	var node = xmldoc.createElement("selectRoleEvent");
	fragment.appendChild(node);
	node.setAttribute("roleID", this._combo.getValue());
	
	var rootEl = this.formManager._getStoredLocationsXML(true);
	if(rootEl) 
	{
		fragment.appendChild(rootEl);
	}
	return fragment;
}

proto.unload = function()
{
	$("__loginChrome").style.display = "none";
	CNFormManager.destroyJSObjects(this._jsObjects);
}


proto._element_onkeypress = function(ev)
{
	if(Event.keyValue(ev) != 13) return;
	Util.cancelEvent(ev);
	this._send();
}

proto._showCombo = function(node)
{
	this._combo = new CN_combobox();
	this._jsObjects.push(this._combo);

	var comboEl = this._combo.createElement(Util.wrapIntoNode({}), this._contentDiv);
	this._combo.set_tabIndex(3);

	var nodes = Util.xmlSelectNodes(node, "role");
	var options = [];
	options.push({html: "<i class='comboValue'>Please select role</i>"});

	for(var i = 0; i < nodes.length; i++)
	{
		var node = nodes[i];
		var option = {text: String(Util.xmlText(node)), value: String(node.getAttribute("id"))};
		options.push(option);
	}
	
	this._combo.initData(options);
	this._combo.set_selectedIndex(0, true);
}
proto = null;

