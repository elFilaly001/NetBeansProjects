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
public class Client {
    private String cin_clt;
    private String nom_clt;
    private String prenom_clt;
    private String adresse;
    private String tel;
    private String permis;

    public Client() {
    }

    public Client(String cin_clt, String nom_clt, String prenom_clt, String adresse, String tel, String permis) {
        this.cin_clt = cin_clt;
        this.nom_clt = nom_clt;
        this.prenom_clt = prenom_clt;
        this.adresse = adresse;
        this.tel = tel;
        this.permis = permis;
    }

    public String getCin_clt() {
        return cin_clt;
    }

    public String getNom_clt() {
        return nom_clt;
    }

    public String getPrenom_clt() {
        return prenom_clt;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTel() {
        return tel;
    }

    public String getPermis() {
        return permis;
    }

    public void setCin_clt(String cin_clt) {
        this.cin_clt = cin_clt;
    }

    public void setNom_clt(String nom_clt) {
        this.nom_clt = nom_clt;
    }

    public void setPrenom_clt(String prenom_clt) {
        this.prenom_clt = prenom_clt;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setPermis(String permis) {
        this.permis = permis;
    }

    @Override
    public String toString() {
        return cin_clt ;
    }
    
            
}
