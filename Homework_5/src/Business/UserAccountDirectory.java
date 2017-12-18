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
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAcctDirectory;

    

    public UserAccountDirectory() {
        userAcctDirectory = new ArrayList<UserAccount>();
    }
    
    

    public ArrayList<UserAccount> getUserAcctDirectory() {
        return userAcctDirectory;
    }

    public void setUserAcctDirectory(ArrayList<UserAccount> userAcctDirectory) {
        this.userAcctDirectory = userAcctDirectory;
    }
    
    public UserAccount addUserAccount()
    {
        UserAccount useraccount = new UserAccount();
        userAcctDirectory.add(useraccount);
        return useraccount;
        
    }
    
    public void deleteUserAccout(UserAccount useraccount)
    {
        userAcctDirectory.remove(useraccount);
    }
    
    public UserAccount ValidUser(String userid, String pwd)
    {
        for(UserAccount useraccount: userAcctDirectory)
        {
            if(useraccount.getUserID().equalsIgnoreCase(userid) && useraccount.getPassword().equals(pwd))
            {
                return useraccount;
            }
        }
        return null;
    }
    
    public UserAccount ValidStatus(String status)
    {
        for(UserAccount useraccount: userAcctDirectory)
        {
            if(useraccount.getStatus().equalsIgnoreCase("Active"))
            {
                return useraccount;
            }
        }
       return null;
    }
    
}
