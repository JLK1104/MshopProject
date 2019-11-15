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
    <title>微商城首页</title>
  </head>
  <body>
    <jsp:include page="/pages/others/header.jsp"/>
    <div id="mainDIV">
    <h1>商城首页</h1>
    </div>
    <jsp:include page="/pages/others/footer.jsp"/>
    <script type="text/javascript" src="/Mshop/js/jlk.js"></script>   
  </body>
</html>
