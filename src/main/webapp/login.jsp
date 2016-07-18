<%@ page contentType="text/html; charset=utf-8" language="java"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
	<meta charset="utf-8">
	<title>loginPage</title>
	<link rel="stylesheet" type="text/css" href="<%=basePath %>css/app_info/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath %>css/app_info/theme.css">
	<script src="<%=basePath %>js/jquery/jquery.js" type="text/javascript"></script>
  	<style type="text/css">
  		body{
		  width:100%;
		  min-height:100%;
		  margin:0;
		  overflow:hidden;
		}
		canvas{
		  z-index:-999;
		  position:absolute;
		  top:0;
		  left:0;
		  bottom:0;
		  right:0;
		  background: linear-gradient(#dbf2f2, #FFffff);  
		}


		@keyframes anim {
		  from {
		    transform: translateX(200%);
		  }
		  to {
		    transform: translateX(-200%);
		  }
		}

		@keyframes anime {
		  from {
		    transform: translateX(0);
		  }
		  to {
		    transform: translateX(-200%);
		  }
		}
		.c1, .c2 {
		  width: 800px;
		  height: 700px;
		  position: absolute;
		  background: transparent url("https://s3-us-west-2.amazonaws.com/s.cdpn.io/131045/clouds.png") 0 0 no-repeat;
		  background-size: 100%;
		  z-index:-99;
		}
		.c1.one, .c2.one {
		  top: -260px;
		  left: 0px;
		}
		.c1.two, .c2.two {
		  top: -200px;
		  left: 100px;
		}
		.c1.three, .c2.three {
		  top: -240px;
		  right: 100px;
		}
		.c1.four, .c22.four {
		  top: -180px;
		  right: 0px;
		}

		.c2 .one {
		  top: -209px;
		}
		@media (max-width: 1023px) {
		  .c2.one {left: -80px;}
		  .c2.two {left: -120px;}
		  .c2.three {right: 220px;}
		  .c2.four {right: 220px;}
		}

		.c1 {
		  animation: anime 1000s linear infinite forwards;
		}

		.c2 {
		  transform: translateX(200%);
		  animation: anim 1000s linear infinite forwards;
		}

		#ehong-code-input{
			width:42px;
			letter-spacing:2px;
			margin:0px 8px 0px 0px;
		}
		.ehong-idcode-val{
			position:relative;
			padding:1px 4px 1px 4px;
			top:0px;
			*top:-3px;
			letter-spacing:4px;
			display:inline;
			cursor:pointer;
			font-size:36px;
			font-family:"Courier New", Courier, monospace;
			text-decoration:none;
			font-weight:bold;
		}
		.ehong-idcode-val0{
			border:solid 1px #A4CDED;
			background-color:#ECFAFB;
		}

		.ehong-idcode-val1{
			border:solid 1px #A4CDED;
			background-color:#FCEFCF;
		}
		.ehong-idcode-val2{
			border:solid 1px #6C9;
			background-color:#D0F0DF;
		}
		.ehong-idcode-val3{
			border:solid 1px #6C9;
			background-color:#DCDDD8;
		}
		.ehong-idcode-val4{
			border:solid 1px #6C9;
			background-color:#F1DEFF;
		}
		.ehong-idcode-val5{
			border:solid 1px #6C9;
			background-color:#ACE1F1;
		}
		.ehong-code-val-tip{
			font-size:12px;
			color:#1098EC;
			top:0px;
			*top:-3px;
			position:relative;
			margin:0px 0px 0px 4px;
			cursor:pointer;
		}
		#idcode {
            position:absolute;
	        top:528px;
            left:960px;

		}
  	</style>
</head>
<body>
	<canvas id="canv"></canvas>
	<div class="sky">
	  <div class="clouds">
	    <div class="c1 one"></div>
	    <div class="c1 two"></div>
	    <div class="c1 three"></div>
	    <div class="c1 four"></div>
	    <div class="c2 one"></div>
	    <div class="c2 two"></div>
	    <div class="c2 three"></div>
	    <div class="c2 four"></div>
	  </div>
	</div>
	<center>
	    <br>
	    <br>
	    <br>
	    <br>
	    <br>

		<img src="<%=basePath %>image/app_info/logo1.png" width="489"/>
	    <br>
	    <br>

		<h2>海量企业信息，与你分享</h2>
	    <br>
	    <br>
	    <div class="container">
	    	<a id="logintab" class="active" href="#">登录</a>
	    	<a id="logintab" href="#">注册</a>
	    	<a id='logintab' href="<%=path %>/MainController/toMainPage.do">匿名登录</a>
	    </div>
	    <br>
	    <form id="loginForm" accept-charset="UTF-8" method="POST" action="<%=path %>/MainController/login.do">
			<div class="input-group input-group-lg">
			  <input type="text" name="name" class="form-control" placeholder="用户名">
			</div>

			<div class="input-group input-group-lg">
			  <input type="password" name="passwd" class="form-control" placeholder="密码">
			</div>

			<div class="input-group input-group-lg">
			  <input type="text" class="form-control" placeholder="验证码">
			  <div id="idcode"></div>
			</div>
			<br>
			<button type="submit" class="btn-login">登录</button>
			<br>
			<br>
		</form>
<!-- 		<div><a href="#">匿名登录</a></div> -->
	</center>

	<script src="<%=basePath %>js/app_info/birds.js"></script>

	<script src="<%=basePath %>js/app_info/jquery.idcode.js"></script>
	<script>
		$(document).ready(function(){
			 $("#logintab").click(function(){
	 	        $("#logintab").attr("class",'')
        		$(this).attr("class",'active')
			 })
			 $.idcode.setCode();
		});
	</script>
</body>
</html>