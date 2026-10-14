/* Standards-port boundary for the historical VML graphing control. */
function CN_graphingcontrol() {
  this._disabled = false;
  this._unsupported = true;
  this.initiateUpload = false;
}
var proto = CN_graphingcontrol.prototype;
proto.createElement = function(node, parentElement) {
  var element = Util.createElement("div", "cn_graphingcontrol cn_unsupported_feature");
  element.jsObject = this;
  element.setAttribute("role", "status");
  element.textContent = "Graph rendering is unavailable in the standards Client Framework.";
  parentElement.appendChild(element);
  this.element = element;
  Util.reportUnsupported("CN_graphingcontrol", "VML graph rendering", "Requires an SVG/canvas chart renderer");
  return element;
};
proto.loadData = function() { Util.reportUnsupported("CN_graphingcontrol", "VML graph rendering"); };
proto.storeData = function() { return null; };
proto.unload = function() {};
proto.set_disabled = function(value) { this._disabled = !!value; if(this.element) this.element.setAttribute("aria-disabled", String(this._disabled)); };
