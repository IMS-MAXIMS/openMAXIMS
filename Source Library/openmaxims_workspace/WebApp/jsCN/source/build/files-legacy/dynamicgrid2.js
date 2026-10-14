/*
	v. 2.0.4
	+ Grid 2.85
	+ ...
	+ FixedString
	+ isTree support.
	+ selectedRow => row.id support
	+ ...
	+ initial release.
*/

function CN_dynamicgrid2()
{
	this.base = CN_grid;
	this.base();
	this._tagPrefix = "dynamicgrid2";
	this._clonedNode = null;
	this._clonedRowsNode = null;
	this._isTreeGrid = false;
}
CN_dynamicgrid2.prototype = new CN_grid();
var proto = CN_dynamicgrid2.prototype;

// Override.
proto.grid_prebuildTable = proto.prebuildTable;
proto.prebuildTable = function(node)
{
	// Do nothing.
}

// Override.
proto.grid_loadData = proto.loadData;
proto.loadData = function(node)
{
	//this._oldRowsDivWidth = 0; // Reset column widths flag.
	var attr = node.getAttribute("isTree");
	if(attr == "true")
	{
		this.tree_init(node);
		this._isTreeGrid = true;
	}
	else if(attr == "false") 
	{
		this._isTreeGrid = false;
		this.tree_inited = false
	}

	var changeHeaderSelector = false;
	var changeRowsSelector = false;
	var attr = node.getAttribute("selectorVisible");
	if(attr)
	{
		var oldValue = this._selectorVisible;
		this._selectorVisible = attr == "true";
		if(oldValue != this._selectorVisible) 
		{
			changeHeaderSelector = changeRowsSelector = true;
		}
	}

	this._resetScrollPosition = node.getAttribute("resetScrollPosition") == "true";
	if(this._resetScrollPosition) this.rowsDiv.scrollTop = 0;

	var cols = node.selectNodes("col");
	var noColsNode = node.selectSingleNode("cols");
	if(cols.length > 0 || changeHeaderSelector || noColsNode)
	{
		// Store cols.
		if(cols.length > 0 || noColsNode) this._clonedNode = node.cloneNode(true);
		this.cleanCols();
		if(this._clonedNode) this.grid_prebuildTable(this._clonedNode);
	}

	attr = node.getAttribute("treeAutoPostBack");
	if(attr) this._treeAutoPostBack = attr == "true";

	attr = node.getAttribute("readOnly");
	if(attr) this.set_readOnly(attr == "true");

	var idAttr = node.getAttribute("selectedRowID");
	var id;
	if(idAttr) id = String(idAttr)

	attr = node.getAttribute("allowClearSelection");
	if(attr) this._allowClearSelection = attr == "true";

	this._resizeColumns(); // Fast pass on just template/header.

	var rows = node.selectSingleNode("rows");
	if(rows || changeRowsSelector) 
	{
		// Store rows.
		if(rows) 
		{
			this._clonedRowsNode = rows.cloneNode(true);
		
			// Reset selection if no rows arrived.
			if(!this._clonedRowsNode.hasChildNodes && !id) this._pendingSelectedRow = -1;
		}
						
		this.cleanTable();
		if(id !== undefined) this._pendingSelectedRow = id;
		if(rows) this.fillTable(this._clonedRowsNode);
	}
	else if(idAttr) this.set_selectedRow(id);
	
	this._loadHeader(node);
	this._loadFooter(node);	
}

proto.set_selectedRow = function(value)
{
	if(value != "-1")
	{
		var row = this.rowsDiv.all["row" + value];
		if(!row) return;
		this._selectedRow = row.rowIndex;
		this._selectedRowDiv = row;
	}
	else
	{
		this._selectedRow = -1
		this._selectedRowDiv = null;
	}

	if(!this.isReady) return;
	
	this._set_selectedRow();
}

proto._set_selectedRow = function()
{
	if(this._selectedRow == -1) this.deselectRow();
	else if(this._selectedRowDiv)
	{
		this.selectRow(this._selectedRowDiv)
		if(this.alwaysScrollToSelected) 
		{
			this.rowsDiv.scrollTop = this._selectedRowDiv.offsetTop;
		}
	}
	else 
	{
		this.deselectRow();
	}
}

// Override.
proto._filterSelectionData = function(selectionData)
{
	if(this._selectedRowDiv && this._selectedRow != -1) 
	{
		var id = this._selectedRowDiv.id;
		selectionData.setAttribute("selectedRowID", id.substr(3)); // cut 'row' prefix.
	}
}

// Override.
proto.grid_selectRow = proto.selectRow;
proto.selectRow = function(l, doNotFireEvent)
{
	if(!l.isSelectable) return;

	this.grid_selectRow(l, doNotFireEvent);
	
	this._selectedRowDiv = l;
}

proto._setSelectorIterator = function(parent, display)
{
	// Change selector for other nodes.
	var rows = parent.children;
	var count = rows.length;
	for(var i = count - 1; i >= 0; i--)
	{
		var row = rows[i];
		if(row.isNodeContainer)
		{
			this._setSelectorIterator(row, display);
		}
		else if(row.rowIndex !== undefined)
		{
			row.children[0].style.display = display;
		}
	}
}

proto.cleanCols = function()
{
	CNUtil.cleanElement(this.headerRow);
	CNUtil.cleanElement(this.templateRow);	
	CNUtil.cleanElement(this.folderTemplateRow);	
}

 // Override.			
proto.appendRow = function(rowNode, parent, parentRowIndex, tree_level, tree_index, tree_type)
{
	var row = this.templateRow.cloneNode(true);
	parent.appendChild(row);
	
	var attr = rowNode.getAttribute("id");
	if(attr) row.id = "row" + attr;
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
		var clonedColTag = cell.colTag = CNUtil.cloneObject(colTag);
		
		var colNode = cellNode;

		this._setCommonCellFeatures(cell, cellNode, clonedColTag);
		
		if(this._isTreeGrid && j == 0)
		{
			// First column always contains treenode.
			var nodeDiv = this.tree_buildNodeTemplate(row);
			nodeDiv.style.position = "absolute";
			nodeDiv.style.left = this._selectorVisible ? 20 : 0;
			nodeDiv.style.top = 0;
			this.tree_buildNode(nodeDiv, cell, cellNode, tree_level, tree_index, tree_type);
			clonedColTag.autoPostBack = this._treeAutoPostBack;
		}

		if(cellNode.getAttribute("empty") != "true")
		{
			var renderer = CN_grid.CellTypes[clonedColTag.type];
			if(!renderer) renderer = UnknownTypeCell;
			var renderer = new renderer(clonedColTag, this);
			clonedColTag.typeObject = renderer;
			
			if(!this._requiresReadOnlyWalk && renderer.set_readOnly)
			{
				this._requiresReadOnlyWalk = true;
			}

			var editorBox = cellNode.getAttribute("showEditorRectangle") == "always";
			if(editorBox) cell._showEditorRectangle = true;
			
			renderer.prerender(cell, clonedColTag);
			renderer.render(cell, cellNode, tree_level, tree_index, tree_type);
			
			if(editorBox && !renderer.noDefaultStaticRectangle) this._createCellEditBorder(cell);
		}
		else
		{
			cell._isEmpty = true;
		}
		j++;
	}
}

// Override.
proto.appendFolderRow = function(rowNode, childRows, parent, parentRowIndex, tree_level, tree_index, tree_type)
{
	var cellNodes = rowNode.childNodes;
	var cellNodesCount = cellNodes.length;
	
	var row;
	if(cellNodesCount > 1) row = this.templateRow.cloneNode(true);
	else row = this.folderTemplateRow.cloneNode(true);
	parent.appendChild(row);
	
	var attr = rowNode.getAttribute("id");
	if(attr) row.id = "row" + attr;
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

	if(childRows != null) rowNode.setAttribute("expandable", "true");

	var expanded = false;
	if(this._isTreeGrid && rowNode.getAttribute("expanded") != "false") expanded = true;

	// Render cells.
	for(var i = 0, j = 0; i < cellNodesCount; i++)
	{
		var cellNode = cellNodes[i];
		if(cellNode.nodeType != 1) continue;
		
		if(cellNode.tagName == "c")
		{
			var cell = cells[j + this.startDataCell];
			if(!cell) 
			{
				alert("ASSERT: !cell");
				continue;
			}

			if(this._isTreeGrid && j == 0)
			{
				// First column always contains treenode.
				var nodeDiv = this.tree_buildNodeTemplate(row);
				nodeDiv.style.position = "absolute";
				nodeDiv.style.left = this._selectorVisible ? 20 : 0;
				nodeDiv.style.top = 0;
				this.tree_buildNode(nodeDiv, cell, cellNode, tree_level, tree_index, tree_type);
				//cell.style.paddingLeft = nodeDiv.offsetWidth;
			}

			if(cellNode.getAttribute("empty") != "true")
			{
				
				cell.cellIndex = j;
				var colTag = this.colTags[j];
				var clonedColTag = cell.colTag = CNUtil.cloneObject(colTag);
	
				this._setCommonCellFeatures(cell, cellNode, clonedColTag);

				var renderer = CN_grid.CellTypes[clonedColTag.type];
				if(!renderer) renderer = UnknownTypeCell;
				var renderer = new renderer(clonedColTag, this);
				clonedColTag.typeObject = renderer;
				
				renderer.prerender(cell, clonedColTag);
				renderer.render(cell, cellNode, tree_level, tree_index, tree_type);
			}
			else
			{
				cell._isEmpty = true;
			}
			j++;
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
				if(cellNode.nodeType != 1 || childRow.tagName != "r")
				{
					alert("ASSERT: cellNode.nodeType != 1 || childRow.tagName != 'r'");
					continue;
				}
				
				this.appendAnyRow(childRow, containerDiv, row.rowIndex, tree_level + 1, n, tree_type);
				n++;
			}
		}
	}
}

proto._getNodeWidth = function(level)
{
	return 18 + (level + 1) * 21;
}

proto._setCommonCellFeatures = function(cell, cellNode, clonedColTag)
{
	this._updateColTag(cellNode, clonedColTag);

	var attr = cellNode.getAttribute("backcolor");
	if(attr) cell.style.backgroundColor = String(attr);
	attr = cellNode.getAttribute("textcolor");
	if(attr) cell.style.color = String(attr);

	attr = cellNode.getAttribute("width");
	if(attr && attr != "-1") 
	{
		cell.style.width = attr + "px";
		if(clonedColTag.fixedWidth)
		{
			delete clonedColTag.widthRatio;
		}
		else
		{
			clonedColTag.widthRatio = parseInt(attr, 10) / this._elementWidth;		
		}
	}
	else
	{
		delete clonedColTag.widthRatio;
	}

	this._setTooltip(cellNode, cell);
	
	if(clonedColTag.fixedFont) cell.style.fontFamily = "Courier New";
}

proto._updateColTag = function(colNode, clonedColTag)
{
	// Coltag related stuff.
	var readOnly = colNode.getAttribute("readOnly") == "true";
	var autoPostBack = colNode.getAttribute("autoPostBack") == "true";
	var canBeEmpty = colNode.getAttribute("canBeEmpty") != "false";
	
	var align = this._getAttribute(colNode, "align");
	var width = this._getAttribute(colNode, "width");
	var captionAlign = this._getAttribute(colNode, "captionAlign");
	var validationString = this._getAttribute(colNode, "validationString");
	var fixedWidthAttr = colNode.getAttribute("fixedWidth");
	if(fixedWidthAttr) clonedColTag.fixedWidth =  fixedWidthAttr == "true";
	clonedColTag.readOnly = readOnly;
	clonedColTag.autoPostBack = autoPostBack;
	clonedColTag.canBeEmpty = canBeEmpty;
	clonedColTag.align = align;
	clonedColTag.width = width;
	clonedColTag.fixedFont = this._getAttribute(colNode, "fixedFont") == "true";
	clonedColTag.bold = colNode.getAttribute("bold") == "true";
	clonedColTag.node = colNode;
	clonedColTag.validationString = validationString;
	clonedColTag.type = this._getAttribute(colNode, "type");

	// Use mutable only.
	if(clonedColTag.type == 'ComboBox') clonedColTag.type = 'MutableComboBox';
	if(clonedColTag.type == 'AnswerBox') clonedColTag.type = 'MutableAnswerBox';
}

// Override.
proto.isCellValid = function(cell)
{
	if(cell._isEmpty) return true;
	if(!cell.colTag) return true; // Tree node div.
	return cell.colTag.typeObject.isValid(cell);
}

// Override.
proto.tree_selectNodeDiv = function(l)
{
	if(!l) return;
	var l = l.parentElement.parentElement.lastChild;
	if(this.tree_selectedNodeDiv == l) return;
	
	this.tree_unselectNodeDiv();
	l.className = "nodeDivSelected";
	this.tree_selectedNodeDiv = l;
	this.tree_updateImage(l);
}

// Override
proto.tree_getContainerForNodeDiv = function(nodeDiv)
{
	return nodeDiv.parentElement.nextSibling;
}

// Override.
proto.tree_buildNode = function(nodeDiv, cell, node, level, index, nodeType)
{
	if(node.parentNode.tagName != "r") alert("Assert for r tag.")

	node.parentNode.setAttribute("nodeIndex", index);
	nodeDiv.node = node; // Watch for circular refs!
	nodeDiv.nodeLevel = level;
	node.setAttribute("nodeLevel", level);

	var children = nodeDiv.children;

	if(node.getAttribute("disable") == "true") nodeDiv.disabled = true; 
	
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

	//children[this.ix_textSpan].innerText = String(node.text);
	
	var expanded = this.tree_isExpanded(node);
	this.tree_updateImageToState(nodeDiv, expanded ? this.state_expanded : this.state_default);

	var padding = this._getNodeWidth(level);
	if(this.tree_buildNodeCheckbox(node, children, realType))
	{
		padding += 16;
	}	
	
	cell.style.paddingLeft = padding;
}


proto._grid_resizeColumns = proto._resizeColumns;
proto._resizeColumns = function()
{
	this._grid_resizeColumns();
}

proto._resizeRows = function(rowsDiv, colWidth, ix, rowsDivWidth, firstRowIndex)
{
	var startRowIndex = 0;
	if(!rowsDiv.isNodeContainer) startRowIndex = firstRowIndex;

	var children = rowsDiv.children;
	var length = children.length;
	for(var j = startRowIndex; j < length; j++)
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
				if(cell.colTag && cell.colTag.widthRatio && !cell.colTag.fixedWidth)
				{
					cell.style.width = cell.colTag.widthRatio * rowsDivWidth;
				}
				else
				{
					cell.style.width = colWidth;
				}
			}
		}
	}
}

proto._createCellEditBorder = function(cell)
{
	var l = document.createElement("<div class=cellHoverBorderDiv>");
	cell.appendChild(l);
	EditorBoxManager._setHoverBorderStyle(l, cell);
	l.style.width = "100%";
}


var FixedStringTypeCell = CN_grid.CellTypes["FixedString"] = function(colTag, grid)
{
	this.box = StringTypeCell.createBox();
	this._grid = grid;
}
FixedStringTypeCell.cn_tagName = "textbox";

var wp = FixedStringTypeCell.prototype;
var swp = StringTypeCell.prototype;
wp.getCellValue = swp.getCellValue;
wp.setCellValue = swp.setCellValue;
wp.isValid = swp.isValid;
wp.validateValue = swp.validateValue;
wp.commitChange = swp.commitChange;
wp.prerender = swp.prerender;
wp.render = function(cell, node)
{
	cell.style.width = "auto";
	var span = document.createElement("span");
	span.appendChild(document.createTextNode(node.text));
	cell.appendChild(span);
	cell.colTag.widthRatio = cell.colTag.width / this._grid._elementWidth;
	cell.style.width = cell.colTag.width;
}


// Grid support. ====================================================
var TableCell = CN_grid.CellTypes["Table"] = function(colTag)
{
}
TableCell.cn_tagName = "table";

var wp = TableCell.prototype;

wp.box_onclick = function()
{
	var cell = CN_grid.findCell(event.srcElement);			
		
	var cellTD = event.srcElement.parentElement;
	if (event.srcElement.parentElement.getAttribute("id"))
	{
		cell.setAttribute("tableCellId", event.srcElement.parentElement.getAttribute("id"));
	}
	var cellTR = cellTD.parentElement;	
	if (cellTD.parentElement.getAttribute("id"))
	{
		cell.setAttribute("tableRowId", cellTD.parentElement.getAttribute("id"));
	}
	
	var jsObject = CNUtil.findJSObject(cell);
	if(jsObject._disabled) return;
	
	var row = cell.parentElement;
	var jsObject = CNUtil.findJSObject(cell);
	jsObject.setChangedValue(row, cell, null);
	jsObject.fireChangedEvent(row, cell, null);
	//if(cell.colTag.autoPostBack)
	jsObject.postBack(row, cell, null);
}

wp.isValid = function(cell)
{
	return true; 
}

wp.prerender = function(cell, colTag)
{
	var jsObject = CNUtil.findJSObject(cell);

	//cell.style.paddingTop = 0;
	cell.style.padding = "0.25em";
	
	var tableNodesCount = cell.colTag.node.childNodes[0];
	
	//Create TABLE element
	var table  = document.createElement("table");
		table.setAttribute("border",cell.colTag.node.childNodes[0].getAttribute("border") ? cell.colTag.node.childNodes[0].getAttribute("border") : 0); 
		table.setAttribute("cellspacing","0") 
		table.setAttribute("bgcolor","#E0ECF8") 
		table.setAttribute("cellpadding","0") 
		table.style.width = "100%";		
		table.style.wordWrap = "break-word";
		table.style.borderCollapse = "collapse";	
		table.style.tableLayout = "fixed";		
	
	//Create COL element	
	var col = document.createElement("col");
		col.style.width = "100%";		
    
	//Set TABLE element style
	var tb = document.createElement("tbody");
	
	//TR level
	var trNodesCount = cell.colTag.node.childNodes[0].childNodes.length;
	for(var i = 0; i < trNodesCount; i++)
	{
		//cell.colTag.node.childNodes[i]
		var tr = document.createElement("tr");
			tr.setAttribute("id", cell.colTag.node.childNodes[0].childNodes[i].getAttribute("id"));	
		
		//TD level	
		var tdNodesCount = cell.colTag.node.childNodes[0].childNodes[i].childNodes.length;
		for(var j = 0; j < tdNodesCount; j++)
		{
			//cell.colTag.node.childNodes[i].childNodes[j]
			var td = document.createElement("td");				
				td.setAttribute("id", cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("id"));	
			
			td.style.borderWidth = "0px";
			td.style.padding = "0px";
			
			//Attributes			
			colSpan = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("colspan");
			if(colSpan) {
				td.colSpan = colSpan; 
			}
			rowSpan = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("rowspan");
			if(rowSpan) {
				td.rowSpan = rowSpan; 
			}
			
			//Value
			value = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].childNodes[0];		
			
			//Tooltip
			tooltip = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].childNodes[1];		
			if(tooltip) 
			{
			
				var hcell = document.createElement("span");
				Tooltip.attach(td, String(tooltip.text));
			}			
			
			//Type		
			type = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("type");
			if(type)
			{	
				var d;
				if (type == "Image")
				{
					//Set width
					width = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("width");							
					if(width) {
						td.setAttribute("width", width + "px");
					}
					
					//Set align
					align = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("align");							
					if(align) {
						td.setAttribute("align", align);
					}
					
					if (value && value.text)
					{
						td.innerHTML ="<img style=\"display: block; width: " + width + "px; margin:2px; padding:2px; border:none\" src=\"" + value.text + "\">";
					}
					else
					{
						td.innerHTML ="<img style=\"display: block; width: " + width + "px; margin:2px; padding:2px; border:none\" src=\"" + CNFormManager.neutralImagesPath + "spacer.gif"; + "\">";						
					}
					
					tr.appendChild(td);	
					continue;	
				}
				if (type == "String")
				{	
					width = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("width");		
					if(width) 
					{
						table.style.tableLayout = "auto";
						width += "px;";						
						td.setAttribute("width", width);
					}
					else 
					{
						td.setAttribute("width", "auto");
					}
					
					var swp = StringTypeCell.prototype;
					wp.getCellValue = swp.getCellValue;
					wp.setCellValue = swp.setCellValue;
					wp.isValid = swp.isValid;
					wp.validateValue = swp.validateValue;
					wp.commitChange = swp.commitChange;
					wp.prerender = swp.prerender;										
					
					
					//align
					align = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("align");							
					
					//color: Set the text-color for different elements:
					//value: red, #00ff00, rgb(0,0,255)
					color = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("color");
					
					//direction: Set the text direction to "right-to-left":
					//value: ltr, rtl
					direction = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("direction");					
					
					//background-color: Set the background-color of different elements:
					//value: yellow, #00ff00, rgb(255,0,255)
					backgroundColor = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("bgColor");
					
					//background-image: Set a background-image for the body element:
					//value: url('paper.gif')
					backgroundImage = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("bgImage");					
					
					//background-repeat : Repeat a background-image only vertically:
					//value: repeat-y
					backgroundRepeat = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("bgRepeat");					
					
					//border-width: Set the width of the four borders
					//value: 15px
					borderWidth = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("borderWidth");					
					
					//border-style: Set the style of the four borders
					//value: solid
					borderStyle = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("borderStyle");	
					
					//border-color: Set the color of the four borders
					//value: red, #ff0000
					borderColor = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("borderColor");	
					
					//font-family: Specify the font for a paragraph
					//value: Times New Roman, Georgia, Serif
					fontFamily = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("fontFamily");
					
					//font-size:Set the font size for different HTML elements
					//value: value
					fontSize = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("fontSize");
					
					//font-style: Set different font styles for three paragraphs
					//value: normal, italic, oblique
					fontStyle = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("fontStyle");
					
					//font-weight: Set different font weight for three paragraphs
					//value: normal, bold, value(ex: 900)
					fontWeight = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("fontWeight");
					
					//blink
					blink = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("blink");
										
					//blink text from color
					blinkTextFromColor = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("textFromColor");
					
					//blink text to color
					blinkTextToColor = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("textToColor");
					
					//blink background from color
					blinkBackgroundFromColor = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("backgroundFromColor");
					
					//blink background to color
					blinkBackgroundToColor = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("backgroundToColor");					

					//remove blink
					removeblink = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("removeblink");
					
					//Autopostback
					autopostback = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("autopostback");
					
					d = document.createElement("div");						
										
					//Set Attributes
					if (color)
						d.style.color = color;
					if (direction)
						d.style.direction = direction;					
					if (backgroundColor)
						d.style.background = backgroundColor;
					if (backgroundImage)
						d.style.backgroundImage = "url" + "('" + backgroundImage + "')";	
					if (backgroundRepeat)
						d.style.backgroundRepeat = backgroundRepeat;		
					if (borderWidth)
						d.style.borderWidth = borderWidth + "px";			
					if (borderStyle)
						d.style.borderStyle = borderStyle;				
					if (borderColor)
						d.style.borderColor = borderColor;											
					if (fontFamily)
						d.style.fontFamily = fontFamily;	
					if (fontSize)
						d.style.fontSize = fontSize + "px";
					if (fontStyle)
						d.style.fontStyle = fontStyle;
					if (fontWeight)
						d.style.fontWeight = fontWeight;	
					if(align) 
						td.setAttribute("align", align);				
					
					if (autopostback)
						d.attachEvent("onclick", this.box_onclick);	
					
					if(value)
						d.innerHTML = value.text;	
						
					if (blink)
					{
						if (blinkTextFromColor || blinkTextToColor || blinkBackgroundFromColor || blinkBackgroundToColor)
						{
							d.id = "blinkDiv";	
							d.setAttribute("class", "blink");							
							d.setAttribute("blinkTextFromColor", blinkTextFromColor);
							d.setAttribute("blinkTextToColor", blinkTextToColor);
							d.setAttribute("blinkBackgroundFromColor", blinkBackgroundFromColor);
							d.setAttribute("blinkBackgroundToColor", blinkBackgroundToColor);
							
							jsObject._enableBlinkDivs.push(d);
						}
					}		

					if (removeblink)
						jsObject._removeBlinkDivs.push(d);		
				}
				else if (tytype= "Button")
				{
					var bproto = ButtonTypeCell.prototype;
					wp._createSpanButton = bproto._createSpanButton;
					wp._button_onmouseenter = bproto._button_onmouseenter;
					wp._button_onmouseleave = bproto._button_onmouseleave;
					wp._button_onmousedown = bproto._button_onmousedown;
					wp._button_onmouseup = bproto._button_onmouseup;				
				
					d = document.createElement("button");
					d.style.position = "absolute";
					d.style.whiteSpace = "normal";
					d.style.padding = "1px 6px 1px 6px";
			
					width = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("buttonWidth");		
					height = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("buttonHeight");	
					align = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("align");		
			
					if (width)
						d.style.width = width + "px";
					else
						d.style.width = "26px";
					
					if (height)
						d.style.height = height + "px";
					else
						d.style.height = "26px";
					
					//Postback
					autopostback = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("autopostback");	
					if (autopostback)
						d.attachEvent("onclick", this.box_onclick);	
					
					//Image
					imgSrc = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("imgSrc");	
					if (imgSrc)
					{
						var img = document.createElement("div");
						var img1 = document.createElement("img");					
						img1.src = imgSrc;			
						img1.style.width = "24px";
						img1.style.height = "24px";
						img1.style.verticalAlign = "middle";
						img.appendChild(img1);
						d.appendChild(img);
					}
					
					//Text
					imgText = cell.colTag.node.childNodes[0].childNodes[i].childNodes[j].getAttribute("imgText");	
					if (imgText)
					{
						var imgTxt = document.createElement("div");
						imgTxt.style.verticalAlign = "middle";
						imgTxt.style.display = "block";
						//imgTxt.style.display = "inline-block";																		
						imgTxt.innerHTML = imgText;		
						d.appendChild(imgTxt);
					}				
				}				
				td.appendChild(d)  
				tr.appendChild(td);				
			}
			tb.appendChild(tr); 
		}		
		table.appendChild(col);		
		table.appendChild(tb);		
		cell.appendChild(table);	
	}
}
wp.render = function(cell, node)
{
	//var table = cell.children[0];
	//table.rows[0].cells[0].children[0].innerHTML = String(node.text);
	//var color = cell.parentElement.currentStyle.backgroundColor;
	//if(color != "transparent") table.style.borderColor = color;
}

wp = null;
proto = null;