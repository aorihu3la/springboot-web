package com.aorihuela.springboot.di.factura.springbootdifactura;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.aorihuela.springboot.di.factura.springbootdifactura.models.*;


@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class AppConfig {
    
    @Bean
    // Metodo para aarmar los items 
    List<Item> itemsInvoice(){
        Product p1 = new Product("Mouse", 50);
        Product p2 = new Product("Pad mouse", 20);
        List<Item> items = new ArrayList<>();
        items.add(new Item(p1, 3));
        items.add(new Item(p2, 6));
        return items;
    }

}
