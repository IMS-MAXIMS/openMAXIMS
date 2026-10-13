/*
 * BUNDLE-DERIVED openMAXIMS IE7 RECONSTRUCTION
 * Module: lightweightdom.js
 * Evidence: structural responsibility region
 * Confidence: medium
 *
 * This is formatted output from a packed historical bundle region. It is
 * not a byte-for-byte recovery of the original source archive. Original
 * comments, local names, and module boundaries may have been lost through
 * bundling. Preserve observed protocol, event, DOM, and error semantics.
 */
var Util = {
  isIE: true,
  _classRE: [],
  writeAssertsToDebugLog: false,
  nop: function() {},
  assert: function(c, b) {
    if (typeof c == "string") {
      var d = "ASSERT: " + c;
      this.writeAssertsToDebugLog ? CNFormManager._trace(d) : alert(d);
      return false
    }
    var a = c.apply(b || this);
    if (!a) {
      d = "ASSERT failed: " + c;
      this.writeAssertsToDebugLog ? CNFormManager._trace(d) : alert(d)
    }
    return a
  },
  bind: function(b, a) {
    return function() {
      a.apply(b, arguments)
    }
  },
  findElement: function(a) {
    while (a != null && !a.jsObject) {
      a = a.parentElement
    }
    return a
  },
  findJSObject: function(a) {
    var a = Util.findElement(a);
    if (a) {
      return a.jsObject
    }
    return null
  },
  handleEvent: function(a, b, d) {
    var c = Util.dispatcher((d ? d : "") + b);
    a.attachEvent(b, c);
    return c
  },
  dispatcher: function(a) {
    return function() {
      var b = Util.dispatchObject();
      if (b) {
        var c = b[a];
        if (c) {
          c.apply(b)
        }
      }
    }
  },
  dispatchObject: function() {
    return Util.findJSObject(event.srcElement)
  },
  dispatchByClass: function(a) {
    var b = Util.dispatchObject();
    while (b && b.constructor != a) {
      b = Util.findJSObject(b.element.parentElement)
    }
    if (b && b.constructor == a) {
      return b
    }
    return null
  },
  findTag: function(b, a) {
    while (b != null && b.tagName != a) {
      b = b.parentElement
    }
    return b
  },
  findByClassName: function(b, a) {
    while (b) {
      if (Util.hasClass(b, a)) {
        return b
      }
      b = b.parentNode
    }
    return b
  },
  _reClassNameCache: {},
  _getClassRegEx: function(b) {
    var a = this._reClassNameCache[b];
    if (!a) {
      a = new RegExp("(?:^|\\s+)" + b + "(?:\\s+|$)");
      this._reClassNameCache[b] = a
    }
    return a
  },
  removeClass: function(a, b) {
    a.className = this.chop(a.className.replace(this._getClassRegEx(b), " "))
  },
  hasClass: function(a, c) {
    var b = this._classRE[c];
    if (!b) {
      b = this._classRE[c] = new RegExp("(?:^|\\s+)" + c + "(?:\\s+|$)")
    }
    return b.test(a.className)
  },
  addClass: function(a, b) {
    if (!this.hasClass(a, b)) {
      a.className += " " + b
    }
  },
  toggleClass: function(b, c, a) {
    a ? this.addClass(b, c) : this.removeClass(b, c)
  },
  findAbsolutePos: function(d, g, c, b) {
    var a = 0,
      f = 0;
    if (!g) {
      g = document.body
    }
    if (g == document.body && !c && !b) {
      var e = d.getBoundingClientRect();
      return {
        x: e.left - 2,
        y: e.top - 2
      }
    }
    while (d != null && d != g) {
      if (c && d.currentStyle.position != "static") {
        break
      }
      a += d.offsetLeft + d.clientLeft;
      f += d.offsetTop + d.clientTop;
      d = d.offsetParent;
      if (b && d) {
        if (d.scrollLeft) {
          a -= d.scrollLeft
        }
        if (d.scrollTop) {
          f -= d.scrollTop
        }
      }
    }
    return {
      x: a,
      y: f
    }
  },
  calcElementOffset: function(a) {
    var b = Util.findAbsolutePos(a, null, false);
    b.x -= top.document.body.scrollLeft;
    b.y -= top.document.body.scrollTop;
    return b
  },
  setBounds: function(a, b) {
    this.setLocation(a, b);
    this.setSize(a, b)
  },
  setLocation: function(b, c) {
    var a = c.getAttribute("x");
    var d = c.getAttribute("y");
    if (a) {
      b.style.left = a
    }
    if (d) {
      b.style.top = d
    }
  },
  setSize: function(b, d) {
    var c = d.getAttribute("width");
    var a = d.getAttribute("height");
    if (c) {
      b.style.width = c
    }
    if (a) {
      b.style.height = a
    }
  },
  cancelEvent: function(a) {
    if (!a) {
      a = event
    }
    a.cancelBubble = true;
    a.returnValue = false
  },
  cancelBubble: function(a) {
    if (!a) {
      a = event
    }
    a.cancelBubble = true
  },
  cloneObject: function(a) {
    var c = {};
    for (var b in a) {
      c[b] = a[b]
    }
    return c
  },
  mixin: function(d, c) {
    for (var e in c) {
      d[e] = c[e]
    }
    if (c.hasOwnProperty("toString")) {
      d.toString = c.toString
    }
  },
  merge: function(d, c) {
    var d = this.cloneObject(d);
    this.mixin(d, c);
    return d
  },
  conditionalMixin: function(d, c) {
    for (var e in c) {
      if (!d[e]) {
        d[e] = c[e]
      }
    }
  },
  createToolbar: function(a) {
    var b = document.createElement("<div class=cnToolbar>");
    b.unselectable = "on";
    a.appendChild(b);
    return b
  },
  addButton: function(c, g, j, e, f, h) {
    var a = document.createElement("span");
    c.appendChild(a);
    a.unselectable = "on";
    a.isButton = true;
    a.className = "button_normal";
    a.isPushable = h;
    a.cmd = g;
    a.title = e;
    a.param = j;
    a.state = "normal";
    a.attachEvent("onmouseenter", Util._button_onmouseenter);
    a.attachEvent("onmouseleave", Util._button_onmouseleave);
    a.attachEvent("onmousedown", Util._button_onmousedown);
    a.attachEvent("ondblclick", Util._button_onmouseup);
    a.attachEvent("onmouseup", Util._button_onmouseup);
    a.attachEvent("ondragstart", Util.cancelEvent);
    a.attachEvent("onselectstart", Util.cancelEvent);
    var d = document.createElement("img");
    a.appendChild(d);
    d.src = f;
    d.unselectable = "on";
    return a
  },
  addSeparator: function(a) {
    var b = document.createElement("<span class=cnToolbarSeparator>");
    b.unselectable = "on";
    a.appendChild(b);
    return b
  },
  setButtonState: function(a, c) {
    a.state = c;
    setTimeout(function() {
      a.className = "button_" + c
    }, 0)
  },
  _button_onmouseenter: function() {
    var a = event.srcElement;
    if (a._disabled || a.parentElement._disabled) {
      return
    }
    if (a.state == "normal") {
      Util.setButtonState(a, "normalHover")
    } else {
      if (a.state == "pushed") {
        Util.setButtonState(a, "pushedHover")
      }
    }
  },
  _button_onmouseleave: function() {
    var a = event.srcElement;
    if (a._disabled || a.parentElement._disabled) {
      return
    }
    if (a.state == "normalHover" || a.state == "normalDown") {
      Util.setButtonState(a, "normal")
    } else {
      if (a.state == "pushedHover" || a.state == "pushedDown") {
        Util.setButtonState(a, "pushed")
      }
    }
  },
  _button_onmousedown: function() {
    var a = event.srcElement;
    while (a && !a.isButton) {
      a = a.parentElement
    }
    if (a._disabled || a.parentElement._disabled) {
      return
    }
    if (!a.isPushable) {
      Util.setButtonState(a, "normalDown")
    } else {
      if (a.state == "pushedHover") {
        Util.setButtonState(a, "normalDown")
      } else {
        Util.setButtonState(a, "pushedDown")
      }
    }
  },
  _button_onmouseup: function() {
    var c = event.srcElement;
    while (c && !c.isButton) {
      c = c.parentElement
    }
    if (!c) {
      return
    }
    if (c._disabled || c.parentElement._disabled) {
      return
    }
    var a = Util.findJSObject(event.srcElement);
    if (c._group && a._groupButtons) {
      var d = a._groupButtons[c._group];
      if (d) {
        Util.setButtonState(d, c.state == "pushedHover" ? "pushed" : "normal")
      }
      a._groupButtons[c._group] = c
    }
    if (c.state == "pushedDown") {
      Util.setButtonState(c, "pushedHover")
    } else {
      Util.setButtonState(c, "normalHover")
    }
    if (c.cmd) {
      if (a[c.cmd]) {
        a[c.cmd](c.param, c)
      }
    }
  },
  trim: function(c) {
    var c = c.replace(/^\s\s*/, ""),
      a = /\s/,
      b = c.length;
    while (a.test(c.charAt(--b))) {}
    return c.slice(0, b + 1)
  },
  cleanElement: function(a) {
    var c = a.children;
    var d = c.length;
    for (var b = d - 1; b >= 0; b--) {
      c[b].removeNode(true)
    }
  },
  padString: function(d, b, e) {
    d = String(d);
    b = String(b);
    if (d.length < e) {
      var c = b;
      for (var a = 1; a < d.length - e; a++) {
        c += b
      }
      d = c + d
    }
    return d
  },
  posPopup: function(d, c, g) {
    d.style.left = c;
    d.style.top = g;
    var f = Util.findAbsolutePos(d, null, false, true);
    var a = f.y + d.offsetHeight;
    var e = f.x + d.offsetWidth;
    if (e > d.document.body.clientWidth) {
      d.style.pixelLeft = d.offsetLeft - e + d.document.body.clientWidth - 4
    }
    if (a > d.document.body.clientHeight) {
      d.style.pixelTop = d.offsetTop - a + d.document.body.clientHeight - 4
    }
  },
  wrapIntoNode: function(a) {
    a.getAttribute = this.wrap_getAttribute;
    a.setAttribute = this.wrap_setAttribute;
    a.cloneNode = this._wrap_cloneNode;
    return a
  },
  _wrap_cloneNode: function() {
    return Util.cloneObject(this)
  },
  wrap_getAttribute: function(a) {
    var b = this[a];
    return b == undefined ? null : b
  },
  wrap_setAttribute: function(a, b) {
    this[a] = b
  },
  replacePNG: function(a) {
    var e = a.getElementsByTagName("img");
    var d = e.length;
    for (var c = d - 1; c >= 0; c--) {
      var b = e[c];
      if (b.src.indexOf(".png") != -1 && b.getAttribute("replacePNG") != "no") {
        if (!b.currentStyle.filter) {
          this.replacePNGImage(b)
        }
      }
    }
  },
  replacePNGImage: function(b, e, a) {
    var d = document.createElement("span");
    d.className = b.className;
    var c = d.style;
    c.cssText = b.style.cssText;
    c.width = e || b.currentStyle.width;
    c.height = a || b.currentStyle.height;
    c.overflow = "hidden";
    c.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale, src='" + b.src + "')";
    b.parentNode.replaceChild(d, b)
  },
  getCaller: function(c, a) {
    for (var b in c) {
      if (c[b] == a) {
        return b
      }
    }
    return a
  },
  benchmark: function(c, d, a) {
    var e = new Date().getTime();
    if (a) {
      c.apply(a)
    } else {
      c()
    }
    var b = new Date().getTime() - e;
    d = d ? d + ": " : "";
    if (CNFormManager) {
      CNFormManager._trace(d + b + "ms")
    }
  },
  getElapsed: function(a) {
    return new Date().getTime() - a.getTime()
  },
  definitionTag: function(a) {
    return a.substr(0, a.indexOf(">") + 1)
  },
  escapeAttr: function(a) {
    return a.replace(/&/g, "&amp;").replace(/"/g, "&quot;").replace(/'/g, "&#39;").replace(/>/g, "&gt;").replace(/</g, "&lt;")
  },
  xmlNodeToJson: function(a) {
    return {
      tag: a.tagName,
      attributes: this.xmlAttributesToJson(a),
      children: this.xmlNodeListToJson(a.childNodes)
    }
  },
  xmlNodeListToJson: function(e) {
    var d = e.length;
    var b = [];
    for (var a = 0; a < d; a++) {
      var c = e[a];
      if (c.nodeType != 1) {
        continue
      }
      b.push(this.xmlNodeToJson(c))
    }
    return b
  },
  xmlAttributesToJson: function(f) {
    var b = f.attributes;
    var e = b.length;
    var d = {};
    for (var c = 0; c < e; c++) {
      var a = b[c];
      d[a.name] = a.value
    }
    return d
  },
  arrayIndexOf: function(c, b) {
    for (var a = 0; a < c.length; a++) {
      if (c[a] === b) {
        return a
      }
    }
    return -1
  },
  call: function() {
    var a = Array.prototype.shift.apply(arguments);
    if (a) {
      if (a instanceof Array && a.length > 1) {
        if (a[1] instanceof Function) {
          return a[1].apply(a[0], arguments)
        } else {
          return a[0][a[1]].apply(a[0], arguments)
        }
      } else {
        if (a instanceof Function) {
          a(arguments)
        }
      }
    }
  },
  snapToGrid: function(a, b) {
    return Math.round(a / b) * b
  }
};
