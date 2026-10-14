/* Standards-port boundary for the historical VML bed planner. */
function CN_bedplanner() {
  this._disabled = false;
  this._unsupported = true;
  this.initiateUpload = false;
}
var proto = CN_bedplanner.prototype;
proto.createElement = function(node, parentElement) {
  var element = Util.createElement("div", "cn_bedplanner cn_unsupported_feature");
  element.jsObject = this;
  element.setAttribute("role", "status");
  element.textContent = "Bed planning is unavailable in the standards Client Framework.";
  parentElement.appendChild(element);
  this.element = element;
  Util.reportUnsupported("CN_bedplanner", "VML bed planning", "Requires an SVG/canvas renderer and standards bed geometry");
  return element;
};
proto.loadData = function() { Util.reportUnsupported("CN_bedplanner", "VML bed planning"); };
proto.storeData = function() { return null; };
proto.unload = function() {};
proto.set_disabled = function(value) { this._disabled = !!value; if(this.element) this.element.setAttribute("aria-disabled", String(this._disabled)); };
