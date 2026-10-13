/*
	# 1036-3 - fine grained tab handling for grid - proxyTabKeyDown
	v. 2.0.3
	+ autopostback fine tuned.
*/
function CN_partialdatebox()
{
	this._isDirty = false;
	this._readOnly = false;
	this._disabled = false;
	this.validationString = "Invalid Date";
	
	// Grid support.
	this.directlyAssignEvents = true;
	this.doNotCheckValidChars = true;

	this.supportsRequired = true;
	this._minValue = null;
	this._maxValue = null;
	this._autoPostBack = false;	

	this._inGrid = false;
}

var proto = CN_partialdatebox.prototype; 

// Events. =========================
proto.onbeforedeactivate = function(){}
proto.onkeypress = function(){}


// Public methods. ================================
proto.createElement = function(node, parentElement)
{
	var l = document.createElement("span");
	// Grid support.
	if(parentElement) parentElement.appendChild(l);

	this.element = l;
	l.jsObject = this;
	
	l.className = "cn_partialdatebox";
	
	var dayBox = document.createElement("<input type=text maxlength=2 style='width: 15px; padding-left: 1px; '>");
	l.appendChild(dayBox);
	l.appendChild(document.createTextNode("/"));
	
	var monthBox = document.createElement("<input type=text maxlength=2 style='width: 14px; '>");
	l.appendChild(monthBox);
	l.appendChild(document.createTextNode("/"));

	var yearBox = document.createElement("<input type=text maxlength=4 style='width: 28px; '>");
	l.appendChild(yearBox);
		
	dayBox._maxValue = 31;
	monthBox._maxValue = 12;

	dayBox.attachEvent("onkeypress", this._box_onkeypress);
	monthBox.attachEvent("onkeypress", this._box_onkeypress);
	yearBox.attachEvent("onkeypress", this._box_onkeypress);

	dayBox.attachEvent("onkeyup", this._box_onkeyup);
	monthBox.attachEvent("onkeyup", this._box_onkeyup);
	yearBox.attachEvent("onkeyup", this._box_onkeyup);

	dayBox.attachEvent("onkeydown", this._box_onkeyup);
	monthBox.attachEvent("onkeydown", this._box_onkeyup);
	yearBox.attachEvent("onkeydown", this._box_onkeyup);

	dayBox.attachEvent("onfocus", this._box_onfocus);
	monthBox.attachEvent("onfocus", this._box_onfocus);
	yearBox.attachEvent("onfocus", this._box_onfocus);
	
	dayBox.attachEvent("onchange", this._box_onchange);
	monthBox.attachEvent("onchange", this._box_onchange);
	yearBox.attachEvent("onchange", this._box_onchange);

	this.element.attachEvent("ondeactivate", this._element_ondeactivate);
	this.element.attachEvent("onactivate", this._element_onactivate);
	this.element.attachEvent("onbeforedeactivate", this._element_onbeforedeactivate);
	
	if(node)
	{
		var attr = node.getAttribute("validationString");
		if(attr) this.validationString = String(attr);

		var attr = node.getAttribute("autoPostBack");
		if(attr) this._autoPostBack = attr == "true";
	}

	if(CNFormManager.vista) VistaSupport.attachToJSCNBox(this);

	return l;
}

proto.loadData = function(node)
{
	_isDirty = false;
	if(this.element.runtimeStyle.borderColor == "red") this.element.runtimeStyle.borderColor = "";

	var boxes = this.element.all.tags("input");
	var dayAttr = node.getAttribute("day");
	if(dayAttr != null) boxes[0].value = String(dayAttr);
	var monthAttr = node.getAttribute("month");
	if(monthAttr != null) boxes[1].value = String(monthAttr);
	var yearAttr = node.getAttribute("year");
	if(yearAttr != null) boxes[2].value = String(yearAttr);
	
	attr = node.getAttribute("minvalue");
	if(attr) this._minValue = this._parseDate(String(attr));
	attr = node.getAttribute("maxvalue");
	if(attr) this._maxValue = this._parseDate(String(attr));
}

proto._parseDate = function(str)
{
	var ar = str.match(/^(\d{4})(\d{2})?(\d{2})?/);
	if(!ar) return null;
	ar.splice(0, 1);
	for(var i = 0; i < ar.lenght; i++) ar[i] = parseInt(ar[i], 10);
	return ar;
}

proto.storeData = function(xmldoc)
{
	if(!this._isDirty || !this.isValid()) return null;
	this._isDirty = false;

	var node = xmldoc.createElement("partialdatebox");

	var boxes = this.element.all.tags("input");
	if(!isNaN(parseInt(boxes[0].value, 10))) node.setAttribute("day", boxes[0].value);
	if(!isNaN(parseInt(boxes[1].value, 10))) node.setAttribute("month", boxes[1].value);
	if(!isNaN(parseInt(boxes[2].value, 10))) node.setAttribute("year", boxes[2].value);

	return node;
}

proto.isValid = function()
{
	if(this._disabled) return true;
	
	var values = this.get_values();
	var valid = true;
	
	var day = parseInt(values[0], 10);
	var month = parseInt(values[1], 10);
	var year = parseInt(values[2], 10);

	if(isNaN(day) && isNaN(month) && isNaN(year)) valid = true;
	else if(!isNaN(day) && (day < 1 || day > 31)
	|| !isNaN(month) && (month < 1 || month > 12)
	|| !isNaN(year) && (values[2].length < 4 || year < 1800)) 
	{
		valid = false;
	}
	else if(!isNaN(day))
	{
		if(isNaN(month) || isNaN(year)) valid = false;
		else if(values[2].length < 4) valid = false;
		else
		{
			var date = new Date(year, month - 1, day);
			valid = date.getMonth() == month - 1 && date.getDate() == day && date.getFullYear() == year;
		}
	}
	else if(isNaN(day) && isNaN(year)) valid = false;

	if(valid && this._maxValue)
	{
		if(this._maxValue[0] && !isNaN(year))
		{
			if(this._maxValue[0] < year) valid = false;
			else if(this._maxValue[0] == year && this._maxValue[1] && !isNaN(month))
			{
				if(this._maxValue[1] < month) valid = false;
				else if(this._maxValue[1] == month && this._maxValue[2] && !isNaN(day))
				{
					if(this._maxValue[2] < day) valid = false;
				}
			}
		}
	}

	if(valid && this._minValue)
	{
		if(this._minValue[0] && !isNaN(year))
		{
			if(this._minValue[0] > year) valid = false;
			else if(this._minValue[0] == year && this._minValue[1] && !isNaN(month))
			{
				if(this._minValue[1] > month) valid = false;
				else if(this._minValue[1] == month && this._minValue[2] && !isNaN(day))
				{
					if(this._minValue[2] > day) valid = false;
				}
			}
		}
	}

	if(valid) 
	{
		if(this.element.runtimeStyle.borderColor == "red") this.element.runtimeStyle.borderColor = "";
		return true;
	}
	this.element.runtimeStyle.borderColor = "red";
	return false;
}

// Private methods. =================================
proto._tryNextField = function(box)
{
	if(box.value.length == box.maxLength && !box.createTextRange().isEqual(document.selection.createRange()))
	{
		this._moveToNextField(box);
	} 
}

proto._moveToNextField = function(box)
{
	var boxes = this.element.all.tags("input");
	if(box == boxes[0]) boxes[1].focus();
	else if(box == boxes[1]) boxes[2].focus();
}

proto._moveToPreviousField = function(box)
{
	var boxes = this.element.all.tags("input");
	if(box == boxes[2]) boxes[1].focus();
	else if(box == boxes[1]) boxes[0].focus();
}

proto._checkLeftRight = function(box, code)
{
	var selRange = document.selection.createRange();
	var range = box.createTextRange();
	if(code == 37) // Left
	{
		if(range.compareEndPoints("StartToStart", selRange) == 0) 
		{
			this._moveToPreviousField(box);		
			return true;
		}
	}
	else if(code == 39) // Right
	{
		if(range.compareEndPoints("EndToEnd", selRange) == 0) 
		{
			this._moveToNextField(box);
			return true;
		}
	}
	return false;
}

// Used by grid BoxManager.
proto.focus = function()
{
	var boxes = this.element.all.tags("input");	
	boxes[0].focus();
}

// Used by grid BoxManager.
proto.select = function(){}

// Used by grid BoxManager.
proto.blur = function()
{
	var boxes = this.element.all.tags("input");
	for(var i = 0; i < boxes; i++)
	{
		if(document.activeElement == boxes[i])
		{
			boxes[i].blur();
			break;
		}
	}
}


// Event handlers. ============================
proto._box_onkeypress = function()
{
	CNUtil.dispatchObject().box_onkeypress();
}
proto.box_onkeypress = function()
{
	if(this._disabled) return;
	var code = event.keyCode;
	var charx = String.fromCharCode(code);
	if((charx < "0" || charx > "9") && code != 13)
	{
		CNUtil.cancelEvent();
		return;
	}
}

proto._box_onkeyup = function()
{
	CNUtil.dispatchObject().box_onkeyup();
}
proto.box_onkeyup = function()
{
	if(this._disabled) return;
	var box = event.srcElement;
	
	var code = event.keyCode;

	if(event.type == "keydown")
	{
		if(this._checkLeftRight(box, code)) return;
		var value = parseInt(box.value, 10);
		if(!isNaN(value))
		{
			if(code == 38 && (!box._maxValue || value < box._maxValue)) // Up.
			{
				box.value = value + 1;
				this._isDirty = true;
			}
			else if(code == 40 && value > 1) // Down.
			{
				box.value = value - 1;
				this._isDirty = true;				
			}
		}
		
		if(code == 9 && this._inGrid) {
			//	else if(box == boxes[1]) boxes[2].focus();		
			var boxes = this.element.all.tags("input");
			if(box == boxes[2]) {
				CN_grid.proxyTabKeyDown();
				return;
			}
		}
	}

	var charx = String.fromCharCode(code);
	if(code == 46) return;
	if((charx < "0" || charx > "9") && (code < 96 || code > 105) || code == 13) 
	{
		var newVal = box.value.replace(/\D/g, '');
		if(newVal != box.value)
		{
			box.value = newVal;
			this._isDirty = true;
		}
		return;
	} 

	if(event.type == "keydown") this._tryNextField(box);
}

proto._box_onfocus = function()
{
	var box = event.srcElement;
	box.select();
}

proto._element_ondeactivate = function()
{
	CNUtil.dispatchObject().element_ondeactivate();
}
proto.element_ondeactivate = function()
{
	if(this.element.contains(event.toElement)) return;
	if(this._isDirty && this.isValid() && this._autoPostBack) this.formManager.postData(this.element);
}

proto._element_onactivate = function()
{
	CNUtil.dispatchObject().element_onactivate();
}
proto.element_onactivate = function()
{
	if(this.element.contains(event.fromElement)) return;
	if(this.element.runtimeStyle.borderColor == "red") this.element.runtimeStyle.borderColor = "";
}

proto._box_onchange = function()
{
	var jsObject = CNUtil.dispatchObject();
	// Grid support.
	if(jsObject) jsObject.box_onchange();
}
proto.box_onchange = function()
{
	this._isDirty = true;
}

proto._element_onbeforedeactivate = function()
{
	var jso = CNUtil.dispatchObject()
	if(jso && jso.element_onbeforedeactivate) jso.element_onbeforedeactivate();
}
proto.element_onbeforedeactivate = function()
{
	if(this._disabled) return;
	if(this.element.contains(event.toElement)) return;
	if(this.onbeforedeactivate) this.onbeforedeactivate();
}


// Properties. =====================
proto.get_values = function()
{
	var values = [];
	var boxes = this.element.all.tags("input");
	for(var i = 0; i < boxes.length; i++) values.push(boxes[i].value);
	return values;
}

// Used by grid BoxManager.
proto.get_value = function()
{
	var boxes = this.element.all.tags("input");	
	var value = "";
	if(!isNaN(parseInt(boxes[0].value, 10))) value += boxes[0].value;
	value += "/";
	if(!isNaN(parseInt(boxes[1].value, 10))) value += boxes[1].value;
	value += "/";
	if(!isNaN(parseInt(boxes[2].value, 10))) value += boxes[2].value;
	if(value == "//") return "";
	return value;
}

// Used by grid BoxManager.
proto.set_value = function(val)
{
	var boxes = this.element.all.tags("input");	
	var values = val.split("/");
	for(var i = 0; i < values.length && i < 3; i++) boxes[i].value = values[i]; 
	for(var i = values.length; i < 3; i++) boxes[i].value = ""; 
}

// Used by grid BoxManager.
proto.set_readOnly = function(value)
{
	this._readOnly = value;
	this._set_disabled();
}

// Used by grid BoxManager.
proto.get_readOnly = function()
{
	return this._readOnly;
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
	val = this._readOnly || this._disabled;
	var boxes = this.element.all.tags("input");	
	if(CNFormManager.vista) 
	{
		this.element.className = val ? "cn_partialdatebox cn_partialdatebox_disabled" : "cn_partialdatebox";
		for(var i = 0; i < 3; i++) 
		{
			boxes[i].readOnly = val;
		}
	}
	else 
	{
		this.element.runtimeStyle.backgroundColor = val ? this.element.currentStyle["xl--disabled-background"] : "";
		for(var i = 0; i < 3; i++) 
		{
			boxes[i].readOnly = val;
			boxes[i].runtimeStyle.backgroundColor =  val ? this.element.currentStyle["xl--disabled-background"] : "";
		}
	}
}
 
proto.set_tabIndex = function(ti)
{
	this._tabIndex = ti;
	this._set_tabIndex(ti);
}

proto._set_tabIndex = function(ti)
{
	var boxes = this.element.all.tags("input");	
	for(var i = 0; i < 3; i++) 
	{
		boxes[i].tabIndex = ti;
	}
}

// Grid support. =======================================
var PartialDateBoxCell = CN_grid.CellTypes["PartialDateBox"] = function(colTag, grid)
{
	this.box = PartialDateBoxCell._createBox();
	grid._jsObjects.push(this.box.jsObject);
}
PartialDateBoxCell.cn_tagName = "partialdatebox";
PartialDateBoxCell._createBox = function()
{
	var box = new CN_partialdatebox();
	box._inGrid = true;
	var l = box.createElement();
	l.style.position = "absolute";
	
//	l.attachEvent("onkeydown", CN_grid.proxyTabKeyDown);

	EditorBoxManager.attachBoxEvents(l);
	return l;
}
var wp = PartialDateBoxCell.prototype;
// Used by BoxManager.
wp.getCellValue = StringTypeCell.prototype.getCellValue;
// Used by commitChange.
wp.setCellValue = StringTypeCell.prototype.setCellValue;
wp.render = StringTypeCell.prototype.render;
// Used by Grid.
wp.isValid = function(cell)
{ 
	// Called when data is submitted, for all cells.

	var value = this.getCellValue(cell);
	if(value == "" && !cell.colTag.canBeEmpty) return false; // #1076

	return this.box.jsObject.isValid();
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
	if(cell.firstChild.innerText != value)
	{
		if(value == "" || value.replace(/\s+/g, "") == "///") cell.firstChild.innerText = " ";
		else cell.firstChild.innerText = value;
		
		if(value != "")
		{		
			var ymd = value.split("/");
			if(ymd[2].length > 0) ymd[2] = CNUtil.padString(ymd[2], "0", 4);
			if(ymd[1].length > 0) ymd[1] = CNUtil.padString(ymd[1], "0", 2);
			if(ymd[0].length > 0) ymd[0] = CNUtil.padString(ymd[0], "0", 2);
			value = ymd[2] + ymd[1] + ymd[0];
		}
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
