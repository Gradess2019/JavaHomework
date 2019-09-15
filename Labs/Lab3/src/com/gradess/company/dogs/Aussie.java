package com.gradess.company.dogs;

public class Aussie extends Dog {

	public Aussie(String name, int age, float weight, float height, boolean isMale) {
		super(name, age, weight, height, isMale);
		breed = "Аусси";
	}

	@Override
	public void bark() {
		System.out.println(name + " громко лает");
	}

	@Override
	public void jump() {
		System.out.println(name + " прыгает");
	}

	@Override
	public void run() {
		System.out.println(name + " медленно бегает");
	}
}
