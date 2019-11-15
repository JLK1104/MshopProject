$(function() { //只要是分页的程序都一定要进行动态的Ajax设置
	loadData(); //只要调用这个函数就可以进行表格数据填充以及分页的自动生成
})

function loadData() { //负责数据的加载
	//此处既然是无刷新分页，那么要进行异步加载数据
	$.post("MemberServletBack/list", {
		"cp" : jsCommonCp,
		"ls" : jsCommonLs,
		"col" :jsCommonCol,
		"kw" : jsCommonKw
	}, function(data) {
		console.log(data);
		createSplitBar(data); //有总记录数才能驱动分页组件
		createSearchBar(data); //生成检索框
		clearTable(); //清空表格行
		//随后根据不同的需要要定义一些数据的生成操作
		for (var x = 0; x < data.allMembers.length; x++) {
			var mid = data.allMembers[x].mid;
			var name = data.allMembers[x].name;
			var tel = data.allMembers[x].tel;
			var regdate = data.allMembers[x].regdate;
			var status = data.allMembers[x].status;
			addTableRow(mid,name,tel,regdate,status);
		}
		
	}, "json");

}

function addTableRow(mid,name,tel,regdate,status) { //创建表格行
	$("#deptTab").append("<tr><td>" + mid + "</td>" + "<td>" + name + "</td>"+
			"<td>" + tel + "</td>"+"<td>" + regdate.toString() + "</td>"+"<td>" + status + "</td><tr>");
}
function clearTable() {
	$("#deptTab tr:gt(0)").remove();
}