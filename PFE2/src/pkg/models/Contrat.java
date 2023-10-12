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
public class Contrat {
    private int idContrat;
    private Date dateD,dateR;
    private float montant;
    private String matricule;
    private String cinClt;

    public Contrat() {
    }

    public Contrat(int idContrat, Date dateD, Date dateR, float montant, String matricule, String cinClt) {
        this.idContrat = idContrat;
        this.dateD = dateD;
        this.dateR = dateR;
        this.montant = montant;
        this.matricule = matricule;
        this.cinClt = cinClt;
    }

    public int getIdContrat() {
        return idContrat;
    }

    public void setIdContrat(int idContrat) {
        this.idContrat = idContrat;
    }

    public Date getDateD() {
        return dateD;
    }

    public void setDateD(Date dateD) {
        this.dateD = dateD;
    }

    public Date getDateR() {
        return dateR;
    }

    public void setDateR(Date dateR) {
        this.dateR = dateR;
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

    public String getCinClt() {
        return cinClt;
    }

    public void setCinClt(String cinClt) {
        this.cinClt = cinClt;
    }

    @Override
    public String toString() {
        return idContrat+"";
    }
    
    
}
