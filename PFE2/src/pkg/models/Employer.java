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
public class Employer {
    private String cin_emp;
    private String nom_emp;
    private String prenom_emp;
    private String adresse_emp;
    private String tel;
    private String fonction;

    public Employer() {
    }

    public Employer(String cin_emp, String nom_emp, String prenom_emp, String adresse_emp, String tel, String fonction) {
        this.cin_emp = cin_emp;
        this.nom_emp = nom_emp;
        this.prenom_emp = prenom_emp;
        this.adresse_emp = adresse_emp;
        this.tel = tel;
        this.fonction = fonction;
    }

    public String getCin_emp() {
        return cin_emp;
    }

    public String getNom_emp() {
        return nom_emp;
    }

    public String getPrenom_emp() {
        return prenom_emp;
    }

    public String getAdresse_emp() {
        return adresse_emp;
    }

    public String getTel() {
        return tel;
    }

    public String getFonction() {
        return fonction;
    }

    public void setCin_emp(String cin_emp) {
        this.cin_emp = cin_emp;
    }

    public void setNom_emp(String nom_emp) {
        this.nom_emp = nom_emp;
    }

    public void setPrenom_emp(String prenom_emp) {
        this.prenom_emp = prenom_emp;
    }

    public void setAdresse_emp(String adresse_emp) {
        this.adresse_emp = adresse_emp;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }
    
    
    
}
