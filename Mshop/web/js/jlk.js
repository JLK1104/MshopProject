//全选按钮操作
function allcheck(obj,eleName){
	var item=document.all(eleName);
	if(item.length==undefined){
		document.getElementById(eleName).checked=this.checked;
	}else{
		for(var x=0;x<item.length;x++){
			item[x].checked=obj.checked;
		}
	}
}
function updateAll(url,paramName,eleName){
	deleteAll(url,paramName,eleName);
}

//paramName:表示要传递的参数名称
//eleName:表示取得数据的ID名称
function deleteAll(url,paramName,eleName){
	var data="";//保存要删除的所有数据
	//但是数据有可能是数组，也可能只有一个
	var item =document.all(eleName);
	var count=0;//保存要删除的数据个数
	//要判断是否要删除数据
	if(item.length==undefined){//表示只有一个元素，不是数组
		if(document.getElementById(eleName).checked==true){
			data+=document.getElementById(eleName).value+"|";
			count++
		}
	}else{
		for(var x=0;x<item.length;x++){
			if(item[x].checked==true){
				count++;
			    data+=item[x].value+"|";
			}
		}
	}
	if(count>0){
		if(window.confirm("确定要操作这些数据吗？")){
			//console.log(url+"?"+paramName+"="+data);
			window.location=url+"&"+paraName+"="+data;
		}
	}else{
		alert("您还未选择任何数据！");
	}
}

function openPage(url){
	window.open(url,"查看详细信息","width=600;height=500;scollable=yes");
}
function closePage(url){
	window.colse();
}
function changecode(obj){//要修改显示的验证码
	obj.src="pages/image.jsp?tm="+Math.random();
}

function gohref(){
	window.location.href="http://localhost:8080/Mshop/MemberServletBack/list";
}




	
	
