package main.java.il.co.electriccollege.restaurant;

import main.java.il.co.electriccollege.restaurant.dishes.BusinessLunch;
import main.java.il.co.electriccollege.restaurant.dishes.SideDish;
import main.java.il.co.electriccollege.restaurant.dishes.StandardDish;
import main.java.il.co.electriccollege.restaurant.orders.Order;
import main.java.il.co.electriccollege.restaurant.staff.WaitStaffMember;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CashRegister incomeFromOrder= new CashRegister() ;


        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();

        StandardDish hamburger= new StandardDish("hamburger", 30);
        StandardDish pizza= new StandardDish("pizza", 35);
        StandardDish soup= new StandardDish("soup", 29);

        SideDish salad= new SideDish("salad", 10);
        SideDish chips= new SideDish("chips", 9);

        BusinessLunch businessLunchNoon= new BusinessLunch("noon free SideDish", 0);
        BusinessLunch businessLunchBreakfast= new BusinessLunch("Breakfast free salad", soup.getPrice(), salad,soup); //free salad


    ////////////////////////////////////////////////////////////////////////////////////////////////
        List<Object> dishesOfNoha= new ArrayList<Object>();
        dishesOfNoha.add(hamburger);
        dishesOfNoha.add(pizza);

        Order orderOfNoha = new Order(dateFormat.format(date),dishesOfNoha);
        WaitStaffMember noha= new WaitStaffMember("noha", orderOfNoha, 15, 7000);

        incomeFromOrder.setIncomeFromOrder(hamburger.getPrice()+pizza.getPrice());
///////////////////////////////////////////////////////////////////////////////////////////////


        List<Object> dishesOfMoshe= new ArrayList<Object>();
        dishesOfMoshe.add(businessLunchNoon);
        int alotOfChips=0;
        while(alotOfChips<1000)
        {
            dishesOfMoshe.add(chips);
            alotOfChips++;
        }


        Order orderOfMoshe = new Order(dateFormat.format(date),dishesOfMoshe);
        WaitStaffMember mosha= new WaitStaffMember("Mosha", orderOfMoshe, 10, 5000);
        incomeFromOrder.setIncomeFromOrder(chips.getPrice()*1000);

    }
}
