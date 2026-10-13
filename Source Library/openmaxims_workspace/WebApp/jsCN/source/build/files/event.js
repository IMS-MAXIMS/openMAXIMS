/*
	Event support for non-DOM jsObject binding. To avoid IE leak, uses inderect object resolving via arrays.
	v. 1.0
*/
var Event = {
	_makeIndirectDelegate: function(objectID, method) {
		return function(event) { method.call(Event._objects[objectID][0], event || window.event); }
	},

	_nextMethodID: 0,
	_objects: [],
	add: function(l, eventName, obj, method) {
		var handlers;
		if(!method) {
			throw new Error("Event.add: method is required");
			return false;
		}
		if(obj.__objectID == null) {
			handlers = [];
			obj.__objectID = this._objects.length;
			this._objects.push([obj, handlers]);
		} else {
			handlers = this._objects[obj.__objectID][1];
		}
		if(method.__id == null) method.__id = this._nextMethodID++; // Still need to mark methods with id.
		var d = handlers[method.__id] || (handlers[method.__id] = this._makeIndirectDelegate(obj.__objectID, method));

		this.nativeAdd(l, eventName, d);
		return true;
	},

	del: function(l, eventName, obj, method) {
		if(obj.__objectID == null || !method.__id == null) {
			alert("ASSERT: obj.__objectID == null || !method.__id == null");
			return false;
		}
		var objEntry = this._objects[obj.__objectID];
		if(!objEntry) return false;
		var handlers = objEntry[1];
		var d = handlers[method.__id];
		if(d) {
			this.nativeDel(l, eventName, d);
			return true;
		}
		return false;
	},
	
	purge: function(obj) {
		if(obj.__objectID) delete this._objects[obj.__objectID];
	},
	
	nativeAdd: (function() {
		if(document.addEventListener) return function(l, eventName, func){ l.addEventListener(eventName, func, false); }
		else if(document.attachEvent) return function(l, eventName, func){ l.attachEvent("on" + eventName, func); }
	})(),

	nativeDel: (function() {
		if(document.removeEventListener) return function(l, eventName, func){ l.removeEventListener(eventName, func, false); }
		else if(document.detachEvent) return function(l, eventName, func){ l.detachEvent("on" + eventName, func); }
	})(),
	
	cancel: (function(ev) {
		if(document.removeEventListener) return function(ev){ 
			ev.stopPropogation();
			ev.preventDefault();
		}
		else if(document.detachEvent) return function(ev){ 
			ev.cancelBubble = true;
			ev.returnValue = false;
		}
	})(),
	
	destroy: function() {
		this._objects = null;
	}
};