/*
	v. 2.0.4
*/
function TopButtons(element)
{
	this._cols = 3;
	this._colWidth = 166;
	this._scrollStep = 8;
	
	this.element = element;
	element.jsObject = this;

	this._topSpan = document.createElement("span");
	this.element.appendChild(this._topSpan);

	this._defaultButtons = false;

	this._timer = null;
	this._buttons = [];
	this._sections = [];
	this._disabled = false;
	
	this._createMore();
	
	if(CNFormManager.vista) this._buildHover();
}
var proto = TopButtons.prototype; 

proto._buildHover = function()
{
	var div = this._hoverDiv = document.createElement("<div class='topButtonHover'>");
	document.body.appendChild(div);
	var div1 = document.createElement("<div class='topButtonHover1'>");
	div.appendChild(div1);
	var div2 = document.createElement("<div class='topButtonHover2'>");
	div.appendChild(div2);
	var div3 = document.createElement("<div class='topButtonHover3'>");
	div.appendChild(div3);
}


proto.unload = function()
{
	this._buttons = null;
	this._sections = null;

	if(this._moreDiv && this._moreDiv.shadow) 
	{
		this._moreDiv.shadow.destroy();
		this._moreDiv.shadow = null;
	}

	if(this._moreDiv)
	{
		this._moreDiv.jsObject = null;
		this._moreDiv = null;
	}
}

proto.loadData = function(node)
{
	var createNode = node.selectSingleNode("create");
	if(createNode) 
	{
		this._clean();

		var linkNodes = createNode.selectNodes("link");
		var count = linkNodes.length;
		this._createButtons(this._topSpan, linkNodes, count, true);
		//this._modifyButtonsByNodes(linkNodes, count);	 // No need, as modifyButton is called for every button in _createButton.

		this._createMoreSections(createNode);
	}

	var modifyNode = node.selectSingleNode("modify");
	if(modifyNode)
	{
		var linkNodes = modifyNode.selectNodes("link");
		var count = linkNodes.length;
		this._modifyButtonsByNodes(linkNodes, count);	

		this._modifyMoreSections(modifyNode);
	}
}

proto.set_disabled = function(disabled)
{
	this._disabled = disabled;
	this.element.className = disabled ? "topRightControls topRightControls_disabled" : "topRightControls" ;
}

proto._createMoreSections = function(node)
{
	var moreNode = node.selectSingleNode("more");
	if(!moreNode) return;
	
	this._modifyMore(moreNode);
	
	var sections = moreNode.selectNodes("section");
	for(var i = 0; i < sections.length; i++)
	{
		this._createSection(sections[i]);
	}
}

proto._modifyMore = function(node)
{
	var attr = node.getAttribute("visible");
	this._moreLink.style.display = attr != "false" ? "inline-block" : "none";
	
	var doResize = false;
	attr = node.getAttribute("colWidth");
	if(attr)
	{
		var colWidth = parseInt(attr, 10);
		if(!isNaN(colWidth) && colWidth != this._colWidth)
		{
			this._colWidth = colWidth;
			doResize = true;
			var w = this._colWidth + "px";
			for(var id in this._buttons)
			{
				var b = this._buttons[id];
				if(!b._top) 
				{
					b.style.width = w;
				}
			}
		}
	}

	attr = node.getAttribute("cols");
	if(attr)
	{
		var cols = parseInt(attr, 10);
		if(!isNaN(cols) && cols != this._cols) 
		{
			this._cols = cols;
			doResize = true;
		}
	}
	
	if(doResize) this._resizeMoreSubDiv();
}

proto._resizeMoreSubDiv = function()
{
	this._moreSubDiv.style.width = (this._cols * this._colWidth + 2) + "px";
	var lines = this._moreSubDiv.getElementsByTagName("div");
	var count = lines.length;
	//var w = (this._cols * this._colWidth - 6) + "px";
	for(var i = 0; i < count; i++)
	{
		var line = lines[i];
		if(line.className != "sectionCaptionLine") continue;
		this._resizeSectionLine(line);
		//line.style.width = w;
	}
}

proto._createSection = function(node)
{
	var div = document.createElement("div");
	this._moreSubDiv.appendChild(div);

	this._createSectionCaption(div);
	
	var linkNodes = node.selectNodes("link");
	var count = linkNodes.length;
	this._createButtons(div, linkNodes, count, false);
	this._modifyButtonsByNodes(linkNodes, count);	
		
	var attr = node.getAttribute("id");
	if(attr) this._sections[String(attr)] = div;
	
	this._modifySection(div, node);
}

proto._modifyMoreSections = function(node)
{
	var moreNode = node.selectSingleNode("more");
	this._modifyMore(moreNode);

	var sections = moreNode.selectNodes("section");
	count = sections.length;
	for(var i = 0; i < count; i++)
	{
		var sectionNode = sections[i];
		this._modifySectionByNode(sectionNode);
		
		var linkNodes = sectionNode.selectNodes("link");
		var count = linkNodes.length;
		if(count > 0) this._modifyButtonsByNodes(linkNodes, count);			
	}
}

proto._modifySectionByNode = function(node)
{
	var attr = node.getAttribute("id");
	if(!attr) return;
	var id = String(attr);

	var section = this._sections[id];
	if(!section) return;
	
	this._modifySection(section, node);
}

proto._modifySection = function(section, node)
{
	var attr = node.getAttribute("visible");
	if(attr) section.style.display = attr == "true" ? "block" : "none";

	attr = node.getAttribute("caption");
	if(attr != null)
	{
		var caption = String(attr);
		var captionDiv = section.firstChild;
		if(caption == "")
		{
			captionDiv.lastChild.innerText = "";
			captionDiv.style.display = "none";
		}
		else
		{
			captionDiv.lastChild.innerText = caption;
			captionDiv.style.display = "block";
		}
		this._resizeSectionLine(captionDiv.firstChild);
	}
}

proto._createSectionCaption = function(div)
{
	var captionDiv = document.createElement("div");
	div.insertBefore(captionDiv, div.firstChild);
	captionDiv.className = "sectionCaptionDiv";

	var span2 = document.createElement("div");
	span2.className = "sectionCaptionLine";
	captionDiv.appendChild(span2);
	
	var span1 = document.createElement("span");
	span1.className = "sectionCaptionText";
	captionDiv.appendChild(span1);
	
	this._resizeSectionLine(span2);

	captionDiv.style.display = "none";
}

proto._resizeSectionLine = function(l)
{
	var x = l.nextSibling.offsetWidth;
	l.style.left = x + "px";
	l.style.width = Math.max(1, ((this._colWidth * this._cols) - 6) - x) + "px";
}

proto._modifyButtonsByNodes = function(linkNodes, count)
{
	for(var i = 0; i < count; i++)
	{
		var linkNode = linkNodes[i];

		var id = String(linkNode.getAttribute("id"));
		var button = this._buttons[id];
		if(!button) continue;
		
		this._modifyButton(button, linkNode);
	}
}

proto._modifyButton = function(link, linkNode)
{
	var attr = linkNode.getAttribute("text");
	if(attr != null)
	{
		if(attr == "")
		{
			link.lastChild.innerText = "";
			link.lastChild.style.display = "none";
		}
		else
		{
			link.lastChild.style.display = "inline";
			link.lastChild.innerText = String(attr);
		}
	}

	attr = linkNode.getAttribute("image");
	if(attr != null)
	{
		var imgSpan = link.firstChild;
		if(link._top)
		{
			if(attr == "")
			{
				imgSpan.style.display = "none";
			}
			else
			{
				imgSpan.style.display = "inline";
				try
				{
					imgSpan.filters[0].src = CNFormManager.themeImagesPath + attr;
					imgSpan.filters[0].enabled = true;
				}
				catch(e){}
			}
		}
		else
		{
			link.firstChild.style.display = "inline";
			if(attr == "")
			{
				imgSpan.filters[0].enabled = false;
			}
			else
			{
				try
				{
					imgSpan.filters[0].src = CNFormManager.themeImagesPath + attr;
					imgSpan.filters[0].enabled = true;
				}
				catch(e){}
			}
		}
	}

	var attr = linkNode.getAttribute("action");
	if(attr != null) link._action = String(attr);
	else
	{
		attr = linkNode.getAttribute("url")
		if(attr != null) link._url = String(attr);
	}

	var attr = linkNode.getAttribute("enabled");
	if(attr) this._button_setDisabled(link, attr == "false");

	attr = linkNode.getAttribute("visible");
	if(attr) this._button_setVisible(link, attr == "true");
	
	attr = linkNode.getAttribute("alwaysEnabled")
	if(attr)
	{
		var alwaysEnabled = attr == "true";
		link._alwaysEnabled = alwaysEnabled;
		link.style.cursor = alwaysEnabled ? "pointer" : "";
	}
}

proto._createMore = function()
{
	var link = document.createElement("<a href='#' class='moreButton hoverable' tabIndex='-1'>");
	link.style.display = "none";
	link.innerText = "More ";

	this.element.appendChild(document.createTextNode("  "));
	this.element.appendChild(link);
	var downAr = document.createElement("<img src='" + CNFormManager.themeImagesPath + "/down-ar-1.gif'>");
	link.appendChild(downAr);
	link.attachEvent("onmouseover", this._more_onmouseover);
	link.attachEvent("onmouseout", this._more_onmouseout);
	
	var div = document.createElement('div');
	div.className = "topButtonsMoreDiv"
	document.body.appendChild(div);	
	this._moreDiv = div;	
	
	this._moreLink = link;
	new Shadow(div, false, true);
	
	div.attachEvent("onmouseover", this._moreDiv_onmouseover);
	div.attachEvent("onmouseout", this._moreDiv_onmouseout);
		
	this._moreDiv.jsObject = this;

	var subDiv = document.createElement("div");
	this._moreDiv.appendChild(subDiv);
	this._moreSubDiv = subDiv;
}

proto._more_onmouseout = function()
{
	CNUtil.dispatchObject().more_onmouseout();
}
proto.more_onmouseout = function()
{
	if(this._moreDiv.contains(event.toElement)) return;
	this._hideMore();
}

proto._more_onmouseover = function()
{
	CNUtil.dispatchObject().more_onmouseover();
}
proto.more_onmouseover = function()
{
	if(this._hideMoreTO) 
	{
		clearTimeout(this._hideMoreTO)
		this._hideMoreTO = null;
	}
	
	if(this._moreDiv.currentStyle.visibility == "inherit") return;

	if(CNFormManager.vista) this._showHover(this._moreLink);
	
	var l = CNUtil.findTag(event.srcElement, "A");
	var xy = CNUtil.findAbsolutePos(l);
	//this._moreDiv.style.display = "block";
	this._moreDiv.style.visibility = "inherit";
	this._moreDiv.style.width = "10px";
	this._moreDiv.style.height = "10px";

	this._moreDiv.style.backgroundColor = document.body.currentStyle.backgroundColor;
	
	var offset = CNFormManager.vista ? 4 : 0;
	this._moreDiv.style.left = xy.x - this._moreDiv.offsetWidth + l.offsetWidth + offset + "px";
	this._moreDiv.style.top = xy.y + l.offsetHeight - 6 + "px";
	
	l.filters[0].opacity = 100;
	
	var w = this._moreSubDiv.offsetWidth + 2;
	this._moreInAnim = new AnimResize(this._moreDiv, w, this._moreSubDiv.offsetHeight + 2, w, 0);	
	this._moreInAnim.onend = function()
	{
		if(this.l.shadow) this.l.shadow.show();
	}	
	Animator.start(this._moreInAnim);
}

proto._moreDiv_onmouseout = function()
{
	CNFormManager.getBaseFormManager()._topButtons.moreDiv_onmouseout();
}
proto.moreDiv_onmouseout = function()
{
	if(this._moreDiv == event.toElement || this._moreDiv.contains(event.toElement)) return;
	this._hideMore();
}

proto._moreDiv_onmouseover = function()
{
	CNFormManager.getBaseFormManager()._topButtons.moreDiv_onmouseover();
}
proto.moreDiv_onmouseover = function()
{
	if(this._hideMoreTO) 
	{
		clearTimeout(this._hideMoreTO)
		this._hideMoreTO = null;
	}
}

proto._hideMore = function()
{
	if(this._hideMoreTO) return;

	var obj = this;	
	this._hideMoreTO = setTimeout(function(){ obj._hideMore2(); }, 250)
}

proto._hideMore2 = function()
{
	if(CNFormManager.vista) this._hoverDiv.style.visibility = "hidden";

	if(this._moreInAnim) Animator.stop(this._moreInAnim);
	this._hideMoreTO = null;
	if(this._moreDiv.style.visibility == "hidden") return;
	
	if(this._moreDiv.shadow) this._moreDiv.shadow.hide();
	
	var anim = new AnimResize(this._moreDiv, 10, 10, this._moreDiv.offsetWidth, 0);
	anim.onend = function()
	{
		this.l.style.visibility = "hidden";
	}
	Animator.start(anim);
	this._moreLink.filters[0].opacity = 75;
}


proto._button_setDisabled = function(button, disabled)
{
	if(disabled)
	{
		button.className = "topButton";
		button.style.cursor = "default";
	}
	else
	{
		button.className = "topButton hoverable";
		button.style.cursor = "";
	}
	button._disabled = disabled;
	if(button.filters.length > 0) button.filters[0].opacity = disabled ? 25 : 75;
}

proto._button_setVisible = function(button, visible)
{
	button.style.display = visible ? 'inline-block' : 'none';
}

proto._createButtons = function(parent, linkNodes, count, isTop)
{
	var w = this._colWidth + "px";
	for(var i = 0; i < count; i++)
	{
		var linkNode = linkNodes[i];
		var button = this._createButtonIn(parent, linkNode, isTop);
		if(!isTop) button.style.width = w;
	}
}

proto._createButtonIn = function(parent, linkNode, isTop)
{
	var link = document.createElement("<a href=# class='topButton hoverable' tabIndex=-1>");
	parent.appendChild(link);

	var img = document.createElement("span");
	img.className = "imgSpan"
	if(isTop) link._top = true;
	else img.style.display = "inline"; // Show image placeholder for more link alignment.
	link.appendChild(img);
	link.attachEvent("onmouseenter", this._link_onmouseenter);
	link.attachEvent("onmouseleave", this._link_onmouseleave);
	link.attachEvent("onclick", this._link_onclick);

	var span = document.createElement("span");
	link.appendChild(span);
	
	var attr = linkNode.getAttribute("id");
	if(attr)
	{
		var id = link._id = String(attr);
		this._buttons[id] = link;
	}

	this._modifyButton(link, linkNode);

	return link;
}

proto._link_onmouseenter = function()
{
	var l = event.srcElement;
	if(l._disabled || this.formManager.isNavigationDisabled() && !l._alwaysEnabled) 
	{
		l.runtimeStyle.cursor = "no-drop";
		return;
	}
	if(CNFormManager.vista) 
	{
		var jso = Util.dispatchObject();
		if(!jso._moreDiv.contains(l)) jso._showHover(l);
	}
	if(l.filters.length > 0) l.filters[0].opacity = 100;
}

proto._showHover = function(l)
{
	var hoverDiv = this._hoverDiv;
	var xy = Util.findAbsolutePos(l, hoverDiv.parentElement);
	hoverDiv.children[1].style.width = l.offsetWidth + 4;
	hoverDiv.style.left = xy.x - 5;
	hoverDiv.style.top = xy.y - 2;
//	if(!hoverDiv.filters.length) hoverDiv.style.filter = "progid:DXImageTransform.Microsoft.Fade()";
	hoverDiv.filters[0].Apply();
	hoverDiv.style.visibility = "inherit";		
	hoverDiv.filters[0].Play(.3);
}

proto._link_onmouseleave = function()
{
	var l = event.srcElement;
	if(l._disabled) return;
	l.runtimeStyle.cursor = "";
	
	if(CNFormManager.vista)
	{
		var jso = Util.dispatchObject();
		if(!jso._moreDiv.contains(l)) jso._hoverDiv.style.visibility = "hidden";
	}
	if(l.filters.length > 0) l.filters[0].opacity = 75;
}

proto._clean = function()
{
	var al = document.activeElement;

	for(var id in this._buttons)
	{
		this._buttons[id].className = ""; // 929 - topbuttons recreation moves focus from combo.
		this._buttons[id].style.cssText = "";
		this._buttons[id].removeNode(true);
	}
	this._buttons = [];

	for(var id in this._sections)
	{
		this._sections[id].removeNode(true);
	}
	this._sections = [];
}

proto._link_onclick = function()
{
	CNUtil.dispatchObject().link_onclick();
}
proto.link_onclick = function()
{
	CNUtil.cancelEvent();
	var link = CNUtil.findTag(event.srcElement, 'A');
	if(link._disabled) return;	

	this._hideMore2();

	if(link._url) window.open(link._url);
	else if(link._action == "logout") this.formManager.logoutButtonClick(link._alwaysEnabled);
	else if(link._action == "about") this.formManager.aboutButtonClick(link._alwaysEnabled);	
	else if(link._action == "print") this.formManager.topButtonClick(6, null, link._alwaysEnabled);
	else if(link._id) this.formManager.topButtonClick(link._id, null, link._alwaysEnabled);
}
