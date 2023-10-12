/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.security.util.Length;

/**
 *
 * @author ABDOU
 */
public class conseiller {
    private int codeComplex,nombreVisite;
    private String nom,prenom,codeSecret,Matricule;

    public String getMatricule() {
        return Matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setMatricule(String Matricule) {
        this.Matricule = Matricule;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public conseiller(String Matricule, int codeComplex, int nombreVisite, String nom, String prenom, String codeSecret) {
        this.Matricule = Matricule;
        this.codeComplex = codeComplex;
        this.nombreVisite = nombreVisite;
        this.nom = nom;
        this.prenom = prenom;
        if(codeSecret.length() >= 3){
        this.codeSecret = codeSecret;
        }
    }

    public conseiller() {   
    }

    @Override
    public String toString() {
        return "Matricule=" + Matricule + ", codeComplex=" + codeComplex + ", nombreVisite=" + nombreVisite + ", nom=" + nom + ", prenom=" + prenom + ", codeSecret=" + codeSecret + '}';
    }
    
    public conseiller conseiller_look(String matricule , String codeSecret){
        try {
            Connection con = myUtil.getConnected();
            ResultSet rs = con.createStatement().executeQuery("select * from conseiller where matricule ="+matricule+" and codeSecret ="+codeSecret+" ");
            if(rs.next()){
                 return new conseiller(matricule,Integer.parseInt(rs.getString(2)),Integer.parseInt(rs.getString(3)),rs.getString(4), rs.getString(5), codeSecret);
            }else{
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(conseiller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
}
    
}
