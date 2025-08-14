package com.adi.Ecom.service;


import com.adi.Ecom.model.Product;
import com.adi.Ecom.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductSerivce {
    @Autowired
    ProductRepository productRepository;
    public List<Product> gatAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
       return productRepository.findById(id).orElse(null);
    }

    public Product addProduct(Product product) {

        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
