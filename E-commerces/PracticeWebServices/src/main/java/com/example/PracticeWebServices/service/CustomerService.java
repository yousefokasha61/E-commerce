package com.example.PracticeWebServices.service;

import com.example.PracticeWebServices.domain.Customer;
import com.example.PracticeWebServices.domain.User;


import java.util.List;

public interface CustomerService {

    public Customer findCustomerById(Integer id);
    public Customer findByUser_Id(Integer id);

    public List<Customer> findAllCustomers();
    Customer saveCustomer(User user);
}
