package com.gradess.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        try {
            new GUI(args[0]);
        } catch (Exception e) {
            System.err.println("Путь к файлу не определён!");
            System.exit(1);
        }
    }
}
