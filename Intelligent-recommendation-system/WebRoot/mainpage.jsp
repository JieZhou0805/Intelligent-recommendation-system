<%@ page language="java" contentType= "text/html;charset=utf-8" %>
<html>

	<head>
		<title>地铁查询系统</title>
	    <meta charset="utf-8">
	    
		<style type="text/css">
		*{margin: 0;padding: 0;}
		.clearfix:before,.clearfix:after { content:"";display:table; }
		.clearfix:after {clear:both;}
		.clearfix { *zoom:1;}

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
			 font-family:"幼圆";
			 font-size:50px;
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
        	background-color: #74c8bc;
        }
        .main option{
        font-family:"楷体";
        }
        .main .begin{
        width:100px;
        position:absolute;
        left:35px;
        font-size:25px;
        font-family:"楷体";
        padding:5px 20px;
        }

        .main .radio{
        margin:auto;
        font-size:25px;
        font-family:"楷体";
        padding:5px 30px;
        }
        .main form input
        {
			
        	margin-top:130px;
        	padding:5px;
        	border:1px solid #3e3a37;
        	-webkit-border-radius:10px;
        }
        .main form{
        	padding:20px 73px;
        	position:relative;
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
			background-color:#E0FFFF;
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
		.login{
			float:left;
			margin-top:2px;
			margin-right:7px;
		}
		.photo{
			position:absolute;
			left:0px;
			bottom:55px;
			
		}

</style>
	</head>
		<body>

		
		
		 <!--  导航栏开始 -->
	    <div class="shortcut">
    	<div class="w">
    		<ul class="fl">
    			<li>
    			   南昌
    		    </li>
    		</ul>
    		<ul class="fr">
    		<li>
    				<a href="1.jsp">首页</a>
    			</li>
    			<li>
    				<%
    String flag = "";
    Object object = session.getAttribute("flag");
    if(object != null) {
        flag = object.toString();
    }
    if(flag.equals("login_success")) {
%>
        <a href="<%= request.getContextPath() %>/LogoutServlet">退出</a>
<%
    } else {
%>
		<div class="login">
        	<a href="<%= request.getContextPath() %>/login.jsp">登录</a><br/>
        </div>
<%
    }
%>
  
<%
      if(flag.equals("login_success")) {
      String userName = "stydt";
%>
        <a href="mine.jsp" class="style-red"><%=userName%> </a>
<%
    } else {
%>
        	<a href="register.jsp" class="style-red">免费注册</a>
       
<%
    }
%>   	
    			</li> 
    			<li class="spacer"></li>
    			<li>
    				<a href="mine.jsp">用户反馈</a>
    			</li>
    	    	<li class="spacer"></li>
    			<li>
    				<a href="mine.jsp">关于我们</a>
    			</li>
    			<li class="spacer"></li>
    		</ul>
    	</div>
    </div>
    <div><br></div>
    	<div align="center">
			<img src="pic/flightQuery/car(1).gif" width = "800" height = "50" ><br>
		</div>
		<div><br></div>
     <!--  页面中心开始 -->
     <h1>北京地铁查询</h1>
	 
	<div class="main">
	<form action = "servlet/queryWithServlet1" method = "post">
		<div class="begin">
		出发地
    	<select name="startStation">
    		<option value="五棵松站">五棵松站</option>
    		<option value="古城站">古城站</option>
    		<option value="天安门西站">天安门西站</option>
    		<option value="王府井站">王府井站</option>
    		<option value="国贸站">国贸站</option>
    		<option value="南礼士路站">南礼士路站</option>
    		<option value="西单站">西单站</option>
    	</select>
        <br>
         
                <br>
    	目的地
    	<select name="endStation">
    		<option value="苹果园站">苹果园站</option>
    		<option value="复兴门站">复兴门站</option>
    		<option value="崇文门站">崇文门站</option>
    		<option value="钟灵街站">钟灵街站</option>
    		<option value="北京站">北京站</option>
    		<option value="宣武门站">宣武门站</option>
    		<option value="建国门站">建国门站</option>
    	</select>
    	</div>
        <br>

	<input type="submit"  value ="查询" >
	</form>
	 </div>
	 <div class="photo">
          <img src="pic/flightQuery/goHome.jpg" width = "280" height = "200" ><br>
     </div>
	 <div class="bottom">
	 
	 	<hr>
	 	<div class="introduction">旅客行程智能推荐系统</div>
	 	</hr>
	 </div>
             	
	</body>


</html>