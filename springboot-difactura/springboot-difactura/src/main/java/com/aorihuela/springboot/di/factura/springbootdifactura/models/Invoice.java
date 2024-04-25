package com.aorihuela.springboot.di.factura.springbootdifactura.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
public class Invoice {
    
    @Autowired
    private Client client;

    @Value("${invoice.description}")
    private String description;
    
    @Autowired 
    private List<Item> items;


    

    
    public Invoice(Client client, String description, List<Item> items) {
        this.client = client;
        this.description = description;
        this.items = items;    
    }
  
    public Invoice() {
        
    }

    // geters
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getDeterminarTotal(){
        return 0d;
    }


    
}
