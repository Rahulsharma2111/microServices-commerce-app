package com.microservices.ecommerce.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductOrder {
    private Long id;
    private Long product_id;
    private Long user_id;
    private Long quantity;
    private Double per_piece_rate;
    private Double total_amount;
    private String status;
    private String mobile_number;
    private String email;
    private String address;
    private String district;
    private int zipcode;
    private String username;
    private Date created_at;
    private Date updated_at;
    private Date deleted_at;
}