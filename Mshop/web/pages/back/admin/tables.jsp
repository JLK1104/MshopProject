<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String listUrl=basePath+"MemberServletBack/list";
String updateActive=basePath+"MemberServletBack/updateStatus?active";
String updatelock=basePath+"MemberServletBack/updateStatus?lock";
//StringBuffer status= request.getRequestURL();
//String status=request.getParameter("status");
%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Memberlist</title>
  <!-- Bootstrap core CSS-->
  <link href="/Mshop/CSS/back/bootstrap.min.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="/Mshop/CSS/back/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Page level plugin CSS-->
  <link href="/Mshop/CSS/back/dataTables.bootstrap4.css" rel="stylesheet">
  <!-- Custom styles for this template-->
  <link href="/Mshop/CSS/back/sb-admin.css" rel="stylesheet">
</head>

<body class="fixed-nav sticky-footer bg-dark" id="page-top">
  <!-- Navigation-->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" id="mainNav">
    <a class="navbar-brand" href="/Mshop/index.jsp">微商城</a>
    <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarResponsive">
      <ul class="navbar-nav navbar-sidenav" id="exampleAccordion">
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Charts">
          <a class="nav-link" href="charts.html" >
            <i class="fa fa-fw fa-area-chart"></i>
            <span class="nav-link-text">图表</span>
          </a>
        </li>
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Components">
          <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapselist" >
            <i class="fa fa-fw fa-table"></i>
            <span class="nav-link-text">用户列表</span>
          </a>
          <ul class="sidenav-second-level collapse" id="collapselist">
            <li>
              <a href="#">用户总列表</a>
            </li>
            <li>
              <a href="#">锁定用户</a>
            </li>
            <li>
              <a href="#">激活用户</a>
            </li>
            <li>
              <a href="#">待激活用户</a>
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
    <div class="container-fluid">
      <!-- Breadcrumbs-->
      <ol class="breadcrumb">
        <li class="breadcrumb-item">
          <a href="#">Dashboard</a>
        </li>
        <li class="breadcrumb-item active">Tables</li>
      </ol>
      <!-- Example DataTables Card-->
      <div class="card mb-3">
        <div class="card-header">
          <i class="fa fa-table"></i> Data Table Example
        </div>
<%--     <jsp:include page="split_page_plugin_search.jsp"/> --%>
<%--     <c:if test="${allMembers!=null}" var="res"> --%>
<!--         <table border="1" cellpadding="5" cellspacing="0" bgcolor="#f2f2f2" width="100%">         -->
<!--               <tr> -->
<!--                  <td><input type="checkbox" onclick="allcheck(this,'mid')"></td> -->
<!--                  <td>用户ID</td> -->
<!--                  <td>姓名</td> -->
<!--                  <td>电话</td> -->
<!--                  <td>注册日期</td> -->
<!--                  <td>状态</td> -->
<!--               </tr> -->
<%--               <c:forEach items="${allMembers}" var="member"> --%>
<!--                  <tr> -->
<%--                     <td><input type="checkbox" id="mid" name="mid" value="${member.mid}"></td> --%>
<%--                     <td>${member.mid}</td> --%>
<%--                     <td>${member.name}</td> --%>
<%--                     <td>${member.tel}</td> --%>
<%--                     <td>${member.regdate}</td> --%>
<!--                     <td> -->
<%--                         <c:if test="${member.status==0 }"> --%>
<!--                                                                                       锁定 -->
<%--                         </c:if> --%>
<%--                         <c:if test="${member.status==1 }"> --%>
<!--                                                                                       激活 -->
<%--                         </c:if> --%>
<%--                         <c:if test="${member.status==2 }"> --%>
<!--                                                                                      未激活                                                          -->
<%--                         </c:if> --%>
<!--                     </td> -->
<!--                  </tr> -->
<%--               </c:forEach> --%>
<!--         </table> -->
<%--         </c:if> --%>
<%--     <jsp:include page="split_page_plugin_bars.jsp"/><br> --%>

    <jsp:include page="ALLlist.jsp"/><br>
    <span><input type="button" value="批量激活" onclick="updateAll(<%=updateActive%>,'all','mid')">&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="button" value="批量锁定" onclick="updateAll(<%=updatelock%>,'all','mid')"></span>
      </div>
    </div>
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
    <!-- <script src="/Mshop/js/back/admin-js/bootstrap.bundle.min.js"></script> -->
    <!-- Core plugin JavaScript-->
    <script src="/Mshop/js/back/admin-js/jquery.easing.min.js"></script>
    <!-- Page level plugin JavaScript-->
    <script src="/Mshop/js/back/admin-js/jquery.dataTables.js"></script>
    <script src="/Mshop/js/back/admin-js/dataTables.bootstrap4.js"></script>
    <!-- Custom scripts for all pages-->
    <script src="/Mshop/js/back/admin-js/sb-admin.min.js"></script>
    <!-- Custom scripts for this page-->
    <script src="/Mshop/js/back/admin-js/sb-admin-datatables.min.js"></script>
    <!-- 全选按钮，批量删除修改 -->
    <script type="text/javascript" src="/Mshop/js/jlk.js"></script>
	</div>
</body>

</html>
