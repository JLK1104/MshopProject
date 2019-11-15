<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>微商城</title>
	<link rel="stylesheet" type="text/css" href="CSS/jlk.css">
	<script type="text/javascript" src="js/jlk.js"></script>
  </head>
  <body>
    <jsp:include page="/pages/others/header.jsp"/>
    <div id="mainDIV">
    </div>
    <jsp:include page="/pages/others/footer.jsp"/>   
  </body>
</html>
