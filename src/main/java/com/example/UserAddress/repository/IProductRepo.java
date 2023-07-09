package com.example.UserAddress.repository;


import com.example.UserAddress.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IProductRepo extends CrudRepository<Product,Long> {

}
