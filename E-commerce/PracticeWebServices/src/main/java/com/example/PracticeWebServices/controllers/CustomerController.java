package com.example.PracticeWebServices.controllers;


import com.example.PracticeWebServices.domain.Admin;
import com.example.PracticeWebServices.domain.Customer;
import com.example.PracticeWebServices.domain.StoreOwner;
import com.example.PracticeWebServices.domain.User;
import com.example.PracticeWebServices.service.CustomerService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(CustomerController.BASE_URL)
public class CustomerController {

    public static final String BASE_URL = "/users/customers";

    private final UserController userController;
    private final CustomerService customerService;

    public CustomerController(UserController userController, CustomerService customerService) {
        this.userController = userController;
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getAllCustomers(){
        return customerService.findAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Integer id){
        return customerService.findCustomerById(id);
    }

    @GetMapping("/fk/{id}")
    public Customer getCustomerByUserId(@PathVariable Integer id){
        return  customerService.findByUser_Id(id);
    }



    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer saveCustomer(@RequestBody User user) {
        User savedUser = userController.saveUser(user);
        return customerService.saveCustomer(savedUser);
    }






    @GetMapping("/login")
    public Customer login(@RequestParam("userName") String userName, @RequestParam("passWord") String password) {
        User user = userController.login(userName, password);
        if(user!=null){
            return customerService.findByUser_Id(user.getId());
        }
        return null;
    }
}
