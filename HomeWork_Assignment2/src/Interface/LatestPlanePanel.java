/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Airplane;
import Business.Fleet;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cheta
 */
public class LatestPlanePanel extends javax.swing.JPanel {

    /**
     * Creates new form LatestPlanePanel
     */
    private Fleet fleet;
    public LatestPlanePanel(Fleet fleet) {
        initComponents();
        this.fleet = fleet;
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
        manufacturedByTextFld = new javax.swing.JTextField();
        serialNoTextFld = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        manufacturedYearTextFld = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        airplaneCapacityTextFld = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        certificateTextFld = new javax.swing.JTextField();
        modelNoTextFld = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        departureTimeTextFld = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        certificateTextFld1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        totalAirplanesTextFld = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        latestplanejButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        LatestplaneTable = new javax.swing.JTable();
        availableplanejButton = new javax.swing.JButton();
        viewjButton = new javax.swing.JButton();

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField1.setText("Latest Airplane Available");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel1.setText("    Serial Number :");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        manufacturedByTextFld.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        manufacturedByTextFld.setEnabled(false);

        serialNoTextFld.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        serialNoTextFld.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel6.setText("Manufactured Year :");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        manufacturedYearTextFld.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        manufacturedYearTextFld.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel7.setText("Airplane Capacity :");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        airplaneCapacityTextFld.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        airplaneCapacityTextFld.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel8.setText("Certificate Validity :");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel3.setText("    Model Number :");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        certificateTextFld.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        certificateTextFld.setEnabled(false);

        modelNoTextFld.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        modelNoTextFld.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel4.setText("   Departure Time:");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        departureTimeTextFld.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        departureTimeTextFld.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel5.setText(" Manufactured By :");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel9.setText("Available Airplanes :");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        certificateTextFld1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        certificateTextFld1.setEnabled(false);
        certificateTextFld1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                certificateTextFld1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel10.setText("    Total Airplanes :");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        totalAirplanesTextFld.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        totalAirplanesTextFld.setEnabled(false);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField2.setText("Available Airplane Details");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        latestplanejButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        latestplanejButton.setText("Click here");
        latestplanejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                latestplanejButtonActionPerformed(evt);
            }
        });

        LatestplaneTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial Number", "Manufactured By", "Departure Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(LatestplaneTable);

        availableplanejButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        availableplanejButton.setText("Click here");
        availableplanejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableplanejButtonActionPerformed(evt);
            }
        });

        viewjButton.setText("View");
        viewjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(viewjButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(latestplanejButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(85, 85, 85)
                                    .addComponent(certificateTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(85, 85, 85))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(airplaneCapacityTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(departureTimeTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(modelNoTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(serialNoTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(manufacturedByTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(manufacturedYearTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(18, 18, 18)
                                            .addComponent(totalAirplanesTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(18, 18, 18)
                                            .addComponent(certificateTextFld1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(availableplanejButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(645, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(latestplanejButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(viewjButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(serialNoTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(modelNoTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(departureTimeTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(manufacturedByTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(manufacturedYearTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(airplaneCapacityTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(certificateTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(availableplanejButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(certificateTextFld1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(totalAirplanesTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void latestplanejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_latestplanejButtonActionPerformed
        // TODO add your handling code here:
        ArrayList<Time> time = new ArrayList<Time>();
        Calendar cal = Calendar.getInstance();
        long currentTime = cal.getTimeInMillis();
        DateFormat dateformat = new SimpleDateFormat("HH:MM:SS");
        
        ArrayList<Airplane> temp = new ArrayList<Airplane>();
        ArrayList<Airplane> temp1 = new ArrayList<Airplane>();
        Time minTime;
        

        
        for(Airplane airplane : fleet.getFleet()){
            
            
            try {
                // temp.add(Time.valueOf(airplane.getDepartureTime()));
                
                if(getTimeDiff(airplane.getDepartureTime())>0){
                    time.add(Time.valueOf(airplane.getDepartureTime()));
                    
                    temp.add(airplane);
                    
//                    Object row[] = new Object[3];
//                    row[0]= airplane;
//                    row[1]=airplane.getManufacturer();
//                    row[2]=airplane.getDepartureTime();
//                    
//                    dtm.addRow(row);



                }
            } catch (ParseException ex) {
                Logger.getLogger(LatestPlanePanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                
                minTime = (time.get(0));
                temp1.add(temp.get(0));
                for(Airplane airplanes : temp){
                    
                    //temp1.clear();
                    
                    if(minTime.after(Time.valueOf(airplanes.getDepartureTime()))){
                        
                        minTime = Time.valueOf(airplanes.getDepartureTime());
                        temp1.clear();
                    temp1.add(airplanes);
                        
                    }
                    
                  
                }
                
                DefaultTableModel dtm = (DefaultTableModel)LatestplaneTable.getModel();
                    dtm.setRowCount(0);
                for(Airplane airplanes : temp1) {
                    
                    Object row[] = new Object[3];
                    row[0]= airplanes;
                    row[1]=airplanes.getManufacturer();
                    row[2]=airplanes.getDepartureTime();
                    
                    dtm.addRow(row);
                    
 
                }
                
                
                
        
        
 
        
    }//GEN-LAST:event_latestplanejButtonActionPerformed

    private void availableplanejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableplanejButtonActionPerformed
        // TODO add your handling code here:
          
        int availNum = 0;
        int total = 0;
        ArrayList<Time> time = new ArrayList<Time>();
        Calendar cal = Calendar.getInstance();
        long currentTime = cal.getTimeInMillis();
        DateFormat dateformat = new SimpleDateFormat("HH:MM:SS");
        DefaultTableModel dtm = (DefaultTableModel)LatestplaneTable.getModel();
        dtm.setRowCount(0);
        

        
        for(Airplane airplane : fleet.getFleet()){
            
            total = total+1;
            try {
                if(getTimeDiff(airplane.getDepartureTime())>0){
                    time.add(Time.valueOf(airplane.getDepartureTime()));
                    
                    Object row[] = new Object[3];
                    row[0]= airplane;
                    row[1]=airplane.getManufacturer();
                    row[2]=airplane.getDepartureTime();
                    
                    dtm.addRow(row);
                    availNum = availNum + 1;
                }
            } catch (ParseException ex) {
                Logger.getLogger(LatestPlanePanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        certificateTextFld1.setText(String.valueOf(availNum));
        totalAirplanesTextFld.setText(String.valueOf(total));
    }//GEN-LAST:event_availableplanejButtonActionPerformed

    private void certificateTextFld1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_certificateTextFld1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_certificateTextFld1ActionPerformed

    private void viewjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewjButtonActionPerformed
        // TODO add your handling code here:
        int selectedrow = LatestplaneTable.getSelectedRow();
        
        if (selectedrow >= 0)
        {
            Airplane A = (Airplane)LatestplaneTable.getValueAt(selectedrow, 0);
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
           
    }//GEN-LAST:event_viewjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable LatestplaneTable;
    private javax.swing.JTextField airplaneCapacityTextFld;
    private javax.swing.JButton availableplanejButton;
    private javax.swing.JTextField certificateTextFld;
    private javax.swing.JTextField certificateTextFld1;
    private javax.swing.JTextField departureTimeTextFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton latestplanejButton;
    private javax.swing.JTextField manufacturedByTextFld;
    private javax.swing.JTextField manufacturedYearTextFld;
    private javax.swing.JTextField modelNoTextFld;
    private javax.swing.JTextField serialNoTextFld;
    private javax.swing.JTextField totalAirplanesTextFld;
    private javax.swing.JButton viewjButton;
    // End of variables declaration//GEN-END:variables

    private int getTimeDiff(String departureTime) throws ParseException {
         //To change body of generated methods, choose Tools | Templates.
         Calendar cal = Calendar.getInstance();
        long currentTime = cal.getTimeInMillis();
        DateFormat dateformat = new SimpleDateFormat("HH:MM:SS");
        
        Calendar tempTime = Calendar.getInstance();
        Date flightTime = null;
        flightTime = dateformat.parse(departureTime);
        tempTime.setTime(flightTime);
        tempTime.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH));
        
        return (int) (tempTime.getTimeInMillis() - currentTime);
    }
}
