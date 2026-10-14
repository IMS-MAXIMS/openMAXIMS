/*
	v. 2.3 client uniqueID (olsJSCN-14)
	v. 2.2
	+ subForms/layoutManagers for subForm containers.
	v. 2.1.1
	+ invalidControl
	v. 2.1
	+ attachAsFormToTag
	+ 1020
	
	TODO: 
	- divide this file into several module files.
	- document control/container processing workflow.
	
	DelayedControlsCreation:
		=> controls not created on <form> parsing, instead nodes stored
		=> on <data> parsing
			- visible controls and controls without data are created
			- invisible controls stored, but not created
				- subsequent data for invisible controls stored
				- if invisible control becomes visible
					- it's created
					- stored data loaded into control step-by-step
			- tabbed containers always created, even if they're invisible, this is for the correct tab button order
			- collapsable container's collapsed/expanded state is not applied immediately, but stored
			  and applied after all other controls are loaded.
			- every top level delayed control checked against all collapsable containers
			  and moved if needed.
		=> children containers and controls inside children containers are not created for delayed containers (xml nodes stored).
	
	Control naming: CN_formTagName.
	Control Interfaces:
	IXMLDataAware
	{
		loadData(dataNode : XMLElement) : void  - optional.
		storeData(xmldoc : XMLDocument) : XMLElement or XMLDocumentFragment or null  - optional.
	}
	
	ICNControl extends IXMLDataAware
	{
		createElement(controlNode : XMLElement, parentElement: HTMLElement) : HTMLElement.
		validateLoading() : void - optional.
		isValid(): bool - optional.
		resetValue() : void - optional. used for invalid controls on postback.
	}
	
*/
function CNFormManager(isTabbed, mode, parentFormManager)
{
	switch(mode) {
		case CNFormManager.MODE_DIALOG:
			this.isDialog = true;
			break;
		case CNFormManager.MODE_ATTACH:
			this.isAttach = true;
			break;
		case CNFormManager.MODE_MAIN:
		default:
			this.isMain = true;
	}	
	this._mode = mode;
	
	this.sourceUrl = null;
	this.logoutUrl = null;
	this.debug = false;
	this.isTabbed = isTabbed;
	this.xmlEncoding = "utf-8";

	this.reportTimings = false;
	this._timings = [];
	this.reportStats = false;
	this._stats = [];
	
	this.defaultButton = null;
	
	this._xmlhttp = null;
	this._ideaNode = null;
	this._currentFormID = null;
	
	this._blink = null;
	this._blinks = [];
	this._blinkTextFromColor = "";
	this._blinkTextToColor = "";
	this._blinkBackgroundFromColor = "";
	this._blinkBackgroundToColor = "";

	this._dialogWillBeLoaded = false;
	this._timerIsStoped = false;
	
	this._navigation = null;

	this._isPostingBack = false;
	this._postbackElement = null;
	this._loading = false;
	this._firstButtonFocused = false;
	this._formDisabled = false;
	this._failed = false;
	this._halt = false;
	this._closing = false;
	this._dialogPending = false;
	this.nonInteractive = false;
	
	this._parentFormManager = parentFormManager;
	this._dialogReturnValue = null;
	this._queryString = [];
	this._sendQueryString = true;
	this._modalFocused = false;

	this.alertSourceUrl = null;
	this.alertTimeout = 30;
	this._alertStarted = false;
	
	this._navigationDisabled = false;
	this._editMode = false;
	this._tabbedGroups = [];
	this._currentFormCaption = "";
	this._messagesShown = false;
	
	this._layoutManager = null;
	this.disableLayoutManager = false;
	
	this._helpLink = null;

	this._menus = [];
	this._currentContextID = 0;
	this._pendingContextMenuData = null;
	this.contextMenuPending = false;
	
	//this._globalProgressbar = document.body.children['cn_globalProgressbar'];
	//this._globalProgressbarTO = null;
	
	this._uploadURL = null;	
	this._uploadDebug = false;
	
	this._customUrlWindow = null;	
	
	this._waitingForButtonPostback = false;

	this._formErrorShown = false;

	this._requiredIcons = [];
	
	this._selectLocationCombo = null;
	this._sendFormResized = false;
	
	this._screen = "default";
	
	this._timers = [];
	this.initiateUpload = false; // Contains postback element's initiateUpload status.
	
	this.delayedControlsCreation = false;
	this._delayedControls = []; // id => [node, parentElement]
	this._delayedContainers = []; // id => [node, parentElement]
	this._delayedCollapsableContainers = []; // # => [containerEl, expand?]
	
	this._messageBoxOffset = 0;
	this._messageBoxes = [];

	this._autoLockTO = null;
	this._autoLockTime = 0;		
	this._autoLockShutDown = false;
	this._autoLockPostData = false;	
	
	this._heartBeatTO = null;
	this._heartBeatTime = 0;	
	this._heartBeatShutDown = false;
	this._heartBeatClearEvents = false;
	this._heartBeatPostData = false;	
	
	this._customUrlsToBeClosed = [];
	
	this._toggledCollapsableContainers = [];
	
	// Initialization. ==========================
	if(this.isDialog) 
	{
		this._resizable = false;
		CNFormManager.themeLoaded = true;
	}
	else if(this.isAttach)
	{
		this._resizable = false;
		CNFormManager.themeLoaded = true;
	}
	else // if(mode == CNFormManager.MODE_MAIN)
	{
		CNFormManager._measureScrollbars();

		this._aboutDialogLoaded = false;
		
		if(!top.__ontopZ) top.__ontopZ = 1000;
		window.attachEvent("onunload", this._window_onunload);
		document.body.addBehavior("#default#userData");		
		
		this._uniqueID = this._fetchUniqueID();
		
		if(CNFormManager.disableContextMenu) document.attachEvent("oncontextmenu", this._document_oncontextmenu);
		
		this._parseQueryString();

		this._globalPlaceholder = document.body.children["cn_globalPlaceholder"];
		
		document.attachEvent("onhelp", this._document_onhelp);
		window.attachEvent("onresize", this._window_onresize);
		
		this._attachedFormManagers = {};
		this._controls = {};
	}

	this._disabler = document.createElement('<div style="position: absolute; background: #000; z-index: 1000; filter: alpha(opacity=0); visibility: hidden; width: 100%; height: 100%; top: 0px; left: 0px; ">');
	if(this.isMain)
	{
		document.body.appendChild(this._disabler);
	}
}

CNFormManager.strings = {};
CNFormManager.MODE_MAIN = 1;
CNFormManager.MODE_DIALOG = 2;
CNFormManager.MODE_ATTACH = 3;
CNFormManager.currentThemeName = null; // NOTE: no initial theme.
CNFormManager.defaultThemeName = "blue"; // Will be requested by default.
CNFormManager.vista = false; // Vista render mode.
CNFormManager.themeLoaded = false;
CNFormManager.usePacked = false; // If true, packed CSS theme is used.
CNFormManager.changingTheme = false;
CNFormManager.neutralImagesPath = "g/";
CNFormManager.neutralIconsPath = "g/icons/";
CNFormManager.disableContextMenu = true;
CNFormManager.scrollBarSize = 20; // Some safe fail-back value.

CNFormManager.themeJSObjects = []; // Array of jso, which will be destroyed on theme unload.

CNFormManager.formManagers = [];
CNFormManager._checkArray = function()
{
	if(CNFormManager.formManagers.length == 0) 
	{
		Util.assert("CNFormManager.formManagers.length == 0");
		return false;
	}
	return true;
}
CNFormManager.getBaseFormManager = function()
{
	if(!CNFormManager._checkArray()) return null;
	return CNFormManager.formManagers[0];
}
CNFormManager.getActiveFormManager = function()
{
	if(!CNFormManager._checkArray()) return null;
	return CNFormManager.formManagers[CNFormManager.formManagers.length - 1];
}

CNFormManager.initMainFormManager = function(isTabbed)
{
	var formManager = new CNFormManager(isTabbed == true)
	CNFormManager.formManagers.push(formManager);
	return formManager;
}

CNFormManager.removeFromCollection = function(formManager)
{
	for(var i = 0; i < CNFormManager.formManagers.length; i++)
	{
		if(CNFormManager.formManagers[i] == formManager)
		{
			CNFormManager.formManagers.splice(i, 1);
			break;
		}
	}
}

CNFormManager._trace = function(title, str, force)
{
	var formManager = CNFormManager.getActiveFormManager();
	if(!formManager || !formManager.debug && !force) return;

	var dt = new Date(); 
	var time = dt.getHours() + ":" + dt.getMinutes() + ":" + dt.getSeconds() + "." + dt.getMilliseconds();
	title = time + ": " + title;

	try
	{
		if(!CNFormManager._debugWindow) 
		{
			CNFormManager._debugWindow = window.open("", "cn_debug", "width=450, height=550, scrollbars=yes");
			CNFormManager._debugWindow.document.write("<style>body{ margin: 2px; } *{ font-family: tahoma; font-size: 11px; }</style><body></body>");
			window.focus();
		}
	
		var body = CNFormManager._debugWindow.document.body;
		if(!str) body.insertAdjacentText("beforeEnd", title);
		else
		{
			var div = CNFormManager._debugWindow.document.createElement("<div style='background: gray; color: white; font-weight: bold; padding: 5px; '>");
			body.appendChild(div);
			div.insertAdjacentText("beforeEnd", title);
			body.insertAdjacentText("beforeEnd", str);
		}
		body.insertAdjacentHTML("beforeEnd", "<hr>");
		body.scrollTop = body.scrollHeight;
	}
	catch(e)
	{
	}
}

CNFormManager.destroyJSObjectsMap = function(map) {
	for(var i in map) {
		this.destroyJSObject(map[i]);
		map[i] = null;
	}
}
CNFormManager.destroyJSObjects = function(jsObjects)
{
	var count = jsObjects.length;
	for(var i = 0; i < count; i++)
	{
		this.destroyJSObject(jsObjects[i]);
		jsObjects[i] = null;
	}
}
CNFormManager.destroyJSObject = function(jsObject)
{
    Event.purge(jsObject);
	if(jsObject.unload) jsObject.unload();
	var el = jsObject.element;
	if(el)
	{
		var id = el.id;
		el.jsObject = null;
		el.removeNode(true);
		jsObject.element = null;
	}
}

CNFormManager._measureScrollbars = function()
{
	var div = document.createElement("<div style='position: absolute; top: 0; left: 0; width: 100px; height: 100px; overflow: auto; visibility: hidden; '>");
	document.body.appendChild(div);
	var subDiv = document.createElement("<div style='width: 200px; height: 200px; '>");
	div.appendChild(subDiv);
	
	CNFormManager.scrollBarSize = div.offsetWidth - div.clientWidth;
	div.removeNode(true);
}

var proto = CNFormManager.prototype;
	
proto._window_onunload = function()
{
	CNFormManager.getBaseFormManager().window_onunload();
}
proto.window_onunload = function()
{
	this._shutDownTimers();		
	
	this._detachHTMLLayout();

	this._menus = null;
	
	PopupMenu.unload();

	this._globalPlaceholder = null;
	this._logout();
	
	if(CNFormManager._debugWindow) {
		CNFormManager._debugWindow.close();
		CNFormManager._debugWindow = null;
	}

	Event.destroy();
}

// Currently called by dialogs and attaches.
proto.destroy = function() {
	if(this._alertIcons) {
		CNFormManager.destroyJSObject(this._alertIcons);
	}

	this._deleteControls();
	if(this._layoutManager) { 
		this._layoutManager.unload();
		this._layoutManager = null;
	}
	this._formPlaceholder = null;
}

proto._startTiming = function(name)
{
	if(!this.reportTimings) return;
	this._timings[name] = new Date().getTime();
}
proto._endTiming = function(name)
{
	if(!this.reportTimings) return;
	this._timings[name] = new Date().getTime() - this._timings[name];
}
proto._changeStat = function(name, delta)
{
	this._stats[name] = this._stats[name] ? this._stats[name] + delta : delta;
}
	

proto._document_onhelp = function()
{
	var fm = CNFormManager.getActiveFormManager();
	if(fm && fm._helpLink) window.open(fm._helpLink)
	CNUtil.cancelEvent();
}

proto._window_onresize = function()
{
	var fm = CNFormManager.getBaseFormManager();
	fm._sendFormResized = true;
}

proto._formPlaceholder_onkeypress = function()
{
	if(event.keyCode == 13 && CNFormManager.getActiveFormManager().defaultButton != null) 
	{
		var fm = CNFormManager.getActiveFormManager();
		var b = fm.defaultButton;		
		if(b) 
		{
			Util.cancelEvent();
			b.doClick();
		}
	}
}
	
proto._dialog_formPlaceholder_onbeforedeactivate = function()
{
	// Disabled due to #1161. IE crash when TAB-navigating in grid inside dialog (cancelEvent crashes).
	/*
	try {
		if(event.toElement && event.toElement._isPopup) return; // Allow popups to take focus.
	} catch(e) {} 

	var fm = CNFormManager.getActiveFormManager();
	if(!fm || !fm._dialogDiv) return;
	
	//CNFormManager._trace("_dialog_formPlaceholder_onbeforedeactivate 1");

	if(!event.toElement || event.toElement && !fm._dialogDiv.contains(event.toElement))
	{
		//CNFormManager._trace("_dialog_formPlaceholder_onbeforedeactivate - processing TAB out of dialog, from element.className" + event.className 
		//	+ " to element " + (event.toElement ? Util.definitionTag(event.toElement.outerHTML) : "null"));

		var currentTI = 0;
		if(event.srcElement && event.srcElement.tabIndex) 
		{
			currentTI = event.srcElement.tabIndex;
		}
		
		//CNFormManager._trace("_dialog_formPlaceholder_onbeforedeactivate 2");

		if(!fm._focusFirstFocusableControl(currentTI))
		{
			fm._focusFirstFocusableControl(0);
		}

		CNUtil.cancelEvent(event);		
	}

//	CNFormManager._trace("toElement.className" + event.toElement.className 
//		+ " to element " + (event.toElement ? Util.definitionTag(event.toElement.outerHTML) : "null"));

	if(event.toElement 
		&& (event.toElement.tagName == "BODY" || !fm._formPlaceholder.contains(event.toElement)))
	{
		CNUtil.cancelEvent();
	}
	*/
}

proto._focusFirstFocusableControl = function(startTabIndex)
{
	startTabIndex = startTabIndex < 0 ? 0 : startTabIndex;
	//CNFormManager._trace("_focusFirstFocusableControl startTabIndex=" + startTabIndex);
	var l;
	var offset = 0;
	do
	{
		var result = this._findNextTabIndexControl(startTabIndex, offset);
		l = result.control;
		offset = result.offset;
	
		if(l) 
		{
			try
			{ 
				//CNFormManager._trace("_focusFirstFocusableControl - focus " + Util.definitionTag(l.outerHTML));		
				l.focus(); 
				break;
			} 
			catch(e)
			{
				// Element is hidden (in hidden container) -> find next.
				startTabIndex = l.tabIndex;
			}
		}
	} 
	while(l);
	return l ? true : false;
}

proto._checkIfVisible = function(l)
{
	do
	{
		var lcs = l.currentStyle;
		if(lcs.visibility == "hidden" || lcs.display == "none") return false;
		if(lcs.visibility == "visible") return true;
		l = l.parentElement;
		this._it++;
	}
	while(l && l != document.body);
	return true;
}

proto._findFirstTabIndexControl = function()
{
	var params = {minTab: 999999, lowerTab: 0, control: null};
	this._findFirstTabIndexControlInternal(this._formPlaceholder, params);
	return params.control;
}

proto._findNextTabIndexControl = function(tabIndex, offset)
{
	var params = {minTab: 999999, lowerTab: tabIndex, control: null, offset: offset};
	this._findFirstTabIndexControlInternal(this._formPlaceholder, params);
	return params;
}

proto._findFirstTabIndexControlInternal = function(element, params)
{
	var all = element.all;
	var allCount = all.length;
	for(var i = 0/*params.offset*/; i < allCount; i++)
	{
		var l = all[i];		
		if(l.currentStyle.display != 'none' && l.currentStyle.visibility != 'hidden' 
		&& l.tabIndex < params.minTab && l.tabIndex > params.lowerTab) 
		{
			params.minTab = l.tabIndex;
			params.control = l;
			params.offset = i;
		}
	}
}


proto._setDialogResult = function(closedByServer, errorProcessing)
{
	var obj = {closedByServer: closedByServer};
	if(errorProcessing) obj.gotError = true;
	this._dialogReturnValue = obj;
}

// NOTE: both arguments are optional.
proto.loadForm = function(dataXml, onreadyFunc)
{
	if(this._loading)
	{
		Util.assert("can't load form - still loading.");				
		return;
	}

	this._loading = true;
	this._failed = false;
	
	//Tooltip.hide(); // FWUI-1025-2 moved hide to be fired before new form render.
	this._beginProgress();
	
	this._ideaNode = null;
	this._messagesShown = false;
	this._onreadyFunc = onreadyFunc;		

	if(this._sendQueryString && !dataXml) {
		var dataXmlAr = ["<events><queryString>"];
		for(var param in this._queryString) {
			dataXmlAr.push('<p name="' + Util.escapeAttr(param) + '" value="' + Util.escapeAttr(this._queryString[param]) + '"/>');
		}
		if(dataXmlAr.length > 1) {
			dataXmlAr.push("</queryString></events>");
			dataXml = dataXmlAr.join("");
		}

		this._sendQueryString = false;
	}

	if(!CNFormManager.themeLoaded) dataXml = this._filterEventsXMLForTheme(dataXml);
	
	if(this._sendFormResized) 
	{
		dataXml = this._filterEventsXMLForResized(dataXml);
		this._sendFormResized = false;
	}

	this._dataXml = dataXml;
			
	if(this.isMain && !this._alertStarted) this._startAlerts();

	this._loadForm3();
}
	
proto._loadForm3 = function()
{
	var dataXml = this._dataXml;
	this._dataXml = null;
	
	this._roundTrip(dataXml);
}
	
proto._continueLoadForm = function(responseXML)
{
	this._endTiming("loadTime");

	if(responseXML != null) 
	{
		this._ideaNode = responseXML.documentElement;
		if(this._ideaNode) 
		{
			if(!this._executeClose_Error_Theme()) return;
		}
	}
	this._continueLoadForm2();
}

proto._continueLoadForm2 = function()
{
	if(this._ideaNode) {
		this._executeIdeaNode();
		if(this._onreadyFunc)
		{
			this[this._onreadyFunc]();
			this._onreadyFunc = null;
		}
	}
	this._loading = false;

	this._endProgress();
	if(this._failed) this._handleLoadFailed();
}

proto._logout = function(reload)
{
	if(this._loading) return;
	
	this._setNonInteractive(true);
	
	//If any window open by opemCustomUrl opened, close it
	if(this._customUrlWindow)
	{
		try {
			this._customUrlWindow.quit();
		}
		catch(e) {}	
	}
	
	if(this.logoutUrl)
	{
		window.open(this.logoutUrl, "_logout", 
					"location=no, menubar=no, resizable=no, scrollbars=no, status=no, "
					+ "toolbar=no, width=300, height=100");
	}
	
	this._setPatient("");
	
	this._shutDownTimers();		
	this._shutDownHeartBeat();
	this._shutDownAutoLock();
		
	var uniqueID = '<uniqueID value="' + this._uniqueID + '"/>'; 
	
	if(reload) {
		this.loadFormWithPostback('<events><logout source="App"/>' + uniqueID + '</events>');		
	} else {
		var data = '<events><logout source="IE"/>' + uniqueID + '</events>';
		CNFormManager._trace("Sending xml", data);
		var xmlhttp = new ActiveXObject("Msxml2.XMLHTTP");
		xmlhttp.Open("POST", this.sourceUrl, true);
		xmlhttp.Send(data);		
	}
}

// This methods ensures we have postback state set properly.
proto.loadFormWithPostback = function(dataXml) 
{
    if(this._isLoading()) return;
    if(this._isPostingBack) {
       Util.assert("loadFormWithPostback this._isPostingBack");
    }
    this._isPostingBack = true;
    this._setNonInteractive(true);
    this.loadForm(dataXml, "_finishPostData");
}

proto._isLoading = function() {
    if(this._loading) {
        var debugXML = "[failed]";
        try {
            debugXML = dataXml ? (typeof dataXml == "string" ? dataXml : dataXml.xml) : 'empty';
        } catch(e) {}
        Util.assert("can't load form - still loading, attempted: " + debugXML);
        return true;
    }
    return false;
}

proto._roundTrip = function(xmldoc)
{
		if(!this.sourceUrl)
	{
		Util.assert("Invalid sourceUrl.")
		return;
	}

	var method = "POST";

	if(xmldoc) 
	{
		method = "POST";
		
		var xml;
		if(typeof(xmldoc) == "string") xml = xmldoc;
		else xml = xmldoc.xml;
		
		CNFormManager._trace("Sending xml", xml);
	} else {
		Util.assert("No xmldoc");
		return;
	}

	this._startTiming("loadTime");

	this._xmlhttp = new ActiveXObject("Msxml2.XMLHTTP");
	this._xmlhttp.onreadystatechange = this._xmlhttp_onreadystatechange;
	this._xmlhttp.Open(method, this.sourceUrl, true);
    this._xmlhttp.Send(xmldoc);
}

proto._xmlhttp_onreadystatechange = function()
{
	var formManager = CNFormManager.getActiveFormManager();
	if(formManager._xmlhttp.readyState != 4) return;
	formManager._xmlhttpIsReady();
}

proto._noop = function() {}

proto._checkXmlHttp = function(xmlhttp)
{
	if(xmlhttp.status != 200)
	{
		if(CNFormManager.themeLoaded)
		{
			this._processFormError2("Failed to load " + this.sourceUrl, null, false, "Server reports:", xmlhttp.responseText);
		}
		else
		{
			CNFormManager.getBaseFormManager()._globalPlaceholder.innerHTML = "<h2>Failed to load " + this.sourceUrl
												+ "</h2><br><h3>Server reports:</h3>" 
												+ xmlhttp.responseText;
		}

		status = "Failed to load, status: " + xmlhttp.status;
		return false;
	}
	else
	{
		if(!xmlhttp.responseXML.documentElement)
		{
			var errorStr = "";
			var parseError = xmlhttp.responseXML.parseError;
			if(parseError.errorCode != 0)
			{
				errorStr = parseError.reason + "Line: " + parseError.line + ", pos: " + parseError.linepos; 
			}
			//alert(errorStr);
			this._deleteLoadingBar();
			
			var message = "Error: Can't get XML document element";
			if(CNFormManager.themeLoaded) 
			{
				this._processFormError2(message, null, false, errorStr, xmlhttp.responseText);
			}
			else
			{
				CNFormManager.getBaseFormManager()._globalPlaceholder.innerText = message + "\n"
													+ errorStr
													+ "\n\n" 
													+ xmlhttp.responseText;
			}
			return false;
		}
	}
	return true;
}

proto._xmlhttpIsReady = function()
{
	if(!this._checkXmlHttp(this._xmlhttp)) 
	{
		CNFormManager._trace("Error Response from url: " + this.sourceUrl, this._xmlhttp.responseText);
		return null;
	}
	CNFormManager._trace("Response from url: " + this.sourceUrl, this._xmlhttp.responseXML.xml);

	/*var start = new Date().getTime();
	xml_to_json(this._xmlhttp.responseXML.documentElement);
	CNFormManager._trace("xml_to_json: " + (new Date().getTime() - start) + "ms\n" + xml_to_json_nodes);*/

	this._continueLoadForm(this._xmlhttp.responseXML);
}

proto._removeBlink = function(divsColl)
{
	for (i=0; i < divsColl.length; i++) 
	{	 
		clearTimeout(this._blink);
	}
}

proto._enableTextAndBackgroundBlink = function(divsColl)
{ 		
	if (divsColl.length > 0)
		clearTimeout(this._blink);
  
   for (i=0; i < divsColl.length; i++) 
   { 
        objElement = divsColl[i]; 
		
		var myBlinkTextFromColor = objElement.blinkTextFromColor;
		var myBlinkTextToColor = objElement.blinkTextToColor;
		var myBlinkBackgroundFromColor = objElement.blinkBackgroundFromColor;
		var myBlinkBackgroundToColor = objElement.blinkBackgroundToColor;
		
		if (objElement.id == "blinkDiv")
		{
			if (myBlinkTextFromColor && myBlinkTextToColor)
			{
				if(objElement.style.color == myBlinkTextFromColor) 
				{ 
					objElement.style.color = myBlinkTextToColor; 
				} 
				else 
				{ 
					objElement.style.color = myBlinkTextFromColor; 					
				} 
			}
			if (myBlinkBackgroundFromColor && myBlinkBackgroundToColor)
			{
				if(objElement.style.background == myBlinkBackgroundFromColor) 
				{ 
					objElement.style.background = myBlinkBackgroundToColor; 
				} 
				else 
				{ 
					objElement.style.background = myBlinkBackgroundFromColor; 
				} 
			}			 
		}
   } 
   
   var self = this;
   this._blink = setTimeout( function() { self._enableTextAndBackgroundBlink(divsColl);}, 800); 
} 


proto._startAlerts = function()
{
	setTimeout("CNFormManager.getBaseFormManager()._doAlerts()", this.alertTimeout * 1000);
}

proto._doAlerts = function()
{
	if(!this.alertSourceUrl) return;
	
	if(this._formPlaceholder.currentStyle.display == 'none')
	{
		// We are at login or select role page.
		setTimeout("CNFormManager.getBaseFormManager()._doAlerts()", this.alertTimeout * 1000);
		return;
	}
	
	this._alert_xmlhttp = new ActiveXObject("Msxml2.XMLHTTP");
	this._alert_xmlhttp.onreadystatechange = this._alert_xmlhttp_onreadystatechange;
	this._alert_xmlhttp.Open("GET", this.alertSourceUrl, true);
    this._alert_xmlhttp.Send();
}

proto._alert_xmlhttp_onreadystatechange = function()
{
	var formManager = CNFormManager.getActiveFormManager();
	if(formManager._alert_xmlhttp.readyState != 4) return;
	formManager._alert_xmlhttpIsReady();
}

proto._alert_xmlhttpIsReady = function()
{
	if(!this._checkXmlHttp(this._xmlhttp)) return null;
	CNFormManager._trace("Alert: Response from url: " + this.alertSourceUrl, this._alert_xmlhttp.responseXML.xml);

	if(this._alertIcons) 
	{
		var xmlDoc = this._alert_xmlhttp.responseXML;
		var rootNode = xmlDoc.documentElement;
		var alertsNode = rootNode.selectSingleNode("alerts");
	
		if(alertsNode) this._alertIcons.loadData(alertsNode);
	}

	setTimeout("CNFormManager.getBaseFormManager()._doAlerts()", this.alertTimeout * 1000);
}


proto._executeClose_Error_Theme = function()
{
	this._startTiming("totalFormExecTime");

	if(this._formErrorShown) this._deleteFormError();
	
	var closeNode = this._ideaNode.selectSingleNode("close");
	if(this.isDialog && closeNode)
	{
		this._setDialogResult(true);		
		var noPostback = closeNode.getAttribute("postback") == "false";
		var node = this._ideaNode;
		this._closeDialog(noPostback);
		if(noPostback) // Redirect xml to base formmanager.
		{
			var fm = CNFormManager.getBaseFormManager();
			fm._setControlsDisabledState(false);
			fm._ideaNode = node;
			fm._messagesShown = false; // Reset messages status.
			fm._executeIdeaNode();
		}
		
		return false;
	}

	var errorNode = this._ideaNode.selectSingleNode("error");
	if(errorNode)
	{
		return this._processServerError(errorNode);
	}
	
	if(this.isMain)
	{
		this._startTiming("themeTime");
		if(this._processTheme()) 
		{
			this._endTiming("themeTime");
			return false;
		}
		this._endTiming("themeTime");
	}
	
	return true;
	// Caller calls execyteXML2.
}

proto._executeIdeaNode = function()
{
	var showProgressNode = this._ideaNode.selectSingleNode("showProgress");
	if(showProgressNode != null) {
		this._showProgress(showProgressNode);
	}

	if(this.isMain) {
		var node = this._ideaNode.selectSingleNode("debugWindow");
		if(node) this.debug = true;
	}

	if(this.isMain || this.isDialog) { // It's important to always process <screen>, event if sent to dialog FM.
		var screenNode = this._ideaNode.selectSingleNode("screen");
		if(screenNode) {
			var baseFM = CNFormManager.getBaseFormManager();
			baseFM._processScreen(screenNode);
		}
	}

	if(this.isMain) {
		this._startTiming("navigationCreationTime");
		var navigationNode = this._ideaNode.selectSingleNode("navigation");
		if(navigationNode)
		{
			var navCreateNode = navigationNode.selectSingleNode("create");
			if(navCreateNode)
			{
				this._deleteNavigation();
				this._createNavigation(navCreateNode);
			}
			if(this._navigation)
			{
				var navModifyNode = navigationNode.selectSingleNode("modify");
				if(navModifyNode) this._navigation.loadData(navModifyNode);
			}
		}
		this._endTiming("navigationCreationTime");

		if(this._topButtons) 
		{
			var topButtonsNode = this._ideaNode.selectSingleNode("topbuttons");
			if(topButtonsNode) this._topButtons.loadData(topButtonsNode);
		}
	} 
	if(this.isMain || this.isDialog) {
		var patientNode = this._ideaNode.selectSingleNode("patient");
		if(patientNode) {
			var textColor = null;
			var textColorAttr = patientNode.getAttribute("textColor");
			if(textColorAttr != null) textColor = String(textColorAttr);
			this._setPatient(String(patientNode.text), textColor);
		}
	}
	if(this.isDialog && this._dialogNotShownYet) {
		this._dialogDiv.style.visibility = "visible";
		if(this._dialogDiv.shadow) this._dialogDiv.shadow.show();
		try
		{ 
			this._dialogDiv.focus(); 
		} 
		catch(e){}
		this._dialogNotShownYet = false;
	}


	this._startTiming("formCreationTime");
	var formNode = this._ideaNode.selectSingleNode("form");
	if(formNode) 
	{
		this._stats = [];
		this._deleteControls();

		var attr = formNode.getAttribute("navID");
		if(attr) this._currentFormID = String(attr);
		else this._currentFormID = null;
		
		attr = formNode.getAttribute("helpLink");
		if(attr) this._helpLink = String(attr);
		else this._helpLink = null;
		
		if(this.isMain && this.isTabbed)
		{
			if(this._navigation)
			{
				this._navigation.hideSecondLevel();
	
				if(this._navigation.isTopTabForm(this._currentFormID))
				{
					this._subLevelFrame.style.display = "none";
					this._formPlaceholder.style.top = 32;
					this._formPlaceholder.style.left = 6;
					if(this._layoutManager) this._layoutManager.formTopOffset = 0;
				}
				else
				{
					this._subLevelFrame.style.display = "block";
					this._navigation.showSecondLevel(this._currentFormID);
					
					this._formPlaceholder.style.top = 62;
					this._formPlaceholder.style.left = 8;
					if(this._layoutManager) this._layoutManager.formTopOffset = 20;					
				}
			}
			else
			{
				this._formPlaceholder.style.top = 24;
				this._formPlaceholder.style.left = 6;
				if(this._layoutManager) this._layoutManager.formTopOffset = 0;
			}
			LayoutManager._rightPadding = 6;
		}
		
		if(this.isMain)
		{
			var wAttr = formNode.getAttribute("width");
			if(wAttr)
			{
				var w = parseInt(wAttr, 10);
				var h = parseInt(formNode.getAttribute("height"), 10);
				if(this._layoutManager) this._layoutManager.setInitialBounds(w, h);
				//this._formPlaceholder.style.width = w;
				//this._formPlaceholder.style.height = h;
			}
			else
			{
				if(this._layoutManager) this._layoutManager.resetInitialBounds();
			}
		}
		
		this._executeXMLForm(formNode);
	}
	else
	{
		var formErrorNode = this._ideaNode.selectSingleNode("formError");
		if(formErrorNode) 
		{
			this._processFormError(formErrorNode);
			return;
		}
	}
	
	this._endTiming("formCreationTime");

	this._startTiming("dataProcessingTime");
	this._executeXMLData();
	this._endTiming("dataProcessingTime");

	if(this._navigation) this._navigation.selectFormNode(this._currentFormID);

	this._startTiming("validateLoading");
	this._validateLoading();
	this._endTiming("validateLoading");

	if(CNFormManager.getBaseFormManager()._alertIcons && this._ideaNode) this._loadAlertIcons();

	this._endTiming("totalFormExecTime");
	CNFormManager._trace("Loading complete", ' ');
	this._report();

	if(this.isMain || this.isDialog) {
		this._loadAttachedFMs();
		this._checkForURL();
		this._checkForCustomURL();
		this._checkforCloseURL();
		this._checkStoredLocations();
		this._processExternalEvents();
		this._testForXMLDialog();
		this._tryToProcessServerErrors();
		this._showMessagesTO();
		this._showPasswordDialogTO();		
		this._processDeleteFiles();
		this._runExternalApplication();
		this._startTimers();		
		//Load HeartBeat timer
		this._loadHeartBeatTimer(this._ideaNode);	
		//Load AutoLock timer
		this._loadAutoLockTimer(this._ideaNode);	
		
		// Allow loading to finish.
		var node = this._ideaNode.selectSingleNode("dialog");
		if(node)
		{
			this._dialogWillBeLoaded = true;
			this._dialogNode = node;
			this._deleteMessageBoxes();
			//setTimeout("CNFormManager.getActiveFormManager()._executeXMLDialog()", 0);
			var fm = this;
			setTimeout(function(){ fm._executeXMLDialog(); }, 0);
		}				
		else
		{
			this._dialogNode = null;		
			this._dialogWillBeLoaded = false;
		}
		
		
		clearTimeout(this._enableBlink);
		this._notifyScanningServlet();
		
	}
}

proto._notifyScanningServlet = function() 
{
	if (document.scanningApplet)
	{		
		document.scanningApplet.getNextImage();
	}		
}

proto._loadAttachedFMs = function() {
	for(var tag in this._attachedFormManagers) {
		var tagNode = this._ideaNode.selectSingleNode(tag);
		if(tagNode != null) {
			var fm = this._attachedFormManagers[tag];
			fm._ideaNode = tagNode;
			fm._executeIdeaNode();
		}
	}
}

proto._unsafe_runExternalApplication = function(applicationPath, autoRunEditor, allowMultipleInstance, msgForRunningApplication, checkForRunningApplicationPerUserSession) 
{	
	if (applicationPath == "")	return;	
	var autoRun = (autoRunEditor === 'true');
	if (autoRun)
	{		
		try 
		{
			var word = new ActiveXObject("Word.Application");
			if(word)
			{	
				word.Visible = true;
				word.Documents.Open(applicationPath);
			}			
		}
		catch(e) { }			
		finally {return;}
	}	
	
	if (allowMultipleInstance == "") allowMultipleInstance = false;

	var isRunning = false;

	//Extract application name
	var slash = '/';
	if (applicationPath.match(/\\/)) {
		slash = '\\';
	}
		
	var fullPath = applicationPath.substring(applicationPath.lastIndexOf(".exe"), -1) + ".exe";
	var appName = fullPath.substring(fullPath.lastIndexOf(slash) + 1);
	
	//Check if application exist	
	var fso = new ActiveXObject("Scripting.FileSystemObject");
	if (fso.FileExists(fullPath) == false) {
		alert("Aplication not found: " + fullPath);
		return;
	}
	
	//Get current username and domain if checkForUniqueInstanceByUser is true
	var currentUsername, currentDomain;
	if (checkForRunningApplicationPerUserSession)
	{
		try 
		{
			var wshnetwork=new ActiveXObject("wscript.network");		
			currentUsername = wshnetwork.username;
			currentDomain = wshnetwork.userdomain;
		}	
		catch(e) { }			
    }
	
	//Check for running application
	var objWMIService = GetObject("winmgmts:{impersonationLevel=impersonate}//./root/cimv2"); 
    var colItems = objWMIService.ExecQuery("SELECT * FROM Win32_Process WHERE Name = \"" + 
        appName + "\""); 
 
	for(var e = new Enumerator(colItems); !e.atEnd(); e.moveNext()) 
	{
		var p = e.item();	
	
		//Get PID username and domain		
		var processUsername = null;
		var processDomain = null;
		
		if (checkForRunningApplicationPerUserSession)
		{
			var outProcess = p.ExecMethod_("GetOwner");
			if (outProcess.ReturnValue == 0)
			{
				processUsername = outProcess.User;
				processDomain = outProcess.Domain;
			}
			
			if(processUsername == null || processDomain == null)
				continue;
		}
		
		if (p.Name.toLowerCase() == appName.toLowerCase() &&
				allowMultipleInstance == false)
		{
			if (checkForRunningApplicationPerUserSession)
			{
				if (processUsername == currentUsername &&
					processDomain == currentDomain)
				{
					if (msgForRunningApplication == "") {
						msgForRunningApplication = "Application " + appName + " already running with PID: " + p.Handle + " (Process Username:  " + processUsername + "/" + processDomain + ") for user: " + currentDomain + "/" + currentUsername;
					}
					
					alert(msgForRunningApplication);
					isRunning = true;
					break;
				}	
				else
					continue;
			}
			else
			{
				if (msgForRunningApplication == "") {
					msgForRunningApplication = "Application " + appName + " already running with PID: " + p.Handle;
				}
				
				alert(msgForRunningApplication);
				isRunning = true;
				break;
			}
		}
	}
	
	if (!isRunning)
	{
		var startedSuccesful = false;
		//Start application		
		var shell = new ActiveXObject("WScript.Shell");
		shell.Exec(applicationPath);
		
		//Check if application was started and get PID
		var e = new Enumerator(GetObject("winmgmts:").InstancesOf("Win32_process"));
		for (; !e.atEnd(); e.moveNext())
		{
			var p = e.item();			
			if (p.Name.toLowerCase() == appName.toLowerCase())
			{				
				startedSuccesful = true;				
				break;
			}
		}
		if (!startedSuccesful)
		{
			alert("Application " + appName + " was not started succesful!");
		}
	}
}
proto._runExternalApplication = function() {
	var nodes = this._ideaNode.selectNodes("runFiles/file");
	if(nodes.length == 0) return;
	try {
		var shell = new ActiveXObject("WScript.Shell");
		if(shell) {
			for(var i = 0; i < nodes.length; i++) {
				var node = nodes[i];
				var path = Util.base64_decode(node.text.replace(/[\n|\r]/g, ""));
				try {
					this._unsafe_runExternalApplication(path, node.getAttribute("autoRunEditor"), node.getAttribute("allowMultipleInstances") != "false", node.getAttribute("msgForRunningApplication"), node.getAttribute("checkForRunningApplicationPerUserSession"));
				}
				catch (e){
					alert(e.description);                
				}
			}
		}
	} catch(e) { }
}
proto._processDeleteFiles = function() {
	var nodes = this._ideaNode.selectNodes("deleteFiles/file");
	if(nodes.length == 0) return;

	try {
		var fs = new ActiveXObject("Scripting.FileSystemObject"); 
	
		for(var i = 0; i < nodes.length; i++) {
			var path = nodes[i].text;
			try {
				if(fs.FileExists(path)) {
					fs.DeleteFile(path);
				}
			} catch (e) {}
		}
	} catch (e) {}
}

proto._report = function()
{
	if(this.reportTimings || this.reportStats)
	{
		if(this.reportTimings)
		{
			var str = [];
			for(var i in this._timings)
			{
				str.push(i + ": " + this._timings[i] + "ms\n");
			}
			CNFormManager._trace("Load timings", str.join(""), true);
		}
		if(this.reportStats)
		{
			var str = [];
			for(var i in this._stats)
			{
				str.push(i + ": " + this._stats[i] + "\n");
			}
			CNFormManager._trace("Form stats", str.join(""), true);
		}
	}
}

proto._processExternalEvents = function() {
	var events = this._ideaNode.selectNodes("externalEvents/event");
	if(events.length > 0 && window.external) {
	    try {
			for(var i = 0; i < events.length; i++) {
				window.external.receiveNotificationFromBrowser(String(events[i].getAttribute("id")));
			}
		} catch(e) {}
	}
}

proto._safelyClosePopups = function() { // Back port.
	// Close some popups.
	// TODO: custom events and global event, which all the popup-enabled controls should listen to.
	if(this._navigation && this._navigation.hideAllPopups) this._navigation.hideAllPopups();
	if(CN_combobox.currentCombobox) CN_combobox.currentCombobox.hidePopup();
	if(CN_answerbox.currentCombobox) CN_answerbox.currentCombobox.hidePopup();
	Tooltip.hide();
	PopupMenu.hideMenus();
	if(CNPopupCalendar.defaultInstance) CNPopupCalendar.defaultInstance.hide(true, false);
	if(this._topButtons) this._topButtons._hideMore2(true);
	if(CN_search._popup) CN_search._popup._hidePopup();
	CN_wysiwygeditor._hideAutocompleteUI();

	this._forceClosePasswordDialog();

    if(this._navigation && this._navigation.expand) this._navigation.expand(true); // Force navigation expand && restore screen items.
}

proto._forceClosePasswordDialog = function() { // Called by autolock.
	if(this._passwordDialog) {
		CNDialogManager.destroyDialog(this._passwordDialog);
		this._passwordDialog = null;
	}
}

CNFormManager.closeAllDialogs = function() {
	var toClose = [];
    for(var i = CNFormManager.formManagers.length - 1; i > 0; i--) {
		var fm = CNFormManager.formManagers[i];
		if(fm.isDialog) toClose.push(fm);
	}
	for(var i = 0; i < toClose.length; i++) {
		toClose[i]._closeDialog(true);
	}
}


proto._processScreen = function(screenNode)
{
	document.body.setActive();

	this._safelyClosePopups();
	CNFormManager.closeAllDialogs();
	
	//var animate = screenNode.getAttribute("animate") == "true";
	
	if(screenNode.getAttribute("clearForm") == "true")
	{
		this._deleteControls();		
	}

	if(this._screenLayoutManager)
	{
		var initialWidth = parseInt(screenNode.getAttribute("initialWidth"), 10);
		var initialHeight = parseInt(screenNode.getAttribute("initialHeight"), 10);
		if(!isNaN(initialWidth) && !isNaN(initialHeight)) 
			this._screenLayoutManager.setInitialBounds(initialWidth, initialHeight);

		this._screenLayoutManager.reload();
	}
	
	this._resetScreen();

	//if(animate) this._globalPlaceholder.style.visibility = "hidden";

	var items = screenNode.selectNodes("item");
	var count = items.length;
	for(var i = 0; i < count; i++)
	{
		this._processScreenItem(items[i]);
	}
	
	if(this._screenLayoutManager)
	{
		this._screenLayoutManager.doLayout();
	}
	

	/*if(animate)
	{
		if(this._globalPlaceholder.filters.length == 0)
			this._globalPlaceholder.style.filter = "progid:DXImageTransform.Microsoft.Fade()";
		else 
			this._globalPlaceholder.filters[0].Stop();
		this._globalPlaceholder.filters[0].Apply();
		this._globalPlaceholder.style.overflow = "hidden";
		this._globalPlaceholder.style.visibility = "visible";
		this._globalPlaceholder.filters[0].Play(.5);	
		this._globalPlaceholder.attachEvent("onfilterchange", CNFormManager._globalPlaceholder_onfilterchange);
	}*/
}
proto._resetScreen = function() {
	this._deleteScreenControls();
	this._resetScreenItems();
	this._destroyAttachedFMs();
}

proto._deleteScreenControls = function() {
	CNFormManager.destroyJSObjectsMap(this._controls);
	this._controls = {};
}

CNFormManager._globalPlaceholder_onfilterchange = function()
{
	var l = event.srcElement;
	l.style.overflow = "visible";
	l.style.filter = "";
	l.detachEvent("onfilterchange", CNFormManager._globalPlaceholder_onfilterchange);
}

proto._resetScreenItems = function()
{
	for(var id in this._knownScreenItems)
	{
		var item = document.getElementById(id);
		if(!item)
		{
			CNUtil.assert("Can't find " + id + " to reset");
			continue;
		}
		
		item.style.display = "none";
	}
}

proto._processScreenItem = function(itemNode)
{
	var id = itemNode.getAttribute("id");
	if(!id) 
	{
		CNUtil.assert("_processScreenItem: no id for item " + itemNode.xml);
		return;
	}
	id = String(id);
	
	var htmlID = "__si_" + id;
	var item = document.getElementById(htmlID);
	if(!item) 
	{
		//CNUtil.assert("_processScreenItem: no element found for item " + itemNode.xml);
		//return;
		item = document.createElement("div");
		item.id = htmlID;
		item.style.cssText = "position: absolute; top: 0; left: 0; ";
		document.body.appendChild(item);
	}
	
	this._knownScreenItems[htmlID] = true;

	item.style.display = "block";
	
	var bounds = [];
	var attr = itemNode.getAttribute("x");
	if(attr)
	{
		var x = parseInt(attr, 10);
		var y = parseInt(itemNode.getAttribute("y"), 10);
		var w = parseInt(itemNode.getAttribute("width"), 10);
		var h = parseInt(itemNode.getAttribute("height"), 10);
		var anchor = parseInt(itemNode.getAttribute("anchor"), 2);
		
		if(isNaN(x) || isNaN(y) || isNaN(w) || isNaN(h))
		{
			CNUtil.assert("Valid x, y, width and height attributes required for item " + itemNode.xml);
			return;
		}
		
		if(!isNaN(anchor) && this._screenLayoutManager)
		{
			this._screenLayoutManager.processRawElement(item, x, y, w, h, anchor);
		}
		else
		{
			item.style.left = x + "px";
			item.style.top = y + "px";
			item.style.width = w + "px";
			item.style.height = h + "px";
		}
		
		bounds = [w, h];
	}
	
	attr = itemNode.getAttribute("zIndex");
	if(attr)
	{
		item.style.zIndex = parseInt(attr, 10);
	}
	
	this._processScreenItemAttach(itemNode, item, bounds);

	attr = itemNode.getAttribute("control");
	if(attr) this._createThemeControl(String(attr), itemNode, item, id);
}
proto._createThemeControl = function(controlName, itemNode, item, id) {
	var controlClass = window['CN_' + controlName];
	if(!controlClass) return;
	var jso = new controlClass;
	jso.formManager = this;
	jso.elementID = id;
	jso.createElement(itemNode, item); // Passes itemNode as form tag to the control.

	this._controls[id] = jso;
}

proto._processScreenItemAttach = function(itemNode, item, bounds) {
	var attr = itemNode.getAttribute("attachAsFormToTag");
	if(attr == null) return;
	var attachAsFormToTag = String(attr);
	
	if(this._attachedFormManagers[attachAsFormToTag] != null) {
		Util.assert("Tag " + attachAsFormToTag + " is already used");	
		return;
	}
	
	var fm = new CNFormManager(false, CNFormManager.MODE_ATTACH, this);
	fm.debug = this.debug;
	fm.delayedControlsCreation = this.delayedControlsCreation;
	fm.sourceUrl = this.sourceUrl;
	fm._attachAsFormToTag = attachAsFormToTag;
	fm._formPlaceholder = item;
	if(bounds != null) fm._layoutManager = new LayoutManager(item, bounds[0], bounds[1]);
	
	this._attachedFormManagers[attachAsFormToTag] = fm;
}
proto._destroyAttachedFMs = function() {
	for(var tag in this._attachedFormManagers) this._attachedFormManagers[tag].destroy();
	this._attachedFormManagers = {};
}

proto._showMessagesTO = function()
{
	if(!this._ideaNode || this._messagesShown) return;

	var messagesNode = this._ideaNode.selectSingleNode("messages");

	if(messagesNode) {
		this._messagesPending = true;
		var fm = this;
		setTimeout(function(){ fm._showMessages(messagesNode); }, 100);
	}
}


proto._processFormError = function(formErrorNode)
{
    this._shutDownTimers();	
	
	var msgNode = formErrorNode.selectSingleNode("msg");
	var captionAttr = formErrorNode.getAttribute("caption")
	var titleAttr = formErrorNode.getAttribute("title");
	var browserTitleAttr = formErrorNode.getAttribute("browserTitle");
	var caption = null;
	var title = null;
	var msg = null;
	var browserTitle = null;

	if(captionAttr) caption = String(captionAttr);
	if(msgNode) msg = String(msgNode.text);
	if(titleAttr) title = String(titleAttr);
	if(browserTitleAttr) browserTitle = String(browserTitleAttr);
	this._processFormError2(caption, browserTitle, formErrorNode.getAttribute("suspend") == "true", title, msg);
}

proto._setFormCaptionText = function(caption, imgUrl)
{
	var formCaption;
	if(this.isMain) 
	{
		document.title = caption;
		formCaption = document.all["__si_formCaption"];
		if(formCaption) {
			formCaption.innerText = caption;
			if(imgUrl) {
				this._createFormCaptionImg(formCaption, imgUrl);
			}
		}
	}
	else if(this.isDialog && this._dialogDiv._hasBackground)
	{
		if(CNFormManager.vista) CNDialogManager.setCaption(this._dialogDiv, caption);
		else
		{
			formCaption = this._dialogDiv.all["formCaption1"];
			if(formCaption) formCaption.innerText = caption;
			if(imgUrl) {
				this._createFormCaptionImg(formCaption, imgUrl);
			}
		}
	}
	this._currentFormCaption = caption;
}

proto._createFormCaptionImg = function(formCaption, imgUrl) {
	var img = document.createElement("img");
	img.className = "captionImg";
	img.replacePNG = "no";
	img.src = String(imgUrl);
	formCaption.insertBefore(img, formCaption.firstChild);
	if(Util.IE6) {
		Util.replacePNGImage(img);
	}
}

proto._processFormError2 = function(caption, browserTitle, suspend, title, msg)
{
	this._deleteControls();
	if(this._darkHeader) this._darkHeader.style.visibility = "hidden";
	
	if(caption)	this._setFormCaptionText(caption);
	if(browserTitle) document.title = browserTitle;

	this._createFormError(title, msg);
	
	if(suspend)
	{
		this._failed = true;
		this._halt = true;
	}
	else
	{
		this._setNonInteractive(false);
		this._setNavigationDisabled(false);
	}
}

proto._createFormError = function(title, msg)
{
	var container = document.createElement("<div id='formErrorDiv' style='position: absolute; top: 0px; left: 0px; width: 800px; height: 600px; overflow: auto; '>");
	this._formPlaceholder.appendChild(container);
	container.onmousedown = Util.cancelBubble;
	container.onmouseup = Util.cancelBubble;
	container.onclick = Util.cancelBubble;
	
	var img = document.createElement("<img width=48 height=48 style='position: absolute; top: 16px; left: 24px; '>");
	container.appendChild(img);
	img.src = CNFormManager.neutralImagesPath + "exl-4.gif";

	var div1 = document.createElement("<div style='position: absolute; top: 28px; left: 90px; font-size: 18px; font-weight: bold; '>")
	container.appendChild(div1);

	div1.innerText = title ? title : "Form Error";
	
	var div2 = document.createElement("<div style='position: absolute; top: 68px; left: 90px; width: 700px; '>");
	container.appendChild(div2);	
	
	if(msg) div2.innerText = msg;
	
	this._formErrorShown = true;
}

proto._deleteFormError = function()
{
	var l = this._formPlaceholder.children["formErrorDiv"];
	if(l) l.removeNode(true);
	this._formErrorShown = false;
}

proto._checkforCloseURL = function()
{
	if(!this._ideaNode) return;
	var urlNodes = this._ideaNode.selectNodes("closeUrl");
	var obj = this;
	setTimeout(function()
	{
		for(var i = 0; i < urlNodes.length; i++)
		{
			obj._closeUrl(urlNodes[i]);
		}
	}, 250);
}

proto._checkForURL = function()
{
	if(!this._ideaNode) return;
	var urlNodes = this._ideaNode.selectNodes("openUrl");
	var obj = this;
	setTimeout(function()
	{
		for(var i = 0; i < urlNodes.length; i++)
		{
			obj._openURL(urlNodes[i]);
		}
	}, 250);
	var openEmail = this._ideaNode.selectSingleNode("openEmail");
	if(openEmail != null) document.location = "mailto:" + openEmail.getAttribute("address");
}

proto._checkForCustomURL = function()
{
	if(!this._ideaNode) return;
	var urlNodes = this._ideaNode.selectNodes("openCustomUrl");
	var obj = this;
	setTimeout(function()
	{
		for(var i = 0; i < urlNodes.length; i++)
		{
			obj._openCustomUrl(urlNodes[i]);
		}
	}, 250);	
}

proto._wait = function(delay)
{
    var start = new Date().getTime();
    while (new Date().getTime() < start + delay);
}

proto._ieQuit = function()
{
	CNFormManager.getActiveFormManager().postData("<onCustomUrlWindowChanged eventName=\"onunload\"/>");			
}

proto._closeUrl = function(node) 
{	
	var id = String(node.getAttribute("id"));
	for(var x = 0; x < this._customUrlsToBeClosed.length; x++) 
	{
		if (this._customUrlsToBeClosed[x].id == parseInt(id))
		{
			var toBeClosedwindow = this._customUrlsToBeClosed[x].object;
			
			try {
				toBeClosedwindow.close();								
				this._customUrlsToBeClosed.splice(x, 1);
			} 
			catch(ex) {}
		}	
	}
}

function wopen(url, name, toolbar, status, menubar, location, resizable, fullscreen, height, width) 
{
	var options;
	wleft = 0;
    wtop = 0;
	
	if (fullscreen == "fullscreen=no" && (height == 0 || width == 0)) 
	{		
		if (height == 0 || width == 0)
		{
			width= screen.width;
			height = screen.height;
		}
		
		wleft = (screen.width - width) / 2;
		wtop = (screen.height - height) / 2;    		
	}
	else if (fullscreen == "fullscreen=yes")
	{
		fullscreen = "";	
		width= screen.availWidth;
		height = screen.availHeight - 5;		
	}
	
	options = 	'width=' + width + ', height=' + height + ', ' +
				'left=' + wleft + ', top=' + wtop + ', ' +	
				toolbar +
				status +
				menubar +
				location +
				resizable +
				fullscreen;

    var win = window.open('about:blank', // <- Note about:blank
                name, options);
				
	win.location.href = url;
	win.resizeTo(width, height);
    win.moveTo(wleft, wtop);
    win.focus();	
	
	return win;
}

proto._openCustomUrl = function(node) 
{	
	var id = String(node.getAttribute("id"));
	var url = String(node.getAttribute("value"));	
	var windowParam = node.selectNodes("windowParam");
	var handleWindowEvents = node.getAttribute("handleWindowEvents");
		
	var toolbar = "toolbar=no, ", status = "status=no, ", menubar ="menubar=no, ", location = "location=no, ", resizable ="resizable=no, ", fullscreen = "fullscreen=false", height = 0, width = 0;
		
	//Parse Window parameters
	if(windowParam.length > 0) 
	{				
		for(var i = 0; i < windowParam.length; i++) 
		{		
			if(String(windowParam[i].getAttribute("name")) == "ToolBar")
				toolbar = String(windowParam[i].getAttribute("value")) == "true" ? "toolbar=yes, " :"toolbar=no, ";
			else if(String(windowParam[i].getAttribute("name")) == "StatusBar")
				status = String(windowParam[i].getAttribute("value")) == "true" ? "status=yes, " :"status=no, ";
			else if(String(windowParam[i].getAttribute("name")) == "MenuBar")
				menubar =  String(windowParam[i].getAttribute("value")) == "true" ? "menubar=yes, " :"menubar=no, ";
			else if(String(windowParam[i].getAttribute("name")) == "AddressBar")
				location = String(windowParam[i].getAttribute("value")) == "true" ? "location=yes, " :"location=no, ";
			else if(String(windowParam[i].getAttribute("name")) == "Resizable")
				resizable = String(windowParam[i].getAttribute("value")) == "true" ? "resizable=yes, " :"resizable=no, ";			
			else if(String(windowParam[i].getAttribute("name")) == "Height" && !isNaN(parseInt(windowParam[i].getAttribute("value"))))
				height =parseInt(windowParam[i].getAttribute("value"));		
			else if(String(windowParam[i].getAttribute("name")) == "Width" && !isNaN(parseInt(windowParam[i].getAttribute("value"))))
				width = parseInt(windowParam[i].getAttribute("value"));		
			else if(String(windowParam[i].getAttribute("name")) == "FullScreen")
				fullscreen = String(windowParam[i].getAttribute("value")) == "true" ? "fullscreen=yes" : "fullscreen=no";			
		}				
	}
	
	if(width == 0 || height == 0)
	{
		width = screen.width;
		height = screen.height;
	}
	
	var customWindow = wopen(url, '', toolbar, status, menubar, location, resizable, fullscreen, height, width);
	var customWindowObj = new Object();
		customWindowObj.id = id;
		customWindowObj.object = customWindow;
	
	this._customUrlsToBeClosed.push(customWindowObj);
}

proto._openURL = function(node) 
{	
	var url = String(node.getAttribute("value"));
	var params = node.selectNodes("param");
	var windowName = node.getAttribute("window");
	windowName = windowName ? String(windowName) : ""
	var w;
	if(params.length > 0) {
		w = window.open("", windowName);
		var doc = w.document;
		var form = doc.createElement("form");
		for(var i = 0; i < params.length; i++) {
			var input = doc.createElement("input");
			input.type = "hidden";
			input.name = String(params[i].getAttribute("name"));
			input.value = String(params[i].getAttribute("value"));
			form.appendChild(input);
		}
		doc.body.appendChild(form);
		form.action = url;
		form.method = "POST";
		form.submit();
	} else {
		w = window.open(url, windowName);
	}
}


proto._checkStoredLocations = function()
{
	if(!this._ideaNode) return;

	var locations = this._ideaNode.selectSingleNode("storedLocations");
	if(locations)
	{
		try{ document.body.load("storedLocations");	} catch(e){}
		var storedXML = document.body.XMLDocument;
		if(storedXML.documentElement) storedXML.removeChild(storedXML.documentElement);
		storedXML.appendChild(locations);
		try{ document.body.save("storedLocations"); } catch(ex){}
	}
}

proto._loadAlertIcons = function()
{
	if(!this._ideaNode) return;
	var alertsNode = this._ideaNode.selectSingleNode("alerts");
	if(alertsNode) CNFormManager.getBaseFormManager()._alertIcons.loadData(alertsNode);
}

proto._showPasswordDialogTO = function()
{
	setTimeout("CNFormManager.getBaseFormManager()._showPasswordDialog()", 0);
}

proto._showPasswordDialog = function()
{
	if(!this._ideaNode) return;
	var node = this._ideaNode.selectSingleNode("passwordDialog");
	if(!node) return;

	this._shutDownTimers();	
	
	var title = String(node.getAttribute("title"));
	var text = String(node.getAttribute("text"));
	this._currentPassword = String(node.getAttribute("password"));

	if(!this._passwordDialog) 
	{
		var contents;
		if(CNFormManager.vista)
		{
			this._passwordDialog = CNDialogManager.createVistaDialog(title);
			this._passwordDialog.style.width = 450;
			this._passwordDialog.style.height = 156;
		}
		else
		{
			this._passwordDialog = CNDialogManager.createDialog(title);
			this._passwordDialog.style.width = 450;
			this._passwordDialog.style.height = 116;
		}
		var contents = CNDialogManager.getContents(this._passwordDialog);
		var img = document.createElement("<img width=48 height=48 class=dialogIcon>");
		contents.appendChild(img)
		img.src = CNFormManager.neutralImagesPath + "yesno-question-1.gif";

		var html = "<div style='height: 60px; width: 100%; "
			+ "position: relative; padding: 4px; margin: 5px; top: 2px; padding-left: 58px; "
			+ " overflow: auto; '><div id='messageText'></div>"
			+ "<div style='margin-top: 2px; padding: 6px; '><b>Password:</b> "
			+ "<input type='password' style='width: 160px; '/><span style='visibility: hidden; color: red; margin-left: 10px; '><b>Invalid password</b></span></div></div>";
		contents.insertAdjacentHTML("beforeend", html);
		
		if(CNFormManager.vista) VistaSupport.attachToTextBox(contents.getElementsByTagName("input")[0]);
		
		var buttonWidth = 80;
		var spacing = 4;
		var b1 = CNDialogManager.createBottomButton(this._passwordDialog, "OK", true);
		b1.style.width = buttonWidth;
		var b2 = CNDialogManager.createBottomButton(this._passwordDialog, "Cancel", false);
		b2.style.width = buttonWidth;
		this._passwordDialog.attachEvent("onkeydown", CNUtil.cancelBubble); // Bypass disabler key block.		
	}
	else
	{
		var errorSpan = this._passwordDialog.getElementsByTagName("span")[CNFormManager.vista ? 0 : 1];
		errorSpan.style.visibility = "hidden"
	}
	var box = this._passwordDialog.getElementsByTagName("input")[0];
	box.value = "";
	box.onkeydown = this._passwordDialog_box_onkeydown;
	this._passwordDialog.all['messageText'].innerText = text;

	this._showDisabler(true, false, false);

	CNDialogManager.showDialog(this._passwordDialog, [this, "_passwordDialogCallback"], true);
	this._passwordDialog.attachEvent("onbeforedeactivate", this._passwordDialog_onbeforedeactivate);
	box.focus();
}

proto._passwordDialog_box_onkeydown = function()
{
	if(event.keyCode != 13) return;
	var fm = CNFormManager.getBaseFormManager();
	setTimeout(function(){ 
		if(fm._passwordDialogCallback(fm._passwordDialog, false))
		{
			fm._passwordDialog._finishDelegate = null;
			CNDialogManager.hideDialog(fm._passwordDialog, true, true);
	 	}
	}, 0);
}

proto._passwordDialog_onbeforedeactivate = function()
{
	var fm = CNFormManager.getBaseFormManager();
	if(!fm._passwordDialog.contains(event.toElement)) CNUtil.cancelEvent();
}

proto._passwordDialogCallback = function(dialog, cancel)
{
	if(cancel)
	{
		dialog.detachEvent("onbeforedeactivate", this._passwordDialog_onbeforedeactivate);
		this._hideDisabler();
		this.loadForm("<events><passwordDialog canceled=\"true\"/></events>");
	}
	else
	{
		var box = dialog.getElementsByTagName("input")[0];
		var errorSpan = dialog.getElementsByTagName("span")[CNFormManager.vista ? 0 : 1];
		if(box.value != this._currentPassword)
		{
			errorSpan.style.visibility = "inherit";
			return false;
		}
		else
		{
			dialog.detachEvent("onbeforedeactivate", this._passwordDialog_onbeforedeactivate);
			this._hideDisabler();
			this.loadForm("<events><passwordDialog canceled=\"false\"/></events>");
		}
	}
	return true;
}

proto._startTimers = function()
{
	if(!this._ideaNode) return;	
	
	var timersNode = this._ideaNode.selectSingleNode("timers");
	if(!timersNode) return;
	
	if(timersNode.getAttribute("reset") == "true") 
	{
		this._shutDownTimers();
		//return;
	}
	
	var timerNodes = timersNode.selectNodes("timer");
	var count = timerNodes.length;
	for(var i = 0; i < count; i++)
	{
		var timerNode = timerNodes[i];
		
		var attr = timerNode.getAttribute("id");
		if(!attr) continue;
		var id = String(attr);
		
		attr = timerNode.getAttribute("enabled");
		var enabled = attr != "false";

		var timer = this._timers[id];
		if(timer)
		{
			// Remove timer.
			window.clearInterval(timer.timer);
			delete this._timers[id];
		}
		if(enabled) this._setTimer(timerNode, id);		
	}
}

proto._setTimer = function(timerNode, id)
{
	var attr = timerNode.getAttribute("interval");
	if(attr == null)
	{
		CNUtil.assert("No interval specified for timer " + id);
		return false;
	}
	var value = parseInt(attr, 10);
	if(value < 2)
	{
		CNUtil.assert("Interval is < 2 for timer " + id);
		return false;
	}
	value = value * 1000;
	this._timers[id] = {id: id, timer: window.setInterval(this._setSafeInterfalDelegate(id), value), interval: value};
	this._timerIsStoped = false;
	return true;
}

proto._setSafeInterfalDelegate = function(id)
{
	var obj = this;
	return function()
	{
		obj.timer_interval(id);
	}
}

proto.timer_interval = function(id)
{
	if(this._failed || this._halt || this._isPostingBack || this._loading || this._dialogWillBeLoaded) return;
	
	this.postData("<timer id=\"" + id + "\"/>");
}

proto._shutDownTimers = function()
{
	this._suspendTimers();
	this._timers = [];
}

proto._suspendTimers = function()
{	
	this._timerIsStoped = true;
	for(var i in this._timers)
	{
		window.clearInterval(this._timers[i].timer);
	}
}

proto._shutDownHeartBeat = function()
{	
	if(this._heartBeatTO)
	{
		clearTimeout(this._heartBeatTO);
		CNFormManager._trace("Shutdown HeartBeat ...");
		this._heartBeatShutDown = true;
	}	
}

proto._shutDownAutoLock = function()
{	
	if(this._autoLockTO)
	{	
		clearTimeout(this._autoLockTO);
		CNFormManager._trace("Shutdown Autolock ...");
		this._autoLockShutDown = true;
	}	
}

proto._resumeTimers = function()
{
	this._suspendTimers();

	for(var id in this._timers)
	{
		var timer = this._timers[id];
		timer.timer = window.setInterval(this._setSafeInterfalDelegate(timer.id), timer.interval);
	}
}


proto._showMessages = function() {
	this._messagesPending = false;

	if(!this._ideaNode || this._messagesShown) return;

	PopupMenu.hideMenus();
	
	if (this._timers.length > 0  && this._timerIsStoped)
		this._resumeTimers();
	
	var messages = this._ideaNode.selectNodes("messages/message");
	if(messages) 
	{
		for(var i = 0; i < messages.length; i++) 
		{
			alert(messages[i].text);
		}
	}
	
	if(this._ideaNode.selectSingleNode("messages/clear"))
	{
		this._deleteMessageBoxes();
	}

	var hasMessageBoxes = false;
	var mboxes = this._ideaNode.selectNodes("messages/messagebox");
	if(mboxes)
	{
		var animate = mboxes.length == 1;
		for(var i = 0; i < mboxes.length; i++)
		{
			this._showMessageBoxDialog(mboxes[i], animate);
			hasMessageBoxes = true;
		}
	}

	if(!hasMessageBoxes) {
	    this._hideDisabler();
	}
	
	this._messagesShown = true;
}

proto._createMessageBoxDialog = function()
{
	var dialog;
	if(CNFormManager.vista)
	{
		dialog = CNDialogManager.createVistaDialog("");
		dialog.style.width = 500;
		dialog.style.height = 166;
	}
	else
	{
		dialog = CNDialogManager.createDialog("");
		dialog.style.width = 500;
		dialog.style.height = 116;
	}
	CNDialogManager.getCloseButton(dialog).style.display = "none";

	var contents = CNDialogManager.getContents(dialog);

	var html = "<div style='height: 60px; width: 100%; "
		+ "position: relative; padding: 4px; margin: 5px; top: 6px; padding-left: 58px; "
		+ " overflow: auto; '><div id='messageText'></div>"
		+ "</div>";
	contents.insertAdjacentHTML("beforeend", html);
	
	dialog.attachEvent("onkeydown", this._messageBox_onkeydown);
	
	return dialog;
}

proto._messageBox_onkeydown = function()
{
	if(event.keyCode == 13)
	{
		if(CNFormManager.vista)
		{
			var buttonJS = Util.dispatchObject();
			buttonJS.element.click();
		}
		else
		{
			var button = Util.findTag(event.srcElement, "BUTTON");
			button.click();
		}
	}
	Util.cancelBubble();
}

proto._showMessageBoxDialog = function(node, animate)
{
	this._showDisabler(true, true, false);
	
	var caption = String(node.getAttribute("caption"));
	var text = String(node.text);
	var imgAttr = node.getAttribute("img");
	var buttonAttr = node.getAttribute("buttons");
	var idAttr = node.getAttribute("id");


	var dialog = this._createMessageBoxDialog();
	if(idAttr)
	{
		dialog._id = String(idAttr);
	}

	CNDialogManager.setCaption(dialog, caption);

	var contents = CNDialogManager.getContents(dialog);

	var div = contents.lastChild;
	var messageDiv = div.firstChild;
	messageDiv.innerText = text;
	
	if(imgAttr)
	{
		var img = document.createElement("<img class=dialogIcon>");
		img.src = String(imgAttr);
		contents.appendChild(img)
	}
	
	var focused;
	if(buttonAttr)
	{
		var focusAttr = node.getAttribute("focus");

		var buttonWidth = 80;
		var spacing = 4;

		if(buttonAttr.indexOf("OK") != -1)
		{
			var b = CNDialogManager.createBottomButton(dialog, "OK", true);
			b._result = "OK";
			b.style.width = buttonWidth;
			if(CNFormManager.vista) b.jsObject.set_tabIndex(1); 
			else b.tabIndex = 1;
			if(focusAttr == "OK") focused = b;
		}
		if(buttonAttr.indexOf("Confirm") != -1)
		{
			var b = CNDialogManager.createBottomButton(dialog, "Confirm", true);
			b._result = "Confirm";
			b.style.width = buttonWidth;
			if(CNFormManager.vista) b.jsObject.set_tabIndex(1); 
			else b.tabIndex = 1;
			if(focusAttr == "Confirm") focused = b;
		}
		if(buttonAttr.indexOf("Yes") != -1)
		{
			var b = CNDialogManager.createBottomButton(dialog, "Yes", true);
			b._result = "Yes";
			b.style.width = buttonWidth;
			if(CNFormManager.vista) b.jsObject.set_tabIndex(2); 
			else b.tabIndex = 2;
			if(focusAttr == "Yes") focused = b;
		}
		if(buttonAttr.indexOf("No") != -1)
		{
			var b = CNDialogManager.createBottomButton(dialog, "No", true);
			b._result = "No";
			b.style.width = buttonWidth;
			if(CNFormManager.vista) b.jsObject.set_tabIndex(3); 
			else b.tabIndex = 3;
			if(focusAttr == "No") focused = b;
		}
		if(buttonAttr.indexOf("Cancel") != -1)
		{
			var b = CNDialogManager.createBottomButton(dialog, "Cancel", true);
			b._result = "Cancel";
			b.style.width = buttonWidth;
			if(CNFormManager.vista) b.jsObject.set_tabIndex(4); 
			else b.tabIndex = 4;
			if(focusAttr == "Cancel") focused = b;
		}
	}
	
	this._messageBoxes.push(dialog);
	
	CNDialogManager.showDialog(dialog, [this, "_messageBoxCallback"], true, animate);
	dialog.style.left = dialog.offsetLeft + this._messageBoxOffset + "px";
	dialog.style.top = dialog.offsetTop + this._messageBoxOffset + "px";

	this._messageBoxOffset += 16;
	if(this._messageBoxOffset > 100) this._messageBoxOffset = -16 * 5;

	div.style.height = messageDiv.offsetHeight + 8;
	dialog.style.height = messageDiv.offsetHeight + (CNFormManager.vista ? 116 : 100);
	
	if(dialog.shadow) dialog.shadow.syncPosition();	
	
	if(focused)
	{
		if(CNFormManager.vista) focused.jsObject.focus();
		else focused.focus();
	}
}

proto._messageBoxCallback = function(dialog, cancel)
{
	var posted = false;
	if(dialog._id)
	{
		var b;
		if(CNFormManager.vista) b = Util.findByClassName(event.srcElement, "cn_button");
		else b = Util.findTag(event.srcElement, "BUTTON");
		if(b) {
			this.postData("<messagebox id=\"" + dialog._id + "\" button=\"" + b._result + "\"/>");
			posted = true;
		}	
	}	

	CNDialogManager.destroyDialog(dialog);

	for(var i = 0; i < this._messageBoxes.length; i++)
	{
		if(this._messageBoxes[i] == dialog)
		{
			this._messageBoxes.splice(i, 1);
			break;
		}
	}

	if(this._messageBoxes.length == 0 && !posted)
	{
		// Remove "modality".
		this._hideDisabler();
	}

	return false; // Prohibit automatical hide.
}

proto._tryToProcessServerErrors = function()
{
	if(!this._ideaNode) return;
	
	var errorsNode = this._ideaNode.selectSingleNode("errors");
	if(errorsNode) 
	{
		this._processServerErrors(errorsNode);
		return;
	}
	
	var fatalErrorNode = this._ideaNode.selectSingleNode("fatalerror");
	if(fatalErrorNode)
	{
		this._processFatalServerError(fatalErrorNode);
	}
}

proto._setPatient = function(text, color)
{
	var spi;
	if(this.isMain) spi = document.all["__si_shortPatientInfo"];
	else if(this.isDialog) spi = this._dialogFormHeaderTextCont;	

	if(spi) {
		spi.innerText = text;
		if(color !== null) spi.runtimeStyle.color = color;
	}
}

proto._deleteNavigation = function()
{
	if(!this._navigation) return;
	CNFormManager.destroyJSObject(this._navigation);
	this._navigation = null;
}

proto._createNavigation = function(navigationNode)
{
	var type = navigationNode.getAttribute("type");
	if(!type) type = "CN_navigation";
	else type = "CN_" + type;

	var id = navigationNode.getAttribute("screenItemID");
	if(!id) id = "navigation";
	
	id = "__si_" + id;
	
	var parent = this._globalPlaceholder.children[id];
	if(!parent)
	{
		Util.assert("no " + id + " element found");
		return;
	}
	
	var clazz = null;
	try
	{
		clazz = eval(type);
	}
	catch(ex)
	{
		alert("Error: can't find navigation type " + type)
	}

	this._navigation = new clazz;

	this._navigation.formManager = this;
	this._navigation.createElement(navigationNode, parent);
}

proto._deleteControls = function()
{
	Tooltip.hide(); // FWUI-1025-2

	this._delayedControls = [];
	this._delayedContainers = [];
	this._delayedCollapsableContainers = [];
	
	this._toggledCollapsableContainers = [];

	// Delete menus.
	for(var i in this._menus)
	{
		this._menus[i].removeMenuTree();
	}
	this._menus = [];
	
	this._deleteMessageBoxes();
	
	this._deleteRequiredIcons();

	// Empty tab groups.
	for(var groupID in this._tabbedGroups)
	{
		var group = this._tabbedGroups[groupID];
		group.containers = null;
		group.tabTable.removeNode(true);
	}
	
	this._tabbedGroups = [];

	this.defaultButton = null;

	if(this._layoutManager) this._layoutManager.reload();
	
	this._deleteControlsInternal(this._formPlaceholder);
	
	if(window.CN_uploadbox) CN_uploadbox.deleteForm(this);
}

proto._deleteMessageBoxes = function()
{
	this._messageBoxOffset = 0;
	for(var i = 0; i < this._messageBoxes.length; i++)
	{
		var mb = this._messageBoxes[i];
		if(mb) CNDialogManager.destroyDialog(mb);
	}
	this._messageBoxes = [];
}

proto._deleteRequiredIcons = function()
{
	for(var i in this._requiredIcons)
	{
		this._requiredIcons[i].removeNode(true);
		i++;
	}
	this._requiredIcons = [];
}

proto._deleteControlsInternal = function(element)
{
	if (element == null) return;
	var children = element.children;
	var childCount = children.length;
	
	var toDelete = [];
	for(var i = childCount - 1; i >= 0; i--)
	{
		var l = children[i];

		if(l.isControl) {
			CNFormManager.destroyJSObject(l.jsObject);
			l.removeNode(true);
		}
		else if(l.isContainer) {
			var jso = l.jsObject;
			if(jso._layoutManager) {
				jso._layoutManager.unload();
				jso._layoutManager = l.containerElement._layoutManager = null;
			}

			this._deleteControlsInternal(l.containerElement);
			
			if(l._tabGroupID) {
				var group = this._tabbedGroups[l._tabGroupID];
				if(group) {
					delete this._tabbedGroups[l._tabGroupID];
					toDelete.push(group.tabTable);
				}
			}

			// Break cross reference.
			l.containerElement = null;
			l.disabler = null;
			l.jsObject = null;
			l.removeNode(true);
		}
		/*else if(l._isTabbedContainer) { // Note: now cleaned by if(l._tabGroupID) {
			// Remove also tabbed containers (needed to clean-up sub-forms properly).
			CNFormManager.destroyJSObject(l.jsObject);
			l.jsObject = null;
			l.removeNode(true);
		}*/
	}
	for(var i = 0; i < toDelete.length; i++) toDelete[i].removeNode(true);
}

proto._executeXMLForm = function(formNode)
{
	this._firstButtonFocused = false;

	var caption = formNode.getAttribute("caption");
	if(caption) caption = String(caption);
	else caption = "";

	this._setFormCaptionText(caption, formNode.getAttribute("captionImg"));

	if(this._darkHeader)
	{
		var darkHeight = parseInt(formNode.getAttribute("darkHeight"));
		if(!isNaN(darkHeight) && parseInt(darkHeight) > 0) 
		{
			this._darkHeader.style.height = this._darkHeight = Math.max(1, darkHeight + (CNFormManager.vista ? 5 : 21));
			this._darkHeader.style.visibility = "inherit";
			if(!CNFormManager.vista && this.isDialog) {
				Util.addClass(this._dialogDiv, "withDarkHeader");
			}
		}
		else
		{
			this._darkHeader.style.visibility = "hidden";
			if(!CNFormManager.vista && this.isDialog) {
				Util.removeClass(this._dialogDiv, "withDarkHeader");
			}
			this._darkHeight = 0;
		}
	}
			
	this._executeXMLControls(formNode.childNodes, this._formPlaceholder, true);
}

proto._executeXMLControls = function(childNodes, parentElement, topLevel, forceCreation)
{
	var start;
	var childNodesCount = childNodes.length;
	var delay = !forceCreation && this.delayedControlsCreation;
	for(var i = 0; i < childNodesCount; i++)
	{
		var node = childNodes[i];
		if(node.nodeType != 1) continue;
		
		if(node.tagName == "container") 
		{
			// If delayed, we map only top level containers.
			if(delay) this._delayContainerCreation(node, parentElement);
			else this._executeXMLContainer(node, parentElement, true);
		}
		else 
		{
			if(delay) this._delayControlCreation(node, parentElement);
			else this._executeXMLControl(node, parentElement);
		}
	}

	// 28-jul-07: doLayout only for top call.
	if(this._layoutManager && topLevel) this._layoutManager.doLayout();
}

proto._delayControlCreation = function(node, parentElement)
{
	var id = String(node.getAttribute("id"));
	this._delayedControls[id] = [node, parentElement];
	if(this.reportStats) this._changeStat('delayedControls', 1);
}

proto._delayContainerCreation = function(node, parentElement)
{
	var id = String(node.getAttribute("id"));
	this._delayedContainers[id] = [node, parentElement];
	if(node.getAttribute("groupID") || node.getAttribute("collapsable") == "true")
	{
		// Always create tabbed containers, but without children.
		// Created, as we need correct tab buttons order.

		// Also always create collapsable containers, to be sure
		// layout is applied properly to the hidden collapsed containers and the form.
		this._executeXMLContainer(node, parentElement, false);
	}
	
	if(this.reportStats) this._changeStat('delayedContainers', 1);
}

proto._executeXMLContainer = function(node, parentElement, processChildren, isDelayedTopLevel)
{
	var captionAttr = node.getAttribute("caption");
	
	var groupIDAttr = node.getAttribute("groupID");
	var anchorAttr = node.getAttribute("anchor");
	var anchor = LayoutManager.TOPLEFT;
	if(anchorAttr) anchor = parseInt(anchorAttr, 2);
	
	var collapsable = node.getAttribute("collapsable") == "true";
	var scrollable = node.getAttribute("scrollable") != "false";

	var layoutManager = parentElement._layoutManager ? parentElement._layoutManager : this._layoutManager;

	var containerElement;
	var l;
	if(groupIDAttr)
	{
		containerElement = l = this._buildTabContainer(node, parentElement, anchor, groupIDAttr, isDelayedTopLevel, captionAttr, layoutManager);
	}
	else if(captionAttr || collapsable)
	{
		l = this._buildContainerWithHeader(node, parentElement, captionAttr, anchor, collapsable, isDelayedTopLevel, layoutManager);
		containerElement = l.containerElement;
	}
	else
	{
		l = document.createElement("div");
		parentElement.appendChild(l);
		l.jsObject = {};
		containerElement = l;
		if(layoutManager) layoutManager.processNewContainer(l, anchor, node, parentElement, isDelayedTopLevel);
		else CNUtil.setBounds(l, node);
	}

	l.containerElement = containerElement;
	containerElement.isContainerElement = true;
	l.isContainer = true;
	l.style.position = "absolute";
	if(scrollable) containerElement.style.overflow = "auto";
	else containerElement.style.overflow = 'hidden';	
	
	this._setID(l, node);
	
	if(this.reportStats) this._changeStat('containers', 1);

	if(processChildren) this._executeXMLControls(node.childNodes, containerElement, false);
	
	return l;
}

proto._buildTabContainer = function(node, parentElement, anchor, groupIDAttr, isDelayedTopLevel, captionAttr, layoutManager)
{
	l = document.createElement("div");
	parentElement.appendChild(l);
	l.jsObject = {};

	var groupID = String(groupIDAttr);
	var tabbedGroup = this._tabbedGroups[groupID];
	if(!tabbedGroup)
	{
		// No tabbed table has been created yet.
		tabbedGroup = {};
		this._tabbedGroups[groupID] = tabbedGroup;
		
		tabbedGroup.tabTable = this._buildTabbedContainer(parentElement);
		tabbedGroup.groupID = groupID;
		tabbedGroup.tabTable.jsObject = {};
		tabbedGroup.containers = [];

		if(layoutManager) layoutManager.processNewTabsTable(tabbedGroup.tabTable, anchor, node, 
													parentElement, isDelayedTopLevel);
		else CNUtil.setBounds(tabbedGroup.tabTable, node, parentElement);
	}

	var tabsTD = tabbedGroup.tabTable.rows(0).cells(0);
	var tabTable = this._buildContainerTab(tabsTD);
	tabTable.id = String(node.getAttribute("id"));
	tabTable._autoPostBack = node.getAttribute("autoPostBack") == "true";
	tabTable._tabGroupID = groupID;

	l._tabGroupID = groupID;
	l.style.display = "none"; // 30-jul-2007
	l.style.visibility = "hidden"; // 2-feb-2008 - required for delayed mode+blue.
	
	tabbedGroup.containers.push(l);
	
	if(layoutManager)
	{
		layoutManager.processNewTabbedContainer(l, anchor, node, parentElement, isDelayedTopLevel);
	}
	else
	{
		CNUtil.setBounds(l, node);

		// Move down as header (with tab buttons) takes it size.
		l.style.top = parseInt(l.currentStyle.top, 10) + 22;
		l.style.height = parseInt(l.currentStyle.height, 10) - 22;
	}
	return l;
}

proto._buildContainerWithHeader = function(node, parentElement, captionAttr, anchor, collapsable, isDelayedTopLevel, layoutManager)
{
	var l = CN_panel_buildMiniBoxPanel(parentElement);
	l.jsObject = {};
	
	var containerElement;
	if(CNFormManager.vista)
	{
		containerElement = l.lastChild.firstChild;
	}
	else
	{
		var td = l.all["contentTD"];
		containerElement = document.createElement("div");
		td.appendChild(containerElement);
		
		containerElement.style.position = "absolute";
		containerElement.style.width = "100%";
		containerElement.style.height = "100%";
	}
	containerElement._isContainerPanel = true;
	if(captionAttr) l.all["__panel_text"].innerText = String(captionAttr);
	
	l.containerElement = containerElement;

	if(layoutManager)
	{
		layoutManager.processNewContainer(l, anchor, node, parentElement, isDelayedTopLevel);
		
		if(collapsable) this._initCollapsableContainer(l);
	}
	else CNUtil.setBounds(l, node);

	return l;
}

proto._initCollapsableContainer = function(l)
{
	var as = l.jsObject._anchorSide;
	if((as & LayoutManager.TOPBOTTOM) != LayoutManager.TOPBOTTOM)
	{
		var up;
		if((as & LayoutManager.TOP) == LayoutManager.TOP)
		{
			// Collapse up.
			l._collapseDirection = "up";
			up = true;
		}
		else if((as & LayoutManager.BOTTOM) == LayoutManager.BOTTOM)
		{
			// Collapse down.
			l._collapseDirection = "down";
			up = false;
		}
		else
		{
			return;
		}
		
		l._collapsable = true;
		this._addCollapseButton(l, up);
	}
}

proto._addCollapseButton = function(parentElement, up)
{
	if(CNFormManager.vista)
	{
		var l;

		if(CNFormManager.subTheme == "black") l = VistaSupport.createImageSetButton("collapse-set.gif", 20, 20, up ? 0 : 20);
		else l = VistaSupport.createImageButton(up ? "collapse-up.gif" : "collapse-down.gif", 20, 20);

		l.className = "cnCollapseButton";
		parentElement.appendChild(l);
	}
	else
	{
		var pt = parentElement.all["__panel_text"];
		var td = pt.parentElement;
	
		var l = document.createElement("<div class=cnCollapseButton unselectable=on>");
		td.appendChild(l);
		var span = document.createElement('<span unselectable=on>');
		l.appendChild(span);
		span.innerText = up ? '5' : '6';
		
		l.attachEvent("onmouseenter", this._collapseButton_onmouseenter);
		l.attachEvent("onmouseleave", this._collapseButton_onmouseleave);
	}
	//l.title = "Collapse";		
	Tooltip.set(l, "Collapse");
	l.attachEvent("onclick", this._collapseButton_onclick);	
}

proto._collapseButton_onmouseenter = function()
{
	var l = event.srcElement;
	l.runtimeStyle.borderWidth = "1px";
	l.runtimeStyle.padding = "0px";
}

proto._collapseButton_onmouseleave = function()
{
	CNFormManager.getActiveFormManager()._unliteCollapseButton(event.srcElement);
}

proto._unliteCollapseButton = function(l)
{
	if(CNFormManager.vista) return;
	l.runtimeStyle.borderWidth = "0px";
	l.runtimeStyle.padding = "1px";
}

proto._collapseButton_onclick = function()
{
	CNFormManager.getActiveFormManager().collapseButton_onclick();
}
proto.collapseButton_onclick = function()
{
	var button = CNUtil.findByClassName(event.srcElement, "cnCollapseButton");
	
	var l = CNUtil.findElement(button);
	if(!l.isContainer)
	{
		Util.assert("not a container");
		return;
	}
	
	if(l._collapseDirection == "down") 
	{
		this._unliteCollapseButton(button);
	}

	if(this._layoutManager) 
	{
		this._layoutManager.toggleContainer(l);
		
		this._toggledCollapsableContainers[l.id] = l;
	}
}

proto._buildTabbedContainer = function(parentElement)
{
	var table = document.createElement("<table width=100% height=100% border=0 cellpadding=0 cellspacing=0>")
	table._isTabbedContainer = true;
	parentElement.appendChild(table);
	table.style.position = "absolute";
	table.style.zIndex = -1;
	
	var tabsTD = table.insertRow().insertCell();
	tabsTD.height = 22;
	
	var contentTD = table.insertRow().insertCell();
	contentTD.height = "100%";
	contentTD.className = "tabbedContainerTD"
	contentTD.innerText = " ";
	
	return table;
}

proto._buildContainerTab = function(parentElement)
{
	var l;
	if(CNFormManager.vista)
	{
		l = document.createElement("<div class='tabbedContainerButton'>")
		var div = document.createElement("div");
		l.appendChild(div);
		parentElement.appendChild(l);
		l.attachEvent("onmouseenter", this._tabTable2_onmouseenter);
		l.attachEvent("onmouseleave", this._tabTable2_onmouseleave);
	}
	else
	{
		var table = l = document.createElement("<table border=0 cellpadding=0 cellspacing=0>");
		parentElement.appendChild(table);
		
		table.style.zIndex = 1;
		table.style.display = "inline";
		table.style.marginRight = 1;
		table.style.position = "relative";
		table.style.cursor = "hand";
		
		var tr = table.insertRow();
		tr.height = 22;
	
		var td1 = tr.insertCell();
		td1.width = 12;
		
		var img1 = document.createElement("<img width=12 height=22>");
		td1.appendChild(img1);
		
		td2 = tr.insertCell();
		td2.unselectable = true;
	
		var td3 = tr.insertCell();
		td3.width = 12;
		
		var img2 = document.createElement("<img width=12 height=22>");
		td3.appendChild(img2);
		this._setSelectedTab(table, false);
		l.attachEvent("onmouseenter", this._tabTable_onmouseenter);
		l.attachEvent("onmouseleave", this._tabTable_onmouseleave);
	}
	l.attachEvent("onmousedown", this._tabTable_onmousedown);
	return l;	
}

proto._tabTable2_onmouseenter = function()
{
	var tab = event.srcElement;
	if(tab._disabled || tab.className.match(/tabbedContainerButton_selected/)) return;
	//if(tab.filters.length == 0) tab.style.filter = "progid:DXImageTransform.Microsoft.Fade()";
	//tab.filters[0].Apply();
	tab.className = "tabbedContainerButton tabbedContainerButton_hover";
	//tab.filters[0].Play(.2);
}
proto._tabTable2_onmouseleave = function()
{
	var tab = event.srcElement;
	if(tab._disabled || tab.className.match(/tabbedContainerButton_selected/)) return;
	//tab.filters[0].Apply();
	tab.className = "tabbedContainerButton";
	//tab.filters[0].Play(.3);	
}

proto._tabTable_onmouseenter = function()
{
	event.srcElement.runtimeStyle.textDecoration = "underline";
}
proto._tabTable_onmouseleave = function()
{
	event.srcElement.runtimeStyle.textDecoration = "";
}

proto._tabTable_onmousedown = function()
{
	var formManager = CNFormManager.getActiveFormManager();
	
	//If (this._formDisabled - showErrors dialog) ignore event;
	if (formManager && formManager._formDisabled) return;
	
	var tab;	
	if(CNFormManager.vista)
	{
		tab = CNUtil.findByClassName(event.srcElement, "tabbedContainerButton");
		if(tab._disabled) return;
		if(tab.filters.length > 0) tab.filters[0].Stop();
	}
	else
	{
		tab = CNUtil.findTag(event.srcElement, "TABLE");
		try{ tab.focus(); } catch(e){}
	}	
	formManager._selectTab(tab, true);
	if(tab._autoPostBack) formManager.postData("tabchanged");
}

proto._selectTab = function(tabTable, userClick)
{
	var groupID = tabTable._tabGroupID;
	var group = this._tabbedGroups[groupID];
	if(!group) Util.assert("no such tab group: " + groupID);

	group.tabTable.style.visibility = "inherit";

	var oldTab = group.selectedTabButtonTable;
	if(oldTab)
	{
		this._setSelectedTab(oldTab, false);
	}

	this._setSelectedTab(tabTable, true);

	var container = this._getContainerForTab(tabTable);
	// Process delayed container before tab is actually selected.
	if(userClick && this.delayedControlsCreation)
	{
		var id = container.id;
		var ar = this._delayedContainers[id];
		if(ar)
		{
			this._initDelayedContainer(id, ar, container, groupID);
			this._processDelayedControlsWithoutData();
		}
	}
		
	group.selectedTabButtonTable = tabTable;
	
	if(userClick)
	{
		group.isDirty = true;

		if(oldTab)
		{
			var oldContainer = this._getContainerForTab(oldTab);
			oldContainer.style.visibility = "hidden";
			oldContainer.style.display = "none";
		}
		container.style.display = "block";
		container.style.visibility = "inherit";
		
	}
	if(this._layoutManager) this._layoutManager.doLayout();
}

proto._getContainerForTab = function(tabTable)
{
	var tabContainerTable = CNUtil.findTag(tabTable.parentElement, "TABLE");
	var parentElement = tabContainerTable.parentElement;
	var container = parentElement.children[tabTable.id];
	return container;
}


proto._setSelectedTab = function(tabTable, selected, force)
{
	if(!force && tabTable._selected == selected) return;
	tabTable._selected = selected;
	
	if(CNFormManager.vista)
	{
		if(selected)
		{
			tabTable.className = "tabbedContainerButton tabbedContainerButton_selected";
			if(tabTable.previousSibling && tabTable.previousSibling.currentStyle.display != "none")
			{
				tabTable.style.left = "-2px";
				tabTable.style.marginRight = "-4px";
				tabTable.style.paddingLeft = tabTable.style.paddingRight = "2px";
			}
			else
			{
				tabTable.style.marginRight = "-2px";
				tabTable.style.paddingLeft = tabTable.style.paddingRight = "1px";
			}
		}
		else
		{
			tabTable.style.paddingLeft = tabTable.style.paddingRight = "0";
			tabTable.style.left = "0";
			tabTable.style.marginRight = "0";
			tabTable.className = "tabbedContainerButton"; 
		}
	}
	else
	{
		var tr = tabTable.rows(0);
		var cells = tr.cells;
		var imageNumber;
		var td2 = cells[1];
		if(selected) 
		{
			tabTable.style.top = 1;
			imageNumber = "1"
			td2.style.paddingTop = "1px";
			td2.style.fontWeight = "bold";
		}
		else
		{
			tabTable.style.top = 0;
			imageNumber = "2"
			td2.style.paddingTop = "3px";
			td2.style.fontWeight = "bold";
		}
		cells[0].children[0].src = CNFormManager.themeImagesPath + "container-tab-" + imageNumber + "_01.gif";
		td2.background = CNFormManager.themeImagesPath + "container-tab-" + imageNumber + "_02.gif";
		cells[2].children[0].src = CNFormManager.themeImagesPath + "container-tab-" + imageNumber + "_03.gif";
	}
}


proto._executeXMLControl = function(node, parentElement, isDelayedTopLevel, isDelayed)
{
	var controlType = node.tagName;
	
	var type = eval("CN_" + controlType);
	if(!type)
	{
		Util.assert("Can't create control: " + controlType);
		return;
	}
	
	var id = String(node.getAttribute("id"));

	var jsl = new type;
	jsl.formManager = this;
	jsl.elementID = id;

	var l = jsl.createElement(node, parentElement);
	if(!l.parentElement) 
	{
		parentElement.appendChild(l);
	}

	l.id = id;
	l.isControl = true;
	l.style.position = "absolute";
		
	var tabIndex = node.getAttribute("tabIndex");
	if(tabIndex !== null) 
	{
		var ti = parseInt(tabIndex, 10);
		if(jsl.set_tabIndex) jsl.set_tabIndex(ti);
		else l.tabIndex = ti;
	}

	var layoutManager = parentElement._layoutManager ? parentElement._layoutManager : this._layoutManager;

	var anchor = -1;
	if(layoutManager)
	{
		var anc = node.getAttribute("anchor");
		if(anc) anchor = parseInt(anc, 2);
		else anchor = 0;

		layoutManager.processNewControl(l, anchor, node, parentElement, isDelayedTopLevel);
	}
	else
	{
		CNUtil.setBounds(l, node);
		if(jsl.layout) jsl.layout();
	}
	
	var menuID = node.getAttribute("menuID");
	if(menuID != null)
	{
		l._menuID = String(menuID);
		l.attachEvent("onmousedown", this._control_oncontextmenu);
	}

	if(jsl.supportsRequired && node.getAttribute("required") == "true")
	{
		this._putRequiredMark(l, parentElement, anchor);
	}

	if(isDelayed && parentElement.isContainerElement)
	{
		var cont = parentElement;
		while(cont && !cont.isContainer) cont = cont.parentNode;
		if(!cont)
		{
			Util.assert("!cont");
			return;
		}
		
		if(cont.__disabled)
		{
			this._setControlDisabled(l, true);
		}
	}

	if(jsl.onControlCreated) jsl.onControlCreated();
	
	if(this.reportStats) this._changeStat('controls', 1);
	
	return jsl;
}

CNFormManager._wrap_getAttribute = function(name)
{
	return this[name];
}

proto._putRequiredMark = function(l, parentElement, anchor)
{
	var icon = document.createElement("<span class='cnRequiredIconSpan'>");
	parentElement.appendChild(icon);
	icon.innerText = "*";
	icon._isRequiredIcon = true;
	icon._attachedToID = l.id;
	//icon.title = "Required";
	Tooltip.set(icon, "Required");
	icon.style.zIndex = 1000;
	
	this._requiredIcons[l.id] = icon;
	
	var y, x;
	if(l.jsObject._anchorTop) y = l.jsObject._anchorTop;
	else if(l.style.pixelTop) y = l.style.pixelTop;
	else y = l.offsetTop;
	if(l.jsObject._anchorLeft) x = l.jsObject._anchorLeft;
	else if(l.style.pixelLeft) x = l.style.pixelLeft;
	else x = l.offsetLeft;
	
	var markAnchor = anchor;
	if((anchor & LayoutManager.LEFTRIGHT) == LayoutManager.LEFTRIGHT) 
	{
		markAnchor = LayoutManager.RIGHT;
	}
	if((anchor & LayoutManager.TOPBOTTOM) == LayoutManager.TOPBOTTOM) 
	{
		markAnchor |= LayoutManager.TOP;
	}
	else if((anchor & LayoutManager.BOTTOM) == LayoutManager.BOTTOM) 
	{
		markAnchor |= LayoutManager.BOTTOM;	
	}
	
	y += 2;
	var layoutManager = parentElement._layoutManager ? parentElement._layoutManager : this._layoutManager;

	// Fake node.
	if(layoutManager)
	{
		x += l.jsObject._anchorW + 2;
		var node = {x: x, y: y, width: 3, height: 16, getAttribute: CNFormManager._wrap_getAttribute};
		icon.jsObject = {}
	
		if(anchor != -1) layoutManager.processNewControl(icon, markAnchor, node, parentElement);
		else layoutManager.processNewControl(icon, 0, node, parentElement);
		layoutManager.forceLayout(icon);
	}
	else
	{
		var w = l.offsetWidth ? l.offsetWidth : l.style.pixelWidth;
		x += w + 2;
		icon.style.left = x;
		icon.style.top = y;
	}
}

proto._setID = function(l, node)
{
	var id = node.getAttribute("id");
	if(id) l.id = id;
}

proto._setNavigationDisabled = function(disabled)
{
	this._navigationDisabled = disabled;
	if(this._navigation && this._navigation.set_disabled) this._navigation.set_disabled(this._navigationDisabled);
	if(this._topButtons) this._topButtons.set_disabled(this._navigationDisabled);
	if(this._alertIcons) this._alertIcons.set_disabled(this._navigationDisabled);
	for(var i in this._controls) {
		var jso = this._controls[i];
		if(jso.set_disabled) jso.set_disabled(this._navigationDisabled);
	}
}

proto._setVistaColor1 = function(color)
{
	document.body.style.backgroundColor = color;
}

proto._executeXMLData = function(dataNode)
{
	var dataNode = this._ideaNode.selectSingleNode("data");
	if(!dataNode) 
	{
		if(this.delayedControlsCreation) this._processDelayedControlsWithoutData();
		return;
	}

	if(CNFormManager.vista)
	{
		var attr = dataNode.getAttribute("themeColor1");
		if(attr) this._setVistaColor1(String(attr));
	}

	if(this._navigation)
	{
		var attr = dataNode.getAttribute("canLeaveForm");
		if(attr)
		{
			this._setNavigationDisabled(attr == "false");
			this._editMode = (attr == "false");
		}
	}
	
	var attr = dataNode.getAttribute("browserTitle");
	if(attr !== null)
	{
		document.title = this._currentFormCaption + " " + String(attr);
	}

	attr = dataNode.getAttribute("uploadURL");
	if(attr) this._uploadURL = String(attr);

	attr = dataNode.getAttribute("uploadDebug");
	if(attr) this._uploadDebug = attr == "true";
	
	attr = dataNode.getAttribute("errorMode");
	if(attr) this._setErrorMode(attr == "true");

	var childNodes = dataNode.selectNodes("*");
	this._executeXMLData2(childNodes, this._formPlaceholder, true);
	
	this._executeControlsData(dataNode);
	
	if(this.delayedControlsCreation) this._processDelayedControlsWithoutData();
	
	attr = dataNode.getAttribute("defaultButton");
	if(attr) 
	{
		var b = this._formPlaceholder.all[String(attr)];
		if(b && b.jsObject) this.defaultButton = b.jsObject;
	}

	this.changeFocus = dataNode.getAttribute("changeFocus") != "false";

	var attr = dataNode.getAttribute("focusedControl");
	if(attr)
	{
		var focusedID = String(attr);
		var el = this._formPlaceholder.all[focusedID];
		if(el) this._setFocusTO(el);
		else Util.assert('no ' + focusedID + ' control found to focus');
	}

	if(CNFormManager.vista) this._selectPendingContTabs();
}

// Processes out-of-form "_controls" collection.
proto._executeControlsData = function(dataNode) {
	for(var i in this._controls) {
		var jso = this._controls[i];
		var node = dataNode.selectSingleNode(i + "[@id=\"" + jso.elementID + "\"]");
		if(node && jso.loadData) jso.loadData(node);
	}
}

proto._processDelayedControlsWithoutData = function()
{
	// Create/load controls which had no data.
	var toDelete = [];
	for(var id in this._delayedControls)
	{
		var ar = this._delayedControls[id];
		if(ar.length == 2) 
		{
			// Just exec, as no data supplied.
			// No need for relayout controls against collapsable containers
			// as we expand/collapse them later.
			this._executeXMLControl(ar[0], ar[1], false, true);
			toDelete.push(id);
		}
	}
	for(var i = 0; i < toDelete.length; i++)
	{
		delete this._delayedControls[toDelete[i]];
	}

	var toDelete = [];
	for(var id in this._delayedContainers)
	{
		var ar = this._delayedContainers[id];
		if(ar.length == 2) 
		{
			var groupID = ar[0].getAttribute("groupID");
			
			var cont = this._getElement(ar[1], id);
			this._executeDelayedContainer(id, ar, cont, groupID, null, cont ? cont._collapsable : false);

			toDelete.push(id);
		}
	}
	for(var i = 0; i < toDelete.length; i++)
	{
		delete this._delayedContainers[toDelete[i]];
	}

	// Expand/collapse delayed collapsable containers.
	for(var i = 0; i < this._delayedCollapsableContainers.length; i++)
	{
		var ar = this._delayedCollapsableContainers[i];
		if(ar[1]) this._layoutManager._expandContainer(ar[0]);
		else this._layoutManager._collapseContainer(ar[0])
	}
	this._delayedCollapsableContainers = [];

	if(this._layoutManager) this._layoutManager.doLayout();
}

// Vista only.
proto._selectPendingContTabs = function()
{
	// Select all tabs. Actual tab selection happens here (for loaded xml).
	for(var id in this._tabbedGroups)
	{
		var group = this._tabbedGroups[id];
		if(group.selectedTabButtonTable) 
		{
			group.tabTable.style.visibility = "inherit";
			this._setSelectedTab(group.selectedTabButtonTable, true, true);
		}
		else
		{
			if(this._areAllTabsHidden(group))
			{
				// hide tab container.
				group.tabTable.style.visibility = "hidden";
			}
		}
	}	
}

proto._setErrorMode = function(isErrorMode)
{
	var item = document.getElementById("__si_formRedHeaderBG");
	if(!item) return;
	
	item.style.visibility = isErrorMode ? "inherit" : "hidden";
}

proto._setFocusTO = function(el)
{
	setTimeout(function() { 
		try { 
			var jso = el.jsObject;
			if(jso && jso.focus) {
				jso.focus();
				if(jso.select) jso.select();
			} else {
				el.focus(); 
				if(el.select) el.select(); 
			}
		} catch(ex){} }, 500);
}

proto._executeXMLData2 = function(childNodes, parentElement, topLevel)
{
	var childNodesCount = childNodes.length;
	for(var i = 0; i < childNodesCount; i++)
	{
		var node = childNodes[i];
		if(node.nodeType != 1) continue;

		var tagName = node.tagName;
		if(tagName == "menu")
		{
			this._loadMenu(node);
		}
		else 
		{
			var id = this._getID(node);
			if(id === null) continue;

			if(tagName == "container")
			{
				this._loadContainer(id, node, parentElement, topLevel);
			}
			else
			{				
				this._loadControl(id, node, parentElement, topLevel);
			}
		}
	}
}

proto._loadContainer = function(id, node, parentElement, topLevel)
{
	var container = null;

	if(this.delayedControlsCreation)
	{
		var ar = this._delayedContainers[id];
		if(ar)
		{
			var createNode = ar[0];
			var tabGroupID = createNode.getAttribute("groupID");						
			var collapsable = createNode.getAttribute("collapsable") == "true";

			var visibleAttr = node.getAttribute("visible");
			var isHidden = visibleAttr == "false";
			if(isHidden
			// Visible not specified and we have node data delayed -> add data to delayed array.
			|| visibleAttr == null && (ar.length > 2 || tabGroupID || collapsable) /* don't init non excplicely visible tab containers */
			)
			{
				var delayedData;
				if(ar.length == 2) 
				{
					delayedData = [];
					ar.push(delayedData);
				}
				else delayedData = ar[2];
				
				delayedData.push(node); // Delay data node.
				
				if(tabGroupID)
				{
					// We still should process tabContainer attributes
					// to be sure tab buttons state is valid.
					this._processTabbedContainer(id, node, tabGroupID);
					if(isHidden)
					{
						container = this._getElement(parentElement, id);
						container.style.visibility = "hidden"; // Explicely hide it.
					}
				} 
				else if(collapsable)
				{
					container = this._getElement(parentElement, id);
					this._loadCollapsableCont(node, container);
					if(isHidden)
					{
						container.style.visibility = "hidden"; // Explicely hide it.
					}
				}
				
				return;
			}
			// We gonna create and process this container.
			container = this._initDelayedContainer(id, ar, null, tabGroupID, topLevel, collapsable);
		}
	}
	
	if(container === null)
	{
		container = this._getElement(parentElement, id);
		if(!container) return;
	}
	
	this._loadDataIntoContainer(id, container, node, parentElement);
}

// Also called when tab container set visible by user click.
proto._initDelayedContainer = function(id, ar, container, tabGroupID, topLevel, collapsable)
{
	delete this._delayedContainers[id];
	if(this.reportStats) this._changeStat('delayedContainers', -1);
	
	container = this._executeDelayedContainer(id, ar, container, tabGroupID, topLevel, collapsable);
	
	// Execute delayed data nodes.
	if(ar.length > 2)
	{
		var delayedNodes = ar[2];
		for(var i = 0; i < delayedNodes.length; i++)
		{
			var delayedNode = delayedNodes[i];
			this._loadDataIntoContainer(id, container, delayedNode);
		}
	}
	
	return container;
}

proto._executeDelayedContainer = function(id, ar, container, tabGroupID, topLevel, collapsable)
{
	var parentElement = ar[1];
	if(tabGroupID || collapsable)
	{
		if(container === null) container = this._getElement(parentElement, id);
		if(container === null)
		{
			Util.assert("!container for id: " + id);
			return;
		}
		// This is tabbed or visible collapsable container, container element/tabs were created already.
		// Just process children.
		this._executeXMLControls(ar[0].childNodes, container.containerElement, false, true);
	}
	else
	{
		// Create container.
		container = this._executeXMLContainer(ar[0], parentElement, true, topLevel);
	}
	return container;
}

proto._loadDataIntoContainer = function(id, container, node)
{
	var formNode = node.selectSingleNode("form");
	if(formNode != null) this._loadContainerSubForm(container, formNode, node);

	var oldVisibility = container.currentStyle.visibility;
	this._setCommonProperties(container, node, true);
	
	if(this._layoutManager && oldVisibility == "hidden" 
	&& oldVisibility != container.currentStyle.visibility)
	{
		this._layoutManager.forceContainerLayout(container);
	}
	
	if(node.getAttribute("scrollTop") == "true")
	{
		container.containerElement.scrollTop = container.containerElement.scrollLeft = 0;
	}
	
	var tgID = container._tabGroupID;
	if(tgID) 
	{
		this._processTabbedContainer(id, node, tgID);
	} else {
		var attr = node.getAttribute("caption");
		if(attr) {
			this._setContainerCaption(container, String(attr));
		}
	}
	
	this._setContainerDisabled(container, container.__disabled ? true : false);

	this._executeXMLData2(node.childNodes, container.containerElement, false);

	if(container._collapsable) this._loadCollapsableCont(node, container);
}
proto._setContainerCaption = function(container, caption) {
	if(CNFormManager.vista) {
		container.children[1].innerText = caption;
	} else {
		container.rows[0].cells[1].firstChild.innerText = caption;
	}		
}

proto._loadContainerSubForm = function(container, formNode, contNode) {
	var contElement = container.containerElement;
	this._subFromDeleteControls(container, contElement);

	var widthAttr = formNode.getAttribute("width");
	var heightAttr = formNode.getAttribute("height");
	if(widthAttr != null && heightAttr != null) {
		var jso = container.jsObject;
		jso._layoutManager = contElement._layoutManager = new LayoutManager(contElement, parseInt(widthAttr, 10), parseInt(heightAttr, 10));
		//container.jsObject._layoutManager._inSubForm = true; // Debug var.
		jso.isSubForm = true;
	}
	
	this._executeXMLControls(formNode.childNodes, contElement, false, false);
}

proto._subFromDeleteControls = function(container, contElement) {
	this._deleteControlsInternal(contElement);

	if(this._layoutManager) this._layoutManager.cleanupContainer(container);
	var jso = container.jsObject;

	if(jso._layoutManager) {
		jso._layoutManager.unload();
		jso._layoutManager = contElement._layoutManager = null;
	}

	// Remove all delayed controls and containers for this container.
	var toDelete = [];
	for(var id in this._delayedControls) {
		var ar = this._delayedControls[id];
		if(ar.length > 1 && ar[1] == contElement) {
			toDelete.push(id);
		}
	}
	for(var i = 0; i < toDelete.length; i++) {
		delete this._delayedControls[toDelete[i]];
	}
	var toDelete = [];
	for(var id in this._delayedContainers) {
		var ar = this._delayedContainers[id];
		if(ar.length > 1 && ar[1] == contElement) {
			toDelete.push(id);
		}
	}
	for(var i = 0; i < toDelete.length; i++) {
		delete this._delayedContainers[toDelete[i]];
	}
	
	// Remove required icons.
	var toDelete = [];
	var spans = container.getElementsByTagName("span");
	var count = spans.length;
	for(var i = 0; i < count; i++) {
		var span = spans[i];
		if(span._isRequiredIcon) {
			toDelete.push(span);
		}
	}
	for(var i = 0; i < toDelete.length; i++) {
		var icon = toDelete[i];
		delete this._requiredIcons[icon._attachedToID];
		icon.removeNode(true);
	}
}

proto._loadCollapsableCont = function(node, container)
{
	var collapsedAttr = node.getAttribute("collapsed");
	if(collapsedAttr && this._layoutManager)
	{
		if(this.delayedControlsCreation) 
		{
			this._delayedCollapsableContainers.push([container, collapsedAttr == "false"]);
		}
		else
		{
			if(collapsedAttr == "false") this._layoutManager._expandContainer(container);
			else this._layoutManager._collapseContainer(container)
		}
	}
}

proto._loadControl = function(id, node, parentElement, topLevel)
{
	var l = null, jso;
	if(this.delayedControlsCreation)
	{
		var ar = this._delayedControls[id];
		if(ar)
		{
			var visibleAttr = node.getAttribute("visible");
			if(visibleAttr == "false" 
			// Visible not specified and we have node data delayed -> add data to delayed array.
			|| visibleAttr == null && ar.length > 2) 
			{
				var delayedData;
				if(ar.length == 2) 
				{
					delayedData = [];
					ar.push(delayedData);
				}
				else delayedData = ar[2];
				
				delayedData.push(node); // Delay data node.
				
				// Don't process invisibles.
				return;
			}

			delete this._delayedControls[id];
			if(this.reportStats) this._changeStat('delayedControls', -1);
			jso = this._executeXMLControl(ar[0], ar[1], topLevel, true);

			if(!jso) 
			{
				Util.assert("!jso");
				return;
			}
			l = jso.element;
			
			// Execute delayed data nodes.
			if(ar.length > 2)
			{
				var delayedNodes = ar[2];
				for(var i = 0; i < delayedNodes.length; i++)
				{
					var delayedNode = delayedNodes[i];
					this._loadDataIntoControl(jso, delayedNode, parentElement);
				}
			}
		}
	}
	
	if(l === null)
	{
		l = this._getElement(parentElement, id);
		if(!l) return;

		jso = l.jsObject;
		if(!jso)
		{
			Util.assert("Not a js control: " + l.id);
			return;
		}
	}
	
	this._loadDataIntoControl(jso, node, parentElement);
}

proto._loadDataIntoControl = function(jso, node, parentElement)
{
	if(jso.supportsRequired) this._processRuntimeRequired(jso.element, jso, node, parentElement);
	this._setCommonProperties(jso.element, node);
	if(jso.loadData) jso.loadData(node);
}

proto._processTabbedContainer = function(id, node, tgID)
{
	var group = this._tabbedGroups[tgID];
	if(!group) return;
	
	var tabButtonsTD = group.tabTable.rows(0).cells(0);
	var tab = tabButtonsTD.children[id];

	var captionAttr = node.getAttribute("caption");
	var tabDisabledAttr = node.getAttribute("headerEnabled");
		
	if(CNFormManager.vista)
	{
		if(captionAttr) tab.firstChild.innerText = String(captionAttr);

		if(tabDisabledAttr) 
		{
			var disabled = tab._disabled = tabDisabledAttr == "false";
			tab.className = disabled ? "tabbedContainerButton tabbedContainerButton_disabled" : "tabbedContainerButton";
		}
	}
	else
	{
		if(captionAttr) tab.cells(1).innerText = String(captionAttr);		
		if(tabDisabledAttr) tab.disabled = tabDisabledAttr == "false";
	}

	var tabVisibleAttr = node.getAttribute("headerVisible");
	if(tab && tabVisibleAttr)
	{
		group.reselect = true;
		if(tabVisibleAttr == "true")
		{
			tab.style.display = "inline";
			tab.style.visibility = "inherit";
		}
		else
		{
			tab.style.display = "none";
			tab.style.visibility = "hidden";
		}
	}

	var visibleAttr = node.getAttribute("visible");

	if(CNFormManager.vista) 
	{
		if(visibleAttr == "true")
		{
			var oldTab = group.selectedTabButtonTable;
			if(oldTab) this._setSelectedTab(oldTab, false);
			group.selectedTabButtonTable = tab;
		}
		else if(visibleAttr == "false")
		{
			if(group.selectedTabButtonTable == tab) group.selectedTabButtonTable = null;
		}
	}
	else
	{
		if(visibleAttr == "true")
		{
			this._selectTab(tab);
		}
		else if(visibleAttr == "false" && this._areAllTabsHidden(group))
		{
			// hide tab container.
			group.tabTable.style.visibility = "hidden";
		}
	}
}

proto._areAllTabsHidden = function(group)
{
	for(var i = 0; i < group.containers.length; i++)
	{
		if(group.containers[i].currentStyle.visibility != 'hidden')
		{
			 return false;
		}
	}	
	return true;
}

proto._processRuntimeRequired = function(l, jso, node, parentElement)
{
	var attr = node.getAttribute("required");
	if(attr)
	{
		var icon = this._requiredIcons[l.id];
		if(attr == "true")
		{
			if(!icon) this._putRequiredMark(l, parentElement, jso._anchor);
			else icon.style.display = 'inline';
		}
		else
		{
			if(icon) icon.style.display = 'none';
		}
	}
}

proto._loadMenu = function(node)
{
	var topPlaceholder = document.body;

	var id = String(node.getAttribute("id")); //this._getMenuID(String(node.getAttribute("id")));
	var oldMenu = this._menus[id]; //topPlaceholder.children[id];
	if(oldMenu) {
		oldMenu.removeMenuTree();
	}

	if(node.childNodes.length > 0)
	{
		var menu = new PopupMenu(topPlaceholder, "beforeend");
		//menu.element.id = id;
		this._fillMenu(node, menu, id);
		this._menus[id] = menu;
	}
	else
	{
		delete this._menus[id];
	}
}

proto._fillMenu = function(node, menu, menuID)
{
	var itemNodes = node.selectNodes("items/*");
	for(var i = 0; i < itemNodes.length; i++)
	{
		var itemNode = itemNodes[i];
		
		if(itemNode.tagName == "menuitem")
		{
			var text = String(itemNode.getAttribute("text"));
			var img = null;
			var imgAttr = itemNode.getAttribute("img");	 
			if(imgAttr) img = String(imgAttr);
			
			var isEnabled = itemNode.getAttribute("enabled") != "false";
			var isVisible = itemNode.getAttribute("visible") != "false";
	
			var l;
			if(itemNode.hasChildNodes())
			{
				var returnValue = menu.createSubmenuEx(text, img);
				this._fillMenu(itemNode, returnValue.submenu, menuID)
				l = returnValue.item;
			}
			else
			{
				l = menu.createItem(text, img);
				l.onmenuclick = this._menuItem_onmenuclick;
				l._id = String(itemNode.getAttribute("id"));
				l._parentMenuID = menuID;
				if(img && !isEnabled)
				{
					l.children[0].children[0].style.filter = "alpha(opacity=30)";
				}
				
				var attr = itemNode.getAttribute("wrap");
				if(attr != null)
				{
					l.children[1].style.whiteSpace = attr == "true" ? "normal" : "nowrap";
					l.children[1].style.marginLeft = "30px";
				}
			}
			l.disabled = !isEnabled;
			if(!isVisible) l.style.display = "none";
		}
		else if(itemNode.tagName == "separator")
		{
			menu.createHR();
		}
	}
}

proto._getID = function(node)
{
	var id = String(node.getAttribute("id"));
	if(!id)
	{
		alert("Error: id required but not specified in data section.");
		return null;
	}
	return id;
}

proto._getElement = function(parentElement, id)
{
	if (parentElement == null || parentElement.children == null) return;	
	
	var l = parentElement.children[id];
	if(!l) 
	{
		//alert("Can't get element " + id + " to bind data to.");
		return null;
	}

	if(l.length) 
	{
		alert("Id conflict: " + id);
		//Util.showCaller(this, this._getElement.caller)
		return null;
	}
	
	return l;
}

proto._setCommonProperties = function(l, node, setDisplay)
{
	// Always set common properties.
	var visible = node.getAttribute("visible");
	
	var requiredIcon = this._requiredIcons[l.id];
	if(visible !== null) 
	{
		if(visible == "true")
		{
			l.style.visibility = "inherit";
			if(requiredIcon) requiredIcon.style.visibility = "inherit";
			if(setDisplay) l.style.display = 'block';
		}
		else
		{
			if(document.activeElement != null && l.contains(document.activeElement))
			{
				try
				{ 
					document.activeElement.blur(); 
				}
				catch(ex){}
			}
			l.style.visibility = "hidden";
			if(requiredIcon) requiredIcon.style.visibility = "hidden";
			if(setDisplay) l.style.display = 'none';
		}
	}

	var disabled = false;
	var attr = node.getAttribute("enabled");
	if(attr !== null) 
	{
		disabled = attr == "false";
		// Always store disabled in __disabled as we manipulate with disabled
		// and can reset just loaded disabled state.
		l.__disabled = disabled;

		if(l.isControl)
		{
			if(l.jsObject.set_disabled) l.jsObject.set_disabled(disabled);
			else l.disabled = disabled;
			
			if(requiredIcon) requiredIcon.style.visibility = disabled ? "hidden" : "inherit";
		}
	}
	else if(l.__disabled === null) l.__disabled = false;
}

proto._setNonInteractive = function(val)
{
	this.nonInteractive = val;
	if(this.nonInteractive)
	{
		this._showDisabler(true, true, true);
	}
	else
	{
		this._hideDisabler();
	}
}

proto._setControlsDisabledState = function(disabled, accountModalFocus, doNotSetCursor)
{
	if(!CNFormManager.themeLoaded || this._formDisabled == disabled || !this._formPlaceholder) return;

	if(disabled)
	{
		// Try to store active element.
		var l = document.activeElement;
		if(l != null && this._formPlaceholder.contains(l)) this._storedActiveElement = l;
		else this._storedActiveElement = null;
	}

	this._formDisabled = disabled;

	this._setControlsDisabledStateInternal(this._formPlaceholder, disabled, accountModalFocus);
	
	if(!disabled)
	{
		// Try to restore active element.
		if(this._storedActiveElement && this._storedActiveElement.parentElement
		&& this._storedActiveElement.currentStyle.display != 'none'
		&& this._storedActiveElement.currentStyle.visibility != 'hidden'
		&& !this._storedActiveElement.disabled
		&& !this._storedActiveElement.readOnly)  
		{
			var l = this._storedActiveElement;
			try
			{
				if(l.focus) l.focus(); 
				if(l.select) l.select();
			}
			catch(e){} // We can't detect is l actually visible now. Just eat exception.
			this._storedActiveElement = null;
		}
	}
}

proto._setControlsDisabledStateInternal = function(parentElement, disabled, accountModalFocus)
{
	var children = parentElement.children;
	var childCount = children.length;
	
	for(var i = 0; i < childCount; i++)
	{
		var l = children[i];
		if(l.isContainer)
		{
			this._setContainerDisabled(l, disabled, accountModalFocus);
			continue;
		}
		
		this._setControlDisabled(l, disabled, accountModalFocus);
	}
}

proto._setControlDisabled = function(l, disabled, accountModalFocus)
{
	if(!l.isControl || l.jsObject.doNotDisable
	|| accountModalFocus && l == this._modalFocusedElement) return;
	
	var value = this._getControlDisabledState(l, disabled);
	
	if(l.jsObject.set_disabled) l.jsObject.set_disabled(value);
	else l.disabled = value;
	
	var requiredIcon = this._requiredIcons[l.id];
	if(requiredIcon) 
	{
		requiredIcon.style.visibility = value || l.currentStyle.visibility == 'hidden' ? "hidden" : "inherit";
	}
}

proto._setContainerDisabled = function(container, disabled, accountModalFocus)
{
	if(container.__disabled) disabled = true;
	this._setControlsDisabledStateInternal(container.containerElement, disabled, accountModalFocus);
}

proto._getControlDisabledState = function(l, disabled)
{
	var value;
	if(disabled) value = disabled;
	else value = l.__disabled ? true : false;
	return value;
}

proto._validateLoading = function()
{
	if(this._formPlaceholder == null) return;
	var children = this._formPlaceholder.children;
	this._validateLoadingInternal(children);
}

proto._validateLoadingInternal = function(children)
{
	var childCount = children.length;
	
	for(var i = 0; i < childCount; i++)
	{
		var l = children[i];
		if(l.isContainer)
		{
			this._validateLoadingInternal(l.containerElement.children);
		}
		else if(l.isControl)
		{
			if(l.jsObject.validateLoading) l.jsObject.validateLoading();
		}
	}
}

proto.fail = function(str)
{
	alert("ERROR: " + str);
	this._failed = true;
	this._halt = true;
}

proto._createDisabler = function()
{
	return document.createElement('<div style="position: absolute; top: 0px; left: 0px; width: 100%; height: 100%; background: white; z-index: 10000; filter: alpha(opacity=50); ">');
}

proto._handleLoadFailed = function()
{
	this._setControlsDisabledState(true);

	// Disable everything.
	if(this._halt) this._showDisabler(true, false);
}

// If invalidIDAr != null, all invalid ids will be collected there
proto._checkAreElementsValid = function(parent, invalidControlsAr) 
{
	var children = parent ? parent.children : this._formPlaceholder.children;
	var childCount = children.length;
	for(var i = 0; i < childCount; i++)
	{
		var l = children[i];
		if(l.isContainer) 
		{
			this._checkAreElementsValid(l.containerElement, invalidControlsAr);
			continue;
		}
		
		if(!l.isControl) continue;
		
		var jso = l.jsObject;

		// NOTE: checks even hidden controls.
		if(jso.isValid && !jso.isValid())
		{
			// Deny postback.
			// Reset current navigation node.
			//if(this._navigation) this._navigation.selectFormNode(this._currentFormID);
			//if(!l.jsObject.doNotShowErrorMessage) 
			//{
			//	if(l.jsObject.validationString) alert(l.jsObject.validationString);
			//	else alert(l.id + " is invalid.");
			//}

			//return false;
			
			invalidControlsAr.push(jso);
		}
	}
//	return true;
}

proto.postData = function(postbackElement)
{
	if(this._isPostingBack || this._waitingForButtonPostback) return false;
	this._isPostingBack = true;
	
	var isAutoLockPostBack = this._postbackElement == "<autoLock/>";
	if (!this._heartBeatShutDown && !isAutoLockPostBack && !this._autoLockPostData)	this._resetHeartBeat();	
	//if (!this._heartBeatPostData)
		//this._resetHeartBeat();	
	
	var validate = true;
	if(postbackElement && postbackElement.jsObject && postbackElement.jsObject.validator === false) 
	{
		validate = false;
	}
	
	var invalidControlsAr = [];
	this._checkAreElementsValid(null, invalidControlsAr);

	if(validate && invalidControlsAr.length > 0)
	{
		this._flashInvalidControl(invalidControlsAr[0]); // Report only first control.
		this._isPostingBack = false;
		this._postbackElement = null;
		return false;
	}
	else if(!validate)
	{
		this._resetInvalidControls();
		if(invalidControlsAr.length > 0) this._invalidControlsAr = invalidControlsAr;
	}

	this._setNonInteractive(true);

	this._postbackElement = postbackElement;
	//setTimeout("CNFormManager.getActiveFormManager()._continuePostData()", 0);
	
	var fm = this;
	
	if (typeof(this._postbackElement) == "string" && this._postbackElement.indexOf("scannedImage") !== -1)
	{
		this._continuePostData();
		return true;
	}

	setTimeout(function(){ fm._continuePostData()}, 0);
	
	return true;
}

proto._flashInvalidControl = function(jso) {
	if(this._navigation) this._navigation.selectFormNode(this._currentFormID);
	if(!jso.doNotShowErrorMessage) 
	{
		if(jso.validationString) alert(jso.validationString);
		else alert(jso.element.id + " is invalid.");
	}
}

proto._resetInvalidControls = function(parent)
{
	var children = parent ? parent.children : this._formPlaceholder.children;
	var childCount = children.length;
	for(var i = 0; i < childCount; i++)
	{
		var l = children[i];
		if(l.isContainer) 
		{
			this._resetInvalidControls(l.containerElement);
			continue;
		}
		
		if(!l.isControl) continue;
		var jso = l.jsObject;

		// NOTE: checks even hidden controls.
		if(jso.resetValue && jso.isValid && !jso.isValid())
		{
			jso.resetValue();
		}
	}
}


proto.lightPostData = function(xmlStr) {
	if(this._isPostingBack || this._waitingForButtonPostback) return false;
	this._isPostingBack = true;
	
	var xmldoc = new ActiveXObject("Microsoft.XMLDOM");
	xmldoc.loadXML(xmlStr);
	var pi = xmldoc.createProcessingInstruction("xml", "version=\"1.0\" encoding=\"" + this.xmlEncoding + "\"");
	xmldoc.insertBefore(pi, xmldoc.documentElement);
	var ev = xmldoc.createElement("events");
	ev.setAttribute("lightweight", "true");
	ev.appendChild(xmldoc.documentElement);
	xmldoc.appendChild(ev);

	this.loadForm(xmldoc, "_finishPostData"); // Called immediately.
}

proto._continuePostData = function()
{
	var xmldoc = new ActiveXObject("Microsoft.XMLDOM");	
	var pi = xmldoc.createProcessingInstruction("xml", "version=\"1.0\" encoding=\"" + this.xmlEncoding + "\"");
	xmldoc.appendChild(pi);

	var dataNode = xmldoc.createElement("events");
	xmldoc.appendChild(dataNode);
	
	var isTabChange = this._postbackElement == "tabchanged";

	var autoPostBackGroup = this._storeTabChanges(xmldoc, dataNode, isTabChange);
	
	var stringPostback = typeof(this._postbackElement) == "string";
	
	this.initiateUpload = !stringPostback && this._postbackElement.jsObject.initiateUpload;

	//Hearbeat called postbak?
	var isEmptyHeartBeat = this._postbackElement == "<empty/>";
	var isAutoLockPostBack = this._postbackElement == "<autoLock/>";

	if (!isEmptyHeartBeat)
	{	
		this._postElementsData(xmldoc, dataNode, this._formPlaceholder.children);
		this._postInvalidControls(xmldoc, dataNode);
	}

	for(var id in this._toggledCollapsableContainers)
	{
		var cont = this._toggledCollapsableContainers[id];
		var contNode = xmldoc.createElement("collapsablecontainer");
		contNode.setAttribute("id", cont.id);
		contNode.setAttribute("collapsed", cont._collapsed ? "true" : "false");
		dataNode.appendChild(contNode);		
	}
	this._toggledCollapsableContainers = [];

	if(this._navigation) {
		var node = this._navigation.storeData(xmldoc);
		if(node) dataNode.appendChild(node);
	}

	if(stringPostback)
	{
		if(this._postbackElement.length > 0 && this._postbackElement.charAt(0) == '<' && !isEmptyHeartBeat)
		{
			// Raw xml.
			var tempdoc = new ActiveXObject("Microsoft.XMLDOM");
			tempdoc.loadXML(this._postbackElement);
			dataNode.appendChild(tempdoc.documentElement);
		}
		// Predefined events.
		else if(this._postbackElement == "topbutton")
		{
			var tag = "topbutton";
			if(this._topButtonAction) tag = this._topButtonAction;
			var buttonNode = xmldoc.createElement(tag);
			if(this._topButtonID) buttonNode.setAttribute("id", this._topButtonID);
			dataNode.appendChild(buttonNode);
			this._topButtonID = null;
			this._topButtonAction = null;
		}
		else if(this._postbackElement == "menu")
		{
			var menuClickNode = xmldoc.createElement("menuclick");
			menuClickNode.setAttribute("menuID", this._currentMenuID);
			menuClickNode.setAttribute("menuItemID", this._currentMenuItemID);
			menuClickNode.setAttribute("controlID", this._currentContextID);
			dataNode.appendChild(menuClickNode);
		}
		else if(this._postbackElement == "tabchanged")
		{
			if(autoPostBackGroup) this._storeTabChange(xmldoc, dataNode, autoPostBackGroup);
		}
	}
	// Control events.
	else if(this._postbackElement && (!this._navigation || this._postbackElement != this._navigation.element)) 
	{
		this._storeData(this._postbackElement, xmldoc, dataNode);

		if(this.initiateUpload)
		{
			// Ask uploadbox to upload data.
			this._postXmlDoc = xmldoc;
			CN_uploadbox.handleUpload(this, xmldoc, "_uploadCallback");	// Called via callback.
			return;
		}
	}
	
	//If postbak was called by heartbeat  -> don't reset heartBeatCounter		
	if(isEmptyHeartBeat)
	{
		var tempdoc = new ActiveXObject("Microsoft.XMLDOM");
		tempdoc.loadXML(this._postbackElement);
		dataNode.appendChild(tempdoc.documentElement);
	}
	// Postback was called by other controls not heartbeat -> reset heartBeatCounter
	else
	{
	
		var heartBeatNode = xmldoc.createElement("empty");
		if(isAutoLockPostBack)
		{			
			heartBeatNode.setAttribute("autolock", "true");
		}
		heartBeatNode.setAttribute("reset", "true");
		dataNode.appendChild(heartBeatNode);
	}
	
	if(this.isAttach) {
		dataNode.setAttribute("forAttachedForm", this._attachAsFormToTag);
		this._parentFormManager.postData(dataNode.xml);
	} else {
		this.loadForm(xmldoc, "_finishPostData"); // Called immediately.
	}
}
proto._uploadCallback = function()
{
	var xmldoc = this._postXmlDoc;
	this._postXmlDoc = null;
	this.loadForm(xmldoc, "_finishPostData");
}

proto._postInvalidControls = function(xmldoc, dataNode) {
	if(this._invalidControlsAr != null && this._invalidControlsAr.length > 0) {
		for(var i = 0; i < this._invalidControlsAr.length; i++) {
			var node = xmldoc.createElement("invalidControl");
			node.setAttribute("id", this._invalidControlsAr[i].element.id);
			dataNode.appendChild(node);
		}
	}

	this._invalidControlsAr = null;
}

proto._storeTabChanges = function(xmldoc, dataNode, skipAutoPostBack)
{
	var autoPostBackGroup = null;
	// Handle tabbed containers.
	for(var groupID in this._tabbedGroups)
	{
		var group = this._tabbedGroups[groupID];
		var table =  group.selectedTabButtonTable;
		if(group.isDirty && table)
		{
			if(table._autoPostBack && skipAutoPostBack) 
			{
				autoPostBackGroup = group;
				continue;
			}
			this._storeTabChange(xmldoc, dataNode, group)
		}
	}
	return autoPostBackGroup;
}

proto._storeTabChange = function(xmldoc, dataNode, group)
{
	var table =  group.selectedTabButtonTable;
	var node = xmldoc.createElement("containertabselected");
	node.setAttribute("groupID", String(group.groupID));
	node.setAttribute("containerID", String(table.id));
	dataNode.appendChild(node);
	group.isDirty = false;
}

proto._postElementsData = function(xmldoc, dataNode, children)
{
	var childCount = children.length;
	for(var i = 0; i < childCount; i++)
	{
		var l = children[i];
		if(l.isContainer)
		{
			this._postElementsData(xmldoc, dataNode, l.containerElement.children);
			continue;
		}

		if(!l.isControl || l == this._postbackElement) continue;
		this._storeData(l, xmldoc, dataNode);
	}
}

proto._finishPostData = function()
{
	if(!this._isPostingBack) return;
	
	if(!this._failed && !this._dialogPending && !this._messagesPending) 
	{
		this._setNonInteractive(false);
		//if(this.isDialog) alert("set interactive " + this._currentFormID)
	}

	this._isPostingBack = false;
	this._postbackElement = null;

	if(this._pendingContextMenuData)
	{
		Tooltip.hide();
		this._showContextMenu(this._pendingContextMenuData);
		this._pendingContextMenuData = null;
		this.contextMenuPending = false;
	}
	
	this._finishAttachedPostData();
}
proto._finishAttachedPostData = function() {
	for(var tag in this._attachedFormManagers) this._attachedFormManagers[tag]._finishPostData();
}

proto._storeData = function(l, xmldoc, dataNode)
{
	var jsObject = l.jsObject;
	if(!jsObject.storeData) return;
	
	var node = jsObject.storeData(xmldoc);
	if(node)
	{
		var id = l.id;
		if(id) 
		{
			// XMLElement.
			if(node.nodeType == 1 && !node.getAttribute("id")) node.setAttribute("id", id);
			// XMLDocumentFragment.
			else if(node.nodeType == 11)
			{
				var nodes = node.selectNodes("*");
				var nodeCount = nodes.length;
				for(var i = 0; i < nodeCount; i++) nodes[i].setAttribute("id", id);
			}
		}
		dataNode.appendChild(node);			
	}
}

proto._testForXMLDialog = function()
{
	if(this._ideaNode.selectSingleNode("dialog")) this._dialogPending = true;
}

proto._processServerError = function(errorNode)
{
	this._shutDownTimers();	
	
	if(this.isDialog) 
	{
		this._setDialogResult(false);
		this._closeDialog(true);
	}

	var result = true;
	var attr = errorNode.getAttribute("id");
	if(attr)
	{
		var id = String(attr);
		switch(id)
		{
			case "0":
				result = false;
				// NOTE: reset load state.
				this._endProgress();
				this._setNonInteractive(false);
				this._loading = false;
				this._isPostingBack = false;
				break;
	
			case "1":
			case "2":
				this._failed = true;
				this._halt = true;
				break;
				
			case "3":
				this._failed = true;
				break;				
		}
	}
	if(errorNode.text) alert(errorNode.text);
	return result;
}

proto._processServerErrors = function(errorsNode)
{
	this._shutDownTimers();	
	
	var title = String(errorsNode.getAttribute("title"));
	var errors = errorsNode.selectNodes("error");

	if(CNFormManager.themeLoaded)
	{
		this._setControlsDisabledState(true);
		this._navigationDisabled = true;
		this._showErrorsDialog(title, errors, [this, "_finishProcessServerErrors"]);
	}
	else
	{
		Util.assert("got <errors>, but no theme loaded.");
	}

	return false;
}

proto._processFatalServerError = function(errorNode)
{
	this._shutDownTimers();	
		
	var title = String(errorNode.getAttribute("title"));
	var msg = "";
	var buildInfo = "";
	var stackTrace = "";
	
	if(errorNode.getAttribute("suspend") == "true")
	{
		this._failed = true;
		this._halt = true;
	}

	var msgNode = errorNode.selectSingleNode("msg");
	if(msgNode) msg = msgNode.text;
	var buildInfoNode = errorNode.selectSingleNode("buildinfo");
	if(buildInfoNode) buildInfo = buildInfoNode.text;
	var stackTraceNode = errorNode.selectSingleNode("stacktrace");
	if(stackTraceNode) stackTrace = stackTraceNode.text;
	
	if(CNFormManager.themeLoaded)
	{
		this._setControlsDisabledState(true);
		var fm = CNFormManager.getBaseFormManager();
		
		fm._navigationDisabled = true;
		fm._showFatalErrorDialog(title, msg, buildInfo, stackTrace, this._halt ? null : [this, "_finishProcessServerErrors"]);
	}
	else
	{
		Util.assert("got <fatalerror>, but no theme loaded.\n\n" + title + 
				"\n" + msgNode + "\n" + buildInfo + "\n" + stackTrace);
	}

	return false;
}

proto._finishProcessServerErrors = function()
{
    this._navigationDisabled = false;
	this._setControlsDisabledState(false);
	this._loading = false;
	this._isPostingBack = false;
}

proto._executeXMLDialog = function()
{
	var node = this._dialogNode;
	if(!node) return;
	this._dialogNode = null;
	
	var urlAttr = node.getAttribute("url");
	if(!urlAttr) return;
	
	this._suspendTimers();

	var form = null;
	var idAttr = node.getAttribute("id");
	if(idAttr) form = "<events><navigation form=\"" + String(idAttr) + "\"/></events>"
	
	this._idAttr = idAttr;
	this._toDialogOpenState();

	var resizable = node.getAttribute("resizable") == "true";
	var dialogFM = new CNFormManager(false, CNFormManager.MODE_DIALOG, this);
	dialogFM.delayedControlsCreation = this.delayedControlsCreation;
	dialogFM._initFromNode(node, resizable);

	dialogFM.debug = this.debug;
	CNFormManager.formManagers.push(dialogFM);
	
	dialogFM.sourceUrl = String(urlAttr);
	dialogFM.loadForm(form);
}

proto._initFromNode = function(node, resizable)
{
	var width = 800;
	var widthAttr = node.getAttribute("width");
	if(widthAttr) width = parseInt(widthAttr, 10);

	var height = 600;
	var heightAttr = node.getAttribute("height");
	if(heightAttr) height = parseInt(heightAttr, 10);

	var createBG = node.getAttribute("background") != "false";
	var formHeader = node.getAttribute("formHeader") == "true";
	this._createDialogWindow(createBG, width, height, resizable, formHeader);
	if(formHeader) {
		this._cloneAlertsToDialog();
	}

	var closeButton = node.getAttribute("closeButton") != "false";
	if(createBG)
	{
		if(resizable)
		{
			this._resizable = resizable;
			this._layoutManager = new LayoutManager(this._formPlaceholder, width, height);
		}
		else if(!CNFormManager.vista)
		{
			var but = this._dialogDiv.all["__dialogMaxButton"];	
			but.style.display = "none";
		}
	}
		
	if(!closeButton)	
	{
		var but;
		if(CNFormManager.vista) but = CNDialogManager.getCloseButton(this._dialogDiv);
		else but = this._dialogDiv.all["__dialogCloseButton"];

		if(but) 
		{
			if(createBG && resizable)
			{
				but._disabled = true;
				but.style.filter = "alpha(opacity=50)";
			}
			else
			{
				but.style.display = 'none'; // Hide close for non-resizible dialogs.
			}
		}
	}
}
proto._cloneAlertsToDialog = function() {
	this._alertIcons = CNFormManager.getBaseFormManager()._alertIcons.cloneToDialogHeader(this._formHeader);
	this._alertIcons.element.style.display = "block";
	this._alertIcons.formManager = this;
}

proto._createDialogWindow = function(createBG, dialogWidth, dialogHeight, resizable, formHeader)
{
	if(createBG)
	{
		if(CNFormManager.vista)
		{
			var formHeaderHeight = formHeader ? 34 : 0;
			this._dialogDiv = CNDialogManager.createVistaDialog(null, resizable);
			this._dialogDiv.style.width = dialogWidth + 32 + "px";
			this._dialogDiv.style.height = dialogHeight + 51 + formHeaderHeight + "px";
			this._formPlaceholder = CNDialogManager.getContents(this._dialogDiv);
			
			var header = $('__si_darkHeader').cloneNode(true);
			header.id = "";
			header.style.left = 0;
			header.style.top = 0;
			header.style.width = "100%";
			header.style.display = "block";
			header.style.visibility = "hidden";
			
			this._formPlaceholder.appendChild(header);
			this._darkHeader = header;			
			
			if(formHeader) {
				this._createVistaFormHeader();
			}
			
			CNDialogManager.getBottom(this._dialogDiv).style.display = "none";
			CNDialogManager.showDialog(this._dialogDiv, [this, "_dialog_closeButton_onclick"], 
				true, false, [this, "_dialog_toggleMaximize"]);
			this._dialogDiv.style.visibility = "hidden";
		}
		else
		{
			var formHeaderHeight = formHeader ? 34 : 0;
			// + 11 = dialog caption img.
			this._dialogDiv = this._createAndShowDialogDiv(dialogWidth + 30, dialogHeight + 63 + 11 + formHeaderHeight, resizable, formHeader);
			this._formPlaceholder = this._dialogDiv.all["formPlaceholder1"];
		}
		this._dialogDiv._hasBackground = true;
	}
	else
	{
		this._formPlaceholder = this._dialogDiv = this._createAndShowSimpleDialogDiv(dialogWidth, dialogHeight);
		this._formPlaceholder.style.zIndex = top.__ontopZ++;
	}
		
	this._dialogNotShownYet = true;
	this._formPlaceholder.attachEvent("onkeypress", this._formPlaceholder_onkeypress); // Default button.
	this._dialogDiv.attachEvent("onbeforedeactivate", this._dialog_formPlaceholder_onbeforedeactivate);	

	this._dialogDiv.appendChild(this._disabler);
}
proto._createVistaFormHeader = function() {
	var div = document.createElement("div");
	div.className = "dialogFormHeader";

	var div2 = document.createElement("div");
	div2.className = "dialogFormHeader2";
	div.appendChild(div2);

	var div3 = this._dialogFormHeaderTextCont = document.createElement("div");
	div3.className = "dialogFormHeader3";
	div2.appendChild(div3);

	var contOuter = this._formPlaceholder.parentNode.parentNode;
	contOuter.style.paddingTop = "60px";
	contOuter.insertBefore(div, contOuter.lastChild);

	this._formHeader = div2;
}

proto._dialog_toggleMaximize = function(dialog, maximize)
{
	this._layoutManager.doLayout();
	this._layoutManager.setHandleResizes(maximize); // Don't process resizes in initial state.
}

proto._toDialogOpenState = function()
{
	this._setControlsDisabledState(true);
	this._showDisabler(false, true);
}

proto._closeDialog = function(doNotSendEvent)
{
	this.destroyDialog();
	this._parentFormManager.proceedChildDialogClosed(this, doNotSendEvent);
}

proto.destroyDialog = function()
{
	if(!this._dialogDiv) Util.assert("destroyDialog() - !this._dialogDiv");
	this._formPlaceholder.detachEvent("onkeypress", this._formPlaceholder_onkeypress);
	this._dialogDiv.detachEvent("onbeforedeactivate", this._dialog_formPlaceholder_onbeforedeactivate);	
	CNDialogManager.hidePopup(this._dialogDiv, null, true);


	this.destroy();

	//if(this._dialogDiv.shadow) this._dialogDiv.shadow.destroy();
	/*if(CNFormManager.vista && Util.IE7 && this._dialogDiv.filters.length > 0)
	{
		var f = this._dialogDiv.filters['progid:DXImageTransform.Microsoft.Fade'];
		if(f) this._dialogDiv.attachEvent("onfilterchange", this._dialogDiv_onfilterchange);
		return;
	}

	this._dialogDiv.removeNode(true);*/
	if(this._dialogDiv._hasBackground) CNDialogManager.destroyDialog(this._dialogDiv);
	else this._dialogDiv.parentNode.removeChild(this._dialogDiv);
	this._dialogDiv = null;
}

proto._dialogDiv_onfilterchange = function()
{
	var dialogDiv = event.srcElement;
	dialogDiv.removeNode(true);
}

proto.proceedChildDialogClosed = function(childFM, doNotSendEvent)
{
	this._hideDisabler();

	CNFormManager.removeFromCollection(childFM);

	if(!doNotSendEvent) {

		var result = childFM._dialogReturnValue;
		if(result.gotError)
		{
			// Dialog got error.
			this._processServerError();
			return;
		}

		var idAttr = this._idAttr;
		this._idAttr = null;

		var byServer = String(result.closedByServer).toLowerCase();
		var idStr = "";
		if(idAttr) idStr = 'id="' + String(idAttr) + '" ';

		this._dialogPending = false;

		this._formDisabled = false;

		this._setControlsDisabledState(true);
		this.loadForm('<events><dialogWasClosed ' + idStr + 'byServer="' + byServer + '"/></events>', "_finishXMLDialog");
	} else {
		this._finishXMLDialog();
	}
}

proto._finishXMLDialog = function()
{
	var self = this;
//	setTimeout(function() {
//		if(!self._formPlaceholder) return; // FM was already deleted (dialog force closed).
		self._setControlsDisabledState(false);
		self._finishPostData(); // Call this for "parent" dialog too.
		self._resumeTimers();		
//	}, 50); // Timeout for vml round buttons, which doesn't redraw itself if set_disable is called too fast after screen item reshow (e.g. after lock).
}

proto._createAndShowSimpleDialogDiv = function(width, height)
{
	var formPlaceholder1 = document.createElement('<div style="position: absolute; overflow: auto; ">');
	formPlaceholder1.style.height = height;
	formPlaceholder1.style.width = width;
	document.body.appendChild(formPlaceholder1);

	formPlaceholder1.style.top = (document.body.clientHeight - formPlaceholder1.offsetHeight) / 2;
	formPlaceholder1.style.left = (document.body.clientWidth - formPlaceholder1.offsetWidth) / 2;
	return formPlaceholder1;
}

proto._createAndShowDialogDiv = function(width, height, resizable, formHeader)
{
	var div = document.createElement("<div class=cnFormDialogDiv style='border: 1px solid #8F929E; visibility: hidden; '>");
	document.body.appendChild(div);

	div.style.position = "absolute";
	div.style.width = width;
	div.style.height = height;
	div.style.zIndex = top.__ontopZ++;
	div.style.top = (document.body.clientHeight - div.offsetHeight) / 2;
	div.style.left = (document.body.clientWidth - div.offsetWidth) / 2;

	var table = document.createElement('<table width=100% height=100% border=0 cellpadding=0 cellspacing=0>');
	div.appendChild(table);
	var tbody = document.createElement('tbody');
	table.appendChild(tbody);
	var tr = document.createElement('<tr>');
	tbody.appendChild(tr);
	var td = document.createElement('<td height=42>');
	tr.appendChild(td);

	var table2 = document.createElement('<table width=100% border=0 cellpadding=3 cellspacing=0>');
	td.appendChild(table2);
	var tbody2 = document.createElement('tbody');
	table2.appendChild(tbody2);
	var tr2 = document.createElement('tr');
	tbody2.appendChild(tr2);
	var td2 = document.createElement('<td width=2>');
	tr2.appendChild(td2);
	var captionTD = document.createElement('<td height=42 style="cursor: default; ">');
	tr2.appendChild(captionTD);
	var formCaption1 = document.createElement('<h1 id=formCaption1>');
	captionTD.appendChild(formCaption1);
	var td3 = document.createElement("<td width=16 unselectable=on style='position: relative; '>");
	tr2.appendChild(td3);

	var dialogCloseButton = document.createElement("<span id=__dialogCloseButton class='dialogTopButton dialogCloseButton' unselectable=on>");
	td3.appendChild(dialogCloseButton);
	var span = document.createElement('<span unselectable=on>');
	dialogCloseButton.appendChild(span);
	span.innerText = 'r';
	
	var maxButton = document.createElement("<span id=__dialogMaxButton class='dialogTopButton dialogMaxButton' unselectable=on>");
	td3.appendChild(maxButton);
	var span = document.createElement('<span unselectable=on>');
	maxButton.appendChild(span);
	span.innerText = '1';

	var tr12 = document.createElement('tr');
	tbody.appendChild(tr12);
	var td3 = document.createElement('<td valign=top height=100% style="padding: 0px; padding-top: 0px; ">');
	tr12.appendChild(td3);
	
	var table3 = document.createElement('<table width=100% height=100% border=0 cellpadding=0 cellspacing=0>');
	td3.appendChild(table3);
	var tbody3 = document.createElement('tbody');
	table3.appendChild(tbody3);
	var tr31 = document.createElement('tr');
	tbody3.appendChild(tr31);
	var td4 = document.createElement('<td width=12>');
	tr31.appendChild(td4);
	var _img1 = document.createElement('<img width=12 height=12>');
	td4.appendChild(_img1);
	var _td1 = document.createElement('<td width=100%>');
	tr31.appendChild(_td1);
	var td5 = document.createElement('<td width=12>');
	tr31.appendChild(td5);
	var _img2 = document.createElement('<img width=12 height=12>');
	td5.appendChild(_img2);
	var tr32 = document.createElement('tr');
	tbody3.appendChild(tr32);
	var _td2 = document.createElement('td');
	tr32.appendChild(_td2);
	var td6 = document.createElement('<td bgcolor=white valign=top height=100% width=100% style="position: relative; ">');
	tr32.appendChild(td6);
	
	if(formHeader) {
		var blueFormHeader = document.getElementById("__si_formHeaderBG");
		var formHeaderBG = blueFormHeader.cloneNode(true);
		formHeaderBG.style.width = "100%";
		formHeaderBG.style.position = "static";
		formHeaderBG.id = "";
		formHeaderBG.style.display = "block";

		var formHeaderDiv = this._formHeader = document.createElement("div");
		formHeaderDiv.className = "dialogFormHeaderDiv";
		formHeaderDiv.appendChild(formHeaderBG);
		
		var textCont = this._dialogFormHeaderTextCont = document.createElement("div");
		textCont.className = "dialogFormHeaderTextCont";
		formHeaderDiv.appendChild(textCont);
	
		td6.appendChild(formHeaderDiv);
	}
	
	var darkHeader1 = document.createElement('<div style="position: absolute; left: -9px; top: -11px; padding-right: 0px;\
		right: -9px; height: 200px; visibility: inherit; padding-bottom: 2px; ">');
	td6.appendChild(darkHeader1);
	this._darkHeader = darkHeader1;
	
	var FORM_HEADER_HEIGHT = 22;
	if(formHeader) darkHeader1.style.top = -9 + FORM_HEADER_HEIGHT + "px"; // 22 - blue dialog formHeader extra height.
	
	var table4 = document.createElement('<table width=100% height=100% border="0" cellpadding="0" cellspacing="0">');
	darkHeader1.appendChild(table4);
	var tbody4 = document.createElement('tbody');
	table4.appendChild(tbody4);

	var tr41 = document.createElement('tr');
	tbody4.appendChild(tr41);
	var td411 = document.createElement('<td>');
	tr41.appendChild(td411);
	var _img3 = document.createElement('<img width="12" height="14">');
	td411.appendChild(_img3);
	var _td3 = document.createElement('<td width="100%" height="14">');
	tr41.appendChild(_td3);
	var td412 = document.createElement('<td>');
	tr41.appendChild(td412);
	var _img4 = document.createElement('<img width="12" height="14">');
	td412.appendChild(_img4);
	
	var tr42 = document.createElement('tr');
	tbody4.appendChild(tr42);
	var _td4 = document.createElement('<td width="12" height="100%">');
	tr42.appendChild(_td4);
	var _td5 = document.createElement('<td width="100%" height="100%">');
	tr42.appendChild(_td5);
	var _td6 = document.createElement('<td width="12" height="100%">');
	tr42.appendChild(_td6);
	
	var tr43 = document.createElement('tr');
	tbody4.appendChild(tr43);
	var td431 = document.createElement('td');
	tr43.appendChild(td431);
	var _img5 = document.createElement('<img width="12" height="13">');
	td431.appendChild(_img5);
	var _td7 = document.createElement('<td width="100%" height="13">');
	tr43.appendChild(_td7);
	var td432 = document.createElement('td');
	tr43.appendChild(td432);
	var _img6 = document.createElement('<img width="12" height="13">');
	td432.appendChild(_img6);

	var formPlaceholder1 = document.createElement('<div id="formPlaceholder1" style="position: relative; overflow: auto; ">');
	td6.className = "dialogContentTD";
	td6.appendChild(formPlaceholder1);	
	//formPlaceholder1.style.height = height - 70;
	//formPlaceholder1.style.width = width - 26;
	formPlaceholder1.style.height = "100%";
	if(formHeader) {
		formPlaceholder1.style.top = formPlaceholder1.offsetTop +  FORM_HEADER_HEIGHT - 4 + "px";
		td6.style.paddingBottom = "12px";
	}
	//formPlaceholder1.style.width = width - 26;
	var _td8 = document.createElement('td');
	tr32.appendChild(_td8);
	
	var tr33 = document.createElement('tr');
	tbody3.appendChild(tr33);
	var td331 = document.createElement('td');
	tr33.appendChild(td331);
	var _img7 = document.createElement('<img width=12 height=14>');
	td331.appendChild(_img7);
	var _td9 = document.createElement('td');
	tr33.appendChild(_td9);
	var td332 = document.createElement('td');
	tr33.appendChild(td332);
	var _img8 = document.createElement('<img width=12 height=14>');
	td332.appendChild(_img8);

	new Shadow(div, false, false);

	_img1.src = CNFormManager.themeImagesPath + "bg-1-2r_01.gif";
	_img2.src = CNFormManager.themeImagesPath + "bg-1-2r_03.gif";
	_img3.src = CNFormManager.themeImagesPath + "darkHeader-2_01.gif";
	_img4.src = CNFormManager.themeImagesPath + "darkHeader-2_03.gif";
	_img5.src = CNFormManager.themeImagesPath + "darkHeader-2_07.gif";
	_img6.src = CNFormManager.themeImagesPath + "darkHeader-2_09.gif";
	_img7.src = CNFormManager.themeImagesPath + "bg-1-2r_07.gif";
	_img8.src = CNFormManager.themeImagesPath + "bg-1-2r_09.gif";
	_td1.style.background = "url(" +CNFormManager.themeImagesPath + "bg-1-2r_02.gif)";
	_td2.style.background = "url(" +CNFormManager.themeImagesPath + "bg-1-2r_04.gif)";
	_td3.style.background = "url(" +CNFormManager.themeImagesPath + "darkHeader-2_02.gif)";
	_td4.style.background = "url(" +CNFormManager.themeImagesPath + "darkHeader-2_04.gif)";
	_td5.style.background = "url(" +CNFormManager.themeImagesPath + "darkHeader-2_05.gif)";
	_td6.style.background = "url(" +CNFormManager.themeImagesPath + "darkHeader-2_06.gif)";
	_td7.style.background = "url(" +CNFormManager.themeImagesPath + "darkHeader-2_08.gif)";
	_td8.style.background = "url(" +CNFormManager.themeImagesPath + "bg-1-2r_06.gif)";
	_td9.style.background = "url(" +CNFormManager.themeImagesPath + "bg-1-2r_08.gif)";
	
	var closeButton = dialogCloseButton;
	closeButton.attachEvent("onmouseenter", this._dialog_closeButton_onmouseenter);
	closeButton.attachEvent("onmouseleave", this._dialog_closeButton_onmouseleave);
	closeButton.attachEvent("onclick", this._dialog_closeButton_onclick);
	
	maxButton.attachEvent("onmouseenter", this._dialog_closeButton_onmouseenter);
	maxButton.attachEvent("onmouseleave", this._dialog_closeButton_onmouseleave);
	maxButton.attachEvent("onclick", this._dialog_maxButton_onclick);

	captionTD.attachEvent("onmousedown", this._dialog_captionTD_onmousedown)
	captionTD.attachEvent("onselectstart", CNUtil.cancelEvent);
	captionTD.attachEvent("onselect", CNUtil.cancelEvent);
	captionTD.attachEvent("dragstart", CNUtil.cancelEvent);
	
	return div;
}

proto._dialog_closeButton_onmouseenter = function()
{
	var l = event.srcElement;
	if(l._disabled) return;
	l.className += " dialogTopButtonHover";
}
proto._dialog_closeButton_onmouseleave = function()
{
	var l = event.srcElement;
	if(l._disabled) return;
	Util.removeClass(l, "dialogTopButtonHover");
}
proto._dialog_closeButton_onclick = function()
{
	var l = Util.findByClassName(event.srcElement, "dialogTopButton");
	if(l._disabled) return;
	CNFormManager.getActiveFormManager().dialog_closeButton_onclick();
}
proto.dialog_closeButton_onclick = function()
{
	this._setDialogResult(false);
	this._closeDialog();
} 
proto._dialog_maxButton_onclick = function()
{
	var fm = CNFormManager.getActiveFormManager();
	fm.toggleDialogMaximize();
}

proto.toggleDialogMaximize = function()
{
	this._dialogDiv._maximized ? this.restoreDialog() : this.maximizeDialog();
	this._dialog_toggleMaximize(this._dialogDiv, this._dialogDiv._maximized);
}
proto.maximizeDialog = function()
{
	var maxButton = this._dialogDiv.all["__dialogMaxButton"];
	maxButton.firstChild.innerText = "2";
	var dialog = this._dialogDiv;
	dialog._maximized = true;
	dialog._storedBounds = {x: dialog.offsetLeft, y: dialog.offsetTop, w: dialog.offsetWidth, h: dialog.offsetHeight };
	dialog.style.width = "100%";
	dialog.style.height = "100%";
	dialog.style.left = 0;
	dialog.style.top = 0;
	
	if(dialog.shadow) dialog.shadow.hide();
}
proto.restoreDialog = function()
{
	var maxButton = this._dialogDiv.all["__dialogMaxButton"];
	maxButton.firstChild.innerText = "1";
	var dialog = this._dialogDiv;
	dialog._maximized = false;
	var b = dialog._storedBounds;
	dialog.style.left = b.x;
	dialog.style.top = b.y;
	dialog.style.width = b.w;
	dialog.style.height = b.h;

	if(dialog.shadow) dialog.shadow.show();
}

proto._dialog_captionTD_onmousedown = function()
{
	var td = CNUtil.findTag(event.srcElement, "TD");
	if(!td) return;
	var cnDialogDiv = CNUtil.findByClassName(td, "cnFormDialogDiv");
	if(cnDialogDiv._maximized) return;
	
	var formManager = CNFormManager.getActiveFormManager();

	td.attachEvent("onmousemove", formManager._dialog_captionTD_onmousemove);
	td.attachEvent("onmouseup", formManager._dialog_captionTD_onmouseup);
	td.attachEvent("onlosecapture", formManager._dialog_captionTD_onlosecapture);
	
	CNFormManager._draggedDialog = {dialog: cnDialogDiv, td: td};
	
	CNFormManager._startX = cnDialogDiv.offsetLeft - event.screenX;
	CNFormManager._startY = cnDialogDiv.offsetTop - event.screenY;
	td.setCapture();
}

proto._dialog_captionTD_onmousemove = function()
{
	var cnDialogDiv = CNFormManager._draggedDialog.dialog;
	
	cnDialogDiv.style.pixelLeft = CNFormManager._startX + event.screenX;
	cnDialogDiv.style.pixelTop = CNFormManager._startY + event.screenY;
	
	cnDialogDiv.shadow.syncPosition();
}

proto._dialog_captionTD_onmouseup = function()
{
	if(CNFormManager._draggedDialog) CNFormManager._draggedDialog.td.releaseCapture();
}

proto._dialog_captionTD_onlosecapture = function()
{
	if(!CNFormManager._draggedDialog) return;
	var td = CNFormManager._draggedDialog.td;
	var formManager = CNFormManager.getActiveFormManager();	

	td.detachEvent("onmousemove", formManager._dialog_captionTD_onmousemove);
	td.detachEvent("onmouseup", formManager._dialog_captionTD_onmouseup);
	td.detachEvent("onlosecapture", formManager._dialog_captionTD_onlosecapture);

	var cnDialogDiv = CNFormManager._draggedDialog.dialog;
	
	if(cnDialogDiv.style.pixelLeft < 0) cnDialogDiv.style.pixelLeft = 0;
	if(cnDialogDiv.style.pixelTop < 0) cnDialogDiv.style.pixelTop = 0;	


	CNFormManager._draggedDialogDiv = null;
}

proto._showDisabler = function(doBlock, hidden, waitCursor)
{
	if(!this._disabler) return;
	if(this.isDialog) {
		if(!this._dialogDiv) return;
		this._disabler.style.zIndex = this._dialogDiv.currentStyle.zIndex + 1;
	}
	this._disabler.style.cursor = waitCursor ? "wait" : "default";
	this._disabler.style.visibility = "inherit";
	this._disabler.style.display = "block";
	
	var baseFM = CNFormManager.getBaseFormManager();
	if(doBlock)
	{
		// Block everything.
		if(!baseFM._doBlock) document.body.attachEvent("onkeydown", CNUtil.cancelEvent);
	}
	else
	{
		if(baseFM._doBlock) document.body.detachEvent("onkeydown", CNUtil.cancelEvent);
	}
	baseFM._doBlock = doBlock;
}

proto._hideDisabler = function()
{
	var baseFM = CNFormManager.getBaseFormManager();
	if(baseFM._doBlock) 
	{
		document.body.detachEvent("onkeydown", CNUtil.cancelEvent);
		baseFM._doBlock = false;
	}
	this._disabler.style.cursor = "default";
	this._disabler.style.visibility = "hidden";
	this._disabler.style.display = "none";
}

proto.modalFocusElement = function(l)
{
	if(this._modalFocusedElement)
	{
		Util.assert("this._modalFocusedElement != null");
		return;
	}
	this._modalFocusedElement = l;
	this._modalFocused = true;
	
	this._setControlsDisabledState(true, true, true);
}


proto.modalBlurElement = function(probe)
{
	var l = this._modalFocusedElement;
	if(!l)
	{
		Util.assert("this._modalFocusedElement == null");
		return;
	}
	if(l != probe) Util.assert("l != probe");
	
	this._setControlsDisabledState(false, true, true);
	this._modalFocused = false;
	this._modalFocusedElement = null;
}

proto.topButtonClick = function(id, action, alwaysEnabled)
{
	if(this.isNavigationDisabled() && !alwaysEnabled || this._loading) return;
	
	if(event) CNUtil.cancelEvent();
	
	this._topButtonID = id;
	this._topButtonAction = action;
	this.postData("topbutton");
	this._suspendTimers();
}

/*
*/

proto._filterAttribute = function(str)
{
	return str.replace("\"", "&quot;").replace(">", "&gt;").replace("<", "&lt;");
}


proto._getStoredLocationsXML = function()
{
	try{ document.body.load("storedLocations"); } catch(e){}

	var xmldoc = document.body.XMLDocument;

	var rootEl = xmldoc.selectSingleNode("storedLocations");
	if(rootEl) rootEl = rootEl.cloneNode(true);
	return rootEl;
}

proto._getStoredLocationsXMLString = function()
{
	var rootEl = this._getStoredLocationsXML();
	if(rootEl) 
	{
		var xml = String(rootEl.xml);
		return xml;
	}
	return "";
}

proto._finishHideDisabler = function()
{
	this._hideDisabler();
}

/*proto.specialIMSClick = function(l)
{
	if(!l.tipText) Tooltip.attach(l, 'By clicking on this logo you will be redirected to the IMS Maxims home page.');
	l.fireEvent("onmouseenter");
	l.onmouseout = formManager._imsLogo_onmouseout;
}

proto._imsLogo_onmouseout = function()
{
	Tooltip.detach(event.srcElement);
	event.srcElement.onmouseout = null;
}*/

proto.logoutButtonClick = function(alwaysEnabled)
{
	if(this.isNavigationDisabled() && !alwaysEnabled || this._loading) return;
	this._logout(true);
}

proto._loadAboutDialog = function()
{
	if(this._aboutDialogLoaded) return;
	
	var node = this._ideaNode.selectSingleNode("aboutDialog");
	if(!node) return;
	
	if(node)
	{
		this._aboutDialogLoaded = true;
		this._aboutDialogTitle = String(node.getAttribute("title"));
		var mainHTMLNode = node.selectSingleNode("mainHTML");
		if(mainHTMLNode) this._aboutDialogMainHTML = String(mainHTMLNode.text);

		var secondHTMLNode = node.selectSingleNode("secondHTML");
		if(secondHTMLNode) this._aboutDialogSecondHTML = String(secondHTMLNode.text);
	}
}

proto.aboutButtonClick = function(alwaysEnabled)
{
	if(this.isNavigationDisabled() && !alwaysEnabled || !this._aboutDialogLoaded) return;
	if(!this._aboutDialog) this._aboutDialog = this._buildAboutDialog();
	CNDialogManager.showDialog(this._aboutDialog, null, true);	
}

proto._buildAboutDialog = function()
{
	var l;
	if(CNFormManager.vista)
	{
		l = CNDialogManager.createVistaDialog(this._aboutDialogTitle);
		l.style.width = "530px";
		l.style.height = "330px";
	}
	else
	{
		l = CNDialogManager.createDialog(this._aboutDialogTitle);
		l.className = l.className + " dialog_about";
		l.style.width = "500px";
		l.style.height = "300px";
	}	
	

	var contents = CNDialogManager.getContents(l);
	var siteLogo1 = document.createElement("<img class='aboutDialogSiteLogo1'>");
	contents.appendChild(siteLogo1);
	siteLogo1.src = CNFormManager.strings['loginLogo'];

//	var siteLogo2 = document.createElement("<img class='aboutDialogSiteLogo2'>");
//	contents.appendChild(siteLogo2);
//	siteLogo2.src = CNFormManager.neutralImagesPath + "logo-part-2.gif";

	var b2 = CNDialogManager.createBottomButton(l, "OK", true);
	b2.style.width = 80;
	
	var div1 = document.createElement("<div class='aboutDialogDiv1'>");
	contents.appendChild(div1);
	if(this._aboutDialogMainHTML) div1.innerHTML = this._aboutDialogMainHTML;

	if(this._aboutDialogSecondHTML)
	{
		var sep = document.createElement("<div class='aboutDialogSeparator'>");
		contents.appendChild(sep);
		
		var div2 = document.createElement("<div class='aboutDialogDiv2'>");
		contents.appendChild(div2);
		div2.innerHTML = this._aboutDialogSecondHTML;
	}
	else
	{
		l.style.height = CNFormManager.vista ? "250px" : "226px";
	}

	return l;
}

proto._document_oncontextmenu = function()
{
	var l = event.srcElement;
	if(l) CNUtil.cancelEvent();
}

proto._parseQueryString = function() {
	var qs = location.search;
	if(qs.indexOf("?") == 0) qs = qs.substr(1);
	var ar = qs.split("&");
	for(var i = 0; i < ar.length; i++) {
		var pair = ar[i].split("=");
		if(!pair[0]) continue;
		this._queryString[String(pair[0])] = pair[1] ? pair[1] : "";
	}
}

// NOTE: only strings allowed as xml argument or else jscript leaks memory.
proto._loadFormTO = function(xml)
{
	var obj = this;
	setTimeout(function(){ obj._processLoadFormTO(xml); }, 0);
}

proto._processLoadFormTO = function(xml)
{
	this.loadForm(xml);
}

proto._showYesNoDialog = function(title, message, delegate)
{
	if(!this._yesNoDialog) 
	{
		if(CNFormManager.vista)
		{
			this._yesNoDialog = CNDialogManager.createVistaDialog(title);	
			this._yesNoDialog.style.width = 430;
			this._yesNoDialog.style.height = 140;
		}
		else
		{
			this._yesNoDialog = CNDialogManager.createDialog(title);
			this._yesNoDialog.style.width = 400;
			this._yesNoDialog.style.height = 100;
		}
		var contents = CNDialogManager.getContents(this._yesNoDialog);
		var img = document.createElement("<img width=48 height=48 class='dialogIcon'>");
		contents.appendChild(img)
		img.src = CNFormManager.neutralImagesPath + "yesno-question-1.gif";
		var html = "<div style='padding: 8px; margin-left: 48px; '>" + message + "</div>";
		contents.insertAdjacentHTML("beforeend", html);
		var buttonWidth = 80;
		var b2 = CNDialogManager.createBottomButton(this._yesNoDialog, "Yes", true);
		b2.style.width = buttonWidth;
		var b1 = CNDialogManager.createBottomButton(this._yesNoDialog, "No", false);
		b1.style.width = buttonWidth;
	}
	CNDialogManager.showDialog(this._yesNoDialog, delegate, true);
}

proto._showOKDialog = function(title, message, delegate)
{
	if(!this._okDialog)
	{
		if(CNFormManager.vista)
		{
			this._okDialog = CNDialogManager.createVistaDialog(title);
			this._okDialog.style.width = 430;
			this._okDialog.style.height = 140;
		}
		else
		{
			this._okDialog = CNDialogManager.createDialog(title);
			this._okDialog.style.width = 400;
			this._okDialog.style.height = 100;
		}
		var contents = CNDialogManager.getContents(this._okDialog);
		var img = document.createElement("<img width=48 height=48 class='dialogIcon'>");
		contents.appendChild(img)
		img.src = CNFormManager.neutralImagesPath + "yesno-question-1.gif";
		var html = "<div style='padding: 8px; margin-left: 48px; '>" + message + "</div>";
		contents.insertAdjacentHTML("beforeend", html);
		var buttonWidth = 80;
		var b2 = CNDialogManager.createBottomButton(this._okDialog, "OK", true);
		b2.style.width = buttonWidth;
	}
	CNDialogManager.showDialog(this._okDialog, delegate, true);
}

proto._showErrorsDialog = function(title, errorNodeList, delegate)
{
	if(!this._errorsDialog) 
	{
		if(CNFormManager.vista)
		{
			this._errorsDialog = CNDialogManager.createVistaDialog(title);
			this._errorsDialog.style.width = 530;
			this._errorsDialog.style.height = 250;
		}
		else
		{
			this._errorsDialog = CNDialogManager.createDialog(title);
			this._errorsDialog.style.width = 500;
			this._errorsDialog.style.height = 220;
		}
		
		var contents = CNDialogManager.getContents(this._errorsDialog);

		var img = document.createElement("<img width=48 height=48 class='dialogIcon'>");
		contents.appendChild(img)
		img.src = CNFormManager.neutralImagesPath + "error-1.gif";

		var html = "<div id='messageDiv' style='height: 160px; width: 435px; position: relative; padding: 4px; margin: 5px; top: 5px; margin-left: 58px; overflow: auto; '></div>";
		contents.insertAdjacentHTML("beforeend", html);
		var buttonWidth = 80;
		var b2 = CNDialogManager.createBottomButton(this._errorsDialog, "Close", true);
		b2.style.width = buttonWidth;
	}
	var str = '';
	for(var i = 0; i < errorNodeList.length; i++)
	{
		str += errorNodeList[i].text + "\n\n";
	}
	this._errorsDialog.all['messageDiv'].innerText = str;
	CNDialogManager.showDialog(this._errorsDialog, delegate, true);
}

proto._showFatalErrorDialog = function(title, msg, buildInfo, stackTrace, delegate)
{
	if(!this._fatalErrorsDialog) 
	{
		if(CNFormManager.vista)
		{
			this._fatalErrorsDialog = CNDialogManager.createVistaDialog(title);
			this._fatalErrorsDialog.style.width = 530;
			this._fatalErrorsDialog.style.height = 185;
		}
		else
		{
			this._fatalErrorsDialog = CNDialogManager.createDialog(title);
			this._fatalErrorsDialog.style.width = 500;
			this._fatalErrorsDialog.style.height = 150;
		}
		this._fatalErrorsDialog.style.overflow = "hidden";
		var contents = CNDialogManager.getContents(this._fatalErrorsDialog);
				
		var img = document.createElement("<img width=48 height=48 class='dialogIcon'>");
		contents.appendChild(img)
		img.src = CNFormManager.neutralImagesPath + "error-2.gif";

		var html = "<div id='messageDiv' class='fatalErrorDialogMessageDiv1'></div>";
		contents.insertAdjacentHTML("beforeend", html);
		var buttonWidth = 80;

		var b1 = CNDialogManager.createBottomButton(this._fatalErrorsDialog, "Details");
		b1.style.width = buttonWidth;
		b1.attachEvent("onclick", this._fatalErrorDetailsClick);
		var b2 = CNDialogManager.createBottomButton(this._fatalErrorsDialog, "Close", true);
		b2.style.width = buttonWidth;
		
		var span = document.createElement("<span class='fatalErrorDialogSpan1'>");
		contents.appendChild(span);
		span.innerText = "Stack Trace:";
		
		var div = document.createElement("<div id=message2Div class='fatalErrorDialogMessageDiv2'>");
		contents.appendChild(div);

		var span = document.createElement("<span class='fatalErrorDialogSpan2'>");
		contents.appendChild(span);
		span.innerText = "Build Information:";

		var div = document.createElement("<div id=message3Div class='fatalErrorDialogMessageDiv3'>");
		contents.appendChild(div);
	}

	this._fatalErrorsDialog.all['messageDiv'].innerText = msg;
	this._fatalErrorsDialog.all['message2Div'].innerText = stackTrace;
	this._fatalErrorsDialog.all['message3Div'].innerText = buildInfo;
	this._fatalErrorsDialog._collapsed = true;

	CNDialogManager.showDialog(this._fatalErrorsDialog, delegate, true);
}

proto._fatalErrorDetailsClick = function()
{
	var dialog = CNDialogManager._findDialogDiv(event.srcElement);
	var contents = CNDialogManager.getContents(dialog);
	var display;
	if(dialog._collapsed)
	{
		dialog.style.height = CNFormManager.vista ? 415 : 385;
		display = 'block';
	}
	else
	{
		dialog.style.height = CNFormManager.vista ? 185 : 150;
		display = 'none';
	}
	for(var i = 3; i < contents.children.length; i++) contents.children[i].style.display = display;		
	dialog._collapsed = !dialog._collapsed;
	if(dialog.shadow) dialog.shadow.syncPosition();
}


// Theme support. =================================
proto._filterEventsXMLForTheme = function(xml)
{
	if(!CNFormManager.currentThemeName) CNFormManager.currentThemeName = CNFormManager.defaultThemeName;
	var tagName = "updateTheme";
	var tag = "<" + tagName + " theme=\"" + CNFormManager.currentThemeName + "\"/>";
	var uniqueID = '<uniqueID value="' + this._uniqueID + '"/>';
	if(!xml)
	{
		return "<events>" + tag + uniqueID + "</events>";
	}
	else if(typeof(xml) == "string")
	{
		// String.
		var closingPos = xml.indexOf("</events>");
		if(closingPos == -1) 
		{
			Util.assert("invalid events xml: closingPos == -1.");
			return "";
		}
		return xml.substring(0, closingPos) + tag + uniqueID + xml.substr(closingPos);
	}
	else 
	{
		// DOM.
		var events = xml.documentElement.selectSingleNode("events");
		var element = xml.createElement(tagName);
		element.setAttribute("theme", CNFormManager.currentThemeName);
		events.appendChild(element);
		
		element = xml.createElement("uniqueID");
		element.setAttribute("value", this._uniqueID);
		events.appendChild(element);
		
		return xml;
	}
}

proto._filterEventsXMLForResized = function(xml)
{
	if(!this._formPlaceholder) return;
	var rehide = false;
	if(this._formPlaceholder.currentStyle.display == "none")
	{
		//this._formPlaceholder.style.display = "block";
		rehide = true;
	}
	
	var w = this._formPlaceholder.offsetWidth;
	var h = this._formPlaceholder.offsetHeight;
	
	if(rehide)
	{
		//this._formPlaceholder.style.display = "none";
	}

	var tag = "<formSizeChanged width=\"" + w + "\" height=\"" + h + "\"/>";

	if(!xml)
	{
		return "<events>" + tag + "</events>";
	}
	else if(typeof(xml) == "string")
	{
		// String.
		var closingPos = xml.indexOf("</events>");
		if(closingPos == -1) 
		{
			Util.assert("invalid events xml: closingPos == -1.");
			return "";
		}
		return xml.substring(0, closingPos) + tag + xml.substr(closingPos);
	}
	else 
	{
		// DOM.
		var events = xml.selectSingleNode("events");
		var element = xml.createElement("formSizeChanged");
		element.setAttribute("width", w);
		element.setAttribute("height", h);
		events.insertBefore(element, events.firstChild);
		return xml;
	}
}

proto._deleteLoadingBar = function() {
	var pb = document.getElementById("cn_progressBar");
	if(pb) pb.parentNode.removeChild(pb);
}

// NOTE: return true -> breaks xml processing flow.
proto._processTheme = function()
{
	var htmlNode = this._ideaNode.selectSingleNode("html");
	if(!htmlNode)
	{
		if(!CNFormManager.themeLoaded)
		{
			this.fail("<html> theme is required in server response.");
		}
		return false;
	}
	
	// Got new theme.
	var attr = htmlNode.getAttribute("theme");
	if(!attr)
	{
		this.fail("No theme attribute in <html> element.");
		return true;
	}

	var themeName = String(attr);
	if(CNFormManager.themeLoaded && CNFormManager.currentThemeName == themeName) return false;
	
	CNFormManager.changingTheme = true;

	this._deleteLoadingBar();

	this._themeHtml = String(htmlNode.text);

	CNFormManager.currentThemeName = themeName;
	CNFormManager.themeImagesPath = "themes/" + CNFormManager.currentThemeName + "/g/";
	
	
	CNFormManager.vista = CNFormManager.currentThemeName == "vista";
	if(CNFormManager.currentThemeName == "black") {
		CNFormManager.vista = true;
		CNFormManager.subTheme = "black";
	}
	
	// Deactivate old stylesheet.
	var cn_globalStyleLink = document.all["cn_globalStyleLink"];

	this._detachHTMLLayout();

	var tabsAttr = htmlNode.getAttribute("tabs");
	if(tabsAttr == "true") this.isTabbed = true;

	this._loadAboutDialog();
	
	var href;
	if(CNFormManager.usePacked) href = "packed/themes/css/" + CNFormManager.currentThemeName + ".css.gz";
	else href = "themes/" + CNFormManager.currentThemeName + "/css/" + "allthemestyles.css";
	
	if(!cn_globalStyleLink || href.toLowerCase() != cn_globalStyleLink.href.toLowerCase())
	{
		var link = document.createElement("<link rel=stylesheet>");
		if(cn_globalStyleLink)
		{
			cn_globalStyleLink.onreadystatechange = null;
			cn_globalStyleLink.styleSheet.cssText = "";
			cn_globalStyleLink.parentElement.replaceChild(link, cn_globalStyleLink);
		}
		else
		{
			document.body.insertBefore(link, document.body.firstChild);
		}

		cn_globalStyleLink = link;
		cn_globalStyleLink.id = "cn_globalStyleLink";
		cn_globalStyleLink.onreadystatechange = this._globalStyleLink_onload;
		cn_globalStyleLink._load = true;
		cn_globalStyleLink.href = href;
		return true; // Break flow.
	}
	else
	{
		this._processTheme2(false);
		return false;
	}
}

proto._globalStyleLink_onload = function()
{
	var cn_globalStyleLink = document.all["cn_globalStyleLink"];
	if(cn_globalStyleLink.readyState != "complete") return;
	if(!cn_globalStyleLink._load) return;
	cn_globalStyleLink._load = false;
	var formManager = CNFormManager.getBaseFormManager();
	formManager._processTheme2(true);
}

proto._processTheme2 = function(doContinue)
{
	this._globalPlaceholder.innerHTML = this._themeHtml;
	this._themeHtml = null;

	this._initHTMLLayout();

	CNFormManager.changingTheme = false;

	if(doContinue) 
	{
		this._continueLoadForm2();
	}
}

proto._detachHTMLLayout = function()
{
	CNFormManager.destroyJSObjects(CNFormManager.themeJSObjects);
	CNFormManager.themeJSObjects = [];

	this._resetScreen();

	if(CNFormManager.themeLoaded)
	{
		window.ThemeNonCSSStyles = null;
		
		CNPopupCalendar.destroyDefaultCalendar();

		if(this._selectLocationCombo) 
		{
			CNFormManager.destroyJSObject(this._selectLocationCombo);
			this._selectLocationCombo = null;
		}

		Tooltip.destroy();
		if(this._alertIcons) CNFormManager.destroyJSObject(this._alertIcons);
		if(this._topButtons) CNFormManager.destroyJSObject(this._topButtons);
		if(this._layoutManager) this._layoutManager.unload();
		if(this._screenLayoutManager) this._screenLayoutManager.unload();

		// NOTE: i == 0 is a top form manager.
		for(var i = 1; i < CNFormManager.formManagers.length; i++)
		{
			CNFormManager.formManagers[i].destroyDialog();
			CNFormManager.formManagers[i] = null;
		}


		// Delete dialogs.
		if(this._passwordDialog) this._passwordDialog.removeNode(true);
		if(this._aboutDialog) this._aboutDialog.removeNode(true);
		if(this._errorsDialog) this._errorsDialog.removeNode(true);
		if(this._fatalErrorsDialog) this._fatalErrorsDialog.removeNode(true);
		
		this._deleteControls();
		this._deleteNavigation();
	
		this._formPlaceholder.detachEvent("onkeypress", this._formPlaceholder_onkeypress);
		
		this._formPlaceholder.removeNode(true);
	}

	this._formPlaceholder = null;
	this._knownScreenItems = null;
}

proto._initHTMLLayout = function()
{
	//this._reinitScripts(this._globalPlaceholder); - currently scripts work with deffer attribute, but for standards, it can be required.

	// Switch control styling.
	CN_button.setTheme(CNFormManager.currentThemeName);
	CN_imagebutton.setTheme(CNFormManager.currentThemeName);
	CN_combobox.setTheme(CNFormManager.currentThemeName);
	CN_logincontrol = CNFormManager.vista ? CN_logincontrol_vista : CN_logincontrol_pre;
	CNPopupCalendar.createDefaultCalendar();

	var children = this._globalPlaceholder.children;	
	var all = this._globalPlaceholder.all;
	
	this._formPlaceholder = all["__si_form"];
	
	this._darkHeader = all['__si_darkHeader'];

	this._formPlaceholder.attachEvent("onkeypress", this._formPlaceholder_onkeypress);
	
	this._setThemeStrings();
	
	var aiPlaceholder = document.all["__si_alertIcons"];
	if(aiPlaceholder) 
	{	
		this._alertIcons = new AlertIcons(aiPlaceholder);
		this._alertIcons.formManager = this;
	}
	
	this._topRightControls = document.all["__si_topRightControls"];
	if(this._topRightControls)
	{
		this._topButtons = new TopButtons(this._topRightControls);
		this._topButtons.formManager = this;
	}

	if(!this.disableLayoutManager) 
	{
		this._layoutManager = new LayoutManager(this._formPlaceholder, 
			848/*this._formPlaceholder.offsetWidth*/, 
			632/*this._formPlaceholder.offsetHeight*/);
	}
	this._initScreens();
	
	if(!CNFormManager.vista)
	{
		var obj = this;
		setTimeout(function(){ obj._replacePNG(); }, 100);
	}

	Tooltip.buildElement();

	CNFormManager.themeLoaded = true;
}
proto._setThemeStrings = function() {
	var copyrightDiv = $('__copyrightDiv');
	if(copyrightDiv && CNFormManager.strings['copyright']) {
		copyrightDiv.innerHTML = CNFormManager.strings['copyright'];
	}
}

/*proto._reinitScripts = function(l) {
	var tags = l.getElementsByTagName("script");
	var count = tags.length;
	var removeAr = [];
	for(var j = 0; j < count; j++)
	{
		var old = tags[j];
		var newScript = document.createElement('script'); 
	    newScript.type = "text/javascript"; 
	    
	    if(old.src) newScript.src = old.src
	    else newScript.text = old.text;

		l.appendChild(newScript); 

		removeAr.push(old);
	}
	for(var i = 0; i < removeAr.length; i++)
	{
		var old = removeAr[i];
		old.parentNode.removeChild(old);
	}
}*/

proto._initScreens = function()
{
	this._knownScreenItems = [];

	if(!this.disableLayoutManager) 
	{
		this._screenLayoutManager = new LayoutManager(this._globalPlaceholder, 0, 0);
		this._screenLayoutManager.setHandleResizes(true);
		this._screenLayoutManager.onResized = this._screenLayoutManager_onResized;
	}
}

// this == _screenLayoutManager.
proto._screenLayoutManager_onResized = function()
{
	var fm = CNFormManager.getBaseFormManager();
	fm._layoutManager.doLayout();
}

proto._replacePNG = function()
{
	Util.replacePNG(document);
}

proto.isNavigationDisabled = function()
{
	return this._modalFocused || this._navigationDisabled || this._editMode;
} 

proto._control_oncontextmenu = function()
{
	if(event.button != 2) return;

	var fm = CNFormManager.getActiveFormManager();

	var jsObject = CNUtil.findJSObject(event.srcElement);
	var l = jsObject.element;
	var x = event.clientX;
	var y = event.clientY;

	var menuData;

	if(jsObject.get_disabled && jsObject.get_disabled() || jsObject._disabled) return;
	
	if(jsObject.getContextMenuData) menuData = jsObject.getContextMenuData();
	else if(l) menuData = {menuID: l._menuID, targetID: l.id};
	
	if(!menuData) {
		return;
	}
	
	menuData.x = x;
	menuData.y = y;

	if(fm._isPostingBack || fm.contextMenuPending)
	{
		fm._pendingContextMenuData = menuData;
	}
	else 
	{
		Tooltip.hide();
		// Check required for answerbox rightclick.
		fm._showContextMenu(menuData);
	}
}
proto._showContextMenu = function(menuData)
{
	this._currentContextID = menuData.targetID;
	var topPlaceholder = document.body;

	var menu = this._menus[menuData.menuID];
	if(menu) {
		menu.show(document.body.scrollLeft + menuData.x, document.body.scrollTop + menuData.y);
	}
}

proto._menuItem_onmenuclick = function(ev)
{
	var fm = CNFormManager.getActiveFormManager();
	var id = ev.srcElement._parentMenuID;
	fm._currentMenuID = id;
	fm._currentMenuItemID = ev.srcElement._id;
	fm.postData("menu");
}

proto.waitForButtonClick = function()
{
	// Do not allow to autoPostBack, wait for button onclick.
	this._waitingForButtonPostback = true;
}

proto.buttonClicked = function()
{
	this._waitingForButtonPostback = false;
}

// Progress bar ========================================================================================================
proto._beginProgress = function() {
/*	if(this._globalProgressbarTO != null) clearTimeout(this._globalProgressbarTO);
	var obj = this;
	this._globalProgressbarTO = setTimeout(function(){ obj._beginProgressTO(); }, 500);*/
}

proto._beginProgressTO = function() {
	//if(this._globalProgressbar.currentStyle.visibility != "hidden") return;
	var l = this._globalProgressbar;
	this._globalProgressbar.filters[0].apply();
	this._globalProgressbar.style.visibility = "visible";
	if(this._globalProgressbar.shadow) this._globalProgressbar.shadow.show();
	this._globalProgressbar.filters[0].play();
	this._progressStarted = true;
}

proto._endProgress = function() {
	if(!this._progressStarted) return;
	if(this._globalProgressbarTO != null) clearTimeout(this._globalProgressbarTO);
	this._globalProgressbar.filters[0].apply();
	if(this._globalProgressbar.shadow) this._globalProgressbar.shadow.hide();
	this._globalProgressbar.style.visibility = "hidden";
	this._globalProgressbar.filters[0].play();
	this._progressStarted = false;
}

proto._createProgressBar = function() {
	var l = this._globalProgressbar = document.createElement("div");
	l.className = "cn_globalProgressbar";
	l.innerHTML = '<div></div><img width="250" height="16" src="g/und-progress-bar-1.gif">';
	new Shadow(l);
	document.body.appendChild(l);
}

proto._showProgress = function(showProgressNode) {
	if(!this._globalProgressbar) this._createProgressBar();
	var labelAttr = showProgressNode.getAttribute("label");
	var textDiv = this._globalProgressbar.firstChild;
	if(labelAttr) textDiv.innerText = String(labelAttr);
	else textDiv.innerText = "";

	var self = this;
	setTimeout(function() {
		self._beginProgressTO();
		self.lightPostData("<progressWaiting/>");
	}, 0);
}
