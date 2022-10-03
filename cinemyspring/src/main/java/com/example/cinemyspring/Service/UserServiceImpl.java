package com.example.cinemyspring.Service;

import com.example.cinemyspring.Dao.MovieDao;
import com.example.cinemyspring.Dao.UserDao;
import com.example.cinemyspring.Entity.Movie;
import com.example.cinemyspring.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    @Override
    public List<User> getAllUsers() {
        return this.userDao.findAll();
    }

    @Override
    public ResponseEntity<User> getUserByID(int userID) {
        User user = userDao.findById(userID).orElseThrow(()-> new RuntimeException("Employee not exist with id:"+ userID));
        return ResponseEntity.ok(user);
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
    public User addUser(User user) {
        return this.userDao.save(user);
    }

    @Override
    public ResponseEntity<User> updateUser(int userID, User user) {
        User updateUser = userDao.findById(userID).orElseThrow(()->new RuntimeException("Employee not exist with id:"+ userID));
        updateUser.setId(user.getId());
        updateUser.setUsername(user.getUsername());
        updateUser.setPassword(user.getPassword());
        updateUser.setEmail(user.getEmail());
        userDao.save(updateUser);

        return ResponseEntity.ok(updateUser);
    }

//    @Override
//    public Movie updateMovie(Movie movie) {
//        return this.movieDao.save(movie);
//    }

    @Override
    public String deleteUser(int userID) {
        this.userDao.deleteById(userID);
        return "User with ID: "+userID+ " is deleted Successfully.";
    }
}
