package com.example.Order_Management_Rest_Api.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponseDTO {

private Integer id;
private String productName;
private int quantity;
private double price;
}
