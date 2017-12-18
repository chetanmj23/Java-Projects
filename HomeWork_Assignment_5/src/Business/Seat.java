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
public class Seat {
    
    public enum SeatClass {
        FirstClass, EconomyClass, BusinessClass
    };
    
    public enum SeatType {
        WindowSeat, MiddleSeat, AisleSeat
    };
    
    private String seatNumber;
    int row;
    char column;
    boolean isEmpty;
    SeatClass seatClass;
    SeatType seatType;

    public Seat(String seatNumber, int row, char column, boolean isEmpty, SeatClass seatClass, SeatType seatType) {
        this.seatNumber = seatNumber;
        this.row = row;
        this.column = column;
        this.isEmpty = isEmpty;
        this.seatClass = seatClass;
        this.seatType = seatType;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public void setColumn(char column) {
        this.column = column;
    }

    public boolean isIsEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    public SeatClass getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(SeatClass seatClass) {
        this.seatClass = seatClass;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }
    
    @Override
    public String toString()
    {
        return seatNumber;
    }
    
}
