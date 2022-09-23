package com.example.cinemyspring.Controller;

import com.example.cinemyspring.Entity.Movie;
import com.example.cinemyspring.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class MovieController {
    @Autowired
    MovieService movieService;
    @GetMapping("/movies")
    public List<Movie> getAllMovies(){
        return this.movieService.getAllMovie();
    }

    @GetMapping("/movies/{movieID}")
    public Movie getMovieByID(@PathVariable String movieID){
        return this.movieService.getMovieByID(Integer.parseInt(movieID));
    }

    @PostMapping("/movies")
    public Movie addMovie(@RequestBody Movie movie){
        return this.movieService.addMovie(movie);
    }

    @PutMapping("/movies")
    public Movie updateMovie(@RequestBody Movie movie){
        return this.movieService.updateMovie(movie);
    }

    @DeleteMapping("/movies/{movieID}")
    public String deleteMovieByID(@PathVariable String movieID){
        return this.movieService.deleteMovie(Integer.parseInt(movieID));
    }
}

