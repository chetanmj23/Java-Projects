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
public class Person {
    
    private String firstName;
    private String lastName;
    private int sSNumber;
    private int age;
    private String Address;
    UserAccount useraccount;

    public Person() {
        useraccount = new UserAccount();
    }
    
    
    

    public UserAccount getUseraccount() {
        return useraccount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getsSNumber() {
        return sSNumber;
    }

    public void setsSNumber(int sSNumber) {
        this.sSNumber = sSNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    @Override
    public String toString(){
        return getFirstName()+ " " + getLastName();
    }

    public void setUseraccount(UserAccount useraccount) {
        this.useraccount = useraccount;
    }
            
    
}
