package com.company;

public class Honda extends Car {

    private int roadServiceMonths;

    public Honda(int roadServiceMonths) {
        super("Honda", 4, 4, 4, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0) {
            stop();
            changeGear(1);
        }
        else if(newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        }
        else if(newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        }
        else if(newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        }
        else {
            changeGear(4);
        }

        if (newVelocity > 0) {
            move(newVelocity, getCurrentDirection());
        }
    }
}
//At first
/*private String color;
    private String gift;
    private int numberOfStaff;

    public Honda(double cost, int yearOfProduction, String model, int gears, int steering, int glasses, int chairs, String color, String gift, int numberOfStaff) {
        super(cost, yearOfProduction, model, "Honda", gears, steering, glasses, chairs);
        this.color = color;
        this.gift = gift;
        this.numberOfStaff = numberOfStaff;
    }

    public void transform() {
        System.out.println("Honda.transform() called");
    }

    public void supercharge (int hours) {
        System.out.println("Honda.supercharge() called");
        super.charge(hours);
    }

    public void moveRight() {
        System.out.println("Honda.moveRight() called");
    }

    @Override
    public void move(int speed) {
        moveRight();
        super.move(speed);
    }*/
