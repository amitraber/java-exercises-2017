package main.java.il.co.electriccollege.restaurant.orders;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by yaakov on 8/16/17.
 */
public class Order {

    private Date orderTime;
    private int cost;
    private List <String> dishes= new ArrayList<String>();


    public Order(Date orderTime, List <String> dishes) {
        this.orderTime = orderTime;
        this.dishes = dishes;
    }



    public Order(String format, List<Object> dishes) {
    }


    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }


    public float getTotal()
    {
       float total=1;


        return  total;
    }
}
