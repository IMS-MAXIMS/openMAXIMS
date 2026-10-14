/*
 * BUNDLE-DERIVED openMAXIMS IE7 RECONSTRUCTION
 * Module: controlshadow.js
 * Evidence: named historical bundle anchor
 * Confidence: tentative
 *
 * This is formatted output from a packed historical bundle region. It is
 * not a byte-for-byte recovery of the original source archive. Original
 * comments, local names, and module boundaries may have been lost through
 * bundling. Preserve observed protocol, event, DOM, and error semantics.
 */
function CNControlShadow() {
  this._offset = 5
}
Util.mixin(CNControlShadow.prototype, {
  create: function(a) {
    this.element = ThemeSupport.createScaleableFrame(a, CNFormManager.themeImagesPath + "shadow-5px_", ".png", 5, 5, 5, 5)
  },
  layout: function(b) {
    var a = b.style,
      c = this.element.style;
    if (a.zIndex) {
      c.zIndex = a.zIndex
    }
    if (a.top) {
      c.top = parseInt(a.top, 10) - this._offset + "px"
    }
    if (a.left) {
      c.left = parseInt(a.left, 10) - this._offset + "px"
    }
    if (a.width) {
      c.width = parseInt(a.width, 10) + this._offset * 2 + "px"
    }
    if (a.height) {
      c.height = parseInt(a.height, 10) + this._offset * 2 + "px"
    }
  }
});
