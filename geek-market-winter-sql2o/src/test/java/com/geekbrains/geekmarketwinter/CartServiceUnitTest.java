package com.geekbrains.geekmarketwinter;

import com.geekbrains.geekmarketwinter.entites.OrderItem;
import com.geekbrains.geekmarketwinter.entites.Product;
import com.geekbrains.geekmarketwinter.services.ProductService;
import com.geekbrains.geekmarketwinter.utils.ShoppingCart;
import org.aspectj.lang.annotation.Before;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.core.annotation.Order;

import javax.servlet.http.HttpSession;

public class CartServiceUnitTest {

    @Autowired
    Product product;
    @Autowired
    ShoppingCart cart;

    @MockBean
    OrderItem orderItem;


    @Test
    @Order(1)
    public void addToCartTest(){
        System.out.println("init");
        product = new Product();
        product.setId(1L);
        product.setTitle("Product1");
        cart = new ShoppingCart();
        cart.add(product);
        System.out.println(cart.getItems().get(0).getProduct().getTitle());
        Assert.assertTrue(cart.getItems().contains(product));
    }

    @Test
    @Order(2)
    public void removeFromCartTest(){
        cart.remove(product);
        Assert.assertFalse(cart.getItems().contains(product));
    }

}
