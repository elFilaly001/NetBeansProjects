/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg.models;

/**
 *
 * @author user
 */
public class Voiture {
    private String Matricule;
    private int Model;
    private String Marque;
    private String Couleur;
    private String Carburant;
    private String Etat;
    private float Prix;

    public Voiture() {
    }

    public Voiture(String Matricule, int Model, String Marque, String Couleur, String Carburant, String Etat, float Prix) {
        this.Matricule = Matricule;
        this.Model = Model;
        this.Marque = Marque;
        this.Couleur = Couleur;
        this.Carburant = Carburant;
        this.Etat = Etat;
        this.Prix = Prix;
    }

    

  

    public String getMatricule() {
        return Matricule;
    }

    public int getModel() {
        return Model;
    }

    public String getMarque() {
        return Marque;
    }

    public String getCouleur() {
        return Couleur;
    }

    public String getCarburant() {
        return Carburant;
    }

    public String getEtat() {
        return Etat;
    }

    public float getPrix() {
        return Prix;
    }

    public void setMatricule(String Matricule) {
        this.Matricule = Matricule;
    }

    public void setModel(int Model) {
        this.Model = Model;
    }

    public void setMarque(String Marque) {
        this.Marque = Marque;
    }

    public void setCouleur(String Couleur) {
        this.Couleur = Couleur;
    }

    public void setCarburant(String Carburant) {
        this.Carburant = Carburant;
    }

    public void setEtat(String Etat) {
        this.Etat = Etat;
    }

    public void setPrix(float Prix) {
        this.Prix = Prix;
    }

    @Override
    public String toString() {
        return Matricule;
    }
    
    
    
}
