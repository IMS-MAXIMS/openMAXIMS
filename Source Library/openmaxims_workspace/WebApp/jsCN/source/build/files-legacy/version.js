/*
 * BUNDLE-DERIVED openMAXIMS IE7 RECONSTRUCTION
 * Module: version.js
 * Evidence: direct candidate region
 * Confidence: medium
 *
 * This is formatted output from a packed historical bundle region. It is
 * not a byte-for-byte recovery of the original source archive. Original
 * comments, local names, and module boundaries may have been lost through
 * bundling. Preserve observed protocol, event, DOM, and error semantics.
 */
var Version = {
  jscn_major: 1,
  jscn_minor: 0,
  jscn_build: 1393,
  css_major: 1,
  css_minor: 0,
  css_build: 29,
  jscn_date: function(e, d) {
    try {
      var c = new XMLHttpRequest();
      var b = location.href.replace(location.href.substring(location.href.lastIndexOf("/") + 1), "") + "packed/jscn.js.gz";
      c.open("HEAD", b, false);
      c.send(null);
      if (c.status == 200) {
        var a = new Date(c.getResponseHeader("Last-Modified"));
        year = a.getFullYear().toString();
        month = (a.getMonth() + 1).toString();
        day = a.getDate().toString();
        hours = a.getHours().toString();
        minutes = a.getMinutes().toString();
        seconds = a.getSeconds().toString();
        return year + (month.length > 1 ? month : "0" + month) + (day.length > 1 ? day : "0" + day) + " " + (hours.length > 1 ? hours : "0" + hours) + ":" + (minutes.length > 1 ? minutes : "0" + minutes) + ":" + (seconds.length > 1 ? seconds : "0" + seconds)
      } else {
        return "Unknown"
      }
    } catch (f) {
      return "Unknown"
    }
  },
  css_date: function(e, d) {
    try {
      var c = new XMLHttpRequest();
      var b = location.href.replace(location.href.substring(location.href.lastIndexOf("/") + 1), "") + "packed/themes/css/new-blue.css.gz";
      c.open("HEAD", b, false);
      c.send(null);
      if (c.status == 200) {
        var a = new Date(c.getResponseHeader("Last-Modified"));
        year = a.getFullYear().toString();
        month = (a.getMonth() + 1).toString();
        day = a.getDate().toString();
        hours = a.getHours().toString();
        minutes = a.getMinutes().toString();
        seconds = a.getSeconds().toString();
        return year + (month.length > 1 ? month : "0" + month) + (day.length > 1 ? day : "0" + day) + " " + (hours.length > 1 ? hours : "0" + hours) + ":" + (minutes.length > 1 ? minutes : "0" + minutes) + ":" + (seconds.length > 1 ? seconds : "0" + seconds)
      } else {
        return "Unknown"
      }
    } catch (f) {
      return "Unknown"
    }
  }
};
