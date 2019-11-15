<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String listUrl=basePath+"MemberServletBack/list";
String listStatusUrl=basePath+"MemberServletBack/statuslist";
%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>后台界面</title>
  <!-- Bootstrap core CSS-->
  <link href="/Mshop/CSS/back/bootstrap.min.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="/Mshop/CSS/back/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Page level plugin CSS-->
  <link href="/Mshop/CSS/back/dataTables.bootstrap4.css" rel="stylesheet">
  <!-- Custom styles for this template-->
  <link href="/Mshop/CSS/back/sb-admin.css" rel="stylesheet">
  <base href="<%=basePath%>">
</head>

<body class="fixed-nav sticky-footer bg-dark" id="page-top">
  <!-- Navigation-->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" id="mainNav">
    <a class="navbar-brand" href="/Mshop/index.jsp">微商城</a>
    <div class="collapse navbar-collapse" id="navbarResponsive">
      <ul class="navbar-nav navbar-sidenav" id="exampleAccordion">
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Charts">
          <a class="nav-link" href="charts.html" >
            <i class="fa fa-fw fa-area-chart"></i>
            <span class="nav-link-text">图表</span>
          </a>
        </li>
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Components">
          <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapselist" data-parent="#exampleAccordion">
            <i class="fa fa-fw fa-table"></i>
            <span class="nav-link-text">用户列表</span>
          </a>
          <ul class="sidenav-second-level collapse" id="collapselist">
            <li>
              <a href="javascript:void(0);" onclick="gohref()">用户总列表</a>
            </li>
            <li>
              <a href="<%=listStatusUrl%>?status=0">锁定用户</a>
            </li>
            <li>
              <a href="<%=listStatusUrl%>?status=1">激活用户</a>
            </li>
            <li>
              <a href="<%=listStatusUrl%>?status=2">待激活用户</a>
            </li>
          </ul>
        </li>
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Components">
          <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseComponents" data-parent="#exampleAccordion">
            <i class="fa fa-fw fa-wrench"></i>
            <span class="nav-link-text">Components</span>
          </a>
          <ul class="sidenav-second-level collapse" id="collapseComponents">
            <li>
              <a href="navbar.html">Navbar</a>
            </li>
            <li>
              <a href="cards.html">Cards</a>
            </li>
          </ul>
        </li>
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Example Pages">
          <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseExamplePages" data-parent="#exampleAccordion">
            <i class="fa fa-fw fa-file"></i>
            <span class="nav-link-text">Example Pages</span>
          </a>
          <ul class="sidenav-second-level collapse" id="collapseExamplePages">
            <li>
              <a href="login.html">Login Page</a>
            </li>
            <li>
              <a href="register.html">Registration Page</a>
            </li>
            <li>
              <a href="forgot-password.html">Forgot Password Page</a>
            </li>
            <li>
              <a href="blank.html">Blank Page</a>
            </li>
          </ul>
        </li>
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Menu Levels">
          <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseMulti" data-parent="#exampleAccordion">
            <i class="fa fa-fw fa-sitemap"></i>
            <span class="nav-link-text">Menu Levels</span>
          </a>
          <ul class="sidenav-second-level collapse" id="collapseMulti">
            <li>
              <a href="#">Second Level Item</a>
            </li>
            <li>
              <a href="#">Second Level Item</a>
            </li>
            <li>
              <a href="#">Second Level Item</a>
            </li>
          </ul>
        </li>
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Link">
          <a class="nav-link" href="#">
            <i class="fa fa-fw fa-link"></i>
            <span class="nav-link-text">Link</span>
          </a>
        </li>
      </ul>
    </div>
  </nav>
  <div class="content-wrapper">
    <!-- /.container-fluid-->
    <!-- /.content-wrapper-->
    <footer class="sticky-footer">
      <div class="container">
        <div class="text-center">
          <small>Copyright © Your Website 2017 / More Templates <a href="#" target="_blank" title="JLK">JLK</a> - Collect from <a href="#" title="JLK" target="_blank">JLK</a></small>
        </div>
      </div>
    </footer>
    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
      <i class="fa fa-angle-up"></i>
    </a>
    <!-- Logout Modal-->
    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
            <button class="close" type="button" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">×</span>
            </button>
          </div>
          <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
          <div class="modal-footer">
            <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
            <a class="btn btn-primary" href="login.html">Logout</a>
          </div>
        </div>
      </div>
    </div>
    <!-- Bootstrap core JavaScript-->
    <script src="/Mshop/js/back/admin-js/jquery.min.js"></script>
    <script src="/Mshop/js/back/admin-js/bootstrap.bundle.js"></script>
    <!-- Core plugin JavaScript-->
    <script src="/Mshop/js/back/admin-js/jquery.easing.min.js"></script>
    <!-- Page level plugin JavaScript-->
    <script src="/Mshop/js/back/admin-js/Chart.min.js"></script>
    <script src="/Mshop/js/back/admin-js/jquery.dataTables.js"></script>
    <script src="/Mshop/js/back/admin-js/dataTables.bootstrap4.js"></script>
    <!-- Custom scripts for all pages-->
    <script src="/Mshop/js/back/admin-js/sb-admin.min.js"></script>
    <!-- Custom scripts for this page-->
    <script src="/Mshop/js/back/admin-js/sb-admin-datatables.min.js"></script>
    <script src="/Mshop/js/back/admin-js/sb-admin-charts.min.js"></script>
    <!-- jlk.js -->
    <script src="/Mshop/js/jlk.js"></script>
  </div>
</body>

</html>
