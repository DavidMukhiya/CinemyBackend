package com.example.cinemyspring.Service;

import com.example.cinemyspring.Entity.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> getAllMovie();

    Movie getMovieByID(int ID);

    Movie addMovie(Movie movie);

    Movie updateMovie(Movie movie);

    String deleteMovie(int ID);

}
