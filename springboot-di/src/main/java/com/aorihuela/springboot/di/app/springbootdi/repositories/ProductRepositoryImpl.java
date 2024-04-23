package com.aorihuela.springboot.di.app.springbootdi.repositories;

import java.util.Arrays;
import java.util.List;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.aorihuela.springboot.di.app.springbootdi.models.Product;

// Es un componente
//@Component
@Repository
public class ProductRepositoryImpl implements ProductRepository{
    private List<Product> dataProduct;


    // Constructor
    public ProductRepositoryImpl() {
        this.dataProduct = Arrays.asList(
            new Product(1L,"Memoria 4GB", 100L),
            new Product(2L,"Mainboard intel", 140L),
            new Product(3L,"microprocesador i7", 200L), 
            new Product(4L,"teclado Redragon", 50L)

        );
    }

    @Override
    public List<Product> findAll(){
        return dataProduct;
    }

    @Override
    public Product findById(Long Id){
        return dataProduct.stream().filter(p-> p.getId().equals(Id)).findFirst().orElse(null);
    }

    public Long cantidadLista(){
        return Long.valueOf(this.dataProduct.size()) ;
    }

}
