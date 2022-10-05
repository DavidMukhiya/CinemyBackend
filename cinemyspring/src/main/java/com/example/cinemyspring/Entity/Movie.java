package com.example.cinemyspring.Entity;
import javax.persistence.*;

@Entity
@Table(name="tbl_cinemy")
public class Movie {
    @Id
    private int id;
    private String name;
    private String image;
    private String description;
    private boolean isMovie;

    public Movie(){

    }

    public Movie(String name, String image, String description, boolean isMovie) {
        this.name = name;
        this.image = image;
        this.description = description;
        this.isMovie = isMovie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isMovie() {
        return isMovie;
    }

    public void setIsMovie(boolean movie) {
        isMovie = movie;
    }
}
