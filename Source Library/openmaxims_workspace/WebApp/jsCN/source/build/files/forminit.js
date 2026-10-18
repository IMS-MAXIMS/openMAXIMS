CNFormManager.defaultThemeName = "new-blue";
CNFormManager.usePacked = true;
CNFormManager.assetVersion = window.__openmaximsStandardsPortAssetVersion || "";

var formManager = CNFormManager.initMainFormManager();
var cnHostUrl = new URL("CNHost", window.location.href);
formManager.sourceUrl = cnHostUrl.pathname;
formManager.debug = false;
formManager.delayedControlsCreation = false;
formManager.disableLayoutManager = false;
formManager.reportTimings = false;
formManager.reportStats = false;

CNFormManager.strings = {

       'copyright': '&copy; IMS MAXIMS',
       'loginCaption': 'MAXIMS Clinical',
       'loginLogo': 'g/new-login-ims-logo.png'
       
};

CN_grid.fullRowSelect = false;
CN_logincontrol_newblue.loginImage = false;

window.addEventListener("load", function()
{
	formManager.loadForm();
});
