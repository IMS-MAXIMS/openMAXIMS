var proto = CNFormManager.prototype;

proto._fetchUniqueID = function() {
	var tagName = "unique_id";
	try {
		document.body.load(tagName);
	} catch(ex){
	}
	var xmldoc = document.body.XMLDocument;
	var tag = xmldoc.documentElement.selectSingleNode(tagName);
	var id;
	if(!tag || !tag.text || tag.text == "") {
		tag = xmldoc.createElement(tagName);
		tag.text = id = this._generateUniqueID();
		xmldoc.documentElement.appendChild(tag);
	} else {
		id = tag.text;
	}
	try{
		document.body.save(tagName);
	} catch(ex){
	}
	return id;
}
proto._generateUniqueID = function() {
	var id = Util.SHA1.compute(navigator.userAgent + "-" + Math.random() + "-" + (new Date().getTime()), "hex");
	return id;
}

proto = null;