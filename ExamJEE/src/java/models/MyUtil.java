/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DEll
 */
public class MyUtil {
    
        public static Connection connect() throws Exception{
            try {
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(url, "user","pass");
            System.out.println("connection succeded");
            return con;
            
        } catch (ClassNotFoundException ex) {
            throw new Exception("enable to charge driver");
        } catch (SQLException ex) {
            throw new Exception("enable to connect"+ex.getMessage());
        }
        }
        
        
    
       
}
