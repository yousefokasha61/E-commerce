package com.example.PracticeWebServices.repositories;

import com.example.PracticeWebServices.domain.Customer;
import com.example.PracticeWebServices.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

public Customer findByUser_Id(Integer id);


}
