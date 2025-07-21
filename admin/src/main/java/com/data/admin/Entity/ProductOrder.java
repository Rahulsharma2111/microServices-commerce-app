package com.data.admin.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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

    @CreationTimestamp
    private Date created_at;
    @UpdateTimestamp
    private Date updated_at;
    private Date deleted_at;
}
