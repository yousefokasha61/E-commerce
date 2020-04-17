package com.example.PracticeWebServices.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Customer extends Item{

    @OneToOne
    @JoinColumn(name = "userId",referencedColumnName = "id")
    User user;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Integer customerId;

}
