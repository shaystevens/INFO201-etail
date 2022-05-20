/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Product;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author shaystevens
 */
public class ProductCollectionsDAO {
    private static Collection<Product> products = new HashSet<>();
    private static Collection<String> categories = new HashSet<>();
    
    public void saveProduct(Product product){
        products.add(product);
        categories.add(product.getCategory());
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
