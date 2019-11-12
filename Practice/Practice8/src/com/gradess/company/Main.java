package com.gradess.company;

/**
 * Main class
 */
public class Main {

    public static void main(String[] args) {
        BoundedWaitList<Integer> integerBoundedWaitList = new BoundedWaitList<>(2);
        integerBoundedWaitList.add(2);
        integerBoundedWaitList.add(1);
        integerBoundedWaitList.add(0);

        UnfairWaitList<Float> floatUnfairWaitList = new UnfairWaitList<>();
        floatUnfairWaitList.add(2.5f);
        floatUnfairWaitList.add(3.1f);
        floatUnfairWaitList.add(-4.2f);

        WaitList<String> waitList = new WaitList<>();
        waitList.add("Hello");
        waitList.add("World");
        waitList.add("!!!");
    }
}
