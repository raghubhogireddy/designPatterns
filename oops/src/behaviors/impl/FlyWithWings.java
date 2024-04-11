package behaviors.impl;

import behaviors.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("This Duck fly with Wings!!");
    }
}
