<%@ page language="java" pageEncoding="UTF-8" import="cn.jlk.Servlet.*"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld" %>
<%
   String path = request.getContextPath();
   String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<%
   String url=null;
   int currentPage=1;
   int linesize=5;
   String column=null;
   String keyword=null;
   int allRecoders=0;
   int pageSize=0;
   int seed=3;
%>

<%//接受传递的参数
   url=(String)request.getAttribute("url");
   column=(String)request.getAttribute("column");
   keyword=(String)request.getAttribute("keyword");
   try{
       currentPage=(Integer)request.getAttribute("currentPage");
   }catch(Exception e){}
   try{
       linesize=(Integer)request.getAttribute("linesize");
   }catch(Exception e){}
   try{
       allRecoders=(Integer)request.getAttribute("allRecoders");
   }catch(Exception e){}
%>

<%
   //对总页数进行计算
   if(allRecoders%linesize==0){
       pageSize=allRecoders/linesize;
   }else{
       pageSize=(allRecoders/linesize)+1;
   }
%>


<script type="text/javascript">
    function goSplit(vcp){//根据外部传入的cp内容进行操作
       var eleLs=document.getElementById("lisel").value;
       try{ 
          var eleKw=document.getElementById("kw").value;
          var eleCol=document.getElementById("colsel").value;
          window.location="<%=basePath%><%=url%>?cp=" + vcp + "&ls=" + eleLs +"&kw=" + eleKw
          + "&col=" + eleCol ;
       }catch(Exception){
          window.location="<%=basePath%><%=url%>?cp=" + vcp + "&ls=" + eleLs ;
       }
    }
</script>

<div id="barsDIV" style="float:left;">
    <input type="button" value="首页" onclick="goSplit(1)" <%=currentPage==1?"disabled":"" %>>
    <input type="button" value="上一页" onclick="goSplit(<%=currentPage-1%>)" <%=currentPage==1?"disabled":"" %>>
    <input type="button" value="下一页" onclick="goSplit(<%=currentPage+1%>)" <%=currentPage==pageSize?"disabled":"" %>>
    <input type="button" value="尾页" onclick="goSplit(<%=pageSize%>)" <%=currentPage==pageSize?"disabled":"" %>>
             跳转到：<select id="cpsel" onchange="goSplit(this.value)">
      <%
        for(int x=1;x<=pageSize;x++){
      %>
           <option value="<%=x%>" <%=currentPage==x?"selected":"" %>><%=x%></option>
      <%
        }
      %>
      </select>页&nbsp;
                   每页显示<select id="lisel" onchange="goSplit(1)">
      <option value="5" <%=linesize==5?"selected":"" %>>5</option>
      <option value="10" <%=linesize==10?"selected":"" %>>10</option>
      <option value="15" <%=linesize==15?"selected":"" %>>15</option>
      </select>行数据&nbsp;
</div>
 

