package main.java.il.co.electriccollege.restaurant.dishes;

/**
 * Created by yaakov on 8/16/17.
 */
public class BusinessLunch extends AbstractDish {

    private SideDish sideDish;
    private  StandardDish standardDish;



    public BusinessLunch(String name, float price) {

        super(name, price);
    }

    public BusinessLunch(String name, float price, SideDish sideDish,  StandardDish standardDish ) {
        super(name, price);
        this.sideDish= sideDish;
        this.standardDish= standardDish;
    }

    /**
     * adds dish to order at no additional price
     * @param sideDish
     */
    public void setSideDish(SideDish sideDish){
        this.sideDish=sideDish;
    }


    public void setStandardDish(StandardDish standardDish){
        this.standardDish=standardDish;
    }

}
