package il.co.electriccollege.triathlon.faces;

/**
 * Created by borka on 8/15/2017.
 */
public interface Movable {
    int move();
    int getBaseSpeed ();
    void accelerate ();
    int getCurrentSpeed();
    void decelarate();
    int getTopSpeed ();
}
