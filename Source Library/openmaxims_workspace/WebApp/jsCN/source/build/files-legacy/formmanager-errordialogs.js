/*
 * BUNDLE-DERIVED openMAXIMS IE7 RECONSTRUCTION
 * Module: formmanager-errordialogs.js
 * Evidence: structural responsibility region
 * Confidence: medium
 *
 * This is formatted output from a packed historical bundle region. It is
 * not a byte-for-byte recovery of the original source archive. Original
 * comments, local names, and module boundaries may have been lost through
 * bundling. Preserve observed protocol, event, DOM, and error semantics.
 */
proto._showErrorsDialog = function(h, e, d) {
  var c = new CNMessageBox();
  c.create(false, false);
  c.resize(530, 200);
  c.set_captionImage(CNFormManager.neutralImagesPath + "icons48/error-1.png", 48, 48);
  c.set_caption(h);
  var b = "<div class='errorsDialogContents'></div>";
  c.contentsElement().insertAdjacentHTML("beforeend", b);
  c.createBottomButton("Close", true);
  var g = "";
  for (var a = 0; a < e.length; a++) {
    g += e[a].text + "\n\n"
  }
  c.contentsElement().firstChild.innerText = g;
  c.__subDelegate = d;
  var f = [this, "_proxyMBDelegate"];
  setTimeout(function() {
    c.show(true, f)
  }, 0)
};
proto._showFatalErrorDialog = function(k, a, d, g, h) {
  var f = new CNMessageBox();
  f.create(false, false);
  f.resize(530, 135);
  f.set_captionImage(CNFormManager.neutralImagesPath + "icons48/error-2.png", 48, 48);
  f.set_caption(k);
  f.__subDelegate = h;
  var j = f.createBottomButton("Details");
  f.createBottomButton("Close", true);
  Event.add(j.element, "click", this, function() {
    var m;
    if (c.children[1].currentStyle.display == "block") {
      var m = "none";
      f.resize(null, 135)
    } else {
      m = "block";
      f.resize(null, 365)
    }
    for (var b = 1; b < c.children.length; b++) {
      c.children[b].style.display = m
    }
  });
  var c = f.contentsElement();
  c.appendChild(document.createElement("<div class='fatalErrorDialogMessageDiv1'></div>")).innerText = a;
  c.appendChild(document.createElement("<span class='fatalErrorDialogSpan1'>")).innerText = "Stack Trace:";
  c.appendChild(document.createElement("<div class='fatalErrorDialogMessageDiv2'>")).innerText = g;
  c.appendChild(document.createElement("<span class='fatalErrorDialogSpan2'>")).innerText = "Build Information:";
  c.appendChild(document.createElement("<div class='fatalErrorDialogMessageDiv3'>")).innerText = d;
  this._fatalErrorDialog = f;
  var e = [this, "_proxyMBDelegate"];
  setTimeout(function() {
    f.show(true, e)
  }, 0)
};
