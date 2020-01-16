package com.guet.microservice.productviewservicefeign.client;

import com.guet.microservice.productviewservicefeign.pojo.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductClientFeignHystrix implements ProductClientFeign {

    @Override
    public List<Product> listProdcuts() {
        List<Product> result = new ArrayList<>();
        result.add(new Product(0, "产品数据微服务不可用", 0));

        return result;
    }
}
