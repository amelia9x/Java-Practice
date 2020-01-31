package com.company;

public class Glass {
    private String material;
    private int quantity;

    public Glass(String material, int quantity) {
        this.material = material;
        this.quantity = quantity;
    }

    public void checkYourFace(int times) {
        System.out.println("Today you check your face " + times + " times");
    }

    public String getMaterial() {
        return material;
    }

    public int getQuantity() {
        return quantity;
    }
}
