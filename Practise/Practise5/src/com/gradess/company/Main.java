package com.gradess.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int border = scanner.nextInt();

        printN(1, border);
    }

    private static void printN(int number, int border) {
        if (number < border) {
            System.out.print(number + "\t");
            printN(++number, border);
        }
    }
}
