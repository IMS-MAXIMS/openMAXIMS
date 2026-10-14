/*
 * BUNDLE-DERIVED openMAXIMS IE7 RECONSTRUCTION
 * Module: container.js
 * Evidence: direct candidate region
 * Confidence: medium
 *
 * This is formatted output from a packed historical bundle region. It is
 * not a byte-for-byte recovery of the original source archive. Original
 * comments, local names, and module boundaries may have been lost through
 * bundling. Preserve observed protocol, event, DOM, and error semantics.
 */
function CNContainer() {}
Util.mixin(CNContainer.prototype, {
  collapsedHeight: 35,
  create: function(b) {
    var a = this.element = document.createElement("<div>");
    b.appendChild(a);
    this._panel = new CN_panel();
    var c = this._panel.createElement({
      type: "MiniBox"
    }, a);
    var d = this._buildContainerElement();
    d._isContainerPanel = true;
    a.containerElement = d;
    a.jsObject = this;
    this.layoutOffset = {
      x: -5,
      y: -5,
      w: 10,
      h: 12
    };
    return a
  },
  unload: function() {
    CNFormManager.destroyJSObject(this._panel);
    this.element.containerElement = null;
    this.element.disabler = null
  },
  _buildContainerElement: function() {
    var a = document.createElement("<div class='containerElementOuter'>");
    this.element.appendChild(a);
    return a.appendChild(document.createElement("<div class='containerElement'>"))
  },
  set_caption: function(a) {
    this._panel.applyTextAndImg(a, null)
  },
  addCollapseButton: function(a) {
    var b = this._createCollapseButton(a);
    Event.add(b, "click", this, this._collapseButton_onclick)
  },
  _collapseButton_onclick: function() {
    this.formManager.toggleCollapsableContainer(this)
  },
  _createCollapseButton: function(a) {
    var b;
    b = VistaSupport.createImageSetButton("collapse-set.gif", 20, 20, a ? 0 : 20);
    b.className = "cnCollapseButton";
    this._panel.element.appendChild(b);
    var d = this._panel.element.children[1];
    Event.add(d, "click", this, this._collapseButton_onclick);
    var c = this.element.firstChild.firstChild;
    Event.add(c, "click", this, this._table_onclick);
    return b
  },
  _table_onclick: function() {
    if (this.element._collapsed) {
      this.formManager.toggleCollapsableContainer(this)
    }
  },
  updateCollapsedState: function() {
    var c = this.element;
    var g = c._collapsed;
    var e = c._collapseDirection != "down";
    var b;
    if (c._collapsed) {
      b = !e
    } else {
      b = e
    }
    this._updateCollapseButton(b, e);
    var g = this.element._collapsed,
      a = this.element.firstChild,
      f = a.firstChild;
    Util.toggleClass(a, "cn_panel_collapsed", g);
    var d = f.rows[0].cells;
    d[0].firstChild.src = CNFormManager.themeImagesPath + "minibox-1" + (g ? "-no-header" : "") + "_01.png";
    d[1].firstChild.src = CNFormManager.themeImagesPath + "minibox-1" + (g ? "-no-header" : "") + "_02.png";
    d[2].firstChild.src = CNFormManager.themeImagesPath + "minibox-1" + (g ? "-no-header" : "") + "_04.png";
    d = f.rows[1].cells;
    d[0].firstChild.src = CNFormManager.themeImagesPath + "minibox-1" + (g ? "-no-header" : "") + "_05.png";
    d[1].firstChild.src = CNFormManager.themeImagesPath + "minibox-1" + (g ? "-no-header" : "") + "_06.png";
    d[2].firstChild.src = CNFormManager.themeImagesPath + "minibox-1" + (g ? "-no-header" : "") + "_08.png";
    d = f.rows[2].cells;
    d[0].firstChild.src = CNFormManager.themeImagesPath + "minibox-1" + (g ? "-no-header" : "") + "_09.png";
    d[1].firstChild.src = CNFormManager.themeImagesPath + "minibox-1" + (g ? "-no-header" : "") + "_10.png";
    d[2].firstChild.src = CNFormManager.themeImagesPath + "minibox-1" + (g ? "-no-header" : "") + "_12.png"
  },
  _updateCollapseButton: function(a, c) {
    var b = this._panel.element.lastChild;
    var d = this.element._collapsed ? "Expand" : "Collapse";
    Tooltip.set(b, d);
    VistaSupport.updateImageSetButton(b, null, a ? 0 : 20);
    VistaSupport.setImageSetState(b, "normal");
    var e = this._panel.element.children[1];
    Tooltip.set(e, d)
  },
  _dummy: null
});
