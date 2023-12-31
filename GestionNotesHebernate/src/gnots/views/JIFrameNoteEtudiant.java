/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gnots.views;


import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;
import org.hibernate.Session;
import gnots.models.Etudiant;
import gnots.models.Groupe;
import gnots.dao.HibernateUtil;
import gnots.models.Notes;

/**
 *
 * @author DEll
 */
public class JIFrameNoteEtudiant extends javax.swing.JInternalFrame {
    Session session=null;
    EtudiantEcouteur ecouteur=new EtudiantEcouteur();

    /**
     * Creates new form JIframeNoteEtudiant
     */
    public JIFrameNoteEtudiant() {
        initComponents();
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
        cbxGroupe = new javax.swing.JComboBox<>();
        cbxEtudiant = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setClosable(true);
        setForeground(java.awt.Color.white);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setAutoscrolls(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setText("Groupe :");

        jLabel2.setText("Etudiant :");

        cbxGroupe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxGroupeItemStateChanged(evt);
            }
        });
        cbxGroupe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxGroupeActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Module", "Date Examen", "Professeur", "Note"
            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxEtudiant, 0, 307, Short.MAX_VALUE)
                            .addComponent(cbxGroupe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxEtudiant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        session=HibernateUtil.getSession();
        List<Groupe> listGrp=new ArrayList<>();
        listGrp=session.createQuery("From Groupe").list();
        for(Groupe g:listGrp){
            cbxGroupe.addItem(g);
        }
        cbxEtudiant.addItemListener(ecouteur);
    }//GEN-LAST:event_formInternalFrameOpened

    private void cbxGroupeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxGroupeActionPerformed
        
    }//GEN-LAST:event_cbxGroupeActionPerformed

    private void cbxGroupeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxGroupeItemStateChanged
        // TODO add your handling code here:
        //cbxEtudiant.removeActionListener(ecouteur);
         Query q=session.createQuery("From Etudiant e where e.groupe.idG=:idg");
        Groupe g=(Groupe) cbxGroupe.getSelectedItem();
        q.setLong("idg",g.getIdG());
        cbxEtudiant.removeItemListener(ecouteur);
        cbxEtudiant.removeAllItems();
        List<Etudiant> listEtud=new ArrayList<>();
        listEtud=q.list();
        for(Etudiant e:listEtud){
            cbxEtudiant.addItem(e);
        }
        cbxEtudiant.addItemListener(ecouteur);
    }//GEN-LAST:event_cbxGroupeItemStateChanged
 
    class EtudiantEcouteur implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent evt) {
           //Query q=session.createQuery("From Notes n where n.etudiant.idE=:ide");
           Etudiant e=(Etudiant) cbxEtudiant.getSelectedItem();
           //q.setLong("ide",e.getIdE());
           //List<Notes> listN=q.list();
            DefaultTableModel model=(DefaultTableModel) table.getModel();
            model.setRowCount(0);
            for(Notes n:e.getNoteses()){
                model.addRow(new Object[]{
                    n.getExamen().getModule().getLibele(),n.getExamen().getDateexamen(),n.getExamen().getProfesseur().getNomprof(),n.getNote()
                });
            }
           
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Etudiant> cbxEtudiant;
    private javax.swing.JComboBox<Groupe> cbxGroupe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
