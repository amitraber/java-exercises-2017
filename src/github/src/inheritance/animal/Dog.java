package github.src.inheritance.animal;

/**
 * Created by yoavl_000 on 14/08/2017.
 */
public class Dog  extends  Animal  {
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
        return 40;
    }

    @Override
    public void accelerate() {

    }

    @Override
    public void decelerate() {

    }
}
