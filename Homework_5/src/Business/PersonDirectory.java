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
public class PersonDirectory {
    
    private ArrayList<Person> personDirectory;

    public PersonDirectory() {
        personDirectory = new ArrayList<Person>();
    }


   

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    public Person addPerson()
    {
        Person person = new Person();
        personDirectory.add(person);
        return person;
    }
    
    public void deleteAccount(Person person)
    {
        personDirectory.remove(person);
    }
    
    public Person searchPerson(String firstName)
    {
        for(Person person : personDirectory)
        {
            if(person.getFirstName().equalsIgnoreCase(firstName));
            {
                return person;
            }
        }
        return null;
    }
    
    
    
}
