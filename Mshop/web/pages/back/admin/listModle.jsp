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
  </head>
  <body>
    <div id="mainDIV">
    <h1>用户列表</h1>
    <jsp:include page="split_page_plugin_search.jsp"/>
    <c:if test="${allMembers!=null}" var="res">
        <table border="1" cellpadding="5" cellspacing="0" bgcolor="#f2f2f2" width="100%">        
              <tr>
                 <td>用户ID</td>
                 <td>姓名</td>
                 <td>电话</td>
                 <td>注册日期</td>
                 <td>状态</td>
              </tr>
              <c:forEach items="${allMembers}" var="member">
                 <tr>
                    <td>${member.mid}</td>
                    <td>${member.name}</td>
                    <td>${member.tel}</td>
                    <td>${member.regdate}</td>
                    <td>
                        <c:if test="${member.status==0 }">
                                                                                      锁定
                        </c:if>
                        <c:if test="${member.status==1 }">
                                                                                      激活
                        </c:if>
                        <c:if test="${member.status==2 }">
                                                                                     未激活                                                         
                        </c:if>
                    </td>
                 </tr>
              </c:forEach>
        </table>
    </c:if>
    <jsp:include page="split_page_plugin_bars.jsp"/>
    </div> 
  </body>
</html>
