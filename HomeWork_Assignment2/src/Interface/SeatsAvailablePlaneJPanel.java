/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Airplane;
import Business.Fleet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cheta
 */
public class SeatsAvailablePlaneJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SeatsAvailablePlaneJPanel
     */
    private Fleet fleet;
    public SeatsAvailablePlaneJPanel(Fleet fleet) {
        initComponents();
        this.fleet=fleet;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        maxSeatsjTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        minSeatsjTextField = new javax.swing.JTextField();
        seatsaAvailButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        seatsAvailjTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        serialNoTextFld = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        modelNoTextFld = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        departureTimeTextFld = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        manufacturedByTextFld = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        manufacturedYearTextFld = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        airplaneCapacityTextFld = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        certificateTextFld = new javax.swing.JTextField();
        seatsViewBTN = new javax.swing.JButton();

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField1.setText("Airplanes available accoridng to the Seats");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel1.setText("Max Seats :");

        maxSeatsjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxSeatsjTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel2.setText("Min Seats :");

        seatsaAvailButton.setText("Search");
        seatsaAvailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatsaAvailButtonActionPerformed(evt);
            }
        });

        seatsAvailjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial Number", "Capacity", "Departure Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(seatsAvailjTable);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel3.setText("   Serial Number :");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        serialNoTextFld.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        serialNoTextFld.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel4.setText("   Model Number :");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        modelNoTextFld.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        modelNoTextFld.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel5.setText("  Departure Time:");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        departureTimeTextFld.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        departureTimeTextFld.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel6.setText(" Manufactured By :");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        manufacturedByTextFld.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        manufacturedByTextFld.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel7.setText("Manufactured Year :");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        manufacturedYearTextFld.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        manufacturedYearTextFld.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel8.setText("Airplane Capacity :");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        airplaneCapacityTextFld.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        airplaneCapacityTextFld.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel9.setText("Certificate Validity :");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        certificateTextFld.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        certificateTextFld.setEnabled(false);

        seatsViewBTN.setText("View");
        seatsViewBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatsViewBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(manufacturedByTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(departureTimeTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(modelNoTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                                    .addComponent(serialNoTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGap(134, 134, 134)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(manufacturedYearTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(airplaneCapacityTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(certificateTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addComponent(minSeatsjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)
                                .addComponent(maxSeatsjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(seatsViewBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(seatsaAvailButton)))
                .addContainerGap(526, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(maxSeatsjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(minSeatsjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(seatsaAvailButton)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(seatsViewBTN)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(serialNoTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(modelNoTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(departureTimeTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(manufacturedByTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(manufacturedYearTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(airplaneCapacityTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(certificateTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void seatsViewBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatsViewBTNActionPerformed
        // TODO add your handling code here:
        int selectedrow = seatsAvailjTable.getSelectedRow();
        
        if (selectedrow >= 0)
        {
            Airplane A = (Airplane)seatsAvailjTable.getValueAt(selectedrow, 0);
            serialNoTextFld.setText(A.getSerialNumber());
            modelNoTextFld.setText(A.getModelNumber());
            departureTimeTextFld.setText(A.getDepartureTime());
            manufacturedByTextFld.setText(A.getManufacturer());
            manufacturedYearTextFld.setText(A.getManufacturedYear());
            airplaneCapacityTextFld.setText(A.getCapacity());
            certificateTextFld.setText(A.getValidity());
            
        }
        else
            JOptionPane.showMessageDialog(null,"please select any row to proceed");
        
    }//GEN-LAST:event_seatsViewBTNActionPerformed

    private void seatsaAvailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatsaAvailButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)seatsAvailjTable.getModel();
        dtm.setRowCount(0);
        for(Airplane airplane : fleet.getFleet()){
            if (Integer.parseInt(airplane.getCapacity()) >= Integer.parseInt(minSeatsjTextField.getText())) {
                if (Integer.parseInt(airplane.getCapacity()) <= Integer.parseInt(maxSeatsjTextField.getText())) {
                    
                    Object row[] = new Object[3];
                    row[0] = airplane;
                    row[1] = airplane.getCapacity();
                    row[2] = airplane.getDepartureTime();
                    dtm.addRow(row);
                    
                }
                
            }
                
            }
    }//GEN-LAST:event_seatsaAvailButtonActionPerformed

    private void maxSeatsjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxSeatsjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxSeatsjTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airplaneCapacityTextFld;
    private javax.swing.JTextField certificateTextFld;
    private javax.swing.JTextField departureTimeTextFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField manufacturedByTextFld;
    private javax.swing.JTextField manufacturedYearTextFld;
    private javax.swing.JTextField maxSeatsjTextField;
    private javax.swing.JTextField minSeatsjTextField;
    private javax.swing.JTextField modelNoTextFld;
    private javax.swing.JTable seatsAvailjTable;
    private javax.swing.JButton seatsViewBTN;
    private javax.swing.JButton seatsaAvailButton;
    private javax.swing.JTextField serialNoTextFld;
    // End of variables declaration//GEN-END:variables
}
