package com.bettercallpaul.dogs.model;

public class Dog {
    private String name;
    private String breed;
    private String bio;

    public Dog() {}

    public Dog(String name, String breed, String bio) {
        this.name = name;
        this.breed = breed;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
