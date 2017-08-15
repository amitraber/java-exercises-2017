package il.co.electriccollege.triathlon.faces;

/**
 * Created by borka on 8/15/2017.
 */
public interface Submergeable extends Movable {

    boolean isUnderwater();
    int getMaxTimeUnderwater();
}
