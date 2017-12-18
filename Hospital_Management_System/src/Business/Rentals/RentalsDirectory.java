/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Rentals;

import java.util.ArrayList;

/**
 *
 * @author cheta
 */
public class RentalsDirectory {
    
   private ArrayList<Rentals> rentalsList;

    public RentalsDirectory()
    {
        rentalsList = new ArrayList();
    }

    public ArrayList<Rentals> getRentalsList() {
        return rentalsList;
    }

    public void setRentalsList(ArrayList<Rentals> rentalsList) {
        this.rentalsList = rentalsList;
    }
    
//    public Rentals addRental() {
//        Rentals r = new Rentals();
//        rentalsList.add(r);
//        return r;
//    }
//    
//    public void addR(Rentals rentals) {
//        rentalsList.add(rentals);
//    }
    
    
    public void removeRentals(Rentals rentals) {
        rentalsList.remove(rentals);
    }
}
