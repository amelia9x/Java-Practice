package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 0;

        do{
            System.out.println("This is the " + count);
            count++;
            if(count > 100) {
                break;
            }
        } while (count != 0);

        /*while(count != 6) {
            System.out.println("The count number is " + count);
            count++;
        }*/

        /*do {
            System.out.println("Count value was " + count);
            count++;
            if(count > 100) {
                break;
            }
        }
        while (count != 6);*/

        /*count = 1;
        while(true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }*/



//        for (count = 1; count != 6; count++) {
//            System.out.println("Count value is " + count);
//        }
//
//        count = 1;
//        while(true) {
//            if(count == 5) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
            count = 0;
            int totalEvenNumber = 0;
            int number = 4;
            int finishNumber = 20;

            while (number <= finishNumber) {
                number++;
                if(!isEvenNumber(number)) {
                    continue;
                }
                System.out.println("Even number " + number);
                count ++;

                if(count >= 5) {
                    System.out.println("Total of even number is " + count);
                    break;

                }

            }


    }

    public  static boolean isEvenNumber(int number) {
        if(number % 2 == 0) {
            return true;
        }
        return false;
    }
}
