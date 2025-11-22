package com.example.Order_Management_Rest_Api.service;

import com.example.Order_Management_Rest_Api.entity.Customer;
import com.example.Order_Management_Rest_Api.entity.OrderEntity;
import com.example.Order_Management_Rest_Api.repository.CustomerRepository;
import com.example.Order_Management_Rest_Api.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final CustomerRepository customerRepo;
    private final OrderRepository orderRepo;

    public OrderService(CustomerRepository customerRepo, OrderRepository orderRepo) {
        this.customerRepo = customerRepo;
        this.orderRepo = orderRepo;
    }

    public OrderEntity createOrder(Integer customerId, OrderEntity order){
    Customer customer = customerRepo.findById(customerId).orElse(null);

    if(customer == null){
        return null;
    }
    order.setCustomer(customer);
    return orderRepo.save(order);
    }

    public List<OrderEntity> getOrdersOfCustomer(Integer customerId){
        return orderRepo.findByCustomerId(customerId);
    }

    public OrderEntity updateOrder(Integer id,OrderEntity updated){
        OrderEntity old = orderRepo.findById(id).orElse(null);
        if(old==null){
            return null;
        }
        old.setQuantity(updated.getQuantity());
        old.setPrice(updated.getPrice());
        old.setProductName(updated.getProductName());

        return orderRepo.save(old);
    }

    public boolean deleteOrder(Integer id){
        if(!orderRepo.existsById(id)){
            return false;
        }
        orderRepo.deleteById(id);
        return true;
    }
}
