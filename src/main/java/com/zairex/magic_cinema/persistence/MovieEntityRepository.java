package com.zairex.magic_cinema.persistence;

import com.zairex.magic_cinema.domain.dto.MovieDto;
import com.zairex.magic_cinema.domain.repository.MovieRepository;
import com.zairex.magic_cinema.persistence.crud.CrudMovieEntity;
import com.zairex.magic_cinema.persistence.mapper.MovieMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieEntityRepository implements MovieRepository {
    private final CrudMovieEntity crudMovieEntity;
    private final MovieMapper movieMapper;

    public MovieEntityRepository(CrudMovieEntity crudMovieEntity, MovieMapper movieMapper){
        this.crudMovieEntity = crudMovieEntity;
        this.movieMapper = movieMapper;
    }
    @Override
    public List<MovieDto> getAll(){
        return this.movieMapper.toDto(this.crudMovieEntity.findAll());

    }

}
