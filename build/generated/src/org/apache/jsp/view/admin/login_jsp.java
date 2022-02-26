package org.apache.jsp.view.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_var_value_nobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\"/>\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"/>\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"/>\r\n");
      out.write("  <meta name=\"description\" content=\"\"/>\r\n");
      out.write("  <meta name=\"author\" content=\"\"/>\r\n");
      out.write("  <title>Admin web nông sản</title>\r\n");
      out.write("  <!-- loader-->\r\n");
      out.write("  <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/pace.min.css\" rel=\"stylesheet\"/>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/pace.min.js\"></script>\r\n");
      out.write("  <!--favicon-->\r\n");
      out.write("  <link rel=\"icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("  <!-- Bootstrap core CSS-->\r\n");
      out.write("  <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/bootstrap.min.css\" rel=\"stylesheet\"/>\r\n");
      out.write("  <!-- animate CSS-->\r\n");
      out.write("  <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/animate.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("  <!-- Icons CSS-->\r\n");
      out.write("  <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/icons.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("  <!-- Custom Style-->\r\n");
      out.write("  <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/app-style.css\" rel=\"stylesheet\"/>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/popper.min.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plugins/simplebar/js/simplebar.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/sidebar-menu.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/app-script.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"bg-theme bg-theme1\">\r\n");
      out.write("\r\n");
      out.write("<!-- start loader -->\r\n");
      out.write("   <div id=\"pageloader-overlay\" class=\"visible incoming\"><div class=\"loader-wrapper-outer\"><div class=\"loader-wrapper-inner\" ><div class=\"loader\"></div></div></div></div>\r\n");
      out.write("   <!-- end loader -->\r\n");
      out.write("\r\n");
      out.write("<!-- Start wrapper-->\r\n");
      out.write(" <div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write(" <div class=\"loader-wrapper\"><div class=\"lds-ring\"><div></div><div></div><div></div><div></div></div></div>\r\n");
      out.write("\t<div class=\"card card-authentication1 mx-auto my-5\">\r\n");
      out.write("\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t <div class=\"card-content p-2\">\r\n");
      out.write("\t\t \t<div class=\"text-center\">\r\n");
      out.write("\t\t \t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/logo-icon.png\" alt=\"logo icon\">\r\n");
      out.write("\t\t \t</div>\r\n");
      out.write("\t\t  <div class=\"card-title text-uppercase text-center py-3\">Đăng nhập</div>\r\n");
      out.write("\t\t    <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/login\"  method=\"post\">\r\n");
      out.write("\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t  <label for=\"exampleInputUsername\" class=\"sr-only\">Username</label>\r\n");
      out.write("\t\t\t   <div class=\"position-relative has-icon-right\">\r\n");
      out.write("\t\t\t\t  <input type=\"text\" id=\"exampleInputUsername\" class=\"form-control input-shadow\" placeholder=\"Username\" name=\"admin-username\" required>\r\n");
      out.write("\t\t\t\t  <div class=\"form-control-position\">\r\n");
      out.write("\t\t\t\t\t  <i class=\"icon-user\"></i>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t   </div>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t  <label for=\"exampleInputPassword\" class=\"sr-only\">Password</label>\r\n");
      out.write("\t\t\t   <div class=\"position-relative has-icon-right\">\r\n");
      out.write("\t\t\t\t  <input type=\"password\" id=\"exampleInputPassword\" class=\"form-control input-shadow\" placeholder=\"Password\" name=\"admin-password\" required>\r\n");
      out.write("\t\t\t\t  <div class=\"form-control-position\">\r\n");
      out.write("\t\t\t\t\t  <i class=\"icon-lock\"></i>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t   </div>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t  <div><b> <span style=\"color:#00d9e8\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></b></div>\r\n");
      out.write("\t\t\t<div class=\"form-row\">\r\n");
      out.write("\t\t\t <div class=\"form-group col-6\">\r\n");
      out.write("\t\t\t   <div class=\"icheck-material-white\">\r\n");
      out.write("                <input type=\"checkbox\" id=\"user-checkbox\" />\r\n");
      out.write("                <label for=\"user-checkbox\">Ghi nhớ</label>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t <button type=\"submit\" class=\"btn btn-light btn-block\">Đăng nhập</button>\r\n");
      out.write("\t\t\t </form>\r\n");
      out.write("\t\t   </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t     </div>\r\n");
      out.write("    \r\n");
      out.write("     <!--Start Back To Top Button-->\r\n");
      out.write("  \r\n");
      out.write("  </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/view/admin/assets");
    _jspx_th_c_url_0.setVar("url");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }
}
