/* Standards-based replacement boundary for the historical IE rich editor. */
function CN_wysiwygeditor() {
  this.formManager = null;
  this._disabled = false;
  this._event = "wysiwygeditor";
  this._simpleMode = false;
  this._unsupported = true;
}
CN_wysiwygeditor._simpleMode = false;
CN_wysiwygeditor._autoCorrectCache = [];
CN_wysiwygeditor._autoCorrectMaxLength = 0;
CN_wysiwygeditor._hideAutocompleteUI = function() {};
var proto = CN_wysiwygeditor.prototype;
proto.createElement = function(node, parentElement) {
  var wrapper = Util.createElement("div", "cn_wysiwygeditor cn_unsupported_feature");
  var content = Util.createElement("div", "cnContentDiv");
  content.contentEditable = "true";
  content.setAttribute("role", "textbox");
  content.setAttribute("aria-multiline", "true");
  wrapper.appendChild(content);
  wrapper.jsObject = this;
  parentElement.appendChild(wrapper);
  this.element = wrapper;
  this._contentDiv = content;
  this._event = node && node.getAttribute("event") || "wysiwygeditor";
  Util.reportUnsupported("CN_wysiwygeditor", "legacy rich-editor features", "TextRange/VML autocomplete and spell-check paths require a standards editor implementation");
  return wrapper;
};
proto.loadData = function(node) {
  var documentNode = Util.xmlSelectSingleNode(node, "document");
  var html = documentNode ? (Util.xmlText(documentNode)) : (Util.xmlText(node));
  if(this._contentDiv) this._contentDiv.innerHTML = String(html);
};
proto.storeData = function(xmldoc) {
  if(!this._contentDiv) return null;
  var node = xmldoc.createElement("wysiwygdocument");
  node.appendChild(xmldoc.createCDATASection(this._contentDiv.innerHTML));
  return node;
};
proto.unload = function() {};
proto.set_disabled = function(value) {
  this._disabled = !!value;
  if(this._contentDiv) this._contentDiv.contentEditable = this._disabled ? "false" : "true";
};
proto.set_tabIndex = function(value) { if(this._contentDiv) this._contentDiv.tabIndex = value; };
