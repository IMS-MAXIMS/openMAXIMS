/*
 * BUNDLE-DERIVED openMAXIMS IE7 RECONSTRUCTION
 * Module: themesupport.js
 * Evidence: structural responsibility region
 * Confidence: medium
 *
 * This is formatted output from a packed historical bundle region. It is
 * not a byte-for-byte recovery of the original source archive. Original
 * comments, local names, and module boundaries may have been lost through
 * bundling. Preserve observed protocol, event, DOM, and error semantics.
 */
function CNThemeSupport() {}
CNThemeManager.themeable(CNThemeSupport);
var ThemeSupport;
CNThemeSupport.themeChanged = function(a) {
  ThemeSupport = new CNThemeSupport()
};
CNThemeSupport.themeChanged("_default");
var proto = CNThemeSupport.prototype;
proto.createScalableFrame = function(d) {
  var e = document.createElement('<table class="themeSupport_scalableFrame" cellspacing="0" cellpadding="0">');
  d.appendChild(e);
  var b = e.appendChild(document.createElement("tbody"));
  for (var c = 1; c <= 3; c++) {
    var f = b.appendChild(document.createElement('<tr class="tr' + c + '">'));
    for (var a = 1; a <= 3; a++) {
      var g = f.appendChild(document.createElement('<td class="td' + a + '">'))
    }
  }
  return e
};
proto.createScaleableFrame = function(d, h, c, b, f, a, g) {
  if (a === undefined) {
    a = b
  }
  if (g === undefined) {
    g = f
  }
  d.insertAdjacentHTML("beforeend", '<table class="themeSupport_scalableFrame" cellspacing="0" cellpadding="0"><tr class="tr1" style="height: ' + f + 'px; "><td class="td1"><img style="width: ' + b + 'px; " src="' + h + "01" + c + '"/></td><td class="td2"><img src="' + h + "02" + c + '"/></td><td class="td3"><img style="width: ' + a + 'px; " src="' + h + "03" + c + '"/></td></tr><tr class="tr2"><td class="td1"><img style="width: ' + b + 'px; " src="' + h + "04" + c + '"/></td><td class="td2"></td><td class="td3"><img style="width: ' + a + 'px; " src="' + h + "06" + c + '"/></td></tr><tr class="tr3"><td class="td1"><img style="width: ' + a + "px; height: " + g + "px; width: " + b + 'px; " src="' + h + "07" + c + '"/></td><td class="td2"><img src="' + h + "08" + c + '"/></td><td class="td3"><img style="width: ' + a + 'px; " src="' + h + "09" + c + '"/></td></tr></table>');
  var e = d.lastChild;
  Util.replacePNG(e);
  return e
};
proto.createScaleableLine = function(d, f, c, b, e, a) {
  if (a === undefined) {
    a = b
  }
  d.insertAdjacentHTML("beforeend", '<table class="themeSupport_scalableLine" cellspacing="0" cellpadding="0"><tr class="tr1" style="height: ' + e + 'px; "><td class="td1"><img style="width: ' + b + 'px; " src="' + f + "01" + c + '"/></td><td class="td2" style="background: url(\'' + f + "02" + c + '\') repeat-x; "/></td><td class="td3"><img style="width: ' + a + 'px; " src="' + f + "03" + c + '"/></td></tr></table>');
  return d.lastChild
};
