/*
	v. 0.2
	+ initial release
*/
function CN_selectrolecontrol()
{
}
var proto = CN_selectrolecontrol.prototype;

proto.createElement = function(node, parentElement)
{
	var l = (function(){ var el = document.createElement("div"); el.className = 'cn_selectrolecontrol'; return el; })();
	parentElement.appendChild(l);
	
	this.element = l;
	l.jsObject = this;
	
	this._buildContent();
	this._showSelectRoleScreen(node);

	return l;
} 

proto._buildContent = function()
{
	var html = '<table width=100% height=100% border=0 cellpadding=0 cellspacing=0>\
<tr height=60><td>\
<table width=100% border=0 cellpadding=0 cellspacing=0>\
<tr>\
<td rowspan=3 nowrap=true style="width: 93px; background: url(\'' + CNFormManager.themeImagesPath + 'login-2_01.gif\'); ">\
<div style="display: inline-block; margin-left: 18px; width: 47px; height: 75px; background: url(\'' + CNFormManager.strings['loginLogo'] + '\') center / 100% 100% no-repeat; "></div>\
</td>\
<td background="' + CNFormManager.themeImagesPath + 'login-2_02.gif" width=100% height=11></td>\
<td><img src="' + CNFormManager.themeImagesPath + 'login-2_03.gif" width=14 height=11></td>\
</tr>\
<tr>\
<td background="' + CNFormManager.themeImagesPath + 'login-2_04.gif" width=100% height=58 class="td1">\
<table width=100% border=0 cellspacing=0 cellpadding=0>\
<tr>\
<td>\
<h1>' + CNFormManager.strings['loginCaption'] + '</h1>\
</td>\
<td align=right></td>\
<td width=40></td>\
</tr>\
</table>\
</td>\
<td><img src="' + CNFormManager.themeImagesPath + 'login-2_05.gif" width=14 height=58></td>\
</tr>\
<tr>\
<td background="' + CNFormManager.themeImagesPath + 'login-2_06.gif" width=100% height=13></td>\
<td><img src="' + CNFormManager.themeImagesPath + 'login-2_07.gif" width=14 height=13></td>\
</tr>\
</table>\
</td></tr>\
<tr><td valign=top height=100%>\
<table width=100% height=100% border=0 cellpadding=0 cellspacing=0>\
<tr>\
<td width=12>\
<img src="' + CNFormManager.themeImagesPath + 'bg-1-2_01.gif" width=12 height=12></td>\
<td width=100% background="' + CNFormManager.themeImagesPath + 'bg-1-2_02.gif"></td>\
<td width=12>\
<img src="' + CNFormManager.themeImagesPath + 'bg-1-2_03.gif" width=12 height=12></td>\
</tr>\
<tr>\
<td background="' + CNFormManager.themeImagesPath + 'bg-1-2_04.gif"></td>\
<td bgcolor=white valign=top height=100%>\
<table width=100% height=100% cellspacing=0 cellpadding=0 border=0>\
<tr valign=middle><td align=left>\
<span class="span1">\
<img align=absmiddle src="' + CNFormManager.themeImagesPath + 'role-logo-2.gif">\
</span>\
<span class="span2">\
<span class="span3">\
<h1 id="selectScreenTitle_"></h1>\
</span>\
</span>\
</td>\
</tr>\
<tr height=1>\
<td align=center><img src="' + CNFormManager.themeImagesPath + 'hline-1.gif" width=100% height=1><br><br></td>\
</tr>\
<tr>\
<td valign=middle align=center height=100%>\
<div id="rolesDiv">\
<table class="table1" cellspacing=0 cellpadding=0>\
<tr>\
<td width=12><img src="' + CNFormManager.themeImagesPath + 'role-2_01.gif"></td>\
<td class="td2"\
><img src="' + CNFormManager.themeImagesPath + 'role-icon-1-1.gif" class="img2"\
><img src="' + CNFormManager.themeImagesPath + 'role-2_02.gif" class="img3"\
><div class="div1"></div></td>\
<td width=12><img src="' + CNFormManager.themeImagesPath + 'role-2_03.gif"></td>\
</tr>\
</table>\
</div>\
</td></tr>\
<tr><td align=center>\
<img src="' + CNFormManager.themeImagesPath + 'bottom-line-3.gif" width=90% height=15>\
</td></tr>\
</table>\
</td>\
<td background="' + CNFormManager.themeImagesPath + 'bg-1-2_06.gif"></td>\
</tr>\
<tr>\
<td>\
<img src="' + CNFormManager.themeImagesPath + 'bg-1-2_07.gif" width=12 height=14></td>\
<td background="' + CNFormManager.themeImagesPath + 'bg-1-2_08.gif"></td>\
<td>\
<img src="' + CNFormManager.themeImagesPath + 'bg-1-2_09.gif" width=12 height=14></td>\
</tr>\
</table>\
</td></tr>\
</table>';
	this.element.innerHTML = html;
}

proto.loadData = function(node)
{
}

proto.storeData = function(xmldoc)
{
	this.formManager._showDisabler(true, false);
	var fragment = xmldoc.createDocumentFragment();
	var node = xmldoc.createElement("selectRoleEvent");
	fragment.appendChild(node);
	node.setAttribute("roleID", this._selectScreenID);
	
	var rootEl = this.formManager._getStoredLocationsXML(true);
	if(rootEl) 
	{
		fragment.appendChild(rootEl);
	}
	return fragment;
}

proto._showSelectRoleScreen = function(selectRoleNode)
{
	this._showSelectScreen(selectRoleNode, 'Please select a role', 'role', 260)
}

proto._showSelectScreen = function(selectScreenNode, title, nodeName, buttonWidth)
{
	document.title = title;
	this.element.querySelector("#selectScreenTitle_").textContent = title;
	
	var div = this.element.querySelector("#rolesDiv");
	var template = div.children[0];
	
	div.style.width = buttonWidth + "px";
	
	var messageNode = Util.xmlSelectSingleNode(selectScreenNode, "message");
	if(messageNode)
	{
		alert(Util.xmlText(messageNode));
	}
	else
	{
		var children = div.children;
		var count = children.length - 1;
		for(var i = 0; i < count; i++)
		{
			children[children.length - 1].remove();
		}

		var roleNodes = Util.xmlSelectNodes(selectScreenNode, nodeName);
		var count = roleNodes.length;
		for(var i = 0; i < count; i++)
		{
			var roleNode = roleNodes[i];
			
			var table = template.cloneNode(true);
			div.appendChild(table);
			var textDiv = table.getElementsByTagName("div")[0];
			textDiv.textContent = String(Util.xmlText(roleNode));
			table._id = String(roleNode.getAttribute("id"));
			table.style.display = "block";
			Event.add(table, "mouseenter", this, this._table_onmouseenter);
			Event.add(table, "mouseleave", this, this._table_onmouseleave);
			Event.add(table, "click", this, this._table_onclick);
		}
	}
}

proto._table_onmouseenter = function(ev)
{
	Util.eventTarget(ev).style.opacity = "0.7";
}

proto._table_onmouseleave = function(ev)
{
	Util.eventTarget(ev).style.opacity = "";
}

proto._table_onclick = function(ev)
{
	this.roleTableClick(ev);
}

/*
proto._showSelectLocationScreen = function(selectLocationNode)
{
	this._showSelectScreen(selectLocationNode, 'Please select a location', 'location', 360)
	
	this._screen = "selectLocation";
}
*/

proto.roleTableClick = function(ev)
{
	var table = CNUtil.findTag(Util.eventTarget(ev), "TABLE");
	this._selectScreenID = table._id;
	this.formManager.postData(this.element);
}

/*
{
	this.loadForm("<events><selectLocationEvent id=\"" + this._filterAttribute(this._selectScreenID) 
		+ "\"/></events>", "_finishHideDisabler");
}
*/