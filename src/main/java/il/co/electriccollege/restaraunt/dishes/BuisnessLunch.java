package il.co.electriccollege.restaraunt.dishes;

/**
 * Created by borka on 8/19/2017.
 */
public class BuisnessLunch  extends Dish {
    private SideDish sideDish;

    public BuisnessLunch(SideDish sideDish) {
        this.sideDish = sideDish;
    }

    public SideDish getSideDish() {
        return sideDish;
    }

    public void setSideDish(SideDish sideDish) {
        this.sideDish = sideDish;
    }
}
