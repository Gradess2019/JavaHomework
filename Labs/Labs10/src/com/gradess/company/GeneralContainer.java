package com.gradess.company;

import java.util.ArrayList;

public class GeneralContainer<T> {

    private ArrayList<T> array;

    public GeneralContainer() {
        this.array = new ArrayList<>();
    }

    public void printArray() {
        for (T elem : array) {
            System.out.println(elem);
        }
    }

    public void add(T newElem)
    {
        array.add(newElem);
    }
}
