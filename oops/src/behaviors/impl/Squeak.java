package behaviors.impl;

import behaviors.QuackBehavior;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("This duck Squeak!!");
    }
}
