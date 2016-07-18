package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>企业信息库</title>\n");
      out.write("    <meta content=\"IE=edge,chrome=1\" http-equiv=\"X-UA-Compatible\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath );
      out.write("css/app_info/bootstrap.css\">\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath );
      out.write("css/app_info/theme.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(basePath );
      out.write("css/app_info/font-awesome.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(basePath );
      out.write("css/app_info/loading.css\">\n");
      out.write("  <script src=\"");
      out.print(basePath );
      out.write("js/jquery/jquery.js\" type=\"text/javascript\"></script>     \n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        #line-chart {\n");
      out.write("            height:300px;\n");
      out.write("            width:800px;\n");
      out.write("            margin: 0px auto;\n");
      out.write("            margin-top: 1em;\n");
      out.write("        }\n");
      out.write("        #rightList li span {  \n");
      out.write("            float:right;\n");
      out.write("            padding-right: 40px;   \n");
      out.write("        }  \n");
      out.write("        .page-title:hover {\n");
      out.write("            cursor:pointer;\n");
      out.write("            color: #0088cc;\n");
      out.write("        }\n");
      out.write("        .message-sidebar {\n");
      out.write("            overflow: auto;\n");
      out.write("            height: 350px;\n");
      out.write("            scrollbar-base-color: #222;\n");
      out.write("          scrollbar-3dlight-color: #222;\n");
      out.write("          scrollbar-highlight-color: #222;\n");
      out.write("          scrollbar-track-color: #3e3e42;\n");
      out.write("          scrollbar-arrow-color: #111;\n");
      out.write("          scrollbar-shadow-color: #222;\n");
      out.write("          scrollbar-dark-shadow-color: #222; \n");
      out.write("            -ms-overflow-style: -ms-autohiding-scrollbar;\n");
      out.write("        }\n");
      out.write("        .btn-ratio {\n");
      out.write("            border: none;\n");
      out.write("            border-radius:7px;\n");
      out.write("            background:#B8DFE1;\n");
      out.write("            color: #0aa;\n");
      out.write("        }\n");
      out.write("        .btn-ratio:hover {\n");
      out.write("            background:#B8DFE1;\n");
      out.write("            color: #0aa;\n");
      out.write("        }\n");
      out.write("        .message-sidebar p{\n");
      out.write("            margin:0;\n");
      out.write("            color: #555;\n");
      out.write("        }\n");
      out.write("        .message-sidebar tr:hover{\n");
      out.write("            background: #ddd;\n");
      out.write("            cursor: pointer;    \n");
      out.write("        }\n");
      out.write("        ::-webkit-scrollbar {\n");
      out.write("          width: 3px;\n");
      out.write("          height: 13px;\n");
      out.write("        }\n");
      out.write("        .icon-arrow-up {\n");
      out.write("            color: red;\n");
      out.write("        }\n");
      out.write("        .icon-arrow-down {\n");
      out.write("            color: green;\n");
      out.write("        }\n");
      out.write("        .jumbotron h2,p{\n");
      out.write("            color:#555;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        .mod-date {\n");
      out.write("            background: #B8DFE1;\n");
      out.write("            font-size: 16px;\n");
      out.write("            border-radius:7px;\n");
      out.write("            padding: 10px 10px 10px 10px;\n");
      out.write("        }\n");
      out.write("        .icon-chevron-left:hover,.icon-chevron-right:hover {\n");
      out.write("            color: #09a;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <body class=\"\">  \r\n");
      out.write("\r\n");
      out.write("    <div class=\"navbar\">\r\n");
      out.write("        <div class=\"navbar-inner\">\r\n");
      out.write("            <div id=\"form\">\r\n");
      out.write("                <form action=\"#\" class=\"entypo-search\">\r\n");
      out.write("                  <i class=\"icon-search\"></i><input id=\"search\" placeholder=\"Search\" />\r\n");
      out.write("                </form>  \r\n");
      out.write("            </div>\r\n");
      out.write("            <ul class=\"nav pull-right\">\r\n");
      out.write("             <li id=\"fat-menu\" class=\"dropdown\">    \r\n");
      out.write("                <a href=\"/app_info/login\" role=\"button\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" id=\"my-menu\"> \r\n");
      out.write("                <i class=\"icon-user\"></i><span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USER_SESSION_KEY}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span><i class=\"icon-caret-down\"></i>\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"dropdown-menu\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a tabindex=\"-1\" href=\"#\">账户信息</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"divider\"></li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a tabindex=\"-1\" href=\"#\">设置</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"divider visible-phone\"></li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a tabindex=\"-1\" href=\"#\">注销</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("        \r\n");
      out.write("        </ul>\r\n");
      out.write("        <a class=\"brand\" href=\"");
      out.print(path );
      out.write("/login.jsp\">\r\n");
      out.write("            <img src=\"");
      out.print(basePath );
      out.write("image/app_info/logo.png\" width=\"189\" />\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("        <!-- 右侧边栏 -->\r\n");
      out.write("         <!--  <nav class=\"main-menu\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                        <i class=\"icon-home\"></i>\r\n");
      out.write("                        <span class=\"nav-text\">\r\n");
      out.write("                            主页\r\n");
      out.write("                        </span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                  \r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"has-subnav\">\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                        <i class=\"icon-repeat\"></i>\r\n");
      out.write("                        <span class=\"nav-text\">\r\n");
      out.write("                            刷新\r\n");
      out.write("                        </span>\r\n");
      out.write("                    </a>                  \r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                        <i class=\"icon-thumbs-up\"></i>\r\n");
      out.write("                        <span class=\"nav-text\">\r\n");
      out.write("                            赞一个\r\n");
      out.write("                        </span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                  \r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"has-subnav\">\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                        <i class=\"icon-download\"></i>\r\n");
      out.write("                        <span class=\"nav-text\">\r\n");
      out.write("                            数据下载\r\n");
      out.write("                        </span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    \r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav> -->\r\n");
      out.write("    <div class=\"sidebar-nav\">\r\n");
      out.write("<!--     <a href=\"/app_info/welcome\">\r\n");
      out.write("    \" class=\"nav-header\" >\r\n");
      out.write("     行业概览\r\n");
      out.write("    </a> -->\r\n");
      out.write("    <a href=\"");
      out.print(path );
      out.write("/MainController/toMainPage.do\" class=\"nav-header\" >企业可视化\r\n");
      out.write("    </a>\r\n");
      out.write("    <a href=\"");
      out.print(path );
      out.write("/search_engine.jsp\" class=\"nav-header\" >企业百科\r\n");
      out.write("    </a>\r\n");
      out.write("    <a href=\"#dashboard-menu\" class=\"nav-header\" data-toggle=\"collapse\">\r\n");
      out.write("        应用市场<i class=\"icon-chevron-down\"></i>   \r\n");
      out.write("    </a>\r\n");
      out.write("    <ul id=\"dashboard-menu\" class=\"nav nav-list collapse in\">\r\n");
      out.write("        <li>\r\n");
      out.write("            <a class=\"dir\" href=\"");
      out.print(path );
      out.write("/MainController/toDoubanReviewPage.do\">移动应用</a>\r\n");
      out.write("        </li> \r\n");
      out.write("        <li >\r\n");
      out.write("            <a class=\"dir\" href=\"");
      out.print(path );
      out.write("/MainController/toDoubanReviewPage.do\">手机游戏</a>\r\n");
      out.write("        </li>\r\n");
      out.write("\r\n");
      out.write("    </ul>\r\n");
      out.write("    <a href=\"");
      out.print(path );
      out.write("/project.jsp\" class=\"nav-header\" >创投项目库\r\n");
      out.write("    </a>\r\n");
      out.write("    </div>\r\n");
      out.write("\n");
      out.write("    <div class=\"content\" data-main>\n");
      out.write("        <div id=\"loading\">\n");
      out.write("            <div id=\"loading-center\">\n");
      out.write("            <div id=\"loading-center-absolute\">\n");
      out.write("            <div class=\"object\" id=\"object_one\"></div>\n");
      out.write("            <div class=\"object\" id=\"object_two\"></div>\n");
      out.write("            <div class=\"object\" id=\"object_three\"></div>\n");
      out.write("            <div class=\"object\" id=\"object_four\"></div>\n");
      out.write("            <div class=\"object\" id=\"object_five\"></div>\n");
      out.write("            <div class=\"object\" id=\"object_six\"></div>\n");
      out.write("            <div class=\"object\" id=\"object_seven\"></div>\n");
      out.write("            <div class=\"object\" id=\"object_eight\"></div>\n");
      out.write("            <div class=\"object\" id=\"object_nine\"></div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write(" \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    <div class=\"breadcrumb\">\n");
      out.write("            <span rel=\"tooltip\" title=\"点击隐藏/还原导航栏\" class=\"icon-chevron-left\" data-sidebar-button >&nbsp;行业概览</span>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"row-fluid\">\n");
      out.write("            <div class=\"row-fluid\">\n");
      out.write("\n");
      out.write("                <div class=\"alert alert-info\">\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"alert\">×</button> <strong>Just a quick note:</strong>\n");
      out.write("                    请谨慎对数据操作，后台会保存您的操作记录!\n");
      out.write("                </div>\n");
      out.write("                 <div class='jumbotron'>\n");
      out.write("                    <h2>本周行业数据统计</h2>\n");
      out.write("                    <p>数据每周一更新，本站所提供的数据仅供内部使用</p>\n");
      out.write("                </div>\n");
      out.write("                <hr>\n");
      out.write("            <div class=\"row-fluid\">\n");
      out.write("                <div class=\"span3\">\n");
      out.write("                  <div class=\"row-fluid\"><h5>本周类目下载量统计(万次)</h5></div>\n");
      out.write("                  <div class=\"message-sidebar\">\n");
      out.write("                   <table border=\"0\" cellspacing=\"1\" cellpadding=\"8\">\n");
      out.write("                        <tbody>\n");
      out.write("                            ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${movielist}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_0.setVar("movie");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                                <tr class=\"message-tr\">\n");
            out.write("                                    <td>\n");
            out.write("                                        <p><i class=\"icon-briefcase\"></i>&nbsp;");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${movie}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</p>\n");
            out.write("                                    </td>\n");
            out.write("                                    <td>\n");
            out.write("                                        <p> \n");
            out.write("                                            ");
            //  c:choose
            org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
            _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
            _jspx_th_c_choose_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
            int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
            if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write("\n");
                out.write("                                                ");
                //  c:when
                org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                _jspx_th_c_when_0.setPageContext(_jspx_page_context);
                _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
                _jspx_th_c_when_0.setTest((Math.random()>0.5));
                int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
                if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\n");
                    out.write("                                                  <i class=\"icon-arrow-up\">");
out.print(Math.round(Math.random()*10)+1);
                    out.write("</i>\n");
                    out.write("                                                ");
                    int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
                  return;
                }
                _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
                out.write("\n");
                out.write("                                                ");
                //  c:otherwise
                org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
                _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
                int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
                if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\n");
                    out.write("                                                    <i class=\"icon-arrow-down\">");
out.print(Math.round(Math.random()*10)+1);
                    out.write("</i>\n");
                    out.write("                                                ");
                    int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
                  return;
                }
                _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
                out.write("\n");
                out.write("                                            ");
                int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
            }
            if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
              return;
            }
            _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
            out.write("\n");
            out.write("                                        </p>\n");
            out.write("                                    </td> \n");
            out.write("                                    <td>\n");
            out.write("                                    <button class=\"btn btn-ratio\" style=\"width:");
out.print(Math.round(Math.random()*100));
            out.write("px\">");
out.print(Math.round(Math.random()*100));
            out.write("</button>\n");
            out.write("                                    </td>\n");
            out.write("                                </tr>\n");
            out.write("                            ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("                       \n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                  </div>        \n");
      out.write("                </div>\n");
      out.write("                <div class=\"span9\">\n");
      out.write("                  <div id=\"container\" style=\"min-width: 600px; height: 400px; margin: 0 auto\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row-fluid\">\n");
      out.write("                <div class=\"span3\">\n");
      out.write("                <div class=\"row-fluid\"><h5>时间区域选择</h5></div>\n");
      out.write("                <br>\n");
      out.write("                <span class='mod-date center-block'><i class=\"icon-calendar\">&nbsp;&nbsp;</i><i class=\"icon-chevron-left\">&nbsp;&nbsp;&nbsp;</i>2015-<span class=\"pic-date\">9</span>&nbsp;&nbsp;&nbsp;<i class=\" icon-chevron-right\"></i></span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"span9\">\n");
      out.write("                  <div id=\"container2\" style=\"min-width: 600px; height: 400px; margin: 0 auto\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                <div class=\"block\">\n");
      out.write("                    <a href=\"#page-stats\" class=\"block-heading\" data-toggle=\"collapse\">Latest Stats</a>\n");
      out.write("                    <div id=\"page-stats\" class=\"block-body collapse in\">\n");
      out.write("\n");
      out.write("                        <div class=\"stat-widget-container\">\n");
      out.write("                            <div class=\"stat-widget\">\n");
      out.write("                                <div class=\"stat-button\">\n");
      out.write("                                    <p class=\"title\">2,500</p>\n");
      out.write("                                    <p class=\"detail\">Accounts</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"stat-widget\">\n");
      out.write("                                <div class=\"stat-button\">\n");
      out.write("                                    <p class=\"title\">3,299</p>\n");
      out.write("                                    <p class=\"detail\">Subscribers</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"stat-widget\">\n");
      out.write("                                <div class=\"stat-button\">\n");
      out.write("                                    <p class=\"title\">$1,500</p>\n");
      out.write("                                    <p class=\"detail\">Pending</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"stat-widget\">\n");
      out.write("                                <div class=\"stat-button\">\n");
      out.write("                                    <p class=\"title\">$12,675</p>\n");
      out.write("                                    <p class=\"detail\">Completed</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <footer>\n");
      out.write("                <hr>\n");
      out.write("                <p class=\"pull-right\">\n");
      out.write("                    A Website\n");
      out.write("                    for Internal Use\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("                <p class=\"pull-left\">\n");
      out.write("                    &copy; 2012\n");
      out.write("                    <a href=\"http://www.aliyun.com\" target=\"_blank\">Aliyun</a>\n");
      out.write("                </p>\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  <script src=\"");
      out.print(basePath );
      out.write("js/app_info/bootstrap.js\"></script>\n");
      out.write("  <script src=\"");
      out.print(basePath );
      out.write("js/app_info/jquery.cookie.js\"></script>\n");
      out.write("  <script src=\"");
      out.print(basePath );
      out.write("js/app_info/app.js\"></script>    \n");
      out.write("  <script src=\"");
      out.print(basePath );
      out.write("js/app_info/highcharts.js\"></script>\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("        document.onreadystatechange = subSomething;\n");
      out.write("        function subSomething() { \n");
      out.write("            if (document.readyState == \"complete\" ) {\n");
      out.write("                $(\"#loading\").fadeOut(500); \n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        $(\"[rel=tooltip]\").tooltip();\n");
      out.write("        $(document).ready(function() {\n");
      out.write("            var hm=\"<{$current_user->_nickname}>\";\n");
      out.write("            $(\".message-tr:first\").css('background','#ddd');\n");
      out.write("            $(\".message-tr\").click(function(){\n");
      out.write("                chart.series[0].setData([Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90]);\n");
      out.write("                chart.series[1].setData([Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90]);\n");
      out.write("                chart2.series[0].setData([Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90]);\n");
      out.write("                chart2.series[1].setData([Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90]);\n");
      out.write("                $(\".message-tr\").css('background','#fff');\n");
      out.write("                $(this).css('background','#ddd');\n");
      out.write("            })\n");
      out.write("            $(\".icon-chevron-left\").click(function(){            \n");
      out.write("                if($(\".pic-date\").text()>1) {\n");
      out.write("                    chart2.series[0].setData([Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90]);\n");
      out.write("                    chart2.series[1].setData([Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90]);\n");
      out.write("                    $(\".pic-date\").text($(\".pic-date\").text()-1);\n");
      out.write("                }\n");
      out.write("            }); \n");
      out.write("            $(\".icon-chevron-right\").click(function(){\n");
      out.write("                if($(\".pic-date\").text()<11) {\n");
      out.write("                    chart2.series[0].setData([Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90]);\n");
      out.write("                  chart2.series[1].setData([Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90,Math.random()*90]);\n");
      out.write("                   $(\".pic-date\").text($(\".pic-date\").text()*1+1);\n");
      out.write("                }\n");
      out.write("            }); \n");
      out.write("            var chart;\n");
      out.write("            var chart2;\n");
      out.write("            chart = new Highcharts.Chart({\n");
      out.write("                chart: {\n");
      out.write("                    type: 'column',\n");
      out.write("                    renderTo: 'container'\n");
      out.write("                },\n");
      out.write("                title: {\n");
      out.write("                    text: '本周该行业消费和投资预估'\n");
      out.write("                },\n");
      out.write("                subtitle: {\n");
      out.write("                    text: 'Source: aliyun.com'\n");
      out.write("                },\n");
      out.write("                xAxis: {\n");
      out.write("                    categories: [\n");
      out.write("                        'oss',\n");
      out.write("                        'cdn',\n");
      out.write("                        'database',\n");
      out.write("                        'server',\n");
      out.write("                        'total',\n");
      out.write("                        'others'\n");
      out.write("                    ]\n");
      out.write("                },\n");
      out.write("                yAxis: {\n");
      out.write("                    min: 0,\n");
      out.write("                    title: {\n");
      out.write("                        text: 'value ($)'\n");
      out.write("                    }\n");
      out.write("                },\n");
      out.write("                tooltip: {\n");
      out.write("                    headerFormat: '<span style=\"font-size:10px\">{point.key}</span>',\n");
      out.write("                    pointFormat: '' +\n");
      out.write("                        '',\n");
      out.write("                    footerFormat: '<table><tbody><tr><td style=\"color:{series.color};padding:0\">{series.name}: </td><td style=\"padding:0\"><b>{point.y:.1f} $</b></td></tr></tbody></table>',\n");
      out.write("                    shared: true,\n");
      out.write("                    useHTML: true\n");
      out.write("                },\n");
      out.write("                plotOptions: {\n");
      out.write("                    column: {\n");
      out.write("                        pointPadding: 0.2,\n");
      out.write("                        borderWidth: 0\n");
      out.write("                    }\n");
      out.write("                },\n");
      out.write("                series: [{\n");
      out.write("                    name: '消费',\n");
      out.write("                    data: [49.9, 71.5, 106.4, 129.2, 144.0, 176.0]\n");
      out.write("\n");
      out.write("                }, {\n");
      out.write("                    name: '投资预估',\n");
      out.write("                    data: [83.6, 78.8, 98.5, 93.4, 106.0, 84.5]\n");
      out.write("\n");
      out.write("                }]\n");
      out.write("            });\n");
      out.write("            chart2 = new Highcharts.Chart({\n");
      out.write("                chart: {\n");
      out.write("                    type: 'spline',\n");
      out.write("                    renderTo: 'container2'\n");
      out.write("                },\n");
      out.write("                title: {\n");
      out.write("                    text: '该行业近期热度趋势图'\n");
      out.write("                },\n");
      out.write("                subtitle: {\n");
      out.write("                    text: 'Source: aliyun.com'\n");
      out.write("                },\n");
      out.write("                xAxis: {\n");
      out.write("                    categories: [\n");
      out.write("                        '2015.6',\n");
      out.write("                        '2015.7',\n");
      out.write("                        '2015.8',\n");
      out.write("                        '2015.9',\n");
      out.write("                        '2015.10',\n");
      out.write("                        '2015.11'\n");
      out.write("                    ]\n");
      out.write("                },\n");
      out.write("                yAxis: {\n");
      out.write("                    min: 0,\n");
      out.write("                    title: {\n");
      out.write("                        text: 'Counts (times)'\n");
      out.write("                    }\n");
      out.write("                },\n");
      out.write("                tooltip: {\n");
      out.write("                    headerFormat: '<span style=\"font-size:10px\">{point.key}</span>',\n");
      out.write("                    pointFormat: '' +\n");
      out.write("                        '',\n");
      out.write("                    footerFormat: '<table><tbody><tr><td style=\"color:{series.color};padding:0\">{series.name}: </td><td style=\"padding:0\"><b>{point.y:.1f} $</b></td></tr></tbody></table>',\n");
      out.write("                    shared: true,\n");
      out.write("                    useHTML: true\n");
      out.write("                },\n");
      out.write("                plotOptions: {\n");
      out.write("                    column: {\n");
      out.write("                        pointPadding: 0.2,\n");
      out.write("                        borderWidth: 0\n");
      out.write("                    }\n");
      out.write("                },\n");
      out.write("                series: [{\n");
      out.write("                    name: '周下载数',\n");
      out.write("                    data: [49.9, 71.5, 106.4, 129.2, 144.0, 176.0]\n");
      out.write("\n");
      out.write("                }, {\n");
      out.write("                    name: '周评论数',\n");
      out.write("                    data: [83.6, 78.8, 98.5, 93.4, 106.0, 84.5]\n");
      out.write("\n");
      out.write("                }]\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
