package com.ProductApp.ProductSpringWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//@Component //because want the spring framework to give me the object of the productService therefore used this annotation
@Service
public class productService { //this is like the service layer does all the logic work
    @Autowired
    ProductDB db;

    public void addProduct(Product p){
        db.save(p);
    }

    public List<Product> getAllProducts() {

        return db.findAll();
    }

    public Product getProduct(String name){
        return db.findByName(name);

    }
}
