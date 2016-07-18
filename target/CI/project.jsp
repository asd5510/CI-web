<%@ page contentType="text/html; charset=utf-8" language="java"%>
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

  <!-- Demo page code -->

  <style type="text/css">
        #line-chart {
            height:300px;
            width:800px;
            margin: 0px auto;
            margin-top: 1em;
        }
        .page-title:hover {
            cursor:pointer;
            color: #0088cc;
        }
        .pagination {
          display: inline-block;
          float: right;
        }
        .btn-info {
          background: #169;
        }
        .icon-chevron-left:hover,.icon-chevron-right:hover,.icon-resize-full:hover {
            color: #09a;
            cursor: pointer;
        }
        .btn-switch {
          border: none;
          padding:6px;
          color: #fff;
          background: #999;
        }
        .btn-switch.active{
          border: none;
          padding:6px;
          color: #fff;
          background: #09a;
        }
    </style>

  <%@include file="header.jsp"%> 
  <div class="content" data-main>
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
    <div class="breadcrumb">
            <span rel="tooltip" title="点击隐藏/还原导航栏" class="icon-chevron-left" data-sidebar-button >&nbsp;应用市场</span>
    </div>
  <div class="container-fluid">
    <div class="row-fluid">
      <br>
      <br>
      <div>
         <table id="filter" border="0" cellspacing="5" cellpadding="5">
            <tbody>
               <tr>
                <td>
                  <div class="btn-group">  
                    <button class="btn" disabled="true" style="border:none;background:#fff;margin:0;padding:0;color:#000;font-size:15px">注册日期：</button>  
                    <button class="btn btn-info" name='btn-choose' tabindex="1">近3天</button>  
                    <button class="btn btn-info" name='btn-choose' tabindex="2">近30天</button>  
                    <button class="btn btn-info" name='btn-choose' tabindex="3">近1年</button>  
                    <button class="btn btn-info active" name='btn-choose' tabindex="4">不限定时间</button>  
                  </div>                    
                </td>
                <td>应用名称：<input type="text" style="height:20px;width:170px;border: 1px solid #e5e5e5" id="app_s"></td> 
                <td>公司名称：<input type="text" style="height:20px;width:170px;border: 1px solid #e5e5e5" id="com_s"></td>
                </tr>
                <tr>
                  <td>是否阿里云客户：<select  class="form-control" id='aliyunuser'>
                     <option>全量客户</option>
                     <option>已付费客户</option>
                     <option>已注册未付费客户</option>
                     <option>未注册客户</option>
                  </select></td>
                  <td>BD跟进：<select  class="form-control" id='bd_user'>
                     <option>全部</option>
                     <option>BD客户</option>
                     <option>销售库Leads</option>
                     <option>未分配App</option>
                  </select></td>
                 <td><button type="submit" class="btn btn-info" id="search_db">查询</button></td>
                </tr>
          </tbody>
        </table>
        <br>
        <hr/>
      
        <table class="table table-striped table-hover" id="example">
          <thead>
            <tr>
              <th style="width:6px;">
               BD&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
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
          <tbody id="data1">
          </tbody>
        </table>
        <div class='hero-unit'><h2 align='center'>登录后获取信息</h2></div>
        <div id="paginator"></div>
      </div>
      <br>
      <br>
      <br>
      <hr>
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

    </div>
  </div>
  </div>
  <script src="<%=basePath %>js/app_info/bootstrap.js"></script>
  <script src="<%=basePath %>js/app_info/jquery.cookie.js"></script>
  <script src="<%=basePath %>js/app_info/app.js"></script>    
  <script src="<%=basePath %>js/app_info/layer/layer.js"></script>
  <script src="<%=basePath %>js/app_info/bootstrap-paginator.min.js"></script>
<script type="text/javascript">
  $(document).ready(function() {
    var hm = "<{$current_user->_nickname}>";
    $(".hero-unit").hide();
    var bizcat_id=null; 
    var dim=1;
    var num=10;
    var min=0;
    var max=Number.MAX_VALUE;
    var user=null;
    var bd_user=null;
    var pay_user=null;
    var app_s=null;
    var com_s=null;
    var track_user=null;
    var app_keyword=null;
    var options;
    var time_option=4;
    var uid_s=null;
    var ajax_init_view = function(){$.ajax({
            url: "<%=path %>/CIController/ajax_project_filter.do",
            type: "Post",
            data: {_user:user,_pay_user:pay_user,
              _app_s:app_s,_com_s:com_s,_bd_user:bd_user,_track_user:track_user,_time_option:time_option,_uid_s:uid_s,_page:1,_bizcat_id:bizcat_id,_app_keyword:app_keyword},
            beforeSend : function() {
                    $("#loading").attr('style','');
            },
            success: function (resp) {
               $("#loading").attr('style','display:none');
               ajax_display(resp);
            }
    })};
    var ajax_display = function(resp){
      if (resp != null) {
          $("#data1").text("");
          $.each(eval("(" + resp + ")"), function (index, item) { //遍历返回的json
            $("#data1").append('<tr>');
            if(decodeURI(item.track_user)!='null' || decodeURI(item.bd_manager)!='null' ) {
              $("#data1").append("<td><small style='color:green;font-weight:bold'>"+(decodeURI(item.bd_manager)=='null'?decodeURI(item.track_user):decodeURI(item.bd_manager))+"</small></td>");
            } else {
              $("#data1").append("<td><input type='checkbox'></td>");
            }       
            $("#data1").append('<td>' + decodeURI(item.appName) + '</td>');
            $("#data1").append("<td><a target='_blank' href='<?=site_url('BasicController/search_engine/"+item.app_company+"')?>'>" + (decodeURI(item.downcntTotal)=='null'?'':decodeURI(item.downcntTotal)) + '</a></td>');
            $("#data1").append('<td>' + (decodeURI(item.tags )=='null'?'':decodeURI(item.tags)) + '</td>');
            $("#data1").append('<td>' + item.author + '</td>');
            $("#data1").append('<td>' + (item.is_aliyunuser>0?'是':'否') + '</td>');
            $("#data1").append("<td><i id='parentIframe' class='icon-resize-full'>&nbsp;</i><a target='_blank' href='" + item.product_href + "'</a></td>");
            $('#data1').append('</tr>');
        });
      }
    }
    $.ajax({
      url: "<%=path %>/CIController/ajax_project_page_num.do",
      type: "Post",
      data: {_max:max,_min:min,_user:user,_pay_user:pay_user,
                    _app_s:app_s,_com_s:com_s,_bd_user:bd_user,_track_user:track_user,_time_option:time_option,
                    _uid_s:uid_s,_dim:dim,_app_keyword:app_keyword},
      success: function (resp) {
        if (resp != null) {
          num = Math.ceil(resp/50);
          options = {
                currentPage: 1,
                totalPages: num,
            onPageClicked: function(event, originalEvent, type, page) {
                $.ajax({
                  url: "<%=path %>/CIController/ajax_project_filter.do",
                  type: "Post",
                  data: {_max:max,_min:min,_user:user,_pay_user:pay_user,
                    _app_s:app_s,_com_s:com_s,_bd_user:bd_user,_track_user:track_user,_time_option:time_option,_uid_s:uid_s,_page:page,_dim:dim,_app_keyword:app_keyword},
                  beforeSend : function() {
                    $("#loading").attr('style','');
                  },
                  success: function (resp) {
                    $("#loading").attr('style','display:none');
                    ajax_display(resp);
                  }
                });
           },
           onPageChanged: function(e,oldPage,newPage){
                $.ajax({
                  url: "<%=path %>/CIController/ajax_project_filter.do",
                  type: "Post",
                  data: {_max:max,_min:min,_user:user,_pay_user:pay_user,
                    _app_s:app_s,_com_s:com_s,_bd_user:bd_user,_track_user:track_user,_time_option:time_option,_uid_s:uid_s,_page:newPage,_dim:dim,_app_keyword:app_keyword},
                  success: function (resp) {
                    ajax_display(resp);
                  }
                });
            }
         }
         $('#paginator').bootstrapPaginator(options);
        }
      }
    });
    ajax_init_view();
    $("[rel=tooltip]").tooltip();
    $('#search_db').click(function() {
        time_option = $(".btn-info.active").attr('tabindex');
        if ($('#aliyunuser').find("option:selected").text()  == '全量客户') {
           user = null;
           pay_user = null;
        } else if ($('#aliyunuser').find("option:selected").text()  == '已付费客户') {
           user = 1;
           pay_user=1;
        } else if ($('#aliyunuser').find("option:selected").text()  == '已注册未付费客户') {
           user = 1; 
           pay_user=0;
        } else {
           user = 0;
           pay_user=null;
        }
        // uid_s = $('#uid_s').val();
        app_s = $('#app_s').val().Trim();
        com_s = $('#com_s').val().Trim();
        if ($('#bd_user').find("option:selected").text()  == '全部') {
           bd_user = null;
           track_user = null;
        } else if ($('#bd_user').find("option:selected").text()  == 'BD客户') {
           bd_user=1;
           track_user=null;
        } else if ($('#bd_user').find("option:selected").text()  == '销售库Leads') {
           track_user=1;
           bd_user=null;
        } else {
          bd_user=0;
          track_user=0;
        }
        var num=1;
        $.ajax({
          url: "<%=path %>/CIController/ajax_project_page_num.do",
          type: "Post",
          data: {_user:user,_pay_user:pay_user,
           _app_s:app_s,_com_s:com_s,_bd_user:bd_user,_track_user:track_user,_time_option:time_option,_uid_s:uid_s,_bizcat_id:bizcat_id,_app_keyword:app_keyword}, 
          success: function (resp) {
            var resp = JSON.parse(resp);
            num = Math.ceil(resp/50);
            if(num != 0)
              options['totalPages'] = num;
            else 
              options['totalPages'] = 1;
            options.currentPage = 1;
            console.log(resp,num);
            $('#paginator').bootstrapPaginator(options);
          }
        });
        $.ajax({
                  url: "<%=path %>/CIController/ajax_project_filter.do",
                  type: "Post",
                  data: {_user:user,_pay_user:pay_user,
                    _app_s:app_s,_com_s:com_s,_bd_user:bd_user,_track_user:track_user,_time_option:time_option,_uid_s:uid_s,_page:1,_bizcat_id:bizcat_id,_app_keyword:app_keyword},
                  beforeSend : function() {
                    $("#loading").attr('style','');
                  },
                  success: function (resp) {
                      $("#loading").attr('style','display:none');
                      ajax_display(resp);
                  }
                });
     });
    //注册时间按钮组
    $("[name='btn-choose']").click(function() {
      $("[name='btn-choose']").attr("class",'btn btn-info');
      $(this).attr("class",'btn btn-info active');
    })
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
    $(document).keydown(function(e){
      if(e.keyCode==13){
        $('#search_db').click();
      }
    });
  });
</script>
</body>
</html>
