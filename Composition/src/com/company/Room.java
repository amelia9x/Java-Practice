package com.company;

public class Room {
    private Glass glass;
    private Chair chair;
    private RiceCooker riceCooker;

    public Room(Glass glass, Chair chair, RiceCooker riceCooker) {
        this.glass = glass;
        this.chair = chair;
        this.riceCooker = riceCooker;
    }

    public void use() {
        glass.checkYourFace(7);
        chair.sit("Near to table", 3);
    }
    public Glass getGlass() {
        return glass;
    }

    public Chair getChair() {
        return chair;
    }

    public RiceCooker getRiceCooker() {
        return riceCooker;
    }
}
