/*
	v. 0.25
	+ theme support.
*/

function CN_panel(){}
var proto = CN_panel.prototype;

proto.doNotDisable = true;

proto.createElement = function(node, parentElement)
{
	var type = String(node.getAttribute("type"));
	var vista = CNFormManager.vista;
	var l;
	if(type == "MiniBox") l = CN_panel_buildMiniBoxPanel(parentElement);
	else if(vista)
	{
		if(type == "Dark") l = $('__vistaDarkPanel').cloneNode(true);
		else if(type == "White") l = $('__vistaWhitePanel').cloneNode(true);
		l.id = "";

		parentElement.appendChild(l);
	}
	else
	{
		l = document.createElement("div");
		parentElement.appendChild(l);
		if(type == "Dark") l.innerHTML = CN_panel_buildDarkPanel();
		else if(type == "White") l.innerHTML  = CN_panel_buildWhitePanel();
	}
	
	this.element = l;
	l.style.zIndex = -2;
	l.jsObject = this;

	return l;
}

proto.loadData = function(node) {
	var textEl = Util.findById(this.element, "__panel_text");

	var attr = node.getAttribute("text");
	if(attr) {
		textEl.textContent = String(attr);
	}

	attr = node.getAttribute("img");
	if(attr != null) {
		var img = textEl.parentNode.firstChild;
		if(img && img.className == "panelImg") {
			img.parentNode.removeChild(img);
			img = null;
		}

	    if(attr == "") {
	    	Util.removeClass(textEl, "withImage");
		} else {
			Util.addClass(textEl, "withImage");
			var img = document.createElement("img");
			img.className = "panelImg";
			img.src = String(attr);
			textEl.parentNode.insertBefore(img, textEl.parentNode.firstChild);
		}
	}
}


function CN_panel_buildDarkPanel()
{
	var suffix = CNFormManager.getBaseFormManager().isTabbed ? '-tabbed' : '';
	return '<table class="darkPanel" align=top width=100% border=0 cellpadding=0 cellspacing=0>\
		<tr><td><img src="' + CNFormManager.themeImagesPath + 'win-header-5' + suffix + '_01.gif" width=12 height=45></td>\
		<td width=100% background="' + CNFormManager.themeImagesPath + 'win-header-5' + suffix + '_02.gif">\
		<h2 id="__panel_text"></h2>\
		</td>\
		<td><img src="' + CNFormManager.themeImagesPath + 'win-header-5' + suffix + '_03.gif" width=12 height=45></td></tr>\
		</table>';
}

function CN_panel_buildWhitePanel()
{
	return '<table class="whitePanel" align=top width=100% border=0 cellpadding=0 cellspacing=0>\
			<tr><td><img src="' + CNFormManager.themeImagesPath + 'win-header-3_01.gif" width=12 height=45></td>\
			<td valign=top width=100% background="' + CNFormManager.themeImagesPath + 'win-header-3_02.gif">\
			<br><h5 id="__panel_text"></h5>\
			</td>\
			<td><img src="' + CNFormManager.themeImagesPath + 'win-header-3_03.gif" width=12 height=45></td></tr>\
			</table>';
}

function CN_panel_buildMiniBoxPanel(l)
{
	if(CNFormManager.vista)
	{
		var panel = $('__vistaMinibox').cloneNode(true);
		panel.id = "";
		l.appendChild(panel);
		return panel;
	}
	else
	{
		var table = Util.createElementFromHTML("<table width=100% height=100% border=0 cellpadding=0 cellspacing=0 class=smallMiniWindow2>");
		l.appendChild(table);
		
		var tbody = document.createElement('tbody');
		table.appendChild(tbody);
	
		// Header.
		var tr = document.createElement('tr');
		tbody.appendChild(tr);
		var td = Util.createElementFromHTML("<td height=16 width=12 nowrap>");
		tr.appendChild(td);
		var td1 = td;
			
		var td2 = Util.createElementFromHTML("<td width=100%>");
		tr.appendChild(td2);
	
		var h5 = Util.createElement("h5", "", {id: "__panel_text"});
		td2.appendChild(h5);
		td2.style.paddingTop = "4px";
		var td = Util.createElementFromHTML("<td width=12 nowrap>");
		tr.appendChild(td);
		
		var td12 = td;
	
		// Content.
		var tr = Util.createElementFromHTML("<tr valign=top>");
		tbody.appendChild(tr);
	
		var td5 = Util.createElement("td", "", {colSpan: 3, id: "contentTD", style: "position: relative;", height: "100%", width: "100%"});
		tr.appendChild(td5);
		td5.innerHTML = '<div style="overflow: hidden; width: 1px; height: 1px; "></div>';
	
		td1.style.background = "url(" + CNFormManager.themeImagesPath + "win-4_01.gif)";
		td12.style.background = "url(" + CNFormManager.themeImagesPath + "win-4_03.gif)";
		td2.style.background = "url(" + CNFormManager.themeImagesPath + "win-4_02.gif) repeat-x";

		return table;
	}
}
