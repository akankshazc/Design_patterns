package hf_1;

// Implement the FlyBehavior interface 
// in concrete class for ducks that can't fly

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly.");
    }
}
