package com.company;

public class RiceCooker {
    private String electricitySupply;
    private String color;
    private Size size;

    public RiceCooker(String electricitySupply, String color, Size size) {
        this.electricitySupply = electricitySupply;
        this.color = color;
        this.size = size;
    }

    public void cook(String food) {
        System.out.println("I will cook " + food + " today.");
    }

    public String getElectricitySupply() {
        return electricitySupply;
    }

    public String getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }
}
