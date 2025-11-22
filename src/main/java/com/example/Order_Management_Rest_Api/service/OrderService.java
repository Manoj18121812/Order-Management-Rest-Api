package com.example.Order_Management_Rest_Api.service;

import com.example.Order_Management_Rest_Api.repository.CustomerRepository;
import com.example.Order_Management_Rest_Api.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final CustomerRepository customerRepo;
    private final OrderRepository orderRepo;

    public OrderService(CustomerRepository customerRepo, OrderRepository orderRepo) {
        this.customerRepo = customerRepo;
        this.orderRepo = orderRepo;
    }


}
