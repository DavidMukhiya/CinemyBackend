package com.example.cinemyspring.Service;
import com.example.cinemyspring.Entity.Movie;
import com.example.cinemyspring.Entity.User;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface UserService {
    List<User> getAllUsers();

    ResponseEntity<User> getUserByID(int userId);

    User addUser(User user);

    ResponseEntity<User> updateUser(int id, User user);

    String deleteUser(int ID);


}
