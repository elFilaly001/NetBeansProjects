package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import P.MyUtil;

public final class combobox_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"jquery.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                alert(\"ab\");\n");
      out.write("                $.ajax({\n");
      out.write("                    url:'combobox',\n");
      out.write("                    type: 'POST',\n");
      out.write("                    dataType:'html',\n");
      out.write("                    data: '&op=c',\n");
      out.write("                    success: function (r) {\n");
      out.write("                        $('#cond').append(r);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            $('#cond').change(function (){\n");
      out.write("                alert(\"a\")\n");
      out.write("                $.ajax({\n");
      out.write("                    url:'combobox',\n");
      out.write("                    type: 'post',\n");
      out.write("                    dataType:'html',\n");
      out.write("                    data:(\"id=\"+$('#cond').val()+\"&op:'ch'\"),\n");
      out.write("                    success:function (R){\n");
      out.write("                       $(\"#loc\").html(R);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <label>no conducteur</label>\n");
      out.write("        <select id=\"cond\">\n");
      out.write("           \n");
      out.write("        </select>\n");
      out.write("        <label>location</label>\n");
      out.write("        <select id=\"loc\">\n");
      out.write("           \n");
      out.write("        </select>\n");
      out.write("    </body>\n");
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
