<%@ page language="java" contentType= "text/html;charset=gb2312" %>
<html>

	<head>
		<title>XXXϵͳ</title>
	    <meta charset="utf-8">
	    
		<style type="text/css">
		*{margin: 0;padding: 0;}
		.clearfix:before,.clearfix:after { content:"";display:table; }
		.clearfix:after {clear:both;}
		.clearfix { *zoom:1;}

		body
		{
			opacity:0.9;
		background-color:#b9b6b252;
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
		lable { 
			float: left; 
			width: 7em; 
			margin-right:1em; 
			text-align: right;
		 }
		h1{
			text-align:center;
			color:#99696b;
			margin-bottom:30px;
			 font-family:"����";
		}
        div.a{
            text-align:center;
            vertical-align:middle;
        }
        img{
        	max-width: 100%;
        	 height:auto;
        }
        .main{
        	margin:auto;
        	border:1px solid #3e3a37;
        	border-style:ridge;
        	border-radius:20px;
        	width:200px;
        	height:280px;
        	padding:5px 30px;
        	background-color: #E3E4E5;
        }
        .main option{
        font-family:"����";
        }
        .main .begin{
        margin:auto;
        font-size:25px;
        font-family:"����";
        padding:5px 20px;
        }
         .main .arrive{
        margin:auto;
        font-size:25px;
        font-family:"����";
        padding:5px 20px;
        }
        .main .radio{
        margin:auto;
        font-size:25px;
        font-family:"����";
        padding:5px 30px;
        }
        .main form input
        {
        	margin:auto;
        	padding:5px;
        	border:1px solid #3e3a37;
        	-webkit-border-radius:10px;
        }
        .main form{
        	padding:20px 73px;
        }
		.w {
			width: 1190px;
			margin: auto;
		}
		.fr {
			float: right;
		}
		.fl {
			float: left;
		}
		.style-red {
			color: #f10215!important;
		}
		a {
			text-decoration: none;
		}
		li {
			list-style: none;
		}
		.shortcut {
			height: 30px;
			background-color: #E3E4E5;
			border-bottom: 1px solid #DDD;
			line-height: 30px;
		}
		.shortcut a {
			color: #9D9D9D;
			font-size: 12px; 
			text-decoration: none;
		}
		.shortcut .fr li {
			float: left; 
		}
		.shortcut .fr li {
			margin-left: 10px;
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
</style>
	</head>
	
		<body>
		 <!--  ��������ʼ -->
	    <div class="shortcut">
    	<div class="w">
    		<ul class="fl">
    			<li>
    			   �ϲ�
    		    </li>
    		</ul>
    		<ul class="fr">
    			<li>
    				<a href="log.jsp">��ã����¼&nbsp;&nbsp;</a>
    				<a href="register.jsp" class="style-red">���ע�� </a>
    			</li> 
    			<li class="spacer"></li>
    			<li>
    				<a href="mine.jsp">��������</a>
    			</li>
    			<li class="spacer"></li>
    			<li class="dropdown">
    				<a href="#">�ҵ��г�</a>
    			</li>
    			<li class="spacer"></li>
    			<li>
    				<a href="mine.jsp">�û�����</a>
    			</li>
    	    	<li class="spacer"></li>
    			<li>
    				<a href="#">��������</a>
    			</li>
    			<li class="spacer"></li>
    		</ul>
    	</div>
    </div>
     <!--  ҳ�����Ŀ�ʼ -->
     <h1>��ӭ����never-404��</h1>
	 
	<div class="main">
		<div class="begin">
		������
    	<select name="startStation">
    		<option>�Ͼ�վ</option>
    		<option>�л���վ</option>
    		<option>������վ</option>
    	</select>
		</div>
        <br>
        <div class="arrive">
    	Ŀ�ĵ�
    	<select name="endStation">
    		<option>�Ͼ�վ</option>
    		<option>С��վ</option>
    		<option>������վ</option>
    	</select>
    	</div>
        <br>

	<div class="radio">
	<input type="radio" name="selection" checked>ʱ�����<br>
	<input type="radio" name="selection">�����<br>
	<input type="radio" name="selection">�����<br>
	</div>
	<form action = "Subway.java" method = "post">
		<input type="submit" value ="��ѯ" >
	</form>
	 </div>
	 <div class="bottom">
	 	<hr>
	 	<div class="introduction">�ÿ��г������Ƽ�ϵͳ</div>
	 </div>

	</body>


</html>