package com.example.PracticeWebServices.controllers;


import com.example.PracticeWebServices.repositories.ShopRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ShopController.BASE_URL)
public class ShopController {

    public static final String BASE_URL="/shops";

    private final ShopRepository shopRepository;

    public ShopController(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }


}
