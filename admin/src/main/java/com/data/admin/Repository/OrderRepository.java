package com.data.admin.Repository;

import com.data.admin.Entity.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<ProductOrder,Long> {



}
