package com.example.PracticeWebServices.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Integer shopId;

    @NotNull(message = "please Enter Shop name !")
    String Shopname ;

}
