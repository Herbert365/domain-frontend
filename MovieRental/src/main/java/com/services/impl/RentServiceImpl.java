package com.services.impl;

import com.model.Rent;
import com.repositories.RentRepository;
import com.services.RentService;
import org.springframework.beans.factory.annotation.Autowired;

public class RentServiceImpl implements RentService{

    @Autowired
    private RentRepository rentRepository;

    @Override
    public Rent create(Rent rent)
    {
        return rentRepository.save(rent);
    }

    @Override
    public Rent update(Rent rent)
    {
        return rentRepository.save(rent);
    }

    @Override
    public void delete(Rent rent)
    {
        rentRepository.delete(rent);
    }

}
