<%@ page language="java" pageEncoding="gb2312"%>
<html>
<style type="text/css">
  		body
		{
			opacity:0.9;
		background-color:#E0FFFF;}
		.w{
			
			position:absolute;
			left:550px;
			top:120px;
		}
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
			
		</style>
	<body >
	
		<h1>ͷ���ϴ�</h1>
		<hr>
		<br>
		<div class="w">
		<form action="/Intelligent-recommendation-system/servlet/UploadServlet" method="post" 
			enctype="multipart/form-data">
			��ѡ��һ��ͼƬ�����ϴ���
			<input type="file" name="myFile">
			<input type="submit" value="�ϴ�">
			
		</form>
		
		${msg}
		</div>

    	 
    	 <div class="bottom">
	 	<hr>
	 	<div class="introduction">�ÿ��г������Ƽ�ϵͳ</div>
	 	</hr>
	 </div>
	</body>
</html>
