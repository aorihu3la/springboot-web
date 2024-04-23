package com.aorihuela.springboot.di.app.springbootdi.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.aorihuela.springboot.di.app.springbootdi.models.Product;
import com.aorihuela.springboot.di.app.springbootdi.repositories.ProductRepository;

// Es un componente gestionado por el contenedor
//@Component 
@Service
public class ProductServiceImpl implements ProductService {
    
    @Autowired
    private ProductRepository repository;
    //private ProductRepositoryImpl repository = new ProductRepositoryImpl();

    //Logica de negocio

    @Override
    public List<Product> findAll(){
        
         return repository.findAll().stream().map(p -> {
            Double priceIgv = p.getPrice() * 1.1d;
            // principio de inmutabilidad
            Product newProduct = new Product();
            newProduct = (Product)p.clone();
            newProduct.setPrice(priceIgv.longValue());
            //p.setPrice(priceIgv.longValue());
            return newProduct;
         }).collect(Collectors.toList());  
        //return repository.findAll();


    }

    @Override
    public Product findById(Long id){
        Long cantidad = repository.cantidadLista();
        if( cantidad < id){
            return repository.findById(cantidad);    
        } else return repository.findById(id);
    }

}
