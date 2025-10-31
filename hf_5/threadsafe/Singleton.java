package hf_5.threadsafe;

public class Singleton {
    private static Singleton uniqueInstance;

    // other useful instance variables here

    private Singleton() {
    };

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public String getDescription() {
        return "I'm a thread safe Singleton!";
    }
}
