package org.learnbypractice.singleton;

public class SingletonLazy {
    // Step 1: Create a private static instance of the class, initially null.
    private static SingletonLazy instance;
    // Step 2: Make the constructor private to prevent instantiation.
    private SingletonLazy() {}
    //Step 3: Provide a public static method that returns the instance.
    public static SingletonLazy getInstance(){
        if(instance==null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}

