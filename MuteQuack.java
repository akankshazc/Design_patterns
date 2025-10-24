// Implement the QuackBehavior interface 
// in concrete class for ducks that don't quack

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
