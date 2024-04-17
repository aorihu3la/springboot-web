package com.aorihuela.springboot.di.app.springbootdi.repositories;

import java.util.Arrays;
import java.util.List;

import com.aorihuela.springboot.di.app.springbootdi.models.Product;

public class ProductRepository {
    private List<Product> dataProduct;


    // Constructor
    public ProductRepository() {
        this.dataProduct = Arrays.asList(
            new Product(1L,"Memoria 4GB", 100L),
            new Product(2L,"Mainboard intel", 140L),
            new Product(3L,"microprocesador i7", 200L), 
            new Product(4L,"teclado Reddragon", 50L)

        );
    }

    public List<Product> findAll(){
        return dataProduct;
    }

    public Product findById(Long Id){
        return dataProduct.stream().filter(p-> p.getId().equals(Id)).findFirst().orElse(null);
    }






    

}
