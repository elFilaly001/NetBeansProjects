/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg.models;

import java.util.Date;



/**
 *
 * @author user
 */
public class Reparation {
    private int numrep;
    private String dscrp;
    private float montant;
    private String matricule;
    private Date date;

    public Reparation() {
    }

    public Reparation(int numrep, String dscrp, float montant, String matricule, Date date) {
        this.numrep = numrep;
        this.dscrp = dscrp;
        this.montant = montant;
        this.matricule = matricule;
        this.date = date;
    }

   

    public int getNumrep() {
        return numrep;
    }

    public void setNumrep(int numrep) {
        this.numrep = numrep;
    }

    public String getDscrp() {
        return dscrp;
    }

    public void setDscrp(String dscrp) {
        this.dscrp = dscrp;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    

    @Override
    public String toString() {
        return  matricule ;
    }

   

  
    
    
    
}
