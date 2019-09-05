package com.gradess.company;

public class Main {

    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(1,10,3,5);
        moveWithLog(point);
        System.out.println();

        MovableCircle circle = new MovableCircle(5, 3, 5, 2, 10);
        moveWithLog(circle);
        System.out.println();


        MovableRectangle rectangle = new MovableRectangle(25,5, 10, 30, 3, 26);
        moveWithLog(rectangle);
        System.out.println();


    }

    private static void moveWithLog(Movable movableObject) {
        movableObject.moveDown();
        print(movableObject);

        movableObject.moveLeft();
        print(movableObject);

        movableObject.moveUp();
        print(movableObject);

        movableObject.moveRight();
        print(movableObject);

    }

    private static void print(Object circle) {
        System.out.println(circle);
    }
}
