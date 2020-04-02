package com.example.PracticeWebServices.service;

import com.example.PracticeWebServices.domain.User;
import com.example.PracticeWebServices.repositories.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User findUserById(int id) {
        return userRepo.findById(id).get();
    }

    @Override
    public List<User> findAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User login(String name, String password) {
        return userRepo.login(name, password);
    }

    @Override
    public User saveUser(User User) {
        return userRepo.save(User);
    }

    @Override
    public User login2(String email, String passWord) {
        return userRepo.login2(email,passWord);
    }
}
