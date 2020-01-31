package com.company_static;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer>  tempExit = new HashMap<>();
        locations.put(0, new Location(0, "You are sitting in front of computer learning Java", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "You are standing in the end of road before small brick building", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of hill", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "You are inside of building, a well house for small spring", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "Your are in a valley beside a stream", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "Your are in the forest", tempExit));

        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("EAST", "E");
        vocabulary.put("WEST", "W");

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            tempExit.remove("S");

            if(loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exit are ");
            for(String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();

            if(direction.length() > 1) {
                String[] words = direction.split(" ");
                for(String word : words) {
                    if(vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                    }
                }
            }

            if(exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You can't go this direction.");
            }
        }

//        String[] road = "You are standing in the end of road before small brick building".split(" ");
//        for(String s : road) {
//            System.out.println(s);
//        }
//
//        System.out.println("============================================================");
//
//        String[] building = "You are inside of building, a well house for small spring".split(",");
//        for(String s : building) {
//            System.out.println(s);
//        }

    }
}
