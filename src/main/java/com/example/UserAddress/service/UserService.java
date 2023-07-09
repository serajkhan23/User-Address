package com.example.UserAddress.service;

import com.example.UserAddress.repository.IUserRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {
    @Autowired
    IUserRepo iUserRepo;
    public void addUsers(User user) {
        iUserRepo.save(user);

    }

    public void addUserById(Integer id) {
    }

    public List<User> getAllUserId(Integer id) {

        return iUserRepo.findAllUser(id);
    }
}
