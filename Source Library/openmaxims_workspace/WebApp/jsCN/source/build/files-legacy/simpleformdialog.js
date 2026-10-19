/*
 * BUNDLE-DERIVED openMAXIMS IE7 RECONSTRUCTION
 * Module: simpleformdialog.js
 * Evidence: structural responsibility region
 * Confidence: medium
 *
 * This is formatted output from a packed historical bundle region. It is
 * not a byte-for-byte recovery of the original source archive. Original
 * comments, local names, and module boundaries may have been lost through
 * bundling. Preserve observed protocol, event, DOM, and error semantics.
 */
function CNSimpleFormDialog(a) {
  this.formManager = a
}
CNThemeManager.themeable(CNSimpleFormDialog);
CNSimpleFormDialog.themes._default = {
  create: function(d, a, c, b) {
    var e = this._dialogDiv = document.createElement('<div style="position: absolute; overflow: auto; visibility: hidden; ">');
    if (c) {
      e.style.width = e.style.height = "100%";
      e.style.top = e.style.left = 0
    } else {
      e.style.height = a + "px";
      e.style.width = d + "px";
      e.style.top = (document.body.clientHeight - a) / 2 + "px";
      e.style.left = (document.body.clientWidth - d) / 2 + "px"
    }
    this._dialogDiv.style.zIndex = top.__ontopZ++;
    document.body.appendChild(e);
    this._dialogDiv.appendChild(b);
    this._formPlaceholder = this._dialogDiv
  },
  destroy: function() {
    this._dialogDiv.removeNode(true);
    this._formPlaceholder = this._dialogDiv = null
  },
  show: function() {
    this._dialogDiv.style.visibility = "visible"
  },
  set_caption: Util.nop,
  set_captionImage: Util.nop,
  set_patient: Util.nop,
  set_darkHeader: Util.nop,
  _dummy: null
};
