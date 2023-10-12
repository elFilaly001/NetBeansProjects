package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class UtilConnexion {
    
    public static Connection seConnecter() throws Exception{
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection(url,"rds","rds");
            System.out.println("connection ok");
            return con;
        }catch (ClassNotFoundException ex){
            throw new Exception("impossible de charger le driver");
        }catch (SQLException ex){
            throw new Exception("impossible de connecte"+ex.getMessage());
        }

    }
}
