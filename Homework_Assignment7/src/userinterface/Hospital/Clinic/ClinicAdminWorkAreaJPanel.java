/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */

package userinterface.Hospital.Clinic;

import Business.EcoSystem;
import userinterface.Hospital.*;
import Business.Enterprise.Enterprise;
import Business.Organization.ClinicOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  cheta
 */
public class ClinicAdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    UserAccount account; 
    ClinicOrganization organization; 
    Enterprise enterprise; 
    EcoSystem business;
    /** Creates new form AdminWorkAreaJPanel */
    public ClinicAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ClinicOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account=account;
        this.business=business;
        this.organization= organization;
        valueLabel.setText(enterprise.getName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Clinic Work Area -Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        userJButton.setText("Manage User Account");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 170, -1));

        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 170, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 120, 30));
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 130, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        ClinicManageUserAccountJPanel muajp = new ClinicManageUserAccountJPanel( userProcessContainer,  account,  organization,  enterprise,  business);
        userProcessContainer.add("ClinicManageUserAccountJPanel", muajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        ClinicManageEmployeeJPanel manageEmployeeJPanel = new ClinicManageEmployeeJPanel(userProcessContainer,  account,  organization,  enterprise,  business);
        userProcessContainer.add("ClinicManageEmployeeJPanel", manageEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton userJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
