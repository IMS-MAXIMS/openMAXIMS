/* Standards-port boundary for the historical VML marker control. */
function CN_markercontrol() {
  this._disabled = false;
  this._unsupported = true;
  this.initiateUpload = false;
}
var proto = CN_markercontrol.prototype;
proto.createElement = function(node, parentElement) {
  var element = Util.createElement("div", "cn_markercontrol cn_unsupported_feature");
  element.jsObject = this;
  element.setAttribute("role", "status");
  element.textContent = "Marker editing is unavailable in the standards Client Framework.";
  parentElement.appendChild(element);
  this.element = element;
  Util.reportUnsupported("CN_markercontrol", "VML marker editing", "Requires an SVG/canvas renderer and pointer interaction rewrite");
  return element;
};
proto.loadData = function() { Util.reportUnsupported("CN_markercontrol", "VML marker editing"); };
proto.storeData = function() { return null; };
proto.unload = function() {};
proto.set_disabled = function(value) { this._disabled = !!value; if(this.element) this.element.setAttribute("aria-disabled", String(this._disabled)); };
