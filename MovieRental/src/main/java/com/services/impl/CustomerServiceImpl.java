package com.services.impl;

import com.model.Customer;
import com.repositories.CustomerRepository;
import com.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> readAll()
    {
        List<Customer> all = new ArrayList<Customer>();
        Iterable<Customer> cust = customerRepository.findAll();
        for (Customer c : cust){
            all.add(c);
        }
        return all;
    }

    @Override
    public Customer create(Customer entity)
    {
        return customerRepository.save(entity);
    }

    @Override
    public Customer update(Customer entity)
    {
        return customerRepository.save(entity);
    }

    @Override
    public void delete(Customer entity)
    {
        customerRepository.delete(entity);
    }

}
