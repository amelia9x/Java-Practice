package com.company;

public class Chair {
    private String colour;
    private Size size;
    private String yearOfProduction;

    public Chair(String colour, Size size, String yearOfProduction) {
        this.colour = colour;
        this.size = size;
        this.yearOfProduction = yearOfProduction;
    }

    public void sit(String place, int times) {
        System.out.println("Today you sit in " + place + " " + times + " times.");
    }

    public String getColour() {
        return colour;
    }

    public Size getSize() {
        return size;
    }

    public String getYearOfProduction() {
        return yearOfProduction;
    }
}
