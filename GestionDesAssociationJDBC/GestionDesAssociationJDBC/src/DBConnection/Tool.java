/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KHALID
 */
public class Tool {

    public static Connection getConnected() throws Exception {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(url, "controle", "123");
            return con;

        } catch (ClassNotFoundException e) {
            throw new Exception("Impossible de charger le Driver");
        } catch (SQLException e) {
            throw new Exception("Impossible de se Connecter " + e.getMessage());
        }
    }
}
