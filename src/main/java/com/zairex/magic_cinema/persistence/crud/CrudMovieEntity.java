package com.zairex.magic_cinema.persistence.crud;

import com.zairex.magic_cinema.persistence.entity.MovieEntity;
import org.springframework.data.repository.CrudRepository;

public interface CrudMovieEntity extends CrudRepository<MovieEntity, Long> {

}
