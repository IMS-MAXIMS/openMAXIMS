/*
 * BUNDLE-DERIVED openMAXIMS IE7 RECONSTRUCTION
 * Module: objectmodel-mixins.js
 * Evidence: named historical bundle anchor
 * Confidence: tentative
 *
 * This is formatted output from a packed historical bundle region. It is
 * not a byte-for-byte recovery of the original source archive. Original
 * comments, local names, and module boundaries may have been lost through
 * bundling. Preserve observed protocol, event, DOM, and error semantics.
 */
var ObjectModel = {
  Mixins: {},
  defineMixin: function(a, b) {
    if (this.Mixins[a]) {
      throw new Error(a + " already defined")
    }
    this.Mixins[a] = b;
    b.meta = b.meta || {};
    b.meta.mixin_name = a;
    return b
  },
  addMixin: function(c, a) {
    if (typeof a == "string") {
      a = this.Mixins[a]
    }
    if (a.meta.cache_overrides) {
      c.overridens = c.overridens || {}
    }
    for (var b in a) {
      if (b == "meta") {
        continue
      }
      if (c[b]) {
        this._override(c, b, a[b], a.meta.mixin_name)
      } else {
        c[b] = a[b]
      }
    }
    if (a.included) {
      a.included(c)
    }
    if (!c.mixin_super) {
      c.mixin_super = this._target_obj_mixin_super
    }
  },
  _target_obj_mixin_super: function() {
    var b = ObjectModel._target_obj_mixin_super.caller.super_func_name;
    var a = this[b];
    if (a) {
      a.apply(this)
    }
  },
  _override: function(h, b, f, m) {
    if (/_super$/.test(b)) {
      return
    }
    if (typeof m == "string") {
      m = this.Mixins[m]
    }
    var a = m.meta.mixin_name;
    if (!h[b]) {
      throw new Error("No method " + b + " to override by " + a)
    }
    var e = f.super_func_name = f.super_func_name || a + "_" + b + "_super";
    if (h[e]) {
      throw new Error("Method " + b + "() is already overriden by " + a)
    }
    var c = h[b];
    if (h.meta) {
      c.mixin = h;
      c.super_func_name = h.meta.mixin_name + "_" + b + "_super"
    }
    if (m[e]) {
      var d = e,
        k;
      while ((k = m[d]) && m[k.super_func_name]) {
        d = k.super_func_name
      }
      if (!d) {
        throw new Error("No dead_end for super_func_name: " + e)
      }
      var j = m[d].super_func_name;
      h[j] = c
    } else {
      h[e] = c
    }
    if (c.super_func_name && c.mixin.meta.cache_overrides) {
      var g = c.super_func_name;
      h.overridens[g] = e
    }
    h[b] = f;
    f.mixin = m
  },
  removeMixin: function(h, k) {
    if (typeof k == "string") {
      k = this.Mixins[k]
    }
    var g = k.meta.cache_overrides;
    for (var a in k) {
      if (a == "meta") {
        continue
      }
      var c = k[a];
      var j = h[a];
      var e = c.super_func_name,
        f = h[e];
      if (c === j) {
        if (f) {
          h[a] = f
        } else {
          delete h[a]
        }
      }
      delete h[e];
      if (g) {
        var m = h.overridens[e];
        if (m) {
          h[m] = f;
          delete h.overridens[e]
        }
      } else {
        for (var d in h) {
          var b = h[d];
          if (b instanceof Function && b == c) {
            h[d] = f;
            break
          }
        }
      }
    }
    if (k.excluded) {
      k.excluded(h)
    }
  }
};
