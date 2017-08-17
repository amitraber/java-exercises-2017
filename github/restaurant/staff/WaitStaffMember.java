package main.java.il.co.electriccollege.restaurant.staff;

import main.java.il.co.electriccollege.restaurant.orders.Order;
import main.java.il.co.electriccollege.restaurant.orders.Priority;

/**
 * Created by yaakov on 8/16/17.
 */
public class WaitStaffMember {



    private String name;
    private int id;
    private Order currentOrder;
    private float tips;
    private  int salary;

    public WaitStaffMember(String name, Order currentOrder, float tips, int salary) {
        this.name = name;
        this.currentOrder = currentOrder;
        this.tips = tips;
        this.salary = salary;
    }


    public void receiveOrder(Order order){
        // TODO
    }

    public void takePayment(float tips){
        // TODO
    }

    public void registerOrder(Priority priority){
        // TODO
    }
}
