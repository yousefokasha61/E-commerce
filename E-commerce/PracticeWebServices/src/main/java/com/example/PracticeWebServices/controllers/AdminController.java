package com.example.PracticeWebServices.controllers;

import com.example.PracticeWebServices.domain.Admin;
import com.example.PracticeWebServices.domain.StoreOwner;
import com.example.PracticeWebServices.domain.User;
import com.example.PracticeWebServices.service.AdminService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(AdminController.BASE_URL)
public class AdminController {

    public static final String BASE_URL="/users/admins";

    private final UserController userController;
    private final AdminService adminService;

    public AdminController(UserController userController, AdminService adminService) {
        this.userController = userController;
        this.adminService = adminService;
    }

    @GetMapping("/{id}")
    public Admin getAdminById(@PathVariable Integer id){
        return adminService.findAdminById(id);
    }
    @GetMapping
    public List<Admin> getAllAdmins(){
        return adminService.findAllAdmin();
    }

    @GetMapping("/fk/{id}")
    public Admin getAdminByForiegnKey(@PathVariable Integer id){
        return adminService.findByUser_Id(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Admin saveAdmin(@RequestBody User user) {
        User savedUser = userController.saveUser(user);
        return adminService.saveAdmin(savedUser);
    }





    @GetMapping("/login")
    public Admin login(@RequestParam("userName") String userName, @RequestParam("passWord") String password) {
        User user = userController.login(userName, password);
        if(user!=null){
            System.out.println(user.getEmail()+" "+user.getUserName()+" "+user.getPassWord()+" "+user.getId());
            return adminService.findByUser_Id(user.getId());
        }
        return null;
    }
}
