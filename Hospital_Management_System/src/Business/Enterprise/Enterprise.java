/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Product.ProductCatalog;
import Business.Rentals.RentalsDirectory;
import Business.ReviewCommittee.FeedbackPool;

/**
 *
 * @author cheta
 */
public abstract class Enterprise extends Organization {
    
    private EnterPriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private ProductCatalog productList;
    private RentalsDirectory rentalsList;
    private FeedbackPool feedbackList;
    private int budget;
    private int remaining;
    private int revenue = 0;

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getRemaining() {
        return remaining;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }
    
    

    public FeedbackPool getFeedbackList() {
        return feedbackList;
    }

    public void setFeedbackList(FeedbackPool feedbackList) {
        this.feedbackList = feedbackList;
    }

    public RentalsDirectory getRentalsList() {
        return rentalsList;
    }

    public void setRentalsList(RentalsDirectory rentalsList) {
        this.rentalsList = rentalsList;
    }
    

    public ProductCatalog getProductList() {
        return productList;
    }

    public void setProductList(ProductCatalog productList) {
        this.productList = productList;
    }

    public EnterPriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterPriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }
    
    public enum EnterPriseType
    {
        Hospital("Hospital"),Supplier("Supplier");
        
        private String value;

        public String getValue() {
            return value;
        }
        private EnterPriseType(String value)
        {
            this.value = value;
        }
        public void setValue(String value) {
            this.value = value;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    
    public Enterprise(String name,EnterPriseType type)
    {
        super(name);
        this.enterpriseType=type;
        organizationDirectory = new OrganizationDirectory();
        productList = new ProductCatalog();
        rentalsList = new RentalsDirectory();
    }
    
}
