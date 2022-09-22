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
    public List<Movie> getAllMovies() {
        return this.movieDao.findAll();
    }

    @Override
    public Movie getMovieByID(int id) {
        Optional<Movie> m = this.movieDao.findById(id);
        Movie movie = null;
        if(m.isPresent()){
            movie = m.get();
        }else {
            throw new RuntimeException("Movie not found for id :: " + id);
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
    public String deleteMovie(int id) {
        Optional<Movie> m = this.movieDao.findById(id);
        Movie movie = null;
        if(m.isPresent()){
            movie = m.get();
            this.movieDao.delete(movie);
        }else {
            throw new RuntimeException("Movie not found for id :: " + id);
        }
        return "Delete Successful";
    }
}
