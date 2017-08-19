package github.restaurant;

import github.restaurant.dishes.BusinessLunch;
import github.restaurant.dishes.SideDish;
import github.restaurant.dishes.StandardDish;
import github.restaurant.orders.Order;
import github.restaurant.orders.OrderRegistry;
import github.restaurant.staff.WaitStaffMember;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        CashRegister orit= new CashRegister() ;
         OrderRegistry orderRegistry=new  OrderRegistry();
        ArrayList lowPriority= orderRegistry.getLowPriorityQueue();
        ArrayList highPriority= orderRegistry.getHighPriorityQueue();



        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();

        StandardDish hamburger= new StandardDish("hamburger", 30);
        StandardDish pizza= new StandardDish("pizza", 35);
        StandardDish soup= new StandardDish("soup", 29);

        SideDish salad= new SideDish("salad", 10);
        SideDish chips= new SideDish("chips", 9);

        BusinessLunch businessNoon= new BusinessLunch("noon free SideDish", 0);

        //breakfast deal: order  soup, get free salad.
        BusinessLunch businessBreakfast= new BusinessLunch("Breakfast free salad", soup.getPrice(), salad,soup); //free salad


    ////////////////////////////////////////////////////////////////////////////////////////////////
        WaitStaffMember noha;
        noha= new WaitStaffMember("noha", 7000);


        List<Object> dishesOfNoha= new ArrayList<Object>();
        dishesOfNoha.add(hamburger);
        dishesOfNoha.add(pizza);


        Order orderOfNoha = new Order(dateFormat.format(date),dishesOfNoha);
        orderOfNoha.setOrderByPhone(true);

        if (orderOfNoha.getOrderByPhone()==true)
        {
            lowPriority.add(orderOfNoha);
        }
        else
        {
            highPriority.add(orderOfNoha);
        }
      //   noha= new WaitStaffMember( orderOfNoha, 15);


         noha.order(orderOfNoha, 15);



        orit.setIncomeFromOrder(hamburger.getPrice()+pizza.getPrice());
///////////////////////////////////////////////////////////////////////////////////////////////
        WaitStaffMember moses;
        moses=new WaitStaffMember("moshe",5000);

        List<Object> dishesOfMoses= new ArrayList<Object>();
        dishesOfMoses.add(businessNoon); //one free side dish. in this case, one free chips dish.
        dishesOfMoses.add(pizza);
        int alotOfChips=0;
        while(alotOfChips<1000)
        {
            dishesOfMoses.add(chips);
            alotOfChips++;
        }


        Order orderOfMoshe = new Order(dateFormat.format(date),dishesOfMoses);
      //  moses= new WaitStaffMember( );
        moses.order(orderOfMoshe, 10);

        highPriority.add(orderOfMoshe);
        orit.setIncomeFromOrder((chips.getPrice()*999) + pizza.getPrice() );//beacuse they orderd bussinessNoon, they deserve 1 free chip(/sidedish)
        //beacuse of that they got 1000 chips but payed for 999.


///////////////////////////////////////////////////////////////////////////////////////


        //a new order to mosha.
        dishesOfMoses.removeAll(dishesOfMoses);
        dishesOfMoses.add(businessBreakfast); //order soup get free salad
        moses.order(orderOfMoshe, 100);
        highPriority.add(orderOfMoshe);
        orit.setIncomeFromOrder(soup.getPrice());//notice  that we dont add the salad to the income.


    }
}
