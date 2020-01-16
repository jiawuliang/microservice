package com.guet.microservice.productviewserviceribbon.controller;

import com.guet.microservice.productviewserviceribbon.pojo.Product;
import com.guet.microservice.productviewserviceribbon.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public Object products(Model m) {

        List<Product> productList = productService.listProducts();
        m.addAttribute("productList", productList);

        System.out.println("products：" + productList);

        return "products";
    }
}
