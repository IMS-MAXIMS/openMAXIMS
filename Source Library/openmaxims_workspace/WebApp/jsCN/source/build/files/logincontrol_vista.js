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

proto.createElement = function(node, parentElement)
{
	var l = document.createElement('<div class="cn_logincontrol">');
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
	
	var outerDiv = document.createElement("<div class=outerDiv>"); // Anchor div.
	this.element.appendChild(outerDiv);
	
	var frameCont = document.createElement("<div class=frameCont>");
	outerDiv.appendChild(frameCont);
	
	frameCont.innerHTML = $("__plainBG").innerHTML;
	var frame = frameCont.firstChild;
	frame.style.visibility = "hidden";	
	frame.style.filter = "progid:DXImageTransform.Microsoft.Fade()";

	this._contentDiv = document.createElement("<div class=contentDiv>");
	frameCont.appendChild(this._contentDiv);
	this._contentDiv.style.visibility = "hidden";

	var loginContentDiv = document.createElement("<div class=loginContentDiv>");
	this._contentDiv.appendChild(loginContentDiv);

	var focusDiv = document.createElement("<span tabIndex=1 style='width: 1px; overflow: hidden; '>");
	loginContentDiv.appendChild(focusDiv);	
	
	this._focusDiv = focusDiv;
	
	this._lockDiv = document.createElement("<div class=lockDiv>");
	loginContentDiv.appendChild(this._lockDiv);
	
	this._userBox = document.createElement("<input type=text class='loginBox untouched' tabIndex=2>");
	this._userBox._isEmpty = true;
	this._userBox.value = "User";
	loginContentDiv.appendChild(this._userBox);
	VistaSupport.attachToTextBox(this._userBox);
	this._userBox.attachEvent("onfocus", this._userBox_onfocus);
	this._userBox.attachEvent("onblur", this._userBox_onblur);
	this._userBox.attachEvent("onkeypress", this._userBox_onkeypress);
	
	this._fakePasswordBox = document.createElement("<input type=text class='passwordBox untouched' tabIndex='3'>");
	this._fakePasswordBox.value = "Password";
	loginContentDiv.appendChild(this._fakePasswordBox);
	VistaSupport.attachToTextBox(this._fakePasswordBox);
	this._fakePasswordBox.attachEvent("onfocus", this._fakePasswordBox_onfocus);
	
	this._passwordBox = document.createElement("<input type=password class='passwordBox' tabIndex='3'>");
	this._passwordBox.style.display = "none";
	loginContentDiv.appendChild(this._passwordBox);
	VistaSupport.attachToTextBox(this._passwordBox);
	this._passwordBox.attachEvent("onblur", this._passwordBox_onblur);

	var img;
	if(CNFormManager.subTheme == "black") {
		img = VistaSupport.createImageSetButton("square-button-set.gif", 22, 22);

		var siteLogo = document.getElementById("__siteLogo");
		siteLogo.style.width = "1px";
		siteLogo.filters[0].sizingMethod = "image"; // Reset logo back to image size.
	} else {
		img = VistaSupport.createImageButton("round-button.gif");
	}
	
	img.tabIndex = 4; // After locations combo.
	img.className = "imgButton";
	loginContentDiv.appendChild(img);
	img.onclick = this._img_onclick;
	this._imgButton = img;
	
	if(CNFormManager.strings['loginCaption']) {
		$('__loginLabel').innerHTML = $('__loginLabelShade').innerHTML = CNFormManager.strings['loginCaption'];
	}
	if(CNFormManager.strings['loginLogo']) {
		$('__loginLogoIMG').filters[0].src = CNFormManager.strings['loginLogo'];
	}
	
	this.element.attachEvent("onkeypress", this._element_onkeypress);	
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
			document.body.load("storedLocations");
			var storedNodes = document.body.XMLDocument.selectNodes("storedLocations/location");
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
	var frameCont = this.element.firstChild.firstChild;
	var self = this;
	//this._contentDiv
	setTimeout(function()
	{
		self._contentDiv.style.visibility = "inherit";
		
		var frame = frameCont.firstChild;
		frame.filters[0].Apply();
		frame.style.visibility = "inherit";
		frame.filters[0].Play(.5);	
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
					siteLogo.filters[0].sizingMethod = "scale";
					
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
		var option = {text: storedNodes[i].text};
		options.push(option);
	}
	
	options.push({text: "<Not listed>"});

	this._selectLocationCombo.initData(options);
	this._selectLocationCombo.set_selectedIndex(0, true);
}

proto._img_onclick = function()
{
	Util.dispatchObject().loginButtonClick();
}
proto._userBox_onfocus = function()
{
	var box = event.srcElement;
	var jso = Util.dispatchObject();
	if(jso._disabled || !box._isEmpty) return;
	box._emptyValue = box.value;
	box.value = "";
	box.select();
	Util.removeClass(box, "untouched");
}
proto._userBox_onkeypress = function()
{
	var jso = Util.dispatchObject();
	if(jso._disabled) return;
	
	var box = event.srcElement;	
	box._isEmpty = false;
}
proto._userBox_onblur = function()
{
	var jso = Util.dispatchObject();
	if(jso._disabled) return;

	var box = event.srcElement;
	if(box.value == "") 
	{	
		box.value = box._emptyValue;
		box.className += " untouched";
		box._isEmpty = true;
	}
	else box._isEmpty = false;
}
proto._fakePasswordBox_onfocus = function()
{
	var jso = Util.dispatchObject();
	if(jso._disabled) return;
	
	var box = event.srcElement;
	jso._passwordBox.style.display = "inline";
	jso._passwordBox.focus();
	jso._passwordBox.select();
	box.style.display = "none";
}
proto._passwordBox_onblur = function()
{
	var jso = Util.dispatchObject();
	if(jso._disabled) return;
	
	var box = event.srcElement;
	if(box.value == "")
	{
		jso._fakePasswordBox.style.display = "inline";
		box.style.display = "none";		
	}
}

proto.loadData = function(node)
{
	this._salt = node.getAttribute("salt");

	var message = node.selectSingleNode("message");
	if(message) {
		this._showMessage(message);
	}
}

proto._showMessage = function(node) {
	//redHeader
	var redHeader = this._redHeader = $(CNFormManager.subTheme == "black" ? '__vistaFormRedHeaderBG' : '__si_formRedHeaderBG').cloneNode(true);
	this.element.firstChild.appendChild(redHeader);
	redHeader.className = "messageRedHeader";

	var div = document.createElement("div");
	this.element.firstChild.appendChild(div);
	div.className = "messageDiv";
	div.innerHTML = node.xml;

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
			var storedNodes = rootEl.selectNodes("location");
			
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


proto._element_onkeypress = function()
{
	var jso = CNUtil.dispatchObject();
	if(jso && jso.element_onkeypress) jso.element_onkeypress();
}
proto.element_onkeypress = function()
{
	if(event.keyCode != 13) return;
	CNUtil.cancelEvent();
	this.loginButtonClick();
}

proto.loginButtonClick = function()
{
	if(this._disabled) return;
	if(!this._userBox.value || this._userBox._isEmpty)
	{
		this._userBox.runtimeStyle.borderColor = "red";
		return;
	}
	this._userBox.runtimeStyle.borderColor = "";
	this.formManager.postData(this.element);
}
proto = null;

