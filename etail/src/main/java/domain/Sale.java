/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author shaystevens
 */
public class Sale {
    private Integer saleId;
    private LocalDateTime date;
    private String status;
    private Customer customer;
    private ArrayList<SaleItem> items;
    
    public BigDecimal getTotal(){
        BigDecimal total = new BigDecimal(0);
        for(int x=0; x < items.size(); x++){
            BigDecimal itemTotal = items.get(x).getItemTotal();
            total.add(itemTotal);
        }
        return total;
    }
    
    public void addItem(SaleItem saleItem){
        items.add(saleItem);
    }

    public Integer getSaleId() {
        return saleId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Collection<SaleItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<SaleItem> items) {
        this.items = items;
    }
    
    

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
