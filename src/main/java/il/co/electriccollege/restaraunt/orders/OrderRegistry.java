package il.co.electriccollege.restaraunt.orders;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created by borka on 8/19/2017.
 */
public class OrderRegistry implements Iterator{
    private ArrayList<Order> highPriorityQueue ;
    private ArrayList<Order> mediumPriorityQueue ;
    private ArrayList<Order>lowPriorityQueue ;

    public OrderRegistry(ArrayList<Order> highPriorityQueue, ArrayList<Order> mediumPriorityQueue, ArrayList<Order> lowPriorityQueue) {
        this.highPriorityQueue = highPriorityQueue;
        this.mediumPriorityQueue = mediumPriorityQueue;
        this.lowPriorityQueue = lowPriorityQueue;
    }

    public OrderRegistry() {
    }


    public boolean hasNext() {
        return false;
    }

    public Object next() {
        return null;
    }

    public void remove() {

    }
    public void add(Order order, Priority priority) {

    }
    public void forEachRemaining(Consumer action) {

    }
}


