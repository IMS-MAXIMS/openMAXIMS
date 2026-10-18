/*
	#1049 - new isValid for DateTimeBox cell.
	#1036-4 - ev.isDirty processed now by Combo/MutableCombo
	#1036-3 proxyTabKeyDown
	v. 2.0.19
	#1023 - added firstChild = span which holds text value for StringTypeCell and derived. This helps to avoid content from hidden box in the cell.
	+ to allow persistant focused cell, edit mode box is not removed, but hidden. Box removal from DOM causes focus to be moved
      to document.body on next rendering pass, which sometimes happens in 100-150ms or more 
      i.e. not resilient to setTimeouts focusing).
	+ enabled fixCombo back for readOnly grid state change.
	+ header height respected now.
	+ worker reactivated.
	+ vista support.
	+ added anchoring resize optimization - no visible extra columns resize.
	+ walkCells for readOnly (ComboBox/MutableCombobox set_readOnly)
	+ double focus to outer element on focus-out from grid.
	+ wraptext border fix.
	+ <c> readOnly.
	+ <col> data support.
	+ textcolor/backcolor for cells.
	+ ...
	+ searchable combo support.
	+ comment maxLength.

	TypeCell defenition/interface:
		var TYPE_NAME = CN_grid.CellTypes["GRID_TYPE_ID"] = function(colTag, grid);
		TYPE_NAME.cn_tagName = "TAG_NAME"; - Optional: if setChangedValue() used.
		var wp = TYPE_NAME.prototype;
		wp.isValid = function(cell); - Returns true|false, checked when grid is submitted, all cells called.
		wp.prerender = function(cell, colTag);
		wp.render = function(cell, node);
		wp.set_readOnly = function(cell, readOnly);
*/
function CN_grid()
{
   	this.formManager = null;
	this.captionAlign = "left";
	this.headerHeight = 24;
	this.alternateBackcolor = "";
	this.cssPath = "css";

	this.rowsPerFill = 100;
	this.fillTimeout = 10;
	this.continuousFillThreshold = 100;
	this.showTiming = false;
	this.alwaysScrollToSelected = true;
	this.storeScrollState = true;

	this._rowHeight = 23;
	this._gridLines = "both";

	this._selectedRow = -1;
	this._readOnly = false;

	this._selectorVisible = true;

	this.xml = null;
	this.templateRow = null;
	
	this.cellRenderers = [];
	this.colTags = null;
	
	this.filledRows = 0;
	this.startDataCell = 1;
	
	this.rowsNodes = null;
	
	this.selectedTR = null;
	this.isReady = false;
	
	this.cssRules = null;
	
	this.totalTime = 0;
	this.prebuildTime = 0;
	this.fillTime = 0;
	
	this.normHeaderRowTO = null;
	this._startRow = null;
	this._endRow = null;
	this.rowIndex = 0;
	
	this.doLoadStateAfterFill = true;
	this._pendingSelectedRow = null;
	
	this._postingCellXY = null;
	this._elementWidth = 0;

	// Tree.
	this.childType = null;
	
	this.folderTemplateRow = null;
	this._showPlus = true;
	this._showRootLines = true;
	this._showLines = true;
	this._selectExpands = true;

	this.lineImg_Width = 19;
	this.lineImg_Height = 21;

	this.tree_nodeTypes = [];
	this.tree_rootType = null;

	this.state_default = 0;
	this.state_selected = 1;
	this.state_expanded = 2;
	this.state_expandedSelected = 3;

	this.ix_lineSpan = 0;
	this.ix_plusMinusSpan = 1;
	this.ix_checkBoxSpan = 2;
	this.ix_iconImg = 3;
	this.ix_textSpan = 4;

	this.tree_selectedNodeDiv = null;
	
	this.tree_inited = false;
	
	this._jsObjects = [];
	
	this._currentSort_hcell = null;

//	this._skipNextFocus = false;
	this._tagPrefix = "grid";
	
	this._treeAutoPostBack = false;	
	
	this._allowClearSelection = false;
	this._resetScrollPosition = false;
	
	this._maxFooterHeight = Number.MAX_VALUE;
	
	this._requiresReadOnlyWalk = false;
	//this._unscrollableCols = 0;
	this._resizeCounter = 0;

	this._rowBorderOffset = 0;
	this._vista = CNFormManager.vista; // Speed up variable access.
	if(this._vista) this._rowBorderOffset = 1;
	
	this._headerLayedout = false;
	
	this._enableBlinkDivs = [];
	this._removeBlinkDivs = [];
}
CN_grid.SORT_NONE = 0;
CN_grid.SORT_AUTO = 1;
CN_grid.SORT_MANUAL = 2;

CN_grid.CellTypes = [];


// Standards-browser boundary for the historical grid control.
// The grid still exposes its old handler names, but all native registration,
// event lookup, element creation, and selection behavior pass through here.
CN_grid.currentEvent = function() {
	return (typeof Event != "undefined" && Event.current) ? Event.current() : null;
}
CN_grid.relatedTarget = function() {
	var ev = CN_grid.currentEvent();
	return ev ? (ev.relatedTarget || null) : null;
}
CN_grid.addEvent = function(element, eventName, handler, context) {
	if(!element || !handler) return null;
	if(eventName == "transitionend") return null;
	return Event.add(element, eventName, context || element, handler);
}
CN_grid.removeEvent = function(element, eventName, handler, context) {
	if(!element || !handler) return false;
	if(eventName == "transitionend") return false;
	return Event.del(element, eventName, context || element, handler);
}
CN_grid.descendants = function(root) {
	if(!root) return [];
	if(root.getElementsByTagName) return root.getElementsByTagName("*");
	return root.children || root.childNodes || [];
}
CN_grid.readClipboardText = function() {
	var ev = CN_grid.currentEvent();
	var clipboard = ev && ev.clipboardData;
	if(clipboard && clipboard.getData) return clipboard.getData("text/plain") || clipboard.getData("Text") || "";
	return "";
}
CN_grid.insertTextAtSelection = function(text) {
	if(typeof window == "undefined" || typeof window.getSelection != "function") return false;
	var selection = window.getSelection();
	if(!selection || selection.rangeCount == 0) return false;
	var range = selection.getRangeAt(0);
	range.deleteContents();
	var node = document.createTextNode(String(text));
	range.insertNode(node);
	range.setStartAfter(node);
	range.collapse(true);
	selection.removeAllRanges();
	selection.addRange(range);
	return true;
}
CN_grid.dispatchEvent = function(element, eventName) {
	if(!element || !element.dispatchEvent || typeof document == "undefined") return false;
	var ev = document.createEvent ? document.createEvent("Event") : null;
	if(!ev) return false;
	ev.initEvent(eventName, true, true);
	return element.dispatchEvent(ev);
}

CN_grid.fullRowSelect = false;
CN_grid._pendingCombo = null;
CN_grid._openPendingCombo = function()
{
	if(CN_grid._pendingCombo == null) return;

	CN_grid._pendingCombo.jsObject.element = CN_grid._pendingCombo.element;
	CN_combobox.pendingCombobox = CN_grid._pendingCombo.jsObject;
	var obj = CN_grid._pendingCombo.jsObject;
	var el = CN_grid._pendingCombo.element;
	setTimeout(function()
	{ 
		obj.element = el;
		obj._showPopup(); 
	}, 0);

	CN_grid._pendingCombo = null;
}


CN_grid.findTag = function(l, tag)
{
	while(l != null && l.tagName != tag) l = l.parentElement;
	return l;
}

CN_grid.findCell = function(cell)
{
	while(cell != null && !cell.isCell) cell = CN_grid.findTag(cell.parentElement, "SPAN");
	return cell;
}

CN_grid.cancelBackspace = function()
{
	if(Event.keyValue(CN_grid.currentEvent()) == 8) CNUtil.cancelEvent();
}

CN_grid.proxyTabKeyDown = function() {
	if(Event.keyValue(CN_grid.currentEvent()) == 9) { // TBD - do not leave box if it is invalid.
		var cell = CN_grid.findCell(Util.eventTarget()); // 1036-2 - js error.
		if(!cell) return;
		var typeObject = cell.colTag.typeObject;
		if(!typeObject.box || EditorBoxManager.canBlurBox(typeObject.box, typeObject)) {
			var gridEl = Util.findByClassName(Util.eventTarget(), "cn_grid");
			gridEl.jsObject.element_onkeydown();
		} else {
			Util.cancelEvent();
		}
	}	
}


var proto = CN_grid.prototype;

// Events. ===================================================================
proto.onchanged = function(ev)
{
}

proto.onpostback = function(ev)
{
	this._postingCellXY = {column: ev.cellIndex, row: ev.rowIndex};
	this.formManager.postData(this.element);
}

proto.onrowselected = function(ev)
{
	if(CN_grid.currentEvent() && (CN_grid.currentEvent().type == "mousedown" || CN_grid.currentEvent().type == "click")) 
	{
		this._selectionPostback = {button: CN_grid.currentEvent().button};
		this.formManager.postData(this.element);
	}
}

// IXMLDataAware. ============================================================
proto.loadData = function(node)
{
	if(CN_grid.fullRowSelect) this._hideHover();
	this._resizeColumns(); // Fast pass on just template/header.

	EditorBoxManager.activeBox = null;
	
	this._loadColumnsData(node);

	attr = node.getAttribute("treeAutoPostBack");
	if(attr) this._treeAutoPostBack = attr == "true";

	attr = node.getAttribute("readOnly");
	if(attr) this.set_readOnly(attr == "true");

	attr = node.getAttribute("allowClearSelection");
	if(attr) this._allowClearSelection = attr == "true";

	var attr = node.getAttribute("selectedRow");
	var ix = parseInt(attr, 10);
	
	this._resetScrollPosition = node.getAttribute("resetScrollPosition") == "true";
	if(this._resetScrollPosition) this.rowsDiv.scrollTop = 0;
	
	var rows = Util.xmlSelectSingleNode(node, "rows");
	if(rows) 
	{
		this.cleanTable();
		if(attr) this._pendingSelectedRow = ix;
		this.fillTable(rows);
	}
	else if(attr) this.set_selectedRow(ix);
	
	this._loadHeader(node);
	this._loadFooter(node);
	
	if(!CN_grid.fullRowSelect) {
		this._loadSelectorVisible(node);
	} 
}
proto._loadSelectorVisible = function(node) {
	var attr = node.getAttribute("selectorVisible");
	if(attr == null) return;
	
	attr = attr == "true";
	if(attr != this._selectorVisible) {
		this._selectorVisible = attr;

		this.headerRow.children[0].style.display = this.templateRow.children[0].style.display = 
			this.folderTemplateRow.children[0].style.display = this._selectorVisible ? "block" : "none";

		this._walkRows(this.rowsDiv, "_setRowSelectorVisible");
		this._resizeColumns();
	}
}
proto._setRowSelectorVisible = function(row) {
	row.children[0].style.display = this._selectorVisible ? "inline" : "none";
}

proto.storeData = function(xmldoc)
{
	EditorBoxManager.endActiveEdit();

	this.saveState();

	var gridData = null;
	var selectionData = null;
	
	var nodes = Util.xmlSelectNodes(this.changedFragment, "*")
	if(nodes.length > 0)
	{
		gridData = this.changedFragment.cloneNode(true);
		
		if(this._postingCellXY)
		{
			// Now, get posting cell and move it to end.
			var query = '*[@row="' + this._postingCellXY.row + '" and @column="' + this._postingCellXY.column + '"]';
			var posterNode = Util.xmlSelectSingleNode(gridData, query);
		
			// Just append to end.
			if(gridData.lastChild != posterNode) gridData.appendChild(posterNode);
			this._postingCellXY = null;
		}
		
		// Make it clean.
		this.changedFragment = this.changedDoc.createDocumentFragment();
	}

	if(this._selectionPostback)
	{
		selectionData = xmldoc.createElement(this._tagPrefix + "selection")
		selectionData.setAttribute("selection", this._selectedRow);
		if(this._selectionPostback.button) selectionData.setAttribute("button", this._selectionPostback.button);
		this._filterSelectionData(selectionData);
		this._selectionPostback = null;
	}

	var fragment = xmldoc.createDocumentFragment();
	if(gridData) fragment.appendChild(gridData);
	if(selectionData) fragment.appendChild(selectionData);

	return fragment;
}

// Required by dg2.
proto._filterSelectionData = function(selectionData)
{
}

proto.createElement = function(node, parentElement)
{
	this.totalTime = new Date().getTime();

	// A grid is always a child of a form/container element. Do not silently
	// create a detached grid: that would hide a broken form lifecycle and
	// produce later layout failures. Report the control and form context.
	if(!parentElement)
	{
		var controlID = node && node.getAttribute ? node.getAttribute("id") : "";
		var controlTag = node && node.tagName ? node.tagName : "";
		var placeholderID = this.formManager && this.formManager._formPlaceholder ? this.formManager._formPlaceholder.id : "";
		throw new Error("CN_grid.createElement: missing parent for " + controlTag + "#" + controlID + " (form=" + placeholderID + ")");
	}
	
	var l = document.createElement("div");
	parentElement.appendChild(l);
	// Cross-reference.
	this.element = l;
	l.jsObject = this;

	l.className = "cn_grid";
	this._buildElement();
	
	CN_grid.addEvent(l, "focus", this._element_onfocus, this);
	
	CN_grid.addEvent(l, "keydown", this._element_onkeydown, this);
	//Event.add(l, "keyup", this, this._element_onkeyup);
	//Event.add(l, "keypress", this, this._element_onkeyup);
	
	// NOTE: width is needed before initialization.	
	var attr = node.getAttribute("width");
	if(attr) this._elementWidth = parseInt(attr, 10);
	
	attr = node.getAttribute("headerHeight");
	if(attr) this.headerHeight = parseInt(attr, 10);

	attr = node.getAttribute("captionAlign")
	if(attr) this.captionAlign = String(attr);
	
	//attr = node.getAttribute("alternateBackcolor");
	//if(attr && attr != "true" && attr != "false") this.alternateBackcolor = String(attr);
	
	attr = node.getAttribute("alwaysScrollToSelected");
	if(attr) this.alwaysScrollToSelected = attr == "true";
	
	if(CN_grid.fullRowSelect) this._selectorVisible = false;
	else {
		attr = node.getAttribute("selectorVisible");
		if(attr) this._selectorVisible = attr == "true";
	}

	attr = node.getAttribute("treeAutoPostBack");
	if(attr) this._treeAutoPostBack = attr == "true";

	this._init(node);
	
	attr = node.getAttribute("gridLines");
	if(attr) this.set_gridLines(String(attr));

	attr = node.getAttribute("rowHeight");
	if(attr) this.set_rowHeight(parseInt(attr, 10));

	if(node.getAttribute("alwaysShowVScroll") == "true") this.rowsDiv.style.overflowY = "scroll";
	
/*	if(CN_grid.fullRowSelect) {
		this._hover = VistaSupport.createHover('item-gradient-5a.gif', 30);
		this._hover.strokecolor = ThemeNonCSSStyles.hoverRect_strokeColor2;
	}*/
	
	return l;
}

proto.unload = function()
{
	this.saveState();
	
	if(this._workerTO)
	{
		clearTimeout(this._workerTO);
		this._workerTO = null;
	}
	
	if(CommentTypeCell.activePopup)
	{
		CommentTypeCell.activePopup.style.display = "none";
		CommentTypeCell.activePopup = null;
		CommentTypeCell._currentCell = null;
	}

	this._hideSorting();

	for(var i = 0; i < this.cellRenderers.length; i++)
	{
		var renderer = this.cellRenderers[i];
		if(renderer._grid) renderer._grid = null;
	}
	this.cellRenderers = null;
	this.selectedTR = null;

	EditorBoxManager.activeBox = null; // Can't unload one grid when another is active?

	CNFormManager.destroyJSObjects(this._jsObjects);
	this._jsObjects = null;
}


proto._loadFooter = function(node)
{
	var footerNode = Util.xmlSelectSingleNode(node, "footer");
	if(!footerNode) return;
	
	var footerDiv = this._getFooter();

	var text = this._filterHtml(Util.xmlText(footerNode));
	footerDiv.innerHTML = text;

	if(text == "")
	{
		this.footerTR.style.display = "none";
	}
	else
	{
		this.footerTR.style.display = "block";
	}

	var attr = footerNode.getAttribute("maxHeight");
	if(attr) 
	{
		this._maxFooterHeight = parseInt(attr, 10);
		if(this._maxFooterHeight == -1) this._maxFooterHeight = Number.MAX_VALUE;
	}
	this.footerTR.firstElementChild.style.height = Math.min(this._maxFooterHeight, footerDiv.scrollHeight + 1);
}
proto._getFooter = function()
{
	var div = this.footerTR.firstElementChild.firstElementChild;
	return div;
}
proto._loadHeader = function(node) {
	var headerNode = Util.xmlSelectSingleNode(node, "header");
	if(!headerNode) return;

	var div = this._headerTR.firstElementChild.firstElementChild;
	var text = this._filterHtml(Util.xmlText(headerNode));
	div.innerHTML = text;

	this._headerTR.style.display = text == "" ? "none" : "block";
	var attr = headerNode.getAttribute("maxHeight");
	if(attr) {
		this._maxFooterHeight = parseInt(attr, 10);
		if(this._maxFooterHeight == -1) this._maxFooterHeight = Number.MAX_VALUE;
	}
	this._headerTR.firstElementChild.style.height = Math.min(this._maxFooterHeight, div.scrollHeight + 1);
}
proto._filterHtml = function(text) {
	return String(text).replace(/<hr.*?>/ig, '<div class="hr"></div>'); // Normalize legacy paragraph/hr markup before inserting into the grid.
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


proto._element_onfocus = function()
{
	CNUtil.dispatchObject().element_onfocus();
}
proto.element_onfocus = function()
{
//	CNFormManager._trace("grid.element_onfocus"); 
/*	if(this._skipNextFocus)  // # 1036-3
	{
		CNFormManager._trace("_skipNextFocus");
		CNUtil.cancelEvent();
		this.element.blur();
		this._skipNextFocus = false;
		return;
	}*/
	if(this.rowsDiv.children.length > 4) 
	{
		//CNFormManager._trace("seeking next cell");
		var firstRow = this._findChildByClassName(this.rowsDiv, "rowDiv");
		if(firstRow && firstRow.children && firstRow.children.length > 1)
		{
			var firstCell = firstRow.children[1];
			if(firstCell)
			{
				if(this._isFocusableCell(firstCell)) 
				{
					CNUtil.cancelEvent();
					this._focusCell(firstCell);
				}
				else
				{
					var nextCell = this._findNextFocusableCell(firstCell);
					if(nextCell) 
					{
						this._focusCell(nextCell);
					}
				}
			}
		}
	}
}

proto._findChildByClassName = function(p, className)
{
	var c = p.firstChild;
	while(c)
	{
		if(c.className == className) return c;
		c = c.nextSibling;
	}
	return null;
}

//proto._element_onkeyup = function()
//{
//	if(Event.keyValue(CN_grid.currentEvent()) == 9) CNUtil.cancelEvent();
//}

proto._element_onkeydown = function()
{
	//CNFormManager._trace("grid._element_onkeydown");
	var jsObject = CNUtil.dispatchObject();
	if(jsObject.constructor != CN_grid) return;
	jsObject.element_onkeydown();
}
proto.element_onkeydown = function()
{
	if(Event.keyValue(CN_grid.currentEvent()) == 9) // Tab.
	{
		this.processTab();
	}
}
proto.processTab = function() {
	CNFormManager._trace("grid.processTab");
	var cell = CN_grid.findCell(Util.eventTarget());
	if(!cell) 
	{
		//this._skipNextFocus = true;
		return;
	}
	CNUtil.cancelEvent();

	var backward = CN_grid.currentEvent().shiftKey;
	var nextCell = backward ? this._findPrevFocusableCell(cell) : this._findNextFocusableCell(cell);
	if(!nextCell) 
	{
		EditorBoxManager.endActiveEdit();
		// Should focus next element with > tabIndex.
		
		/*var el = this._findNextTabbableElement(); // 1036-3
		if(el)
		{
			try
			{ 
				//Event.add(el, "focusout", this, CN_grid._interceptNextDeactivate);
				el.focus(); // Focus stealed.
				//setTimeout(function(){ el.focus(); }, 100);
			} 
			catch(e){}
		}*/

		this.formManager._focusFirstFocusableControl(this.element.tabIndex);
					
		return;
	}

	this._focusCell(nextCell);
}

proto._findNextTabbableElement = function()
{
//	CNFormManager._trace("_findNextTabbableElement")
	var ar = [];
	var all = CN_grid.descendants(this.formManager._formPlaceholder);
	var count = all.length;
	var ti = this.element.tabIndex;
	var lowestTabIndexEl = null;
	for(var i = 0; i < count; i++)
	{
		var l = all[i];
		if(l.jsObject // Only jsCN components.
		&& Util.getStyle(l, "visibility") != "hidden" 
		&& Util.getStyle(l, "display") != "none" 
		&& l.offsetWidth != 0
		&& !l.disabled
		&& !this.element.contains(l)
		&& !l.jsObject._disabled)
		{
			var lti = l.tabIndex;
			if(lti > ti) 
			{
				ar.push(l);
			}
			else if(lti != 0 && (lowestTabIndexEl == null || lowestTabIndexEl.tabIndex > lti))
			{
				lowestTabIndexEl = l;
			}
		}
	}
	if(ar.length > 0) 
	{
		ar.sort(function(a, b)
			{ 
				if(a.tabIndex < b.tabIndex) return -1; 
				if(a.tabIndex == b.tabIndex) return 0;
				return 1;
			}
		)
		return ar[0];
	}
	return lowestTabIndexEl; // Can be null.
}


CN_grid._interceptNextDeactivate = function()
{
	CNUtil.cancelEvent();
	CN_grid.removeEvent(Util.eventTarget(), "focusout", CN_grid._interceptNextDeactivate, null);
}

proto._focusCell = function(cell)
{
	EditorBoxManager.hideHover(); // #1036-3 - hide hover when tabbing to non-box managed cell (combo/mutalbe combo).
	var typeObject = cell.colTag.typeObject;
	if(typeObject.box)
	{
		var el = this.element;
		cell.tabIndex = el.tabIndex;
		EditorBoxManager.beginEdit(cell);
	}
	else
	{
		EditorBoxManager.endActiveEdit();
		CNUtil.cancelEvent();

		var to = cell.colTag.typeObject;
		if(to.focusCell) 
		{
			to.focusCell(cell);
		}
		else
		{
			cell.tabIndex = this.element.tabIndex;
			try
			{
				cell.focus(); // Not focusing after ti change.
				setTimeout(function(){ cell.focus(); }, 0);
			}
			catch(e){}
		}
	}
}

proto._getNextRow = function(row, subCall)
{
	if(subCall)
	{
		if(row.className == 'rowDiv') 
		{
			return row;
		}
		else if(row.isNodeContainer && row.children.length > 0)
		{
			return row.children[0];
		}
	}
	var nextRow = row.nextSibling;
	if(nextRow)
	{
		if(nextRow.isNodeContainer)
		{
			if(nextRow.children.length != 0) return nextRow.children[0];
		}
		else if(nextRow.className == 'rowDiv') 
		{
			return nextRow;
		}
	}
	var parent = row.parentElement;
	if(parent.isNodeContainer)
	{
		 while(parent && parent.nextSibling == null && parent.isNodeContainer) parent = parent.parentNode;
		 if(parent && parent.nextSibling) return this._getNextRow(parent.nextSibling, true);
	}
	return null;
}

proto._getPrevRow = function(row, subCall) {

	if(subCall)	{
		if(row.className == 'rowDiv') {
			return row;
		} else if(row.isNodeContainer && row.children.length > 0) {
			return row.lastChild;
		}
	}
	var prevRow = row.previousSibling;
	if(prevRow) {
		if(prevRow.isNodeContainer) {
			if(prevRow.children.length != 0) return nextRow.lastChild;
		} else if(prevRow.className == 'rowDiv') {
			return prevRow;
		}
	}
	var parent = row.parentElement;
	if(parent.isNodeContainer) {
		 while(parent && parent.previousSibling == null && parent.isNodeContainer) parent = parent.parentNode;
		 if(parent && parent.previousSibling) return this._getPrevRow(parent.previousSibling, true);
	}
	return null;
}

proto._findNextFocusableCell = function(cell)
{
	var nextCell = cell.nextSibling;
	if(!nextCell)
	{
		var nextRow = this._getNextRow(cell.parentElement);
		if(nextRow) 
		{
			nextCell = nextRow.children[0];
		}
		else 
		{
			return null;
		}
	}
	var finished = false;
	while(!finished)
	{
		if(this._isFocusableCell(nextCell)) 
		{
			return nextCell;
		}
		
		if(nextCell.nextSibling == null)
		{
			var nextRow = this._getNextRow(nextCell.parentElement);
			if(nextRow) 
			{
				nextCell = nextRow.children[0];
			}
			else 
			{
				finished = true;
			}
		}
		else nextCell = nextCell.nextSibling;
	}
	return null;
}

proto._findPrevFocusableCell = function(cell) {
	var prevCell = cell.previousSibling;
	if(!prevCell || Util.hasClass(prevCell, "selectionSpan")) {
		var prevRow = this._getPrevRow(cell.parentElement);
		if(prevRow) 
		{
			prevCell = prevRow.lastChild;
		}
		else 
		{
			return null;
		}
	}
	var finished = false;
	while(!finished)
	{
		if(this._isFocusableCell(prevCell)) {
			return prevCell;
		}
		
		if(prevCell.previousSibling == null || Util.hasClass(prevCell, "selectionSpan"))
		{
			var prevRow = this._getPrevRow(prevCell.parentElement);
			if(prevRow) 
			{
				prevCell = prevRow.lastChildl;
			}
			else 
			{
				finished = true;
			}
		}
		else prevCell = prevCell.previousSibling;
	}
	return null;
}

proto._isFocusableCell = function(cell)
{
	if(cell.offsetWidth > 0 && cell.colTag && !this.getCascadedReadOnly(cell))
	{
		var typeObject = cell.colTag.typeObject;
		if(typeObject.box) 
		{
			return true;
		}
		else if(typeObject.isFocusable) 
		{
			return true;
		}
	}
	return false;
}

proto._buildElement = function()
{
	/*
		NOTE: 
			- rowDiv should be the first child of rowsDiv.
			- update startRowIndex if number of rowsDiv child is changed.
			- comments are also counted!
	*/
	this.element.innerHTML = '\
		<table width=100% height=100% border=0 cellpadding=0 cellspacing=0>\
		<col width=100%>\
		<tr><td id=headerTD>\
		<div id=headerRow></div>\
		</td></tr>\
		<tr style="display: none; "><td><div class="gridHeaderDiv"></div></td></tr>\
		<tr><td height=100%>\
			<div id=rowsDiv>\
		\
			<div class=rowDiv></div>\
		\
			<div id=leftBorder></div><div id=topBorder></div>\
			<div id=bottomBorder></div>\
			<div id=rightBorder></div>\
		\
			</div>\
		</td></tr>\
		<tr id=footerTR style="display: none; "><td><div class="gridFooterDiv"></div></td></tr>\
		</table>';
		
	var all = CN_grid.descendants(this.element);
	//this.disabler = all["disabler"];
	this.headerTD = Util.findById(this.element, "headerTD");
	this.headerRow = Util.findById(this.element, "headerRow");
	this.rowsDiv = Util.findById(this.element, "rowsDiv");
	this.leftBorder = Util.findById(this.element, "leftBorder");
	this.rightBorder = Util.findById(this.element, "rightBorder");
	this.topBorder = Util.findById(this.element, "topBorder");
	this.bottomBorder = Util.findById(this.element, "bottomBorder");
	this.footerTR = Util.findById(this.element, "footerTR");
	// Standards DOM preserves the whitespace around the template table as text
	// nodes.  Do not assume firstChild is the table (that was only reliable in
	// the old IE HTML parser).
	var gridTable = this.element.firstElementChild;
	this._headerTR = gridTable.rows[1];

	this.disabler = Util.createElementFromHTML('<div style="position: absolute; background: white; z-index: 1000; opacity: 0.5; width: 100%; height: 100%; visibility: hidden; top: 0; left: 0; ">');
	//this.element.appendChild(this.disabler);
	
	var obj = this;
}

proto._init = function(node)
{
	if(!top.__ontopZ) top.__ontopZ = 10000;
	this.xml = node;
	
	this.templateRow = this.rowsDiv.children[0];
	
	this.folderTemplateRow = this.templateRow.cloneNode(true);

	if(this.cssPath.length > 0 && !this.cssPath.match(/\\|\/$/)) this.cssPath = this.cssPath + "/";

	//this.preloadImages();
	//this.prebuildPopup();
	
	this.initChangedDOM();

	//this._processUnscrollable(node);
	this.prebuildTable(node);
	
	// Header auto-scroll.
	CN_grid.addEvent(this.rowsDiv, "scroll", this._rowsDiv_onscroll, this);
	//Event.add(this.rowsDiv, "resize", this, this._rowsDiv_onresize);
	CN_grid.addEvent(this.element, "resize", this._rowsDiv_onresize, this);
	
	if(CN_grid.fullRowSelect) {
		Event.add(this.rowsDiv, "click", this, this.rowsDiv_click)
		Event.add(this.templateRow, "mouseenter", this, this.row_mouseenter);
		Event.add(this.templateRow, "mouseleave", this, this.row_mouseleave);
	}
	
	this.isReady = true;
	//this._set_readOnly();	
}
proto.rowsDiv_click = function(event) {
	if(this._allowClearSelection && Util.eventTarget() == this.rowsDiv)  {
		this.deselectRow(true);
	}
}
proto.row_mouseenter = function(event) {
	var row = Util.findByClassName(Util.eventTarget(), "rowDiv");
	if(row) {
		Util.addClass(row, "rowDivHover");
		this._hoveredRow = row;
	}
/*	row.appendChild(this._hover);
	this._hover.style.visibility = "inherit";
	this._hover.style.left = "1px";
	this._hover.style.width = row.offsetWidth - 3;
	this._hover.style.height = row.offsetHeight - 1;*/
}
proto.row_mouseleave = function(event) {
	var row = Util.findByClassName(Util.eventTarget(), "rowDiv");
	this._hideHover();
}
proto._hideHover = function() {
//	var parent = this._hover.parentNode;
//	if(parent) parent.removeChild(this._hover);
	if(!this._hoveredRow) return;
	Util.removeClass(this._hoveredRow, "rowDivHover");
	this._hoveredRow = null;
}

proto.preloadImages = function()
{
	var img1 = new Image();
	img1.src = CNFormManager.themeImagesPath + "selectedRow.gif";
}

proto.initChangedDOM = function()
{
	this.changedDoc = Util.createXMLDocument();
	this.changedFragment = this.changedDoc.createDocumentFragment();
}

proto.prebuildTable = function(node)
{
	this.prebuildTime = new Date().getTime();
		
	if(this.headerHeight > 0) this.headerTD.style.height = this.headerHeight;	
	else this.headerTD.style.display = "none";
	
	// Selection col.
	var cell = Util.createElementFromHTML("<span class=selectionSpan>");
	cell.title = '';	
	this.templateRow.appendChild(cell);
	
	CN_grid.addEvent(cell, "mousedown", this._selectioncell_onmousedown, this);
	
	if(CN_grid.fullRowSelect) {
		//Event.add(this.templateRow, "mousedown", this, this._row_onmousedown);
		Event.add(this.templateRow, "mousedown", this, this._row_onmousedown);
	}

	if(this._vista)
	{
		var img = VistaSupport.createImageButton("normalRow.gif", 16, 16);
		cell.appendChild(img);
	}
	else
	{
		var img = Util.createElementFromHTML("<img width=16 height=16>");
		cell.appendChild(img);
		img.src = CNFormManager.themeImagesPath + "normalRow.gif";
	}

	cell.style.width = 20;
	
	this.folderTemplateRow.appendChild(cell.cloneNode(true));
	
	cell = document.createElement("span");
	this.headerRow.appendChild(cell);
	
	cell.textContent = " ";
	cell.style.width = 20;

	//this._lastWidth = this._elementWidth - (this._selectorVisible ? 20 : 0);
	
	// Preset with real width to precalculate column widths.
	var offset = this._selectorVisible ? 20 : 0;
	var width = this.rowsDiv.clientWidth - offset;
	
	// Check if we have vertical scrollbars.
	var scrollBarsVisible = this.rowsDiv.offsetWidth != this.rowsDiv.clientWidth;
	if(!scrollBarsVisible) 
	{
		// Reserve width for scrollbars.
		width -= CNFormManager.scrollBarSize;
	}
	
	this._realWidth = width;
	this._lastWidth = width;
	this._oldRowsDivWidth = width;
	
	this._x = offset;
		
	var cols = Util.xmlSelectNodes(node, "col");
	
	var colsCount = cols.length;
	this.colTags = new Array(colsCount);
	for(var i = 0; i < colsCount; i++)
	{
		var colNode = cols[i];
		this._processColTag(node, colNode, i, colsCount);
	}
	
	Util.removeElement(this.templateRow);

	if(!this._selectorVisible)
	{
		this.headerRow.children[0].style.display = this.templateRow.children[0].style.display = 
		this.folderTemplateRow.children[0].style.display = "none";
	}

	this.prebuildTime = new Date().getTime() - this.prebuildTime;
}

proto._processColTag = function(node, colNode, i, colsCount)
{
	// Convert to bool. 
	// NOTE: all 3 props. default to false.
	var readOnly = colNode.getAttribute("readOnly") == "true";
	var autoPostBack = colNode.getAttribute("autoPostBack") == "true";
	var canBeEmpty = colNode.getAttribute("canBeEmpty") != "false";
	
	var align = this._getAttribute(colNode, "align");
	var verticalAlign = this._getAttribute(colNode, "verticalAlign");
	var width = this._getAttribute(colNode, "width");
	var captionAlign = this._getAttribute(colNode, "captionAlign");
	var validationString = this._getAttribute(colNode, "validationString");
	var fixedWidth = colNode.getAttribute("fixedWidth") == "true";
	
	var sort = CN_grid.SORT_NONE;
	var attr = colNode.getAttribute("sort");
	if(attr)
	{
		if(attr == "auto") sort = CN_grid.SORT_AUTO;
		else if(attr == "manual") sort = CN_grid.SORT_MANUAL
	}

	var col = {readOnly: readOnly, 
				autoPostBack: autoPostBack, 
				canBeEmpty: canBeEmpty, 
				align: align,
				verticalAlign: verticalAlign,
				width: width,
				name: this._getAttribute(colNode, "name"),
				type: this._getAttribute(colNode, "type"),
				fixedFont: this._getAttribute(colNode, "fixedFont") == "true",
				bold: colNode.getAttribute("bold") == "true",
				node: colNode,
				validationString: validationString,
				sort: sort,
				index: i,
				fixedWidth: fixedWidth
				};

	this.colTags[i] = col;
	
	var hcell = document.createElement("span");
	hcell.style.top = 0;
	if(this.headerHeight <= 24) hcell.style.whiteSpace = 'nowrap';

	this.headerRow.appendChild(hcell);
	
	var tooltip = colNode.getAttribute("tooltip");
	if(tooltip != null) Tooltip.attach(hcell, String(tooltip));

	var caption = this._getAttribute(colNode, "caption");
	//hcell.title = caption
	hcell.textContent = caption;

	var captionImage = this._getAttribute(colNode, "captionImage");
	if(captionImage)
		hcell.innerHTML = '<img style=\"width:24px;height:24px;vertical-align:middle\" src=' + captionImage + ' class=captionImage>' + caption;
	
	var cell = Util.createElementFromHTML("<span class=cellSpan isCell=true>");
	this.templateRow.appendChild(cell);
	
	if(this._realWidth < 1) this._realWidth = this._elementWidth;

	var colWidth = 0;
	var scaledColWidth = 0;
	if(width && width != "*" && width * 1 != -1)
	{
		var w = parseInt(width, 10);
		colWidth = /*col.cellWidth =*/ w;

		if(fixedWidth) scaledColWidth = colWidth;
		else 
		{
			var ratio = col.widthRatio = colWidth / this._elementWidth;
			scaledColWidth = ratio * this._realWidth; // Scale to final width.
		}
		cell.style.width = hcell.style.width = scaledColWidth + "px";
	}
	else if(i == colsCount - 1)
	{
		scaledColWidth = colWidth = Math.max(this._lastWidth, 16);
		hcell.style.width = cell.style.width = scaledColWidth + "px";
		col.widthRatio = -1;
	}
	else
	{
		colWidth = hcell.offsetWidth;
		if(fixedWidth) scaledColWidth = colWidth;
		else
		{
			var ratio = col.widthRatio = colWidth / this._elementWidth;
			scaledColWidth = ratio * this._realWidth; // Scale to final width.
		}
		cell.style.width = hcell.style.width = scaledColWidth + "px";
	}
	this._lastWidth -= scaledColWidth;

	hcell.style.left = this._x + "px";
	//this._x += colWidth;
	this._x += scaledColWidth;

	if(col.align) cell.style.textAlign = col.align;
	if(col.verticalAlign) cell.style.verticalAlign = col.verticalAlign;
	var isTreeCol = col.type == "TreeNode";
	if(!this.tree_inited && isTreeCol) this.tree_init(node);

	if(col.fixedFont) cell.style.fontFamily = "Courier New";
	if(col.bold) cell.style.fontWeight = "bold";

	var renderer = CN_grid.CellTypes[col.type];
	if(!renderer) { 
		renderer = UnknownTypeCell;
	}
	renderer = this.cellRenderers[this.cellRenderers.length] = new renderer(col, this);

	if(!this._requiresReadOnlyWalk && renderer.set_readOnly)
	{
		this._requiresReadOnlyWalk = true;
	}

	col.typeObject = renderer;
	renderer.prerender(cell, col);
	
	if(isTreeCol) this.folderTemplateRow.appendChild(cell.cloneNode(true));

	if(captionAlign) hcell.style.textAlign = captionAlign;
	else hcell.style.textAlign = this.captionAlign;
	
	if(this.headerHeight > 0)
	{
		hcell.style.marginTop = Math.max(0, (this.headerHeight - 15) / 2);
		//hcell.style.paddingTop = Math.max(0, (this.headerHeight - hcell.offsetHeight) / 2);
		//hcell.style.height = Math.max(1, this.headerHeight - 1);
	}
	
	if(sort == CN_grid.SORT_AUTO || sort == CN_grid.SORT_MANUAL)
	{
		hcell.colTag = col;
		
		CN_grid.addEvent(hcell, "mouseenter", this._hcell_onmouseenter, this);
		CN_grid.addEvent(hcell, "mouseleave", this._hcell_onmouseleave, this);
		CN_grid.addEvent(hcell, "click", this._hcell_onclick, this);
		hcell.style.cursor = "default";
		
		var sortArrow = Util.createElementFromHTML("<img width=7 height=7 class=gridSortArrow>");
		hcell.appendChild(sortArrow);
		sortArrow.src = this._vista ? 'themes/vista/g/sortundefined.gif' :
			CNFormManager.neutralImagesPath + "sortundefined.gif";
		//sortArrow.src = CNFormManager.neutralImagesPath + "sortdown.gif";
		//sortArrow.style.marginTop = (hcell.clientHeight - 13) / 2;
	}
}

proto._loadColumnsData = function(node)
{
	var colNodes = Util.xmlSelectNodes(node, 'col');
	var count = colNodes.length;
	for(var i = 0; i < count; i++)
	{
		var colNode = colNodes[i];
		var index = parseInt(colNode.getAttribute("index"), 10);
		var caption = String(colNode.getAttribute("caption"));
		var headerSpan = this.headerRow.children[index + 1];
		if(headerSpan)
		{
			var fc = headerSpan.firstChild;
			if(fc && fc.tagName != 'IMG') headerSpan.replaceChild(document.createTextNode(caption), fc);
			else headerSpan.textContent = caption;
			headerSpan.title = caption;
		}
	}
}

proto._hcell_onmouseenter = function()
{
	var l = Util.eventTarget();
	if(this._vista)
	{
		var span = Util.findTag(l, "SPAN");
		span.className = "headerSpan_hover"
	}
	else
	{
		l.style.textDecoration = "underline";
	}
}

proto._hcell_onmouseleave = function()
{
	var l = Util.eventTarget();
	if(this._vista)
	{
		var span = Util.findTag(l, "SPAN");
		span.className = ""
	}
	else
	{
		l.style.textDecoration = "";
	}
}

proto._hideSorting = function()
{
	if(!this._currentSort_hcell) return;
	//this._currentSort_hcell.children[0].style.visibility = "hidden";
	if (this._currentSort_hcell.children[0].className == "captionImage")
		this._currentSort_hcell.children[1].src = 
			this._vista ? 'themes/vista/g/sortundefined.gif' : CNFormManager.neutralImagesPath + "sortundefined.gif";
	else
		this._currentSort_hcell.children[0].src = 
			this._vista ? 'themes/vista/g/sortundefined.gif' : CNFormManager.neutralImagesPath + "sortundefined.gif";
	this._currentSort_hcell = null;
}

proto._hcell_onclick = function()
{
	CNUtil.dispatchObject().hcell_onclick();
}
proto.hcell_onclick = function()
{
	if(this.tree_inited) 
	{
		Util.assert("TreeGrid can't be sorted.")
		return;
	}

	var hcell = CNUtil.findTag(Util.eventTarget(), "SPAN");
	
	this._hideSorting();
	this._currentSort_hcell = hcell;

	if(hcell.colTag.sort == CN_grid.SORT_AUTO)
	{
		var src;
		if(!hcell.colTag.sortType || hcell.colTag.sortType != "DESC")
		{
			src = "sortdown.gif";
			hcell.colTag.sortType = "DESC";
		}
		else
		{
			src = "sortup.gif";
			hcell.colTag.sortType = "ACS";
		}
		if (hcell.children[0].className == "captionImage")
			hcell.children[1].src = (this._vista ? 
				CNFormManager.themeImagesPath : CNFormManager.neutralImagesPath) + src;
		else		
			hcell.children[0].src = (this._vista ? 
				CNFormManager.themeImagesPath : CNFormManager.neutralImagesPath) + src;
		//hcell.children[0].style.visibility = "inherit";
		
		this._sortGrid(hcell.colTag, hcell.colTag.sortType == "DESC");
	}
	else
	{
		var node = this.changedDoc.createElement(this._tagPrefix + "headerclick");
		node.setAttribute("column", hcell.colTag.index);
		this.changedFragment.appendChild(node);
		
		this.formManager.postData(this.element);
	}
}

proto._sortGrid = function(colTag, isDesc)
{
	var startRowIndex = this._getFirstRowIndex();

	var colIndex = colTag.index;
	var row = this.rowsDiv.children[startRowIndex];

	var rowCount = this.rowsDiv.children.length - startRowIndex;
	var rowAr = [];
	var cellIndex = this.startDataCell + colIndex;
	
	var i = 0;
	while(row && row.rowIndex !== undefined)
	{
		var cell = row.children[cellIndex];
		rowAr[i] = [String(cell.textContent).toLowerCase(), row, cell];
		row = row.nextSibling;
		i++;
	}

	var descSortFunction;
	var ascSortFunction;
	if(colTag.typeObject.descSortFunction) descSortFunction = colTag.typeObject.descSortFunction;
	else descSortFunction = this._descSortFunction;
	if(colTag.typeObject.ascSortFunction) ascSortFunction = colTag.typeObject.ascSortFunction;
	else ascSortFunction = this._ascSortFunction;

	rowAr.sort(isDesc ? descSortFunction : ascSortFunction);
	
	var prev, startIX;
	if(startRowIndex == 0)
	{
		if(rowAr.length > 0)
		{
			var row = rowAr[0][1];
			row.parentElement.appendChild(row);
			prev = row;
		}
		startIX = 1;
	}
	else
	{
		prev = this.rowsDiv.children[startRowIndex - 1];
		startIX = 0;
	}
	
	for(var j = startIX; j < rowAr.length; j++)
	{
		var row = rowAr[j][1];
		prev.parentNode.insertBefore(row, prev.nextSibling);
		prev = row;
	}
	this.reselectRow();
}

proto._ascSortFunction = function(a, b)
{
	if(a[0] < b[0]) return 1;
	if(a[0] == b[0]) return 0;
	return -1;
}

proto._descSortFunction = function(a, b)
{
	if(a[0] > b[0]) return 1;
	if(a[0] == b[0]) return 0;
	return -1;
}


proto._getAttribute = function(node, attrName)
{
	var attr = node.getAttribute(attrName);
	if(attr == null) return null;
	return String(attr);
}

proto.cleanTable = function()
{
	this._hideSorting();

	var rows = this.rowsDiv.children;
	var count = rows.length;
	for(var i = count - 1; i >= 0; i--)
	{
		var row = rows[i];
		if(row.rowIndex !== undefined || row.isNodeContainer)
		{
			Util.removeElement(row);
		}
	}
}

proto.fillTable = function(rowsTag)
{
	this.fillTime = new Date().getTime();

	this.rowsNodes = rowsTag.childNodes;
	this.rowIndex = 0;

	if(this.rowsNodes.length < this.continuousFillThreshold)
		this.rowsPerFill = this.continuousFillThreshold;
	// Raise rowsPerFill for extra large sets.
	if(this.rowsNodes.length > 1000) this.rowsPerFill = this.rowsPerFill * 3;
	
	this._startRow = 0;
	this._endRow = this.rowsPerFill;

	this.fillTableWorker();
}

proto.fillTableWorker = function()
{
	var rowsCount = Math.min(this.rowsNodes.length, this._endRow);
	for(var i = this._startRow; i < rowsCount; i++)
	{
		var row = this.rowsNodes[i];
		if(row.nodeType != 1) continue;
		
		this.appendAnyRow(row, this.rowsDiv, null, 0, i, this.tree_rootType);
	}
	this._startRow = this._endRow;
	this._endRow = this._startRow + this.rowsPerFill;

	var obj = this;
	if(this._startRow < this.rowsNodes.length) 
	{
		this._workerTO = setTimeout(function(){ obj.fillTableWorker(); }, this.fillTimeout);
	}
	// Give ie chance to draw rows.
	else 
	{
		 this._setFillTableFinishedTO(200);
	}
	
	CNFormManager.getBaseFormManager()._enableTextAndBackgroundBlink(this._enableBlinkDivs);		
	CNFormManager.getBaseFormManager()._removeBlink(this._removeBlinkDivs);
}

proto._setFillTableFinishedTO = function(time)
{
	var obj = this;
	this._workerTO = setTimeout(function(){ obj.fillTableFinished(); }, time);
}

proto.fillTableFinished = function()
{
	var time = new Date().getTime();
	this.totalTime = time - this.totalTime;
	this.fillTime = time - this.fillTime;

	// NOTE: should happen only one time after grid loading.
	if(this.doLoadStateAfterFill) 
	{
		doLoadStateAfterFill = false;
		this._setLoadStateTO();		
	}

	if(this._pendingSelectedRow !== null)
	{
		this.set_selectedRow(this._pendingSelectedRow);
		this._pendingSelectedRow = null;
	}

	if(this.showTiming) status = "Filled " + this.rowsNodes.length + " rows in " + this.fillTime + " ms, "
								  + "prebuilt in " + this.prebuildTime + " ms, "
								  + "built everything in " + this.totalTime + " ms.";
	this.isReady = true;	
	this._set_readOnly();	
	CN_grid._openPendingCombo();
}

proto._setLoadStateTO = function()
{
	var obj = this;
	setTimeout(function(){ obj.loadState(); }, 0);
}

proto.appendAnyRow = function(row, parent, parentRowIndex, tree_level, tree_index, tree_type)
{
	var childRows = Util.xmlSelectSingleNode(row, "childRows");
	if(childRows) this.appendFolderRow(row, childRows, parent, parentRowIndex, tree_level, tree_index, tree_type);
	else this.appendRow(row, parent, parentRowIndex, tree_level, tree_index, tree_type);
}

proto.appendRow = function(rowNode, parent, parentRowIndex, tree_level, tree_index, tree_type)
{
	var row = this.templateRow.cloneNode(true);
	parent.appendChild(row);
	
	this.setCommonRowProperties(row, rowNode, parentRowIndex);
	
	var cells = row.children;
	var cellNodes = rowNode.childNodes;
	var cellNodesCount = cellNodes.length;

	// Render cells.
	for(var i = 0, j = 0; i < cellNodesCount; i++)
	{
		var cellNode = cellNodes[i];
		if(cellNode.nodeType != 1) continue;
		var cell = cells[j + this.startDataCell];
		cell.cellIndex = j;
		var colTag = this.colTags[j];
		// !! Possible cross-ref.
		cell.colTag = colTag;
		// Set up common stuff.
		this._setTooltip(cellNode, cell);

		var attr = cellNode.getAttribute("backcolor");
		if(attr) cell.style.backgroundColor = String(attr);
		attr = cellNode.getAttribute("textcolor");
		if(attr) cell.style.color = String(attr);

		var readOnly = cellNode.getAttribute("readOnly") == "true";
		if(readOnly)
		{
			cell.readOnly = true;
			cell.className += " readOnly";
		}
		
		if(cellNode.getAttribute("empty") != "true")
		{
			this.cellRenderers[j].render(cell, cellNode, tree_level, tree_index, tree_type, readOnly);
		}
		else
		{
			cell._isEmpty = true;
			cell.style.visibility = "hidden";
		}
		j++;
	}
}

proto.appendFolderRow = function(rowNode, childRows, parent, parentRowIndex, tree_level, tree_index, tree_type)
{
	var cellNodes = rowNode.childNodes;
	var cellNodesCount = cellNodes.length;
	
	var row;
	if(cellNodesCount > 2) row = this.templateRow.cloneNode(true);
	else row = this.folderTemplateRow.cloneNode(true);
	parent.appendChild(row);
	
	this.setCommonRowProperties(row, rowNode, parentRowIndex);

	var cells = row.children;

	var childNodeType = tree_type;
	var childType = rowNode.getAttribute("childType");
	if(childType)
	{
		var type = this.tree_nodeTypes[String(childType)];
		// NOTE: completely new type, based on chilttype name.
		if(type) childNodeType = type;
	}

	//var chilsRows = Util.xmlSelectSingleNode(rowNode, "childRows");
	if(childRows != null) rowNode.setAttribute("expandable", "true");

	var expanded = false;
	
	// Render cells.
	for(var i = 0, j = 0; i < cellNodesCount; i++)
	{
		var cellNode = cellNodes[i];
		if(cellNode.nodeType != 1) continue;

		if(cellNode.tagName == "c")
		{
			var cell = cells[j + this.startDataCell];
			if(!cell) continue;
			
			cell.cellIndex = j;
			var colTag = this.colTags[j];

			// !! Possible cross-ref.
			cell.colTag = colTag;
			var attr = cellNode.getAttribute("backcolor");
			if(attr) cell.style.backgroundColor = String(attr);
			attr = cellNode.getAttribute("textcolor");
			if(attr) cell.style.color = String(attr);
			
			if(colTag.type == "TreeNode")
			{
				if(cellNode.parentNode.getAttribute("expanded") != "false") 
				{
					expanded = true;
					cellNode.parentNode.setAttribute("expanded", "true");
				}
			}
			
			this._setTooltip(cellNode, cell);
			//this.cellRenderers[j].render(cell, cellNode, tree_level, tree_index, tree_type);

			var readOnly = cell.readOnly = cellNode.getAttribute("readOnly") == "true";
			if(readOnly)
			{
				cell.className += " readOnly";
			}

			if(cellNode.getAttribute("empty") != "true")
			{
				this.cellRenderers[j].render(cell, cellNode, tree_level, tree_index, tree_type, readOnly);
			}
			else
			{
				cell._isEmpty = true;
				cell.style.visibility = "hidden";

			}
		}
		else if(cellNode.tagName == "childRows")
		{
			var containerDiv = document.createElement("div");
			parent.appendChild(containerDiv);
			
			containerDiv.style.display = expanded ? "block" : "none";
			containerDiv.isNodeContainer = true;
			containerDiv.nodesBuilt = true;

			var childRows = cellNode.childNodes;
			var childRowCount = childRows.length;
			for(var k = 0, n = 0; k < childRowCount; k++)
			{
				var childRow = childRows[k];
				if(cellNode.nodeType != 1 || childRow.tagName != "r") continue;
				
				this.appendAnyRow(childRow, containerDiv, row.rowIndex, tree_level + 1, n, tree_type);
				n++;
			}
		}
		j++;		
	}
}

proto._setTooltip = function(node, cell)
{
	var tooltip = node.getAttribute("tooltip");
	if(tooltip) Tooltip.attach(cell, String(tooltip));
}

proto.setCommonRowProperties = function(row, rowNode, parentRowIndex)
{
	row.rowIndex = this.rowIndex++;
	row.parentRowIndex = parentRowIndex;	

	var isSelectable = row.isSelectable = rowNode.getAttribute("selectable") != "false";
	if(!isSelectable)
	{
		var cell = row.children[0];
		var img = cell.children[0];
		cell.style.cursor = "default";
		CN_grid.removeEvent(cell, "mousedown", this._selectioncell_onmousedown, this);
		//img.src = CNFormManager.themeImagesPath + "non-selectableRow.gif";
		//img.width = img.height = 16;
		img.style.visibility = "hidden";
	}

	var backColor = rowNode.getAttribute("backcolor");
	if(backColor) row.style.backgroundColor = String(backColor);
	else if(this.alternateBackcolor && this.rowIndex % 2) row.style.backgroundColor = this.alternateBackcolor;

	var textColor = rowNode.getAttribute("textcolor");
	if(textColor) row.style.color = String(textColor);

	var readOnly = rowNode.getAttribute("readOnly") == "true";
	if(readOnly) row.readOnly = true;
	
	var bold = rowNode.getAttribute("bold") == "true";
	if(bold) row.style.fontWeight = "bold";

	// Bind node to row.
	row.xmlNode = rowNode;
}

proto._stateKey = function()
{
	return "cn_gridstate_" + String(this.element && this.element.id || "");
}
proto._readState = function()
{
	var key = this._stateKey();
	try
	{
		if(typeof sessionStorage != "undefined")
		{
			var raw = sessionStorage.getItem(key);
			return raw ? JSON.parse(raw) : null;
		}
	}
	catch(ignore) {}
	return CN_grid._memoryState ? CN_grid._memoryState[key] || null : null;
}
proto._writeState = function(state)
{
	var key = this._stateKey();
	try
	{
		if(typeof sessionStorage != "undefined")
		{
			sessionStorage.setItem(key, JSON.stringify(state));
			return;
		}
	}
	catch(ignore) {}
	if(!CN_grid._memoryState) CN_grid._memoryState = {};
	CN_grid._memoryState[key] = state;
}
proto.loadState = function()
{
	if(!this.element || !this.element.id || this._resetScrollPosition) return;
	var state = this._readState();
	if(!state) return;
	if(state.rowsDiv_scrollTop != null) this.rowsDiv.scrollTop = state.rowsDiv_scrollTop * 1;
	if(state.rowsDiv_scrollLeft != null) this.rowsDiv.scrollLeft = state.rowsDiv_scrollLeft * 1;
}

proto.saveState = function()
{
	if(!this.element || !this.element.id || !this.storeScrollState) return;
	this._writeState({
		rowsDiv_scrollTop: this.rowsDiv.scrollTop,
		rowsDiv_scrollLeft: this.rowsDiv.scrollLeft
	});
}

// Kept as a small compatibility-shaped accessor for callers from reconstructed
// extensions. It no longer exposes MSXML/userData; attributes are backed by a
// plain object and persisted by saveState().
proto.getStoredGridTag = function()
{
	var state = this._readState() || {};
	return {
		getAttribute: function(name) { return state[name] == null ? null : state[name]; },
		setAttribute: function(name, value) { state[name] = value; },
		removeAttribute: function(name) { delete state[name]; }
	};
}


proto.selectRow = function(l, doNotFireEvent)
{
	if(!l.isSelectable /*|| l == this.selectedTR*/) return;
	
	this.deselectRow();
	
	var img = l.children[0].children[0];
	if(this._allowClearSelection)
	{
		img._src = null; // Vista
		img.src = CNFormManager.themeImagesPath + "deselectRow.gif";
		img.title = 'Clear selection';	
	}
	else
	{
		img._src = null; // Vista
		img.src = CNFormManager.themeImagesPath + "selectedRow.gif";
		img.title = "";
	}

//	if(this._vista || CN_grid.fullRowSelect)
		Util.addClass(l, "selectedRow");

	this.rowBorder_select(l);

	this._selectedRow = l.rowIndex;
	this.selectedTR = l;

	if(this.tree_inited)
	{
		// NOTE: Assume TreeNode is first data column.
		this.tree_selectNodeDiv(l.children[1].children[0]);
	}
	
	if(this.isReady && !doNotFireEvent)
	{
		var ev = {};
		ev.selectedRow = this._selectedRow;
		ev.rowNode = l.xmlNode;
		this.onrowselected(ev);
	}
}

proto.deselectRow = function(generateEvent)
{
	if(this.selectedTR == null) return;
	var l = this.selectedTR;

	//if(this._vista || CN_grid.fullRowSelect) 

	var img = l.children[0].children[0];
	img._src = "normalRow.gif";
	img.src = CNFormManager.themeImagesPath + "normalRow.gif";
	img.title = '';
	this.rowBorder_deselect(l);
	this._selectedRow = -1;
	this.selectedTR = null;

	if(this.isReady && generateEvent)
	{
		var ev = {};
		ev.selectedRow = -1;
		this.onrowselected(ev);
	}
}

proto.reselectRow = function()
{
	if(this.selectedTR && this.selectedTR.parentElement) this.selectRow(this.selectedTR, true); 
}



// Event handlers. ==========================================================

proto._rowsDiv_onresize = function()
{
	CNUtil.findJSObject(Util.eventTarget()).rowsDiv_onresize();
}
proto.rowsDiv_onresize = function()
{
	if(this.element.clientWidth == 0) return;
	
	if(this._resizeTO) 
	{	
		clearTimeout(this._resizeTO);
		this._resizeTO = null;
	}

	var obj = this;
	this._resizeTO = setTimeout(function(){ obj._resizeColumns(); }, 55);
	
	var table = this.element.firstElementChild;
	table.width = this.element.clientWidth;
	table.height = this.element.clientHeight;

	this.rowsDiv_onscroll();
}

proto.layoutHeader = function()
{
	if(this._headerLayedout) return;
	
	var cells = this.headerRow.children;
	var length = cells.length;
	for(var i = 0; i < length; i++)
	{
		var hcell = cells[i];
		if(hcell.offsetHeight == 0) return;
		hcell.style.marginTop = Math.max(0, (this.headerHeight - hcell.offsetHeight) / 2);
	} 
	this._headerLayedout = true;
}

proto._resizeColumns = function()
{
	var start = new Date().getTime();
	if(!this.colTags) return;

	var offset = this._selectorVisible ? 20 : 0;
	
	if(this._disabled)
	{
		this.disabler.style.width = this.element.clientWidth;
	}

	this.layoutHeader();

	var width = this.rowsDiv.clientWidth - offset;
	var scrollBarsVisible = this.rowsDiv.offsetWidth != this.rowsDiv.clientWidth;
	if(!scrollBarsVisible) 
	{
		// Reserve width for scrollbars.
		width -= CNFormManager.scrollBarSize;
	}

	var lastColWidth = width;
	if(this._oldRowsDivWidth != width) 
	{
		this._resizeCounter++;
		this._oldRowsDivWidth = width;
		var x = offset;
		var length = this.colTags.length;
		var headerRowChildren = this.headerRow.children;
		var templateRowChildren = this.templateRow.children;
		var firstRowIndex = this._getFirstRowIndex();
		for(var i = 0; i < length; i++)
		{
			var widthRatio = this.colTags[i].widthRatio;
			var colWidth = 0;
			
			var hcell = headerRowChildren[this.startDataCell + i];
			if(!this.colTags[i].fixedWidth)
			{
				if(widthRatio != -1) colWidth = this.colTags[i].widthRatio * width;
				else 
				{
					colWidth = lastColWidth;
				}
				
				if(colWidth > 0) 
				{
					lastColWidth -= colWidth;
					hcell.style.width = colWidth;
					templateRowChildren[this.startDataCell + i].style.width = colWidth;

					if(i == 0 && this.tree_inited && this.folderTemplateRow.children.length > 1) 
					{
						this.folderTemplateRow.children[1].style.width = colWidth;
					}
					this._resizeRows(this.rowsDiv, colWidth, i, width, firstRowIndex)
				}
			}
			else
			{
				if(widthRatio != -1) colWidth = parseInt(this.colTags[i].width, 10);
				else colWidth = lastColWidth;
				
				
				lastColWidth -= colWidth;
			}
			hcell.style.left = x;
			x += colWidth;
		}
	}
	//this._walkCells(this._resizeCell);

	//status = "Resize in " + (new Date().getTime() - start) + "ms";
	//this.reselectRow();
	if(this.selectedTR) this.rowBorder_updateSize(this.selectedTR);
	//CN_grid._handle_onresize();	
}
/*proto._resizeCell = function(cell)
{
	cell.style.width = cell.colTag._colWidth;
}*/

// NOTE: overriden in dynamicgrid2.
proto._resizeRows = function(rowsDiv, colWidth, ix, rowsDivWidth, firstRowIndex)
{
	var startRowIndex = 0;
	if(!rowsDiv.isNodeContainer) startRowIndex = firstRowIndex;
	
	var children = rowsDiv.children;
	var length = children.length;
	for(var j = 0/*startRowIndex*/; j < length; j++)
	{
		var row = children[j];
		if(row.isNodeContainer)
		{
			this._resizeRows(row, colWidth, ix, rowsDivWidth, firstRowIndex);
		}
		else if(row.className == "rowDiv")
		{
			// Check cell, as we can get missing cell in treegrid.
			var cell = row.children[this.startDataCell + ix];
			if(cell) 
			{
				cell.style.width = colWidth;
			}
		}
	}
}

proto._getFirstRowIndex = function()
{
	var index = 0;
	var l = this.rowsDiv.firstElementChild;
	
	//If first row is selected class name will be "rowDiv selectedRow" not "rowDiv"
	if (l && l.className == "rowDiv selectedRow")
	{
		return index;
	}
	
	while(l && l.className != "rowDiv") 
	{
		l = l.nextSibling;
		index++;
	}

	return index;
}

proto._rowsDiv_onscroll = function()
{
	CNUtil.findJSObject(Util.eventTarget()).rowsDiv_onscroll();
}
proto.rowsDiv_onscroll = function()
{
	if(this.normHeaderRowTO) 
	{	
		clearTimeout(this.normHeaderRowTO);
		this.normHeaderRowTO = null;
	}
	// Give ie a chance to redraw content w/o flickering.
	var obj = this;
	this.normHeaderRowTO = setTimeout(function(){ obj.normHeaderRow(); }, 20);
}
proto.normHeaderRow = function()
{
	this.headerRow.style.right = this.rowsDiv.scrollLeft;
}

proto._selectioncell_onmousedown = function()
{
	//if(CN_grid.currentEvent().button != 1) return;
	CNUtil.findJSObject(Util.eventTarget()).selectioncell_onmousedown();
}
proto.selectioncell_onmousedown = function()
{
	if(this._disabled) return;
	var l = CN_grid.findTag(Util.eventTarget(), "DIV");

	if(l == this.selectedTR && this._allowClearSelection) 
	{
		if(CN_grid.currentEvent().button == 1) this.deselectRow(true);
		return;
	}

	this.selectRow(l);
}
proto._row_onmousedown = function(event) {
	if(this._disabled || !this._selectorVisible && !CN_grid.fullRowSelect) return;
	var selSpan = Util.findByClassName(Util.eventTarget(), "selectionSpan");
	if(selSpan) return;

	var l = Util.findByClassName(Util.eventTarget(), "rowDiv");

	if(l == this.selectedTR && this._allowClearSelection && this._readOnly) 
	{
		if(CN_grid.currentEvent().button == 1) this.deselectRow(true);
		return;
	}

	if(l != this.selectedTR) this.selectRow(l);
}


proto.isValid = function()
{
	if(this._disabled) return true;
	var rows = this.rowsDiv.children;	
	return this._checkIsValid(rows);
}

proto._checkIsValid = function(rows)
{
	var rowCount = rows.length;
	for(var i = 0; i < rowCount; i++)
	{
		var row = rows[i];
		if(row.isNodeContainer)
		{
			if(!this._checkIsValid(row.children)) return false;
		}
		else if(row.rowIndex === undefined) continue;
		else
		{
			var cells = row.children;
			var cellCount = cells.length;
			for(var j = this.startDataCell; j < cellCount; j++)
			{
				if(!this.isCellValid(cells[j])) 
				{
					this.validationString = cells[j].colTag.validationString;
					if(!this.validationString)
					{
						var renderer = CN_grid.CellTypes[cells[j].colTag.type];
						if(renderer)
						{
							this.validationString = renderer.defaultValidationString;
						}
					}
					if(!this.validationString) this.validationString = "Invalid cell value";

					return false;
				}
			}
		}
	}
	return true;
}

proto.isCellValid = function(cell)
{
	if(cell._isEmpty) return true;
	var cellType = this.cellRenderers[cell.cellIndex];
	if(!cellType) return true;

	var result = cellType.isValid(cell);
	return result;
}

// Util methods. ============================================================
proto.getCascadedReadOnly = function(l)
{
	if(this._readOnly || this._disabled) return true;

	var cell = CN_grid.findCell(l);
	if(!cell) return false;
	
	if(cell.readOnly) return true;
	
	if(!cell.colTag) alert("ASSERT: no colTag for " + cell.outerHTML);
	if(cell.colTag.readOnly) return true;

	var row = cell.parentElement;
	if(row.readOnly) return true;
	return false;
}

proto.setChangedValue = function(row, cell, value)
{
	var node = this._getChangedNode(row, cell);
	if(!node) return;
	
	if(value !== null) node.setAttribute("value", value);
}

proto._getChangedNode = function(row, cell)
{
	var colTag = cell.colTag;
	
	var colRenderer = CN_grid.CellTypes[colTag.type];
	if(!colRenderer) return null;
	var tagName = colRenderer.cn_tagName;
	if(!tagName) return null;
	
	var id = this.element.id;
	if(!id) return null;

	var rowIndex = row.rowIndex;
	var cellIndex = cell.cellIndex;
	var tableRowId = cell.tableRowId;
	var tableCellId = cell.tableCellId;
	
	// NOTE: id is set by FormManager.
	var elementName = this._tagPrefix + tagName;
	var query = elementName	+ '[@row="' + rowIndex + '" and @column="' + cellIndex + '"]';
	var node = Util.xmlSelectSingleNode(this.changedFragment, query);
	if(!node)
	{
		node = this.changedDoc.createElement(elementName);
		node.setAttribute("row", rowIndex);
		node.setAttribute("column", cellIndex);
		if(row.id) node.setAttribute("rowID", String(row.id).substr(3));
		if (tableRowId && tableCellId)
		{
			node.setAttribute("tableRowId", tableRowId);
			node.setAttribute("tableCellId", tableCellId);	
		}
		
		this.changedFragment.appendChild(node);
	}
	return node;
}

proto.getEvent = function(row, cell, value)
{
	var ev = {};
	ev.sender = this;
	ev.value = value;
	ev.cellIndex = cell.cellIndex;
	ev.rowIndex = row.rowIndex;
	ev.colName = cell.colTag.name;
	ev.rowID = String(row.xmlNode.getAttribute("id"));
	ev.tableRowId = cell.tableRowId;
	ev.tableCellId = cell.tableCellId;
	ev.cell = cell;
	return ev;
}

proto.fireChangedEvent = function(row, cell, value)
{
	this.onchanged(this.getEvent(row, cell, value));
}

proto.postBack = function(row, cell, value)
{
	var node = this._getChangedNode(row, cell);
	if(node)
	{
		// NOTE: move node to end of fragment, so it's assumed as postback element.
		this.changedFragment.appendChild(node);		
	}
	
	this.onpostback(this.getEvent(row, cell, value));
}

proto.rowBorder_select = function(row)
{
	var p = row.parentElement;
	
	if(p.offsetHeight == 0 || p.offsetWidth == 0) return;
	
	p.appendChild(this.leftBorder);
	p.appendChild(this.topBorder);
	p.appendChild(this.bottomBorder);
	p.appendChild(this.rightBorder);

	var x = row.offsetLeft;
	var y = row.offsetTop;

	this.leftBorder.style.left = x + this._rowBorderOffset;
	this.leftBorder.style.top = y + this._rowBorderOffset;
	this.leftBorder.style.height = row.offsetHeight - this._rowBorderOffset * 2;
	
	this.topBorder.style.left = x + this._rowBorderOffset * 2;
	this.topBorder.style.top = y;

	this.rightBorder.style.top = y + this._rowBorderOffset;
	this.rightBorder.style.height = row.offsetHeight - this._rowBorderOffset * 2;
	//this.rightBorder.style.left = row.offsetWidth - this.rightBorder.offsetWidth;
	
	this.bottomBorder.style.left = x + this._rowBorderOffset * 2;
	this.bottomBorder.style.top = y + row.offsetHeight - this.bottomBorder.offsetHeight;

	this.rightBorder.style.visibility = 
	this.topBorder.style.visibility =
	this.leftBorder.style.visibility = this.bottomBorder.style.visibility = "inherit";
	
	this.rightBorder.style.zIndex = 
	this.topBorder.style.zIndex =
	this.leftBorder.style.zIndex = this.bottomBorder.style.zIndex = top.__ontopZ++
	
	this.rowBorder_updateSize(row);
}

proto.rowBorder_updateSize = function(row)
{
	if(row.offsetWidth == 0) return;
	this.rightBorder.style.left = (row.offsetWidth - this.rightBorder.offsetWidth - this._rowBorderOffset) + "px";
	this.topBorder.style.width = this.bottomBorder.style.width = 
		(row.offsetWidth - this._rowBorderOffset * 4) + "px";
}

proto.rowBorder_deselect = function()
{
	// NOTE: rightBorder often inproperly positioned, so leave it.
	this.rightBorder.style.visibility =
	this.topBorder.style.visibility =
	this.leftBorder.style.visibility =
	this.bottomBorder.style.visibility = "hidden";
	
	// Move to top to avoid scrolling.
	this.topBorder.style.top = this.leftBorder.style.top = this.bottomBorder.style.top = 
		this.rightBorder.style.top = 0;
}


// Tree functions. =========================================================
proto.tree_init = function(node)
{
	if(this.tree_inited) return;
	this.tree_inited = true;

	this.tree_initializeNodeTypes(node);
	
	var rootType = {};
	if(this.childType) 
	{
		var type = this.tree_nodeTypes[childType];
		if(type) rootType = type;
	}
	this.tree_rootType = this.tree_getOverridenTypeObject(rootType, node);
}
	
proto.tree_initializeNodeTypes = function(node)
{
	var types = Util.xmlSelectNodes(node, "nodetype");
	var count = types.length;
	for(var i = 0; i < count; i++)
	{
		var typeNode = types[i];
		var typeObject = this.tree_getOverridenTypeObject({}, typeNode);
		this.tree_nodeTypes[String(typeNode.getAttribute("type"))] = typeObject;
	}
}

proto.tree_typeAttributes = ["checkBox", "imageUrl", "selectedImageUrl", "expandedImageUrl"];

proto.tree_cloneObject = function(matrix)
{
	var obj = {};
	for(var i in matrix) obj[i] = matrix[i];
	return obj;
}

proto.tree_getOverridenTypeObject = function(typeObj, l)
{
	var result = null;
	for(var i = 0; i < this.tree_typeAttributes.length; i++)
	{
		var attrName = this.tree_typeAttributes[i];
		var attr = null;
		if(l instanceof Object) attr = l[attrName];
		else attr = l.getAttribute(attrName);
		if(attr != null)
		{
			if(result == null) result = this.tree_cloneObject(typeObj);
			result[attrName] = String(attr);
		}
	}
	if(result == null) return typeObj;
	return result;
}

proto.tree_buildNodeTemplate = function(parentElement)
{
	var nodeDiv = Util.createElementFromHTML("<div class=tree_nodeDiv>");
	parentElement.appendChild(nodeDiv);
	
	nodeDiv.isNodeDiv = true;
	
	var lineSpan = Util.createElementFromHTML("<span class=tree_lineSpan>"); // 0 
	nodeDiv.appendChild(lineSpan);
	
	var pmSpan = Util.createElementFromHTML("<span class=tree_plusMinusSpan>") // 1 
	nodeDiv.appendChild(pmSpan);
	
	var checkBoxSpan = Util.createElementFromHTML("<span class=tree_checkBoxSpan>"); // 2 
	CN_grid.addEvent(checkBoxSpan, "click", this._tree_checkBoxSpan_onclick, this);
	CN_grid.addEvent(checkBoxSpan, "dblclick", this._tree_checkBoxSpan_onclick, this);	
	if(this._vista)
	{
		CN_grid.addEvent(checkBoxSpan, "mouseenter", this._tree_checkBoxSpan_onmouseenter, this);
		CN_grid.addEvent(checkBoxSpan, "mouseleave", this._tree_checkBoxSpan_onmouseleave, this);	
	}

	nodeDiv.appendChild(checkBoxSpan);

	var icon = Util.createElementFromHTML("<img width=16 height=16 align=absmiddle class='tree_iconImg'>"); // 3 
	CN_grid.addEvent(icon, "mousedown", this._tree_icon_textSpan_onclick, this);
	CN_grid.addEvent(icon, "dblclick", this._tree_icon_textSpan_ondblclick, this);
	nodeDiv.appendChild(icon);
	
	var text = Util.createElementFromHTML("<span class=tree_textSpan>"); // 4
	CN_grid.addEvent(text, "mousedown", this._tree_icon_textSpan_onclick, this);
	CN_grid.addEvent(text, "dblclick", this._tree_icon_textSpan_ondblclick, this);
	nodeDiv.appendChild(text);
	
	return nodeDiv;
}

proto.tree_isExpanded = function(n)
{
	return n && String(n.parentNode.getAttribute("expanded")) == "true";
}

proto.tree_buildLine = function(nodeDiv, node, lineSpan, level)
{
	if(node.parentNode.parentNode.tagName == "rows") return;

	var lineImg = Util.createElementFromHTML("<img align=absmiddle width=" + this.lineImg_Width + " height=" + this.lineImg_Height + ">");

	if(this._showLines)
	{
		var row = node.parentNode.parentNode.parentNode;
		while(row && (parseInt(row.getAttribute("nodeLevel")) != 0 || this._showRootLines))
		{
			var img = lineImg.cloneNode();
			lineSpan.insertBefore(img, lineSpan.firstChild);
			
			if(this.tree_isNode(row.nextSibling)) img.src = CNFormManager.themeImagesPath + "grid-i.gif";
			else img.src = CNFormManager.themeImagesPath + "white.gif";
			
			row = row.parentNode;
			if(row && row.tagName == "childRows") row = row.parentNode;
			if(row && row.tagName == "rows") break;
		}
	}
	else
	{
		lineSpan.insertBefore(lineImg, lineSpan.firstChild);
		lineImg.width = this.lineImg_Width * level;
		lineImg.src = CNFormManager.themeImagesPath + "white.gif";
	}
}

proto.tree_isNode = function(l)
{
	return l && (l.tagName == "r" || l.tagName == "childRows");
}

proto.tree_getNextSiblingNode = function(node)
{
	if(!node || !node.parentNode) return null;
	var nextSibling = node.parentNode.nextSibling
	return nextSibling;
}

proto.tree_previousSiblingNode = function(node)
{
	if(!node || !node.parentNode) return null;
	var prevSibling = node.parentNode.previousSibling
	return prevSibling;
}

proto.tree_getParentNode = function(node)
{
	if(!node || !node.parentNode) return null;
	return node.parentNode.parentNode;
}

proto.tree_buildPM = function(node, pmSpan, level)
{
	var pmImg = Util.createElementFromHTML("<img align=absmiddle width=" + this.lineImg_Width + " height=" + this.lineImg_Height + ">");
	pmSpan.appendChild(pmImg);

	var img = pmSpan.basePMImg = "";

	if(this._showPlus && (level > 0 || this._showRootLines == true))
	{
		if(this._showLines)
		{
			if(this.tree_isNode(this.tree_getNextSiblingNode(node))) 
			{
				if(!this.tree_isNode(this.tree_previousSiblingNode(node)) 
				&& !this.tree_isNode(this.tree_getParentNode(node))) img = "f";
				else img = "t";
			}
			else if(this.tree_isNode(this.tree_previousSiblingNode(node)) 
			|| this.tree_isNode(this.tree_getParentNode(node))) 
			{	
				img = "l";
			}
			else 
			{
				img = "r";
			}
			
			pmSpan.basePMImg = img;
		}

		if(node.parentNode.getAttribute("expandable") == "true")
		{
			if(this.tree_isExpanded(node)) img += "minus";
			else img += "plus";
			
			if(this._vista) img.height = 20;
			CN_grid.addEvent(pmSpan, "mousedown", this._tree_pmImg_onmousedown, this);
			CN_grid.addEvent(pmSpan, "dblclick", this._tree_pmImg_onmousedown, this);		
			if(this._vista)	CN_grid.addEvent(pmSpan, "mouseenter", this._tree_pmImg_onmouseenter, this);
		}
		else
		{
			img = "grid-" + img;		
		}

		if(img.length == 0) pmImg.style.display = "none";
		else pmImg.src = CNFormManager.themeImagesPath + img + ".gif";
	}
	else
	{
		pmImg.style.display = "none";
	}
}

proto._tree_pmImg_onmouseenter = function()
{
	var div = Util.findTag(Util.eventTarget(), "DIV");
	var jso = Util.findJSObject(div);
	
	var span = div.children[jso.ix_plusMinusSpan];
	var expanded = jso.tree_isExpanded(div.node);
	var hoverIMG = document.createElement("img");
	
	span.style.position = "relative";
	hoverIMG._hover = true;
	hoverIMG.src = expanded ? "themes/vista/g/hover-minus.gif" : "themes/vista/g/hover-plus.gif";
	hoverIMG.style.position = "absolute";
	hoverIMG.style.left = "5px";
	hoverIMG.style.top = "5px";
	span.appendChild(hoverIMG);
	CN_grid.addEvent(span, "mouseleave", jso._tree_pmImg_onmouseleave, jso);
}
proto._tree_pmImg_onmouseleave = function()
{
	var span = Util.eventTarget();
	var jso = Util.findJSObject(span);
	CN_grid.removeEvent(span, "mouseleave", jso._tree_pmImg_onmouseleave, jso);
	span.style.position = "static";
	if(span.lastChild && span.lastChild._hover) Util.removeElement(span.lastChild);
}

proto.tree_updateImageToState = function(nodeDiv, state)
{
	var icon = nodeDiv.children[this.ix_iconImg];
	var type = nodeDiv.type;
	var img;

	if(state == this.state_expandedSelected)
	{
		if(type.expandedImageUrl) img = type.expandedImageUrl;
		else if(type.selectedImageUrl) img = type.selectedImageUrl;
		if(!img) img = type.imageUrl;
	}
	else if(state == this.state_expanded)
	{
		img = type.expandedImageUrl;
		if(!img) img = type.imageUrl;
	}
	else if(state == this.state_selected)
	{
		if(!type.expandedImageUrl) img = type.selectedImageUrl;
		else img = type.imageUrl;
		if(!img) img = type.imageUrl;
	}
	else if(state == this.state_default) img = type.imageUrl;

	if(img) 
	{
		icon.src = img;
		icon.style.display = "inline";		
	}
	else icon.style.display = "none";
}

proto.tree_buildNode = function(nodeDiv, cell, node, level, index, nodeType)
{
	//if(node.parentNode.tagName != "r") alert("Assert for r tag.")

	node.parentNode.setAttribute("nodeIndex", index);
	nodeDiv.node = node; // Watch for circular refs!
	nodeDiv.nodeLevel = level;
	node.setAttribute("nodeLevel", level);

	var children = nodeDiv.children;

	var disabled = false;
	if(node.getAttribute("disable") == "true") disabled = nodeDiv.disabled = true; 
	
	var realType = nodeType;

	var rowNode = node.parentNode;
	var type = rowNode.getAttribute("type");
	if(type)
	{
		var type = this.tree_nodeTypes[String(type)];
		if(type) realType = this.tree_getOverridenTypeObject(realType, type);
	}
	realType = this.tree_getOverridenTypeObject(realType, rowNode);
	nodeDiv.type = realType;
	
	this.tree_buildLine(nodeDiv, node, children[this.ix_lineSpan], level);
	this.tree_buildPM(node, children[this.ix_plusMinusSpan], level);

	children[this.ix_textSpan].textContent = String(Util.xmlText(node));
	
	var expanded = this.tree_isExpanded(node);
	this.tree_updateImageToState(nodeDiv, expanded ? this.state_expanded : this.state_default);
	
	this.tree_buildNodeCheckbox(node, children, realType, disabled);

}

proto.tree_buildNodeCheckbox = function(node, children, realType, disabled)
{
	var checkBoxSpan = children[this.ix_checkBoxSpan];	
	
	var rowNode = node.parentNode;
	if(realType.checkBox == "true" && rowNode.getAttribute("checkBoxVisible") != "false") 
	{
		var checkedAttr = rowNode.getAttribute("checked");
		var checked = checkBoxSpan._checked = checkedAttr == "true";

		if(this._vista)
		{
			var img = document.createElement("img");
			checkBoxSpan.appendChild(img);
			this._set_checked(img, disabled, checked, false, false, false);
		}
		else
		{
			checkBoxSpan.innerHTML = checked ? "&#254;" : "&#111";
		}
		return true;
	}
	
	checkBoxSpan.style.display = "none";
	return false;
}

proto._set_checked = function(l, disabled, checked, hover, userAction, checkedChanged)
{
	var img;
	if(disabled)
		img = checked ? "checkedDisabledCheckbox.gif" : "uncheckedDisabledCheckbox.gif";
	else if(hover)
		img = checked ? "checkedHoverCheckbox.gif" : "uncheckedHoverCheckbox.gif";
	else
		img = checked ? "checkedCheckbox.gif" : "uncheckedCheckbox.gif";

	if(userAction || hover) 
	{
		VistaSupport.imageTrans(l, CNFormManager.themeImagesPath + img, checkedChanged);
	}
	else l.src = CNFormManager.themeImagesPath + img;
}


proto._tree_checkBoxSpan_onmouseenter = function()
{
	var l = Util.eventTarget();
	var jsObject = Util.findJSObject(l);

	if(!jsObject._vista || jsObject._readOnly || jsObject._disabled) return;

	var nodeDiv = CNUtil.findTag(l, "DIV");
	if(nodeDiv.node.getAttribute("disable") == "true") return;

	var checkBoxSpan = nodeDiv.children[jsObject.ix_checkBoxSpan];	
	var checked = checkBoxSpan._checked;
	jsObject._set_checked(l.firstChild, false, checked, true, true, true);	
}

proto._tree_checkBoxSpan_onmouseleave = function()
{
	var l = Util.eventTarget();
	var jsObject = Util.findJSObject(l);

	if(!jsObject._vista || jsObject._readOnly || jsObject._disabled) return;

	var nodeDiv = CNUtil.findTag(l, "DIV");
	if(nodeDiv.node.getAttribute("disable") == "true") return;
	var checkBoxSpan = nodeDiv.children[jsObject.ix_checkBoxSpan];	
	var checked = checkBoxSpan._checked;
	jsObject._set_checked(l.firstChild, false, checked, false, true, true);	
}

proto._tree_checkBoxSpan_onclick = function()
{
	CNUtil.dispatchObject().tree_checkBoxSpan_onclick();
}
proto.tree_checkBoxSpan_onclick = function()
{
	if(this._readOnly || this._disabled) return;

	var l = Util.eventTarget();
	var nodeDiv = CN_grid.findTag(l, "DIV");
	if(nodeDiv.node.getAttribute("disable") == "true") return;

	var row = CNUtil.findByClassName(nodeDiv, "rowDiv");
	if(row.readOnly) return;
	
	var checkBoxSpan = nodeDiv.children[this.ix_checkBoxSpan];	
	var checked = checkBoxSpan._checked = !checkBoxSpan._checked

	if(this._vista) this._set_checked(checkBoxSpan.firstChild, false, checked, true, true, true);	
	else checkBoxSpan.innerHTML = checked ? "&#254;" : "&#111";

	this.tree_storeChangedNode(row, row.rowIndex, "checked", checked);
}

proto._tree_icon_textSpan_onclick = function()
{
	CNUtil.findJSObject(Util.eventTarget()).tree_icon_textSpan_onclick();
}
proto._tree_icon_textSpan_ondblclick = function()
{
	CNUtil.findJSObject(Util.eventTarget()).tree_icon_textSpan_onclick();
}
proto.tree_icon_textSpan_onclick = function()
{
	var l = Util.eventTarget();
	var nodeDiv = CN_grid.findTag(l, "DIV");
	if(nodeDiv.node.getAttribute("disable") == "true") return;
	
	if(this._selectExpands) this.tree_toggleExpand(nodeDiv, true);
}

proto._tree_icon_textSpan_onmouseenter = function()
{
	CNUtil.findJSObject(Util.eventTarget()).tree_icon_textSpan_onmouseenter();
}
proto.tree_icon_textSpan_onmouseenter = function()
{
	var l = Util.eventTarget();	
	var nodeDiv = CN_grid.findTag(l, "DIV");
	if(nodeDiv.node.getAttribute("disable") == "true") return;

	this.tree_hoverNodeDiv(nodeDiv);
}

proto._tree_icon_textSpan_onmouseleave = function()
{
	CNUtil.findJSObject(Util.eventTarget()).tree_icon_textSpan_onmouseleave();
}
proto.tree_icon_textSpan_onmouseleave = function()
{
	var l = Util.eventTarget();
	var nodeDiv = CN_grid.findTag(l, "DIV");
	if(nodeDiv.node.getAttribute("disable") == "true") return;

	this.tree_unhoverNodeDiv(nodeDiv);
}

proto._tree_pmImg_onmousedown = function()
{
	CNUtil.findJSObject(Util.eventTarget()).tree_pmImg_onmousedown();
}
proto.tree_pmImg_onmousedown = function()
{
	if(this.formManager._loading)
		return;

	var l = Util.eventTarget();
	var div = CN_grid.findTag(l, "DIV");
	this.tree_toggleExpand(div, true);

	if(this._vista)
	{
		var span = div.children[this.ix_plusMinusSpan];
		var expanded = this.tree_isExpanded(div.node);
		var hoverIMG = span.lastChild;
		if(hoverIMG._hover) hoverIMG.src = expanded ? "themes/vista/g/hover-minus.gif" : "themes/vista/g/hover-plus.gif";
	}
}

proto.tree_hoverNodeDiv = function(l)
{
	if(this.tree_selectedNodeDiv != l) l.className = "tree_nodeDivOver";
}

proto.tree_unhoverNodeDiv = function(l)
{
	if(this.tree_selectedNodeDiv != l) l.className = "tree_nodeDiv";
	else l.className = "tree_nodeDivSelected";
}

proto.tree_toggleExpand = function(nodeDiv, userClick)
{
	this.tree_expandCollapse(nodeDiv, !this.tree_isExpanded(nodeDiv.node), userClick);
}

proto.tree_updateImage = function(nodeDiv)
{
	var state = this.state_default;
	var expanded = this.tree_isExpanded(nodeDiv.node);
	var selected = nodeDiv == this.tree_selectedNodeDiv;
	if(expanded && selected) state = this.state_expandedSelected;
	else if(expanded) state = this.state_expanded;
	else if(selected) state = this.state_selected;
	this.tree_updateImageToState(nodeDiv, state);
}

proto.tree_storeChangedNode = function(row, rowIndex, key, value, noStoreValue)
{
	var node = Util.xmlSelectSingleNode(this.changedFragment, this._tagPrefix + 'node[@row="' + rowIndex + '"]');
	var store = true;
	if(!node)
	{
		node = this.changedDoc.createElement(this._tagPrefix + "node");
		node.setAttribute("row", rowIndex);
		if(row.id) node.setAttribute("rowID", String(row.id).substr(3));
		this.changedFragment.appendChild(node);
	}
	node.setAttribute(key, String(value));
	
	if(this._treeAutoPostBack) this.formManager.postData(this.element);
}

proto.tree_selectNodeDiv = function(l)
{
	if(this.tree_selectedNodeDiv == l) return;
	
	this.tree_unselectNodeDiv();
	l.className = "nodeDivSelected";
	this.tree_selectedNodeDiv = l;
	this.tree_updateImage(l);
}

proto.tree_unselectNodeDiv = function()
{
	if(this.tree_selectedNodeDiv == null) return;
	var l = this.tree_selectedNodeDiv;
	l.className = "nodeDiv";

	this.tree_selectedNodeDiv = null;
	this.tree_updateImage(l);
} 

proto.tree_getContainerForNodeDiv = function(nodeDiv)
{
	return nodeDiv.parentElement.parentElement.nextSibling;
}

proto.tree_expandCollapse = function(nodeDiv, expand, userClick)
{
	var cont = this.tree_getContainerForNodeDiv(nodeDiv);
	if(!cont || !cont.isNodeContainer) return;
	if(!expand && (!cont.nodesBuilt || !this.tree_isExpanded(nodeDiv.node))) return;
	if(!expand)
	{
		// We should move focus out from grid to prevent IE from badly crash.
		// Always move focus, it's ok as user clicks +/- button anyway.
		try
		{
			document.body.focus();
		}
		catch(e){}
	}
	if(!cont.nodesBuilt)
	{
		Util.assert("Not implemented yet.");
		//if(expand) buildNodes(cont.storedNodes, cont, nodeDiv.nodeLevel + 1, cont.storedType);
		return;
	}

	if(this._vista)
	{
		if(expand)
		{
			cont.style.visibility = "hidden";
			cont.style.display = "block";
			
			var h = cont.offsetHeight;
			cont.style.height = "1px";
			cont.style.overflow = "hidden";
			cont.style.visibility = "visible";
			var anim = new AnimResize(cont, cont.offsetWidth, h);
			Animator.start(anim);
			anim.onend = function()
			{
				cont.style.height = "auto";
				cont.style.overflow = "auto";
			};
		}
		else
		{
			cont.style.overflow = "hidden";
			var anim = new AnimResize(cont, cont.offsetWidth, 1);
			Animator.start(anim);
			anim.onend = function()
			{
				cont.style.display = "none";
				cont.style.height = "auto";
				cont.style.overflow = "auto";
			};
		}
	}
	else cont.style.display = expand ? "block" : "none";

	var node = nodeDiv.node;
	node.parentNode.setAttribute("expanded", expand + "");
	
	var pmSpan = nodeDiv.children[this.ix_plusMinusSpan];
	pmSpan.children[0].src = CNFormManager.themeImagesPath + pmSpan.basePMImg 
										+ (expand ? "minus" : "plus") + ".gif";

	this.tree_updateImage(nodeDiv);
										
	// NOTE: reselect row, so border catches dimensions properly.
	if(this.selectedTR && this.selectedTR.parentElement) this.selectRow(this.selectedTR, true);

	var row = nodeDiv;
	while(row && row.rowIndex === undefined) row = row.parentElement;
	var rowIndex = row.rowIndex;

	if(userClick)
	{
		//if(tree_selectedNodeDiv && cont.contains(tree_selectedNodeDiv)) selectNodeDiv(nodeDiv, false);
		this.tree_storeChangedNode(row, rowIndex, "expanded", expand, !expand);
	}

	/*var ev = {};
	ev.rowIndex = rowIndex;
	ev.node = nodeDiv.node;
	ev.expanded = expand;
	if(this.onexpandcollapse) this.onexpandcollapse(ev);*/
}



// Properties. ============================================
proto.set_readOnly = function(value)
{
	this._readOnly = Util.parseBoolean(value);
	if(!this.isReady) return;
	this._set_readOnly();
}
proto._set_readOnly = function()
{
	var newClass = this._readOnly ? "readOnly" : "";
	this.rowsDiv.className = newClass;

	if(this._requiresReadOnlyWalk)
	{
		this._cellCount = 0;
		this._walkCells(this._fixCombos);
	}
}

proto._fixCombos = function(cell)
{
	var ct = cell.colTag;
	if(ct && ct.typeObject.set_readOnly)
	{
		ct.typeObject.set_readOnly(cell, this._readOnly);
		this._cellCount++;
	}
}

proto._walkCells = function(func)
{
	var all = this.rowsDiv.getElementsByTagName('span');
	var length = all.length;
	for(var i = 0; i < length; i++)
	{
		var l = all[i];
		if(l.isCell) func.apply(this, [l]);
	}
}

proto._walkRows = function(rowsDiv, func) {
	var children = rowsDiv.children;
	var length = children.length;
	for(var j = 0; j < length; j++) {
		var row = children[j];
		if(row.isNodeContainer) {
			this._walkRows(row, ix, func);
		}  else if(row.className == "rowDiv") {
			this[func](row);
		}
	}
}

proto.get_readOnly = function()
{
	return this._readOnly;
}

proto.set_disabled = function(value)
{
	if(value == this._disabled) return;
	this._disabled = value;

	if(value) this._set_tabIndex(-1);
	else if(this._tabIndex) this._set_tabIndex(this._tabIndex);


	if(this._disabled)
	{
		//this.element.appendChild(this.disabler);
		this.disabler.style.width = this.element.clientWidth;
		this.disabler.style.visibility = "inherit";
		this.element.style.backgroundColor = Util.getStyle(this.element, "xl--disabled-background");
		this.element.className = "cn_grid cn_grid_disabled";
	}
	else
	{
		this.element.style.backgroundColor = "";
		Util.removeElement(this.disabler);
		this.element.className = "cn_grid";
	}
}
proto.get_disabled = function()
{
	return this._disabled;
}

proto.set_selectedRow = function(value)
{
	value = parseInt(value, 10);
	if(!isNaN(value)) this._selectedRow = value;
	if(!this.isReady) return;
	this._set_selectedRow();
}
proto._set_selectedRow = function()
{
	if(this._selectedRow == -1) this.deselectRow();
	else if(this._selectedRow >= 0)
	{
		var divs = CN_grid.descendants(this.rowsDiv);
		var divCount = divs.length;
		for(var i = 0; i < divCount; i++)
		{
			var row = divs[i];
			if(row && row.rowIndex == this._selectedRow)
			{
				this.selectRow(row)
				if(this.alwaysScrollToSelected) 
				{
					this.rowsDiv.scrollTop = row.offsetTop;
				}
				break;
			}
		}
	}
	else 
	{
		this.deselectRow();
	}
}

proto._setRows = function(func, params)
{
	func(this.templateRow, params);
	func(this.folderTemplateRow, params);
	
	var rows = this.rowsDiv.children;
	var rowCount = rows.length;
	for(var i = 0; i < rowCount; i++)
	{
		var row = rows[i];
		if(row.rowIndex === undefined) continue;
		func(row, params);
	}
}

proto.set_gridLines = function(value)
{
	if(value == this._gridLines) return;
	this._gridLines = value;

	if(value == "none") this._setRows(this._set_rowGridLines, {rowLine: 0, cellLine: 0});
	else if(value == "horizontal") this._setRows(this._set_rowGridLines, {rowLine: 1, cellLine: 0});
	else if(value == "vertical") this._setRows(this._set_rowGridLines, {rowLine: 0, cellLine: 1});
	else if(value == "both") this._setRows(this._set_rowGridLines, {rowLine: 1, cellLine: 1});
}
proto._set_rowGridLines = function(row, params)
{
	row.style.borderWidth = params.rowLine;
	
	var cells = row.children;
	var cellCount = cells.length;
	for(var i = 0; i < cellCount; i++)
	{
		cells[i].style.borderWidth = params.cellLine;
	}
}

proto.set_rowHeight = function(value)
{
	if(value == this._rowHeight) return;
	this._rowHeight = value;
	
	this._setRows(this._set_rowHeight, value);
}

proto._set_rowHeight = function(row, value)
{
	row.style.height = value;
}

// Cell types. ==============================================================
var UnknownTypeCell = CN_grid.CellTypes["_UnknownType"] = function(colTag){}
var wp = UnknownTypeCell.prototype;
wp.prerender = function(cell, col){}
wp.isValid = function(cell){ return true; }
wp.render = function(cell, node)
{
	cell.textContent = "UNKNOWN TYPE: " + Util.xmlText(node);
}


/*
	Support for in-place activated editor box.
	For jsObject boxes:
		- directlyAssignEvents object field should be set to true.
		- focusout and keypress events used.
		- doNotCheckValidChars object field can be optionally set.
		- get_readOnly, set_readOnly, get_value, set_value, blur, focus, select
		  methods should be implemented.
	TypeObject should support:
		- box field.
		- validateValue(value, cell),
		- commitChange(value, cell, row, colTag),
		- validCharsRegex (if doNotCheckValidChars == false),
		- getCellValue(cell),
*/
var EditorBoxManager = 
{
	activeBox: null,
	cancelingChange: false,
	ignoreNextBlur: false,
	attachBoxEvents: function(l)
	{
		l._isBox = true;
		
		if(l.jsObject && l.jsObject.directlyAssignEvents)
		{
			l.jsObject.onblur = this.box_onblur;
			l.jsObject.onkeypress = this.box_onkeypress;
			l.jsObject.onpaste = this.box_onpaste;
		}
		else
		{
			CN_grid.addEvent(l, "blur", this.box_onblur, this);
			CN_grid.addEvent(l, "keypress", this.box_onkeypress, this);
			CN_grid.addEvent(l, "paste", this.box_onpaste, this);
		}
	},
	attachCellEvents: function(cell)
	{
		CN_grid.addEvent(cell, "mousedown", this.cell_onmousedown, this);
		CN_grid.addEvent(cell, "mouseenter", this._cell_onmouseenter, this);
		CN_grid.addEvent(cell, "mouseleave", this._cell_onmouseleave, this);
	},

	_cell_onmouseenter: function()
	{
		var cell = CN_grid.findCell(Util.eventTarget());

		if(!cell || (EditorBoxManager.activeBox == cell || EditorBoxManager.activeBox && cell.contains(EditorBoxManager.activeBox))) { // #975
			return;
		}

		var grid = CNUtil.dispatchObject();
		if(grid._readOnly) return;

		CNUtil.cancelEvent();
		// NOTE: do not show border for both _showEditorRectangle = "always" or "never".
		if(cell._isEmpty || cell._showEditorRectangle || !cell.colTag) return;

		var l = EditorBoxManager._hoverBorder;
		if(!l)
		{
			l = Util.createElementFromHTML("<div class=cellHoverBorderDiv>");
			//document.body.appendChild(l);
			EditorBoxManager._hoverBorder = l;
		}
		var to = cell.colTag.typeObject;
		if(to.setHoverBorderStyle) 
		{	
			to.setHoverBorderStyle(l, cell);
			l.style.visibility = "inherit";			
		}
		else EditorBoxManager._setHoverBorderStyle(l, cell);
		cell.appendChild(l);
	},
	
	_setHoverBorderStyle: function(l, cell)
	{
		l.style.visibility = "inherit";
		var paddingLeft = parseInt(Util.getStyle(cell, "paddingLeft"), 10);
		l.style.width = cell.clientWidth - paddingLeft + 2;		
		l.style.left = paddingLeft - 2;
		l.style.top = parseInt(Util.getStyle(cell, "paddingTop"), 10) - 2; // !!!
	},
	
	_cell_onmouseleave: function()
	{
		var cell = CN_grid.findCell(Util.eventTarget());
		if(!cell) return;
		
		var grid = CNUtil.dispatchObject();
		if(grid._readOnly) return;

		//if(CN_grid.relatedTarget() == EditorBoxManager._hoverBorder) return;
		if(EditorBoxManager.activeBox && cell.contains(EditorBoxManager.activeBox)) return;
		if(cell._isEmpty || cell._showEditorRectangle) return;
		if(cell.contains(CN_grid.relatedTarget())) 
		{
			return;
		}
		CNUtil.cancelEvent();		
		EditorBoxManager.hideHover();
	},
	hideHover : function() {
		var l = EditorBoxManager._hoverBorder;
		if(!l) return;
		if(CNFormManager.vista)
		{
			l.style.visibility = "hidden";
			EditorBoxManager._hoverBorder = null;
			Util.removeElement(l);
		}
		else l.style.visibility = "hidden";
	},
	_hover_ontransitionend: function()
	{
		var l = Util.eventTarget();
		Util.removeElement(l);
		CN_grid.removeEvent(l, "transitionend", EditorBoxManager._hover_ontransitionend, EditorBoxManager);
	},
	
	isCurrentBoxValid: function()
	{
		if(EditorBoxManager.activeBox == null) return true;
		var box = EditorBoxManager.activeBox;
		var cell = CN_grid.findCell(box);
		var typeObject = cell.colTag.typeObject;
		return EditorBoxManager._get_box_readOnly(box) || EditorBoxManager.canBlurBox(box, typeObject);
	},
	_get_box_readOnly: function(box)
	{
		if(box.jsObject) return box.jsObject.get_readOnly();
		else return box.readOnly;
	},	
	_set_box_readOnly: function(box, val)
	{
		if(box.jsObject) box.jsObject.set_readOnly(val);
		else box.readOnly = val;
	},	
	_get_box_value: function(box)
	{
		if(box.jsObject) return box.jsObject.get_value();
		else return box.value;
	},
	_set_box_value: function(box, val)
	{
		if(box.jsObject) box.jsObject.set_value(val);
		else box.value = val;
	},
	_box_blur: function(box)
	{
		if(box.jsObject) box.jsObject.blur();
		else {
			box.blur();
		}
	},
	_box_focus: function(box)
	{
		if(box.jsObject) {
			box.jsObject.focus();
		}
		else {
			try{ 
				box.focus(); 
			}catch(ex){}
		}
	},
	_box_select: function(box)
	{
		if(box.jsObject) box.jsObject.select();
		else box.select();
	},
	focusBox: function(box)
	{
		EditorBoxManager._box_focus(box);
		try
		{
			if(!EditorBoxManager._get_box_readOnly(box)) EditorBoxManager._box_select(box);
		}
		catch(ex){}
	},
	_findBox: function(box)
	{
		while(box != null && !box._isBox) box = box.parentElement;
		return box;
	},
	
	box_onblur: function()
	{
		if(EditorBoxManager.ignoreNextBlur)
		{
			EditorBoxManager.ignoreNextBlur = false;
			var grid = CNUtil.dispatchObject();
			if(CN_grid.relatedTarget() && grid.element.contains(CN_grid.relatedTarget()) || CN_grid.relatedTarget() == document.body)
			{
				return;
			}
		}
		
		var box = EditorBoxManager.activeBox;
		if(!box || !box.parentElement)
		{
			 return;
		}
		
		//CNFormManager._trace("BoxManager.box_onblur by " + Util.eventTarget().outerHTML);

		var box = EditorBoxManager._findBox(Util.eventTarget());

		var cell = CN_grid.findCell(box);
		var typeObject = cell.colTag.typeObject;
	
		var boxReadOnly = EditorBoxManager._get_box_readOnly(box);
		var canBlur = boxReadOnly || EditorBoxManager.canBlurBox(box, typeObject);
		var doCommit = !boxReadOnly && !EditorBoxManager.cancelingChange && canBlur;
		var remove = false;

		if(EditorBoxManager.cancelingChange || canBlur)
		{
			if(EditorBoxManager._hoverBorder) EditorBoxManager._hoverBorder.style.visibility = "hidden";
			
			if(typeObject.onAfterEdit) typeObject.onAfterEdit(cell);
			remove = true;
		}
		else 
		{
			Event.cancel(CN_grid.currentEvent());
		}

		if(doCommit) typeObject.commitChange(EditorBoxManager._get_box_value(box), cell, cell.parentElement, cell.colTag);
		if(remove) EditorBoxManager.removeBox(cell, box);
	},
	endActiveEdit: function(catchedCell) // catchedCell - optional.
	{
		var box = EditorBoxManager.activeBox;

		// Check if box is still visible and invalid.
		if(box && box.parentElement && !EditorBoxManager._get_box_readOnly(box))
		{
			//box.tabIndex = -1;
			var cell = CN_grid.findCell(box);
			if(cell == catchedCell) return;
			
			var typeObject = cell.colTag.typeObject;
			if(!EditorBoxManager.canBlurBox(box, typeObject)) {
				return;
			}
			var boxCell = box.parentElement;

			EditorBoxManager.removeBox(cell, box);
			typeObject.commitChange(EditorBoxManager._get_box_value(box), boxCell, boxCell.parentElement, boxCell.colTag);
			
			if(typeObject.onAfterEdit) typeObject.onAfterEdit(cell);
		}
	},
	beginEdit: function(catchedCell)
	{
		var cell = catchedCell;
		if(!cell.colTag) return;
		var typeObject = cell.colTag.typeObject;
		var box = typeObject.box;
		if(!box) return;
		
		if(catchedCell.contains(EditorBoxManager.activeBox)) return;

		EditorBoxManager.endActiveEdit(catchedCell);

		var gridJSO = Util.findJSObject(cell);
		if(gridJSO._readOnly && CN_grid.fullRowSelect) return;

		EditorBoxManager.activeBox = box;
				
		// NOTE: check readOnly only AFTER commit, as commit can change readOnly state (via ignorePostBack).
		
		var readOnly = gridJSO.getCascadedReadOnly(cell);
		EditorBoxManager._set_box_readOnly(box, readOnly);
		if(readOnly) 
		{
			// Attach to cell, as box doesn't fire events in readOnly mode.
			Event.add(cell, "keydown", cell, CN_grid.cancelBackspace);
		}
		
		EditorBoxManager.cancelingChange = false;
		var paddingLeft = parseInt(Util.getStyle(cell, "paddingLeft"), 10);
		box.style.left = paddingLeft - 2;
		box.style.top = parseInt(Util.getStyle(cell, "paddingTop")) - 2; /// !!!
		box.style.width = cell.clientWidth - paddingLeft + 2;

		EditorBoxManager._set_box_value(box, typeObject.getCellValue(cell));
		cell.className = cell.className + " edited";
		cell.appendChild(box);
		box.style.display = "block";
		if(typeObject.onBeforeEdit) typeObject.onBeforeEdit(cell);
		
		// WARNING: possible cross-ref.
		setTimeout(function()
		{
			//EditorBoxManager.ignoreNextBlur = true;
			//gridJSO._skipNextFocus = true; // 1036-3
			EditorBoxManager.focusBox(box);

			//CNFormManager._trace("box.parentElement: " + box.parentElement + " box.offsetWidth: " + box.offsetWidth);
		}, 0);

	},
	removeBox: function(cell, box)
	{
		Util.removeClass(cell, "edited");
		EditorBoxManager.ignoreNextBlur = true;
		if(box == EditorBoxManager.activeBox) EditorBoxManager.activeBox = null;
		//setTimeout(function(){ - NOTE: setTimeout here causing FWUI-1264 due to removeBox async'ly called right after beginEdit. 
			//CNFormManager._trace("removeBox: hiding the box");
			box.style.display = "none";
		//}, 0);
	},
	box_onkeypress: function()
	{
		var box = EditorBoxManager._findBox(Util.eventTarget());

		var code = Event.keyValue(CN_grid.currentEvent());
		if(code == 0) return;

		if(code == 13) 
		{
			//alert("box manager enter")
			Util.cancelEvent(CN_grid.currentEvent());
			EditorBoxManager.endActiveEdit();
//			try{ EditorBoxManager._box_blur(box); } catch(e){}
		}
		else if(code == 27)
		{
			EditorBoxManager.cancelingChange = true;
			try{ EditorBoxManager._box_blur(box); } catch(e){}
		}
		else if(!box.doNotCheckValidChars)
		{
			// Validate char.
			var l = Util.eventTarget();
			var cell = CN_grid.findCell(l);
			var validCharsRegex = cell.colTag.typeObject.validCharsRegex;
			if(!validCharsRegex) return true;
	
			var charx = String.fromCharCode(code);
			return charx.match(cell.colTag.typeObject.validCharsRegex) != null;
		}
	},
	cell_onmousedown: function()
	{
		var catchedCell = CN_grid.findCell(Util.eventTarget());
		if(catchedCell._isEmpty) return;
		EditorBoxManager.beginEdit(catchedCell);
	},
	canBlurBox: function(box, typeObject)
	{
		var cell = CN_grid.findCell(box);
		if(!typeObject.validateValue(EditorBoxManager._get_box_value(box), cell))
		{			
			var cellIndex = cell.cellIndex;			
			
			EditorBoxManager._box_setError(box, typeObject, true);
//			EditorBoxManager._box_focus(box);
			setTimeout(function(){ EditorBoxManager._box_setError(box, typeObject, false); }, 500);
			return false;
		}
		return true;
	},
	box_onpaste: function(box, typeObject)
	{
		var box = EditorBoxManager._findBox(Util.eventTarget());
		var cell = CN_grid.findCell(box);
		var typeObject = cell.colTag.typeObject;
		
		if(!typeObject.validateValue(CN_grid.readClipboardText(), cell))
		{			
			var cellIndex = cell.cellIndex;			
			
			EditorBoxManager._box_setError(box, typeObject, true);
//			EditorBoxManager._box_focus(box);
			setTimeout(function(){ EditorBoxManager._box_setError(box, typeObject, false); }, 500);
			return false;
		}
		return true;
	},
	_box_setError: function(box, typeObject, error) {
		if(typeObject.setErrorBorder) { // Used for dateboxtime.
			typeObject.setErrorBorder(error);
		} else {
			box.style.borderColor = error ? "red" : "";
		}
	}	
}

// String. =========================================================
// NOTE: this type is generic for other types but it's also fully functional as cell type.
var StringTypeCell = CN_grid.CellTypes["String"] = function(colTag)
{
	this.box = StringTypeCell.createBox();
}
StringTypeCell.cn_tagName = "textbox";
StringTypeCell.createBox = function()
{
	var l = Util.createElementFromHTML("<input class=textbox type=text>");
	EditorBoxManager.attachBoxEvents(l);
	return l;
}
var wp = StringTypeCell.prototype;

wp.getCellValue = function(cell)
{
	return cell.firstChild.textContent;
}
wp.setCellValue = function(cell, value)
{
	var border;
	if(cell._showEditorRectangle) 
	{
		border = cell.lastChild;
		Util.removeElement(border);
	}
	cell.innerHTML = "<span>" + value + "</span>";
	if(border) cell.appendChild(border);
}
wp.isValid = function(cell)
{ 
	var result;
	// Always return true for readEnly empty cells.
	if(EditorBoxManager.activeBox != null && EditorBoxManager.activeBox.parentElement == cell)
	{
		result = this.validateValue(this.box.value, cell); 
	}
	else	
	{
		result = this.validateValue(this.getCellValue(cell), cell); 
	}
	return result;
}
wp.validateValue = function(value, cell)
{
	if(value.replace(/\s+/, "") == "")
	{
		if(cell.colTag.canBeEmpty) return true;
		else
		{ 
			var jsObject = CNUtil.findJSObject(cell);
			if(jsObject.getCascadedReadOnly(cell)) return true; 
		}
		return false;		
	}
	else return true;
}
wp.commitChange = function(value, cell, row, colTag)
{
	if(this._casing)
	{
		if(this._casing == "upper") value = value.toUpperCase();
		else if(this._casing == "lower") value = value.toLowerCase();
	}

	if(!this.validateValue(value, cell)) return;

	if(this.getCellValue(cell) != value)
	{
		var self = this;
		setTimeout(function(){ self.setCellValue(cell, value); }, 0); // FWUI-1253 - set cell value async'ed as else no events happens in next focused control out of grid.
		var jsObject = CNUtil.findJSObject(cell);
		jsObject.setChangedValue(row, cell, value);
		jsObject.fireChangedEvent(row, cell, value);
		//if(cell.colTag.autoPostBack) jsObject.postBack(row, cell, value);
	}
}
wp.prerender = function(cell, colTag)
{
	var attr = colTag.node.getAttribute("maxLength");
	if(attr) this.box.maxLength = parseInt(attr, 10);

	colTag.typeObject = this;
	EditorBoxManager.attachCellEvents(cell);
	
	var casing = colTag.node.getAttribute("casing");
	if(casing)
	{
		this._casing = String(casing);
		if(casing == "upper") this.box.style.textTransform = cell.style.textTransform = "uppercase";
		else if(casing == "lower") this.box.style.textTransform = cell.style.textTransform = "lowercase";
	}
}
wp.render = function(cell, node)
{
	cell.innerHTML = "<span>" + Util.xmlText(node) + "</span>";
}


// Bool. =========================================================
var BoolTypeCell = CN_grid.CellTypes["Bool"] = function(colTag)
{
}
BoolTypeCell.cn_tagName = "checkbox";
BoolTypeCell._toggleBox = function(box, jsObject, mo)
{
	var cell = box.parentElement;
	var row = cell.parentElement;
		
	box.checked = !box.checked;
	var src;
	if(mo) src = CNFormManager.themeImagesPath + (box.checked ? "checkedHoverCheckbox.gif" : "uncheckedHoverCheckbox.gif");
	else src = CNFormManager.themeImagesPath + (box.checked ? "checkedCheckbox.gif" : "uncheckedCheckbox.gif");
	
	if(CNFormManager.vista) VistaSupport.imageTrans(box, src, !box.checked);
	else box.src = src;

	jsObject.setChangedValue(row, cell, String(box.checked));
	jsObject.fireChangedEvent(row, cell, box.checked);
	if(cell.colTag.autoPostBack) jsObject.postBack(row, cell, box.checked);
}
var wp = BoolTypeCell.prototype;
wp.isFocusable = true;
wp.ascSortFunction = function(a, b)
{
	var aChecked = a[2].children[0].checked;
	var bChecked = b[2].children[0].checked;
	if(!aChecked && bChecked) return 1;
	if(aChecked && !bChecked) return -1;
	return 0;

}
wp.descSortFunction = function(a, b)
{
	var aChecked = a[2].children[0].checked;
	var bChecked = b[2].children[0].checked;
	if(aChecked && !bChecked) return 1;
	if(!aChecked && bChecked) return -1;
	return 0;
}
// Event handlers.
wp.box_onmousedown = function()
{
	if(CN_grid.currentEvent().button != 1) return;
	var box = Util.eventTarget();
	var jsObject = CNUtil.findJSObject(box);
	if(jsObject.getCascadedReadOnly(box)) return;

	BoolTypeCell._toggleBox(box, jsObject, true);
}
wp.box_onmouseenter = function()
{
	var l = Util.eventTarget();
	var jsObject = CNUtil.findJSObject(l);
	if(jsObject.getCascadedReadOnly(l)) return;

	var src = CNFormManager.themeImagesPath + (l.checked ? "checkedHoverCheckbox.gif" : "uncheckedHoverCheckbox.gif");
	if(CNFormManager.vista) VistaSupport.imageTrans(l, src, false);
	else l.src = src;
}
wp.box_onmouseleave = function()
{
	var l = Util.eventTarget();
	var jsObject = CNUtil.findJSObject(l);
	if(jsObject.getCascadedReadOnly(l)) return;
	src = CNFormManager.themeImagesPath + (l.checked ? "checkedCheckbox.gif" : "uncheckedCheckbox.gif");
	if(CNFormManager.vista) VistaSupport.imageTrans(l, src, true);
	else l.src = src;
}
wp._cell_onkeydown = function()
{
	if(Event.keyValue(CN_grid.currentEvent()) != 32) return;
	var box = Util.eventTarget().children[0];
	var jsObject = CNUtil.findJSObject(box);
	if(jsObject.getCascadedReadOnly(box)) return;

	BoolTypeCell._toggleBox(box, jsObject, false);
}
wp._cell_beforedeactivate = function()
{
	if(CN_grid.relatedTarget() == document.body) CNUtil.cancelEvent();
	else Util.eventTarget().tabIndex = -1;
}
wp.isValid = function(cell){ return true; }
wp.prerender = function(cell, colTag)
{
}
wp.render = function(cell, node)
{
	var l = Util.createElementFromHTML("<img width=13 height=13 class=xlcheckboximg>")
	cell.appendChild(l);
	
	CN_grid.addEvent(l, "mousedown", this.box_onmousedown, this);
	CN_grid.addEvent(l, "mouseenter", this.box_onmouseenter, this);
	CN_grid.addEvent(l, "mouseleave", this.box_onmouseleave, this);
	CN_grid.addEvent(cell, "keydown", this._cell_onkeydown, this);
	CN_grid.addEvent(cell, "focusout", this._cell_beforedeactivate, this);
	
	if(Util.xmlText(node) == "false") 
	{
		l.src = CNFormManager.themeImagesPath + "uncheckedCheckbox.gif";
		l.checked = false;
	}
	else
	{
		l.src = CNFormManager.themeImagesPath + "checkedCheckbox.gif";
		l.checked = true;
	}
}

// Int. =========================================================
var IntTypeCell = CN_grid.CellTypes["Int"] = function(colTag)
{
	this.box = StringTypeCell.createBox();
	CN_grid.addEvent(this.box, "keypress", IntTypeCell._box_onkeypress, null);	
	
	this.box.maxLength = 9;
	
	//Check maxLength: default maxLength = 9
	var attr = colTag.node.getAttribute("maxLength");
	if(attr)
	{
		if (parseInt(attr, 10) > 0)
		{
			this.box.maxLength = parseInt(attr, 10);
		}
	}
	
	this.validCharsRegex = /[0-9\-]/;
}

//IntTypeCell onkeypress event
IntTypeCell._box_onkeypress = function() 
{
	var cell = CN_grid.findCell(Util.eventTarget());
	var jsObject = cell.colTag.typeObject;
	
	if(jsObject.box.textContent.length > 0 && 
			cell.textContent.length >= jsObject.box.maxLength)	
	{
		CNUtil.cancelEvent();
	}
}

IntTypeCell.cn_tagName = "intbox";
var wp = IntTypeCell.prototype;
wp.getCellValue = StringTypeCell.prototype.getCellValue;
wp.setCellValue = StringTypeCell.prototype.setCellValue;
wp.isValid = StringTypeCell.prototype.isValid;
wp.ascSortFunction = function(a, b)
{
	var af = parseInt(a[0]);
	var bf = parseInt(b[0]);
	if(af > bf || isNaN(bf)) return 1;
	if(af < bf || isNaN(af)) return -1;
	return 0;

}
wp.descSortFunction = function(a, b)
{
	var af = parseInt(a[0]);
	var bf = parseInt(b[0]);
	if(af < bf || isNaN(af)) return 1;
	if(af > bf || isNaN(bf)) return -1;
	return 0;
}
wp.validateValue = function(value, cell)
{
	if(value.replace(/\s+/, "") == "")
	{
		if(cell.colTag.canBeEmpty) return true;
		else
		{
			var jsObject = CNUtil.findJSObject(cell);
			if(jsObject.getCascadedReadOnly(cell)) return true;
		}
	}
	return value.match(/^(\+|\-)?\d+$/);
}
wp.commitChange = function(value, cell, row, colTag)
{
	if(!this.validateValue(value, cell)) return;
	var doChange = false;

	var v1 = cell.firstChild.textContent.replace(/\s+/, "");
	var v2 = value.replace(/\s+/, "");
	if(v1 != v2)
	{
		if(v1 != "" && v2 == "")
		{
			// Empty
			value = "";
			this.setCellValue(cell, value);
			doChange = true;
		}
		else if(v1 == "" || cell.firstChild.textContent * 1 != value * 1)
		{
			value = value * 1;
			this.setCellValue(cell, value);
			doChange = true;
		}
	}
	if(doChange)
	{
		var jsObject = CNUtil.findJSObject(cell);
		jsObject.setChangedValue(row, cell, value);
		jsObject.fireChangedEvent(row, cell, value);
		if(cell.colTag.autoPostBack) jsObject.postBack(row, cell, value);
	}
}
wp.prerender = StringTypeCell.prototype.prerender;
wp.render = StringTypeCell.prototype.render;


// Decimal. =========================================
var DecimalTypeCell = CN_grid.CellTypes["Decimal"] = function(colTag)
{
	this.box = StringTypeCell.createBox();

	var scale = colTag.node.getAttribute("scale");
	if(scale) this.scale = parseInt(scale, 10);
	else this.scale = 2;
	
	var precision = colTag.node.getAttribute("precision");
	if(precision) this.precision = parseInt(precision, 10);
	else this.precision = 10;

	var decDigits = this.precision - this.scale;
							// 000.00
	var str;
	if(this.scale > 0)
	{
		str = "^(\\+|\\-)?(\\d{1," + decDigits + "}(\\.)\\d{1," + this.scale + "}|"
								// .00
								+ "(\\.)\\d{1," + this.scale + "}|"
								// 00
								+ "\\d{1," + decDigits + "})$";
	}
	else str = "^\\d(\\+|\\-)?(\\d{1," + decDigits + "})$";
	
	this.regex = new RegExp(str);
	this.validCharsRegex = /[0-9+\-.]/;
}

DecimalTypeCell.cn_tagName = "decimalbox";
var wp = DecimalTypeCell.prototype;
wp.getCellValue = StringTypeCell.prototype.getCellValue;
wp.setCellValue = StringTypeCell.prototype.setCellValue;
wp.isValid = StringTypeCell.prototype.isValid;
wp.ascSortFunction = function(a, b)
{
	var af = parseFloat(a[0]);
	var bf = parseFloat(b[0]);
	if(af > bf) return 1;
	if(af < bf) return -1;
	return 0;

}
wp.descSortFunction = function(a, b)
{
	var af = parseFloat(a[0]);
	var bf = parseFloat(b[0]);
	if(af < bf) return 1;
	if(af > bf) return -1;
	return 0;
}
wp.validateValue = function(value, cell)
{
	if(value.replace(/\s+/, "") == "")
	{
		if(cell.colTag.canBeEmpty) return true;
		else
		{
			var jsObject = CNUtil.findJSObject(cell);
			if(jsObject.getCascadedReadOnly(cell)) return true;
		}
	}
	var result = value.match(this.regex) != null;
	return result;
}
wp.commitChange = IntTypeCell.prototype.commitChange;
wp.prerender = StringTypeCell.prototype.prerender;
wp.render = StringTypeCell.prototype.render;


// Date. ====================================================
var DateTypeCell = CN_grid.CellTypes["Date"] = function(colTag)
{
	this.box = StringTypeCell.createBox();
	this.box.maxLength = 10;
	this.validCharsRegex = /[0-9\/]/;
}
DateTypeCell.cn_tagName = "datebox";
DateTypeCell.defaultValidationString = "Invalid Date";
DateTypeCell.calendar_onxlresult = function()
{
	// NOTE: probably serving alien grid.
	var calendar = CNPopupCalendar.defaultInstance;
	var cell = calendar._activeCell;
	calendar._activeCell = null;
	
	var value = calendar.get_dateString();
	// Update edit box.
	if(EditorBoxManager.activeBox && cell.contains(EditorBoxManager.activeBox)) EditorBoxManager.activeBox.value = value;
	
	cell.colTag.typeObject.commitChange(value, cell, cell.parentElement, cell.colTag);
}
DateTypeCell._getDate = function(str)
{
	var ar = String(str).split("/");
	return new Date(parseInt(ar[2], 10), parseInt(ar[1], 10) - 1, parseInt(ar[0], 10));
}
var wp = DateTypeCell.prototype;
wp.ascSortFunction = function(a, b)
{
	if(a[0].length == 0) return 1;
	if(b[0].length == 0) return -1;
	a = DateTypeCell._getDate(a[0]).getTime();
	b = DateTypeCell._getDate(b[0]).getTime();

	if(a < b) return 1;
	if(a == b) return 0;
	return -1;
}
wp.descSortFunction = function(a, b)
{
	if(a[0].length == 0) return -1;
	if(b[0].length == 0) return 1;
	a = DateTypeCell._getDate(a[0]).getTime();
	b = DateTypeCell._getDate(b[0]).getTime();

	if(a > b) return 1;
	if(a == b) return 0;
	return -1;
}

wp.getCellValue = function(cell){ return cell.children[0].textContent; }
wp.setCellValue = function(cell, value){ cell.children[0].textContent = value; }
wp.button_onclick = function()
{
	var cell = CN_grid.findCell(Util.eventTarget());
	var jsObject = CNUtil.findJSObject(cell);
	
	if(jsObject.getCascadedReadOnly(cell)) return;

	var x = CN_grid.currentEvent().screenX - window.screenLeft;
	var y = CN_grid.currentEvent().screenY - window.screenTop;

	var calendar = CNPopupCalendar.defaultInstance;
	calendar._activeCell = cell;
	calendar.onxlresult = DateTypeCell.calendar_onxlresult;
	calendar.show(cell.children[0].textContent, null, x, y);

	//Event.cancel(CN_grid.currentEvent());
}
wp.isValid = StringTypeCell.prototype.isValid;
wp.validateValue = function(value, cell)
{
	if(value.replace(/\s+/, "") == "")
	{
		if(cell.colTag.canBeEmpty) return true;
		else
		{
			var jsObject = CNUtil.findJSObject(cell);
			if(jsObject.getCascadedReadOnly(cell)) return true;
		}
	}
	var ar = value.split(/\/|\.|\-/);
	if(ar.length == 3) 
	{
		var year = ar[2] * 1;
		//if(year > 50 && year < 100) year += 1900;
		//if(year < 50) year += 2000;
		var date = new Date(year, ar[1] - 1, ar[0]);
		return date.getMonth() == ar[1] - 1 && date.getDate() == ar[0] && date.getFullYear() == year;
	}
	return false;
}
wp.commitChange = function(value, cell, row, colTag)
{
	if(!this.validateValue(value, cell)) return;
	if(cell.children[0].textContent != value)
	{
		// NOTE: always leave some space to click on.
		if(value.replace(/\s+/, "") == "") cell.children[0].textContent = "   ";
		else cell.children[0].textContent = value;

		var jsObject = CNUtil.findJSObject(cell);
		jsObject.setChangedValue(row, cell, value);
		jsObject.fireChangedEvent(row, cell, value);
		if(cell.colTag.autoPostBack) jsObject.postBack(row, cell, value);
	}
}
wp.setHoverBorderStyle = function(l, cell)
{
	l.style.width = cell.clientWidth - 18;
	l.style.left = 0;
	l.style.top = 3;
}
wp.prerender = function(cell, colTag)
{
	colTag.typeObject = this;
	var text = document.createElement("div")
	cell.appendChild(text);
	
	EditorBoxManager.attachCellEvents(cell);
	
	var button;
	if(CNFormManager.vista)
	{
		button = VistaSupport.createImageButton("grid-datebox-button.gif", 16, 16);
		cell.style.paddingRight = "18px";
		button.style.top = "3px";
	}
	else
	{
		button = Util.createElementFromHTML("<button class=xllookupbutton>");
		CN_grid.addEvent(button, "mouseenter", _CN_button_onmouseenter, null);
		CN_grid.addEvent(button, "mouseleave", _CN_button_onmouseleave, null);
		button.tabIndex = -1;
		button.style["float"] = "right"; // float => rhino reserved
		text.style.width = "100%"//Math.max(cell.clientWidth - button.offsetWidth - 8 - parseInt(Util.getStyle(cell, "paddingLeft")), 1); /* !!! */
		button.style.top = "5px";
	}

	CN_grid.addEvent(button, "click", this.button_onclick, this);
	CN_grid.addEvent(button, "mousedown", CNUtil.cancelEvent, null);
	
	button.style.position = "absolute";
	button.style.right = "0px";
	cell.appendChild(button);
}
wp.render = function(cell, node)
{
	if(!CNFormManager.vista)
	{
		var img = Util.createElementFromHTML("<img width=8 height=8>");
		cell.children[1].appendChild(img);
		img.src = CNFormManager.themeImagesPath + "calendar8x8.gif";
	}

	cell.children[0].textContent = Util.xmlText(node);
	
	if(cell.parentElement.readOnly || cell.colTag.readOnly) cell.children[1].style.display = "none";
}


var DateTimeTypeCell = CN_grid.CellTypes["DateTime"] = function(colTag, grid)
{
	this.box = DateTimeTypeCell.createBox();
	var boxJSO = this.box.firstChild.jsObject;
	grid._jsObjects.push(boxJSO);
	boxJSO._canBeEmpty = colTag.canBeEmpty;
	this.validCharsRegex = /[0-9]/;
}
DateTimeTypeCell.cn_tagName = "datetimebox";
DateTimeTypeCell.defaultValidationString = "Invalid Date/Time";
DateTimeTypeCell.createBox = function()
{
	var box = new CN_datebox();
	var l = box.createElement(Util.wrapIntoNode({time: "true"}));
	box._timeBox.dontCancelBlur = true; // FWUI-1036 - allow focus to go out of invalid timebox, so grid validation can take place.

	CN_grid.addEvent(box.element, "keydown", DateTimeTypeCell._box_onkeydown, null);
	
	// Wrap date-time table with the div, as table produces unwanted padding to the cell (even absolute pos'ed table!).
	var div = document.createElement("div");
	div.appendChild(l);
	div.style.position = "absolute";
	div.jsObject = box;
		
	EditorBoxManager.attachBoxEvents(div);
	return div;
}
DateTimeTypeCell._box_onkeydown = function() { // FWUI-1036 - proxy tab keys to grid from the calendar button.
	CN_grid.proxyTabKeyDown();
}

var wp = DateTimeTypeCell.prototype;
wp.setErrorBorder = function(error) {
	this.box.firstChild.style.borderColor = error ? "red" : "";
}
wp.getCellValue = function(cell)
{
	return cell._raw;
}
wp.setCellValue = function(cell, value)
{
	var dt = this.box.firstChild.jsObject.getReadableDateTime(value)
	cell.children[0].textContent = dt[0] + " " + dt[1];
	cell._raw = String(value);
}
wp.validateValue = function(value, cell)
{
	var val = this.box.firstChild.jsObject.isValid(true);
	return val;
}
// This sometimes called for box-less cells, so it should not assume box is active and correct.
wp.isValid = function(cell) {
	var boxJSO = this.box.firstChild.jsObject;

	if(boxJSO._canBeEmpty && cell._raw == "") return true;
	try {
		var dt = boxJSO._parseDate(cell._raw);
		return true;
	} catch(e) {
	}
	return false;	
}
wp.commitChange = function(value, cell, row, colTag)
{
	if(!this.isValid(cell)) return;
	
	if(cell._raw != value)
	{
		this.setCellValue(cell, value);
		
		var jsObject = CNUtil.findJSObject(cell);
		jsObject.setChangedValue(row, cell, value);
		jsObject.fireChangedEvent(row, cell, value);
		if(cell.colTag.autoPostBack) jsObject.postBack(row, cell, value);
	}
}
//wp.onAfterEdit = function(cell)
//{
////	cell.style.paddingTop = "5px";
////	this.box.parentNode.removeChild(this.box);
//}
//wp.onBeforeEdit = function(cell)
//{
////	cell.style.paddingTop = "1px";
////	cell.firstChild.style.display = "none";
//}
wp.prerender = function(cell, colTag)
{
	colTag.typeObject = this;
	EditorBoxManager.attachCellEvents(cell);
	
	var text = document.createElement("span")
	text.className = "dateTimeText";
	cell.appendChild(text);
	cell.style.paddingTop = "5px";
}
wp.render = function(cell, node)
{
	this.setCellValue(cell, Util.xmlText(node));
}


// Time. ==================================================
var TimeTypeCell = CN_grid.CellTypes["Time"] = function(colTag, grid)
{
	this.box = TimeTypeCell.createBox();
	grid._jsObjects.push(this.box.jsObject);	
	this.box.jsObject._canBeEmpty = colTag.canBeEmpty;
	this.box.jsObject.onchange = null; // Remove fommanager call.
	this.box.jsObject._grid = grid;
	this.validCharsRegex = /[0-9]/;
}
TimeTypeCell.cn_tagName = "timebox";
TimeTypeCell.defaultValidationString = "Invalid Time";
TimeTypeCell.createBox = function()
{
	var timebox = new CN_timebox();
	var l = timebox.createElement();
	l.style.position = "absolute";
	
	EditorBoxManager.attachBoxEvents(l);
	return l;
}
var wp = TimeTypeCell.prototype;
wp.getCellValue = StringTypeCell.prototype.getCellValue;
wp.setCellValue = StringTypeCell.prototype.setCellValue;
wp.isValid = function(cell)
{ 
	var result;
	if(EditorBoxManager.activeBox != null && EditorBoxManager.activeBox.parentElement == cell) {
		result = this.validateValue(this.box.jsObject.get_value(), cell); 
 	} else {
		result = this.validateValue(this.getCellValue(cell), cell); 
	}
	return result;
}
wp.validateValue = function(value, cell)
{
	if(!this.box.jsObject) return true;
	return this.box.jsObject.validateValue(value, cell.colTag.canBeEmpty);
}
wp.commitChange = function(value, cell, row, colTag)
{
	if(!this.validateValue(value, cell)) return;
	if(cell.children[0].textContent != value)
	{
		if(value.replace(/\s+/g, "") == ":") cell.children[0].textContent = " ";
		else cell.children[0].textContent = value;
		
		var jsObject = CNUtil.findJSObject(cell);
		jsObject.setChangedValue(row, cell, value);
		jsObject.fireChangedEvent(row, cell, value);
		if(cell.colTag.autoPostBack) jsObject.postBack(row, cell, value);
	}
}
wp.prerender = function(cell, colTag)
{
	colTag.typeObject = this;
	EditorBoxManager.attachCellEvents(cell);
	
	var text = document.createElement("span")
	cell.appendChild(text);
}
wp.render = function(cell, node)
{
	cell.children[0].textContent = Util.xmlText(node);
}


// Button. ==============================================
var ButtonTypeCell = CN_grid.CellTypes["Button"] = function(colTag){}
ButtonTypeCell.cn_tagName = "button";
var wp = ButtonTypeCell.prototype;
wp.isValid = function(cell){ return true; }
wp.isFocusable = true;
// Event handlers.
wp.box_onclick = function()
{
	var cell = CN_grid.findCell(Util.eventTarget());
	var jsObject = CNUtil.findJSObject(cell);
	if(jsObject._disabled) return;
	var row = cell.parentElement;

	var jsObject = CNUtil.findJSObject(cell);
	jsObject.setChangedValue(row, cell, null);
	jsObject.fireChangedEvent(row, cell, null);
	if(cell.colTag.autoPostBack) jsObject.postBack(row, cell, null);
}
wp._cell_onkeydown = function()
{
	if(Util.eventTarget().className != "cellSpan") return;
	if(Event.keyValue(CN_grid.currentEvent()) == 13)
	{
		CNUtil.cancelEvent();
		var cell = Util.eventTarget();
		cell.children[cell.children.length - 1].click();
	}
}
wp._button_onmouseenter = function()
{
	VistaSupport.imageTrans(Util.eventTarget().firstChild, "themes/vista/g/hover-grid-button.gif");
}
wp._button_onmouseleave = function()
{
	VistaSupport.imageTrans(Util.eventTarget().firstChild, "themes/vista/g/grid-button.gif");
}
wp._button_onmouseup = function()
{
	var img = Util.findByClassName(Util.eventTarget(), "gridButtonSpan").firstChild;
	VistaSupport.imageTrans(img, "themes/vista/g/hover-grid-button.gif");
}
wp._button_onmousedown = function()
{
	var img = Util.findByClassName(Util.eventTarget(), "gridButtonSpan").firstChild;
	VistaSupport.imageTrans(img, "themes/vista/g/down-grid-button.gif", true);
}
wp._createSpanButton = function()
{
	var button = Util.createElementFromHTML("<span class='gridButtonSpan'>");
	var img = document.createElement("img");
	img.src = "themes/vista/g/grid-button.gif";
	img.width = img.height = 16;
	button.appendChild(img);
	CN_grid.addEvent(button, "mouseenter", this._button_onmouseenter, this);
	CN_grid.addEvent(button, "mouseleave", this._button_onmouseleave, this);
	CN_grid.addEvent(button, "mousedown", this._button_onmousedown, this);
	CN_grid.addEvent(button, "mouseup", this._button_onmouseup, this);
	return button;
}
wp.prerender = function(cell, colTag)
{
	var text = document.createElement("span");
	cell.appendChild(text);
	
	var button;
	if(CNFormManager.vista)
	{
		cell.style.paddingTop = "3px";
		button = this._createSpanButton();
		button.style.marginLeft = "3px";
		cell.appendChild(button);		
	}
	else
	{
		button = Util.createElementFromHTML("<button class=xllookupbutton>")
		cell.appendChild(button);
		
		button.tabIndex = -1;
		CN_grid.addEvent(button, "mouseenter", _CN_button_onmouseenter, null);
		CN_grid.addEvent(button, "mouseleave", _CN_button_onmouseleave, null);
	}
	CN_grid.addEvent(button, "click", this.box_onclick, this);
	CN_grid.addEvent(cell, "keydown", this._cell_onkeydown, this);

	this._img_src = CNFormManager.themeImagesPath + "lookup.gif";
	//this._img_width = 8;
	//this._img_wheight = 8;
}
wp.render = function(cell, node)
{
	var src;//, width, height;
	
	var buttonText = node.getAttribute("buttonText");
	{
		if (buttonText)
		{
			cell.style.paddingTop = "3px";
			cell.style.paddingBottom = "3px";
			
			var b = cell.children[1];			
			b.style.marginLeft = "3px";
			b.style.marginRight = "3px";
			if (cell.clientWidth && cell.clientWidth > 0)			
				b.style.width = cell.clientWidth - 8 + "px";
			else
				b.style.width = parseInt(cell.style.width) - 8 + "px";
			
			b.style.height = "23px";
			
			var textSpan = document.createTextNode(String(buttonText));				
			
			var buttonTextColor = node.getAttribute("buttonTextColor");			
			if (buttonTextColor)
			{
				var font = document.createElement("font");
				font.style.color = buttonTextColor;
				font.appendChild(textSpan);
				b.appendChild(font);
			}
			else
				b.appendChild(textSpan);
			
			cell.children[0].textContent = Util.xmlText(node);
			
			return;
		}
	}
	
	var imgAttr = node.getAttribute("img");
	if(imgAttr)
	{
		src = String(imgAttr);
		/*var attr = node.getAttribute("imgWidth");
		if(attr) 
		{
			var w = parseInt(attr, 10);
			width = w;
			//b.style.width = w + 4;
		}	
		else width = this._img_width;
		var attr = node.getAttribute("imgHeight");
		if(attr) 
		{
			var h = parseInt(attr, 10);
			height = h;
			//b.style.height = h + 4;
		}	
		else height = this._img_height;*/
	}
	else if(imgAttr != "")
	{
		src = this._img_src;
		//width = this._img_width;
		//height = this._img_height;
	}
	
	if(src)
	{
		var img = document.createElement("img")
		var b = cell.children[1];

		if(CNFormManager.vista)
		{
			img.style.position = "absolute";
			img.style.left = "7px";
			img.style.top = "4px";
		}
		img.src = src;
		img.width = img.height = 8;
		/*if(width) 
		{
			b.firstChild.width = width + 5;
		}
		if(height) 
		{
			b.firstChild.height = height + 5;
		}*/
		b.appendChild(img);
	}
	
	//img.style.userSelect = "none";

	cell.children[0].textContent = Util.xmlText(node);
}


// Image. =====================================
var ImageTypeCell = CN_grid.CellTypes["Image"] = function(colTag){}
ImageTypeCell.cn_tagName = "image";
var wp = ImageTypeCell.prototype;
wp.isValid = function(cell){ return true; }
// Event handlers.
wp.box_onclick = function()
{
	var box = Util.eventTarget();
	var jsObject = CNUtil.findJSObject(box);
	
	var cell = CN_grid.findCell(box);
	if(jsObject.getCascadedReadOnly(cell)) return;
	var row = cell.parentElement;
	
	cell.focus();

	if(cell.colTag.autoPostBack) 
	{
		jsObject.setChangedValue(row, cell, null);
		jsObject.fireChangedEvent(row, cell, null);
		jsObject.postBack(row, cell, null);
	}
}
wp.prerender = function(cell, colTag)
{
	var imageWidth = colTag.node.getAttribute("imageWidth");
	var imageHeight = colTag.node.getAttribute("imageHeight");
	if(imageWidth) this._img_width = imageWidth * 1;
	if(imageHeight) this._img_height = imageHeight * 1;

	cell.style.padding = "0.25em"; /* !! */
}
wp.render = function(cell, node)
{
	var img = document.createElement("img")
	cell.appendChild(img);

	if(this._img_width) img.width = this._img_width;
	if(this._img_height) img.height = this._img_height;

	img.style.userSelect = "none";
	CN_grid.addEvent(img, "click", this.box_onclick, this);

	var text = Util.xmlText(node);
	if(text == "") img.style.display = "none";
	else img.src = Util.xmlText(node);
}

// ImageButton. =====================================
var ImageButtonTypeCell = CN_grid.CellTypes["ImageButton"] = function(colTag){}
ImageButtonTypeCell.cn_tagName = "imagebutton";
var wp = ImageButtonTypeCell.prototype;
wp.isValid = function(cell){ return true; }
// Event handlers.
wp.box_onclick = ImageTypeCell.prototype.box_onclick;

var bproto = ButtonTypeCell.prototype;
wp._button_onmouseenter = bproto._button_onmouseenter;
wp._button_onmouseleave = bproto._button_onmouseleave;
wp._button_onmousedown = bproto._button_onmousedown;
wp._button_onmouseup = bproto._button_onmouseup;
wp._createSpanButton = bproto._createSpanButton;
wp.prerender = function(cell, colTag)
{
	cell.style.padding = "0.25em";
	if(CNFormManager.vista)
	{
		cell.style.paddingTop = "3px";
		var button = this._createSpanButton();
		cell.appendChild(button);		
	}
}
wp.render = function(cell, node)
{
	var button;
	if(CNFormManager.vista)
	{
		button = cell.firstChild;
	}
	else
	{
		button = document.createElement("button");
		cell.appendChild(button);
	}

	var img = document.createElement("img");
	button.appendChild(img);
	
	if(CNFormManager.vista)
	{
		img.style.position = "absolute";
		img.style.left = "2px";
		img.style.top = "2px";
	}	

	var attr = node.getAttribute("imgWidth");
	if(attr) 
	{
		var width = img.width = parseInt(attr, 10);
		var w = Math.max(width + 3, 6);
		if(CNFormManager.vista) button.firstChild.style.width = w;
		else button.style.width = w;
	}
	
	attr = node.getAttribute("imgHeight");
	if(attr) 
	{
		var height = img.height = parseInt(attr, 10);
		var h = Math.max(height + 3, 6);
		if(CNFormManager.vista) button.firstChild.style.height = h;
		else button.style.height = h;
	}

	button.style.userSelect = "none";
	CN_grid.addEvent(button, "click", this.box_onclick, this);

	var text = Util.xmlText(node);
	if(text == "") img.style.display = "none";
	else img.src = Util.xmlText(node);
}


// Comment. =============================
var CommentTypeCell = CN_grid.CellTypes["Comment"] = function(colTag, grid)
{
	this._maxLength = -1;
	this._grid = grid;
}
CommentTypeCell.cn_tagName = "comment";
CommentTypeCell.activePopup = null;
CommentTypeCell.showPopup = function(l, cell)
{
	CommentTypeCell.activePopup = l;
	CommentTypeCell._currentCell = cell;

	CNDialogManager.showDialog(l, [CommentTypeCell, "ondialogresult"], true);
}
CommentTypeCell.ondialogresult = function(dialog, cancel)
{
	if(cancel) return;
	var box = CNDialogManager.getContents(dialog).lastChild;
	var jso = CommentTypeCell._currentCell.colTag.typeObject;
	jso.commitChange(CommentTypeCell._currentCell, box.textContent);
	CommentTypeCell.activePopup = null;
	CommentTypeCell._currentCell = null;
}
CommentTypeCell._textarea_onkeypress = function()
{
	var jso = CommentTypeCell._currentCell.colTag.typeObject;
	var dialog = CommentTypeCell.activePopup;
	if(jso._maxLength != -1)
	{
		var box = CNDialogManager.getContents(dialog).lastChild;
		if(box.value.length >= jso._maxLength) CNUtil.cancelEvent();
	}
}
CommentTypeCell._textarea_onpaste = function()
{
	var jso = CommentTypeCell._currentCell.colTag.typeObject;
	var dialog = CommentTypeCell.activePopup;	
	if(jso._maxLength != -1)
	{
		var box = CNDialogManager.getContents(dialog).lastChild;
		var text = CN_grid.readClipboardText();
		if(box.value.length + text.length >= jso._maxLength)
		{
			CNUtil.cancelEvent();
			var textLength = jso._maxLength - box.value.length;
			if(textLength > 0) 
			{
				CN_grid.insertTextAtSelection(text.substr(0, textLength));
			}
		}
	}
}

var wp = CommentTypeCell.prototype;
wp.isFocusable = true;
wp.isValid = function(cell){ return true; }
// Event handlers.
wp._box_onclick = function()
{
	var cell = CN_grid.findCell(Util.eventTarget());

	var row = cell.parentElement;
	var jsObject = CNUtil.findJSObject(row);
	if(jsObject._disabled) return;

	cell.colTag.typeObject._showDialog(cell, jsObject);
}
wp._createVistaDialog = function()
{
	var dialog = CNDialogManager.createVistaDialog();
	dialog.style.width = "600px";
	dialog.style.height = "360px";
	return dialog;
}
wp._createDialog = function()
{
	var popupDiv = CNDialogManager.createDialog("");
	popupDiv.style.width = "620px"; 
	popupDiv.style.height = "380px";
	return popupDiv;
}
wp._showDialog = function(cell, grid)
{
	var readOnly = grid.getCascadedReadOnly(cell);
	var dialog = $('__gridCommentDialog');
	if(!dialog) 
	{
		if(CNFormManager.vista) dialog = this._createVistaDialog();
		else dialog = this._createDialog();
		dialog.id = "__gridCommentDialog";
		this._createDialogContents(dialog);	
	}
	CNDialogManager.setCaption(dialog, "Comment " + (readOnly ? "viewer" : "editor") 
												+ " - " + cell.colTag.node.getAttribute("caption"));
	var contents = CNDialogManager.getContents(dialog);
												
	// Textarea.
	contents.lastChild.textContent = cell._value;
	contents.lastChild.readOnly = readOnly;

	// Save button.
	var bottom = CNDialogManager.getBottom(dialog);
	bottom.firstChild.style.visibility = readOnly ? "hidden" : "inherit";
	// Close button.
	var closeText = readOnly ? "Close" : "Cancel";
	if(CNFormManager.vista) bottom.lastChild.jsObject.loadData(Util.wrapIntoNode({value: closeText}));
	else bottom.lastChild.textContent = closeText;

	CommentTypeCell.showPopup(dialog, cell);
}

wp._createDialogContents = function(dialog)
{
	var parent = CNDialogManager.getContents(dialog);
	var textArea = Util.createElementFromHTML("<textarea class=commentBoxTextArea>");
	parent.appendChild(textArea);
	CN_grid.addEvent(textArea, "keypress", CommentTypeCell._textarea_onkeypress, null);
	CN_grid.addEvent(textArea, "paste", CommentTypeCell._textarea_onpaste, null);

	var saveButton = CNDialogManager.createBottomButton(dialog, "Save", true);
	saveButton.style.width = "80px";
	var cancelButton = CNDialogManager.createBottomButton(dialog, "Cancel", false);
	cancelButton.style.width = "80px";
}

wp.commitChange = function(cell, val)
{
	var row = cell.parentElement;
	var jsObject = CNUtil.findJSObject(row);
		
	var value = cell._value = String(val);
	var rowID = String(row.xmlNode.getAttribute("id"));
	var contentNode = jsObject.changedDoc.createCDATASection(value);
	var node = jsObject._getChangedNode(row, cell);
	if(node.hasChildNodes) node.replaceChild(contentNode, node.firstChild);
	else node.appendChild(contentNode);
	
	if(value.length > 0)
	{
		if(cell.children[0].children.length == 0) this._attachImage(cell);
	}
	else
	{
		if(cell.children[0].children.length > 0) Util.removeElement(cell.children[0].children[0]);
	}

	if(cell.colTag.autoPostBack) 
	{
		jsObject.fireChangedEvent(row, cell, value);
		jsObject.postBack(row, cell, value);
	}
}


var bproto = ButtonTypeCell.prototype;
wp._button_onmouseenter = bproto._button_onmouseenter;
wp._button_onmouseleave = bproto._button_onmouseleave;
wp._button_onmousedown = bproto._button_onmousedown;
wp._button_onmouseup = bproto._button_onmouseup;
wp._createSpanButton = bproto._createSpanButton;
wp.prerender = function(cell, colTag)
{
	colTag.typeObject = this;

	var button;
	
	if(CNFormManager.vista)
	{
		cell.style.paddingTop = "3px";
		button = this._createSpanButton();
		cell.appendChild(button);		
	}
	else
	{
		button = Util.createElementFromHTML("<button class=xllookupbutton>")
		cell.appendChild(button);
		CN_grid.addEvent(button, "mouseenter", _CN_button_onmouseenter, null);
		CN_grid.addEvent(button, "mouseleave", _CN_button_onmouseleave, null);
	}
	
	var imgSrc = colTag.node.getAttribute("imgSrc");
	if(imgSrc) this._img_src = imgSrc;
	else this._img_src = CNFormManager.themeImagesPath + "comment.gif";
	
	var attr = colTag.node.getAttribute("maxLength");
	if(attr) this._maxLength = parseInt(attr, 10);

	CN_grid.addEvent(button, "click", this._box_onclick, this);
}
wp._attachImage = function(cell)
{
	var img = document.createElement("img")
	cell.children[0].appendChild(img);
	
	img.style.userSelect = "none";
	img.src = this._img_src;
	img.width = 8;
	img.height = 8;
	if(CNFormManager.vista)
	{
		img.style.position = "absolute";
		img.style.top = "4px";
		img.style.left = "4px";
	}
}

wp.render = function(cell, node)
{
	var value = String(Util.xmlText(node));
	cell._value = value;
	
	if(value.length > 0) this._attachImage(cell);
	if(node.getAttribute("opened") == "true") this._showDialog(cell, this._grid);		
}


// ComboBox. =====================================
var ComboBoxCell = CN_grid.CellTypes["ComboBox"] = function(colTag, grid)
{
	this._combobox = null;
	this._grid = grid;
}

ComboBoxCell.cn_tagName = "combobox";
var wp = ComboBoxCell.prototype;
wp.isFocusable = true;
wp.focusCell = function(cell) { // #1036-3
	var typeObject = cell.colTag.typeObject;
	CN_combobox.currentCombobox = typeObject._combobox;
	typeObject._combobox.element = cell.firstChild;
	CN_combobox.currentCombobox.focus();
}

wp._cell_beforedeactivate = function()
{
	if(!CN_grid.relatedTarget() || CN_grid.relatedTarget() == document.body) CNUtil.cancelEvent();
	else 
	{
		Util.eventTarget().tabIndex = -1;
	}
}
wp.isValid = function(cell){ return true; }
wp.set_readOnly = function(cell, readOnly)
{
	cell.className = readOnly ? "cellSpan xlgridcomboReadOnly" : "cellSpan";
}
wp.prerender = function(cell, colTag)
{
	cell.style.paddingTop = CNFormManager.vista ? 1 : 2; // !!!	

	var node = colTag.node.cloneNode(true);
	
	var combobox = this._combobox = new CN_combobox();
	this._grid._jsObjects.push(combobox);

	var l = combobox.createElementOnly(node, true);
	cell.appendChild(l);
	
	combobox.initData(node);
	
	combobox.onchange = this._combobox_onchange;
	combobox.oncheckreadonly = this._combobox_oncheckreadonly;
		
	CN_grid.addEvent(cell, "keydown", this._cell_onkeydown, this);
	CN_grid.addEvent(cell, "focusout", this._cell_beforedeactivate, this);

	//var w = parseInt(Util.getStyle(cell, "width")) - parseInt(Util.getStyle(cell, "paddingLeft")) - parseInt(Util.getStyle(cell, "paddingLeft"));
	//l.style.width = w - 3; // ?
	l.style.width = "100%";
}
wp._cell_onkeydown = function()
{
	if(Util.eventTarget().className != 'cellSpan') return;
	var cell = CN_grid.findCell(Util.eventTarget());
	if(cell.contains(Util.eventTarget()) && Util.eventTarget() != cell) return;
	if(Event.keyValue(CN_grid.currentEvent()) != 9) CNUtil.cancelEvent();
	
	var typeObject = cell.colTag.typeObject;
	CN_combobox.currentCombobox = typeObject._combobox;
	typeObject._combobox.element = cell.firstChild;
	//CN_grid.dispatchEvent(cell.children[0], "keydown");
	CN_combobox.currentCombobox.element_onkeydown();
}
wp._combobox_onchange = function(ev)
{
	if(!ev.isDirty) return; // #1036-4

	// Executed in combobox context.
	var cell = this.element.parentElement;
	var row = cell.parentElement;

	var jsObject = CNUtil.findJSObject(cell);
	var value = ev.selectedIndex;
	if(value == -2) 
	{
		value = ev.value;
		var node = jsObject._getChangedNode(row, cell);
		if(node && value !== null) node.setAttribute("text", value);
	}
	else
	{
		jsObject.setChangedValue(row, cell, value);
	}
	jsObject.fireChangedEvent(row, cell, value);
	if(cell.colTag.autoPostBack) jsObject.postBack(row, cell, value);
}

wp._combobox_oncheckreadonly = function()
{
	// Executed in combobox context.
	var cell = CN_grid.findCell(Util.eventTarget());
	var jsObject = CNUtil.findJSObject(cell);
	var ro = jsObject.getCascadedReadOnly(cell);
	return ro;
}

wp.render = function(cell, node, tree_level, tree_index, tree_type, cellReadOnly)
{
	var row = cell.parentElement;
	var colTag = cell.colTag;

	var comboElement = cell.children[0];
	comboElement.style.left = "1px";
	
	if(this._combobox.popupOpened) {
		this._combobox.hidePopup();
	}
	
	// Temporary set element.
	this._combobox.element = comboElement;

	var valueSet = false;
	if(this._combobox._searchable)
	{
		this._combobox.set_tabIndex(-1);
		// Do we have free text?
		var attr = node.getAttribute("value");
		if(attr) 
		{
			this._combobox.set_textValue(String(attr));
			valueSet = true;
		}
	}

	if(!valueSet)
	{
		var ix = parseInt(Util.xmlText(node), 10);

		this._combobox.element._selectedIndex = ix;
		this._combobox._set_selectedIndex(true);
	}
		
	if(node.getAttribute("opened") == "true")
	{
		CN_grid._pendingCombo = {jsObject: this._combobox, element: comboElement};
	}
	
	this._combobox.element = null;

	if(this._grid._readOnly || cellReadOnly || colTag.readOnly || cell.parentElement.readOnly) 
	{
		cell.className = "cellSpan xlgridcomboReadOnly";
	}
}

// MutableComboBox. =====================================
var MutableComboBoxCell = CN_grid.CellTypes["MutableComboBox"] = function(colTag, grid)
{
	this._grid = grid;
}

MutableComboBoxCell.cn_tagName = "mutablecombobox";
var wp = MutableComboBoxCell.prototype;
wp.isFocusable = true;
wp.focusCell = function(cell) { // #1036-3
	var combo = cell.children[0].jsObject;	
	combo.focus();
}
wp.isValid = function(cell)
{
	var combo = cell.children[0].jsObject;
	return !combo._searchable || combo.__canBeEmpty || combo.get_textValue() != "";
}
wp._combobox_onchange = ComboBoxCell.prototype._combobox_onchange;
wp._combobox_oncheckreadonly = ComboBoxCell.prototype._combobox_oncheckreadonly;
wp.set_readOnly = ComboBoxCell.prototype.set_readOnly;
wp._cell_onkeydown = function()
{
	if(Util.eventTarget().className != 'cellSpan') return;

	var cell = CN_grid.findCell(Util.eventTarget());
	if(cell.contains(Util.eventTarget()) && Util.eventTarget() != cell) return;
	if(Event.keyValue(CN_grid.currentEvent()) != 9) CNUtil.cancelEvent();
	CN_grid.dispatchEvent(cell.children[0], "keydown");
}
wp._cell_beforedeactivate = function()
{
	if(CN_grid.relatedTarget() == document.body) CNUtil.cancelEvent();
	else Util.eventTarget().tabIndex = -1;
}
wp.prerender = function(cell, colTag)
{
	cell.style.paddingTop = CNFormManager.vista ? 1 : 2; // !!!
	cell.style.paddingRight = 2;
	CN_grid.addEvent(cell, "focusout", this._cell_beforedeactivate, this);
	CN_grid.addEvent(cell, "keydown", this._cell_onkeydown, this);
}
wp.render = function(cell, node, tree_level, tree_index, tree_type, cellReadOnly)
{
	var combobox = new CN_combobox();
	this._grid._jsObjects.push(combobox);

	var colTag = cell.colTag;
	
	node = node.cloneNode(true);

	var colAttr = colTag.node.getAttribute("canBeEmpty");
	var cAttr = node.getAttribute("canBeEmpty");
	if(colAttr && !cAttr)
	{
		node.setAttribute("canBeEmpty", String(colAttr));
	}
	
	combobox.__canBeEmpty = true;
	if(cAttr) combobox.__canBeEmpty = cAttr == "true";
	
	var searchableAttr = colTag.node.getAttribute("searchable");
	if(searchableAttr) node.setAttribute("searchable", String(searchableAttr));
	
	var apAttr = colTag.node.getAttribute("autoPostBack");
	if(apAttr) node.setAttribute("autoPostBack", String(apAttr));
	
	combobox._inGrid = true; // As we can't pass this as parameter.
	var l = combobox.createElement(node, cell);
	
	combobox.onchange = this._combobox_onchange;
	combobox.oncheckreadonly = this._combobox_oncheckreadonly;

	//var w = parseInt(Util.getStyle(cell, "width")) - parseInt(Util.getStyle(cell, "paddingLeft")) - parseInt(Util.getStyle(cell, "paddingRight"));
	//l.style.width = w - 3; // ?
	l.style.width = "100%";


	var valueSet = false;
	if(combobox._searchable)
	{
		// Do we have free text?
		var attr = node.getAttribute("value");
		if(attr) 
		{
			combobox.set_textValue(String(attr));
			valueSet = true;
		}
	}

	if(!valueSet)
	{
		var ix = -1;
		var attr = node.getAttribute("selectedValue");
		if(attr) ix = parseInt(String(attr), 10);
		combobox.element._selectedIndex = ix;
		combobox._set_selectedIndex(true);
	}

	if(node.getAttribute("opened") == "true")
	{
		CN_grid._pendingCombo = {jsObject: combobox, element: l};
	}

	if(this._grid._readOnly || cellReadOnly|| colTag.readOnly || cell.parentElement.readOnly) 
	{
		cell.className = "cellSpan xlgridcomboReadOnly";
	}
}


// WrapText. ====================================================
var WrapTextCell = CN_grid.CellTypes["WrapText"] = function(colTag)
{
	this._maxLength = -1;
}
WrapTextCell.cn_tagName = "wraptext";

WrapTextCell._toEditMode = function(cell)
{
	cell._isEdited = true;
	var table = cell.children[0];
	table._borderColor = Util.getStyle(table, "borderColor");
	table.style.borderColor = Util.getStyle(table, "xl--edit-border-color");
	var div = table.rows[0].cells[0].children[0];
	
	CN_grid.addEvent(div, "blur", WrapTextCell._div_onblur, WrapTextCell);
	CN_grid.addEvent(div, "keydown", WrapTextCell._div_onkeydown, WrapTextCell);
	CN_grid.addEvent(div, "keypress", WrapTextCell._div_onkeypress, WrapTextCell);
	CN_grid.addEvent(div, "resize", WrapTextCell._div_onresize, WrapTextCell);

	div.focus();
	div.contentEditable = true;
	div.focus();
}

WrapTextCell._toDefaultMode = function(cell)
{
	cell._isEdited = false;
	var table = cell.children[0];
	table.style.borderColor = table._borderColor;
	var div = table.rows[0].cells[0].children[0];

	div.contentEditable = false;

	CN_grid.removeEvent(div, "blur", WrapTextCell._div_onblur, WrapTextCell);
	CN_grid.removeEvent(div, "keydown", WrapTextCell._div_onkeydown, WrapTextCell);
	CN_grid.removeEvent(div, "keypress", WrapTextCell._div_onkeypress, WrapTextCell);
	CN_grid.removeEvent(div, "resize", WrapTextCell._div_onresize, WrapTextCell);
	
	// Remove html;)
	div.textContent = div.textContent;

	var row = cell.parentElement;

	var text = div.textContent;
	
	var jsObject = CNUtil.findJSObject(cell);
	var node = jsObject._getChangedNode(row, cell);
	if(node)
	{
        // Clean up node.
        node.textContent = "";
        // Server expects CData.
		node.appendChild(jsObject.changedDoc.createCDATASection(text));
	}
	jsObject.fireChangedEvent(row, cell, text);
	if(cell.colTag.autoPostBack) jsObject.postBack(row, cell, text);
}

WrapTextCell._div_onresize = function()
{
	var cell = CN_grid.findCell(Util.eventTarget());
	var table = cell.children[0];
	var div = table.rows[0].cells[0].children[0];
	cell.style.height = table.offsetHeight + 1;

	var grid = CNUtil.findJSObject(table);
	if(grid.selectedTR == cell.parentElement)
	{
		grid.rowBorder_select(cell.parentElement);
	}
}

WrapTextCell._div_onkeypress = function()
{
	var cell = CN_grid.findCell(Util.eventTarget());
	var jsObject = cell.colTag.typeObject;
		
	if(jsObject._maxLength != -1 && Util.eventTarget().textContent.length >= jsObject._maxLength)
	{
		CNUtil.cancelEvent();
	}

	if(Event.keyValue(CN_grid.currentEvent()) ==  13) // Enter
	{
		Event.cancel(CN_grid.currentEvent());
		return;
	}
}

WrapTextCell._div_onpaste = function()
{
	var cell = CN_grid.findCell(Util.eventTarget());
	var jsObject = cell.colTag.typeObject;

	if(jsObject._maxLength == -1) return; // No limit.
	var text = CN_grid.readClipboardText();

	if(Util.eventTarget().textContent.length + text.length >= jsObject._maxLength)
	{
		CNUtil.cancelEvent();
		var textLength = jsObject._maxLength - Util.eventTarget().textContent.length;
		if(textLength > 0)
		{
			CN_grid.insertTextAtSelection(text.substr(0, textLength));
		}
	}
}


WrapTextCell._div_onkeydown = function()
{
	if(Event.keyValue(CN_grid.currentEvent()) ==  13) // Enter
	{
		Event.cancel(CN_grid.currentEvent());
		return;
	}

	// Disallow any WYSIWYG commands.
	if(!CN_grid.currentEvent().ctrlKey) return;

	switch(Event.keyValue(CN_grid.currentEvent()))
	{
		case 86: // V paste
		case 67: // C copy
		case 88: // X cut
		case 37: // left
		case 38: // up
		case 39: // right
		case 40: // down
		case 36: // home
		case 35: // end
		case 45: // insert
		case 46: // del
			return;
	}

	CNUtil.cancelEvent();
}


WrapTextCell._div_onmousedown = function()
{
	var cell = CN_grid.findCell(Util.eventTarget());
	if(cell._isEdited) return;

	var jsObject = CNUtil.findJSObject(cell);
	if(jsObject.getCascadedReadOnly(cell)) return;

	WrapTextCell._toEditMode(cell);
}

WrapTextCell._div_onblur = function()
{
	var cell = CN_grid.findCell(Util.eventTarget());
	WrapTextCell._toDefaultMode(cell);
}


var wp = WrapTextCell.prototype;
wp.isValid = function(cell){ return true; }
wp.noDefaultStaticRectangle = true;
wp.isFocusable = true;
wp.focusCell = function(cell)
{
	WrapTextCell._toEditMode(cell);
}
wp.prerender = function(cell, colTag)
{
	cell.style.paddingTop = cell.style.paddingBottom = 0; // Left padding is used for tree node leveling.
	var wrap = document.createElement("table");
	wrap.className = "wrapTextTable";
	wrap.border = 0;
	wrap.cellSpacing = wrap.cellPadding = 0;
	var row = wrap.insertRow(-1);
	row.vAlign = "middle";
	row.insertCell(-1).appendChild(document.createElement("div"));
	cell.appendChild(wrap);
	var table = cell.children[0];
	var div = table.rows[0].cells[0].children[0];
	div._isCellDiv = true;
	CN_grid.addEvent(div, "mousedown", WrapTextCell._div_onmousedown, WrapTextCell);
	CN_grid.addEvent(div, "paste", WrapTextCell._div_onpaste, WrapTextCell);

	if(colTag.fixedFont) div.style.fontFamily = "Courier New";
	if(colTag.bold) div.style.fontWeight = "bold";

	var attr = colTag.node.getAttribute("textColor");
	if(attr) div.style.color = String(attr);

	var attr = colTag.node.getAttribute("maxLength");
	if(attr) this._maxLength = parseInt(attr, 10);

	if(cell._showEditorRectangle) // Dynamicgrid2
	{
		table.style.borderColor = Util.getStyle(table, "xl--edit-border-color");
	}
}
wp.render = function(cell, node)
{
	var table = cell.children[0];
	
	var value = String(Util.xmlText(node)).replace(/\t/g,"    ");
	table.rows[0].cells[0].children[0].textContent = value;
	
	var color = cell.Util.getStyle(parentElement, "backgroundColor");
	if(color != "transparent") table.style.borderColor = color;
}


// TreeNode. ====================================================
var TreeNodeCell = CN_grid.CellTypes["TreeNode"] = function(colTag, grid)
{
	this.grid = grid;
}
var wp = TreeNodeCell.prototype;
wp.isValid = function(cell){ return true; }
wp.prerender = function(cell, colTag)
{
}
wp.render = function(cell, node, level, index, nodeType)
{
	cell.style.paddingTop = 0;
	this.grid.tree_buildNodeTemplate(cell);
	this.grid.tree_buildNode(cell.firstChild, cell, node, level, index, nodeType);
} 
