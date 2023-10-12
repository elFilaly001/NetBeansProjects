package Models;


import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saad
 */
public class Stage {
   private String id_stage;
   private Date date_debut;
   private Date date_fin;
   private String id_Association;

    public Stage() {
    }

    public Stage(String id_stage, Date date_debut, Date date_fin, String id_Association) {
        this.id_stage = id_stage;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.id_Association = id_Association;
    }

    public String getId_stage() {
        return id_stage;
    }

    public void setId_stage(String id_stage) {
        this.id_stage = id_stage;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public String getId_Association() {
        return id_Association;
    }

    public void setId_Association(String id_Association) {
        this.id_Association = id_Association;
    }
   
        
    
}
