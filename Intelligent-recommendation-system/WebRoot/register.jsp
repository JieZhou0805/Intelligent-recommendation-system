<%@ page language="java" contentType= "text/html;charset=gb2312" %>
<html>

	<head>
		<title>ע��ҳ��</title>
		<style type="text/css">
		body
		{
		opacity:0.9;
		background-color:#E0FFFF;
		}
		.title
		{

			margin:auto;
			width:25%;
			background-color:#E0FFFF;
		}
		.table
		{
			font-size:25px;
			position:absolute;
			top:100px;
			left:650px;
			margin:auto;
			width:25%;
			background-color:#E0FFFF;
		}
        .a{
            position:absolute;
			top:250px;
			left:720px;
            vertical-align:middle;
            background-color:#E0FFFF;
        }
		lable { float: left; width: 7em; margin-right:1em; text-align: right; }
				h1{
			text-align:center;
			color:#99696b;
			margin-bottom:30px;
			 font-family:"��Բ";
			 font-size:50px;
		}
		.bottom{
			width:100%;
			position:fixed;
			bottom:30px;
		}
		.bottom .introduction{
			text-align:center;
			font-size:13px;
			margin-top:5px;
			
		}
				.photo{
			position:absolute;
			left:0px;
			bottom:55px;
			
		}
</style>
	</head>
	<body background="background3.jpg">
	<div class="title">
		<h1>�û�ע��</h1>
	</div>
	<BR><BR>
	<div class="table">
	
		
			��   &nbsp�� &nbsp����<input name="username" type="text" placeholder="�������û���" /><BR>
			��  &nbsp&nbsp &nbsp &nbsp�룺<input id="pwd2" name="password1" type="password" placeholder="����������"/><BR>
			ȷ�����룺<input name="password2" type="password"/><BR>
			��  &nbsp&nbsp &nbsp &nbsp��
				<input name="sex" type="radio" value="��" checked>��
				<input name="sex" type="radio" value="Ů" >Ů<BR>
				
				<BR></div>
		<div class="a">
			<input type="submit" value ="�ύ" onclick="javascript:history.back()" />
			<input type="reset"  value="ȡ��">
		</div>
		
	

    	 <div class="photo">
          <img src="pic/flightQuery/goHome.jpg" width = "280" height = "300" ><br>
     </div>
    	 
    	 <div class="bottom">
	 	<hr>
	 	<div class="introduction">�ÿ��г������Ƽ�ϵͳ</div>
	 	</hr>
	 </div>


	</body>


</html>