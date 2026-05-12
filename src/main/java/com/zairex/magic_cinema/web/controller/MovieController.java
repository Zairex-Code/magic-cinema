package com.zairex.magic_cinema.web.controller;

import com.zairex.magic_cinema.persistence.crud.CrudMovieEntity;
import com.zairex.magic_cinema.persistence.entity.MovieEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {
    private final CrudMovieEntity crudMovieEntity;

    public MovieController(CrudMovieEntity crudMovieEntity) {
        this.crudMovieEntity = crudMovieEntity;
    }

    @GetMapping("/movies")
    public List<MovieEntity> getAll(){
        return (List<MovieEntity>) this.crudMovieEntity.findAll();

    }
}
