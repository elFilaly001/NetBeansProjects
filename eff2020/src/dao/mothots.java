/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author ABDOU
 */
public class mothots {
    public static void ajouterBlague(int idblague,int idP,String intitule,String contenu) throws SQLException{
        ResultSet rs1 = con.createStatement().executeQuery("select * from participant where idP = "+idP+"" );
        if(rs1.next()){
            String req = "insert into blague values ("+idblague+","+idP+",'"+intitule+"','"+contenu+"')";
        ResultSet rs =  con.createStatement().executeQuery(req);
        }else{
            System.out.println("participant inexistant");
        } 
    }
    public static void suprimerBlague(int idP) throws SQLException{
        ResultSet rs1 = con.createStatement().executeQuery("select * from participant where idP = "+idP+"" );
        if(rs1.next()){
            String req = "delete from blague where idP="+idP+"";
        ResultSet rs =  con.createStatement().executeQuery(req);
        }else{
            System.out.println("participant inexistant");
        } 
    }
    public static int checkdate(Date Datedebut ,Date Datefin) throws SQLException{
            String req = "select count(id_vote) from vote  where date_vote>"+Datedebut+" and date_vote<"+Datefin+"";
        ResultSet rs =  con.createStatement().executeQuery(req);
         return  ;
    }
    public stat
