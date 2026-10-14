/*
	v. 2.0
*/
function CN_wavplayer()
{
	this.player = null;
	this._wav = null;
	this.paused = false;
	this.playButton = null;
	this.stopProbeTimeout = null;
}
var proto = CN_wavplayer.prototype;


proto.createElement = function(node, parentElement)
{
	var l = document.createElement("div");
	parentElement.appendChild(l);

	this.element = l;
	l.jsObject = this;

	l.className = "cn_wavplayer";
	
	l.style.whiteSpace = "nowrap";

	this.buildElements();
	if(!window.XLWavPlayers) window.XLWavPlayers = [];
	window.XLWavPlayers[window.XLWavPlayers.length] = l;
	
	return l;
}

proto.loadData = function(node)
{
	var attr = node.getAttribute("src");
	if(attr) 
	{
		this._wav = String(attr);
	}
	else 
	{
		this.set_disabled(true);
	}
}

proto.unload = function()
{
	for(var i = 0; i < window.XLWavPlayers.length; i++)
	{
		if(window.XLWavPlayers[i] == this.element)
		{
			window.XLWavPlayers.splice(i, 1);
			break;
		}
	}

	this.player = null;
	this.playButton = null;
}

proto.buildElements = function()
{
	var player = Util.createElement("audio", "wmpObject", {controls: false});
	player.style.display = "none";
	this.element.appendChild(player);
	this.player = player;
		
	if(CNFormManager.vista)
	{
		var node = Util.wrapIntoNode({});
		var playButton = new CN_button();
		playButton.elementID = this.elementID + "_button1";
		var stopButton = new CN_button();
		stopButton.elementID = this.elementID + "_button2";

		var b1 = playButton.createElement(node, this.element);
		var b2 = stopButton.createElement(node, this.element);
		b1.style.width = b2.style.width = "50%";
		//b1.style.height = b2.style.height = "100%";
		b1.style.position = b2.style.position = "relative";
		b1.style.display = b2.style.display = "inline";
		b1.style.fontFamily = b2.style.fontFamily = "webdings";
		b1.style.fontSize = b2.style.fontSize = "15px";
		b1.style.lineHeight = "19px";
		b2.style.lineHeight = "12px";
		playButton.loadData(Util.wrapIntoNode({value: "4"}));
		stopButton.loadData(Util.wrapIntoNode({value: "<"}));
		Event.add(b1, "click", this, this._playButton_onclick);
		Event.add(b2, "click", this, this._stopButton_onclick);
		this.playButton = playButton;
		this.stopButton = stopButton;
	}
	else
	{
		var playButton = this.createButton();
		this.element.appendChild(playButton);
		playButton.textContent = "4";
		playButton.lineHeight = "19px";
		Event.add(playButton, "click", this, this._playButton_onclick);
		this.playButton = playButton;
	
		var stopButton = this.createButton();
		this.element.appendChild(stopButton);
		Event.add(stopButton, "click", this, this._stopButton_onclick);
		stopButton.innerHTML = "&lt;";
		stopButton.style.fontSize = "16px";
	}
}

proto.createButton = function()
{
	return Util.createElement("button", "", {style: "font-family: sans-serif; font-size: 15px; width: 50%; height: 100%; overflow: hidden; color: #000077;"});
}

proto._playButton_onclick = function()
{
	Util.findByClassName(Event.current().target, "cn_wavplayer").jsObject.playButton_onclick();
}	
proto.playButton_onclick = function()
{
	if(this.element.disabled || !this._wav) return;
	if(this.player.paused || this.player.ended)
	{
		this.player.autoplay = false;
		this.player.src = this._wav;
		this.player.play();
	
		if(CNFormManager.vista) this.playButton.loadData(Util.wrapIntoNode({value: ";"}));
		else this.playButton.textContent = ";";

		for(var i = 0; i < window.XLWavPlayers.length; i++)
		{
			var p = window.XLWavPlayers[i];
			if(p != this.element)
			{
				p.__disabled = p.disabled;
				p.disabled = true;
			}
		}

		var obj = this;
		this.stopProbeTimeout = setTimeout(function(){ obj.stopProbe(); }, 50);
	}
	else if(this.paused)
	{
		if(CNFormManager.vista) this.playButton.loadData(Util.wrapIntoNode({value: ";"}));
		else this.playButton.textContent = ";";
		this.player.play();
		this.paused = false;
	}
	else
	{
		if(CNFormManager.vista) this.playButton.loadData(Util.wrapIntoNode({value: "4"}));
		else this.playButton.textContent = "4";
		this.player.pause();
		this.paused = true;
	}
}

proto._stopButton_onclick = function()
{
	Util.findByClassName(Event.current().target, "cn_wavplayer").jsObject.stopButton_onclick();
}
proto.stopButton_onclick = function()
{
	if(this.element.disabled) return;
	this.finishPlay();
}

proto.finishPlay = function()
{
	if(this.stopProbeTimeout != null) clearTimeout(this.stopProbeTimeout);
	try
	{
		this.player.pause();
		this.player.currentTime = 0;
	}
	catch(ex){}
	this.paused = false;

	if(CNFormManager.vista) this.playButton.loadData(Util.wrapIntoNode({value: "4"}));
	else this.playButton.textContent = "4";

	for(var i = 0; i < window.XLWavPlayers.length; i++)
	{
		var p = window.XLWavPlayers[i];
		if(p != this.element && p.__disabled != null) 
		{
			p.disabled = p.__disabled;
		}
	}
}

proto.stopProbe = function()
{
	if(this.player.paused || this.player.ended)
	{
		this.finishPlay();
	}
	else 
	{
		var obj = this;
		setTimeout(function(){ obj.stopProbe(); }, 50);
	}
	this.stopProbeTimeout = null;
}

proto.set_disabled = function(val)
{
	if(!this._wav) val = true;
	this.element.disabled = val;
	if(CNFormManager.vista)
	{
		this.playButton.set_disabled(val);
		this.stopButton.set_disabled(val);
	}
}