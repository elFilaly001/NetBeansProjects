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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ABDOU
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

    
   

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String emailcov = request.getParameter("emailcov");
            String mdp = request.getParameter("motedpasse");
            String emailP = request.getParameter("emailP");
            Connection con = MYutile.connect();
            PreparedStatement ps = con.prepareStatement("select * from proprietaire pr , covoiturier cov where pr.emailP=? and pr.motdepasse=? or cov.emailcov=? and cov.motdepasse=? ");
            ps.setString(1, emailP);
            ps.setString(2, mdp);
            ps.setString(2, emailcov);
            ps.setString(3, mdp);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("done");
                HttpSession session = request.getSession();
               
            } else {
                request.setAttribute("ErrorMsg", "email ou mdp incorrect!");
                request.getRequestDispatcher("/login.jsp").forward(request, response);

            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
