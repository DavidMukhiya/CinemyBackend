package com.example.cinemyspring.Controller;

import com.example.cinemyspring.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;





}

