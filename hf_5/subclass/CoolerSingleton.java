package hf_5.subclass;

public class CoolerSingleton extends Singleton {

    // other instance variables here
    protected static Singleton uniqueInstance;

    private CoolerSingleton() {
        super();
    }
}
