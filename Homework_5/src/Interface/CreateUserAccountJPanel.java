/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.*;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author cheta
 */
public class CreateUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateUserAccountJPanel
     */
    private JPanel UserProcessContainer;
    private Business business;
    public CreateUserAccountJPanel(JPanel UserProcessContainer,Business business) {
        initComponents();
        this.UserProcessContainer=UserProcessContainer;
        this.business=business;
        comboinit();
        comboAddRole();
        comboStatus();
    }
   
    public void comboinit() {
        personComboBox.removeAllItems();
        for (Person person : business.getPersondirectory().getPersonDirectory()) {
            personComboBox.addItem(person);
        }
    }
    public void comboAddRole()
    {
//        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) roleComboBox.getModel();
//        dcbm.setSelectedItem(0);
//        
//        Object row1 = new Object();
//        row1 = "System Admin"; 
//        dcbm.addElement(row1);
//        
//        Object row2 = new Object();
//        row2 = "HR Admin"; 
//        dcbm.addElement(row2);
//        
//        Object row3 = new Object();
//        row3 = "User"; 
//        dcbm.addElement(row3);
        
        roleComboBox.removeAllItems();
        Object row1 = new Object();
        row1= "System Admin";
        roleComboBox.addItem(row1);
        
        Object row2 = new Object();
        row2= "HR Admin";
        roleComboBox.addItem(row2);
        
        
        Object row3 = new Object();
        row3= "User";
        roleComboBox.addItem(row3);
        
    }
    
    public void comboStatus()
    {
        statusComboBox1.removeAllItems();
        Object row1 = new Object();
        row1= "Active";
        statusComboBox1.addItem(row1);
        
        Object row2 = new Object();
        row2= "Inactive";
        statusComboBox1.addItem(row2);
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        personComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        userIDjTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        roleComboBox = new javax.swing.JComboBox();
        loginjPasswordField = new javax.swing.JPasswordField();
        createjButton1 = new javax.swing.JButton();
        backCreateNewFlightBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        statusComboBox1 = new javax.swing.JComboBox();
        backCreateNewFlightBtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREATE USER ACCOUNT ");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Select Person :");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        personComboBox.setBackground(new java.awt.Color(255, 204, 204));
        personComboBox.setMaximumRowCount(20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("USER ID :");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        userIDjTextField.setBackground(new java.awt.Color(102, 255, 255));
        userIDjTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userIDjTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Password :");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Select a Role :");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        roleComboBox.setBackground(new java.awt.Color(255, 204, 204));
        roleComboBox.setMaximumRowCount(20);

        loginjPasswordField.setBackground(new java.awt.Color(102, 255, 255));
        loginjPasswordField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        loginjPasswordField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        createjButton1.setBackground(new java.awt.Color(0, 153, 51));
        createjButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        createjButton1.setText("Create");
        createjButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        createjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createjButton1ActionPerformed(evt);
            }
        });

        backCreateNewFlightBtn.setBackground(new java.awt.Color(255, 51, 51));
        backCreateNewFlightBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backCreateNewFlightBtn.setText(">> Back");
        backCreateNewFlightBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backCreateNewFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backCreateNewFlightBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Status :");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        statusComboBox1.setBackground(new java.awt.Color(255, 204, 204));
        statusComboBox1.setMaximumRowCount(20);

        backCreateNewFlightBtn1.setBackground(new java.awt.Color(255, 51, 51));
        backCreateNewFlightBtn1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backCreateNewFlightBtn1.setText("Cancel");
        backCreateNewFlightBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backCreateNewFlightBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backCreateNewFlightBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(backCreateNewFlightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(backCreateNewFlightBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(54, 54, 54)
                                    .addComponent(statusComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(54, 54, 54)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(roleComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(userIDjTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                            .addComponent(personComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(loginjPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(54, 54, 54)
                        .addComponent(createjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(personComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userIDjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(loginjPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(statusComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backCreateNewFlightBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(backCreateNewFlightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createjButton1ActionPerformed
        // TODO add your handling code here:
        
        if (validData()){
        Person p = (Person) personComboBox.getSelectedItem();
        String userid = userIDjTextField.getText();
        String password = loginjPasswordField.getText();
        String role = (String) roleComboBox.getSelectedItem();
        String status = (String) statusComboBox1.getSelectedItem();
        
        UserAccount useraccount = business.getUseraccountdirectory().addUserAccount();
        useraccount.setUserID(userid);
        useraccount.setPassword(password);
        useraccount.setRole(role);
        useraccount.setStatus(status);
        
        p.setUseraccount(useraccount);
        
        
        JOptionPane.showMessageDialog(null, "Role added to the person");
        }
    }//GEN-LAST:event_createjButton1ActionPerformed

    private void backCreateNewFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backCreateNewFlightBtnActionPerformed
        // TODO add your handling code here:
        UserProcessContainer.remove(this);
        Component[] componentArray = UserProcessContainer.getComponents();
        Component component = componentArray[componentArray.length-1];
        ManageUserAccountJPanel manageUserAccount = (ManageUserAccountJPanel)component;
        manageUserAccount.populatetable();
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.previous(UserProcessContainer);
    }//GEN-LAST:event_backCreateNewFlightBtnActionPerformed

    private void backCreateNewFlightBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backCreateNewFlightBtn1ActionPerformed
        // TODO add your handling code here:
        UserProcessContainer.remove(this);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.previous(UserProcessContainer);
    }//GEN-LAST:event_backCreateNewFlightBtn1ActionPerformed
    private boolean validData() {
        //To change body of generated methods, choose Tools | Templates.
        if(userIDjTextField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter UserID..");
            return false;
        }
        if(loginjPasswordField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Password..");
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backCreateNewFlightBtn;
    private javax.swing.JButton backCreateNewFlightBtn1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton createjButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField loginjPasswordField;
    private javax.swing.JComboBox personComboBox;
    private javax.swing.JComboBox roleComboBox;
    private javax.swing.JComboBox statusComboBox1;
    private javax.swing.JTextField userIDjTextField;
    // End of variables declaration//GEN-END:variables
}