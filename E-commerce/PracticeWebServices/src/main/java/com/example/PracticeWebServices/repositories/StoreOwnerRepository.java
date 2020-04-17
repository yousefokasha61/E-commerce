package com.example.PracticeWebServices.repositories;

import com.example.PracticeWebServices.domain.Customer;
import com.example.PracticeWebServices.domain.StoreOwner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreOwnerRepository extends JpaRepository<StoreOwner,Integer> {

       public StoreOwner findByUser_Id(Integer id);


}
