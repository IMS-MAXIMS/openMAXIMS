/*
 * BUNDLE-DERIVED openMAXIMS IE7 RECONSTRUCTION
 * Module: designmodemixin.js
 * Evidence: named historical bundle anchor
 * Confidence: tentative
 *
 * This is formatted output from a packed historical bundle region. It is
 * not a byte-for-byte recovery of the original source archive. Original
 * comments, local names, and module boundaries may have been lost through
 * bundling. Preserve observed protocol, event, DOM, and error semantics.
 */
var CNDesignModeMixin = {
  enterToolboxMode: function() {
    this._designMode = CNDesignMode.TOOLBOX;
    this._initWrapper();
    this._designMode_wrapper.toToolboxMode();
    if (this.layout) {
      this._designMode_originalLayout = this.layout
    }
    this.layout = this._designMode_layout
  },
  enterToCanvasMode: function() {
    this._designMode = CNDesignMode.TO_CANVAS;
    this._initWrapper();
    if (this._designMode_originalLayout) {
      this.layout = this._designMode_originalLayout
    }
    this._designMode_wrapper.toToCanvasMode();
    this.toCanvasModeEntered()
  },
  toCanvasModeEntered: function() {},
  enterCanvasMode: function(a, b) {
    if (this._designMode != CNDesignMode.TO_CANVAS && this._designMode != CNDesignMode.CANVAS) {
      Util.assert("this._designMode != CNDesignMode.TO_CANVAS || this._designMode != CNDesignMode.CANVAS")
    }
    this._initWrapper();
    this._designMode = CNDesignMode.CANVAS;
    this._designMode_canvas = a;
    this._designMode_wrapper.toCanvasMode();
    this.canvasModeEntered();
    this._designMode_wrapper.sync()
  },
  canvasModeEntered: function() {},
  _initWrapper: function() {
    if (this._designMode_wrapper) {
      return
    }
    var a = this._designMode_wrapper = new CNDesignModeWrapper(this);
    a.create(this.element.parentNode);
    a.sync();
    if (this.unload) {
      this._designMode_originalUnload = this.unload
    }
    this.unload = this._designMode_unload
  },
  _designMode_layout: function() {
    if (this._designMode_originalLayout) {
      this._designMode_originalLayout()
    }
    this.syncWrapper()
  },
  _designMode_unload: function() {
    if (this._designMode_originalUnload) {
      this._designMode_originalUnload()
    }
    CNFormManager.destroyJSObject(this._designMode_wrapper)
  },
  syncWrapper: function() {
    if (this._designMode_wrapper) {
      this._designMode_wrapper.sync()
    }
  },
  designMode_init: function(b) {
    if (!b) {
      return
    }
    this._designMode = false;
    var a = b.getAttribute("designMode");
    this._originalFormNode = b.cloneNode(true);
    if (a && a != "false") {
      this._designMode = String(a);
      if (this._designMode == CNDesignMode.TOOLBOX) {
        this.enterToolboxMode()
      }
      this.isValid = this._designMode_isValid_stub;
      this.storeData = Util.nop
    }
    return this._designMode
  },
  _designMode_isValid_stub: function() {
    return true
  },
  designMode_loadData: function(a) {
    if (this._designMode) {
      this._originalDataNode = a.cloneNode(true)
    }
  },
  toolboxMode_clicked: function(b) {
    var a = this._cloneForDraggingToCanvas();
    a._designMode_wrapper.startInToolboxDragging(b)
  },
  _cloneForDraggingToCanvas: function() {
    var c = this._originalFormNode.cloneNode(true);
    c.setAttribute("designMode", "toCanvas");
    c.removeAttribute("anchor");
    c.removeAttribute("menuID");
    Tooltip.hide();
    var b = this.formManager._executeXMLControl(c, document.body, false, false, true);
    var a = b.element;
    var d = Util.getXY(this.element);
    a.style.zIndex = top.__ontopZ++;
    a.style.top = d.y + "px";
    a.style.left = d.x + "px";
    a.style.width = this.element.offsetWidth + "px";
    a.style.height = this.element.offsetHeight + "px";
    if (b.layout) {
      b.layout()
    }
    b.enterToCanvasMode();
    if (this._originalDataNode) {
      b.loadData(this._originalDataNode)
    }
    if (b.validateLoading) {
      b.validateLoading()
    }
    return b
  },
  toCanvas_dragFinished: function(a) {
    if (!a) {
      CNFormManager.destroyJSObject(this)
    } else {
      a.canvas.attachNewControl(this)
    }
  },
  designMode_select: function() {
    this._designMode_wrapper.select()
  },
  designMode_unselect: function() {
    this._designMode_wrapper.unselect()
  },
  designMode_syncBoundsWithDOM: function() {
    var c = this.designMode_nodes.formNode,
      a = this.element,
      b = this.layoutOffset;
    c.setAttribute("width", a.offsetWidth - (b ? b.w : 0));
    c.setAttribute("height", a.offsetHeight - (b ? b.h : 0));
    c.setAttribute("x", a.offsetLeft - (b ? b.x : 0));
    c.setAttribute("y", a.offsetTop - (b ? b.y : 0))
  },
  designMode_zIndex: function(a) {
    if (a === undefined) {
      return this.element.style.zIndex
    }
    this.element.style.zIndex = this._designMode_wrapper.element.style.zIndex = a;
    if (this._controlShadow) {
      this._controlShadow.element.style.zIndex = a
    }
  },
  _dummy: null
};
