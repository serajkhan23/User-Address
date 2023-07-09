package com.example.UserAddress.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {

   // UserID : foreign key mapping
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String landmark;
    private String phoneNumber;
    private String zipcode;
    private String state;
    private Integer userId;

  //@JoinColumn(name = "fk_userId")
 // User user;

}
