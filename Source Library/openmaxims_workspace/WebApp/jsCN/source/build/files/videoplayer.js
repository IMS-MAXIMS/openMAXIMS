/*
	v. 2.0
*/
function CN_videoplayer()
{
	this.player = null;
	this._src = null;
	this.paused = false;
	this.stopProbeTimeout = null;
}
var proto = CN_videoplayer.prototype;


proto.createElement = function(node, parentElement)
{
	var l = Util.createElement("div", "cn_videoplayer");
	parentElement.appendChild(l);

	this.element = l;
	l.jsObject = this;

	l.style.whiteSpace = "nowrap";

	this.buildElements();
	
	this.element.disabled = true;
	
	return l;
}

proto.loadData = function(node)
{
	var attr = node.getAttribute("src");
	if(attr) 
	{
		this.set_disabled(false);
		this._src = String(attr);

		this._startPlayTO();
	}
	else 
	{
		this.set_disabled(true);
	}
}

proto._startPlayTO = function()
{
	var obj = this;
	setTimeout(function()
	{
		if(!obj || !obj.player) return;
		obj.player.autoplay = false;
		obj.player.src = obj._src;
	}, 300);
}

proto.unload = function()
{
	this.player = null;
}

proto.buildElements = function()
{
	var player = Util.createElement("video", "wmpObject", {controls: true, disabled: true});
	this.element.appendChild(player);
	this.player = player;
	this.set_disabled(true);
}

proto.set_disabled = function(val)
{
	if(!this._src) val = true;
	this.element.disabled = val;
	this.player.controls = !val;
}