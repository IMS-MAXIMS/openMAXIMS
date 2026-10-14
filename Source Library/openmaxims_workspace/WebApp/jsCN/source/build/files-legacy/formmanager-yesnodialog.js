/*
 * BUNDLE-DERIVED openMAXIMS IE7 RECONSTRUCTION
 * Module: formmanager-yesnodialog.js
 * Evidence: structural responsibility region
 * Confidence: medium
 *
 * This is formatted output from a packed historical bundle region. It is
 * not a byte-for-byte recovery of the original source archive. Original
 * comments, local names, and module boundaries may have been lost through
 * bundling. Preserve observed protocol, event, DOM, and error semantics.
 */
proto._showGenericMB = function(h, f, e, c) {
  var b = new CNMessageBox();
  b.create(false, false);
  b.resize(430, 100);
  b.set_captionImage(CNFormManager.neutralImagesPath + "icons48/yesno-question-1.png");
  b.set_caption(h);
  var d = b.contentsElement();
  var a = "<div class='yesNoMessage'>" + f + "</div>";
  d.insertAdjacentHTML("beforeend", a);
  if (e == "YesNo") {
    b.createBottomButton("Yes", true);
    b.createBottomButton("No", false)
  } else {
    b.createBottomButton("OK", true)
  }
  b.__subDelegate = c;
  var g = [this, "_proxyMBDelegate"];
  setTimeout(function() {
    b.show(true, g)
  }, 0)
};
proto._proxyMBDelegate = function(a, b) {
  a.destroy();
  Util.call(a.__subDelegate, a, b)
};
proto._showYesNoDialog = function(c, b, a) {
  this._showGenericMB(c, b, "YesNo", a)
};
proto._showOKDialog = function(c, b, a) {
  this._showGenericMB(c, b, "OK", a)
};
