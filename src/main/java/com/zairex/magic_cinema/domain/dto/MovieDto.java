package com.zairex.magic_cinema.domain.dto;

import java.time.LocalDate;

public record MovieDto(
        String title,
        Integer duration,
        String genre ,
        LocalDate releaseDate ,
        double rating) {


}
