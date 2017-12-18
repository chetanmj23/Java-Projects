/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Akhilesh Kashyap
 */
public class EmployeeDirectory {
    private ArrayList<Person> personList;
    
    public EmployeeDirectory () {
        personList = new ArrayList<Person>();
    }
    
    public Person addPerson() {
        Person person = new Person();
        personList.add(person);
        return person; 
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public Person getTopPerson() {
        //double rating = 0.0;
        Person person = personList.get(0);
        double rating = person.getRating();
        for(Person p : personList) {
            if(p.getRating() > person.getRating()) {
                person = p;
            }
        }
        return person;
    }
    
}
