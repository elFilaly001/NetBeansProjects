/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gnots.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author DEll
 */
@Entity
@Table(name="Compte"
    ,schema="GNOTES"
)
public class Compte {
    private String login;
    private String mdp;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    @Id 
    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public Compte(String login, String mdp) {
        this.login = login;
        this.mdp = mdp;
    }

    public Compte() {
    }
    
    
}
