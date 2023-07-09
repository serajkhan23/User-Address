package com.example.UserAddress.service;

import com.example.UserAddress.model.Address;

import com.example.UserAddress.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    IAddressRepo iAddressRepo;
    public void addAddress(Address address) {
        iAddressRepo.save(address);
    }

    public void OrderByAddressId(Integer id) {
    }
}
