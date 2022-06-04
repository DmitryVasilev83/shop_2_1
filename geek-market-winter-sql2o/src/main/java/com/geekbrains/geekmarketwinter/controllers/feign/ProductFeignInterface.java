package com.geekbrains.geekmarketwinter.controllers.feign;



import org.springframework.web.bind.annotation.RequestMapping;

//@FeignClient("geek-spring-cloud-eureka-client")
public interface ProductFeignInterface {
    @RequestMapping("/greeting")
    String greeting();
}
