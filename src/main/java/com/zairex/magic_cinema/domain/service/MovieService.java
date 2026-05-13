package com.zairex.magic_cinema.domain.service;

import com.zairex.magic_cinema.domain.dto.MovieDto;
import com.zairex.magic_cinema.domain.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    
    public List<MovieDto> getAll(){
        return  this.movieRepository.getAll();
    }
}
