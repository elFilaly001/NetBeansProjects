/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ABDOU
 */
public class UtilConn {
    public static  Connection seConnecter() throws Exception{
        
        String url="jdbc:oracle:thin:@localhost:1521:xe";
       try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection(url,"stock","123");
            System.out.println("connexion ok");
            return con;
            
       }catch (ClassNotFoundException ex) {
           throw new Exception ("impossible de charger le driver");
           
       }catch(SQLException ex){
           
           throw new Exception ("impossible de se connecter" +ex.getMessage());
       }
       
        
        
    }
    
}
