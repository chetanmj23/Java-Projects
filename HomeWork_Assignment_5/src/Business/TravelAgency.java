/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author cheta
 */
public class TravelAgency {
   
    private ArrayList<Customer> customerDirectory;
    private ArrayList<Airline> airlinerDirectory;
    private String name;

    public TravelAgency(String name) {
        this.name = name;
        this.customerDirectory=new ArrayList<>();
        this.airlinerDirectory=new ArrayList<>();
    }

    public TravelAgency() {
        this.name= name;
        this.customerDirectory=new ArrayList<>();
        this.airlinerDirectory=new ArrayList<>();
    }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public ArrayList<Airline> getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(ArrayList<Airline> airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    

   
    
    
    
    
}
