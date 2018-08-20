package com.services.impl;

import com.model.Movie;
import com.repositories.MovieRepository;
import com.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MovieServiceImpl implements MovieService{

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie create(Movie movie)
    {
        return movieRepository.save(movie);
    }

    @Override
    public Movie update(Movie movie)
    {
        return movieRepository.save(movie);
    }

    @Override
    public void delete(Movie movie)
    {
        movieRepository.delete(movie);
    }

    @Override
    public List<Movie> getMovie(String name)
    {
        return movieRepository.findByName(name);
    }


}
