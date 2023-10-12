/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

/**
 *
 * @author ABDOU
 */
public class Produit {
     private int id_produit ;
    private String nom;
    private int Qte_stock;

    public Produit(int id_produit, String nom, int Qte_stock) {
        this.id_produit = id_produit;
        this.nom = nom;
        this.Qte_stock = Qte_stock;
    }
    
    
    public Produit() {
       
    }


    public int getId_produit() {
        return id_produit;
    }

    public String getNom() {
        return nom;
    }

    public int getQte_stock() {
        return Qte_stock;
    }

    public void setId_produit(int id_produit) {
        this.id_produit = id_produit;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setQte_stock(int Qte_stock) {
        this.Qte_stock = Qte_stock;
    }
    
}
