	/*
	v. 2.0.1
	+ handleEvent based event handlers replacement for addEl.
*/
var $ = document.getElementById;

var Util =  
{
	isIE: true,
	_classRE: [],
	writeAssertsToDebugLog: false,
		
	nop: function(){},
	
	assert: function(funcOrStr, context) {
		if(typeof funcOrStr == "string") {
			var msg = "ASSERT: " + funcOrStr;
			this.writeAssertsToDebugLog ? CNFormManager._trace(msg) : alert(msg);
			return false;
		}
		var result = funcOrStr.apply(context || this);
		if(!result) {
			msg = "ASSERT failed: " + funcOrStr;
			this.writeAssertsToDebugLog ? CNFormManager._trace(msg) : alert(msg);
		}
		return result;
	},
	
	bind: function(obj, func) {
		return function(){ func.apply(obj, arguments); }; 
	},

	findElement: function(l)
	{
		while(l != null && !l.jsObject) l = l.parentElement;
		return l;
	},
	
	findJSObject: function(l)
	{
		var l = Util.findElement(l);
		if(l) return l.jsObject;
		return null;
	},

	handleEvent: function(l, evName, prefix)
	{
		var handler = Util.dispatcher((prefix ? prefix : "") + evName);
		l.attachEvent(evName, handler);
		return handler;
	},
		
	dispatcher: function(evName)
	{
		return function()
		{
			var jso = Util.dispatchObject();
			if(jso) 
			{
				var ev = jso[evName];
				if(ev) ev.apply(jso);
			}
		}
	},
	
	dispatchObject: function()
	{
		return Util.findJSObject(event.srcElement);
	},

	dispatchByClass: function(clazz)
	{
		var js = Util.dispatchObject();
		while(js && js.constructor != clazz)
		{
			// Try to seek deeper.
			js = Util.findJSObject(js.element.parentElement)
		}
		if(js && js.constructor == clazz) return js;
		return null;
	},
	
	// TODO: rename to findByTag.
	findTag: function(l, tag)
	{
		while(l != null && l.tagName != tag) l = l.parentElement;
		return l;
	},
	
	findByClassName: function(el, className)
	{
		while(el)
		{
			if(Util.hasClass(el, className)) return el;
			el = el.parentNode;
		}
		return el;
	},
	
	_reClassNameCache: {},
    _getClassRegEx: function(className) {
        var re = this._reClassNameCache[className];
        if (!re) {
            re = new RegExp('(?:^|\\s+)' + className + '(?:\\s+|$)');
            this._reClassNameCache[className] = re;
        }
        return re;
    },

	removeClass: function(l, className)
	{
		l.className = this.chop(l.className.replace(this._getClassRegEx(className), ' '));
	},
	
	hasClass: function(l, className) {
		var re = this._classRE[className];
		if(!re) re = this._classRE[className] = new RegExp('(?:^|\\s+)' + className + '(?:\\s+|$)');
		return re.test(l.className);
	},
	
	addClass: function(l, className) {
		if(!this.hasClass(l, className)) l.className += " " + className;
	},

	toggleClass: function(l, className, toggle) {
		toggle ? this.addClass(l, className) : this.removeClass(l, className);
	},
	
	findAbsolutePos: function(el, offsetEl, checkRelative, checkScroll)
	{
		var x = 0, y = 0;
		if(!offsetEl) offsetEl = document.body;
		if(offsetEl == document.body && !checkRelative && !checkScroll) {
			var rect = el.getBoundingClientRect();
			//var doc = el.ownerDocument;
			return {x: rect.left - 2, y: rect.top - 2}
		}
		
		while(el != null && el != offsetEl)
		{
			if(checkRelative && el.currentStyle.position != "static") break;
			x += el.offsetLeft + el.clientLeft; 
			y += el.offsetTop + el.clientTop; 
			el = el.offsetParent;	
			if(checkScroll && el)
			{
				if(el.scrollLeft) x -= el.scrollLeft;
				if(el.scrollTop) y -= el.scrollTop;
			}
		}
		return {x: x, y: y};
	},
	
	calcElementOffset: function(l)
	{
		var xy = Util.findAbsolutePos(l, null, false);
		xy.x -= top.document.body.scrollLeft;
		xy.y -= top.document.body.scrollTop;
		return xy;
	},
	
	setBounds: function(l, node)
	{
		this.setLocation(l, node);
		this.setSize(l, node);
	},
	
	setLocation: function(l, node)
	{
		var x = node.getAttribute("x");
		var y = node.getAttribute("y");
		if(x) l.style.left = x;
		if(y) l.style.top = y;
	},
	
	setSize: function(l, node)
	{
		var width = node.getAttribute("width");
		var height = node.getAttribute("height");
		if(width) l.style.width = width; 
		if(height) l.style.height = height;
	},
	
	cancelEvent: function(ev)
	{
		if(!ev) ev = event;
		ev.cancelBubble = true;
		ev.returnValue = false;

//		CNFormManager._trace("event " + event.type + " canceled by " + Util.cancelEvent.caller);
	},
	
	cancelBubble: function(ev)
	{
		if(!ev) ev = event;
		ev.cancelBubble = true;
	},

	// TODO: Move to objectmodel.js
	cloneObject: function(matrix)
	{
		var obj = {};
		for(var i in matrix) obj[i] = matrix[i];
		return obj;
	},

	// TODO: Move to objectmodel.js
	mixin: function(a, b) {
		for(var i in b) {
			a[i] = b[i]
		}
		if(b.hasOwnProperty("toString")) { // TODO: other don't enum methods?
			a.toString = b.toString;
		}
	},

	// TODO: Move to objectmodel.js
	merge: function(a, b) {
		var a = this.cloneObject(a);
		this.mixin(a, b);
		return a;
	},

	// TODO: Move to objectmodel.js
	conditionalMixin: function(a, b) {
		for(var i in b) {
			if(!a[i]) a[i] = b[i]
		}
	},

	// Toolbar stuff.
	// TODO: mocv
	createToolbar: function(parentElement)
	{
		var toolbar = document.createElement("<div class=cnToolbar>");
		toolbar.unselectable = "on";
		parentElement.appendChild(toolbar);
		return toolbar;
	},
	
	addButton: function(parentElement, cmd, param, caption, imgSrc, isPushable)
	{
		var b = document.createElement("span");
		parentElement.appendChild(b);
		b.unselectable = "on";
			
		b.isButton = true;
		b.className = "button_normal";
		b.isPushable = isPushable;
		b.cmd = cmd;
		b.title = caption;	
		b.param = param;
		b.state = "normal";
		b.attachEvent("onmouseenter", Util._button_onmouseenter);
		b.attachEvent("onmouseleave", Util._button_onmouseleave);
		b.attachEvent("onmousedown", Util._button_onmousedown);
		b.attachEvent("ondblclick", Util._button_onmouseup);
		b.attachEvent("onmouseup", Util._button_onmouseup);
		b.attachEvent("ondragstart", Util.cancelEvent);
		b.attachEvent("onselectstart", Util.cancelEvent);
		b.lastClickTime = 0;
		
		
		var img = document.createElement("img");
		b.appendChild(img);
		img.src = imgSrc;		
		img.unselectable = "on";
	
		return b;
	},
	
	addSeparator: function(parentElement)
	{
		var span = document.createElement("<span class=cnToolbarSeparator>");
		span.unselectable = "on";
		parentElement.appendChild(span);
		return span;
	},

	setButtonState: function(b, state)
	{
		b.state = state;
		setTimeout(function(){
			b.className = "button_" + state; // Avoid IE black fill bug.
		}, 0);
	},
	
	_button_onmouseenter:  function()
	{
		var b = event.srcElement;
		
		if(b._disabled || b.parentElement._disabled) return;
	
		if(b.state == "normal") Util.setButtonState(b, "normalHover");
		else if(b.state == "pushed") Util.setButtonState(b, "pushedHover");
	},

	_button_onmouseleave: function()
	{
		var b = event.srcElement;

		if(b._disabled || b.parentElement._disabled) return;
		
		if(b.state == "normalHover" || b.state == "normalDown") Util.setButtonState(b, "normal");
		else if(b.state == "pushedHover" || b.state == "pushedDown") Util.setButtonState(b, "pushed");
	},

	_button_onmousedown: function()
	{
		var b = event.srcElement;	
		while(b && !b.isButton) b = b.parentElement;
		
		if(b._disabled || b.parentElement._disabled) return;
				
		if(!b.isPushable) 
		{
			Util.setButtonState(b, "normalDown");
		}
		else 
		{
			if(b.state == "pushedHover") Util.setButtonState(b, "normalDown");
			else Util.setButtonState(b, "pushedDown");
		}
	},
	
	_button_onmouseup: function()
	{
		var b = event.srcElement;
		while(b && !b.isButton) b = b.parentElement;
		if(!b) return;
		
		if(b._disabled || b.parentElement._disabled) return;
		
		var current = new Date().getTime();
		var delta = current - b.lastClickTime;
		if (delta < 200) 
		{
			// This happens because of a bug, so we ignore it.
			return;
		}
		
		var jsObject = Util.findJSObject(event.srcElement);

		if(b._group && jsObject._groupButtons)
		{
			var groupButton = jsObject._groupButtons[b._group];
			if(groupButton) 
			{
				Util.setButtonState(groupButton, b.state == "pushedHover" ? "pushed" : "normal");
			}
			jsObject._groupButtons[b._group] = b;
		}

		if(b.state == "pushedDown") Util.setButtonState(b, "pushedHover");
		else Util.setButtonState(b, "normalHover");

		if(b.cmd) 
		{
			if(jsObject[b.cmd]) jsObject[b.cmd](b.param, b);
			b.lastClickTime = current;
		}
	},
	
	trim: function(str) {
		var	str = str.replace(/^\s\s*/, ''),
			ws = /\s/,
			i = str.length;
		while(ws.test(str.charAt(--i))){}
		return str.slice(0, i + 1);
	},

	cleanElement: function(cont)
	{
		var children = cont.children;
		var count = children.length;
		for(var i = count - 1; i >= 0; i--)
		{
			children[i].removeNode(true);
		}
	},

	padString: function(val, pad, n)
	{
		val = String(val);
		pad = String(pad);
		if(val.length < n) 
		{
			var pads = pad;
			for(var i = 1; i < val.length - n; i++) pads += pad;
			val = pads + val;
		}
		return val;
	},
	
	posPopup: function(popup, x, y)
	{
		popup.style.left = x;
		popup.style.top = y;

		var xy = Util.findAbsolutePos(popup, null, false, true);

		var b = xy.y + popup.offsetHeight;
		var r = xy.x + popup.offsetWidth;

		if(r > popup.document.body.clientWidth) 
			popup.style.pixelLeft = popup.offsetLeft - r + popup.document.body.clientWidth - 4; // 4 = shadowWidth

		if(b > popup.document.body.clientHeight)
			popup.style.pixelTop = popup.offsetTop - b + popup.document.body.clientHeight - 4;
	},
	
	wrapIntoNode: function(ar)
	{
		ar.getAttribute = this.wrap_getAttribute;
		ar.setAttribute = this.wrap_setAttribute;
		ar.cloneNode = this._wrap_cloneNode;
		return ar;
	},
	_wrap_cloneNode: function()
	{
		return Util.cloneObject(this);
	},
	wrap_getAttribute: function(name)
	{
		var val = this[name];
		return val == undefined ? null : val;
	},
	wrap_setAttribute: function(name, value)
	{
		this[name] = value;
	},
	replacePNG: function(root)
	{
		var imgs = root.getElementsByTagName("img");
		var count = imgs.length;
		for(var i = count - 1; i >= 0 ; i--)
		{
			var img = imgs[i];
			if(img.src.indexOf(".png") != -1 && img.getAttribute("replacePNG") != "no")
			{
				if(!img.currentStyle.filter) {
					this.replacePNGImage(img);
				}
			}
		}


	},

	replacePNGImage: function(img, width, height) {
		var span = document.createElement("span");
		span.className = img.className;
		var style = span.style;
		style.cssText = img.style.cssText;
		style.width = width || img.currentStyle.width;
		style.height = height || img.currentStyle.height;
		style.overflow = "hidden";
		style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale, src='" + img.src + "')";
		img.parentNode.replaceChild(span, img);
	},
	
	getCaller: function(obj, caller)
	{
		for(var i in obj)
		{
			if(obj[i] == caller) {
				return i;
			}
		}
		return caller;
	},
	
	benchmark: function(func, msg, context) { // NOTE: adds function call overhead.
		var start = new Date().getTime();
		if(context) func.apply(context)
		else func();
		var total = new Date().getTime() - start;
		msg = msg ? msg + ": " : "";
		if(CNFormManager) CNFormManager._trace(msg + total + "ms");
	},
	
	getElapsed: function(date) {
		return new Date().getTime() - date.getTime();
	},
	
	definitionTag: function(html) {
		return html.substr(0, html.indexOf(">") + 1);
	},

	escapeAttr: function(str) {
		return str.replace(/&/g, '&amp;').replace(/"/g, "&quot;").replace(/'/g, '&#39;').replace(/>/g, "&gt;").replace(/</g, "&lt;");
	},

	xmlNodeToJson: function(node) {
		return {tag: node.tagName, attributes: this.xmlAttributesToJson(node), children:  this.xmlNodeListToJson(node.childNodes)};
	},

	xmlNodeListToJson: function(childNodes) {
		var count = childNodes.length;
		var json = [];
		for(var i = 0; i < count; i++) {
			var node = childNodes[i];
			if(node.nodeType != 1) continue;

			json.push(this.xmlNodeToJson(node));
		}
		return json;
	},

	xmlAttributesToJson: function(node) {
		var attrs = node.attributes;
		var length = attrs.length;
		var json = {};
		for(var i = 0; i < length; i++) {
			var attr = attrs[i];
			json[attr.name] = attr.value;
		}
		return json;
	},

	arrayIndexOf: function(array, obj) {
		for(var i = 0; i < array.length; i++) {
			if(array[i] === obj) return i;
		}
		return -1;
	},

	call: function() {
		var d = Array.prototype.shift.apply(arguments);
		if(d) {
			if(d instanceof Array && d.length > 1) {
				if(d[1] instanceof Function) {
					return d[1].apply(d[0], arguments);
				} else {
					return d[0][d[1]].apply(d[0], arguments);
				}
			} else if(d instanceof Function) {
				d(arguments); // Call directly.
			}
		}
	},

	snapToGrid: function(v, grid) {
		return Math.round(v / grid) * grid;
	},
	
	htmlToText: function(html) 
	{
		return html
		// Remove line breaks
		.replace(/(?:\n|\r\n|\n\n|\r)/ig,"")
		// Turn <br>'s into single line breaks.
		.replace(/<\s*br[^>]*>/ig,"\n")
		// Turn </li>'s into line breaks.
		.replace(/<\s*\/li[^>]*>/ig,"\n")
		// Turn <p>'s into double line breaks.
		.replace(/<\s*p[^>]*>/ig,"\n\n")
		// Remove content in script tags.
		.replace(/<\s*script[^>]*>[\s\S]*?<\/script>/mig,"")
		// Remove content in style tags.
		.replace(/<\s*style[^>]*>[\s\S]*?<\/style>/mig,"")
		// Remove content in comments.
		.replace(/<!--.*?-->/mig,"")
		// Remove all remaining tags.
		.replace(/(<([^>]+)>)/ig,"")
		// Make sure there are never more than two
		// consecutive linebreaks.
		.replace(/\n{2,}/g,"\n\n")
		//.replace(/\n{2,}/g,"")
		// Remove tabs.
		.replace(/\t/g,"")
		// Remove newlines at the beginning of the text.
		.replace(/^\n+/m,"")
		// Replace multiple spaces with a single space.
		.replace(/ {2,}/g," ")
		// Decode HTML entities.
		.replace(/&([^;]+);/g, this.decodeHtmlEntity );
	},

	decodeHtmlEntity: function(m, n) 
	{
		var ENTITIES_MAP = 
		{
		  'nbsp' : 160,
		  'iexcl' : 161,
		  'cent' : 162,
		  'pound' : 163,
		  'curren' : 164,
		  'yen' : 165,
		  'brvbar' : 166,
		  'sect' : 167,
		  'uml' : 168,
		  'copy' : 169,
		  'ordf' : 170,
		  'laquo' : 171,
		  'not' : 172,
		  'shy' : 173,
		  'reg' : 174,
		  'macr' : 175,
		  'deg' : 176,
		  'plusmn' : 177,
		  'sup2' : 178,
		  'sup3' : 179,
		  'acute' : 180,
		  'micro' : 181,
		  'para' : 182,
		  'middot' : 183,
		  'cedil' : 184,
		  'sup1' : 185,
		  'ordm' : 186,
		  'raquo' : 187,
		  'frac14' : 188,
		  'frac12' : 189,
		  'frac34' : 190,
		  'iquest' : 191,
		  'Agrave' : 192,
		  'Aacute' : 193,
		  'Acirc' : 194,
		  'Atilde' : 195,
		  'Auml' : 196,
		  'Aring' : 197,
		  'AElig' : 198,
		  'Ccedil' : 199,
		  'Egrave' : 200,
		  'Eacute' : 201,
		  'Ecirc' : 202,
		  'Euml' : 203,
		  'Igrave' : 204,
		  'Iacute' : 205,
		  'Icirc' : 206,
		  'Iuml' : 207,
		  'ETH' : 208,
		  'Ntilde' : 209,
		  'Ograve' : 210,
		  'Oacute' : 211,
		  'Ocirc' : 212,
		  'Otilde' : 213,
		  'Ouml' : 214,
		  'times' : 215,
		  'Oslash' : 216,
		  'Ugrave' : 217,
		  'Uacute' : 218,
		  'Ucirc' : 219,
		  'Uuml' : 220,
		  'Yacute' : 221,
		  'THORN' : 222,
		  'szlig' : 223,
		  'agrave' : 224,
		  'aacute' : 225,
		  'acirc' : 226,
		  'atilde' : 227,
		  'auml' : 228,
		  'aring' : 229,
		  'aelig' : 230,
		  'ccedil' : 231,
		  'egrave' : 232,
		  'eacute' : 233,
		  'ecirc' : 234,
		  'euml' : 235,
		  'igrave' : 236,
		  'iacute' : 237,
		  'icirc' : 238,
		  'iuml' : 239,
		  'eth' : 240,
		  'ntilde' : 241,
		  'ograve' : 242,
		  'oacute' : 243,
		  'ocirc' : 244,
		  'otilde' : 245,
		  'ouml' : 246,
		  'divide' : 247,
		  'oslash' : 248,
		  'ugrave' : 249,
		  'uacute' : 250,
		  'ucirc' : 251,
		  'uuml' : 252,
		  'yacute' : 253,
		  'thorn' : 254,
		  'yuml' : 255,
		  'quot' : 34,
		  'amp' : 38,
		  'lt' : 60,
		  'gt' : 62,
		  'OElig' : 338,
		  'oelig' : 339,
		  'Scaron' : 352,
		  'scaron' : 353,
		  'Yuml' : 376,
		  'circ' : 710,
		  'tilde' : 732,
		  'ensp' : 8194,
		  'emsp' : 8195,
		  'thinsp' : 8201,
		  'zwnj' : 8204,
		  'zwj' : 8205,
		  'lrm' : 8206,
		  'rlm' : 8207,
		  'ndash' : 8211,
		  'mdash' : 8212,
		  'lsquo' : 8216,
		  'rsquo' : 8217,
		  'sbquo' : 8218,
		  'ldquo' : 8220,
		  'rdquo' : 8221,
		  'bdquo' : 8222,
		  'dagger' : 8224,
		  'Dagger' : 8225,
		  'permil' : 8240,
		  'lsaquo' : 8249,
		  'rsaquo' : 8250,
		  'euro' : 8364
		};

		// Determine the character code of the entity. Range is 0 to 65535
		// (characters in JavaScript are Unicode, and entities can represent
		// Unicode characters).
		var code;

		// Try to parse as numeric entity. This is done before named entities for
		// speed because associative array lookup in many JavaScript implementations
		// is a linear search.
		if (n.substr(0, 1) == '#') 
		{
			// Try to parse as numeric entity
			if (n.substr(1, 1) == 'x') 
			{
				// Try to parse as hexadecimal
				code = parseInt(n.substr(2), 16);
			}
			else 
			{
				// Try to parse as decimal
				code = parseInt(n.substr(1), 10);
			}
		}
		else 
		{
			// Try to parse as named entity
			code = ENTITIES_MAP[n];
		}

		// If still nothing, pass entity through
		return (code === undefined || code === NaN) ? '&' + n + ';' : String.fromCharCode(code);
	}
}
Util.chop = Util.trim;
Util.clone = Util.cloneObject;

Util.IE6 = navigator.appVersion.indexOf("MSIE 6") >= 0;
Util.IE7 = navigator.appVersion.indexOf("MSIE 7") >= 0;
Util.IE8 = navigator.appVersion.indexOf("MSIE 8") >= 0;

if(!Util.IE6) {
	Util.replacePNGImage = Util.nop;
	Util.replacePNG = Util.nop;
}

var CNUtil = Util;
Util.getXY = Util.findAbsolutePos;

