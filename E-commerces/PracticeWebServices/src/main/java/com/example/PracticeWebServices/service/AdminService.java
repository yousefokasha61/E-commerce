package com.example.PracticeWebServices.service;


import com.example.PracticeWebServices.domain.Admin;
import com.example.PracticeWebServices.domain.Customer;
import com.example.PracticeWebServices.domain.User;

import java.util.List;

public interface AdminService {

    public Admin findByUser_Id(Integer id);
    public Admin findAdminById(Integer id);

    public List<Admin> findAllAdmin();
    Admin saveAdmin(User savedUser);
}
