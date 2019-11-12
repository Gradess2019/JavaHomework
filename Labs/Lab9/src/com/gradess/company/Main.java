package com.gradess.company;

public class Main {

    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();

        try {
            throwsDemo.getKey();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
