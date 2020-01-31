package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{45, 65, 87, 24, 76, 1, 9};
        System.out.println("Array is " + Arrays.toString(array));
//        System.out.println(Arrays.toString(reverse(array)));
        reverse(array);
        System.out.println("Array is " + Arrays.toString(array));
    }

    public static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfOfLength = array.length / 2;
        for (int i = 0; i < halfOfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }

    /*public static void reverse(int[] array) {
        int temp;
        int n = (array.length - 1) / 2;
        for (int i = 0, j = array.length - 1; (i < n) && (j > n); i++, j--) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            System.out.println("i = " + i);
            System.out.println("j = " + j);
        }
    }*/
}







