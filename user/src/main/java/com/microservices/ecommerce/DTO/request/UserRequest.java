package com.microservices.ecommerce.DTO.request;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String email;
    private int age;
    private String houseNumber;
    private String street;
    private String address;
    private String district;
    private String state;
    private int zipcode;
}
