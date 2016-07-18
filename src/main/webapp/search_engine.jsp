<%@ page contentType="text/html; charset=utf-8" language="java"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Bootstrap Admin</title>
<meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<link rel="stylesheet" type="text/css" href="<%=basePath %>css/app_info/bootstrap.css">
<link rel="stylesheet" type="text/css" href="<%=basePath %>css/app_info/theme.css">
<link rel="stylesheet" href="<%=basePath %>css/app_info/font-awesome.css">
<link rel="stylesheet" href="<%=basePath %>css/app_info/loading.css">
<script src="<%=basePath %>js/jquery/jquery.js" type="text/javascript"></script>

<!-- Demo page code -->

<style type="text/css">
#line-chart {
  height:300px;
  width:800px;
  margin: 0px auto;
  margin-top: 1em;
}
.brand { font-family: georgia, serif; }
.brand .first {
  color: #19a;
  font-style: italic;
  font-size: 35px;
}
.brand .second {
  color: #bbb;
  font-weight: bold;
  font-size: 35px;
}
#rightList li span {  
  float:right;
  padding-right: 40px;   
}  
.top-content li {
  font-style: italic;
  font-weight: bold;
  font-size: 14px;
  padding: 7px 5px;
  margin: 0;
  border-bottom: solid 1px #f5f9e7;
  border-radius: 0 ;
  list-style: none;
}
.top-content li:hover {
  color:#19a;
}
.page-title:hover {
  cursor:pointer;
  color: #0088cc;
}
.jumbotron h2,p{
  color:#555;
  text-align: center;
}
.icon-chevron-left:hover,.icon-chevron-right:hover {
  color: #09a;
  cursor: pointer;
}
.input-group-btn:last-child > .btn {
  margin-left: -5px;
}
</style>
<%@include file="header.jsp"%> 
<div class="content" data-main>
  <div class="breadcrumb">
    <span rel="tooltip" title="点击隐藏/还原导航栏" class="icon-chevron-left" data-sidebar-button >&nbsp;企业百科</span>
  </div>
  <div id="loading" style="display:none">
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
  <div>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <h1 align='center' style="color:#3ab">企业<img src="<%=basePath %>image/app_info/icon.png" width="32"/>百科</h1>
    <br>
    <center>
      <div class="input-group">
        <input type="text" style="height:30px;width:600px;margin:0;border: 1px solid #ccc" 
        placeholder="请输入企业名称或App名称" value="" id="search_text"/>
        <span class="input-group-btn">
          <button class="btn btn-info btn-lg" id="search_engine" style="height:40px;background:#3ab;width:80px;border:none" type="button">搜索</button>
        </span>
      </div>
    </center>  
    <br>
    <br>
    <div class="container">
      <ul class="nav nav-pills" id="search-nav">
        <li role="presentation" class="active" tabindex='1'><a href="#">应用信息</a></li>
        <li role="presentation" tabindex='2'><a href="#">融资信息</a></li>
        <li role="presentation" tabindex='3'><a href="#">财务信息</a></li>
        <li role="presentation" tabindex='4'><a href="#">工商信息</a></li>
        <li role="presentation" tabindex='5'><a href="#">舆情信息</a></li>
        <li role="presentation" tabindex='6'><a href="#">合作伙伴</a></li>
      </ul>
      <table id="table1"class="table table-striped table-hover" id="example">
        <thead>
          <tr>
            <th style="width:6px;">
              BD&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            </th>
            <th>
              排名
            </th>
            <th>
              App名称
            </th>
            <th>
              所在企业
            </th>
            <th>
              总下载次数(万次)
            </th>
            <th>
              是否阿里云用户
            </th>
            <th>
              操作
            </th>
          </tr>
        </thead>
        <tbody id="data1">
        </tbody>
      </table>  
      <table id="table2"class="table table-striped table-hover" id="example">
        <thead >
          <tr>
            <th>
              融资需求
            </th>
            <th>
              App名称
            </th>
            <th>
              所在企业
            </th>
            <th>
              项目行业
            </th>
            <th>
              融资状态
            </th>
            <th>
              是否阿里云用户
            </th>
            <th>
              操作
            </th>
          </tr>
        </thead>
        <tbody id="data2">
        </tbody>
      </table> 
    </div>
  </div>
  <br>
  <br>
  <br>
  <br>
  <br>
  <!--         <div class="row-fluid">
            <footer>

                <p class="pull-right">
                    A Website
                    for Internal Use
                </p>

                <p class="pull-left">
                    &copy; 2012
                    <a href="http://www.aliyun.com" target="_blank">Aliyun</a>
                </p>
            </footer>
        </div> -->
</div>
<script src="<%=basePath %>js/app_info/bootstrap.js"></script>
<script src="<%=basePath %>js/app_info/jquery.cookie.js"></script>
<script src="<%=basePath %>js/app_info/app.js"></script>
<script src="<%=basePath %>js/app_info/layer/layer.js"></script>
<script type="text/javascript">
$("[rel=tooltip]").tooltip();
$(document).ready(function() {
  var search_info='';
  var hm="<{$current_user->_nickname}>";
  //搜索结果导航和表格默认隐藏
  $("#table1").hide();
  $("#search-nav").hide();
  $("#table2").hide();
  //获取应用信息搜索结果
  var search_appinfo = function() {
    $.ajax({
        url: "/api/app_info/ajax_search_engine_appinfo",
        type: "Post",
        data: {_search_info:search_info}, 
        success: function (resp) {   
        $("#loading").attr('style','display:none');             
        $("#data1").text("");
        $.each(eval("(" + resp + ")").data, function (index, item) { //遍历返回的json
          $("#data1").append('<tr>');
          if(decodeURI(item.track_user)!='null' || decodeURI(item.bd_manager)!='null' ) {
          $("#data1").append("<td><small style='color:green;font-weight:bold'>"+(decodeURI(item.bd_manager)=='null'?decodeURI(item.track_user):decodeURI(item.bd_manager))+"</small></td>");
          } else {
          $("#data1").append("<td><input type='checkbox'></td>");
          }       
          $("#data1").append('<td>' + item.app_rank + '</td>');
          $("#data1").append('<td>' + decodeURI(item.app_name) + '</td>');
          $("#data1").append('<td>' + (decodeURI(item.app_company)=='null'?'':decodeURI(item.app_company)) + '</td>');
          $("#data1").append('<td>' + (decodeURI(item.downcnt_total)/10000=='null'?'':decodeURI(item.downcnt_total)/10000) + '</td>');
          $("#data1").append('<td>' + (item.is_aliyunuser>0?'是':'否') + '</td>');
          $("#data1").append("<td><i id='parentIframe' class='icon-resize-full'>&nbsp;</i><a target='_blank' href='/app_info/appinfo_edit?bizcat_id=" + item.bizcat_id +'&app_rank=' + item.app_rank + "'><i class='icon-pencil'></i></a></td>'");
          $('#data1').append('</tr>');
          })
        }
    });
  }   
  //获取项目融资信息搜索结果
  var search_project_info = function() {
    $.ajax({
      url: "/api/app_info/ajax_search_engine_project",
      type: "Post",
      data: {_search_info:search_info}, 
      success: function (resp) {                
      $("#data2").text("");
      $.each(eval("(" + resp + ")").data, function (index, item) { //遍历返回的json
        $("#data2").append('<tr>');
        $("#data2").append('<td>' + decodeURI(item.fund_needs) + '</td>');
        $("#data2").append('<td>' + decodeURI(item.app_name) + '</td>');
        $("#data2").append('<td>' + (decodeURI(item.app_company)=='null'?'':decodeURI(item.app_company)) + '</td>');
        $("#data2").append('<td>' + (decodeURI(item.industry )=='null'?'':decodeURI(item.industry)) + '</td>');
        $("#data2").append('<td>' + item.fund_status + '</td>');
        $("#data2").append('<td>' + (item.is_aliyunuser>0?'是':'否') + '</td>');
        $("#data2").append("<td><i id='parentIframe' class='icon-resize-full'>&nbsp;</i><a target='_blank' href='/app_info/project_detail?app_id=" + 
                        item.app_id+"'><i class='icon-pencil'></i></a></td>'");
        $('#data2').append('</tr>');
        });
      }
    });
  }            
  //弹出层
  $(document).on('click','#parentIframe',function(){
      layer.open({
        type: 2,
        title: '条目预览窗口',
        maxmin: true,
        shadeClose: true, //点击遮罩关闭层
        area : ['1500px' , '720px'],
        content: $(this).next().attr('href')
      });
  });
  $("#search_engine").click(function() {
      search_info=$('#search_text').val().Trim();
      if(search_info!="") {
        $("#loading").attr('style','');
        search_appinfo();
        search_project_info(); 
        $("[role='presentation']").attr("class",'');
        $("[tabindex='1']").attr("class",'active');
        $("#search-nav").show();
        $("#table1").show(); 
        $("#table2").hide();                 
      } else {
        $("#search-nav").hide();
        $("#table1").hide();
        $("#table2").hide();
      }
  });
  //回车后做搜索操作
  $(document).keydown(function(e){
    if(e.keyCode==13){
       $('#search_engine').click();
    }
  });
  //搜索结果导航栏切换
  $("[role='presentation']").click(function() {
      $("[role='presentation']").attr("class",'');
      $(this).attr("class",'active');
      var index = $(this).attr('tabindex');
      if(index == '1') {
        $("#table1").show();
        $("#table2").hide();
      } else if(index == '2') {
        $("#table1").hide();
        $("#table2").show();
      } else {
        $("#table1").hide();
        $("#table2").hide();
      }
    })
});
</script>

</body>
</html>
