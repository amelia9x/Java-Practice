//package com.company;
//
//public class SimpleDotCom {
//    int[] locationCells;
//    int numOfHits = 0;
//
//    public void setLocationCells(int[] locs) {
//        this.locationCells = locs;
//    }
//
//    public String checkYourself(String stringGuess) {
//        int guessNumber = Integer.parseInt(stringGuess);
//        String result = "missed";
//
//        for (int loc : locationCells) {
//            if(loc == guessNumber) {
//                result = "hit";
//                numOfHits++;
//                break;
//            }
//        }
//
//        if(numOfHits == locationCells.length) {
//            result = "kill";
//        }
//        System.out.println(result);
//        return result;
//    }
//
//}

package com.company;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        this.locationCells = locs;
    }


    public String checkYourself(String stringGuess) {
        int guessNumber = Integer.parseInt(stringGuess);
        String result = "missed";

        for (int loc : locationCells) {
            if(loc == guessNumber) {
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if(numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }

}
