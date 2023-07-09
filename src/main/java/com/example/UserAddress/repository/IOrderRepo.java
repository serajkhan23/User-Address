package com.example.UserAddress.repository;

import com.example.UserAddress.model.Address;
import com.example.UserAddress.model.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IOrderRepo extends CrudRepository<Order,Long> {

}
