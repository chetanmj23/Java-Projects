/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author cheta
 */
public class Fleet {
    
   private ArrayList<Airplane> fleet;


   
   public Fleet() throws FileNotFoundException, IOException
     {
         
     fleet  = new ArrayList<Airplane>();
        
        FileReader fr = new FileReader("C:\\Users\\cheta\\OneDrive\\Documents\\NetBeansProjects\\HomeWork_Assignment2\\FleetDetails.csv");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        
        while(line!=null){
            
            String fields[] = line.split(",");
            Airplane airplane = new Airplane(fields[0],fields[1],fields[2],fields[3],fields[4],fields[5],fields[6]);
            fleet.add(airplane);
       try {
           line = br.readLine();
       } catch (IOException ex) {
           Logger.getLogger(Fleet.class.getName()).log(Level.SEVERE, null, ex);
       }
        }

     }
    public ArrayList<Airplane> getFleet() {
        return fleet;
    }

    public void setFleet(ArrayList<Airplane> fleet) {
        this.fleet = fleet;
    }
    
             
    
     

    public Airplane addPlanes() 
    {
        Airplane A = new Airplane();
        fleet.add(A);
        return A;
    }
}

