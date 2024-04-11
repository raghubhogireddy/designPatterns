package behaviors.impl;

import behaviors.QuackBehavior;

public class NoQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("This Duck cannot Quack!!");
    }
}
