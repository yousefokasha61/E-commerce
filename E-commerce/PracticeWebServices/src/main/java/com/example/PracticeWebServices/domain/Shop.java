package com.example.PracticeWebServices.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Integer shopId;
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "storeOwnerId",referencedColumnName = "storeOwnerId")
//    StoreOwner storeOwner;
}
