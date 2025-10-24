// MiniDuckSimulator to create instances of Duck 
// subclasses with different behaviors

public class MiniDuckSimulator {
    public static void main(String[] args) {

        // MallardDuck class
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        // ModelDuck class
        Duck model = new ModelDuck();
        model.performFly();

        // Changing fly behavior at runtime using the setter method
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
