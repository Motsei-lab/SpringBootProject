package com.mecerintered.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
    @GetMapping
    public String Welcome(){
        return "Welcome Java Student";
    }

    @PostMapping
    public String bye(){
        return "Good Bye";
    }

}
