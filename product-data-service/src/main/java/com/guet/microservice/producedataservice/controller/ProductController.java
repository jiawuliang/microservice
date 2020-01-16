package com.guet.microservice.producedataservice.controller;

import com.guet.microservice.producedataservice.pojo.Product;
import com.guet.microservice.producedataservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public Object products() {
        List<Product> productList = productService.listProducts();
        System.out.println("products：" + productList);

        return productList;
    }
}
