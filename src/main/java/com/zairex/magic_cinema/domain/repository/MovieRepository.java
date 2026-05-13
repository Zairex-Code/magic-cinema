package com.zairex.magic_cinema.domain.repository;

import com.zairex.magic_cinema.domain.dto.MovieDto;

import java.util.List;

public interface MovieRepository {
    List<MovieDto> getAll();
}
