package com.gradess.company;

public class Student implements Comparable<Student> {

    private final int SCORE;
    private final int ID;

    public Student(int id, int score) {
        SCORE = score;
        ID = id;
    }

    public int getScore() {
        return SCORE;
    }

    public int getID() {
        return ID;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return SCORE > otherStudent.getScore() ? -1 : 1;
    }
}
