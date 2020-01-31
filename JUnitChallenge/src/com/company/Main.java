package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
        Utilities utilities = new Utilities();
        String stringRemovedPair = utilities.removePairs(null);
        System.out.println(stringRemovedPair);

        char[] charAfterMethod = utilities.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 7);
        for(char i :  charAfterMethod) {
            System.out.println(i);
        }

    }
}
