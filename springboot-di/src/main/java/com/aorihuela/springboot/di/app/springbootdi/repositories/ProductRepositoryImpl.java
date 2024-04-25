package com.aorihuela.springboot.di.app.springbootdi.repositories;

import java.util.Arrays;
import java.util.List;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.RequestScope;

import com.aorihuela.springboot.di.app.springbootdi.models.Product;

// Es un componente
//@Component
@RequestScope //El pedido por request
@Repository("productList")
public class ProductRepositoryImpl implements ProductRepository{
    private List<Product> dataProduct;


    // Constructor
    public ProductRepositoryImpl() {
        this.dataProduct = Arrays.asList(
            new Product(1L,"Memoria 4GB", 1000L),
            new Product(2L,"Mainboard Intel", 140L),
            new Product(3L,"Microprocesador i7", 200L), 
            new Product(4L,"Teclado Redragon", 50L)

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
