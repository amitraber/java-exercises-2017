package inheritance.vehicles;

/**
 * Created by yoavl_000 on 14/08/2017.
 */
public class Helicopter extends Vehicle {
    @Override
    public int move() {
        return 0;
    }

    @Override
    public int getBaseSpeed() {
        return 0;
    }

    @Override
    public int getTopSpeed() {
        return 300;
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
}
