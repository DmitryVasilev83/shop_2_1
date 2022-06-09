package com.geekbrains.geekmarketwinter.aspects;

import com.geekbrains.geekmarketwinter.utils.ShoppingCart;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class CartAspect {

    @After("execution(public * com.geekbrains.geekmarketwinter.services.ShoppingCartService.getCurrentCart(..))")
    public void MethodGetTotalCostLogging() {
        System.out.println("Вызван метод getCurrentCart");
    }

    @AfterReturning(
            pointcut = "execution(public * com.geekbrains.geekmarketwinter.services.ShoppingCartService.getCurrentCart(..))",
            returning = "cart")
    public void afterGetBobInfo(JoinPoint joinPoint, ShoppingCart cart) {
        System.out.println("пересчет корзины");
        cart.setTotalCost(cart.getTotalCost());
    }

}
