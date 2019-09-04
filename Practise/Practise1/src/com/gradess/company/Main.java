package com.gradess.company;

public class Main {

    public static void main(String[] args) {

        Book metro2033 = new Book(
                "Метро 2033",
                2005,
                382,
                CoverType.Hard
        );

        Book headFirstJava = new Book(
                "Head First Java",
                2015,
                752,
                CoverType.Hard
        );

        Book testDrivenDevelopment = new Book(
                "Test-driven development",
                2017,
                688,
                CoverType.Soft
        );

        System.out.println(metro2033);
        System.out.println(headFirstJava);
        System.out.println(testDrivenDevelopment);
    }
}
