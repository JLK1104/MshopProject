<!-- 头部-->
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld" %>
<div id="headerDIV">
     <img src="images/top.png">
     <a href="">商城首页</a>
     <a href="">我的购物车</a>
     <c:if test="${mid!=null}">
        <a href="">个人中心</a>
        <img src="upload/member/${photo}" style="width:50px;height:50px;">
        <a href="/Mshop/MemberServletfront/out">注销信息</a>
     </c:if>
     <c:if test="${mid==null}">
        <a href="pages/login.jsp">登录</a>
        <a href="pages/register.jsp">注册</a>
     </c:if>
</div>