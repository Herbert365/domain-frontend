package com.repositories;

import com.model.Movie;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface MovieRepository extends CrudRepository<Movie, String>{

    public List<Movie> findByName(String name);
}
