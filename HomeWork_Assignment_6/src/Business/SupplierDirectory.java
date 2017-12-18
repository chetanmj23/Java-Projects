/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author AMY
 */
public class SupplierDirectory {
    private ArrayList<Supplier> supplierList;
    private ArrayList<OrderItem> orderItemAll;
    
    public SupplierDirectory () {
        supplierList = new ArrayList<Supplier>();
        orderItemAll = new ArrayList<OrderItem>();
    }

    public ArrayList<OrderItem> getOrderItemAll() {
        return orderItemAll;
    }

    public void setOrderItemAll(ArrayList<OrderItem> orderItemAll) {
        this.orderItemAll = orderItemAll;
    }

    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(ArrayList<Supplier> supplierList) {
        this.supplierList = supplierList;
    }
    
    public Supplier addSupplier() {
        Supplier supplier = new Supplier();
        supplierList.add(supplier);
        return supplier;
    }
    
    public void removeSupplier(Supplier s){
        supplierList.remove(s);
    }
    
    public int getRevenue(Supplier supplier) {
        int revenue = 0;
        for(Supplier s : supplierList) {
            if(s.getSupplierName().equals(supplier.getSupplierName())) {
           for(OrderItem oi : orderItemAll) {
               for(Product p : s.getProductCatalog().getProductCatalog()) {
                   if(oi.getProduct().getProductName().equals(p.getProductName())) {
                       revenue += oi.getPaidPrice();
                   }
               }
           } 
            }
        }
        return revenue;
    } 
    
}
