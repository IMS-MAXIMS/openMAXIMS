CNFormManager.defaultThemeName = "blue";
CNFormManager.usePacked = false;

var formManager = CNFormManager.initMainFormManager();
formManager.sourceUrl = "CNHost";
formManager.debug = false;
formManager.delayedControlsCreation = true;
formManager.disableLayoutManager = false;
formManager.reportTimings = true;
formManager.reportStats = true;

CNFormManager.strings = {

       'copyright': '&copy; IMS MAXIMS',
       'loginCaption': 'MAXIMS Clinical',
       'loginLogo': 'g/login-ims-logo.png'
       
};

CN_grid.fullRowSelect = false;
CN_logincontrol_pre.loginImage = CN_logincontrol_vista.loginImage = false;

window.addEventListener("load", function()
{
	formManager.loadForm();
});
