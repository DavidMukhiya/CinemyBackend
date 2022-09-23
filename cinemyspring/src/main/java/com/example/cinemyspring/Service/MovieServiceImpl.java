package com.example.cinemyspring.Service;


import com.example.cinemyspring.Dao.MovieDao;
import com.example.cinemyspring.Entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Movie> getMovieByID(int movieID) {
        Movie movie = movieDao.findById(movieID).orElseThrow(()-> new RuntimeException("Employee not exist with id:"+ movieID));
        return ResponseEntity.ok(movie);
    }

//    @Override
//    public Movie getMovieByID(int movieID) {
//        Optional<Movie> mov = this.movieDao.findById(movieID);
//        Movie movie = null;
//        if(mov.isPresent()){
//            movie = mov.get();
//        }else{
//            throw new RuntimeException("Movie is not found");
//        }
//
//        return movie;
//    }

    @Override
    public Movie addMovie(Movie movie) {
        return this.movieDao.save(movie);
    }

    @Override
    public ResponseEntity<Movie> updateMovie(int movieID, Movie movie) {
        Movie updateMovie = movieDao.findById(movieID).orElseThrow(()->new RuntimeException("Employee not exist with id:"+ movieID));
        updateMovie.setId(movie.getId());
        updateMovie.setName(movie.getName());
        updateMovie.setDescription(movie.getDescription());
        updateMovie.setImage(movie.getImage());
        updateMovie.setMovie(movie.isMovie());
        movieDao.save(updateMovie);

        return ResponseEntity.ok(updateMovie);
    }

//    @Override
//    public Movie updateMovie(Movie movie) {
//        return this.movieDao.save(movie);
//    }

    @Override
    public String deleteMovie(int movieID) {
        this.movieDao.deleteById(movieID);
        return "Movie with ID: "+movieID+ " is deleted Successfully.";
    }
}
