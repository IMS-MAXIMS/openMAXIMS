var proto = CNFormManager.prototype;

proto._fetchUniqueID = function() {
	var tagName = "unique_id";
	var storage = null;
	try { storage = window.sessionStorage || window.localStorage; } catch(ex3) {}
	if(storage)
	{
		try
		{
			var stored = storage.getItem(tagName);
			if(stored) return stored;
			var generated = this._generateUniqueID();
			storage.setItem(tagName, generated);
			return generated;
		}
		catch(ex4) {}
	}
	throw new Error("Unique ID: standard Web Storage is required");
}
proto._generateUniqueID = function() {
	var id = Util.SHA1.compute(navigator.userAgent + "-" + Math.random() + "-" + (new Date().getTime()), "hex");
	return id;
}

proto = null;
