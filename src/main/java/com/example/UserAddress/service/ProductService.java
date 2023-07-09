package com.example.UserAddress.service;

import com.example.UserAddress.model.Product;
import com.example.UserAddress.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService {
    @Autowired
    IProductRepo iProductRepo;
    public void addProducts(Product product) {
        iProductRepo.save(product);
    }

    public void addProductById(Integer id) {
    }

    public List<Product> getAllProductId(Integer id) {
        return iProductRepo.findAllProduct(id);

    }
}
