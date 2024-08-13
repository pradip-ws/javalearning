package org.learnbypractice.singleton;

//To ensure thread safety in a multithreaded environment, you can use the synchronized keyword.
public class SingletonThreadSafe {
    //step 1: create private static instance of the class
    private static SingletonThreadSafe instance;
    //step 2 Make constructor private to prevent instantiation
    private SingletonThreadSafe(){}
    //step 3 Provide a public static method that returns the instance
    public static synchronized  SingletonThreadSafe getInstance(){
        if(instance==null){
            instance = new SingletonThreadSafe();
        }
        return instance;
    }
}
