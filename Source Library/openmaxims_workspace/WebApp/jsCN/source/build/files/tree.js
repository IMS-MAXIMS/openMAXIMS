/*
	v. 2.0.1
	+ vista support.
	+ ...
	+ dragDrop events.
	+ tooltips.
	+ nonodes.
	+ modified disabling.
	+ checkbox fix.
	v. 0.3
	+ nodes drag-n-drop reordering.
	+ addNode/deleteNode.
	+ inplace rename node.
	v. 0.2
	+ theme support.
	v.0.12
	+ scroll restore fixed.
	+ derived from tree.htc.
*/
function CN_tree()
{
	this.formManager = null;
	this._showRootLines = true;
	this._showLines = true;
	this._selectExpands = true;
	this._showPlus = true;
	this._collectChanges = true;
	this.changedNodesDoc = null;
	this.changedFragment = null;

	this.childType = null;

	this.isReady = false;
	
	this.nodeDivTemplate = null;
	this.nodeTypes = [];
	
	this.lineImg_Width = 19;
	this.lineImg_Height = 20;
	
	this._disabled = false;
	this._readOnly = false;
	this.selectedNodeDiv = null;
	this._selectedNodeIndex = "";
	this._expandLevel = -1;
	
	this._selectionDirty = false;
	this._checkboxDirty = false;

	this._autoPostBack = false;
	this._autoPostBackForCheckBoxes = false;

	this.typeAttributes = ["checkBox", "collapsedImage", "selectedImage", "expandedImage"];

	this.ix_lineSpan = 0;
	this.ix_plusMinusSpan = 1;
	this.ix_checkBoxSpan = 2;
	this.ix_iconImg = 3;
	this.ix_textSpan = 4;

	this.state_default = 0;
	this.state_selected = 1;
	this.state_expanded = 2;
	this.state_expandedSelected = 3;
	
	this.allowNodeDrag = false;
	this._mouseButtonPressed = false;
	this._dragging = false;
	this._dragged = null;
	this._dragTargetPos = -1;
	
	this._newNodeIndex = -100;
	
	this._allowClearSelection = false;	
	this._doPostbackOnEditEnd = false;
	this._vista = CNFormManager.vista; // Speed up variable access.
	
	this.supportsRequired = true;
}

var proto = CN_tree.prototype;
proto._typedSelectTimout = 1 * 1000; // One second.
proto._lastTypeStamp = 0;

// Events. ===========================================
proto.onselectedindexchange = function(ev)
{
	this._selectionDirty = true;

	if(!this._autoPostBack) return;
	
	this.formManager.postData(this.element);
}

proto.onexpandcollapse = function(ev){}

proto.oncheck = function(ev)
{
	if(!this._autoPostBackForCheckBoxes) return;
	
	this.formManager.postData(this.element);	
}

// ev = {reorderedNodeDiv}
proto.onnodereordered = function(ev)
{
	var newIndex = this.getDottedIndex(ev.reorderedNodeDiv);
	if(this._selectedNodeIndex == newIndex) return; // Moved to the same pos.

	var node = this.changedNodesDoc.createElement("treenodedropped");
	node.setAttribute("node", this._selectedNodeIndex);
	this._selectedNodeIndex = newIndex;
	node.setAttribute("newIndex", this._selectedNodeIndex);
	this.changedFragment.appendChild(node);
	
	if(this._autoPostBack && !this._pending_onselectedindexchangeEV) this.formManager.postData(this.element);
}

proto.onnoderenamed = function(ev)
{
	if(!this._doPostbackOnEditEnd) return;
	this._doPostbackOnEditEnd = false;

	var node = this.changedNodesDoc.createElement("treenodeedited");
	node.setAttribute("node", this.getDottedIndex(ev.nodeDiv));
	node.setAttribute("text", ev.nodeDiv.node.getAttribute("text"));
	this.changedFragment.appendChild(node);
	
	if(this._autoPostBack && !this._pending_onselectedindexchangeEV) this.formManager.postData(this.element);
}


// ev = {draggedNodeDiv, dragTarget, dragTargetPos}
// dragTargetPos = 0: insert as previous sibling, 1: insert as next sibling, 2: insert as child.
proto.onnodereorderallowed = function(ev)
{
	// 1. check for resort in the same parent.
	if(ev.dragTargetPos == 0 || ev.dragTargetPos == 1)
	{
		var parentCont = ev.draggedNodeDiv.parentElement;
		var targetCont = ev.dragTarget.parentElement;
		if(parentCont == targetCont) 
		{
			return ev.draggedNodeDiv._allowSort;
		}
	}
	// 2. check for parent change.
	var dropToType = ev.draggedNodeDiv._dropToType;
	if(!dropToType || dropToType.length == 0) 
	{
		return false;
	}

	var dropType = "";
	if(ev.dragTargetPos == 0 || ev.dragTargetPos == 1) 
	{	
		var newParentNode = ev.dragTarget.parentElement.previousSibling;
		if(!newParentNode) 
		{
			dropType = "0"; // Root.
		}
		else
		{
			dropType = newParentNode._dropType;
		}
	}
	else 
	{
		dropType = ev.dragTarget._dropType;
	}
	
	if(dropType == "") return false;

	return dropToType[dropType] ? true : false;
}


// Main. ===================================
proto.createElement = function(node, parentElement)
{
	var l = document.createElement("div");
	parentElement.appendChild(l);

	l.className = "cn_tree";
	
	this.element = l;
	l.jsObject = this;

	var attr = node.getAttribute("autoPostBack");
	if(attr) this._autoPostBack = attr == "true";
	
	attr = node.getAttribute("autoPostBackForCheckBoxes");
	if(attr) this._autoPostBackForCheckBoxes = attr == "true";
	var content = Util.createElementFromHTML('<div id="content" style="width: 100%; height: 100%; overflow: auto; ">');
	l.appendChild(content);
	Event.add(content, "mousedown", this, this._content_onmousedown);
	this._content = content;
	
	//this.disabler = Util.createElementFromHTML('<div style="position: absolute; background: white; z-index: 1000; filter: alpha(opacity=50); width: 100%; height: 100%; visibility: hidden; top: 0px; left: 0px; ">');
	//l.appendChild(this.disabler);

	this.buildElement(node);
	
	Event.add(l, "keydown", this, this._element_onkeydown);
	
	if(CNFormManager.vista)
	{
		this._hover = VistaSupport.createHover('item-gradient-5.gif', 30);
		this._hover.strokecolor = "#D8F0FA";
		this._select = VistaSupport.createHover('item-gradient-5.gif', 30);
	}
	
	return l;
}

proto.storeData = function(xmldoc)
{
	var data = null;
	var selectionData = null;
	
	var nodes = Util.xmlSelectNodes(this.changedFragment, "*");
	if(nodes.length > 0)
	{
		data = this.changedFragment.cloneNode(true);
		
		// Make it clean.
		this.changedFragment = this.changedNodesDoc.createDocumentFragment();
	}

	if(this._selectionDirty && this._selectedNodeIndex !== null)
	{
		selectionData = xmldoc.createElement("treeview");
		selectionData.setAttribute("selection", this._selectedNodeIndex);
	}

	var fragment = xmldoc.createDocumentFragment();
	if(data) fragment.appendChild(data);
	if(selectionData) fragment.appendChild(selectionData);

	this._selectionDirty = false;
	
	return fragment;
}

proto.loadData = function(node)
{
	if(this._dragging) return;

	this._selectionDirty = false;
	
	var attr = node.getAttribute("readOnly");
	if(attr) this.set_readOnly(attr == "true");

	var nodes = Util.xmlSelectNodes(node, "node");
	var count = nodes.length;

	if(nodes.length > 0 || Util.xmlSelectSingleNode(node, "nonodes"))	
	{
		if(CNFormManager.vista)
		{
			Util.removeElement(this._hover);
			Util.removeElement(this._select);
			if(this._hoverPM) Util.removeElement(this._hoverPM);
		}
		
		this.selectedNodeDiv = null;
		this._selectedNodeIndex = "";
		this.element.children["content"].innerHTML = "";
	}

	if(nodes.length > 0)
	{
		this.buildNodes(nodes, this.element.children["content"], 0, this._rootType);
	}
	
	attr = node.getAttribute("allowClearSelection");
	if(attr) this._allowClearSelection = attr == "true";

	attr = node.getAttribute("selection");
	if(attr) 
	{
		this._setTimeout_set_selectedNodeIndex(String(attr));
	}
	
	attr = node.getAttribute("dragDrop");
	if(attr) this.allowNodeDrag = attr == "true";
	
	if(node.getAttribute("beginEdit") == "true" && 	this.selectedNodeDiv)
	{
		this.beginEditLabel(this.selectedNodeDiv);
		this._doPostbackOnEditEnd = true;
	}
}

proto._setTimeout_set_selectedNodeIndex = function(value)
{
	var obj = this;
	obj._selectedNodeIndex = ""; 
	obj.set_selectedNodeIndex(value);
}

proto.buildElement = function(node)
{
	if(this.isReady) return;
	
	this._set_disabled();

	//var attr = node.getAttribute("collectChanges");
	//if(attr) this._collectChanges = attr == "true";

	if(this._collectChanges) 
	{
		this.changedNodesDoc = Util.createXMLDocument();
		this.changedFragment = this.changedNodesDoc.createDocumentFragment();
	}

	attr = node.getAttribute("showRootLines");
	if(attr) this._showRootLines = attr == "true";

	attr = node.getAttribute("showLines");
	if(attr) this._showLines = attr == "true";

	attr = node.getAttribute("selectExpands");
	if(attr) this._selectExpands = attr == "true";

	attr = node.getAttribute("showPlus");
	if(attr) this._showPlus = attr == "true";
	
	this.nodeDivTemplate = this.prebuildNodeTemplate();

	this.initializeNodeTypes(node);
	
	attr = node.getAttribute("childType");
	if(attr) this.childType = String(attr);

	var rootType = {};
	if(this.childType) 
	{
		var type = this.nodeTypes[this.childType];
		if(type) rootType = type.typeObject;
	}
	this._rootType = this.getOverridenTypeObject(rootType, node);
	if(node.getAttribute("checkBoxes")) 
	{
		this._rootType.checkBox = this.nodeTypes["__folder"].checkBox = "true";
	}
	
	Event.add(this.element, "mouseleave", this, this._element_onmouseleave);
	Event.add(this.element, "mouseup", this, this._element_onmouseup);

	this.isReady = true;
	
	this._set_expandLevel();
	this._set_selectedNodeIndex();
}

proto.initializeNodeTypes = function(node)
{
	var types = Util.xmlSelectNodes(node, "nodetype");
	var count = types.length;
	for(var i = 0; i < count; i++)
	{
		var typeNode = types[i];
		var typeObject = this.getOverridenTypeObject({}, typeNode);
		this.nodeTypes[String(typeNode.getAttribute("type"))] = typeObject;
	}
	
	// Built-in type.
	this.nodeTypes["__folder"] = {}//{collapsedImage: CNFormManager.themeImagesPath + "fold.gif", expandedImage: CNFormManager.themeImagesPath + "openfold.gif"};
}

proto.getOverridenTypeObject = function(typeObj, l)
{
	var result = null;
	for(var i = 0; i < this.typeAttributes.length; i++)
	{
		var attrName = this.typeAttributes[i];
		var attr = null;
		if(l instanceof Object) attr = l[attrName];
		else attr = l.getAttribute(attrName);
		if(attr != null)
		{
			if(result == null) result = this.cloneObject(typeObj);
			result[attrName] = String(attr);
		}
	}
	if(result == null) return typeObj;
	return result;
}

proto.buildNodes = function(nodes, parent, level, nodeType)
{
	if(!nodes) return;
	var nodesCount = nodes.length;
	for(var i = 0; i < nodesCount; i++)
	{
		this.buildNode(nodes[i], parent, level, i, nodeType);
	}
}

// NOTE: it's faster to always build all elements, even making theem invisible but without IDs, than
// optionally build with IDs specified.
proto.prebuildNodeTemplate = function()
{
	var nodeDiv = Util.createElementFromHTML("<div class=nodeDiv>");
	nodeDiv.isNodeDiv = true;
	
	var lineSpan = Util.createElementFromHTML("<span class=lineSpan>"); // 0 
	nodeDiv.appendChild(lineSpan);
	
	var pmSpan = Util.createElementFromHTML("<span class=plusMinusSpan>") // 1 
	nodeDiv.appendChild(pmSpan);
	
	var checkBoxSpan = Util.createElementFromHTML("<span class=checkBoxSpan>"); // 2 

	Event.add(checkBoxSpan, "click", this, this._checkBoxSpan_onclick);
	//Event.add(checkBoxSpan, "mousedown", this, CNUtil.cancelBubble);
	Event.add(checkBoxSpan, "dblclick", this, this._checkBoxSpan_onclick);	
	Event.add(checkBoxSpan, "mouseenter", this, this._checkBoxSpan_onmouseenter);
	Event.add(checkBoxSpan, "mouseleave", this, this._checkBoxSpan_onmouseleave);	
	nodeDiv.appendChild(checkBoxSpan);

	var icon = Util.createElementFromHTML("<img align=absmiddle class=iconImg>"); // 3 
	Event.add(icon, "mousedown", this, this._icon_textSpan_onclick);
	Event.add(icon, "dblclick", this, this._icon_textSpan_ondblclick);
	Event.add(icon, "mouseenter", this, this._icon_textSpan_onmouseenter);
	Event.add(icon, "mouseleave", this, this._icon_textSpan_onmouseleave);
	nodeDiv.appendChild(icon);
	
	var text = Util.createElementFromHTML("<span class=textSpan>"); // 4
	Event.add(text, "mousedown", this, this._icon_textSpan_onclick);
	Event.add(text, "dblclick", this, this._icon_textSpan_ondblclick);
	Event.add(text, "mouseenter", this, this._icon_textSpan_onmouseenter);
	Event.add(text, "mouseleave", this, this._icon_textSpan_onmouseleave);
	nodeDiv.appendChild(text);
	
	return nodeDiv;
}

proto.buildNode = function(node, parent, level, index, nodeType)
{
	var nodeDiv = this.nodeDivTemplate.cloneNode(true);
	
	nodeDiv.nodeIndex = index;
	node.setAttribute("nodeIndex", index);
	
	nodeDiv.node = node; // Watch for circular refs!
	nodeDiv.nodeLevel = level;
	node.setAttribute("nodeLevel", level);

	var tooltipAttr = node.getAttribute("tooltip");
	if(tooltipAttr) Tooltip.attach(nodeDiv, String(tooltipAttr));

	var children = nodeDiv.children;

	var disabled = false;
	if(node.getAttribute("enabled") == "false") disabled = nodeDiv.disabled = true; 
	
	var attr = node.getAttribute("dropType");
	if(attr && attr != "0") nodeDiv._dropType = String(attr);
	
	attr = node.getAttribute("dropToType");
	if(attr)
	{
		var ar = attr.split(/\s*,\s*/);
		var dropToTypeAr = [];
		for(var i = 0; i < ar.length; i++)
		{
			dropToTypeAr[ar[i]] = true;
		}
		nodeDiv._dropToType = dropToTypeAr;
	}
	
	// Default is true.
	nodeDiv._allowSort = node.getAttribute("allowSort") != "false";
	
	
	var attr = node.getAttribute("textColor");
	if(attr) children[this.ix_textSpan].style.color = attr;
	
	var realType = nodeType;

	var type = node.getAttribute("type");
	if(type)
	{
		var type = this.nodeTypes[String(type)];
		if(type) realType = this.getOverridenTypeObject(realType, type);
	} 
	//else if(node.childNodes.length > 0)
	//{
	//	realType = this.nodeTypes["__folder"];
	//}
	
	realType = this.getOverridenTypeObject(realType, node);
	nodeDiv.type = realType;
	
	this.buildLine(nodeDiv, node, children[this.ix_lineSpan], level);
	this.buildPM(node, children[this.ix_plusMinusSpan], level);

	var checkBoxSpan = children[this.ix_checkBoxSpan];

	var attr = node.getAttribute("checkBoxVisible");
	
	if(realType.checkBox == "true" && attr != "false"
	|| !realType.checkBox && attr == "true") 
	{
		if(this._vista)
		{
			var img = document.createElement("img");
			checkBoxSpan.appendChild(img);
			this._set_checked(img, disabled, this.isChecked(node), false, false, false);
		}
		else
			checkBoxSpan.innerHTML = this.isChecked(node) ? "&#254;" : "&#111";
	}
	else checkBoxSpan.style.display = "none";

	children[this.ix_textSpan].textContent = String(node.getAttribute("text"));
	
	parent.appendChild(nodeDiv);
	
	var childNodeType = nodeType;
	var childType = node.getAttribute("childType");
	if(childType)
	{
		var type = this.nodeTypes[String(childType)];
		// NOTE: completely new type, based on chilttype name.
		if(type) childNodeType = type.typeObject;
	}

	var expanded = this.isExpanded(node);
	this.updateImageToState(nodeDiv, expanded ? this.state_expanded : this.state_default);

	var subNodes = Util.xmlSelectNodes(node, "node");
	if(subNodes.length > 0) 
	{
		var containerDiv = this._createNodeContainer(parent);
		parent.appendChild(containerDiv);
		if(expanded) this.buildNodes(subNodes, containerDiv, level + 1, childNodeType);
		else 
		{
			containerDiv.style.display = "none";
			containerDiv.storedNodes = subNodes;
			containerDiv.storedType = childNodeType;
		}
	}

	parent.nodesBuilt = true;
	parent.storedNodes = null;
	
	return nodeDiv;
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

proto._createNodeContainer = function(parent)
{
	var containerDiv = Util.createElementFromHTML("<div class=treeContainerDiv>");
	containerDiv.style.userSelect = "none";
	containerDiv.isNodeContainer = true;
	return containerDiv;
}

proto._rebuildLine = function(nodeDiv)
{
	var lineSpan = nodeDiv.children[this.ix_lineSpan];
	var count = lineSpan.children.length;
	for(var i = count - 1; i >= 0; i--)
	{
		Util.removeElement(lineSpan.children[i]);
	}

	this.buildLine(nodeDiv, nodeDiv.node, lineSpan, parseInt(nodeDiv.node.getAttribute("nodeLevel"), 10));
}

proto._rebuildPM = function(nodeDiv)
{
	var pmSpan = nodeDiv.children[this.ix_plusMinusSpan];
	var count = pmSpan.children.length;
	for(var i = count - 1; i >= 0; i--)
	{
		Util.removeElement(pmSpan.children[i]);
	}

	Event.del(pmSpan, "mousedown", this, this._pmImg_onmousedown);
	Event.del(pmSpan, "dblclick", this, this._pmImg_onmousedown);		
	if(CNFormManager.vista)	Event.del(pmSpan, "mouseenter", this, this._pmImg_onmouseenter);
	this.buildPM(nodeDiv.node, pmSpan, parseInt(nodeDiv.node.getAttribute("nodeLevel"), 10))
}

proto.buildLine = function(nodeDiv, node, lineSpan, level)
{
	if(node.parentNode.tagName == "node")
	{
		var p = node.parentNode;
		while(this.isNode(p) && (p.getAttribute("nodeLevel") * 1 != 0 || this._showRootLines))
		{
			var lineImg = Util.createElementFromHTML("<img align=absmiddle width=" + this.lineImg_Width + " height=" + this.lineImg_Height + ">");
			lineImg._isLineImg = true;
			
			lineSpan.insertBefore(lineImg, lineSpan.firstChild);

			if(this._showLines && this.isNode(p.nextSibling)) lineImg.src = CNFormManager.themeImagesPath + "i.gif";
			else lineImg.src = CNFormManager.themeImagesPath + "white.gif";

			p = p.parentNode;
		}
	}
}

proto.buildPM = function(node, pmSpan, level)
{
	var pmImg = Util.createElementFromHTML("<img align=absmiddle width=" + this.lineImg_Width + " height=" + this.lineImg_Height + ">");
	pmSpan.appendChild(pmImg);

	var img = pmSpan.basePMImg = "";

	if(this._showPlus && (level > 0 || this._showRootLines == true))
	{
		if(this._showLines)
		{
			if(this.isNode(node.nextSibling)) 
			{
				if(!this.isNode(node.previousSibling) && !this.isNode(node.parentNode)) img = "f";
				else img = "t";
			}
			else if(this.isNode(node.previousSibling) || this.isNode(node.parentNode)) img = "l";
			else img = "r";
			
			pmSpan.basePMImg = img;
		}

		if(node.childNodes.length > 0)
		{
			if(this.isExpanded(node)) img += "minus";
			else img += "plus";
			
			// NOTE: it's important to remove all events in rebuildPM.
			Event.add(pmSpan, "mousedown", this, this._pmImg_onmousedown);
			Event.add(pmSpan, "dblclick", this, this._pmImg_onmousedown);		
			if(CNFormManager.vista)	Event.add(pmSpan, "mouseenter", this, this._pmImg_onmouseenter);
		}

		if(img.length == 0) img = "white";

		pmImg.src = CNFormManager.themeImagesPath + img + ".gif";
	}
	else
	{
		pmImg.style.display = "none";
	}
}

proto._syncHover = function(l, hover)
{
	l.style.position = "relative";
	l.appendChild(hover);
	hover.style.width = (l.offsetWidth + 2) + "px";
	hover.style.height = l.offsetHeight + "px";
	hover.style.visibility = "inherit";
}

proto.hoverNodeDiv = function(l)
{
	if(CNFormManager.vista)
	{
		this._syncHover(l.children[this.ix_textSpan], this._hover);
	}
	else if(this.selectedNodeDiv != l) l.className = "nodeDivOver";
}

proto.unhoverNodeDiv = function(l)
{
	if(CNFormManager.vista)
	{
		this._hover.style.visibility = "hidden";
		// Can't make static as node can be hovered.
		//l.children[this.ix_textSpan].style.position = "static"; 
	}
	else
	{
		if(this.selectedNodeDiv != l) l.className = "nodeDiv";
		else l.className = "nodeDivSelected";
	}
}

proto.selectNodeDiv = function(l, userClick)
{
	if(!l || this.selectedNodeDiv == l) return;
	var oldTreeNodeIndex = "";
	oldTreeNodeIndex = this._selectedNodeIndex;
	
	this.unselectNodeDiv();

	if(CNFormManager.vista)
	{
		this._syncHover(l.children[this.ix_textSpan], this._select);
	}
	else l.className = "nodeDivSelected";
	this.selectedNodeDiv = l;
	this._selectedNodeIndex = this.getDottedIndex(l);
	
	this.updateImage(l);
	
	if(userClick) 
	{
		if(!this._readOnly)
		{
			this._selectionDirty = true;
			
			if(this.onselectedindexchange) 
			{
				if(Event.current() && Event.current().button == 2 && this._autoPostBack)
				{
					// Set context menu to pending mode.
					var fm = CNFormManager.getActiveFormManager();
					fm.contextMenuPending = true;
				}
			
				var ev = {};
				ev.newTreeNodeIndex = this._selectedNodeIndex;
				ev.oldTreeNodeIndex = oldTreeNodeIndex;
				ev.node = l.node;
				ev.nodeDiv = l;

				this._pending_onselectedindexchangeEV = ev;
				Event.add(l, "mouseup", this, this._pending_node_onmouseup);
			}
		}
	}
	else
	{
		this.scrollToSelectedTO();
	}
}

proto._pending_node_onmouseup = function()
{
	var jso = CNUtil.dispatchObject();
	if(jso) jso._handle_onselectedindexchangeTO();
}

proto._handle_onselectedindexchangeTO = function()
{
	if(!this._pending_onselectedindexchangeEV) return;
	Event.del(this._pending_onselectedindexchangeEV.nodeDiv, "mouseup", this, this._pending_node_onmouseup);
	this.onselectedindexchange(this._pending_onselectedindexchangeEV);
	this._pending_onselectedindexchangeEV = null;
}

proto.scrollToSelectedTO = function()
{
	var obj = this;
	setTimeout(function(){ obj.scrollToSelected(); }, 50);
}

proto.updateImage = function(nodeDiv)
{
	var state = this.state_default;
	var expanded = this.isExpanded(nodeDiv.node);
	var selected = nodeDiv == this.selectedNodeDiv;
	if(expanded && selected) state = this.state_expandedSelected;
	else if(expanded) state = this.state_expanded;
	else if(selected) state = this.state_selected;
	this.updateImageToState(nodeDiv, state);
}

proto.updateImageToState = function(nodeDiv, state)
{
	var icon = nodeDiv.children[this.ix_iconImg];
	var type = nodeDiv.type;
	var img;

	if(state == this.state_expandedSelected)
	{
		if(type.expandedImage) img = type.expandedImage;
		else if(type.selectedImage) img = type.selectedImage;
		if(!img) img = type.collapsedImage;
	}
	else if(state == this.state_expanded)
	{
		img = type.expandedImage;
		if(!img) img = type.collapsedImage;
	}
	else if(state == this.state_selected)
	{
		if(!type.expandedImage) img = type.selectedImage;
		else img = type.collapsedImage;
		if(!img) img = type.collapsedImage;
	}
	else if(state == this.state_default) img = type.collapsedImage;

	if(!icon) return;
	
	if(img) 
	{
		icon.src = img;
		icon.style.display = "inline";		
	}
	else icon.style.display = "none";
}

proto.scrollToSelected = function()
{
	var content = this.element.children["content"];
	// Adjust scroll position.
	var xy = CNUtil.findAbsolutePos(this.selectedNodeDiv, content, true);
	content.scrollLeft = xy.x;
	content.scrollTop = xy.y;
}

proto.unselectNodeDiv = function()
{
	if(this.selectedNodeDiv == null) return;
	var l = this.selectedNodeDiv;
	if(CNFormManager.vista) 
	{
		this._select.style.visibility = "hidden";
		//l.children[this.ix_textSpan].style.position = "static";
	}
	else l.className = "nodeDiv";

	this.selectedNodeDiv = null;
	this._selectedNodeIndex = '';
	this.updateImage(l);
}

proto.toggleExpand = function(nodeDiv, userClick)
{
	this.expandCollapse(nodeDiv, !this.isExpanded(nodeDiv.node), userClick);
}

proto.expand = function(nodeDiv)
{
	this.expandCollapse(nodeDiv, true, false);
}

proto.collapse = function(nodeDiv)
{
	this.expandCollapse(nodeDiv, false, false);
}

proto.expandCollapse = function(nodeDiv, expand, userClick)
{
	var cont = nodeDiv.nextSibling;
	if(!cont || !cont.isNodeContainer) return;

	if(!expand && (!cont.nodesBuilt || !this.isExpanded(nodeDiv.node))) return;

	if(!cont.nodesBuilt)
	{
		if(expand) 
		{
			if(CNFormManager.vista && userClick) cont.style.visibility = "hidden";
			cont.style.display = "block";
			this.buildNodes(cont.storedNodes, cont, nodeDiv.nodeLevel + 1, cont.storedType);
		}
	}
	else 
	{
		if(userClick && CNFormManager.vista)
		{
			if(expand) cont.style.display = "block";
			else
			{
				cont.style.overflow = "hidden";
				var anim = new AnimResize(cont, cont.offsetWidth, 1);
				Animator.start(anim);
				anim.onend = function()
				{
					cont.style.height = "auto";
					cont.style.overflow = "";
					cont.style.display = "none";					
				};
			}
		}
		else cont.style.display = expand ? "block" : "none";
	}
	
	if(userClick && expand && CNFormManager.vista)
	{
		var h = cont.offsetHeight;
		cont.style.height = "1px";
		cont.style.overflow = "hidden";
		cont.style.visibility = "visible";
		var anim = new AnimResize(cont, cont.offsetWidth, h);
		Animator.start(anim);
		anim.onend = function()
		{
			cont.style.height = "auto";
			cont.style.overflow = "";
		};
	}

	if(cont.children.length == 0) return;

	var node = nodeDiv.node;
	node.setAttribute("expanded", expand ? "true" : "false");
	
	var pmSpan = nodeDiv.children[this.ix_plusMinusSpan];
	pmSpan.children[0].src = CNFormManager.themeImagesPath + pmSpan.basePMImg 
										+ (expand ? "minus" : "plus") + ".gif";

	this.updateImage(nodeDiv);
										
	var nodeIndex = this.getDottedIndex(nodeDiv);
	
	if(userClick)
	{
		if(this.selectedNodeDiv && cont.contains(this.selectedNodeDiv)) this.selectNodeDiv(nodeDiv, false);
		if(this._collectChanges) this.storeChangedNode(nodeIndex, "node", "expanded", expand, !expand);
	}

	var ev = {};
	ev.treeNodeIndex = nodeIndex;
	ev.node = nodeDiv.node;
	ev.expanded = expand;
	if(this.onexpandcollapse) this.onexpandcollapse(ev);
	
	if(userClick && this._autoPostBack)
	{
		this.formManager.postData(this.element);
	}
}

proto.expandNodes = function(rootNode, level)
{
	if(rootNode.nextSibling.isNodeContainer) this.expandContainers(l.nextSibling, level);
}

proto.expandContainers = function(root, level)
{
	if(level <= 0) return;

	var children = root.children;
	var count = children.length;
	for(var i = 0; i < count; i++)	
	{
		var l = children[i];
		if(l.isNodeDiv) this.expand(l);
		if(l.nextSibling && l.nextSibling.isNodeContainer) this.expandContainers(l.nextSibling, level - 1);
	}
}

proto.getDottedIndex = function(nodeDiv)
{
	return this.getNodeDottedIndex(nodeDiv.node);
}

proto.getNodeDottedIndex = function(p)
{
	var index = "";
	while(p != null && p.tagName == "node")
	{
		index = p.getAttribute("nodeIndex") + (index ? "."  + index : "");
		p = p.parentNode;
	}
	return index;
}

proto.storeChangedNode = function(nodeIndex, tagName, key, value, noStoreValue)
{
	tagName = "tree" + tagName;
	
	var node = Util.xmlSelectSingleNode(this.changedFragment, tagName + "[@node=\"" + nodeIndex + "\"]");
	var store = true;
	if(!node)
	{
		node = this.changedNodesDoc.createElement(tagName);
		node.setAttribute("node", nodeIndex);
		this.changedFragment.appendChild(node);
	}
	else
	{
		var ex = String(node.getAttribute(key));
		if(ex == String(noStoreValue)) store = false;
	}
	if(store) 
	{
		node.setAttribute(key, String(value));
	}
	else 
	{
		node.removeAttribute(key);
		// 1 == index.
		if(node.attributes.length == 1) node.parentNode.removeChild(node);
	}
}

proto.isNode = function(l)
{
	return l && l.tagName == "node";
}

proto.isExpanded = function(n)
{
	return n && String(n.getAttribute("expanded")) == "true";
}

proto.isChecked = function(n)
{
	return n && String(n.getAttribute("checked")) == "true";
}

proto.cloneObject = function(matrix)
{
	var obj = {};
	for(var i in matrix) obj[i] = matrix[i];
	return obj;
}


proto._moveNode = function(dragNodeDiv, dragTarget, dragTargetPos)
{
	if(dragTargetPos == -1 || dragNodeDiv == dragTarget) return;

	var cont = dragNodeDiv.nextSibling;
	if(cont && cont.isNodeContainer && cont.contains(dragTarget)) return;

	this.element.style.overflow = "hidden";
	
	var nodeLevel;
	if(dragTargetPos == 0) 
	{
		dragTarget.parentNode.insertBefore(dragNodeDiv, dragTarget);
		dragTarget.node.parentNode.insertBefore(dragNodeDiv.node, dragTarget.node);
		nodeLevel = parseInt(dragTarget.node.getAttribute("nodeLevel"), 10);
	}
	else if(dragTargetPos == 1) 
	{
		var realDragTarget = dragTarget;
		if(dragTarget.nextSibling && dragTarget.nextSibling.isNodeContainer) realDragTarget = dragTarget.nextSibling;
		realDragTarget.parentNode.insertBefore(dragNodeDiv, realDragTarget.nextSibling);
		dragTarget.node.parentNode.insertBefore(dragNodeDiv.node, dragTarget.node.nextSibling);
		nodeLevel = parseInt(dragTarget.node.getAttribute("nodeLevel"), 10);
	}
	else
	{
		dragTarget.node.appendChild(dragNodeDiv.node);

		var targetCont = dragTarget.nextSibling;
		if(!targetCont || !targetCont.isNodeContainer) 
		{
			targetCont = this._createNodeContainer(parent);
			targetCont.nodesBuilt = true;
			dragTarget.parentNode.insertBefore(targetCont, dragTarget.nextSibling);
			dragTarget.node.setAttribute("expanded", "true");
		}
		else if(!targetCont.nodesBuild)
		{
			this.buildNodes(targetCont.storedNodes, targetCont, dragTarget.nodeLevel + 1, targetCont.storedType);
		}
		targetCont.appendChild(dragNodeDiv);
		nodeLevel = parseInt(dragTarget.node.getAttribute("nodeLevel"), 10) + 1;
	}

	if(cont && cont.isNodeContainer) dragNodeDiv.parentNode.insertBefore(cont, dragNodeDiv.nextSibling);
	dragNodeDiv.node.setAttribute("nodeLevel", nodeLevel);

	this._refreshTree();
	
	if(this.onnodereordered) this.onnodereordered({jsObject: this, reorderedNodeDiv: dragNodeDiv});
	this.element.style.overflow = "";
}

proto._refreshTree = function()
{
	this._rebuildContainer(this.element.children["content"]);
}

proto.beginEditLabel = function(nodeDiv)
{
	if(CNFormManager.vista) 
	{
		Util.removeElement(this._select);
		Util.removeElement(this._hover)
	}

	var span = nodeDiv.children[this.ix_textSpan];
	span.className = "textEditSpan textSpan";

	span.contentEditable = true;
	Event.add(span, "select", this, this._span_onselect);
	Event.add(span, "blur", this, this._span_onblur);
	Event.add(span, "keydown", this, this._span_onkeydown);
	Event.add(span, "keyup", this, this._span_onkeyup);
	Event.add(span, "keypress", this, this._span_onkeypress);

	span.focus();
	var selection = window.getSelection();
	var range = document.createRange();
	range.selectNodeContents(span);
	selection.removeAllRanges();
	selection.addRange(range);
	
	this._currentEditLabel = nodeDiv;
}

proto.endEditLabel = function()
{
	var nodeDiv = this._currentEditLabel;
	if(!nodeDiv) return;
	this._currentEditLabel = null;
	var span = nodeDiv.children[this.ix_textSpan];
	
	Event.del(span, "select", this, this._span_onselect);
	Event.del(span, "blur", this, this._span_onblur);
	Event.del(span, "keydown", this, this._span_onkeydown);
	Event.del(span, "keyup", this, this._span_onkeyup);
	Event.del(span, "keypress", this, this._span_onkeypress);
	span.contentEditable = false;
	span.className = "textSpan";
	
	nodeDiv.node.setAttribute("text", span.textContent);

	if(document.activeElement == span) 
	{
		window.getSelection().removeAllRanges();
	}
	
	if(CNFormManager.vista)
	{
		// Reselect.
		var selected = this.selectedNodeDiv;
		if(selected)
		{
			this.selectedNodeDiv = null;
			this.selectNodeDiv(selected);
		}
	}
	
	
	if(this.onnoderenamed) this.onnoderenamed({jsObject: this, nodeDiv: nodeDiv});
}

proto._span_onselect = function()
{
	// Event cancellation is handled through preventDefault/stopPropagation.
	CNUtil.cancelBubble();
}

proto._span_onblur = function()
{
	CNUtil.dispatchObject().endEditLabel();
}

proto._span_onkeyup = function()
{
	var jsObject = CNUtil.dispatchObject();
	if(jsObject._pasted)
	{
		var span = jsObject._currentEditLabel.children[0];
		span.textContent = span.textContent;
	}
	jsObject._pasted = false;	
}

proto._span_onkeydown = function()
{
	var jsObject = CNUtil.dispatchObject();
	jsObject._pasted = false;
	// Disallow any WYSIWYG commands.
	if(!Event.current().ctrlKey) return;
	switch(Event.keyValue(Event.current()))
	{
		case 86: // V paste
			jsObject._pasted = true;
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

proto._span_onkeypress = function()
{
	if(Event.keyValue(Event.current()) ==  13)
	{
		var jsObject = CNUtil.dispatchObject();
		jsObject.endEditLabel();
		CNUtil.cancelEvent();
	}
}

proto._rebuildContainer = function(cont)
{
	var children = cont.children;
	var count = children.length;
	var index = 0;
	for(var i = 0; i < count; i++)
	{
		var child = children[i];
		if(child.isNodeDiv)
		{
			this._rebuildLine(child);
			this._rebuildPM(child);
			child.node.setAttribute("nodeIndex", index);
			child.nodeIndex = index;
			index++;
		}
		else if(child.isNodeContainer && child.nodesBuilt)
		{
			this._rebuildContainer(child);
		}
	}
}

proto.addNode = function(parentNodeDiv, label, img)
{
	// Modify xml data.
	var node = parentNodeDiv.node;
	var newNode = node.ownerDocument.createElement("node");
	newNode.setAttribute("text", label);
	if(img) newNode.setAttribute("collapsedImage", img);
	node.appendChild(newNode);	

	// Modify 
	var cont = parentNodeDiv.nextSibling;
	if(!cont || !cont.isNodeContainer) 
	{
		cont = this._createNodeContainer(parent);
		cont.nodesBuilt = true;
		parentNodeDiv.parentNode.insertBefore(cont, parentNodeDiv.nextSibling);
		node.setAttribute("expanded", "true");
	}

	var nodeDiv = this.buildNode(newNode, cont, parentNodeDiv.nodeLevel + 1, 
								this._newNodeIndex--, this._rootType);
	
	this._refreshTree();
	
	return nodeDiv;
}

proto.deleteNode = function(nodeDiv)
{
	nodeDiv.node.parentNode.removeChild(nodeDiv.node);
	var cont = nodeDiv.nextSibling;
	if(cont && cont.isNodeContainer) Util.removeElement(cont);
	Util.removeElement(nodeDiv);

	this._refreshTree();
}


// Event handlers. ==================================
proto._element_onkeydown = function()
{
	CNUtil.dispatchObject().element_onkeydown();
}
proto.element_onkeydown = function()
{
	this._processTypedWord(Event.keyValue(Event.current()), false);
}

proto._processTypedWord = function(code, select)
{
	if(this._currentEditLabel) return;
	var firstNode = this.element.children["content"].firstChild;
	if(!firstNode) return;
	
	var now = new Date().getTime();
	if(!this._currentTypedWord 
	|| this._lastTypeStamp + this._typedSelectTimout <= now)
	{
		this._currentTypedWord = "";
	}
	this._lastTypeStamp = now;

	var ch = String.fromCharCode(code).toLowerCase();
	this._currentTypedWord += ch;
	
	var startNode = this.selectedNodeDiv;
	if(!startNode) 
	{
		this._seekNodes(firstNode.node, true);
	}
	else
	{
		if(!this._seekNodes(startNode.node, true))
		{
			this._seekNodes(firstNode.node, true);
		}
	}
}

/*proto._seekNodes = function(startNode, seekUp)
{
	while(startNode)
	{
		if((this._currentTypedWord.length != 1 || startNode != this.selectedNodeDiv.node)
			 //&& !startNode.disabled
		 )
		{
			if(startNode.isNodeDiv)
			{
				var text = startNode.children[4].textContent;
				if(text.toLowerCase().indexOf(this._currentTypedWord) == 0)
				{
					this.set_selectedNodeIndex(this.getDottedIndex(startNode), true);
					return true;
				}
			}
			else if(startNode.isNodeContainer)
			{
				if(this._seekNodes(startNode.firstChild, false)) return true;
			}
		}
		var nextNode = startNode.nextSibling;
		if(seekUp && nextNode == null)
		{
			var p = startNode;
			do
			{
				p = p.parentNode;
				if(p && p.isNodeContainer) nextNode = p.nextSibling;
				else break;
			}
			while(nextNode == null);	
		}
		startNode = nextNode;
	}
	return false;
}*/


proto._seekNodes = function(startNode, seekUp)
{
	while(startNode && startNode.nodeType == 1)
	{
		if((this._currentTypedWord.lhellhength != 1 
			|| this.selectedNodeDiv == null || startNode != this.selectedNodeDiv.node))
		{
			var text = startNode.getAttribute("text");
			if(text != null && text.toLowerCase().indexOf(this._currentTypedWord) == 0)
			{
				// Node index is unknown probably.
				if(this._selectNode(startNode)) return true;
			}
		}
		if(startNode.childNodes.length > 0)
		{
			if(this._seekNodes(startNode.firstChild, false)) return true;
		}

		var nextNode = startNode.nextSibling;
		if(seekUp && nextNode == null)
		{
			var p = startNode;
			do
			{
				p = p.parentNode;
				if(p && p.tagName == "node") nextNode = p.nextSibling;
				else break;
			}
			while(nextNode == null);	
		}
		startNode = nextNode;
	}
	return false;
}

proto._selectNode = function(node)
{
	var builtNode = node;
	var ni = null;
	var upperNodes = [];
	while(builtNode && (ni = builtNode.getAttribute("nodeIndex")) == null)
	{
		upperNodes.push(builtNode);
		builtNode = builtNode.parentNode;
	}
	
	if(builtNode == null || ni == null) 
	{
		alert("ASSERT: can't select by xml node");
		return true;
	}
	
	for(var i = upperNodes.length - 1; i >= 0; i--)
	{
		var index = this.getNodeDottedIndex(upperNodes[i]);
		var p = this._findAndExpandByNodeIndex(index);
	}
	
	return this.set_selectedNodeIndex(this.getNodeDottedIndex(node), true, true);
}

proto._content_onmousedown = function()
{
	var jso = CNUtil.dispatchObject();
	if(jso) jso.content_onmousedown();
}
proto.content_onmousedown = function()
{
	if(this._disabled || !this._allowClearSelection || this.selectedNodeDiv == null
	|| this._currentEditLabel != null) return;
	var l = CNUtil.eventTarget();
	if(l.className != 'nodeDiv' && l.className != 'nodeDivSelected' && l.id != 'content') 
	{
		return;
	}
	var content = this.element.children['content'];
	var bounds = content.getBoundingClientRect();
	if(Event.current().clientX >= bounds.left + content.clientWidth ||
		Event.current().clientY >= bounds.top + content.clientHeight) return;
	
	this.unselectNodeDiv();
	this._selectionDirty = true;
	this._selectedNodeIndex = -1;
	var ev = {};
	this.onselectedindexchange(ev);
}

proto._checkBoxSpan_onclick = function()
{
	CNUtil.findJSObject(CNUtil.eventTarget()).checkBoxSpan_onclick();
}
proto.checkBoxSpan_onclick = function()
{
	if(this._readOnly || this._disabled) return;
	
	//CNUtil.cancelBubble();
	
	var l = Util.findByClassName(CNUtil.eventTarget(), "checkBoxSpan");
	var nodeDiv = CNUtil.findTag(l, "DIV");
	if(nodeDiv.node.getAttribute("enabled") == "false") return;
	var checked = !this.isChecked(nodeDiv.node);
	nodeDiv.node.setAttribute("checked", checked ? "true" : "false");
	if(this._vista) this._set_checked(l.firstChild, false, checked, true, true, true);	
	else l.innerHTML = checked ? "&#254;" : "&#111;";

	var ix = this.getDottedIndex(nodeDiv);

	if(this._collectChanges) this.storeChangedNode(ix, "nodecheckbox", "checked", checked, !checked);

	var ev = {};
	ev.treeNodeIndex = ix;
	ev.checked = checked;
	ev.node = nodeDiv.node;
	if(this.oncheck) this.oncheck(ev);
}

proto._checkBoxSpan_onmouseenter = function()
{
	var l = CNUtil.eventTarget();
	var jsObject = CNUtil.findJSObject(l);

	if(jsObject._readOnly || jsObject._disabled) return;
	if(jsObject._vista) 
	{
		var nodeDiv = CNUtil.findTag(l, "DIV");
		if(nodeDiv.node.getAttribute("enabled") == "false") return;
		var checked = jsObject.isChecked(nodeDiv.node);
		jsObject._set_checked(l.firstChild, false, checked, true, true, true);	
	}
	else l.style.color = Util.getStyle(l, "xl--hover-color");
}

proto._checkBoxSpan_onmouseleave = function()
{
	var l = CNUtil.eventTarget();
	var jsObject = CNUtil.findJSObject(l);

	if(jsObject._readOnly || jsObject._disabled) return;
	if(jsObject._vista) 
	{
		var nodeDiv = CNUtil.findTag(l, "DIV");
		if(nodeDiv.node.getAttribute("enabled") == "false") return;
		var checked = jsObject.isChecked(nodeDiv.node);
		jsObject._set_checked(l.firstChild, false, checked, false, true, true);	
	}
	else l.style.color = "";
}

proto._icon_textSpan_onclick = function()
{
	CNUtil.findJSObject(CNUtil.eventTarget()).icon_textSpan_onclick();
}
proto.icon_textSpan_onclick = function()
{
	//CNUtil.cancelBubble();
	var l = CNUtil.eventTarget();
	if(this._disabled) return;

	var nodeDiv = CNUtil.findTag(l, "DIV");
	if(nodeDiv.node.getAttribute("enabled") == "false") return;
	
	this.selectNodeDiv(nodeDiv, true);
	if(this._selectExpands && !this.isExpanded(nodeDiv.node)) this.expandCollapse(nodeDiv, true, true);
	
	this._mouseButtonPressed = true;
}

proto._icon_textSpan_ondblclick = function()
{
	CNUtil.findJSObject(CNUtil.eventTarget()).icon_textSpan_ondblclick();
}
proto.icon_textSpan_ondblclick = function()
{
	var l = CNUtil.eventTarget();
	if(this._disabled) return;
	var nodeDiv = CNUtil.findTag(l, "DIV");
	if(nodeDiv.node.getAttribute("enabled") == "false") return;
	
	this.selectNodeDiv(nodeDiv, true);
	this.toggleExpand(nodeDiv, true);
}

proto._icon_textSpan_onmouseenter = function()
{
	CNUtil.findJSObject(CNUtil.eventTarget()).icon_textSpan_onmouseenter();
}
proto.icon_textSpan_onmouseenter = function()
{
	var l = CNUtil.eventTarget();	
	if(this._disabled) return;
	var nodeDiv = CNUtil.findTag(l, "DIV");
	if(nodeDiv.node.getAttribute("enabled") == "false") return;

	this.hoverNodeDiv(nodeDiv);
}

proto._icon_textSpan_onmouseleave = function()
{
	CNUtil.findJSObject(CNUtil.eventTarget()).icon_textSpan_onmouseleave();
}
proto.icon_textSpan_onmouseleave = function()
{
	if(this._disabled) return;
	var l = CNUtil.eventTarget();
	var nodeDiv = CNUtil.findTag(l, "DIV");
	if(nodeDiv.node.getAttribute("enabled") == "false") return;

	this.unhoverNodeDiv(nodeDiv);
	
	// Drag-and-drop.
	if(this.allowNodeDrag && !this._dragging && this._mouseButtonPressed && this.selectedNodeDiv == nodeDiv
	&& !nodeDiv._noDrag)
	{
		this._dragging = true;
		
		this._insertCursor = Util.createElementFromHTML("<div class=insertCursor>");
		this._insertCursor.style.userSelect = "none";
		this._insertCursor.style.position = "absolute";
		this._insertCursor.style.top = "-10px";
		this._insertCursor.style.left = "-10px";
		this.element.appendChild(this._insertCursor);

		var dragged = document.createElement("span");
		dragged.style.position = "absolute";
		dragged.style.userSelect = "none";
		
		dragged.textContent = nodeDiv.children[4].textContent;
		dragged.className = "draggedNode"
		this.element.appendChild(dragged);
		
		this._dragged = dragged;
		this._dragNodeDiv = nodeDiv;
		
		var xy = CNUtil.findAbsolutePos(nodeDiv.children[4], this.element);

		this._startX = xy.x - Event.current().screenX;
		this._startY = xy.y - Event.current().screenY;

		dragged.style.top = (xy.y - this._content.scrollTop) + "px";
		dragged.style.left = (xy.x - this._content.scrollLeft) + "px";

		Event.add(document, "mousemove", this, this.element_onmousemove);
		Event.add(document, "mouseup", this, this.element_onmouseup);
	}
}

proto._element_onmousemove = function()
{
	var jsObject = CNUtil.dispatchObject();
	if(jsObject) jsObject.element_onmousemove();
}
proto.element_onmousemove = function()
{
	if(this._disabled) return;
	this._dragged.style.left = (this._startX + Event.current().screenX - this._content.scrollLeft) + "px";
	this._dragged.style.top = (this._startY + Event.current().screenY - this._content.scrollTop) + "px";

	this._insertCursor.style.display = "none";
	this._dragged.style.display = "none";
	var l = document.elementFromPoint(Event.current().clientX, Event.current().clientY);
	this._dragged.style.display = "block";
	this._insertCursor.style.display = "block";
	
	if(!l) return;

	if(l != this.element.children["content"])
	{
		var nodeDiv = CNUtil.findTag(l, "DIV");
		if(nodeDiv && nodeDiv.isNodeDiv)
		{
			this._dragTarget = nodeDiv;
	
			var textElement = nodeDiv.children[4];
			
			this._dehighlightTextElement();
		
			var xy = CNUtil.findAbsolutePos(textElement, this.element);
			var clientXY = CNUtil.findAbsolutePos(textElement);
					
			if(Event.current().clientY < clientXY.y + 5 - this._content.scrollTop)
			{
				this._insertCursor.style.visibility = "inherit";
				this._insertCursor.style.top = (xy.y - 2 - this._content.scrollTop) + "px"; 
				this._dragTargetPos = 0;
			}
			else if(Event.current().clientY >= clientXY.y + 5 - this._content.scrollTop && Event.current().clientY < clientXY.y + 15 - this._content.scrollTop)
			{
				this._insertCursor.style.visibility = "hidden";
				// Put as a child.
				this._dragTargetPos = 2;
				textElement.style.background = Util.getStyle(this.element, "xl--drag-over-background");
				this._highlightedTextElement = textElement;
			}
			else
			{
				this._insertCursor.style.visibility = "inherit";
				this._insertCursor.style.top = (xy.y + textElement.offsetHeight - this._content.scrollTop) + "px";
				this._dragTargetPos = 1;
			}
	
			this._insertCursor.style.width = (textElement.offsetWidth + 10) + "px";		
			this._insertCursor.style.left = (xy.x - 5 - this._content.scrollLeft) + "px";
	
			var cont = this._dragNodeDiv.nextSibling;
			
			if(cont && cont.isNodeContainer && cont.contains(this._dragTarget)
			|| !this.onnodereorderallowed({draggedNodeDiv: this._dragNodeDiv, dragTarget: this._dragTarget, dragTargetPos: this._dragTargetPos}))
			{
				this._dragTargetPos = -1;
				this.element.style.cursor = "not-allowed";
			}
			else
			{
				this.element.style.cursor = "default";
			}
		}
	}
}

proto._dehighlightTextElement = function()
{
	if(this._highlightedTextElement)
	{
		this._highlightedTextElement.style.background = "";
		this._highlightedTextElement = null;
	}
}

proto._element_onmouseup = function()
{
	var jsObject = CNUtil.dispatchObject();
	if(jsObject) jsObject.element_onmouseup();
}
proto.element_onmouseup = function()
{
	if(this._disabled) return;
	this._mouseButtonPressed = false;
	if(this._dragging) 
	{
		if(this._dragTarget) this._moveNode(this._dragNodeDiv, this._dragTarget, this._dragTargetPos);

		this.element_onlosecapture();
	}
}

proto._element_onlosecapture = function()
{
	CNUtil.dispatchObject().element_onlosecapture();
}
proto.element_onlosecapture = function()
{
	Event.del(document, "mousemove", this, this.element_onmousemove);
	Event.del(document, "mouseup", this, this.element_onmouseup);
	
	this._dehighlightTextElement();
	this.element.style.cursor = "default";
	
	Util.removeElement(this._insertCursor);
	this._insertCursor = null;
	
	Util.removeElement(this._dragged);
	
	this._dragTarget = null;
	this._dragNodeDiv = null;

	this._mouseButtonPressed = false;
	this._dragging = false;
	this._dragged = null;
	
	// Check for pending selection event.
	if(this._pending_onselectedindexchangeEV) this._handle_onselectedindexchangeTO();
}

proto._pmImg_onmousedown = function()
{
	var jso = CNUtil.findJSObject(CNUtil.eventTarget());
	if(jso) jso.pmImg_onmousedown();
}
proto.pmImg_onmousedown = function()
{
	if(Event.current().button != 0 && Event.current().button != 1) return;
	var l = CNUtil.eventTarget();
	var div = CNUtil.findTag(l, "DIV");
	this.toggleExpand(div, true);
	if(CNFormManager.vista)
	{
		var span = div.children[this.ix_plusMinusSpan];
		var expanded = this.isExpanded(div.node);
		var hoverIMG = span.lastChild;
		if(hoverIMG._hover) hoverIMG.src = expanded ? "themes/vista/g/hover-minus.gif" : "themes/vista/g/hover-plus.gif";
	}
}

proto._pmImg_onmouseenter = function()
{
	var div = Util.findTag(CNUtil.eventTarget(), "DIV");
	var jso = Util.findJSObject(div);
	var span = div.children[jso.ix_plusMinusSpan];
	if(span.lastChild._hover) return;
	
	//span.style.border = "1px solid red";
	
	var expanded = jso.isExpanded(div.node);
	var hoverIMG = document.createElement("img");
	span.style.position = "relative";
	hoverIMG._hover = true;
	hoverIMG.src = expanded ? "themes/vista/g/hover-minus.gif" : "themes/vista/g/hover-plus.gif";
	hoverIMG.style.position = "absolute";
	hoverIMG.style.left = "5px";
	hoverIMG.style.top = "5px";
	span.appendChild(hoverIMG);
	Event.add(span, "mouseleave", this, jso._pmImg_onmouseleave);
	jso._hoverPM = hoverIMG;
}
proto._pmImg_onmouseleave = function()
{
	var span = CNUtil.eventTarget();
	var jso = Util.findJSObject(span);
	Event.del(span, "mouseleave", this, jso._pmImg_onmouseleave);
//	span.style.position = "static"; // Commented as this makes hover to be misaligned to the right.
	if(span.lastChild && span.lastChild._hover) Util.removeElement(span.lastChild);
	jso._hoverPM = null;
}


proto._element_onmouseleave = function()
{
	var jsObject = CNUtil.dispatchObject();
	if(jsObject) jsObject.element_onmouseleave();
}
proto.element_onmouseleave = function()
{
	// Reset.
	this._mouseButtonPressed = false;
	
	// Document listeners keep the drag active after the pointer leaves the tree.
}


// Properties. ===================================
proto.set_readOnly = function(value)
{
	this._readOnly = Util.parseBoolean(value);
	this.element.style.backgroundColor = 
		this._disabled || this._readOnly ? Util.getStyle(this.element, "xl--disabled-background") : "";
}

proto.set_selectedNodeIndex = function(value, userClick, doNotSelectDisabled)
{
	if(this._selectedNodeIndex == value) return;
	this._selectedNodeIndex = value;
	if(!this.isReady) return true;
	return this._set_selectedNodeIndex(userClick, doNotSelectDisabled);
}

proto._set_selectedNodeIndex = function(userClick, doNotSelectDisabled)
{
	if(this._selectedNodeIndex == "" || parseInt(this._selectedNodeIndex) == -1)
	{
		this.unselectNodeDiv();
		return;
	}
	var p = this._findAndExpandByNodeIndex(this._selectedNodeIndex);

	if(p && (!doNotSelectDisabled || !p.disabled))
	{
		this.selectNodeDiv(p, userClick);
		return true;
	}
	return false;
}

proto._findAndExpandByNodeIndex = function(index)
{
	var ar = index.split(".");
	if(ar.length == 0) 
	{
		alert("ASSERT: _set_selectedNodeIndex: ar.length == 0");
		return null;
	}
	var p = this.element.children["content"];

	for(var i = 0; i < ar.length; i++)
	{
		if(!p) return;
		this.expand(p);

		var oldp = p;
		var index = parseInt(ar[i]);

		if(p.nextSibling && p.nextSibling.isNodeContainer) p = p.nextSibling;
		var count = p.children.length;
		for(var j = 0; j < count; j++)
		{
			if(parseInt(p.children[j].nodeIndex) == index)
			{
				p = p.children[j];
				break;
			}
		}
		if(p == oldp) 
		{
			alert("ASSERT: No such index: " + this._selectedNodeIndex);
			return null;
		}
	}
	if(p.isNodeContainer) p = p.previousSibling;
	return p;
}

proto.set_disabled = function(value)
{
	value = Util.parseBoolean(value);
	if(this._disabled == value) return;
	this._disabled = value;

	if(!this.isReady) return;
	this._set_disabled();
}

proto._set_disabled = function()
{
//	this.disabler.style.visibility = this._disabled ? "inherit" : "hidden";
	this.element.style.backgroundColor = 
		this._disabled || this._readOnly ? Util.getStyle(this.element, "xl--disabled-background") : "";
	var content = this.element.children[0];
	content.style.opacity = this._disabled ? "0.5" : "";
}

proto.set_expandLevel = function(value)
{
	if(this._expandLevel == value) return;
	this._expandLevel = value * 1;
	if(this.isReady) this._set_expandLevel()
}

proto._set_expandLevel = function()
{
	if(this._expandLevel > 0) this.expandContainers(this.element.children["content"], this._expandLevel);
}

proto.get_changedNodesDOM = function()
{
	return this.changedFragment;
}
