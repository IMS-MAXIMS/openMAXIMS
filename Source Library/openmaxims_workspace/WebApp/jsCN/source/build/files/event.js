/* Standards-only DOM event boundary. */
var Event = {
  _nextMethodID: 0,
  _objects: [],
  _currentEvent: null,

  _makeIndirectDelegate: function(objectID, methodID) {
    return function(nativeEvent) {
      var objectEntry = Event._objects && Event._objects[objectID];
      if (!objectEntry) {
        return;
      }

      var handlerEntry = objectEntry[1][methodID];
      if (!handlerEntry) {
        return;
      }

      var event = Event.normalize(nativeEvent);
      var previousEvent = Event._currentEvent;
      Event._currentEvent = event;
      try {
        return handlerEntry[1].call(objectEntry[0], event);
      } finally {
        Event._currentEvent = previousEvent;
      }
    };
  },

  normalize: function(nativeEvent) {
    var event = nativeEvent;
    if (!event) {
      return null;
    }

    return event;
  },

  current: function() {
    return this._currentEvent || null;
  },

  // Map the semantic KeyboardEvent.key value for the remaining numeric control
  // logic; browser-specific numeric event properties are intentionally ignored.
  keyValue: function(event) {
    if (!event) return 0;
    var key = event.key;
    var named = {
      Backspace: 8, Tab: 9, Enter: 13, Shift: 16, Control: 17,
      Alt: 18, Escape: 27, Space: 32, PageUp: 33, PageDown: 34,
      End: 35, Home: 36, ArrowLeft: 37, ArrowUp: 38,
      ArrowRight: 39, ArrowDown: 40, Insert: 45, Delete: 46
    };
    if (named[key] != null) return named[key];
    if (typeof key == "string" && key.length == 1) return key.toUpperCase().charCodeAt(0);
    return 0;
  },

  add: function(element, eventName, object, method) {
    if (!element) {
      var ownerName = object && object.constructor && object.constructor.name || "anonymous";
      throw new Error("Event.add: element is required for '" + eventName + "' on " + ownerName);
    }
    if (!object) {
      throw new Error("Event.add: object is required");
    }
    if (!method) {
      throw new Error("Event.add: method is required");
    }

    var handlers;
    if (object.__objectID == null || !this._objects[object.__objectID]) {
      handlers = [];
      object.__objectID = this._objects.length;
      this._objects.push([object, handlers]);
    } else {
      handlers = this._objects[object.__objectID][1];
    }

    if (method.__id == null) {
      method.__id = this._nextMethodID++;
    }

    var handlerEntry = handlers[method.__id];
    if (!handlerEntry) {
      handlerEntry = handlers[method.__id] = [
        this._makeIndirectDelegate(object.__objectID, method.__id),
        method
      ];
    }

    this.nativeAdd(element, eventName, handlerEntry[0]);
    return true;
  },

  del: function(element, eventName, object, method) {
    if (!object || object.__objectID == null || !method || method.__id == null) {
      return false;
    }

    var objectEntry = this._objects[object.__objectID];
    if (!objectEntry) {
      return false;
    }

    var handlerEntry = objectEntry[1][method.__id];
    if (!handlerEntry) {
      return false;
    }

    this.nativeDel(element, eventName, handlerEntry[0]);
    return true;
  },

  purge: function(object) {
    if (!object || object.__objectID == null) {
      return;
    }

    delete this._objects[object.__objectID];
    object.__objectID = null;
  },

  nativeAdd: function(element, eventName, handler) {
    if (!element || typeof element.addEventListener != "function") {
      throw new Error("Event.add: standard addEventListener is required");
    }
    var listeners = element.__clientFrameworkListeners || (element.__clientFrameworkListeners = []);
    var wrapped = function(nativeEvent) {
      var previousEvent = Event._currentEvent;
      Event._currentEvent = Event.normalize(nativeEvent);
      try { return handler.call(element, nativeEvent); }
      finally { Event._currentEvent = previousEvent; }
    };
    listeners.push({eventName: eventName, handler: handler, wrapped: wrapped});
    element.addEventListener(eventName, wrapped, false);
  },

  nativeDel: function(element, eventName, handler) {
    if (!element || typeof element.removeEventListener != "function") {
      throw new Error("Event.del: standard removeEventListener is required");
    }
    var listeners = element.__clientFrameworkListeners || [];
    for (var i = listeners.length - 1; i >= 0; i--) {
      var item = listeners[i];
      if (item.eventName == eventName && item.handler == handler) {
        element.removeEventListener(eventName, item.wrapped, false);
        listeners.splice(i, 1);
        return;
      }
    }
  },

  cancel: function(nativeEvent) {
    var event = this.normalize(nativeEvent) || this.current();
    if (!event) {
      return false;
    }

    if (event.preventDefault) {
      event.preventDefault();
    }
    if (event.stopPropagation) {
      event.stopPropagation();
    }

    return false;
  },

  destroy: function() {
    this._objects = null;
    this._currentEvent = null;
  }
};
