/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.*;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cheta
 */
public class ManageTravelAgencyJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageTravelAgencyJpanel
     */
    private JPanel UserProcessContainer;
    private TravelAgency travelagency;
//    public ManageTravelAgencyJpanel() {
//        initComponents();
//        this.UserProcessContainer=UserProcessContainer;
//    }

    ManageTravelAgencyJpanel(JPanel UserProcessContainer,TravelAgency travelagency) {
         initComponents();
        this.UserProcessContainer=UserProcessContainer;
        this.travelagency =travelagency;
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
        fromManageTraveltxtfld = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        toManageTraveltxtfld = new javax.swing.JTextField();
        searchManageTraveljButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        manageTraveljTable1 = new javax.swing.JTable();
        backManageTraveljButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(900, 650));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Manage Travel Agency");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("From :");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        fromManageTraveltxtfld.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("To :");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        toManageTraveltxtfld.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        searchManageTraveljButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        searchManageTraveljButton.setText("Search");
        searchManageTraveljButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        searchManageTraveljButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchManageTraveljButtonActionPerformed(evt);
            }
        });

        manageTraveljTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airline Name", "Flight ID", "Source", "Destination", "Capacity", "Time of the Day"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(manageTraveljTable1);

        backManageTraveljButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backManageTraveljButton.setText(">>Back");
        backManageTraveljButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backManageTraveljButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backManageTraveljButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addComponent(searchManageTraveljButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backManageTraveljButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(fromManageTraveltxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(173, 173, 173)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(toManageTraveltxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fromManageTraveltxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(toManageTraveltxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(searchManageTraveljButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(backManageTraveljButton)
                .addGap(43, 43, 43))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backManageTraveljButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backManageTraveljButtonActionPerformed
        // TODO add your handling code here:
        UserProcessContainer.remove(this);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.previous(UserProcessContainer);
        
    }//GEN-LAST:event_backManageTraveljButtonActionPerformed

    private void searchManageTraveljButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchManageTraveljButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)manageTraveljTable1.getModel();
        dtm.setRowCount(0);
        
        for(Airline airline : travelagency.getAirlinerDirectory())
        {
            for(Flight flight : airline.getFlight())
            {
                if(flight.getSource().equalsIgnoreCase(fromManageTraveltxtfld.getText()))
                {
                    if(flight.getDestination().equalsIgnoreCase(toManageTraveltxtfld.getText()))
                    {
                         Object row[] = new Object [6];
                        row[0] = airline;
                        row[1] = flight.getFlightId();
                        row[2]=flight.getSource();
                        row[3] = flight.getDestination();
                        row[4]= flight.getCapacity();
                        row[5]=flight.getTimeoftheday();
                
                
                
                        dtm.addRow(row);
                    }
                }
            }
        }   
    }//GEN-LAST:event_searchManageTraveljButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backManageTraveljButton;
    private javax.swing.JTextField fromManageTraveltxtfld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable manageTraveljTable1;
    private javax.swing.JButton searchManageTraveljButton;
    private javax.swing.JTextField toManageTraveltxtfld;
    // End of variables declaration//GEN-END:variables
}
