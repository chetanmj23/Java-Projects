/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author AMY
 */
public class ProductCatalog {
    private ArrayList<Product> productCatalog;
    
    public ProductCatalog () {
        productCatalog = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ArrayList<Product> productCatalog) {
        this.productCatalog = productCatalog;
    }
    
    public Product addProduct() {
        Product product = new Product();
        productCatalog.add(product);
        return product;
    }
    
    public void removeProduct(Product p){
        productCatalog.remove(p);
    }
}
