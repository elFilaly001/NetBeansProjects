/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class MyUtil {
    public static Connection seConnecter() throws Exception
    {
        Connection con=null;
        String url="jdbc:oracle:thin:@localhost:1521/XE";
        String user="web2";
        String mdp="123";
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
           con=DriverManager.getConnection(url,user,mdp);
           System.out.println("connected succefully");
           return con;
        }catch(ClassNotFoundException ex){
            throw new Exception("Impossible de charger le driver");
        }catch(SQLException e){
             throw new Exception("Problem de connexion "+e.getMessage());
        }
        
    }
    public static void main(String [] args) throws Exception {
        MyUtil.seConnecter();
    }
}
