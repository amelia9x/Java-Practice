package com.company;

public class Vehicle {
    private String name;
    private int size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, int size) {
        this.name = name;
        this.size = size;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steering (int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steering(): Steering at " + currentDirection + " degree.");
    }

    public void move(int speed, int direction) {
        currentDirection = direction;
        currentVelocity = speed;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public void stop() {
        currentVelocity = 0;
        System.out.println("Vehicle.stop(): Stopped");
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}

// At first
/*
private String material;
    private double cost;
    private int yearOfProduction;
    private String model;
    private String brand;

    public Vehicle(String material, double cost, int yearOfProduction, String model, String brand) {
        this.material = material;
        this.cost = cost;
        this.yearOfProduction = yearOfProduction;
        this.model = model;
        this.brand = brand;
    }


    public void move(int speed) {
        System.out.println("Vehicle.move() called. Vehicle move with " + speed);
    }

    public void carryPeople(int numberOfPeople) {
        System.out.println("Vehicle.carryPeople() called");
    }

    public String getMaterial() {
        return material;
    }

    public double getCost() {
        return cost;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }*/
