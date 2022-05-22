/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Product;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author shaystevens
 */
public class ProductCollectionsDAO {
    private static Collection<Product> products = new HashSet<>();
    private static Collection<String> categories = new HashSet<>();
    private static Collection<String> productIDs = new HashSet<>();

    public static Collection<String> getProductIDs() {
        return productIDs;
    }
    
    public void saveProduct(Product product){
        products.add(product);
        categories.add(product.getCategory());
        productIDs.add(product.getProductID());
    }
    
    public Product searchById(String id){
        if(productIDs.contains(id)){
            ArrayList<Product> productsArray = new ArrayList<>(products);
            for(int x = 0; x < productsArray.size(); x++){
                Product compareProduct = productsArray.get(x);
                if(compareProduct.getProductID().equals(id)){
                    return productsArray.get(x);
                }  
            }
        }
        return null;
    }
    
    public Collection<Product> getProducts(){
        return products;
    }
    
    public void removeProduct(Product product){
        products.remove(product);
    }
    
    public Collection<String> getCategories(){
        return categories;
    }
}
