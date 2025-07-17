package com.microservices.ecommerce.controller;

import com.microservices.ecommerce.DTO.request.PasswordRequest;
import com.microservices.ecommerce.DTO.request.UserRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserProfile {

    //update user profile
    @PutMapping("/update/{user_id}")
    public void updateUserProfile(@PathVariable("user_id") Long id, @RequestBody UserRequest userRequest){

    }

    @PutMapping("/change-password")
    public void updateUserPassword(@RequestBody PasswordRequest passwordRequest){

    }
}
