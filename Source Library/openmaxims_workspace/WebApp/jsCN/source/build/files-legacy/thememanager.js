/*
 * BUNDLE-DERIVED openMAXIMS IE7 RECONSTRUCTION
 * Module: thememanager.js
 * Evidence: structural responsibility region
 * Confidence: medium
 *
 * This is formatted output from a packed historical bundle region. It is
 * not a byte-for-byte recovery of the original source archive. Original
 * comments, local names, and module boundaries may have been lost through
 * bundling. Preserve observed protocol, event, DOM, and error semantics.
 */
var CNThemeManager = {
  _themables: [],
  themeable: function(a) {
    this._themables.push(a);
    if (a.themes) {
      Util.assert("themes property already exists for " + a)
    }
    a.themes = {
      _default: a.prototype
    };
    a.cloneThemesFrom = this._cloneThemesFrom
  },
  _cloneThemesFrom: function(b) {
    for (var a in b.themes) {
      this.themes[a] = Util.clone(b.themes[a])
    }
  },
  themeChanged: function(b) {
    for (var a = 0; a < this._themables.length; a++) {
      var d = this._themables[a],
        e = b;
      if (d.themeChanging) {
        var c = d.themeChanging(b);
        if (c) {
          e = c
        }
      }
      this.applyTheme(d, e);
      if (d.themeChanged) {
        d.themeChanged(e)
      }
    }
  },
  themeUnloaded: function(b) {
    for (var a = 0; a < this._themables.length; a++) {
      var c = this._themables[a];
      if (c.themeUnloaded) {
        c.themeUnloaded(b)
      }
    }
  },
  applyTheme: function(d, b) {
    var c = d.themes[b],
      a = d.themes._default;
    if (!a) {
      Util.assert("Default theme prototype is required for " + d);
      return
    }
    if (b == "_default" || !c) {
      d.prototype = a
    } else {
      d.prototype = Util.merge(a, c)
    }
    d.prototype.constructor = d;
    d.prototype.__theme = b
  }
};
