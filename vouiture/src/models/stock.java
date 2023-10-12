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
public class stock {
    
    int id_prd ;
    String nom_prd ;
    int qte_prd ;
    float prix ;

    public stock() {
    }
    

    @Override
    public String toString() {
        return  "id_prd=" + id_prd ;
    }

    public void setId_prd(int id_prd) {
        this.id_prd = id_prd;
    }

    public void setNom_prd(String nom_prd) {
        this.nom_prd = nom_prd;
    }

    public void setQte_prd(int qte_prd) {
        this.qte_prd = qte_prd;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getId_prd() {
        return id_prd;
    }

    public String getNom_prd() {
        return nom_prd;
    }

    public int getQte_prd() {
        return qte_prd;
    }

    public float getPrix() {
        return prix;
    }

    public stock(int id_prd, String nom_prd, int qte_prd, float prix) {
        this.id_prd = id_prd;
        this.nom_prd = nom_prd;
        this.qte_prd = qte_prd;
        this.prix = prix;
    }
    
}
