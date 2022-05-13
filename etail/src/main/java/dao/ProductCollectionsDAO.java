/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Product;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author shaystevens
 */
public class ProductCollectionsDAO {
    private static Collection<Product> products = new ArrayList<>();
    
    public void saveProduct(Product product){
        products.add(product);
    }
    
    public Collection<Product> getProducts(){
        return products;
    }
    
    public void removeProduct(Product product){
        products.remove(product);
    }
}
