package Frames;

import DBConnection.Tool;
import Models.Association;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author saad
 */
public class FrameAssociation extends javax.swing.JFrame {

    private int pos = 0;
    ArrayList<Association> list = new ArrayList<>();

    public FrameAssociation() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtidass = new javax.swing.JTextField();
        txtnomass = new javax.swing.JTextField();
        txtraisonass = new javax.swing.JTextField();
        txtadresse = new javax.swing.JTextField();
        txttelephone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnajt = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        btnrechercher = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnNouveau = new javax.swing.JButton();
        CbxVille = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Id association");

        jLabel2.setText("Nom association");

        jLabel3.setText("Raison Association");

        jLabel4.setText("Adresse");

        jLabel5.setText("Telephone");

        jLabel6.setText("Id Ville");

        btnajt.setText("Ajouter");
        btnajt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnajtActionPerformed(evt);
            }
        });

        btnModifier.setText("Modifier");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        btnrechercher.setText("Rechercher");
        btnrechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrechercherActionPerformed(evt);
            }
        });

        jButton1.setText("<<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText(">");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText(">>");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnNouveau.setText("Nouveau");
        btnNouveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNouveauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(174, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txttelephone, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(txtadresse)
                    .addComponent(txtraisonass)
                    .addComponent(txtnomass)
                    .addComponent(txtidass)
                    .addComponent(CbxVille, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnrechercher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnajt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNouveau, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtidass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnomass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtraisonass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtadresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txttelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnajt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnrechercher)
                        .addGap(13, 13, 13)
                        .addComponent(btnModifier)
                        .addGap(18, 18, 18)
                        .addComponent(btnNouveau)
                        .addGap(2, 2, 2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CbxVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            Connection con = Tool.getConnected();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from association");
            while (rs.next()) {
                list.add(new Association(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6)));
            }
            rs = st.executeQuery("select id_ville from ville");
            while (rs.next()) {
                CbxVille.addItem(rs.getInt(1));
            }
            JOptionPane.showMessageDialog(null, "connexion avec succes");
            rs.close();
            con.close();
            afficher();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pos = 0;
        afficher();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            pos--;
            afficher();
        } catch (Exception e) {
            pos++;
            afficher();
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            pos++;
            afficher();
        } catch (Exception e) {
            pos--;
            afficher();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        pos = list.size() - 1;
        afficher();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnajtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnajtActionPerformed
        Association a = list.get(pos);
        try {
            Connection con = Tool.getConnected();
            PreparedStatement ps = con.prepareStatement("insert into ASSOCIATION values(seq_ass.nextval,?,?,?,?,?)");
            //ps.setString(1,txtidass.getText());
            ps.setString(1, txtnomass.getText());
            ps.setString(2, txtraisonass.getText());
            ps.setString(3, txtadresse.getText());
            ps.setInt(4, Integer.parseInt(txttelephone.getText()));
            ps.setString(5, CbxVille.getSelectedItem().toString());
            ps.executeUpdate();

            a.setId_ass(txtidass.getText());
            a.setNom_ass(txtnomass.getText());
            a.setRaisonsocial(txtraisonass.getText());
            a.setAdresse(txtadresse.getText());
            a.setTelepone(Integer.parseInt(txttelephone.getText()));
            a.setId_ville(CbxVille.getSelectedItem().toString());
            list.add(a);
            pos = list.size() - 1;
            JOptionPane.showMessageDialog(null, "ajouter avec succes");
        } catch (Exception ex) {
            Logger.getLogger(FrameAssociation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnajtActionPerformed

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        Association a = list.get(pos);
        try {
            Connection con = Tool.getConnected();
            PreparedStatement ps = con.prepareStatement("update ASSOCIATION set NOM_ASS=?,RAISONSOCIAL=?,ADRESSE=?,TELEPHONE=?,ID_VILLE=? where ID_ASS=?");
            ps.setString(1, txtnomass.getText());
            ps.setString(2, txtraisonass.getText());
            ps.setString(3, txtadresse.getText());
            ps.setInt(4, Integer.parseInt(txttelephone.getText()));
            ps.setString(5, CbxVille.getSelectedItem().toString());
            ps.setString(6, a.getId_ass());
            ps.executeUpdate();
            a.setNom_ass(txtnomass.getText());
            a.setRaisonsocial(txtraisonass.getText());
            a.setAdresse(txtadresse.getText());
            a.setTelepone(Integer.parseInt(txttelephone.getText()));
            a.setId_ville(CbxVille.getSelectedItem().toString());

            list.add(a);
            pos = list.size() - 1;
            JOptionPane.showMessageDialog(null, "modifier avec succes");
        } catch (Exception ex) {
            Logger.getLogger(FrameAssociation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnModifierActionPerformed

    private void btnrechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrechercherActionPerformed
        try {
            Connection con = Tool.getConnected();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * from association WHERE ID_ASS LIKE '%" + txtidass.getText() + "%'");
            if (rs.next()) {
                list.add(new Association(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6)));
            }

            rs.close();
            con.close();
            afficher();
            JOptionPane.showMessageDialog(null, "Association trouve avec succés!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Association non trouve!");
        }
    }//GEN-LAST:event_btnrechercherActionPerformed

    private void btnNouveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNouveauActionPerformed

        txtidass.setText("");
        txtnomass.setText("");
        txtraisonass.setText("");
        txtadresse.setText("");
        txttelephone.setText("");
    }//GEN-LAST:event_btnNouveauActionPerformed
    public void afficher() {
        Association a = list.get(pos);
        txtidass.setText(a.getId_ass());
        txtnomass.setText(a.getNom_ass());
        txtraisonass.setText(a.getRaisonsocial());
        txtadresse.setText(a.getAdresse());
        txttelephone.setText(a.getTelepone() + "");
        CbxVille.setSelectedItem(a.getId_ville());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameAssociation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAssociation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAssociation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAssociation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameAssociation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Integer> CbxVille;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnNouveau;
    private javax.swing.JButton btnajt;
    private javax.swing.JButton btnrechercher;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtadresse;
    private javax.swing.JTextField txtidass;
    private javax.swing.JTextField txtnomass;
    private javax.swing.JTextField txtraisonass;
    private javax.swing.JTextField txttelephone;
    // End of variables declaration//GEN-END:variables
}
