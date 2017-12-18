/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import Business.Enterprise.Enterprise;

/**
 *
 * @author cheta
 */
public class Product {
    
    private String productName;
    private int price;
    private int quantity;
    private String rented;
    private Enterprise sender;
    private Enterprise receiver;

    public Enterprise getSender() {
        return sender;
    }

    public void setSender(Enterprise sender) {
        this.sender = sender;
    }

    public Enterprise getReceiver() {
        return receiver;
    }

    public void setReceiver(Enterprise receiver) {
        this.receiver = receiver;
    }

    public String getRented() {
        return rented;
    }

    public void setRented(String rented) {
        this.rented = rented;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return this.productName;
    }
    
}
