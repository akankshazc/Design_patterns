package hf_5.enumS;

public enum Singleton {
    UNIQUE_INSTANCE;

    // other fields

    // other methods
    public String getDescription() {
        return "I'm a thread safe Singleton!";
    }
}
