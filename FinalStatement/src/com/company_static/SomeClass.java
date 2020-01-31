package com.company_static;

public class SomeClass {
    private static int classCounter;
    public final int instanceNumber;
    private final String name;

    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " is created, the instance Number is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
