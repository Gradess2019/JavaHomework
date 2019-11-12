package com.gradess.company;

public class Main {

    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();

        Complex complex1 = factory.createComplex();
        Complex complex2 = factory.createComplex(10, 20);
        Complex complex3 = factory.createComplex(-5, 15);

        System.out.println(complex1);
        System.out.println(complex2);
        System.out.println(complex3);
    }
}
