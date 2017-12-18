/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import Business.Enterprise.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author cheta
 */
public class ProductCatalog {
    
        private ArrayList<Product> productList;

    public ProductCatalog()
    {
        productList = new ArrayList();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    public Product addProduct() {
        Product product = new Product();
        productList.add(product);
        return product;
    }
    
    public Product addP(Product product) {
        Product p = product;
        productList.add(product);
        return p;
    }
    
    //Removing an Employee from the Directory
    public void removeProduct(Product product) {
        productList.remove(product);
    }
}
