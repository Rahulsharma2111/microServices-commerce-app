package com.data.admin.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Entity
@Table(name = "ProductOrder")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long product_id;
    private Long price;
    private String mobile_number;
    private String email;
    private String address;
    private String district;
    private int zipcode;
    private String username;
    private Long user_id;

    @CreatedDate
    private Date created_at;
    @LastModifiedDate
    private Date updated_at;
    private Date deleted_at;
}
