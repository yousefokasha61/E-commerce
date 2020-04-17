package com.example.PracticeWebServices.domain;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Address {

    @OneToOne
    @JoinColumn(name = "UserId",referencedColumnName = "id")
    User user;

    @Id
    @GeneratedValue
     Integer addressId;
     String address;
     String country;
     String zipCode;
     String city;


}
