package com.ProductApp.ProductSpringWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    productService service;
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }
    @GetMapping("/product/{name}")
    public Product getProduct(@PathVariable String name){
        return service.getProduct(name);
    }
    @PostMapping("/product")
    public void addProduct(Product p){
        service.addProduct(p);
    }
}
