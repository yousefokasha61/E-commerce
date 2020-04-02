package com.example.PracticeWebServices.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class StoreOwner {

    @OneToOne
    @JoinColumn(name = "userId",referencedColumnName = "id")
    User user;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Integer storeOwnerId;

}
