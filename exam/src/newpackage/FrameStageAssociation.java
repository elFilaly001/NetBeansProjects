package newpackage;


import com.sun.rowset.WebRowSetImpl;
import exam.UtilConnexion;
import exam.association;
import exam.Stage;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;
import javax.sql.rowset.WebRowSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author saad
 */
public class FrameStageAssociation extends javax.swing.JFrame {

    ArrayList<Stage> listAss = new ArrayList<Stage>();
    DefaultTableModel dtm = null;

    public FrameStageAssociation() {
        initComponents();
        dtm = (DefaultTableModel) jTable1.getModel();
        buttonGroup1.add(rdbAssos);
        buttonGroup1.add(rdbperiode);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        rdbperiode = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtdatedebut = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtdatefin = new javax.swing.JTextField();
        rdbAssos = new javax.swing.JRadioButton();
        cbxAssoc = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnAfficher = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnExporter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        rdbperiode.setText("Par Periode");

        jLabel1.setText("Date debut");

        jLabel2.setText("Date fin");

        rdbAssos.setSelected(true);
        rdbAssos.setText("Par association");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Liste Des demandes d'inscription:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_stage", "date_debut", "date_fin", "id_associatin"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Liste Des stages:");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_inscription", "Date_demande", "id_Volentaire", "nom_vlt", "prenom_vlt", "Etat"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        btnAfficher.setText("Afficher");
        btnAfficher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfficherActionPerformed(evt);
            }
        });

        jLabel5.setText("(dd-mmm-yy)");

        btnExporter.setText("Exporter XML");
        btnExporter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExporterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rdbperiode)
                                    .addGap(35, 35, 35)
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtdatedebut, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtdatefin, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(rdbAssos))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAfficher, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(143, 143, 143)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxAssoc, 0, 84, Short.MAX_VALUE)
                                .addGap(46, 46, 46))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnExporter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel5))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbperiode)
                    .addComponent(jLabel1)
                    .addComponent(txtdatedebut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtdatefin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbAssos)
                    .addComponent(cbxAssoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAfficher)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnExporter)))
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            Connection con = UtilConnexion.seConnecter();
            Statement st = con.createStatement();
            String req = "select id_ass from association";
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                cbxAssoc.addItem(rs.getInt(1));
            }
            rs.close();
        } catch (Exception ex) {
            Logger.getLogger(FrameStageAssociation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnAfficherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfficherActionPerformed
        String req = "select * from stage where ";
        if (rdbperiode.isSelected()) {
            req += "Date_debut >= '" + txtdatedebut.getText() + "' and Date_fin <='" + txtdatefin.getText() + "'";
        }
        if (rdbAssos.isSelected()) {
            req += "id_ass ='" + cbxAssoc.getSelectedItem().toString() + "' ";
        }
        try {
            Connection con =UtilConnexion.seConnecter();
            PreparedStatement ps = con.prepareStatement(req);
            ResultSet rs = ps.executeQuery(req);
            DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
            df.setRowCount(0);
            while (rs.next()) {
                df.addRow(new Object[]{rs.getString(1), rs.getDate(2), rs.getString(3), rs.getString(4)});
            }
            rs.close();
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(frameasoociation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAfficherActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        try {
            DefaultTableModel df1 = (DefaultTableModel) jTable1.getModel();
            DefaultTableModel df2 = (DefaultTableModel) jTable2.getModel();
            int i = jTable1.getSelectedRow();
            Connection con = UtilConnexion.seConnecter();
            PreparedStatement ps = con.prepareStatement("select * from demande_inscription where id_stage=?");
            ps.setInt(1, Integer.parseInt(df1.getValueAt(i, 0).toString()));
            ResultSet rs = ps.executeQuery();

            df2.setRowCount(0);
            while (rs.next()) {
                df2.addRow(new Object[]{rs.getString(1), rs.getDate(2), rs.getString(3), rs.getString(4), rs.getString(5)});
            }
        } catch (Exception ex) {
            Logger.getLogger(FrameStageAssociation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnExporterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExporterActionPerformed
        // TODO add your handling code here:
        String req = "select * from stage where ";
        if (rdbperiode.isSelected()) {
            req += "Date_debut >= '" + txtdatedebut.getText() + "' and Date_fin <='" + txtdatefin.getText() + "'";
        }
        if (rdbAssos.isSelected()) {
            req += "id_ass ='" + cbxAssoc.getSelectedItem().toString() + "' ";
        }
        try {
            Connection con = UtilConnexion.seConnecter();
            PreparedStatement ps = con.prepareStatement(req);
            ResultSet rs = ps.executeQuery(req);
            WebRowSet ws=new WebRowSetImpl();
            ws.populate(rs);
            ws.writeXml(new FileOutputStream(new File("src\\liststage.xml")));
            JOptionPane.showMessageDialog(rootPane, "XML generer avec succes.");
          
        } catch (Exception ex) {
            Logger.getLogger(frameasoociation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExporterActionPerformed

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
            java.util.logging.Logger.getLogger(FrameStageAssociation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameStageAssociation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameStageAssociation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameStageAssociation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameStageAssociation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAfficher;
    private javax.swing.JButton btnExporter;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<Integer> cbxAssoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JRadioButton rdbAssos;
    private javax.swing.JRadioButton rdbperiode;
    private javax.swing.JTextField txtdatedebut;
    private javax.swing.JTextField txtdatefin;
    // End of variables declaration//GEN-END:variables
}
