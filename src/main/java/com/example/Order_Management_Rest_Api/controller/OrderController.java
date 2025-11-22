package com.example.Order_Management_Rest_Api.controller;

import com.example.Order_Management_Rest_Api.entity.OrderEntity;
import com.example.Order_Management_Rest_Api.service.CustomerService;
import com.example.Order_Management_Rest_Api.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service){
        this.service= service;
    }

    @PostMapping("/customer/{customerId}")
    public OrderEntity createOrder(@PathVariable Integer customerId,@RequestBody OrderEntity order){
        return service.createOrder(customerId,order);
    }

    @GetMapping("/customer/{customerId}")
    public List<OrderEntity> getOrderByCustomer(@PathVariable Integer customerId){
        return service.getOrdersOfCustomer(customerId);
    }

    @PutMapping("/{id}")
    public OrderEntity update(@PathVariable Integer id,@RequestBody OrderEntity order){
    return service.updateOrder(id,order);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        return service.deleteOrder(id) ? "Order Deleted" : "Order Not Found";
    }
}
