$(function() { //只要是分页的程序都一定要进行动态的Ajax设置
	loadData(); //只要调用这个函数就可以进行表格数据填充以及分页的自动生成
})

function loadData() { //负责数据的加载

	var url=window.location.href;
	var status=url.substring(url.lastIndexOf("=")+1);
	var path=null;
	//此处既然是无刷新分页，那么要进行异步加载数据
	if (status==0||status=='0'){
		path="SplitPageServlet/statuslist?status=0";
	}else if (status==1||status=='1'){
		path="SplitPageServlet/statuslist?status=1";
	}else if (status==2||status=='2'){
		path="SplitPageServlet/statuslist?status=2";
	}else if (status=='all'){
		path="SplitPageServlet/list";
	}
	$.post(path, {
		"cp" : jsCommonCp,
		"ls" : jsCommonLs,
		"col" :jsCommonCol,
		"kw" : jsCommonKw
	}, function(data) {
		createSplitBar(data); //有总记录数才能驱动分页组件
		createSearchBar(data); //生成检索框
		clearTable(); //清空表格行
		//随后根据不同的需要要定义一些数据的生成操作
		for (var x = 0; x < data.allMembers.length; x++) {
			var mid = data.allMembers[x].mid;
			var name = data.allMembers[x].name;
			var tel = data.allMembers[x].tel;
			var regdate = data.allMembers[x].regdate;
			//解析为字符串
			if (regdate!=null){
				var str = (regdate.year+1900)+"-"+(regdate.month+1)+"-"+regdate.date;
			}else{
				var str=null;
			}

			var status = data.allMembers[x].status;
			if (status==0){
				status="锁定";
			}else if (status==1){
                status="已激活"
			}else if(status==2){
				status="待激活"
			}
			addTableRow(mid,name,tel,str,status);
		}
	}, "json");

}

function addTableRow(mid,name,tel,regdate,status) { //创建表格行
	$("#deptTab").append("<tr><td><input type='checkbox'></td><td>" + mid + "</td>" + "<td>" + name + "</td>"+
			"<td>" + tel + "</td>"+"<td>" + regdate+ "</td>"+"<td>" + status + "</td><tr>");
}
function clearTable() {
	$("#deptTab tr:gt(0)").remove();
}