package com.data.admin.ServiceImpl;

import com.data.admin.DTO.Request.OrderRequest;
import com.data.admin.Entity.ProductOrder;
import com.data.admin.Repository.OrderRepository;
import com.data.admin.Serivce.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void createOrder(OrderRequest orderRequest) {

//          get product details by product_id
//         then get user details by user_id
//        then save the order data in database
    }
}
