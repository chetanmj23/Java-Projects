/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author cheta
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String airlines;
    private String flightIds;
    private String seatNumberSelected;

    Customer(String field, String field0, String field1, String field2, String field3) {
        this.firstName=field;
        this.lastName=field0;
        this.airlines=field1;
        this.flightIds=field2;
        this.seatNumberSelected=field3;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    public String getAirlines() {
        return airlines;
    }

    public void setAirlines(String airlines) {
        this.airlines = airlines;
    }

    public String getFlightIds() {
        return flightIds;
    }

    public void setFlightIds(String flightIds) {
        this.flightIds = flightIds;
    }

    public String getSeatNumberSelected() {
        return seatNumberSelected;
    }

    public void setSeatNumberSelected(String seatNumberSelected) {
        this.seatNumberSelected = seatNumberSelected;
    }

    public Customer() 
    {
        
    }

    
    
    
}
