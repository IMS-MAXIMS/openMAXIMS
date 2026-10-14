/*
	v. 0.1 - initial release.
*/
function CN_flash() {
	this._loaded = false;
	this._lastData = null;
	this._lastPostData = null;
}
CN_flash.loaded = function(id) {
	var el = document.getElementById(id);
	if(!el) Util.assert("!el, id: " + id);
	var jso = el = el.parentNode.jsObject;
	jso._loaded = true;
	if(jso._lastData !== null) {
		jso._loadDataToFlash(jso._lastData);
		jso._lastData = null;
	}
}
CN_flash.makePostback = function(id, data) {
	var el = document.getElementById(id);
	if(!el) Util.assert("!el, id: " + id);
	var el = el.parentNode;
	var jso = el.jsObject;
	jso._lastPostData = data;

	jso.formManager.postData(el);
}

var proto = CN_flash.prototype;

proto.createElement = function(node, parentElement) {
	var l = document.createElement("div");
	l.className = "cn_flash";
	parentElement.appendChild(l);
	l.jsObject = this;
	this.element = l;

	this._build(node);

	return l;
}

proto._build = function(node) {
	var obj = document.createElement('<object width="100%" height="100%" classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=9,0,0,0">');
	obj.id = node.getAttribute("id") + "_object";
	obj.appendChild(document.createElement('<param name="allowFullScreen" value="false" />'));
	obj.appendChild(document.createElement('<param name="quality" value="high" />'));
	obj.appendChild(document.createElement('<param name="wmode" value="transparent"/>'));
	obj.appendChild(document.createElement('<param name="allowScriptAccess" value="always"/>'));

	var p = document.createElement("param");
	p.setAttribute("name", "movie");
	p.setAttribute("value", String(node.getAttribute("src")));
	obj.appendChild(p);
	this.element.appendChild(obj);
}
proto.loadData = function(node) {
	if(node.text.length == 0) return;
	var data = String(node.text);
	if(this._loaded) {
		this._loadDataToFlash(data);
	} else {
		this._lastData = data;
	}
}
proto._loadDataToFlash = function(data) {
	var self = this;
	setTimeout(function() {
		self.element.firstChild.jsCN_loadData(data);
	}, 0);
}

proto.storeData = function(xmldoc) {
	var node = xmldoc.createElement("flash");

	if(this._lastPostData !== null) {
		node.appendChild(xmldoc.createCDATASection(this._lastPostData));
		this._lastPostData = null;
	}
	return node;
}

proto = null;
