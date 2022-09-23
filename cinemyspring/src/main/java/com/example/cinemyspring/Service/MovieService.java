package com.example.cinemyspring.Service;

import com.example.cinemyspring.Entity.Movie;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MovieService {
    List<Movie> getAllMovie();

    //Movie getMovieByID(int ID);
    ResponseEntity<Movie> getMovieByID(int movieID);

    Movie addMovie(Movie movie);

    //Movie updateMovie(Movie movie);
    ResponseEntity<Movie> updateMovie(int id, Movie movie);

    String deleteMovie(int ID);

}
