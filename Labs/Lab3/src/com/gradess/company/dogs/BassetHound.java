package com.gradess.company.dogs;

public class BassetHound extends Dog {

	public BassetHound(String name, int age, float weight, float height, boolean isMale) {
		super(name, age, weight, height, isMale);
		breed = "Бассет-Хаунд";
	}

	@Override
	public void bark() {
		System.out.println(name + " тихо лает");
	}

	@Override
	public void jump() {
		System.out.println(name + " высокоо прыгает");
	}

	@Override
	public void run() {
		System.out.println(name + " бегает");
	}
}
