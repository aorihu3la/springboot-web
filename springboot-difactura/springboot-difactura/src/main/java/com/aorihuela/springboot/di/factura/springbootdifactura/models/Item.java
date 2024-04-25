package com.aorihuela.springboot.di.factura.springbootdifactura.models;

public class Item {
    private Product product;
    private Integer quantity;



    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Item(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    public Item() {
    }

    public Double getImporte(){
        return 1.1*(quantity * product.getPrice()) ;
    }
    



    
}
