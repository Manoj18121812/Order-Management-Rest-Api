package com.example.Order_Management_Rest_Api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String productName;
    private int quantity;
    private double price;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;
}
