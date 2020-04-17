package com.example.PracticeWebServices.service;

import com.example.PracticeWebServices.domain.Address;

import com.example.PracticeWebServices.repositories.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    private final AddressRepository addressRepository;

    @Override
    public Address findByUser_Id(Integer id) {
        return addressRepository.findByUser_Id(id);
    }

    @Override
    public Address findAddressById(Integer id) {
        return addressRepository.findById(id).get();
    }

    @Override
    public List<Address> findAllAddresses() {
        return addressRepository.findAll();
    }
}
