/*
 * BUNDLE-DERIVED openMAXIMS IE7 RECONSTRUCTION
 * Module: messagebox.js
 * Evidence: direct candidate region
 * Confidence: medium
 *
 * This is formatted output from a packed historical bundle region. It is
 * not a byte-for-byte recovery of the original source archive. Original
 * comments, local names, and module boundaries may have been lost through
 * bundling. Preserve observed protocol, event, DOM, and error semantics.
 */
function CNMessageBox() {}
CNThemeManager.themeable(CNMessageBox);
CNMessageBox.cloneThemesFrom(CNThemeableDialog);
CNMessageBox._idCount = 0;
Util.mixin(CNMessageBox.themes._default, {
  create: function() {
    var a = CNThemeableDialog.themes._default.create.apply(this, arguments);
    this._bottom = this._dialogFrame.children[2].firstChild.appendChild(document.createElement('<div class="dialogBottom" xstyle="background: white; ">'));
    Util.addClass(a, "cn_messagebox");
    this._jsObjects = [];
    return a
  },
  temporaryHide: function() {
    this.hide()
  },
  reshow: function() {},
  resizeToContents: function() {
    var a = Math.max(100, Math.min(this.contentsElement().firstChild.scrollHeight, 400))
  },
  destroy: function() {
    this._bottom = null;
    CNFormManager.destroyJSObjects(this._jsObjects);
    CNThemeableDialog.themes._default.destroy.apply(this)
  },
  set_textAndImage: function(d, c) {
    this.set_contents("<div class='fm_messageBoxContent' xstyle='background: white; '><div></div></div>");
    var b = this.contentsElement();
    var e = b.lastChild;
    var a = e.firstChild;
    a.innerText = d;
    this.set_captionImage(c)
  },
  bottomElement: function() {
    return this._bottom
  },
  createBottomButton: function(d, f, e, c) {
    var a = this.createDialogButton(this.bottomElement(), d, f, "bottomButton");
    if (e) {
      a.__messageBox_data = e
    }
    if (c) {
      Util.addClass(a.element, c)
    }
    return a
  },
  createDialogButton: function(f, d, g, c) {
    var e = new CN_button();
    e.elementID = "messageBoxButton_" + CNMessageBox._idCount++;
    var a = e.createElement(Util.wrapIntoNode({}), f);
    e.loadData(Util.wrapIntoNode({
      value: d
    }));
    if (c) {
      Util.addClass(a, c)
    }
    this._jsObjects.push(e);
    if (g === true) {
      Event.add(a, "click", this, this._popup_commit);
      Event.add(a, "keydown", this, this._popup_commit)
    } else {
      if (g === false) {
        Event.add(a, "click", this, this._popup_cancel);
        Event.add(a, "keydown", this, this._popup_cancel)
      }
    }
    return e
  },
  _popup_cancel: function(a) {
    this._popup_end(a, false)
  },
  _popup_commit: function(a) {
    this._popup_end(a, true)
  },
  _popup_end: function(b, c) {
    if (b.type == "keydown" && b.keyCode == 13 || b.button == 0) {
      var a = Util.dispatchObject();
      if (a) {
        this.resultData = a.__messageBox_data
      }
      this.hide(c)
    }
  },
  _dummy: null
});
