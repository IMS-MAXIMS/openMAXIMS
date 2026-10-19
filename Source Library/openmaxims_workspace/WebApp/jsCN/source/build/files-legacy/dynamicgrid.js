/*
	v. 2.0
*/
function CN_dynamicgrid()
{
   	this.formManager = null;
	this._headerHeight = 20;
	this._selectorVisible = true;
	this._clickedRowIndex = -1;
	this._rowBorderOffset = CNFormManager.vista ? 1 : 0;
	this._selectedRow = null;
}

var proto = CN_dynamicgrid.prototype;

proto.createElement = function(node, parentElement)
{
	var l = document.createElement("<div class=cn_dynamicgrid>");
	parentElement.appendChild(l);
	l.jsObject = this;
	this.element = l;
	
	l.attachEvent("onresize", this._element_onresize);

	var captionTable = document.createElement("<table width=100% border=0 cellpadding=0 cellspacing=0 class=captionTable>");
	l.appendChild(captionTable);
	
	var div = document.createElement("<div class=contentDiv>");
	l.appendChild(div);
	
	var table = document.createElement("<table width=100% border=0 cellpadding=0 cellspacing=0 class=contentTable>");
	div.appendChild(table);

	if(CNFormManager.vista)
	{
		this._select = VistaSupport.createHover();
		this._select.arcsize = .05;
		var fill = this._select.lastChild;
		fill.type = "gradient";
		fill.color = "#DAF0FC";
		fill.color2 = "#F4FAFD";
		div.appendChild(this._select);
	}
	else
	{
		this._leftBorder = document.createElement("<div class=leftBorder>");
		div.appendChild(this._leftBorder);
		this._rightBorder = document.createElement("<div class=rightBorder>");
		div.appendChild(this._rightBorder);
		this._topBorder = document.createElement("<div class=topBorder>");
		div.appendChild(this._topBorder);
		this._bottomBorder = document.createElement("<div class=bottomBorder>");
		div.appendChild(this._bottomBorder);
	}	
	this._disabler = document.createElement('<div style="position: absolute; background: white; z-index: 1000; filter: alpha(opacity=50); width: 100%; height: 100%; visibility: hidden; top: 0px; left: 0px; ">');
	this.element.appendChild(this._disabler);
	var attr = node.getAttribute("headerHeight");
	if(attr)
	{
		var headerHeight = parseInt(attr, 10);
		if(!isNaN(headerHeight)) this._headerHeight = headerHeight;
	}
	
	attr = node.getAttribute("selectorVisible");
	if(attr) this._selectorVisible = attr == "true";
	
	return l;
} 

proto.loadData = function(node)
{
	var captionTable = this.element.children[0];
	var table = this.element.children[1].children[0];
	
	this._cleanData(captionTable, table);
	
	captionTable.height = this._headerHeight;
	
	var captionTR = captionTable.insertRow();
	if(this._selectorVisible)
	{
		var selectorTD = captionTR.insertCell();
		selectorTD.style.width = 20;
		selectorTD.innerText = " ";
	}
	
	var tBody = document.createElement("tbody");
	table.appendChild(tBody);
	
	var colNodes = node.selectNodes("columns/col");
	var colNodeCount = colNodes.length;
	
	var rowMatrix = [];
	var cols = [];
	var lastCaptionTD = null;

	for(var i = 0; i < colNodeCount; i++)
	{
		var colNode = colNodes[i];
		
		var cellNodes = colNode.selectNodes("cell");
		var cellNodeCount = cellNodes.length;
		for(var j = 0; j < cellNodeCount; j++)
		{
			if(!rowMatrix[j]) rowMatrix[j] = [];
			rowMatrix[j][i] = cellNodes[j];
		}
		
		var attr;
		
		var captionTD = captionTR.insertCell();
		attr = colNode.getAttribute("caption");
		if(attr) captionTD.innerText = String(attr);
		else captionTD.innerText = " ";

		attr = colNode.getAttribute("captionAlign");
		if(attr) captionTD.align = String(attr);

		var col = {};
		cols[i] = col;
		
		attr = colNode.getAttribute("align");
		if(attr) col.align = String(attr);
		
		attr = colNode.getAttribute("width");
		if(attr)
		{
			var width = parseInt(attr, 10);
			if(!isNaN(width) && width > 0) 
			{
				col.width = width;
				captionTD.width = width;
			}
		}
		lastCaptionTD = captionTD;
	}
	
	if(lastCaptionTD) lastCaptionTD.style.paddingRight = 20; // Scroll bar alignment.
	
	for(var i = 0; i < rowMatrix.length; i++)
	{
		var row = rowMatrix[i];
		if(!row) continue;

		this._buildRow(table, row, cols);
	}
	
	var attr = node.getAttribute("selectedRow");
	if(attr)
	{
		var selectedRow = parseInt(attr, 10);
		if(!isNaN(selectedRow))
		{
			if(selectedRow < 0)	this._rowBorder_unselect();
			else
			{
				var row = table.rows[selectedRow];
				if(row) 
				{
					var obj = this;
					setTimeout(function(){ obj._rowBorder_select(row); }, 0);
				}
			}
		}
	}
	else this._rowBorder_unselect();

	this._setLoadStateTO();
}

proto.storeData = function(xmldoc)
{
	if(this._clickedRowIndex < 0) return;
	
	var node = xmldoc.createElement("dynamicgridselection");
	node.setAttribute("selection", this._clickedRowIndex);
	this._clickedRowIndex = -1;

	return node;
}

proto.unload = function()
{
	this._saveState();
}
	
proto._cleanData = function(captionTable, table)
{
	if(captionTable.rows.length > 0) captionTable.deleteRow(0);
	var count = table.rows.length;
	for(var i = count - 1; i >= 0; i--)
	{
		table.deleteRow(i);
	}
}

proto._buildRow = function(table, row, cols)
{
	var tr = table.insertRow();
	tr.vAlign = "top";
	
	if(this._selectorVisible)
	{
		var selectorTD = tr.insertCell();
		selectorTD.style.width = 20;
		selectorTD.style.cursor = "hand";
		selectorTD.attachEvent("onclick", this._selectorTD_onclick);
		
		var img = document.createElement("<img width=16 height=16>");
		selectorTD.appendChild(img);
		img.src = CNFormManager.themeImagesPath + "normalRow.gif";
	}

	for(var i = 0; i < row.length; i++)
	{
		var node = row[i];
		var td = tr.insertCell();

		if(!node) 
		{
			td.innerText = " ";
			continue;
		}
		
		td.innerText = String(node.getAttribute("value"));

		var col = cols[i];

		if(col.align) td.align = col.align;
		if(col.width) td.width = col.width;
	}
}

proto._setLoadStateTO = function()
{
	var obj = this;
	setTimeout(function(){ obj._loadState(); }, 0);
}

proto._loadState = function()
{
	if(!this.element || !this.element.id) return;

	try
	{
		this.element.load("dynamicgrid_store");
	}
	catch(ex){}
	var gridTag = this._getStoredGridTag();
	var scrollTop = gridTag.getAttribute("scrollTop");
	if(scrollTop)
	{
		var contentDiv = this.element.children[1];
		contentDiv.scrollTop = scrollTop * 1;
		contentDiv.scrollLeft = gridTag.getAttribute("scrollLeft") * 1;
	}
	gridTag.removeAttribute("scrollTop");
	gridTag.removeAttribute("scrollLeft");
	try{ this.element.save("dynamicgrid_store"); } catch(ex){}
}

proto._getStoredGridTag = function()
{
	var xmldoc = this.element.XMLDocument;
	var gridTag = xmldoc.documentElement.selectSingleNode("dynamicgrid[@id='" + this.element.id + "']");
	if(!gridTag)
	{
		gridTag = xmldoc.createElement("dynamicgrid");
		gridTag.setAttribute("id", this.element.id);
		xmldoc.documentElement.appendChild(gridTag);
	}
	return gridTag;
}

proto._saveState = function()
{
	if(!this.element.id) return;
	// NOTE: always load store before change, as another grid probably changed it.
	try
	{
		this.element.load("dynamicgrid_store");
	}
	catch(ex){}
	var gridTag = this._getStoredGridTag();
	var contentDiv = this.element.children[1];
	gridTag.setAttribute("scrollTop", contentDiv.scrollTop);
	gridTag.setAttribute("scrollLeft", contentDiv.scrollLeft);	
	try{ this.element.save("dynamicgrid_store"); } catch(ex){}
}

proto._rowBorder_select = function(row)
{
	this._selectedRow = row;
	
	if(CNFormManager.vista)
	{
		this._select.style.width = row.offsetWidth - 3;
		this._select.style.height = row.offsetHeight - 2;
		this._select.style.top = row.offsetTop + 1;
		this._select.style.left = row.offsetLeft + 1;
		this._select.style.visibility = "inherit";
	}
	else
	{
		var x = row.offsetLeft;
		var y = row.offsetTop;
	
		this._leftBorder.style.left = x + this._rowBorderOffset;
		this._leftBorder.style.top = y + this._rowBorderOffset;
		this._leftBorder.style.height = row.offsetHeight - this._rowBorderOffset * 2;
		
		this._topBorder.style.left = x + this._rowBorderOffset * 2;
		this._topBorder.style.top = y;
	
		this._rightBorder.style.top = y + this._rowBorderOffset;
		this._rightBorder.style.height = row.offsetHeight - this._rowBorderOffset * 2;
	
		this._bottomBorder.style.left = x + this._rowBorderOffset * 2;
		this._bottomBorder.style.top = y + row.offsetHeight - this._bottomBorder.offsetHeight;
	
		this._rightBorder.style.visibility = 
		this._topBorder.style.visibility =
		this._leftBorder.style.visibility = this._bottomBorder.style.visibility = "inherit";
		
		this._rightBorder.style.zIndex = 
		this._topBorder.style.zIndex =
		this._leftBorder.style.zIndex = this._bottomBorder.style.zIndex = top.__ontopZ++
		
		this.rowBorder_updateSize(row);
	}
}

proto.rowBorder_updateSize = function(row)
{
	if(CNFormManager.vista)
	{
		this._select.style.width = row.offsetWidth - 3;
	}
	else
	{
		this._rightBorder.style.left = row.clientWidth - this._rightBorder.offsetWidth + "px";
		this._topBorder.style.width = this._bottomBorder.style.width = row.offsetWidth + "px";
	}
}

proto._rowBorder_unselect = function()
{
	if(this._selectedRow && CNFormManager.vista) 
	{
		this._select.style.visibility = "hidden";
	}
	else
	{
		this._rightBorder.style.visibility =
		this._topBorder.style.visibility =
		this._leftBorder.style.visibility =
		this._bottomBorder.style.visibility = "hidden";
	}
	this._selectedRow = null;
}


// Properties. ========================
proto.set_disabled = function(value)
{
	this._disabled = value;
	this._disabler.style.visibility = this._disabled ? "inherit" : "hidden";
}


// Event handlers. ======================
proto._element_onresize = function()
{
	CNUtil.dispatchObject().element_onresize();
}
proto.element_onresize = function()
{
	var captionTable = this.element.children[0];
	var contentDiv = this.element.children[1];
	var table = contentDiv.children[0];
	
	if(!captionTable.offsetHeight) return;

	//var h = parseInt(this.element.currentStyle.height, 10);
	//if(!isNaN(h)) contentDiv.style.height = h - captionTable.offsetHeight;
	if(this._selectedRow) this.rowBorder_updateSize(this._selectedRow);
}

proto._selectorTD_onclick = function()
{
	CNUtil.dispatchObject().selectorTD_onclick();
}
proto.selectorTD_onclick = function()
{
	var tr = CNUtil.findTag(event.srcElement, "TR");
	this._rowBorder_unselect();
	this._rowBorder_select(tr);
	
	this._clickedRowIndex = tr.rowIndex;
	this.formManager.postData(this.element);
}
