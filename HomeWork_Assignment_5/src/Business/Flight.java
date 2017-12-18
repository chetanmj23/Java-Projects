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
public class Flight {
    
    private String flightId;
    private int capacity;
    private String source;
    private String destination;
    private ArrayList<Seat> seat;
    private Airline airline;
    private String timeoftheday;
    

    public Flight(String flightID, int capacity, String source, String destination,Airline airline, String timeoftheday) {
        
        this.flightId=flightID;
        this.capacity=capacity;
        this.source=source;
        this.destination=destination;
        this.airline=airline;
        this.timeoftheday=timeoftheday;
        
        this.seat= new ArrayList<>();
        
        
         char firstCol = 'A';
        int row;
        char col;
        Seat.SeatClass seatClass;
        Seat.SeatType seatType = null;
        for (int i = 0; i < 30; i++) {
            //col
            for (int j = 0; j < 6; j++) {
                //first class
                
                if (i < 5) {
                    row = i + 1;
                    col = (char) (firstCol + j);
                    //first or last row
                    switch (j) {
                        case 0:
                        case 5:
                            seatType = Seat.SeatType.WindowSeat;
                            break;
                        case 1:
                        case 4:
                            seatType = Seat.SeatType.MiddleSeat;
                            break;
                        case 2:
                        case 3:
                            seatType = Seat.SeatType.AisleSeat;
                            break;
                    }
                    Seat seats = new Seat(row+""+col,row, col, true, Seat.SeatClass.FirstClass, seatType);
                    seat.add(seats);
                }
                if ((i > 5) && (i<16)) {
                    row = i + 1;
                    col = (char) (firstCol + j);
                    //first or last row
                    switch (j) {
                        case 0:
                        case 5:
                            seatType = Seat.SeatType.WindowSeat;
                            break;
                        case 1:
                        case 4:
                            seatType = Seat.SeatType.MiddleSeat;
                            break;
                        case 2:
                        case 3:
                            seatType = Seat.SeatType.AisleSeat;
                            break;
                    }
                    Seat seats = new Seat(row+""+col,row, col, true, Seat.SeatClass.BusinessClass, seatType);
                    seat.add(seats);
                }
                if (i > 16) {
                    row = i + 1;
                    col = (char) (firstCol + j);
                    //first or last row
                    switch (j) {
                        case 0:
                        case 5:
                            seatType = Seat.SeatType.WindowSeat;
                            break;
                        case 1:
                        case 4:
                            seatType = Seat.SeatType.MiddleSeat;
                            break;
                        case 2:
                        case 3:
                            seatType = Seat.SeatType.AisleSeat;
                            break;
                    }
                    Seat seats = new Seat(row+""+col,row, col, true, Seat.SeatClass.EconomyClass, seatType);
                    seat.add(seats);
                }
            
            }
            
        }
              
        
    }

    public Flight() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTimeoftheday() {
        return timeoftheday;
    }

    public void setTimeoftheday(String timeoftheday) {
        this.timeoftheday = timeoftheday;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public ArrayList<Seat> getSeat() {
        return seat;
    }

    public void setSeat(ArrayList<Seat> seat) {
        this.seat = seat;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    
    

    
    
    
    
}
