package com.zairex.magic_cinema;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// restController tell to our program that is a request controller
@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(){
        return "Hello world";
    }
}