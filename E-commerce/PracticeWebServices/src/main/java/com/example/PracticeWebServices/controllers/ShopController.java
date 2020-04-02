package com.example.PracticeWebServices.controllers;


import com.example.PracticeWebServices.domain.Shop;
import com.example.PracticeWebServices.repositories.ShopRepository;
import com.example.PracticeWebServices.service.ShopService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(ShopController.BASE_URL)
public class ShopController {

    public static final String BASE_URL="/shops";

    private final ShopService shopService;


    public ShopController(ShopService shopService, UserController userController) {
        this.shopService = shopService;
    }


    @GetMapping()
    public List<Shop> getAllShops(){
        return shopService.findAllShops();
    }

    @GetMapping("/{id}")
    public Shop getShopById(@PathVariable Integer id){
        return shopService.findShopById(id);
    }

}
