package com.zairex.magic_cinema.persistence.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table(name = "magic_cinema_movies")
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 150 , unique = true)
    private  String title;
    @Column(nullable = false, precision = 3)
    private Integer duration;
    @Column(nullable = false, length = 40)
    private String genre;
    @Column(name = "release_date")
    private LocalDate releaseDate;
    @Column(precision = 3, scale = 2)
    private BigDecimal clasification;
    @Column(nullable = false, length = 1)
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public BigDecimal getClasification() {
        return clasification;
    }

    public String getStatus() {
        return status;
    }
}


