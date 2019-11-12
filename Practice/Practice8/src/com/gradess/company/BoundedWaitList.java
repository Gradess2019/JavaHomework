package com.gradess.company;

/**
 * The wait list that is bounded
 * @param <E>  type of content
 */
public class BoundedWaitList<E> extends WaitList<E> {

    private int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if (capacity <= 0) { return; }

        super.add(element);
        capacity--;
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                '}';
    }
}
