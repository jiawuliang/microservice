package com.guet.microservice.producedataservice.service.impl;

import com.guet.microservice.producedataservice.pojo.Product;
import com.guet.microservice.producedataservice.service.ProductService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Value("${server.port}")
    String port;

    public List<Product> listProducts() {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1, "product a from port:" + port, 50));
        productList.add(new Product(2, "product b from port:" + port, 150));
        productList.add(new Product(3, "product c from port:" + port, 250));

        return productList;
    }

}
