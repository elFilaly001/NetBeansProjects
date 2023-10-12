/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
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
@WebServlet(name = "inscrip", urlPatterns = {"/inscrip"})
public class inscrip extends HttpServlet {
   

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            Connection con=MYutile.connect();
            PreparedStatement ps=con.prepareStatement("insert into covoiturier values(?,?,?,?,?)");
            String notel=request.getParameter("notel");
            String nomcov=request.getParameter("nomcov");
            String prenomcov=request.getParameter("prenomcov");
            String emailcov=request.getParameter("emailcov");
            String mdp=request.getParameter("motdepasse");
            
            
            ps.setString(1, notel);
            ps.setString(2, nomcov);
            ps.setString(3, prenomcov);
            ps.setString(4, emailcov);
            ps.setString(5, mdp);
            ps.executeUpdate();
            
            request.setAttribute("msg",nomcov+" a ete ajouter avec succes");
            //request.getRequestDispatcher("/listpersonnes.jsp").forward(request, response);
            PrintWriter pw=response.getWriter();
            pw.print("<h1>covoiturier ajouter avec success</h1>");
        } catch (SQLException ex) {
            Logger.getLogger(inscrip.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(inscrip.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
