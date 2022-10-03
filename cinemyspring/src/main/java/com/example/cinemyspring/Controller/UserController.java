package com.example.cinemyspring.Controller;

import com.example.cinemyspring.Entity.Movie;
import com.example.cinemyspring.Entity.User;
import com.example.cinemyspring.Service.MovieService;
import com.example.cinemyspring.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/users")
    public List<User> getAllUsers(){
        return this.userService.getAllUsers();
    }


    @GetMapping("/users/{userId}")
    public ResponseEntity<User> getUserByID(@PathVariable String userID){
        return this. userService.getUserByID(Integer.parseInt(userID));
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        return this.userService.addUser(user);
    }


    @PutMapping("/Users/{userId}")
    public ResponseEntity<User> updateUser(@PathVariable int userID, @RequestBody User user){
        return this.userService.updateUser(userID, user);
    }

    @DeleteMapping("/users/{userID}")
    public String deleteUserByID(@PathVariable String userID){
        return this.userService.deleteUser(Integer.parseInt(userID));
    }
}

