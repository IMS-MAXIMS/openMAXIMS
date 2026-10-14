/*
	v. 2.0.1
	+ vista
*/
function CN_selectrole()
{
	this._lockMode = false;
	this._jsObjects = [];
}
var proto = CN_selectrole.prototype;

proto.createElement = function(node, parentElement)
{
	var l = document.createElement('<div class="cn_selectrole">');
	parentElement.appendChild(l);
	
	this.element = l;
	l.jsObject = this;
	
	this._buildContent(node);
	this._show();	
	
	return l;
} 

proto._buildContent = function(node)
{
	$("__loginChrome").style.display = "block";
	
	var outerDiv = document.createElement("<div class=outerDiv>"); // Anchor div.
	this.element.appendChild(outerDiv);
	
	var frameCont = document.createElement("<div class=frameCont>");
	outerDiv.appendChild(frameCont);
	
	frameCont.innerHTML = $("__plainBG").innerHTML;
	var frame = frameCont.firstChild;
	frame.style.visibility = "hidden";
	
	this._contentDiv = document.createElement("<div class=contentDiv>");
	frameCont.appendChild(this._contentDiv);

	this._showCombo(node);
	
	var img;
	if(CNFormManager.subTheme == "black") {
		img = VistaSupport.createImageSetButton("square-button-set.gif", 22, 22);

		var siteLogo = $("__siteLogo");
		siteLogo.style.width = "34px";
		siteLogo.style.height = "37px";	
		siteLogo.filters[0].sizingMethod = "scale";
	} else {
		img = VistaSupport.createImageButton("round-button.gif");
	}

	img.tabIndex = 4; // After locations combo.
	img.className = "imgButton";
	this._contentDiv.appendChild(img);
	img.onclick = this._img_onclick;
	
	var logoDiv = document.createElement("<div class='selectRoleLogo'>");
	this._contentDiv.appendChild(logoDiv);
	
	
	
	this.element.attachEvent("onkeypress", this._element_onkeypress);	
	
	var messageNode = node.selectSingleNode("message");
	if(messageNode) alert(messageNode.text);
}

proto._show = function()
{
	var frameCont = this.element.firstChild.firstChild;

	var frame = frameCont.firstChild;
	frame.style.filter = "progid:DXImageTransform.Microsoft.Fade()";
	frame.filters[0].Apply();
	frame.style.visibility = "inherit";
	frame.filters[0].Play(.5);	
	AnimVistaFadeResize(frameCont, 50, 15);	
	this._combo.element.focus();
}

proto._img_onclick = function()
{
	Util.dispatchObject()._send();;
}

proto._send = function()
{
	if(this._combo.get_selectedIndex() == 0)
	{
		alert("Please select role");
		return;
	}
	this.formManager.postData(this.element);
}

proto.loadData = function(node)
{
}

proto.storeData = function(xmldoc)
{
	var fragment = xmldoc.createDocumentFragment();
	var node = xmldoc.createElement("selectRoleEvent");
	fragment.appendChild(node);
	node.setAttribute("roleID", this._combo.getValue());
	
	var rootEl = this.formManager._getStoredLocationsXML(true);
	if(rootEl) 
	{
		fragment.appendChild(rootEl);
	}
	return fragment;
}

proto.unload = function()
{
	$("__loginChrome").style.display = "none";
	CNFormManager.destroyJSObjects(this._jsObjects);
}


proto._element_onkeypress = function()
{
	if(event.keyCode != 13) return;
	Util.cancelEvent();
	var jso = Util.dispatchByClass(CN_selectrole);
	if(jso) jso._send();
}

proto._showCombo = function(node)
{
	this._combo = new CN_combobox();
	this._jsObjects.push(this._combo);

	var comboEl = this._combo.createElement(Util.wrapIntoNode({}), this._contentDiv);
	this._combo.set_tabIndex(3);

	var nodes = node.selectNodes("role");
	var options = [];
	options.push({html: "<i class='comboValue'>Please select role</i>"});

	for(var i = 0; i < nodes.length; i++)
	{
		var node = nodes[i];
		var option = {text: String(node.text), value: String(node.getAttribute("id"))};
		options.push(option);
	}
	
	this._combo.initData(options);
	this._combo.set_selectedIndex(0, true);
}
proto = null;

