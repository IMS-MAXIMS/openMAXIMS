/*
	v. 0.22
	+ theme support.
	v. 0.12
	+ initial release.
*/
function CN_tabnavigation()
{
	this.formManager = null;
	this._currentTabsDiv = null;
	this._selectedLevels = [];
}

var proto = CN_tabnavigation.prototype;

proto.createElement = function(node, parentElement)
{
	var l = document.createElement("<div>");
	parentElement.appendChild(l);

	var id2 = node.getAttribute("screenItemID2");
	if(!id2)
	{
		alert("ASSERT: screenItemID2 is required for tabnavigation");
		return;
	}

	id2 = "__si_" + id2;
	this._level2ParentElement =	document.getElementById(id2);
	if(!this._level2ParentElement) 
	{
		alert("ASSERT: no " + id2 + " element found by tabnavigation");
		return;
	}
	
	this._level2ParentElement.jsObject = this;
	
	this.element = l;
	l.jsObject = this;

	l.className = "cn_tabnavigation";
	l.unselectable = "on";
	
	this._buildElements(node);
	return l;
}

proto.loadData = function(node)
{
	this._loadDataWalkNodes(node, 0);
}

proto.storeData = function(xmldoc)
{
	if(!this._selectedNodeId) 
	{
		alert("ASSERT: no _selectedNodeId.");
		return;
	}
	
	var node = xmldoc.createElement("navigation");
	node.setAttribute("form", this._selectedNodeId);
	return node;
}

proto.unload = function()
{
	for(var i = 0; i < this._selectedLevels.length; i++) this._selectedLevels[i] = null;
	this._selectedLevels = null;

	this._level2ParentElement.jsObject = null;
	this._level2ParentElement.innerHTML = "";
	this._level2ParentElement = null;
}

proto._loadDataWalkNodes = function(parentNode, level)
{
	var subNodes = parentNode.selectNodes("node");
	var count = subNodes.length;
	for(var i = 0; i < count; i++)
	{
		var node = subNodes[i];
		var attr = node.getAttribute("id");
		if(!attr)
		{
			alert("ASSERT: no id for data/navigation/node.");
			continue;
		}
		var id = String(attr);
		var tab;
		if(level == 0) tab = this.element.all["navigationTab_" + id];
		else if(level == 1) tab = this._level2ParentElement.all["navigationTab_" + id];
		else
		{
			alert("ASSERT: only two levels are supported for tabnavigation.");
			return;
		}
		
		if(tab.length)
		{
			alert("ASSERT: got tab collection for id " + id);
			return;
		}

		attr = node.getAttribute("enabled");
		if(attr) tab.disabled = attr == "false";

		attr = node.getAttribute("visible");
		if(attr) 
		{
			tab.style.display = attr == "false" ? "none" : "inline";
		}
		
		if(level == 0) this._loadDataWalkNodes(node, level + 1);
	}
}

proto._buildElements = function(node)
{
	var nodes = node.selectNodes("node");
	var count = nodes.length;
	for(var i = 0; i < count; i++)
	{
		var node = nodes[i];

		var tab = this._appendTab(node, this.element, 0);

		var subNodes = node.selectNodes("node");
		if(subNodes.length > 0)
		{
			var subTabsDiv = document.createElement("<div class=subTabsDiv>");
			this._level2ParentElement.appendChild(subTabsDiv);
			this._buildSubNodes(subNodes, subTabsDiv);
			subTabsDiv._parentNodeId = tab._nodeId;
			subTabsDiv._parentTabId = String(tab.id);
			subTabsDiv.id = "navigationTabsDiv_" + tab._nodeId;
		}
	}
}

proto._buildSubNodes = function(nodes, parentElement)
{
	var count = nodes.length;
	for(var i = 0; i < count; i++)
	{
		var node = nodes[i];
		this._appendTab(node, parentElement, 1);
	}
}

proto._appendTab = function(node, parentElement, level)
{
	var table = document.createElement("<table align=bottom border=0 cellpadding=0 cellspacing=0 class=topTab>");
	parentElement.appendChild(table);
	var tbody = document.createElement('tbody');
	table.appendChild(tbody);
	var tr = document.createElement("tr");
	tbody.appendChild(tr);
	var td1 = document.createElement("td");
	tr.appendChild(td1);
	var img1 = document.createElement("<img width=12 height=26>");
	td1.appendChild(img1);
	var td2 = document.createElement("<td valign=top class=topTabTextTD	nowrap unselectable=on>");
	tr.appendChild(td2)
	var td3 = document.createElement("td");
	tr.appendChild(td3);
	var img3 = document.createElement("<img width=11 height=26>");
	td3.appendChild(img3);
	
	table._level = level;

	td2.innerText = String(node.getAttribute("caption"));

	var attr = node.getAttribute("id");
	if(!attr) alert("ASSERT: no id for navigation node: " + node.getAttribute("caption"));
	var id = String(attr);

	table._nodeId = id;
	table.id = "navigationTab_" + id;

	this.unselectTab(table);
	
	table.attachEvent("onmouseenter", this._tab_onmouseenter);
	table.attachEvent("onmouseleave", this._tab_onmouseleave);	
	table.attachEvent("onclick", this._tab_onclick);
	
	return table;
}

proto._findTopTab = function(nodeId)
{
	var children = this.element.children;
	var count = children.length;
	for(var i = 0; i < count; i++)
	{
		var child = children[i];
		if(child._nodeId == nodeId)
		{
			return child;
		}
	}
	return null;
}

proto.selectFormNode = function(nodeId)
{
	var id = "navigationTab_" + nodeId;
	
	// 1. Try to find top tab.
	var tab = this.element.all[id];
	if(tab) 
	{
		if(tab.length > 0) tab = tab[0];
		this.selectTab(tab);
		return;
	}
	
	// 2. Try to find sub tab.
	tab = this._level2ParentElement.all[id];
	if(tab) 
	{
		if(tab.length > 0) tab = tab[0];
		this.selectTab(tab);
		// And also select top tab.
		
		var tabDiv = tab.parentElement;
		tabDiv.style.visibility = "inherit";
		var topTab = this.element.all[tabDiv._parentTabId];
		this.selectTab(topTab);
		
		return;
	}
	alert("ASSERT: can't find navigation tab: " + nodeId);	
}

proto.showSecondLevel = function(formId)
{
	var tab = this._level2ParentElement.all["navigationTab_" + formId];
	if(!tab)
	{
		alert("ASSERT: can't find tab: " + formId);
		return;
	}

	if(tab.length > 0)
	{
		alert("ASSERT: duplicate navigation nodes with id: " + formId);
		tab = tab[0];
	}

	var tabsDiv = tab.parentElement;
	tabsDiv.style.visibility = "inherit";
	this._currentTabsDiv = tabsDiv.id;
	
	this._level2ParentElement.style.display = "block";
	
	var topTab = this.element.all[tabsDiv._parentTabId];
	this.selectTab(topTab);
}

proto.hideSecondLevel = function()
{
	this._level2ParentElement.style.display = "none";
	if(!this._currentTabsDiv) return;
	
	var tabsDiv = this._level2ParentElement.children[this._currentTabsDiv];
	if(!tabsDiv)
	{
		alert("ASSERT: can't find tabsDiv " + this._currentTabsDiv)
		return;
	}
	tabsDiv.style.visibility = "hidden";
	this._currentTabsDiv = null;
}

proto.isTopTabForm = function(formId)
{
	return this._findTopTab(formId) != null;
}


proto.selectTab = function(tab)
{
	var selectedTab = this._selectedLevels[tab._level];
	if(selectedTab == tab) return;
	if(selectedTab) this.unselectTab(selectedTab);
	
	var suffix = "";
	if(tab._level > 0 && CNFormManager.currentThemeName == "blue") suffix = "-2";

	tab.className = "topTabSelected";
	tab.cells(0).children[0].src = CNFormManager.themeImagesPath + "tab-header-2" + suffix + "_01.gif";
	tab.cells(1).style.background = "url(" + CNFormManager.themeImagesPath + "tab-header-2_02.gif)";
	tab.cells(2).children[0].src = CNFormManager.themeImagesPath + "tab-header-2" + suffix + "_03.gif";	
	tab._isSelected = true;
	
	this._selectedLevels[tab._level] = tab;
}

proto.unselectTab = function(tab)
{
	var suffix = "";
	if(tab._level > 0 && CNFormManager.currentThemeName == "blue") suffix = "-2";

	tab.className = "topTab";
	tab.cells(0).children[0].src = CNFormManager.themeImagesPath + "tab-header-1" + suffix + "_01.gif";
	tab.cells(1).style.background = "url(" + CNFormManager.themeImagesPath + "tab-header-1_02.gif)";
	tab.cells(2).children[0].src = CNFormManager.themeImagesPath + "tab-header-1" + suffix + "_03.gif";	
	tab._isSelected = false;
}

proto._unhoverTab = function(tab)
{
	tab.runtimeStyle.textDecoration = "";
	tab.cells(1).runtimeStyle.color = "";
}


// Event handlers. ==========================================
proto._tab_onmouseenter = function()
{
	if(this.formManager._loading || this.formManager.isNavigationDisabled()) return;
	
	var tab = event.srcElement;
	if(tab.tagName != "TABLE") return;
	if(tab._isSelected) return;
	tab.runtimeStyle.textDecoration = "underline";
	tab.cells(1).runtimeStyle.color = "#5555aa";
}

proto._tab_onmouseleave = function()
{
	CNUtil.dispatchObject().tab_onmouseleave();
} 
proto.tab_onmouseleave = function()
{
	if(this.formManager._loading || this.formManager.isNavigationDisabled()) return;
	
	var tab = event.srcElement;
	if(tab.tagName != "TABLE") return;
	if(tab._isSelected) return;
	this._unhoverTab(tab);
} 

proto._tab_onclick = function()
{
	CNUtil.dispatchObject().tab_onclick();
}
proto.tab_onclick = function()
{
	if(this.formManager._loading || this.formManager.isNavigationDisabled()) return;

	var tab = CNUtil.findTag(event.srcElement, "TABLE");
	if(tab._isSelected) return;
	this._unhoverTab(tab);
	this.selectTab(tab);

	this._selectedNodeId = null;
	if(tab._level == 1 /*|| String(tab._nodeId).length == 6*/)
	{
		this._selectedNodeId = tab._nodeId;
	}
	else
	{
		// Try to find first second level node.
		var tabsDiv = this._level2ParentElement.all["navigationTabsDiv_" + tab._nodeId];
		if(tabsDiv)
		{
			var tab = tabsDiv.children[0];
			if(tab) this._selectedNodeId = tab._nodeId;
		}
	}
	if(this._selectedNodeId) this.formManager.postData(this.element);	
	else alert("ASSERT: no form available.");
}