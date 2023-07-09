package com.example.UserAddress.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Order {

    //userID:integer (foreign key mapping)
    //productID:integer(foreign key mapping)
    //addressID:integer(foreign key mapping)

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Integer userId;
    private Integer productId;
    private Integer addressId;
    private Integer productQuantity;

    @JoinColumn(name = "fk_userId")
    User user;
    @JoinColumn(name = "fk_productId")
    Product product;

    @JoinColumn(name = "fk_addressId")
    Address address;
}
