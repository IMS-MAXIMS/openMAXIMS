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
		Util.removeElement(this.hshadow);
		Util.removeElement(this.vshadow);
		this.vshadow = null;
		this.hshadow = null;
	}
	if(this.element && this.element.shadow == this) this.element.shadow = null;
	this.element = null;	
}

proto.createShadow = function()
{
	if(this.created) return;

	var shadowOpacity = "0.3";
	var pixelRadius = "2";
	this.hshadow = document.createElement("div");
	this.vshadow = document.createElement("div");

	if(this.element)
	{
		shadowOpacity = Util.getStyle(this.element, "xl--shadow-opacity");
		if(!shadowOpacity) shadowOpacity = "0.3";
	
		pixelRadius = Util.getStyle(this.element, "xl--shadow-pixel-radius");
		if(!pixelRadius) pixelRadius = "2";

		this.element.parentNode.insertBefore(this.hshadow, this.element); // Added to the same parent.
		this.element.parentNode.insertBefore(this.vshadow, this.element); // Added to the same parent.	
	}
	else
	{
		document.body.appendChild(this.hshadow);
		document.body.appendChild(this.vshadow);		
	}	

	this.hshadow.style.position = "absolute";
	this.vshadow.style.position = "absolute";

	this.hshadow.style.height = "3px";
	this.hshadow.style.overflow = "hidden";

	if(this.element && this.shadowautoshow) 
	{
		this.syncPosition();	
	}
	else 
	{
		this.hshadow.style.visibility = "hidden";
		// Avoid scrolling.
		this.hshadow.style.width = "1px";
		this.hshadow.style.top = "0px"; 
		this.hshadow.style.left = "0px";
	}

	this.hshadow.style.background = "rgba(0, 0, 0, " + shadowOpacity + ")";

	this.vshadow.style.width = "3px";
	this.vshadow.style.overflow = "hidden";
	if(this.element && this.shadowautoshow) 
	{
		this.syncPosition();
	}
	else 
	{
		this.vshadow.style.visibility = "hidden";
		// Avoid scrolling.
		this.vshadow.style.height = "1px";
		this.vshadow.style.top = "0px";
		this.vshadow.style.left = "0px";
	}
	
	if(this.element && !this.shadowautoshow) this.syncPosition();
	
	this.vshadow.style.background = "rgba(0, 0, 0, " + shadowOpacity + ")";

	this.hshadow.style.userSelect = "none";

	this.created = true;
}

proto.show = function()
{
	if(!this.created) this.createShadow();

	if(this.element) this.syncPosition();
	this.hshadow.style.visibility = "visible";
	this.vshadow.style.visibility = "visible";
	this.hshadow.style.display = this.vshadow.style.display = "block";
	this.hshadow.style.zIndex = this.vshadow.style.zIndex = this.element ? Util.getComputedStyle(this.element).zIndex : "";
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
	if(Util.getComputedStyle(this.element).display == "none" 
	|| Util.getComputedStyle(this.element).visibility == "hidden"
	|| !this.element.offsetWidth) return;

	var off = Util.getStyle(this.element, "xl--shadow-offset");
	if(!off && off !== 0) off = 2;
	else off = parseInt(off, 10);

	this.hshadow.style.top = (this.element.offsetHeight + this.element.offsetTop - 5 + off) + "px";
	this.hshadow.style.left = (this.element.offsetLeft + 2) + "px";
	this.hshadow.style.width = Math.max(1, this.element.offsetWidth - 5 + off) + "px";

	this.vshadow.style.top = (this.element.offsetTop + 2) + "px";
	this.vshadow.style.left = (this.element.offsetLeft + this.element.offsetWidth - 5 + off) + "px";
	var h = this.element.offsetHeight - 5 + off;
	this.vshadow.style.height = (h > 0 ? h : 1) + "px";
}

proto.hide = function()
{
	if(!this.vshadow) return;
	
	this.vshadow.style.display = "none";
	this.hshadow.style.display = "none";
}