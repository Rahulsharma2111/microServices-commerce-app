package com.data.admin.Serivce;

import com.data.admin.DTO.Request.OrderRequest;
import com.data.admin.Entity.ProductOrder;

import java.util.List;

public interface OrderService {
    ProductOrder createOrder(OrderRequest orderRequest);

    List<ProductOrder> getAllOrderHistory(Long userId);

    ProductOrder getOrderHistoryById(Long orderId);

    List<ProductOrder> getAllOrderHistoryForAdmin();

    void updateOrderStatus(Long orderId, String orderStatus);
}
