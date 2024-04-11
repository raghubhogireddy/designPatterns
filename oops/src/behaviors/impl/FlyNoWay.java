package behaviors.impl;

import behaviors.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("This Duck can't fly!!");
    }
}
