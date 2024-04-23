package com.aorihuela.springboot.di.app.springbootdi.models;

public class Product implements Cloneable {
    private Long id;
    private String nombre;
    private Long price;


    public Product() {
    }

    public Product(Long id, String nombre, Long price) {
        this.id = id;
        this.nombre = nombre;
        this.price = price;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Long getPrice() {
        return price;
    }
    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public Object clone() {
        // retorna un Object debemos hacer un cast
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return new Product(this.getId(), this.getNombre(), this.getPrice());
        }
    }


 
    

}
