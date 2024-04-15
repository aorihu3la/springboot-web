package com.aorihuela.springboot.di.app.springbootdi.repositories;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.aorihuela.springboot.di.app.springbootdi.models.Product;

public class ProductRepository {
    private List<Product> dataProduct;

     
    public ProductRepository() {
        this.dataProduct = Arrays.asList(
            new Product(1,"Memoria 4GB", 300)    
        );
    }




    public ProductRepository(List<Product> dataProduct) {
        this.dataProduct = dataProduct;
    }

    

}
