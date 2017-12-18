/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Akhilesh Kashyap
 */
public class Person {
    private String personName;
    private String password;
    private String personType;
    private int commission = 0;
    private double rating = 0;
    
    private ArrayList<OrderItem> orders;

    public Person() {
        orders = new ArrayList<OrderItem>();
    }
    
    public String getPersonType() {
        return personType;
        
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }
    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public ArrayList<OrderItem> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<OrderItem> orders) {
        this.orders = orders;
    }

    public void addOrderItem(OrderItem orderItem) {
        orders.add(orderItem);
    }


    
    public int getCount() {
        int count = 0;
        for(OrderItem oi : orders) {
         if(oi.getStatus().equals("Approved")) {
             count += 1;
         }   
        
        }
        return count;
    }
    
}
