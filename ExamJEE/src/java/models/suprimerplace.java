/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

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
@WebServlet(name = "suprimerplace", urlPatterns = {"/suprimerplace"})
public class suprimerplace extends HttpServlet {

   

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Connection con=MyUtil.connect();
            PreparedStatement ps=con.prepareStatement("delete from placeStationnement where idplace=?");
            String idplace=request.getParameter("idplace");
            
            
            ps.setString(1, idplace);
           
            ps.executeUpdate();
            
            request.setAttribute("msg","supprimer avec succes");
        } catch (Exception ex) {
            Logger.getLogger(suprimerplace.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Connection con=MyUtil.connect();
            PreparedStatement ps=con.prepareStatement("delete from placeStationnement where idplace=?");
            String []idplaces=request.getParameterValues("idplaces");
            
            for(String idplace:idplaces){
                ps.setString(1, idplace);
                
                ps.executeUpdate();
            }
            
            request.setAttribute("msg","places supprimes avec succes");
            
        } catch (SQLException ex) {
            Logger.getLogger(suprimerplace.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(suprimerplace.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
