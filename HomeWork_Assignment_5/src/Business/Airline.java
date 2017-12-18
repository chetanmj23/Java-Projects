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
public class Airline {
    
   ArrayList<Flight> flight;
   String airlineName;
   
   
     public Airline(){
        flight = new ArrayList<>();
    }

    public Airline(String airlineName) 
    {

        this.airlineName = airlineName;
        flight = new ArrayList<>();

    }

    public ArrayList<Flight> getFlight() {
        return flight;
    }

    public void setFlight(ArrayList<Flight> flight) {
        this.flight = flight;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }
    
    public void addFlight(Flight flight) {
        this.flight.add(flight);
    }

    public void deleteFlight(Flight flight) {
        this.flight.remove(flight);
    }
   
    public ArrayList<String> getAllFromLocations() {
        ArrayList<String> locations = new ArrayList<>();
        for (Flight flight : flight) {
            if (!locations.contains(flight.getSource())) {
                locations.add(flight.getSource());
            }
        }
        return locations;
        }
    
    public ArrayList<String> getAllToLocations() {
        ArrayList<String> locations = new ArrayList<>();
        for (Flight flight : flight) {
            if (!locations.contains(flight.getDestination())) {
                locations.add(flight.getDestination());
            }
        }
        return locations;
    }
    
    @Override
    public String toString() {
        return airlineName; 
    }

}
