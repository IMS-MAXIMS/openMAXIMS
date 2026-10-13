/*
 * BUNDLE-DERIVED openMAXIMS IE7 RECONSTRUCTION
 * Module: themeabledialog.js
 * Evidence: structural responsibility region
 * Confidence: medium
 *
 * This is formatted output from a packed historical bundle region. It is
 * not a byte-for-byte recovery of the original source archive. Original
 * comments, local names, and module boundaries may have been lost through
 * bundling. Preserve observed protocol, event, DOM, and error semantics.
 */
function CNThemeableDialog() {}
CNThemeManager.themeable(CNThemeableDialog);
CNThemeableDialog._stackedOffset = 0;
CNThemeableDialog.resetStacked = function() {
  this._stackedOffset = 0
};
CNThemeableDialog.temporaryHideAll = function() {
  var d = document.body.children;
  for (var c = 0; c < d.length; c++) {
    var a = d[c];
    if (Util.hasClass(a, "cn_themeable_dialog") && a.currentStyle.display != "none" && a.currentStyle.visibility != "hidden") {
      var b = a.jsObject;
      b.temporaryHide()
    }
  }
};
CNThemeableDialog.reshowAll = function() {
  var c = document.body.children;
  for (var b = 0; b < c.length; b++) {
    var a = c[b];
    if (Util.hasClass(a, "cn_themeable_dialog")) {
      a.jsObject.reshow()
    }
  }
};
CNThemeableDialog.themes._default = {
  create: function(a, b) {
    var c = this.element = document.createElement('<div class="cn_themeable_dialog">');
    document.body.appendChild(c);
    this._closable = a;
    this._maximizable = b;
    this._createBG(c);
    this._createDialogFrame(c, a, b);
    this.element.jsObject = this;
    return c
  },
  resize: function(a, b) {
    if (a) {
      this.element.style.width = a + 20 * 2 + "px"
    }
    if (b) {
      this.element.style.height = b + 20 + 67 + "px"
    }
  },
  pos: function(a, b) {
    this.element.style.left = a + "px";
    this.element.style.top = b + "px"
  },
  _createBG: function(b) {
    var a = ThemeSupport.createScaleableFrame(b, CNFormManager.themeImagesPath + "dialog-bg-1_", ".png", 20, 67, 20, 20);
    Event.add(a, "mousedown", this, this._caption_onmousedown)
  },
  _createDialogFrame: function(d, c, e) {
    var f = this._dialogFrame = document.createElement("<div>");
    d.appendChild(f);
    f.innerHTML = '<div class="dialogButtons"></div><div class="dialogCaption"><div class="dialogCaptionInner"><span class="image"></span><span class="text"><div></div><div class="subCaption"></div></span></div></div><div class="dialogContOuter"><div class="dialogContInner"><div class="dialogContents"></div></div></div>';
    var b = this._dialogFrame.children[1];
    b.onselectstart = Util.cancelEvent;
    Event.add(b, "mousedown", this, this._caption_onmousedown);
    if (this._maximizable) {
      var a = this._maxButton = VistaSupport.createImageSetButton("dialog-max-set.png", 20, 20, 0);
      f.children[0].appendChild(a);
      Event.add(a, "click", this, this._max_click);
      a.onselectstart = Util.cancelEvent
    }
    if (this._closable) {
      var a = VistaSupport.createImageSetButton("dialog-close-set.png", 20, 20, 0);
      f.children[0].appendChild(a);
      Event.add(a, "click", this, this._close_click);
      a.onselectstart = Util.cancelEvent
    }
  },
  set_contentsOffset: function(a) {
    this._dialogFrame.children[2].style.paddingTop = a + 67 + "px"
  },
  captionElement: function() {
    return this._dialogFrame.children[1]
  },
  contentsElement: function() {
    return this._dialogFrame.children[2].firstChild.firstChild
  },
  set_contents: function(a) {
    this.contentsElement().innerHTML = a
  },
  set_caption: function(a) {
    this._dialogFrame.children[1].firstChild.lastChild.firstChild.innerText = a ? a : ""
  },
  set_subCaption: function(b) {
    var a = this._dialogFrame.children[1];
    Util.toggleClass(a, "withSubCaption", b);
    a.firstChild.lastChild.lastChild.innerText = b ? b : ""
  },
  set_captionImage: function(c, d, a) {
    var e = this._dialogFrame.children[1].firstChild.firstChild;
    if (e.firstChild) {
      e.firstChild.removeNode(true)
    }
    if (c) {
      var b = document.createElement("<img>");
      b.src = c;
      if (d) {
        b.style.width = d
      }
      if (a) {
        b.style.height = a
      }
      e.appendChild(b);
      Util.replacePNGImage(b)
    }
  },
  show: function(c, d, e) {
    var b = this.element;
    b.style.zIndex = top.__ontopZ++;
    b.style.visibility = "hidden";
    b.style.display = "block";
    if (c) {
      var a = (document.body.clientWidth - parseInt(b.currentStyle.width)) / 2,
        f = (document.body.clientHeight - parseInt(b.currentStyle.height)) / 2;
      if (c == "stacked") {
        a += CNThemeableDialog._stackedOffset;
        f += CNThemeableDialog._stackedOffset;
        CNThemeableDialog._stackedOffset += 16;
        if (CNThemeableDialog._stackedOffset > 100) {
          CNThemeableDialog._stackedOffset = -16 * 5
        }
      }
      this.pos(a, f)
    }
    this._finishDelegate = d;
    this._maxDelegate = e;
    b.style.visibility = "visible"
  },
  hide: function(a) {
    if (Util.call(this._finishDelegate, this, !a) === false) {
      return
    }
    if (this.element) {
      this.element.style.display = "none"
    }
  },
  temporaryHide: function() {
    this.element.style.visibility = "hidden"
  },
  reshow: function() {
    this.element.style.visibility = ""
  },
  toggleMaximize: function() {
    this._maximized ? this.restore() : this.maximize()
  },
  maximize: function() {
    if (this._maximized) {
      return
    }
    this._maximized = !this._maximized;
    var a = this.element;
    this._storedBounds = {
      x: a.offsetLeft,
      y: a.offsetTop,
      w: a.offsetWidth,
      h: a.offsetHeight
    };
    Util.addClass(a, "cn_themeable_dialog_maximized");
    a.style.width = "100%";
    a.style.height = "100%";
    a.style.top = "0px";
    a.style.left = "0px";
    VistaSupport.updateImageSetButton(this._maxButton, null, 20);
    Util.call(this._maxDelegate, this, true)
  },
  restore: function() {
    if (!this._maximized) {
      return
    }
    this._maximized = false;
    var c = this.element;
    Util.removeClass(c, "cn_themeable_dialog_maximized");
    var a = this._storedBounds;
    c.style.left = a.x + "px";
    c.style.top = a.y + "px";
    c.style.width = a.w + "px";
    c.style.height = a.h + "px";
    VistaSupport.updateImageSetButton(this._maxButton, null, 0);
    Util.call(this._maxDelegate, this, false)
  },
  destroy: function() {
    this._finishDelegate = null;
    this._maxDelegate = null;
    CNFormManager.destroyJSObject(this)
  },
  _close_click: function(a) {
    this.hide(false)
  },
  _max_click: function(a) {
    this.toggleMaximize()
  },
  _caption_onmousedown: function(b) {
    var a = this.element;
    if (this._maximized) {
      return
    }
    Event.add(a, "mousemove", this, this._caption_doDrag);
    Event.add(a, "mouseup", this, this._caption_finishDrag);
    Event.add(a, "losecapture", this, this._caption_finishDrag);
    a.setCapture()
  },
  _caption_doDrag: function(b) {
    var a = this.element;
    if (!this._dragging) {
      this._dragging = {};
      this._dragging._startLeft = a.offsetLeft;
      this._dragging._startTop = a.offsetTop;
      this._dragging._x = b.screenX;
      this._dragging._y = b.screenY
    }
    a.style.pixelLeft = this._dragging._startLeft + b.screenX - this._dragging._x;
    a.style.pixelTop = this._dragging._startTop + b.screenY - this._dragging._y
  },
  _caption_finishDrag: function(b) {
    var a = this.element;
    Event.del(a, "mousemove", this, this._caption_doDrag);
    Event.del(a, "mouseup", this, this._caption_finishDrag);
    Event.del(a, "losecapture", this, this._caption_finishDrag);
    a.releaseCapture();
    this._dragging = null
  },
  _dummy: null
};
CNThemeableDialog.themes.blue = {
  resize: function(a, b) {
    if (a) {
      this.element.style.width = a + 12 * 2 + "px"
    }
    if (b) {
      this.element.style.height = b + 14 + 67 + "px"
    }
  }
};
proto = null;
