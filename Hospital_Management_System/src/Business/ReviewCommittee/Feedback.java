/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ReviewCommittee;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterPriseType.Hospital;
import Business.UserAccount.UserAccount;

/**
 *
 * @author cheta
 */
public class Feedback {
    
    private Enterprise hospital;
    private String text;
    private Employee doctor;

    public Employee getDoctor() {
        return doctor;
    }

    public void setDoctor(Employee doctor) {
        this.doctor = doctor;
    }
    
    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    
    public Enterprise getHospital() {
        return hospital;
    }

    public void setHospital(Enterprise hospital) {
        this.hospital = hospital;
    }
    
    @Override
    public String toString() {
        return this.text;
    }
    
    
}
