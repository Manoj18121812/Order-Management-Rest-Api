package com.example.Order_Management_Rest_Api.repository;

import com.example.Order_Management_Rest_Api.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<OrderEntity,Integer> {

    List<OrderEntity> findByCustomerId(Integer id);
}
