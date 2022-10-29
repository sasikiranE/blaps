package com.example.demo.controller;

import com.example.demo.dao.ProductRepository;
import com.example.demo.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class ProductController {
    private final ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping("/Product")
//    @GetMapping({"/mouryaBC"})
    public String setProduct(Product product){
        productRepository.createProduct(product);
//        System.out.println("lol");
        return "create done amma next!!";
    }

    @PutMapping("/Product")
    public String updateProduct(Product product){
        productRepository.updateProduct(product);
        return "update ayyindi amma next!!";
    }

}
