package hf_1;

// Create a DuckCall class that quacks like a duck
// (hunters use the device to mimic the quacks of ducks)
// that does not inherit from the Duck class (p23)

public class DuckCall {
    QuackBehavior quackBehavior = new Quack();

    public void performQuack() {
        quackBehavior.quack();
    }
}
