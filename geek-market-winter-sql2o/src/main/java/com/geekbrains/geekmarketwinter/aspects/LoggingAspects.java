package com.geekbrains.geekmarketwinter.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class LoggingAspects {

    @Before("execution(public * com.geekbrains.geekmarketwinter.services.ProductService.*(..))")
    public void allMethodsProductLogging() {
        System.out.println("Вызван метод ProductService");
    }

    @Before("execution(public * com.geekbrains.geekmarketwinter.services.ProductService.getProductsWithPagingAndFiltering(..))")
    public void MethodGetProductsWithPagingAndFilteringLogging() {
        System.out.println("Вызван метод ProductService.getProductsWithPagingAndFiltering");
    }

}
