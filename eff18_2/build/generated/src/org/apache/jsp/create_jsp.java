package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class create_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <label>no permit</label><br>\n");
      out.write("        <input type=\"text\" name=\"noper\"><br>\n");
      out.write("        <label>nom conducteur</label><br>\n");
      out.write("        <input type=\"text\" name=\"nomcond\"><br>\n");
      out.write("        <label>prenom conducteur</label><br>\n");
      out.write("        <input type=\"text\" name=\"prenomcond\"><br>\n");
      out.write("        <label>email</label><br>\n");
      out.write("        <input type=\"text\" name=\"email\"><br>\n");
      out.write("        <label> mot de pass</label><br>\n");
      out.write("        <input type=\"text\" name=\"mdp\"><br>\n");
      out.write("        <label>confirmer mot de pass</label><br>\n");
      out.write("        <input type=\"text\" name=\"cmdp\"><br>\n");
      out.write("        <input type=\"submit\" name=\"create\" value=\"VALIDER\" onclick=\"conf()\"><br>\n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("        function conf() {\n");
      out.write("    var a = document.getElementsByName(\"mdp\").value;\n");
      out.write("    var b = document.getElementsByName(\"cmdp\").value;\n");
      out.write("    \n");
      out.write("    if(a!=b){\n");
      out.write("        alert(\"mot de pass correspondent\");\n");
      out.write("        return false;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("}\n");
      out.write("    </script>\n");
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
