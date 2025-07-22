package com.microservices.ecommerce.service;

import com.microservices.ecommerce.Component.OrderServiceFallback;
import com.microservices.ecommerce.entity.ProductOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "ADMIN", fallback = OrderServiceFallback.class)
public interface OrderService {
    @GetMapping("/order/history")
    List<ProductOrder> getAllOrderHistoryByUserId(@RequestParam("userId") Long userId);
}
