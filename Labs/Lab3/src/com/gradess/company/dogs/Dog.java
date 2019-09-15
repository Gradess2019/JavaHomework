package com.gradess.company.dogs;

public abstract class Dog {

	protected String name;
	protected String breed;

	protected int age;

	private float weight;

	protected float height;

	protected boolean isMale;

	public Dog(String name, int age, float weight, float height, boolean isMale) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.isMale = isMale;
	}

	public abstract void bark();
	public abstract void jump();
	public abstract void run();

	@Override
	public String toString() {
		return "Собака " + name +
				"\nПорода: " + breed +
				"\nВозраст: " + age +
				"\nВес: " + weight +
				"\nРост: " + height +
				"\nПол: " + (isMale ? "М" : "Ж");
	}
}
