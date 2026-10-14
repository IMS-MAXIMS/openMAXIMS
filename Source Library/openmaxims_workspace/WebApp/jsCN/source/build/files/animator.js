var Animator =
{
	_running: 0,
	_animations: [], 
	_timeout: 10,
	_maxIterations: 1000,

	start: function()
	{
		for(var i = 0; i < arguments.length; i++) 
		{
			var anim = arguments[i];
			anim._maxIterations = this._maxIterations;
			this._animations.push(anim);
		}
		if(this._running == 0 && arguments.length > 0)
		{
			var obj = this;
			window.setTimeout(function(){ obj.animate(); obj = null; }, this._timeout);
		}
		this._running += arguments.length;
	},
	
	stop: function()
	{
		for(var i = 0; i < arguments.length; i++) 
		{
			arguments[i]._maxIterations = 0;
		}
	},
	
	animate: function()
	{
		var a = 0;
		var stop = false;
		while(a < this._animations.length)
		{
			var animation = this._animations[a];
			if(animation._maxIterations-- > 0 && animation.tick()) 
			{
				a++;
			}
			else
			{
				if(animation.onend)
				{
					var delegate = animation.onend;
					if(delegate instanceof Function) animation.onend();
					else if(delegate instanceof Array) delegate[0][ delegate[1] ]();

					animation.onend = null;
				}
				for(var i in animation) animation[i] = null; // Clean up animation.
				this._animations.splice(a, 1);
				if(--this._running <= 0) stop = true;
			}
		}
		if(!stop)
		{
			var obj = this;
			window.setTimeout(function(){ obj.animate(); obj = null; }, this._timeout);
		}
	},

	getRegression: function(progress)
	{
		return (1 - ((Math.cos(progress * Math.PI) + 1) / 2));
	},

	animating: function() {
		return this._running > 0;
	}
}

function AnimVistaFadeoutBase(){}
AnimVistaFadeoutBase.prototype =  
{
	progress: 0,
	step: 0.02,
	apply: function(ar){},
	tick: function()
	{
		this.progress += this.step;
		if(this.progress >= 1) 
		{
			this.apply(this._to)
			return false;
		}
		else
		{
			var ar = [];
			for(var i = 0; i < this._from.length; i++)
			{
				var f = this._from[i];
				var t = this._to[i];
				var mask = 0x0000FF;
				var value = 0;
				for(var j = 0; j < 3; j++)
				{
					var shift = j * 8
					var tm = (t & mask) >> shift;
					var fm = (f & mask) >> shift;
					var delta = tm - fm;
					var component = (fm + delta * this.progress) << shift;
					value += component;
					mask = mask << 8;
				}
				ar[i] = value;
			}
			
			this.apply(ar);
			return true;
		}
	}
}
AnimVistaFadeoutBase.toHexArray = function(strAr) {
	var ar = []
	for(var i = 0; i < strAr.length; i++) {
		ar[i] = parseInt("0x" + strAr[i].substring(1));
	}
	return ar;
}

function AnimVistaBoxFadeout(l)
{
	this.l = l;
	this._from = AnimVistaFadeoutBase.toHexArray(ThemeNonCSSStyles.box_borderHoverColors);
	this._to = AnimVistaFadeoutBase.toHexArray(ThemeNonCSSStyles.box_borderNormalColors);
}
AnimVistaBoxFadeout.prototype = new AnimVistaFadeoutBase();
AnimVistaBoxFadeout.prototype.apply = function(ar)
{
	if(ar[0] == this._to[0])
	{
		this.l.style.borderColor = "";
		this.l.style.borderTopColor = "";
	}
	else
	{
		this.l.style.borderColor = "#" + ar[0].toString(16);
		this.l.style.borderTopColor = "#" + ar[1].toString(16);
	}
}

function AnimResize(l, w, h, offX, offY)
{
	this.l = l;
	this.progress = 0;
	this.step = 0.1;
	this.finalW = w;
	this.finalH = h;
	this.startW = l.offsetWidth;
	this.startH = l.offsetHeight;
	this.diffW = this.finalW - this.startW;
	this.diffH = this.finalH - this.startH;
	this.startX = l.offsetLeft;
	this.startY = l.offsetTop;
	this.offY = offY;
	this.offX = offX;
}
AnimResize.prototype.tick = function()
{
	this.progress += this.step;
	var f = Animator.getRegression(this.progress);
	if(this.progress >= 1) 
	{
		if(this.finalH) this.l.style.height = this.finalH;
		if(this.finalW) this.l.style.width = this.finalW;
		if(this.offY) this.l.style.top = Math.round(this.startY - this.l.offsetHeight + this.startH) + "px";
		if(this.offX) this.l.style.left = Math.round(this.startX - this.l.offsetWidth + this.startW) + "px";
		if(this.l.shadow) this.l.shadow.syncPosition();
		return false;
	}
	else
	{
		if(this.finalW) 
		{
			var nextW = Math.round(this.startW + this.diffW * f);
			this.l.style.width = nextW + "px";		
			if(this.offX) this.l.style.left = (this.startX - nextW + this.startW) + "px";
		}
		if(this.finalH) 
		{
			var nextH = Math.round(this.startH + this.diffH * f);
			this.l.style.height = nextH + "px";		
			if(this.offY) this.l.style.top = (this.startY - nextH + this.startH) + "px";
		}
		if(this.l.shadow) this.l.shadow.syncPosition();
		return true;
	}
}

function AnimVistaFadeResize(l, deltaX, deltaY)
{
	var w = l.offsetWidth;
	var h = l.offsetHeight;
	var x = l.offsetLeft;
	var y = l.offsetTop;
	l.style.left = x + deltaX / 2;
	l.style.top = y + deltaY / 2;
	l.style.width = w - deltaX;
	l.style.height = h - deltaY;
	var anim1 = new AnimResize(l, w, h);
	var anim2 = new AnimMove(l, x, y);
	anim1.step = anim2.step = 0.075;
	Animator.start(anim1, anim2);
	return anim1;
}

function AnimMove(l, toX, toY, easing)
{
	this.l = l;
	this.progress = 0;
	this.step = 0.1;
	this.toX = toX;
	this.toY = toY;
	this.startX = l.offsetLeft;
	this.startY = l.offsetTop;
	this.diffX = toX - this.startX;
	this.diffY = toY - this.startY;
	this.easing = easing;
}
AnimMove.prototype.tick = function()
{
	this.progress += this.step;
	var f = this.easing ? Animator.getRegression(this.progress) : this.progress;
	
	if(this.progress >= 1) 
	{
		this.l.style.left = this.toX;
		this.l.style.top = this.toY;
		return false;
	}
	else
	{
		this.l.style.left = Math.round(this.startX + this.diffX * f) + "px";
		this.l.style.top = Math.round(this.startY + this.diffY * f) + "px";		
		return true;
	}
}

function AnimZoom(l, from, to, anchorBottom, anchorRight)
{
	this.l = l;
	this.from = from;
	this.to = to;
	this.anchorBottom = anchorBottom;
	this.anchorRight = anchorRight;
	this.xywh = {x: l.offsetLeft, y: l.offsetTop, w: l.offsetWidth, h: l.offsetHeight};
	l.style.zoom = from + "%";
	if(this.anchorBottom || this.anchorRight) this._anchor(from);
}
AnimZoom.prototype =
{
	progress: 0.1,
	step: 0.25,
	tick: function()
	{
		this.progress += this.step;
		if(this.progress >= 1) 
		{
			if(this.to == 100) this.l.style.zoom = "";
			else this.l.style.zoom = this.to + "%";
			if(this.anchorBottom || this.anchorRight) this._anchor(this.to);
			return false;
		}
		else
		{
			var zoom = Math.floor(this.from + (this.to - this.from) * this.progress);
			this.l.style.zoom = zoom + "%";
			if(this.anchorBottom || this.anchorRight) this._anchor(zoom);
			return true;
		}
	},
	_anchor: function(zoom) {
		zoom = zoom / 100;
		var ratio = 1 - zoom;
		if(this.anchorBottom) {
			var dH = this.xywh.h * ratio;
			this.l.style.top = this.xywh.y + dH + "px";
		}
		if(this.anchorRight) {
			var dW = this.xywh.w * ratio;
			this.l.style.left = this.xywh.x + dW + "px";
		}
	}
}
