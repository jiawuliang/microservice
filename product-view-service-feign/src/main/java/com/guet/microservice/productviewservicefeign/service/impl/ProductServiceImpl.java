package com.guet.microservice.productviewservicefeign.service.impl;

import com.guet.microservice.productviewservicefeign.client.ProductClientFeign;
import com.guet.microservice.productviewservicefeign.pojo.Product;
import com.guet.microservice.productviewservicefeign.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductClientFeign productClientFeign;

    public List<Product> listProducts() {

        return productClientFeign.listProdcuts();
    }

}
