
var proto = CNFormManager.prototype;

proto._loadHeartBeatTimer = function(heartBeatNode) {
	var heartBeatTimer = Util.xmlSelectSingleNode(heartBeatNode, "heartbeat");	
	if(heartBeatTimer)
	{
		if(heartBeatTimer.getAttribute("reset") == "true")
		{			
			this.pauseHeartBeatTimer();
			var fm = CNFormManager.getBaseFormManager();
			fm._heartBeatTime = 0;
			fm._heartBeatTO = 0;
			
			return;
		}
	
		var attr = heartBeatTimer.getAttribute("interval");
		if(attr == null)
		{
			Util.assert("No interval specified for heartBeatTimer");
			return;
		}
		var val = parseInt(attr, 10);
		if(val < 2)
		{
			Util.assert("Interval is < 2 for heartBeatTimer");
			return false;
		}
		CNFormManager._trace("Load HeartBeat with time: " + val)
		this._startHeartBeatTimer(val);
	}
	
}

proto._startHeartBeatTimer = function(timeoutSeconds)
{
	// this may be == to dialog fm, so using base fm.
	var fm = CNFormManager.getBaseFormManager();
	if(timeoutSeconds == fm._heartBeatTime) return;

	if(!fm._heartBeatTO)
	{
		Event.add(document, "keydown", fm, fm._resetHeartBeat);
		Event.add(document, "mousedown", fm, fm._resetHeartBeat);
	}

	fm._heartBeatTime = timeoutSeconds;
	fm._resetHeartBeat();
}
// API
proto.pauseHeartBeatTimer = function() {
    if(this != CNFormManager.getBaseFormManager()) {
		CNFormManager._trace("pauseHeartBeatTimer(): this != CNFormManager.getBaseFormManager() -> is  dialog FormManager");
		this._heartBeatPaused = false;
		return;
    }
    this._heartBeatPaused = true;
	CNFormManager._trace("Pause HeartBeat ...");
    if(this._heartBeatTO) clearTimeout(this._heartBeatTO);
}
proto.resumeHeartBeatTimer = function() {
    if(this != CNFormManager.getBaseFormManager()) {
       CNFormManager._trace("resumeHeartBeatTimer(): this != CNFormManager.getBaseFormManager() -> is  dialog FormManager");
	   return;
    }
    this._heartBeatPaused = false;
	CNFormManager._trace("Resume HeartBeat ...");
    this._resetHeartBeat();
}
proto._resetHeartBeat = function() { // Executed on each click/other user activity. Should be fast.
	// this may be == to dialog fm, so using base fm.
	var fm = CNFormManager.getBaseFormManager();
	if(!fm || fm._heartBeatPaused || fm._heartBeatShutDown) return;
    if(fm._heartBeatTO) clearTimeout(fm._heartBeatTO);
	if(!fm._heartBeatTime) return;
	CNFormManager._trace("Reset HeartBeat. New heartBeatTime " + fm._heartBeatTime);
    fm._heartBeatTO = setTimeout(function(){ fm._heartBeat(); }, fm._heartBeatTime * 1000);	
}

proto._heartBeat = function()
{
	this.pauseHeartBeatTimer();

    // this = base fm.
	Event.del(document, "keydown", this, this._resetHeartBeat);
	Event.del(document, "mousedown", this, this._resetHeartBeat);

	// Close some popups.
    // TODO: custom events and global event, which all the popup-enabled controls should listen to.
	this._safelyClosePopups();
	
	this._heartBeatPostData = true;	
	this._heartBeatPaused = false;
	CNFormManager.getActiveFormManager().postData("<empty/>");		
	this._heartBeatPostData = false;
}
