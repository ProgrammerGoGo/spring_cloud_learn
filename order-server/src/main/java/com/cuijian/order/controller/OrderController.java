package com.cuijian.order.controller;

import com.cuijian.order.entity.Order;
import com.cuijian.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("{id}")
    public Order getById(@PathVariable("id") Long id){
        return orderService.getById(id);
    }
}
