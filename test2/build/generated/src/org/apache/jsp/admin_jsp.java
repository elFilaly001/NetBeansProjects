package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import P.MyUtil;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"ajou\" method=\"post\">\n");
      out.write("         <label>nom article</label><br>\n");
      out.write("        <input name=\"noma\" type=\"text\" /><br>\n");
      out.write("        <label>couleur</label><br>\n");
      out.write("        <input name=\"coul\" type=\"text\"/><br>\n");
      out.write("        <label>prixachat</label><br>\n");
      out.write("        <input name=\"prixa\" type=\"text\"/><br>\n");
      out.write("        <label>prixvente</label><br>\n");
      out.write("        <input name=\"prixv\" type=\"text\"/><br>\n");
      out.write("        <label>qte</label><br>\n");
      out.write("        <input name=\"qte\" type=\"text\"/><br>\n");
      out.write("        <input type=\"submit\"  name=\"op\" value=\"ajouter\" />\n");
      out.write("        <input type=\"submit\"  name=\"op\" value=\"modifier\"/>\n");
      out.write("        <input type=\"submit\"  name=\"op\" value=\"suprimer\" onclick=\"return confirm('Are you sure you want to delete this item?');\"/>\n");
      out.write("        <br>\n");
      out.write("        </form>\n");
      out.write("        ");
 ResultSet rs = MyUtil.seConnecter().createStatement().executeQuery("select * from article");
      out.write("\n");
      out.write("        <table border=\"2px solid\">\n");
      out.write("            <tr>\n");
      out.write("                <td>code art</td>\n");
      out.write("                <td>nom art</td>\n");
      out.write("                <td>couleur</td>\n");
      out.write("                <td>prix achat</td>\n");
      out.write("                <td>prix vente</td>\n");
      out.write("                <td>qte</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
while(rs.next()){
      out.write("\n");
      out.write("            <tr>\n");
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
      out.write("                <td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </table>\n");
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
