package com.gradess.company;

public class TestAuthor {

    public static void main(String[] args) {
        Author maleAuthor = new Author("Jack Black", "jackblack@gmail.com", 'M');
        Author femaleAuthor = new Author("Catty Sierra", "funnycat@yahoo.com", 'F');
        Author undefinedAuthor = new Author("Sam Bean", "coockedbean@gmail.com", 'U');

        System.out.println(maleAuthor);
        System.out.println(femaleAuthor);
        System.out.println(undefinedAuthor);
    }
}
