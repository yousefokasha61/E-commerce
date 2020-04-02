package com.example.PracticeWebServices.controllers;


import com.example.PracticeWebServices.domain.Admin;
import com.example.PracticeWebServices.domain.Customer;
import com.example.PracticeWebServices.domain.StoreOwner;

import com.example.PracticeWebServices.domain.User;
import com.example.PracticeWebServices.service.StoreOwnerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(StoreOwnerController.BASE_URL)
public class StoreOwnerController {

    public static final String BASE_URL = "/users/owners";


    private final UserController userController;
    private final StoreOwnerService storeOwnerService;

    public StoreOwnerController(UserController userController, StoreOwnerService storeOwnerService) {
        this.userController = userController;
        this.storeOwnerService = storeOwnerService;
    }

    @GetMapping
    public List<StoreOwner> getAllStoreOwners(){
        return storeOwnerService.findAllStoreOwners();
    }

    @GetMapping("/{id}")
    public StoreOwner getStoreOwnerById(@PathVariable Integer id){
        return storeOwnerService.findStoreOwnerById(id);
    }

    @GetMapping("/fk/{id}")
    public StoreOwner getStoreOwnerByUserId(@PathVariable Integer id){
        return storeOwnerService.findByUser_Id(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public StoreOwner saveCustomer(@RequestBody User user) {
        User savedUser = userController.saveUser(user);
        return storeOwnerService.saveStoreOwner(savedUser);
    }




    @GetMapping("/login")
    public StoreOwner login(@RequestParam("userName") String userName, @RequestParam("passWord") String password) {
        User user = userController.login(userName, password);
        if(user!=null){
            System.out.println(user.getEmail()+" "+user.getUserName()+" "+user.getPassWord()+" "+user.getId());
            return storeOwnerService.findByUser_Id(user.getId());
        }
        return null;
    }
}
