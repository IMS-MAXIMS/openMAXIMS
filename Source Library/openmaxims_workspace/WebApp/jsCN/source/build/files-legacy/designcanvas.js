/*
 * BUNDLE-DERIVED openMAXIMS IE7 RECONSTRUCTION
 * Module: designcanvas.js
 * Evidence: direct candidate region
 * Confidence: medium
 *
 * This is formatted output from a packed historical bundle region. It is
 * not a byte-for-byte recovery of the original source archive. Original
 * comments, local names, and module boundaries may have been lost through
 * bundling. Preserve observed protocol, event, DOM, and error semantics.
 */
function CN_designcanvas() {
  this._snapSize = 4;
  this._reset()
}
Util.mixin(CN_designcanvas.prototype, {
  _reset: function() {
    this._idCounter = 0;
    this._firstZIndex = 10000;
    this._lastZIndex = this._firstZIndex;
    var b = this._designDOM = new ActiveXObject("Microsoft.XMLDOM");
    var a = b.appendChild(b.createElement("root"));
    this._designFormNode = a.appendChild(b.createElement("form"));
    this._designDataNode = a.appendChild(b.createElement("data"));
    this._selectedControl = null;
    this._controlListOptions = [{
      text: "",
      value: ""
    }]
  },
  createElement: function(c, b) {
    var a = this.element = document.createElement("div");
    a.className = "cn_designcanvas";
    if (b) {
      b.appendChild(a)
    }
    a.jsObject = this;
    this._createToolbar();
    this._canvas = document.createElement("<div class='canvas'>");
    a.appendChild(this._canvas);
    Event.add(a, "mousedown", this, this._element_mousedown);
    this._gridID = String(c.getAttribute("grid"));
    this._createContextMenu();
    CNDesignMode.registerCanvas(this);
    return a
  },
  _createToolbar: function() {
    var c = Util.createToolbar(this.element);
    var b = this._controlListCombo = new CN_combobox();
    b.doNotFocus = true;
    var a = b.createElement(this._controlListOptions, c);
    Util.addClass(a, "controlSelect");
    b.onchange = Util.bind(this, this._controlSelectOptions_onchange)
  },
  unload: function() {
    this._clean();
    CNDesignMode.cleanup();
    this._control_contextMenu.destroy();
    CNFormManager.destroyJSObject(this._controlListCombo)
  },
  loadData: function(d) {
    var c = d.getAttribute("canvasHeight");
    if (c) {
      this._canvas.style.height = c + "px"
    }
    var b = d.getAttribute("canvasWidth");
    if (b) {
      this._canvas.style.width = b + "px"
    }
    var a = d.getAttribute("grid");
    if (a) {
      Util.toggleClass(this._canvas, "canvas_grid_16x16", a == "true")
    }
    var a = d.getAttribute("snap");
    if (a) {
      this._snapSize = Math.max(1, parseInt(a, 10))
    }
    var e = d.selectSingleNode("form");
    if (e) {
      this._loadFormNode(e, d.selectSingleNode("data"))
    }
  },
  _clean: function() {
    this._unselectControl();
    var a = this._allControls();
    for (var b = 0; b < a.length; b++) {
      CNFormManager.destroyJSObject(a[b])
    }
    this._reset();
    this._controlListCombo.initData(this._controlListOptions)
  },
  _loadFormNode: function(f, c) {
    this._clean();
    var b = f.selectNodes("*");
    for (var d = 0; d < b.length; d++) {
      var e = b[d],
        a;
      if (c) {
        a = c.selectSingleNode(e.tagName + "[@id='" + e.getAttribute("id") + "']")
      }
      this._loadControlNode(e, a)
    }
  },
  _loadControlNode: function(c, b) {
    var a = this._setupControlDOM(c, b);
    var d = this._buildControl(a);
    d.designMode_zIndex(this.designMode_lastZIndex());
    this._addToControlList(d)
  },
  validateLoading: function() {
    if (this._gridID && !this._grid) {
      this._initGrid()
    }
  },
  storeData: function(j) {
    var h = this._allControls();
    h.sort(function(m, k) {
      var n = m.designMode_zIndex(),
        o = k.designMode_zIndex();
      return n > o ? 1 : (n == o ? 0 : -1)
    });
    var c = j.createElement("designcanvas");
    var a = j.createElement("form");
    c.appendChild(a);
    var d = j.createElement("data");
    c.appendChild(d);
    for (var g = 0; g < h.length; g++) {
      var f = h[g];
      var b = f.designMode_nodes.formNode.cloneNode(true);
      b.removeAttribute("designMode");
      a.appendChild(b);
      var e = f.designMode_nodes.dataNode.cloneNode(true);
      d.appendChild(e)
    }
    return c
  },
  _allControls: function() {
    var c = this._canvas.children;
    var a = [];
    for (var b = 0; b < c.length; b++) {
      var d = c[b];
      if (!d.isControl) {
        continue
      }
      a.push(d.jsObject)
    }
    return a
  },
  _initGrid: function(b) {
    var a = this.element.parentElement.all[this._gridID];
    if (!a) {
      Util.assert("!grid_el");
      return
    }
    this._grid = a.jsObject;
    if (!this._grid || !(this._grid instanceof CN_dynamicgrid2)) {
      Util.assert(b + " is not dynamicgrid2");
      return
    }
    ObjectModel.addMixin(this._grid, "CNDesignGridMixin");
    this._grid.designMode_init()
  },
  designMode_lastZIndex: function() {
    return this._lastZIndex++
  },
  getCanvasBounds: function() {
    var c = Util.getXY(this._canvas);
    c.x += this._canvas.clientLeft + this.element.scrollLeft;
    c.y += this._canvas.clientTop + this.element.scrollTop;
    var a = this._canvas.clientWidth;
    var b = this._canvas.clientHeight;
    if (this._canvas.clientTop + b > this.element.clientHeight) {
      b = this.element.clientHeight
    }
    if (this._canvas.clientLeft + b > this.element.clientWidth) {
      a = this.element.clientWidth
    }
    return {
      xy: c,
      r: a + c.x,
      b: b + c.y
    }
  },
  controlDragging: function(c, b, a) {
    var e = b.x - a.xy.x,
      d = b.y - a.xy.y;
    e = Util.snapToGrid(e, this._snapSize);
    d = Util.snapToGrid(d, this._snapSize);
    b.x = e + a.xy.x;
    b.y = d + a.xy.y;
    return b
  },
  attachNewControl: function(c) {
    var a = this.getCanvasBounds(),
      b = Util.getXY(c.element),
      e = b.x - a.xy.x + this.element.scrollLeft,
      d = b.y - a.xy.y + this.element.scrollTop;
    this._canvas.appendChild(c.element);
    c.element.style.left = e + "px";
    c.element.style.top = d + "px";
    c.designMode_zIndex(this.designMode_lastZIndex());
    c.enterCanvasMode(this);
    c.designMode_nodes = this._setupControlDOM(c._originalFormNode, c._originalDataNode);
    this.setControlID(c, this._findAvailableID(c._originalFormNode.tagName));
    this._addToControlList(c);
    this.selectControl(c)
  },
  _addToControlList: function(a) {
    this._controlListOptions.push({
      text: a.elementID + ": " + a.designMode_nodes.formNode.tagName,
      value: a.elementID
    });
    this._controlListCombo.initData(this._controlListOptions)
  },
  _setupControlDOM: function(a, d) {
    var c = a.cloneNode(true);
    var b = d ? d.cloneNode(true) : this._designDOM.createElement(a.tagName);
    c.setAttribute("designMode", CNDesignMode.CANVAS);
    this._designFormNode.appendChild(c);
    this._designDataNode.appendChild(b);
    return {
      formNode: c,
      dataNode: b
    }
  },
  _findAvailableID: function(a) {
    var b;
    do {
      b = a + this._idCounter++
    } while (this._canvas.children[b]);
    return b
  },
  selectControl: function(c, b) {
    if (!this._grid) {
      return
    }
    if (this._selectedControl == c) {
      return
    }
    this._unselectControl();
    this._selectedControl = c;
    c.designMode_select();
    this.syncControlWithGrid(c);
    if (!b) {
      for (var a = 0; a < this._controlListOptions.length; a++) {
        if (this._controlListOptions[a].value == c.elementID) {
          this._controlListCombo.set_selectedIndex(a, true);
          break
        }
      }
    }
  },
  syncControlWithGrid: function(a) {
    if (this._selectedControl != a) {
      return
    }
    a.designMode_syncBoundsWithDOM();
    this._grid.designMode_bindControl(a)
  },
  _unselectControl: function() {
    if (this._selectedControl) {
      this._grid.designMode_unbindControl();
      this._selectedControl.designMode_unselect();
      this._selectedControl = null;
      this._controlListCombo.set_selectedIndex(0, true)
    }
  },
  precheckControlID: function(c, b) {
    b = this._safeID(b);
    var a = this._canvas.all[b];
    if (a) {
      alert("Control with ID=" + b + " already exists on canvas");
      return false
    }
    return true
  },
  setControlID: function(b, a) {
    a = this._safeID(a);
    b.element.id = a;
    b.elementID = a;
    b.designMode_nodes.formNode.setAttribute("id", a);
    b.designMode_nodes.dataNode.setAttribute("id", a)
  },
  _safeID: function(a) {
    if (typeof a == "number" || a.match(/^\d+$/)) {
      return "a" + a
    }
    return a
  },
  rebuildControl: function(c) {
    if (c == this._selectedControl) {
      this._unselectControl()
    }
    var b = c.designMode_nodes;
    CNFormManager.destroyJSObject(c);
    var a = this._buildControl(b);
    this.selectControl(a);
    return a
  },
  _buildControl: function(c) {
    var d = c.formNode.cloneNode(true);
    d.removeAttribute("anchor");
    d.removeAttribute("menuID");
    var b = this.formManager._executeXMLControl(d, this._canvas, false, false, true);
    var a = b.element;
    b.designMode_nodes = c;
    b.enterCanvasMode(this, true);
    b.loadData(c.dataNode.cloneNode(true));
    if (b.validateLoading) {
      b.validateLoading()
    }
    return b
  },
  _element_mousedown: function(a) {
    this._unselectControl()
  },
  _controlSelectOptions_onchange: function(b) {
    if (b.selectedIndex <= 0) {
      this._unselectControl();
      return
    }
    var c = this._controlListOptions[b.selectedIndex].value;
    var a = this._canvas.children[c];
    if (!a) {
      Util.assert("!el");
      return
    }
    this.selectControl(a.jsObject, true)
  },
  _createContextMenu: function() {
    var a = this._control_contextMenu = new PopupMenu(document.body, "beforeend");
    Util.addClass(a.element, "cn_designcanvas_control_contextmenu");
    a.createItem("Bring to Front").onmenuclick = Util.bind(this, this._control_contextMenu_bring_to_front);
    a.createItem("Bring Forward").onmenuclick = Util.bind(this, this._control_contextMenu_bring_forward);
    a.createItem("Send Backward").onmenuclick = Util.bind(this, this._control_contextMenu_send_backward);
    a.createItem("Send to Back").onmenuclick = Util.bind(this, this._control_contextMenu_send_to_back);
    a.createHR();
    a.createItem("Delete").onmenuclick = Util.bind(this, this._control_contextMenu_delete)
  },
  showControlContextMenu: function(a) {
    this.selectControl(a);
    this._control_contextMenu.show(event.clientX + document.body.scrollLeft, event.clientY + document.body.scrollTop)
  },
  _control_contextMenu_delete: function(c) {
    if (!this._selectedControl) {
      Util.assert("!this._selectedControl");
      return
    }
    var e = this._selectedControl;
    var d = e.designMode_nodes.formNode;
    d.parentNode.removeChild(d);
    var b = e.designMode_nodes.dataNode;
    b.parentNode.removeChild(b);
    var a = this._controlListCombo.get_selectedIndex();
    this._unselectControl();
    CNFormManager.destroyJSObject(e);
    this._controlListOptions.splice(a, 1);
    this._controlListCombo.initData(this._controlListOptions)
  },
  _control_contextMenu_bring_to_front: function(a) {
    if (!this._selectedControl) {
      Util.assert("!this._selectedControl");
      return
    }
    this._selectedControl.designMode_zIndex(this.designMode_lastZIndex())
  },
  _control_contextMenu_bring_forward: function(c) {
    if (!this._selectedControl) {
      Util.assert("!this._selectedControl");
      return
    }
    var d = this._selectedControl.designMode_zIndex(),
      b = this._controlZIndices();
    for (var a = 0; a < b.length; a++) {
      if (b[a].z > d) {
        this._selectedControl.designMode_zIndex(b[a].z);
        b[a].el.jsObject.designMode_zIndex(d);
        break
      }
    }
  },
  _controlZIndices: function() {
    var b = [];
    for (var a = 0; a < this._canvas.children.length; a++) {
      var c = this._canvas.children[a];
      if (c.isControl) {
        b.push({
          z: c.style.zIndex,
          el: c
        })
      }
    }
    b.sort(function(e, d) {
      return e.z > d.z ? 1 : (e.z == d.z ? 0 : -1)
    });
    return b
  },
  _control_contextMenu_send_backward: function(c) {
    if (!this._selectedControl) {
      Util.assert("!this._selectedControl");
      return
    }
    var d = this._selectedControl.designMode_zIndex(),
      b = this._controlZIndices();
    for (var a = b.length - 1; a >= 0; a--) {
      if (b[a].z < d) {
        this._selectedControl.designMode_zIndex(b[a].z);
        b[a].el.jsObject.designMode_zIndex(d);
        break
      }
    }
  },
  _control_contextMenu_send_to_back: function(a) {
    if (!this._selectedControl) {
      Util.assert("!this._selectedControl");
      return
    }
    this._selectedControl.designMode_zIndex(this._firstZIndex--)
  },
  _dummy: null
});
ObjectModel.defineMixin("CNDesignGridMixin", {
  designMode_init: function() {
    this._selectionPostbackDisabled = true;
    var a = this._designMode_dom = new ActiveXObject("Microsoft.XMLDOM");
    a.loadXML('<dynamicgrid2><col width="120" caption="Property" readOnly="true"/><col width="*" caption="Value"/></dynamicgrid2>');
    this.CNDesignGridMixin_loadData_super(a.documentElement)
  },
  designMode_bindControl: function(b) {
    this.cleanTable();
    this._designMode_row_ix = 0;
    this._rowPropObjMap = {};
    this._designMode_renderProperties(b.designMode_nodes.formNode, CNDesignMode.commonControlProps.form, "designMode_row_common");
    this._designMode_renderProperties(b.designMode_nodes.dataNode, CNDesignMode.commonControlProps.data, "designMode_row_common");
    var a = b.designMode_properties;
    if (a) {
      if (a.form) {
        this._designMode_renderProperties(b.designMode_nodes.formNode, a.form, "designMode_row_form")
      }
      if (a.data) {
        this._designMode_renderProperties(b.designMode_nodes.dataNode, a.data, "designMode_row_data")
      }
    }
    this.rowsDiv_onresize();
    this._designMode_boundControl = b
  },
  designMode_unbindControl: function() {
    this._designMode_boundControl = null;
    this._rowPropObjMap = null;
    this.cleanTable()
  },
  _designMode_renderProperties: function(c, b, e) {
    for (var d in b) {
      var a = b[d];
      this._designMode_renderRow(c, d, a, e)
    }
  },
  _designMode_renderRow: function(d, e, c, h) {
    var g = this._designMode_dom;
    var a = CNDesignMode.controllerForPropObj(c);
    var b = a.genPropertyGridRowXML(d, e, c);
    g.loadXML(b);
    var f = this.appendRow(g.documentElement, this.rowsDiv, null, 0, this._designMode_row_ix++, this.tree_rootType);
    Util.addClass(f, h);
    this._rowPropObjMap[e] = c
  },
  onchanged: function(b) {
    if (!this._designMode_boundControl) {
      Util.assert("!this._designMode_boundControl");
      return
    }
    var c = b.rowID,
      a = this._rowPropObjMap[c];
    CNDesignMode.changePropertyFromGrid(this._designMode_boundControl, a, b)
  },
  storeData: function(a) {},
  loadData: function(a) {},
  isValid: function() {
    return true
  }
});
var IDStringTypeCell = CN_grid.CellTypes.IDString = function(a) {
  this.box = StringTypeCell.createBox()
};
IDStringTypeCell.cn_tagName = "IDString";
Util.mixin(IDStringTypeCell.prototype, StringTypeCell.prototype);
Util.mixin(IDStringTypeCell.prototype, {
  validateValue: function(b, a) {
    if (b.replace(/\s+/, "") == "") {
      if (a.colTag.canBeEmpty) {
        return true
      }
      return false
    } else {
      return b.match(/^[\d\w_-]+$/)
    }
  }
});
