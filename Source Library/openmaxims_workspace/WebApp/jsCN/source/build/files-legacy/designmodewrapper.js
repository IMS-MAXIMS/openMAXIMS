/*
 * BUNDLE-DERIVED openMAXIMS IE7 RECONSTRUCTION
 * Module: designmodewrapper.js
 * Evidence: named historical bundle anchor
 * Confidence: tentative
 *
 * This is formatted output from a packed historical bundle region. It is
 * not a byte-for-byte recovery of the original source archive. Original
 * comments, local names, and module boundaries may have been lost through
 * bundling. Preserve observed protocol, event, DOM, and error semantics.
 */
function CNDesignModeWrapper(a) {
  this._wrappedControl = a
}
Util.mixin(CNDesignModeWrapper.prototype, {
  create: function(c) {
    var a = this.element = document.createElement("<div class='cn_designMode_wrapper'>");
    c.appendChild(a);
    var b = document.createElement("<div class='inner'>");
    a.appendChild(b);
    Event.add(a, "mouseenter", this, this._showBorder);
    Event.add(a, "mouseleave", this, this._hideBorder);
    Event.add(a, "contextmenu", this, this._element_contextmenu);
    return a
  },
  _showBorder: function() {
    Util.addClass(this.element, "cn_designMode_wrapper_hover")
  },
  _hideBorder: function() {
    Util.removeClass(this.element, "cn_designMode_wrapper_hover")
  },
  select: function() {
    Util.addClass(this.element, "cn_designMode_wrapper_selected")
  },
  unselect: function() {
    Util.removeClass(this.element, "cn_designMode_wrapper_selected");
    this._hideBorder()
  },
  sync: function() {
    var a = this.element.style,
      c = this._wrappedControl.element,
      b = c.style;
    if (c.parentNode && c.parentNode != this.element.parentNode) {
      c.parentNode.appendChild(this.element)
    }
    a.top = b.top;
    a.left = b.left;
    a.width = b.width;
    a.height = b.height;
    a.zIndex = b.zIndex
  },
  toToolboxMode: function() {
    this._state = "toolbox";
    if (this._wrappedControl._originalFormNode) {
      var a = this._wrappedControl._originalFormNode.getAttribute("designMode_tooltip");
      if (a) {
        Tooltip.set(this.element, a)
      }
    }
    Event.add(this.element, "mousedown", this, this._toolboxMode_mousedown)
  },
  _toolboxMode_mousedown: function(a) {
    Event.cancel(event);
    this._wrappedControl.toolboxMode_clicked(a);
    this._hideBorder()
  },
  toToCanvasMode: function() {
    this._state = "toCanvas";
    Util.addClass(this.element, "cn_designMode_wrapper_toCanvas")
  },
  startInToolboxDragging: function(a) {
    Event.add(document.body, "mousemove", this, this._inToolbox_dragging_mousemove);
    Event.add(document.body, "mouseup", this, this._inToolbox_dragging_finishDrag);
    Event.add(this.element, "losecapture", this, this._inToolbox_dragging_finishDrag);
    var b = Util.getXY(this.element);
    this._dx = event.screenX - b.x;
    this._dy = event.screenY - b.y;
    CNDesignMode.controlDragStarted();
    this.element.setCapture()
  },
  _inToolbox_dragging_mousemove: function(b) {
    Event.cancel(event);
    var a = event.screenX - this._dx;
    var e = event.screenY - this._dy;
    var c = {
      x: a,
      y: e
    };
    var d = CNDesignMode.controlDragging(this, c);
    c = d.snappedXY;
    this.element.style.left = this._wrappedControl.element.style.left = c.x + "px";
    this.element.style.top = this._wrappedControl.element.style.top = c.y + "px";
    if (this._wrappedControl.layout) {
      this._wrappedControl.layout()
    }
    if (d.canvas) {
      if (this._designMode_noDrop) {
        this.element.style.cursor = "move";
        this._designMode_noDrop = false
      }
    } else {
      if (!this._designMode_noDrop) {
        this.element.style.cursor = "no-drop";
        this._designMode_noDrop = true
      }
    }
  },
  _inToolbox_dragging_finishDrag: function(a) {
    Event.del(this.element, "losecapture", this, this._inToolbox_dragging_finishDrag);
    this.element.releaseCapture();
    Event.del(document.body, "mousemove", this, this._inToolbox_dragging_mousemove);
    Event.del(document.body, "mouseup", this, this._inToolbox_dragging_finishDrag);
    var b = CNDesignMode.findCanvasCachedData(this, Util.getXY(this.element));
    this._wrappedControl.toCanvas_dragFinished(b);
    CNDesignMode.controlDragFinished()
  },
  toCanvasMode: function() {
    this._state = "canvas";
    Util.removeClass(this.element, "cn_designMode_wrapper_toCanvas");
    Util.addClass(this.element, "cn_designMode_wrapper_canvas");
    Event.add(this.element, "mousemove", this, this._canvasMode_mousemove);
    Event.add(this.element, "mousedown", this, this._canvasMode_mousedown);
    Event.add(this.element, "mouseup", this, this._canvasMode_mouseup)
  },
  _canvasMode_mouseup: function(a) {
    this._wrappedControl._designMode_canvas.selectControl(this._wrappedControl)
  },
  _canvasMode_mousemove: function(b) {
    if (this._action) {
      return
    }
    var a = CNDesignMode.getResizeBorder(this.element, {
      x: b.clientX,
      y: b.clientY
    });
    if (a) {
      this.element.style.cursor = CNDesignMode.BORDER_CURSORS[a]
    } else {
      this.element.style.cursor = "move"
    }
  },
  _canvasMode_mousedown: function(b) {
    Event.cancel(b);
    if (event.button != 1) {
      return
    }
    if (this._wrappedControl.layout) {
      this._wrappedControl.layout()
    }
    var a = CNDesignMode.getResizeBorder(this.element, {
      x: b.clientX,
      y: b.clientY
    });
    if (a == null) {
      this._dx = event.screenX - this.element.offsetLeft;
      this._dy = event.screenY - this.element.offsetTop;
      this._action = "move"
    } else {
      if (a) {
        this._dw = event.screenX - this.element.offsetWidth;
        this._dh = event.screenY - this.element.offsetHeight;
        this._rdw = -this.element.offsetWidth + document.body.offsetWidth - event.clientX;
        this._rdh = -this.element.offsetHeight + document.body.offsetHeight - event.clientY;
        this._action = a
      }
    }
    Event.add(document.body, "mouseup", this, this._resize_onmouseup);
    Event.add(document.body, "mousemove", this, this._resize_onmousemove);
    this._hideBorder()
  },
  _resize_onmousemove: function(j) {
    Event.cancel(j);
    var m = this.element.style,
      f = this._wrappedControl.element.style;
    var b = this._wrappedControl._designMode_canvas._snapSize;
    if (this._action == "move") {
      m.left = f.left = Util.snapToGrid(j.screenX - this._dx, b) + "px";
      m.top = f.top = Util.snapToGrid(j.screenY - this._dy, b) + "px"
    } else {
      var c = 16,
        n = 16;
      var d = this._wrappedControl.designMode_layout;
      if (d) {
        c = d.minWidth;
        n = d.minHeight
      }
      if (this._action.indexOf("r") != -1) {
        var k = Util.snapToGrid(Math.max(j.screenX - this._dw, c), b);
        m.width = f.width = k + "px"
      } else {
        if (this._action.indexOf("l") != -1) {
          var k = Util.snapToGrid(Math.max(document.body.offsetWidth - this._rdw - j.clientX, c), b);
          var a = this.element.offsetWidth - k;
          m.width = f.width = k + "px";
          m.left = f.left = this.element.offsetLeft + a + "px"
        }
      }
      if (this._action.indexOf("b") != -1) {
        var e = Util.snapToGrid(Math.max(j.screenY - this._dh, n), b);
        m.height = f.height = e + "px"
      } else {
        if (this._action.indexOf("t") != -1) {
          var e = Util.snapToGrid(Math.max(document.body.offsetHeight - this._rdh - j.clientY, n), b);
          var g = this.element.offsetHeight - e;
          m.height = f.height = e + "px";
          m.top = f.top = this.element.offsetTop + g + "px"
        }
      }
    }
    if (this._wrappedControl.layout) {
      this._wrappedControl.layout()
    }
  },
  _resize_onmouseup: function(a) {
    Event.del(document.body, "mouseup", this, this._resize_onmouseup);
    Event.del(document.body, "mousemove", this, this._resize_onmousemove);
    this._showBorder();
    CNDesignMode.controlBoundsChanged(this._wrappedControl);
    this._action = null
  },
  _element_contextmenu: function(a) {
    this._wrappedControl._designMode_canvas.showControlContextMenu(this._wrappedControl)
  }
});
