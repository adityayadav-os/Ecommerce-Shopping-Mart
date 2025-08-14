package com.adi.Ecom.controller;


import com.adi.Ecom.model.Product;
import com.adi.Ecom.service.ProductSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sound.sampled.Port;
import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin("*")

public class ProductController {

    @Autowired

    ProductSerivce productSerivce;

    @GetMapping
      public  List<Product> getAllProducts(){

        return productSerivce.gatAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id){

        return productSerivce.getProductById(id);
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product){

       return productSerivce.addProduct(product);
    }
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id){
        productSerivce.deleteProduct(id);
    }
}
