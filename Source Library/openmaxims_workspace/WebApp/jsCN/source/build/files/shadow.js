/*
	NOTE: requires destroy call.
	v. 2.0.1 
	+ support for body based attachable shadow.
*/
function Shadow(element, shadowautoshow, precreateShadow)
{
	this.element = element;
	if(this.element && !this.element.shadow) element.shadow = this;
	
	this.hshadow = null;
	this.vshadow = null;
	this.created = false;

	this.shadowautoshow = shadowautoshow;
	this.precreateShadow = precreateShadow;

	if(this.shadowautoshow || this.precreateShadow) this.createShadow();
}
var proto = Shadow.prototype;

proto.destroy = function()
{
	if(this.hshadow)
	{
		this.hshadow.removeNode(true);
		this.vshadow.removeNode(true);
		this.vshadow = null;
		this.hshadow = null;
	}
	if(this.element && this.element.shadow == this) this.element.shadow = null;
	this.element = null;	
}

proto.createShadow = function()
{
	if(this.created) return;

	this.hshadow = document.createElement("div");
	this.vshadow = document.createElement("div");

	if(this.element)
	{
		var shadowOpacity = this.element.currentStyle["xl--shadow-opacity"];
		if(!shadowOpacity) shadowOpacity = "0.3";
	
		var pixelRadius = this.element.currentStyle["xl--shadow-pixel-radius"];
		if(!pixelRadius) pixelRadius = "2";

		this.element.insertAdjacentElement("beforebegin", this.hshadow); // Added to the same parent.
		this.element.insertAdjacentElement("beforebegin", this.vshadow); // Added to the same parent.	
	}
	else
	{
		document.body.appendChild(this.hshadow);
		document.body.appendChild(this.vshadow);		
	}	

	this.hshadow.style.position = "absolute";
	this.vshadow.style.position = "absolute";

	this.hshadow.style.height = 3;
	this.hshadow.style.overflow = "hidden";

	if(this.element && this.shadowautoshow) 
	{
		this.hshadow.style.setExpression("top", this.element.uniqueID + ".offsetHeight + " + this.element.uniqueID + ".offsetTop - 3")
		this.hshadow.style.setExpression("left", this.element.uniqueID + ".offsetLeft + 2")

		this.hshadow.style.setExpression("width", this.element.uniqueID + ".offsetWidth-2")
		this.hshadow.style.setExpression("display", this.element.uniqueID + ".currentStyle.display")	
	}
	else 
	{
		this.hshadow.style.visibility = "hidden";
		// Avoid scrolling.
		this.hshadow.style.width = 1;
		this.hshadow.style.top = 0; 
		this.hshadow.style.left = 0;
	}

	this.hshadow.style.background = "black";

	this.hshadow.style.filter = "progid:DXImageTransform.Microsoft.Blur(pixelRadius=" + pixelRadius + ",makeshadow=true,shadowopacity=" + shadowOpacity + ")";

	this.vshadow.style.width = 3;
	this.vshadow.style.overflow = "hidden";
	if(this.element && this.shadowautoshow) 
	{
		this.vshadow.style.setExpression("top", this.element.uniqueID + ".offsetTop+2");
		this.vshadow.style.setExpression("left", this.element.uniqueID + ".offsetLeft+"+this.element.uniqueID+".offsetWidth-3");

		this.vshadow.style.setExpression("height", this.element.uniqueID + ".offsetHeight-5");
		this.vshadow.style.setExpression("display", this.element.uniqueID + ".currentStyle.display");
	}
	else 
	{
		this.vshadow.style.visibility = "hidden";
		// Avoid scrolling.
		this.vshadow.style.height = 1;
		this.vshadow.style.top = 0;
		this.vshadow.style.left = 0;
	}
	
	if(this.element && !this.shadowautoshow) this.syncPosition();
	
	this.vshadow.style.background = "black";
	this.vshadow.style.filter = "progid:DXImageTransform.Microsoft.Blur(pixelRadius=" + pixelRadius + ",makeshadow=true,shadowopacity=" + shadowOpacity + ")"

	this.hshadow.unselectable = this.vshadow.unselectable = true;

	this.created = true;
}

proto.show = function()
{
	if(!this.created) this.createShadow();

	this.syncPosition();
	this.hshadow.style.visibility = "visible";
	this.vshadow.style.visibility = "visible";
	this.hshadow.style.display = this.vshadow.style.display = "block";
	this.hshadow.style.zIndex = this.vshadow.style.zIndex = this.element.currentStyle.zIndex;
}

proto.attach = function(l)
{
	this.element = l;
	this.element.shadow = this;
	this.syncPosition();
}

proto.detach = function()
{
	if(!this.element) return;
	this.hide();
	this.element.shadow = null;
	this.element = null;
}

proto.syncPosition = function()
{
	if(this.element.currentStyle.display == "none" 
	|| this.element.currentStyle.visibility == "hidden"
	|| !this.element.offsetWidth) return;

	var off = this.element.currentStyle["xl--shadow-offset"];
	if(!off && off !== 0) off = 2;
	else off = parseInt(off, 10);

	this.hshadow.style.top =  this.element.offsetHeight + this.element.offsetTop - 5 + off;
	this.hshadow.style.left = this.element.offsetLeft + 2;
	this.hshadow.style.width = this.element.offsetWidth - 5 + off;

	this.vshadow.style.top = this.element.offsetTop + 2;
	this.vshadow.style.left = this.element.offsetLeft + this.element.offsetWidth - 5 + off;
	var h = this.element.offsetHeight - 5 + off;
	this.vshadow.style.height = (h > 0 ? h : 1) + "px";
}

proto.hide = function()
{
	if(!this.vshadow) return;
	
	this.vshadow.style.display = "none";
	this.hshadow.style.display = "none";
}