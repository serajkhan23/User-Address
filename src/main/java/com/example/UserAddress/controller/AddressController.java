package com.example.UserAddress.controller;

import com.example.UserAddress.model.Address;
import com.example.UserAddress.model.Order;
import com.example.UserAddress.model.Product;
import com.example.UserAddress.service.AddressService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;


    @PostMapping("address")
    public void addAddress(@RequestBody Address address)
    {
        addressService.addAddress(address);
    }
    @PostMapping("address/{Id}")
    public void addOrderByAddressId(@RequestBody Integer Id )
    {
        addressService.OrderByAddressId(Id);
    }

}
