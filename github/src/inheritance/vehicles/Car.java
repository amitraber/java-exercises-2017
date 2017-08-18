package inheritance.vehicles;

/**
 * Created by yoavl_000 on 11/08/2017.
 */
public class Car extends Vehicle {



    @Override
    public int move() {
        return 0;
    }

    @Override
    public int getBaseSpeed()
    {
        return 0;
    }

    @Override
    public int getTopSpeed() {
        return 120;
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
