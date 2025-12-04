package com.bettercallpaul.dogs.controller;

import com.bettercallpaul.dogs.model.Dog;
import com.bettercallpaul.dogs.service.DogService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dogs")
public class DogController {
    private final DogService dogService;

    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Dog> all() {
        return dogService.getAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Dog> add(@RequestBody Dog dog) {
        dogService.add(dog);
        return dogService.getAll();
    }
}
