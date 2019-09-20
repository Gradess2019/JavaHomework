package com.gradess.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Hello");
        list.add("World");
        list.add("!!!");

        for (String str : list) {
            System.out.println(str);
        }

        System.out.println();
        System.out.println(list.pop());
        System.out.println(list.remove(1));
        System.out.println(list.get(0));
    }
}
