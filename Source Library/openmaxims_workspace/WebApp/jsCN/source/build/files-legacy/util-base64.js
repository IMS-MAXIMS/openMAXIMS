(function() {
    var p="=";
    var tab="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    Util.base64_decode = function(str) {
        var s=str.split(""), out=[];
        var l=s.length;
        while(s[--l]==p){ }	//	strip off trailing padding
        for (var i=0; i<l;){
            var t=tab.indexOf(s[i++])<<18;
            if(i<=l){ t|=tab.indexOf(s[i++])<<12 };
            if(i<=l){ t|=tab.indexOf(s[i++])<<6 };
            if(i<=l){ t|=tab.indexOf(s[i++]) };
            out.push((t>>>16)&0xff);
            out.push((t>>>8)&0xff);
            out.push(t&0xff);
        }
        while(out[out.length-1]==0){ out.pop(); }
        var strAr = [];
        for(var i = 0; i < out.length; i++) strAr.push(String.fromCharCode(out[i]));
        return strAr.join("");
    }
})();