/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainMethod;

import Business.Airplane;
import Business.Customer;
import Business.CustomerDirectory;
import Business.Directory;
import Business.Fleet;

/**
 *
 * @author cheta
 */
public class TravelAgency {

    private static Fleet fleet;
    private static CustomerDirectory customerdirectory;

    public static void main(String[] args) {
        fleet = new Fleet();
        populatedata();
        displaydata();
        revenueByFlight();
        revenueByAirline();
        revenueTotal();

    }

    private static void test() {
        Directory directory = new Directory();
        //System.out.println(directory.getFleet());
    }

    private static void populatedata() {
        fleet = new Fleet();
        //System.out.println("print man");
        int i = 1;
        for (Airplane a : fleet.getFleet()) {

            System.out.println(i + ":Airliner Name-->" + a.getAirliner() + "\tFlightID-->" + a.getFlightID() + "\tcapacity on a airplane-->" + a.getCapacity() + "\tPrice per Seat-->" + a.getPricePerSeat());
                    //System.out.println("_____________________________________________________________________________________________________________________________________");

            i++;
        }
                System.out.println("_____________________________________________________________________________________________________________________________________");

    }

    private static void displaydata() {
        customerdirectory = new CustomerDirectory();
        //System.out.println("print man");
        int i = 1;
        for (Customer c : customerdirectory.getCustomerdirectory()) {

            System.out.println(i + ":First Name-->" + c.getFirstName() + "\tLast Name-->" + c.getLastName() + "\tAirline Name-->" + c.getAirlines() + "\tFlight ID-->" + c.getFlightIds() + "\tSeat Number Selected-->" + c.getSeatNumberSelected());
            i++;
        }
    }

    public static void revenueByFlight() {

        String Flight1 = "BA103", Flight2 = "BA203", Flight3 = "BA303", Flight4 = "BA403", Flight5 = "AA346", Flight6 = "AA978", Flight7 = "AA345", Flight8 = "AA746", Flight9 = "QA567", Flight10 = "QA358", Flight11 = "QA987", Flight12 = "EA657", Flight13 = "EA465", Flight14 = "EA546";
        int total103 = 0, total203 = 0, total303 = 0, total403 = 0, total346 = 0, total978 = 0, total345 = 0, total746 = 0, total567 = 0, total358 = 0, total987 = 0, total657 = 0, total465 = 0, total546 = 0;
        int revenueBA103 = 0, revenueBA203 = 0, revenueBA303 = 0, revenueBA403 = 0, revenueAA346 = 0, revenueAA978 = 0, revenueAA345 = 0, revenueAA746 = 0, revenueQA567 = 0, revenueQA358 = 0, revenueQA987 = 0, revenueEA657 = 0, revenueEA465 = 0, revenueEA546 = 0;
        int temp1 = 0, temp2 = 0, temp3 = 0, temp4 = 0, temp5 = 0, temp6 = 0, temp7 = 0, temp8 = 0, temp9 = 0, temp10 = 0, temp11 = 0, temp12 = 0, temp13 = 0, temp14 = 0;

        for (Customer cus : customerdirectory.getCustomerdirectory()) {
            if (cus.getFlightIds().equalsIgnoreCase(Flight1)) {
                total103 = total103 + 1;
                for (Airplane air : fleet.getFleet()) {
                    if (air.getFlightID().equalsIgnoreCase(Flight1)) {
                        //Airplane air1 = new Airplane();
                        temp1 = air.getPricePerSeat();
                        //  System.out.println("biscuit---------------------"+temp1);
                    }
                }

                revenueBA103 = total103 * temp1;
            }

            if (cus.getFlightIds().equalsIgnoreCase(Flight2)) {
                total203 = total203 + 1;
                for (Airplane air : fleet.getFleet()) {
                    if (air.getFlightID().equalsIgnoreCase(Flight2)) {
                        //Airplane air1 = new Airplane();
                        temp2 = air.getPricePerSeat();
                        //  System.out.println("biscuit---------------------"+temp2);
                    }
                }
                revenueBA203 = total203 * temp2;
            }

            if (cus.getFlightIds().equalsIgnoreCase(Flight3)) {
                total303 = total303 + 1;
                for (Airplane air : fleet.getFleet()) {
                    if (air.getFlightID().equalsIgnoreCase(Flight3)) {
                        //Airplane air1 = new Airplane();
                        temp3 = air.getPricePerSeat();
                        //System.out.println("biscuit---------------------"+temp3);
                    }
                }
                revenueBA303 = total303 * temp3;
            }

            if (cus.getFlightIds().equalsIgnoreCase(Flight4)) {
                total403 = total403 + 1;
                for (Airplane air : fleet.getFleet()) {
                    if (air.getFlightID().equalsIgnoreCase(Flight4)) {
                        //Airplane air1 = new Airplane();
                        temp4 = air.getPricePerSeat();
                        //System.out.println("biscuit---------------------"+temp4);
                    }
                }
                revenueBA403 = total403 * temp4;
            }

            if (cus.getFlightIds().equalsIgnoreCase(Flight5)) {
                total346 = total346 + 1;
                for (Airplane air : fleet.getFleet()) {
                    if (air.getFlightID().equalsIgnoreCase(Flight5)) {
                        //Airplane air1 = new Airplane();
                        temp5 = air.getPricePerSeat();
                        //System.out.println("biscuit---------------------"+temp5);
                    }
                }
                revenueAA346 = total346 * temp5;
            }

            if (cus.getFlightIds().equalsIgnoreCase(Flight6)) {
                total978 = total978 + 1;
                for (Airplane air : fleet.getFleet()) {
                    if (air.getFlightID().equalsIgnoreCase(Flight6)) {
                        //Airplane air1 = new Airplane();
                        temp6 = air.getPricePerSeat();
                        //System.out.println("biscuit---------------------"+temp5);
                    }
                }
                revenueAA978 = total978 * temp6;
            }

            if (cus.getFlightIds().equalsIgnoreCase(Flight7)) {
                total345 = total345 + 1;
                for (Airplane air : fleet.getFleet()) {
                    if (air.getFlightID().equalsIgnoreCase(Flight7)) {
                        //Airplane air1 = new Airplane();
                        temp7 = air.getPricePerSeat();
                        //System.out.println("biscuit---------------------"+temp5);
                    }
                }
                revenueAA345 = total345 * temp7;
            }

            if (cus.getFlightIds().equalsIgnoreCase(Flight8)) {
                total746 = total746 + 1;
                for (Airplane air : fleet.getFleet()) {
                    if (air.getFlightID().equalsIgnoreCase(Flight8)) {
                        //Airplane air1 = new Airplane();
                        temp8 = air.getPricePerSeat();
                        //System.out.println("biscuit---------------------"+temp5);
                    }
                }
                revenueAA746 = total746 * temp8;
            }

            if (cus.getFlightIds().equalsIgnoreCase(Flight9)) {
                total567 = total567 + 1;
                for (Airplane air : fleet.getFleet()) {
                    if (air.getFlightID().equalsIgnoreCase(Flight9)) {
                        //Airplane air1 = new Airplane();
                        temp9 = air.getPricePerSeat();
                        //System.out.println("biscuit---------------------"+temp5);
                    }
                }
                revenueQA567 = total567 * temp9;
            }

            if (cus.getFlightIds().equalsIgnoreCase(Flight10)) {
                total358 = total358 + 1;
                for (Airplane air : fleet.getFleet()) {
                    if (air.getFlightID().equalsIgnoreCase(Flight10)) {
                        //Airplane air1 = new Airplane();
                        temp10 = air.getPricePerSeat();
                        //System.out.println("biscuit---------------------"+temp5);
                    }
                }
                revenueQA358 = total358 * temp10;
            }

            if (cus.getFlightIds().equalsIgnoreCase(Flight11)) {
                total987 = total987 + 1;
                for (Airplane air : fleet.getFleet()) {
                    if (air.getFlightID().equalsIgnoreCase(Flight11)) {
                        //Airplane air1 = new Airplane();
                        temp11 = air.getPricePerSeat();
                        //System.out.println("biscuit---------------------"+temp5);
                    }
                }
                revenueQA987 = total987 * temp11;
            }

            if (cus.getFlightIds().equalsIgnoreCase(Flight12)) {
                total657 = total657 + 1;
                for (Airplane air : fleet.getFleet()) {
                    if (air.getFlightID().equalsIgnoreCase(Flight12)) {
                        //Airplane air1 = new Airplane();
                        temp12 = air.getPricePerSeat();
                        //System.out.println("biscuit---------------------"+temp5);
                    }
                }
                revenueEA657 = total657 * temp12;
            }

            if (cus.getFlightIds().equalsIgnoreCase(Flight13)) {
                total465 = total465 + 1;
                for (Airplane air : fleet.getFleet()) {
                    if (air.getFlightID().equalsIgnoreCase(Flight13)) {
                        //Airplane air1 = new Airplane();
                        temp13 = air.getPricePerSeat();
                        //System.out.println("biscuit---------------------"+temp5);
                    }
                }
                revenueEA465 = total465 * temp13;
            }
            if (cus.getFlightIds().equalsIgnoreCase(Flight14)) {
                total546 = total546 + 1;
                for (Airplane air : fleet.getFleet()) {
                    if (air.getFlightID().equalsIgnoreCase(Flight14)) {
                        //Airplane air1 = new Airplane();
                        temp14 = air.getPricePerSeat();
                        //System.out.println("biscuit---------------------"+temp5);
                    }
                }
                revenueEA546 = total546 * temp14;
            }
        }
        System.out.println("_____________________________________________________________________________________________________________________________________");
        System.out.println("Revenue Generated By the British Airways BA103 is USD " + revenueBA103);
        System.out.println("Revenue Generated By the British Airways BA203 is USD " + revenueBA203);
        System.out.println("Revenue Generated By the British Airways BA303 is USD " + revenueBA303);
        System.out.println("Revenue Generated By the British Airways BA403 is USD " + revenueBA403);
        System.out.println("Revenue Generated By the American Airlines AA346 is USD " + revenueAA346);
        System.out.println("Revenue Generated By the American Airlines AA978 is USD " + revenueAA978);
        System.out.println("Revenue Generated By the American Airlines AA345 is USD " + revenueAA345);
        System.out.println("Revenue Generated By the American Airlines AA746 is USD " + revenueAA746);
        System.out.println("Revenue Generated By the Quatar Airways QA567 is USD " + revenueQA567);
        System.out.println("Revenue Generated By the Quatar Airways QA358 is USD " + revenueQA358);
        System.out.println("Revenue Generated By the Quatar Airways QA987 is USD " + revenueQA987);
        System.out.println("Revenue Generated By the Emirates Airlines EA657 is USD " + revenueEA657);
        System.out.println("Revenue Generated By the Emirates Airlines EA465 is USD " + revenueEA465);
        System.out.println("Revenue Generated By the Emirates Airlines EA546 is USD " + revenueEA546);
      //  System.out.println("__________________________________________________________________________________________________________________________________________");

    }

    private static void revenueByAirline() {
        
    int flightprice=0;
        String flightnum;
        int price=0,total=0;
        String British="British Airways", Emirates="Emirates",American="American Airlines",Qatar="Qatar Airways";
        int revenueBA =0,revenueQA =0,revenueAA =0,revenueEM =0;
        
        for(Customer customer : customerdirectory.getCustomerdirectory())
        {
            flightnum=customer.getFlightIds();
            
                for(Airplane flight : fleet.getFleet())
            {
               
                
                if(flight.getFlightID().equalsIgnoreCase(flightnum))
                {
                    if(flight.getAirliner().equalsIgnoreCase(Qatar))
                    {
                        price=flight.getPricePerSeat();
                        revenueQA+=price;
                    }
                }
                if(flight.getFlightID().equalsIgnoreCase(flightnum))
                {
                    if(flight.getAirliner().equalsIgnoreCase(Emirates))
                    {
                        price=flight.getPricePerSeat();
                        revenueEM+=price;
                    }
                }
                if(flight.getFlightID().equalsIgnoreCase(flightnum))
                {
                    if(flight.getAirliner().equalsIgnoreCase(American))
                    {
                        price=flight.getPricePerSeat();
                        revenueAA+=price;
                    }
                }
                if(flight.getFlightID().equalsIgnoreCase(flightnum))
                {
                 
                    if(flight.getAirliner().equalsIgnoreCase(British))
                    {
                        
                        price=flight.getPricePerSeat();
                        revenueBA+=price;
                    }
                }
            }
        }
        System.out.println("_____________________________________________________________________________________________________________________________________");

        System.out.println("Revenue for British Airways is USD"+revenueBA);
        System.out.println("Revenue for Qatar Airways is USD"+revenueQA);
        System.out.println("Revenue for American Airways is $"+revenueAA);
        System.out.println("Revenue for Emirates is $"+revenueEM);
        System.out.println("_____________________________________________________________________________________________________________________________________");

    }
    
    private static void revenueTotal() 
    {
        //int price = 0;
        String flightID;
        int totalrevenue = 0;
        for (Customer cus : customerdirectory.getCustomerdirectory()) {
            flightID = cus.getFlightIds();
            for (Airplane air : fleet.getFleet()) {
                if (air.getFlightID().equalsIgnoreCase(flightID)) {
                    totalrevenue = totalrevenue + air.getPricePerSeat();
                }
            }

        }

        //System.out.println("_____________________________________________________________________________________________________________________________________");
        System.out.println("Total Revenue is USD" + totalrevenue);
        System.out.println("_____________________________________________________________________________________________________________________________________");

    }
}
