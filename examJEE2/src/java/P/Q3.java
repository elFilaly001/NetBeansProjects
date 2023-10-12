/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ABDOU
 */
public class Q3 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Q3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Q3 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Connection con =MyUtil.seConnecter();
            ResultSet r=con.createStatement().executeQuery(" select * from jardin where jardinier='"+request.getParameter("id")+"'");
            PrintWriter out=response.getWriter();
            String resultat="";
            while(r.next()){
                resultat+="<tr class='numjardin' id='"+r.getString(1)+"'><td>"+r.getString(1)+"</td><td>"+r.getString(2)+"</td><td>"+r.getString(3)+"</td><td>"+r.getString(4)+"</td><td>"+r.getString(5)+"</td></tr>";
            }
            out.print(resultat);
        } catch (SQLException ex) {
            Logger.getLogger(Q3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Q3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Connection con =MyUtil.seConnecter();
            ResultSet r=con.createStatement().executeQuery(" select * from contenu where Jardin='"+request.getParameter("id")+"'");
            PrintWriter out=response.getWriter();
            String resultat="";
            while(r.next()){
                resultat+="<tr><td>"+r.getString(1)+"</td><td>"+r.getString(2)+"</td><td>"+r.getString(3)+"</td><td>"+r.getString(4)+"</td></tr>";
            }
            out.print(resultat);
        } catch (Exception ex) {
            Logger.getLogger(Q3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
