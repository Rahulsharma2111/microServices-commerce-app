package com.data.product.DTO.Request;

import lombok.Data;

@Data
public class ProductRequest {

    private String image;
    private String product_name;
    private double price;
    private String brand;
    private int stock;
    private String details;
    private String category;
}
