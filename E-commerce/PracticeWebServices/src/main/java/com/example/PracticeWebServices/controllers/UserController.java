package com.example.PracticeWebServices.controllers;

import com.example.PracticeWebServices.domain.User;
import com.example.PracticeWebServices.service.UserService;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(UserController.BASE_URL)
public class UserController {


    public static final String BASE_URL = "/users";
    private final UserService userService;

    public UserController(UserService UserService) {
        this.userService = UserService;
    }


    @GetMapping()
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }


    @GetMapping("/login")
    public User login(@RequestParam("userName") String userName, @RequestParam("passWord") String lastName) {
        User login = userService.login(userName, lastName);
        if(login==null){
            login=userService.login2(userName,lastName);
        }
        return login;

    }


    @GetMapping("/id/{id}")
    public User getUserById(@PathVariable Integer id) {
        return userService.findUserById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User saveUser(@RequestBody User User) {
        return userService.saveUser(User);
    }


}