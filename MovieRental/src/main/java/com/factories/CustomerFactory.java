package com.factories;

import com.model.Customer;

public class CustomerFactory {

    public static Customer buildCustomer(String id, String name, String surname, String username, String password)
    {
        Customer customer = new Customer.Builder()
                .id(id)
                .name(name)
                .surname(surname)
                .userName(username)
                .password(password)
                .build();
        return customer;
    }
}
