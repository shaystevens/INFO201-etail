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
    //Data fields
    private static Collection<Product> products = new HashSet<>();
    private static Collection<String> categories = new HashSet<>();
    private static Collection<String> productIDs = new HashSet<>();

    public static Collection<String> getProductIDs() {
        return productIDs;
    }
    
    /*
    * Save product to DAO collection
    * @params product - The product to save to collection
    */
    public void saveProduct(Product product){
        //Add product to collection
        products.add(product);
        //Add category to collection
        categories.add(product.getCategory());
        //Ad ID to collection
        productIDs.add(product.getProductID());
    }
    
    /*
    * Serach collection for product using ID and return that product
    * @params id - The id to search
    */
    public Product searchById(String id){
        //If the id is in the id collection
        if(productIDs.contains(id)){
            //Create ArrayList from product collection
            ArrayList<Product> productsArray = new ArrayList<>(products);
            
            //Loop through every element in array list
            for(int x = 0; x < productsArray.size(); x++){
                Product compareProduct = productsArray.get(x);
                
                //If the searched id matches element id
                if(compareProduct.getProductID().equals(id)){
                    //return that product element
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
