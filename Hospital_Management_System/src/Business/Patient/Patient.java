/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

/**
 *
 * @author cheta
 */
public class Patient {
    
    private String name;
    private int age;
    private int ssnNo;
    private int id;
    private static int count = 1;

    public Patient() {
        id = count;
        count++;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSsnNo() {
        return ssnNo;
    }

    public void setSsnNo(int ssnNo) {
        this.ssnNo = ssnNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
