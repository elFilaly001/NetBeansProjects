package Models;

/*
Create user assos identified by assos;
   grant connect, resource to assos;
Create table Ville(Id_Ville VARCHAR2(30) PRIMARY KEY, Nom_Ville VARCHAR2(30), Pays VARCHAR2(30));
Create table Volontaire(Id_Vlt VARCHAR2(30) PRIMARY KEY, Nom_Vlt VARCHAR2(30),Prenom_Vlt VARCHAR2(30),
Mail VARCHAR2(30), Mot_Passe VARCHAR2(30), Id_Ville VARCHAR2(30),
CONSTRAINT fk_idv FOREIGN KEY(Id_Ville) REFERENCES Ville(Id_Ville),Actif VARCHAR2(30)); 
Create table Association(Id_Ass VARCHAR2(30) PRIMARY KEY, Nom_Ass VARCHAR2(30), RaisonSocial VARCHAR2(30),
Adresse VARCHAR2(30), Telephone NUMBER(10), Id_Ville VARCHAR2(30), CONSTRAINT fk_idv2 FOREIGN KEY(Id_Ville) REFERENCES Ville(Id_Ville));
Create table Stage(Id_Stage VARCHAR2(30) PRIMARY KEY, Date_Debut DATE, Date_Fin DATE, Id_Association VARCHAR2(30),
CONSTRAINT fk_idass FOREIGN KEY(Id_Association) REFERENCES Association(Id_Ass));
Create table Demande_Inscription(Id_Inscription VARCHAR2(30) PRIMARY KEY, Date_Demande Date,
Id_Volentaire VARCHAR2(30), CONSTRAINT id_vol FOREIGN KEY(Id_Volentaire) REFERENCES Volontaire(Id_Vlt),
Id_Stage VARCHAR2(30), CONSTRAINT id_sta_fk FOREIGN KEY(Id_Stage) REFERENCES Stage(Id_Stage), Etat VARCHAR2(30));
INSERT INTO VILLE VALUES('B8000', 'Casablanca', 'Maroc');
INSERT INTO VILLE VALUES('B9000', 'Paris', 'France');
INSERT INTO VILLE VALUES('B7000', 'Rabat', 'Maroc');
INSERT INTO VILLE VALUES('B5000', 'Eljadida', 'Maroc');
INSERT INTO VILLE VALUES('B4000', 'Oujda', 'Maroc');

INSERT INTO VOLONTAIRE VALUES('r7000', 'kkkk','jjjj','tttyh3', 'yyyyy', 'B8000', 'ON');
INSERT INTO VOLONTAIRE VALUES('r9000', 'ttt','oooo','tttyh7', 'zzzzz', 'B9000', 'OFF');

INSERT INTO ASSOCIATION VALUES('o999', 'rrrr', 'mmmm', 'trrgtrg', 0677282, 'B8000');
INSERT INTO ASSOCIATION VALUES('o998', 'bbbb', 'iiiiii', 'tythyth', 067755, 'B9000');
INSERT INTO ASSOCIATION VALUES('o997', 'bbbb', 'iiiiii', 'tythyth', 067755, 'B7000');

INSERT INTO STAGE values('rtt7', '01-jan-19', '02-jan-18', 'o999');
INSERT INTO STAGE values('rtt9', '01-feb-20', '02-feb-20', 'o998');

INSERT INTO DEMANDE_INSCRIPTION VALUES('ryui9', '12-jul-18', 'r7000', 'rtt7', 'trgtr');
INSERT INTO DEMANDE_INSCRIPTION VALUES('ryui0', '11-jun-18', 'r9000', 'rtt9', 'trgtr');
 */
public class Association {
    private String id_ass;
    private String nom_ass;
    private String raisonsocial;
    private String adresse;
    private int telepone;
    private String id_ville;

    public Association() {
    }
    
    public Association(String id_ass, String nom_ass, String raisonsocial, String adresse, int telepone, String id_ville) {
        this.id_ass = id_ass;
        this.nom_ass = nom_ass;
        this.raisonsocial = raisonsocial;
        this.adresse = adresse;
        this.telepone = telepone;
        this.id_ville = id_ville;
    }

    public String getId_ass() {
        return id_ass;
    }

    public void setId_ass(String id_ass) {
        this.id_ass = id_ass;
    }

    public String getNom_ass() {
        return nom_ass;
    }

    public void setNom_ass(String nom_ass) {
        this.nom_ass = nom_ass;
    }

    public String getRaisonsocial() {
        return raisonsocial;
    }

    public void setRaisonsocial(String raisonsocial) {
        this.raisonsocial = raisonsocial;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getTelepone() {
        return telepone;
    }

    public void setTelepone(int telepone) {
        this.telepone = telepone;
    }

    public String getId_ville() {
        return id_ville;
    }

    public void setId_ville(String id_ville) {
        this.id_ville = id_ville;
    }
    
    
}
