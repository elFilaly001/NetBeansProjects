package hebernat;
// Generated Feb 3, 2022 3:08:52 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Client generated by hbm2java
 */
public class Client  implements java.io.Serializable {


     private long codeclt;
     private String nom;
     private Long catc;
     private String vilc;
     private Set commandes = new HashSet(0);

    public Client() {
    }

	
    public Client(long codeclt) {
        this.codeclt = codeclt;
    }
    public Client(long codeclt, String nom, Long catc, String vilc, Set commandes) {
       this.codeclt = codeclt;
       this.nom = nom;
       this.catc = catc;
       this.vilc = vilc;
       this.commandes = commandes;
    }
    public Client(long codeclt, String nom, Long catc, String vilc) {
       this.codeclt = codeclt;
       this.nom = nom;
       this.catc = catc;
       this.vilc = vilc;
    }
   
    public long getCodeclt() {
        return this.codeclt;
    }
    
    public void setCodeclt(long codeclt) {
        this.codeclt = codeclt;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Long getCatc() {
        return this.catc;
    }
    
    public void setCatc(Long catc) {
        this.catc = catc;
    }
    public String getVilc() {
        return this.vilc;
    }
    
    public void setVilc(String vilc) {
        this.vilc = vilc;
    }
    public Set getCommandes() {
        return this.commandes;
    }
    
    public void setCommandes(Set commandes) {
        this.commandes = commandes;
    }




}


