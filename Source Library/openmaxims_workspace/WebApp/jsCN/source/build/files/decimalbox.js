/*
	v. 2.0
	#1042 - _validateLength
	NOTE: derives from intbox.
*/
function CN_decimalbox()
{
	this.formManager = null;
	this.validationString = "Invalid Decimal";
	
	this.maxLength = 0;
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
	this._tagName = "decimalbox";
	
	this.supportsRequired = true;
}
var proto = CN_decimalbox.prototype = CNUtil.cloneObject(CN_intbox.prototype);

// ICNControl. =============================
proto.isValid = function()
{
	if(this._disabled) return true;
	var value = this.element.value;
	if(value.replace(/\s+/, "") == "" && this._canBeEmpty) return true;
	var valid = value.match(this.regex) != null;
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

	attr = node.getAttribute("precision");
	if(attr) this._precision = parseInt(attr, 10);
	
	attr = node.getAttribute("scale");
	if(attr) this._scale = parseInt(attr, 10);
	
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

	this.validCharsRegex = this._allowSign ? /[0-9+\-.]/ : /[0-9.]/;	
	
	var decDigits = this._precision - this._scale;
	var plusMinus = this._allowSign ? "(\\+|\\-)?" : "";
	var str = "^" + plusMinus + "(\\d{1," + decDigits + "}(\\.|\\,)\\d{1," + this._scale + "}|"
							// .00
							+ "(\\.|\\,)\\d{1," + this._scale + "}|"
							// 00
							+ "\\d{1," + decDigits + "})$";
	this.regex = new RegExp(str);

	this.buildElement();

	this.isReady = true;
	
	return l;
}
proto._validateLength = function(typedChar) { // #1042 - disable int box max length behavior in decimal.
	return true; // Rely on box.maxLength.
}
