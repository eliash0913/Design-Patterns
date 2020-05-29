package Singleton_Example;

public class Singleton_MultiThreading {
    private static Singleton_MultiThreading uniqueInstance;

    private Singleton_MultiThreading(){}

    //Adding synchronized keyword to force every thread to wait its turn.
    public static synchronized Singleton_MultiThreading getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton_MultiThreading();
        }
        return uniqueInstance;
    }
}
