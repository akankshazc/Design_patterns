package hf_6.remote;

public class CeilingFan {
    String location = "";
    int level;

    public static final int HIGH = 2;
    public static final int MEDIUM = 1;
    public static final int LOW = 0;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        // turns the celing fan on to high
        level = HIGH;
        System.out.println(location + " ceiling fan is on high");
    }

    public void medium() {
        // turns the celing fan on to medium
        level = MEDIUM;
        System.out.println(location + " ceiling fan is on medium");
    }

    public void low() {
        // turns the celing fan on to low
        level = LOW;
        System.out.println(location + " ceiling fan is on low");
    }

    public void off() {
        // turns the celing fan off
        level = -1;
        System.out.println(location + " ceiling fan is off");
    }

    public int getSpeed() {
        return level;
    }
}