<%@ page contentType="text/html; charset=utf-8"%>
    <body class="">  

    <div class="navbar">
        <div class="navbar-inner">
            <div id="form">
                <form action="#" class="entypo-search">
                  <i class="icon-search"></i><input id="search" placeholder="Search" />
                </form>  
            </div>
            <ul class="nav pull-right">
             <li id="fat-menu" class="dropdown">    
                <a href="/app_info/login" role="button" class="dropdown-toggle" data-toggle="dropdown" id="my-menu"> 
                <i class="icon-user"></i><span>${sessionScope.USER_SESSION_KEY}</span><i class="icon-caret-down"></i>
                </a>

                <ul class="dropdown-menu">
                    <li>
                        <a tabindex="-1" href="#">账户信息</a>
                    </li>
                    <li class="divider"></li>
                    <li>
                        <a tabindex="-1" href="#">设置</a>
                    </li>
                    <li class="divider visible-phone"></li>
                    <li>
                        <a tabindex="-1" href="#">注销</a>
                    </li>
                </ul>
            </li>
        
        </ul>
        <a class="brand" href="<%=path %>/login.jsp">
            <img src="<%=basePath %>image/app_info/logo.png" width="189" />
        </a>
    </div>
    </div>
        <!-- 右侧边栏 -->
         <!--  <nav class="main-menu">
            <ul>
                <li>
                    <a href="#">
                        <i class="icon-home"></i>
                        <span class="nav-text">
                            主页
                        </span>
                    </a>
                  
                </li>
                <li class="has-subnav">
                    <a href="#">
                        <i class="icon-repeat"></i>
                        <span class="nav-text">
                            刷新
                        </span>
                    </a>                  
                </li>
                <li>
                    <a href="#">
                        <i class="icon-thumbs-up"></i>
                        <span class="nav-text">
                            赞一个
                        </span>
                    </a>
                  
                </li>
                <li class="has-subnav">
                    <a href="#">
                        <i class="icon-download"></i>
                        <span class="nav-text">
                            数据下载
                        </span>
                    </a>
                    
                </li>
            </ul>
        </nav> -->
    <div class="sidebar-nav">
<!--     <a href="/app_info/welcome">
    " class="nav-header" >
     行业概览
    </a> -->
    <a href="<%=path %>/MainController/toMainPage.do" class="nav-header" >企业可视化
    </a>
    <a href="<%=path %>/search_engine.jsp" class="nav-header" >企业百科
    </a>
    <a href="#dashboard-menu" class="nav-header" data-toggle="collapse">
        应用市场<i class="icon-chevron-down"></i>   
    </a>
    <ul id="dashboard-menu" class="nav nav-list collapse in">
        <li>
            <a class="dir" href="<%=path %>/MainController/toDoubanReviewPage.do">移动应用</a>
        </li> 
        <li >
            <a class="dir" href="<%=path %>/MainController/toDoubanReviewPage.do">手机游戏</a>
        </li>

    </ul>
    <a href="<%=path %>/project.jsp" class="nav-header" >创投项目库
    </a>
    </div>
