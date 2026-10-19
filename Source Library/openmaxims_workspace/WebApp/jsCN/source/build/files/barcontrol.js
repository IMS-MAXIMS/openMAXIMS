/*
	v. 0.23
	+ anchor.	
	v. 0.21
	+ theme support.
	v. 0.1
	+ initial release.
*/
function CN_barcontrol()
{
	this._contentTable = null;
}
var proto = CN_barcontrol.prototype;


proto.createElement = function(node, parentElement)
{
	var l = document.createElement("div");
	parentElement.appendChild(l);

	this.element = l;
	l.jsObject = this;

	l.className = "cn_barcontrol";
	
	var contentTable = Util.createElement("table", "resourceTable", {cellSpacing: 3, cellPadding: 0, border: 0});
	l.appendChild(contentTable);
	
	var tbody = document.createElement("tbody");
	contentTable.appendChild(tbody);
	var tr = document.createElement("tr");
	tbody.appendChild(tr);
	tr = document.createElement("tr");
	tbody.appendChild(tr);
	
	this._contentTable = contentTable;
	
	return l;
}

proto.loadData = function(node)
{
	this._clean();
	this._build(node);
}

proto.storeData = function(xmldoc)
{
	return null;
}


proto._clean = function()
{
	this._cleanRow(1);
	this._cleanRow(0);
}

proto._cleanRow = function(rowIx)
{
	var row = this._contentTable.rows[rowIx];
	var count = row.cells.length;
	for(var i = 0; i < count; i++)
	{
		row.deleteCell(0);
	}
}

proto._build = function(node)
{
	var resources = Util.xmlSelectNodes(node, "resources/resource");
	var resourceCount = resources.length;
	this._createBars(resourceCount);
	
	var highestTotal = 0;
	for(var i = 0; i < resourceCount; i++)
	{
		highestTotal = Math.max(highestTotal, parseInt(resources[i].getAttribute("total"), 10));
	}

	for(var i = 0; i < resourceCount; i++)
	{
		this._fillBar(i, resources[i], highestTotal);
	}
}

proto._createBars = function(colNum)
{
	var row = this._contentTable.rows[0];
	for(var i = 0; i < colNum; i++)
	{
		var td = Util.createElement("td", "resourceBarTD");
		row.appendChild(td);
		var div = Util.createElement("div", "resourceBarDiv");
		td.appendChild(div);
		var gauge = Util.createElement("div", "resourceGaugeDiv");
		div.appendChild(gauge);
	}
	row = this._contentTable.rows[1];
	for(var i = 0; i < colNum; i++)
	{
		var td = Util.createElement("td", "resourceNumberTD");
		row.appendChild(td);
		td.textContent = " ";
	}
}

proto._fillBar = function(col, node, highestTotal)
{
	var barTD = this._contentTable.rows[0].cells[col];
	var bar = barTD.children[0];
	var gauge = bar.children[0];
	var numberTD = this._contentTable.rows[1].cells[col];
	
	var total = parseInt(node.getAttribute("total"), 10);
	var completed = parseInt(node.getAttribute("completed"), 10);
	
	var height = Math.round(total / highestTotal * 100);
	if(height < 1 || isNaN(height)) height = 1;
	
	bar.style.height = height + "%";
	
	bar.style.top = (100 - height) + "%";
	
	var gaugeHeight = Math.round(completed / total * 100);
	if(isNaN(gaugeHeight) || gaugeHeight < 1) gauge.style.visibility = "hidden";
	else 
	{
		gauge.style.height = gaugeHeight + "%";
		gauge.style.visibility = "inherit";
		gauge.style.top = (100 - gaugeHeight) + "%";
	}

	numberTD.textContent = String(col + 1);
	
	var attr = node.getAttribute("message");
	if(attr) Tooltip.attach(numberTD, String(attr));
}
