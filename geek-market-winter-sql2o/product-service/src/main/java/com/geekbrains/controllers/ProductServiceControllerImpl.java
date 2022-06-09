package com.geekbrains.controllers;


import com.geekbrains.entites.Product;
import com.geekbrains.services.CategoryService;
import com.geekbrains.services.ImageSaverService;
import com.geekbrains.services.ProductService;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductServiceControllerImpl implements ProductServiceController {
    @Autowired
    @Lazy
    private EurekaClient eurekaClient;



    @Autowired
    ProductService productService;
    @Autowired
    CategoryService categoryService;
    @Autowired
    ImageSaverService imageSaverService;

    @Value("${spring.application.name}")
    private String appName;

    @Value("${userValue}")
    private String username;

    @Override
    public String greeting() {

        return "this eureka client";
    }

    @Override
    public List<Product> getProduct() {
        return productService.getAllProducts();
    }
}
