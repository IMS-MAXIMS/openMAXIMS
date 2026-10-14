/* Standards-port boundary for the historical VML drawing control. */
function CN_drawingcontrol() {
  this._disabled = false;
  this._unsupported = true;
  this.initiateUpload = false;
}
CN_drawingcontrol.BRUSH_IMAGE = 1;
CN_drawingcontrol.BRUSH_FREEDRAW = 2;
var proto = CN_drawingcontrol.prototype;
proto.createElement = function(node, parentElement) {
  var element = Util.createElement("div", "cn_drawingcontrol cn_unsupported_feature");
  element.jsObject = this;
  element.setAttribute("role", "status");
  element.textContent = "Drawing is unavailable in the standards Client Framework.";
  parentElement.appendChild(element);
  this.element = element;
  Util.reportUnsupported("CN_drawingcontrol", "VML drawing/editor", "Requires a canvas/SVG renderer and pointer interaction rewrite");
  return element;
};
proto.loadData = function() { Util.reportUnsupported("CN_drawingcontrol", "VML drawing/editor"); };
proto.storeData = function() { return null; };
proto.unload = function() {};
proto.set_disabled = function(value) { this._disabled = !!value; if(this.element) this.element.setAttribute("aria-disabled", String(this._disabled)); };
proto.get_Vml = function() { return null; };
