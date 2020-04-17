package com.example.PracticeWebServices.repositories;

import com.example.PracticeWebServices.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {

        public Address findByUser_Id(Integer id);
}
