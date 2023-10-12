/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testwebsevice;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ABDOU
 */
public class appah {
    void ajouter_blage(int idBlage,int idP,String intitule , String cotenu){
        try {
            Connection con = myUtil.getConnected();
            ResultSet rs1 = con.createStatement().executeQuery("select * from participant where idp = '"+idP+"'");
            if (rs1.next()){
                ResultSet rs = con.createStatement().executeQuery("insert into blage values( idBlage ='"+idBlage+"' and  idP='"+idP+"' and intitule='"+intitule+"' and contenu ='"+cotenu+"');");    
            }else{
                JOptionPane.showMessageDialog(null,"id participant non trouvable");
            }
            } catch (SQLException ex) {
            Logger.getLogger(appah.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
