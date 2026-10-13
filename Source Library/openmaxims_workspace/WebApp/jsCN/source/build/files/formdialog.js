/*
 * BUNDLE-DERIVED openMAXIMS IE7 RECONSTRUCTION
 * Module: formdialog.js
 * Evidence: direct candidate region
 * Confidence: medium
 *
 * This is formatted output from a packed historical bundle region. It is
 * not a byte-for-byte recovery of the original source archive. Original
 * comments, local names, and module boundaries may have been lost through
 * bundling. Preserve observed protocol, event, DOM, and error semantics.
 */
function CNFormDialog(a) {
  this.formManager = a
}
CNThemeManager.themeable(CNFormDialog);
CNFormDialog.themes._default = {
  _formHeaderOffset: 6,
  create: function(f, b, e, c, d, a) {
    this._themeableDialog = new CNThemeableDialog();
    this._themeableDialog.create(e, c);
    if (d) {
      this._createFormHeader()
    }
    this._themeableDialog.resize(f, b);
    this._formPlaceholder = this._themeableDialog.contentsElement();
    this._dialogDiv = this._themeableDialog.element;
    this._dialogDiv.appendChild(a)
  },
  show: function() {
    this._themeableDialog.show(true, [this, "_dialog_closing"], [this, "_dialog_maximized"])
  },
  destroy: function() {
    this._formHeader = this._dialogDiv = this._formPlaceholder = this._darkHeader = null;
    this._themeableDialog.destroy();
    this._themeableDialog = null;
    Event.purge(this)
  },
  set_caption: function(a) {
    this._themeableDialog.set_caption(a)
  },
  set_captionImage: function(a) {
    this._themeableDialog.set_captionImage(a)
  },
  set_patient: function(b, a) {
    this._themeableDialog.set_subCaption(b)
  },
  set_darkHeader: function(a) {
    if (a) {
      if (!this._darkHeader) {
        this._createDarkHeader()
      }
      this._darkHeader.style.height = a + this._formHeaderOffset + "px";
      Util.addClass(this._themeableDialog.element, "cn_formdialog_with_darkheader")
    } else {
      if (this._darkHeader) {
        this._darkHeader.style.display = "none"
      }
      Util.removeClass(this._themeableDialog.element, "cn_formdialog_with_darkheader")
    }
  },
  _createDarkHeader: function() {
    var a = this._darkHeader = document.createElement("<div class='darkHeader'>");
    a.innerHTML = '<img class="darkHeaderBG" src="' + CNFormManager.themeImagesPath + 'dialog-dark-header_01.png"/><img class="darkHeaderShadow" src="' + CNFormManager.themeImagesPath + 'dialog-dark-header_02.png"/>';
    this._themeableDialog.contentsElement().parentNode.appendChild(a)
  },
  _createFormHeader: function() {
    Util.addClass(this._themeableDialog.element, "cn_formdialog_with_header");
    var a = this._formHeader = document.createElement("<div class='formHeader'>");
    this._themeableDialog.captionElement().appendChild(a)
  },
  _dialog_closing: function() {
    this.formManager.dialog_handleClosing()
  },
  _dialog_maximized: function(a, b) {
    this.formManager._dialog_handleMaximize(b)
  },
  _dummy: null
};
