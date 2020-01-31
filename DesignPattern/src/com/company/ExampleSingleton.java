package com.company;

public class ExampleSingleton { // lazy construction
    // the class variable is null if no instance is instantiated
    private static ExampleSingleton uniqueInstance = null;

    private ExampleSingleton() {
        // Code here
    }

    // Lazy construction of the instance
    public static ExampleSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ExampleSingleton();
        }
        return uniqueInstance;
    }
}

// Purpose: ensure that only one object of class is ever created
// Provide global access to a class that is restricted to one instance

