package com.gradess.company;

import com.gradess.company.dogs.Aussie;
import com.gradess.company.dogs.BassetHound;
import com.gradess.company.dogs.Doberman;
import com.gradess.company.dogs.Dog;

public class Main {

    public static void main(String[] args) {

        Dog aussie = new Aussie("Майк", 5, 10.2f, 40.75f, true);

        Dog bassetHound = new BassetHound("Клара", 3, 12.59f, 45.36f, false);

        Dog doberman = new Doberman("Чак", 8, 18.4f, 50.2f, true);

        testDog(aussie);
        testDog(bassetHound);
        testDog(doberman);

    }

    private static void testDog(Dog dog) {
        dog.bark();
        dog.jump();
        dog.run();

        System.out.println(dog + "\n");
    }


}
