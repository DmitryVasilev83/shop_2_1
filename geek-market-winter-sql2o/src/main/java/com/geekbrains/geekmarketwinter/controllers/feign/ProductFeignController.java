package com.geekbrains.geekmarketwinter.controllers.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
public class ProductFeignController {

    ProductFeignInterface productFeignInterface;

    @Autowired
    public void setProductFeignInterface(ProductFeignInterface productFeignInterface) {
        this.productFeignInterface = productFeignInterface;
    }

    @RequestMapping("/shop/get-greeting")
    public String greeting(Model model) {
        String answer = productFeignInterface.greeting();

        String result = answer + " OK";
        model.addAttribute("greeting", result);
        return "greeting-view";
    }
}
