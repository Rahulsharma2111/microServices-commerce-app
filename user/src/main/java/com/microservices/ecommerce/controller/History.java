package com.microservices.ecommerce.controller;

import com.microservices.ecommerce.DTO.response.CustomResponse;
import com.microservices.ecommerce.entity.ProductOrder;
import com.microservices.ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/history")
@CrossOrigin("*")
public class History {

    @Autowired
    private OrderService orderService;

    @GetMapping("/")
    public ResponseEntity<?> getAllOrderHistory(@RequestParam("userId") Long userId) {// HttpServletRequest request
        try {
            List<ProductOrder> productOrder = orderService.getAllOrderHistoryByUserId(userId);

            return CustomResponse.ok(productOrder);
        } catch (Exception e) {
            return CustomResponse.conflict("Something went wrong");
        }
    }
}