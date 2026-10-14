/*
 * BUNDLE-DERIVED openMAXIMS IE7 RECONSTRUCTION
 * Module: progressbar.js
 * Evidence: named historical bundle anchor
 * Confidence: tentative
 *
 * This is formatted output from a packed historical bundle region. It is
 * not a byte-for-byte recovery of the original source archive. Original
 * comments, local names, and module boundaries may have been lost through
 * bundling. Preserve observed protocol, event, DOM, and error semantics.
 */
function CNProgressBar() {}
CNThemeManager.themeable(CNProgressBar);
CNProgressBar.themes["new-blue"] = {
  create: function(b) {
    var c = ThemeNonCSSStyles.progressBar;
    var a = this.element = document.createElement('<v:roundrect arcsize=".1" strokecolor="' + c.borderColor + '">');
    a.className = "cn_globalProgressbar";
    a.innerHTML = '<div></div><img width="250" height="16" src="g/und-progress-bar-1.gif">';
    a.appendChild(document.createElement('<v:fill type="gradient" color="' + c.color + '" color2="' + c.color2 + '"/>'));
    this._shadow = new Shadow(a);
    b.appendChild(a)
  },
  unload: function() {
    this._shadow.destroy();
    this._shadow = null
  },
  loadData: function(b) {
    var c = b.getAttribute("label");
    var a = this.element.firstChild;
    if (c) {
      a.innerText = String(c)
    } else {
      a.innerText = ""
    }
  },
  show: function() {
    this.element.filters[0].apply();
    this.element.style.visibility = "visible";
    this.element.filters[0].play();
    this._shadow.show()
  },
  hide: function() {
    this._shadow.hide();
    this.element.filters[0].apply();
    this.element.style.visibility = "hidden";
    this.element.filters[0].play()
  },
  _dummy: null
};
