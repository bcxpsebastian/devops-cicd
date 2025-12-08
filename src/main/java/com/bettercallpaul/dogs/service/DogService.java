package com.bettercallpaul.dogs.service;

import com.bettercallpaul.dogs.model.Dog;

import jakarta.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class DogService {
    private final List<Dog> dogs = new ArrayList<>();

    @PostConstruct
    public void init() {
        dogs.add(new Dog("Walter", "Golden Retriever", "Loves long walks and squeaky toys."));
        dogs.add(new Dog("Saul", "Beagle", "Expert at finding treats. Very good boy."));
        dogs.add(new Dog("Kim", "Border Collie", "Smart, energetic, and excellent at herding the couch pillows."));
        dogs.add(new Dog("Gus", "French Bulldog", "Serious stare, cuddles on demand."));
        dogs.add(new Dog("Pablo", "Spanischer Jagdhund, oder italienisch", "Floppy ears and a big heart."));
    }

    public List<Dog> getAll() {
        return Collections.unmodifiableList(dogs);
    }

    public void add(Dog d) {
        dogs.add(d);
    }
}
