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
@WebServlet(name = "AjoutUser", urlPatterns = {"/AjoutUser"})
public class AjoutUser extends HttpServlet {

    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Connection con=MyUtil.connect();
            PreparedStatement ps=con.prepareStatement("insert into utilisateur values(?,?,?,?,?,?)");
            String idUser=request.getParameter("idUser");
            String nom=request.getParameter("nom");
            String prenom=request.getParameter("prenom");
            String email=request.getParameter("email");
            String pass=request.getParameter("pass");
            String tel=request.getParameter("tel");
            ps.setString(1, idUser);
            ps.setString(2, nom);
            ps.setString(3, prenom);
            ps.setString(4, email);
            ps.setString(5, pass);
            ps.setString(6, tel);
            ps.executeUpdate();
            
            request.setAttribute("msg",nom+" a ete ajouter avec succes");
            //request.getRequestDispatcher("/listpersonnes.jsp").forward(request, response);
            PrintWriter pw=response.getWriter();
            pw.print("<h1>personne ajouter avec success</h1>");
        } catch (SQLException ex) {
            Logger.getLogger(AjoutUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(AjoutUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
