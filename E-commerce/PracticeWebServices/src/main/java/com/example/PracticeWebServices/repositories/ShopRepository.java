package com.example.PracticeWebServices.repositories;

import com.example.PracticeWebServices.domain.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop,Integer> {


   // public Shop findByStoreOwner_Id(Integer id);
}
