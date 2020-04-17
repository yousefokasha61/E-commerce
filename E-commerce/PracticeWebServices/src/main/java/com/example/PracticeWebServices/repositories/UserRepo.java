package com.example.PracticeWebServices.repositories;


import com.example.PracticeWebServices.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepo extends JpaRepository<User,Integer> {


    @Query("SELECT u from User u where u.userName = ?1 and u.passWord = ?2")
    public User login(String userName, String passWord);
    @Query("SELECT u from User u where u.email = ?1 and u.passWord = ?2")
    public User login2(String userName, String passWord);
}
