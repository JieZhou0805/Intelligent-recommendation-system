<%@ page language="java" contentType= "text/html;charset=gb2312" %>
<html>
<head>
<meta charset="utf-8">
<title>��������</title>
	<script src = "jquery-3.3.1.min.js"></script>
	<script>
		$(document).ready( function(){
			$("#submit").click(event,function(){
				if (1){
	 			alert("��Ϣ��ȷ������������Ϊ000000");
				}
				if(0){
				alert("��Ϣ�����޷��޸�����");
				}/*�ύ��Ϣ�����ݿⲢ�ж�*/
			});
		});
	</script>
							  
</head>

<body>

		<p>�û�����<input type="text" name="number" size="20" maxlength="10"></p>

 		<button id="submit"> ȷ�� </button>
	 
</body>
</html>
