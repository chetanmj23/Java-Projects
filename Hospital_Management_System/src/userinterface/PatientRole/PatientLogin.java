/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Container;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.Feedback.FeedbackPanel;

/**
 *
 * @author cheta
 */
public class PatientLogin extends javax.swing.JPanel {

    /**
     * Creates new form PatientLogin
     */
//    public PatientLogin() {
//        
//    }
private JPanel userProcessContainer;
//    private DoctorOrganization organization;
    private Enterprise enterprise;
    private UserAccount account;
    private EcoSystem business;
    public PatientLogin(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.business=business;
        populateAppointmentTable();
       
    }
    
    public void populateAppointmentTable(){
        DefaultTableModel model = (DefaultTableModel) appointmentjTable1.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[2];
            row[0] = request.getRequestType();
            row[1] = request.getStatus();
            
            model.addRow(row);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        appointmentjTable1 = new javax.swing.JTable();
        scheduleNewApptjButton = new javax.swing.JButton();
        cancelApptjButton = new javax.swing.JButton();
        backjButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(84, 162, 168));
        jLabel1.setText("Patient Login");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 140, 60));

        appointmentjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Appointment Type", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(appointmentjTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, 97));

        scheduleNewApptjButton.setBackground(new java.awt.Color(255, 255, 255));
        scheduleNewApptjButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        scheduleNewApptjButton.setForeground(new java.awt.Color(84, 162, 168));
        scheduleNewApptjButton.setText("Schedule New Appointment");
        scheduleNewApptjButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        scheduleNewApptjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleNewApptjButtonActionPerformed(evt);
            }
        });
        add(scheduleNewApptjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 190, 50));

        cancelApptjButton.setBackground(new java.awt.Color(255, 255, 255));
        cancelApptjButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancelApptjButton.setForeground(new java.awt.Color(84, 162, 168));
        cancelApptjButton.setText("Cancel Appointment");
        cancelApptjButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(cancelApptjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 150, 50));

        backjButton.setBackground(new java.awt.Color(255, 255, 255));
        backjButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backjButton.setForeground(new java.awt.Color(84, 162, 168));
        backjButton.setText("<< Back");
        backjButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });
        add(backjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 100, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(84, 162, 168));
        jButton1.setText("Refresh");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 100, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backjButtonActionPerformed

    private void scheduleNewApptjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleNewApptjButtonActionPerformed
        // TODO add your handling code here:
        PatientAppotintmentSchedule patientappointjpanel = new PatientAppotintmentSchedule(userProcessContainer,business,account);
        userProcessContainer.add("PatientAppotintmentSchedule", patientappointjpanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_scheduleNewApptjButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        populateAppointmentTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable appointmentjTable1;
    private javax.swing.JButton backjButton;
    private javax.swing.JButton cancelApptjButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton scheduleNewApptjButton;
    // End of variables declaration//GEN-END:variables
}
