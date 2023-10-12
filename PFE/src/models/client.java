/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author ABDOU
 */
public class client {
    int id_clt;
    String nom;
    String prnom;

    public client(int id_clt, String nom, String prnom) {
        this.id_clt = id_clt;
        this.nom = nom;
        this.prnom = prnom;
    }
    
     public client() {
        
    }

    public int getId_clt() {
        return id_clt;
    }

    public String getNom() {
        return nom;
    }

    public String getPrnom() {
        return prnom;
    }

  

    public void setId_clt(int id_clt) {
        this.id_clt = id_clt;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrnom(String prnom) {
        this.prnom = prnom;
    }

     
     
     
     
    
    
    
}
