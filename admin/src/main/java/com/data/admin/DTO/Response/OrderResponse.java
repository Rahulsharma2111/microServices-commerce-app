package com.data.admin.DTO.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponse {
    private Long product_id;
    private Long user_id;
    private Long quantity;
    private Double per_piece_rate;
    private Double total_amount;
    private String mobile_number;
    private String email;
    private String address;
    private String district;
    private int zipcode;
    private String username;
    private String status;

}