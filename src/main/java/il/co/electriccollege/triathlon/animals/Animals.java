package il.co.electriccollege.triathlon.animals;

import il.co.electriccollege.triathlon.faces.Movable;

/**
 * Created by borka on 8/15/2017.
 */
public class Animals implements Movable{
    protected int energy;
    protected  int energyBurnRate;


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
