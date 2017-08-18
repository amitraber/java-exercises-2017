package main.java.il.co.electriccollege.restaurant;

import main.java.il.co.electriccollege.restaurant.orders.Order;

public class CashRegister {

    private float balance;
    private float incomeFromOrder;

    public float getIncomeFromOrder() {
        return incomeFromOrder;
    }

    public void setIncomeFromOrder(float incomeFromOrder) {
        this.incomeFromOrder = incomeFromOrder;
    }

    public void registerSale(Order order)
    {

    }
}
