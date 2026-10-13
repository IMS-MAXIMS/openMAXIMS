/*
 * BUNDLE-DERIVED openMAXIMS IE7 RECONSTRUCTION
 * Module: selectrole_newblue.js
 * Evidence: direct candidate region
 * Confidence: medium
 *
 * This is formatted output from a packed historical bundle region. It is
 * not a byte-for-byte recovery of the original source archive. Original
 * comments, local names, and module boundaries may have been lost through
 * bundling. Preserve observed protocol, event, DOM, and error semantics.
 */
function CN_selectrole_newblue() {
  this._requiresPDS = false;
  this._ticket = null;
  this._ticketError = null;
  this._boxpopup = null
}
var proto = CN_selectrole_newblue.prototype;
proto.createElement = function(c, b) {
  var a = document.createElement('<div class="cn_selectrole_newblue"/>');
  b.appendChild(a);
  this.element = a;
  a.jsObject = this;
  this._buildContent(c);
  return a
};
proto._buildContent = function(b) {
  CN_logincontrol_newblue.createLoginChrome();
  CN_logincontrol_newblue.prototype.displaySiteLogo(false);
  var g = '<div class="container"><div class="scrollableArea"></div></div>';
  this.element.innerHTML = g;
  var m = this._boxpopup = document.createElement("<div class='boxpopup'/>");
  m.innerHTML = "Smartcard login applet is loading";
  $("__loginCenter").appendChild(m);
  this._boxpopup.style.display = "none";
  var a = this._leftLabel = document.createElement("<div class='loginLockedLabel'/>");
  a.innerHTML = "Please Select a Role";
  $("__loginCenter").appendChild(a);
  var c = this.element.firstChild.firstChild,
    f = b.selectNodes("role"),
    h = f.length,
    j = 48,
    k = 9,
    o = 0,
    n = 10;
  if (h > k) {
    c.style.overflow = "auto"
  } else {
    c.style.overflow = "hidden";
    n = (k - h) * j / 2 + 11
  }
  c.style.top = n + "px";
  for (var e = 0; e < h; e++) {
    var d = f[e];
    var a = document.createElement("<div class='roleButton'/>");
    c.appendChild(a);
    a.innerHTML = "<img src='themes/new-blue/g/select-role-button-bg.png ' style='position: absolute; '/><div class='roleButtonText'></div>";
    a.lastChild.innerText = d.text;
    a.tabIndex = e + 1;
    a._roleID = String(d.getAttribute("id"));
    a._requiresPDS = String(d.getAttribute("requiresPDS"));
    Event.add(a, "mouseenter", this, this.button_mouseenter);
    Event.add(a, "mouseleave", this, this.button_mouseleave);
    Event.add(a, "click", this, this.button_click);
    Event.add(a, "focus", this, this.button_mouseenter);
    Event.add(a, "blur", this, this.button_mouseleave);
    Event.add(a, "keypress", this, this.button_keypress)
  }
  Util.replacePNG(this.element)
};
proto.button_mouseenter = function(a) {
  var b = a.srcElement;
  b.firstChild.src = "themes/new-blue/g/select-role-button-hover-bg.png"
};
proto.button_mouseleave = function(a) {
  var b = a.srcElement;
  if (b == document.activeElement) {
    return
  }
  b.firstChild.src = "themes/new-blue/g/select-role-button-bg.png"
};
proto.button_keypress = function(b) {
  if (event.keyCode == 13) {
    var a = Util.findByClassName(b.srcElement, "roleButton");
    this.selectRole(a._roleID, a._requiresPDS)
  }
};
proto.showPopup = function(a) {
  document.all("boxTail").innerHTML = a;
  myPOPCP.display = ""
};
proto.remove_popup = function() {
  myPOPCP.display = "none"
};
proto.docWriteWrapper = function(d) {
  var a = document.createElement("del"),
    c = document.write,
    b = "";
  a.id = "me";
  document.write = function(e) {
    b += e
  };
  d();
  a.innerHTML += b;
  document.write = c;
  document.body.appendChild(a)
};
proto.button_click = function(c) {
  var b = Util.findByClassName(c.srcElement, "roleButton");
  if (!b) {
    return
  }
  if (b._requiresPDS && b._requiresPDS == "true") {
    if (deployJava.versionCheck("1.6.0_17+") == false) {
      userInput = confirm("You need the latest Java(TM) Runtime Environment. Would you like to update now?");
      if (userInput == true) {
        window.location = "http://java.com/"
      }
    } else {
      this.docWriteWrapper(function() {
        var e = {
          id: "smartcardApplet",
          name: "SmartCard",
          code: "SmartCard.class",
          codebase: "applet/",
          style: "width: 1px; height: 1px; float: left;",
          archive: "smartcard.jar, am_sdk.jar",
          mayscript: "mayscript"
        };
        var g = {
          classloader_cache: "no"
        };
        var g = {
          permissions: "all-permissions"
        };
        var g = {
          cache_option: "no"
        };
        var g = {
          separate_jvm: "yes"
        };
        deployJava.runApplet(e, g, "1.6.0_17")
      });
      this._requiresPDS = true;
      if (document.smartcardApplet) {
        try {
          var f;
          if (document.smartcardApplet.length > 1) {
            f = document.smartcardApplet[0].getTicket()
          } else {
            f = document.smartcardApplet.getTicket()
          }
          var a;
          if (f == null) {
            f = "-1";
            try {
              if (document.smartcardApplet.length > 1) {
                a = document.smartcardApplet[0].getError()
              } else {
                a = document.smartcardApplet.getError()
              }
            } catch (d) {}
          }
          this._ticket = f;
          this._ticketError = a
        } catch (d) {}
      }
    }
  }
  this.selectRole(b._roleID, b._requiresPDS)
};
proto.selectRole = function(b, a) {
  this._selectScreenID = b;
  this.formManager.postData(this.element)
};
proto.unload = function() {
  CN_logincontrol_newblue.destroyLoginChrome()
};
proto.loadData = function(a) {};
proto.storeData = function(a) {
  this.formManager._showDisabler(true, false);
  var b = a.createDocumentFragment();
  var d = a.createElement("selectRoleEvent");
  b.appendChild(d);
  d.setAttribute("roleID", this._selectScreenID);
  var c = this.formManager._getStoredLocationsXML(true);
  if (c) {
    b.appendChild(c)
  }
  return b
};
proto = null;
