/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.client;

/**
 *
 * @author NeetKing
 */
public class Client {
    private int noclt;
    private String nom;
    private String prenom;
    private String adresse;

    public Client() {
    }

    public Client(int noclt, String nom, String prenom, String adresse) {
        this.noclt = noclt;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public int getNoclt() {
        return noclt;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setNoclt(int noclt) {
        this.noclt = noclt;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
}
