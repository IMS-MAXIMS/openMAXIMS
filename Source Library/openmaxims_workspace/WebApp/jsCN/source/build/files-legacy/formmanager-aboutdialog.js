/*
 * BUNDLE-DERIVED openMAXIMS IE7 RECONSTRUCTION
 * Module: formmanager-aboutdialog.js
 * Evidence: structural responsibility region
 * Confidence: medium
 *
 * This is formatted output from a packed historical bundle region. It is
 * not a byte-for-byte recovery of the original source archive. Original
 * comments, local names, and module boundaries may have been lost through
 * bundling. Preserve observed protocol, event, DOM, and error semantics.
 */
proto._loadAboutDialog = function() {
  if (this._aboutDialogLoaded) {
    return
  }
  var c = this._ideaNode.selectSingleNode("aboutDialog");
  if (!c) {
    return
  }
  if (c) {
    this._aboutDialogLoaded = true;
    this._aboutDialogTitle = String(c.getAttribute("title"));
    var a = c.selectSingleNode("mainHTML");
    if (a) {
      a.text += "<br><b>jsCN</b>: Version: " + Version.jscn_major + "." + Version.jscn_minor + "." + Version.jscn_build + " (" + Version.jscn_date() + ")";
      a.text += "<br><b>CSS</b>: Version: " + Version.css_major + "." + Version.css_minor + "." + Version.css_build + " (" + Version.css_date() + ")";
      this._aboutDialogMainHTML = String(a.text)
    }
    var b = c.selectSingleNode("secondHTML");
    if (b) {
      this._aboutDialogSecondHTML = String(b.text)
    }
  }
};
proto.aboutButtonClick = function(a) {
  if (this.isNavigationDisabled() && !a || !this._aboutDialogLoaded || this._loading) {
    return
  }
  if (!this._aboutDialog) {
    this._aboutDialog = this._buildAboutDialog()
  }
  this._aboutDialog.show(true, [this, "_aboutDialogClosing"])
};
proto._aboutDialogClosing = function() {
  this._aboutDialog.destroy();
  this._aboutDialog = null
};
proto._buildAboutDialog = function() {
  var d = new CNMessageBox();
  d.create(true, false);
  d.resize(600, this._aboutDialogSecondHTML ? 320 : 195);
  d.set_captionImage(CNFormManager.neutralImagesPath + "icons48/info-1.png");
  d.set_caption(this._aboutDialogTitle);
  var f = d.contentsElement();
  if (CNFormManager.strings.loginLogo) {
    var c = document.createElement("<img class='aboutDialogSiteLogo1'>");
    f.appendChild(c);
    c.src = CNFormManager.strings.loginLogo
  }
  d.createBottomButton("OK", true);
  var e = document.createElement("<div class='aboutDialogDiv1'>");
  f.appendChild(e);
  if (this._aboutDialogMainHTML) {
    e.innerHTML = this._aboutDialogMainHTML
  }
  if (this._aboutDialogSecondHTML) {
    var a = document.createElement("<div class='aboutDialogSeparator'>");
    f.appendChild(a);
    var b = document.createElement("<div class='aboutDialogDiv2'>");
    f.appendChild(b);
    b.innerHTML = this._aboutDialogSecondHTML
  }
  return d
};
