package com.aorihuela.springboot.di.app.springbootdi.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.aorihuela.springboot.di.app.springbootdi.models.Product;
import com.aorihuela.springboot.di.app.springbootdi.repositories.ProductRepository;

// Es un componente gestionado por el contenedor
//@Component 
@Service
public class ProductServiceImpl implements ProductService {
    
    //@Autowired
    private ProductRepository repository;
    //private ProductRepositoryImpl repository = new ProductRepositoryImpl();


    // Si tengo dos implementaciones de una misma interfase puedo seleccionar cual usar con la anotacion @Qualifier
    public ProductServiceImpl(@Qualifier("productList") ProductRepository repository) {
        this.repository = repository;
    }

   
    //Logica de negocio

    //Comentarios
    //Windows: Ctrl+K Ctrl+C
    //Windows: Ctrl+K Ctrl+U

    @Override
    public List<Product> findAll(){
        
         return repository.findAll().stream().map(p -> {
            Double priceIgv = p.getPrice() * 1.1d;
            // p.setPrice(priceIgv.longValue());
            // return p;

            // principio de inmutabilidad
            Product newProduct = new Product();
            newProduct = (Product)p.clone();
            newProduct.setPrice(priceIgv.longValue());
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
