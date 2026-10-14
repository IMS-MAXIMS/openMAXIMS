/*
	v. 2.0.1
*/
function CN_rangebox()
{
	this._isDirty = false;
	this._readOnly = false;
	this._disabled = false;
	this.validationString = null;
	
	// Grid support.
	this.directlyAssignEvents = true;
	this.doNotCheckValidChars = true;
	this._type = CN_rangebox.INT_TYPE;
	
	this._lastValidValue1 = '';
	this._lastValidValue2 = '';

	this.supportsRequired = true;
}
CN_rangebox.DECIMAL_TYPE = 1;
CN_rangebox.INT_TYPE = 0;

var proto = CN_rangebox.prototype; 

// Events. =========================
proto.onfocusout = function(){}
proto.onkeypress = function(){}

// Public methods. ================================
proto.createElement = function(node, parentElement)
{
	var l = document.createElement("table");
	l.cellPadding = 0;
	l.cellSpacing = 0;
	l.border = 0;
	// Grid support.
	if(parentElement) parentElement.appendChild(l);

	this.element = l;
	l.jsObject = this;
	
	l.className = "cn_rangebox";
	
	var boxType = CN_intbox;
	if(node.getAttribute("type") == "decimal")
	{
		this._type = CN_rangebox.DECIMAL_TYPE;
		boxType = CN_decimalbox;
		this.validationString = "Invalid Decimal Range";
	}
	else
	{
		this.validationString = "Invalid Integer Range";
	}

	var tr = l.insertRow();
	tr.valign = "middle";
	var td = tr.insertCell();
	td.width = "50%";

	this._box1 = new boxType();
	this._box1._canBeEmpty = true;
	var box1El = this._box1.createElement(node, td);
	box1El.style.width = "100%";
	
	td = tr.insertCell();
	td.width = 7;
	td.align = "center";
	td.noWrap = true;
	td.appendChild(document.createTextNode("-"));

	td = tr.insertCell();
	td.width = "50%";

	this._box2 = new boxType();
	this._box2._canBeEmpty = true;
	var box2El = this._box2.createElement(node, td);
	box2El.style.width = "100%";

	this._box1.onchange = this._box_onchange;
	this._box2.onchange = this._box_onchange;

	Event.add(this.element, "focusout", this, this._element_onfocusout);
	Event.add(this.element, "focusout", this, this._element_ondeactivate);
	Event.add(this.element, "focusin", this, this._element_onactivate);
	
	if(CNFormManager.vista && parentElement) this.attachToTextBox(this.element);
	
	return l;
}
			  
proto.attachToTextBox = function(l)
{
	Event.add(this.element, "mouseenter", this, this._textbox_onmouseenter);
	Event.add(this.element, "mouseleave", this, this._textbox_onmouseleave);
	Event.add(this._box1.element, "focusin", this, this._textbox_onmouseenter);
	Event.add(this._box1.element, "focusout", this, this._textbox_onmouseleave);	
	Event.add(this._box2.element, "focusin", this, this._textbox_onmouseenter);
	Event.add(this._box2.element, "focusout", this, this._textbox_onmouseleave);	
}
proto._textbox_onmouseenter = function()
{
	var l = Util.findByClassName(Util.eventTarget(), "cn_rangebox");
	var jso = l.jsObject;
	if(jso._disabled || jso._readOnly) return;
	if(jso._anim) Animator.stop(jso._anim);
	jso.element.style.borderColor =  "#B5CFE7"; 
	jso.element.style.borderTopColor = "#3D7BAD";
}
proto._textbox_onmouseleave = function()
{
	var l = Util.findByClassName(Util.eventTarget(), "cn_rangebox");
	var jso = l.jsObject;
	if(jso._disabled || jso._readOnly || jso.element.contains(document.activeElement)) return;
	Animator.start(jso._anim = new AnimVistaBoxFadeout(jso.element));
}


proto.unload = function()
{
	CNFormManager.destroyJSObject(this._box1);
	CNFormManager.destroyJSObject(this._box2);
	this._box1 = null;
	this._box2 = null;
}

proto.loadData = function(node)
{
	this._isDirty = false;

	var attr = node.getAttribute("minValue");
	if(attr != null) this._lastValidValue1 = this._box1.element.value = String(attr);
	attr = node.getAttribute("maxValue");
	if(attr != null) this._lastValidValue2 = this._box2.element.value = String(attr);
}

proto.resetValue = function()
{
	this._isDirty = false;
	this._box1.element.value = this._lastValidValue1;	
	this._box2.element.value = this._lastValidValue2;
}

proto.storeData = function(xmldoc)
{
	if(!this._isDirty) return null;
	this._isDirty = false;

	var node = xmldoc.createElement("rangebox");

	node.setAttribute("minValue", this._box1.element.value);
	node.setAttribute("maxValue", this._box2.element.value);

	return node;
}

proto.isValid = function()
{
	var minValue = parseInt(this._box1.element.value, 10);
	var maxValue = parseInt(this._box2.element.value, 10);
	if(!isNaN(minValue) && !isNaN(maxValue)) 
	{
		if(maxValue < minValue 
		|| !this._box1.isValid()
		|| !this._box2.isValid())
		{
			this.element.style.borderColor = "red";
			return false;
		}
	}

	if(this.element.style.borderColor == "red") this.element.style.borderColor = "";
	return true;
}

// Private methods. =================================
proto._tryNextField = CN_partialdatebox.prototype._tryNextField;

proto._moveToNextField = function(box)
{
	var boxes = this.element.getElementsByTagName("input");
	if(box == boxes[0]) boxes[1].focus();
}

proto._moveToPreviousField = function(box)
{
	var boxes = this.element.getElementsByTagName("input");
	if(box == boxes[1]) boxes[0].focus();
}

proto._checkLeftRight = CN_partialdatebox.prototype._checkLeftRight;

// Used by grid BoxManager.
proto.focus = CN_partialdatebox.prototype.focus;

// Used by grid BoxManager.
proto.select = function(){}

// Used by grid BoxManager.
proto.blur = CN_partialdatebox.prototype.blur;


// Used by grid BoxManager.
proto.get_value = function()
{
	return this._box1.element.value + "-" + this._box2.element.value;
}

// Used by grid BoxManager.
proto.set_value = function(val)
{
	var values = val.split("-");
	this._box1.element.value = values[0];
	this._box2.element.value = values[1];
}

// Used by grid BoxManager.
proto.set_readOnly = function(value)
{
	this._readOnly = Util.parseBoolean(value);
	var boxes = this.element.getElementsByTagName("input");	
	var val = this._readOnly || this._disabled;

	this._box1._readOnly = this._box2._readOnly = this._readOnly;
	this._box1._set_disabled();
	this._box2._set_disabled();

	if(CNFormManager.vista)
		this.element.className = val ? "cn_rangebox cn_rangebox_disabled" : "cn_rangebox";
	else 
		this.element.style.backgroundColor = val ? Util.getStyle(this.element, "xl--disabled-background") : "";
}

// Used by grid BoxManager.
proto.get_readOnly = function()
{
	return this._readOnly;
}

proto.set_disabled = function(val)
{
	this._disabled = val
	this._box1.set_disabled(val);
	this._box2.set_disabled(val);

	var val = this._readOnly || this._disabled;
	if(CNFormManager.vista)
		this.element.className = val ? "cn_rangebox cn_rangebox_disabled" : "cn_rangebox";
	else
		this.element.style.backgroundColor =
			this._box1.element.style.borderColor = 
			this._box2.element.style.borderColor = 
				val ? Util.getStyle(this.element, "xl--disabled-background") : "";
}


// Event handlers. =========================
proto._box_onchange = function(ev)
{
	var jsObject = CNUtil.findJSObject(Util.eventTarget(ev).parentElement);
	// Grid support.
	if(jsObject) jsObject.box_onchange();
}
proto.box_onchange = function()
{
	this._isDirty = true;
}

proto._element_ondeactivate = function()
{
	this.element_ondeactivate();
}
proto.element_ondeactivate = function()
{
	if(this.element.contains(Event.current().relatedTarget)) return;
	this.isValid();
}

proto._element_onactivate = function()
{
	this.element_onactivate();
}
proto.element_onactivate = function()
{
	if(this.element.contains(Event.current().relatedTarget)) return;
	if(this.element.style.borderColor == "red") this.element.style.borderColor = "";
}

proto._element_onfocusout = function()
{
	this.element_onfocusout();
}
proto.element_onfocusout = function()
{
	if(this.element.disabled) return;
	if(this.element.contains(Event.current().relatedTarget)) return;
	if(this.onfocusout) this.onfocusout();
}

proto.set_tabIndex = function(ti)
{
	this._box1.element.tabIndex = ti;
	this._box2.element.tabIndex = ti;
}


// Grid support. =======================================
var RangeBoxCell = CN_grid.CellTypes["RangeBox"] = function(colTag, grid)
{
	var node = colTag.node.cloneNode(true);
	node.setAttribute("type", node.getAttribute("boxType"));
	this.box = RangeBoxCell._createBox(node);
	grid._jsObjects.push(this.box);
}
RangeBoxCell.cn_tagName = "rangebox";
RangeBoxCell._createBox = function(node)
{
	var box = new CN_rangebox();
	var l = box.createElement(node);
	l.style.position = "absolute";
	
	EditorBoxManager.attachBoxEvents(l);
	return l;
}
var wp = RangeBoxCell.prototype;
// Used by BoxManager.
wp.getCellValue = StringTypeCell.prototype.getCellValue;
// Used by commitChange.
wp.setCellValue = StringTypeCell.prototype.setCellValue;
// Used by Grid.
wp.isValid = function(cell)
{ 
	// Assume, server always sends correct data and BoxManager disallows invalid data.
	return true;
}
// Used by BoxManager.
wp.validateValue = function(value, cell)
{
	// NOTE: Value and cell is not used -> box content is checked. Actually, BoxManager
	// always checks box value.
	return this.box.jsObject.isValid();
}
// Used by BoxManager.
wp.commitChange = function(value, cell, row, colTag)
{
	if(cell.textContent != value)
	{
		if(value.replace(/\s+/g, "") == "///") cell.textContent = " ";
		else cell.textContent = value;
		
		var grid = CNUtil.findJSObject(cell);
		grid.setChangedValue(row, cell, value);
		grid.fireChangedEvent(row, cell, value);
		if(cell.colTag.autoPostBack) grid.postBack(row, cell, value);
	}
}
wp.prerender = function(cell, colTag)
{
	EditorBoxManager.attachCellEvents(cell);
}
wp.render = StringTypeCell.prototype.render;
