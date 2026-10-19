/*
	v. 0.25 send client uniqueID on login
	v. 0.24
	+ anim
	+ initial release
*/
function CN_logincontrol_pre()
{
	this._newPasswordCanceled = false;
	this._lockMode = false;
	this._processingPE = false;
	this._salt = null;
}
CN_logincontrol_pre.loginImage = false;

var proto = CN_logincontrol_pre.prototype;

proto.createElement = function(node, parentElement)
{
	var l = document.createElement('<div class="cn_logincontrol">');
	parentElement.appendChild(l);
	
	this.element = l;
	l.jsObject = this;
	
	this._buildContent();
	
	if(node.getAttribute("lock") == "true") 
	{
		CNFormManager.getBaseFormManager().pauseAutoLockTimer();
		//CNFormManager.getBaseFormManager().resumeHeartBeatTimer();
		this._lockScreen(node);
	}
	
	return l;
} 

proto._buildContent = function()
{
	$("__loginChrome").style.display = "block";
	var img = $("__loginImage");
	if(img) img.style.display = CN_logincontrol_pre.loginImage ? "block" : "none";
	
	var html = '<div class="div1">\
	<div id="bottomLoginBottomDiv2"\
		style="background: url(' + CNFormManager.themeImagesPath + 'login-3-3.gif); display: block; ">\
		<table class="table1">\
		<tr>\
		<td><b>New Password</b></td>\
		<td colspan=2><input id="newPassword__" type=password class="width100"></td>\
		</tr>\
		<tr>\
		<td><b>Re-Enter Password</b></td>\
		<td><input id="reenterPassword__" type=password class="width100"></td>\
		<td align=right>\
			<input \
				type=submit id="okChangeButton__" class="button" value="OK"\
				onmouseenter=_CN_button_onmouseenter()\
				onmouseleave=_CN_button_onmouseleave()\
				onclick=CNUtil.dispatchObject().changePasswordButtonClick()>\
			<input \
				type=submit id="cancelChangeButton__" class="button" value="Cancel"\
				onmouseenter=_CN_button_onmouseenter()\
				onmouseleave=_CN_button_onmouseleave()\
				onclick=CNUtil.dispatchObject().cancelPasswordButtonClick()>\
		</td>\
		</tr>\
		</table>\
	</div>\
	<div id="topLoginBottomDiv" style="background: url(\'' + CNFormManager.themeImagesPath + 'login-3-3.gif\'); ">\
		<table class="table2">\
		<tr>\
		<td><b>User</b></td>\
		<td>\
		    <input id="userTextBox__" type=text>\
		</td>\
		<td width=1></td>\
		<td><b>Password</b></td>\
		<td>\
		    <input id="passwordTextBox__" type=password>\
		</td>\
		<td>\
			<input \
				type=submit id="loginButton__" tabIndex="4" class="button" \
				onmouseenter=_CN_button_onmouseenter()\
				onmouseleave=_CN_button_onmouseleave()\
				onclick=CNUtil.dispatchObject().loginButtonClick()>\
		</td></tr>\
		<tr id="locationTR__">\
			<td><b>Location</b></td><td colspan="4" id="locationTD__"></td></tr>\
		</table>\
	</div>\
	<div class="div3">\
		<div style="background: url(\'' + CNFormManager.themeImagesPath + 'login-3-2.gif\'); " class="div4">\
			<div id="lockImg__" style="filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(src=' + CNFormManager.themeImagesPath + 'lock-1.png); "></div>\
			<div class="div5">' + CNFormManager.strings['loginCaption'] + '</div>\
		</div>\
	</div>\
	<div id="loginLogoAnimDiv__" style="filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(src=' + CNFormManager.themeImagesPath + 'login-3-1.png);">\
		<div class="div6">\
			<div style="display: inline-block; width: 90px; height: 145px; filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(src=\'' + CNFormManager.strings['loginLogo'] + '\', sizingMethod=\'resize\'); "></div>\
		</div>\
	</div>\
	<div id="div7" class="div7" style="filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(src=' + CNFormManager.themeImagesPath + 'login-right-panel-1.png); ">\
			<img src="g/siteLogo.gif" class="img1" onload="this.style.visibility=\'inherit\'; ">\
	</div>\
</div>';
	this.element.innerHTML = html;

	this._showLoginScreen();
}

proto.loadData = function(node)
{
	if(node.getAttribute("passwordExpireDays")) this._processPasswordExpiry(node);
	this._salt = node.getAttribute("salt");
	
	var message = node.selectSingleNode("message");
	if(message) {
		this._showMessage(message);
	}
}
proto._showMessage = function(node) {
	//redHeader
	var redHeader = this._redHeader = $('__si_formRedHeaderBG').cloneNode(true);
	redHeader.style.left = "-2px";
	redHeader.style.width = "620px";

	this.element.firstChild.appendChild(redHeader);
	redHeader.className = "messageRedHeader";

	var div = document.createElement("div");
	this.element.firstChild.appendChild(div);
	div.className = "messageDiv";
	div.innerHTML = node.xml;

	redHeader.style.height = div.offsetHeight + 40 + "px";

	var obj = this;
	setTimeout(function() {
		obj._redHeader.style.display = "block";
		var toY = -(div.offsetHeight); 
		Animator.start(new AnimMove(obj._redHeader, 0, toY),
			new AnimMove(div, 0, toY));
	}, 1000);
}

proto.storeData = function(xmldoc)
{
	if(this._lockMode)
	{
		var node = xmldoc.createElement("unlock");
		node.setAttribute("name", this._loginUser);
		node.setAttribute("pass", this._encrypt(this._loginPass));
		this._loginUser = null;
		this._loginPass = null;
		return node;
	}
	else if(this._newPassword)
	{
		var node = xmldoc.createElement("newPassword");
		node.setAttribute("canceled", "false");
		node.setAttribute("pass", this._newPassword);
		this._newPassword = null;
		return node;
	}
	else if(this._newPasswordCanceled)
	{
		var node = xmldoc.createElement("newPassword");
		node.setAttribute("canceled", "true");
		this._newPasswordCanceled = false;
		return node;
	}
	else
	{
		var fragment = xmldoc.createDocumentFragment();
		var node = xmldoc.createElement("loginEvent");
		node.setAttribute("name", this._loginUser);
		node.setAttribute("pass", this._encrypt(this._loginPass));
		fragment.appendChild(node);
				
		this._uniqueID = this.formManager._fetchUniqueID();
		
		node = xmldoc.createElement("uniqueID");
		node.setAttribute("value", this._uniqueID);
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
		this._loginUser = null;
		this._loginPass = null;
		return fragment;
	}
}

proto._encrypt = function(data) {
	if(!this._salt) return data;
	return Util.SHA1.compute(data + this._salt, "hex");
}

proto.unload = function()
{
	$("__loginChrome").style.display = "none";
	if(this._selectLocationCombo) CNFormManager.destroyJSObject(this._selectLocationCombo);	
	CNFormManager.getBaseFormManager()._autoLockShutDown = false;
	CNFormManager.getBaseFormManager()._heartBeatShutDown = false;
	
	var timeoutHeartBeat = CNFormManager.getBaseFormManager()._heartBeatTime;
	CNFormManager.getBaseFormManager()._heartBeatTime = CNFormManager.getBaseFormManager()._heartBeatTO = 0;
	CNFormManager.getBaseFormManager()._heartBeatPaused = false;
	CNFormManager.getBaseFormManager()._startHeartBeatTimer(timeoutHeartBeat);
	
	var timeout = CNFormManager.getBaseFormManager()._autoLockTime;
	CNFormManager.getBaseFormManager()._autoLockTime = CNFormManager.getBaseFormManager()._autoLockTO = 0;
	CNFormManager.getBaseFormManager()._autoLockPaused = false;
	
	CNFormManager.getBaseFormManager()._startAutoLockTimer(timeout);
}


proto._showLoginScreen = function()
{
	var all = this.element.all;
	
	all.userTextBox__.tabIndex = 1;
	all.passwordTextBox__.tabIndex = 2;
	all.userTextBox__.disabled = all.passwordTextBox__.disabled 
		= all.loginButton__.disabled = all.topLoginBottomDiv.disabled = false;
	all.userTextBox__.value = all.passwordTextBox__.value = "";
	all.loginButton__.tabIndex = 4;
	all.lockImg__.style.display = 'none';

	all.loginButton__.value = "Login";
	
	all.bottomLoginBottomDiv2.style.display = "none";
	
	try{ all.userTextBox__.focus(); } catch(e){}
	
	try 
	{
		document.body.load("storedLocations");
		var storedNodes = document.body.XMLDocument.selectNodes("storedLocations/location");;
		if(storedNodes.length > 0) 
		{							  
			this._showLocationCombo(storedNodes);
		}
	}
	catch(e)
	{}


	this.element.attachEvent("onkeypress", this._element_onkeypress);

	Animator.start(new AnimMove(all.loginLogoAnimDiv__, 0, 0),
					new AnimMove(all.div7, 524, 0),
					new AnimMove(all.topLoginBottomDiv, all.topLoginBottomDiv.offsetLeft, 62));
}

proto._element_onkeypress = function()
{
	var jso = CNUtil.dispatchObject();
	if(jso && jso.element_onkeypress) jso.element_onkeypress();
}
proto.element_onkeypress = function()
{
	if(event.keyCode == 13 && !this._processingPE)
	{
		CNUtil.cancelEvent();
		this.loginButtonClick();
	}
}


proto._createSelectLocationCombo = function(all)
{
	var td = all.locationTD__;
	
	this._selectLocationCombo = new CN_combobox();
	var options = [];

	var comboEl = this._selectLocationCombo.createElement(options, all.locationTD__);
	this._selectLocationCombo.set_tabIndex(3);
	comboEl.style.width = "270px";
}

proto._showLocationCombo = function(storedNodes)
{
	var all = this.element.all;
	var table = all.topLoginBottomDiv.children[0];
	if(!this._selectLocationCombo) this._createSelectLocationCombo(table.all);	
	
	table.runtimeStyle.top = table.currentStyle['xl--with-location-top'];
	table.runtimeStyle.left = table.currentStyle['xl--with-location-left'];
	table.all.locationTR__.style.display = "block";

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
	
	options.push({text: "<Click here to select another location after login>"});

	this._selectLocationCombo.initData(options);
	this._selectLocationCombo.set_selectedIndex(0, true);
}

proto._hideLocationCombo = function()
{
	var all = this._topLoginElement.all;
	var table = all.topLoginBottomDiv.children[0];
	table.runtimeStyle.top = null;
	table.runtimeStyle.left = null;
	table.all.locationTR__.style.display = "none";
}

proto.loginButtonClick = function()
{
	var all = this.element.all;
	if(!all.userTextBox__.value)
	{
		all.userTextBox__.runtimeStyle.borderColor = "red";
		return;
	}
	all.userTextBox__.runtimeStyle.borderColor = "";

	this._loginUnlock(all.userTextBox__.value, all.passwordTextBox__.value);
}

proto._loginUnlock = function(user, pass)
{
	this._loginUser = user;
	this._loginPass = pass;
	this.formManager.postData(this.element);
}

proto._processPasswordExpiry = function(passwordExpiryNode)
{
	this._processingPE = true;
	var days = passwordExpiryNode.getAttribute("passwordExpireDays");

	document.body.focus();

	if(days > 0) {
		this._forcePasswordExpire = false;
		this.formManager._showYesNoDialog("Password expire", "<b>Your password will expire in " + days + " day(s). Do you wish to change your password now?</b>",
								[this, "_processPasswordExpiry2"]);
	} else {
		this._forcePasswordExpire = true;
		this.formManager._showOKDialog("Password expire", "<b>Your password expired " + -(days)  + " day(s) ago. You must change your password now.</b>",
								[this, "_processPasswordExpiry2"]);
	}

}

proto._processPasswordExpiry2 = function(dialog, cancel)
{
	if(!cancel || this._forcePasswordExpire) // Yes.
	{
		var all = this.element.all;
		all.newPassword__.value = all.reenterPassword__.value = "";

		all.userTextBox__.disabled = all.passwordTextBox__.disabled 
			= all.loginButton__.disabled = all.topLoginBottomDiv.disabled = true;
		var bottomLoginBottomDiv2 = all.bottomLoginBottomDiv2;
		if(this._selectLocationCombo) this._selectLocationCombo.set_disabled(true);
		
		bottomLoginBottomDiv2.style.display = "block";

		all.cancelChangeButton__.style.display = this._forcePasswordExpire ? "none" : "";
	}
	else // No.
	{
		this._newPasswordCanceled = true;
		this.formManager.postData(this.element);
	}
}

proto.changePasswordButtonClick = function()
{
	var all = this.element.all;
	if(!all.newPassword__.value)
	{
		all.newPassword__.runtimeStyle.borderColor = "red";
		return;
	}
	else if(!all.reenterPassword__.value)
	{
		all.reenterPassword__.runtimeStyle.borderColor = "red";
		return;
	}
	all.newPassword__.runtimeStyle.borderColor = "";
	all.reenterPassword__.runtimeStyle.borderColor = "";
	if(all.newPassword__.value != all.reenterPassword__.value)
	{
		alert("Your password entries didn't match.");
		return;
	}

	this._newPassword = all.newPassword__.value;
	this.formManager.postData(this.element);
}

proto.cancelPasswordButtonClick = function()
{
	this._newPasswordCanceled = true;
	this.formManager.postData(this.element);
}

proto._lockScreen = function(loginNode, message)
{
	var all = this.element.all;
	
	all.userTextBox__.tabIndex = 1;
	all.passwordTextBox__.tabIndex = 2;
	all.userTextBox__.disabled = all.passwordTextBox__.disabled 
		= all.loginButton__.disabled = all.topLoginBottomDiv.disabled = false;
	all.userTextBox__.value = all.passwordTextBox__.value = "";
	all.loginButton__.tabIndex = 4;
	all.lockImg__.style.display = 'block';

	all.loginButton__.innerText = "Unlock";
	
	all.bottomLoginBottomDiv2.style.display = "none";
	
	var table = all.topLoginBottomDiv.children[0];
	table.all.locationTR__.style.display = "none";
	
	try{ all.userTextBox__.focus(); } catch(e){}
	
	this._lockMode = true;
}

proto = null;
