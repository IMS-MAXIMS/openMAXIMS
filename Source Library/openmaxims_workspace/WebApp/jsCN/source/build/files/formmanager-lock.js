var proto = CNFormManager.prototype;

proto._loadAutoLockTimer = function(autoLockNode) 
{
	var lockTimer = Util.xmlSelectSingleNode(autoLockNode, "autoLockTimer");
	if(lockTimer)
	{
		if(lockTimer.getAttribute("reset") == "true")
		{			
			this.pauseAutoLockTimer();
			var fm = CNFormManager.getBaseFormManager();
			
			fm._autoLockTime = 0;
			fm._autoLockTO = 0;
			
			return;
		}
		
		var attr = lockTimer.getAttribute("interval");
		if(attr == null)
		{
			Util.assert("No interval specified for autoLockTimer");
			return;
		}
		var val = parseInt(attr, 10);
		if(val < 2)
		{
			Util.assert("Interval is < 2 for autoLockTimer");
			return false;
		}
		CNFormManager._trace("Load AutoLock with time: " + val);
		this._startAutoLockTimer(val);
	}
}

proto._startAutoLockTimer = function(timeoutSeconds)
{
	// this may be == to dialog fm, so using base fm.
	var fm = CNFormManager.getBaseFormManager();
	if(timeoutSeconds == fm._autoLockTime) return;

	if(!fm._autoLockTO)
	{
		Event.add(document, "keydown", fm, fm._resetAutoLock);
		Event.add(document, "mousedown", fm, fm._resetAutoLock);
	}

	fm._autoLockTime = timeoutSeconds;
	fm._resetAutoLock();
}
// API
proto.pauseAutoLockTimer = function() 
{
    if(this != CNFormManager.getBaseFormManager()) {
        CNFormManager._trace("pauseAutoLockTimer(): this != CNFormManager.getBaseFormManager() -> is  dialog FormManager");
		this._autoLockPaused = false;
		return;
    }
    this._autoLockPaused = true;
	CNFormManager._trace("Pause AutoLock ...");
    if(this._autoLockTO) clearTimeout(this._autoLockTO);
}
proto.resumeAutoLockTimer = function() {
    if(this != CNFormManager.getBaseFormManager()) {
       CNFormManager._trace("resumeAutoLockTimer(): this != CNFormManager.getBaseFormManager() -> is  dialog FormManager");
	   return;
    }
    this._autoLockPaused = false;
	CNFormManager._trace("Resume AutoLock ...");
    this._resetAutoLock();
}
proto._resetAutoLock = function() { // Executed on each click/other user activity. Should be fast.
	// this may be == to dialog fm, so using base fm.
	var fm = CNFormManager.getBaseFormManager();
	if(!fm || fm._autoLockPaused || fm._autoLockShutDown) return;
    if(fm._autoLockTO) clearTimeout(fm._autoLockTO);
	if(!fm._autoLockTime) return;
	CNFormManager._trace("Reset AutoLock. New autoLockTime " + fm._autoLockTime);
    fm._autoLockTO = setTimeout(function(){ fm._autoLock(); }, fm._autoLockTime * 1000);
	if(!fm._autoLockTO)
	{
		Event.add(document, "keydown", fm, fm._resetAutoLock);
		Event.add(document, "mousedown", fm, fm._resetAutoLock);
	}

}

proto._autoLock = function()
{
	this._autoLockPostData = true;	
	this.pauseAutoLockTimer();

    // this = base fm.
	Event.del(document, "keydown", this, this._resetAutoLock);
	Event.del(document, "mousedown", this, this._resetAutoLock);

	// Close some popups.
    // TODO: custom events and global event, which all the popup-enabled controls should listen to.
	this._safelyClosePopups();

	// NOTE: dialogs and other popups handled by enforceDialog(). 
	CNFormManager.getActiveFormManager().postData("<autoLock/>");
	this._autoLockPostData = false;		
}

// API
// Enforces given dialog FM to be the single visible dialog at the time.
proto.enforceDialog = function() {
	if(!this.isDialog) {
		CNFormManager._trace("enforceDialog() !this.isDialog");
		return;
	}
	if(this != CNFormManager.getActiveFormManager()) {
		CNFormManager._trace("enforceDialog() this != CNFormManager.getActiveFormManager()");
		return;
	}

	this._tempHideAllPopups(); // NOTE: this can cause some unwanted delegates to be called on messagebox.hide (e.g. fm._finishProcessServerErrors).
}
proto.deforceDialog = function() {
	CNThemeableDialog.reshowAll();

	var bodyChildren = document.body.children;

	for(var i = 0; i < bodyChildren.length; i++) {
		var l = bodyChildren[i];
		if(l._tempHidden !== null && l._tempHidden !== undefined) {
			l.style.visibility = l._tempHidden;
			l._tempHidden = null;
		}
	}
}

proto._tempHideAllPopups = function() {
	CNThemeableDialog.temporaryHideAll();

	var bodyChildren = document.body.children;
	var baseFM = CNFormManager.getBaseFormManager(); 
	for(var i = 0; i < bodyChildren.length; i++) {
		var l = bodyChildren[i];
		if(l == baseFM._formPlaceholder || l == this._formPlaceholder) continue;

		var style = Util.getComputedStyle(l);
		if(style.position == "absolute" && style.display != "none" && style.visibility != "hidden") {
			l._tempHidden = style.visibility;
			l.style.visibility = 'hidden';
		}
	}
}

proto = null;