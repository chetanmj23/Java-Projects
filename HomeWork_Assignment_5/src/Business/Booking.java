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
public class Booking {

    public enum BookingStatus {
        CONFIRMED, CANCELLED
    };
    int bookingId = 0;
    Seat seat;
    Customer customer;
    float price;
    BookingStatus bookingStatus;
    Flight flight;
    Date bookingDate;

    public Booking(Seat seat, Customer customer, float price, BookingStatus bookingStatus, Flight flight, Date bookingDate) {
        bookingId = bookingId++;
        this.seat = seat;
        this.customer = customer;
        this.price = price;
        this.bookingStatus = bookingStatus;
        this.flight = flight;
        this.bookingDate = bookingDate;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
