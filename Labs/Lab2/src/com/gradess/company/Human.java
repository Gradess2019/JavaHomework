package com.gradess.company;

public class Human {

	private String name;

	private int age;

	private float weight;

	private Head head;

	private Leg leftLeg;
	private Leg rightLeg;

	private Hand leftHand;
	private Hand rightHand;

	public Human(String name, int age, float weight, Head head, Leg leg, Hand hand) {
		this.name = name;

		this.age = age;

		this.weight = weight;

		this.head = head;

		this.leftLeg = leg;
		this.rightLeg = leg;

		this.leftHand = hand;
		this.rightHand = hand;
	}

	public void say(String message) {
		System.out.println(name + " говорит: " + message);
	}

	public void jump() {
		System.out.println(name + " прыгает");
	}

	@Override
	public String toString() {
		return "Имя: " + name +
				"\nВозраст: " + age +
				"\nВес: " + weight +
				"\n" + head +
				"\n" + leftLeg +
				"\n" + leftHand;
	}
}
