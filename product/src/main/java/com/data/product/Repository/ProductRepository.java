package com.data.product.Repository;

import com.data.product.Entity.Product;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    @Query(value = "SELECT * FROM products WHERE id = :productId", nativeQuery = true)
    Product findByProductId(@Param("productId") Long productId);

    @Transactional
    @Modifying
    @Query(value = "Update product delete_at=:date Where id=:productId", nativeQuery = true)
    void deleteProductById(@Param("productId") Long productId,
                           @Param("date") Date date);

    @Query(value = "SELECT * FROM products WHERE delete_at is not null", nativeQuery = true)
    List<Product> findAllProduct();
}
