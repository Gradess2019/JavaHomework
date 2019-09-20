package com.gradess.company;

public class Main {

    public static void main(String[] args) {
        Priceable car = new Car();
        Priceable computer = new Computer();
        Priceable house = new House();

        System.out.println("ЦЕНЫ");
        System.out.println("Автомобиль: " + car.getPrice());
        System.out.println("Компьютер: " + computer.getPrice());
        System.out.println("Дом: " + house.getPrice());
    }
}
