package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import P.MyUtil;

public final class mise_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        table{\n");
      out.write("            float:left;\n");
      out.write("            margin-left: 50px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" action=\"mise\"> <h3>CHERCHEUR</h3>\n");
      out.write("        <table>\n");
      out.write("            <tr> \n");
      out.write("                <td><label>Id Chercheur</label> </td>\n");
      out.write("                <td><input type=\"text\" name=\"idc\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><label>Nom</label></td>\n");
      out.write("                <td><input type=\"text\" name=\"nom\"> </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><label>Designation</label> </td>\n");
      out.write("                <td><input type=\"text\" name=\"des\"> </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><label>Laboratoire</label> </td>\n");
      out.write("                <td><input type=\"text\" name=\"lab\"> </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><label>Pass</label></td>\n");
      out.write("                <td><input type=\"text\" name=\"pas\"> </td>\n");
      out.write("            </tr>\n");
      out.write("                     \n");
      out.write("        </table>\n");
      out.write("        ");
 ResultSet rs= MyUtil.seConnecter().createStatement().executeQuery("select * from chercheur ");
      out.write("\n");
      out.write("        <table border=\"2px\">\n");
      out.write("             <tr>\n");
      out.write("                <td>idch</td>\n");
      out.write("                <td>nom </td>\n");
      out.write("                <td>desingnation</td>\n");
      out.write("                <td>laboratoit</td>\n");
      out.write("                <td>pass</td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            ");
int i=0;
                while(rs.next()){
                i++;
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write(" \n");
      out.write("            <tr>\n");
      out.write("                <td><input type=\"submit\" name=\"op\" value=\"ajouter\"></td>\n");
      out.write("                <td><input type=\"submit\" name=\"op\" value=\"modifier\"></td>\n");
      out.write("                <td><input type=\"submit\" name=\"op\" value=\"suprimer\"></td>\n");
      out.write("            </tr>   \n");
      out.write("        </table>\n");
      out.write("        </form>\n");
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
