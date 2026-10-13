/*
 * BUNDLE-DERIVED openMAXIMS IE7 RECONSTRUCTION
 * Module: formmanager-passworddialog.js
 * Evidence: structural responsibility region
 * Confidence: medium
 *
 * This is formatted output from a packed historical bundle region. It is
 * not a byte-for-byte recovery of the original source archive. Original
 * comments, local names, and module boundaries may have been lost through
 * bundling. Preserve observed protocol, event, DOM, and error semantics.
 */
proto._showPasswordDialogTO = function() {
  setTimeout(function() {
    CNFormManager.getBaseFormManager()._showPasswordDialog()
  }, 0)
};
proto._showPasswordDialog = function() {
  if (!this._ideaNode) {
    return
  }
  var e = this._ideaNode.selectSingleNode("passwordDialog");
  if (!e) {
    return
  }
  this._shutDownTimers();
  var g = String(e.getAttribute("title"));
  var f = String(e.getAttribute("text"));
  this._currentPassword = String(e.getAttribute("password"));
  var b = this._passwordDialog = new CNMessageBox();
  b.create(false, false);
  b.resize(450, 110);
  b.set_captionImage(CNFormManager.neutralImagesPath + "icons48/yesno-question-1.png");
  b.set_caption(g);
  var a = "<div class='fm_passwordContents'><div></div><div><b>Password:</b> <input type='password' style='width: 160px; '/><div style='visibility: hidden; color: red; '>Invalid password</div></div></div>";
  var d = b.contentsElement();
  d.insertAdjacentHTML("beforeend", a);
  d.firstChild.firstChild.innerText = f;
  b.createBottomButton("OK", true);
  b.createBottomButton("Cancel", false);
  b.element.attachEvent("onkeydown", CNUtil.cancelBubble);
  Event.add(b.element, "keydown", this, this.dialog_element_keydown);
  this._showDisabler(true, false, false);
  var c = d.getElementsByTagName("input")[0];
  c.value = "";
  Event.add(c, "keydown", this, this._passwordDialog_box_onkeydown);
  b.show(true, [this, "_passwordDialogCallback"]);
  this._passwordDialog = b;
  c.focus()
};
proto._forceClosePasswordDialog = function() {
  if (this._passwordDialog) {
    this._passwordDialog.destroy();
    this._passwordDialog = null
  }
};
proto.dialog_element_keydown = function() {
  if (event.keyCode == 13) {
    Util.cancelEvent()
  }
};
proto._passwordDialog_box_onkeydown = function() {
  if (event.keyCode != 13) {
    return
  }
  var a = this;
  Util.cancelEvent();
  a._passwordDialog.hide(true)
};
proto._passwordDialogCallback = function(a, c) {
  if (c) {
    this._hideDisabler();
    this.loadFormWithPostback('<events><passwordDialog canceled="true"/></events>')
  } else {
    var b = a.contentsElement().getElementsByTagName("input")[0];
    var d = a.contentsElement().firstChild.children[1].children[2];
    if (b.value != this._currentPassword) {
      d.style.visibility = "inherit";
      return false
    } else {
      this._hideDisabler();
      this.loadFormWithPostback('<events><passwordDialog canceled="false"/></events>')
    }
  }
  this._passwordDialog.destroy();
  this._passwordDialog = null;
  return true
};
