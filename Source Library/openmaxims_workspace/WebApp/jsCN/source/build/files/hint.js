function CN_hint() {
	this._disabled = false;
	this.initiateUpload = false; // Used by formManager.
}

var proto = CN_hint.prototype;

proto.createElement = function(node, parentElement) {
	var l = document.createElement('<div class="cn_hint">');
	parentElement.appendChild(l);

	this.clicked = false;

	var but = VistaSupport.createImageSetButton(null, 16, 16, 0);
	l.appendChild(but);

	Event.add(but, "click", this, this._but_click);
	Event.add(but, "mousedown", this, this._but_mousedown);

	this.element = l;
	l.jsObject = this;

	this._setTooltip(node);
	this._setAutoPostBack(node.getAttribute("autoPostBack") == "true");

	return l;
}

proto.loadData = function(node) {
	this._setTooltip(node);

	var attr = node.getAttribute("autoPostBack");
	if(attr) this._setAutoPostBack(node.getAttribute("autoPostBack") == "true"); 
}

proto._setTooltip = function(node) {
	var attr = node.getAttribute("tooltip");
	if(attr) {
		if(!this.element.tipText) Tooltip.attach(this.element, String(attr));
		else this.element.tipText = String(attr);
	}
}

proto._setAutoPostBack = function(val) {
	this._autoPostBack = val;
	this.element.firstChild._noClick = !val;
	Util.toggleClass(this.element, "cn_hint_no_autopostback", !val);
}

proto.storeData = function(xmldoc) {
	if(!this.clicked) return;
	this.clicked = false;

	var node = xmldoc.createElement("hint");
	return node;
}

proto.set_disabled = function(value) {
	this._disabled = this.element.firstChild._disabled = value;
	Util.toggleClass(this.element, "cn_hint_disabled", value);
}

proto._but_mousedown = function() {
	if(!this._autoPostBack) {
		Util.cancelEvent();
	}
}

proto._but_click = function() {
	if(this._disabled) return;
	if(!this._autoPostBack) {
		Util.cancelEvent();
		return;
	}
	this.clicked = true;
	this.formManager.postData(this.element);
}

proto = null;