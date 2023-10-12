/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.sql.Date;

/**
 *
 * @author ABDOU
 */
public class acquisition {
    private int id_acquisition;
    private Date date_acq;
    private int montant;

    public acquisition(int id_acquisition, Date date_acq, int montant) {
        this.id_acquisition = id_acquisition;
        this.date_acq = date_acq;
        this.montant = montant;
    }
    
    
    public acquisition() {
    }

    public int getId_acquisition() {
        return id_acquisition;
    }

    public Date getDate_acq() {
        return date_acq;
    }

    public int getMontant() {
        return montant;
    }

    public void setId_acquisition(int id_acquisition) {
        this.id_acquisition = id_acquisition;
    }

    public void setDate_acq(Date date_acq) {
        this.date_acq = date_acq;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }
    
}
