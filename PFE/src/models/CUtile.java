/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ABDOU
 */
public class CUtile {
    
    public static Connection getConnected() throws Exception {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(url, "voitur", "123");
            return con;

        } catch (ClassNotFoundException e) {
            throw new Exception("Impossible de charger le Driver");
        } catch (SQLException e) {
            throw new Exception("Impossible de se Connecter " + e.getMessage());
        }
    }
    
}
