package com.guet.microservice.productviewservicefeign.controller;

import com.guet.microservice.productviewservicefeign.pojo.Product;
import com.guet.microservice.productviewservicefeign.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @Value("${version}")
    String version;

    @RequestMapping("/products")
    public Object products(Model m) {

        List<Product> productList = productService.listProducts();
        m.addAttribute("productList", productList);
        m.addAttribute("version", version);

        System.out.println("products：" + productList);
        System.out.println("version：" + version);

        return "products";
    }
}
