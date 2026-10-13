/*
 * BUNDLE-DERIVED openMAXIMS IE7 RECONSTRUCTION
 * Module: formmanager-messages.js
 * Evidence: structural responsibility region
 * Confidence: medium
 *
 * This is formatted output from a packed historical bundle region. It is
 * not a byte-for-byte recovery of the original source archive. Original
 * comments, local names, and module boundaries may have been lost through
 * bundling. Preserve observed protocol, event, DOM, and error semantics.
 */
proto._showMessagesTO = function() {
  if (!this._ideaNode || this._messagesShown) {
    return
  }
  var b = this._ideaNode.selectSingleNode("messages");
  if (b) {
    this._messagesPending = true;
    var a = this;
    setTimeout(function() {
      a._showMessages(b)
    }, 100)
  }
};
proto._showMessages = function(f) {
  this._messagesPending = false;
  if (!this._ideaNode || this._messagesShown) {
    return
  }
  PopupMenu.hideMenus();
  var c = f.selectNodes("message");
  if (c) {
    for (var b = 0; b < c.length; b++) {
      alert(c[b].text)
    }
  }
  if (f.selectSingleNode("clear")) {
    this._deleteMessageBoxes()
  }
  var e = false;
  var d = f.selectNodes("messagebox");
  if (d) {
    CNThemeableDialog.resetStacked();
    var a = d.length == 1;
    for (var b = 0; b < d.length; b++) {
      this._showMessageBoxDialog(d[b], a);
      e = true
    }
  }
  if (!e) {
    this._hideDisabler()
  }
  this._messagesShown = true
};
proto._createMessageBoxDialog = function() {
  var a = new CNMessageBox();
  a.create(false, false);
  a.resize(500, 100);
  return a
};
proto._showMessageBoxDialog = function(d, a) {
  this._showDisabler(true, true, false);
  var r = String(d.getAttribute("caption"));
  var q = String(d.text);
  var e = d.getAttribute("img");
  var j = d.getAttribute("buttons");
  var g = d.getAttribute("id");
  var k = this._createMessageBoxDialog();
  if (g) {
    k._fm_dialogID = String(g)
  }
  k.set_caption(r);
  k.set_textAndImage(q, e ? String(e) : null);
  var o;
  if (j) {
    var m = d.getAttribute("focus"),
      h = ["OK", "Confirm", "Yes", "No", "Cancel"],
      c = 0;
    for (var f = 0; f < h.length; f++) {
      var p = h[f];
      if (j.indexOf(p) != -1) {
        var n = k.createBottomButton(p, true, {
          result: p
        }, "fm_messageBox_button");
        n.set_tabIndex(++c);
        if (m == p) {
          o = n
        }
      }
    }
  }
  this._messageBoxes.push(k);
  k.show("stacked", [this, "_messageBoxCallback"]);
  if (o) {
    o.focus()
  }
};
proto._messageBoxCallback = function(c, d) {
  var a = false;
  if (c._fm_dialogID) {
    if (c.resultData) {
      this.postData('<messagebox id="' + c._fm_dialogID + '" button="' + c.resultData.result + '"/>');
      a = true
    }
  }
  c.destroy();
  for (var b = 0; b < this._messageBoxes.length; b++) {
    if (this._messageBoxes[b] == c) {
      this._messageBoxes.splice(b, 1);
      break
    }
  }
  if (this._messageBoxes.length == 0 && !a) {
    this._hideDisabler()
  }
};
proto._deleteMessageBoxes = function() {
  this._messageBoxOffset = 0;
  for (var a = 0; a < this._messageBoxes.length; a++) {
    var b = this._messageBoxes[a];
    if (b) {
      b.destroy()
    }
  }
  this._messageBoxes = []
};
