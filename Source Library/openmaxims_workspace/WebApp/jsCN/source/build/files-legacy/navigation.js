/*
	v. 2.0.2
	+ simplified move/slide code, using Animator now.
*/
function CN_navigation()
{
	this.formManager = null;

	this.isBuilt = false;
	
	this.activePanel = null;
	this.panelCount = 0;
	this.panels = null;
	
	this.disabler = null;
	
	this._disabled = false;

	this.resizeTimeout = null;

	this.indent = 19;
	this.selectedItem = null;
	this.selectedForm = null;
	this._structure = {};
}

CN_navigation.deltaY = 80;

var proto = CN_navigation.prototype;

proto.onnodeselected = function(ev)
{
	this.formManager.postData(this.element);
}

proto.createElement = function(node, parentElement)
{
	var l = document.createElement("<div>");
	parentElement.appendChild(l);
	
	this.element = l;
	l.jsObject = this;

	l.className = "cn_navigation";
	l.attachEvent("onresize", this._element_onresize);
	
	this._init(node);
	
	if(CNFormManager.vista)
	{
		this._hover = VistaSupport.createHover('item-gradient-5.gif', 30);
		this._hover.strokecolor = ThemeNonCSSStyles.hoverRect_strokeColor2;
		this._select = VistaSupport.createHover('item-gradient-5.gif', 30);
	}

	return l;
}

proto.unload = function()
{
	this._unloadCollapseMixin();

	this._structure = null;
	this._deleted = true;
	this.panels = null;
	this.element.detachEvent("onresize", this._element_onresize);
}

proto.loadData = function(node) {
	this._walkDataNode(node, this.element);
	this.finishBuild();

	if(CNFormManager.currentThemeName == "blue") {
		if(!this._canExpandCollapse) this._canExpandCollapse = node.getAttribute("canExpandCollapse") == "true";        
		else this._canExpandCollapse = node.getAttribute("canExpandCollapse") != "false";

		var attr = node.getAttribute("collapsed");
		if(attr) {
			if(attr == "true") this.collapse(true);
			else this.expand(true);  
		}

		this._updateCollapseElements();		
	}
}

proto._walkDataNode = function(node, parentElement)
{
	var childNodes = node.selectNodes("node");
	var childCount = childNodes.length;
	for(var i = 0; i < childCount; i++)
	{
		var subNode = childNodes[i];
		
		var attr = subNode.getAttribute("id");
		if(!attr)
		{
			Util.assert("navigation/modify/node without id");
			continue;
		}
		var id = String(attr);
		
		var container;
		var item = this._structure[id]; //parentElement.children[id];
		
		// NOTE: item == nodeDiv for nodes and == navigationPanel for panels.
		
		if(!item)
		{
			Util.assert("Can't find item, parentNodeID: " + node.getAttribute("id") 
			+ " + requesting " + id + " from " + parentElement.outerHTML);
		}
		
		if(item.length) continue;

		if(parentElement == this.element 
		|| item.className == "cn_navigation_panel") container = item.children[1];
		else container = item;
		
		if(item)
		{
			var enabledAttr = subNode.getAttribute("enabled");
			if(enabledAttr)
			{
				if(item.className != "cn_navigation_panel")
				{
					if(enabledAttr == "true" && item.disabled) 
					{
						item.disabled = false;
						item.children[0].children[1].runtimeStyle.cursor = "";
					}
					else if(enabledAttr == "false" && !item.disabled) 
					{
						item.children[0].children[1].runtimeStyle.cursor = "default";
						item.disabled = true;
					}
				}
			}
			var attr = subNode.getAttribute("visible");
			if(attr) 
			{
				var hidden = attr == "false";
				if(item.className == "cn_navigation_panel")
				{
					item.style.display =  hidden ? "none" : "block";
				}
				else
				{
					item._hidden = hidden;
					if(parentElement.expanded !== false) item.style.display = hidden ? "none" : "block";
				}
			}
		}
		else
		{
			Util.assert("Can't find navigation node: " + id);
		}
		// this._walkDataNode(subNode, container);
	}
}

proto.storeData = function(xmldoc) {
	var fragment = xmldoc.createDocumentFragment();
	
	if(this._navigationCollapedChanged) {
		var node = xmldoc.createElement("navigation");
		node.setAttribute("collapsed", this._navigationCollapsed ? "true" : "false");
		fragment.appendChild(node);
		this._navigationCollapedChanged = false;
	}

	if(this._formSelected) {
		var node = xmldoc.createElement("navigation");
		node.setAttribute("form", this.selectedForm);
		fragment.appendChild(node);
		this._formSelected = false;
	}

	return fragment;
}

proto.isValid = function()
{
	return true;
}

proto.selectFormNode = function(id)
{
	if(id === null) 
	{
		// Ensure we have some panel selected and layout is ok.
		this.showActivePanel();
		return;
	}
	// NOTE: Initially id is numeric.
	var item = this._structure[id]; //this.element.all(id);
	if(item) this.selectItemDiv(item.firstChild);
}

// Properties. ========================================================
proto.set_disabled = function(value)
{
	value = eval(value);
	if(this._disabled == value) return;
	this._disabled = value;

	if(this.isBuilt) this._set_disabled();
}
proto._set_disabled = function()
{
	if(this._disabled) 
	{
		this.element.className = "cn_navigation cn_navigation_disabled";
	}
	else 
	{
		this.element.className = "cn_navigation";
	}
}

// Element functions. ===================================================
proto._init = function(node)
{
	this.element.unselectable = true;

	this._canExpandCollapse = node.getAttribute("canExpandCollapse") != "false";

	this.buildElements(node);

	this.finishBuild();
}

proto.buildElements = function(node)
{
	this.disabler = document.createElement("<div style=\"position: absolute; background: white; z-index: 1000; filter: alpha(opacity=50); width: 100%; height: 100%; visibility: hidden; \">");

	//this.panels = this.element.children;
	this.panels = [];

	var nodes = node.selectNodes("node");

	var count = nodes.length;
	for(var i = 0; i < count; i++) this.buildElement(nodes[i], i)

	this._buildCollapseElements();

	this.isBuilt = true;
}

proto.finishBuild = function()
{
	// Control deleted before it was completely built.
	if(this._deleted) return;

	if(this.panels.length > 0) 
	{
		this.showPanel(this.panels[0]);
	}
	
	this._set_disabled();
}

proto._setFinishBuildTO = function(time)
{
	var obj = this;
	setTimeout(function(){ obj.finishBuild(); }, time);
}

//proto._headerColors = ["blue", "red", "yellow", "green", "orange", "violet", "yellow2"];

proto.buildElement = function(node, ix)
{
	var panel = document.createElement("<div class=cn_navigation_panel unselectable=on>");
	this.element.appendChild(panel);
	this.panels.push(panel);
	
	var attr = node.getAttribute("id");
	if(attr) this._structure[String(attr)] = panel; //panel.id = "n" + String(attr);

	var content = document.createElement("<div class=contentDiv id=contentDiv unselectable=on>");
	panel.appendChild(content);
	
	var but = document.createElement("<div id=panelButton class=panelButton unselectable=on>");
	panel.insertBefore(but, panel.firstChild);
	
	var text = String(node.getAttribute("caption"));
	
	var table = document.createElement('<table width=100% border=0 cellpadding=0 cellspacing=0>');
	but.appendChild(table);
	var tbody = document.createElement('tbody');
	table.appendChild(tbody);
	var tr = document.createElement('tr');
	tbody.appendChild(tr);
	var td1 = document.createElement('td');
	tr.appendChild(td1);
	var img1 = document.createElement('<img width=12 height=28>');
	td1.appendChild(img1);
	var td2 = document.createElement('<td width=100% class=panelContentTD>');
	tr.appendChild(td2);
	var td3 = document.createElement('td');
	tr.appendChild(td3);
	var img2 = document.createElement('<img width=12 height=28>');
	td3.appendChild(img2);
	
	td2.innerText = text;

	if(CNFormManager.currentThemeName == "silver")
	{
		img1.src = CNFormManager.themeImagesPath + 'win-header-2-1_01.gif';
		img2.src = CNFormManager.themeImagesPath + 'win-header-2-1_03.gif';
		td2.style.background = "url('" + CNFormManager.themeImagesPath + "win-header-2-1_02.gif')";
	}
	else if(CNFormManager.vista)
	{
		img1.style.display = img2.style.display = "none";
	}
	else
	{
		//var colorPart = this._headerColors[ix];
		//if(!colorPart) colorPart = this._headerColors[0];
		var colorPart = "orange";
	
		img1.src = CNFormManager.themeImagesPath + 'win-header-2-' + colorPart + '_01.gif';
		img2.src = CNFormManager.themeImagesPath + 'win-header-2-' + colorPart + '_03.gif';
		td2.style.background = "url('" + CNFormManager.themeImagesPath + 'win-header-2-' + colorPart + "_02.gif')";
	}
	
	but.attachEvent("onclick", this._panelButton_onclick);
	but.attachEvent("ondblclick", this._panelButton_onclick);	
	but.attachEvent("onmouseenter", this._panelButton_onmouseenter);
	but.attachEvent("onmouseleave", this._panelButton_onmouseleave);

	this.panelCount++;
	
	var subNodes = node.selectNodes("node");
	if(subNodes.length > 0) this.buildNodes(subNodes, 0, content);
}

proto.buildNodes = function(nodes, level, parentElement)
{
	var count = nodes.length;
	for(var i = 0; i < count; i++)
	{
		this.buildNode(nodes[i], level, i, parentElement);
	}
}

proto.buildNode = function(node, level, index, parentElement)
{
	var nodeDiv = document.createElement("<div>");
	parentElement.appendChild(nodeDiv);
	nodeDiv.attachEvent("onselectstart", CNUtil.cancelEvent);
	nodeDiv.attachEvent("onselect", CNUtil.cancelEvent);

	var itemDiv = document.createElement("<div isItemDiv=true class=itemDiv>");
	if(level == 0) itemDiv.style.fontWeight = "bold"
	
	var attr = node.getAttribute("id");

	if(attr) 
	{
		var id = String(attr);
		this._structure[id] = nodeDiv;
		nodeDiv._id = id;
	}
	
	itemDiv.nodeIndex = index;
	nodeDiv.appendChild(itemDiv);
	
	if(node.childNodes.length > 0) itemDiv._isFolder = true;
	
	itemDiv.className += " clickable";
	nodeDiv._clickable = true;	

	var img = document.createElement("<img class=itemImage>");
	itemDiv.appendChild(img);
	
	img.width = 9;
	img.height = 12;

	var subNodes = node.selectNodes("node");
	if(subNodes.length > 0)
	{
		var expanded = node.getAttribute("expanded") == "true";
	
		if(!expanded && this.expandLevel >= level) expanded = true;
		nodeDiv.expanded = expanded;
		img.src = CNFormManager.themeImagesPath + "simple-" + (expanded ? "minus" : "plus") + ".gif";
		img.attachEvent("onclick", this._itemImage_onclick);
		img.attachEvent("ondblclick", this._itemImage_onclick);	
		if(CNFormManager.vista) {
			img.attachEvent("onmouseenter", this._itemImage_onmouseenter);
			img.attachEvent("onmouseleave", this._itemImage_onmouseleave);
		}
	}
	else
	{
		img.src = CNFormManager.themeImagesPath + "tree-arrow.gif";
	}

	var text = document.createElement("<span class=textSpan>");
	
	text.attachEvent("onclick", this._itemDiv_onclick);
	text.attachEvent("ondblclick", this._itemDiv_onclick);
	text.attachEvent("onmouseover", this._itemDiv_onmouseover);
	text.attachEvent("onmouseleave", this._itemDiv_onmouseleave);	

	itemDiv.appendChild(text);

	text.innerText = String(node.getAttribute("caption"));
	nodeDiv.style.marginLeft = level > 0 ? this.indent : 0;
	
	if(node.getAttribute("selected") == "true") this.selectItemDiv(itemDiv);
	
	if(subNodes.length > 0)
	{
		var contDiv = document.createElement("div");
		contDiv.className = "contDiv";
		nodeDiv.appendChild(contDiv);
		contDiv.style.display = expanded ? "block" : "none";
		this.buildNodes(subNodes, level + 1, contDiv);
	}
}

proto.selectItemDiv = function(itemDiv, anim)
{
	var selectedItem = this.get_selectedItem();
	//if(selectedItem == itemDiv) return;

	if(selectedItem && selectedItem.runtimeStyle) 
	{
		if(CNFormManager.vista)
		{
			this._select.style.visibility = "hidden";
		}
		else
		{
			selectedItem.children[selectedItem.children.length - 1].runtimeStyle.filter = "";
			selectedItem.children[selectedItem.children.length - 1].runtimeStyle.background = "";
			selectedItem.runtimeStyle.color = "";
			//selectedItem.children[1].runtimeStyle.cursor = "pointer";
			CNUtil.removeClass(selectedItem, "selectedItemDiv");
		}
	}
	// May be null to deselect node.
	if(itemDiv && itemDiv.runtimeStyle) 
	{
		// Try to find and show panel.
		var panel = itemDiv;
		while(panel != null && panel.className != "cn_navigation_panel") panel = panel.parentElement;
		//if(this.activePanel != panel) 
		this.showPanel(panel, anim);

		if(CNFormManager.vista)
		{
			itemDiv.style.position = "relative";
			itemDiv.appendChild(this._select);

			var hover = this._select;
			var textDiv = itemDiv.children[1];
			hover.style.left = 10;
			hover.style.width = textDiv.offsetWidth + 2;
			hover.style.height = textDiv.offsetHeight;
			this._select.style.visibility = "inherit";
		}
		else
		{
			itemDiv.runtimeStyle.color = itemDiv.currentStyle["xl--selected-color"];
			itemDiv.children[itemDiv.children.length - 1].runtimeStyle.filter = itemDiv.currentStyle["xl--selected-filter"]
			itemDiv.className += " selectedItemDiv";
		}		
	}
	this.set_selectedItem(itemDiv);	
}

proto.set_selectedItem = function(l)
{
	this.selectedItem = l;
}

proto.get_selectedItem = function()
{
	return this.selectedItem;
}

proto.showPanel = function(l, slide)
{
	if(!l || !this.element.contains(l) || l.className != "cn_navigation_panel") return;
	if(l.currentStyle.display == "none") return;
	
	var prevPanelTop = 0;
	var prevPanelBottom = 0;

	var activePanelHeight = this.element.clientHeight;
	
	for(var j = 0; j < this.panels.length; j++) 
	{
		var panel = this.panels[j];
		if(panel == l) break;
		if(panel.currentStyle.display == "none") continue

		if(slide) Animator.start(new AnimMove(panel, 0, prevPanelTop));
		else panel.style.top = prevPanelTop;
		
		var h = panel.children["panelButton"].offsetHeight - 1;
		prevPanelTop += h;
		activePanelHeight -= h;
	}
	
	for(var j = this.panels.length - 1; j > 0; j--) 
	{
		var panel = this.panels[j];
		if(panel == l) break;
		if(panel.currentStyle.display == "none") continue;
		
		var y = this.element.clientHeight - prevPanelBottom - panel.children["panelButton"].offsetHeight;

		if(slide) Animator.start(new AnimMove(panel, 0, y));
		else panel.style.top = y;
		
		var h = panel.children["panelButton"].offsetHeight - 2;
		prevPanelBottom += h;
		activePanelHeight -= h;
	}

	var h = l.children["panelButton"].offsetHeight - 1;
	l.children.contentDiv.style.height = Math.max(activePanelHeight - h - 3, 0);
	
	if(slide) Animator.start(new AnimMove(l, 0, prevPanelTop));
	else l.style.top = prevPanelTop;
	
	if(this.activePanel != l)
	{
		if(this.activePanel)
		{
			var button = this.activePanel.children.panelButton		
			button.className = "panelButton";
			button.children[0].runtimeStyle.color = "";
		}
		this.activePanel = l;
		var button = this.activePanel.children.panelButton
		button.className = "panelButton panelButtonSelected";
		button.children[0].runtimeStyle.color = button.currentStyle["xl--selected-color"];		
	}
}

proto.showPanel2 = function(l)
{
	if(!l || !this.element.contains(l) || l.className != "cn_navigation_panel"
	|| l.currentStyle.display != "block" || this.panels.length == 0) return;

	if(this.panels.length == 1) this.showPanel(this.panels[0], true);
	else if(l != this.activePanel) 
	{
		this.showPanel(l, true);
	}
	else
	{
		var prevPanel = this._findPreviousVisibleSibling(l);
		if(l == this.panels[0] || !prevPanel) 
		{
			var nextPanel = this._findNextVisibleSibling(l);
			if(nextPanel) this.showPanel(nextPanel, true);
		}
		else if(prevPanel)
		{
			this.showPanel(prevPanel, true);
		}
	}
}

proto._findNextVisibleSibling = function(l)
{
	do
	{
		l = l.nextSibling;
	}
	while(l && l.currentStyle.display != "block");
	return l;
}

proto._findPreviousVisibleSibling = function(l)
{
	do
	{
		l = l.previousSibling;
	}
	while(l && l.currentStyle.display != "block");
	return l;
}

proto.showActivePanel = function()
{
	if(!this.activePanel) return;
	this.showPanel(this.activePanel, false);
}

proto.getClickableItemDiv = function(l)
{
	var itemDiv = this.getItemDiv(l);
	var node = itemDiv.parentElement;
	if(node._clickable !== true) return null;
	return itemDiv;
}

proto.getItemDiv = function(l)
{
	var itemDiv = l;
	while(itemDiv && !itemDiv.isItemDiv) itemDiv = itemDiv.parentElement;
	return itemDiv;
}


// Event handlers. =========================================
proto._panelButton_onmouseenter = function()
{
	var panel = CNUtil.findByClassName(event.srcElement, "panelButton");
	if(panel) panel.className += " panelButtonHover";
}

proto._panelButton_onmouseleave = function()
{
	var panel = CNUtil.findByClassName(event.srcElement, "panelButton");
	if(panel) CNUtil.removeClass(panel, "panelButtonHover");
}

proto._panelButton_onclick = function()
{
	var l = event.srcElement;
	while(l && l.className != "cn_navigation_panel") l = l.parentElement;

	CNUtil.findJSObject(l).showPanel2(l);
}

proto._element_onresize = function()
{
	if(CNFormManager.changingTheme || this.formManager._loading) return;
	CNUtil.findJSObject(event.srcElement).element_onresize();
}
proto.element_onresize = function()
{
	if(!this.activePanel) return;
	if(this.resizeTimeout != null) 
	{
		clearTimeout(this.resizeTimeout);
		this.resizeTimeout = null;
	}
	var obj = this;
	this.resizeTimeout = setTimeout(function(){ obj.showActivePanel(); }, 10);
}


proto._itemDiv_onmouseover = function()
{
	CNUtil.findJSObject(event.srcElement).itemDiv_onmouseover();
}
proto.itemDiv_onmouseover = function()
{
	var itemDiv = this.getClickableItemDiv(event.srcElement);
	if(itemDiv == null || itemDiv.parentElement.disabled) return;
	
	if(CNFormManager.vista)
	{
		if(itemDiv._isFolder)
		{
			var img = itemDiv.children[0];
			img.src = "themes/vista/g/hover-" + (itemDiv.parentNode.expanded ? "minus" : "plus") + ".gif";
		}
		this._syncHoverPos(itemDiv, this._hover);
		this._hover.style.visibility = "inherit";
	}
	else
	{
		var textDiv = itemDiv.children[itemDiv.children.length - 1];
		itemDiv.runtimeStyle.color = itemDiv.currentStyle["xl--hover-color"];
		textDiv.runtimeStyle.background = itemDiv.currentStyle["xl--hover-background"]
		itemDiv.className += " hoveredItemDiv";
	}
}

proto._syncHoverPos = function(itemDiv, hover)
{
	var textDiv = itemDiv.children[1];
	var p = itemDiv.parentElement.parentElement;
	hover.style.top = itemDiv.offsetTop;
	hover.style.left = textDiv.offsetLeft - 1;
	hover.style.width = textDiv.offsetWidth + 2;
	hover.style.height = textDiv.offsetHeight;
	if(hover.parentElement != p) p.appendChild(hover);
}

proto._itemDiv_onmouseleave = function()
{
	CNUtil.findJSObject(event.srcElement).itemDiv_onmouseleave();
}
proto.itemDiv_onmouseleave = function()
{
	var itemDiv = this.getClickableItemDiv(event.srcElement);
	if(itemDiv == null || itemDiv.parentElement.disabled) return;

	if(CNFormManager.vista)
	{
		if(itemDiv._isFolder)
		{
			var img = itemDiv.children[0];
			img.src = "themes/vista/g/simple-" + (itemDiv.parentNode.expanded ? "minus" : "plus") + ".gif";	
		}
		this._hover.style.visibility = "hidden";
	}
	else
	{
		itemDiv.runtimeStyle.color = "";
		itemDiv.children[itemDiv.children.length - 1].runtimeStyle.background = "";
		CNUtil.removeClass(itemDiv, "hoveredItemDiv");
	}
}

proto._itemImage_onmouseenter = function()
{
	var jso = Util.dispatchObject();
	var itemDiv = jso.getClickableItemDiv(event.srcElement);
	if(itemDiv == null || itemDiv.parentElement.disabled) return;
	var img = event.srcElement;
	img.src = "themes/vista/g/hover-" + (itemDiv.parentNode.expanded ? "minus" : "plus") + ".gif";
}

proto._itemImage_onmouseleave = function()
{
	var jso = Util.dispatchObject();
	var itemDiv = jso.getClickableItemDiv(event.srcElement);
	if(itemDiv == null || itemDiv.parentElement.disabled) return;
	var img = event.srcElement;
	img.src = "themes/vista/g/simple-" + (itemDiv.parentNode.expanded ? "minus" : "plus") + ".gif";
}

proto._itemImage_onclick = function()
{
	CNUtil.findJSObject(event.srcElement).itemImage_onclick();
}

proto.itemImage_onclick = function()
{
	var itemDiv = this.getItemDiv(event.srcElement);
	this._toggleExpand(itemDiv, true);
}
proto._toggleExpand = function(itemDiv, userAction)
{
	var node = itemDiv.parentElement;
	
	var expanded = node.expanded = !node.expanded;
	//this.changeChildrenDisplay(node, node.expanded);
	var contDiv = node.lastChild;
	if(contDiv.className != "contDiv") return;
	
	if(userAction && CNFormManager.vista)
	{
		if(expanded)
		{
			contDiv.style.display = "block";
			var h = contDiv.offsetHeight;
			contDiv.style.overflow = "hidden";
			contDiv.style.height = "1px";
			var anim = new AnimResize(contDiv, contDiv.offsetWidth, h);
			Animator.start(anim);
			anim.onend = function()
			{
				contDiv.style.height = "auto";
				contDiv.runtimeStyle.overflow = "";
			}
		}
		else
		{
			contDiv.style.overflow = "hidden";
			var anim = new AnimResize(contDiv, contDiv.offsetWidth, 1);
			Animator.start(anim);
			anim.onend = function()
			{
				contDiv.style.height = "auto";
				contDiv.runtimeStyle.overflow = "";
				contDiv.style.display = "none";					
			}
		}
	}
	else
	{
		contDiv.style.display = expanded ? "block" : "none";
	}

	var prefix;
	if(CNFormManager.vista) prefix = "hover-";
	else prefix = "simple-";

	itemDiv.children[0].src = CNFormManager.themeImagesPath + prefix + (node.expanded ? "minus" : "plus") + ".gif";
}

proto._itemDiv_onclick = function()
{
	CNUtil.findJSObject(event.srcElement).itemDiv_onclick();
}
proto.itemDiv_onclick = function()
{
	var itemDiv = this.getClickableItemDiv(event.srcElement);
	if(itemDiv == null || itemDiv.parentElement.disabled || this.formManager._loading
	|| this.formManager.isNavigationDisabled()) return;

	if(itemDiv._isFolder)
	{
		this._toggleExpand(itemDiv, true);
	}
	else
	{
		this.selectItemDiv(itemDiv);
		
		var selectedForm;
		var id = itemDiv.parentElement._id;
		if(!id || itemDiv == this.selectedItem && id == this.formManager._currentFormID) return;
		this.selectedForm = id;
		this._formSelected = true;
		
		if(this._quickExpand) {
			this.collapse();
			var self = this;
			// Gives small pause to be able to finish animation smoothly.
			setTimeout(function() {
				self.onnodeselected({});
			}, 50);
		} else {
			this.onnodeselected({});
		}
	}
}

Util.mixin(proto, NavigationCollapseMixin);

proto = null;


