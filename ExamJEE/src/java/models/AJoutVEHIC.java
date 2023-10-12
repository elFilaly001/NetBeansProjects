/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ABDOU
 */
@WebServlet(name = "AJoutVEHIC", urlPatterns = {"/AJoutVEHIC"})
public class AJoutVEHIC extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

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
            PreparedStatement ps = MyUtil.connect().prepareStatement("insert into vehicule(matricule,idutilisateur,type) values(?,?,?)");
            ps.setString(1, request.getParameter("matricule"));
            ps.setString(2, request.getParameter("uti"));
            ps.setString(3, request.getParameter("vehicule"));

            ps.executeUpdate();
            PrintWriter out = response.getWriter();
            out.print("vehicule ajouter avec succes");
        } catch (Exception ex) {
            Logger.getLogger(AJoutVEHIC.class.getName()).log(Level.SEVERE, null, ex);
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
