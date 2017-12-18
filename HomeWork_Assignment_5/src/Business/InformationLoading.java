/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.*;


/**
 *
 * @author cheta
 */
public class InformationLoading {
    
    public InformationLoading(TravelAgency travelAgency){
                
        Airline airliner1 = new Airline("British Airways");
        
        Flight flight1 = new Flight("BA103", 400, "Bangalore", "Boston", airliner1,"Morning");
        Flight flight2 = new Flight("BA203", 400, "Gulbarga", "Boston", airliner1,"Morning");
        Flight flight3 = new Flight("BA303", 400, "Syracuse", "Boston", airliner1,"AfterNoon");
        Flight flight4 = new Flight("BA403", 400, "Bangalore", "Delhi", airliner1,"Evening");
        Flight flight5 = new Flight("BA503", 400, "Boston", "Lucknow", airliner1,"Morning");
        
        airliner1.getFlight().add(flight1);
        airliner1.getFlight().add(flight2);
        airliner1.getFlight().add(flight3);
        airliner1.getFlight().add(flight4);
        airliner1.getFlight().add(flight5);
        
//        Airliner airliner2 = new Airliner("United Airlines");
//        
//        Flight flight6 = new Flight("UT111", "San Diego", "Florida", stringToDateTime("02-02-2018 8:00"), stringToDateTime("02-02-2018 11:30"), airliner2, 400);
//        Flight flight7 = new Flight("UT220", "Las Vegas", "Chicago", stringToDateTime("02-02-2018 7:00"), stringToDateTime("02-02-2018 14:30"), airliner2, 350);
//        Flight flight8 = new Flight("UT690", "San Jose", "Texas", stringToDateTime("09-06-2018 6:00"), stringToDateTime("02-06-2018 19:30"), airliner2, 370);
//        Flight flight9 = new Flight("UT888", "Connecticut", "Boston", stringToDateTime("12-04-2018 13:00"), stringToDateTime("02-02-2018 15:00"), airliner2, 430);
//        
//        
//        airliner2.getFlights().add(flight6);
//        airliner2.getFlights().add(flight7);
//        airliner2.getFlights().add(flight8);
//        airliner2.getFlights().add(flight9);
//        
//        travelAgency.getAirliners().add(airliner1);
//        travelAgency.getAirliners().add(airliner2);
//        
//        
    }
    
}
