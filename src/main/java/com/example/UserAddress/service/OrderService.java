package com.example.UserAddress.service;

import com.example.UserAddress.model.Order;
import com.example.UserAddress.repository.IOrderRepo;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

public class OrderService {

    @Autowired
    IOrderRepo iOrderRepo;
    public void addOrder(Order order) {
        iOrderRepo.save(order);
    }

    public void addOrderById(Integer id) {
        //iOrderRepo.save(id);
    }

    public List<Order> getAllOrderId(Integer id) {
        return iOrderRepo.findAllOrder(id);
    }
}
