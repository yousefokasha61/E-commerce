package com.example.PracticeWebServices.service;

import com.example.PracticeWebServices.domain.Admin;
import com.example.PracticeWebServices.domain.Customer;
import com.example.PracticeWebServices.domain.StoreOwner;
import com.example.PracticeWebServices.domain.User;
import com.example.PracticeWebServices.repositories.AdminRepository;
import com.example.PracticeWebServices.repositories.CustomerRepository;
import com.example.PracticeWebServices.repositories.StoreOwnerRepository;
import com.example.PracticeWebServices.repositories.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private final UserRepo userRepo;
    private final CustomerRepository customerRepository;
    private final AdminRepository adminRepository;
    private final StoreOwnerRepository storeOwnerRepository;
    public UserServiceImpl(UserRepo userRepo, CustomerRepository customerRepository, AdminRepository adminRepository, StoreOwnerRepository storeOwnerRepository) {
        this.userRepo = userRepo;
        this.customerRepository = customerRepository;
        this.adminRepository = adminRepository;
        this.storeOwnerRepository = storeOwnerRepository;
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
    public Customer saveCustomer(User user) {
        userRepo.save(user);
        Customer customer=new Customer();
        customer.setUser(user);
        customerRepository.save(customer);
        return customer;
    }

    @Override
    public StoreOwner saveStoreOwner(User user) {
        userRepo.save(user);
        StoreOwner storeOwner=new StoreOwner();
        storeOwner.setUser(user);
        storeOwnerRepository.save(storeOwner);
        return storeOwner;
    }

    @Override
    public Admin saveAdmin(User user) {
        userRepo.save(user);
        Admin admin=new Admin();
        admin.setUser(user);
        adminRepository.save(admin);
        return admin;
    }

    @Override
    public User login2(String email, String passWord) {
        return userRepo.login2(email,passWord);
    }
}
