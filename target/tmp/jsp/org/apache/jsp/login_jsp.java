package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<title>loginPage</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath );
      out.write("css/app_info/bootstrap.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath );
      out.write("css/app_info/theme.css\">\r\n");
      out.write("\t<script src=\"");
      out.print(basePath );
      out.write("js/jquery/jquery.js\" type=\"text/javascript\"></script>\r\n");
      out.write("  \t<style type=\"text/css\">\r\n");
      out.write("  \t\tbody{\r\n");
      out.write("\t\t  width:100%;\r\n");
      out.write("\t\t  min-height:100%;\r\n");
      out.write("\t\t  margin:0;\r\n");
      out.write("\t\t  overflow:hidden;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tcanvas{\r\n");
      out.write("\t\t  z-index:-999;\r\n");
      out.write("\t\t  position:absolute;\r\n");
      out.write("\t\t  top:0;\r\n");
      out.write("\t\t  left:0;\r\n");
      out.write("\t\t  bottom:0;\r\n");
      out.write("\t\t  right:0;\r\n");
      out.write("\t\t  background: linear-gradient(#dbf2f2, #FFffff);  \r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t@keyframes anim {\r\n");
      out.write("\t\t  from {\r\n");
      out.write("\t\t    transform: translateX(200%);\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t\t  to {\r\n");
      out.write("\t\t    transform: translateX(-200%);\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t@keyframes anime {\r\n");
      out.write("\t\t  from {\r\n");
      out.write("\t\t    transform: translateX(0);\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t\t  to {\r\n");
      out.write("\t\t    transform: translateX(-200%);\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.c1, .c2 {\r\n");
      out.write("\t\t  width: 800px;\r\n");
      out.write("\t\t  height: 700px;\r\n");
      out.write("\t\t  position: absolute;\r\n");
      out.write("\t\t  background: transparent url(\"https://s3-us-west-2.amazonaws.com/s.cdpn.io/131045/clouds.png\") 0 0 no-repeat;\r\n");
      out.write("\t\t  background-size: 100%;\r\n");
      out.write("\t\t  z-index:-99;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.c1.one, .c2.one {\r\n");
      out.write("\t\t  top: -260px;\r\n");
      out.write("\t\t  left: 0px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.c1.two, .c2.two {\r\n");
      out.write("\t\t  top: -200px;\r\n");
      out.write("\t\t  left: 100px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.c1.three, .c2.three {\r\n");
      out.write("\t\t  top: -240px;\r\n");
      out.write("\t\t  right: 100px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.c1.four, .c22.four {\r\n");
      out.write("\t\t  top: -180px;\r\n");
      out.write("\t\t  right: 0px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.c2 .one {\r\n");
      out.write("\t\t  top: -209px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t@media (max-width: 1023px) {\r\n");
      out.write("\t\t  .c2.one {left: -80px;}\r\n");
      out.write("\t\t  .c2.two {left: -120px;}\r\n");
      out.write("\t\t  .c2.three {right: 220px;}\r\n");
      out.write("\t\t  .c2.four {right: 220px;}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.c1 {\r\n");
      out.write("\t\t  animation: anime 1000s linear infinite forwards;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.c2 {\r\n");
      out.write("\t\t  transform: translateX(200%);\r\n");
      out.write("\t\t  animation: anim 1000s linear infinite forwards;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t#ehong-code-input{\r\n");
      out.write("\t\t\twidth:42px;\r\n");
      out.write("\t\t\tletter-spacing:2px;\r\n");
      out.write("\t\t\tmargin:0px 8px 0px 0px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.ehong-idcode-val{\r\n");
      out.write("\t\t\tposition:relative;\r\n");
      out.write("\t\t\tpadding:1px 4px 1px 4px;\r\n");
      out.write("\t\t\ttop:0px;\r\n");
      out.write("\t\t\t*top:-3px;\r\n");
      out.write("\t\t\tletter-spacing:4px;\r\n");
      out.write("\t\t\tdisplay:inline;\r\n");
      out.write("\t\t\tcursor:pointer;\r\n");
      out.write("\t\t\tfont-size:36px;\r\n");
      out.write("\t\t\tfont-family:\"Courier New\", Courier, monospace;\r\n");
      out.write("\t\t\ttext-decoration:none;\r\n");
      out.write("\t\t\tfont-weight:bold;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.ehong-idcode-val0{\r\n");
      out.write("\t\t\tborder:solid 1px #A4CDED;\r\n");
      out.write("\t\t\tbackground-color:#ECFAFB;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.ehong-idcode-val1{\r\n");
      out.write("\t\t\tborder:solid 1px #A4CDED;\r\n");
      out.write("\t\t\tbackground-color:#FCEFCF;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.ehong-idcode-val2{\r\n");
      out.write("\t\t\tborder:solid 1px #6C9;\r\n");
      out.write("\t\t\tbackground-color:#D0F0DF;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.ehong-idcode-val3{\r\n");
      out.write("\t\t\tborder:solid 1px #6C9;\r\n");
      out.write("\t\t\tbackground-color:#DCDDD8;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.ehong-idcode-val4{\r\n");
      out.write("\t\t\tborder:solid 1px #6C9;\r\n");
      out.write("\t\t\tbackground-color:#F1DEFF;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.ehong-idcode-val5{\r\n");
      out.write("\t\t\tborder:solid 1px #6C9;\r\n");
      out.write("\t\t\tbackground-color:#ACE1F1;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.ehong-code-val-tip{\r\n");
      out.write("\t\t\tfont-size:12px;\r\n");
      out.write("\t\t\tcolor:#1098EC;\r\n");
      out.write("\t\t\ttop:0px;\r\n");
      out.write("\t\t\t*top:-3px;\r\n");
      out.write("\t\t\tposition:relative;\r\n");
      out.write("\t\t\tmargin:0px 0px 0px 4px;\r\n");
      out.write("\t\t\tcursor:pointer;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#idcode {\r\n");
      out.write("            position:absolute;\r\n");
      out.write("\t        top:528px;\r\n");
      out.write("            left:960px;\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("  \t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<canvas id=\"canv\"></canvas>\r\n");
      out.write("\t<div class=\"sky\">\r\n");
      out.write("\t  <div class=\"clouds\">\r\n");
      out.write("\t    <div class=\"c1 one\"></div>\r\n");
      out.write("\t    <div class=\"c1 two\"></div>\r\n");
      out.write("\t    <div class=\"c1 three\"></div>\r\n");
      out.write("\t    <div class=\"c1 four\"></div>\r\n");
      out.write("\t    <div class=\"c2 one\"></div>\r\n");
      out.write("\t    <div class=\"c2 two\"></div>\r\n");
      out.write("\t    <div class=\"c2 three\"></div>\r\n");
      out.write("\t    <div class=\"c2 four\"></div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<center>\r\n");
      out.write("\t    <br>\r\n");
      out.write("\t    <br>\r\n");
      out.write("\t    <br>\r\n");
      out.write("\t    <br>\r\n");
      out.write("\t    <br>\r\n");
      out.write("\r\n");
      out.write("\t\t<img src=\"");
      out.print(basePath );
      out.write("image/app_info/logo1.png\" width=\"489\"/>\r\n");
      out.write("\t    <br>\r\n");
      out.write("\t    <br>\r\n");
      out.write("\r\n");
      out.write("\t\t<h2>海量企业信息，与你分享</h2>\r\n");
      out.write("\t    <br>\r\n");
      out.write("\t    <br>\r\n");
      out.write("\t    <div class=\"container\">\r\n");
      out.write("\t    \t<a id=\"logintab\" class=\"active\" href=\"#\">登录</a>\r\n");
      out.write("\t    \t<a id=\"logintab\" href=\"#\">注册</a>\r\n");
      out.write("\t    \t<a id='logintab' href=\"");
      out.print(path );
      out.write("/MainController/toMainPage.do\">匿名登录</a>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    <br>\r\n");
      out.write("\t    <form id=\"loginForm\" accept-charset=\"UTF-8\" method=\"POST\" action=\"");
      out.print(path );
      out.write("/MainController/login.do\">\r\n");
      out.write("\t\t\t<div class=\"input-group input-group-lg\">\r\n");
      out.write("\t\t\t  <input type=\"text\" name=\"name\" class=\"form-control\" placeholder=\"用户名\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"input-group input-group-lg\">\r\n");
      out.write("\t\t\t  <input type=\"password\" name=\"passwd\" class=\"form-control\" placeholder=\"密码\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"input-group input-group-lg\">\r\n");
      out.write("\t\t\t  <input type=\"text\" class=\"form-control\" placeholder=\"验证码\">\r\n");
      out.write("\t\t\t  <div id=\"idcode\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<button type=\"submit\" class=\"btn-login\">登录</button>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("<!-- \t\t<div><a href=\"#\">匿名登录</a></div> -->\r\n");
      out.write("\t</center>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"");
      out.print(basePath );
      out.write("js/app_info/birds.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"");
      out.print(basePath );
      out.write("js/app_info/jquery.idcode.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\t $(\"#logintab\").click(function(){\r\n");
      out.write("\t \t        $(\"#logintab\").attr(\"class\",'')\r\n");
      out.write("        \t\t$(this).attr(\"class\",'active')\r\n");
      out.write("\t\t\t })\r\n");
      out.write("\t\t\t $.idcode.setCode();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
