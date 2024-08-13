package org.learnbypractice.singleton;

//This method reduces the overhead of acquiring a lock by checking the instance twice.
public class SingletonDCL {
    //step 1 : create private static instance of the class
    private static SingletonDCL instance;
    //step 2: make constructor private to prevent instantiation
    private SingletonDCL(){}
    //step 3: provide public static method to return instance
    public static SingletonDCL getInstance(){
        if(instance == null){
            synchronized (SingletonDCL.class){
                if(instance == null){
                    instance = new SingletonDCL();
                }
            }
        }
        return instance;
    }
}

