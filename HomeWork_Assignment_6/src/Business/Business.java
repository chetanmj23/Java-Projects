/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

/**
 *
 * @author AMY
 */
public class Business {
    private SupplierDirectory supplierDirectory;
    private  MarketOfferCatalog marketOfferCatalog;
    private CustomerDirectory customerDiretory;
    private EmployeeDirectory employeeDirectory;
    private Admin admin;
    
    public Business () 
            throws FileNotFoundException, IOException {
        supplierDirectory = new SupplierDirectory();
        employeeDirectory = new EmployeeDirectory();
        customerDiretory = new CustomerDirectory();
        admin = new Admin();
        admin.setUsername("admin");
        admin.setPassword("admin");
        
        URL url = getClass().getResource("supplier.csv");
        FileReader fr = new FileReader(url.getPath().replace("%20", " "));
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while(line!=null){
            
            String fields[] = line.split(",");
            Supplier supplier = supplierDirectory.addSupplier();
            supplier.setSupplierName(fields[0]);
            int i =1;
            while(i<fields.length) {
                Product product = supplier.getProductCatalog().addProduct();
                product.setProductName(fields[i++]);
                product.setCeilingPrice(Integer.parseInt(fields[i++]));
                product.setFloorPrice(Integer.parseInt(fields[i++]));
                product.getMarketOffer().setCeilingPrice(Integer.parseInt(fields[i++]));
                product.getMarketOffer().setFloorPrice(Integer.parseInt(fields[i++]));
                product.getMarketOffer().getMarket().setMarketName(fields[i++]);
                System.out.println(product.getProductName()+";"+product.getMarketOffer().getCeilingPrice()+";"+product.getCeilingPrice());
                
            }
            line = br.readLine();
            System.out.println(supplier.getSupplierName());
        }
        
        URL url1 = getClass().getResource("customer.csv");
        FileReader fr1 = new FileReader(url1.getPath().replace("%20", " "));
        BufferedReader br1 = new BufferedReader(fr1);
        String line1 = br1.readLine(); 
        while(line1!=null) {
            String fields[] = line1.split(",");
            Customer customer = customerDiretory.addCustomer();
            customer.setCustomerName(fields[0]);
            customer.setAddress(fields[2]);
            customer.setCustomerPwd(fields[1]);
            customer.getMarket().setMarketName(fields[3]);
            line1 = br1.readLine();
            System.out.println(customer.getCustomerName());
            System.out.println(customer.getCustomerPwd());
            
        }
        
        URL url2 = getClass().getResource("person.csv");
        FileReader fr2 = new FileReader(url2.getPath().replace("%20", " "));
        BufferedReader br2 = new BufferedReader(fr2);
        String line2 = br2.readLine();
         while(line2!=null) {
            String fields2[] = line2.split(",");
            Person person = employeeDirectory.addPerson();
            person.setPersonName(fields2[0]);
            person.setPassword(fields2[1]);
            person.setPersonType(fields2[2]);
            //customer.getMarket().setMarketName(fields[3]);
            line2 = br2.readLine();
            System.out.println(person.getPersonName());
            System.out.println(person.getPassword());
            
        }

    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }

    public MarketOfferCatalog getMarketOfferCatalog() {
        return marketOfferCatalog;
    }

    public void setMarketOfferCatalog(MarketOfferCatalog marketOfferCatalog) {
        this.marketOfferCatalog = marketOfferCatalog;
    }

    public CustomerDirectory getCustomerDiretory() {
        return customerDiretory;
    }

    public void setCustomerDiretory(CustomerDirectory customerDiretory) {
        this.customerDiretory = customerDiretory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    
    
    
}
