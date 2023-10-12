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
public class Article {
    private int noart;
    private String libele;
    private float prix;
    

    public Article() {
    }

    public Article(int noart, String libele, float prix) {
        this.noart = noart;
        this.libele = libele;
        this.prix = prix;
        
    }

   

    

    public int getNoart() {
        return noart;
    }

    public String getLibele() {
        return libele;
    }

    public float getPrix() {
        return prix;
    }

   

    public void setNoart(int noart) {
        this.noart = noart;
    }

    public void setLibele(String libele) {
        this.libele = libele;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return   " " + noart + " " + libele + "  " + prix ;
    }

   

    
    
    
    
}
