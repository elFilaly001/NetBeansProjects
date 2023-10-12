/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.logging.Logger;

/**
 *
 * @author ABDOU
 */
public class voiture {
    
    int id_vt ;
    String mrk_vt;
    int id_clt ;

    public voiture(int id_vt, String mrk_vt, int id_clt) {
        this.id_vt = id_vt;
        this.mrk_vt = mrk_vt;
        this.id_clt = id_clt;
    }

   
     public voiture() {
       
    }

    public int getId_vt() {
        return id_vt;
    }

    public String getMrk_vt() {
        return mrk_vt;
    }

    public int getId_clt() {
        return id_clt;
    }

    public void setId_vt(int id_vt) {
        this.id_vt = id_vt;
    }

    public void setMrk_vt(String mrk_vt) {
        this.mrk_vt = mrk_vt;
    }

    public void setId_clt(int id_clt) {
        this.id_clt = id_clt;
    }
    
     
     

     
}
