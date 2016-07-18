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
<script src="<%=basePath %>js/jquery/jquery.js" type="text/javascript"></script>       
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
    <span rel="tooltip" title="点击隐藏/还原导航栏" class="icon-chevron-left" data-sidebar-button >&nbsp;编辑</span>
  </div>

  <!-- BEGIN EDIT -->
  <div class="container-fluid">
    <div class="panel-heading">
      <h3 class="panel-title">
        <?=$app['app_name'];}</h3>
    </div>
    <div class="panel-body">
      <form role="form" action="/app_info/submit" method='post' id="app_form">
        <div class="form-body">
          <strong>应用信息</strong>
          <hr>
          <div class="row-fluid">
            <div class="col-md-2">
              <label>应用名</label>
              <input type="text" class="form-control"  placeholder="" value="<{$app['app_name']}>" name='app_name'
              disable="true" readOnly="true">
            </div>
            <div class="col-md-2">
              <label>应用关键信息</label>
              <input type="text" class="form-control"  placeholder="" value="<{$app['app_keyinfo']}>" name='app_keyinfo'
              disable="true" readOnly="true">
            </div>
            <div class="col-md-2">
              <label>应用描述</label>
              <input type="text" class="form-control"  placeholder="" value="<{$app['app_desc']}>" name='app_description'
              disable="true" readOnly="true">
            </div>
            <div class="col-md-2">
              <label>总下载次数</label>
              <input type="text" class="form-control"  placeholder="" value="<{$app['downcnt_total']}>" name='dwn_cnt'
              disable="true" readOnly="true">
            </div>
            <div class="col-md-2">
              <label>应用排名</label>
              <input type="text" class="form-control"  placeholder="" value="<{$app['app_rank']}>" name='app_rank'
              disable="true" readOnly="true">
            </div>
            <div class="col-md-2">
              <label >所在企业</label>
              <input type="text" class="form-control"  placeholder="" value="<{$app['app_company']}>" name='company'>
            </div>
            <div class="col-md-2">
              <label>应用状态</label>
              <input type="text" class="form-control"  placeholder="" value="<{$app['app_status']}>" name='app_status'
              disable="true" readOnly="true">
            </div>
            <div class="col-md-2">
              <label>融资情况</label>
              <input type="text" class="form-control"  placeholder="" value="<{$app['fund_status']}>" name='fund_status'
              disable="true" readOnly="true">
            </div>
            <div class="col-md-4">
              <label>App相关市场分类，关键词</label>
              <input type="text" style="width:960px" class="form-control"  placeholder="" value="<{$app['app_keyword']}>" name='app_keywords'
              disable="true" readOnly="true">
            </div>
          </div>
          <br>
          <strong>联系信息</strong>
          <hr>
          <div class="row-fluid">
            <div class="col-md-2">
              <label>联系邮箱</label>
              <input type="text" class="form-control" value="<{$app['author_email']}>" name='author_email'>
            </div>       
            <div class="col-md-2">
              <label>开发者联系电话</label>
              <input type="text" class="form-control" value="<{$app['author_phone']}>" name='author_phone'>
            </div>
            <div class="col-md-2">
              <label>应用对应网站</label>
              <input type="text" class="form-control"  placeholder="" value="<{$app['author_web_site']}>" name='app_website'>
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
          <div class="row-fluid">
            <div class="col-md-2">
              <label>最近注册时间</label>
              <input type="text" class="form-control"  placeholder="" value="<{$app['m_create_time']}>" name='signin_time'
              disable="true" readOnly="true">
            </div>
            <div class="col-md-2">
              <label>对应用户的ecs台数</label>
              <input type="text" class="form-control"  placeholder="" value="<{$app['ecs_instance_cnt']}>" name='ecs_cnt'
              disable="true" readOnly="true">
            </div>
            <div class="col-md-2">
              <label>对应用户的rds台数</label>
              <input type="text" class="form-control"  placeholder="" value="<{$app['rds_instance_cnt']}>" name='rds_cnt'
              disable="true" readOnly="true">
            </div>
          </div>
          <div class="row-fluid">
            <div class="col-md-2">
              <label>BD经理</label>
              <input type="text" class="form-control"  placeholder="" value="<{$app['bd_manager']}>" name='BD_manager' disable="true" readOnly="true">
            </div>
            <div class="col-md-2">
              <label>BD部门</label>
              <input type="text" class="form-control"  placeholder="" value="<{$app['bd_dept']}>" name='BD_department' disable="true" readOnly="true">
            </div>
            <div class="col-md-2">
              <label>跟进BD</label>
              <input type="text" class="form-control"  placeholder="" value="<{$app['track_user']}>" name='track_user' readOnly="true">
            </div>
          </div>
          <br>
          <div class="row-fluid">
            <div class="col-md-2">
              <span>是否阿里云用户：</span>
              <{if $app['is_aliyunuser']==1}>
              <i class="icon-ok" style="color:green"></i>
              <{else}>
              <i class="icon-remove" style="color:red"></i>
              <{/if}>
            </div>
            <div class="col-md-2">
              <span>是否阿里云付费客户：</span>
              <{if $app['is_aliyun_payuser']==1}>
              <i class="icon-ok" style="color:green"></i>
              <{else}>
              <i class="icon-remove" style="color:red"></i>
              <{/if}>
            </div>
            <div class="col-md-2">
              <span>是否cdn付费用户：</span>
              <{if $app['is_cdn_retain']==1 }>
              <i class="icon-ok" style="color:green"></i>
              <{else}>
              <i class="icon-remove" style="color:red"></i>
              <{/if}>                
            </div>
            <div class="col-md-2">
              <span>是否oss付费用户：</span>
              <{if $app['is_oss_retain']==1 }>
              <i class="icon-ok" style="color:green"></i>
              <{else}>
              <i class="icon-remove" style="color:red"></i>
              <{/if}>                  
            </div>
            <div class="col-md-2">
              <span>是否用户手动增加：</span>
              <{if $app['is_user_add']==1 }>
              <i class="icon-ok" style="color:green"></i>
              <{else}>
              <i class="icon-remove" style="color:red"></i>
              <{/if}>  
            </div>
          </div>
          <br>  
          <br>  
          <strong>应用选择的其它云服务商</strong>   
          <hr>
          <div class="form-group"> 
            <div>
              <{foreach $company as $k=>$v}>   
              <span>
                <input name="<{$v['competition_company']}>" type="checkbox" <{$v['if_checked']}>/>&nbsp;
                <{$v['competition_company']}>&nbsp;&nbsp;&nbsp;&nbsp;
              </span>
              <{/foreach}>
            </div>
          </div>
          <br>
          <strong>预估年it投资信息</strong>
          <hr>
          <div class="form-group">
            <table cellspacing="5" cellpadding="5">
              <tbody>
              <tr>
                <td><label><small>预估it总投资</small></label>
                  <input type="text" class="form-control"  placeholder="" name='it_consume' value="<{$comsume['it_consume']}>">
                </td>
                <td>
                  <label><small>服务器投资</small></label>
                  <input type="text" class="form-control"  placeholder="" name='vm_consume' value="<{$comsume['vm_consume']}>">
                </td>
                <td>
                  <label><small>数据库投资</small></label>
                  <input type="text" class="form-control"  placeholder="" name='db_consume' value="<{$comsume['db_consume']}>">                             
                </td>
              </tr>
              <tr>
                <td>
                  <label><small>cdn投资</small></label>
                  <input type="text" class="form-control"  placeholder="" name='cdn_consume' value="<{$comsume['cdn_consume']}>">                            
                </td>
                <td>
                  <label><small>oss投资</small></label>
                  <input type="text" class="form-control"  placeholder="" name='oss_consume' value="<{$comsume['oss_consume']}>">                            
                </td>
                <td>
                  <label><small>其它投资</small></label>
                  <input type="text" class="form-control"  placeholder="" name='other_consume' value="<{$comsume['other_consume']}>">                            
                </td>
              </tr>
              </tbody>
            </table>   
            <br>
          </div>

          <div class="form-group">
            <!-- <label>编辑者工号</label>
              -->
            <input type="hidden" class="form-control input-uid"  name='user_id'>
            <!-- 为了post bizcat_id -->
            <input type="hidden" value="<{$app['bizcat_id']}>" name='bizcat_id'>
            <br>
            <br>
          </div>
          <div class="btn-toolbar btn-bar-right">
            <button class="btn btn-primary btn-save" ><i data-toggle="tooltip" title="确保登录后提交数据" class="icon-save" ></i> Save</button>
            <a href="#"  id="cancel" class="btn">Cancel</a>
            <div class="btn-group">
            </div>
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
</div>


<script src="<%=basePath %>js/app_info/bootstrap.js"></script>
<script src="<%=basePath %>js/app_info/jquery.cookie.js"></script>
<script src="<%=basePath %>js/app_info/app.js"></script>    
<script type="text/javascript">
$(document).ready(function() {
    //获取当前用户花名
    var hm="<{$current_user->_nickname}>";
    //左侧导航栏默认隐藏
    $('[data-main]').css('margin-left','0');
    $('[data-main]').css('width',"100%");
    //tooltip功能
    $("[rel=tooltip]").tooltip();
    $("[data-toggle='tooltip']").tooltip();
    //阿里云用户ID输入框组->添加
    $("[name='add']").click(function() {
      if($("[name='aliuid']").val() != "") {
      $(this).parent().before("<span><input type='text' style='height:20px;border: 1px solid #e5e5e5' value='" + $("[name='aliuid']").val() + "' name=aliuids[] id='dynamicInput' /><i class='icon-remove-circle' name='del' id='dynamic'></i></span>");  
      $("[name='aliuid']").val("");
      $("[name='aliuid']").next().next().remove();
      } else if($("[name='aliuid']").next().next().length == 0){
      $("[name='aliuid']").parent().append("<span>添加内容不能为空！</span>");
      }
    });
    //阿里云用户ID输入框组->删除
    $("form").on('click',"[name='del']",function() {
        $(this).parent().remove();
    });
    //获取当前用户工号
    var user_id = "<{$current_user->_id}>";
    if(typeof(hm)!="undefined") {
      $(".btn-save").removeAttr("disabled");
      $(".input-uid").val(user_id);
      $("[data-toggle='tooltip']").removeAttr();
    } else {
      $(".btn-save").attr('disabled',"true");
      $("[data-toggle='tooltip']").attr('title',"请先登录");
    }

    $("#cancel").click(function() {
        window.history.back(-1);
    });
});
</script>

</body>
</html>
