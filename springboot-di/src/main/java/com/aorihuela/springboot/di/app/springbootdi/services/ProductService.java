package com.aorihuela.springboot.di.app.springbootdi.services;

import java.util.List;

import com.aorihuela.springboot.di.app.springbootdi.models.Product;

// INTERFASE
// Un contrato

public interface ProductService {
    List<Product> findAll();
    Product findById(Long id);

}
