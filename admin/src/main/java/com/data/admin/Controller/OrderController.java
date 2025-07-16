package com.data.admin.Controller;

import com.data.admin.DTO.Request.OrderRequest;
import com.data.admin.Serivce.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@CrossOrigin("*")
public class OrderController {
    @Autowired
    private OrderService orderService;

    public void createOrder(@RequestBody OrderRequest orderRequest){

        orderService.createOrder(orderRequest);
    }

    // product upload
    // product edit and delete
    // get user details
    // get order history for every user via user-service
    //
}
