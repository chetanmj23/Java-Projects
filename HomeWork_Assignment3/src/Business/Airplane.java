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
public class Airplane {
    
    private String airliner;
    private String flightID;
    private int pricePerSeat;
    private int capacity;

    public String getAirliner() {
        return airliner;
    }

    public void setAirliner(String airliner) {
        this.airliner = airliner;
    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public int getPricePerSeat() {
        return pricePerSeat;
    }

    public void setPricePerSeat(int pricePerSeat) {
        this.pricePerSeat = pricePerSeat;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    Airplane(String field, String field0, String field1, String field2)
    {
        this.airliner=field;
        this.flightID=field0;
        this.pricePerSeat=Integer.parseInt(field1);
        this.capacity=Integer.parseInt(field2);
    }

    public Airplane() 
    {
    }

    
    
}
