package com.example.Order_Management_Rest_Api.repository;

import com.example.Order_Management_Rest_Api.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
