package com.example.Order_Management_Rest_Api.controller;


import com.example.Order_Management_Rest_Api.entity.Customer;
import com.example.Order_Management_Rest_Api.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service){
        this.service= service;
    }

    @PostMapping
    public Customer create(@RequestBody Customer customer){
        return service.addCustomer(customer);
    }

    @GetMapping
    public List<Customer> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Customer getById(@PathVariable Integer id){
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Customer update(@PathVariable Integer id, @RequestBody Customer customer){
    return service.update(id,customer);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        return service.delete(id) ? "customer deleted" : "customer not found";
    }
}
