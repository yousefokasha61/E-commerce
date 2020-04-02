package com.example.PracticeWebServices.service;

import com.example.PracticeWebServices.domain.Shop;
import com.example.PracticeWebServices.repositories.ShopRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

   private final ShopRepository shopRepository;

    public ShopServiceImpl(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

//    @Override
//    public Shop findByStoreOwner_Id(Integer id) {
//        return shopRepository.findByStoreOwner_Id(id);
//    }

    @Override
    public Shop findShopById(Integer id) {
        return shopRepository.findById(id).get();
    }

    @Override
    public List<Shop> findAllShops() {
        return shopRepository.findAll();
    }
}
