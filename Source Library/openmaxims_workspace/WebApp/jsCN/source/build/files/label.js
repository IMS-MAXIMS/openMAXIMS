/*
	v. 2.0
*/	
function CN_label(){}
var proto = CN_label.prototype;

proto.createElement = function(node, parentElement)
{
	var l = document.createElement("div");
	parentElement.appendChild(l);

	// Cross-reference.
	this.element = l;
	l.jsObject = this;

	var style = node.getAttribute("style");
	if(style) l.className = "cn_label_" + String(style);
	else l.className = "cn_label";
	
	var attr = node.getAttribute("size");
	if(attr != null && attr != "small")
	{
		if(attr == "medium") l.style.fontSize = "11.25pt";
		else if(attr == "large") l.style.fontSize = "14.25pt";
	}
	
	return l;
}

proto.loadData = function(node)
{
	var attr = node.getAttribute("text");
	if(attr != null) this.element.textContent = String(attr);
	
	attr = node.getAttribute("textColor");
	if(attr != null) {
		this.element.style.color = String(attr);
		this._textColorSet = true;
	} else if(attr == "") {
		this._textColorSet = false;
	}	

	attr = node.getAttribute("tooltip");
	if(attr && attr != "") 
	{
		if(!this.element.tipText) Tooltip.attach(this.element, String(attr));
		else this.element.tipText = String(attr);
	}
	else
	{
		Tooltip.detach(this.element);
	}
}

proto.set_disabled = function(val)
{
	// Ignore.
}

proto.layout = function() {
	// The dark-header class is a theme concern, not an IE-only
	// runtime-style operation.  Inline textColor still wins over the class.
	Util.setDarkHeaderControlClass(this.element, this.formManager);
}

// Keep the historical method name for callers that explicitly selected the
// black sub-theme, but make it standards-based as well.
proto._layoutForBlack = proto.layout;