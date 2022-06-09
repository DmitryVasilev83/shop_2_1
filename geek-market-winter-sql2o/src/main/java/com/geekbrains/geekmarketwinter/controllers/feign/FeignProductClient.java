package com.geekbrains.geekmarketwinter.controllers.feign;


import com.geekbrains.geekmarketwinter.entites.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("geek-spring-cloud-product-service")
public interface FeignProductClient {
    @RequestMapping("/greeting")
    String greeting();

    @RequestMapping("/get-products")
    List<Product> getProduct();



}
