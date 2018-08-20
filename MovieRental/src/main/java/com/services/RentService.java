package com.services;

import com.model.Rent;

public interface RentService {

    public Rent create(Rent rent);

    public Rent update(Rent rent);

    public void delete(Rent rent);

}
