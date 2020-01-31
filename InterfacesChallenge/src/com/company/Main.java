package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player anh = new Player("Anh", 19, 20);
        System.out.println(anh);

        saveObject(anh);
        System.out.println(anh);
        anh.setWeapon("Beauty");
        saveObject(anh);
//        loadObject(anh);
        System.out.println(anh);

        iSaveable wereWolf = new Monster("Were Wolf", 40, 50);
        System.out.println(wereWolf);
        System.out.println("Strength = " + ((Monster) wereWolf).getStrength());
        saveObject(wereWolf);
//        loadObject(wereWolf);
        System.out.println(wereWolf);

    }

    public static ArrayList<String> readValue() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Below is available option. Press: \n" +
                "0 - to quit.\n" +
                "1 - to input string.\n");

        while (!quit) {
            System.out.println("Input your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    String stringValue = scanner.nextLine();
                    values.add(index, stringValue);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(iSaveable objectToSave) {
        for(int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to the device.");
        }
    }

    public static void loadObject(iSaveable objectToLoad) {
        ArrayList<String> values = readValue();
        objectToLoad.read(values);
    }
}



















