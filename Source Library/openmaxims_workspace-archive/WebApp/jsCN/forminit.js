CNFormManager.defaultThemeName = "blue";
CNFormManager.usePacked = true;

var formManager = CNFormManager.initMainFormManager();
formManager.sourceUrl = "CNHost";
formManager.debug = false;
formManager.delayedControlsCreation = true;
formManager.disableLayoutManager = false;
formManager.reportTimings = false;
formManager.reportStats = false;

CNFormManager.strings = {

       'copyright': '&copy; IMS MAXIMS',
       'loginCaption': 'MAXIMS Clinical',
       'loginLogo': 'g/login-ims-logo.png'
       
};

CN_grid.fullRowSelect = false;
CN_logincontrol_pre.loginImage = CN_logincontrol_vista.loginImage = false;

window.attachEvent("onload", function()
{
	formManager.loadForm();
});
/*
-------------------------
TEST ONLY, DO NOT ENABLE!
-------------------------

formManager.old_initHTMLLayout = formManager._initHTMLLayout;
formManager._initHTMLLayout = function()
{
	this.old_initHTMLLayout();

this._formContent.attachEvent("onresize", function()
{
	var fm = CNFormManager.getBaseFormManager();
	if(!fm._formContent) return;
	
	if(fm._darkHeader) fm._darkHeader.style.width = fm._formContent.offsetWidth + 19;
	
	fm._formPlaceholder.style.width = fm._formContent.clientWidth + LayoutManager._rightPadding;
	fm._formPlaceholder.style.height = fm._formContent.clientHeight;
	
	if(fm._subLevelFrame)
	{
		fm._subLevelFrame.style.width = fm._formContent.clientWidth + LayoutManager._rightPadding + 8;
		fm._subLevelFrame.style.height = fm._formContent.clientHeight - 8;
	}
});
}
*/