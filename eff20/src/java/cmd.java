/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import P.MyUtil;
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
public class cmd extends HttpServlet {

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
            String supp =request.getParameter("supp");
            P.MyUtil.seConnecter().createStatement().executeUpdate("delete from article where codeart='"+supp+"'");
            request.getRequestDispatcher("cmd.jsp").forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(cmd.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
         String op=request.getParameter("sup");
        if(op.equals("suprimer")){
        try {
                
       String[] choix =request.getParameterValues("choix");
       String req ="delete from article where codeart in(";
       for (int i=0;i<choix.length;i++){
           req+=""+choix[i]+","; 
       }
       req+=")";
       MyUtil.seConnecter().createStatement().executeUpdate(req);
           } catch (SQLException ex) {
               Logger.getLogger(cmd.class.getName()).log(Level.SEVERE, null, ex);
           } catch (Exception ex) {
               Logger.getLogger(cmd.class.getName()).log(Level.SEVERE, null, ex);
           }
       request.getRequestDispatcher("cmd.jsp").forward(request, response);
    }else{
            try {
                String a =request.getParameter("sup");
                MyUtil.seConnecter().createStatement().executeUpdate("delete from article where codeart='"+a+"'");
            } catch (Exception ex) {
                Logger.getLogger(cmd.class.getName()).log(Level.SEVERE, null, ex);
            }
            request.getRequestDispatcher("cmd.jsp").forward(request, response);
        }}

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
