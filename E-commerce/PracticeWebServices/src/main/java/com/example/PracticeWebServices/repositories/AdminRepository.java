package com.example.PracticeWebServices.repositories;

import com.example.PracticeWebServices.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Integer> {

    public Admin findByUser_Id(Integer id);

}
