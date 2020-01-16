package com.guet.microservice.productviewservicefeign.client;

import com.guet.microservice.productviewservicefeign.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Feign 客户端， 通过 注解方式 访问 访问PRODUCT-DATA-SERVICE服务的 products路径， product-data-service 既不是域名也不是ip地址，而是 数据服务在 eureka 注册中心的名称
 */
@FeignClient(value = "PRODUCT-DATA-SERVICE", fallback = ProductClientFeignHystrix.class)
public interface ProductClientFeign {

    @GetMapping("/products")
    List<Product> listProdcuts();
}
