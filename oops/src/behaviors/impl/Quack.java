package behaviors.impl;

import behaviors.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("This Duck actually Quack!!");
    }
}
