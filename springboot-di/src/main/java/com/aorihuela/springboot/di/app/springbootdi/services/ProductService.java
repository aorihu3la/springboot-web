package com.aorihuela.springboot.di.app.springbootdi.services;

import java.util.List;
import java.util.stream.Collectors;

import com.aorihuela.springboot.di.app.springbootdi.models.Product;
import com.aorihuela.springboot.di.app.springbootdi.repositories.ProductRepository;

public class ProductService {
    private ProductRepository repository = new ProductRepository();

    //Logica de negocio

    public List<Product> findAll(){
        
         return repository.findAll().stream().map(p -> {
            Double priceIgv = p.getPrice() * 1.1d;
            p.setPrice(priceIgv.longValue());
            return p;
         }).collect(Collectors.toList());  
        //return repository.findAll();


    }

    public Product findById(Long id){
        return repository.findById(id);
    }

}
