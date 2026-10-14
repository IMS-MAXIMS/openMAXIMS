/*
 * BUNDLE-DERIVED openMAXIMS IE7 RECONSTRUCTION
 * Module: designmode.js
 * Evidence: named historical bundle anchor
 * Confidence: tentative
 *
 * This is formatted output from a packed historical bundle region. It is
 * not a byte-for-byte recovery of the original source archive. Original
 * comments, local names, and module boundaries may have been lost through
 * bundling. Preserve observed protocol, event, DOM, and error semantics.
 */
var CNDesignMode = {
  TOOLBOX: "toolbox",
  TO_CANVAS: "toCanvas",
  CANVAS: "canvas",
  BORDER_CURSORS: {
    lt: "nw-resize",
    lb: "sw-resize",
    l: "w-resize",
    rt: "sw-resize",
    rb: "nw-resize",
    r: "w-resize",
    t: "n-resize",
    b: "n-resize"
  },
  RESIZE_BORDER_SIZE: 8,
  _canvases: {},
  propertyTypes: {
    "boolean": {},
    string: {},
    integer: {},
    ID: {},
    URL: {},
    anchor: {},
    select: {}
  },
  defineProperties: function(b) {
    for (var d in b) {
      var a = b[d];
      for (var c in a) {
        a[c].name = c;
        a[c].section = d
      }
    }
    return b
  },
  controllerForPropObj: function(c) {
    var b = c.type || "string";
    var a = this.propertyTypes[b];
    if (!a) {
      throw new Error("Unknown property type: " + b)
    }
    return a.controller ? a.controller : this.propertyTypes.string.controller
  },
  defaultValueForProperty: function(c) {
    if (c.def !== undefined) {
      return c.def
    }
    var b = c.type || "string";
    var a = this.propertyTypes[b];
    if (!a) {
      Util.assert("Unknown property type: " + b);
      return ""
    }
    if (!b.def) {
      return ""
    }
    return b.def
  },
  mixTo: function(a, b) {
    Util.conditionalMixin(a.prototype, CNDesignModeMixin);
    if (b) {
      if (b.properties) {
        a.prototype.designMode_properties = CNDesignMode.defineProperties(b.properties)
      }
      if (b.layout) {
        a.prototype.designMode_layout = b.layout
      }
    }
  },
  registerCanvas: function(a) {
    this._canvases[a.elementID] = a
  },
  unregisterCanvas: function(a) {
    delete this._canvases[a.elementID]
  },
  cleanup: function() {
    this._canvases = {}
  },
  controlDragStarted: function() {
    this._cachedBounds = [];
    for (var b in this._canvases) {
      var a = this._canvases[b];
      this._cachedBounds.push({
        bounds: a.getCanvasBounds(),
        canvas: a
      })
    }
  },
  findCanvasCachedData: function(f, e) {
    var d = e.x + f.element.offsetWidth;
    var a = e.y + f.element.offsetHeight;
    for (var b = 0; b < this._cachedBounds.length; b++) {
      var c = this._cachedBounds[b],
        g = c.bounds;
      if (e.x > g.xy.x && e.y > g.xy.y && d < g.r && a < g.b) {
        return c
      }
    }
    return null
  },
  controlDragging: function(d, c) {
    var b = this.findCanvasCachedData(d, c),
      a = null;
    if (b) {
      a = b.canvas;
      if (a && a.controlDragging) {
        c = a.controlDragging(d, c, b.bounds)
      }
    }
    return {
      snappedXY: c,
      canvas: a
    }
  },
  controlDragFinished: function() {
    this._cachedBounds = null
  },
  getResizeBorder: function(c, d) {
    var j = Util.getXY(c);
    var h = j.x + c.offsetWidth;
    var a = j.y + c.offsetHeight;
    var g = d.x;
    var e = d.y;
    var f = this.RESIZE_BORDER_SIZE;
    if (g < j.x + f) {
      if (e < j.y + f) {
        return "lt"
      } else {
        if (e > a - f) {
          return "lb"
        } else {
          return "l"
        }
      }
    } else {
      if (g > h - f) {
        if (e < j.y + f) {
          return "rt"
        } else {
          if (e > a - f) {
            return "rb"
          } else {
            return "r"
          }
        }
      } else {
        if (e < j.y + f) {
          return "t"
        } else {
          if (e > a - f) {
            return "b"
          }
        }
      }
    }
    return null
  },
  valueForProperty: function(c, d, b) {
    var a = c.getAttribute(d);
    if (a === null) {
      a = CNDesignMode.defaultValueForProperty(b)
    }
    return a
  },
  _genPropertyGridRowXMLHelper: function(b, a) {
    return '<r id="' + Util.escapeAttr(b) + '"><c type="String" readOnly="true">' + Util.escapeAttr(b) + "</c>" + a + "</r>"
  },
  changePropertyFromGrid: function(d, c, b) {
    var a = this.controllerForPropObj(c).toControlValue(d, c, b);
    this.changeProperty(d, c, a)
  },
  changeProperty: function(d, c, b) {
    var a = d.designMode_nodes;
    if (c.precheck && !c.precheck(d, c, b)) {
      d._designMode_canvas.syncControlWithGrid(d);
      return
    }
    if (c.filter) {
      b = c.filter(d, b)
    }
    d = this._tryToSetPropValue(d, c.section == "data" ? a.dataNode : a.formNode, c, b);
    if (d.layout) {
      d.layout()
    }
    d._designMode_wrapper.sync()
  },
  _tryToSetPropValue: function(g, f, d, c) {
    var e = c.toString();
    var a = f.getAttribute(d.name);
    f.setAttribute(d.name, e);
    try {
      if (d.section == "data") {
        this._applyDataPropValue(g, d, c)
      } else {
        g = this._applyFormPropValue(g, d, c)
      }
    } catch (b) {
      alert("Failed to set " + d.name + ": " + b.message);
      if (a !== null) {
        f.setAttribute(d.name, a)
      } else {
        f.removeAttribute(d.name)
      }
      if (d.section == "data") {
        this._applyDataPropValue(g, d, c)
      } else {
        g = this._applyFormPropValue(g, d, c)
      }
      g._designMode_canvas.syncControlWithGrid(g)
    }
    return g
  },
  _applyDataPropValue: function(c, b, a) {
    if (b.mutator !== undefined) {
      if (b.mutator) {
        b.mutator(c, a)
      }
    } else {
      c.loadData(c.designMode_nodes.dataNode)
    }
  },
  _applyFormPropValue: function(c, b, a) {
    if (b.mutator !== undefined) {
      if (b.mutator) {
        b.mutator(c, a)
      }
    } else {
      c = c._designMode_canvas.rebuildControl(c)
    }
    return c
  },
  controlBoundsChanged: function(a) {
    a.designMode_syncBoundsWithDOM();
    a._designMode_canvas.syncControlWithGrid(a)
  },
  _dummy: null
};
