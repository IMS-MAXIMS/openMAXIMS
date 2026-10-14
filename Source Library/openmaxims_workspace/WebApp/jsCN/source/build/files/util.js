	/*
	v. 2.0.1
	+ handleEvent based event handlers replacement for addEl.
*/
var $ = function(id) { return document.getElementById(id); };

var Util =  
{
	_classRE: [],
	writeAssertsToDebugLog: false,
		
	nop: function(){},

	_unsupportedFeatures: [],
	reportUnsupported: function(moduleName, feature, detail) {
		var item = {module: String(moduleName), feature: String(feature), detail: detail ? String(detail) : ""};
		for(var i = 0; i < this._unsupportedFeatures.length; i++) {
			var prior = this._unsupportedFeatures[i];
			if(prior.module == item.module && prior.feature == item.feature) return item;
		}
		this._unsupportedFeatures.push(item);
		if(typeof console != "undefined" && console.warn) console.warn("Client Framework unsupported feature: " + item.module + " / " + item.feature + (item.detail ? " - " + item.detail : ""));
		return item;
	},
	
	parseBoolean: function(value) {
		if(typeof value == "boolean") return value;
		if(value === null || value === undefined) return false;
		if(typeof value == "number") return value != 0;
		var normalized = String(value).replace(/^\s+|\s+$/g, "").toLowerCase();
		if(normalized == "true" || normalized == "1") return true;
		if(normalized == "false" || normalized == "0" || normalized == "") return false;
		return Boolean(value);
	},

	resolveGlobal: function(name) {
		if(typeof window == "undefined" || !window) return null;
		return window[String(name)];
	},

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
		while(l != null && !l.jsObject) l = l.parentElement || l.parentNode;
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
		var eventName = evName.indexOf("on") == 0 ? evName.substr(2) : evName;
		var listener = function(ev) {
			var previousEvent = Event._currentEvent;
			Event._currentEvent = Event.normalize(ev);
			try {
				return handler.call(l, ev);
			} finally {
				Event._currentEvent = previousEvent;
			}
		};
		Event.nativeAdd(l, eventName, listener);
		return listener;
	},
		
	dispatcher: function(evName)
	{
		return function(nativeEvent)
		{
			var jso = Util.dispatchObject(nativeEvent);
			if(jso)
			{
				var handler = jso[evName];
				if(handler) return handler.call(jso, nativeEvent);
			}
		};
	},
	
	dispatchObject: function(nativeEvent)
	{
		var ev = nativeEvent;
		if(!ev && typeof Event != "undefined" && Event.current) ev = Event.current();
		if(!ev) return null;
		var target = ev.target;
		return Util.findJSObject(target);
	},

	eventTarget: function(nativeEvent)
	{
		var ev = nativeEvent;
		if(!ev && typeof Event != "undefined" && Event.current) ev = Event.current();
		return ev ? (ev.target) : null;
	},

	dispatchByClass: function(clazz)
	{
		var js = Util.dispatchObject();
		while(js && js.constructor != clazz)
		{
			// Try to seek deeper.
			js = Util.findJSObject(js.element.parentElement || js.element.parentNode)
		}
		if(js && js.constructor == clazz) return js;
		return null;
	},
	
	// TODO: rename to findByTag.
	findTag: function(l, tag)
	{
		while(l != null && l.tagName != tag) l = l.parentElement || l.parentNode;
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

	// Controls in the server-provided dark header need the theme's light
	// foreground colour.  Use viewport geometry rather than offsetParent
	// chains: controls may be nested in containers and standards browsers do
	// not reproduce IE's offsetParent quirks.
	isInDarkHeader: function(element, formManager) {
		if(!element || !formManager || !formManager._darkHeight ||
			!formManager._formPlaceholder || !element.getBoundingClientRect ||
			!formManager._formPlaceholder.getBoundingClientRect) return false;

		// The theme owns the foreground colour; server darkHeight remains the
		// boundary for the partial dark filter surface.
		var formRect = formManager._formPlaceholder.getBoundingClientRect();
		var elementRect = element.getBoundingClientRect();
		return elementRect.top < formRect.top + formManager._darkHeight;
	},

	setDarkHeaderControlClass: function(element, formManager) {
		if(!element) return;
		this.toggleClass(element, "control_on_darkHeader",
			this.isInDarkHeader(element, formManager));
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
			if(checkRelative) {
				var computed = this.getComputedStyle(el);
				if(computed && computed.position != "static") break;
			}
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
		var ownerWindow = (l.ownerDocument && l.ownerDocument.defaultView) || window;
		var body = ownerWindow.document.body;
		xy.x -= body.scrollLeft || 0;
		xy.y -= body.scrollTop || 0;
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

	getStyle: function(element, property)
	{
		if(!element) return "";
		if(element.style && element.style[property]) return element.style[property];
		var computed = this.getComputedStyle(element);
		return (typeof computed.getPropertyValue == "function" ? computed.getPropertyValue(property) : computed[property]) || computed[property] || "";
	},
	
	cancelEvent: function(ev)
	{
		return Event.cancel(ev);
	},
	
	cancelBubble: function(ev)
	{
		var current = Event.normalize(ev) || Event.current();
		if(current) {
			if(current.stopPropagation) current.stopPropagation();
			if(current.stopPropagation) current.stopPropagation();
		}
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

	findById: function(root, id)
	{
		if(!root) return null;

		// Tab buttons and their content containers deliberately share an id in
		// the historical runtime. A standards querySelector returns the first
		// match, which is the tab button, and then applies container visibility
		// to the wrong element. Prefer the semantic runtime element.
		var first = root.id == id ? root : null;
		if(first && (first.isContainer || first.isControl)) return first;
		var nodes = root.getElementsByTagName ? root.getElementsByTagName("*") : [];
		for(var i = 0; i < nodes.length; i++)
		{
			if(nodes[i].id == id && (nodes[i].isContainer || nodes[i].isControl)) return nodes[i];
			if(!first && nodes[i].id == id) first = nodes[i];
		}
		if(first) return first;

		var children = root.children || root.childNodes || [];
		for(var j = 0; j < children.length; j++)
		{
			var found = this.findById(children[j], id);
			if(found) return found;
		}
		return null;
	},

	getComputedStyle: function(element)
	{
		if(!element) return {};
		if(typeof window == "undefined" || typeof window.getComputedStyle != "function") throw new Error("Util: standard getComputedStyle is required");
		return window.getComputedStyle(element, null);
	},

	removeElement: function(element)
	{
		if(!element) return;
		if(element.remove) { element.remove(); return; }
		if(element.parentNode) element.parentNode.removeChild(element);
	},

	createElementFromHTML: function(markup, ownerDocument)
	{
		var source = String(markup);
		var match = /^\s*<([A-Za-z0-9]+)/.exec(source);
		if(!match) throw new Error("Invalid HTML element markup");
		var tagName = match[1].toLowerCase();
		var wrapperTag = (tagName == "tr" || tagName == "td" || tagName == "th" || tagName == "tbody" || tagName == "thead" || tagName == "tfoot") ? "table" : "div";
		var targetDocument = ownerDocument || document;
		var wrapper = targetDocument.createElement(wrapperTag);
		if(tagName == "td" || tagName == "th") wrapper.innerHTML = "<tbody><tr>" + source + "</tr></tbody>";
		else if(tagName == "tr") wrapper.innerHTML = "<tbody>" + source + "</tbody>";
		else wrapper.innerHTML = source;
		var matches = wrapper.getElementsByTagName ? wrapper.getElementsByTagName(tagName) : [];
		return matches.length ? matches[0] : (wrapper.firstElementChild || wrapper.firstChild);
	},

	createElement: function(tagName, className, attributes)
	{
		var element = document.createElement(tagName);
		if(className) element.className = className;
		if(attributes)
		{
			for(var name in attributes)
			{
				if(!attributes.hasOwnProperty(name)) continue;
				var value = attributes[name];
				try { element[name] = value; } catch(ignore) {}
				if(element.setAttribute) element.setAttribute(name, value);
			}
		}
		return element;
	},

	appendHTML: function(parent, markup, ownerDocument)
	{
		if(!parent) return null;
		var source = String(markup);
		var targetDocument = ownerDocument || parent.ownerDocument || document;
		var match = /^\s*<([A-Za-z0-9]+)/.exec(source);
		if(!match) throw new Error("Invalid HTML element markup");
		var tagName = match[1].toLowerCase();
		var wrapperTag = (tagName == "tr" || tagName == "td" || tagName == "th" || tagName == "tbody" || tagName == "thead" || tagName == "tfoot") ? "table" : "div";
		var wrapper = targetDocument.createElement(wrapperTag);
		if(tagName == "td" || tagName == "th") wrapper.innerHTML = "<tbody><tr>" + source + "</tr></tbody>";
		else if(tagName == "tr") wrapper.innerHTML = "<tbody>" + source + "</tbody>";
		else wrapper.innerHTML = source;

		var first = null;
		while(wrapper.firstChild)
		{
			var child = wrapper.firstChild;
			if(!first && child.nodeType == 1) first = child;
			parent.appendChild(child);
		}
		return first;
	},

	// Toolbar stuff.
	// TODO: mocv
	createToolbar: function(parentElement)
	{
		var toolbar = document.createElement("div");
		toolbar.className = "cnToolbar";
		toolbar.style.userSelect = "none";
		parentElement.appendChild(toolbar);
		return toolbar;
	},
	
	addButton: function(parentElement, cmd, param, caption, imgSrc, isPushable)
	{
		var b = document.createElement("span");
		parentElement.appendChild(b);
		b.style.userSelect = "none";
			
		b.isButton = true;
		b.className = "button_normal";
		b.isPushable = isPushable;
		b.cmd = cmd;
		b.title = caption;	
		b.param = param;
		b.state = "normal";
		Event.add(b, "mouseenter", this, this._button_onmouseenter);
		Event.add(b, "mouseleave", this, this._button_onmouseleave);
		Event.add(b, "mousedown", this, this._button_onmousedown);
		Event.add(b, "dblclick", this, this._button_onmouseup);
		Event.add(b, "mouseup", this, this._button_onmouseup);
		Event.add(b, "dragstart", this, this.cancelEvent);
		b.lastClickTime = 0;
		
		
		var img = document.createElement("img");
		b.appendChild(img);
		img.src = imgSrc;		
		img.style.userSelect = "none";
	
		return b;
	},
	
	addSeparator: function(parentElement)
	{
		var span = document.createElement("span");
		span.className = "cnToolbarSeparator";
		span.style.userSelect = "none";
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
	
	_button_onmouseenter:  function(ev)
	{
		var b = ev && (ev.target);
		
		if(b._disabled || b.parentElement._disabled) return;
	
		if(b.state == "normal") Util.setButtonState(b, "normalHover");
		else if(b.state == "pushed") Util.setButtonState(b, "pushedHover");
	},

	_button_onmouseleave: function(ev)
	{
		var b = ev && (ev.target);

		if(b._disabled || b.parentElement._disabled) return;
		
		if(b.state == "normalHover" || b.state == "normalDown") Util.setButtonState(b, "normal");
		else if(b.state == "pushedHover" || b.state == "pushedDown") Util.setButtonState(b, "pushed");
	},

	_button_onmousedown: function(ev)
	{
		var b = ev && (ev.target);	
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
	
	_button_onmouseup: function(ev)
	{
		var b = ev && (ev.target);
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
		
		var jsObject = Util.findJSObject(ev && (ev.target));

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
			if(typeof cont.removeChild != "function") throw new Error("Util: standard removeChild is required");
			cont.removeChild(children[i]);
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

		var body = (popup.ownerDocument || document).body;
		if(r > body.clientWidth)
			popup.style.left = (popup.offsetLeft - r + body.clientWidth - 4) + "px"; // 4 = shadowWidth

		if(b > body.clientHeight)
			popup.style.top = (popup.offsetTop - b + body.clientHeight - 4) + "px";
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

	createXMLHttpRequest: function()
	{
		if(typeof XMLHttpRequest != "undefined") return new XMLHttpRequest();
		if(typeof window != "undefined" && window.XMLHttpRequest) return new window.XMLHttpRequest();
		throw new Error("Util: standard XMLHttpRequest is required");
	},

	createXMLDocument: function()
	{
				if(typeof document != "undefined" && document.implementation && document.implementation.createDocument)
		{
			return document.implementation.createDocument("", "", null);
		}
		throw new Error("Util: standard DOMImplementation.createDocument is required");
	},

	parseXML: function(xml)
	{
				if(typeof DOMParser != "undefined") return new DOMParser().parseFromString(String(xml), "text/xml");
		if(typeof window != "undefined" && window.DOMParser) return new window.DOMParser().parseFromString(String(xml), "text/xml");
		throw new Error("Util: standard DOMParser is required");
	},

	xmlText: function(node)
	{
		return node == null || node.textContent == null ? "" : String(node.textContent);
	},

	xmlInnerString: function(node)
	{
		if(node == null) return "";
		var result = "";
		for(var i = 0; i < node.childNodes.length; i++)
		{
			result += this.xmlString(node.childNodes[i]);
		}
		return result;
	},

	xmlString: function(node)
	{
		if(node == null) return "";
		if(typeof XMLSerializer != "undefined") return new XMLSerializer().serializeToString(node);
		if(typeof window != "undefined" && window.XMLSerializer) return new window.XMLSerializer().serializeToString(node);
		throw new Error("Util: standard XMLSerializer is required");
	},

	xmlSelectNodes: function(node, path)
	{
		if(!node) return [];
		var doc = node.nodeType == 9 ? node : node.ownerDocument;
		var w = typeof window != "undefined" ? window : null;
		var XPathResultType = (w && w.XPathResult) || (typeof XPathResult != "undefined" ? XPathResult : null);
		// XPath implementations reject DocumentFragment as a context node in
		// standards browsers. Use the standards DOM traversal below for
		// fragments instead of relying on a browser-specific XML extension.
		if(node.nodeType != 11 && doc && doc.evaluate && XPathResultType)
		{
			try
			{
				var result = doc.evaluate(path, node, null, XPathResultType.ORDERED_NODE_SNAPSHOT_TYPE, null);
				var nodes = [];
				for(var i = 0; i < result.snapshotLength; i++) nodes.push(result.snapshotItem(i));
				return nodes;
			}
			catch(ignore)
			{
				// Fall through to the standards DOM traversal for unsupported
				// XPath context nodes or expressions.
			}
		}
		// DOM traversal supports simple child paths when XPath is unavailable.
		var current = [node];
		var parts = String(path).replace(/^\.\//, "").split("/");
		for(var p = 0; p < parts.length; p++)
		{
			var part = parts[p];
			if(!part || part == ".") continue;
			var match = /^([^\[]+)(?:\[@([^=]+)=(["'])(.*?)\3\])?$/.exec(part);
			if(!match) return [];
			var tag = match[1], attr = match[2], value = match[4], next = [];
			for(var c = 0; c < current.length; c++)
			{
				var children = current[c].children || current[c].childNodes || [];
				for(var j = 0; j < children.length; j++)
				{
					var child = children[j];
					if(child.nodeType != 1 || (tag != "*" && child.tagName != tag)) continue;
					if(attr && child.getAttribute(attr) != value) continue;
					next.push(child);
				}
			}
			current = next;
		}
		return current;
	},

	xmlSelectSingleNode: function(node, path)
	{
		var nodes = this.xmlSelectNodes(node, path);
		return nodes.length ? nodes[0] : null;
	},


	xmlChildElements: function(node, tagName)
	{
		var children = node && (node.children || node.childNodes);
		var result = [];
		if(!children) return result;
		for(var i = 0; i < children.length; i++)
		{
			var child = children[i];
			if(child.nodeType == 1 && (!tagName || child.tagName == tagName)) result.push(child);
		}
		return result;
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

var CNUtil = Util;
Util.getXY = Util.findAbsolutePos;
