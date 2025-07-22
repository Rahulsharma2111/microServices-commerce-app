package com.microservices.ecommerce.Component;

import com.microservices.ecommerce.entity.ProductOrder;
import com.microservices.ecommerce.service.OrderService;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class OrderServiceFallback implements OrderService {
    @Override
    public List<ProductOrder> getAllOrderHistoryByUserId(Long userId) {
        System.out.println("Feign fallback triggered!");
        return Collections.emptyList();
    }
}
