package com.example.PracticeWebServices.controllers;



import com.example.PracticeWebServices.domain.Address;
import com.example.PracticeWebServices.service.AddressService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(AddressController.BASE_URL)
public class AddressController {

    public static final String BASE_URL="/address";

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("fk/{id}")
    public Address getAddressByUserId(@PathVariable Integer id){
        return addressService.findByUser_Id(id);
    }

    @GetMapping("/{id}")
    public Address getAddressById(@PathVariable Integer id){
        return addressService.findAddressById(id);
    }

    @GetMapping()
    public List<Address> getAllAddresses(){
        return addressService.findAllAddresses();
    }
}
