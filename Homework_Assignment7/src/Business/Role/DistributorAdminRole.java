/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Distributor.DistributorAdminWorkAreaJPanel;

/**
 *
 * @author cheta
 */
public class DistributorAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DistributorAdminWorkAreaJPanel(userProcessContainer, enterprise);
    }
    @Override
    public String toString(){
        return RoleType.DistributorAdmin.getValue();
    }
    
}
