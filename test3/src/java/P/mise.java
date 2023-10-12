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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ABDOU
 */
public class mise extends HttpServlet {

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
        processRequest(request, response);
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
        String idch=request.getParameter("idc");
        String nom = request.getParameter("nom");
        String des = request.getParameter("des");
        String lab = request.getParameter("lab");
        String pass = request.getParameter("pas");
        String op = request.getParameter("op");
        
        if(op.equals("ajouter")){
            try {
                MyUtil.seConnecter().createStatement().executeUpdate("insert into chercheur values('"+idch+"','"+nom+"','"+des+"','"+lab+"','"+pass+"')");
                request.getRequestDispatcher("mise.jsp").forward(request, response);
            } catch (Exception ex) {
                Logger.getLogger(mise.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }else if (op.equals("modifier")){
            try {
                MyUtil.seConnecter().createStatement().executeUpdate("update chercheur set nomp='"+nom+"',DESIGNATION='"+des+"',labo='"+lab+"', pass='"+pass+"' where idch='"+idch+"'");
                request.getRequestDispatcher("mise.jsp").forward(request, response);
            } catch (Exception ex) {
                Logger.getLogger(mise.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }else if (op.equals("suprimer")){
                 try {
                MyUtil.seConnecter().createStatement().executeUpdate("delete from chercheur where idch='"+idch+"'");
                request.getRequestDispatcher("mise.jsp").forward(request, response);
            } catch (Exception ex) {
                Logger.getLogger(mise.class.getName()).log(Level.SEVERE, null, ex);
            }   
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
