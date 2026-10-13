/*
 * BUNDLE-DERIVED openMAXIMS IE7 RECONSTRUCTION
 * Module: genericcontainer.js
 * Evidence: structural responsibility region
 * Confidence: medium
 *
 * This is formatted output from a packed historical bundle region. It is
 * not a byte-for-byte recovery of the original source archive. Original
 * comments, local names, and module boundaries may have been lost through
 * bundling. Preserve observed protocol, event, DOM, and error semantics.
 */
function CNGenericContainer() {}
Util.mixin(CNGenericContainer.prototype, {
  create: function(b) {
    var a = this.element = document.createElement("div");
    b.appendChild(a);
    a.jsObject = this;
    return a
  },
  unload: function() {
    this.element.containerElement = null;
    this.element.disabler = null
  }
});
