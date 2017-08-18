package inheritance.vehicles;

import inheritance.Movable;

/**
 * Created by yoavl_000 on 11/08/2017.
 */
public  abstract class Vehicle implements Movable {
    public  int gasTank;

    protected int gasTankVolume(int gasTank)
    {
        this.gasTank=gasTank;

        return this.gasTank;

    }

    protected abstract int gasBurnRate();

}
