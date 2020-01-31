package com.company;

import java.util.ArrayList;

public class DotComBustTestDrive {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<>();
    private int numOfGuesses = 0;

    public void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Go2.com");
        DotCom two = new DotCom();
        two.setName("Pets.com");
        DotCom three = new DotCom();
        three.setName("AskMe.com");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.con, AskMe.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for(DotCom dot : dotComsList) {
            ArrayList<String> loc = helper.placeDotCom(3);
            dot.setLocationCells(loc);
        }
    }

    public void startPlaying() {
        while(!dotComsList.isEmpty()) {
            String userInput = helper.getUserInput("Please input your guess number: ");
            checkUserGuess(userInput);
        }
        finishGame();
    }

    public void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";
        for(DotCom dot : dotComsList) {
            result = dot.checkYourself(userGuess);
            if(result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComsList.remove(dot);
                break;
            }
        }
        System.out.println(result);
    }

    public void finishGame() {
        System.out.println("Game over");
        if(numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println("Congratulation, your guess times smaller than average!!");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("You need to try better in next time...");
        }
    }

    public static void main (String[] args) {
        DotComBustTestDrive game = new DotComBustTestDrive();
        game.setUpGame();
        game.startPlaying();
    }
}

/* Exercise (Page 146 ~ 147)
* 1. declare and initialize the variables we'll need
* 2. make three DotCom objects, give 'em names, and stick 'em in the ArrayList
* 3. print brief instructions for user
* 4. repeat with each DotCom in the list
* 5. ask the helper for a DotCom location
* 6. call the setter method on this DotCom to give it the location you just got from the helper
* 7. as long as the DotCom list is not empty
* 8. get user input
* 9. call our own checkUserGuess() method
* 10. call our own finishGame method
* 11. increment the number of guesses the user has made
* 12. assume it's a 'miss', unless told otherwise
* 13. repeat with all DotComs in the list
* 14. ask the DotCom to check user guess, looking for hit/kill
* 15. get out of the loop early, no point in testing the others
* 16. this guy's dead, so take him out of the DotComs list then get out of the loop
* 17. print the result for the user
* 18. print a message telling the user how he did in the game
* 19. create the game object
* 20. tell the game object to set up the game
* 21. tell the game object to start the main game play loop (keeps asking for user input and checking the guess)
*  */