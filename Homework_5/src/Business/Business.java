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
public class Business {
    
    private String name;
    private UserAccountDirectory useraccountdirectory;
    private PersonDirectory persondirectory;

    public Business(String n) {
        name = n;
       persondirectory = new PersonDirectory();
       useraccountdirectory = new UserAccountDirectory();
        
    }

    public Business() {
       this.name = name;
       persondirectory = new PersonDirectory();
       useraccountdirectory = new UserAccountDirectory();
        
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserAccountDirectory getUseraccountdirectory() {
        return useraccountdirectory;
    }

    public void setUseraccountdirectory(UserAccountDirectory useraccountdirectory) {
        this.useraccountdirectory = useraccountdirectory;
    }

    public PersonDirectory getPersondirectory() {
        return persondirectory;
    }

    public void setPersondirectory(PersonDirectory persondirectory) {
        this.persondirectory = persondirectory;
    }
    
    
    
}
