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
public class CreatePersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePersonJPanel
     */
    private Business business;
    private JPanel UserProcessContainer;
    public CreatePersonJPanel(JPanel UserProcessContainer, Business business) {
        initComponents();
        this.UserProcessContainer = UserProcessContainer;
        this.business = business;
       // populatetable();
    }
    
//    private void populatetable(){
//        
//        
//    }

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
        firstNamejTextField = new javax.swing.JTextField();
        createjButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lastNamejTextField1 = new javax.swing.JTextField();
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
        jLabel1.setText("CREATE USER PERSONAL DETAILS");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("First Name :");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        firstNamejTextField.setBackground(new java.awt.Color(102, 255, 255));
        firstNamejTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        firstNamejTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        createjButton1.setBackground(new java.awt.Color(0, 153, 51));
        createjButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        createjButton1.setText("Create");
        createjButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        createjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createjButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Last Name :");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        lastNamejTextField1.setBackground(new java.awt.Color(102, 255, 255));
        lastNamejTextField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lastNamejTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

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
        backCreateNewFlightBtn.setText("Cancel");
        backCreateNewFlightBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backCreateNewFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backCreateNewFlightBtnActionPerformed(evt);
            }
        });

        backCreateNewFlightBtn1.setBackground(new java.awt.Color(255, 51, 51));
        backCreateNewFlightBtn1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backCreateNewFlightBtn1.setText(">> Back");
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
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backCreateNewFlightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(49, 49, 49)
                            .addComponent(agejTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(sSNjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(49, 49, 49)
                                    .addComponent(lastNamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(49, 49, 49)
                                    .addComponent(firstNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(49, 49, 49)
                            .addComponent(addressjTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addComponent(createjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(backCreateNewFlightBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(767, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(firstNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lastNamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sSNjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(agejTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(addressjTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backCreateNewFlightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(543, Short.MAX_VALUE)
                    .addComponent(backCreateNewFlightBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(9, 9, 9)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createjButton1ActionPerformed
        // TODO add your handling code here:
        
        if (validData()){
        String fname = firstNamejTextField.getText();
        String lname = lastNamejTextField1.getText();
        int ssn = Integer.parseInt(sSNjTextField2.getText());
        int age = Integer.parseInt(agejTextField3.getText());
        String address = addressjTextField4.getText();
        
        Person person = business.getPersondirectory().addPerson();
        
        person.setFirstName(fname);
        person.setLastName(lname);
        person.setAge(age);
        person.setsSNumber(ssn);
        person.setAddress(address);
        
        JOptionPane.showMessageDialog(null, "New Person added to the organistaion");
        
        firstNamejTextField.setText("");
        lastNamejTextField1.setText("");
        sSNjTextField2.setText("");
        agejTextField3.setText("");
        addressjTextField4.setText("");
        
        }
    }//GEN-LAST:event_createjButton1ActionPerformed

    private void backCreateNewFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backCreateNewFlightBtnActionPerformed
        // TODO add your handling code here:
        UserProcessContainer.remove(this);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.previous(UserProcessContainer);

    }//GEN-LAST:event_backCreateNewFlightBtnActionPerformed

    private void backCreateNewFlightBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backCreateNewFlightBtn1ActionPerformed
        // TODO add your handling code here:
        UserProcessContainer.remove(this);
        Component[] componentArray = UserProcessContainer.getComponents();
        Component component = componentArray[componentArray.length-1];
        manageHRAdminWorkJPanel managehr = (manageHRAdminWorkJPanel)component;
        managehr.populatetable();
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.previous(UserProcessContainer);
    }//GEN-LAST:event_backCreateNewFlightBtn1ActionPerformed

   private boolean validData() {
        //To change body of generated methods, choose Tools | Templates.
        if(firstNamejTextField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter First Name..");
            return false;
        }
        if(lastNamejTextField1.getText().equals(""))
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
    private javax.swing.JButton createjButton1;
    private javax.swing.JTextField firstNamejTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField lastNamejTextField1;
    private javax.swing.JTextField sSNjTextField2;
    // End of variables declaration//GEN-END:variables
}
