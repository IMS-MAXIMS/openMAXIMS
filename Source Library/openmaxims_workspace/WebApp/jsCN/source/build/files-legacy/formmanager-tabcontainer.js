/*
 * BUNDLE-DERIVED openMAXIMS IE7 RECONSTRUCTION
 * Module: formmanager-tabcontainer.js
 * Evidence: structural responsibility region
 * Confidence: medium
 *
 * This is formatted output from a packed historical bundle region. It is
 * not a byte-for-byte recovery of the original source archive. Original
 * comments, local names, and module boundaries may have been lost through
 * bundling. Preserve observed protocol, event, DOM, and error semantics.
 */
proto._buildTabContainer = function(e, p, j, c, n, a, g) {
  var o = String(c);
  var k = this._tabbedGroups[o];
  if (!k) {
    k = new CNTabContainer();
    k.formManager = this;
    this._tabbedGroups[o] = k;
    k.groupID = o;
    var h = k.create(p);
    if (g) {
      g.processNewTabsTable(h, j, e, p, n)
    } else {
      LayoutManager.setStaticBounds(k, e)
    }
  }
  var d = new CNGenericContainer();
  var f = d.create(p);
  f.className = "tabContainerElement";
  var b = String(e.getAttribute("id"));
  var m = k.create_tabButton(b);
  m._tabGroupID = o;
  m._autoPostBack = e.getAttribute("autoPostBack") == "true";
  f._tabGroupID = o;
  f.style.display = "none";
  f.style.visibility = "hidden";
  k.containers[b] = f;
  if (g) {
    g.processNewTabbedContainer(f, j, e, p, n)
  } else {
    LayoutManager.setStaticBounds(d, e, f);
    f.style.top = parseInt(f.currentStyle.top, 10) + 22;
    f.style.height = parseInt(f.currentStyle.height, 10) - 22
  }
  return d
};
proto._tabTable_onmousedown = function() {
  var b = CNFormManager.getActiveFormManager();
  var a;
  if (CNFormManager.vista) {
    a = CNUtil.findByClassName(event.srcElement, "tabbedContainerButton");
    if (a._disabled) {
      return
    }
    if (a.filters.length > 0) {
      a.filters[0].Stop()
    }
  } else {
    a = CNUtil.findTag(event.srcElement, "TABLE");
    try {
      a.focus()
    } catch (c) {}
  }
  b._selectTab(a, true, true);
  if (a._autoPostBack) {
    b.postData("tabchanged")
  }
};
proto._selectTab = function(g, h, f) {
  var d = g.groupID;
  var c = g._selectedButton;
  if (c && c._id == h) {
    return
  }
  g.element.style.visibility = "inherit";
  g.selectButton(h);
  var a = g.containers[h];
  if (f && this.delayedControlsCreation) {
    var b = this._delayedContainers[h];
    if (b) {
      this._initDelayedContainer(h, b, a, d);
      this._processDelayedControlsWithoutData()
    }
  }
  if (f) {
    g.isDirty = true
  }
  if (c) {
    var e = g.containers[c._id];
    e.style.visibility = "hidden";
    e.style.display = "none"
  }
  a.style.display = "block";
  a.style.visibility = "inherit";
  if (this._layoutManager) {
    this._layoutManager.doLayout()
  }
};
proto._processTabbedContainer = function(h, e, g) {
  var f = this._tabbedGroups[g];
  if (!f) {
    return
  }
  var a = e.getAttribute("caption");
  var c = e.getAttribute("headerEnabled");
  if (a) {
    f.set_tabText(h, String(a))
  }
  if (c) {
    f.set_tabDisabled(h, c == "false")
  }
  var d = e.getAttribute("headerVisible");
  if (d) {
    d == "true" ? f.showTabButton(h) : f.hideTabButton(h)
  }
  var b = e.getAttribute("visible");
  if (b == "true") {
    this._selectTab(f, h)
  } else {
    if (b == "false" && this._areAllTabsHidden(f)) {
      f.element.style.visibility = "hidden"
    }
  }
};
proto._areAllTabsHidden = function(b) {
  for (var a in b.containers) {
    if (b.containers[a].currentStyle.visibility != "hidden") {
      return false
    }
  }
  return true
};
proto._deleteTabbedGroups = function(b) {
  for (var a in this._tabbedGroups) {
    var c = this._tabbedGroups[a];
    if (!b || b.contains(c.element)) {
      c.containers = null;
      CNFormManager.destroyJSObject(c);
      delete this._tabbedGroups[a]
    }
  }
};
proto._storeTabChanges = function(b, d, g) {
  var a = null;
  for (var c in this._tabbedGroups) {
    var f = this._tabbedGroups[c];
    var e = f._selectedButton;
    if (e && f.isDirty) {
      if (e._autoPostBack && g) {
        a = f;
        continue
      }
      this._storeTabChange(b, d, f)
    }
  }
  return a
};
proto._storeTabChange = function(a, b, e) {
  var d = e._selectedButton;
  var c = a.createElement("containertabselected");
  c.setAttribute("groupID", String(e.groupID));
  c.setAttribute("containerID", String(d._id));
  b.appendChild(c);
  e.isDirty = false
};
