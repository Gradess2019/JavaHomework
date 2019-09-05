package com.gradess.company;

import java.util.*;

public class Main {

    private static int QUEUE_SIZE = 5;
    private static ArrayDeque<Integer> firstPlayer = new ArrayDeque<>(QUEUE_SIZE);
    private static ArrayDeque<Integer> secondPlayer = new ArrayDeque<>(QUEUE_SIZE);

    private static Integer[] cardsArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static ArrayList<Integer> availableCards = new ArrayList<>(Arrays.asList(cardsArray));


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        fillQueue(firstPlayer, scanner);
        fillQueue(secondPlayer, scanner);

        scanner.close();

        play();
    }

    private static void fillQueue(Deque<Integer> queue, Scanner scanner) {
        for (int i = 0; i < QUEUE_SIZE; i++) {
            Integer newElement = scanner.nextInt();
            queue.addLast(newElement);
        }
    }

    private static void play() {
        int counter = 0;
        while (!firstPlayer.isEmpty() && !secondPlayer.isEmpty() && counter < 106) {

            Integer firstElem = firstPlayer.pollFirst();
            Integer secondElem = secondPlayer.pollFirst();

            if ((firstElem > secondElem || (firstElem == 0 && secondElem == 9)) && (firstElem != 9 && secondElem != 0)) {
                firstPlayer.addLast(firstElem);
                firstPlayer.addLast(secondElem);
            } else {
                secondPlayer.addLast(secondElem);
                secondPlayer.addLast(firstElem);
            }

            counter++;
        }

        System.out.println((firstPlayer.isEmpty() ? "second " : "first " ) + counter);
    }

    private static void randomFillQueue(Deque<Integer> queue) {
        for (int i = 0; i < QUEUE_SIZE; i++) {
            int randomId = (int) (Math.random() * availableCards.size());
            queue.addLast(availableCards.remove(randomId));
            System.out.println(queue.peekLast() + " ");
        }
        System.out.println();
    }
}
