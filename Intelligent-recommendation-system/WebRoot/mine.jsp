<%@ page language="java" contentType= "text/html;charset=gb2312" %>
<html>

	<head>
	<script type="text/javascript">
		function showinfo(){
			alert("�ύ�ɹ���");
		}
	</script>
		<title>�ҵ�</title>
	    <meta charset="utf-8">
	    
		<style type="text/css">
		  		body
		{
		opacity:0.9;
		background-color:#E0FFFF;
		}
		div.title
		{
			margin:auto;
			width:25%;
			background-color:#b0e0e6;
		}
		div.table
		{
			margin:auto;
			width:25%;
			background-color:#b0e0e6;
		}
		lable { float: left; width: 7em; margin-right:1em; text-align: right; }
		h1	  {text-align: center}

        div.a{
            text-align:center;
            vertical-align:middle;
        }
        img{max-width: 100%; height:auto;}
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
		.w{
		position:absolute;
		left:265px;
		}
</style>
	</head>
	
	<body >
	<br>
	<div class="w">
	<h1><img src="pic/gundong.gif"  width="150"   height="80"><a href="uploadForm.jsp"><img src="pic/touxiang.png"  width="150"   height="300"></a><img src="pic/gundong.gif"  width="150"   height="80"></h1>

    	�л�����
    	<select>
    		<option>�ϲ�</option>
    		<option>����</option>
    		<option>������</option>
    	</select>
        <br>
        ��ǰ�汾��1.0.0

	<form>
		������ԣ�       <br>
		<textarea rows="15" cols="150" style="background:transparent;border:1px solid blue"></textarea><br>
		
		<br><div class="a">
			<input type="submit" value ="�ύ"  onclick="showinfo()">
			<input type="button"  value="����" onclick="javascript:history.back()" />
		</div>
	</form>
	</div>
		 <div class="bottom">
	 	<hr>
	 	<div class="introduction">�ÿ��г������Ƽ�ϵͳ</div>
	 	</hr>
	 </div>
	
	</body>


</html>