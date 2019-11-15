<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>微商城</title>
    <!-- AJAX异步处理和分页组件 -->
    <script type="text/javascript" src="/Mshop/js/back/admin-js/jquery.min.js"></script>
    <script type="text/javascript" src="/Mshop/js/SplitPage/member_list.js"></script>
    <script type="text/javascript" src="/Mshop/js/SplitPage/split_search.js"></script>
    <script type="text/javascript" src="/Mshop/js/SplitPage/split_util.js"></script>
    <link type="text/css" href="/Mshop/CSS/splitpage/style.css" rel="stylesheet">
</head>
<body>
	<div id="SearchDIV"></div>
	<div id="deptDIV">
		<table id="deptTab" border="1" cellpadding="5" cellspacing="0" bgcolor="#f2f2f2" width="100%">
			<tr>
				<td>用户ID</td>
                 <td>姓名</td>
                 <td>电话</td>
                 <td>注册日期</td>
                 <td>状态</td>
			</tr>
		</table>
	</div>
	<div id="splitBarDIV"></div>
</body>
</html>
