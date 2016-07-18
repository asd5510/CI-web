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

  <link rel="stylesheet" type="text/css" href="/css/app_info/bootstrap.css">
  <link rel="stylesheet" type="text/css" href="/css/app_info/theme.css">
  <link rel="stylesheet" href="/css/app_info/font-awesome.css">
  <script src="/js/jquery/jquery.js" type="text/javascript"></script>       

  <style type="text/css">
        #line-chart {
            height:300px;
            width:800px;
            margin: 0px auto;
            margin-top: 1em;
        }
        .btn-bar-right {
          text-align: right;
        }
        #dynamic {
          opacity: 0;
        }
        #dynamic:hover {
          opacity: 1;
          color: #0088cc;
          cursor: pointer;
        }
        #dynamicInput:hover + #dynamic{
           opacity: 1;
        }
        .page-title:hover {
            cursor:pointer;
            color: #0088cc;
        }
        .icon-plus-sign:hover {
           cursor:pointer;
           color: #0088cc;
        }
        hr {
          margin-top: 5px;
        }
        .icon-chevron-left:hover,.icon-chevron-right:hover {
            color: #09a;
            cursor: pointer;
        }
        .form-control {
          margin-bottom: 20px;
        }
    </style>
  <{include file='app_info/header.html'}> 
  <div class="content" data-main>

  <div class="breadcrumb">
          <span rel="tooltip" title="点击隐藏/还原导航栏" class="icon-chevron-left" data-sidebar-button >&nbsp;条目明细</span>
  </div>

    <!-- BEGIN EDIT -->
    <div class="container-fluid">
          <div class="panel-heading">
            <h3 class="panel-title">
              <{$app['app_name']}></h3>
          </div>
          <div class="panel-body">
            <form role="form" action="/app_info/submit" method='post' id="app_form">
              <div class="form-body">
                <strong>应用/项目信息</strong>
                <hr>
                <div class="row-fluid">
                    <div class="col-md-2">
                      <label>应用/项目名</label>
                      <input type="text" class="form-control"  placeholder="" value="<{$app['app_name']}>" name='app_name'
                      disable="true" readOnly="true">
                    </div>
                    <div class="col-md-2">
                      <label>项目ID</label>
                      <input type="text" class="form-control"  placeholder="" value="<{$app['app_id']}>" name='app_id'
                      disable="true" readOnly="true">
                    </div>
                    <div class="col-md-2">
                      <label>创建时间</label>
                      <input type="text" class="form-control"  placeholder="" value="<{$app['create_time']}>" name='create_time'
                      disable="true" readOnly="true">
                    </div>
                    <div class="col-md-2">
                      <label>项目公司所在区域</label>
                      <input type="text" class="form-control"  placeholder="" value="<{$app['area']}>" name='area'
                      disable="true" readOnly="true">
                    </div>
                    <div class="col-md-2">
                      <label>项目状态</label>
                      <input type="text" class="form-control"  placeholder="" value="<{$app['status']}>" name='status'
                      disable="true" readOnly="true">
                    </div>
                    <div class="col-md-2">
                      <label >所在企业</label>
                      <input type="text" class="form-control"  placeholder="" value="<{$app['app_company']}>" name='company'>
                    </div>
                    <div class="col-md-2">
                      <label>项目行业</label>
                      <input type="text" class="form-control"  placeholder="" value="<{$app['industry']}>" name='industry'
                      disable="true" readOnly="true">
                    </div>
                    <div class="col-md-2">
                      <label>项目子行业</label>
                      <input type="text" class="form-control"  placeholder="" value="<{$app['sub_industry']}>" name='sub_industry'
                      disable="true" readOnly="true">
                    </div>
                    <div class="col-md-2">
                      <label>项目描述</label>
                      <input type="text" class="form-control"  placeholder="" value="<{$app['app_descrption']}>" name='app_descrption'
                      disable="true" readOnly="true">
                    </div>
                    <div class="col-md-2">
                      <label>融资需求</label>
                      <input type="text" class="form-control"  placeholder="" value="<{$app['fund_needs']}>" name='fund_needs'
                      disable="true" readOnly="true">
                    </div>
                    <div class="col-md-2">
                      <label>融资状态</label>
                      <input type="text" class="form-control"  placeholder="" value="<{$app['fund_status']}>" name='fund_status'
                      disable="true" readOnly="true">
                    </div>
                    <div class="col-md-4">
                      <label>项目标签</label>
                      <input type="text" style="width:960px" class="form-control"  placeholder="" value="<{$app['app_tag']}>" name='app_tag'
                      disable="true" readOnly="true">
                    </div>
                </div>
                <br>
                <strong>阿里云相关信息</strong>
                <hr>
                <div class="form-group">
                  <label>阿里云用户ID</label>
                  <{foreach $aliyunid as $k=>$v}>
                  <span>
                    <input type="text" style="height:20px;border: 1px solid #e5e5e5" id="dynamicInput" readOnly="true"
                    value="<{$v['aliyun_pk']}>" name=aliuids[] />    
                    <i class="icon-remove-circle" name="del" id="dynamic"></i>
                  </span>
                  <{/foreach}>
                  <span>
                     <input type="text" name="aliuid" style="height:20px;border: 1px solid #e5e5e5"/>    
                     <i class="icon-plus-sign" name="add"></i>   
                  </span>
                </div>
                <br>  
                <strong>项目成员信息</strong>
                <hr>
                  <{foreach $member as $k=>$v}>
                    <div class="row-fluid">
                      <div class="col-md-2">
                          <label>成员姓名</label>
                        <input type="text" class="form-control"  placeholder="" value="<{$v['member_name']}>" name='member_name' disable="true" readOnly="true">
                      </div>
                        <div class="col-md-2">
                          <label>职务</label>
                        <input type="text" class="form-control"  placeholder="" value="<{$v['member_post']}>" name='member_post' disable="true" readOnly="true">
                      </div>
                       <div class="col-md-2">
                          <label>微博地址</label>
                          <input type="text" class="form-control"  placeholder="" value="<{$v['member_weibo_url']}>" name='member_weibo_url' readOnly="true">
                        </div>
                    </div>
                    <br>
                  <{/foreach}>
                <br>  
              <div class="form-group">
                <!-- <label>编辑者工号</label>
              -->
              <input type="hidden" class="form-control input-uid"  name='user_id'></div>
              <br>
              <br>
              </div>
        </form>
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


  <script src="/js/cloud_view/bootstrap.js"></script>
  <script src="/js/app_info/jquery.cookie.js"></script>
  <script src="/js/app_info/app.js"></script>    
  <script type="text/javascript">
        $(document).ready(function() {
          var hm="<{$current_user->_nickname}>";
          $('[data-main]').css('margin-left','0');
          $('[data-main]').css('width',"100%");
          $("[rel=tooltip]").tooltip();
          $("[data-toggle='tooltip']").tooltip();
          $("[name='add']").click(function() {
            if($("[name='aliuid']").val() != "") {
              $(this).parent().before("<span><input type='text' style='height:20px;border: 1px solid #e5e5e5' value='" + $("[name='aliuid']").val() + "' name=aliuids[] id='dynamicInput' /><i class='icon-remove-circle' name='del' id='dynamic'></i></span>");  
              $("[name='aliuid']").val("");
              $("[name='aliuid']").next().next().remove();
            } else if($("[name='aliuid']").next().next().length == 0){
              $("[name='aliuid']").parent().append("<span>添加内容不能为空！</span>");
            }
          });
        });
        $("form").on('click',"[name='del']",function() {
            $(this).parent().remove();
        });
        $("#cancel").click(function() {
           window.history.back(-1);
        });
  </script>

</body>
</html>
