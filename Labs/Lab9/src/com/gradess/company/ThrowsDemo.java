package com.gradess.company;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        boolean mistake = true;

        //noinspection ConstantConditions
        while (mistake) {
            try {
                Scanner myScanner = new Scanner(System.in);
                System.out.print("Enter Key ");
                String key = myScanner.nextLine();

                printDetails(key);

                mistake = false;
            } catch (Exception e) {
                mistake = true;
                e.printStackTrace();
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}