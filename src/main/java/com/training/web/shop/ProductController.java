package com.training.web.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping("/")
    public String test() {
        return "welcome";
    }

    @GetMapping("/getOne")
    public List<Product> getAllProducts() {
        return productService.findAllProducts();
    }

    @GetMapping("/add")
    public String addProduct() {
        productService.addProduct(new Product());
        return "successed";
    }


}
