package com.company_static;

public class SIBTest {
    public static final String owner;

    public SIBTest() {
        System.out.println("SIB constructor called.");
    }

    static {
        owner = "Anh";
        System.out.println("SIBTest static initialization block called");
    }

    static {
        System.out.println("2nd initialization block called");
    }

    {
        System.out.println("It will be call everytime you create new instance");
    }

    {
        System.out.println("2nd It's so fun, I love learning coding.");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }
}

