<%@ page language="java" contentType= "text/html;charset=gb2312" %>
<html>

	<head>
		<title>ע��ҳ��</title>
		<style type="text/css">
		.title
		{
			margin:auto;
			width:25%;
			background-color:#b0e0e6;
		}
		.table
		{
			margin:auto;
			width:25%;
			background-color:#b0e0e6;
		}
        .a{
            text-align:center;
            vertical-align:middle;
        }
		lable { float: left; width: 7em; margin-right:1em; text-align: right; }
		h1	  {text-align: center}
</style>
	</head>
	<body background="background3.jpg">
	<div class="title">
		<h1>�û�ע��</h1>
	</div>
	<div class="table">
	
		<form action = "mainpage.jsp" method = "post">
			<lable>�û���</lable><input name="username" type="text" placeholder="�������û���" /><BR>
			<lable>����</lable><input id="pwd2" name="password1" type="password" placeholder="����������"/><BR>
			<lable>ȷ������</lable><input name="password2" type="password"/><BR>
			<lable>�Ա�</lable>
				<input name="sex" type="radio" value="��" checked>��
				<input name="sex" type="radio" value="Ů" >Ů<BR>
		<div class="a">
			<input type="submit" value ="�ύ">
			<input type="reset"  value="ȡ��">
		</div>
		</form>
	</div>

<!-- 		<SCRIPT language = javascript>
  		 	 document.onkeydown = chang_page;
   			 function chang_page() 
   			 {
        	 	if (event.keyCode == 39 || event.keyCode == 40) location = 'show_log.jsp'
    		 }
		</SCRIPT>
		 -->


	</body>


</html>