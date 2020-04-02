package com.example.PracticeWebServices.service;


import com.example.PracticeWebServices.domain.Customer;
import com.example.PracticeWebServices.domain.StoreOwner;
import com.example.PracticeWebServices.domain.User;

import java.util.List;

public interface StoreOwnerService {
    public StoreOwner findStoreOwnerById(Integer id);

    public StoreOwner findByUser_Id(Integer id);

    public List<StoreOwner> findAllStoreOwners();
    StoreOwner saveStoreOwner(User savedUser);
}
