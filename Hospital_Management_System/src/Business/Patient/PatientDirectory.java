/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author cheta
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientList;

    public PatientDirectory() {
        patientList = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    
    
    public Patient createPatient(String name, int age){
        Patient patient = new Patient();
        patient.setname(name);
        patient.setAge(age);
        //patient.setSsnNo(ssn);
        patientList.add(patient);
        return patient;
    }
    
}
