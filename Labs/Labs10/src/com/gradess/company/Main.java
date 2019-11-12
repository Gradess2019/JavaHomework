package com.gradess.company;

public class Main {

    public static void main(String[] args) {
        GeneralContainer<Integer> integerGeneralContainer = new GeneralContainer<>();
        integerGeneralContainer.add(1);
        integerGeneralContainer.add(-10);
        integerGeneralContainer.add(5);

        GeneralContainer<Float> floatGeneralContainer = new GeneralContainer<>();
        floatGeneralContainer.add(-12.3f);
        floatGeneralContainer.add(2.7f);
        floatGeneralContainer.add(6.3f);

        GeneralContainer<String> stringGeneralContainer = new GeneralContainer<>();
        stringGeneralContainer.add("Hello");
        stringGeneralContainer.add("World");
        stringGeneralContainer.add("!!!");

        integerGeneralContainer.printArray();
        floatGeneralContainer.printArray();
        stringGeneralContainer.printArray();
    }
}
