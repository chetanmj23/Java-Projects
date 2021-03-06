/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Enterprise.Enterprise;
import Business.Organization.AdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cheta
 */
public class ManageAppointments extends javax.swing.JPanel {

    /**
     * Creates new form ManageAppointments
     */
    private Enterprise enterprise;
    private JPanel userProcessContainer;
    private UserAccount ua;
    public ManageAppointments(JPanel userProcessContainer,Enterprise enterprise, UserAccount ua) {
        initComponents();
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
        this.ua = ua;
        populatetable();
    }

    public void populatetable() {
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        model.setRowCount(0);
        
        for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if(org instanceof AdminOrganization) {
                //if(enterprise.getName().equals())
                for(WorkRequest request : org.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request;
            //row[1] = request.getSender().getEmployee().getName();
            row[1] = request.getStatus();
            row[2] = request.getRequestType();
            row[3] = request.getStatus();
            
            model.addRow(row);
        }
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        approvejButton = new javax.swing.JButton();
        rejectjButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(153, 204, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient's Name", "Status", "Type", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 460, 275));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(84, 162, 168));
        jLabel1.setText("Manage Patient's Appointment");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 370, 44));

        approvejButton.setBackground(new java.awt.Color(255, 255, 255));
        approvejButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        approvejButton.setForeground(new java.awt.Color(84, 162, 168));
        approvejButton.setText("Approve");
        approvejButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        approvejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvejButtonActionPerformed(evt);
            }
        });
        add(approvejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 100, 40));

        rejectjButton.setBackground(new java.awt.Color(255, 255, 255));
        rejectjButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rejectjButton.setForeground(new java.awt.Color(84, 162, 168));
        rejectjButton.setText("Reject");
        rejectjButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rejectjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectjButtonActionPerformed(evt);
            }
        });
        add(rejectjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 120, 40));

        backJButton.setBackground(new java.awt.Color(255, 255, 255));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backJButton.setForeground(new java.awt.Color(84, 162, 168));
        backJButton.setText("<< Back");
        backJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 110, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(84, 162, 168));
        jButton1.setText("Assign to me");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 421, 120, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        WorkRequest request = (WorkRequest)jTable1.getValueAt(selectedRow, 0);
        request.setReceiver(ua);
        request.setStatus("Pending");
        populatetable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void approvejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvejButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        WorkRequest request = (WorkRequest)jTable1.getValueAt(selectedRow, 0);
        //request.setReceiver(ua);
        request.setStatus("Approved");
        enterprise.setRevenue(enterprise.getRevenue()+50);
        populatetable();
    }//GEN-LAST:event_approvejButtonActionPerformed

    private void rejectjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        WorkRequest request = (WorkRequest)jTable1.getValueAt(selectedRow, 0);
        //request.setReceiver(ua);
        request.setStatus("Rejected");
        populatetable();
    }//GEN-LAST:event_rejectjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approvejButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton rejectjButton;
    // End of variables declaration//GEN-END:variables
}
