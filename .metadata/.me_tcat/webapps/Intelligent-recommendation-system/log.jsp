<%@ page language="java" contentType= "text/html;charset=gb2312" %>
<html>

	<head>
		<title>��¼ҳ��</title>
	    <meta charset="utf-8">
	    
		<style type="text/css">
		.title
		{
			font-size: 300%

		}
		.table
		{
			margin:auto;
			width:25%;
			background-color:#b0e0e6;
		}
		lable { float: left; width: 7em; margin-right:1em; text-align: right; }
		h1	  {text-align: center
		}

        .a{
            text-align:center;
            vertical-align:middle;
        }
        img{max-width: 100%; height:auto;}

</style>
	</head>
	
	<body background="background.jpg">
	<h1 class=title>��ӭ�����ÿ��г������Ƽ�ϵͳ��</h1>
    <div class="table">
    	<lable>�û�����</lable><input type="text" name="number" placeholder="�������û���" size="15" maxlength="10"/>
        <!--ѧ��Ϊ10λ-->
        <br>
        <lable>���룺</lable><input type="password" name="passport" placeholder="����������" size="15" maxlength="10"/>
        <br>
    </div>
    <br>


	<div class=a>
	
    <form action = "mainpage.jsp" method = "post">
		<input type="submit" value ="��¼">
	</form> 
    <form action = "forget_pswd.jsp" method = "post">
		<input type="submit" value ="��������">
	</form>  
	      
	</div>
	
	</body>


</html>