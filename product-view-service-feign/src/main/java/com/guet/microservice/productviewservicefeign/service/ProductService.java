package com.guet.microservice.productviewservicefeign.service;

import com.guet.microservice.productviewservicefeign.pojo.Product;

import java.util.List;

public interface ProductService {

    List<Product> listProducts();
}
