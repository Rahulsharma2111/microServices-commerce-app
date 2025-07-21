package com.data.admin.ServiceImpl;

import com.data.admin.DTO.Request.OrderRequest;
import com.data.admin.Entity.ProductOrder;
import com.data.admin.Repository.OrderRepository;
import com.data.admin.Serivce.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public ProductOrder createOrder(OrderRequest orderRequest) {
        ProductOrder newOrder=new ProductOrder();
        newOrder.setProduct_id(orderRequest.getProduct_id());
        newOrder.setUser_id(orderRequest.getUser_id());
//        newOrder.setUser_id(userId);
        newOrder.setQuantity(orderRequest.getQuantity());
        newOrder.setPer_piece_rate(orderRequest.getPer_piece_rate());
        newOrder.setTotal_amount(orderRequest.getTotal_amount());
        newOrder.setStatus("Process");
        newOrder.setMobile_number(orderRequest.getMobile_number());
        newOrder.setEmail(orderRequest.getEmail());
        newOrder.setAddress(orderRequest.getAddress());
        newOrder.setDistrict(orderRequest.getDistrict());
        newOrder.setZipcode(orderRequest.getZipcode());
        newOrder.setUsername(orderRequest.getUsername());

        return orderRepository.save(newOrder);

//          get product details by product_id
//         then get user details by user_id
//        then save the order data in database
    }

    @Override
    public List<ProductOrder> getAllOrderHistory(Long userId) {
        List<ProductOrder> orderHistoryList=orderRepository.findAllOrderHistory(userId);
        return orderHistoryList;
    }

    @Override
    public ProductOrder getOrderHistoryById(Long orderId) {
        return orderRepository.findOrderById(orderId);
    }

    @Override
    public List<ProductOrder> getAllOrderHistoryForAdmin() {
        return orderRepository.getAllUserOrderHistory();
    }

    @Override
    public void updateOrderStatus(Long orderId, String orderStatus) {
         orderRepository.updateOrderStatusByOrderId(orderId, orderStatus);
    }
}
