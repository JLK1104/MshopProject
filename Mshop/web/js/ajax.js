var XmlHttpRequest ;
function createXMLHttpRequest(){
	if(window.XMLHttpRequest){//非IE浏览器
		XmlHttpRequest=new XMLHttpRequest();
	}else{                    //IE浏览器
		XmlHttpRequest=new ActiveXObject("microsoft.XMLHttp");
	}
}



