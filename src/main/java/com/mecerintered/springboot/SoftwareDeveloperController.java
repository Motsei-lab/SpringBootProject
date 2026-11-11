package com.mecerintered.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/test/software-Devs")
public class SoftwareDeveloperController {

    @GetMapping
    public List<SoftwareDevelopers> getDevelopers(){
        return List.of(
                new SoftwareDevelopers(List.of("java","HTML","CSS"),"tbg@example.com","Thabang",1,"Thabang012","Front-end Developer"),
                new SoftwareDevelopers(List.of("JEE","API","OOP"),"moe@example.com","Motsei",2,"Motsei2212","Backend Developer")
        );

    }
}
