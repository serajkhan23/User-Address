package com.example.UserAddress.controller;

import com.example.UserAddress.model.Order;
import com.example.UserAddress.model.Product;
import com.example.UserAddress.service.AddressService;
import com.example.UserAddress.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class ProductController {

    @Autowired
    ProductService productService;
    @PostMapping("products")
    public void addProducts(@RequestBody Product product)
    {
        productService.addProducts(product);
    }
    @PostMapping("product/{id}")
    public void addProductById(@RequestBody Integer Id)
    {
        productService.addProductById(Id);
    }
    @GetMapping("product id")
    public List<Product> getAllProductId(@PathVariable Integer id)
    {
        return productService.getAllProductId(id);
    }
}
