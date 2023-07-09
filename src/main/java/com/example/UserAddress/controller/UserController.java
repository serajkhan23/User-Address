package com.example.UserAddress.controller;

import com.example.UserAddress.model.Product;
import com.example.UserAddress.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("users")
    public void addUsers(@RequestBody User user)
    {
        userService.addUsers(user);
    }
    @PostMapping("user/{id}")
    public void addUserById(@RequestBody Integer Id)
    {
        userService.addUserById(Id);
    }
    @GetMapping("user id")
    public List<User> getAllUserId(@PathVariable Integer id)
    {
        return userService.getAllUserId(id);
    }
}
