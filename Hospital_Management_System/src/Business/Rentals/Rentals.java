/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Rentals;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Product.Product;

/**
 *
 * @author cheta
 */
public class Rentals {
    private int daystorent;
    private int rentperday;
    private int quantity;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    private Product product;
    private Enterprise sender;
    private Enterprise reciever;
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    public int getDaystorent() {
        return daystorent;
    }

    public void setDaystorent(int daystorent) {
        this.daystorent = daystorent;
    }

    public int getRentperday() {
        return rentperday;
    }

    public void setRentperday(int rentperday) {
        this.rentperday = rentperday;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Enterprise getSender() {
        return sender;
    }

    public void setSender(Enterprise sender) {
        this.sender = sender;
    }

    public Enterprise getReciever() {
        return reciever;
    }

    public void setReciever(Enterprise reciever) {
        this.reciever = reciever;
    }
    
    @Override
    public String toString() {
        return this.getSender().getName();
    }
    
}
