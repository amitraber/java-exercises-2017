package inheritance.vehicles;

import inheritance.Submergeable;

/**
 * Created by yoavl_000 on 11/08/2017.
 */
public class Submarine extends  Vehicle implements Submergeable {

    @Override
    public int move() {
        return 0;
    }

    @Override
    public int getBaseSpeed() {
        return 10;
    }

    @Override
    public int getTopSpeed() {
        return 80;
    }

    @Override
    public void accelerate() {

    }

    @Override
    public void decelerate() {

    }

    @Override
    protected int gasBurnRate() {
        return 0;
    }

    @Override
    public int getMaxTimeUnderwater() {
        return 0;
    }
}