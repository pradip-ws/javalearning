package org.learnbypractice.singleton;

public class SingletonEager {
    // Step 1: Create a private static final instance of the class.
    private static final SingletonEager instance = new SingletonEager();
    // Step 2: Make the constructor private to prevent instantiation.
    private SingletonEager(){}
    // Step 3: Provide a public static method that returns the instance
    public static SingletonEager getInstance(){
        return instance;
    }
}
