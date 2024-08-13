package org.learnbypractice.singleton;
// Bill Pugh Singleton Design (Using Inner Static Class):
//This method is thread-safe and doesn't require synchronization.
public class SingletonWithoutSyncronization {
    private SingletonWithoutSyncronization(){}
    private static class SingletonHelper{
        private static final SingletonWithoutSyncronization instance = new SingletonWithoutSyncronization();
    }
    public static SingletonWithoutSyncronization  getInstance(){
        return SingletonHelper.instance;
    }
}
