package com.example.PracticeWebServices.service;


import com.example.PracticeWebServices.domain.User;

import java.util.List;

public interface UserService {

    User findUserById(int id);
    List<User> findAllUsers();
    User login(String name, String password);
    User saveUser(User user);

    User login2(String userName, String lastName);
}
