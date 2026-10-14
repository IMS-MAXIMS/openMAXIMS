/*
	#1042 - _validateLength
	v. 2.0.1
*/
function CN_intbox()
{
	this.formManager = null;
	this.validationString = null;
	
	this.maxLength = 9;
	this._canBeEmpty = true;
	this._precision = 10;
	this._scale = 2;
	this._allowSign = false;

	this.isReady = false;

	this.validCharsRegex = null;
	this.regex = null;

	this._isDirty = false;
	this.doNotShowErrorMessage = true;
	this._autoPostBack = false;
	this._disabled = false;	
	this._readOnly = false;
	this._tagName = "intbox";

	this.supportsRequired = true;
}
var proto = CN_intbox.prototype;

// Events. ================================
proto.onchange = function(ev)
{
	if(this._autoPostBack) this.formManager.postData(this.element);
}

// ICNControl. =============================
proto.isValid = function()
{
	if(this._disabled) return true;
	var value = this.element.value;
	var valid = value.match(/^([-+])?\d+$/) != null || (value.replace(/\s+/, "") == "" && this._canBeEmpty);
	if(valid) valid = value.length <= this.maxLength || value.length == this.maxLength + 1 && value.match(/^[+-]/);
	if(!valid) this.element.style.borderColor = "red";
	return valid;
}

proto.createElement = function(node, parentElement)
{
	var l = document.createElement("input");
	l.type = 'text';
	parentElement.appendChild(l);

	this.element = l;
	l.jsObject = this;

	l.className = "cn_textbox";

	var attr = node.getAttribute("maxLength");
	if(attr) this.maxLength = parseInt(attr, 10);

	var attr = node.getAttribute("allowSign");
	if(attr && attr == "true") this._allowSign = true;

	attr = node.getAttribute("canBeEmpty");
	if(attr) this._canBeEmpty = attr == "true";

	attr = node.getAttribute("validationString");
	if(attr) 
	{
		this.validationString = String(attr);
		this.doNotShowErrorMessage = false;
	}
	
	attr = node.getAttribute("autoPostBack");
	if(attr) this._autoPostBack = attr == "true";

	this.validCharsRegex = this._allowSign ? /[0-9+\-]/ : /[0-9]/;
	this.regex = this._allowSign ? /^(\+|\-)?\d+$/ : /^\d+$/;

	this.buildElement();

	this.isReady = true;
	
	return l;
}

proto.buildElement = function()
{
	var box = this.element;
//	if(this.maxLength > 0) box.maxLength = this.maxLength;
	Event.add(box, "keypress", this, this._box_onkeypress);
	Event.add(box, "paste", this, this._box_onpaste);
	Event.add(box, "change", this, this._box_onchange);	
	Event.add(box, "focusout", this, this._box_onfocusout);
	Event.add(box, "focusin", this, this._box_onactivate);	
	
	if(CNFormManager.vista) VistaSupport.attachToTextBox(box);
}

proto.loadData = function(node)
{
	var attr = node.getAttribute("tooltip");
	if(attr) 
	{
		if(!this.element.tipText) Tooltip.attach(this.element, String(attr));
		else this.element.tipText = String(attr);
	}

	var attr = node.getAttribute("value");
	if(attr != null) this.element.value = String(attr);

	attr = node.getAttribute("readOnly");
	if(attr) 
	{
		this._readOnly = attr == "true";
		this._set_disabled();		
	}

	attr = node.getAttribute("textColor");
	if(attr !== null) this.element.style.color = String(attr);

	this._isDirty = false;
}

proto.storeData = function(xmldoc)
{
	if(!this._isDirty || !this.isValid()) return null;
	this._isDirty = false;

	var node = xmldoc.createElement(this._tagName);
	node.setAttribute("value", this.element.value.replace('+', ''));
	return node;
}


proto.fireChangedEvent = function()
{
	var ev = {target: this.element};
	if(this.onchange) this.onchange(ev);
}


proto.set_tabIndex = function(ti)
{
	this._tabIndex = ti;
	this._set_tabIndex(ti);
}
proto._set_tabIndex = function(ti)
{
	this.element.tabIndex = ti;
}

proto.set_disabled = function(val)
{
	if(val) this._set_tabIndex(-1);
	else if(this._tabIndex) this._set_tabIndex(this._tabIndex);
	this._disabled = val
	this._set_disabled();
}
proto._set_disabled = function()
{
	var disable = this.element.readOnly = this._disabled || this._readOnly;
	if(CNFormManager.vista) this.element.className = disable ? "cn_textbox cn_textbox_disabled" : "cn_textbox";
	else this.element.style.backgroundColor =  disable ? Util.getStyle(this.element, "xl--disabled-background") : "";
}

// Event handlers. ========================
proto._box_onkeypress = function() {
	var code = (Event.keyValue(Event.current()));
	if(code == 0) return;
	var jsObject = Util.eventTarget().jsObject;
	if(code == 13)
	{
		if(this._autoPostBack) {
			Util.cancelEvent();
			jsObject.fireChangedEvent();
		}
		return;
	}
	if(Event.current().ctrlKey || Event.current().metaKey || Event.current().altKey) return;
	var charx = Event.current().key && Event.current().key.length == 1 ? Event.current().key : String.fromCharCode(code);
	var validChar = charx.match(jsObject.validCharsRegex) != null;
	if(!validChar || !jsObject._validateLength(charx)) Util.cancelEvent(Event.current());
}
proto._validateLength = function(typedChar) { // #1042 - refactor length validation.
	var maxLength = this.maxLength;
	if(this._allowSign && this.element.value.length == this.maxLength) {
		if(this.element.value.match(/[+-]/) == null) return typedChar.match(/[+-]/) != null;	
		else return typedChar.match(/\d/) != null;	// Allow only digits if sign exists.
	}
	else if(this.element.value.length >= this.maxLength) return false;

	return true;
}

proto._box_onchange = function()
{
	var jsObject = Util.eventTarget().jsObject;
	jsObject.fireChangedEvent();	
	jsObject._isDirty = true;
}

proto._box_onfocusout = function()
{
	var jsObject = Util.eventTarget().jsObject;
	jsObject.isValid();
}

proto._box_onactivate = function()
{
	Util.eventTarget().style.borderColor = "";
}

proto._box_onpaste = function() {
	var ev = Event.current();
	var box = Util.eventTarget(ev);
	var jso = box.jsObject;
	var text = ev.clipboardData && ev.clipboardData.getData("text");
	if(text == null) return;
	Util.cancelEvent(ev);
	var start = box.selectionStart;
	var end = box.selectionEnd;
	var available = jso.maxLength - (box.value.length - (end - start));
	var buf = [];
	for(var i = 0; i < text.length && buf.length < available; i++) {
		var ch = text.charAt(i);
		if(ch.match(jso.validCharsRegex) != null) buf.push(ch);
	}
	box.setRangeText(buf.join(""), start, end, "end");
	if(buf.length) jso._isDirty = true;
}
