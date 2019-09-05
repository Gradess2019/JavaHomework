package com.gradess.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        final int SIZE = 30;
        Student[] students = new Student[SIZE];

        for (int id = 0; id < SIZE; id++) {
            students[id] = new Student(id + 1, (int) (Math.random() * 100));
        }
        printArray(students);

        Arrays.sort(students, new SortingStudentsByGPA());
        System.out.println();
        printArray(students);
    }

    private static void printArray(Student[] students) {
        for (Student student : students) {
            System.out.println(student.getID() + ")\t" + student.getScore());
        }
    }
}
