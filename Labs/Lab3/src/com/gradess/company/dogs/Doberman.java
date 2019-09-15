package com.gradess.company.dogs;

public class Doberman extends Dog {

	public Doberman(String name, int age, float weight, float height, boolean isMale) {
		super(name, age, weight, height, isMale);
		breed = "Доберман";
	}

	@Override
	public void bark() {
		System.out.println(name + " очень громко лает");
	}

	@Override
	public void jump() {
		System.out.println(name + " высоко прыгает");
	}

	@Override
	public void run() {
		System.out.println(name + " быстро прыгает");
	}
}
