/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import Business.Airplane;

/**
 *
 * @author cheta
 */
public class Fleet {

    private ArrayList<Airplane> fleet;
    

    public ArrayList<Airplane> getFleet() {
        return fleet;
    }

    public void setFleet(ArrayList<Airplane> fleet) {
        this.fleet = fleet;
    }

    public Fleet() {
        fleet = new ArrayList<Airplane>();
        try {

            // SimpleDateFormat DTime=new SimpleDateFormat("mm-dd-yyyy HH:mm:ss a");
            FileReader fr = new FileReader("Fleet.csv");
            BufferedReader bf = new BufferedReader(fr);
            String line = bf.readLine();
            System.out.println("Data populated");
            while (line != null) {
                String fields[] = line.split(",");

                Airplane airplane = new Airplane(fields[0], fields[1], fields[2], fields[3]);
                //System.out.println("Data populated");
                fleet.add(airplane);
                line = bf.readLine();
            }
        } catch (IOException ex) {
            System.out.println("IOException");
        }

    }

    public Airplane add() 
    {
        Airplane airplanes;
        airplanes = new Airplane();
        fleet.add(airplanes);
        return airplanes;
    }

}
