package com.example.PracticeWebServices.service;

import com.example.PracticeWebServices.domain.Customer;
import com.example.PracticeWebServices.domain.User;
import com.example.PracticeWebServices.repositories.CustomerRepository;
import com.example.PracticeWebServices.repositories.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private  final UserRepo userRepo;

    public CustomerServiceImpl(CustomerRepository customerRepository, UserRepo userRepo) {
        this.customerRepository = customerRepository;
        this.userRepo = userRepo;
    }

    @Override
    public Customer findByUser_Id(Integer id) {
        return customerRepository.findByUser_Id(id);
    }

    @Override
    public Customer findCustomerById(Integer id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(User user) {
        Customer customer=new Customer();
        customer.setUser(user);
        customerRepository.save(customer);
        return customer;
    }
}
