package il.co.electriccollege.restaraunt.orders;

import java.util.Date;
import java.util.List;

/**
 * Created by borka on 8/19/2017.
 */
public class Order {
    private Date orderTime;
    private List dishes;

    public Order(Date orderTime, List dishes) {
        this.orderTime = orderTime;
        this.dishes = dishes;
    }

    public Order() {
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public List getDishes() {
        return dishes;
    }

    public void setDishes(List dishes) {
        this.dishes = dishes;
    }

    public float getTotal()
    {
        return 0;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderTime=" + orderTime +
                ", dishes=" + dishes +
                '}';
    }
}
