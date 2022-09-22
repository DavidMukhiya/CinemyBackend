package com.example.cinemyspring.Service;

import com.example.cinemyspring.Entity.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> getAllMovies();

    Movie getMovieByID(int id);

    Movie addMovie(Movie movie);

    Movie updateMovie(Movie movie);

    String deleteMovie(int id);

}
