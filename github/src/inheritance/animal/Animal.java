package inheritance.animal;

import inheritance.Movable;

/**
 * Created by yoavl_000 on 14/08/2017.
 */
public abstract class Animal implements Movable {
    protected  int energy;
    protected  int energyBurnRate;

    public int rest(int restInSeconds)
    {
        energy=energy+restInSeconds;
        return  energy;
    }
}
