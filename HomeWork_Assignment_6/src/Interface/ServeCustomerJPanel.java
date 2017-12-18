/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Business;
import Business.Customer;
import Business.OrderItem;
import Business.Person;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cheta
 */
public class ServeCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ServeCustomerJPanel
     */
    private JPanel userProcessContainer;
    Customer customer;
    Business business;
    Person person;
    int commission;
    double rating;
    public ServeCustomerJPanel(JPanel userProcessContainer, Customer customer, Business business, Person person) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.customer = customer;
        this.business = business;
        this.person = person;
//        populatetable();
        rating = person.getRating();
        commission = person.getCommission();
        namejTextField.setText(customer.getCustomerName());
        salesPersonTextField.setText(person.getPersonName());
        commissionJTF.setText(String.valueOf(person.getCommission()));
        ratingJTF.setText(String.valueOf(person.getRating()/person.getCount()));
    }
    
    public void populatetable()
    {
        double diff = 0.0;
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
          for(OrderItem oi : customer.getOrder().getOrderList()) {
              int target = 0;
              Object row[] = new Object[9];
              row[0] = customer;
              row[1] = oi;
              row[2] = oi.getPaidPrice()*oi.getQuantity();
              row[3] = oi.getProduct().getCeilingPrice();
              row[4] = oi.getProduct().getFloorPrice();
              if(customer.getMarket().getMarketName().equals(oi.getProduct().getMarketOffer().getMarket().getMarketName())) {
              row[5] = oi.getProduct().getMarketOffer().getCeilingPrice();
              row[6] = oi.getProduct().getMarketOffer().getFloorPrice();
              target = (oi.getProduct().getMarketOffer().getCeilingPrice() + oi.getProduct().getMarketOffer().getFloorPrice())/2;
              
              
              }
              else {
                  target = (oi.getProduct().getCeilingPrice() + oi.getProduct().getFloorPrice())/2;
              }
              
              diff = oi.getPaidPrice() - target;
              row[7] = oi.getStatus();
              row[8] = diff;
              dtm.addRow(row);
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

        jLabel2 = new javax.swing.JLabel();
        salesPersonTextField = new javax.swing.JTextField();
        logoutjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        namejTextField = new javax.swing.JTextField();
        reviewSalesOrderHistoryjButton1 = new javax.swing.JButton();
        bookCustomerOrderJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        commissionJTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ratingJTF = new javax.swing.JTextField();
        cancelCustomerOrderJButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(900, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SERVE CUSTOMER");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 43));

        salesPersonTextField.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        salesPersonTextField.setEnabled(false);
        add(salesPersonTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 211, 37));

        logoutjButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        logoutjButton.setText("<< Back");
        logoutjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutjButtonActionPerformed(evt);
            }
        });
        add(logoutjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 25));

        namejTextField.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        namejTextField.setEnabled(false);
        namejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namejTextFieldActionPerformed(evt);
            }
        });
        add(namejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 141, 182, -1));

        reviewSalesOrderHistoryjButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        reviewSalesOrderHistoryjButton1.setText("View Customer History");
        reviewSalesOrderHistoryjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reviewSalesOrderHistoryjButton1ActionPerformed(evt);
            }
        });
        add(reviewSalesOrderHistoryjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 493, -1, -1));

        bookCustomerOrderJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bookCustomerOrderJButton.setText("Book Customer Order >>");
        bookCustomerOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookCustomerOrderJButtonActionPerformed(evt);
            }
        });
        add(bookCustomerOrderJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 200, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer", "Product", "Cust. Price", "Ceiling Price", "Floor Price", "Offer Ceiling", "Offer Floor", "Status", "Profit/Loss"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 242, 759, 195));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Commission :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 141, -1, 25));

        commissionJTF.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        commissionJTF.setEnabled(false);
        commissionJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commissionJTFActionPerformed(evt);
            }
        });
        add(commissionJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 145, 182, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Rating :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, -1, 25));

        ratingJTF.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ratingJTF.setEnabled(false);
        ratingJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratingJTFActionPerformed(evt);
            }
        });
        add(ratingJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 182, -1));

        cancelCustomerOrderJButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cancelCustomerOrderJButton1.setText("Cancel Customer Order");
        cancelCustomerOrderJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelCustomerOrderJButton1ActionPerformed(evt);
            }
        });
        add(cancelCustomerOrderJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 200, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void namejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namejTextFieldActionPerformed

    private void reviewSalesOrderHistoryjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviewSalesOrderHistoryjButton1ActionPerformed
        // TODO add your handling code here:
//        CustomerJPanel panel = new CustomerJPanel(userProcessContainer);
//        userProcessContainer.add("CustomerJPanel", panel);
//        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
//            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
//            dtm.setRowCount(0);
//          for(OrderItem oi : customer.getOrder().getOrderList()) {
//              Object row[] = new Object[8];
//              row[0] = customer;
//              row[1] = oi;
//              row[2] = oi.getPaidPrice()*oi.getQuantity();
//              row[3] = oi.getProduct().getCeilingPrice();
//              row[4] = oi.getProduct().getFloorPrice();
//              if(customer.getMarket().getMarketName().equals(oi.getProduct().getMarketOffer().getMarket().getMarketName())) {
//              row[5] = oi.getProduct().getMarketOffer().getCeilingPrice();
//              row[6] = oi.getProduct().getMarketOffer().getFloorPrice();
//              }
//              
//              row[7] = oi.getStatus();
//              dtm.addRow(row);
//          }
        
                populatetable();
    }//GEN-LAST:event_reviewSalesOrderHistoryjButton1ActionPerformed

    private void bookCustomerOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookCustomerOrderJButtonActionPerformed
        // TODO add your handling code here:
//        BookCustomerOrderJPanel panel = new BookCustomerOrderJPanel(userProcessContainer);
//        userProcessContainer.add("BookCustomerOrderJPanel", panel);
//        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
          
          rating = person.getRating();
          int selectedRow = jTable1.getSelectedRow();
          Customer customer = (Customer)jTable1.getValueAt(selectedRow, 0);
          OrderItem orderItem = (OrderItem) jTable1.getValueAt(selectedRow, 1);
          if(!(orderItem.getStatus().equals("Approved")) || orderItem.getStatus().equals("Cancelled")){
          for( OrderItem o : customer.getOrder().getOrderList()) {
              if(o.getProduct().getProductName().equals(orderItem.getProduct().getProductName())) {
                  o.setStatus("Approved");

              }
          }
              if(!(customer.getMarket().getMarketName().equals(orderItem.getProduct().getMarketOffer().getMarket().getMarketName()))) {
              int custPrice = orderItem.getPaidPrice();
              int ceiling = orderItem.getProduct().getCeilingPrice();
              int floor = orderItem.getProduct().getFloorPrice();
              if(custPrice < ((ceiling+floor)/2)) {
                  commission += 0;
                  rating += 0;
              }
              else {
                  commission += custPrice/10;
                  rating += 5;
                  
              }
              orderItem.setSoldType("no offer");
          }
          else {
              int custPrice = orderItem.getPaidPrice()*orderItem.getQuantity();
              int ceiling = orderItem.getProduct().getMarketOffer().getCeilingPrice();
              int floor = orderItem.getProduct().getMarketOffer().getFloorPrice();
              if(custPrice < ((ceiling+floor)/2)) {
                  commission += 0;
                  rating += 0;
              }
              else {
                  commission += custPrice/10;
                  rating += 5;
                  //person.setCommission(commission);
              }
              orderItem.setSoldType("offer");
          }
          person.addOrderItem(orderItem);
          business.getSupplierDirectory().getOrderItemAll().add(orderItem);
          int count = person.getCount();
          double newRating = rating;
          person.setRating(newRating);
          person.setCommission(commission);
          commissionJTF.setText(String.valueOf(person.getCommission()));
          double avgRating = rating/count;
          ratingJTF.setText(String.valueOf(avgRating));
          }
          populatetable();
    }//GEN-LAST:event_bookCustomerOrderJButtonActionPerformed

    private void logoutjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutjButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_logoutjButtonActionPerformed

    private void commissionJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commissionJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commissionJTFActionPerformed

    private void ratingJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratingJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ratingJTFActionPerformed

    private void cancelCustomerOrderJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelCustomerOrderJButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
          Customer customer = (Customer)jTable1.getValueAt(selectedRow, 0);
          OrderItem orderItem = (OrderItem) jTable1.getValueAt(selectedRow, 1);
          if(!(orderItem.getStatus().equals("Approved")) || orderItem.getStatus().equals("Cancelled")){
//          for( OrderItem o : customer.getOrder().getOrderList()) {
//              if(o.getProduct().getProductName().equals(orderItem.getProduct().getProductName())) {
//                  o.setStatus("Cancelled");
//              }
//          }
           orderItem.setStatus("Cancelled");   
          person.addOrderItem(orderItem);

          }
          populatetable();
    }//GEN-LAST:event_cancelCustomerOrderJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookCustomerOrderJButton;
    private javax.swing.JButton cancelCustomerOrderJButton1;
    private javax.swing.JTextField commissionJTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logoutjButton;
    private javax.swing.JTextField namejTextField;
    private javax.swing.JTextField ratingJTF;
    private javax.swing.JButton reviewSalesOrderHistoryjButton1;
    private javax.swing.JTextField salesPersonTextField;
    // End of variables declaration//GEN-END:variables
}