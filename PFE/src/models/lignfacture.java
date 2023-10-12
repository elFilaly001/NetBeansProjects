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
public class lignfacture {
    
    int id_lnfct , id_clt , id_vt , totallnfct ;

    public lignfacture(int id_lnfct, int id_clt, int id_vt, int totallnfct) {
        this.id_lnfct = id_lnfct;
        this.id_clt = id_clt;
        this.id_vt = id_vt;
        this.totallnfct = totallnfct;
    }
    
    public lignfacture() {
       
    }

    public int getId_lnfct() {
        return id_lnfct;
    }

    public int getId_clt() {
        return id_clt;
    }

    public int getId_vt() {
        return id_vt;
    }

    public int getTotallnfct() {
        return totallnfct;
    }

    public void setId_lnfct(int id_lnfct) {
        this.id_lnfct = id_lnfct;
    }

    public void setId_clt(int id_clt) {
        this.id_clt = id_clt;
    }

    public void setId_vt(int id_vt) {
        this.id_vt = id_vt;
    }

    public void setTotallnfct(int totallnfct) {
        this.totallnfct = totallnfct;
    }

    @Override
    public String toString() {
        return  " " + totallnfct ;
    }
    
    
    
}
