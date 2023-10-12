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
@WebServlet(name = "rechecher", urlPatterns = {"/rechecher"})
public class rechecher extends HttpServlet {

    
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String adressDep =request.getParameter("adresse_depart");
            String adressDes =request.getParameter("adresse_destination");
            Connection con = MYutile.connect();
            PreparedStatement ps = con.prepareStatement("select * from trajet where adresse_depart = ? and adresse_destination=?");
            ps.setString(1, adressDep);
            ps.setString(2, adressDes);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("done");
                HttpSession session = request.getSession();
            } else {
                request.setAttribute("ErrorMsg", "login ou mdp incorrect!");
                request.getRequestDispatcher("/login.jsp").forward(request, response);

            }
                    } catch (SQLException ex) {
            Logger.getLogger(rechecher.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(rechecher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
