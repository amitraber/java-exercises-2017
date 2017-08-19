package github.restaurant.staff;

import github.restaurant.orders.Order;

import github.restaurant.orders.OrderRegistry;
import github.restaurant.orders.Priority;

/**
 * Created by yaakov on 8/16/17.
 */
public class WaitStaffMember {



    private String name;
    private int id;
    private Order currentOrder;
    private float tips;
    private  int salary;
    private OrderRegistry orderRegistry;

    public WaitStaffMember(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }


    public void order( Order currentOrder, float tips ) {
        this.name = name;
        this.currentOrder = currentOrder;
        this.tips = tips;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public OrderRegistry getOrderRegistry() {
        return orderRegistry;
    }

    public void setOrderRegistry(OrderRegistry orderRegistry) {
        this.orderRegistry = orderRegistry;
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
