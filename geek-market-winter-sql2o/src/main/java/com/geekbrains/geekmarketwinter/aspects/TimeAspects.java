package com.geekbrains.geekmarketwinter.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;


//@Aspect
//@Component
public class TimeAspects {

    @Around("execution(public * com.geekbrains.geekmarketwinter.services.ProductService.*(..))")
    public void methodsProductTime(ProceedingJoinPoint proceedingJoinPoint)  {

        System.out.println("start");
        long begin = System.currentTimeMillis();
        try {
            proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();
            long duration = end - begin;
            System.out.println((MethodSignature) proceedingJoinPoint.getSignature() + " duration: " + duration);
            System.out.println("end");
        }
        catch (Throwable throwable) {
            System.out.println("Операция не удалась");
        }
    }



}

