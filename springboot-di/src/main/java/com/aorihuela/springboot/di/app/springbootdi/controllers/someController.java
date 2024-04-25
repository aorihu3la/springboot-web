package com.aorihuela.springboot.di.app.springbootdi.controllers;

import java.util.List;


//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aorihuela.springboot.di.app.springbootdi.models.Product;
import com.aorihuela.springboot.di.app.springbootdi.services.ProductService;





@RestController
@RequestMapping("/api")
public class someController {

    public someController(ProductService service) {
        this.service = service;
    }


    //Inyección de dependencias a través de una interfase. Que es el más generico
    ///@Autowired
    private ProductService service;
    //private ProductServiceImpl service = new ProductServiceImpl();

    @GetMapping
    public List<Product> list(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Product show(@PathVariable Long id){
        return service.findById(id);
    }

}
