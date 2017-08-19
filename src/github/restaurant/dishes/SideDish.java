package github.restaurant.dishes;

/**
 * Created by yaakov on 8/16/17.
 */

public class SideDish extends AbstractDish {
    String name;
    float price;

    public SideDish(String name, float price)
    {
        super(name, price);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }
}
