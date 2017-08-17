package main.java.il.co.electriccollege.restaurant.dishes;

/**
 * Created by yaakov on 8/16/17.
 */
public class StandardDish extends AbstractDish {

    private SideDish sideDish;


    public StandardDish(String name, float price) {
        super(name, price);
    }

    /**
     * adds dish to order and price of side dish to this dish's price
     * @param sideDish
     */
    public void setSideDish(SideDish sideDish){
        this.sideDish=sideDish;
    }
}
