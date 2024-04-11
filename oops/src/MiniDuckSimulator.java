import behaviors.impl.FlyNoWay;
import behaviors.impl.FlyWithWings;
import behaviors.impl.NoQuack;
import behaviors.impl.Quack;
import ducks.DecoyDuck;
import ducks.Duck;
import ducks.MallardDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.setQuackBehavior(new Quack());
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck woodDuck = new DecoyDuck();
        woodDuck.setFlyBehavior(new FlyNoWay());
        woodDuck.setQuackBehavior(new NoQuack());
        woodDuck.performQuack();
        woodDuck.performFly();
    }
}