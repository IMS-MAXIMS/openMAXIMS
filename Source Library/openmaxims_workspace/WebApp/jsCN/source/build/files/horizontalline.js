/*
	v. 2.0
*/	
function CN_horizontalline(){}
var proto = CN_horizontalline.prototype;

proto.doNotDisable = true;

proto.createElement = function(node, parentElement)
{
	var l = document.createElement("div");
	parentElement.appendChild(l);

	this.element = l;
	l.jsObject = this;

	var type = String(node.getAttribute("type"));
	if(type == "Footer") l.innerHTML = CN_horizontalline_buildFooter();
	else if(type == "Solid") l.innerHTML = CN_horizontalline_buildSolid();
	else if(type == "Gradient") l.innerHTML = CN_horizontalline_buildGradient();

	return l;
}

function CN_horizontalline_buildFooter()
{
	return '<img src="' + CNFormManager.themeImagesPath + 'bottom-line-1.gif" style="width: 100%; height: 9px; ">';
}

function CN_horizontalline_buildSolid()
{
	return '<div class="ims_horizontal_line" style="height:1px; width: 100%; "></div>';
}

function CN_horizontalline_buildGradient()
{
	return '<div class="ims_horizontal_line2" style="height:1px; width: 100%; "></div>';
}

