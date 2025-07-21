package com.data.admin.Repository;

import com.data.admin.Entity.ProductOrder;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<ProductOrder,Long> {


    @Query(value = "Select * from product_order where user_id=:userId",nativeQuery = true)
    List<ProductOrder> findAllOrderHistory(@Param("userId") Long userId);

    @Query(value = "Select * from product_order where id=:orderId",nativeQuery = true)
    ProductOrder findOrderById(@Param("orderId") Long orderId);

    @Query(value = "Select * from product_order order by updated_at desc",nativeQuery = true)
    List<ProductOrder> getAllUserOrderHistory();

    @Transactional
    @Modifying
    @Query(value = "UPDATE product_order SET status=:orderStatus where id=:orderId", nativeQuery = true)
    void updateOrderStatusByOrderId(@Param("orderId") Long orderId,@Param("orderStatus") String orderStatus);
}
