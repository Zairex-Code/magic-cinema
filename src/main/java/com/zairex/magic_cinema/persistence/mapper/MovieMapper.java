package com.zairex.magic_cinema.persistence.mapper;

import com.zairex.magic_cinema.domain.dto.MovieDto;
import com.zairex.magic_cinema.persistence.entity.MovieEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MovieMapper {
    @Mapping(source = "title", target = "title")
    @Mapping(source = "duration", target = "duration")
    @Mapping(source = "genre" , target = "genre")
    @Mapping(source = "releaseDate", target = "releaseDate")
    @Mapping(source = "clasification" , target = "rating")
    MovieDto toDto(MovieEntity entity);
    List<MovieDto> toDto(Iterable<MovieEntity> entities);
}
