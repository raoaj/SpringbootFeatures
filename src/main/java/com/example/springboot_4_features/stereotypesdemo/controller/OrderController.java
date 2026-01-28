package com.example.springboot_4_features.stereotypesdemo.controller;

import com.example.springboot_4_features.stereotypesdemo.service.OrderService;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    @PostMapping
    public String placeOrder(){
        orderService.placeOrder();
        return "Order placed Successfully";
    }
}
