package com.company;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4,3,2,1);

        Lamp lamp = new Lamp("Classic", false, 75);

        BedRoom bedRoom = new BedRoom("Anh",wall1, wall2,wall3,wall4,ceiling,bed,lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();

        /*Glass glass = new Glass("wood and glass, plastic", 2);
        Chair chair = new Chair("Green", new Size(10, 15), "1994");
        RiceCooker riceCooker = new RiceCooker("240", "White", new Size(40, 45));

        Room room = new Room(glass,chair,riceCooker);
        room.use();
        room.getRiceCooker().cook("Spagetti");*/


        /*Resolution nativeResolution = new Resolution(2540, 1440);
        Case theCase = new Case("22BB", "Dell", "240", new Dimension(20, 20, 5));

        Monitor theMonitor = new Monitor("27Beast", "Acer", 27, nativeResolution);

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();*/

        /*thePC.getMonitor().drawPixelAt(1550, 1220, "red");
        thePC.getMotherboard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();*/
    }
}
