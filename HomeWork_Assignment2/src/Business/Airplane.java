/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;



/**
 *
 * @author cheta
 */
public class Airplane {
    
    private String serialNumber;
    private String modelNumber;
    private String departureTime;
    private String manufacturer;
    private String manufacturedYear;
    private String capacity;
    private String validity;
    private Date date;

    
    public Airplane(String field, String field0, String field1, String field2, String field3, String field4, String field5) {
        

        serialNumber = field;
        modelNumber = field0;
        departureTime = field1;
        manufacturer = field2;
        manufacturedYear = field3;
        capacity = field4;
        validity = field5;
        
//To change body of generated methods, choose Tools | Templates.
    }

       public Airplane() 
               
       {
           Date date = new Date();
       }


//    Airplane(String field, String field0, String field1, String field2, String field3, String field4, String field5) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    Airplane() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturedYear() {
        return manufacturedYear;
    }

    public void setManufacturedYear(String manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }
   
@Override
    public String toString(){
        return this.serialNumber;
               
    }
   
    
}
