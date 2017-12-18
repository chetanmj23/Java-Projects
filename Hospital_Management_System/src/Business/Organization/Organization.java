/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Patient.PatientDirectory;
import Business.ReviewCommittee.FeedbackPool;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author cheta
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private PatientDirectory patientList;
    private int organizationID;
    private static int counter;
    private FeedbackPool feedbacklist;

    public PatientDirectory getPatientList() {
        return patientList;
    }

    public void setPatientList(PatientDirectory patientList) {
        this.patientList = patientList;
    }
    
    
    
    public enum Type{
        Doctor("Doctor Organization"), ReviewCommittee ("Review Comittee"), Admin("Admin Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        patientList = new PatientDirectory();
        feedbacklist = new FeedbackPool();
        organizationID = counter;
        ++counter;
    }

    public FeedbackPool getFeedbacklist() {
        return feedbacklist;
    }

    public void setFeedbacklist(FeedbackPool feedbacklist) {
        this.feedbacklist = feedbacklist;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
