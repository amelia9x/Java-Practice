package com.company_static;

public class Main {

    public static void main(String[] args) {
//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//        SomeClass three = new SomeClass("three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
////        one.instanceNumber = 4;
//        System.out.println(Math.PI);
////        Math n = new Math();
//
//        int pw = 674321;
//        Password password = new ExtendedPassword(pw);
//        password.storePassword();
//
//        password.letMeIn(1);
//        password.letMeIn(523266);
//        password.letMeIn(9773);
//        password.letMeIn(0);
//        password.letMeIn(-1);
//        password.letMeIn(674321);

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);

        System.out.println("=========================");

        SIBTest test1 = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }
}
