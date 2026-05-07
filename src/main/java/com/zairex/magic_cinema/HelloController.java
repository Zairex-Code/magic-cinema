package com.zairex.magic_cinema;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// restController tell to our program that is a request controller
@RestController
public class HelloController {
    private final MagicCinemaAIService aiService;

    public HelloController(MagicCinemaAIService aiService) {
        this.aiService = aiService;
    }

    @GetMapping("/")
    public String hello(){
        return this.aiService.generateGreeting();
    }
}