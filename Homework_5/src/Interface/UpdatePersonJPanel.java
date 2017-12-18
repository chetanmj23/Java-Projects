/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.*;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author cheta
 */
public class UpdatePersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdatePersonJPanel
     */
   // private Business business;
    private JPanel UserProcessContainer;
    private Person person;
    public UpdatePersonJPanel(JPanel UserProcessContainer,Person person) {
        initComponents();
        this.UserProcessContainer = UserProcessContainer;
        //this.business = business;
        this.person=person;
        populatetable();
        
    }
    
    private void populatetable()
    {
        firstNamejTextField1.setText(person.getFirstName());
        lastNamejTextField.setText(person.getLastName());
        agejTextField3.setText(String.valueOf(person.getAge()));
        sSNjTextField2.setText(String.valueOf(person.getsSNumber()));
        addressjTextField4.setText(person.getAddress());
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
        jLabel3 = new javax.swing.JLabel();
        firstNamejTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lastNamejTextField = new javax.swing.JTextField();
        updatejButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        sSNjTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        agejTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        addressjTextField4 = new javax.swing.JTextField();
        backCreateNewFlightBtn = new javax.swing.JButton();
        backCreateNewFlightBtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UPDATE USER ACCOUNT ");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("First Name :");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        firstNamejTextField1.setBackground(new java.awt.Color(102, 255, 255));
        firstNamejTextField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        firstNamejTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Last Name :");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        lastNamejTextField.setBackground(new java.awt.Color(102, 255, 255));
        lastNamejTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lastNamejTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        updatejButton.setBackground(new java.awt.Color(0, 153, 51));
        updatejButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updatejButton.setText("Update");
        updatejButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        updatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatejButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SSN :");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        sSNjTextField2.setBackground(new java.awt.Color(102, 255, 255));
        sSNjTextField2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sSNjTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Age :");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        agejTextField3.setBackground(new java.awt.Color(102, 255, 255));
        agejTextField3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        agejTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Address :");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        addressjTextField4.setBackground(new java.awt.Color(102, 255, 255));
        addressjTextField4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addressjTextField4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        backCreateNewFlightBtn.setBackground(new java.awt.Color(255, 51, 51));
        backCreateNewFlightBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backCreateNewFlightBtn.setText(">> Back");
        backCreateNewFlightBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backCreateNewFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backCreateNewFlightBtnActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(firstNamejTextField1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(lastNamejTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(agejTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressjTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(sSNjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(320, Short.MAX_VALUE)
                .addComponent(backCreateNewFlightBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(updatejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(backCreateNewFlightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(firstNamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lastNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sSNjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(agejTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(addressjTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backCreateNewFlightBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(121, 121, 121)
                .addComponent(backCreateNewFlightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatejButtonActionPerformed
        // TODO add your handling code here:
        
         if (validData()){
        String fname = firstNamejTextField1.getText();
        String lname = lastNamejTextField.getText();
        int ssn = Integer.parseInt(sSNjTextField2.getText());
        int age = Integer.parseInt(agejTextField3.getText());
        String address = addressjTextField4.getText();
        
        person.setFirstName(fname);
        person.setLastName(lname);
        person.setAddress(address);
        person.setsSNumber(ssn);
        person.setAge(age);
        
        JOptionPane.showMessageDialog(null, "Updated Successfully");
        
        
         }
        
    }//GEN-LAST:event_updatejButtonActionPerformed

    private void backCreateNewFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backCreateNewFlightBtnActionPerformed
        // TODO add your handling code here:
        UserProcessContainer.remove(this);
        Component[] componentArray = UserProcessContainer.getComponents();
        Component component = componentArray[componentArray.length-1];
        manageHRAdminWorkJPanel managehr = (manageHRAdminWorkJPanel)component;
        managehr.populatetable();
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
        if(firstNamejTextField1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter First Name..");
            return false;
        }
        if(lastNamejTextField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Last Name..");
            return false;
        }
        if(sSNjTextField2.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter SSN..");
            return false;
        }
        if(agejTextField3.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter age..");
            return false;
        }
        if(addressjTextField4.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter First Name..");
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressjTextField4;
    private javax.swing.JTextField agejTextField3;
    private javax.swing.JButton backCreateNewFlightBtn;
    private javax.swing.JButton backCreateNewFlightBtn1;
    private javax.swing.JTextField firstNamejTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField lastNamejTextField;
    private javax.swing.JTextField sSNjTextField2;
    private javax.swing.JButton updatejButton;
    // End of variables declaration//GEN-END:variables
}