package com.company;

public class Main {

    public static void main(String[] args) {

        int highScore = caculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = caculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        int highScorePostion = calculateHighScorePosition(1000);
        displayHighScorePosition("Tim", highScorePostion);

        highScorePostion = calculateHighScorePosition(900);
        displayHighScorePosition("Chris", highScorePostion);

        highScorePostion = calculateHighScorePosition(400);
        displayHighScorePosition("Anna", highScorePostion);

        highScorePostion = calculateHighScorePosition(50);
        displayHighScorePosition("Tom", highScorePostion);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " +
                highScorePosition + " on the high score table");
        }

    public static int calculateHighScorePosition(int playerScore) {
//        if(playerScore >= 1000) {
//            return 1;
//        } else if ((playerScore >= 500) && (playerScore < 1000)) {
//            return 2;
//        } else if ((playerScore >= 100) && (playerScore < 500)) {
//            return 3;
//        }
//            return 4;

        int position = 4; // assuming position 4 will be returned
        if(playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100); {
            position = 3;
        }
        return position;
    }

    public static int caculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }

        return -1;
    }
}
