/* Standards-port boundary for the historical VML drawing configuration control. */
function CN_drawingconfigcontrol() {
  this._disabled = false;
  this._unsupported = true;
  this.initiateUpload = false;
}
var proto = CN_drawingconfigcontrol.prototype;
proto.createElement = function(node, parentElement) {
  var element = Util.createElement("div", "cn_drawingconfigcontrol cn_unsupported_feature");
  element.jsObject = this;
  element.setAttribute("role", "status");
  element.textContent = "Drawing configuration is unavailable in the standards Client Framework.";
  parentElement.appendChild(element);
  this.element = element;
  Util.reportUnsupported("CN_drawingconfigcontrol", "VML drawing configuration", "Requires an SVG/canvas model and standards context menu/editor");
  return element;
};
proto.loadData = function() { Util.reportUnsupported("CN_drawingconfigcontrol", "VML drawing configuration"); };
proto.storeData = function() { return null; };
proto.unload = function() {};
proto.set_disabled = function(value) { this._disabled = !!value; if(this.element) this.element.setAttribute("aria-disabled", String(this._disabled)); };
