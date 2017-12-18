/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author cheta
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

   
    
    public EnterpriseDirectory()
    {
        enterpriseList = new ArrayList();
    }
    
    //Create Enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterPriseType type)
    {
        Enterprise enterprise = null;
        if(type == Enterprise.EnterPriseType.Hospital)
        {
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterPriseType.Supplier) {
            enterprise = new SupplierEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}              
            
        
    

