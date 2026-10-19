/* PRIVATE INTERVAL RECONSTRUCTION; not original source. Module: logincontrol_newblue.js; official bundle offsets 285071-297198. */
function CN_logincontrol_newblue() {
  this._newPasswordCanceled = false;
  this._lockMode = false;
  this._salt = null;
  this._disabled = false
}
CN_logincontrol_newblue.loginImage = true;
CN_logincontrol_newblue.createLoginChrome = function() {
  if ($("__loginChrome")) {
    return
  }
  var placeholder = $("cn_globalPlaceholder");
  var chrome = Util.createElement("div", "loginChrome", {id: "__loginChrome"});
  var center = Util.createElement("div", "loginCenter", {id: "__loginCenter"});
  var left = Util.createElement("div", "loginCenterLeft", {id: "__loginCenterLeft"});
  var separator = Util.createElement("div", "loginCenterLeftSeparator", {id: "__loginCenterLeftSeparator"});
  var separatorImage = Util.createElement("img", "loginCenterSeparatorImage", {src: "themes/new-blue/g/separator.png"});
  var bottomLogo = Util.createElement("img", "loginImsLogo", {src: "themes/new-blue/g/logo-bottom.png"});
  separator.appendChild(separatorImage);
  center.appendChild(left);
  center.appendChild(separator);
  chrome.appendChild(center);
  chrome.appendChild(bottomLogo);
  placeholder.insertBefore(chrome, placeholder.firstChild);
  CN_logincontrol_newblue.layoutChrome();
  Event.nativeAdd(window, "resize", CN_logincontrol_newblue.layoutChrome);
  $("__si_form").style.overflow = "hidden"
};
CN_logincontrol_newblue.destroyLoginChrome = function() {
  var a = $("__loginChrome");
  if (a) {
    Event.nativeDel(window, "resize", CN_logincontrol_newblue.layoutChrome);
    Util.removeElement(a);
    $("__si_form").style.overflow = ""
  }
};
CN_logincontrol_newblue.layoutChrome = function() {
  var a = $("__loginCenter");
  var b = $("__si_form");
  b.style.top = a.style.top = (document.body.clientHeight - a.offsetHeight) / 2 + "px"
};
var proto = CN_logincontrol_newblue.prototype;
proto.createElement = function(c, b) {
  var a = Util.createElement("div", "cn_logincontrol_newblue");
  b.appendChild(a);
  this.element = a;
  a.jsObject = this;
  this._lockMode = c.getAttribute("lock") == "true";
  CNFormManager.getBaseFormManager().pauseAutoLockTimer();
  this._buildContent();
  return a
};
proto._createInputBox = function(c, a, e, d) {
  var b = {};
  b.cont = Util.createElement("div", "loginInputBox");
  var background = Util.createElement("img", "loginBoxBG", {src: "themes/new-blue/g/login-login-bg.png"});
  var hint = Util.createElement("div", "loginBoxHint");
  hint.textContent = c;
  b.input = Util.createElement("input", "loginBox" + (d ? " withButton" : ""));
  b.input.type = a;
  if (e) b.input.id = e;
  b.cont.appendChild(background);
  b.cont.appendChild(hint);
  b.cont.appendChild(b.input);
  if (d) {
    b.button = VistaSupport.createImageSetButton("login-password-arrow-set.png", 25, 25, 0);
    b.button.className = "loginButton";
    b.cont.appendChild(b.button)
  }
  Event.add(b.cont, "mouseup", this, this.inputBox_mousedown);
  Event.add(b.input, "keyup", this, this.inputBox_handlekey);
  Event.add(b.input, "keydown", this, this.inputBox_handlekey);
  Event.add(b.input, "blur", this, this.inputBox_handlekey);
  return b
};
proto.inputBox_mousedown = function(c) {
  c = Event.normalize(c) || Event.current();
  Util.cancelEvent(c);
  var b = Util.findByClassName(c && c.target, "loginInputBox");
  if (!b || Util.hasClass(b, "disabled")) {
    return
  }
  var a = b.getElementsByTagName("input")[0];
  a.select();
  a.focus()
};
proto.inputBox_handlekey = function(c) {
  c = Event.normalize(c) || Event.current();
  var b = c && c.target;
  var a = Util.findByClassName(b, "loginInputBox");
  if (Util.hasClass(a, "disabled")) {
    return
  }
  a.children[1].style.visibility = b.value.length || c.type == "keydown" ? "hidden" : ""
};
proto._buildContent = function() {
  if (this._lockMode) {
    this.formManager.enforceDialog()
  }
  CN_logincontrol_newblue.createLoginChrome();
  CN_logincontrol_newblue.loginImage ? this.displaySiteLogo(true) : this.displaySiteLogo(false);
  var container = Util.createElement("div", "container");
  var loginArea = Util.createElement("div", "loginArea");
  var label = Util.createElement("div", "label", {id: "__loginLabel"});
  label.textContent = "MAXIMS";
  loginArea.appendChild(label);
  container.appendChild(loginArea);
  this.element.appendChild(container);
  var a = this._cont = this.element.lastChild;
  var f = this._loginArea = a.firstChild;
  var b = this._login = this._createInputBox("Login", "text");
  f.appendChild(b.cont);
  setTimeout(function() {
    b.input.focus()
  }, 0);
  var d = this._password = this._createInputBox("Password", "password", false, true);
  Util.addClass(d.cont, "passwordDiv");
  f.appendChild(d.cont);
  var c = $("__loginLabel");
  Event.add(d.button, "mouseup", this, this.login_button_click);
  Event.add(d.input, "keypress", this, this.password_keypress);
  if (this._lockMode) {
    var e = this._unlockLabel = Util.createElement("div", "loginLockedLabel");
    e.appendChild(Util.createElement("img", null, {src: "themes/new-blue/g/login-lock.png"}));
    e.appendChild(document.createTextNode(" Application is Locked "));
    $("__loginCenter").appendChild(e);
    this._layoutLockMode();
    Event.add(window, "resize", this, this._layoutLockMode)
  }
};
proto._layoutLockMode = function(a) {
  this._cont.style.top = $("__loginCenter").offsetTop + "px"
};
proto.password_keypress = function(a) {
  if (Event.keyValue(a) == 13) {
    this.login_button_click()
  }
};
proto.set_disabled = function(a) {
  if (a) {
    Util.addClass(this._loginArea, "disabled");
    this._disableBox(this._login);
    this._disableBox(this._password);
    if (this._changePass1) {
      this._disableBox(this._changePass1);
      this._disableBox(this._changePass2)
    }
  } else {
    Util.removeClass(this._loginArea, "disabled");
    this._enableBox(this._login);
    this._enableBox(this._password);
    if (this._changePass1) {
      this._enableBox(this._changePass1);
      this._enableBox(this._changePass2)
    }
  }
  this._disabled = a
};
proto.displaySiteLogo = function(c) {
  var a = $("__loginCenterLeft");
  if (a) a.style.display = "none";
};
proto.login_button_click = function(b) {
  if (b) {
    Util.cancelEvent(b)
  }
  var a = this._login.input;
  var c = this._password.input;
  if (!a.value) {
    Util.addClass(a, "error");
    return
  }
  Util.removeClass(a, "error");
  this.displaySiteLogo(false);
  this.formManager.postData(this.element)
};
proto.loadData = function(b) {
  this._salt = b.getAttribute("salt");
  var a = Util.xmlSelectSingleNode(b, "message");
  if (a) {
    this.displaySiteLogo(true);
    this._showMessage(a)
  }
  if (!this._lockMode) {
    if (b.getAttribute("passwordExpireDays") != null) {
      this.displaySiteLogo(false);
      this._processPasswordExpiry(b)
    }
  }
};
proto.validateLoading = function() {
  if (!this._lockMode) {
    this._tryToShowLocationCombo()
  }
};
proto._tryToShowLocationCombo = function() {
  var b = this.formManager._getStoredLocationsXML(true),
    a;
  if (b) {
    a = Util.xmlSelectNodes(b, "location")
  }
  if (b && a.length > 0) {
    this._showLocationCombo(a)
  } else {
    this._hideLocationCombo()
  }
};
proto._createChangePassword = function() {
  if (this._changeCont) {
    return
  }
  var c = this._changeCont = Util.createElement("div", "changePasswordContainer");
  var title = Util.createElement("div");
  title.textContent = "Change Password";
  c.appendChild(title);
  c.appendChild(Util.createElement("img", null, {src: "themes/new-blue/g/login-vert-line.png"}));
  c.appendChild(Util.createElement("div", "changeNote"));
  c.appendChild(Util.createElement("div", "changeArea"));
  this._cont.appendChild(c);
  var b = c.lastChild;
  var label1 = Util.createElement("div", "changeLabel");
  label1.textContent = "Password";
  b.appendChild(label1);
  this._changePass1 = this._createInputBox("", "password");
  b.appendChild(this._changePass1.cont);
  b.appendChild(Util.createElement("br"));
  var label2 = Util.createElement("div", "changeLabel");
  label2.textContent = "Re-Enter Password";
  b.appendChild(label2);
  this._changePass2 = this._createInputBox("", "password", false, true);
  b.appendChild(this._changePass2.cont);
  Event.add(this._changePass2.button, "mouseup", this, this._changePass_button_click);
  Event.add(this._changePass2.input, "keypress", this, this._changePass_input_keypress);
  if (this._disabled) {
    this.set_disabled(this._disabled)
  }
};
proto._showChangePassword = function(c, b) {
  this._createChangePassword();
  if (c) {
    this._disableBox(this._login);
    this._disableBox(this._password);
    Util.addClass(this._loginArea, "disabled");
    if (this._selectLocationCombo) {
      this._selectLocationCombo.set_disabled(true)
    }
  }
  if (b) {
    var a = this._changeCont.children[2];
    a.innerHTML = b;
    a.style.display = "block"
  }
  setTimeout(Util.bind(this, function() {
    var d = new AnimMove(this._loginArea, null, 100, true);
    d.onend = Util.bind(this, function() {
      this._changeCont.style.display = "block"
    });
    Animator.start(d)
  }), 0)
};
proto._disableBox = function(a) {
  a.input.disabled = true;
  Util.addClass(a.cont, "disabled")
};
proto._enableBox = function(a) {
  a.input.disabled = false;
  Util.removeClass(a.cont, "disabled")
};
proto._hideChangePassword = function() {
  if (this._changeCont) {
    Util.removeClass(this._loginArea, "disabled");
    this._enableBox(this._login);
    this._enableBox(this._password);
    if (this._selectLocationCombo) {
      this._selectLocationCombo.set_disabled(false)
    }
    this._changeCont.style.display = "";
    var a = new AnimMove(this._loginArea, null, 186, true);
    Animator.start(a)
  }
};
proto._processPasswordExpiry = function(a) {
  var b = a.getAttribute("passwordExpireDays");
  if (b == "") {
    this._hideChangePassword()
  } else {
    document.body.focus();
    if (b > 0) {
      this._forcePasswordExpire = false;
      this.formManager._showYesNoDialog("Password expire", "Your password will expire in " + b + " day(s).<br/> Do you wish to change your password now?", [this, "_processPasswordExpiry2"])
    } else {
      this._forcePasswordExpire = true;
      this._showChangePassword(true, "Your password expires today.<br/>You must change your password now.")
    }
  }
};
proto._processPasswordExpiry2 = function(a, b) {
  if (!b) {
    this._showChangePassword(false)
  } else {
    this._newPasswordCanceled = true;
    this.formManager.postData(this.element)
  }
};
proto._changePass_button_click = function(a) {
  if (a) {
    Util.cancelEvent(a)
  }
  Util.toggleClass(this._changePass1.input, "error", !this._changePass1.input.value);
  Util.toggleClass(this._changePass2.input, "error", !this._changePass2.input.value);
  if (!this._changePass1.input.value || !this._changePass2.input.value) {
    return
  }
  if (this._changePass1.input.value && (this._changePass1.input.value != this._changePass2.input.value)) {
    alert("Your password entries don't match.");
    return
  }
  this._newPassword = this._changePass1.input.value;
  this.formManager.postData(this.element)
};
proto._changePass_input_keypress = function(a) {
  if (Event.keyValue(a) == 13) {
    this._changePass_button_click()
  }
};
proto.cancelPasswordButtonClick = function() {
  this._newPasswordCanceled = true;
  this.formManager.postData(this.element)
};
proto._showLocationCombo = function(a) {
  if (!this._selectLocationCombo) {
    this._createSelectLocationCombo()
  }
  this._fillSelectLocationCombo(a)
};
proto._createSelectLocationCombo = function() {
  var a = this._selectLocationCont = Util.createElement("div", "location");
  this._loginArea.appendChild(a);
  var locationLabel = Util.createElement("div", "locationLabel");
  locationLabel.textContent = "Location";
  a.appendChild(locationLabel);
  var d = Util.createElement("div", "loginInputBox");
  d.appendChild(Util.createElement("img", "loginBoxBG", {src: "themes/new-blue/g/login-login-bg.png"}));
  a.appendChild(d);
  this._selectLocationCombo = new CN_combobox();
  var b = [];
  var c = this._selectLocationCombo.createElement(b, d);
  this._selectLocationCombo.set_tabIndex(3);
};
proto._fillSelectLocationCombo = function(c) {
  var a = [];
  for (var b = 0; b < c.length; b++) {
    var d = {
      text: Util.xmlText(c[b])
    };
    a.push(d)
  }
  a.push({
    text: "<Not listed>"
  });
  this._selectLocationCombo.initData(a);
  this._selectLocationCombo.set_selectedIndex(0, true)
};
proto._hideLocationCombo = function() {
  if (this._selectLocationCombo) {
    if (this._selectLocationCombo) {
      CNFormManager.destroyJSObject(this._selectLocationCombo)
    }
    this._selectLocationCombo = null;
    Util.removeElement(this._selectLocationCont);
    this._selectLocationCont = null
  }
};
proto._showMessage = function(a) {
  var b = typeof a == "object" ? Util.xmlText(a) : a;
  if (b) {
    if (!this._errorContainer) {
      this._errorContainer = Util.createElement("div", "errorContainer");
      $("__loginCenter").appendChild(this._errorContainer)
    }
    this._errorContainer.innerHTML = b;
    this._errorContainer.style.display = ""
  } else {
    if (this._errorContainer) {
      this._errorContainer.style.display = "none"
    }
  }
};
proto.storeData = function(a) {
  if (this._lockMode) {
    var f = a.createElement("unlock");
    f.setAttribute("name", this._login.input.value);
    f.setAttribute("pass", this._encrypt(this._password.input.value));
    return f
  } else {
    if (this._newPassword) {
      var f = a.createElement("newPassword");
      f.setAttribute("canceled", "false");
      f.setAttribute("pass", this._newPassword);
      this._newPassword = null;
      return f
    } else {
      if (this._newPasswordCanceled) {
        var f = a.createElement("newPassword");
        f.setAttribute("canceled", "true");
        this._newPasswordCanceled = false;
        return f
      } else {
        var c = a.createDocumentFragment();
        var f = a.createElement("loginEvent");
        f.setAttribute("name", this._login.input.value);
        f.setAttribute("pass", this._encrypt(this._password.input.value));
        c.appendChild(f);
        var e = this.formManager._getStoredLocationsXML(true);
        if (e) {
          if (this._selectLocationCombo) {
            var d = Util.xmlSelectNodes(e, "location");
            var b = this._selectLocationCombo.get_selectedIndex();
            if (b >= d.length) {
              b = -1
            }
            e.setAttribute("selection", b)
          }
          c.appendChild(e)
        }
        return c
      }
    }
  }
};
proto._encrypt = function(a) {
  if (!this._salt) {
    return a
  }
  return Util.SHA1.compute(a + this._salt, "hex")
};
proto.unload = function() {
  if (this._selectLocationCombo) {
    CNFormManager.destroyJSObject(this._selectLocationCombo)
  }
  if (this._unlockLabel) {
    Util.removeElement(this._unlockLabel);
    this._unlockLabel = null
  }
  if (this._errorContainer) {
    Util.removeElement(this._errorContainer);
    this._errorContainer = null
  }
  CN_logincontrol_newblue.destroyLoginChrome();
  this.formManager.deforceDialog();
  CNFormManager.getBaseFormManager().resumeAutoLockTimer()
};
proto = null;
