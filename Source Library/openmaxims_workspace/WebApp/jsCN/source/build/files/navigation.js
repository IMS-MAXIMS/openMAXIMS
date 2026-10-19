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

// Standards DOM nodes expose parentNode; IE exposed parentElement.
function navigationParent(element)
{
	return element && element.parentNode;
}

proto.onnodeselected = function(ev)
{
	this.formManager.postData(this.element);
}

proto.createElement = function(node, parentElement)
{
	var l = Util.createElement("div");
	parentElement.appendChild(l);
	
	this.element = l;
	l.jsObject = this;

	l.className = "cn_navigation";
	Event.add(l, "resize", this, this._element_onresize);
	
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
	Event.del(this.element, "resize", this, this._element_onresize);
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
	var childNodes = Util.xmlChildElements(node, "node");
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
						item.children[0].children[1].style.cursor = "";
					}
					else if(enabledAttr == "false" && !item.disabled) 
					{
						item.children[0].children[1].style.cursor = "default";
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
	var item = this._structure[id]; 
	if(item) this.selectItemDiv(item.firstChild);
}

// Properties. ========================================================
proto.set_disabled = function(value)
{
	value = Util.parseBoolean(value);
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
	this.element.style.userSelect = "none";

	this._canExpandCollapse = node.getAttribute("canExpandCollapse") != "false";

	this.buildElements(node);

	this.finishBuild();
}

proto.buildElements = function(node)
{
	this.disabler = Util.createElement("div");
	this.disabler.style.cssText = "position: absolute; background: white; z-index: 1000; opacity: 0.5; width: 100%; height: 100%; visibility: hidden;";

	//this.panels = this.element.children;
	this.panels = [];

	var nodes = Util.xmlChildElements(node, "node");

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
	var panel = Util.createElement("div", "cn_navigation_panel", null);
	this.element.appendChild(panel);
	this.panels.push(panel);
	
	var attr = node.getAttribute("id");
	if(attr) this._structure[String(attr)] = panel; //panel.id = "n" + String(attr);

	var content = Util.createElement("div", "contentDiv", {id: "contentDiv"});
	panel.appendChild(content);
	panel.contentDiv = content;
	
	var but = Util.createElement("div", "panelButton", {id: "panelButton"});
	panel.insertBefore(but, panel.firstChild);
	panel.panelButton = but;
	
	var text = String(node.getAttribute("caption"));
	
	var table = Util.createElement("table", null, {width: "100%", border: 0, cellpadding: 0, cellspacing: 0});
	but.appendChild(table);
	var tbody = Util.createElement("tbody");
	table.appendChild(tbody);
	var tr = Util.createElement("tr");
	tbody.appendChild(tr);
	var td1 = Util.createElement("td");
	tr.appendChild(td1);
	var img1 = Util.createElement("img", null, {width: 12, height: 28});
	td1.appendChild(img1);
	var td2 = Util.createElement("td", "panelContentTD", {width: "100%"});
	tr.appendChild(td2);
	var td3 = Util.createElement("td");
	tr.appendChild(td3);
	var img2 = Util.createElement("img", null, {width: 12, height: 28});
	td3.appendChild(img2);
	
	td2.textContent = text;

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
	
	Event.add(but, "click", this, this._panelButton_onclick);
	Event.add(but, "dblclick", this, this._panelButton_onclick);
	Event.add(but, "mouseenter", this, this._panelButton_onmouseenter);
	Event.add(but, "mouseleave", this, this._panelButton_onmouseleave);

	this.panelCount++;
	
	var subNodes = Util.xmlChildElements(node, "node");
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
	var nodeDiv = Util.createElement("div");
	parentElement.appendChild(nodeDiv);
	Event.add(nodeDiv, "select", this, CNUtil.cancelEvent);

	var itemDiv = Util.createElement("div", "itemDiv", {isItemDiv: true});
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

	var img = Util.createElement("img", "itemImage");
	itemDiv.appendChild(img);
	
	img.width = 9;
	img.height = 12;

	var subNodes = Util.xmlChildElements(node, "node");
	if(subNodes.length > 0)
	{
		var expanded = node.getAttribute("expanded") == "true";
	
		if(!expanded && this.expandLevel >= level) expanded = true;
		nodeDiv.expanded = expanded;
		img.src = CNFormManager.themeImagesPath + "simple-" + (expanded ? "minus" : "plus") + ".gif";
		Event.add(img, "click", this, this._itemImage_onclick);
		Event.add(img, "dblclick", this, this._itemImage_onclick);
		if(CNFormManager.vista) {
			Event.add(img, "mouseenter", this, this._itemImage_onmouseenter);
			Event.add(img, "mouseleave", this, this._itemImage_onmouseleave);
		}
	}
	else
	{
		img.src = CNFormManager.themeImagesPath + "tree-arrow.gif";
	}

	var text = Util.createElement("span", "textSpan");
	
	Event.add(text, "click", this, this._itemDiv_onclick);
	Event.add(text, "dblclick", this, this._itemDiv_onclick);
	Event.add(text, "mouseover", this, this._itemDiv_onmouseover);
	Event.add(text, "mouseleave", this, this._itemDiv_onmouseleave);

	itemDiv.appendChild(text);

	text.textContent = String(node.getAttribute("caption"));
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

	if(selectedItem && selectedItem.style) 
	{
		if(CNFormManager.vista)
		{
			this._select.style.visibility = "hidden";
		}
		else
		{

			selectedItem.children[selectedItem.children.length - 1].style.background = "";
			selectedItem.style.color = "";
			//selectedItem.children[1].style.cursor = "pointer";
			CNUtil.removeClass(selectedItem, "selectedItemDiv");
		}
	}
	// May be null to deselect node.
	if(itemDiv && itemDiv.style) 
	{
		// Try to find and show panel.
		var panel = itemDiv;
		while(panel != null && panel.className != "cn_navigation_panel") panel = navigationParent(panel);
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
			itemDiv.style.color = Util.getStyle(itemDiv, "xl--selected-color");

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
	if(Util.getStyle(l, "display") == "none") return;
	
	var prevPanelTop = 0;
	var prevPanelBottom = 0;

	var activePanelHeight = this.element.clientHeight;
	
	for(var j = 0; j < this.panels.length; j++) 
	{
		var panel = this.panels[j];
		if(panel == l) break;
		if(Util.getStyle(panel, "display") == "none") continue

		if(slide) Animator.start(new AnimMove(panel, 0, prevPanelTop));
		else panel.style.top = prevPanelTop;
		
		var h = panel.panelButton.offsetHeight - 1;
		prevPanelTop += h;
		activePanelHeight -= h;
	}
	
	for(var j = this.panels.length - 1; j > 0; j--) 
	{
		var panel = this.panels[j];
		if(panel == l) break;
		if(Util.getStyle(panel, "display") == "none") continue;
		
		var y = this.element.clientHeight - prevPanelBottom - panel.panelButton.offsetHeight;

		if(slide) Animator.start(new AnimMove(panel, 0, y));
		else panel.style.top = y;
		
		var h = panel.panelButton.offsetHeight - 2;
		prevPanelBottom += h;
		activePanelHeight -= h;
	}

	var h = l.panelButton.offsetHeight - 1;
	l.contentDiv.style.height = Math.max(activePanelHeight - h - 3, 0);
	
	if(slide) Animator.start(new AnimMove(l, 0, prevPanelTop));
	else l.style.top = prevPanelTop;
	
	if(this.activePanel != l)
	{
		if(this.activePanel)
		{
			var button = this.activePanel.panelButton		
			button.className = "panelButton";
			button.children[0].style.color = "";
		}
		this.activePanel = l;
		var button = this.activePanel.panelButton
		button.className = "panelButton panelButtonSelected";
		button.children[0].style.color = Util.getStyle(button, "xl--selected-color");		
	}
}

proto.showPanel2 = function(l)
{
	if(!l || !this.element.contains(l) || l.className != "cn_navigation_panel"
	|| Util.getStyle(l, "display") != "block" || this.panels.length == 0) return;

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
	while(l && Util.getStyle(l, "display") != "block");
	return l;
}

proto._findPreviousVisibleSibling = function(l)
{
	do
	{
		l = l.previousSibling;
	}
	while(l && Util.getStyle(l, "display") != "block");
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
	var node = navigationParent(itemDiv);
	if(node._clickable !== true) return null;
	return itemDiv;
}

proto.getItemDiv = function(l)
{
	var itemDiv = l;
	while(itemDiv && !itemDiv.isItemDiv) itemDiv = navigationParent(itemDiv);
	return itemDiv;
}


// Event handlers. =========================================
proto._panelButton_onmouseenter = function()
{
	var panel = CNUtil.findByClassName(Util.eventTarget(Event.current()), "panelButton");
	if(panel) panel.className += " panelButtonHover";
}

proto._panelButton_onmouseleave = function()
{
	var panel = CNUtil.findByClassName(Util.eventTarget(Event.current()), "panelButton");
	if(panel) CNUtil.removeClass(panel, "panelButtonHover");
}

proto._panelButton_onclick = function()
{
	var l = Util.eventTarget(Event.current());
	while(l && l.className != "cn_navigation_panel") l = navigationParent(l);

	CNUtil.findJSObject(l).showPanel2(l);
}

proto._element_onresize = function()
{
	if(CNFormManager.changingTheme || this.formManager._loading) return;
	CNUtil.findJSObject(Util.eventTarget(Event.current())).element_onresize();
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
	CNUtil.findJSObject(Util.eventTarget(Event.current())).itemDiv_onmouseover();
}
proto.itemDiv_onmouseover = function()
{
	var itemDiv = this.getClickableItemDiv(Util.eventTarget(Event.current()));
	if(itemDiv == null || navigationParent(itemDiv).disabled) return;
	
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
		itemDiv.style.color = Util.getStyle(itemDiv, "xl--hover-color");
		textDiv.style.background = Util.getStyle(itemDiv, "xl--hover-background")
		itemDiv.className += " hoveredItemDiv";
	}
}

proto._syncHoverPos = function(itemDiv, hover)
{
	var textDiv = itemDiv.children[1];
	var p = navigationParent(navigationParent(itemDiv));
	hover.style.top = itemDiv.offsetTop;
	hover.style.left = textDiv.offsetLeft - 1;
	hover.style.width = textDiv.offsetWidth + 2;
	hover.style.height = textDiv.offsetHeight;
	if(navigationParent(hover) != p) p.appendChild(hover);
}

proto._itemDiv_onmouseleave = function()
{
	CNUtil.findJSObject(Util.eventTarget(Event.current())).itemDiv_onmouseleave();
}
proto.itemDiv_onmouseleave = function()
{
	var itemDiv = this.getClickableItemDiv(Util.eventTarget(Event.current()));
	if(itemDiv == null || navigationParent(itemDiv).disabled) return;

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
		itemDiv.style.color = "";
		itemDiv.children[itemDiv.children.length - 1].style.background = "";
		CNUtil.removeClass(itemDiv, "hoveredItemDiv");
	}
}

proto._itemImage_onmouseenter = function()
{
	var jso = Util.dispatchObject();
	var itemDiv = jso.getClickableItemDiv(Util.eventTarget(Event.current()));
	if(itemDiv == null || navigationParent(itemDiv).disabled) return;
	var img = Util.eventTarget(Event.current());
	img.src = "themes/vista/g/hover-" + (itemDiv.parentNode.expanded ? "minus" : "plus") + ".gif";
}

proto._itemImage_onmouseleave = function()
{
	var jso = Util.dispatchObject();
	var itemDiv = jso.getClickableItemDiv(Util.eventTarget(Event.current()));
	if(itemDiv == null || navigationParent(itemDiv).disabled) return;
	var img = Util.eventTarget(Event.current());
	img.src = "themes/vista/g/simple-" + (itemDiv.parentNode.expanded ? "minus" : "plus") + ".gif";
}

proto._itemImage_onclick = function()
{
	CNUtil.findJSObject(Util.eventTarget(Event.current())).itemImage_onclick();
}

proto.itemImage_onclick = function()
{
	var itemDiv = this.getItemDiv(Util.eventTarget(Event.current()));
	this._toggleExpand(itemDiv, true);
}
proto._toggleExpand = function(itemDiv, userAction)
{
	var node = navigationParent(itemDiv);
	
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
				contDiv.style.overflow = "";
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
				contDiv.style.overflow = "";
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
	CNUtil.findJSObject(Util.eventTarget(Event.current())).itemDiv_onclick();
}
proto.itemDiv_onclick = function()
{
	var itemDiv = this.getClickableItemDiv(Util.eventTarget(Event.current()));
	if(itemDiv == null || navigationParent(itemDiv).disabled || this.formManager._loading
	|| this.formManager.isNavigationDisabled()) return;

	if(itemDiv._isFolder)
	{
		this._toggleExpand(itemDiv, true);
	}
	else
	{
		this.selectItemDiv(itemDiv);
		
		var selectedForm;
		var id = navigationParent(itemDiv)._id;
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


