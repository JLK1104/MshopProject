<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String RegistUrl=basePath+"/MemberServletfront/regist";
%>

<html lang="en">

<head>
  <meta charset="utf-8">
  <title>Register</title>
  <!-- Bootstrap core CSS-->
  <link href="/Mshop/CSS/back/bootstrap.min.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="/Mshop/CSS/back/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
  <link href="/Mshop/CSS/back/sb-admin.css" rel="stylesheet">
</head>

<body class="bg-dark">
  <div class="container">
    <div class="card card-register mx-auto mt-5">
      <div class="card-header">Register an Account</div>
      <div class="card-body">
        <form action="<%=RegistUrl %>" method="post" onsubmit="return validateRegist()">
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="memberid">用户ID</label>
                <input class="form-control" id="mid" name="mid" type="text" aria-describedby="nameHelp" placeholder="Member id">
              </div>
              <div class="col-md-6">
                <label for="name">用户名</label>
                <input class="form-control" id="name" name="name" type="text" aria-describedby="nameHelp" placeholder="Member name">
              </div>
            </div>
          </div>
          <div class="form-group">
            <label for="tel">手机号</label>
            <input class="form-control" id="tel" name="tel" type="text" aria-describedby="emailHelp" placeholder="photo">
          </div>
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="password">密码</label>
                <input class="form-control" id="password" name="password" type="password" placeholder="Password">
              </div>
              <div class="col-md-6">
                <label for="password1">确认密码</label>
                <input class="form-control" id="password1" name="password1" type="password" placeholder="Confirm password">
              </div>
            </div>
          </div>
          <button class="btn btn-primary btn-block" type="submit">注册</button>
        </form>
        <div class="text-center">
          <a class="d-block small mt-3" href="#">咨询</a>
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
