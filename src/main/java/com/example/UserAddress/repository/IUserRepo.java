package com.example.UserAddress.repository;


import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;



public interface IUserRepo extends CrudRepository<User,Long> {

}
