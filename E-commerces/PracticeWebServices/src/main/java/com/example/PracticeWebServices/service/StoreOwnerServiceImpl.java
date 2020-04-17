package com.example.PracticeWebServices.service;

import com.example.PracticeWebServices.domain.StoreOwner;
import com.example.PracticeWebServices.domain.User;
import com.example.PracticeWebServices.repositories.StoreOwnerRepository;
import com.example.PracticeWebServices.repositories.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreOwnerServiceImpl implements StoreOwnerService {

    private final StoreOwnerRepository storeOwnerRepository;
    private final UserRepo userRepo;

    public StoreOwnerServiceImpl(StoreOwnerRepository storeOwnerRepository, UserRepo userRepo) {
        this.storeOwnerRepository = storeOwnerRepository;
        this.userRepo = userRepo;
    }

    @Override
    public StoreOwner findStoreOwnerById(Integer id){
        return storeOwnerRepository.findById(id).get();
    }

    @Override
    public StoreOwner findByUser_Id(Integer foreignKey){
       return storeOwnerRepository.findByUser_Id(foreignKey);
    }

    @Override
    public List<StoreOwner> findAllStoreOwners() {
        return storeOwnerRepository.findAll();
    }


    @Override
    public StoreOwner saveStoreOwner(User savedUser) {
        StoreOwner storeOwner=new StoreOwner();
        storeOwner.setUser(savedUser);
        storeOwnerRepository.save(storeOwner);
        return storeOwner;
    }
}
