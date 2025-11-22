package com.example.Order_Management_Rest_Api.service;

import com.example.Order_Management_Rest_Api.entity.Customer;
import com.example.Order_Management_Rest_Api.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public List<Customer> getAll(){
    return customerRepository.findAll();
    }

    public Customer getById(Integer id){
        return customerRepository.findById(id).orElse(null);
    }

    public Customer update(Integer id,Customer customer){
        Customer old =customerRepository.findById(id).orElse(null);
        if(old==null){
            return null;
        }

        old.setName(customer.getName());
        old.setEmail(customer.getEmail());

        return customerRepository.save(old);
    }

    public boolean delete(Integer id){
        if(!customerRepository.existsById(id)){
            return false;
        }
        customerRepository.deleteById(id);
        return true;

    }
}
