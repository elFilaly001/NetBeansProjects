/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author Pc
 */
public class association {
    int id_ass;
    String nom_ass;
    String raisonsocial;
    String adresse;
    int telephone;
    String id_ville;

    public association() {
    }

    public association(int id_ass, String nom_ass, String raisonsocial, String adresse, int telephone, String id_ville) {
        this.id_ass = id_ass;
        this.nom_ass = nom_ass;
        this.raisonsocial = raisonsocial;
        this.adresse = adresse;
        this.telephone = telephone;
        this.id_ville = id_ville;
    }

    public int getId_ass() {
        return id_ass;
    }

    public String getNom_ass() {
        return nom_ass;
    }

    public String getRaisonsocial() {
        return raisonsocial;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getTelephone() {
        return telephone;
    }

    public String getId_ville() {
        return id_ville;
    }

    public void setId_ass(int id_ass) {
        this.id_ass = id_ass;
    }

    public void setNom_ass(String nom_ass) {
        this.nom_ass = nom_ass;
    }

    public void setRaisonsocial(String raisonsocial) {
        this.raisonsocial = raisonsocial;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public void setId_ville(String id_ville) {
        this.id_ville = id_ville;
    }
    
}
