package il.co.electriccollege.triathlon.vehicles;

import il.co.electriccollege.triathlon.faces.Movable;

/**
 * Created by borka on 8/15/2017.
 */
public class Vehicles implements Movable {
    protected int gasTankVoulume;
    protected  int gazBurnRate;

    public int move() {
        return 0;
    }

    public int getBaseSpeed() {
        return 0;
    }

    public void accelerate() {

    }

    public int getCurrentSpeed() {
        return 0;
    }

    public void decelarate() {

    }

    public int getTopSpeed() {
        return 0;
    }
}
