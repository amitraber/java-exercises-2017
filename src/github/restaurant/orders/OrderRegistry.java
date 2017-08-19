package github.restaurant.orders;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class OrderRegistry implements Iterator {
    private ArrayList<Order> highPriorityQueue;
    private ArrayList<Order> meduimPriorityQueue;
    private ArrayList<Order> lowPriorityQueue;

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer action) {

    }
    public void Add(Order dish, Priority priority )
    {

    }

    public ArrayList<Order> getHighPriorityQueue() {
        return highPriorityQueue;
    }

    public void setHighPriorityQueue(ArrayList<Order> highPriorityQueue) {
        this.highPriorityQueue = highPriorityQueue;
    }

    public ArrayList<Order> getMeduimPriorityQueue() {
        return meduimPriorityQueue;
    }

    public void setMeduimPriorityQueue(ArrayList<Order> meduimPriorityQueue) {
        this.meduimPriorityQueue = meduimPriorityQueue;
    }

    public ArrayList<Order> getLowPriorityQueue() {
        return lowPriorityQueue;
    }

    public void setLowPriorityQueue(ArrayList<Order> lowPriorityQueue) {
        this.lowPriorityQueue = lowPriorityQueue;
    }
}
