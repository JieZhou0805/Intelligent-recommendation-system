<%@ page language="java" pageEncoding="gb2312"%>
<html>
	<body style="background:url(pic/background_yc.jpg) ;background-size:cover; ">
		ͷ���ϴ�
		<hr>
		<form action="/Intelligent-recommendation-system/servlet/UploadServlet" method="post" 
			enctype="multipart/form-data">
			��ѡ��һ��ͼƬ�����ϴ���
			<input type="file" name="myFile">
			<input type="submit" value="�ϴ�">
		</form>
		${msg}
	</body>
</html>
