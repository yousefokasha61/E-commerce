package com.example.PracticeWebServices.service;

import com.example.PracticeWebServices.domain.Admin;
import com.example.PracticeWebServices.domain.User;
import com.example.PracticeWebServices.repositories.AdminRepository;
import com.example.PracticeWebServices.repositories.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    private final AdminRepository adminRepository;

    public AdminServiceImpl(UserRepo userRepo, AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public Admin findByUser_Id(Integer id) {
        return adminRepository.findByUser_Id(id);
    }

    @Override
    public Admin findAdminById(Integer id) {

        return adminRepository.findById(id).get();
    }

    @Override
    public List<Admin> findAllAdmin() {
        return adminRepository.findAll();
    }


    @Override
    public Admin saveAdmin(User savedUser) {
        Admin admin= new Admin();
        admin.setUser(savedUser);
        adminRepository.save(admin);
        return admin;
    }
}
