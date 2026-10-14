/* Standards-port boundary for the historical VML floor planner. */
function CN_floorplanner() {
  this._disabled = false;
  this._unsupported = true;
  this.initiateUpload = false;
}
var proto = CN_floorplanner.prototype;
proto.createElement = function(node, parentElement) {
  var element = Util.createElement("div", "cn_floorplanner cn_unsupported_feature");
  element.jsObject = this;
  element.setAttribute("role", "status");
  element.textContent = "Floor planning is unavailable in the standards Client Framework.";
  parentElement.appendChild(element);
  this.element = element;
  Util.reportUnsupported("CN_floorplanner", "VML floor planning", "Requires an SVG/canvas renderer, geometry model and pointer interaction rewrite");
  return element;
};
proto.loadData = function() { Util.reportUnsupported("CN_floorplanner", "VML floor planning"); };
proto.storeData = function() { return null; };
proto.unload = function() {};
proto.set_disabled = function(value) { this._disabled = !!value; if(this.element) this.element.setAttribute("aria-disabled", String(this._disabled)); };
function CNList(parentElement) {
  this.element = Util.createElement("div", "cn_floorplanner_list");
  if(parentElement) parentElement.appendChild(this.element);
}
