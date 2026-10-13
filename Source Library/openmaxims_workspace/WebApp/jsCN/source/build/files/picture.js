/*
	v. 0.21
	+ autoSize.
	v. 0.2	
	+ theme support.
	v. 0.1
*/
function CN_picture()
{
	this._autoSize = false;
}
var proto = CN_picture.prototype;

proto.createElement = function(node, parentElement)
{
	var l = document.createElement("div");
	parentElement.appendChild(l);

	var img = document.createElement("img");
	l.appendChild(img);
	
	this.element = l;
	l.jsObject = this;
	
	this.element.style.overflow = "hidden";
	this._autoSize = node.getAttribute("autoSize") == "true";
	if(this._autoSize)
	{
		img.style.width = "100%";
		img.style.height = "100%";
	}

	return l;
}

proto.loadData = function(node)
{
	var attr = node.getAttribute("src");
	if(attr) this.element.children[0].src = String(attr);
	
	if(!this._autoSize && this.element.offsetWidth > 32 && this.element.offsetHeight > 32)
	{
		this.element.style.overflow = "auto";
	}
}
