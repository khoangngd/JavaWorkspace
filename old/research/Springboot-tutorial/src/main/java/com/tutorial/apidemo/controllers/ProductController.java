package com.tutorial.apidemo.controllers;

import com.tutorial.apidemo.models.Product;
import com.tutorial.apidemo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/Products")
public class ProductController {
    //DI = Dependency Injection
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("")
        //this request is: http://localhost:8080/api/v1/Products
    List<Product> getAllProducts() {
        List<Product> list = productRepository.findAll();
        return list;
    }
}
