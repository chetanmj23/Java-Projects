/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ReviewCommitteeRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author cheta
 */
public class ReviewCommOrganization extends Organization{

    public ReviewCommOrganization() {
        super(Organization.Type.ReviewCommittee.getValue());
    }

        

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList();
        roles.add(new ReviewCommitteeRole());
        return roles;
    }
    
}
