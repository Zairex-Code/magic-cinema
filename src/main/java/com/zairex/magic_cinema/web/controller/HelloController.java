package com.zairex.magic_cinema.web.controller;

import com.zairex.magic_cinema.domain.service.MagicCinemaAIService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// restController tell to our program that is a request controller
@RestController
public class HelloController {
    private final String platform;
    private final MagicCinemaAIService aiService;

    public HelloController(@Value("${spring.application.name}") String platform, MagicCinemaAIService aiService) {
        this.platform = platform;
        this.aiService = aiService;
    }

    @GetMapping("/hello")
    public String hello(){
        return this.aiService.generateGreeting(platform);
    }
}