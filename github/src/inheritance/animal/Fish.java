package inheritance.animal;

import inheritance.Submergeable;

/**
 * Created by yoavl_000 on 11/08/2017.
 */
public class Fish extends Animal implements Submergeable {
    @Override
    public int move() {
        return 0;
    }

    @Override
    public int getBaseSpeed() {
        return 15;
    }

    @Override
    public int getTopSpeed() {
        return 20;
    }

    @Override
    public void accelerate() {

    }

    @Override
    public void decelerate() {

    }

    @Override
    public int getMaxTimeUnderwater() {
        return 0;
    }
}
