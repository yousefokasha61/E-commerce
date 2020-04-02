package com.example.PracticeWebServices.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class CCinfo {


    @OneToOne
    @JoinColumn(referencedColumnName = "id",name = "userId")
    User user;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Integer infoId;
     String cardHolderName;
     String cardNumber;
     String securityCode;
     Date expirationDate;
     String zipCode;
}
