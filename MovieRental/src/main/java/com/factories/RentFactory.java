package com.factories;

import com.model.Customer;
import com.model.Movie;
import com.model.Rent;

public class RentFactory {

    public static Rent buildRent(String id, String rentDate, String returnDate, double paymentAmountDue, Customer customer, Boolean available, Movie movie)
    {
        Rent rent=new Rent.Builder()
                .id(id)
                .rentDate(rentDate)
                .returnDate(returnDate)
                .paymentAmountDue(paymentAmountDue)
                .customer(customer)
                .available(available)
                .movie(movie)
                .build();
        return rent;
    }

}
