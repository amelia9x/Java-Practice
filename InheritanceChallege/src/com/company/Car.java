package com.company;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isMannual;

    private int currentGear;

    public Car(String name, int size, int wheels, int doors, int gears, boolean isMannual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isMannual = isMannual;
        this.currentGear = 1;
    }

    public void changeGear (int gear) {
        this.currentGear = gear;
        System.out.println("Car.changeGear(): Changed to " + this.currentGear);
    }

}
//At first

    /*private int gears;
    private int steering;
    private int glasses;
    private int chairs;

    public Car(double cost, int yearOfProduction, String model, String brand, int gears, int steering, int glasses, int chairs) {
        super("Iron", cost, yearOfProduction, model, brand);
        this.gears = gears;
        this.steering = steering;
        this.glasses = glasses;
        this.chairs = chairs;
    }

    public void charge(int hours) {
        System.out.println("Car.charge() called. Will be charged in " + hours);
    }

    public void protectPeople() {
        System.out.println("Car.protectPeople() called");
    }

    public void moveBack() {
        System.out.println("Car.moveBack() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Car.move() called");
        moveBack();
        super.move(speed);
    }*/