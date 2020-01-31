package com.company;

public class Song1 {
    private String title;
    private double duration;

    public Song1(String name, double duration) {
        this.title = name;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
