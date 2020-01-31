package com.company;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;
//    int numOfHits = 0;


    public void setName(String name) {
        this.name = name;
    }

    public void setLocationCells(ArrayList<String> locs) {
        this.locationCells = locs;
    }


    public String checkYourself(String stringGuess) {
//        int guessNumber = Integer.parseInt(stringGuess);
        String result = "miss";

        int index = locationCells.indexOf(stringGuess);

        if(index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch! You sunk " + name + " :(");
            } else {
                result = "hit";
            }
        }
        return result;
    }
}
