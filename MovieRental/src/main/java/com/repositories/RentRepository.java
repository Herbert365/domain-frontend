package com.repositories;

import com.model.Rent;
import org.springframework.data.repository.CrudRepository;

public interface RentRepository extends CrudRepository<Rent,String> {
}
