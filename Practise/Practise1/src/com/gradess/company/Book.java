package com.gradess.company;

public class Book {

    private String title;

    private int year;
    private int pages;

    private CoverType coverType;

    public Book(String title, int year, int pages, CoverType coverType) {
        this.title = title;
        this.year = year;
        this.pages = pages;
        this.coverType = coverType;
    }

    @Override
    public String toString() {
        return "Книга:\n" +
                "Название: '" + title + "\'\n" +
                "Год издания: " + year + "\n" +
                "Количество страниц: " + pages + "\n" +
                "Тип обложки: " + (coverType == CoverType.Soft ? "Мягкая" : "Твёрдая")  + "\n";
    }
}

enum CoverType {
    Soft,
    Hard
}
