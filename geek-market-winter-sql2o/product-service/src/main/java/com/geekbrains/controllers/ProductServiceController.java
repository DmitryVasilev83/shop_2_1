package com.geekbrains.controllers;


import com.geekbrains.entites.Product;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface ProductServiceController {
    @RequestMapping("/greeting")
    String greeting();


    @RequestMapping("/get-products")
    List<Product> getProduct();
}
