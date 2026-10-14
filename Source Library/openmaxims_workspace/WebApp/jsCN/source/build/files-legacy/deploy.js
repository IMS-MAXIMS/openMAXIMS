/*
 * BUNDLE-DERIVED openMAXIMS IE7 RECONSTRUCTION
 * Module: deploy.js
 * Evidence: direct candidate region
 * Confidence: medium
 *
 * This is formatted output from a packed historical bundle region. It is
 * not a byte-for-byte recovery of the original source archive. Original
 * comments, local names, and module boundaries may have been lost through
 * bundling. Preserve observed protocol, event, DOM, and error semantics.
 */
var deployJava = function() {
  var q = {
    core: ["id", "class", "title", "style"],
    i18n: ["lang", "dir"],
    events: ["onclick", "ondblclick", "onmousedown", "onmouseup", "onmouseover", "onmousemove", "onmouseout", "onkeypress", "onkeydown", "onkeyup"],
    applet: ["codebase", "code", "name", "archive", "object", "width", "height", "alt", "align", "hspace", "vspace"],
    object: ["classid", "codebase", "codetype", "data", "type", "archive", "declare", "standby", "height", "width", "usemap", "name", "tabindex", "align", "border", "hspace", "vspace"]
  };
  var B = q.object.concat(q.core, q.i18n, q.events);
  var p = q.applet.concat(q.core);

  function w(a) {
    if (!z.debug) {
      return
    }
    if (console.log) {
      console.log(a)
    } else {
      alert(a)
    }
  }

  function r(c, d) {
    if (c == null || c.length == 0) {
      return true
    }
    var a = c.charAt(c.length - 1);
    if (a != "+" && a != "*" && (c.indexOf("_") != -1 && a != "_")) {
      c = c + "*";
      a = "*"
    }
    c = c.substring(0, c.length - 1);
    if (c.length > 0) {
      var b = c.charAt(c.length - 1);
      if (b == "." || b == "_") {
        c = c.substring(0, c.length - 1)
      }
    }
    if (a == "*") {
      return (d.indexOf(c) == 0)
    } else {
      if (a == "+") {
        return c <= d
      }
    }
    return false
  }

  function y() {
    var b = "//java.com/js/webstart.png";
    try {
      return document.location.protocol.indexOf("http") != -1 ? b : "http:" + b
    } catch (a) {
      return "http:" + b
    }
  }

  function o(a) {
    var b = "http://java.com/dt-redirect";
    if (a == null || a.length == 0) {
      return b
    }
    if (a.charAt(0) == "&") {
      a = a.substring(1, a.length)
    }
    return b + "?" + a
  }

  function t(b, c) {
    var d = b.length;
    for (var a = 0; a < d; a++) {
      if (b[a] === c) {
        return true
      }
    }
    return false
  }

  function A(a) {
    return t(p, a.toLowerCase())
  }

  function u(a) {
    return t(B, a.toLowerCase())
  }

  function C(a) {
    if ("MSIE" != deployJava.browserName) {
      return true
    }
    if (deployJava.compareVersionToPattern(deployJava.getPlugin().version, ["10", "0", "0"], false, true)) {
      return true
    }
    if (a == null) {
      return false
    }
    return !r("1.6.0_33+", a)
  }
  var z = {
    debug: null,
    version: "20120801",
    firefoxJavaVersion: null,
    myInterval: null,
    preInstallJREList: null,
    returnPage: null,
    brand: null,
    locale: null,
    installType: null,
    EAInstallEnabled: false,
    EarlyAccessURL: null,
    oldMimeType: "application/npruntime-scriptable-plugin;DeploymentToolkit",
    mimeType: "application/java-deployment-toolkit",
    launchButtonPNG: y(),
    browserName: null,
    browserName2: null,
    getJREs: function() {
      var a = new Array();
      if (this.isPluginInstalled()) {
        var b = this.getPlugin();
        var e = b.jvms;
        for (var c = 0; c < e.getLength(); c++) {
          a[c] = e.get(c).version
        }
      } else {
        var d = this.getBrowser();
        if (d == "MSIE") {
          if (this.testUsingActiveX("1.7.0")) {
            a[0] = "1.7.0"
          } else {
            if (this.testUsingActiveX("1.6.0")) {
              a[0] = "1.6.0"
            } else {
              if (this.testUsingActiveX("1.5.0")) {
                a[0] = "1.5.0"
              } else {
                if (this.testUsingActiveX("1.4.2")) {
                  a[0] = "1.4.2"
                } else {
                  if (this.testForMSVM()) {
                    a[0] = "1.1"
                  }
                }
              }
            }
          }
        } else {
          if (d == "Netscape Family") {
            this.getJPIVersionUsingMimeType();
            if (this.firefoxJavaVersion != null) {
              a[0] = this.firefoxJavaVersion
            } else {
              if (this.testUsingMimeTypes("1.7")) {
                a[0] = "1.7.0"
              } else {
                if (this.testUsingMimeTypes("1.6")) {
                  a[0] = "1.6.0"
                } else {
                  if (this.testUsingMimeTypes("1.5")) {
                    a[0] = "1.5.0"
                  } else {
                    if (this.testUsingMimeTypes("1.4.2")) {
                      a[0] = "1.4.2"
                    } else {
                      if (this.browserName2 == "Safari") {
                        if (this.testUsingPluginsArray("1.7.0")) {
                          a[0] = "1.7.0"
                        } else {
                          if (this.testUsingPluginsArray("1.6")) {
                            a[0] = "1.6.0"
                          } else {
                            if (this.testUsingPluginsArray("1.5")) {
                              a[0] = "1.5.0"
                            } else {
                              if (this.testUsingPluginsArray("1.4.2")) {
                                a[0] = "1.4.2"
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      if (this.debug) {
        for (var c = 0; c < a.length; ++c) {
          w("[getJREs()] We claim to have detected Java SE " + a[c])
        }
      }
      return a
    },
    installJRE: function(a, c) {
      var d = false;
      if (this.isPluginInstalled() && this.isAutoInstallEnabled(a)) {
        var b = false;
        if (this.isCallbackSupported()) {
          b = this.getPlugin().installJRE(a, c)
        } else {
          b = this.getPlugin().installJRE(a)
        }
        if (b) {
          this.refresh();
          if (this.returnPage != null) {
            document.location = this.returnPage
          }
        }
        return b
      } else {
        return this.installLatestJRE()
      }
    },
    isAutoInstallEnabled: function(a) {
      if (!this.isPluginInstalled()) {
        return false
      }
      if (typeof a == "undefined") {
        a = null
      }
      return C(a)
    },
    isCallbackSupported: function() {
      return this.isPluginInstalled() && this.compareVersionToPattern(this.getPlugin().version, ["10", "2", "0"], false, true)
    },
    installLatestJRE: function(b) {
      if (this.isPluginInstalled() && this.isAutoInstallEnabled()) {
        var a = false;
        if (this.isCallbackSupported()) {
          a = this.getPlugin().installLatestJRE(b)
        } else {
          a = this.getPlugin().installLatestJRE()
        }
        if (a) {
          this.refresh();
          if (this.returnPage != null) {
            document.location = this.returnPage
          }
        }
        return a
      } else {
        var c = this.getBrowser();
        var d = navigator.platform.toLowerCase();
        if ((this.EAInstallEnabled == "true") && (d.indexOf("win") != -1) && (this.EarlyAccessURL != null)) {
          this.preInstallJREList = this.getJREs();
          if (this.returnPage != null) {
            this.myInterval = setInterval("deployJava.poll()", 3000)
          }
          location.href = this.EarlyAccessURL;
          return false
        } else {
          if (c == "MSIE") {
            return this.IEInstall()
          } else {
            if ((c == "Netscape Family") && (d.indexOf("win32") != -1)) {
              return this.FFInstall()
            } else {
              location.href = o(((this.returnPage != null) ? ("&returnPage=" + this.returnPage) : "") + ((this.locale != null) ? ("&locale=" + this.locale) : "") + ((this.brand != null) ? ("&brand=" + this.brand) : ""))
            }
          }
          return false
        }
      }
    },
    runApplet: function(e, a, c) {
      if (c == "undefined" || c == null) {
        c = "1.1"
      }
      var b = "^(\\d+)(?:\\.(\\d+)(?:\\.(\\d+)(?:_(\\d+))?)?)?$";
      var f = c.match(b);
      if (this.returnPage == null) {
        this.returnPage = document.location
      }
      if (f != null) {
        var d = this.getBrowser();
        if (d != "?") {
          if (this.versionCheck(c + "+")) {
            this.writeAppletTag(e, a)
          } else {
            if (this.installJRE(c + "+")) {
              this.refresh();
              location.href = document.location;
              this.writeAppletTag(e, a)
            }
          }
        } else {
          this.writeAppletTag(e, a)
        }
      } else {
        w("[runApplet()] Invalid minimumVersion argument to runApplet():" + c)
      }
    },
    writeAppletTag: function(a, f) {
      var d = "<applet ";
      var b = "";
      var j = "</applet>";
      var e = true;
      if (null == f || typeof f != "object") {
        f = new Object()
      }
      for (var c in a) {
        if (!A(c)) {
          f[c] = a[c]
        } else {
          d += (" " + c + '="' + a[c] + '"');
          if (c == "code") {
            e = false
          }
        }
      }
      var g = false;
      for (var h in f) {
        if (h == "codebase_lookup") {
          g = true
        }
        if (h == "object" || h == "java_object" || h == "java_code") {
          e = false
        }
        b += '<param name="' + h + '" value="' + f[h] + '"/>'
      }
      if (!g) {
        b += '<param name="codebase_lookup" value="false"/>'
      }
      if (e) {
        d += (' code="dummy"')
      }
      d += ">";
      document.write(d + "\n" + b + "\n" + j)
    },
    versionCheck: function(c) {
      var h = 0;
      var f = "^(\\d+)(?:\\.(\\d+)(?:\\.(\\d+)(?:_(\\d+))?)?)?(\\*|\\+)?$";
      var e = c.match(f);
      if (e != null) {
        var a = false;
        var j = false;
        var b = new Array();
        for (var k = 1; k < e.length; ++k) {
          if ((typeof e[k] == "string") && (e[k] != "")) {
            b[h] = e[k];
            h++
          }
        }
        if (b[b.length - 1] == "+") {
          j = true;
          a = false;
          b.length--
        } else {
          if (b[b.length - 1] == "*") {
            j = false;
            a = true;
            b.length--
          } else {
            if (b.length < 4) {
              j = false;
              a = true
            }
          }
        }
        var g = this.getJREs();
        for (var k = 0; k < g.length; ++k) {
          if (this.compareVersionToPattern(g[k], b, a, j)) {
            return true
          }
        }
        return false
      } else {
        var d = "Invalid versionPattern passed to versionCheck: " + c;
        w("[versionCheck()] " + d);
        alert(d);
        return false
      }
    },
    isWebStartInstalled: function(b) {
      var c = this.getBrowser();
      if (c == "?") {
        return true
      }
      if (b == "undefined" || b == null) {
        b = "1.4.2"
      }
      var d = false;
      var a = "^(\\d+)(?:\\.(\\d+)(?:\\.(\\d+)(?:_(\\d+))?)?)?$";
      var e = b.match(a);
      if (e != null) {
        d = this.versionCheck(b + "+")
      } else {
        w("[isWebStartInstaller()] Invalid minimumVersion argument to isWebStartInstalled(): " + b);
        d = this.versionCheck("1.4.2+")
      }
      return d
    },
    getJPIVersionUsingMimeType: function() {
      for (var b = 0; b < navigator.mimeTypes.length; ++b) {
        var a = navigator.mimeTypes[b].type;
        var c = a.match(/^application\/x-java-applet;jpi-version=(.*)$/);
        if (c != null) {
          this.firefoxJavaVersion = c[1];
          if ("Opera" != this.browserName2) {
            break
          }
        }
      }
    },
    launchWebStartApplication: function(c) {
      var f = navigator.userAgent.toLowerCase();
      this.getJPIVersionUsingMimeType();
      if (this.isWebStartInstalled("1.7.0") == false) {
        if ((this.installJRE("1.7.0+") == false) || ((this.isWebStartInstalled("1.7.0") == false))) {
          return false
        }
      }
      var a = null;
      if (document.documentURI) {
        a = document.documentURI
      }
      if (a == null) {
        a = document.URL
      }
      var e = this.getBrowser();
      var d;
      if (e == "MSIE") {
        d = '<object classid="clsid:8AD9C840-044E-11D1-B3E9-00805F499D93" width="0" height="0"><PARAM name="launchjnlp" value="' + c + '"><PARAM name="docbase" value="' + a + '"></object>'
      } else {
        if (e == "Netscape Family") {
          d = '<embed type="application/x-java-applet;jpi-version=' + this.firefoxJavaVersion + '" width="0" height="0" launchjnlp="' + c + '"docbase="' + a + '" />'
        }
      }
      if (document.body == "undefined" || document.body == null) {
        document.write(d);
        document.location = a
      } else {
        var b = document.createElement("div");
        b.id = "div1";
        b.style.position = "relative";
        b.style.left = "-10000px";
        b.style.margin = "0px auto";
        b.className = "dynamicDiv";
        b.innerHTML = d;
        document.body.appendChild(b)
      }
    },
    createWebStartLaunchButtonEx: function(a, b) {
      if (this.returnPage == null) {
        this.returnPage = a
      }
      var c = "javascript:deployJava.launchWebStartApplication('" + a + "');";
      document.write('<a href="' + c + '" onMouseOver="window.status=\'\'; return true;"><img src="' + this.launchButtonPNG + '" border="0" /></a>')
    },
    createWebStartLaunchButton: function(a, b) {
      if (this.returnPage == null) {
        this.returnPage = a
      }
      var c = "javascript:if (!deployJava.isWebStartInstalled(&quot;" + b + "&quot;)) {if (deployJava.installLatestJRE()) {if (deployJava.launch(&quot;" + a + "&quot;)) {}}} else {if (deployJava.launch(&quot;" + a + "&quot;)) {}}";
      document.write('<a href="' + c + '" onMouseOver="window.status=\'\'; return true;"><img src="' + this.launchButtonPNG + '" border="0" /></a>')
    },
    launch: function(a) {
      document.location = a;
      return true
    },
    isPluginInstalled: function() {
      var a = this.getPlugin();
      if (a && a.jvms) {
        return true
      } else {
        return false
      }
    },
    isAutoUpdateEnabled: function() {
      if (this.isPluginInstalled()) {
        return this.getPlugin().isAutoUpdateEnabled()
      }
      return false
    },
    setAutoUpdateEnabled: function() {
      if (this.isPluginInstalled()) {
        return this.getPlugin().setAutoUpdateEnabled()
      }
      return false
    },
    setInstallerType: function(a) {
      this.installType = a;
      if (this.isPluginInstalled()) {
        return this.getPlugin().setInstallerType(a)
      }
      return false
    },
    setAdditionalPackages: function(a) {
      if (this.isPluginInstalled()) {
        return this.getPlugin().setAdditionalPackages(a)
      }
      return false
    },
    setEarlyAccess: function(a) {
      this.EAInstallEnabled = a
    },
    isPlugin2: function() {
      if (this.isPluginInstalled()) {
        if (this.versionCheck("1.6.0_10+")) {
          try {
            return this.getPlugin().isPlugin2()
          } catch (a) {}
        }
      }
      return false
    },
    allowPlugin: function() {
      this.getBrowser();
      var a = ("Safari" != this.browserName2 && "Opera" != this.browserName2);
      return a
    },
    getPlugin: function() {
      this.refresh();
      var a = null;
      if (this.allowPlugin()) {
        a = document.getElementById("deployJavaPlugin")
      }
      return a
    },
    compareVersionToPattern: function(h, c, a, k) {
      if (h == undefined || c == undefined) {
        return false
      }
      var g = "^(\\d+)(?:\\.(\\d+)(?:\\.(\\d+)(?:_(\\d+))?)?)?$";
      var f = h.match(g);
      if (f != null) {
        var j = 0;
        var e = new Array();
        for (var b = 1; b < f.length; ++b) {
          if ((typeof f[b] == "string") && (f[b] != "")) {
            e[j] = f[b];
            j++
          }
        }
        var d = Math.min(e.length, c.length);
        if (k) {
          for (var b = 0; b < d; ++b) {
            if (e[b] < c[b]) {
              return false
            } else {
              if (e[b] > c[b]) {
                return true
              }
            }
          }
          return true
        } else {
          for (var b = 0; b < d; ++b) {
            if (e[b] != c[b]) {
              return false
            }
          }
          if (a) {
            return true
          } else {
            return (e.length == c.length)
          }
        }
      } else {
        return false
      }
    },
    getBrowser: function() {
      if (this.browserName == null) {
        var a = navigator.userAgent.toLowerCase();
        w("[getBrowser()] navigator.userAgent.toLowerCase() -> " + a);
        if ((a.indexOf("msie") != -1) && (a.indexOf("opera") == -1)) {
          this.browserName = "MSIE";
          this.browserName2 = "MSIE"
        } else {
          if (a.indexOf("trident") != -1 || a.indexOf("Trident") != -1) {
            this.browserName = "MSIE";
            this.browserName2 = "MSIE"
          } else {
            if (a.indexOf("iphone") != -1) {
              this.browserName = "Netscape Family";
              this.browserName2 = "iPhone"
            } else {
              if ((a.indexOf("firefox") != -1) && (a.indexOf("opera") == -1)) {
                this.browserName = "Netscape Family";
                this.browserName2 = "Firefox"
              } else {
                if (a.indexOf("chrome") != -1) {
                  this.browserName = "Netscape Family";
                  this.browserName2 = "Chrome"
                } else {
                  if (a.indexOf("safari") != -1) {
                    this.browserName = "Netscape Family";
                    this.browserName2 = "Safari"
                  } else {
                    if ((a.indexOf("mozilla") != -1) && (a.indexOf("opera") == -1)) {
                      this.browserName = "Netscape Family";
                      this.browserName2 = "Other"
                    } else {
                      if (a.indexOf("opera") != -1) {
                        this.browserName = "Netscape Family";
                        this.browserName2 = "Opera"
                      } else {
                        this.browserName = "?";
                        this.browserName2 = "unknown"
                      }
                    }
                  }
                }
              }
            }
          }
        }
        w("[getBrowser()] Detected browser name:" + this.browserName + ", " + this.browserName2)
      }
      return this.browserName
    },
    testUsingActiveX: function(c) {
      var a = "JavaWebStart.isInstalled." + c + ".0";
      if (typeof ActiveXObject == "undefined" || !ActiveXObject) {
        w("[testUsingActiveX()] Browser claims to be IE, but no ActiveXObject object?");
        return false
      }
      try {
        return (new ActiveXObject(a) != null)
      } catch (b) {
        return false
      }
    },
    testForMSVM: function() {
      var a = "{08B0E5C0-4FCB-11CF-AAA5-00401C608500}";
      if (typeof oClientCaps != "undefined") {
        var b = oClientCaps.getComponentVersion(a, "ComponentID");
        if ((b == "") || (b == "5,0,5000,0")) {
          return false
        } else {
          return true
        }
      } else {
        return false
      }
    },
    testUsingMimeTypes: function(b) {
      if (!navigator.mimeTypes) {
        w("[testUsingMimeTypes()] Browser claims to be Netscape family, but no mimeTypes[] array?");
        return false
      }
      for (var a = 0; a < navigator.mimeTypes.length; ++a) {
        s = navigator.mimeTypes[a].type;
        var c = s.match(/^application\/x-java-applet\x3Bversion=(1\.8|1\.7|1\.6|1\.5|1\.4\.2)$/);
        if (c != null) {
          if (this.compareVersions(c[1], b)) {
            return true
          }
        }
      }
      return false
    },
    testUsingPluginsArray: function(b) {
      if ((!navigator.plugins) || (!navigator.plugins.length)) {
        return false
      }
      var c = navigator.platform.toLowerCase();
      for (var a = 0; a < navigator.plugins.length; ++a) {
        s = navigator.plugins[a].description;
        if (s.search(/^Java Switchable Plug-in (Cocoa)/) != -1) {
          if (this.compareVersions("1.5.0", b)) {
            return true
          }
        } else {
          if (s.search(/^Java/) != -1) {
            if (c.indexOf("win") != -1) {
              if (this.compareVersions("1.5.0", b) || this.compareVersions("1.6.0", b)) {
                return true
              }
            }
          }
        }
      }
      if (this.compareVersions("1.5.0", b)) {
        return true
      }
      return false
    },
    IEInstall: function() {
      location.href = o(((this.returnPage != null) ? ("&returnPage=" + this.returnPage) : "") + ((this.locale != null) ? ("&locale=" + this.locale) : "") + ((this.brand != null) ? ("&brand=" + this.brand) : ""));
      return false
    },
    done: function(a, b) {},
    FFInstall: function() {
      location.href = o(((this.returnPage != null) ? ("&returnPage=" + this.returnPage) : "") + ((this.locale != null) ? ("&locale=" + this.locale) : "") + ((this.brand != null) ? ("&brand=" + this.brand) : "") + ((this.installType != null) ? ("&type=" + this.installType) : ""));
      return false
    },
    compareVersions: function(b, a) {
      var d = b.split(".");
      var e = a.split(".");
      for (var c = 0; c < d.length; ++c) {
        d[c] = Number(d[c])
      }
      for (var c = 0; c < e.length; ++c) {
        e[c] = Number(e[c])
      }
      if (d.length == 2) {
        d[2] = 0
      }
      if (d[0] > e[0]) {
        return true
      }
      if (d[0] < e[0]) {
        return false
      }
      if (d[1] > e[1]) {
        return true
      }
      if (d[1] < e[1]) {
        return false
      }
      if (d[2] > e[2]) {
        return true
      }
      if (d[2] < e[2]) {
        return false
      }
      return true
    },
    enableAlerts: function() {
      this.browserName = null;
      this.debug = true
    },
    poll: function() {
      this.refresh();
      var a = this.getJREs();
      if ((this.preInstallJREList.length == 0) && (a.length != 0)) {
        clearInterval(this.myInterval);
        if (this.returnPage != null) {
          location.href = this.returnPage
        }
      }
      if ((this.preInstallJREList.length != 0) && (a.length != 0) && (this.preInstallJREList[0] != a[0])) {
        clearInterval(this.myInterval);
        if (this.returnPage != null) {
          location.href = this.returnPage
        }
      }
    },
    writePluginTag: function() {
      var a = this.getBrowser();
      if (a == "MSIE") {
        document.write('<object classid="clsid:CAFEEFAC-DEC7-0000-0001-ABCDEFFEDCBA" id="deployJavaPlugin" width="0" height="0"></object>')
      } else {
        if (a == "Netscape Family" && this.allowPlugin()) {
          this.writeEmbedTag()
        }
      }
    },
    refresh: function() {
      navigator.plugins.refresh(false);
      var b = this.getBrowser();
      if (b == "Netscape Family" && this.allowPlugin()) {
        var a = document.getElementById("deployJavaPlugin");
        if (a == null) {
          this.writeEmbedTag()
        }
      }
    },
    writeEmbedTag: function() {
      var b = false;
      if (navigator.mimeTypes != null) {
        for (var a = 0; a < navigator.mimeTypes.length; a++) {
          if (navigator.mimeTypes[a].type == this.mimeType) {
            if (navigator.mimeTypes[a].enabledPlugin) {
              document.write('<embed id="deployJavaPlugin" type="' + this.mimeType + '" hidden="true" />');
              b = true
            }
          }
        }
        if (!b) {
          for (var a = 0; a < navigator.mimeTypes.length; a++) {
            if (navigator.mimeTypes[a].type == this.oldMimeType) {
              if (navigator.mimeTypes[a].enabledPlugin) {
                document.write('<embed id="deployJavaPlugin" type="' + this.oldMimeType + '" hidden="true" />')
              }
            }
          }
        }
      }
    }
  };
  z.writePluginTag();
  if (z.locale == null) {
    var v = null;
    if (v == null) {
      try {
        v = navigator.userLanguage
      } catch (x) {}
    }
    if (v == null) {
      try {
        v = navigator.systemLanguage
      } catch (x) {}
    }
    if (v == null) {
      try {
        v = navigator.language
      } catch (x) {}
    }
    if (v != null) {
      v.replace("-", "_");
      z.locale = v
    }
  }
  return z
}();
