package com.example.PracticeWebServices.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Integer shopId;



}
