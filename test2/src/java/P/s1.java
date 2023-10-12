/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author ABDOU
 */
public class s1 extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String login = request.getParameter("login");
            String pwd = request.getParameter("mdp");
        ResultSet rs = MyUtil.seConnecter().createStatement().executeQuery(" select * from compte where login='"+login+"' and mdp = '" +pwd+ "' ") ;
            if(rs.next()){
                if(rs.getString(3).equals("admin")){
                    request.getRequestDispatcher("admin.jsp").forward(request, response);
                }else{
                    request.getRequestDispatcher("user.jsp").forward(request, response);
                }
            }else{
                request.getRequestDispatcher("loging.jsp").forward(request, response);
            }
        } catch (Exception ex) {
            Logger.getLogger(s1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
