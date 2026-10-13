/*
 * BUNDLE-DERIVED openMAXIMS IE7 RECONSTRUCTION
 * Module: tabcontainer.js
 * Evidence: named historical bundle anchor
 * Confidence: tentative
 *
 * This is formatted output from a packed historical bundle region. It is
 * not a byte-for-byte recovery of the original source archive. Original
 * comments, local names, and module boundaries may have been lost through
 * bundling. Preserve observed protocol, event, DOM, and error semantics.
 */
function CNTabContainer() {
  this.containers = [];
  this._tabButtons = {};
  this.layoutOffset = {
    x: -5,
    y: -5,
    w: 10,
    h: 10
  }
}
Util.mixin(CNTabContainer.prototype, {
  create: function(b) {
    var a = this.element = document.createElement("<div class='tabContainer'>");
    b.appendChild(a);
    this._bg = ThemeSupport.createScaleableFrame(a, CNFormManager.themeImagesPath + "tab-container-bg_", Util.IE6 ? ".gif" : ".png", 10, 10, 10, 10);
    a.jsObject = this;
    return a
  },
  create_tabButton: function(b) {
    var a = ThemeSupport.createScaleableLine(this.element, CNFormManager.themeImagesPath + "container-tab-2_", Util.IE6 ? ".gif" : ".png", 10, 28, 10);
    Util.addClass(a, "tabbedContainerButton");
    this.element.insertBefore(a, this._bg);
    a.style.zIndex = 1;
    this._tabButtons[b] = a;
    a._id = b;
    Event.add(a, "mouseenter", this, this._tabButton_mouseenter);
    Event.add(a, "mouseleave", this, this._tabButton_mouseleave);
    Event.add(a, "click", this, this._tabButton_click);
    return a
  },
  layout: function() {
    this._bg.style.height = parseInt(this.element.style.height, 10) - parseInt(this._bg.currentStyle.top, 10) + "px"
  },
  set_tabText: function(b, a) {
    this._tabButtons[b].cells[1].innerText = a
  },
  set_tabDisabled: function(d, c) {
    var a = this._tabButtons[d];
    a._disabled = c;
    Util.toggleClass(a, "tabbedContainerButton_disabled", c)
  },
  showTabButton: function(a) {
    this._tabButtons[a].style.display = ""
  },
  hideTabButton: function(a) {
    this._tabButtons[a].style.display = "none"
  },
  set_buttonState: function(f, d) {
    var b = typeof f == "string" ? this._tabButtons[f] : f;
    var e = d ? "1" : "2",
      g = e;
    if (d && b.offsetLeft == 0) {
      g = "1-2"
    }
    var c = Util.IE6 ? ".gif" : ".png";
    var a = b.cells;
    a[0].children[0].src = CNFormManager.themeImagesPath + "container-tab-" + g + "_01" + c;
    a[1].style.background = "url('" + CNFormManager.themeImagesPath + "container-tab-" + e + "_02" + c + "')";
    a[2].children[0].src = CNFormManager.themeImagesPath + "container-tab-" + e + "_03" + c;
    Util.toggleClass(b, "tabbedContainerButton_selected", d);
    b.style.zIndex = d ? 999 : 1;
    setTimeout(function() {
      b.style.zIndex = d ? 1000 : 1
    }, 0)
  },
  selectButton: function(b) {
    var a = typeof b == "string" ? this._tabButtons[b] : b;
    if (this._selectedButton) {
      this.set_buttonState(this._selectedButton, false)
    }
    this._selectedButton = a;
    this.set_buttonState(this._selectedButton, true)
  },
  _tabButton_mouseenter: function(c) {
    var a = c.srcElement;
    if (a._disabled) {
      return
    }
    Util.addClass(a, "tabbedContainerButton_hover")
  },
  _tabButton_mouseleave: function(c) {
    var a = c.srcElement;
    if (a._disabled) {
      return
    }
    Util.removeClass(c.srcElement, "tabbedContainerButton_hover")
  },
  _tabButton_click: function(c) {
    var a = Util.findByClassName(c.srcElement, "tabbedContainerButton");
    if (a._disabled || this._selectedButton == a) {
      return
    }
    this.formManager._selectTab(this, a._id, true);
    if (a._autoPostBack) {
      this.formManager.postData("tabchanged")
    }
  },
  unload: function() {
    this.containers = null
  },
  _dummy: null
});
