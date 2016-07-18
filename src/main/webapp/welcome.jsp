<%@ page contentType="text/html; charset=utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>企业信息库</title>
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

  <link rel="stylesheet" type="text/css" href="<%=basePath %>css/app_info/bootstrap.css">
  <link rel="stylesheet" type="text/css" href="<%=basePath %>css/app_info/theme.css">
  <link rel="stylesheet" href="<%=basePath %>css/app_info/font-awesome.css">
  <link rel="stylesheet" href="<%=basePath %>css/app_info/loading.css">
  <script src="<%=basePath %>js/jquery/jquery.js" type="text/javascript"></script>     
    <style type="text/css">
        #line-chart {
            height:300px;
            width:800px;
            margin: 0px auto;
            margin-top: 1em;
        }
        #rightList li span {  
            float:right;
            padding-right: 40px;   
        }  
        .page-title:hover {
            cursor:pointer;
            color: #0088cc;
        }
        .message-sidebar {
            overflow: auto;
            height: 350px;
            scrollbar-base-color: #222;
          scrollbar-3dlight-color: #222;
          scrollbar-highlight-color: #222;
          scrollbar-track-color: #3e3e42;
          scrollbar-arrow-color: #111;
          scrollbar-shadow-color: #222;
          scrollbar-dark-shadow-color: #222; 
            -ms-overflow-style: -ms-autohiding-scrollbar;
        }
        .btn-ratio {
            border: none;
            border-radius:7px;
            background:#B8DFE1;
            color: #0aa;
        }
        .btn-ratio:hover {
            background:#B8DFE1;
            color: #0aa;
        }
        .message-sidebar p{
            margin:0;
            color: #555;
        }
        .message-sidebar tr:hover{
            background: #ddd;
            cursor: pointer;    
        }
        ::-webkit-scrollbar {
          width: 3px;
          height: 13px;
        }
        .icon-arrow-up {
            color: red;
        }
        .icon-arrow-down {
            color: green;
        }
        .jumbotron h2,p{
            color:#555;
            text-align: center;
        }
        .mod-date {
            background: #B8DFE1;
            font-size: 16px;
            border-radius:7px;
            padding: 10px 10px 10px 10px;
        }
        .icon-chevron-left:hover,.icon-chevron-right:hover {
            color: #09a;
            cursor: pointer;
        }
    </style>
    <%@include file="header.jsp"%>
    <div class="content" data-main>
        <div id="loading">
            <div id="loading-center">
            <div id="loading-center-absolute">
            <div class="object" id="object_one"></div>
            <div class="object" id="object_two"></div>
            <div class="object" id="object_three"></div>
            <div class="object" id="object_four"></div>
            <div class="object" id="object_five"></div>
            <div class="object" id="object_six"></div>
            <div class="object" id="object_seven"></div>
            <div class="object" id="object_eight"></div>
            <div class="object" id="object_nine"></div>
            </div>
            </div>
 
        </div>

    <div class="breadcrumb">
            <span rel="tooltip" title="点击隐藏/还原导航栏" class="icon-chevron-left" data-sidebar-button >&nbsp;行业概览</span>
    </div>
    <div class="container-fluid">
        <div class="row-fluid">
            <div class="row-fluid">

                <div class="alert alert-info">
                    <button type="button" class="close" data-dismiss="alert">×</button> <strong>Just a quick note:</strong>
                    请谨慎对数据操作，后台会保存您的操作记录!
                </div>
                 <div class='jumbotron'>
                    <h2>本周行业数据统计</h2>
                    <p>数据每周一更新，本站所提供的数据仅供内部使用</p>
                </div>
                <hr>
            <div class="row-fluid">
                <div class="span3">
                  <div class="row-fluid"><h5>本周类目下载量统计(万次)</h5></div>
                  <div class="message-sidebar">
                   <table border="0" cellspacing="1" cellpadding="8">
                        <tbody>
                            <c:forEach items="${movielist}" var="movie">
                                <tr class="message-tr">
                                    <td>
                                        <p><i class="icon-briefcase"></i>&nbsp;${movie}</p>
                                    </td>
                                    <td>
                                        <p> 
                                            <c:choose>
                                                <c:when test="<%=(Math.random()>0.5)%>">
                                                  <i class="icon-arrow-up"><%out.print(Math.round(Math.random()*10)+1);%></i>
                                                </c:when>
                                                <c:otherwise>
                                                    <i class="icon-arrow-down"><%out.print(Math.round(Math.random()*10)+1);%></i>
                                                </c:otherwise>
                                            </c:choose>
                                        </p>
                                    </td> 
                                    <td>
                                    <button class="btn btn-ratio" style="width:<%out.print(Math.round(Math.random()*100));%>px"><%out.print(Math.round(Math.random()*100));%></button>
                                    </td>
                                </tr>
                            </c:forEach>                       
                        </tbody>
                    </table>
                  </div>        
                </div>
                <div class="span9">
                  <div id="container" style="min-width: 600px; height: 400px; margin: 0 auto"></div>
                </div>
            </div>
            <br>
            <div class="row-fluid">
                <div class="span3">
                <div class="row-fluid"><h5>时间区域选择</h5></div>
                <br>
                <span class='mod-date center-block'><i class="icon-calendar">&nbsp;&nbsp;</i><i class="icon-chevron-left">&nbsp;&nbsp;&nbsp;</i>2015-<span class="pic-date">9</span>&nbsp;&nbsp;&nbsp;<i class=" icon-chevron-right"></i></span>
                </div>
                <div class="span9">
                  <div id="container2" style="min-width: 600px; height: 400px; margin: 0 auto"></div>
                </div>
            </div>
                <div class="block">
                    <a href="#page-stats" class="block-heading" data-toggle="collapse">Latest Stats</a>
                    <div id="page-stats" class="block-body collapse in">

                        <div class="stat-widget-container">
                            <div class="stat-widget">
                                <div class="stat-button">
                                    <p class="title">2,500</p>
                                    <p class="detail">Accounts</p>
                                </div>
                            </div>

                            <div class="stat-widget">
                                <div class="stat-button">
                                    <p class="title">3,299</p>
                                    <p class="detail">Subscribers</p>
                                </div>
                            </div>

                            <div class="stat-widget">
                                <div class="stat-button">
                                    <p class="title">$1,500</p>
                                    <p class="detail">Pending</p>
                                </div>
                            </div>

                            <div class="stat-widget">
                                <div class="stat-button">
                                    <p class="title">$12,675</p>
                                    <p class="detail">Completed</p>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
            <footer>
                <hr>
                <p class="pull-right">
                    A Website
                    for Internal Use
                </p>

                <p class="pull-left">
                    &copy; 2012
                    <a href="http://www.aliyun.com" target="_blank">Aliyun</a>
                </p>
            </footer>

        </div>
    </div>
    </div>

  <script src="<%=basePath %>js/app_info/bootstrap.js"></script>
  <script src="<%=basePath %>js/app_info/jquery.cookie.js"></script>
  <script src="<%=basePath %>js/app_info/app.js"></script>    
  <script src="<%=basePath %>js/app_info/highcharts.js"></script>
  <script type="text/javascript">
        document.onreadystatechange = subSomething;
        function subSomething() { 
            if (document.readyState == "complete" ) {
                $("#loading").fadeOut(500); 
            }
        }
        $("[rel=tooltip]").tooltip();
        $(document).ready(function() {
            var hm="<{$current_user->_nickname}>";
            $(".message-tr:first").css('background','#ddd');
            $(".message-tr").click(function(){
                chart.series[0].setData([Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90]);
                chart.series[1].setData([Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90]);
                chart2.series[0].setData([Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90]);
                chart2.series[1].setData([Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90]);
                $(".message-tr").css('background','#fff');
                $(this).css('background','#ddd');
            })
            $(".icon-chevron-left").click(function(){            
                if($(".pic-date").text()>1) {
                    chart2.series[0].setData([Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90]);
                    chart2.series[1].setData([Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90]);
                    $(".pic-date").text($(".pic-date").text()-1);
                }
            }); 
            $(".icon-chevron-right").click(function(){
                if($(".pic-date").text()<11) {
                    chart2.series[0].setData([Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90]);
                  chart2.series[1].setData([Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90]);
                   $(".pic-date").text($(".pic-date").text()*1+1);
                }
            }); 
            var chart;
            var chart2;
            chart = new Highcharts.Chart({
                chart: {
                    type: 'column',
                    renderTo: 'container'
                },
                title: {
                    text: '本周该行业消费和投资预估'
                },
                subtitle: {
                    text: 'Source: aliyun.com'
                },
                xAxis: {
                    categories: [
                        'oss',
                        'cdn',
                        'database',
                        'server',
                        'total',
                        'others'
                    ]
                },
                yAxis: {
                    min: 0,
                    title: {
                        text: 'value ($)'
                    }
                },
                tooltip: {
                    headerFormat: '<span style="font-size:10px">{point.key}</span>',
                    pointFormat: '' +
                        '',
                    footerFormat: '<table><tbody><tr><td style="color:{series.color};padding:0">{series.name}: </td><td style="padding:0"><b>{point.y:.1f} $</b></td></tr></tbody></table>',
                    shared: true,
                    useHTML: true
                },
                plotOptions: {
                    column: {
                        pointPadding: 0.2,
                        borderWidth: 0
                    }
                },
                series: [{
                    name: '消费',
                    data: [49.9, 71.5, 106.4, 129.2, 144.0, 176.0]

                }, {
                    name: '投资预估',
                    data: [83.6, 78.8, 98.5, 93.4, 106.0, 84.5]

                }]
            });
            chart2 = new Highcharts.Chart({
                chart: {
                    type: 'spline',
                    renderTo: 'container2'
                },
                title: {
                    text: '该行业近期热度趋势图'
                },
                subtitle: {
                    text: 'Source: aliyun.com'
                },
                xAxis: {
                    categories: [
                        '2015.6',
                        '2015.7',
                        '2015.8',
                        '2015.9',
                        '2015.10',
                        '2015.11'
                    ]
                },
                yAxis: {
                    min: 0,
                    title: {
                        text: 'Counts (times)'
                    }
                },
                tooltip: {
                    headerFormat: '<span style="font-size:10px">{point.key}</span>',
                    pointFormat: '' +
                        '',
                    footerFormat: '<table><tbody><tr><td style="color:{series.color};padding:0">{series.name}: </td><td style="padding:0"><b>{point.y:.1f} $</b></td></tr></tbody></table>',
                    shared: true,
                    useHTML: true
                },
                plotOptions: {
                    column: {
                        pointPadding: 0.2,
                        borderWidth: 0
                    }
                },
                series: [{
                    name: '周下载数',
                    data: [49.9, 71.5, 106.4, 129.2, 144.0, 176.0]

                }, {
                    name: '周评论数',
                    data: [83.6, 78.8, 98.5, 93.4, 106.0, 84.5]

                }]
            });
        });
</script>

</body>
</html>
