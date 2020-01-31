package com.company;

public class Main {

    public static void main(String[] args) {
        double firstDoubleValue = 20.00d;
        double secondDoubleValue = 80.00d;
        double thirdDoubleValue = (firstDoubleValue + secondDoubleValue) * 100.00d;
        System.out.println("ThirdDoubleValue is " + thirdDoubleValue);

        double remainderValue = thirdDoubleValue % 40.00d;
        System.out.println("Remainder Value is " + remainderValue);

        boolean checkRemainderValue = (remainderValue == 0) ? true : false;
        System.out.println("checkRemainderValue is " + checkRemainderValue);

        if (!checkRemainderValue) {
            System.out.println("Got some remainder");
        }
    }
}
