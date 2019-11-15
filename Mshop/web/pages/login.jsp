<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String loginUrl=basePath+"/MemberServletfront/login";
%>

<html lang="en">
<head>
  <meta charset="utf-8">
  <title>MemberLogin</title>
  <!-- Bootstrap core CSS-->
  <link href="/Mshop/CSS/back/bootstrap.min.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="/Mshop/CSS/back/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
  <link href="/Mshop/CSS/back/sb-admin.css" rel="stylesheet">
</head>

<body class="bg-dark" background="/Mshop/images/login.jpg">
  <div class="container">
    <div class="card card-login mx-auto mt-5">
      <div class="card-header">Login</div>
      <div class="card-body">
        <form action="<%=loginUrl %>" method="post" onsubmit="return validateLogin()">
          <div class="form-group">
            <label for="mid">账号</label>
            <input class="form-control" id="mid" name="mid"type="text" aria-describedby="emailHelp" placeholder="MemberID">
          </div>
          <div class="form-group">
            <label for="password">密码</label>
            <input class="form-control" id="password" name="password" type="password" placeholder="Password">
          </div>
          <div class="form-group">
            <div class="form-check">
              <label class="form-check-label">
                <input class="form-check-input" type="checkbox">记住密码</label>
            </div>
          </div>
          <button class="btn btn-primary btn-block" type="submit">Login</button>
        </form>
        <div class="text-center">
          <a class="d-block small mt-3" href="/Mshop/pages/register.jsp">注册账号</a>
          <a class="d-block small" href="#">忘记密码?</a>
        </div>
      </div>
    </div>
  </div>
  <!-- Bootstrap core JavaScript-->
  <script src="/Mshop/js/back/admin-js/jquery.min.js"></script>
  <script src="/Mshop/js/back/admin-js/bootstrap.bundle.min.js"></script>
  <!-- Core plugin JavaScript-->
  <script src="/Mshop/js/back/admin-js/jquery.easing.min.js"></script>
  <!-- 前端验证 -->
  <script type="text/javascript" src="/Mshop/js/member.js"></script>
</body>

</html>
