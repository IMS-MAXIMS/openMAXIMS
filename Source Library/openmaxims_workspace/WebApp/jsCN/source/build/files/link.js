/*
	v. 2.0
*/
function CN_link()
{
	this._disabled = false;
	this.initiateUpload = false; // Used by formManager.	
}
var proto = CN_link.prototype;

proto.createElement = function(node, parentElement)
{
	var l = document.createElement("a");
	l.className = "cn_link";
	l.href = "#";
	parentElement.appendChild(l);
	
	var img = document.createElement("img");
	l.appendChild(img);
	img.src = CNFormManager.themeImagesPath + "arrow-3.gif";
	img.align = "absmiddle";
	
	var text = document.createElement("span");
	l.appendChild(text);

	this.clicked = false;
	
	this.element = l;
	l.jsObject = this;

	var attr = node.getAttribute("value");
	if(attr) text.textContent = String(attr);
	Event.add(l, "click", this, CNUtil.cancelEvent);
	Event.add(l, "click", this, _CN_button_onclick);
	
	return l;
}

proto.doClick = CN_button.plainThemeProto.doClick;

proto.loadData = function(node)
{
	var attr = node.getAttribute("tooltip");
	if(attr) 
	{
		if(!this.element.tipText) Tooltip.attach(this.element, String(attr));
		else this.element.tipText = String(attr);
	}
	this.initiateUpload = node.getAttribute("uploads") == "true";
}

proto.storeData = function(xmldoc)
{
	if(!this.clicked) return;
	this.clicked = false;

	var node = xmldoc.createElement("link");
	return node;
}

proto.set_disabled = function(value)
{
	this._disabled = value;
	this.element.className = value ? "cn_link cn_link_disabled" : "cn_link";
}
