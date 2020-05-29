package Singleton_Example;

public class Singleton_MultiThreading_Improved {
    private volatile static Singleton_MultiThreading_Improved uniqueInstance;

    private Singleton_MultiThreading_Improved() {}

    public static Singleton_MultiThreading_Improved getInstance() {
        if(uniqueInstance == null) {
            synchronized (Singleton.class) { //only synchronize the first time through.
                if(uniqueInstance == null) {
                    uniqueInstance = new Singleton_MultiThreading_Improved();
                }
            }
        }
        return uniqueInstance;
    }
}
