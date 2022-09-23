package com.example.cinemyspring.Service;


import com.example.cinemyspring.Dao.MovieDao;
import com.example.cinemyspring.Entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieDao movieDao;

    @Override
    public List<Movie> getAllMovie() {
        return this.movieDao.findAll();
    }

    @Override
    public Movie getMovieByID(int movieID) {
        Optional<Movie> mov = this.movieDao.findById(movieID);
        Movie movie = null;
        if(mov.isPresent()){
            movie = mov.get();
        }else{
            throw new RuntimeException("Movie is not found");
        }

        return movie;
    }

    @Override
    public Movie addMovie(Movie movie) {
        return this.movieDao.save(movie);
    }

    @Override
    public Movie updateMovie(Movie movie) {
        return this.movieDao.save(movie);
    }

    @Override
    public String deleteMovie(int movieID) {
        this.movieDao.deleteById(movieID);
        return "Movie with ID: "+movieID+ " is deleted Successfully.";
    }
}
