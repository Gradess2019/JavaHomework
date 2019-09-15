package com.gradess.company;

public class Head {

	private java.awt.Color eyesColor;
	private java.awt.Color hairColor;

	public Head(java.awt.Color eyesColor, java.awt.Color hairColor) {
		this.eyesColor = eyesColor;
		this.hairColor = hairColor;
	}

	public java.awt.Color getEyesColor() {
		return eyesColor;
	}

	public java.awt.Color getHairColor() {
		return hairColor;
	}

	public void paintHair(Color hairColor) {
		this.hairColor = hairColor;
	}

	@Override
	public String toString() {
		return "Цвет глаз: " + eyesColor.toString() +
				"\nЦвет волос: " + hairColor;
	}
}
