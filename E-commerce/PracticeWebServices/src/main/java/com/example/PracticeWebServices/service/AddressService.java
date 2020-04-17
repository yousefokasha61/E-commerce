package com.example.PracticeWebServices.service;


import com.example.PracticeWebServices.domain.Address;

import java.util.List;

public interface AddressService {

    public Address findByUser_Id(Integer id);

    public Address findAddressById(Integer id);

    public List<Address> findAllAddresses();
}

