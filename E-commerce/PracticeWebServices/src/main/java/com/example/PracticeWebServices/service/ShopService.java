package com.example.PracticeWebServices.service;

import com.example.PracticeWebServices.domain.Shop;


import java.util.List;

public interface ShopService {

   // public Shop findByStoreOwner_Id(Integer id);

     Shop findShopById(Integer id);

     List<Shop> findAllShops();

}
