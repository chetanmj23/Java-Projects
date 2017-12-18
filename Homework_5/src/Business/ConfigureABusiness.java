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
public class ConfigureABusiness {
    
    public static Business Initilize ()
    {
        Business b = new Business();
        
        
        
        
        UserAccountDirectory uad = b.getUseraccountdirectory();
        
//        Person p2 = pd.searchPerson("Chetan");
        UserAccount ua = uad.addUserAccount();
//        if(p2!=null)
//        {
            
            //ua.setPerson(p2);
            ua.setUserID("cjadhav");
            ua.setPassword("jadhav");
            ua.setRole("System Admin");
            ua.setStatus("Active");
            
        //}
        
        //Person p3 = pd.searchPerson("Miley");
        UserAccount ua1 = uad.addUserAccount();
//        if(p3!=null)
//        {
            //UserAccount ua1 = uad.addUserAccount();
            //ua1.setPerson(p3);
            ua1.setUserID("mcyrus");
            ua1.setPassword("cyrus");
            ua1.setRole("HR Admin");
            ua1.setStatus("Active");
            
         UserAccount ua2 = uad.addUserAccount();
            
         
         ua2.setUserID("cronaldo");
         ua2.setPassword("ronaldo");
         ua2.setRole("User");
         ua2.setStatus("Active");
       // }
           PersonDirectory pd = b.getPersondirectory();
        
        Person p = pd.addPerson();
        p.setFirstName("Chetan");
        p.setLastName("Jadhav");
        p.setAge(26);
        p.setsSNumber(54321);
        p.setAddress("11 Tetlow Street Boston");
        p.setUseraccount(ua);
        
        Person p1 = pd.addPerson();
        p1.setFirstName("Miley");
        p1.setLastName("Cyrus");
        p1.setAge(24);
        p1.setsSNumber(12345);
        p1.setAddress("California"); 
        p1.setUseraccount(ua1);
        
        Person p2 = pd.addPerson();
        p2.setFirstName("Cristiano");
        p2.setLastName("Ronaldo");
        p2.setAge(34);
        p2.setsSNumber(87657);
        p2.setAddress("Portugal"); 
        p2.setUseraccount(ua2);
        
        return b;
    }
    
}
