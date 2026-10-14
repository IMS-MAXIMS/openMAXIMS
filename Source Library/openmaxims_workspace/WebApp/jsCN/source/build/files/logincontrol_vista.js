/*
	v. 2.0.1
*/
function CN_logincontrol_vista()
{
	this._lockMode = false;
	this._jsObjects = [];
	this._disabled = false;
	this._salt = "";
}
var proto = CN_logincontrol_vista.prototype;

CN_logincontrol_vista.loginImage = false;

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
	var l = (function(){ var el = document.createElement("div"); el.className = 'cn_logincontrol'; return el; })();
	parentElement.appendChild(l);
	
	this.element = l;
	l.jsObject = this;
	
	this._buildContent();
	
	this._lockMode = node.getAttribute("lock") == "true";
	
	this._showLoginScreen();	
	
	return l;
} 

proto._buildContent = function()
{
	$("__loginChrome").style.display = "block";

	var img = $("__loginImage");
	if(img) img.style.display = CN_logincontrol_vista.loginImage ? "block" : "none";
	
	var outerDiv = (function(){ var el = document.createElement("div"); el.className = 'outerDiv'; return el; })(); // Anchor div.
	this.element.appendChild(outerDiv);
	
	var frameCont = (function(){ var el = document.createElement("div"); el.className = 'frameCont'; return el; })();
	outerDiv.appendChild(frameCont);
	
	frameCont.innerHTML = $("__plainBG").innerHTML;
	var frame = frameCont.firstElementChild;
	frame.style.visibility = "hidden";	
	frame.style.opacity = "0";

	this._contentDiv = (function(){ var el = document.createElement("div"); el.className = 'contentDiv'; return el; })();
	frameCont.appendChild(this._contentDiv);
	this._contentDiv.style.visibility = "hidden";

	var loginContentDiv = (function(){ var el = document.createElement("div"); el.className = 'loginContentDiv'; return el; })();
	this._contentDiv.appendChild(loginContentDiv);

	var focusDiv = (function(){ var el = document.createElement("span"); el.tabIndex = '1'; el.style.width = '1px'; el.style.overflow = 'hidden'; return el; })();
	loginContentDiv.appendChild(focusDiv);	
	
	this._focusDiv = focusDiv;
	
	this._lockDiv = (function(){ var el = document.createElement("div"); el.className = 'lockDiv'; return el; })();
	loginContentDiv.appendChild(this._lockDiv);
	
	this._userBox = (function(){ var el = document.createElement("input"); el.type = 'text'; el.className = 'loginBox untouched'; el.tabIndex = '2'; return el; })();
	this._userBox._isEmpty = true;
	this._userBox.value = "User";
	loginContentDiv.appendChild(this._userBox);
	VistaSupport.attachToTextBox(this._userBox);
	Event.add(this._userBox, "focus", this, this._userBox_onfocus);
	Event.add(this._userBox, "blur", this, this._userBox_onblur);
	Event.add(this._userBox, "keypress", this, this._userBox_onkeypress);
	
	this._fakePasswordBox = (function(){ var el = document.createElement("input"); el.type = 'text'; el.className = 'passwordBox untouched'; el.tabIndex = '3'; return el; })();
	this._fakePasswordBox.value = "Password";
	loginContentDiv.appendChild(this._fakePasswordBox);
	VistaSupport.attachToTextBox(this._fakePasswordBox);
	Event.add(this._fakePasswordBox, "focus", this, this._fakePasswordBox_onfocus);
	
	this._passwordBox = (function(){ var el = document.createElement("input"); el.type = 'password'; el.className = 'passwordBox'; el.tabIndex = '3'; return el; })();
	this._passwordBox.style.display = "none";
	loginContentDiv.appendChild(this._passwordBox);
	VistaSupport.attachToTextBox(this._passwordBox);
	Event.add(this._passwordBox, "blur", this, this._passwordBox_onblur);

	var img;
	if(CNFormManager.subTheme == "black") {
		img = this._createActionImage(true);

		var siteLogo = document.getElementById("__siteLogo");
		siteLogo.style.width = "1px";
		siteLogo.style.backgroundSize = "contain";
		siteLogo.style.objectFit = "contain"; // Reset logo back to image size.
	} else {
		img = this._createActionImage(false);
	}
	
	img.tabIndex = 4; // After locations combo.
	img.className = "imgButton";
	loginContentDiv.appendChild(img);
	Event.add(img, "click", this, this._img_onclick);
	this._imgButton = img;
	
	if(CNFormManager.strings['loginCaption']) {
		$('__loginLabel').innerHTML = $('__loginLabelShade').innerHTML = CNFormManager.strings['loginCaption'];
	}
	if(CNFormManager.strings['loginLogo']) {
		var loginLogo = $('__loginLogoIMG');
		if(loginLogo.tagName == "IMG") loginLogo.src = CNFormManager.strings['loginLogo'];
		else loginLogo.style.backgroundImage = "url(" + CNFormManager.strings['loginLogo'] + ")";
	}
	
	Event.add(this.element, "keypress", this, this._element_onkeypress);	
}

proto.set_disabled = function(value)
{
	if(value == this._disabled) return;
	this._disabled = value;
	
	this._userBox.readOnly = this._fakePasswordBox.readOnly = this._passwordBox.readOnly = value;
	if(this._selectLocationCombo) this._selectLocationCombo.set_disabled(value);
	this._imgButton.disabled = value;
}

proto._showLoginScreen = function()
{
	if(this._lockMode)
	{
		this._lockDiv.style.display = "inline";
	}
	else
	{	
		var stored = false;
		try 
		{
			var storedRoot = this.formManager._getStoredLocationsXML();
			var storedNodes = Util.xmlSelectNodes(storedRoot, "location");
			if(storedNodes.length > 0) 
			{							  
				this._showLocationCombo(storedNodes);
				this.element.className = "cn_logincontrol cn_logincontrol_big";
				stored = true;
			}
		}
		catch(e){}
		if(!stored) this.element.className += " cn_logincontrol_no_stored";
	}	
}

// Actually shows and animates control.
proto.validateLoading = function()
{
	var frameCont = this.element.firstElementChild.firstElementChild;
	var self = this;
	//this._contentDiv
	setTimeout(function()
	{
		self._contentDiv.style.visibility = "inherit";
		
		var frame = frameCont.firstElementChild;
		frame.style.opacity = "0";
		frame.style.visibility = "inherit";
		frame.style.transition = "opacity .5s";
		frame.style.opacity = "1";	
		self._focusDiv.focus();
		AnimVistaFadeResize(frameCont, 60, 10);	
		
		if(CNFormManager.subTheme == "black") {		
			setTimeout(function() {
				var siteLogo = document.getElementById("__siteLogo");
				if(siteLogo) {
					var w = siteLogo.offsetWidth,
						h = siteLogo.offsetHeight;
					siteLogo.style.width = w + "px";
					siteLogo.style.height = h + "px";
					siteLogo.style.backgroundSize = "100% 100%";
					siteLogo.style.objectFit = "fill";
					
					Animator.start(new AnimResize(siteLogo, w / 2.5, h / 2.5));
				}
			}, 3000);
		}
	}, 0);
}

proto._createSelectLocationCombo = function()
{
	this._selectLocationCombo = new CN_combobox();
	this._jsObjects.push(this._selectLocationCombo);

	var comboEl = this._selectLocationCombo.createElement(Util.wrapIntoNode({}), this._contentDiv);
	this._selectLocationCombo.set_tabIndex(3);
}

proto._showLocationCombo = function(storedNodes)
{
	if(!this._selectLocationCombo) this._createSelectLocationCombo();	
	this._fillSelectLocationCombo(storedNodes);
}

proto._fillSelectLocationCombo = function(storedNodes)
{
	var options = [];
	for(var i = 0; i < storedNodes.length; i++)
	{
		var option = {text: Util.xmlText(storedNodes[i])};
		options.push(option);
	}
	
	options.push({text: "<Not listed>"});

	this._selectLocationCombo.initData(options);
	this._selectLocationCombo.set_selectedIndex(0, true);
}

proto._img_onclick = function()
{
	this.loginButtonClick();
}
proto._userBox_onfocus = function(ev)
{
	var box = Util.eventTarget(ev);
	var jso = Util.dispatchObject();
	if(jso._disabled || !box._isEmpty) return;
	box._emptyValue = box.value;
	box.value = "";
	box.select();
	Util.removeClass(box, "untouched");
}
proto._userBox_onkeypress = function(ev)
{
	var jso = Util.dispatchObject();
	if(jso._disabled) return;
	
	var box = Util.eventTarget(ev);	
	box._isEmpty = false;
}
proto._userBox_onblur = function(ev)
{
	var jso = Util.dispatchObject();
	if(jso._disabled) return;

	var box = Util.eventTarget(ev);
	if(box.value == "") 
	{	
		box.value = box._emptyValue;
		box.className += " untouched";
		box._isEmpty = true;
	}
	else box._isEmpty = false;
}
proto._fakePasswordBox_onfocus = function(ev)
{
	var jso = Util.dispatchObject();
	if(jso._disabled) return;
	
	var box = Util.eventTarget(ev);
	jso._passwordBox.style.display = "inline";
	jso._passwordBox.focus();
	jso._passwordBox.select();
	box.style.display = "none";
}
proto._passwordBox_onblur = function(ev)
{
	var jso = Util.dispatchObject();
	if(jso._disabled) return;
	
	var box = Util.eventTarget(ev);
	if(box.value == "")
	{
		jso._fakePasswordBox.style.display = "inline";
		box.style.display = "none";		
	}
}

proto.loadData = function(node)
{
	this._salt = node.getAttribute("salt");

	var message = Util.xmlSelectSingleNode(node, "message");
	if(message) {
		this._showMessage(message);
	}
}

proto._showMessage = function(node) {
	//redHeader
	var redHeader = this._redHeader = $(CNFormManager.subTheme == "black" ? '__vistaFormRedHeaderBG' : '__si_formRedHeaderBG').cloneNode(true);
	this.element.firstElementChild.appendChild(redHeader);
	redHeader.className = "messageRedHeader";

	var div = document.createElement("div");
	this.element.firstElementChild.appendChild(div);
	div.className = "messageDiv";
	div.innerHTML = Util.xmlInnerString(node);

	var obj = this;
	setTimeout(function() {
		obj._redHeader.style.display = "block";
		div.style.visibility = "inherit";
		Animator.start(new AnimMove(obj._redHeader, obj._redHeader.offsetLeft, -div.offsetHeight - 10), 
			new AnimMove(div, 0, -div.offsetHeight));
	}, 1000);

}

proto.storeData = function(xmldoc)
{
	if(this._lockMode)
	{
		var node = xmldoc.createElement("unlock");
		node.setAttribute("name", this._userBox.value);
		node.setAttribute("pass", this._encrypt(this._passwordBox.value));
		
		return node;
	}

	var fragment = xmldoc.createDocumentFragment();
	var node = xmldoc.createElement("loginEvent");
	node.setAttribute("name", this._userBox.value);
//	node.setAttribute("pass", this._passwordBox.value);
	node.setAttribute("pass", this._encrypt(this._passwordBox.value));

	fragment.appendChild(node);

	var rootEl = this.formManager._getStoredLocationsXML(true);
	if(rootEl) 
	{
		if(this._selectLocationCombo) 
		{
			var storedNodes = Util.xmlSelectNodes(rootEl, "location");
			
			var ix = this._selectLocationCombo.get_selectedIndex();
			
			if(ix >= storedNodes.length) ix = -1; 
			rootEl.setAttribute("selection", ix);
		}
		fragment.appendChild(rootEl);
	}
	return fragment;
}

proto._encrypt = function(data) {
	if(!this._salt) return data;
	return Util.SHA1.compute(data + this._salt);
}

proto.unload = function()
{
	$("__loginChrome").style.display = "none";
	CNFormManager.destroyJSObjects(this._jsObjects);
	
	this.formManager.restartAutoLock();
}


proto._element_onkeypress = function(ev)
{
	this.element_onkeypress(ev);
}
proto.element_onkeypress = function(ev)
{
	if(Event.keyValue(ev) != 13) return;
	CNUtil.cancelEvent(ev);
	this.loginButtonClick();
}

proto.loginButtonClick = function()
{
	if(this._disabled) return;
	if(!this._userBox.value || this._userBox._isEmpty)
	{
		this._userBox.style.borderColor = "red";
		return;
	}
	this._userBox.style.borderColor = "";
	this.formManager.postData(this.element);
}
proto = null;
