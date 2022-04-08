package tls.demo.aml.controllers;

import lombok.var;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tls.demo.aml.models.Product;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping (path = "/api/v1/Products")
public class ProductController {
    @GetMapping("")
    //http://localhost:8080/api/v1/Products
    List<Product> getAllProducts(){
        List<Product> list= Arrays.asList(
                new Product(1L,"Macbook",2020,2400.0,""),
                new Product(2L,"Iphone",2020,1400.0,"")
        );
        return list;
    }
}
