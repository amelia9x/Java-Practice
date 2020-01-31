package com.company;

//public class SimpleDotComTestDrive {
//    public static void main (String[] args) {
//        SimpleDotCom dot = new SimpleDotCom();
//
//        int[] locations = {2, 3, 4};
////        int[] locations2 = new int[20];
//        dot.setLocationCells(locations);
//
//        String userGuess = "2";
//        String result = dot.checkYourself(userGuess);
//        String testResult = "failed";
//
//        if(result.equals("hit")) {
//            testResult = "passed";
//        }
//
//        System.out.println(testResult);
//    }
//
//    public String checkYourself(String stringGuess) {
//        int guess = Integer.parseInt(stringGuess);
//        String result = "miss";
//
//        for(int cell : locationCells) {
//            if(guess == cell) {
//                result = "hit";
//                numOfHits++;
//                break;
//            }
//        }
//
//        if(numOfHits == locationCells.length()) {
//            result = "kill";
//        }
//
//        System.out.println(result);
//        return result;
//    }
//}

public class SimpleDotComTestDrive {
//    public static void main(String[] args) {
//        SimpleDotCom dot = new SimpleDotCom();
//        int[] locations = {2, 3, 4};
//        dot.setLocationCells(locations);
//        String userGuess = "2";
//        String result = dot.checkYourself(userGuess);
//    }

    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom dot = new SimpleDotCom();

        int randomNum = (int) (Math.random() * 5);
        int[] locs = {randomNum, randomNum + 1, randomNum + 2};
        dot.setLocationCells(locs);

        boolean isAlive = true;

        while(isAlive) {
            String guessNumber = helper.getUserInput("Input guess number: ");

            String result = dot.checkYourself(guessNumber);
            numOfGuesses++;

//            if(result == "kill") {
            if(result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses!");
            }
        }

//        long y = 40002;
//        float y = 3.12f;
//        short x = (short) y;
//        System.out.println(x);
    }
}


