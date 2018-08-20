package com.services;

import com.model.Customer;

import java.util.List;

public interface CustomerService {

public Customer create(Customer customer);

public List<Customer> readAll();

public Customer update(Customer customer);

public void delete(Customer customer);

}
