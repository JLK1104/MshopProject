<%@ page pageEncoding="UTF-8" %>
<%
   request.setCharacterEncoding("UTF-8");
%>
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
   String columnDate="用户ID:mid|用户名:name|手机电话:tel";
%>

<%
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
<html>
<body>
	<div id="seaDIV" style="float:left;">
		请输入查询关键字：<select id="colsel">
			<%
				String result[] = columnDate.split("\\|");
				for (int x = 0; x < result.length; x++) {
					String temp[] = result[x].split(":");
			%>
			<option value="<%=temp[1]%>"  id="col"
				<%=column.equals(temp[1]) ? "selected" : ""%>>
				<%=temp[0]%>
			</option>
			<%
				}
			%>
		</select> 
		<input type="text" id="kw" name="kw" value="<%=keyword%>"> 
		<span>
			<button type="submit" onclick="goSplit(1)">检索</button> 一共查询到<%=allRecoders %>条记录
		</span>
	</div>
</body>
</html>







