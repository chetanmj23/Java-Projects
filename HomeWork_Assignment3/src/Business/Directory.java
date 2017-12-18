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
public class Directory {
    
    private ArrayList directory;
    private Fleet fleet;
    private CustomerDirectory customerDirectory;

    public ArrayList getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList directory) {
        this.directory = directory;
    }

    public Fleet getFleet() {
        return fleet;
    }

    public void setFleet(Fleet fleet) {
        this.fleet = fleet;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public Directory() 
    {
        directory=new ArrayList();
        
        this.customerDirectory = new CustomerDirectory();
        this.fleet = new Fleet();
        
        
        directory.add(customerDirectory);
        directory.add(fleet);
    }
    
    
    
   
    
}
