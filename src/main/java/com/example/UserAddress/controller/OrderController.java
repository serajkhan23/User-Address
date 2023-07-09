package com.example.UserAddress.controller;

import com.example.UserAddress.model.Address;
import com.example.UserAddress.model.Order;
import com.example.UserAddress.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("order")
    public void addOrder(@RequestBody Order order)
    {
        orderService.addOrder(order);
    }
    @PostMapping("order/{id}")
    public void addOrderById(@RequestBody Integer Id)
    {
        orderService.addOrderById(Id);
    }
    @GetMapping("order id")
    public List<Order> getAllOrderId(@PathVariable Integer id)
    {
        return orderService.getAllOrderId(id);
    }
}
