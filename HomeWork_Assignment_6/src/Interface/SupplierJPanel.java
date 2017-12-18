/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Product;
import Business.Supplier;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cheta
 */
public class SupplierJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SupplierJPanel
     */
    private JPanel userProcessContainer;
    private Supplier supplier;
    public SupplierJPanel(JPanel userProcessContainer, Supplier supplier) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplier = supplier;
        populatetable();
        supplierTextField.setText(supplier.getSupplierName());
        //supplier = new Supplier();
    }
    
    public void populatetable()
    {
        DefaultTableModel dtm = (DefaultTableModel) supplierjTable1.getModel();
        dtm.setRowCount(0);
        
        for(Product p : supplier.getProductCatalog().getProductCatalog())
        {
        Object row[] = new Object[6];
        row[0] = p;
        row[1] = p.getCeilingPrice();
        row[2] =p.getFloorPrice();
        row[3] = p.getQuantity();
        row[4] = p.getMarketOffer().getMarket().getMarketName();
        row[5] = p.getMarketOffer().getCeilingPrice();
        
                
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
        supplierTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        supplierjTable1 = new javax.swing.JTable();
        deleteproductJButton = new javax.swing.JButton();
        addProductJButton1 = new javax.swing.JButton();
        logoutjButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SUPPLIER HOME PAGE");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 43));

        supplierTextField.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        supplierTextField.setEnabled(false);
        add(supplierTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 54, 211, 37));

        supplierjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Ceiling Price", "Floor Price", "Quantity", "Market Type", "Market Ceiling offer", "Market Floor Offer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(supplierjTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 131, 834, 144));

        deleteproductJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        deleteproductJButton.setText("Delete Product");
        deleteproductJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteproductJButtonActionPerformed(evt);
            }
        });
        add(deleteproductJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 322, 200, -1));

        addProductJButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addProductJButton1.setText("Add Product");
        addProductJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductJButton1ActionPerformed(evt);
            }
        });
        add(addProductJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 322, 200, -1));

        logoutjButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        logoutjButton.setText("<< Logout");
        logoutjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutjButtonActionPerformed(evt);
            }
        });
        add(logoutjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 488, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void deleteproductJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteproductJButtonActionPerformed
        // TODO add your handling code here:
        int row = supplierjTable1.getSelectedRow();
        
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Product p = (Product)supplierjTable1.getValueAt(row, 0);
        supplier.getProductCatalog().removeProduct(p);
        populatetable();
     
    }//GEN-LAST:event_deleteproductJButtonActionPerformed

    private void addProductJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductJButton1ActionPerformed
        // TODO add your handling code here:
        
        CreateProductJPanel panel = new CreateProductJPanel(userProcessContainer, supplier);
        userProcessContainer.add("CreateProductJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_addProductJButton1ActionPerformed

    private void logoutjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutjButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length-1];
        LoginJPanel loginjpanel = (LoginJPanel)component;
        loginjpanel.reset();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_logoutjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProductJButton1;
    private javax.swing.JButton deleteproductJButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutjButton;
    private javax.swing.JTextField supplierTextField;
    private javax.swing.JTable supplierjTable1;
    // End of variables declaration//GEN-END:variables
}
