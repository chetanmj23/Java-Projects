/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Feedback;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.ReviewCommOrganization;
import Business.ReviewCommittee.Feedback;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cheta
 */
public class FeedbackPanel extends javax.swing.JPanel {

    /**
     * Creates new form FeedbackPanel
     */
    
    private Enterprise enterprise;
    private JPanel userProcessContainer;
   // private UserAccount ua1;
    private EcoSystem system;
    public FeedbackPanel(JPanel container, EcoSystem system, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=container;
        this.system=system;
       // this.ua1=ua1;
        this.enterprise=enterprise;
        populatehospitalcombobox();
        populatetable1(enterprise);
    }

    

    
    public void populatehospitalcombobox()
    {
        hospitalNamejComboBox1.removeAllItems();
        
        
        
        ArrayList<Network> net = system.getNetworkList();
        Network n = net.get(0);
        
        
        
        for(Enterprise ent: n.getEnterpriseDirectory().getEnterpriseList())
        {
            if(ent instanceof HospitalEnterprise)
            {
                hospitalNamejComboBox1.addItem(ent);
            }
        }
    }
    
    private void populatetable1(Enterprise enterp)
    {
        doctorNamejComboBox2.removeAllItems();
        enterp = (Enterprise)hospitalNamejComboBox1.getSelectedItem();
        for(Organization org: enterp.getOrganizationDirectory().getOrganizationList())
        {
            if(org instanceof DoctorOrganization)
            {
               
                ArrayList<Employee> doctors = org.getEmployeeDirectory().getEmployeeList();
                for(Employee emp : doctors) {
                    doctorNamejComboBox2.addItem(emp);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hospitalNamejComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        doctorNamejComboBox2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        exitjButton2 = new javax.swing.JButton();
        Submit = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(84, 162, 168));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Feedback Pool");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 13, 896, 46));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(84, 162, 168));
        jLabel2.setText("Hosptial :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 55, 23));

        hospitalNamejComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        hospitalNamejComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalNamejComboBox1ActionPerformed(evt);
            }
        });
        add(hospitalNamejComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 146, 37));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(84, 162, 168));
        jLabel3.setText("Doctor :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 55, 23));

        doctorNamejComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(doctorNamejComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 146, 38));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(84, 162, 168));
        jLabel4.setText("Feedback/Complaints :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 260, 121));

        exitjButton2.setBackground(new java.awt.Color(255, 255, 255));
        exitjButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        exitjButton2.setForeground(new java.awt.Color(84, 162, 168));
        exitjButton2.setText("<< Exit");
        exitjButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitjButton2ActionPerformed(evt);
            }
        });
        add(exitjButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 91, 42));

        Submit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Submit.setForeground(new java.awt.Color(84, 162, 168));
        Submit.setText("Submit");
        Submit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 80, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void hospitalNamejComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalNamejComboBox1ActionPerformed
        // TODO add your handling code here:
        Enterprise enterp = (Enterprise)hospitalNamejComboBox1.getSelectedItem();
        if(enterp!=null)
        {
           populatetable1(enterp);
        }
    }//GEN-LAST:event_hospitalNamejComboBox1ActionPerformed

    private void exitjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitjButton2ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_exitjButton2ActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        Enterprise ent = (Enterprise) hospitalNamejComboBox1.getSelectedItem();
        Employee doctor = (Employee) doctorNamejComboBox2.getSelectedItem();
        String complaint = jTextArea1.getText();
        
        Organization reviewComm = null;
        
        for(Organization or : ent.getOrganizationDirectory().getOrganizationList()) {
            if(or instanceof ReviewCommOrganization) {
                reviewComm = or;
            }
        }
        
        Feedback f = reviewComm.getFeedbacklist().addP();
        f.setHospital(ent);
        f.setDoctor(doctor);
        f.setText(complaint);
        
        JOptionPane.showMessageDialog(null, "Feedback Sent");
    }//GEN-LAST:event_SubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit;
    private javax.swing.JComboBox doctorNamejComboBox2;
    private javax.swing.JButton exitjButton2;
    private javax.swing.JComboBox hospitalNamejComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
