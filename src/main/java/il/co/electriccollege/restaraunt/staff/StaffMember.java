package il.co.electriccollege.restaraunt.staff;

import il.co.electriccollege.restaraunt.orders.Order;
import il.co.electriccollege.restaraunt.orders.Priority;

/**
 * Created by borka on 8/19/2017.
 */
public class StaffMember {

    private String name;
    private int id;
    private float tips;
    private Order currOrder;

    public StaffMember(String name, int id, float tips, Order currOrder) {
        this.name = name;
        this.id = id;
        this.tips = tips;
        this.currOrder = currOrder;
    }

    public StaffMember() {
    }

    public void receiveOrder(Order order)
    {}

    public void registerOrder(Priority priority)
    {}

    public void takePayment(float payment)
    {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTips() {
        return tips;
    }

    public void setTips(float tips) {
        this.tips = tips;
    }

    public Order getCurrOrder() {
        return currOrder;
    }

    public void setCurrOrder(Order currOrder) {
        this.currOrder = currOrder;
    }

    @Override
    public String toString() {
        return "StaffMember{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", tips=" + tips +
                ", currOrder=" + currOrder +
                '}';
    }
}
