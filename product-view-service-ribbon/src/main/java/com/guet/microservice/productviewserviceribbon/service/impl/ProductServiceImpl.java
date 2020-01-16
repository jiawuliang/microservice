package com.guet.microservice.productviewserviceribbon.service.impl;

import com.guet.microservice.productviewserviceribbon.client.ProductClientRibbon;
import com.guet.microservice.productviewserviceribbon.pojo.Product;
import com.guet.microservice.productviewserviceribbon.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductClientRibbon productClientRibbon;

    public List<Product> listProducts() {

        return productClientRibbon.listProdcuts();
    }

}
