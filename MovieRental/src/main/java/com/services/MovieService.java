package com.services;

import com.model.Movie;

import java.util.List;

public interface MovieService {

    public List<Movie> getMovie(String name);

    public Movie create(Movie movie);

    public Movie update(Movie movie);

    public void delete(Movie movie);


}
