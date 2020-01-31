package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter count: " );
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readInteger(count);
        findMin(returnedArray);
    }

    private static Scanner scanner = new Scanner(System.in);

    public static int[] readInteger(int count) {
        int[] array = new int[count];
        System.out.println("Please enter " + count + " integers.");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            System.out.println("Element " + i + " is " + array[i]);
            scanner.nextLine();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int minNumber = Integer.MAX_VALUE;
            for (int i = 0; i < array.length; i++) {
                int value = array [i];
                if (value <= minNumber) {
                    minNumber = value;
                }
            }
        System.out.println("The min number is " + minNumber);
        return minNumber;
    }

}
