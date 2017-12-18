/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Akhilesh Kashyap
 */
public class OrderItem {
    private int paidPrice;
    private int quantity;
    private Product product;
    public static int ordernumber = 0;
    private String status = "pending";
    private String soldType;

    public String getSoldType() {
        return soldType;
    }

    public void setSoldType(String soldType) {
        this.soldType = soldType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public OrderItem() {
        ordernumber += 1;
    }

    public static int getOrdernumber() {
        return ordernumber;
    }

    public static void setOrdernumber(int ordernumber) {
        OrderItem.ordernumber = ordernumber;
    }

    public int getPaidPrice() {
        return paidPrice;
    }

    public void setPaidPrice(int paidPrice) {
        this.paidPrice = paidPrice;
    }

    

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
 
    @Override
    public String toString(){
        return product.getProductName();
    }
}
