/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author cheta
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerdirectory;

    public ArrayList<Customer> getCustomerdirectory() {
        return customerdirectory;
    }

    public void setCustomerdirectory(ArrayList<Customer> customerdirectory) {
        this.customerdirectory = customerdirectory;
    }

    public CustomerDirectory() 
    {
        customerdirectory = new ArrayList<Customer>();
        try {

            // SimpleDateFormat DTime=new SimpleDateFormat("mm-dd-yyyy HH:mm:ss a");
            FileReader fr1 = new FileReader("CustomerDirectory.csv");
            BufferedReader bf1 = new BufferedReader(fr1);
            String line1 = bf1.readLine();
            System.out.println("Data populated");
            while (line1 != null) {
                String fields[] = line1.split(",");

                Customer customer = new Customer(fields[0], fields[1], fields[2], fields[3],fields[4]);
                //System.out.println("Data populated");
                customerdirectory.add(customer);
                line1 = bf1.readLine();
            }
        } catch (IOException ex) {
            System.out.println("IOException");
        }
        
    }
    public Customer add() 
    {
        Customer customers;
        customers = new Customer();
        customerdirectory.add(customers);
        return customers;
    }
    
    
}
