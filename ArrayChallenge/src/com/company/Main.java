package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getInteger(int number) {
        System.out.println("Please input " + number + " integers in screen.\n");
        int[] array = new int[number];
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }



    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element #" + i + " is " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        /*int[] sortedArray = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            sortedArray[i] = array [i];
        }*/

        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for(int i = 0; i < array.length - 1; i++) {
                if(sortedArray[i] < sortedArray [i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray [i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }


    public static void main(String[] args) {
        int[] array = getInteger(5);
        System.out.println("--------------");
        printArray(array);
        System.out.println("--------------");
        printArray(sortIntegers(array));
    }
}

// Cách mình làm ban đầu
/*public static int[] sortIntegers(int[] array) {
        int balance = 0;
        for(int i = 0; i < array.length - 1; i++) {
            if(array[i] < array[i++]){
                balance = array[i++] - array[i];
                array[i] = array[i] + balance;
                array[i + 1]  = array[i + 1] - balance;
                System.out.println("Balance is " + balance);
                System.out.println("i = " + array [i]);
                System.out.println("i + 1 = " + array[i + 1]);
            }
            else {
                array[i] = array[i] - balance;
                array[i + 1]  = array[i + 1] + balance;
                System.out.println("Balance is " + balance);
                System.out.println("i = " + array [i]);
                System.out.println("i + 1 = " + array[i + 1]);
            }
        }
        return array;
    }*/





