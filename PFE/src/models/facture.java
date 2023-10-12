/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author ABDOU
 */
public class facture {
    int id_fact,id_lnfact ;
    int id_prd;
    int qte_fct;
    int total;

    public facture(int id_fact, int id_prd, int qte_fct, int total) {
        this.id_fact = id_fact;
        this.id_prd = id_prd;
        this.qte_fct = qte_fct;
        this.total = total;
    }
    
    public facture() {
    }
    

    public int getId_fact() {
        return id_fact;
    }

    public int getId_prd() {
        return id_prd;
    }

    public int getQte_fct() {
        return qte_fct;
    }

    public int getTotale() {
        return total;
    }

    public void setId_fact(int id_fact) {
        this.id_fact = id_fact;
    }

    public void setId_prd(int id_prd) {
        this.id_prd = id_prd;
    }

    public void setQte_fct(int qte_fct) {
        this.qte_fct = qte_fct;
    }

    public void setTotale(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return  " "+id_prd ;
    }  
}
