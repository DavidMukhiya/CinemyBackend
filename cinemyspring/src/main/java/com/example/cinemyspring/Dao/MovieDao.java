package com.example.cinemyspring.Dao;

import com.example.cinemyspring.Entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieDao extends JpaRepository<Movie, Integer> {


}
