package com.geekbrains.geekmarketwinter.controllers.feign;


import com.geekbrains.geekmarketwinter.entites.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FeignProductController {
    private FeignProductClient feignProductClient;

    @Autowired
    public void setFeignProductClient(FeignProductClient feignProductClient) {
        this.feignProductClient = feignProductClient;
    }

    @RequestMapping("/get-greeting")
    public String greeting(Model model) {
        System.out.println("test1");
        String answer = feignProductClient.greeting();

        String result = answer + " and eureka-feign-client";
        model.addAttribute("greeting", result);

        return "greeting-view";
    }

    @RequestMapping("/get-products")
    public String getProduct(Model model) {
        List<Product> answer = feignProductClient.getProduct();
        model.addAttribute("products", answer);

        return "list-product";
    }




}
