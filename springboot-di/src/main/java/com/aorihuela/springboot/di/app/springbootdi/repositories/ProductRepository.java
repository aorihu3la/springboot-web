package com.aorihuela.springboot.di.app.springbootdi.repositories;

import java.util.List;
import com.aorihuela.springboot.di.app.springbootdi.models.Product;

// INTERFACE
public interface ProductRepository {
    //Terminos del contrato, métodos que deben ser implementados por sus clases
    
    // consultar una lista de productos
    // Por default es public
    List<Product> findAll();

    //Buscar un producto por id
    Product findById(Long id);

    Long cantidadLista();
}
