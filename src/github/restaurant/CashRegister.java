package github.restaurant;

import github.restaurant.orders.Order;

public class CashRegister {

    private float balance;
    private float incomeFromOrder;
    private float totalIncome;

    public void setIncomeFromOrder(float incomeFromOrder) {
        this.incomeFromOrder = incomeFromOrder;
        setTotalIncome(incomeFromOrder);
    }

    public float getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(float incomeFromOrder) {
        this.totalIncome =+ incomeFromOrder;
    }



    public float getIncomeFromOrder() {

        return incomeFromOrder;

    }



    public void registerSale(Order order)
    {

    }


}
