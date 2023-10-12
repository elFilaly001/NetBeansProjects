/*
 * To change this license header, choose License Headers in Project Properties.
 * To cfgfhhange this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author IMANE
 */
public class service {
    public  static  Connection getcon(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
           
           return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","gescom","123");
           
        } catch (ClassNotFoundException ex) {
            System.err.println("class not found");
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        return  null ;
    }
    
       public static void main(String[] args) {
        getcon();
    } 
    
}
