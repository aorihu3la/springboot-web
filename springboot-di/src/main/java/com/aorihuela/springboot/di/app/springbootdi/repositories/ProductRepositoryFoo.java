package com.aorihuela.springboot.di.app.springbootdi.repositories;

import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.aorihuela.springboot.di.app.springbootdi.models.Product;

//Calificador como implementación principal
@Primary
@Repository("productFoo")
public class ProductRepositoryFoo implements ProductRepository {

    @Override
    public List<Product> findAll() {
        return Collections.singletonList(new Product(9L,"Monitor LG 27", 2569L));
    }

    @Override
    public Product findById(Long id) {
        return new Product(id,"Monitor LG 27", 2569L);
    }

    @Override
    public Long cantidadLista() {
        return 1L;
    }

}
