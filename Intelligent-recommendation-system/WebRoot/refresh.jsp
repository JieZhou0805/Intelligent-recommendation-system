<%@ page language="java" pageEncoding="gb2312"%>
<html>
	<body>
	<script type="text/javascript">
		function refresh(){
			//����ֻ�������ֵ���֤��
			//loginForm.imgValidate.src = "validate.jsp?id=" + Math.random();
			//���ɰ������ֺ��ַ�����֤��
			loginForm.imgValidate.src = "validateMix.jsp?id=" + Math.random();
		}
	</script>
	��ӭ��¼��ϵͳ<BR>
	<form name="loginForm" action="servlet/ValidateServlet1" method="post">
		<table>
			<tr>
				<td>���������˺�:</td>
				<td><input type="text" name="account" /></td>
			</tr>
			<tr>
				<td>������������: </td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td>��������֤��:</td>
				<td><input type="text" name="code" size="10">
				<!-- ����ֻ�������ֵ���֤�� -->
				<img name="imgValidate" src="validate.jsp" style="vertical-align: middle;"></td>
				<!-- ���ɰ������ֺ��ַ�����֤�� -->
				<!-- 
				<img name="imgValidate" src="validateMix.jsp" style="vertical-align: middle;"></td>
				 -->
				<td><a onclick="refresh()" href="#" style="font-size: 10; text-decoration: none;">���»�ȡ��֤��</a></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="��¼">	</td>
			</tr>
		</table>
	</form>		
	</body>
</html>
