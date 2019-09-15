package com.gradess.company;

public class Main {

    public static void main(String[] args) {
	    Human human = new Human(
	            "Фёдор",
                25,
                76.2f,
                new Head(new Color(117, 38, 20),
						new Color(117, 58, 0)),
                new Leg(41),
                new Hand(50.35f)
        );

	    human.jump();
	    human.say("Привет!");

        System.out.println(human);
    }
}
