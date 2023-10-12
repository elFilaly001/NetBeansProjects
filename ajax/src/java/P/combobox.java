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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ABDOU
 */
public class combobox extends HttpServlet {

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
            out.println("<title>Servlet combobox</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet combobox at " + request.getContextPath() + "</h1>");
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
            String R2="";
            ResultSet rs1 = MyUtil.seConnecter().createStatement().executeQuery("select * from location where nopermis='"+request.getParameter("cond")+"'");
            while (rs1.next()){
                R2+="<option id='"+rs1.getString(1)+"'>"+rs1.getString(1)+"</option>";
            } 
            PrintWriter out1 = response.getWriter();
            out1.print(R2);
        } catch (SQLException ex) {
            Logger.getLogger(combobox.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(combobox.class.getName()).log(Level.SEVERE, null, ex);
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
            String op=request.getParameter("op");
            if(op.equals("c")){
              String r="";
            ResultSet rs = MyUtil.seConnecter().createStatement().executeQuery("select * from conducteur");
            while (rs.next()){
                r+="<option>"+rs.getString(1)+"</option>";
            } 
            PrintWriter out = response.getWriter();
            out.print(r);  
            }else{
            String R="";
            ResultSet rs1 = MyUtil.seConnecter().createStatement().executeQuery("select * from location where nopermis='"+request.getParameter("id")+"'");
            while (rs1.next()){
                R+="<option id='"+rs1.getString(1)+"'>"+rs1.getString(1)+"</option>";
            } 
            PrintWriter out1 = response.getWriter();
            out1.print(R);
            }
        } catch (Exception ex) {
            Logger.getLogger(combobox.class.getName()).log(Level.SEVERE, null, ex);
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
